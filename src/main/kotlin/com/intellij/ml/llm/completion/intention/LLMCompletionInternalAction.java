/*    */ package com.intellij.ml.llm.completion.intention;
/*    */ import com.intellij.codeInsight.inline.completion.InlineCompletionElement;
/*    */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*    */ import com.intellij.openapi.actionSystem.CommonDataKeys;
/*    */ import com.intellij.openapi.editor.Document;
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\b\000\030\0002\0020\001B\005¢\006\002\020\002J\020\020\005\032\0020\0062\006\020\007\032\0020\bH\026R\016\020\003\032\0020\004X\004¢\006\002\n\000¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/completion/intention/LLMCompletionInternalAction;", "Lcom/intellij/openapi/actionSystem/AnAction;", "()V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "actionPerformed", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "intellij.ml.llm"})
/*    */ public final class LLMCompletionInternalAction extends AnAction {
/*    */   @NotNull
/* 17 */   private final CoroutineScope scope = CoroutineScopeKt.CoroutineScope((CoroutineContext)EmptyCoroutineContext.INSTANCE); public void actionPerformed(@NotNull AnActionEvent e) {
/*    */     Editor editor;
/*    */     PsiFile file;
/* 20 */     Intrinsics.checkNotNullParameter(e, "e"); if ((Editor)e.getData(CommonDataKeys.EDITOR) == null) { (Editor)e.getData(CommonDataKeys.EDITOR); return; }
/* 21 */      Intrinsics.checkNotNullExpressionValue(editor.getDocument(), "editor.document"); Document document = editor.getDocument();
/* 22 */     if ((PsiFile)e.getData(CommonDataKeys.PSI_FILE) == null) { (PsiFile)e.getData(CommonDataKeys.PSI_FILE); return; }
/* 23 */      int offset = editor.getCaretModel().getOffset();
/* 24 */     BuildersKt.launch$default(this.scope, null, null, new LLMCompletionInternalAction$actionPerformed$1(file, editor, document, offset, e, null), 3, null);
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "LLMCompletionInternalAction.kt", l = {27, 30}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.completion.intention.LLMCompletionInternalAction$actionPerformed$1")
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */   @SourceDebugExtension({"SMAP\nLLMCompletionInternalAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMCompletionInternalAction.kt\ncom/intellij/ml/llm/completion/intention/LLMCompletionInternalAction$actionPerformed$1\n+ 2 LLMCompletionInternalAction.kt\ncom/intellij/ml/llm/completion/intention/LLMCompletionInternalActionKt\n*L\n1#1,43:1\n41#2,2:44\n*S KotlinDebug\n*F\n+ 1 LLMCompletionInternalAction.kt\ncom/intellij/ml/llm/completion/intention/LLMCompletionInternalAction$actionPerformed$1\n*L\n26#1:44,2\n*E\n"})
/*    */   static final class LLMCompletionInternalAction$actionPerformed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*    */     int label;
/*    */     
/*    */     LLMCompletionInternalAction$actionPerformed$1(PsiFile $file, Editor $editor, Document $document, int $offset, AnActionEvent $e, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       // Byte code:
/*    */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */       //   3: astore #8
/*    */       //   5: aload_0
/*    */       //   6: getfield label : I
/*    */       //   9: tableswitch default -> 230, 0 -> 36, 1 -> 158, 2 -> 220
/*    */       //   36: aload_1
/*    */       //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   40: new com/intellij/codeInsight/inline/completion/InlineCompletionRequest
/*    */       //   43: dup
/*    */       //   44: aload_0
/*    */       //   45: getfield $file : Lcom/intellij/psi/PsiFile;
/*    */       //   48: aload_0
/*    */       //   49: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*    */       //   52: aload_0
/*    */       //   53: getfield $document : Lcom/intellij/openapi/editor/Document;
/*    */       //   56: aload_0
/*    */       //   57: getfield $offset : I
/*    */       //   60: aload_0
/*    */       //   61: getfield $offset : I
/*    */       //   64: invokespecial <init> : (Lcom/intellij/psi/PsiFile;Lcom/intellij/openapi/editor/Editor;Lcom/intellij/openapi/editor/Document;II)V
/*    */       //   67: astore_2
/*    */       //   68: getstatic com/intellij/codeInsight/inline/completion/InlineCompletionProvider.Companion : Lcom/intellij/codeInsight/inline/completion/InlineCompletionProvider$Companion;
/*    */       //   71: invokevirtual extensions : ()Ljava/util/List;
/*    */       //   74: checkcast java/lang/Iterable
/*    */       //   77: astore #4
/*    */       //   79: iconst_0
/*    */       //   80: istore #5
/*    */       //   82: aload #4
/*    */       //   84: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */       //   89: astore #6
/*    */       //   91: aload #6
/*    */       //   93: invokeinterface hasNext : ()Z
/*    */       //   98: ifeq -> 123
/*    */       //   101: aload #6
/*    */       //   103: invokeinterface next : ()Ljava/lang/Object;
/*    */       //   108: astore #7
/*    */       //   110: aload #7
/*    */       //   112: instanceof com/intellij/ml/llm/completion/inline/LLMInlineCompletionProvider
/*    */       //   115: ifeq -> 91
/*    */       //   118: aload #7
/*    */       //   120: goto -> 133
/*    */       //   123: new java/util/NoSuchElementException
/*    */       //   126: dup
/*    */       //   127: ldc 'No element of given type found'
/*    */       //   129: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   132: athrow
/*    */       //   133: checkcast com/intellij/ml/llm/completion/inline/LLMInlineCompletionProvider
/*    */       //   136: aload_2
/*    */       //   137: aload_0
/*    */       //   138: checkcast kotlin/coroutines/Continuation
/*    */       //   141: aload_0
/*    */       //   142: iconst_1
/*    */       //   143: putfield label : I
/*    */       //   146: invokevirtual getProposals : (Lcom/intellij/codeInsight/inline/completion/InlineCompletionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   149: dup
/*    */       //   150: aload #8
/*    */       //   152: if_acmpne -> 163
/*    */       //   155: aload #8
/*    */       //   157: areturn
/*    */       //   158: aload_1
/*    */       //   159: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   162: aload_1
/*    */       //   163: checkcast java/util/List
/*    */       //   166: astore_3
/*    */       //   167: aload_3
/*    */       //   168: invokeinterface isEmpty : ()Z
/*    */       //   173: ifne -> 226
/*    */       //   176: new com/intellij/ml/llm/completion/intention/LLMCompletionInternalAction$actionPerformed$1$1
/*    */       //   179: dup
/*    */       //   180: aload_0
/*    */       //   181: getfield $e : Lcom/intellij/openapi/actionSystem/AnActionEvent;
/*    */       //   184: aload_3
/*    */       //   185: aload_0
/*    */       //   186: getfield $document : Lcom/intellij/openapi/editor/Document;
/*    */       //   189: aload_0
/*    */       //   190: getfield $offset : I
/*    */       //   193: invokespecial <init> : (Lcom/intellij/openapi/actionSystem/AnActionEvent;Ljava/util/List;Lcom/intellij/openapi/editor/Document;I)V
/*    */       //   196: checkcast kotlin/jvm/functions/Function0
/*    */       //   199: aload_0
/*    */       //   200: checkcast kotlin/coroutines/Continuation
/*    */       //   203: aload_0
/*    */       //   204: iconst_2
/*    */       //   205: putfield label : I
/*    */       //   208: invokestatic writeAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   211: dup
/*    */       //   212: aload #8
/*    */       //   214: if_acmpne -> 225
/*    */       //   217: aload #8
/*    */       //   219: areturn
/*    */       //   220: aload_1
/*    */       //   221: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   224: aload_1
/*    */       //   225: pop
/*    */       //   226: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */       //   229: areturn
/*    */       //   230: new java/lang/IllegalStateException
/*    */       //   233: dup
/*    */       //   234: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */       //   236: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   239: athrow
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #24	-> 3
/*    */       //   #25	-> 40
/*    */       //   #26	-> 68
/*    */       //   #44	-> 82
/*    */       //   #45	-> 123
/*    */       //   #27	-> 136
/*    */       //   #24	-> 155
/*    */       //   #26	-> 166
/*    */       //   #29	-> 167
/*    */       //   #30	-> 176
/*    */       //   #24	-> 217
/*    */       //   #36	-> 225
/*    */       //   #24	-> 230
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   68	55	2	request	Lcom/intellij/codeInsight/inline/completion/InlineCompletionRequest;
/*    */       //   133	16	2	request	Lcom/intellij/codeInsight/inline/completion/InlineCompletionRequest;
/*    */       //   167	44	3	llmProposals	Ljava/util/List;
/*    */       //   79	12	4	$this$firstIsInstance$iv	Ljava/lang/Iterable;
/*    */       //   110	13	7	element$iv	Ljava/lang/Object;
/*    */       //   82	51	5	$i$f$firstIsInstance	I
/*    */       //   40	190	0	this	Lcom/intellij/ml/llm/completion/intention/LLMCompletionInternalAction$actionPerformed$1;
/*    */       //   40	190	1	$result	Ljava/lang/Object;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super LLMCompletionInternalAction$actionPerformed$1> $completion) {
/*    */       return (Continuation<Unit>)new LLMCompletionInternalAction$actionPerformed$1(this.$file, this.$editor, this.$document, this.$offset, this.$e, $completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */       return ((LLMCompletionInternalAction$actionPerformed$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/completion/intention/LLMCompletionInternalAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */