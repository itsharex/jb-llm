/*     */ package com.intellij.ml.llm.core.statistics;
/*     */ import com.intellij.internal.statistic.eventLog.EventLogGroup;
/*     */ import com.intellij.internal.statistic.eventLog.events.EnumEventField;
/*     */ import com.intellij.internal.statistic.eventLog.events.EventField;
/*     */ import com.intellij.internal.statistic.eventLog.events.EventFields;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\021\n\002\030\002\n\002\b\003\032E\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\f2\022\b\002\020\r\032\f\022\b\022\006\022\002\b\0030\0170\0162\022\b\002\020\020\032\f\022\b\022\006\022\002\b\0030\0170\016H\000¢\006\002\020\021\"\024\020\000\032\b\022\004\022\0020\0020\001X\004¢\006\002\n\000\"\024\020\003\032\b\022\004\022\0020\0040\001X\004¢\006\002\n\000\"\016\020\005\032\0020\006X\004¢\006\002\n\000¨\006\022"}, d2 = {"FINISH_STATE", "Lcom/intellij/internal/statistic/eventLog/events/EnumEventField;", "Lcom/intellij/ml/llm/core/statistics/FinishState;", "SCORE", "Lcom/intellij/ml/llm/core/statistics/ScoreResult;", "TIME_TO_SHOW", "Lcom/intellij/internal/statistic/eventLog/events/LongEventField;", "registerActivity", "Lcom/intellij/ml/llm/core/statistics/ScoredIdeActivityDefinition;", "group", "Lcom/intellij/internal/statistic/eventLog/EventLogGroup;", "activityName", "", "startEventAdditionalFields", "", "Lcom/intellij/internal/statistic/eventLog/events/EventField;", "finishEventAdditionalFields", "(Lcom/intellij/internal/statistic/eventLog/EventLogGroup;Ljava/lang/String;[Lcom/intellij/internal/statistic/eventLog/events/EventField;[Lcom/intellij/internal/statistic/eventLog/events/EventField;)Lcom/intellij/ml/llm/core/statistics/ScoredIdeActivityDefinition;", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nScoredIdeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScoredIdeActivity.kt\ncom/intellij/ml/llm/core/statistics/ScoredIdeActivityKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 4 EventFields.kt\ncom/intellij/internal/statistic/eventLog/events/EventFields\n*L\n1#1,105:1\n37#2,2:106\n26#3:108\n26#3:109\n144#4,2:110\n144#4,2:112\n*S KotlinDebug\n*F\n+ 1 ScoredIdeActivity.kt\ncom/intellij/ml/llm/core/statistics/ScoredIdeActivityKt\n*L\n35#1:106,2\n26#1:108\n27#1:109\n12#1:110,2\n13#1:112,2\n*E\n"})
/*     */ public final class ScoredIdeActivityKt {
/*     */   static {
/*  12 */     EventFields eventFields1 = EventFields.INSTANCE; String name$iv = "score";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 110 */     Function1 transform$iv = eventFields1.getDefaultEnumTransform(); int $i$f$Enum = 0;
/* 111 */     SCORE = new EnumEventField(name$iv, ScoreResult.class, transform$iv); EventFields $this$iv = EventFields.INSTANCE; name$iv = "state";
/* 112 */     transform$iv = $this$iv.getDefaultEnumTransform(); $i$f$Enum = 0;
/* 113 */     FINISH_STATE = new EnumEventField(name$iv, FinishState.class, transform$iv);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final EnumEventField<ScoreResult> SCORE;
/*     */   @NotNull
/*     */   private static final EnumEventField<FinishState> FINISH_STATE;
/*     */   @NotNull
/*     */   private static final LongEventField TIME_TO_SHOW = EventFields.Long("time_to_show");
/*     */   
/*     */   @NotNull
/*     */   public static final ScoredIdeActivityDefinition registerActivity(@NotNull EventLogGroup group, @NotNull String activityName, @NotNull EventField[] startEventAdditionalFields, @NotNull EventField[] finishEventAdditionalFields) {
/*     */     Intrinsics.checkNotNullParameter(group, "group");
/*     */     Intrinsics.checkNotNullParameter(activityName, "activityName");
/*     */     Intrinsics.checkNotNullParameter(startEventAdditionalFields, "startEventAdditionalFields");
/*     */     Intrinsics.checkNotNullParameter(finishEventAdditionalFields, "finishEventAdditionalFields");
/*     */     EventId2<? super Integer, ? super ScoreResult> scoreEvent = group.registerEvent(activityName + ".score", (EventField)IdeActivityDefinition.Companion.getActivityId(), (EventField)SCORE);
/*     */     EventField[] arrayOfEventField = new EventField[2];
/*     */     arrayOfEventField[0] = (EventField)TIME_TO_SHOW;
/*     */     arrayOfEventField[1] = (EventField)FINISH_STATE;
/*     */     ArrayList finished = CollectionsKt.arrayListOf((Object[])arrayOfEventField);
/*     */     CollectionsKt.addAll(finished, (Object[])finishEventAdditionalFields);
/*     */     Collection $this$toTypedArray$iv = finished;
/*     */     int $i$f$toTypedArray = 0;
/*     */     Collection thisCollection$iv = $this$toTypedArray$iv;
/*     */     return new ScoredIdeActivityDefinition(activityName, EventLogGroup.registerIdeActivity$default(group, activityName, startEventAdditionalFields, (EventField[])thisCollection$iv.toArray((Object[])new EventField[0]), null, 8, null), scoreEvent);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/statistics/ScoredIdeActivityKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */