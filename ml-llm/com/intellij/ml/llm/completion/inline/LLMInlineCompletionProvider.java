/*    */ package com.intellij.ml.llm.completion.inline;
/*    */ 
/*    */ import com.intellij.codeInsight.inline.completion.InlineCompletionElement;
/*    */ import com.intellij.ml.llm.core.models.SenderKt;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\000\b\000\030\0002\0020\001B\005¢\006\002\020\002J\037\020\003\032\b\022\004\022\0020\0050\0042\006\020\006\032\0020\007H@ø\001\000¢\006\002\020\bJ\020\020\t\032\0020\n2\006\020\013\032\0020\fH\026\002\004\n\002\b\031¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/completion/inline/LLMInlineCompletionProvider;", "Lcom/intellij/codeInsight/inline/completion/InlineCompletionProvider;", "()V", "getProposals", "", "Lcom/intellij/codeInsight/inline/completion/InlineCompletionElement;", "request", "Lcom/intellij/codeInsight/inline/completion/InlineCompletionRequest;", "(Lcom/intellij/codeInsight/inline/completion/InlineCompletionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isEnabled", "", "event", "Lcom/intellij/openapi/editor/event/DocumentEvent;", "intellij.ml.llm"})
/*    */ public final class LLMInlineCompletionProvider implements InlineCompletionProvider {
/*    */   @Nullable
/*    */   public Object getProposals(@NotNull InlineCompletionRequest request, @NotNull Continuation<? super List<InlineCompletionElement>> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof com/intellij/ml/llm/completion/inline/LLMInlineCompletionProvider$getProposals$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast com/intellij/ml/llm/completion/inline/LLMInlineCompletionProvider$getProposals$1
/*    */     //   11: astore #8
/*    */     //   13: aload #8
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #8
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/completion/inline/LLMInlineCompletionProvider$getProposals$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/completion/inline/LLMInlineCompletionProvider;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #8
/*    */     //   50: aload #8
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #7
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #9
/*    */     //   62: aload #8
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 218, 0 -> 88, 1 -> 195
/*    */     //   88: aload #7
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: aload_1
/*    */     //   94: invokevirtual getFile : ()Lcom/intellij/psi/PsiFile;
/*    */     //   97: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*    */     //   102: dup
/*    */     //   103: ldc 'request.file.project'
/*    */     //   105: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   108: astore_3
/*    */     //   109: aload_1
/*    */     //   110: invokevirtual getDocument : ()Lcom/intellij/openapi/editor/Document;
/*    */     //   113: astore #4
/*    */     //   115: aload #4
/*    */     //   117: new com/intellij/openapi/util/TextRange
/*    */     //   120: dup
/*    */     //   121: aload_1
/*    */     //   122: invokevirtual getEndOffset : ()I
/*    */     //   125: bipush #100
/*    */     //   127: isub
/*    */     //   128: iconst_0
/*    */     //   129: invokestatic coerceAtLeast : (II)I
/*    */     //   132: aload_1
/*    */     //   133: invokevirtual getEndOffset : ()I
/*    */     //   136: aload #4
/*    */     //   138: invokeinterface getTextLength : ()I
/*    */     //   143: invokestatic coerceAtMost : (II)I
/*    */     //   146: invokespecial <init> : (II)V
/*    */     //   149: invokeinterface getText : (Lcom/intellij/openapi/util/TextRange;)Ljava/lang/String;
/*    */     //   154: dup
/*    */     //   155: ldc 'document.getText(\\n      …st(document.textLength)))'
/*    */     //   157: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   160: astore #5
/*    */     //   162: new com/intellij/ml/llm/completion/inline/LLMInlineCompletionProvider$getProposals$result$1
/*    */     //   165: dup
/*    */     //   166: aload_3
/*    */     //   167: aload #5
/*    */     //   169: invokespecial <init> : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;)V
/*    */     //   172: checkcast kotlin/jvm/functions/Function0
/*    */     //   175: aload #8
/*    */     //   177: aload #8
/*    */     //   179: iconst_1
/*    */     //   180: putfield label : I
/*    */     //   183: invokestatic blockingContext : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   186: dup
/*    */     //   187: aload #9
/*    */     //   189: if_acmpne -> 202
/*    */     //   192: aload #9
/*    */     //   194: areturn
/*    */     //   195: aload #7
/*    */     //   197: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   200: aload #7
/*    */     //   202: checkcast java/util/List
/*    */     //   205: astore #6
/*    */     //   207: aload #6
/*    */     //   209: dup
/*    */     //   210: ifnonnull -> 217
/*    */     //   213: pop
/*    */     //   214: invokestatic emptyList : ()Ljava/util/List;
/*    */     //   217: areturn
/*    */     //   218: new java/lang/IllegalStateException
/*    */     //   221: dup
/*    */     //   222: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   224: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   227: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #19	-> 60
/*    */     //   #20	-> 93
/*    */     //   #21	-> 109
/*    */     //   #22	-> 115
/*    */     //   #23	-> 117
/*    */     //   #22	-> 149
/*    */     //   #25	-> 162
/*    */     //   #19	-> 192
/*    */     //   #26	-> 207
/*    */     //   #19	-> 218
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	56	1	request	Lcom/intellij/codeInsight/inline/completion/InlineCompletionRequest;
/*    */     //   109	77	3	project	Lcom/intellij/openapi/project/Project;
/*    */     //   115	34	4	document	Lcom/intellij/openapi/editor/Document;
/*    */     //   162	24	5	prefix	Ljava/lang/String;
/*    */     //   207	6	6	result	Ljava/util/List;
/*    */     //   50	168	8	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	161	7	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/* 16 */   public boolean isEnabled(@NotNull DocumentEvent event) { Intrinsics.checkNotNullParameter(event, "event"); return Registry.is("llm.is.inline.completion.enabled"); } @DebugMetadata(f = "LLMInlineEditorListener.kt", l = {25}, i = {}, s = {}, n = {}, m = "getProposals", c = "com.intellij.ml.llm.completion.inline.LLMInlineCompletionProvider") @Metadata(mv = {1, 8, 0}, k = 3, xi = 48) static final class LLMInlineCompletionProvider$getProposals$1 extends ContinuationImpl {
/*    */     int label; LLMInlineCompletionProvider$getProposals$1(Continuation $completion) { super($completion); } @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) { this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return LLMInlineCompletionProvider.this.getProposals(null, (Continuation<? super List<InlineCompletionElement>>)this); }
/*    */   } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020 \n\002\030\002\n\000\020\000\032\n\022\004\022\0020\002\030\0010\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/codeInsight/inline/completion/InlineCompletionElement;", "invoke"})
/*    */   @SourceDebugExtension({"SMAP\nLLMInlineEditorListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMInlineEditorListener.kt\ncom/intellij/ml/llm/completion/inline/LLMInlineCompletionProvider$getProposals$result$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,29:1\n1549#2:30\n1620#2,3:31\n*S KotlinDebug\n*F\n+ 1 LLMInlineEditorListener.kt\ncom/intellij/ml/llm/completion/inline/LLMInlineCompletionProvider$getProposals$result$1\n*L\n25#1:30\n25#1:31,3\n*E\n"})
/*    */   static final class LLMInlineCompletionProvider$getProposals$result$1 extends Lambda implements Function0<List<? extends InlineCompletionElement>> {
/*    */     @Nullable
/* 25 */     public final List<InlineCompletionElement> invoke() { Iterable $this$map$iv = SenderKt.sendCompletionChatRequest$default(this.$project, this.$prefix, "", null, null, null, null, null, null, 0, null, null, null, 8184, null).getSuggestions(); int $i$f$map = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 30 */       Iterable iterable1 = $this$map$iv; Collection<InlineCompletionElement> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 31 */       for (Object item$iv$iv : iterable1) {
/* 32 */         LLMResponseChoice lLMResponseChoice = (LLMResponseChoice)item$iv$iv; Collection<InlineCompletionElement> collection = destination$iv$iv; int $i$a$-map-LLMInlineCompletionProvider$getProposals$result$1$1 = 0; collection.add(new InlineCompletionElement(lLMResponseChoice.getText()));
/* 33 */       }  SenderKt.sendCompletionChatRequest$default(this.$project, this.$prefix, "", null, null, null, null, null, null, 0, null, null, null, 8184, null).getSuggestions(); return (SenderKt.sendCompletionChatRequest$default(this.$project, this.$prefix, "", null, null, null, null, null, null, 0, null, null, null, 8184, null) != null && SenderKt.sendCompletionChatRequest$default(this.$project, this.$prefix, "", null, null, null, null, null, null, 0, null, null, null, 8184, null).getSuggestions() != null) ? (List<InlineCompletionElement>)destination$iv$iv : null; }
/*    */ 
/*    */     
/*    */     LLMInlineCompletionProvider$getProposals$result$1(Project $project, String $prefix) {
/*    */       super(0);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/completion/inline/LLMInlineCompletionProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */