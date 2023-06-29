/*    */ package ai.grazie.ner.blocking;
/*    */ 
/*    */ import ai.grazie.ner.model.SentenceWithNERAnnotations;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\000*\001\000\b\n\030\0002\0020\001J\034\020\002\032\b\022\004\022\0020\0040\0032\f\020\005\032\b\022\004\022\0020\0060\003H\026¨\006\007"}, d2 = {"ai/grazie/ner/blocking/BlockingNERAnnotationService$Companion$empty$1", "Lai/grazie/ner/blocking/BlockingNERAnnotationService;", "annotate", "", "Lai/grazie/ner/model/SentenceWithNERAnnotations;", "sentences", "", "model-ner"})
/*    */ @SourceDebugExtension({"SMAP\nBlockingNERAnnotationService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockingNERAnnotationService.kt\nai/grazie/ner/blocking/BlockingNERAnnotationService$Companion$empty$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,37:1\n1549#2:38\n1620#2,2:39\n1622#2:42\n26#3:41\n*S KotlinDebug\n*F\n+ 1 BlockingNERAnnotationService.kt\nai/grazie/ner/blocking/BlockingNERAnnotationService$Companion$empty$1\n*L\n23#1:38\n23#1:39,2\n23#1:42\n23#1:41\n*E\n"})
/*    */ public final class BlockingNERAnnotationService$Companion$empty$1
/*    */   implements BlockingNERAnnotationService
/*    */ {
/*    */   @NotNull
/*    */   public List<SentenceWithNERAnnotations> annotate(@NotNull List sentences) {
/* 23 */     Intrinsics.checkNotNullParameter(sentences, "sentences"); Iterable $this$map$iv = sentences; int $i$f$map = 0;
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
/* 38 */     Iterable iterable1 = $this$map$iv; Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 39 */     for (Object item$iv$iv : iterable1) {
/* 40 */       String str = (String)item$iv$iv; Collection collection = destination$iv$iv; int $i$a$-map-BlockingNERAnnotationService$Companion$empty$1$annotate$1 = 0; int $i$f$emptyArray = 0;
/*    */     } 
/* 42 */     return (List<SentenceWithNERAnnotations>)destination$iv$iv;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/ner/blocking/BlockingNERAnnotationService$Companion$empty$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */