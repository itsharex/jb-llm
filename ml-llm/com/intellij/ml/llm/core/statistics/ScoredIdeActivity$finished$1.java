/*     */ package com.intellij.ml.llm.core.statistics;
/*     */ 
/*     */ import com.intellij.internal.statistic.eventLog.events.EventPair;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020 \n\002\030\002\n\000\020\000\032\f\022\b\022\006\022\002\b\0030\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/internal/statistic/eventLog/events/EventPair;", "invoke"})
/*     */ @SourceDebugExtension({"SMAP\nScoredIdeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScoredIdeActivity.kt\ncom/intellij/ml/llm/core/statistics/ScoredIdeActivity$finished$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
/*     */ final class ScoredIdeActivity$finished$1
/*     */   extends Lambda
/*     */   implements Function0<List<? extends EventPair<?>>>
/*     */ {
/*     */   @NotNull
/*     */   public final List<EventPair<?>> invoke() {
/*  84 */     ArrayList<EventPair> result = new ArrayList();
/*  85 */     if (ScoredIdeActivity.access$getTimeToShow$p(ScoredIdeActivity.this) > 0L) {
/*  86 */       result.add(ScoredIdeActivityKt.access$getTIME_TO_SHOW$p().with(Long.valueOf(ScoredIdeActivity.access$getTimeToShow$p(ScoredIdeActivity.this))));
/*     */     }
/*  88 */     if (this.$state != null) { FinishState finishState1 = this.$state, finishState2 = this.$state, it = finishState1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 106 */       int $i$a$-let-ScoredIdeActivity$finished$1$1 = 0;
/*     */       result.add(ScoredIdeActivityKt.access$getFINISH_STATE$p().with(finishState2)); }
/*     */     else
/*     */     {  }
/*     */     
/*     */     if (this.$dataSupplier != null) {
/*     */       Function0<List<EventPair<?>>> it = this.$dataSupplier;
/*     */       int $i$a$-let-ScoredIdeActivity$finished$1$2 = 0;
/*     */       result.addAll((Collection<? extends EventPair>)it.invoke());
/*     */     } else {
/*     */     
/*     */     } 
/*     */     return (List)result;
/*     */   }
/*     */   
/*     */   ScoredIdeActivity$finished$1(FinishState $state, Function0<List<EventPair<?>>> $dataSupplier) {
/*     */     super(0);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/statistics/ScoredIdeActivity$finished$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */