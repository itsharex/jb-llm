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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "Ljava/awt/event/ActionEvent;", "invoke"})
/*    */ final class null
/*    */   extends Lambda
/*    */   implements Function1<ActionEvent, Unit>
/*    */ {
/*    */   public final void invoke(@NotNull ActionEvent it) {
/* 48 */     Intrinsics.checkNotNullParameter(it, "it"); String str1 = this.$service.getResponse(LLMLabellingToolWindowPanel.access$getProject$p(LLMLabellingToolWindowPanel.this), (String)LLMLabellingToolWindowPanel.access$getModelTypeProperty$p(LLMLabellingToolWindowPanel.this).get(), (String)LLMLabellingToolWindowPanel.access$getModelPromptProperty$p(LLMLabellingToolWindowPanel.this).get()); LLMLabellingToolWindowPanel lLMLabellingToolWindowPanel = LLMLabellingToolWindowPanel.this; String str2 = str1; int $i$a$-also-LLMLabellingToolWindowPanel$mainPanel$1$4$1$1 = 0;
/* 49 */     LLMLabellingToolWindowPanel.access$getModelOutputProperty$p(lLMLabellingToolWindowPanel).set(str2);
/*    */   }
/*    */   
/*    */   null(LLMLabellingToolWindowPanel $receiver) {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/cicd/labelling/LLMLabellingToolWindowPanel$mainPanel$1$4$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */