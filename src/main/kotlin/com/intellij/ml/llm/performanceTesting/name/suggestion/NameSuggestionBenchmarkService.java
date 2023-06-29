/*    */ package com.intellij.ml.llm.performanceTesting.name.suggestion;@Service({Service.Level.APP})
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\020%\n\002\030\002\n\002\030\002\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\000\n\002\020\b\n\002\b\b\b\007\030\000 \0252\0020\001:\003\025\026\027B\r\022\006\020\002\032\0020\003¢\006\002\020\004J$\020\f\032\0020\t2\006\020\r\032\0020\0162\006\020\017\032\0020\0202\f\020\021\032\b\022\004\022\0020\t0\bJ\006\020\022\032\0020\tJ\016\020\023\032\0020\t2\006\020\024\032\0020\016R\016\020\002\032\0020\003X\004¢\006\002\n\000R \020\005\032\024\022\004\022\0020\007\022\n\022\b\022\004\022\0020\t0\b0\006X\004¢\006\002\n\000R\032\020\n\032\016\022\004\022\0020\007\022\004\022\0020\0130\006X\004¢\006\002\n\000¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/performanceTesting/name/suggestion/NameSuggestionBenchmarkService;", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "listeners", "", "Lcom/intellij/ml/llm/performanceTesting/name/suggestion/NameSuggestionBenchmarkService$Location;", "Lkotlin/Function0;", "", "results", "Lcom/intellij/ml/llm/performanceTesting/name/suggestion/NameSuggestionBenchmarkService$Session;", "onFinish", "file", "", "offset", "", "f", "startBenchmark", "stopBenchmark", "reportPath", "Companion", "Location", "Session", "intellij.ml.llm.performanceTesting"})
/*    */ @SourceDebugExtension({"SMAP\nNameSuggestionBenchmarkService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NameSuggestionBenchmarkService.kt\ncom/intellij/ml/llm/performanceTesting/name/suggestion/NameSuggestionBenchmarkService\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,74:1\n125#2:75\n152#2,3:76\n*S KotlinDebug\n*F\n+ 1 NameSuggestionBenchmarkService.kt\ncom/intellij/ml/llm/performanceTesting/name/suggestion/NameSuggestionBenchmarkService\n*L\n55#1:75\n55#1:76,3\n*E\n"})
/*    */ public final class NameSuggestionBenchmarkService { @NotNull
/*    */   public static final Companion Companion = new Companion(null); @NotNull
/*    */   private final CoroutineScope coroutineScope;
/*    */   @NotNull
/*    */   private final Map<Location, Session> results;
/*    */   @NotNull
/*    */   private final Map<Location, Function0<Unit>> listeners;
/*    */   
/*    */   public NameSuggestionBenchmarkService(@NotNull CoroutineScope coroutineScope) {
/* 13 */     this.coroutineScope = coroutineScope;
/* 14 */     this.results = new LinkedHashMap<>();
/* 15 */     this.listeners = new LinkedHashMap<>();
/*    */   }
/* 17 */   public final void startBenchmark() { this.results.clear();
/* 18 */     ApplicationManager.getApplication().getMessageBus()
/* 19 */       .connect(this.coroutineScope)
/* 20 */       .subscribe(NameSuggestionListenerKt.getNameSuggestionTopic(), new NameSuggestionBenchmarkService$startBenchmark$1()); } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000+\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\020\036\n\002\b\002*\001\000\b\n\030\0002\0020\001J.\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\f\020\n\032\b\022\004\022\0020\t0\013H\026J \020\f\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\tH\026¨\006\r"}, d2 = {"com/intellij/ml/llm/performanceTesting/name/suggestion/NameSuggestionBenchmarkService$startBenchmark$1", "Lcom/intellij/ml/llm/refactorings/NameSuggestionListener;", "onFinish", "", "file", "Lcom/intellij/openapi/vfs/VirtualFile;", "offset", "", "originalName", "", "suggestedNames", "", "onStart", "intellij.ml.llm.performanceTesting"})
/*    */   public static final class NameSuggestionBenchmarkService$startBenchmark$1 implements NameSuggestionListener { public void onStart(@NotNull VirtualFile file, int offset, @NotNull String originalName) {
/* 22 */       Intrinsics.checkNotNullParameter(file, "file"); Intrinsics.checkNotNullParameter(originalName, "originalName"); Map<NameSuggestionBenchmarkService.Location, NameSuggestionBenchmarkService.Session> map = NameSuggestionBenchmarkService.this.results; Intrinsics.checkNotNullExpressionValue(file.getPath(), "file.path"); NameSuggestionBenchmarkService.Location location = new NameSuggestionBenchmarkService.Location(file.getPath(), offset); NameSuggestionBenchmarkService.Session session = new NameSuggestionBenchmarkService.Session(originalName, (new Date()).getTime(), null, CollectionsKt.emptyList()); map.put(location, session);
/*    */     }
/*    */     
/*    */     public void onFinish(@NotNull VirtualFile file, int offset, @NotNull String originalName, @NotNull Collection<String> suggestedNames) {
/* 26 */       Intrinsics.checkNotNullParameter(file, "file"); Intrinsics.checkNotNullParameter(originalName, "originalName"); Intrinsics.checkNotNullParameter(suggestedNames, "suggestedNames"); Intrinsics.checkNotNullExpressionValue(file.getPath(), "file.path"); NameSuggestionBenchmarkService.Location location = new NameSuggestionBenchmarkService.Location(file.getPath(), offset);
/* 27 */       NameSuggestionBenchmarkService.Session session1 = (NameSuggestionBenchmarkService.Session)NameSuggestionBenchmarkService.this.results.get(location), it = session1; int $i$a$-also-NameSuggestionBenchmarkService$startBenchmark$1$onFinish$1 = 0;
/* 28 */       it.setEndTime(Long.valueOf((new Date()).getTime()));
/* 29 */       it.setNames(suggestedNames);
/*    */       (NameSuggestionBenchmarkService.Session)NameSuggestionBenchmarkService.this.results.get(location);
/* 31 */       Function0 function01 = (Function0)NameSuggestionBenchmarkService.this.listeners.get(location); NameSuggestionBenchmarkService nameSuggestionBenchmarkService = NameSuggestionBenchmarkService.this; Function0 function02 = function01; int $i$a$-let-NameSuggestionBenchmarkService$startBenchmark$1$onFinish$2 = 0;
/* 32 */       nameSuggestionBenchmarkService.listeners.remove(location);
/* 33 */       function02.invoke(); (Function0)NameSuggestionBenchmarkService.this.listeners.get(location);
/*    */     } }
/*    */    @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\t\n\002\020\013\n\002\b\004\b\b\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\t\020\013\032\0020\003HÆ\003J\t\020\f\032\0020\005HÆ\003J\035\020\r\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\005HÖ\001J\t\020\022\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\007\020\bR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\t\020\n¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/performanceTesting/name/suggestion/NameSuggestionBenchmarkService$Location;", "", "file", "", "offset", "", "(Ljava/lang/String;I)V", "getFile", "()Ljava/lang/String;", "getOffset", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "intellij.ml.llm.performanceTesting"}) public static final class Location { @NotNull private final String file; private final int offset; public Location(@NotNull String file, int offset) { this.file = file; this.offset = offset; } @NotNull public final String getFile() { return this.file; } public final int getOffset() { return this.offset; } @NotNull public final String component1() { return this.file; } public final int component2() { return this.offset; }
/*    */     @NotNull public final Location copy(@NotNull String file, int offset) { Intrinsics.checkNotNullParameter(file, "file"); return new Location(file, offset); }
/*    */     @NotNull public String toString() { return "Location(file=" + this.file + ", offset=" + this.offset + ")"; }
/*    */     public int hashCode() { result = this.file.hashCode(); return result * 31 + Integer.hashCode(this.offset); }
/*    */     public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Location)) return false;  Location location = (Location)other; return !Intrinsics.areEqual(this.file, location.file) ? false : (!(this.offset != location.offset)); } }
/* 40 */   public final void onFinish(@NotNull String file, int offset, @NotNull Function0<Unit> f) { Intrinsics.checkNotNullParameter(file, "file"); Intrinsics.checkNotNullParameter(f, "f"); Location location = new Location(file, offset);
/* 41 */     this.listeners.put(location, f);
/* 42 */     (Session)this.results.get(location); if ((((Session)this.results.get(location) != null) ? ((Session)this.results.get(location)).getEndTime() : null) != null) {
/* 43 */       Function0 it = this.listeners.get(location); int $i$a$-let-NameSuggestionBenchmarkService$onFinish$1 = 0;
/* 44 */       this.listeners.remove(location);
/* 45 */       it.invoke();
/*    */       (Function0)this.listeners.get(location);
/*    */     }  }
/*    */ 
/*    */   
/*    */   public final void stopBenchmark(@NotNull String reportPath) {
/* 51 */     Intrinsics.checkNotNullParameter(reportPath, "reportPath"); File file = new File(reportPath);
/* 52 */     if (!file.exists()) {
/* 53 */       file.createNewFile();
/*    */     }
/* 55 */     Map<Location, Session> $this$map$iv = this.results; int $i$f$map = 0;
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
/* 75 */     Map<Location, Session> map1 = $this$map$iv; Collection<String> destination$iv$iv = new ArrayList($this$map$iv.size()); int $i$f$mapTo = 0;
/* 76 */     for (Map.Entry<Location, Session> item$iv$iv : map1.entrySet()) {
/* 77 */       Map.Entry<Location, Session> entry1 = item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-NameSuggestionBenchmarkService$stopBenchmark$text$1 = 0; Location location = (Location)entry1.getKey(); Session session = (Session)entry1.getValue(); collection.add(location.getFile() + ";" + location.getFile() + ";" + location.getOffset() + ";" + session.getOriginalName() + ";" + session.getStartTime() + ";" + session.getEndTime() + ";");
/* 78 */     }  String text = CollectionsKt.joinToString$default(destination$iv$iv, "\n", null, null, 0, null, null, 62, null); FilesKt.appendText$default(file, text, null, 2, null); } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\t\n\002\b\002\n\002\020\036\n\002\b\025\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B/\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\n\b\002\020\006\032\004\030\0010\005\022\f\020\007\032\b\022\004\022\0020\0030\b¢\006\002\020\tJ\t\020\027\032\0020\003HÆ\003J\t\020\030\032\0020\005HÆ\003J\020\020\031\032\004\030\0010\005HÆ\003¢\006\002\020\013J\017\020\032\032\b\022\004\022\0020\0030\bHÆ\003J>\020\033\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\0052\016\b\002\020\007\032\b\022\004\022\0020\0030\bHÆ\001¢\006\002\020\034J\023\020\035\032\0020\0362\b\020\037\032\004\030\0010\001HÖ\003J\t\020 \032\0020!HÖ\001J\t\020\"\032\0020\003HÖ\001R\036\020\006\032\004\030\0010\005X\016¢\006\020\n\002\020\016\032\004\b\n\020\013\"\004\b\f\020\rR \020\007\032\b\022\004\022\0020\0030\bX\016¢\006\016\n\000\032\004\b\017\020\020\"\004\b\021\020\022R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\023\020\024R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\025\020\026¨\006#"}, d2 = {"Lcom/intellij/ml/llm/performanceTesting/name/suggestion/NameSuggestionBenchmarkService$Session;", "", "originalName", "", "startTime", "", "endTime", "names", "", "(Ljava/lang/String;JLjava/lang/Long;Ljava/util/Collection;)V", "getEndTime", "()Ljava/lang/Long;", "setEndTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getNames", "()Ljava/util/Collection;", "setNames", "(Ljava/util/Collection;)V", "getOriginalName", "()Ljava/lang/String;", "getStartTime", "()J", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;JLjava/lang/Long;Ljava/util/Collection;)Lcom/intellij/ml/llm/performanceTesting/name/suggestion/NameSuggestionBenchmarkService$Session;", "equals", "", "other", "hashCode", "", "toString", "intellij.ml.llm.performanceTesting"}) public static final class Session { @NotNull private final String originalName; private final long startTime; @Nullable private Long endTime; @NotNull private Collection<String> names; public Session(@NotNull String originalName, long startTime, @Nullable Long endTime, @NotNull Collection<String> names) { this.originalName = originalName; this.startTime = startTime; this.endTime = endTime; this.names = names; } @NotNull public final String getOriginalName() { return this.originalName; } public final long getStartTime() { return this.startTime; } @Nullable public final Long getEndTime() { return this.endTime; } public final void setEndTime(@Nullable Long <set-?>) { this.endTime = <set-?>; } @NotNull public final Collection<String> getNames() { return this.names; } public final void setNames(@NotNull Collection<String> <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.names = <set-?>; } @NotNull public final String component1() { return this.originalName; } public final long component2() { return this.startTime; } @Nullable public final Long component3() { return this.endTime; } @NotNull public final Collection<String> component4() { return this.names; } @NotNull public final Session copy(@NotNull String originalName, long startTime, @Nullable Long endTime, @NotNull Collection<String> names) { Intrinsics.checkNotNullParameter(originalName, "originalName"); Intrinsics.checkNotNullParameter(names, "names"); return new Session(originalName, startTime, endTime, names); } @NotNull public String toString() { return "Session(originalName=" + this.originalName + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", names=" + this.names + ")"; } public int hashCode() { result = this.originalName.hashCode(); result = result * 31 + Long.hashCode(this.startTime); result = result * 31 + ((this.endTime == null) ? 0 : this.endTime.hashCode()); return result * 31 + this.names.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Session)) return false;  Session session = (Session)other; return !Intrinsics.areEqual(this.originalName, session.originalName) ? false : ((this.startTime != session.startTime) ? false : (!Intrinsics.areEqual(this.endTime, session.endTime) ? false : (!!Intrinsics.areEqual(this.names, session.names)))); } } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\002\n\002\020$\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\032\020\003\032\016\022\004\022\0020\005\022\004\022\0020\0060\0042\006\020\007\032\0020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/performanceTesting/name/suggestion/NameSuggestionBenchmarkService$Companion;", "", "()V", "parseReport", "", "Lcom/intellij/ml/llm/performanceTesting/name/suggestion/NameSuggestionBenchmarkService$Location;", "Lcom/intellij/ml/llm/performanceTesting/name/suggestion/NameSuggestionBenchmarkService$Session;", "data", "", "intellij.ml.llm.performanceTesting"}) @SourceDebugExtension({"SMAP\nNameSuggestionBenchmarkService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NameSuggestionBenchmarkService.kt\ncom/intellij/ml/llm/performanceTesting/name/suggestion/NameSuggestionBenchmarkService$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,74:1\n1549#2:75\n1620#2,3:76\n1179#2,2:79\n1253#2,4:81\n*S KotlinDebug\n*F\n+ 1 NameSuggestionBenchmarkService.kt\ncom/intellij/ml/llm/performanceTesting/name/suggestion/NameSuggestionBenchmarkService$Companion\n*L\n68#1:75\n68#1:76,3\n69#1:79,2\n69#1:81,4\n*E\n"}) public static final class Companion { @NotNull public final Map<NameSuggestionBenchmarkService.Location, NameSuggestionBenchmarkService.Session> parseReport(@NotNull String data) { Intrinsics.checkNotNullParameter(data, "data"); List list1 = StringsKt.lines(data); int $i$f$map = 0; List list2 = list1; Collection<List> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10)); int $i$f$mapTo = 0; for (Object item$iv$iv : list2) { String str = (String)item$iv$iv; Collection<List> collection = destination$iv$iv; int $i$a$-map-NameSuggestionBenchmarkService$Companion$parseReport$1 = 0; String[] arrayOfString = new String[1]; arrayOfString[0] = ";"; collection.add(StringsKt.split$default(str, arrayOfString, false, 0, 6, null)); }  Iterable $this$map$iv = destination$iv$iv; int $i$f$associate = 0;
/* 79 */       int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)), 16);
/* 80 */       Iterable iterable1 = $this$map$iv; Map<Object, Object> map = new LinkedHashMap<>(capacity$iv); int $i$f$associateTo = 0;
/* 81 */       for (Object element$iv$iv : iterable1) {
/* 82 */         Map<Object, Object> map1 = map; List<String> values = (List)element$iv$iv; int $i$a$-associate-NameSuggestionBenchmarkService$Companion$parseReport$2 = 0; String[] arrayOfString = new String[1]; arrayOfString[0] = ","; Pair pair = TuplesKt.to(new NameSuggestionBenchmarkService.Location(values.get(0), Integer.parseInt(values.get(1))), new NameSuggestionBenchmarkService.Session(values.get(2), Long.parseLong(values.get(3)), Long.valueOf(Long.parseLong(values.get(4))), StringsKt.split$default(values.get(5), arrayOfString, false, 0, 6, null))); map1.put(pair.getFirst(), pair.getSecond());
/*    */       } 
/* 84 */       return (Map)map; }
/*    */ 
/*    */     
/*    */     private Companion() {} }
/*    */    }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/performanceTesting/name/suggestion/NameSuggestionBenchmarkService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */