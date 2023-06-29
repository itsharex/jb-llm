/*     */ package ai.grazie.utils.mpp.collections;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.collections.ArraysKt;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.collections.MapsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KClass;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\0000\n\000\n\002\030\002\n\002\b\003\n\002\020\021\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\n\002\020$\n\000\n\002\030\002\n\002\b\003\032Q\020\000\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\004\b\001\020\0032\f\020\004\032\b\022\004\022\002H\0020\0052\f\020\006\032\b\022\004\022\002H\0030\0052\006\020\007\032\0020\b2\006\020\t\032\0020\bH\007¢\006\002\020\n\032V\020\013\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\006\b\000\020\002\030\001\"\006\b\001\020\003\030\0012*\020\f\032\026\022\022\b\001\022\016\022\004\022\002H\002\022\004\022\002H\0030\r0\005\"\016\022\004\022\002H\002\022\004\022\002H\0030\rH\b¢\006\002\020\016\032.\020\017\032\016\022\004\022\002H\002\022\004\022\002H\0030\020\"\004\b\000\020\002\"\004\b\001\020\003*\016\022\004\022\002H\002\022\004\022\002H\0030\001\032;\020\021\032\024\022\020\022\016\022\004\022\002H\002\022\004\022\002H\0030\0220\005\"\004\b\000\020\002\"\004\b\001\020\003*\016\022\004\022\002H\002\022\004\022\002H\0030\001H\007¢\006\002\020\023\0325\020\024\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\006\b\000\020\002\030\001\"\006\b\001\020\003\030\001*\016\022\004\022\002H\002\022\004\022\002H\0030\020H\b\032>\020\024\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\004\b\001\020\003*\016\022\004\022\002H\002\022\004\022\002H\0030\0202\006\020\007\032\0020\b2\006\020\t\032\0020\b¨\006\025"}, d2 = {"exportableMap", "Lai/grazie/utils/mpp/collections/ExportableMap;", "K", "V", "keys", "", "values", "keysType", "Lai/grazie/utils/mpp/collections/ExportableType;", "valuesType", "([Ljava/lang/Object;[Ljava/lang/Object;Lai/grazie/utils/mpp/collections/ExportableType;Lai/grazie/utils/mpp/collections/ExportableType;)Lai/grazie/utils/mpp/collections/ExportableMap;", "exportableMapOf", "pairs", "Lkotlin/Pair;", "([Lkotlin/Pair;)Lai/grazie/utils/mpp/collections/ExportableMap;", "fromExportable", "", "toArray", "Lai/grazie/utils/mpp/collections/ExportablePair;", "(Lai/grazie/utils/mpp/collections/ExportableMap;)[Lai/grazie/utils/mpp/collections/ExportablePair;", "toExportable", "utils-common"})
/*     */ @SourceDebugExtension({"SMAP\nExportableMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExportableMap.kt\nai/grazie/utils/mpp/collections/ExportableMapKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 ExportableType.kt\nai/grazie/utils/mpp/collections/ExportableTypeKt\n+ 5 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,113:1\n108#1,2:124\n110#1:128\n1549#2:114\n1620#2,3:115\n1549#2:120\n1620#2,3:121\n37#3,2:118\n33#4:126\n33#4:129\n33#4:131\n26#5:127\n26#5:130\n26#5:132\n*S KotlinDebug\n*F\n+ 1 ExportableMap.kt\nai/grazie/utils/mpp/collections/ExportableMapKt\n*L\n95#1:124,2\n95#1:128\n73#1:114\n73#1:115,3\n76#1:120\n76#1:121,3\n74#1:118,2\n95#1:126\n109#1:129\n110#1:131\n95#1:127\n109#1:130\n110#1:132\n*E\n"})
/*     */ public final class ExportableMapKt
/*     */ {
/*     */   @NotNull
/*     */   public static final <K, V> ExportablePair<K, V>[] toArray(@NotNull ExportableMap $this$toArray) {
/*  72 */     Intrinsics.checkNotNullParameter($this$toArray, "<this>"); List list1 = ArraysKt.zip($this$toArray.getKeyType$utils_common().getEmptyArray$utils_common(), $this$toArray.getValueType$utils_common().getEmptyArray$utils_common());
/*  73 */     int i = 0;
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
/* 114 */     List list2 = list1; Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10)); int $i$f$mapTo = 0;
/* 115 */     for (Object item$iv$iv : list2) {
/* 116 */       Pair<?, ?> pair = (Pair)item$iv$iv; Collection collection = destination$iv$iv; int $i$a$-map-ExportableMapKt$toArray$emptyArray$1 = 0; collection.add(ExportablePairKt.toExportable(pair, $this$toArray.getKeyType$utils_common(), $this$toArray.getValueType$utils_common()));
/* 117 */     }  Iterable $this$map$iv = destination$iv$iv; int $i$f$toTypedArray = 0;
/* 118 */     Iterable iterable1 = $this$map$iv;
/* 119 */     ExportablePair[] emptyArray = (ExportablePair[])iterable1.toArray((Object[])new ExportablePair[0]); Collection $this$toTypedArray$iv = $this$toArray.getMap$utils_common().entrySet(); ExportablePair[] arrayOfExportablePair1 = emptyArray; int $i$f$map = 0;
/* 120 */     Iterable $this$mapTo$iv$iv = $this$toTypedArray$iv; destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$toTypedArray$iv, 10)); $i$f$mapTo = 0;
/* 121 */     for (Object item$iv$iv : $this$mapTo$iv$iv) {
/* 122 */       Map.Entry entry1 = (Map.Entry)item$iv$iv; Collection collection = destination$iv$iv; int $i$a$-map-ExportableMapKt$toArray$1 = 0; Map.Entry entry2 = entry1; collection.add(ExportablePairKt.toExportable(new Pair(entry2.getKey(), entry2.getValue()), $this$toArray.getKeyType$utils_common(), $this$toArray.getValueType$utils_common()));
/* 123 */     }  return (ExportablePair<K, V>[])ArraysKt.plus((Object[])arrayOfExportablePair1, destination$iv$iv);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final <K, V> ExportableMap<K, V> exportableMap(@NotNull Object[] keys, @NotNull Object[] values, @NotNull ExportableType keysType, @NotNull ExportableType valuesType) {
/*     */     Intrinsics.checkNotNullParameter(keys, "keys");
/*     */     Intrinsics.checkNotNullParameter(values, "values");
/*     */     Intrinsics.checkNotNullParameter(keysType, "keysType");
/*     */     Intrinsics.checkNotNullParameter(valuesType, "valuesType");
/*     */     return new ExportableMap<>(MapsKt.toMap(ArraysKt.zip(keys, values)), keysType, valuesType);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final <K, V> Map<K, V> fromExportable(@NotNull ExportableMap<K, V> $this$fromExportable) {
/*     */     Intrinsics.checkNotNullParameter($this$fromExportable, "<this>");
/*     */     return $this$fromExportable.getMap$utils_common();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final <K, V> ExportableMap<K, V> toExportable(@NotNull Map<K, ? extends V> $this$toExportable, @NotNull ExportableType keysType, @NotNull ExportableType valuesType) {
/*     */     Intrinsics.checkNotNullParameter($this$toExportable, "<this>");
/*     */     Intrinsics.checkNotNullParameter(keysType, "keysType");
/*     */     Intrinsics.checkNotNullParameter(valuesType, "valuesType");
/*     */     return new ExportableMap<>($this$toExportable, keysType, valuesType);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/mpp/collections/ExportableMapKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */