/*    */ package com.intellij.ml.llm.java.actions;
/*    */ 
/*    */ import java.util.List;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020 \n\002\b\f\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B#\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0030\005\022\006\020\006\032\0020\003¢\006\002\020\007J\t\020\r\032\0020\003HÆ\003J\017\020\016\032\b\022\004\022\0020\0030\005HÆ\003J\t\020\017\032\0020\003HÆ\003J-\020\020\032\0020\0002\b\b\002\020\002\032\0020\0032\016\b\002\020\004\032\b\022\004\022\0020\0030\0052\b\b\002\020\006\032\0020\003HÆ\001J\023\020\021\032\0020\0222\b\020\023\032\004\030\0010\001HÖ\003J\t\020\024\032\0020\025HÖ\001J\t\020\026\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\027\020\004\032\b\022\004\022\0020\0030\005¢\006\b\n\000\032\004\b\n\020\013R\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\f\020\t¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/java/actions/RunRenameBenchmarkAction$Row;", "", "context", "", "names", "", "url", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getContext", "()Ljava/lang/String;", "getNames", "()Ljava/util/List;", "getUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "intellij.ml.llm.java"})
/*    */ public final class Row
/*    */ {
/*    */   @NotNull
/*    */   private final String context;
/*    */   @NotNull
/*    */   private final List<String> names;
/*    */   @NotNull
/*    */   private final String url;
/*    */   
/*    */   public Row(@NotNull String context, @NotNull List<String> names, @NotNull String url) {
/* 86 */     this.context = context; this.names = names; this.url = url; } @NotNull public final String getContext() { return this.context; } @NotNull public final List<String> getNames() { return this.names; } @NotNull public final String getUrl() { return this.url; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.context;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<String> component2() {
/*    */     return this.names;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component3() {
/*    */     return this.url;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Row copy(@NotNull String context, @NotNull List<String> names, @NotNull String url) {
/*    */     Intrinsics.checkNotNullParameter(context, "context");
/*    */     Intrinsics.checkNotNullParameter(names, "names");
/*    */     Intrinsics.checkNotNullParameter(url, "url");
/*    */     return new Row(context, names, url);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Row(context=" + this.context + ", names=" + this.names + ", url=" + this.url + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.context.hashCode();
/*    */     result = result * 31 + this.names.hashCode();
/*    */     return result * 31 + this.url.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Row))
/*    */       return false; 
/*    */     Row row = (Row)other;
/*    */     return !Intrinsics.areEqual(this.context, row.context) ? false : (!Intrinsics.areEqual(this.names, row.names) ? false : (!!Intrinsics.areEqual(this.url, row.url)));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/actions/RunRenameBenchmarkAction$Row.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */