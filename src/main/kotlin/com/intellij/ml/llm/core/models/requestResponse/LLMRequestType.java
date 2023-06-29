/*    */ package com.intellij.ml.llm.core.models.requestResponse;
/*    */ 
/*    */ import com.intellij.ml.llm.LLMBundle;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\020\n\000\n\002\020\016\n\002\b\t\b\001\030\000 \0132\b\022\004\022\0020\0000\001:\001\013B\017\b\002\022\006\020\002\032\0020\003¢\006\002\020\004R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006j\002\b\007j\002\b\bj\002\b\tj\002\b\n¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/core/models/requestResponse/LLMRequestType;", "", "displayName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "GRAZIE_COMPLETION", "GRAZIE_EDIT", "MOCK", "GRAZIE_REFACTORING", "Companion", "intellij.ml.llm"})
/*    */ public enum LLMRequestType
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion;
/*    */   @NotNull
/*    */   private final String displayName;
/*    */   
/*    */   LLMRequestType(String displayName) {
/*    */     this.displayName = displayName;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getDisplayName() {
/*    */     return this.displayName;
/*    */   }
/*    */   
/* 26 */   GRAZIE_COMPLETION(LLMBundle.message("request.grazie.completion", new Object[0])),
/* 27 */   GRAZIE_EDIT(LLMBundle.message("request.grazie.edit", new Object[0])),
/* 28 */   MOCK("mock"),
/* 29 */   GRAZIE_REFACTORING(LLMBundle.message("request.grazie.refactoring", new Object[0])); static { Companion = new Companion(null); }
/*    */    @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\022\020\003\032\0020\0042\n\020\005\032\006\022\002\b\0030\006¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/core/models/requestResponse/LLMRequestType$Companion;", "", "()V", "byRequest", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMRequestType;", "request", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseRequest;", "intellij.ml.llm"})
/*    */   public static final class Companion { @NotNull
/*    */     public final LLMRequestType byRequest(@NotNull LLMBaseRequest request) {
/* 33 */       Intrinsics.checkNotNullParameter(request, "request"); LLMBaseRequest lLMBaseRequest = request; return 
/* 34 */         (lLMBaseRequest instanceof com.intellij.ml.llm.core.models.grazie.GrazieChatCompletionRequest) ? LLMRequestType.GRAZIE_COMPLETION : (
/* 35 */         (lLMBaseRequest instanceof com.intellij.ml.llm.core.models.grazie.GrazieEditRequest) ? LLMRequestType.GRAZIE_EDIT : 
/* 36 */         LLMRequestType.MOCK);
/*    */     }
/*    */     
/*    */     private Companion() {} }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/requestResponse/LLMRequestType.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */