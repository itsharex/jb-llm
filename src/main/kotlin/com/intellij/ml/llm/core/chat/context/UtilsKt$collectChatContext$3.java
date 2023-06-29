/*    */ package com.intellij.ml.llm.core.chat.context;
/*    */ 
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\r\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/ml/llm/core/chat/context/ChatContextItem;", "invoke"})
/*    */ final class UtilsKt$collectChatContext$3
/*    */   extends Lambda
/*    */   implements Function1<ChatContextItem, CharSequence>
/*    */ {
/*    */   public static final UtilsKt$collectChatContext$3 INSTANCE = new UtilsKt$collectChatContext$3();
/*    */   
/*    */   UtilsKt$collectChatContext$3() {
/*    */     super(1);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final CharSequence invoke(@NotNull ChatContextItem it) {
/* 33 */     Intrinsics.checkNotNullParameter(it, "it"); return it.getText();
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/context/UtilsKt$collectChatContext$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */