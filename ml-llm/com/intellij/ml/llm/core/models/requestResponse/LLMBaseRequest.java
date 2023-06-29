/*    */ package com.intellij.ml.llm.core.models.requestResponse;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\000\n\002\020\000\n\002\b\006\n\002\030\002\n\000\b&\030\000*\004\b\000\020\0012\0020\002B\r\022\006\020\003\032\0028\000¢\006\002\020\004J\n\020\b\032\004\030\0010\tH&R\023\020\003\032\0028\000¢\006\n\n\002\020\007\032\004\b\005\020\006¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseRequest;", "Body", "", "body", "(Ljava/lang/Object;)V", "getBody", "()Ljava/lang/Object;", "Ljava/lang/Object;", "sendSync", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseResponse;", "intellij.ml.llm"})
/*    */ public abstract class LLMBaseRequest<Body>
/*    */ {
/*    */   private final Body body;
/*    */   
/*    */   public LLMBaseRequest(Object body) {
/* 21 */     this.body = (Body)body; } public final Body getBody() { return this.body; }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public abstract LLMBaseResponse sendSync();
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/requestResponse/LLMBaseRequest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */