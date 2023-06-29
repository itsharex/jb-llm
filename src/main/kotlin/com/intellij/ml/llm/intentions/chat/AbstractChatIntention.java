/*    */ package com.intellij.ml.llm.intentions.chat;
/*    */ 
/*    */ import com.intellij.ml.llm.core.chat.session.ChatSession;
/*    */ import com.intellij.ml.llm.core.chat.session.ChatSessionHost;
/*    */ import com.intellij.ml.llm.core.chat.session.FocusedChatSessionHost;
/*    */ import com.intellij.openapi.components.ComponentManager;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000X\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\005\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\002\n\002\020\013\n\002\b\002\b&\030\0002\0020\001B\021\022\n\b\002\020\002\032\004\030\0010\003¢\006\002\020\004J \020\007\032\0020\0032\006\020\b\032\0020\t2\006\020\n\032\0020\0032\006\020\002\032\0020\003H\024J \020\013\032\0020\f2\f\020\r\032\b\022\004\022\0020\0170\0162\b\020\020\032\004\030\0010\021H\024J\030\020\022\032\b\022\004\022\0020\0170\0162\b\020\023\032\004\030\0010\024H\024J\036\020\025\032\004\030\0010\0242\b\020\026\032\004\030\0010\0272\b\020\030\032\004\030\0010\031H\004J\034\020\005\032\004\030\0010\0032\006\020\026\032\0020\0272\b\020\032\032\004\030\0010\024H\024J%\020\033\032\0020\0342\006\020\026\032\0020\0272\b\020\030\032\004\030\0010\0312\b\020\035\032\004\030\0010\021H\002J$\020\036\032\0020\0372\006\020\026\032\0020\0272\b\020\030\032\004\030\0010\0312\b\020\035\032\004\030\0010\021H\026J\b\020 \032\0020\037H\026R\023\020\002\032\004\030\0010\003¢\006\b\n\000\032\004\b\005\020\006¨\006!"}, d2 = {"Lcom/intellij/ml/llm/intentions/chat/AbstractChatIntention;", "Lcom/intellij/codeInsight/intention/IntentionAction;", "prompt", "", "(Ljava/lang/String;)V", "getPrompt", "()Ljava/lang/String;", "buildMessageFromPrompt", "language", "Lcom/intellij/lang/Language;", "code", "getChatCreationContext", "Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;", "extraItems", "", "Lcom/intellij/ml/llm/core/chat/context/ChatContextItem;", "sourceFile", "Lcom/intellij/psi/PsiFile;", "getContextItems", "elementToExplain", "Lcom/intellij/psi/PsiElement;", "getElementToExplain", "project", "Lcom/intellij/openapi/project/Project;", "editor", "Lcom/intellij/openapi/editor/Editor;", "context", "invoke", "", "file", "isAvailable", "", "startInWriteAction", "intellij.ml.llm"})
/*    */ public abstract class AbstractChatIntention implements IntentionAction {
/*    */   @Nullable
/*    */   private final String prompt;
/*    */   
/* 24 */   public AbstractChatIntention(@Nullable String prompt) { this.prompt = prompt; } @Nullable public final String getPrompt() { return this.prompt; }
/*    */   @NotNull
/* 26 */   protected List<ChatContextItem> getContextItems(@Nullable PsiElement elementToExplain) { return CollectionsKt.emptyList(); } @Nullable
/*    */   protected String getPrompt(@NotNull Project project, @Nullable PsiElement context) {
/* 28 */     Intrinsics.checkNotNullParameter(project, "project"); return this.prompt;
/*    */   } public boolean startInWriteAction() {
/* 30 */     return false;
/*    */   }
/*    */   public boolean isAvailable(@NotNull Project project, @Nullable Editor editor, @Nullable PsiFile file) {
/* 33 */     Intrinsics.checkNotNullParameter(project, "project"); return (editor != null && file != null);
/*    */   }
/*    */   @NotNull
/*    */   protected ChatCreationContext getChatCreationContext(@NotNull List extraItems, @Nullable PsiFile sourceFile) {
/* 37 */     Intrinsics.checkNotNullParameter(extraItems, "extraItems"); return new ChatCreationContext(
/* 38 */         (ChatOrigin)ChatOrigin.CustomIntention.INSTANCE, ChatSessionStorage.SourceAction.UNKNOWN_CHAT_INTENTION, sourceFile, null, 8, null);
/*    */   } @NotNull
/*    */   protected String buildMessageFromPrompt(@NotNull Language language, @NotNull String code, @NotNull String prompt) {
/* 41 */     Intrinsics.checkNotNullParameter(language, "language"); Intrinsics.checkNotNullParameter(code, "code"); Intrinsics.checkNotNullParameter(prompt, "prompt"); return prompt + "\nfor the code:\n```" + prompt + "\n" + language.getDisplayName() + "\n```";
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void invoke(@NotNull Project project, @Nullable Editor editor, @Nullable PsiFile file) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'project'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_2
/*    */     //   7: ifnull -> 14
/*    */     //   10: aload_3
/*    */     //   11: ifnonnull -> 15
/*    */     //   14: return
/*    */     //   15: aload_2
/*    */     //   16: invokeinterface getSelectionModel : ()Lcom/intellij/openapi/editor/SelectionModel;
/*    */     //   21: dup
/*    */     //   22: ldc 'editor.selectionModel'
/*    */     //   24: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   27: astore #4
/*    */     //   29: aload #4
/*    */     //   31: invokeinterface getSelectedText : ()Ljava/lang/String;
/*    */     //   36: astore #5
/*    */     //   38: aload_0
/*    */     //   39: aload_1
/*    */     //   40: aload_2
/*    */     //   41: invokevirtual getElementToExplain : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Editor;)Lcom/intellij/psi/PsiElement;
/*    */     //   44: astore #6
/*    */     //   46: aload #5
/*    */     //   48: ifnonnull -> 99
/*    */     //   51: aload #6
/*    */     //   53: ifnonnull -> 57
/*    */     //   56: return
/*    */     //   57: aload #4
/*    */     //   59: aload #6
/*    */     //   61: invokeinterface getTextRange : ()Lcom/intellij/openapi/util/TextRange;
/*    */     //   66: invokevirtual getStartOffset : ()I
/*    */     //   69: aload #6
/*    */     //   71: invokeinterface getTextRange : ()Lcom/intellij/openapi/util/TextRange;
/*    */     //   76: invokevirtual getEndOffset : ()I
/*    */     //   79: invokeinterface setSelection : (II)V
/*    */     //   84: aload #4
/*    */     //   86: invokeinterface getSelectedText : ()Ljava/lang/String;
/*    */     //   91: dup
/*    */     //   92: ifnonnull -> 97
/*    */     //   95: pop
/*    */     //   96: return
/*    */     //   97: astore #5
/*    */     //   99: aload_0
/*    */     //   100: aload_1
/*    */     //   101: aload #6
/*    */     //   103: invokevirtual getPrompt : (Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiElement;)Ljava/lang/String;
/*    */     //   106: dup
/*    */     //   107: ifnonnull -> 112
/*    */     //   110: pop
/*    */     //   111: return
/*    */     //   112: astore #7
/*    */     //   114: aload_0
/*    */     //   115: aload_3
/*    */     //   116: invokeinterface getLanguage : ()Lcom/intellij/lang/Language;
/*    */     //   121: dup
/*    */     //   122: ldc 'file.language'
/*    */     //   124: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   127: aload #5
/*    */     //   129: aload #7
/*    */     //   131: invokevirtual buildMessageFromPrompt : (Lcom/intellij/lang/Language;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*    */     //   134: astore #8
/*    */     //   136: getstatic com/intellij/openapi/wm/ToolWindowManager.Companion : Lcom/intellij/openapi/wm/ToolWindowManager$Companion;
/*    */     //   139: aload_1
/*    */     //   140: invokevirtual getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/wm/ToolWindowManager;
/*    */     //   143: ldc 'AIAssistant'
/*    */     //   145: invokevirtual getToolWindow : (Ljava/lang/String;)Lcom/intellij/openapi/wm/ToolWindow;
/*    */     //   148: dup
/*    */     //   149: ifnonnull -> 154
/*    */     //   152: pop
/*    */     //   153: return
/*    */     //   154: astore #9
/*    */     //   156: aload_0
/*    */     //   157: aload #6
/*    */     //   159: invokevirtual getContextItems : (Lcom/intellij/psi/PsiElement;)Ljava/util/List;
/*    */     //   162: astore #10
/*    */     //   164: aload #9
/*    */     //   166: aload_1
/*    */     //   167: aload_0
/*    */     //   168: aload #10
/*    */     //   170: aload_3
/*    */     //   171: aload #8
/*    */     //   173: <illegal opcode> run : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/intentions/chat/AbstractChatIntention;Ljava/util/List;Lcom/intellij/psi/PsiFile;Ljava/lang/String;)Ljava/lang/Runnable;
/*    */     //   178: invokeinterface activate : (Ljava/lang/Runnable;)V
/*    */     //   183: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #45	-> 6
/*    */     //   #47	-> 15
/*    */     //   #48	-> 29
/*    */     //   #50	-> 38
/*    */     //   #51	-> 46
/*    */     //   #52	-> 51
/*    */     //   #53	-> 57
/*    */     //   #54	-> 84
/*    */     //   #57	-> 99
/*    */     //   #58	-> 114
/*    */     //   #60	-> 136
/*    */     //   #61	-> 156
/*    */     //   #62	-> 164
/*    */     //   #73	-> 183
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   29	155	4	selectionModel	Lcom/intellij/openapi/editor/SelectionModel;
/*    */     //   38	146	5	selectedText	Ljava/lang/String;
/*    */     //   46	138	6	elementToExplain	Lcom/intellij/psi/PsiElement;
/*    */     //   114	70	7	promptToUse	Ljava/lang/String;
/*    */     //   136	48	8	message	Ljava/lang/String;
/*    */     //   156	28	9	toolWindow	Lcom/intellij/openapi/wm/ToolWindow;
/*    */     //   164	20	10	extraItems	Ljava/util/List;
/*    */     //   0	184	0	this	Lcom/intellij/ml/llm/intentions/chat/AbstractChatIntention;
/*    */     //   0	184	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   0	184	2	editor	Lcom/intellij/openapi/editor/Editor;
/*    */     //   0	184	3	file	Lcom/intellij/psi/PsiFile;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static final void invoke$lambda$0(Project $project, AbstractChatIntention this$0, List<ChatContextItem> $extraItems, PsiFile $file, String $message)
/*    */   {
/* 63 */     Intrinsics.checkNotNullParameter($project, "$project"); Intrinsics.checkNotNullParameter(this$0, "this$0"); Intrinsics.checkNotNullParameter($extraItems, "$extraItems"); Intrinsics.checkNotNullParameter($message, "$message"); BuildersKt.launch$default(AIAssistantServiceScope.Companion.getScope($project), null, null, new AbstractChatIntention$invoke$1$1(this$0, $extraItems, $file, $message, null), 3, null); } @DebugMetadata(f = "AbstractChatIntention.kt", l = {64, 66, 70}, i = {1}, s = {"L$0"}, n = {"chat"}, m = "invokeSuspend", c = "com.intellij.ml.llm.intentions.chat.AbstractChatIntention$invoke$1$1") @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) @SourceDebugExtension({"SMAP\nAbstractChatIntention.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractChatIntention.kt\ncom/intellij/ml/llm/intentions/chat/AbstractChatIntention$invoke$1$1\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,84:1\n29#2,3:85\n*S KotlinDebug\n*F\n+ 1 AbstractChatIntention.kt\ncom/intellij/ml/llm/intentions/chat/AbstractChatIntention$invoke$1$1\n*L\n64#1:85,3\n*E\n"}) static final class AbstractChatIntention$invoke$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { Object L$0; int label; AbstractChatIntention$invoke$1$1(AbstractChatIntention $receiver, List<ChatContextItem> $extraItems, PsiFile $file, String $message, Continuation $completion) { super(2, $completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { ChatSession chat; ComponentManager $this$service$iv; int $i$f$service; Class<ChatSessionHost> serviceClass$iv; Object object1, object2 = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 64 */           $this$service$iv = (ComponentManager)this.$project; $i$f$service = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */           
/* 85 */           serviceClass$iv = ChatSessionHost.class;
/* 86 */           object1 = $this$service$iv.getService(serviceClass$iv); if (object1 == null) throw new IllegalStateException((
/* 87 */                 "Cannot find service " + serviceClass$iv.getName() + " in " + $this$service$iv + " (classloader=" + serviceClass$iv.getClassLoader()).toString());  this.label = 1; if (((ChatSessionHost)object1).createChatSession(AbstractChatIntention.this.getChatCreationContext(this.$extraItems, this.$file), (Continuation)this) == object2) return object2;  chat = (ChatSession)((ChatSessionHost)object1).createChatSession(AbstractChatIntention.this.getChatCreationContext(this.$extraItems, this.$file), (Continuation)this); this.L$0 = chat; this.label = 2; if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$project, chat, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { ComponentManager $this$service$iv; int $i$f$service; Class<FocusedChatSessionHost> serviceClass$iv; Object object; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$service$iv = (ComponentManager)this.$project; $i$f$service = 0; serviceClass$iv = FocusedChatSessionHost.class; object = $this$service$iv.getService(serviceClass$iv); if (object == null) throw new IllegalStateException(("Cannot find service " + serviceClass$iv.getName() + " in " + $this$service$iv + " (classloader=" + serviceClass$iv.getClassLoader()).toString());  ((FocusedChatSessionHost)object).focusChatSession(this.$chat); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$project, this.$chat, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this) == object2) return object2;  BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$project, chat, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { ComponentManager $this$service$iv; int $i$f$service; Class<FocusedChatSessionHost> serviceClass$iv; Object object; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$service$iv = (ComponentManager)this.$project; $i$f$service = 0; serviceClass$iv = FocusedChatSessionHost.class; object = $this$service$iv.getService(serviceClass$iv); if (object == null) throw new IllegalStateException(("Cannot find service " + serviceClass$iv.getName() + " in " + $this$service$iv + " (classloader=" + serviceClass$iv.getClassLoader()).toString());  ((FocusedChatSessionHost)object).focusChatSession(this.$chat); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$project, this.$chat, $completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { ComponentManager $this$service$iv; int $i$f$service; Class<FocusedChatSessionHost> serviceClass$iv; Object object; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$service$iv = (ComponentManager)this.$project; $i$f$service = 0; serviceClass$iv = FocusedChatSessionHost.class; object = $this$service$iv.getService(serviceClass$iv); if (object == null) throw new IllegalStateException(("Cannot find service " + serviceClass$iv.getName() + " in " + $this$service$iv + " (classloader=" + serviceClass$iv.getClassLoader()).toString());  ((FocusedChatSessionHost)object).focusChatSession(this.$chat); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this); this.L$0 = null; this.label = 3; if (chat.send(this.$project, this.$message, (ChatKind)SimpleChat.INSTANCE, (Continuation)this) == object2) return object2;  chat.send(this.$project, this.$message, (ChatKind)SimpleChat.INSTANCE, (Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); chat = (ChatSession)SYNTHETIC_LOCAL_VARIABLE_1; this.L$0 = chat; this.label = 2; if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$project, chat, null) { int label; @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$project, this.$chat, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this) == object2) return object2;  BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$project, chat, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { ComponentManager $this$service$iv; int $i$f$service; Class<FocusedChatSessionHost> serviceClass$iv; Object object; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$service$iv = (ComponentManager)this.$project; $i$f$service = 0; serviceClass$iv = FocusedChatSessionHost.class; object = $this$service$iv.getService(serviceClass$iv); if (object == null) throw new IllegalStateException(("Cannot find service " + serviceClass$iv.getName() + " in " + $this$service$iv + " (classloader=" + serviceClass$iv.getClassLoader()).toString()); 
/*    */                       ((FocusedChatSessionHost)object).focusChatSession(this.$chat);
/*    */                       return Unit.INSTANCE; }
/*    */                   
/*    */                   throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */ 
/*    */                 
/*    */                 @NotNull
/*    */                 public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*    */                   return (Continuation)new Function2<>(this.$project, this.$chat, $completion);
/*    */                 }
/*    */                 
/*    */                 @Nullable
/*    */                 public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */                 } }
/*    */               (Continuation)this);
/*    */           this.L$0 = null;
/*    */           this.label = 3;
/*    */           if (chat.send(this.$project, this.$message, (ChatKind)SimpleChat.INSTANCE, (Continuation)this) == object2)
/*    */             return object2; 
/*    */           chat.send(this.$project, this.$message, (ChatKind)SimpleChat.INSTANCE, (Continuation)this);
/*    */           return Unit.INSTANCE;
/*    */         case 2:
/*    */           chat = (ChatSession)this.L$0;
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           this.L$0 = null;
/*    */           this.label = 3;
/*    */           if (chat.send(this.$project, this.$message, (ChatKind)SimpleChat.INSTANCE, (Continuation)this) == object2)
/*    */             return object2; 
/*    */           chat.send(this.$project, this.$message, (ChatKind)SimpleChat.INSTANCE, (Continuation)this);
/*    */           return Unit.INSTANCE;
/*    */         case 3:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           return Unit.INSTANCE; }
/*    */       
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super AbstractChatIntention$invoke$1$1> $completion) {
/*    */       return (Continuation<Unit>)new AbstractChatIntention$invoke$1$1(AbstractChatIntention.this, this.$extraItems, this.$file, this.$message, $completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */       return ((AbstractChatIntention$invoke$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     } }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   protected final PsiElement getElementToExplain(@Nullable Project project, @Nullable Editor editor) {
/*    */     PsiElement element;
/*    */     if (project == null || editor == null)
/*    */       return null; 
/*    */     if (PsiUtilBase.getElementAtCaret(editor) == null) {
/*    */       PsiUtilBase.getElementAtCaret(editor);
/*    */       return null;
/*    */     } 
/*    */     PsiFile psiFile = element.getContainingFile();
/*    */     if (InjectedLanguageManager.getInstance(project).isInjectedFragment(psiFile))
/*    */       return (PsiElement)psiFile; 
/*    */     (PsiElement)PsiTreeUtil.getParentOfType(element, PsiNameIdentifierOwner.class);
/*    */     return ((PsiElement)PsiTreeUtil.getParentOfType(element, PsiNameIdentifierOwner.class) != null) ? PsiTreeUtil.getParentOfType(element, PsiNameIdentifierOwner.class) : element;
/*    */   }
/*    */   
/*    */   public AbstractChatIntention() {
/*    */     this(null, 1, null);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/chat/AbstractChatIntention.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */