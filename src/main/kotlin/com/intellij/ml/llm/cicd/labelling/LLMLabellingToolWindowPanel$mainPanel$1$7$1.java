/*    */ package com.intellij.ml.llm.cicd.labelling;
/*    */ 
/*    */ import java.awt.event.ActionEvent;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "Ljava/awt/event/ActionEvent;", "invoke"})
/*    */ final class null
/*    */   extends Lambda
/*    */   implements Function1<ActionEvent, Unit>
/*    */ {
/*    */   public final void invoke(@NotNull ActionEvent it) {
/* 67 */     Intrinsics.checkNotNullParameter(it, "it"); this.$service.saveResult(
/* 68 */         LLMLabellingToolWindowPanel.access$getProject$p(LLMLabellingToolWindowPanel.this), 
/* 69 */         (String)LLMLabellingToolWindowPanel.access$getModelTypeProperty$p(LLMLabellingToolWindowPanel.this).get(), 
/* 70 */         (String)LLMLabellingToolWindowPanel.access$getModelPromptProperty$p(LLMLabellingToolWindowPanel.this).get(), 
/* 71 */         (String)LLMLabellingToolWindowPanel.access$getModelOutputProperty$p(LLMLabellingToolWindowPanel.this).get(), 
/* 72 */         (String)LLMLabellingToolWindowPanel.access$getCommentProperty$p(LLMLabellingToolWindowPanel.this).get());
/*    */   }
/*    */   
/*    */   null(LLMLabellingToolWindowPanel $receiver) {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/cicd/labelling/LLMLabellingToolWindowPanel$mainPanel$1$7$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */