/*    */ package com.intellij.ml.llm.performanceTesting.name.suggestion;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.LinkedHashMap;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Pair;
/*    */ import kotlin.TuplesKt;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.collections.MapsKt;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.ranges.RangesKt;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\002\n\002\020$\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\032\020\003\032\016\022\004\022\0020\005\022\004\022\0020\0060\0042\006\020\007\032\0020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/performanceTesting/name/suggestion/NameSuggestionBenchmarkService$Companion;", "", "()V", "parseReport", "", "Lcom/intellij/ml/llm/performanceTesting/name/suggestion/NameSuggestionBenchmarkService$Location;", "Lcom/intellij/ml/llm/performanceTesting/name/suggestion/NameSuggestionBenchmarkService$Session;", "data", "", "intellij.ml.llm.performanceTesting"})
/*    */ @SourceDebugExtension({"SMAP\nNameSuggestionBenchmarkService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NameSuggestionBenchmarkService.kt\ncom/intellij/ml/llm/performanceTesting/name/suggestion/NameSuggestionBenchmarkService$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,74:1\n1549#2:75\n1620#2,3:76\n1179#2,2:79\n1253#2,4:81\n*S KotlinDebug\n*F\n+ 1 NameSuggestionBenchmarkService.kt\ncom/intellij/ml/llm/performanceTesting/name/suggestion/NameSuggestionBenchmarkService$Companion\n*L\n68#1:75\n68#1:76,3\n69#1:79,2\n69#1:81,4\n*E\n"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final Map<NameSuggestionBenchmarkService.Location, NameSuggestionBenchmarkService.Session> parseReport(@NotNull String data) {
/* 67 */     Intrinsics.checkNotNullParameter(data, "data"); List list1 = StringsKt.lines(data);
/* 68 */     int $i$f$map = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 75 */     List list2 = list1; Collection<List> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10)); int $i$f$mapTo = 0;
/* 76 */     for (Object item$iv$iv : list2) {
/* 77 */       String str = (String)item$iv$iv; Collection<List> collection = destination$iv$iv; int $i$a$-map-NameSuggestionBenchmarkService$Companion$parseReport$1 = 0; String[] arrayOfString = new String[1]; arrayOfString[0] = ";"; collection.add(StringsKt.split$default(str, arrayOfString, false, 0, 6, null));
/* 78 */     }  Iterable $this$map$iv = destination$iv$iv; int $i$f$associate = 0;
/* 79 */     int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)), 16);
/* 80 */     Iterable iterable1 = $this$map$iv; Map<Object, Object> map = new LinkedHashMap<>(capacity$iv); int $i$f$associateTo = 0;
/* 81 */     for (Object element$iv$iv : iterable1) {
/* 82 */       Map<Object, Object> map1 = map; List<String> values = (List)element$iv$iv; int $i$a$-associate-NameSuggestionBenchmarkService$Companion$parseReport$2 = 0; String[] arrayOfString = new String[1]; arrayOfString[0] = ","; Pair pair = TuplesKt.to(new NameSuggestionBenchmarkService.Location(values.get(0), Integer.parseInt(values.get(1))), new NameSuggestionBenchmarkService.Session(values.get(2), Long.parseLong(values.get(3)), Long.valueOf(Long.parseLong(values.get(4))), StringsKt.split$default(values.get(5), arrayOfString, false, 0, 6, null))); map1.put(pair.getFirst(), pair.getSecond());
/*    */     } 
/* 84 */     return (Map)map;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/performanceTesting/name/suggestion/NameSuggestionBenchmarkService$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */