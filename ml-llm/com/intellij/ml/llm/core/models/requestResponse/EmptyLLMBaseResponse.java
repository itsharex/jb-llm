/*    */ package com.intellij.ml.llm.core.models.requestResponse;
/*    */ 
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\b\022\004\022\0020\0050\004H\026¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/core/models/requestResponse/EmptyLLMBaseResponse;", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseResponse;", "()V", "getSuggestions", "", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;", "intellij.ml.llm"})
/*    */ public final class EmptyLLMBaseResponse
/*    */   implements LLMBaseResponse
/*    */ {
/*    */   @NotNull
/*    */   public List<LLMResponseChoice> getSuggestions() {
/* 14 */     return CollectionsKt.emptyList();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final EmptyLLMBaseResponse INSTANCE = new EmptyLLMBaseResponse();
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/requestResponse/EmptyLLMBaseResponse.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */