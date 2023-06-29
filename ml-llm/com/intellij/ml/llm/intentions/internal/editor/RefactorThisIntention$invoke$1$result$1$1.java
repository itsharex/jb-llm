/*    */ package com.intellij.ml.llm.intentions.internal.editor;
/*    */ 
/*    */ import com.intellij.ml.llm.core.models.SenderKt;
/*    */ import com.intellij.ml.llm.core.models.requestResponse.LLMBaseResponse;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.Ref;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\004\030\0010\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseResponse;", "invoke"})
/*    */ final class null
/*    */   extends Lambda
/*    */   implements Function0<LLMBaseResponse>
/*    */ {
/*    */   @Nullable
/*    */   public final LLMBaseResponse invoke() {
/* 65 */     return SenderKt.sendEditRequest$default(this.$project, (String)this.$selectedText.element, "Refactor this code", null, null, null, null, 120, null);
/*    */   }
/*    */   
/*    */   null(Project $project, Ref.ObjectRef<String> $selectedText) {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/internal/editor/RefactorThisIntention$invoke$1$result$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */