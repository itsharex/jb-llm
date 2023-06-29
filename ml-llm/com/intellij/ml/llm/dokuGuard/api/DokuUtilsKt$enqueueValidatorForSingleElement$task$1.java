/*    */ package com.intellij.ml.llm.dokuGuard.api;
/*    */ 
/*    */ import com.intellij.openapi.progress.ProgressIndicator;
/*    */ import com.intellij.openapi.progress.Task;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/dokuGuard/api/DokuUtilsKt$enqueueValidatorForSingleElement$task$1", "Lcom/intellij/openapi/progress/Task$Backgroundable;", "run", "", "indicator", "Lcom/intellij/openapi/progress/ProgressIndicator;", "intellij.ml.llm"})
/*    */ public final class DokuUtilsKt$enqueueValidatorForSingleElement$task$1
/*    */   extends Task.Backgroundable
/*    */ {
/*    */   DokuUtilsKt$enqueueValidatorForSingleElement$task$1(ValidationPreferences $receiver, ProjectSection $projectSection, CompletableFuture<ValidationDecision> $validationCompleted, String $super_call_param$1) {
/* 16 */     super(null, $super_call_param$1);
/*    */   } public void run(@NotNull ProgressIndicator indicator) {
/* 18 */     Intrinsics.checkNotNullParameter(indicator, "indicator"); ValidationDecision decision = DokuUtilsKt.runValidatorForSingleElement(this.$this_enqueueValidatorForSingleElement, this.$projectSection);
/* 19 */     this.$validationCompleted.complete(decision);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/dokuGuard/api/DokuUtilsKt$enqueueValidatorForSingleElement$task$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */