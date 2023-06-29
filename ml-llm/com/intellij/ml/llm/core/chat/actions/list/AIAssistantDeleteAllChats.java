/*    */ package com.intellij.ml.llm.core.chat.actions.list;
/*    */ import com.intellij.ml.llm.core.chat.session.ChatSessionHost;
/*    */ import com.intellij.ml.llm.core.chat.ui.list.AIAssistantChatListPanel;
/*    */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*    */ import com.intellij.openapi.components.ComponentManager;
/*    */ import com.intellij.openapi.project.Project;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\000\030\0002\0020\001B\005¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\006H\026J\b\020\007\032\0020\bH\026J\020\020\t\032\0020\0042\006\020\005\032\0020\006H\026¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/core/chat/actions/list/AIAssistantDeleteAllChats;", "Lcom/intellij/openapi/project/DumbAwareAction;", "()V", "actionPerformed", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "getActionUpdateThread", "Lcom/intellij/openapi/actionSystem/ActionUpdateThread;", "update", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nAIAssistantDeleteAllChats.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIAssistantDeleteAllChats.kt\ncom/intellij/ml/llm/core/chat/actions/list/AIAssistantDeleteAllChats\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,38:1\n29#2,3:39\n29#2,3:42\n*S KotlinDebug\n*F\n+ 1 AIAssistantDeleteAllChats.kt\ncom/intellij/ml/llm/core/chat/actions/list/AIAssistantDeleteAllChats\n*L\n23#1:39,3\n34#1:42,3\n*E\n"})
/*    */ public final class AIAssistantDeleteAllChats extends DumbAwareAction {
/*    */   public AIAssistantDeleteAllChats() {
/* 12 */     super("Delete All Chats");
/*    */   } public void actionPerformed(@NotNull AnActionEvent e) {
/* 14 */     Intrinsics.checkNotNullParameter(e, "e"); Project project = e.getProject();
/* 15 */     AIAssistantChatListPanel container = (AIAssistantChatListPanel)e.getDataContext().getData(AIAssistantChatListPanel.Companion.getChatList());
/* 16 */     if (container == null) { String str = "Required value was null."; throw new IllegalArgumentException(str.toString()); }
/* 17 */      if (project == null) { String str = "Required value was null."; throw new IllegalArgumentException(str.toString()); }
/*    */     
/* 19 */     int sure = Messages.showOkCancelDialog(project, "Do you want to delete all chats?", "Delete All Chats", 
/* 20 */         "Yes", "No", Messages.getQuestionIcon(), null);
/*    */     
/* 22 */     if (sure == 0) {
/* 23 */       ComponentManager $this$service$iv = (ComponentManager)project; int $i$f$service = 0;
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
/* 39 */       Class<ChatSessionHost> serviceClass$iv = ChatSessionHost.class;
/* 40 */       Object object = $this$service$iv.getService(serviceClass$iv); if (object == null) throw new IllegalStateException((
/* 41 */             "Cannot find service " + serviceClass$iv.getName() + " in " + $this$service$iv + " (classloader=" + serviceClass$iv.getClassLoader()).toString()); 
/*    */       ((ChatSessionHost)object).clearChats();
/*    */       container.updateModel();
/*    */     } 
/*    */   }
/*    */   
/*    */   public void update(@NotNull AnActionEvent e) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'e'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: invokevirtual getPresentation : ()Lcom/intellij/openapi/actionSystem/Presentation;
/*    */     //   10: aload_1
/*    */     //   11: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*    */     //   14: ifnull -> 57
/*    */     //   17: aload_1
/*    */     //   18: invokevirtual getDataContext : ()Lcom/intellij/openapi/actionSystem/DataContext;
/*    */     //   21: getstatic com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel.Companion : Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel$Companion;
/*    */     //   24: invokevirtual getCurrentDialogKey : ()Lcom/intellij/openapi/actionSystem/DataKey;
/*    */     //   27: invokeinterface getData : (Lcom/intellij/openapi/actionSystem/DataKey;)Ljava/lang/Object;
/*    */     //   32: ifnonnull -> 57
/*    */     //   35: aload_1
/*    */     //   36: invokevirtual getDataContext : ()Lcom/intellij/openapi/actionSystem/DataContext;
/*    */     //   39: getstatic com/intellij/ml/llm/core/chat/ui/list/AIAssistantChatListPanel.Companion : Lcom/intellij/ml/llm/core/chat/ui/list/AIAssistantChatListPanel$Companion;
/*    */     //   42: invokevirtual getChatList : ()Lcom/intellij/openapi/actionSystem/DataKey;
/*    */     //   45: invokeinterface getData : (Lcom/intellij/openapi/actionSystem/DataKey;)Ljava/lang/Object;
/*    */     //   50: ifnull -> 57
/*    */     //   53: iconst_1
/*    */     //   54: goto -> 58
/*    */     //   57: iconst_0
/*    */     //   58: invokevirtual setVisible : (Z)V
/*    */     //   61: aload_1
/*    */     //   62: invokevirtual getPresentation : ()Lcom/intellij/openapi/actionSystem/Presentation;
/*    */     //   65: aload_1
/*    */     //   66: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*    */     //   69: dup
/*    */     //   70: ifnull -> 194
/*    */     //   73: checkcast com/intellij/openapi/components/ComponentManager
/*    */     //   76: astore_2
/*    */     //   77: iconst_0
/*    */     //   78: istore_3
/*    */     //   79: ldc com/intellij/ml/llm/core/chat/session/ChatSessionHost
/*    */     //   81: astore #4
/*    */     //   83: aload_2
/*    */     //   84: aload #4
/*    */     //   86: invokeinterface getService : (Ljava/lang/Class;)Ljava/lang/Object;
/*    */     //   91: astore #5
/*    */     //   93: aload #5
/*    */     //   95: ifnonnull -> 154
/*    */     //   98: new java/lang/IllegalStateException
/*    */     //   101: dup
/*    */     //   102: new java/lang/StringBuilder
/*    */     //   105: dup
/*    */     //   106: invokespecial <init> : ()V
/*    */     //   109: ldc 'Cannot find service '
/*    */     //   111: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   114: aload #4
/*    */     //   116: invokevirtual getName : ()Ljava/lang/String;
/*    */     //   119: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   122: ldc ' in '
/*    */     //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   127: aload_2
/*    */     //   128: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   131: ldc ' (classloader='
/*    */     //   133: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   136: aload #4
/*    */     //   138: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
/*    */     //   141: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   144: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   147: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   150: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   153: athrow
/*    */     //   154: aload #5
/*    */     //   156: checkcast com/intellij/ml/llm/core/chat/session/ChatSessionHost
/*    */     //   159: invokevirtual getAllChats : ()Ljava/util/List;
/*    */     //   162: dup
/*    */     //   163: ifnull -> 194
/*    */     //   166: checkcast java/util/Collection
/*    */     //   169: invokeinterface isEmpty : ()Z
/*    */     //   174: ifne -> 181
/*    */     //   177: iconst_1
/*    */     //   178: goto -> 182
/*    */     //   181: iconst_0
/*    */     //   182: iconst_1
/*    */     //   183: if_icmpne -> 190
/*    */     //   186: iconst_1
/*    */     //   187: goto -> 196
/*    */     //   190: iconst_0
/*    */     //   191: goto -> 196
/*    */     //   194: pop
/*    */     //   195: iconst_0
/*    */     //   196: invokevirtual setEnabled : (Z)V
/*    */     //   199: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #29	-> 6
/*    */     //   #30	-> 10
/*    */     //   #31	-> 17
/*    */     //   #32	-> 35
/*    */     //   #29	-> 58
/*    */     //   #34	-> 61
/*    */     //   #42	-> 81
/*    */     //   #43	-> 83
/*    */     //   #44	-> 102
/*    */     //   #43	-> 154
/*    */     //   #34	-> 156
/*    */     //   #34	-> 182
/*    */     //   #35	-> 199
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   79	77	3	$i$f$service	I
/*    */     //   83	73	4	serviceClass$iv	Ljava/lang/Class;
/*    */     //   77	79	2	$this$service$iv	Lcom/intellij/openapi/components/ComponentManager;
/*    */     //   0	200	0	this	Lcom/intellij/ml/llm/core/chat/actions/list/AIAssistantDeleteAllChats;
/*    */     //   0	200	1	e	Lcom/intellij/openapi/actionSystem/AnActionEvent;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public ActionUpdateThread getActionUpdateThread() {
/*    */     return ActionUpdateThread.BGT;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/actions/list/AIAssistantDeleteAllChats.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */