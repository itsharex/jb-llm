/*    */ package ai.grazie.ner.chain;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\030\0002\0020\001B\023\022\f\020\002\032\b\022\004\022\0020\0010\003¢\006\002\020\004J\034\020\005\032\b\022\004\022\0020\0060\0032\f\020\007\032\b\022\004\022\0020\b0\003H\026R\024\020\002\032\b\022\004\022\0020\0010\003X\004¢\006\002\n\000¨\006\t"}, d2 = {"Lai/grazie/ner/chain/ChainedNERAnnotationService;", "Lai/grazie/ner/blocking/BlockingNERAnnotationService;", "annotators", "", "(Ljava/util/List;)V", "annotate", "Lai/grazie/ner/model/SentenceWithNERAnnotations;", "sentences", "", "model-ner"})
/*    */ @SourceDebugExtension({"SMAP\nChainedNERAnnotationService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChainedNERAnnotationService.kt\nai/grazie/ner/chain/ChainedNERAnnotationService\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,19:1\n26#2:20\n*S KotlinDebug\n*F\n+ 1 ChainedNERAnnotationService.kt\nai/grazie/ner/chain/ChainedNERAnnotationService\n*L\n10#1:20\n*E\n"})
/*    */ public final class ChainedNERAnnotationService implements BlockingNERAnnotationService {
/*  6 */   public ChainedNERAnnotationService(@NotNull List<BlockingNERAnnotationService> annotators) { this.annotators = annotators; } @NotNull
/*    */   private final List<BlockingNERAnnotationService> annotators; @NotNull
/*  8 */   public List<SentenceWithNERAnnotations> annotate(@NotNull List sentences) { Intrinsics.checkNotNullParameter(sentences, "sentences"); ArrayList<SentenceWithNERAnnotations> result = new ArrayList();
/*  9 */     for (String sentence : sentences) {
/* 10 */       int $i$f$emptyArray = 0; SentenceWithNERAnnotations annotations = new SentenceWithNERAnnotations(sentence, 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */           
/* 20 */           new SentenceWithNERAnnotations.Annotation[0]);
/*    */       for (BlockingNERAnnotationService annotator : this.annotators)
/*    */         annotations = SentenceWithNERAnnotations.copy$default(annotations, null, (SentenceWithNERAnnotations.Annotation[])ArraysKt.plus((Object[])annotations.getAnnotations(), (Object[])annotator.annotate(sentence).getAnnotations()), 1, null); 
/*    */       result.add(annotations);
/*    */     } 
/*    */     return result; }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/ner/chain/ChainedNERAnnotationService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */