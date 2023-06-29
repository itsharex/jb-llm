/*    */ package ai.grazie.ner.blocking;
/*    */ 
/*    */ import ai.grazie.ner.model.SentenceWithNERAnnotations;
/*    */ import ai.grazie.nlp.langs.Language;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\030\020\007\032\0020\0042\006\020\b\032\0020\t2\006\020\n\032\0020\013H\007R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\f"}, d2 = {"Lai/grazie/ner/blocking/BlockingNERAnnotationService$Companion;", "", "()V", "empty", "Lai/grazie/ner/blocking/BlockingNERAnnotationService;", "getEmpty", "()Lai/grazie/ner/blocking/BlockingNERAnnotationService;", "of", "service", "Lai/grazie/ner/blocking/BlockingMultiNERAnnotationService;", "language", "Lai/grazie/nlp/langs/Language;", "model-ner"})
/*    */ public final class Companion
/*    */ {
/*    */   @NotNull
/* 21 */   private static final BlockingNERAnnotationService empty = new BlockingNERAnnotationService$Companion$empty$1(); @NotNull public final BlockingNERAnnotationService getEmpty() { return empty; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\000*\001\000\b\n\030\0002\0020\001J\034\020\002\032\b\022\004\022\0020\0040\0032\f\020\005\032\b\022\004\022\0020\0060\003H\026¨\006\007"}, d2 = {"ai/grazie/ner/blocking/BlockingNERAnnotationService$Companion$empty$1", "Lai/grazie/ner/blocking/BlockingNERAnnotationService;", "annotate", "", "Lai/grazie/ner/model/SentenceWithNERAnnotations;", "sentences", "", "model-ner"}) @SourceDebugExtension({"SMAP\nBlockingNERAnnotationService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockingNERAnnotationService.kt\nai/grazie/ner/blocking/BlockingNERAnnotationService$Companion$empty$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,37:1\n1549#2:38\n1620#2,2:39\n1622#2:42\n26#3:41\n*S KotlinDebug\n*F\n+ 1 BlockingNERAnnotationService.kt\nai/grazie/ner/blocking/BlockingNERAnnotationService$Companion$empty$1\n*L\n23#1:38\n23#1:39,2\n23#1:42\n23#1:41\n*E\n"})
/*    */   public static final class BlockingNERAnnotationService$Companion$empty$1 implements BlockingNERAnnotationService { @NotNull
/* 23 */     public List<SentenceWithNERAnnotations> annotate(@NotNull List sentences) { Intrinsics.checkNotNullParameter(sentences, "sentences"); Iterable $this$map$iv = sentences; int $i$f$map = 0;
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
/* 38 */       Iterable iterable1 = $this$map$iv; Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 39 */       for (Object item$iv$iv : iterable1) {
/* 40 */         String str = (String)item$iv$iv; Collection collection = destination$iv$iv; int $i$a$-map-BlockingNERAnnotationService$Companion$empty$1$annotate$1 = 0; int $i$f$emptyArray = 0;
/*    */       } 
/* 42 */       return (List<SentenceWithNERAnnotations>)destination$iv$iv; }
/*    */      }
/*    */ 
/*    */   
/*    */   @JvmStatic
/*    */   @NotNull
/*    */   public final BlockingNERAnnotationService of(@NotNull BlockingMultiNERAnnotationService service, @NotNull Language language) {
/*    */     Intrinsics.checkNotNullParameter(service, "service");
/*    */     Intrinsics.checkNotNullParameter(language, "language");
/*    */     return new BlockingNERAnnotationService$Companion$of$1(service, language);
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\000*\001\000\b\n\030\0002\0020\001J\034\020\002\032\b\022\004\022\0020\0040\0032\f\020\005\032\b\022\004\022\0020\0060\003H\026¨\006\007"}, d2 = {"ai/grazie/ner/blocking/BlockingNERAnnotationService$Companion$of$1", "Lai/grazie/ner/blocking/BlockingNERAnnotationService;", "annotate", "", "Lai/grazie/ner/model/SentenceWithNERAnnotations;", "sentences", "", "model-ner"})
/*    */   public static final class BlockingNERAnnotationService$Companion$of$1 implements BlockingNERAnnotationService {
/*    */     BlockingNERAnnotationService$Companion$of$1(BlockingMultiNERAnnotationService $service, Language $language) {}
/*    */     
/*    */     @NotNull
/*    */     public List<SentenceWithNERAnnotations> annotate(@NotNull List<String> sentences) {
/*    */       Intrinsics.checkNotNullParameter(sentences, "sentences");
/*    */       return this.$service.annotate(this.$language, sentences);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/ner/blocking/BlockingNERAnnotationService$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */