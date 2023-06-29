/*    */ package com.intellij.ml.llm.core.models.requestResponse;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\022\020\003\032\0020\0042\n\020\005\032\006\022\002\b\0030\006¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/core/models/requestResponse/LLMRequestType$Companion;", "", "()V", "byRequest", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMRequestType;", "request", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseRequest;", "intellij.ml.llm"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final LLMRequestType byRequest(@NotNull LLMBaseRequest request) {
/* 33 */     Intrinsics.checkNotNullParameter(request, "request"); LLMBaseRequest lLMBaseRequest = request; return 
/* 34 */       (lLMBaseRequest instanceof com.intellij.ml.llm.core.models.grazie.GrazieChatCompletionRequest) ? LLMRequestType.GRAZIE_COMPLETION : (
/* 35 */       (lLMBaseRequest instanceof com.intellij.ml.llm.core.models.grazie.GrazieEditRequest) ? LLMRequestType.GRAZIE_EDIT : 
/* 36 */       LLMRequestType.MOCK);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/requestResponse/LLMRequestType$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */