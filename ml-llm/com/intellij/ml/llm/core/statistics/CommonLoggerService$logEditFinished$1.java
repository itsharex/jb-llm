/*    */ package com.intellij.ml.llm.core.statistics;
/*    */ 
/*    */ import com.intellij.internal.statistic.eventLog.events.EventPair;
/*    */ import com.intellij.lang.Language;
/*    */ import com.intellij.ml.llm.core.statistics.llmc.LLMCommonEventFieldsKt;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
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
/*    */ final class CommonLoggerService$logEditFinished$1
/*    */   extends Lambda
/*    */   implements Function0<List<? extends EventPair<?>>>
/*    */ {
/*    */   @NotNull
/*    */   public final List<EventPair<?>> invoke() {
/* 61 */     EventPair[] arrayOfEventPair = new EventPair[1]; arrayOfEventPair[0] = LLMCommonEventFieldsKt.getRESPONSE().with(this.$suggestion); ArrayList<EventPair<?>> result = CollectionsKt.arrayListOf((Object[])arrayOfEventPair);
/* 62 */     result.addAll(CommonLoggerService.access$getTargetElementFields(CommonLoggerService.this, this.$element, this.$language));
/* 63 */     return result;
/*    */   }
/*    */   
/*    */   CommonLoggerService$logEditFinished$1(CommonLoggerService $receiver, PsiElement $element, Language $language) {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/statistics/CommonLoggerService$logEditFinished$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */