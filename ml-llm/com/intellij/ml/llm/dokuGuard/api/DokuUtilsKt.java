/*    */ package com.intellij.ml.llm.dokuGuard.api;
/*    */ import com.intellij.openapi.progress.ProgressIndicator;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\030\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\032\030\020\000\032\b\022\004\022\0020\0020\001*\0020\0032\006\020\004\032\0020\005\032\022\020\006\032\0020\002*\0020\0032\006\020\004\032\0020\005¨\006\007"}, d2 = {"enqueueValidatorForSingleElement", "Ljava/util/concurrent/CompletableFuture;", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecision;", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationPreferences;", "projectSection", "Lcom/intellij/ml/llm/dokuGuard/api/ProjectSection;", "runValidatorForSingleElement", "intellij.ml.llm"})
/*    */ public final class DokuUtilsKt {
/*    */   @NotNull
/*    */   public static final ValidationDecision runValidatorForSingleElement(@NotNull ValidationPreferences $this$runValidatorForSingleElement, @NotNull ProjectSection projectSection) {
/* 11 */     Intrinsics.checkNotNullParameter($this$runValidatorForSingleElement, "<this>"); Intrinsics.checkNotNullParameter(projectSection, "projectSection"); return SectionsTraverser.Companion.validateSection($this$runValidatorForSingleElement, projectSection);
/*    */   }
/*    */   @NotNull
/*    */   public static final CompletableFuture<ValidationDecision> enqueueValidatorForSingleElement(@NotNull ValidationPreferences $this$enqueueValidatorForSingleElement, @NotNull ProjectSection projectSection) {
/* 15 */     Intrinsics.checkNotNullParameter($this$enqueueValidatorForSingleElement, "<this>"); Intrinsics.checkNotNullParameter(projectSection, "projectSection"); CompletableFuture<ValidationDecision> validationCompleted = new CompletableFuture();
/* 16 */     String str = LLMBundle.message("intentions.request.background.process.title", new Object[0]); DokuUtilsKt$enqueueValidatorForSingleElement$task$1 task = new DokuUtilsKt$enqueueValidatorForSingleElement$task$1($this$enqueueValidatorForSingleElement, projectSection, validationCompleted, str);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 22 */     ProgressManager.getInstance()
/* 23 */       .runProcessWithProgressAsynchronously(task, (ProgressIndicator)new BackgroundableProcessIndicator(task));
/* 24 */     return validationCompleted;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/dokuGuard/api/DokuUtilsKt$enqueueValidatorForSingleElement$task$1", "Lcom/intellij/openapi/progress/Task$Backgroundable;", "run", "", "indicator", "Lcom/intellij/openapi/progress/ProgressIndicator;", "intellij.ml.llm"})
/*    */   public static final class DokuUtilsKt$enqueueValidatorForSingleElement$task$1 extends Task.Backgroundable {
/*    */     DokuUtilsKt$enqueueValidatorForSingleElement$task$1(ValidationPreferences $receiver, ProjectSection $projectSection, CompletableFuture<ValidationDecision> $validationCompleted, String $super_call_param$1) {
/*    */       super(null, $super_call_param$1);
/*    */     }
/*    */     
/*    */     public void run(@NotNull ProgressIndicator indicator) {
/*    */       Intrinsics.checkNotNullParameter(indicator, "indicator");
/*    */       ValidationDecision decision = DokuUtilsKt.runValidatorForSingleElement(this.$this_enqueueValidatorForSingleElement, this.$projectSection);
/*    */       this.$validationCompleted.complete(decision);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/dokuGuard/api/DokuUtilsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */