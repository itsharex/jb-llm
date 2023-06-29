/*    */ package com.intellij.ml.llm.core.chat.actions.chat;
/*    */ import com.intellij.ml.llm.core.chat.session.ChatSession;
/*    */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\000\030\0002\0020\001B\005¢\006\002\020\002J \020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\nH\026¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/core/chat/actions/chat/AIAssistantRenameChat;", "Lcom/intellij/ml/llm/core/chat/actions/chat/BaseAIAssistantChatAction;", "()V", "doAction", "", "project", "Lcom/intellij/openapi/project/Project;", "session", "Lcom/intellij/ml/llm/core/chat/session/ChatSession;", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "intellij.ml.llm"})
/*    */ public final class AIAssistantRenameChat extends BaseAIAssistantChatAction {
/*    */   public AIAssistantRenameChat() {
/* 11 */     super("Rename Chat");
/*    */   }
/*    */   public void doAction(@NotNull Project project, @NotNull ChatSession session, @NotNull AnActionEvent e) {
/* 14 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(session, "session"); Intrinsics.checkNotNullParameter(e, "e"); String title = MessagesEx.showInputDialog("New Title", "Enter new title for this dialog", AllIcons.General.QuestionDialog, 
/* 15 */         session.getTitle().getText(), new AIAssistantRenameChat$doAction$title$1());
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 23 */     if (title != null)
/* 24 */       session.setTitle(new ChatTitle(title, true)); 
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\031\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\016\n\002\b\002*\001\000\b\n\030\0002\0020\001J\022\020\002\032\0020\0032\b\020\004\032\004\030\0010\005H\026J\022\020\006\032\0020\0032\b\020\004\032\004\030\0010\005H\026¨\006\007"}, d2 = {"com/intellij/ml/llm/core/chat/actions/chat/AIAssistantRenameChat$doAction$title$1", "Lcom/intellij/openapi/ui/InputValidator;", "canClose", "", "inputString", "", "checkInput", "intellij.ml.llm"})
/*    */   public static final class AIAssistantRenameChat$doAction$title$1 implements InputValidator {
/*    */     public boolean checkInput(@Nullable String inputString) {
/*    */       return (inputString != null) ? ((((((CharSequence)inputString).length() > 0) ? true : false) == true)) : false;
/*    */     }
/*    */     
/*    */     public boolean canClose(@Nullable String inputString) {
/*    */       return checkInput(inputString);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/actions/chat/AIAssistantRenameChat.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */