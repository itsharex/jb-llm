/*    */ package com.intellij.ml.llm.cicd.labelling;
/*    */ 
/*    */ import com.intellij.ui.dsl.builder.Row;
/*    */ import com.intellij.util.ui.JBFont;
/*    */ import java.awt.Font;
/*    */ import javax.swing.JLabel;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/ui/dsl/builder/Row;", "invoke"})
/*    */ final class null
/*    */   extends Lambda
/*    */   implements Function1<Row, Unit>
/*    */ {
/*    */   public static final null INSTANCE = (null)new Object();
/*    */   
/*    */   public final void invoke(@NotNull Row $this$row) {
/* 29 */     Intrinsics.checkNotNullParameter($this$row, "$this$row"); JLabel jLabel1 = new JLabel(), $this$invoke_u24lambda_u240 = jLabel1; int $i$a$-apply-LLMLabellingToolWindowPanel$mainPanel$1$1$1 = 0;
/* 30 */     $this$invoke_u24lambda_u240.setText("LLM Labelling");
/* 31 */     $this$invoke_u24lambda_u240.setFont((Font)JBFont.h2().asBold());
/*    */   }
/*    */   
/*    */   null() {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/cicd/labelling/LLMLabellingToolWindowPanel$mainPanel$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */