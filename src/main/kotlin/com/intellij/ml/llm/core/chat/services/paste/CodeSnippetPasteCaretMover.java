/*     */ package com.intellij.ml.llm.core.chat.services.paste;
/*     */ 
/*     */ import com.intellij.codeInsight.editorActions.DefaultTypingActionsExtension;
/*     */ import com.intellij.openapi.editor.Caret;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\b\000\030\0002\0020\001B\005¢\006\002\020\002J\030\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\bH\026J\030\020\t\032\0020\n2\006\020\005\032\0020\0062\006\020\007\032\0020\bH\026¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/core/chat/services/paste/CodeSnippetPasteCaretMover;", "Lcom/intellij/codeInsight/editorActions/DefaultTypingActionsExtension;", "()V", "endPaste", "", "project", "Lcom/intellij/openapi/project/Project;", "editor", "Lcom/intellij/openapi/editor/Editor;", "isSuitableContext", "", "intellij.ml.llm"})
/*     */ public final class CodeSnippetPasteCaretMover
/*     */   extends DefaultTypingActionsExtension
/*     */ {
/*     */   public boolean isSuitableContext(@NotNull Project project, @NotNull Editor editor) {
/*  91 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(editor, "editor"); return CodeSnippetCopyPastePostProcessorKt.access$isAIAssistInput(editor);
/*     */   }
/*     */   
/*     */   public void endPaste(@NotNull Project project, @NotNull Editor editor) {
/*  95 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(editor, "editor"); if ((Integer)editor.getUserData(CodeSnippetCopyPastePostProcessorKt.access$getTICKS_LEN_KEY$p()) == null) (Integer)editor.getUserData(CodeSnippetCopyPastePostProcessorKt.access$getTICKS_LEN_KEY$p());  int ticksLen = Integer.valueOf(-1).intValue();
/*  96 */     if (ticksLen == -1) {
/*     */       return;
/*     */     }
/*     */     
/* 100 */     Caret caret1 = editor.getCaretModel().getPrimaryCaret(), $this$endPaste_u24lambda_u240 = caret1; int $i$a$-apply-CodeSnippetPasteCaretMover$endPaste$1 = 0;
/* 101 */     $this$endPaste_u24lambda_u240.moveToOffset($this$endPaste_u24lambda_u240.getOffset() + ticksLen + 1);
/*     */ 
/*     */     
/* 104 */     editor.putUserData(CodeSnippetCopyPastePostProcessorKt.access$getTICKS_LEN_KEY$p(), Integer.valueOf(-1));
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/services/paste/CodeSnippetPasteCaretMover.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */