/*    */ package com.intellij.ml.llm.performanceTesting.name.suggestion;
/*    */ 
/*    */ import java.util.Collection;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\t\n\002\b\002\n\002\020\036\n\002\b\025\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B/\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\n\b\002\020\006\032\004\030\0010\005\022\f\020\007\032\b\022\004\022\0020\0030\b¢\006\002\020\tJ\t\020\027\032\0020\003HÆ\003J\t\020\030\032\0020\005HÆ\003J\020\020\031\032\004\030\0010\005HÆ\003¢\006\002\020\013J\017\020\032\032\b\022\004\022\0020\0030\bHÆ\003J>\020\033\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\0052\016\b\002\020\007\032\b\022\004\022\0020\0030\bHÆ\001¢\006\002\020\034J\023\020\035\032\0020\0362\b\020\037\032\004\030\0010\001HÖ\003J\t\020 \032\0020!HÖ\001J\t\020\"\032\0020\003HÖ\001R\036\020\006\032\004\030\0010\005X\016¢\006\020\n\002\020\016\032\004\b\n\020\013\"\004\b\f\020\rR \020\007\032\b\022\004\022\0020\0030\bX\016¢\006\016\n\000\032\004\b\017\020\020\"\004\b\021\020\022R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\023\020\024R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\025\020\026¨\006#"}, d2 = {"Lcom/intellij/ml/llm/performanceTesting/name/suggestion/NameSuggestionBenchmarkService$Session;", "", "originalName", "", "startTime", "", "endTime", "names", "", "(Ljava/lang/String;JLjava/lang/Long;Ljava/util/Collection;)V", "getEndTime", "()Ljava/lang/Long;", "setEndTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getNames", "()Ljava/util/Collection;", "setNames", "(Ljava/util/Collection;)V", "getOriginalName", "()Ljava/lang/String;", "getStartTime", "()J", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;JLjava/lang/Long;Ljava/util/Collection;)Lcom/intellij/ml/llm/performanceTesting/name/suggestion/NameSuggestionBenchmarkService$Session;", "equals", "", "other", "hashCode", "", "toString", "intellij.ml.llm.performanceTesting"})
/*    */ public final class Session
/*    */ {
/*    */   @NotNull
/*    */   private final String originalName;
/*    */   private final long startTime;
/*    */   @Nullable
/*    */   private Long endTime;
/*    */   @NotNull
/*    */   private Collection<String> names;
/*    */   
/*    */   public Session(@NotNull String originalName, long startTime, @Nullable Long endTime, @NotNull Collection<String> names) {
/* 63 */     this.originalName = originalName; this.startTime = startTime; this.endTime = endTime; this.names = names; } @NotNull public final String getOriginalName() { return this.originalName; } public final long getStartTime() { return this.startTime; } @Nullable public final Long getEndTime() { return this.endTime; } public final void setEndTime(@Nullable Long <set-?>) { this.endTime = <set-?>; } @NotNull public final Collection<String> getNames() { return this.names; } public final void setNames(@NotNull Collection<String> <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.names = <set-?>; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.originalName;
/*    */   }
/*    */   
/*    */   public final long component2() {
/*    */     return this.startTime;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Long component3() {
/*    */     return this.endTime;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Collection<String> component4() {
/*    */     return this.names;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Session copy(@NotNull String originalName, long startTime, @Nullable Long endTime, @NotNull Collection<String> names) {
/*    */     Intrinsics.checkNotNullParameter(originalName, "originalName");
/*    */     Intrinsics.checkNotNullParameter(names, "names");
/*    */     return new Session(originalName, startTime, endTime, names);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Session(originalName=" + this.originalName + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", names=" + this.names + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.originalName.hashCode();
/*    */     result = result * 31 + Long.hashCode(this.startTime);
/*    */     result = result * 31 + ((this.endTime == null) ? 0 : this.endTime.hashCode());
/*    */     return result * 31 + this.names.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Session))
/*    */       return false; 
/*    */     Session session = (Session)other;
/*    */     return !Intrinsics.areEqual(this.originalName, session.originalName) ? false : ((this.startTime != session.startTime) ? false : (!Intrinsics.areEqual(this.endTime, session.endTime) ? false : (!!Intrinsics.areEqual(this.names, session.names))));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/performanceTesting/name/suggestion/NameSuggestionBenchmarkService$Session.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */