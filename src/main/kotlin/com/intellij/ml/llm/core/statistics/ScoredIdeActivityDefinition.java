/*    */ package com.intellij.ml.llm.core.statistics;
/*    */ 
/*    */ import com.intellij.internal.statistic.IdeActivityDefinition;
/*    */ import com.intellij.internal.statistic.StructuredIdeActivity;
/*    */ import com.intellij.internal.statistic.eventLog.EventLogGroup;
/*    */ import com.intellij.internal.statistic.eventLog.events.EventField;
/*    */ import com.intellij.internal.statistic.eventLog.events.EventId2;
/*    */ import com.intellij.internal.statistic.eventLog.events.EventPair;
/*    */ import com.intellij.internal.statistic.eventLog.events.VarargEventId;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmOverloads;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.jvm.internal.SpreadBuilder;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000Z\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\b\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\021\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020 \n\002\030\002\n\000\030\0002\0020\001B)\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\022\020\006\032\016\022\004\022\0020\b\022\004\022\0020\t0\007¢\006\002\020\nJ1\020\013\032\0020\f2\006\020\r\032\0020\0162\006\020\017\032\0020\0032\022\b\002\020\020\032\f\022\b\022\006\022\002\b\0030\0220\021H\007¢\006\002\020\023J,\020\024\032\0020\0252\b\020\026\032\004\030\0010\0272\032\b\002\020\030\032\024\022\016\022\f\022\b\022\006\022\002\b\0030\0330\032\030\0010\031R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\002\032\0020\003X\004¢\006\002\n\000R\032\020\006\032\016\022\004\022\0020\b\022\004\022\0020\t0\007X\004¢\006\002\n\000¨\006\034"}, d2 = {"Lcom/intellij/ml/llm/core/statistics/ScoredIdeActivityDefinition;", "", "name", "", "definition", "Lcom/intellij/internal/statistic/IdeActivityDefinition;", "scoreEvent", "Lcom/intellij/internal/statistic/eventLog/events/EventId2;", "", "Lcom/intellij/ml/llm/core/statistics/ScoreResult;", "(Ljava/lang/String;Lcom/intellij/internal/statistic/IdeActivityDefinition;Lcom/intellij/internal/statistic/eventLog/events/EventId2;)V", "registerStage", "Lcom/intellij/internal/statistic/eventLog/events/VarargEventId;", "group", "Lcom/intellij/internal/statistic/eventLog/EventLogGroup;", "stageName", "additionalFields", "", "Lcom/intellij/internal/statistic/eventLog/events/EventField;", "(Lcom/intellij/internal/statistic/eventLog/EventLogGroup;Ljava/lang/String;[Lcom/intellij/internal/statistic/eventLog/events/EventField;)Lcom/intellij/internal/statistic/eventLog/events/VarargEventId;", "started", "Lcom/intellij/ml/llm/core/statistics/ScoredIdeActivity;", "project", "Lcom/intellij/openapi/project/Project;", "dataSupplier", "Lkotlin/Function0;", "", "Lcom/intellij/internal/statistic/eventLog/events/EventPair;", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nScoredIdeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScoredIdeActivity.kt\ncom/intellij/ml/llm/core/statistics/ScoredIdeActivityDefinition\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,105:1\n26#2:106\n*S KotlinDebug\n*F\n+ 1 ScoredIdeActivity.kt\ncom/intellij/ml/llm/core/statistics/ScoredIdeActivityDefinition\n*L\n51#1:106\n*E\n"})
/*    */ public final class ScoredIdeActivityDefinition
/*    */ {
/*    */   @NotNull
/*    */   private final String name;
/*    */   @NotNull
/*    */   private final IdeActivityDefinition definition;
/*    */   @NotNull
/*    */   private final EventId2<Integer, ScoreResult> scoreEvent;
/*    */   
/*    */   public ScoredIdeActivityDefinition(@NotNull String name, @NotNull IdeActivityDefinition definition, @NotNull EventId2<Integer, ScoreResult> scoreEvent) {
/* 42 */     this.name = name;
/* 43 */     this.definition = definition;
/* 44 */     this.scoreEvent = scoreEvent;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @JvmOverloads
/*    */   @NotNull
/*    */   public final VarargEventId registerStage(@NotNull EventLogGroup group, @NotNull String stageName, @NotNull EventField[] additionalFields) {
/* 53 */     Intrinsics.checkNotNullParameter(group, "group"); Intrinsics.checkNotNullParameter(stageName, "stageName"); Intrinsics.checkNotNullParameter(additionalFields, "additionalFields");
/*    */     
/* 55 */     SpreadBuilder spreadBuilder = new SpreadBuilder(2); spreadBuilder.add(IdeActivityDefinition.Companion.getActivityId()); spreadBuilder.addSpread(
/* 56 */         additionalFields);
/*    */     return group.registerVarargEvent(this.name + "." + this.name, (EventField[])spreadBuilder.toArray((Object[])new EventField[spreadBuilder.size()]));
/*    */   }
/*    */   @NotNull
/*    */   public final ScoredIdeActivity started(@Nullable Project project, @Nullable Function0 dataSupplier) {
/* 61 */     StructuredIdeActivity ideActivity = this.definition.started(project, dataSupplier);
/* 62 */     return new ScoredIdeActivity(ideActivity, this.scoreEvent);
/*    */   }
/*    */   
/*    */   @JvmOverloads
/*    */   @NotNull
/*    */   public final VarargEventId registerStage(@NotNull EventLogGroup group, @NotNull String stageName) {
/*    */     Intrinsics.checkNotNullParameter(group, "group");
/*    */     Intrinsics.checkNotNullParameter(stageName, "stageName");
/*    */     return registerStage$default(this, group, stageName, null, 4, null);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/statistics/ScoredIdeActivityDefinition.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */