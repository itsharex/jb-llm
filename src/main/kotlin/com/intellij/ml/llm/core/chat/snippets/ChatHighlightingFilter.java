/*    */ package com.intellij.ml.llm.core.chat.snippets;
/*    */ import com.intellij.codeInsight.daemon.impl.HighlightInfo;
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\005¢\006\002\020\002J\032\020\003\032\0020\0042\006\020\005\032\0020\0062\b\020\007\032\004\030\0010\bH\026¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/core/chat/snippets/ChatHighlightingFilter;", "Lcom/intellij/codeInsight/daemon/impl/HighlightInfoFilter;", "()V", "accept", "", "highlightInfo", "Lcom/intellij/codeInsight/daemon/impl/HighlightInfo;", "file", "Lcom/intellij/psi/PsiFile;", "intellij.ml.llm"})
/*    */ public final class ChatHighlightingFilter implements HighlightInfoFilter {
/*    */   public boolean accept(@NotNull HighlightInfo highlightInfo, @Nullable PsiFile file) {
/* 11 */     Intrinsics.checkNotNullParameter(highlightInfo, "highlightInfo"); if (file == null || highlightInfo.getSeverity().compareTo(HighlightSeverity.GENERIC_SERVER_ERROR_OR_WARNING) < 0) {
/* 12 */       return true;
/*    */     }
/* 14 */     VirtualFile virtualFile = file.getVirtualFile();
/* 15 */     if (virtualFile != null && AIAssistantUIUtil.INSTANCE.isAIAssistantFile(virtualFile)) {
/* 16 */       return false;
/*    */     }
/*    */     
/* 19 */     return true;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/snippets/ChatHighlightingFilter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */