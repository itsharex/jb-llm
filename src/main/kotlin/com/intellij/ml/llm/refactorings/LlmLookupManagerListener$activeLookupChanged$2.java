/*    */ package com.intellij.ml.llm.refactorings;
/*    */ 
/*    */ import com.intellij.codeInsight.lookup.LookupElement;
/*    */ import com.intellij.codeInsight.lookup.LookupEvent;
/*    */ import com.intellij.codeInsight.lookup.LookupListener;
/*    */ import com.intellij.ml.llm.core.statistics.CommonLoggerService;
/*    */ import com.intellij.ml.llm.core.statistics.CompositeStatisticsIdeActivity;
/*    */ import com.intellij.ml.llm.core.statistics.ScoreResult;
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.Job;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\031\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\004\032\0020\005H\026¨\006\007"}, d2 = {"com/intellij/ml/llm/refactorings/LlmLookupManagerListener$activeLookupChanged$2", "Lcom/intellij/codeInsight/lookup/LookupListener;", "itemSelected", "", "event", "Lcom/intellij/codeInsight/lookup/LookupEvent;", "lookupCanceled", "intellij.ml.llm"})
/*    */ public final class LlmLookupManagerListener$activeLookupChanged$2
/*    */   implements LookupListener
/*    */ {
/*    */   LlmLookupManagerListener$activeLookupChanged$2(Job $updatingLookupJob, CommonLoggerService $loggerService, CompositeStatisticsIdeActivity $statistic, Editor $editor) {}
/*    */   
/*    */   public void lookupCanceled(@NotNull LookupEvent event) {
/* 83 */     Intrinsics.checkNotNullParameter(event, "event"); Job.DefaultImpls.cancel$default(this.$updatingLookupJob, null, 1, null);
/* 84 */     this.$loggerService.logNameSuggestionFinished(this.$statistic, null);
/* 85 */     this.$statistic.scored(ScoreResult.NO);
/*    */   }
/*    */   
/*    */   public void itemSelected(@NotNull LookupEvent event) {
/* 89 */     Intrinsics.checkNotNullParameter(event, "event"); Job.DefaultImpls.cancel$default(this.$updatingLookupJob, null, 1, null);
/* 90 */     LookupElement item = event.getItem();
/* 91 */     if (item instanceof LlmLookupManagerListener.LlmLookupElement) {
/* 92 */       ((LlmLookupManagerListener.LlmLookupElement)item).handleInsert(this.$editor);
/* 93 */       this.$statistic.scored(ScoreResult.YES);
/*    */     } else {
/*    */       
/* 96 */       this.$statistic.scored(ScoreResult.NO);
/*    */     } 
/* 98 */     this.$loggerService.logNameSuggestionFinished(this.$statistic, (item != null) ? item.getLookupString() : null);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/refactorings/LlmLookupManagerListener$activeLookupChanged$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */