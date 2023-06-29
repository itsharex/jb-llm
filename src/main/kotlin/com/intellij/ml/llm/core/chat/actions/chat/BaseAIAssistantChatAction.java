/*    */ package com.intellij.ml.llm.core.chat.actions.chat;
/*    */ import com.intellij.ml.llm.core.chat.session.ChatSession;
/*    */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b&\030\0002\0020\001B\017\022\b\b\001\020\002\032\0020\003¢\006\002\020\004J\016\020\013\032\0020\f2\006\020\r\032\0020\bJ \020\016\032\0020\f2\006\020\017\032\0020\0202\006\020\005\032\0020\0062\006\020\r\032\0020\bH&J\006\020\021\032\0020\022J\020\020\023\032\0020\f2\006\020\r\032\0020\bH\026R\037\020\005\032\t\030\0010\006¢\006\002\b\007*\0020\b8DX\004¢\006\006\032\004\b\t\020\n¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/core/chat/actions/chat/BaseAIAssistantChatAction;", "Lcom/intellij/openapi/project/DumbAwareAction;", "text", "", "(Ljava/lang/String;)V", "session", "Lcom/intellij/ml/llm/core/chat/session/ChatSession;", "Lorg/jetbrains/annotations/Nullable;", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "getSession", "(Lcom/intellij/openapi/actionSystem/AnActionEvent;)Lcom/intellij/ml/llm/core/chat/session/ChatSession;", "actionPerformed", "", "e", "doAction", "project", "Lcom/intellij/openapi/project/Project;", "getActionUpdateThread", "Lcom/intellij/openapi/actionSystem/ActionUpdateThread;", "update", "intellij.ml.llm"})
/*    */ public abstract class BaseAIAssistantChatAction extends DumbAwareAction {
/*    */   public BaseAIAssistantChatAction(@ActionText @NotNull String text) {
/* 10 */     super(text);
/*    */   }
/*    */   public abstract void doAction(@NotNull Project paramProject, @NotNull ChatSession paramChatSession, @NotNull AnActionEvent paramAnActionEvent);
/*    */   public final void actionPerformed(@NotNull AnActionEvent e) {
/* 14 */     Intrinsics.checkNotNullParameter(e, "e"); Project project = e.getProject();
/* 15 */     ChatSession current = getSession(e);
/* 16 */     if (current == null) { String str = "Required value was null."; throw new IllegalArgumentException(str.toString()); }
/* 17 */      if (project == null) { String str = "Required value was null."; throw new IllegalArgumentException(str.toString()); }
/*    */     
/* 19 */     doAction(project, current, e);
/*    */   }
/*    */   
/*    */   public void update(@NotNull AnActionEvent e) {
/* 23 */     Intrinsics.checkNotNullParameter(e, "e"); e.getPresentation().setEnabledAndVisible((getSession(e) != null));
/*    */   }
/*    */   @NotNull
/* 26 */   public final ActionUpdateThread getActionUpdateThread() { return ActionUpdateThread.BGT; } @Nullable
/*    */   protected final ChatSession getSession(@NotNull AnActionEvent $this$session) {
/* 28 */     Intrinsics.checkNotNullParameter($this$session, "<this>"); return (ChatSession)$this$session.getDataContext().getData(ChatSession.Companion.getCurrentSession());
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/actions/chat/BaseAIAssistantChatAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */