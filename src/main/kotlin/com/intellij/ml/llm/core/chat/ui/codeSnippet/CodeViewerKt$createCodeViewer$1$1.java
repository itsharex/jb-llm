/*    */ package com.intellij.ml.llm.core.chat.ui.codeSnippet;
/*    */ 
/*    */ import com.intellij.codeInsight.daemon.impl.analysis.FileHighlightingSetting;
/*    */ import com.intellij.codeInsight.daemon.impl.analysis.HighlightingSettingsPerFile;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.psi.PsiFile;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */ final class CodeViewerKt$createCodeViewer$1$1
/*    */   extends Lambda
/*    */   implements Function0<Unit>
/*    */ {
/*    */   public final void invoke() {
/* 76 */     HighlightingSettingsPerFile settingsPerFile = HighlightingSettingsPerFile.getInstance(this.$project);
/* 77 */     if (this.$psiFile.getFirstChild() == null)
/* 78 */       return;  settingsPerFile.setHighlightingSettingForRoot(this.$psiFile.getFirstChild(), FileHighlightingSetting.ESSENTIAL);
/*    */   }
/*    */   
/*    */   CodeViewerKt$createCodeViewer$1$1(Project $project, PsiFile $psiFile) {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/codeSnippet/CodeViewerKt$createCodeViewer$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */