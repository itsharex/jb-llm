/*    */ package com.intellij.ml.llm.core.chat.ui;
/*    */ 
/*    */ import com.intellij.ml.llm.core.chat.ui.chat.AIAssistantChatPanel;
/*    */ import com.intellij.openapi.Disposable;
/*    */ import com.intellij.openapi.util.Disposer;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */ final class null
/*    */   extends Lambda
/*    */   implements Function0<Unit>
/*    */ {
/*    */   public final void invoke() {
/* 80 */     AIAssistantContainerPanel.access$getChatManager(AIAssistantContainerPanel.this).removeListener(this.$chatListener);
/*    */     
/* 82 */     for (AIAssistantChatPanel chatPanel : AIAssistantContainerPanel.access$getChatPanelCache$p(AIAssistantContainerPanel.this).values())
/* 83 */       Disposer.dispose((Disposable)chatPanel); 
/*    */   }
/*    */   
/*    */   null(AIAssistantContainerPanel$chatListener$1 $chatListener) {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/AIAssistantContainerPanel$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */