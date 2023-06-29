/*    */ package com.intellij.ml.llm.core.models.grazie;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlinx.coroutines.CoroutineScopeKt;
/*    */ import kotlinx.coroutines.Job;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */ final class GrazieChatCompletionRequest$sendSync$1
/*    */   extends Lambda
/*    */   implements Function0<Unit>
/*    */ {
/*    */   public final void invoke() {
/* 41 */     Job.DefaultImpls.cancel$default(this.$job, null, 1, null);
/* 42 */     CoroutineScopeKt.cancel$default(GrazieChatCompletionRequest.this.getScope(), null, 1, null);
/*    */   }
/*    */   
/*    */   GrazieChatCompletionRequest$sendSync$1(GrazieChatCompletionRequest $receiver) {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/grazie/GrazieChatCompletionRequest$sendSync$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */