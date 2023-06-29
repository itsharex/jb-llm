/*    */ package com.intellij.ml.llm.core.statistics.fus;
/*    */ 
/*    */ import com.intellij.internal.statistic.eventLog.events.EventField;
/*    */ import com.intellij.internal.statistic.eventLog.events.VarargEventId;
/*    */ import com.intellij.ml.llm.core.statistics.ScoredIdeActivityDefinition;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\030\000 \0052\0020\001:\001\005B\005¢\006\002\020\002J\b\020\003\032\0020\004H\026¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/core/statistics/fus/AIAssistantEventLogger;", "Lcom/intellij/internal/statistic/service/fus/collectors/CounterUsagesCollector;", "()V", "getGroup", "Lcom/intellij/internal/statistic/eventLog/EventLogGroup;", "Companion", "intellij.ml.llm"})
/*    */ public final class AIAssistantEventLogger extends CounterUsagesCollector {
/*    */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\017\n\002\030\002\n\002\b\t\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006R\024\020\007\032\0020\bX\004¢\006\b\n\000\032\004\b\t\020\nR\024\020\013\032\0020\004X\004¢\006\b\n\000\032\004\b\f\020\006R\024\020\r\032\0020\bX\004¢\006\b\n\000\032\004\b\016\020\nR\024\020\017\032\0020\004X\004¢\006\b\n\000\032\004\b\020\020\006R\024\020\021\032\0020\bX\004¢\006\b\n\000\032\004\b\022\020\nR\024\020\023\032\0020\004X\004¢\006\b\n\000\032\004\b\024\020\006R\024\020\025\032\0020\bX\004¢\006\b\n\000\032\004\b\026\020\nR\016\020\027\032\0020\030X\004¢\006\002\n\000R\024\020\031\032\0020\004X\004¢\006\b\n\000\032\004\b\032\020\006R\024\020\033\032\0020\bX\004¢\006\b\n\000\032\004\b\034\020\nR\024\020\035\032\0020\bX\004¢\006\b\n\000\032\004\b\036\020\nR\024\020\037\032\0020\bX\004¢\006\b\n\000\032\004\b \020\n¨\006!"}, d2 = {"Lcom/intellij/ml/llm/core/statistics/fus/AIAssistantEventLogger$Companion;", "", "()V", "COMMIT_GENERATION", "Lcom/intellij/ml/llm/core/statistics/ScoredIdeActivityDefinition;", "getCOMMIT_GENERATION$intellij_ml_llm", "()Lcom/intellij/ml/llm/core/statistics/ScoredIdeActivityDefinition;", "COMMIT_GENERATION_SENT", "Lcom/intellij/internal/statistic/eventLog/events/VarargEventId;", "getCOMMIT_GENERATION_SENT$intellij_ml_llm", "()Lcom/intellij/internal/statistic/eventLog/events/VarargEventId;", "COMPLETION_ACTION_ACTIVITY", "getCOMPLETION_ACTION_ACTIVITY$intellij_ml_llm", "COMPLETION_REQUEST_SENT", "getCOMPLETION_REQUEST_SENT$intellij_ml_llm", "DOCUMENTATION_GENERATION", "getDOCUMENTATION_GENERATION$intellij_ml_llm", "DOCUMENTATION_GENERATION_SENT", "getDOCUMENTATION_GENERATION_SENT$intellij_ml_llm", "EDIT_ACTION_ACTIVITY", "getEDIT_ACTION_ACTIVITY$intellij_ml_llm", "EDIT_REQUEST_SENT", "getEDIT_REQUEST_SENT$intellij_ml_llm", "GROUP", "Lcom/intellij/internal/statistic/eventLog/EventLogGroup;", "NAME_SUGGESTIONS_ACTIVITY", "getNAME_SUGGESTIONS_ACTIVITY$intellij_ml_llm", "NAME_SUGGESTIONS_REQUEST", "getNAME_SUGGESTIONS_REQUEST$intellij_ml_llm", "NAME_SUGGESTIONS_RESPONSE", "getNAME_SUGGESTIONS_RESPONSE$intellij_ml_llm", "NAME_SUGGESTIONS_SHOW", "getNAME_SUGGESTIONS_SHOW$intellij_ml_llm", "intellij.ml.llm"})
/*    */   public static final class Companion { private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final ScoredIdeActivityDefinition getEDIT_ACTION_ACTIVITY$intellij_ml_llm() {
/* 15 */       return AIAssistantEventLogger.EDIT_ACTION_ACTIVITY;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final VarargEventId getEDIT_REQUEST_SENT$intellij_ml_llm() {
/* 20 */       return AIAssistantEventLogger.EDIT_REQUEST_SENT;
/*    */     }
/*    */     
/*    */     @NotNull
/* 24 */     public final ScoredIdeActivityDefinition getCOMPLETION_ACTION_ACTIVITY$intellij_ml_llm() { return AIAssistantEventLogger.COMPLETION_ACTION_ACTIVITY; } @NotNull
/* 25 */     public final VarargEventId getCOMPLETION_REQUEST_SENT$intellij_ml_llm() { return AIAssistantEventLogger.COMPLETION_REQUEST_SENT; } @NotNull
/*    */     public final ScoredIdeActivityDefinition getDOCUMENTATION_GENERATION$intellij_ml_llm() {
/* 27 */       return AIAssistantEventLogger.DOCUMENTATION_GENERATION;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final VarargEventId getDOCUMENTATION_GENERATION_SENT$intellij_ml_llm() {
/* 32 */       return AIAssistantEventLogger.DOCUMENTATION_GENERATION_SENT;
/*    */     }
/*    */     @NotNull
/*    */     public final ScoredIdeActivityDefinition getCOMMIT_GENERATION$intellij_ml_llm() {
/* 36 */       return AIAssistantEventLogger.COMMIT_GENERATION;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final VarargEventId getCOMMIT_GENERATION_SENT$intellij_ml_llm() {
/* 41 */       return AIAssistantEventLogger.COMMIT_GENERATION_SENT;
/*    */     }
/*    */     
/*    */     @NotNull
/* 45 */     public final ScoredIdeActivityDefinition getNAME_SUGGESTIONS_ACTIVITY$intellij_ml_llm() { return AIAssistantEventLogger.NAME_SUGGESTIONS_ACTIVITY; } @NotNull
/* 46 */     public final VarargEventId getNAME_SUGGESTIONS_REQUEST$intellij_ml_llm() { return AIAssistantEventLogger.NAME_SUGGESTIONS_REQUEST; } @NotNull
/* 47 */     public final VarargEventId getNAME_SUGGESTIONS_RESPONSE$intellij_ml_llm() { return AIAssistantEventLogger.NAME_SUGGESTIONS_RESPONSE; }
/*    */     
/*    */     @NotNull
/* 50 */     public final VarargEventId getNAME_SUGGESTIONS_SHOW$intellij_ml_llm() { return AIAssistantEventLogger.NAME_SUGGESTIONS_SHOW; } } @NotNull public static final Companion Companion = new Companion(null); @NotNull private static final EventLogGroup GROUP = new EventLogGroup("llm.action.events", 4, "FUS"); @NotNull private static final ScoredIdeActivityDefinition EDIT_ACTION_ACTIVITY; @NotNull private static final VarargEventId EDIT_REQUEST_SENT; @NotNull private static final VarargEventId NAME_SUGGESTIONS_SHOW = ScoredIdeActivityDefinition.registerStage$default(NAME_SUGGESTIONS_ACTIVITY, GROUP, "show", null, 4, null);
/*    */   static { EventField[] arrayOfEventField = new EventField[2]; arrayOfEventField[0] = (EventField)CommonLoggerServiceKt.getTARGET_ELEMENT(); arrayOfEventField[1] = (EventField)EventFields.Language; arrayOfEventField = new EventField[2]; arrayOfEventField[0] = (EventField)CommonLoggerServiceKt.getTARGET_ELEMENT(); arrayOfEventField[1] = (EventField)EventFields.Language; EDIT_ACTION_ACTIVITY = ScoredIdeActivityKt.registerActivity(GROUP, "edit.request", arrayOfEventField, arrayOfEventField); arrayOfEventField = new EventField[2]; arrayOfEventField[0] = (EventField)CommonLoggerServiceKt.getTARGET_ELEMENT(); arrayOfEventField[1] = (EventField)EventFields.Language; EDIT_REQUEST_SENT = EDIT_ACTION_ACTIVITY.registerStage(GROUP, "sent", arrayOfEventField); }
/*    */   @NotNull private static final ScoredIdeActivityDefinition COMPLETION_ACTION_ACTIVITY = ScoredIdeActivityKt.registerActivity$default(GROUP, "completion.request", null, null, 12, null); @NotNull private static final VarargEventId COMPLETION_REQUEST_SENT = ScoredIdeActivityDefinition.registerStage$default(COMPLETION_ACTION_ACTIVITY, GROUP, "sent", null, 4, null); @NotNull private static final ScoredIdeActivityDefinition DOCUMENTATION_GENERATION; @NotNull private static final VarargEventId DOCUMENTATION_GENERATION_SENT; @NotNull private static final ScoredIdeActivityDefinition COMMIT_GENERATION; @NotNull private static final VarargEventId COMMIT_GENERATION_SENT; static { arrayOfEventField = new EventField[2]; arrayOfEventField[0] = (EventField)CommonLoggerServiceKt.getTARGET_ELEMENT(); arrayOfEventField[1] = (EventField)EventFields.Language; arrayOfEventField = new EventField[2]; arrayOfEventField[0] = (EventField)CommonLoggerServiceKt.getTARGET_ELEMENT(); arrayOfEventField[1] = (EventField)EventFields.Language; DOCUMENTATION_GENERATION = ScoredIdeActivityKt.registerActivity(GROUP, "documentation.generation", arrayOfEventField, arrayOfEventField); arrayOfEventField = new EventField[2]; arrayOfEventField[0] = (EventField)CommonLoggerServiceKt.getTARGET_ELEMENT(); arrayOfEventField[1] = (EventField)EventFields.Language; DOCUMENTATION_GENERATION_SENT = DOCUMENTATION_GENERATION.registerStage(GROUP, "sent", arrayOfEventField); arrayOfEventField = new EventField[1]; arrayOfEventField[0] = (EventField)CommonLoggerServiceKt.getNUMBER_OF_FILES(); arrayOfEventField = new EventField[1]; arrayOfEventField[0] = (EventField)CommonLoggerServiceKt.getNUMBER_OF_FILES(); COMMIT_GENERATION = ScoredIdeActivityKt.registerActivity(GROUP, "commit.generation", arrayOfEventField, arrayOfEventField); arrayOfEventField = new EventField[1]; arrayOfEventField[0] = (EventField)CommonLoggerServiceKt.getNUMBER_OF_FILES();
/* 53 */     COMMIT_GENERATION_SENT = COMMIT_GENERATION.registerStage(GROUP, "sent", arrayOfEventField); } @NotNull public EventLogGroup getGroup() { return GROUP; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   private static final ScoredIdeActivityDefinition NAME_SUGGESTIONS_ACTIVITY = ScoredIdeActivityKt.registerActivity$default(GROUP, "name.suggestion", null, null, 12, null);
/*    */   @NotNull
/*    */   private static final VarargEventId NAME_SUGGESTIONS_REQUEST = ScoredIdeActivityDefinition.registerStage$default(NAME_SUGGESTIONS_ACTIVITY, GROUP, "request", null, 4, null);
/*    */   @NotNull
/*    */   private static final VarargEventId NAME_SUGGESTIONS_RESPONSE;
/*    */   
/*    */   static {
/*    */     arrayOfEventField = new EventField[1];
/*    */     arrayOfEventField[0] = (EventField)EventFields.DurationMs;
/*    */     NAME_SUGGESTIONS_RESPONSE = NAME_SUGGESTIONS_ACTIVITY.registerStage(GROUP, "response", arrayOfEventField);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/statistics/fus/AIAssistantEventLogger.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */