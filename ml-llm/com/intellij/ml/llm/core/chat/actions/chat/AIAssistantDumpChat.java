/*    */ package com.intellij.ml.llm.core.chat.actions.chat;
/*    */ import com.intellij.ml.llm.core.chat.messages.CompletableMessage;
/*    */ import com.intellij.ml.llm.core.chat.session.ChatSession;
/*    */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*    */ import com.intellij.openapi.fileChooser.FileSaverDescriptor;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import com.intellij.openapi.vfs.VirtualFileWrapper;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\000\030\0002\0020\001B\005¢\006\002\020\002J \020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\nH\026J\020\020\013\032\0020\0042\006\020\t\032\0020\nH\026¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/core/chat/actions/chat/AIAssistantDumpChat;", "Lcom/intellij/ml/llm/core/chat/actions/chat/BaseAIAssistantChatAction;", "()V", "doAction", "", "project", "Lcom/intellij/openapi/project/Project;", "session", "Lcom/intellij/ml/llm/core/chat/session/ChatSession;", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "update", "intellij.ml.llm"})
/*    */ public final class AIAssistantDumpChat extends BaseAIAssistantChatAction {
/*    */   public AIAssistantDumpChat() {
/* 15 */     super(LLMBundle.message("action.dump.current.chat.text", new Object[0]));
/*    */   } public void doAction(@NotNull Project project, @NotNull ChatSession session, @NotNull AnActionEvent e) {
/* 17 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(session, "session"); Intrinsics.checkNotNullParameter(e, "e"); StringBuilder stringBuilder1 = new StringBuilder(), $this$doAction_u24lambda_u240 = stringBuilder1; int $i$a$-apply-AIAssistantDumpChat$doAction$content$1 = 0;
/* 18 */     String header = "Chat '" + session.getTitle() + "' (" + session.getUid() + ")\n";
/* 19 */     $this$doAction_u24lambda_u240.append(header);
/* 20 */     $this$doAction_u24lambda_u240.append("Context:\n" + session.getContext() + "\n");
/* 21 */     $this$doAction_u24lambda_u240.append("Messages: " + session.getMessages().size() + "\n");
/* 22 */     $this$doAction_u24lambda_u240.append(StringsKt.repeat("=", header.length() - 1));
/* 23 */     $this$doAction_u24lambda_u240.append("\n\n");
/*    */     
/* 25 */     for (CompletableMessage message : session.getMessages()) {
/* 26 */       $this$doAction_u24lambda_u240.append(message.getAuthor());
/* 27 */       $this$doAction_u24lambda_u240.append(": \n");
/* 28 */       $this$doAction_u24lambda_u240.append(message.getText());
/* 29 */       $this$doAction_u24lambda_u240.append("\n\n");
/*    */     } 
/* 31 */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply {\n…\n      }\n    }.toString()"); String content = stringBuilder1.toString();
/*    */     
/* 33 */     String[] arrayOfString = new String[1]; arrayOfString[0] = "txt"; FileSaverDescriptor descriptor = new FileSaverDescriptor(LLMBundle.message("action.dump.current.chat.text", new Object[0]), LLMBundle.message("action.dump.current.chat.text", new Object[0]), arrayOfString);
/* 34 */     Intrinsics.checkNotNullExpressionValue(FileChooserFactory.getInstance().createSaveFileDialog(descriptor, project), "getInstance().createSave…alog(descriptor, project)"); FileSaverDialog saveFileDialog = FileChooserFactory.getInstance().createSaveFileDialog(descriptor, project);
/*    */     
/* 36 */     VirtualFile vf = VfsUtil.getUserHomeDir();
/*    */     
/* 38 */     VirtualFileWrapper result = saveFileDialog.save(vf, "chat-" + session.getUid() + ".txt");
/* 39 */     if (result != null) {
/* 40 */       Intrinsics.checkNotNullExpressionValue(result.getFile(), "result.file"); FilesKt.writeText$default(result.getFile(), content, null, 2, null);
/* 41 */       VirtualFile virtualFile = result.getVirtualFile();
/* 42 */       if (virtualFile != null) {
/* 43 */         FileEditorManager.getInstance(project).openEditor(new OpenFileDescriptor(project, virtualFile), true);
/*    */       }
/*    */     }
/* 46 */     else if (PluginManagerCore.isRunningFromSources()) {
/* 47 */       System.out.println(content);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void update(@NotNull AnActionEvent e) {
/* 52 */     Intrinsics.checkNotNullParameter(e, "e"); super.update(e);
/* 53 */     e.getPresentation().setEnabledAndVisible((e.getPresentation().isEnabledAndVisible() && ApplicationManager.getApplication().isInternal()));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/actions/chat/AIAssistantDumpChat.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */