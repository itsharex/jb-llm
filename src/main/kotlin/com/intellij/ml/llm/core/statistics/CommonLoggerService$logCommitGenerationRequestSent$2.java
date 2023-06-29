/*     */ package com.intellij.ml.llm.core.statistics;
/*     */ 
/*     */ import ai.grazie.model.llm.chat.LLMChat;
/*     */ import ai.grazie.model.llm.profile.LLMProfileID;
/*     */ import com.intellij.internal.statistic.eventLog.events.EventPair;
/*     */ import com.intellij.ml.llm.core.statistics.llmc.LLMEventLogger;
/*     */ import java.util.ArrayList;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020 \n\002\030\002\n\000\020\000\032\f\022\b\022\006\022\002\b\0030\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/internal/statistic/eventLog/events/EventPair;", "invoke"})
/*     */ final class CommonLoggerService$logCommitGenerationRequestSent$2
/*     */   extends Lambda
/*     */   implements Function0<List<? extends EventPair<?>>>
/*     */ {
/*     */   @NotNull
/*     */   public final List<EventPair<?>> invoke() {
/* 141 */     EventPair[] arrayOfEventPair = new EventPair[1]; arrayOfEventPair[0] = CommonLoggerServiceKt.getNUMBER_OF_FILES().with(Integer.valueOf(this.$numberOfFiles)); ArrayList<EventPair<?>> results = CollectionsKt.arrayListOf((Object[])arrayOfEventPair);
/* 142 */     results.addAll(LLMEventLogger.Companion.extractChatRequestParameters$intellij_ml_llm(this.$profile.getId(), this.$body));
/* 143 */     return results;
/*     */   }
/*     */   
/*     */   CommonLoggerService$logCommitGenerationRequestSent$2(int $numberOfFiles, LLMProfileID $profile, LLMChat $body) {
/*     */     super(0);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/statistics/CommonLoggerService$logCommitGenerationRequestSent$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */