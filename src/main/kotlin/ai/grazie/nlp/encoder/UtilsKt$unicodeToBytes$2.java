/*    */ package ai.grazie.nlp.encoder;
/*    */ 
/*    */ import java.util.LinkedHashMap;
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Pair;
/*    */ import kotlin.TuplesKt;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.collections.MapsKt;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.ranges.RangesKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020$\n\002\020\f\n\002\020\005\n\000\020\000\032\016\022\004\022\0020\002\022\004\022\0020\0030\001H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "", "", "invoke"})
/*    */ @SourceDebugExtension({"SMAP\nutils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 utils.kt\nai/grazie/nlp/encoder/UtilsKt$unicodeToBytes$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,54:1\n1179#2,2:55\n1253#2,4:57\n*S KotlinDebug\n*F\n+ 1 utils.kt\nai/grazie/nlp/encoder/UtilsKt$unicodeToBytes$2\n*L\n30#1:55,2\n30#1:57,4\n*E\n"})
/*    */ final class UtilsKt$unicodeToBytes$2
/*    */   extends Lambda
/*    */   implements Function0<Map<Character, ? extends Byte>>
/*    */ {
/*    */   public static final UtilsKt$unicodeToBytes$2 INSTANCE = new UtilsKt$unicodeToBytes$2();
/*    */   
/*    */   @NotNull
/*    */   public final Map<Character, Byte> invoke() {
/* 30 */     Iterable<Map.Entry<Byte, Character>> $this$associate$iv = UtilsKt.getBytesToUnicode().entrySet(); int $i$f$associate = 0;
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
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 55 */     int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associate$iv, 10)), 16);
/* 56 */     Iterable<Map.Entry<Byte, Character>> iterable1 = $this$associate$iv; Map<Object, Object> destination$iv$iv = new LinkedHashMap<>(capacity$iv); int $i$f$associateTo = 0;
/* 57 */     for (Object<Byte, Character> element$iv$iv : iterable1) {
/* 58 */       Map<Object, Object> map = destination$iv$iv; Map.Entry it = (Map.Entry)element$iv$iv; int $i$a$-associate-UtilsKt$unicodeToBytes$2$1 = 0; Pair pair = TuplesKt.to(it.getValue(), it.getKey()); map.put(pair.getFirst(), pair.getSecond());
/*    */     } 
/* 60 */     return (Map)destination$iv$iv;
/*    */   }
/*    */   
/*    */   UtilsKt$unicodeToBytes$2() {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/nlp/encoder/UtilsKt$unicodeToBytes$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */