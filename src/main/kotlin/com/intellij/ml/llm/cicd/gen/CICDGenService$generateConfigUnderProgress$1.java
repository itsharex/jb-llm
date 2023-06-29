/*    */ package com.intellij.ml.llm.cicd.gen;
/*    */ 
/*    */ import com.intellij.openapi.progress.ProgressIndicator;
/*    */ import com.intellij.openapi.progress.Task;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\037\n\000\n\002\030\002\n\002\020\016\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000*\001\000\b\n\030\0002\022\022\004\022\0020\002\022\b\022\0060\003j\002`\0040\001J\020\020\005\032\0020\0022\006\020\006\032\0020\007H\024¨\006\b"}, d2 = {"com/intellij/ml/llm/cicd/gen/CICDGenService$generateConfigUnderProgress$1", "Lcom/intellij/openapi/progress/Task$WithResult;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "compute", "indicator", "Lcom/intellij/openapi/progress/ProgressIndicator;", "intellij.ml.llm"})
/*    */ public final class CICDGenService$generateConfigUnderProgress$1
/*    */   extends Task.WithResult<String, Exception>
/*    */ {
/*    */   CICDGenService$generateConfigUnderProgress$1(CICDGenService $receiver, String $toolchain, String $description) {
/* 33 */     super($project, "Generating config with LLM", true); } @NotNull
/*    */   protected String compute(@NotNull ProgressIndicator indicator) {
/* 35 */     Intrinsics.checkNotNullParameter(indicator, "indicator"); return CICDGenService.this.generateConfig(this.$project, this.$toolchain, this.$description);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/cicd/gen/CICDGenService$generateConfigUnderProgress$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */