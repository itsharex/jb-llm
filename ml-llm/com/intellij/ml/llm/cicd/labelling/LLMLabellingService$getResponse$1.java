/*    */ package com.intellij.ml.llm.cicd.labelling;
/*    */ 
/*    */ import com.intellij.ml.llm.core.models.SenderKt;
/*    */ import com.intellij.ml.llm.core.models.requestResponse.LLMBaseResponse;
/*    */ import com.intellij.ml.llm.core.models.requestResponse.LLMResponseChoice;
/*    */ import com.intellij.openapi.progress.ProgressIndicator;
/*    */ import com.intellij.openapi.progress.Task;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.text.StringsKt;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\037\n\000\n\002\030\002\n\002\020\016\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000*\001\000\b\n\030\0002\022\022\004\022\0020\002\022\b\022\0060\003j\002`\0040\001J\020\020\005\032\0020\0022\006\020\006\032\0020\007H\024¨\006\b"}, d2 = {"com/intellij/ml/llm/cicd/labelling/LLMLabellingService$getResponse$1", "Lcom/intellij/openapi/progress/Task$WithResult;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "compute", "indicator", "Lcom/intellij/openapi/progress/ProgressIndicator;", "intellij.ml.llm"})
/*    */ public final class LLMLabellingService$getResponse$1
/*    */   extends Task.WithResult<String, Exception>
/*    */ {
/*    */   LLMLabellingService$getResponse$1(Project $project, String $preparedPrompt) {
/* 41 */     super($project, "Running Model", true); } @NotNull protected String compute(@NotNull ProgressIndicator indicator) { LLMBaseResponse response;
/*    */     String output;
/* 43 */     Intrinsics.checkNotNullParameter(indicator, "indicator"); if (SenderKt.sendCompletionChatRequest$default(
/* 44 */         this.$project, 
/* 45 */         this.$preparedPrompt, 
/* 46 */         "", 
/* 47 */         Integer.valueOf(1000), null, null, null, null, null, 0, null, null, null, 8176, null) == null) { SenderKt.sendCompletionChatRequest$default(this.$project, this.$preparedPrompt, "", Integer.valueOf(1000), null, null, null, null, null, 0, null, null, null, 8176, null);
/* 48 */       return "Internal error: failed to get/parse response"; }
/*    */     
/* 50 */     if ((LLMResponseChoice)CollectionsKt.firstOrNull(response.getSuggestions()) == null || ((LLMResponseChoice)CollectionsKt.firstOrNull(response.getSuggestions())).getText() == null) { ((LLMResponseChoice)CollectionsKt.firstOrNull(response.getSuggestions())).getText();
/* 51 */       return "Internal error: failed to extract suggestions"; }
/*    */     
/* 53 */     return StringsKt.trim(StringsKt.substringAfter$default(output, this.$preparedPrompt, null, 2, null)).toString(); }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/cicd/labelling/LLMLabellingService$getResponse$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */