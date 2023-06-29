/*    */ package com.intellij.ml.llm.core.chat.session;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\t\n\002\b\020\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B#\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007¢\006\002\020\bJ\t\020\023\032\0020\003HÆ\003J\t\020\024\032\0020\005HÆ\003J\t\020\025\032\0020\007HÆ\003J'\020\026\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\007HÆ\001J\023\020\027\032\0020\0302\b\020\031\032\004\030\0010\001HÖ\003J\t\020\032\032\0020\033HÖ\001J\t\020\034\032\0020\003HÖ\001R\032\020\004\032\0020\005X\016¢\006\016\n\000\032\004\b\t\020\n\"\004\b\013\020\fR\032\020\006\032\0020\007X\016¢\006\016\n\000\032\004\b\r\020\016\"\004\b\017\020\020R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\021\020\022¨\006\035"}, d2 = {"Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$ChatStatisticInformation;", "", "uid", "", "sourceActionType", "Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$SourceAction;", "timestamp", "", "(Ljava/lang/String;Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$SourceAction;J)V", "getSourceActionType", "()Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$SourceAction;", "setSourceActionType", "(Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$SourceAction;)V", "getTimestamp", "()J", "setTimestamp", "(J)V", "getUid", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "intellij.ml.llm"})
/*    */ public final class ChatStatisticInformation {
/*    */   @NotNull
/*    */   private final String uid;
/*    */   @NotNull
/*    */   private ChatSessionStorage.SourceAction sourceActionType;
/*    */   private long timestamp;
/*    */   
/*    */   @NotNull
/*    */   public final String getUid() {
/*    */     return this.uid;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ChatSessionStorage.SourceAction getSourceActionType() {
/*    */     return this.sourceActionType;
/*    */   }
/*    */   
/*    */   public final void setSourceActionType(@NotNull ChatSessionStorage.SourceAction <set-?>) {
/*    */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*    */     this.sourceActionType = <set-?>;
/*    */   }
/*    */   
/*    */   public ChatStatisticInformation(@NotNull String uid, @NotNull ChatSessionStorage.SourceAction sourceActionType, long timestamp)
/*    */   {
/* 34 */     this.uid = uid;
/* 35 */     this.sourceActionType = sourceActionType;
/* 36 */     this.timestamp = timestamp; } public final long getTimestamp() { return this.timestamp; } public final void setTimestamp(long <set-?>) { this.timestamp = <set-?>; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.uid;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ChatSessionStorage.SourceAction component2() {
/*    */     return this.sourceActionType;
/*    */   }
/*    */   
/*    */   public final long component3() {
/*    */     return this.timestamp;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ChatStatisticInformation copy(@NotNull String uid, @NotNull ChatSessionStorage.SourceAction sourceActionType, long timestamp) {
/*    */     Intrinsics.checkNotNullParameter(uid, "uid");
/*    */     Intrinsics.checkNotNullParameter(sourceActionType, "sourceActionType");
/*    */     return new ChatStatisticInformation(uid, sourceActionType, timestamp);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ChatStatisticInformation(uid=" + this.uid + ", sourceActionType=" + this.sourceActionType + ", timestamp=" + this.timestamp + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.uid.hashCode();
/*    */     result = result * 31 + this.sourceActionType.hashCode();
/*    */     return result * 31 + Long.hashCode(this.timestamp);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ChatStatisticInformation))
/*    */       return false; 
/*    */     ChatStatisticInformation chatStatisticInformation = (ChatStatisticInformation)other;
/*    */     return !Intrinsics.areEqual(this.uid, chatStatisticInformation.uid) ? false : ((this.sourceActionType != chatStatisticInformation.sourceActionType) ? false : (!(this.timestamp != chatStatisticInformation.timestamp)));
/*    */   }
/*    */   
/*    */   public ChatStatisticInformation() {
/*    */     this(null, null, 0L, 7, null);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/session/ChatSessionStorage$ChatStatisticInformation.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */