/*   */ package com.intellij.ml.llm.core.chat.session;
/*   */ 
/*   */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\t\n\002\b\013\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\t\020\r\032\0020\003HÆ\003J\t\020\016\032\0020\005HÆ\003J\035\020\017\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\020\032\0020\0212\b\020\022\032\004\030\0010\001HÖ\003J\t\020\023\032\0020\024HÖ\001J\t\020\025\032\0020\026HÖ\001R\032\020\004\032\0020\005X\016¢\006\016\n\000\032\004\b\007\020\b\"\004\b\t\020\nR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\013\020\f¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/core/chat/session/StatisticData;", "", "sourceAction", "Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$SourceAction;", "lastTimestamp", "", "(Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$SourceAction;J)V", "getLastTimestamp", "()J", "setLastTimestamp", "(J)V", "getSourceAction", "()Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$SourceAction;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "intellij.ml.llm"})
/*   */ public final class StatisticData {
/*   */   @NotNull
/*   */   private final ChatSessionStorage.SourceAction sourceAction;
/*   */   
/* 8 */   public StatisticData(@NotNull ChatSessionStorage.SourceAction sourceAction, long lastTimestamp) { this.sourceAction = sourceAction; this.lastTimestamp = lastTimestamp; } private long lastTimestamp; @NotNull public final ChatSessionStorage.SourceAction getSourceAction() { return this.sourceAction; } public final long getLastTimestamp() { return this.lastTimestamp; } public final void setLastTimestamp(long <set-?>) { this.lastTimestamp = <set-?>; }
/*   */ 
/*   */   
/*   */   @NotNull
/*   */   public final ChatSessionStorage.SourceAction component1() {
/*   */     return this.sourceAction;
/*   */   }
/*   */   
/*   */   public final long component2() {
/*   */     return this.lastTimestamp;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final StatisticData copy(@NotNull ChatSessionStorage.SourceAction sourceAction, long lastTimestamp) {
/*   */     Intrinsics.checkNotNullParameter(sourceAction, "sourceAction");
/*   */     return new StatisticData(sourceAction, lastTimestamp);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public String toString() {
/*   */     return "StatisticData(sourceAction=" + this.sourceAction + ", lastTimestamp=" + this.lastTimestamp + ")";
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     result = this.sourceAction.hashCode();
/*   */     return result * 31 + Long.hashCode(this.lastTimestamp);
/*   */   }
/*   */   
/*   */   public boolean equals(@Nullable Object other) {
/*   */     if (this == other)
/*   */       return true; 
/*   */     if (!(other instanceof StatisticData))
/*   */       return false; 
/*   */     StatisticData statisticData = (StatisticData)other;
/*   */     return (this.sourceAction != statisticData.sourceAction) ? false : (!(this.lastTimestamp != statisticData.lastTimestamp));
/*   */   }
/*   */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/session/StatisticData.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */