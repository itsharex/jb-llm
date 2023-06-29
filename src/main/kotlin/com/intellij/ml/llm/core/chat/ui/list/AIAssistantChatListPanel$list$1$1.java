/*    */ package com.intellij.ml.llm.core.chat.ui.list;
/*    */ 
/*    */ import com.intellij.ide.DataManager;
/*    */ import com.intellij.ml.llm.core.chat.session.ChatSession;
/*    */ import com.intellij.openapi.actionSystem.ActionGroup;
/*    */ import com.intellij.openapi.actionSystem.DataContext;
/*    */ import com.intellij.openapi.actionSystem.ex.ActionUtil;
/*    */ import com.intellij.openapi.ui.popup.JBPopupFactory;
/*    */ import com.intellij.openapi.ui.popup.ListPopup;
/*    */ import com.intellij.ui.PopupHandler;
/*    */ import com.intellij.ui.awt.RelativePoint;
/*    */ import java.awt.Component;
/*    */ import java.awt.Point;
/*    */ import java.awt.Rectangle;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\037\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\002*\001\000\b\n\030\0002\0020\001J\"\020\002\032\0020\0032\b\020\004\032\004\030\0010\0052\006\020\006\032\0020\0072\006\020\b\032\0020\007H\026¨\006\t"}, d2 = {"com/intellij/ml/llm/core/chat/ui/list/AIAssistantChatListPanel$list$1$1", "Lcom/intellij/ui/PopupHandler;", "invokePopup", "", "comp", "Ljava/awt/Component;", "x", "", "y", "intellij.ml.llm"})
/*    */ public final class AIAssistantChatListPanel$list$1$1
/*    */   extends PopupHandler
/*    */ {
/*    */   public void invokePopup(@Nullable Component comp, int x, int y) {
/* 78 */     if (comp == null)
/* 79 */       return;  Point point = new Point(x, y);
/* 80 */     int index = AIAssistantChatListPanel.access$getList$p(AIAssistantChatListPanel.this).locationToIndex(point);
/* 81 */     if (index >= 0 && index < AIAssistantChatListPanel.access$getList$p(AIAssistantChatListPanel.this).getModel().getSize()) {
/* 82 */       Rectangle bounds = AIAssistantChatListPanel.access$getList$p(AIAssistantChatListPanel.this).getCellBounds(index, index);
/* 83 */       if (bounds != null && bounds.contains(point)) {
/* 84 */         ActionGroup group; ChatSession element = AIAssistantChatListPanel.access$getModelCasted(AIAssistantChatListPanel.this).elementAt(index);
/* 85 */         AIAssistantChatListPanel.access$getList$p(AIAssistantChatListPanel.this).setSelectedIndex(index);
/* 86 */         if (ActionUtil.getActionGroup("AIAssistant.ToolWindow.List.ContextActions") == null) { ActionUtil.getActionGroup("AIAssistant.ToolWindow.List.ContextActions"); return; }
/* 87 */          Intrinsics.checkNotNullExpressionValue(DataManager.getInstance().getDataContext(comp, x, y), "getInstance().getDataContext(comp, x, y)"); DataContext dataContext = DataManager.getInstance().getDataContext(comp, x, y);
/* 88 */         DataManager.getInstance().saveInDataContext(dataContext, AIAssistantChatListPanel.Companion.getSelectedElementKey(), element);
/* 89 */         Intrinsics.checkNotNullExpressionValue(JBPopupFactory.getInstance().createActionGroupPopup(null, group, dataContext, false, null, 10), "getInstance().createActi…Context, false, null, 10)"); ListPopup popup = JBPopupFactory.getInstance().createActionGroupPopup(null, group, dataContext, false, null, 10);
/* 90 */         popup.show(new RelativePoint(comp, point));
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/list/AIAssistantChatListPanel$list$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */