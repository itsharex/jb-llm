/*    */ package com.intellij.ml.llm.core.chat.actions.toolbar;
/*    */ 
/*    */ import com.intellij.ml.llm.core.chat.services.AIAssistantServiceScope;
/*    */ import com.intellij.ml.llm.core.chat.session.ChatCreationContext;
/*    */ import com.intellij.ml.llm.core.chat.session.ChatOrigin;
/*    */ import com.intellij.ml.llm.core.chat.session.ChatSessionStorage;
/*    */ import com.intellij.ml.llm.core.chat.ui.AIAssistantContainerPanel;
/*    */ import com.intellij.openapi.actionSystem.ActionToolbar;
/*    */ import com.intellij.openapi.actionSystem.CommonDataKeys;
/*    */ import com.intellij.openapi.actionSystem.DataContext;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.util.ui.JBInsets;
/*    */ import java.awt.event.ActionEvent;
/*    */ import javax.swing.JButton;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.BuildersKt;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\013\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001¨\006\002"}, d2 = {"com/intellij/ml/llm/core/chat/actions/toolbar/AIAssistantNewChatAction$createCustomComponent$ourButton$1", "Ljavax/swing/JButton;", "intellij.ml.llm"})
/*    */ public final class AIAssistantNewChatAction$createCustomComponent$ourButton$1
/*    */   extends JButton
/*    */ {
/*    */   AIAssistantNewChatAction$createCustomComponent$ourButton$1(String $super_call_param$1) {
/* 38 */     super($super_call_param$1);
/*    */     
/* 40 */     putClientProperty("ActionToolbar.smallVariant", Boolean.valueOf(true));
/* 41 */     putClientProperty("customButtonInsets", (new JBInsets(1)).asUIResource());
/* 42 */     setOpaque(false);
/* 43 */     addActionListener(this::_init_$lambda$0); } private static final void _init_$lambda$0(AIAssistantNewChatAction$createCustomComponent$ourButton$1 this$0, ActionEvent it) { AIAssistantContainerPanel containerPanel; Project project;
/* 44 */     Intrinsics.checkNotNullParameter(this$0, "this$0"); Intrinsics.checkNotNullExpressionValue(ActionToolbar.getDataContextFor(this$0), "getDataContextFor(this)"); DataContext dataContext = ActionToolbar.getDataContextFor(this$0);
/* 45 */     if ((AIAssistantContainerPanel)dataContext.getData(AIAssistantContainerPanel.Companion.getAIAssistantContainer()) == null) { (AIAssistantContainerPanel)dataContext.getData(AIAssistantContainerPanel.Companion.getAIAssistantContainer()); throw new IllegalStateException(
/* 46 */           "Can't find chat list panel".toString()); }
/*    */     
/* 48 */     if ((Project)dataContext.getData(CommonDataKeys.PROJECT) == null) { (Project)dataContext.getData(CommonDataKeys.PROJECT); return; }
/* 49 */      ChatCreationContext context = new ChatCreationContext((ChatOrigin)ChatOrigin.AIAssistantTool.INSTANCE, ChatSessionStorage.SourceAction.NEW_CHAT, null, null, 12, null);
/* 50 */     BuildersKt.launch$default(AIAssistantServiceScope.Companion.getScope(project), null, null, new AIAssistantNewChatAction$createCustomComponent$ourButton$1$1$1(containerPanel, context, null), 3, null); }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/actions/toolbar/AIAssistantNewChatAction$createCustomComponent$ourButton$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */