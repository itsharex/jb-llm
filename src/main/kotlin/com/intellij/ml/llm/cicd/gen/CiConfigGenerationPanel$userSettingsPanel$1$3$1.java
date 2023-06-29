/*    */ package com.intellij.ml.llm.cicd.gen;
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
/* 80 */     Intrinsics.checkNotNullParameter(it, "it"); String result = CiConfigGenerationPanel.access$getService$p(CiConfigGenerationPanel.this).generateConfigUnderProgress(
/* 81 */         CiConfigGenerationPanel.this.getProject(), 
/* 82 */         (String)CiConfigGenerationPanel.access$getToolchainProperty$p(CiConfigGenerationPanel.this).get(), 
/* 83 */         (String)CiConfigGenerationPanel.access$getDescriptionProperty$p(CiConfigGenerationPanel.this).get());
/*    */     
/* 85 */     CiConfigGenerationPanel.access$getModelOutputProperty$p(CiConfigGenerationPanel.this).set(result);
/*    */   }
/*    */   
/*    */   null() {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/cicd/gen/CiConfigGenerationPanel$userSettingsPanel$1$3$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */