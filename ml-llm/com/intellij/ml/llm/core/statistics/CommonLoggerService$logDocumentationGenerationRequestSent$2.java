/*     */ package com.intellij.ml.llm.core.statistics;
/*     */ 
/*     */ import com.intellij.internal.statistic.eventLog.events.EventPair;
/*     */ import com.intellij.lang.Language;
/*     */ import com.intellij.ml.llm.core.statistics.llmc.LLMEventLogger;
/*     */ import com.intellij.psi.PsiElement;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020 \n\002\030\002\n\000\020\000\032\f\022\b\022\006\022\002\b\0030\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/internal/statistic/eventLog/events/EventPair;", "invoke"})
/*     */ final class CommonLoggerService$logDocumentationGenerationRequestSent$2
/*     */   extends Lambda
/*     */   implements Function0<List<? extends EventPair<?>>>
/*     */ {
/*     */   @NotNull
/*     */   public final List<EventPair<?>> invoke() {
/* 107 */     Object object = this.$body; CommonLoggerService commonLoggerService = CommonLoggerService.this; PsiElement psiElement = this.$element; Language language = this.$language; List list1 = CollectionsKt.createListBuilder(), $this$invoke_u24lambda_u240 = list1; int $i$a$-buildList-CommonLoggerService$logDocumentationGenerationRequestSent$2$1 = 0;
/* 108 */     $this$invoke_u24lambda_u240.addAll(LLMEventLogger.Companion.extractChatRequestParameters$intellij_ml_llm(null, object));
/* 109 */     $this$invoke_u24lambda_u240.addAll(CommonLoggerService.access$getTargetElementFields(commonLoggerService, psiElement, language));
/*     */     return CollectionsKt.build(list1);
/*     */   }
/*     */   
/*     */   CommonLoggerService$logDocumentationGenerationRequestSent$2(CommonLoggerService $receiver, PsiElement $element, Language $language) {
/*     */     super(0);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/statistics/CommonLoggerService$logDocumentationGenerationRequestSent$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */