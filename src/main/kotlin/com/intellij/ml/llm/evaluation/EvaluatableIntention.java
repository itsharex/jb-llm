/*    */ package com.intellij.ml.llm.evaluation;
/*    */ 
/*    */ import com.intellij.openapi.project.Project;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\002\bf\030\0002\0020\001J\030\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H&J\036\020\f\032\b\022\004\022\0020\0160\r2\006\020\017\032\0020\0202\006\020\021\032\0020\022H&J*\020\023\032\0020\0072\006\020\b\032\0020\t2\030\020\024\032\024\022\004\022\0020\t\022\004\022\0020\013\022\004\022\0020\0070\025H\026J0\020\023\032\0020\0072\006\020\b\032\0020\t2\036\020\026\032\032\022\026\022\024\022\004\022\0020\t\022\004\022\0020\013\022\004\022\0020\0070\0250\rH&R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005ø\001\000\002\006\n\004\b!0\001¨\006\027À\006\001"}, d2 = {"Lcom/intellij/ml/llm/evaluation/EvaluatableIntention;", "", "featureName", "", "getFeatureName", "()Ljava/lang/String;", "applyLLMSuggestion", "", "callContext", "Lcom/intellij/ml/llm/evaluation/IntentionCallContext;", "completedLLMRequest", "Lcom/intellij/ml/llm/evaluation/CompletedLLMRequest;", "gatherRandomApplicationLocations", "", "Lcom/intellij/ml/llm/evaluation/CallLocation;", "project", "Lcom/intellij/openapi/project/Project;", "n", "", "getLLMSuggestion", "callback", "Lkotlin/Function2;", "callbacks", "intellij.ml.llm"})
/*    */ public interface EvaluatableIntention
/*    */ {
/*    */   @NotNull
/*    */   String getFeatureName();
/*    */   
/*    */   @NotNull
/*    */   List<CallLocation> gatherRandomApplicationLocations(@NotNull Project paramProject, int paramInt);
/*    */   
/*    */   void getLLMSuggestion(@NotNull IntentionCallContext paramIntentionCallContext, @NotNull List<? extends Function2<? super IntentionCallContext, ? super CompletedLLMRequest, Unit>> paramList);
/*    */   
/*    */   default void getLLMSuggestion(@NotNull IntentionCallContext callContext, @NotNull Function2 callback) {
/* 29 */     Intrinsics.checkNotNullParameter(callContext, "callContext"); Intrinsics.checkNotNullParameter(callback, "callback"); getLLMSuggestion(
/* 30 */         callContext, CollectionsKt.listOf(callback));
/*    */   }
/*    */   
/*    */   void applyLLMSuggestion(@NotNull IntentionCallContext paramIntentionCallContext, @NotNull CompletedLLMRequest paramCompletedLLMRequest);
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/evaluation/EvaluatableIntention.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */