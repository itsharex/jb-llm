/*    */ package com.intellij.ml.llm.core.chat.actions.codeSnippet;
/*    */ import com.intellij.ml.llm.core.chat.messages.CompletableMessage;
/*    */ import com.intellij.ml.llm.core.chat.session.ChatSession;
/*    */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.project.DumbAwareAction;
/*    */ import java.awt.Toolkit;
/*    */ import java.awt.datatransfer.Clipboard;
/*    */ import java.awt.datatransfer.StringSelection;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\000\b\000\030\0002\0020\001B\005¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\006H\026J\020\020\007\032\0020\0042\006\020\b\032\0020\tH\002¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/core/chat/actions/codeSnippet/AIAssistantCopyToClipboardAction;", "Lcom/intellij/openapi/project/DumbAwareAction;", "()V", "actionPerformed", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "copyToClipboard", "text", "", "intellij.ml.llm"})
/*    */ public final class AIAssistantCopyToClipboardAction extends DumbAwareAction {
/*    */   public void actionPerformed(@NotNull AnActionEvent e) {
/*    */     String text;
/* 16 */     Intrinsics.checkNotNullParameter(e, "e"); Editor editor = (Editor)e.getData(PlatformDataKeys.EDITOR);
/*    */     
/* 18 */     if (editor == null || editor.getDocument() == null || editor.getDocument().getText() == null) { editor.getDocument().getText(); return; }
/* 19 */      copyToClipboard(text);
/* 20 */     CompletableMessage message = (CompletableMessage)e.getDataContext().getData(CompletableMessage.Companion.getKey());
/* 21 */     ChatSession chatSession = (ChatSession)e.getDataContext().getData(ChatSession.Companion.getCurrentSession());
/* 22 */     if (message != null && chatSession != null) {
/* 23 */       AIAssistantChatEventLogger.Companion.logCodeCopiedEvent(e.getProject(), chatSession, message);
/*    */     }
/*    */   }
/*    */   
/*    */   private final void copyToClipboard(String text) {
/* 28 */     StringSelection stringSelection = new StringSelection(text);
/* 29 */     Intrinsics.checkNotNullExpressionValue(Toolkit.getDefaultToolkit().getSystemClipboard(), "getDefaultToolkit().systemClipboard"); Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
/* 30 */     clipboard.setContents(stringSelection, null);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/actions/codeSnippet/AIAssistantCopyToClipboardAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */