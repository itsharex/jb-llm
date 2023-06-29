/*     */ package com.intellij.ml.llm.intentions.internal.editor;
/*     */ import com.intellij.ml.llm.LLMBundle;
/*     */ import com.intellij.ml.llm.core.models.SenderKt;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMBaseResponse;
/*     */ import com.intellij.openapi.application.CoroutinesKt;
/*     */ import com.intellij.openapi.command.CommandProcessor;
/*     */ import com.intellij.openapi.editor.Document;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.editor.SelectionModel;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.util.TextRange;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\003\030\0002\0020\001B\005¢\006\002\020\002J-\020\005\032\0020\0062\b\020\007\032\004\030\0010\b2\006\020\t\032\0020\n2\b\020\013\032\004\030\0010\bH@ø\001\000¢\006\002\020\fJ\b\020\r\032\0020\bH\026J\b\020\016\032\0020\bH\026J%\020\017\032\0020\0062\006\020\t\032\0020\n2\b\020\020\032\004\030\0010\0212\b\020\022\032\004\030\0010\023H\002J$\020\024\032\0020\0252\006\020\t\032\0020\n2\b\020\020\032\004\030\0010\0212\b\020\022\032\004\030\0010\023H\026J\022\020\026\032\0020\0252\b\020\007\032\004\030\0010\bH\002J\b\020\027\032\0020\025H\026R\016\020\003\032\0020\004X\016¢\006\002\n\000\002\004\n\002\b\031¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/intentions/internal/editor/RefactorThisIntention;", "Lcom/intellij/codeInsight/intention/IntentionAction;", "()V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "generateExplanation", "", "result", "", "project", "Lcom/intellij/openapi/project/Project;", "selectedText", "(Ljava/lang/String;Lcom/intellij/openapi/project/Project;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFamilyName", "getText", "invoke", "editor", "Lcom/intellij/openapi/editor/Editor;", "file", "Lcom/intellij/psi/PsiFile;", "isAvailable", "", "resultIsTrivial", "startInWriteAction", "intellij.ml.llm"})
/*     */ public final class RefactorThisIntention implements IntentionAction {
/*     */   @NotNull
/*  30 */   private CoroutineScope scope = CoroutineScopeKt.CoroutineScope((CoroutineContext)EmptyCoroutineContext.INSTANCE);
/*     */   public boolean startInWriteAction() {
/*  32 */     return false;
/*     */   } @NotNull
/*     */   public String getText() {
/*  35 */     return LLMBundle.message("intentions.refactor.this.family.name", new Object[0]);
/*     */   } @NotNull
/*     */   public String getFamilyName() {
/*  38 */     return getText();
/*     */   }
/*     */   
/*     */   public boolean isAvailable(@NotNull Project project, @Nullable Editor editor, @Nullable PsiFile file) {
/*  42 */     Intrinsics.checkNotNullParameter(project, "project"); return (editor != null && file != null && Registry.is("llm.is.internal"));
/*     */   }
/*     */   
/*     */   public void invoke(@NotNull Project project, @Nullable Editor editor, @Nullable PsiFile file) {
/*  46 */     Intrinsics.checkNotNullParameter(project, "project"); if (editor == null || file == null)
/*  47 */       return;  Intrinsics.checkNotNullExpressionValue(editor.getDocument(), "editor.document"); Document document = editor.getDocument();
/*  48 */     Intrinsics.checkNotNullExpressionValue(editor.getSelectionModel(), "editor.selectionModel"); SelectionModel selectionModel = editor.getSelectionModel();
/*  49 */     Ref.ObjectRef<String> selectedText = new Ref.ObjectRef(); selectedText.element = selectionModel.getSelectedText();
/*  50 */     Ref.ObjectRef<TextRange> textRange = new Ref.ObjectRef(); Intrinsics.checkNotNullExpressionValue(TextRange.create(selectionModel.getSelectionStart(), selectionModel.getSelectionEnd()), "create(selectionModel.se…ectionModel.selectionEnd)"); textRange.element = TextRange.create(selectionModel.getSelectionStart(), selectionModel.getSelectionEnd());
/*  51 */     if (selectedText.element == null) {
/*  52 */       PsiElement elementAtCaret = PsiUtilBase.getElementAtCaret(editor);
/*  53 */       PsiElement parent = (elementAtCaret != null) ? elementAtCaret.getParent() : null;
/*  54 */       if (parent instanceof PsiNameIdentifierOwner && Intrinsics.areEqual(elementAtCaret, ((PsiNameIdentifierOwner)parent).getNameIdentifier())) {
/*  55 */         selectedText.element = elementAtCaret.getParent().getText();
/*  56 */         Intrinsics.checkNotNullExpressionValue(elementAtCaret.getParent().getTextRange(), "elementAtCaret.parent.textRange"); textRange.element = elementAtCaret.getParent().getTextRange();
/*     */       } 
/*     */     } 
/*     */     
/*  60 */     if (selectedText.element == null)
/*  61 */       return;  BuildersKt.launch$default(this.scope, null, null, new RefactorThisIntention$invoke$1(this, selectedText, document, textRange, file, null), 3, null); } @DebugMetadata(f = "RefactorThisIntention.kt", l = {63, 70, 79}, i = {1}, s = {"L$0"}, n = {"result"}, m = "invokeSuspend", c = "com.intellij.ml.llm.intentions.internal.editor.RefactorThisIntention$invoke$1") @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class RefactorThisIntention$invoke$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { Object L$0; int label; RefactorThisIntention$invoke$1(RefactorThisIntention $receiver, Ref.ObjectRef<String> $selectedText, Document $document, Ref.ObjectRef<TextRange> $textRange, PsiFile $file, Continuation $completion) { super(2, $completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { String result; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           
/*  63 */           this.label = 1; if (TasksKt.withBackgroundProgress(this.$project, LLMBundle.message("intentions.request.background.process.title", new Object[0]), true, new RefactorThisIntention$invoke$1$result$1(this.$project, this.$selectedText, null), (Continuation)this) == object) return object;  result = (String)TasksKt.withBackgroundProgress(this.$project, LLMBundle.message("intentions.request.background.process.title", new Object[0]), true, new RefactorThisIntention$invoke$1$result$1(this.$project, this.$selectedText, null), (Continuation)this);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*  70 */           this.L$0 = result; this.label = 2; if (CoroutinesKt.writeAction(new Function0<Unit>(RefactorThisIntention.this, this.$project, this.$document, this.$textRange, this.$file) {
/*  71 */                 public final void invoke() { if (this.$result != null && !RefactorThisIntention.this.resultIsTrivial(this.$result))
/*  72 */                   { Project project1 = this.$project; String str1 = LLMBundle.message("intentions.refactor.code", new Object[0]); Document document = this.$document; Ref.ObjectRef<TextRange> objectRef = this.$textRange; String str2 = this.$result; Project project2 = this.$project; PsiFile psiFile = this.$file;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                     
/* 120 */                     String groupId$iv = null;
/*     */                     int $i$f$executeCommand = 0;
/* 122 */                     CommandProcessor.getInstance().executeCommand(project1, new RefactorThisIntention$invoke$1$1$invoke$$inlined$executeCommand$default$1(document, objectRef, str2, project2, psiFile), str1, groupId$iv); }  } }(Continuation)this) == object) return object;  CoroutinesKt.writeAction(new Function0<Unit>(RefactorThisIntention.this, this.$project, this.$document, this.$textRange, this.$file) { public final void invoke() { if (this.$result != null && !RefactorThisIntention.this.resultIsTrivial(this.$result)) { Project project1 = this.$project; String str1 = LLMBundle.message("intentions.refactor.code", new Object[0]); Document document = this.$document; Ref.ObjectRef<TextRange> objectRef = this.$textRange; String str2 = this.$result; Project project2 = this.$project; PsiFile psiFile = this.$file; String groupId$iv = null; int $i$f$executeCommand = 0; CommandProcessor.getInstance().executeCommand(project1, new RefactorThisIntention$invoke$1$1$invoke$$inlined$executeCommand$default$1(document, objectRef, str2, project2, psiFile), str1, groupId$iv); }  } }(Continuation)this); this.L$0 = null; this.label = 3; if (RefactorThisIntention.this.generateExplanation(result, this.$project, (String)this.$selectedText.element, (Continuation)this) == object) return object;  RefactorThisIntention.this.generateExplanation(result, this.$project, (String)this.$selectedText.element, (Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); result = (String)SYNTHETIC_LOCAL_VARIABLE_1; this.L$0 = result; this.label = 2; if (CoroutinesKt.writeAction(new Function0<Unit>(RefactorThisIntention.this, this.$project, this.$document, this.$textRange, this.$file) { public final void invoke() { if (this.$result != null && !RefactorThisIntention.this.resultIsTrivial(this.$result)) { Project project1 = this.$project; String str1 = LLMBundle.message("intentions.refactor.code", new Object[0]); Document document = this.$document; Ref.ObjectRef<TextRange> objectRef = this.$textRange; String str2 = this.$result; Project project2 = this.$project; PsiFile psiFile = this.$file; String groupId$iv = null; int $i$f$executeCommand = 0; CommandProcessor.getInstance().executeCommand(project1, new RefactorThisIntention$invoke$1$1$invoke$$inlined$executeCommand$default$1(document, objectRef, str2, project2, psiFile), str1, groupId$iv); }  } }(Continuation)this) == object) return object;  CoroutinesKt.writeAction(new Function0<Unit>(RefactorThisIntention.this, this.$project, this.$document, this.$textRange, this.$file) { public final void invoke() { if (this.$result != null && !RefactorThisIntention.this.resultIsTrivial(this.$result)) { Project project1 = this.$project; String str1 = LLMBundle.message("intentions.refactor.code", new Object[0]); Document document = this.$document; Ref.ObjectRef<TextRange> objectRef = this.$textRange; String str2 = this.$result; Project project2 = this.$project; PsiFile psiFile = this.$file; String groupId$iv = null; int $i$f$executeCommand = 0; CommandProcessor.getInstance().executeCommand(project1, new RefactorThisIntention$invoke$1$1$invoke$$inlined$executeCommand$default$1(document, objectRef, str2, project2, psiFile), str1, groupId$iv); }
/*     */                    }
/*     */                  }
/*     */               (Continuation)this);
/*     */           this.L$0 = null;
/*     */           this.label = 3;
/*     */           if (RefactorThisIntention.this.generateExplanation(result, this.$project, (String)this.$selectedText.element, (Continuation)this) == object)
/*     */             return object; 
/*     */           RefactorThisIntention.this.generateExplanation(result, this.$project, (String)this.$selectedText.element, (Continuation)this);
/*     */           return Unit.INSTANCE;
/*     */         case 2:
/*     */           result = (String)this.L$0;
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.L$0 = null;
/*     */           this.label = 3;
/*     */           if (RefactorThisIntention.this.generateExplanation(result, this.$project, (String)this.$selectedText.element, (Continuation)this) == object)
/*     */             return object; 
/*     */           RefactorThisIntention.this.generateExplanation(result, this.$project, (String)this.$selectedText.element, (Continuation)this);
/*     */           return Unit.INSTANCE;
/*     */         case 3:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE; }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super RefactorThisIntention$invoke$1> $completion) {
/*     */       return (Continuation<Unit>)new RefactorThisIntention$invoke$1(RefactorThisIntention.this, this.$selectedText, this.$document, this.$textRange, this.$file, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */       return ((RefactorThisIntention$invoke$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */     
/*     */     @DebugMetadata(f = "RefactorThisIntention.kt", l = {64}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.intentions.internal.editor.RefactorThisIntention$invoke$1$result$1")
/*     */     @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\016\n\002\030\002\020\000\032\004\030\0010\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */     static final class RefactorThisIntention$invoke$1$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
/*     */       int label;
/*     */       
/*     */       RefactorThisIntention$invoke$1$result$1(Project $project, Ref.ObjectRef<String> $selectedText, Continuation $completion) {
/*     */         super(2, $completion);
/*     */       }
/*     */       
/*     */       @Nullable
/*     */       public final Object invokeSuspend(@NotNull Object $result) {
/*     */         // Byte code:
/*     */         //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */         //   3: astore #5
/*     */         //   5: aload_0
/*     */         //   6: getfield label : I
/*     */         //   9: tableswitch default -> 123, 0 -> 32, 1 -> 75
/*     */         //   32: aload_1
/*     */         //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */         //   36: new com/intellij/ml/llm/intentions/internal/editor/RefactorThisIntention$invoke$1$result$1$1
/*     */         //   39: dup
/*     */         //   40: aload_0
/*     */         //   41: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */         //   44: aload_0
/*     */         //   45: getfield $selectedText : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */         //   48: invokespecial <init> : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/internal/Ref$ObjectRef;)V
/*     */         //   51: checkcast kotlin/jvm/functions/Function0
/*     */         //   54: aload_0
/*     */         //   55: checkcast kotlin/coroutines/Continuation
/*     */         //   58: aload_0
/*     */         //   59: iconst_1
/*     */         //   60: putfield label : I
/*     */         //   63: invokestatic blockingContext : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */         //   66: dup
/*     */         //   67: aload #5
/*     */         //   69: if_acmpne -> 80
/*     */         //   72: aload #5
/*     */         //   74: areturn
/*     */         //   75: aload_1
/*     */         //   76: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */         //   79: aload_1
/*     */         //   80: checkcast com/intellij/ml/llm/core/models/requestResponse/LLMBaseResponse
/*     */         //   83: astore_2
/*     */         //   84: aload_2
/*     */         //   85: ifnull -> 121
/*     */         //   88: aload_2
/*     */         //   89: invokeinterface getSuggestions : ()Ljava/util/List;
/*     */         //   94: astore_3
/*     */         //   95: aload_3
/*     */         //   96: ifnull -> 121
/*     */         //   99: aload_3
/*     */         //   100: invokestatic firstOrNull : (Ljava/util/List;)Ljava/lang/Object;
/*     */         //   103: checkcast com/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice
/*     */         //   106: astore #4
/*     */         //   108: aload #4
/*     */         //   110: ifnull -> 121
/*     */         //   113: aload #4
/*     */         //   115: invokestatic asCode : (Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;)Ljava/lang/String;
/*     */         //   118: goto -> 122
/*     */         //   121: aconst_null
/*     */         //   122: areturn
/*     */         //   123: new java/lang/IllegalStateException
/*     */         //   126: dup
/*     */         //   127: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */         //   129: invokespecial <init> : (Ljava/lang/String;)V
/*     */         //   132: athrow
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #63	-> 3
/*     */         //   #66	-> 36
/*     */         //   #64	-> 36
/*     */         //   #63	-> 72
/*     */         //   #66	-> 84
/*     */         //   #64	-> 88
/*     */         //   #66	-> 89
/*     */         //   #63	-> 123
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   36	87	0	this	Lcom/intellij/ml/llm/intentions/internal/editor/RefactorThisIntention$invoke$1$result$1;
/*     */         //   36	87	1	$result	Ljava/lang/Object;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super RefactorThisIntention$invoke$1$result$1> $completion) {
/*     */         return (Continuation<Unit>)new RefactorThisIntention$invoke$1$result$1(this.$project, this.$selectedText, $completion);
/*     */       }
/*     */       
/*     */       @Nullable
/*     */       public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */         return ((RefactorThisIntention$invoke$1$result$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */       }
/*     */     } }
/*     */ 
/*     */   
/*     */   private final Object generateExplanation(String result, Project project, String selectedText, Continuation<? super Unit> paramContinuation) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: instanceof com/intellij/ml/llm/intentions/internal/editor/RefactorThisIntention$generateExplanation$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #4
/*     */     //   10: checkcast com/intellij/ml/llm/intentions/internal/editor/RefactorThisIntention$generateExplanation$1
/*     */     //   13: astore #10
/*     */     //   15: aload #10
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #10
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/intentions/internal/editor/RefactorThisIntention$generateExplanation$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #4
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/intentions/internal/editor/RefactorThisIntention;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #10
/*     */     //   53: aload #10
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #9
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #11
/*     */     //   65: aload #10
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 258, 0 -> 92, 1 -> 159
/*     */     //   92: aload #9
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aconst_null
/*     */     //   98: astore #5
/*     */     //   100: aload_0
/*     */     //   101: aload_1
/*     */     //   102: invokespecial resultIsTrivial : (Ljava/lang/String;)Z
/*     */     //   105: ifne -> 225
/*     */     //   108: aload_2
/*     */     //   109: ldc 'intentions.request.background.process.title'
/*     */     //   111: iconst_0
/*     */     //   112: anewarray java/lang/Object
/*     */     //   115: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   118: iconst_1
/*     */     //   119: new com/intellij/ml/llm/intentions/internal/editor/RefactorThisIntention$generateExplanation$2
/*     */     //   122: dup
/*     */     //   123: aload_2
/*     */     //   124: aload_3
/*     */     //   125: aload_1
/*     */     //   126: aconst_null
/*     */     //   127: invokespecial <init> : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
/*     */     //   130: checkcast kotlin/jvm/functions/Function2
/*     */     //   133: aload #10
/*     */     //   135: aload #10
/*     */     //   137: aload_2
/*     */     //   138: putfield L$0 : Ljava/lang/Object;
/*     */     //   141: aload #10
/*     */     //   143: iconst_1
/*     */     //   144: putfield label : I
/*     */     //   147: invokestatic withBackgroundProgress : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   150: dup
/*     */     //   151: aload #11
/*     */     //   153: if_acmpne -> 175
/*     */     //   156: aload #11
/*     */     //   158: areturn
/*     */     //   159: aload #10
/*     */     //   161: getfield L$0 : Ljava/lang/Object;
/*     */     //   164: checkcast com/intellij/openapi/project/Project
/*     */     //   167: astore_2
/*     */     //   168: aload #9
/*     */     //   170: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   173: aload #9
/*     */     //   175: checkcast com/intellij/ml/llm/core/models/requestResponse/LLMBaseResponse
/*     */     //   178: astore #6
/*     */     //   180: aload #6
/*     */     //   182: ifnull -> 222
/*     */     //   185: aload #6
/*     */     //   187: invokeinterface getSuggestions : ()Ljava/util/List;
/*     */     //   192: astore #7
/*     */     //   194: aload #7
/*     */     //   196: ifnull -> 222
/*     */     //   199: aload #7
/*     */     //   201: invokestatic firstOrNull : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   204: checkcast com/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice
/*     */     //   207: astore #8
/*     */     //   209: aload #8
/*     */     //   211: ifnull -> 222
/*     */     //   214: aload #8
/*     */     //   216: invokevirtual getText : ()Ljava/lang/String;
/*     */     //   219: goto -> 223
/*     */     //   222: aconst_null
/*     */     //   223: astore #5
/*     */     //   225: aload #5
/*     */     //   227: ifnull -> 254
/*     */     //   230: invokestatic createNotificationGroup : ()Lcom/intellij/notification/NotificationGroup;
/*     */     //   233: ldc 'notification.request.completed.title'
/*     */     //   235: iconst_0
/*     */     //   236: anewarray java/lang/Object
/*     */     //   239: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   242: aload #5
/*     */     //   244: getstatic com/intellij/notification/NotificationType.INFORMATION : Lcom/intellij/notification/NotificationType;
/*     */     //   247: invokevirtual createNotification : (Ljava/lang/String;Ljava/lang/String;Lcom/intellij/notification/NotificationType;)Lcom/intellij/notification/Notification;
/*     */     //   250: aload_2
/*     */     //   251: invokevirtual notify : (Lcom/intellij/openapi/project/Project;)V
/*     */     //   254: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   257: areturn
/*     */     //   258: new java/lang/IllegalStateException
/*     */     //   261: dup
/*     */     //   262: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   265: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   268: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #84	-> 63
/*     */     //   #86	-> 97
/*     */     //   #87	-> 100
/*     */     //   #100	-> 108
/*     */     //   #89	-> 108
/*     */     //   #84	-> 156
/*     */     //   #100	-> 180
/*     */     //   #89	-> 185
/*     */     //   #100	-> 187
/*     */     //   #89	-> 223
/*     */     //   #103	-> 225
/*     */     //   #104	-> 230
/*     */     //   #105	-> 233
/*     */     //   #106	-> 242
/*     */     //   #107	-> 244
/*     */     //   #104	-> 247
/*     */     //   #108	-> 250
/*     */     //   #110	-> 254
/*     */     //   #84	-> 258
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	11	0	this	Lcom/intellij/ml/llm/intentions/internal/editor/RefactorThisIntention;
/*     */     //   97	53	1	result	Ljava/lang/String;
/*     */     //   97	62	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   168	86	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   97	53	3	selectedText	Ljava/lang/String;
/*     */     //   100	8	5	explanation	Ljava/lang/String;
/*     */     //   225	19	5	explanation	Ljava/lang/String;
/*     */     //   53	205	10	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	198	9	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "RefactorThisIntention.kt", l = {90}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.intentions.internal.editor.RefactorThisIntention$generateExplanation$2")
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\004\030\0010\001*\0020\002H@"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseResponse;", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class RefactorThisIntention$generateExplanation$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LLMBaseResponse>, Object> {
/*     */     int label;
/*     */     
/*     */     RefactorThisIntention$generateExplanation$2(Project $project, String $selectedText, String $result, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (CoroutinesKt.blockingContext(new Function0<LLMBaseResponse>(this.$project, this.$selectedText, this.$result) {
/*     */                 @Nullable
/*     */                 public final LLMBaseResponse invoke() {
/*     */                   return SenderKt.sendCompletionChatRequest$default(this.$project, "// Snippet 1:\n" + this.$selectedText + "\n//Snippet 2:\n" + this.$result + " \n// There are some differences between code in Snippet 1 and code in Snippet 2", "", Integer.valueOf(300), Double.valueOf(0.5D), null, null, null, null, 5, null, null, null, 7648, null);
/*     */                 }
/*     */               }(Continuation)this) == object)
/*     */             return object; 
/*     */           return CoroutinesKt.blockingContext(new Function0<LLMBaseResponse>(this.$project, this.$selectedText, this.$result) {
/*     */                 @Nullable
/*     */                 public final LLMBaseResponse invoke() {
/*     */                   return SenderKt.sendCompletionChatRequest$default(this.$project, "// Snippet 1:\n" + this.$selectedText + "\n//Snippet 2:\n" + this.$result + " \n// There are some differences between code in Snippet 1 and code in Snippet 2", "", Integer.valueOf(300), Double.valueOf(0.5D), null, null, null, null, 5, null, null, null, 7648, null);
/*     */                 }
/*     */               }(Continuation)this);
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return SYNTHETIC_LOCAL_VARIABLE_1;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super RefactorThisIntention$generateExplanation$2> $completion) {
/*     */       return (Continuation<Unit>)new RefactorThisIntention$generateExplanation$2(this.$project, this.$selectedText, this.$result, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */       return ((RefactorThisIntention$generateExplanation$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private final boolean resultIsTrivial(String result) {
/*     */     Integer length = (result != null) ? Integer.valueOf(result.length()) : null;
/*     */     return (result == null || length == null || length.intValue() < 30);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "RefactorThisIntention.kt", l = {89}, i = {0}, s = {"L$0"}, n = {"project"}, m = "generateExplanation", c = "com.intellij.ml.llm.intentions.internal.editor.RefactorThisIntention")
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
/*     */   static final class RefactorThisIntention$generateExplanation$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     RefactorThisIntention$generateExplanation$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return RefactorThisIntention.this.generateExplanation(null, null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/internal/editor/RefactorThisIntention.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */