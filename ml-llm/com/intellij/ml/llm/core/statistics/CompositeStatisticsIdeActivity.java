/*     */ package com.intellij.ml.llm.core.statistics;
/*     */ 
/*     */ import com.intellij.internal.statistic.eventLog.events.EventPair;
/*     */ import java.util.List;
/*     */ import java.util.concurrent.atomic.AtomicBoolean;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020 \n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\002\020\005JH\020\013\032\0020\f2\b\020\r\032\004\030\0010\0162\032\b\002\020\017\032\024\022\016\022\f\022\b\022\006\022\002\b\0030\0220\021\030\0010\0202\032\b\002\020\023\032\024\022\016\022\f\022\b\022\006\022\002\b\0030\0220\021\030\0010\020J\020\020\024\032\0020\f2\006\020\025\032\0020\026H\026J\b\020\027\032\0020\fH\026R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\006\020\007R\016\020\b\032\0020\tX\004¢\006\002\n\000R\024\020\004\032\0020\003X\004¢\006\b\n\000\032\004\b\n\020\007¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;", "Lcom/intellij/ml/llm/core/statistics/StatisticsIdeActivities;", "fusActivity", "Lcom/intellij/ml/llm/core/statistics/ScoredIdeActivity;", "llmcActivity", "(Lcom/intellij/ml/llm/core/statistics/ScoredIdeActivity;Lcom/intellij/ml/llm/core/statistics/ScoredIdeActivity;)V", "getFusActivity$intellij_ml_llm", "()Lcom/intellij/ml/llm/core/statistics/ScoredIdeActivity;", "isFinished", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getLlmcActivity$intellij_ml_llm", "finished", "", "state", "Lcom/intellij/ml/llm/core/statistics/FinishState;", "fusDataSupplier", "Lkotlin/Function0;", "", "Lcom/intellij/internal/statistic/eventLog/events/EventPair;", "llmDataSupplier", "scored", "result", "Lcom/intellij/ml/llm/core/statistics/ScoreResult;", "shown", "intellij.ml.llm"})
/*     */ public final class CompositeStatisticsIdeActivity
/*     */   implements StatisticsIdeActivities
/*     */ {
/*     */   @NotNull
/*     */   private final ScoredIdeActivity fusActivity;
/*     */   @NotNull
/*     */   private final ScoredIdeActivity llmcActivity;
/*     */   @NotNull
/*     */   private final AtomicBoolean isFinished;
/*     */   
/*     */   public CompositeStatisticsIdeActivity(@NotNull ScoredIdeActivity fusActivity, @NotNull ScoredIdeActivity llmcActivity) {
/* 191 */     this.fusActivity = fusActivity;
/* 192 */     this.llmcActivity = llmcActivity;
/*     */     
/* 194 */     this.isFinished = new AtomicBoolean(false);
/*     */   }
/*     */   @NotNull
/* 197 */   public final ScoredIdeActivity getFusActivity$intellij_ml_llm() { return this.fusActivity; } public void shown() { this.fusActivity.shown();
/* 198 */     this.llmcActivity.shown(); } @NotNull
/*     */   public final ScoredIdeActivity getLlmcActivity$intellij_ml_llm() {
/*     */     return this.llmcActivity;
/*     */   } public void scored(@NotNull ScoreResult result) {
/* 202 */     Intrinsics.checkNotNullParameter(result, "result"); this.fusActivity.scored(result);
/* 203 */     this.llmcActivity.scored(result);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final void finished(@Nullable FinishState state, @Nullable Function0<? extends List<? extends EventPair<?>>> fusDataSupplier, @Nullable Function0<? extends List<? extends EventPair<?>>> llmDataSupplier) {
/* 209 */     if (!this.isFinished.getAndSet(true)) {
/* 210 */       this.fusActivity.finished(state, fusDataSupplier);
/* 211 */       this.llmcActivity.finished(state, llmDataSupplier);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */