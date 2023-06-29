/*    */ package com.intellij.ml.llm.core.chat.ui;
/*    */ import com.intellij.codeInsight.intention.IntentionAction;
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import com.intellij.psi.PsiFile;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\005¢\006\002\020\002J\032\020\003\032\0020\0042\006\020\005\032\0020\0062\b\020\007\032\004\030\0010\bH\026¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/AIAssistantIntentionActionFilter;", "Lcom/intellij/codeInsight/daemon/impl/IntentionActionFilter;", "()V", "accept", "", "intentionAction", "Lcom/intellij/codeInsight/intention/IntentionAction;", "file", "Lcom/intellij/psi/PsiFile;", "intellij.ml.llm"})
/*    */ public final class AIAssistantIntentionActionFilter implements IntentionActionFilter {
/*    */   public boolean accept(@NotNull IntentionAction intentionAction, @Nullable PsiFile file) {
/*  9 */     Intrinsics.checkNotNullParameter(intentionAction, "intentionAction"); VirtualFile virtualFile = (file != null) ? file.getVirtualFile() : null;
/* 10 */     return (virtualFile == null || !AIAssistantUIUtil.INSTANCE.isAIAssistantFile(virtualFile));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/AIAssistantIntentionActionFilter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */