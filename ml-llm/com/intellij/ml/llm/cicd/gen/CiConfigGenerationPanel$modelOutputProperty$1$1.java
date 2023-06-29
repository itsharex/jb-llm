/*    */ package com.intellij.ml.llm.cicd.gen;
/*    */ 
/*    */ import com.intellij.openapi.application.ActionsKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\020\016\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "text", "", "invoke"})
/*    */ final class CiConfigGenerationPanel$modelOutputProperty$1$1
/*    */   extends Lambda
/*    */   implements Function1<String, Unit>
/*    */ {
/*    */   public final void invoke(@NotNull String text) {
/* 32 */     Intrinsics.checkNotNullParameter(text, "text"); ActionsKt.runWriteAction(new Function0<Unit>(text) { public final void invoke() {
/* 33 */             CiConfigGenerationPanel.this.getModelOutputDocument().setText(this.$text);
/* 34 */             CiConfigGenerationPanel.access$getModelOutputEditor$p(CiConfigGenerationPanel.this).setHighlighter(CiConfigGenerationPanel.access$getEditorHighlighter(CiConfigGenerationPanel.this, (String)CiConfigGenerationPanel.access$getToolchainProperty$p(CiConfigGenerationPanel.this).get()));
/*    */           } }
/*    */       );
/*    */   }
/*    */   
/*    */   CiConfigGenerationPanel$modelOutputProperty$1$1() {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/cicd/gen/CiConfigGenerationPanel$modelOutputProperty$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */