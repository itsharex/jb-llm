/*    */ package com.intellij.ml.llm.cicd.labelling;
/*    */ 
/*    */ import com.intellij.openapi.fileEditor.FileEditorManager;
/*    */ import com.intellij.openapi.fileEditor.ex.FileEditorManagerEx;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */ final class LLMLabellingService$saveResult$2
/*    */   extends Lambda
/*    */   implements Function0<Unit>
/*    */ {
/*    */   public final void invoke() {
/*    */     VirtualFile virtualFile;
/* 78 */     if (this.$rootDir.findChild(LLMLabellingService.access$getResultsFilename$p(LLMLabellingService.this)) == null) { this.$rootDir.findChild(LLMLabellingService.access$getResultsFilename$p(LLMLabellingService.this)); return; }
/* 79 */      virtualFile.refresh(true, false);
/* 80 */     FileEditorManagerEx.Companion.getInstanceEx(this.$project).updateFilePresentation(virtualFile);
/* 81 */     FileEditorManager.getInstance(this.$project).openFile(virtualFile, true);
/*    */   }
/*    */   
/*    */   LLMLabellingService$saveResult$2(LLMLabellingService $receiver, Project $project) {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/cicd/labelling/LLMLabellingService$saveResult$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */