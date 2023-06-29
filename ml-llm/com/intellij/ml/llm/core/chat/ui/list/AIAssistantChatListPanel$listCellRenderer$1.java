/*    */ package com.intellij.ml.llm.core.chat.ui.list;
/*    */ 
/*    */ import com.intellij.ml.llm.core.chat.session.ChatSession;
/*    */ import com.intellij.ui.dsl.listCellRenderer.LcrRow;
/*    */ import com.intellij.ui.dsl.listCellRenderer.LcrText;
/*    */ import com.intellij.ui.dsl.listCellRenderer.LcrTextInitParams;
/*    */ import com.intellij.util.text.JBDateFormat;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\002\030\002\n\002\030\002\n\000\020\000\032\0020\001*\b\022\004\022\0020\0030\002H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "Lcom/intellij/ui/dsl/listCellRenderer/LcrRow;", "Lcom/intellij/ml/llm/core/chat/session/ChatSession;", "invoke"})
/*    */ final class AIAssistantChatListPanel$listCellRenderer$1
/*    */   extends Lambda
/*    */   implements Function1<LcrRow<ChatSession>, Unit>
/*    */ {
/*    */   public static final AIAssistantChatListPanel$listCellRenderer$1 INSTANCE = new AIAssistantChatListPanel$listCellRenderer$1();
/*    */   
/*    */   public final void invoke(@NotNull LcrRow $this$listCellRenderer) {
/* 42 */     Intrinsics.checkNotNullParameter($this$listCellRenderer, "$this$listCellRenderer"); LcrText title = $this$listCellRenderer.text(AIAssistantChatListPanel$listCellRenderer$1$title$1.INSTANCE);
/*    */ 
/*    */     
/* 45 */     LcrText time = $this$listCellRenderer.text(AIAssistantChatListPanel$listCellRenderer$1$time$1.INSTANCE);
/*    */ 
/*    */ 
/*    */     
/* 49 */     $this$listCellRenderer.renderer(new Function1<ChatSession, Unit>(title, time) { public final void invoke(@NotNull ChatSession value) {
/* 50 */             Intrinsics.checkNotNullParameter(value, "value"); this.$title.setText(value.getTitle().getText());
/* 51 */             this.$time.setText(JBDateFormat.getFormatter().formatPrettyDateTime(value.getTimestamp()));
/*    */           } }
/*    */       );
/*    */   }
/*    */   
/*    */   AIAssistantChatListPanel$listCellRenderer$1() {
/*    */     super(1);
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/ui/dsl/listCellRenderer/LcrTextInitParams;", "invoke"})
/*    */   static final class AIAssistantChatListPanel$listCellRenderer$1$title$1 extends Lambda implements Function1<LcrTextInitParams, Unit> {
/*    */     public static final AIAssistantChatListPanel$listCellRenderer$1$title$1 INSTANCE = new AIAssistantChatListPanel$listCellRenderer$1$title$1();
/*    */     
/*    */     public final void invoke(@NotNull LcrTextInitParams $this$text) {
/*    */       Intrinsics.checkNotNullParameter($this$text, "$this$text");
/*    */       $this$text.setGrow(true);
/*    */     }
/*    */     
/*    */     AIAssistantChatListPanel$listCellRenderer$1$title$1() {
/*    */       super(1);
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/ui/dsl/listCellRenderer/LcrTextInitParams;", "invoke"})
/*    */   static final class AIAssistantChatListPanel$listCellRenderer$1$time$1 extends Lambda implements Function1<LcrTextInitParams, Unit> {
/*    */     public static final AIAssistantChatListPanel$listCellRenderer$1$time$1 INSTANCE = new AIAssistantChatListPanel$listCellRenderer$1$time$1();
/*    */     
/*    */     public final void invoke(@NotNull LcrTextInitParams $this$text) {
/*    */       Intrinsics.checkNotNullParameter($this$text, "$this$text");
/*    */       $this$text.setStyle(LcrTextInitParams.Style.GRAYED);
/*    */     }
/*    */     
/*    */     AIAssistantChatListPanel$listCellRenderer$1$time$1() {
/*    */       super(1);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/list/AIAssistantChatListPanel$listCellRenderer$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */