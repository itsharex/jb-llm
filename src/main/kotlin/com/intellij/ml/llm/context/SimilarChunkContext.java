/*    */ package com.intellij.ml.llm.context;
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\020\016\n\002\b\017\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\004\b\b\030\0002\0020\001B-\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\016\020\007\032\n\022\004\022\0020\006\030\0010\005¢\006\002\020\bJ\032\020\016\032\0020\0062\006\020\017\032\0020\0062\b\020\020\032\004\030\0010\006H\002J\t\020\021\032\0020\003HÆ\003J\021\020\022\032\n\022\004\022\0020\006\030\0010\005HÆ\003J\021\020\023\032\n\022\004\022\0020\006\030\0010\005HÆ\003J7\020\024\032\0020\0002\b\b\002\020\002\032\0020\0032\020\b\002\020\004\032\n\022\004\022\0020\006\030\0010\0052\020\b\002\020\007\032\n\022\004\022\0020\006\030\0010\005HÆ\001J\023\020\025\032\0020\0262\b\020\027\032\004\030\0010\030HÖ\003J\t\020\031\032\0020\032HÖ\001J\b\020\033\032\0020\006H\026J\b\020\034\032\0020\006H\026J\t\020\035\032\0020\006HÖ\001R\031\020\007\032\n\022\004\022\0020\006\030\0010\005¢\006\b\n\000\032\004\b\t\020\nR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\013\020\fR\031\020\004\032\n\022\004\022\0020\006\030\0010\005¢\006\b\n\000\032\004\b\r\020\n¨\006\036"}, d2 = {"Lcom/intellij/ml/llm/context/SimilarChunkContext;", "Lcom/intellij/ml/llm/context/LLMQueryContext;", "language", "Lcom/intellij/lang/Language;", "paths", "", "", "chunks", "(Lcom/intellij/lang/Language;Ljava/util/List;Ljava/util/List;)V", "getChunks", "()Ljava/util/List;", "getLanguage", "()Lcom/intellij/lang/Language;", "getPaths", "commentCode", "code", "commentSymbol", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toJson", "toQuery", "toString", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nSimilarChunksContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimilarChunksContext.kt\ncom/intellij/ml/llm/context/SimilarChunkContext\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,44:1\n766#2:45\n857#2,2:46\n1855#2,2:48\n*S KotlinDebug\n*F\n+ 1 SimilarChunksContext.kt\ncom/intellij/ml/llm/context/SimilarChunkContext\n*L\n17#1:45\n17#1:46,2\n20#1:48,2\n*E\n"})
/*    */ public final class SimilarChunkContext implements LLMQueryContext {
/*    */   @NotNull
/*    */   private final Language language;
/*    */   
/*  8 */   public SimilarChunkContext(@NotNull Language language, @Nullable List<String> paths, @Nullable List<String> chunks) { this.language = language;
/*  9 */     this.paths = paths;
/* 10 */     this.chunks = chunks; } @Nullable private final List<String> paths; @Nullable private final List<String> chunks; @NotNull public final Language getLanguage() { return this.language; } @Nullable public final List<String> getPaths() { return this.paths; } @Nullable public final List<String> getChunks() { return this.chunks; }
/*    */   
/*    */   @NotNull
/*    */   public String toQuery() {
/* 14 */     Commenter commenter = (Commenter)LanguageCommenters.INSTANCE.forLanguage(this.language);
/* 15 */     String commentPrefix = (commenter != null) ? commenter.getLineCommentPrefix() : null;
/* 16 */     if (this.paths == null || this.chunks == null) return ""; 
/* 17 */     Iterable $this$filter$iv = CollectionsKt.zip(this.paths, this.chunks); int $i$f$filter = 0;
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
/* 45 */     Iterable iterable1 = $this$filter$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 46 */     for (Object element$iv$iv : iterable1) { Pair pair = (Pair)element$iv$iv; int $i$a$-filter-SimilarChunkContext$toQuery$filteredPairs$1 = 0; String chunk = (String)pair.component2(); }
/* 47 */      List filteredPairs = (List)destination$iv$iv; StringBuilder queryBuilder = new StringBuilder(); Iterable $this$forEach$iv = filteredPairs; int $i$f$forEach = 0;
/* 48 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); Pair pair = (Pair)element$iv; int $i$a$-forEach-SimilarChunkContext$toQuery$1 = 0;
/*    */       String path = (String)pair.component1(), chunk = (String)pair.component2();
/*    */       String commentedCode = commentCode(chunk, commentPrefix);
/*    */       queryBuilder.append(commentPrefix + " Compare this snippet from " + commentPrefix + ":\n");
/*    */       queryBuilder.append(commentedCode);
/*    */       queryBuilder.append("\n"); }
/*    */     
/*    */     Intrinsics.checkNotNullExpressionValue(queryBuilder.toString(), "queryBuilder.toString()");
/*    */     return StringsKt.trim(queryBuilder.toString()).toString();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toJson() {
/*    */     Gson gson = (new GsonBuilder()).setPrettyPrinting().create();
/*    */     Pair[] arrayOfPair = new Pair[2];
/*    */     arrayOfPair[0] = TuplesKt.to("paths", this.paths);
/*    */     arrayOfPair[1] = TuplesKt.to("chunks", this.chunks);
/*    */     Intrinsics.checkNotNullExpressionValue(gson.toJson(MapsKt.mapOf(arrayOfPair)), "gson.toJson(mapOf(\"paths…ths, \"chunks\" to chunks))");
/*    */     return gson.toJson(MapsKt.mapOf(arrayOfPair));
/*    */   }
/*    */   
/*    */   private final String commentCode(String code, String commentSymbol) {
/*    */     if (commentSymbol == null)
/*    */       return code; 
/*    */     String[] arrayOfString = new String[1];
/*    */     arrayOfString[0] = "\n";
/*    */     return CollectionsKt.joinToString$default(StringsKt.split$default(code, arrayOfString, false, 0, 6, null), "\n", null, null, 0, null, new SimilarChunkContext$commentCode$1(commentSymbol), 30, null);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Language component1() {
/*    */     return this.language;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final List<String> component2() {
/*    */     return this.paths;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final List<String> component3() {
/*    */     return this.chunks;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SimilarChunkContext copy(@NotNull Language language, @Nullable List<String> paths, @Nullable List<String> chunks) {
/*    */     Intrinsics.checkNotNullParameter(language, "language");
/*    */     return new SimilarChunkContext(language, paths, chunks);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "SimilarChunkContext(language=" + this.language + ", paths=" + this.paths + ", chunks=" + this.chunks + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.language.hashCode();
/*    */     result = result * 31 + ((this.paths == null) ? 0 : this.paths.hashCode());
/*    */     return result * 31 + ((this.chunks == null) ? 0 : this.chunks.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof SimilarChunkContext))
/*    */       return false; 
/*    */     SimilarChunkContext similarChunkContext = (SimilarChunkContext)other;
/*    */     return !Intrinsics.areEqual(this.language, similarChunkContext.language) ? false : (!Intrinsics.areEqual(this.paths, similarChunkContext.paths) ? false : (!!Intrinsics.areEqual(this.chunks, similarChunkContext.chunks)));
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\r\n\000\n\002\020\016\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "", "invoke"})
/*    */   static final class SimilarChunkContext$commentCode$1 extends Lambda implements Function1<String, CharSequence> {
/*    */     SimilarChunkContext$commentCode$1(String $commentSymbol) {
/*    */       super(1);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final CharSequence invoke(@NotNull String it) {
/*    */       Intrinsics.checkNotNullParameter(it, "it");
/*    */       return this.$commentSymbol + " " + this.$commentSymbol;
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/context/SimilarChunkContext.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */