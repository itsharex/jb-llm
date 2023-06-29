/*     */ package com.intellij.ml.llm.core.statistics;
/*     */ 
/*     */ import com.intellij.internal.statistic.StructuredIdeActivity;
/*     */ import com.intellij.internal.statistic.eventLog.events.EventId2;
/*     */ import com.intellij.internal.statistic.eventLog.events.EventPair;
/*     */ import com.intellij.internal.statistic.eventLog.events.VarargEventId;
/*     */ import com.intellij.util.TimeoutUtil;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\b\n\002\030\002\n\002\b\002\n\002\020\t\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020 \n\002\030\002\n\002\b\005\n\002\030\002\n\000\030\0002\0020\001B!\022\006\020\002\032\0020\003\022\022\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0070\005¢\006\002\020\bJ,\020\013\032\0020\f2\b\020\r\032\004\030\0010\0162\032\b\002\020\017\032\024\022\016\022\f\022\b\022\006\022\002\b\0030\0220\021\030\0010\020J\020\020\023\032\0020\f2\006\020\024\032\0020\007H\026J\b\020\025\032\0020\fH\026J*\020\026\032\0020\f2\006\020\027\032\0020\0302\032\b\002\020\017\032\024\022\016\022\f\022\b\022\006\022\002\b\0030\0220\021\030\0010\020R\016\020\002\032\0020\003X\004¢\006\002\n\000R\032\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0070\005X\004¢\006\002\n\000R\016\020\t\032\0020\nX\016¢\006\002\n\000¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/core/statistics/ScoredIdeActivity;", "Lcom/intellij/ml/llm/core/statistics/StatisticsIdeActivities;", "activity", "Lcom/intellij/internal/statistic/StructuredIdeActivity;", "scoreEvent", "Lcom/intellij/internal/statistic/eventLog/events/EventId2;", "", "Lcom/intellij/ml/llm/core/statistics/ScoreResult;", "(Lcom/intellij/internal/statistic/StructuredIdeActivity;Lcom/intellij/internal/statistic/eventLog/events/EventId2;)V", "timeToShow", "", "finished", "", "state", "Lcom/intellij/ml/llm/core/statistics/FinishState;", "dataSupplier", "Lkotlin/Function0;", "", "Lcom/intellij/internal/statistic/eventLog/events/EventPair;", "scored", "result", "shown", "stageStarted", "stage", "Lcom/intellij/internal/statistic/eventLog/events/VarargEventId;", "intellij.ml.llm"})
/*     */ public final class ScoredIdeActivity
/*     */   implements StatisticsIdeActivities
/*     */ {
/*     */   @NotNull
/*     */   private final StructuredIdeActivity activity;
/*     */   @NotNull
/*     */   private final EventId2<Integer, ScoreResult> scoreEvent;
/*     */   private long timeToShow;
/*     */   
/*     */   public ScoredIdeActivity(@NotNull StructuredIdeActivity activity, @NotNull EventId2<Integer, ScoreResult> scoreEvent) {
/*  73 */     this.activity = activity;
/*  74 */     this.scoreEvent = scoreEvent;
/*     */   }
/*     */ 
/*     */   
/*     */   public final void stageStarted(@NotNull VarargEventId stage, @Nullable Function0 dataSupplier) {
/*  79 */     Intrinsics.checkNotNullParameter(stage, "stage"); this.activity.stageStarted(stage, dataSupplier);
/*     */   }
/*     */   
/*     */   public final void finished(@Nullable FinishState state, @Nullable Function0<? extends List<? extends EventPair<?>>> dataSupplier) {
/*  83 */     this.activity.finished(new ScoredIdeActivity$finished$1(state, dataSupplier)); } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020 \n\002\030\002\n\000\020\000\032\f\022\b\022\006\022\002\b\0030\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/internal/statistic/eventLog/events/EventPair;", "invoke"}) @SourceDebugExtension({"SMAP\nScoredIdeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScoredIdeActivity.kt\ncom/intellij/ml/llm/core/statistics/ScoredIdeActivity$finished$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"}) static final class ScoredIdeActivity$finished$1 extends Lambda implements Function0<List<? extends EventPair<?>>> { @NotNull
/*  84 */     public final List<EventPair<?>> invoke() { ArrayList<EventPair> result = new ArrayList();
/*  85 */       if (ScoredIdeActivity.this.timeToShow > 0L) {
/*  86 */         result.add(ScoredIdeActivityKt.access$getTIME_TO_SHOW$p().with(Long.valueOf(ScoredIdeActivity.this.timeToShow)));
/*     */       }
/*  88 */       if (this.$state != null) { FinishState finishState1 = this.$state, finishState2 = this.$state, it = finishState1;
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
/* 106 */         int $i$a$-let-ScoredIdeActivity$finished$1$1 = 0;
/*     */         result.add(ScoredIdeActivityKt.access$getFINISH_STATE$p().with(finishState2)); }
/*     */       else
/*     */       {  }
/*     */       
/*     */       if (this.$dataSupplier != null) {
/*     */         Function0<List<EventPair<?>>> it = this.$dataSupplier;
/*     */         int $i$a$-let-ScoredIdeActivity$finished$1$2 = 0;
/*     */         result.addAll((Collection<? extends EventPair>)it.invoke());
/*     */       } else {
/*     */       
/*     */       } 
/*     */       return (List)result; }
/*     */ 
/*     */     
/*     */     ScoredIdeActivity$finished$1(FinishState $state, Function0<List<EventPair<?>>> $dataSupplier) {
/*     */       super(0);
/*     */     } }
/*     */ 
/*     */   
/*     */   public void shown() {
/*     */     if (this.timeToShow == 0L)
/*     */       this.timeToShow = TimeoutUtil.getDurationMillis(this.activity.getStartedTimestamp()); 
/*     */   }
/*     */   
/*     */   public void scored(@NotNull ScoreResult result) {
/*     */     Intrinsics.checkNotNullParameter(result, "result");
/*     */     this.scoreEvent.log(Integer.valueOf(this.activity.getId()), result);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/statistics/ScoredIdeActivity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */