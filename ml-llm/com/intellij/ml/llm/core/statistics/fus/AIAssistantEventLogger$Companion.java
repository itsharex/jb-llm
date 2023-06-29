/*    */ package com.intellij.ml.llm.core.statistics.fus;
/*    */ 
/*    */ import com.intellij.internal.statistic.eventLog.events.VarargEventId;
/*    */ import com.intellij.ml.llm.core.statistics.ScoredIdeActivityDefinition;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\017\n\002\030\002\n\002\b\t\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006R\024\020\007\032\0020\bX\004¢\006\b\n\000\032\004\b\t\020\nR\024\020\013\032\0020\004X\004¢\006\b\n\000\032\004\b\f\020\006R\024\020\r\032\0020\bX\004¢\006\b\n\000\032\004\b\016\020\nR\024\020\017\032\0020\004X\004¢\006\b\n\000\032\004\b\020\020\006R\024\020\021\032\0020\bX\004¢\006\b\n\000\032\004\b\022\020\nR\024\020\023\032\0020\004X\004¢\006\b\n\000\032\004\b\024\020\006R\024\020\025\032\0020\bX\004¢\006\b\n\000\032\004\b\026\020\nR\016\020\027\032\0020\030X\004¢\006\002\n\000R\024\020\031\032\0020\004X\004¢\006\b\n\000\032\004\b\032\020\006R\024\020\033\032\0020\bX\004¢\006\b\n\000\032\004\b\034\020\nR\024\020\035\032\0020\bX\004¢\006\b\n\000\032\004\b\036\020\nR\024\020\037\032\0020\bX\004¢\006\b\n\000\032\004\b \020\n¨\006!"}, d2 = {"Lcom/intellij/ml/llm/core/statistics/fus/AIAssistantEventLogger$Companion;", "", "()V", "COMMIT_GENERATION", "Lcom/intellij/ml/llm/core/statistics/ScoredIdeActivityDefinition;", "getCOMMIT_GENERATION$intellij_ml_llm", "()Lcom/intellij/ml/llm/core/statistics/ScoredIdeActivityDefinition;", "COMMIT_GENERATION_SENT", "Lcom/intellij/internal/statistic/eventLog/events/VarargEventId;", "getCOMMIT_GENERATION_SENT$intellij_ml_llm", "()Lcom/intellij/internal/statistic/eventLog/events/VarargEventId;", "COMPLETION_ACTION_ACTIVITY", "getCOMPLETION_ACTION_ACTIVITY$intellij_ml_llm", "COMPLETION_REQUEST_SENT", "getCOMPLETION_REQUEST_SENT$intellij_ml_llm", "DOCUMENTATION_GENERATION", "getDOCUMENTATION_GENERATION$intellij_ml_llm", "DOCUMENTATION_GENERATION_SENT", "getDOCUMENTATION_GENERATION_SENT$intellij_ml_llm", "EDIT_ACTION_ACTIVITY", "getEDIT_ACTION_ACTIVITY$intellij_ml_llm", "EDIT_REQUEST_SENT", "getEDIT_REQUEST_SENT$intellij_ml_llm", "GROUP", "Lcom/intellij/internal/statistic/eventLog/EventLogGroup;", "NAME_SUGGESTIONS_ACTIVITY", "getNAME_SUGGESTIONS_ACTIVITY$intellij_ml_llm", "NAME_SUGGESTIONS_REQUEST", "getNAME_SUGGESTIONS_REQUEST$intellij_ml_llm", "NAME_SUGGESTIONS_RESPONSE", "getNAME_SUGGESTIONS_RESPONSE$intellij_ml_llm", "NAME_SUGGESTIONS_SHOW", "getNAME_SUGGESTIONS_SHOW$intellij_ml_llm", "intellij.ml.llm"})
/*    */ public final class Companion {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final ScoredIdeActivityDefinition getEDIT_ACTION_ACTIVITY$intellij_ml_llm() {
/* 15 */     return AIAssistantEventLogger.access$getEDIT_ACTION_ACTIVITY$cp();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final VarargEventId getEDIT_REQUEST_SENT$intellij_ml_llm() {
/* 20 */     return AIAssistantEventLogger.access$getEDIT_REQUEST_SENT$cp();
/*    */   }
/*    */   
/*    */   @NotNull
/* 24 */   public final ScoredIdeActivityDefinition getCOMPLETION_ACTION_ACTIVITY$intellij_ml_llm() { return AIAssistantEventLogger.access$getCOMPLETION_ACTION_ACTIVITY$cp(); } @NotNull
/* 25 */   public final VarargEventId getCOMPLETION_REQUEST_SENT$intellij_ml_llm() { return AIAssistantEventLogger.access$getCOMPLETION_REQUEST_SENT$cp(); } @NotNull
/*    */   public final ScoredIdeActivityDefinition getDOCUMENTATION_GENERATION$intellij_ml_llm() {
/* 27 */     return AIAssistantEventLogger.access$getDOCUMENTATION_GENERATION$cp();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final VarargEventId getDOCUMENTATION_GENERATION_SENT$intellij_ml_llm() {
/* 32 */     return AIAssistantEventLogger.access$getDOCUMENTATION_GENERATION_SENT$cp();
/*    */   }
/*    */   @NotNull
/*    */   public final ScoredIdeActivityDefinition getCOMMIT_GENERATION$intellij_ml_llm() {
/* 36 */     return AIAssistantEventLogger.access$getCOMMIT_GENERATION$cp();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final VarargEventId getCOMMIT_GENERATION_SENT$intellij_ml_llm() {
/* 41 */     return AIAssistantEventLogger.access$getCOMMIT_GENERATION_SENT$cp();
/*    */   }
/*    */   
/*    */   @NotNull
/* 45 */   public final ScoredIdeActivityDefinition getNAME_SUGGESTIONS_ACTIVITY$intellij_ml_llm() { return AIAssistantEventLogger.access$getNAME_SUGGESTIONS_ACTIVITY$cp(); } @NotNull
/* 46 */   public final VarargEventId getNAME_SUGGESTIONS_REQUEST$intellij_ml_llm() { return AIAssistantEventLogger.access$getNAME_SUGGESTIONS_REQUEST$cp(); } @NotNull
/* 47 */   public final VarargEventId getNAME_SUGGESTIONS_RESPONSE$intellij_ml_llm() { return AIAssistantEventLogger.access$getNAME_SUGGESTIONS_RESPONSE$cp(); }
/*    */    @NotNull
/*    */   public final VarargEventId getNAME_SUGGESTIONS_SHOW$intellij_ml_llm() {
/* 50 */     return AIAssistantEventLogger.access$getNAME_SUGGESTIONS_SHOW$cp();
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/statistics/fus/AIAssistantEventLogger$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */