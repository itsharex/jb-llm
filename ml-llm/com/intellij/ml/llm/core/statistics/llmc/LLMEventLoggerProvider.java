/*    */ package com.intellij.ml.llm.core.statistics.llmc;
/*    */ import com.intellij.internal.statistic.utils.StatisticsUploadAssistant;
/*    */ import com.intellij.ml.llm.core.settings.LLMSettingsManager;
/*    */ import com.intellij.util.PlatformUtils;
/*    */ import java.util.concurrent.TimeUnit;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\002\b\000\030\0002\0020\001B\005¢\006\002\020\002J\b\020\003\032\0020\004H\026J\b\020\005\032\0020\004H\026¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/core/statistics/llmc/LLMEventLoggerProvider;", "Lcom/intellij/internal/statistic/eventLog/StatisticsEventLoggerProvider;", "()V", "isRecordEnabled", "", "isSendEnabled", "intellij.ml.llm"})
/*    */ public final class LLMEventLoggerProvider extends StatisticsEventLoggerProvider {
/*    */   public LLMEventLoggerProvider() {
/* 10 */     super(
/* 11 */         "LLMC", 2, 
/* 12 */         TimeUnit.MINUTES.toMillis(5L), 
/* 13 */         10240, true, false);
/*    */   }
/*    */   public boolean isRecordEnabled() {
/* 16 */     return (!ApplicationManager.getApplication().isUnitTestMode() && 
/* 17 */       PlatformUtils.isJetBrainsProduct() && 
/* 18 */       StatisticsUploadAssistant.isCollectAllowed() && 
/* 19 */       LLMSettingsManager.Companion.getInstance().isDataSharingEnabled());
/*    */   }
/*    */   
/*    */   public boolean isSendEnabled() {
/* 23 */     return isRecordEnabled();
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/statistics/llmc/LLMEventLoggerProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */