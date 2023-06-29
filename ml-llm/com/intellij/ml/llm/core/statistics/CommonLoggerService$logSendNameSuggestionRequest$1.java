/*     */ package com.intellij.ml.llm.core.statistics;
/*     */ 
/*     */ import com.intellij.internal.statistic.eventLog.events.EventPair;
/*     */ import com.intellij.ml.llm.core.statistics.llmc.LLMCommonEventFieldsKt;
/*     */ import com.intellij.ml.llm.core.statistics.llmc.LLMEventLogger;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Lambda;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ final class CommonLoggerService$logSendNameSuggestionRequest$1
/*     */   extends Lambda
/*     */   implements Function0<List<? extends EventPair<?>>>
/*     */ {
/*     */   @NotNull
/*     */   public final List<EventPair<?>> invoke() {
/* 166 */     EventPair[] arrayOfEventPair = new EventPair[2]; arrayOfEventPair[0] = LLMCommonEventFieldsKt.getUSER_REQUEST().with(this.$originalName); arrayOfEventPair[1] = LLMEventLogger.Companion.getCONTEXT$intellij_ml_llm().with(this.$context); return CollectionsKt.listOf((Object[])arrayOfEventPair);
/*     */   }
/*     */   
/*     */   CommonLoggerService$logSendNameSuggestionRequest$1(String $originalName, String $context) {
/*     */     super(0);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/statistics/CommonLoggerService$logSendNameSuggestionRequest$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */