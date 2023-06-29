/*    */ package com.intellij.ml.llm.core.chat.ui.list;
/*    */ 
/*    */ import com.intellij.ml.llm.core.chat.session.ChatSession;
/*    */ import com.intellij.ui.dsl.listCellRenderer.LcrText;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "value", "Lcom/intellij/ml/llm/core/chat/session/ChatSession;", "invoke"})
/*    */ final class null
/*    */   extends Lambda
/*    */   implements Function1<ChatSession, Unit>
/*    */ {
/*    */   public final void invoke(@NotNull ChatSession value) {
/* 50 */     Intrinsics.checkNotNullParameter(value, "value"); this.$title.setText(value.getTitle().getText());
/* 51 */     this.$time.setText(JBDateFormat.getFormatter().formatPrettyDateTime(value.getTimestamp()));
/*    */   }
/*    */   
/*    */   null(LcrText $title, LcrText $time) {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/list/AIAssistantChatListPanel$listCellRenderer$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */