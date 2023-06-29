/*    */ package com.intellij.ml.llm.kotlin.editor;
/*    */ 
/*    */ import com.intellij.ml.llm.evaluation.CallLocation;
/*    */ import com.intellij.ml.llm.evaluation.CompletedLLMRequest;
/*    */ import com.intellij.ml.llm.evaluation.IntentionCallContext;
/*    */ import java.io.File;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.io.FilesKt;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H\n¢\006\002\b\006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/intellij/ml/llm/evaluation/IntentionCallContext;", "completedLLMRequest", "Lcom/intellij/ml/llm/evaluation/CompletedLLMRequest;", "invoke"})
/*    */ final class EvaluateFeatureAction$evaluateFeature$1$1
/*    */   extends Lambda
/*    */   implements Function2<IntentionCallContext, CompletedLLMRequest, Unit>
/*    */ {
/*    */   public final void invoke(@NotNull IntentionCallContext paramIntentionCallContext, @NotNull CompletedLLMRequest completedLLMRequest) {
/* 27 */     Intrinsics.checkNotNullParameter(paramIntentionCallContext, "<anonymous parameter 0>"); Intrinsics.checkNotNullParameter(completedLLMRequest, "completedLLMRequest"); File outputFile = FilesKt.resolve(this.$storageFolder, "" + this.$index + ".json");
/* 28 */     FilesKt.writeText$default(outputFile, 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 33 */         StringsKt.trimIndent("\n          { \n            \"suggestion\": \"" + completedLLMRequest.getSuggestion() + "\",\n            \"location\": \"" + this.$location.toJson() + "\"\n          }\n         "), null, 2, null);
/*    */   }
/*    */   
/*    */   EvaluateFeatureAction$evaluateFeature$1$1(File $storageFolder, int $index, CallLocation $location) {
/*    */     super(2);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/editor/EvaluateFeatureAction$evaluateFeature$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */