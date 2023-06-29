/*    */ package com.intellij.ml.llm.performanceTesting.name.suggestion;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\t\n\002\020\013\n\002\b\004\b\b\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\t\020\013\032\0020\003HÆ\003J\t\020\f\032\0020\005HÆ\003J\035\020\r\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\005HÖ\001J\t\020\022\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\007\020\bR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\t\020\n¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/performanceTesting/name/suggestion/NameSuggestionBenchmarkService$Location;", "", "file", "", "offset", "", "(Ljava/lang/String;I)V", "getFile", "()Ljava/lang/String;", "getOffset", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "intellij.ml.llm.performanceTesting"})
/*    */ public final class Location
/*    */ {
/*    */   @NotNull
/*    */   private final String file;
/*    */   private final int offset;
/*    */   
/*    */   public Location(@NotNull String file, int offset) {
/* 61 */     this.file = file; this.offset = offset; } @NotNull public final String getFile() { return this.file; } public final int getOffset() { return this.offset; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.file;
/*    */   }
/*    */   
/*    */   public final int component2() {
/*    */     return this.offset;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Location copy(@NotNull String file, int offset) {
/*    */     Intrinsics.checkNotNullParameter(file, "file");
/*    */     return new Location(file, offset);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Location(file=" + this.file + ", offset=" + this.offset + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.file.hashCode();
/*    */     return result * 31 + Integer.hashCode(this.offset);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Location))
/*    */       return false; 
/*    */     Location location = (Location)other;
/*    */     return !Intrinsics.areEqual(this.file, location.file) ? false : (!(this.offset != location.offset));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/performanceTesting/name/suggestion/NameSuggestionBenchmarkService$Location.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */