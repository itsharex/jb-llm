/*    */ package com.intellij.ml.llm.core.models.mock;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\002\020\016\n\002\b\004\n\002\030\002\n\000\030\0002\b\022\004\022\0020\0020\001B\r\022\006\020\003\032\0020\002¢\006\002\020\004J\020\020\005\032\0020\0022\006\020\003\032\0020\002H\002J\b\020\006\032\0020\007H\026¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/core/models/mock/MockEditRequests;", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseRequest;", "", "input", "(Ljava/lang/String;)V", "mutate", "sendSync", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseResponse;", "intellij.ml.llm"})
/*    */ public final class MockEditRequests extends LLMBaseRequest<String> {
/*  6 */   public MockEditRequests(@NotNull String input) { super(input); } @NotNull
/*    */   public LLMBaseResponse sendSync() {
/*  8 */     return new MockResponse(mutate((String)getBody()));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private final String mutate(String input) {
/* 15 */     if ((((CharSequence)input).length() == 0)) {
/* 16 */       return "";
/*    */     }
/*    */     
/* 19 */     Intrinsics.checkNotNullExpressionValue(input.toCharArray(), "this as java.lang.String).toCharArray()"); char[] array = input.toCharArray();
/* 20 */     array[0] = (char)(array[0] + 1);
/* 21 */     return ArraysKt.joinToString$default(array, "", null, null, 0, null, null, 62, null);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/mock/MockEditRequests.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */