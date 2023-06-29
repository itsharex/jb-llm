/*     */ package com.intellij.ml.llm.intentions.internal.editor;
/*     */ 
/*     */ import com.intellij.ml.llm.LLMBundle;
/*     */ import com.intellij.ml.llm.core.models.SenderKt;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMBaseResponse;
/*     */ import com.intellij.openapi.application.CoroutinesKt;
/*     */ import com.intellij.openapi.command.CommandProcessor;
/*     */ import com.intellij.openapi.editor.Document;
/*     */ import com.intellij.openapi.progress.TasksKt;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.util.TextRange;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @DebugMetadata(f = "RefactorThisIntention.kt", l = {63, 70, 79}, i = {1}, s = {"L$0"}, n = {"result"}, m = "invokeSuspend", c = "com.intellij.ml.llm.intentions.internal.editor.RefactorThisIntention$invoke$1")
/*     */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ final class RefactorThisIntention$invoke$1
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*     */ {
/*     */   Object L$0;
/*     */   int label;
/*     */   
/*     */   RefactorThisIntention$invoke$1(RefactorThisIntention $receiver, Ref.ObjectRef<String> $selectedText, Document $document, Ref.ObjectRef<TextRange> $textRange, PsiFile $file, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object invokeSuspend(@NotNull Object $result) {
/*     */     String result;
/*  61 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */         
/*  63 */         this.label = 1; if (TasksKt.withBackgroundProgress(this.$project, LLMBundle.message("intentions.request.background.process.title", new Object[0]), true, new RefactorThisIntention$invoke$1$result$1(this.$project, this.$selectedText, null), (Continuation)this) == object) return object;  result = (String)TasksKt.withBackgroundProgress(this.$project, LLMBundle.message("intentions.request.background.process.title", new Object[0]), true, new RefactorThisIntention$invoke$1$result$1(this.$project, this.$selectedText, null), (Continuation)this);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  70 */         this.L$0 = result; this.label = 2; if (CoroutinesKt.writeAction(new Function0<Unit>(RefactorThisIntention.this, this.$project, this.$document, this.$textRange, this.$file) {
/*  71 */               public final void invoke() { if (this.$result != null && !RefactorThisIntention.access$resultIsTrivial(RefactorThisIntention.this, this.$result))
/*  72 */                 { Project project1 = this.$project; String str1 = LLMBundle.message("intentions.refactor.code", new Object[0]); Document document = this.$document; Ref.ObjectRef<TextRange> objectRef = this.$textRange; String str2 = this.$result; Project project2 = this.$project; PsiFile psiFile = this.$file;
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
/* 120 */                   String groupId$iv = null;
/*     */                   int $i$f$executeCommand = 0;
/* 122 */                   CommandProcessor.getInstance().executeCommand(project1, new RefactorThisIntention$invoke$1$1$invoke$$inlined$executeCommand$default$1(document, objectRef, str2, project2, psiFile), str1, groupId$iv); }  } }(Continuation)this) == object) return object;  CoroutinesKt.writeAction(new Function0<Unit>(RefactorThisIntention.this, this.$project, this.$document, this.$textRange, this.$file) { public final void invoke() { if (this.$result != null && !RefactorThisIntention.access$resultIsTrivial(RefactorThisIntention.this, this.$result)) { Project project1 = this.$project; String str1 = LLMBundle.message("intentions.refactor.code", new Object[0]); Document document = this.$document; Ref.ObjectRef<TextRange> objectRef = this.$textRange; String str2 = this.$result; Project project2 = this.$project; PsiFile psiFile = this.$file; String groupId$iv = null; int $i$f$executeCommand = 0; CommandProcessor.getInstance().executeCommand(project1, new RefactorThisIntention$invoke$1$1$invoke$$inlined$executeCommand$default$1(document, objectRef, str2, project2, psiFile), str1, groupId$iv); }  } }(Continuation)this); this.L$0 = null; this.label = 3; if (RefactorThisIntention.access$generateExplanation(RefactorThisIntention.this, result, this.$project, (String)this.$selectedText.element, (Continuation)this) == object) return object;  RefactorThisIntention.access$generateExplanation(RefactorThisIntention.this, result, this.$project, (String)this.$selectedText.element, (Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); result = (String)SYNTHETIC_LOCAL_VARIABLE_1; this.L$0 = result; this.label = 2; if (CoroutinesKt.writeAction(new Function0<Unit>(RefactorThisIntention.this, this.$project, this.$document, this.$textRange, this.$file) { public final void invoke() { if (this.$result != null && !RefactorThisIntention.access$resultIsTrivial(RefactorThisIntention.this, this.$result)) { Project project1 = this.$project; String str1 = LLMBundle.message("intentions.refactor.code", new Object[0]); Document document = this.$document; Ref.ObjectRef<TextRange> objectRef = this.$textRange; String str2 = this.$result; Project project2 = this.$project; PsiFile psiFile = this.$file; String groupId$iv = null; int $i$f$executeCommand = 0; CommandProcessor.getInstance().executeCommand(project1, new RefactorThisIntention$invoke$1$1$invoke$$inlined$executeCommand$default$1(document, objectRef, str2, project2, psiFile), str1, groupId$iv); }  } }(Continuation)this) == object) return object;  CoroutinesKt.writeAction(new Function0<Unit>(RefactorThisIntention.this, this.$project, this.$document, this.$textRange, this.$file) { public final void invoke() { if (this.$result != null && !RefactorThisIntention.access$resultIsTrivial(RefactorThisIntention.this, this.$result)) { Project project1 = this.$project; String str1 = LLMBundle.message("intentions.refactor.code", new Object[0]); Document document = this.$document; Ref.ObjectRef<TextRange> objectRef = this.$textRange; String str2 = this.$result; Project project2 = this.$project; PsiFile psiFile = this.$file; String groupId$iv = null; int $i$f$executeCommand = 0; CommandProcessor.getInstance().executeCommand(project1, new RefactorThisIntention$invoke$1$1$invoke$$inlined$executeCommand$default$1(document, objectRef, str2, project2, psiFile), str1, groupId$iv); }
/*     */                  }
/*     */                }
/*     */             (Continuation)this);
/*     */         this.L$0 = null;
/*     */         this.label = 3;
/*     */         if (RefactorThisIntention.access$generateExplanation(RefactorThisIntention.this, result, this.$project, (String)this.$selectedText.element, (Continuation)this) == object)
/*     */           return object; 
/*     */         RefactorThisIntention.access$generateExplanation(RefactorThisIntention.this, result, this.$project, (String)this.$selectedText.element, (Continuation)this);
/*     */         return Unit.INSTANCE;
/*     */       case 2:
/*     */         result = (String)this.L$0;
/*     */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */         this.L$0 = null;
/*     */         this.label = 3;
/*     */         if (RefactorThisIntention.access$generateExplanation(RefactorThisIntention.this, result, this.$project, (String)this.$selectedText.element, (Continuation)this) == object)
/*     */           return object; 
/*     */         RefactorThisIntention.access$generateExplanation(RefactorThisIntention.this, result, this.$project, (String)this.$selectedText.element, (Continuation)this);
/*     */         return Unit.INSTANCE;
/*     */       case 3:
/*     */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */         return Unit.INSTANCE; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super RefactorThisIntention$invoke$1> $completion) {
/*     */     return (Continuation<Unit>)new RefactorThisIntention$invoke$1(RefactorThisIntention.this, this.$selectedText, this.$document, this.$textRange, this.$file, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */     return ((RefactorThisIntention$invoke$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "RefactorThisIntention.kt", l = {64}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.intentions.internal.editor.RefactorThisIntention$invoke$1$result$1")
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\016\n\002\030\002\020\000\032\004\030\0010\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class RefactorThisIntention$invoke$1$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
/*     */     int label;
/*     */     
/*     */     RefactorThisIntention$invoke$1$result$1(Project $project, Ref.ObjectRef<String> $selectedText, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #5
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 123, 0 -> 32, 1 -> 75
/*     */       //   32: aload_1
/*     */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   36: new com/intellij/ml/llm/intentions/internal/editor/RefactorThisIntention$invoke$1$result$1$1
/*     */       //   39: dup
/*     */       //   40: aload_0
/*     */       //   41: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   44: aload_0
/*     */       //   45: getfield $selectedText : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   48: invokespecial <init> : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/internal/Ref$ObjectRef;)V
/*     */       //   51: checkcast kotlin/jvm/functions/Function0
/*     */       //   54: aload_0
/*     */       //   55: checkcast kotlin/coroutines/Continuation
/*     */       //   58: aload_0
/*     */       //   59: iconst_1
/*     */       //   60: putfield label : I
/*     */       //   63: invokestatic blockingContext : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   66: dup
/*     */       //   67: aload #5
/*     */       //   69: if_acmpne -> 80
/*     */       //   72: aload #5
/*     */       //   74: areturn
/*     */       //   75: aload_1
/*     */       //   76: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   79: aload_1
/*     */       //   80: checkcast com/intellij/ml/llm/core/models/requestResponse/LLMBaseResponse
/*     */       //   83: astore_2
/*     */       //   84: aload_2
/*     */       //   85: ifnull -> 121
/*     */       //   88: aload_2
/*     */       //   89: invokeinterface getSuggestions : ()Ljava/util/List;
/*     */       //   94: astore_3
/*     */       //   95: aload_3
/*     */       //   96: ifnull -> 121
/*     */       //   99: aload_3
/*     */       //   100: invokestatic firstOrNull : (Ljava/util/List;)Ljava/lang/Object;
/*     */       //   103: checkcast com/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice
/*     */       //   106: astore #4
/*     */       //   108: aload #4
/*     */       //   110: ifnull -> 121
/*     */       //   113: aload #4
/*     */       //   115: invokestatic asCode : (Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;)Ljava/lang/String;
/*     */       //   118: goto -> 122
/*     */       //   121: aconst_null
/*     */       //   122: areturn
/*     */       //   123: new java/lang/IllegalStateException
/*     */       //   126: dup
/*     */       //   127: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   129: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   132: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #63	-> 3
/*     */       //   #66	-> 36
/*     */       //   #64	-> 36
/*     */       //   #63	-> 72
/*     */       //   #66	-> 84
/*     */       //   #64	-> 88
/*     */       //   #66	-> 89
/*     */       //   #63	-> 123
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   36	87	0	this	Lcom/intellij/ml/llm/intentions/internal/editor/RefactorThisIntention$invoke$1$result$1;
/*     */       //   36	87	1	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super RefactorThisIntention$invoke$1$result$1> $completion) {
/*     */       return (Continuation<Unit>)new RefactorThisIntention$invoke$1$result$1(this.$project, this.$selectedText, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */       return ((RefactorThisIntention$invoke$1$result$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/internal/editor/RefactorThisIntention$invoke$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */