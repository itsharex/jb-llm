/*    */ package com.intellij.ml.llm.intentions.chat;
/*    */ 
/*    */ import com.intellij.ml.llm.LLMBundle;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\030\0002\0020\0012\0020\002B\005¢\006\002\020\003J\b\020\004\032\0020\005H\026J\034\020\006\032\004\030\0010\0052\006\020\007\032\0020\b2\b\020\t\032\004\030\0010\nH\024J\b\020\013\032\0020\005H\026¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/intentions/chat/CustomChatIntention;", "Lcom/intellij/ml/llm/intentions/chat/AbstractChatIntention;", "Lcom/intellij/codeInsight/intention/HighPriorityAction;", "()V", "getFamilyName", "", "getPrompt", "project", "Lcom/intellij/openapi/project/Project;", "context", "Lcom/intellij/psi/PsiElement;", "getText", "intellij.ml.llm"})
/*    */ public final class CustomChatIntention extends AbstractChatIntention implements HighPriorityAction {
/*  9 */   public CustomChatIntention() { super(null, 1, null); } @NotNull
/* 10 */   public String getText() { return LLMBundle.message("intentions.chat.custom.name", new Object[0]); } @NotNull
/*    */   public String getFamilyName() {
/* 12 */     return LLMBundle.message("intentions.chat.custom.family.name", new Object[0]);
/*    */   } @Nullable
/*    */   protected String getPrompt(@NotNull Project project, @Nullable PsiElement context) {
/* 15 */     Intrinsics.checkNotNullParameter(project, "project"); return Messages.showInputDialog(project, LLMBundle.message("dialog.message.enter.prompt", new Object[0]), 
/* 16 */         LLMBundle.message("dialog.title.enter.prompt", new Object[0]), null);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/chat/CustomChatIntention.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */