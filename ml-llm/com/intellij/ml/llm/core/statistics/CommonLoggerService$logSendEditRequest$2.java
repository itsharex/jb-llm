/*    */ package com.intellij.ml.llm.core.statistics;
/*    */ 
/*    */ import ai.grazie.model.llm.profile.OpenAIProfileIDs;
/*    */ import com.intellij.internal.statistic.eventLog.events.EventPair;
/*    */ import com.intellij.lang.Language;
/*    */ import com.intellij.ml.llm.core.statistics.llmc.LLMEventLogger;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020 \n\002\030\002\n\000\020\000\032\f\022\b\022\006\022\002\b\0030\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/internal/statistic/eventLog/events/EventPair;", "invoke"})
/*    */ final class CommonLoggerService$logSendEditRequest$2
/*    */   extends Lambda
/*    */   implements Function0<List<? extends EventPair<?>>>
/*    */ {
/*    */   @NotNull
/*    */   public final List<EventPair<?>> invoke() {
/* 50 */     ArrayList<EventPair<?>> result = CommonLoggerService.access$getTargetElementFields(CommonLoggerService.this, this.$element, this.$language);
/* 51 */     result.addAll(LLMEventLogger.Companion.extractChatRequestParameters$intellij_ml_llm(OpenAIProfileIDs.INSTANCE.getChatGPT().getId(), this.$body));
/* 52 */     return result;
/*    */   }
/*    */   
/*    */   CommonLoggerService$logSendEditRequest$2(PsiElement $element, Language $language, Object $body) {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/statistics/CommonLoggerService$logSendEditRequest$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */