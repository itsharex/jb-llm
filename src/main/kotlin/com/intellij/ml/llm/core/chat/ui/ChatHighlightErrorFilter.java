/*   */ package com.intellij.ml.llm.core.chat.ui;
/*   */ import com.intellij.openapi.vfs.VirtualFile;
/*   */ import com.intellij.psi.PsiErrorElement;
/*   */ 
/*   */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\000\b\000\030\0002\0020\001B\005¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/ChatHighlightErrorFilter;", "Lcom/intellij/codeInsight/highlighting/HighlightErrorFilter;", "()V", "shouldHighlightErrorElement", "", "element", "Lcom/intellij/psi/PsiErrorElement;", "intellij.ml.llm"})
/*   */ public final class ChatHighlightErrorFilter extends HighlightErrorFilter {
/*   */   public boolean shouldHighlightErrorElement(@NotNull PsiErrorElement element) {
/* 8 */     Intrinsics.checkNotNullParameter(element, "element"); element.getContainingFile(); VirtualFile highlightedFile = (element.getContainingFile() != null) ? element.getContainingFile().getVirtualFile() : null;
/* 9 */     return (highlightedFile == null || !AIAssistantUIUtil.INSTANCE.isAIAssistantFile(highlightedFile));
/*   */   }
/*   */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/ChatHighlightErrorFilter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */