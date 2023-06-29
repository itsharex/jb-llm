/*    */ package com.intellij.ml.llm.cicd.gen;
/*    */ 
/*    */ import com.intellij.ml.llm.cicd.gen.files.CiConfigFileGenerator;
/*    */ import com.intellij.openapi.ui.DialogWrapper;
/*    */ import java.awt.event.ActionEvent;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0060\001R\0020\002J\022\020\003\032\0020\0042\b\020\005\032\004\030\0010\006H\024¨\006\007"}, d2 = {"com/intellij/ml/llm/cicd/gen/CICDGenDialog$saveAction$1", "Lcom/intellij/openapi/ui/DialogWrapper$DialogWrapperAction;", "Lcom/intellij/openapi/ui/DialogWrapper;", "doAction", "", "e", "Ljava/awt/event/ActionEvent;", "intellij.ml.llm"})
/*    */ public final class CICDGenDialog$saveAction$1
/*    */   extends DialogWrapper.DialogWrapperAction
/*    */ {
/*    */   CICDGenDialog$saveAction$1() {
/* 24 */     super($receiver, "Save");
/*    */   } protected void doAction(@Nullable ActionEvent e) {
/*    */     try {
/* 27 */       CICDGenDialog.this.saveFile(CICDGenDialog.access$getCenterPanel$p(CICDGenDialog.this).getToolchain(), CICDGenDialog.access$getCenterPanel$p(CICDGenDialog.this).getModelOutputDocument(), CICDGenDialog.access$getCenterPanel$p(CICDGenDialog.this).getProject());
/*    */     }
/* 29 */     catch (com.intellij.ml.llm.cicd.gen.files.CiConfigFileGenerator.SaveError saveError) {
/* 30 */       CiConfigGenerationDialogKt.showSaveFileFailedNotification(CICDGenDialog.this.getProject(), saveError.getMessage());
/*    */     } 
/* 32 */     CICDGenDialog.this.close(0);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/cicd/gen/CICDGenDialog$saveAction$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */