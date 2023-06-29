/*    */ package com.intellij.ml.llm.core.chat.session;@Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\002\n\002\b\004\bf\030\000 \0222\0020\001:\001\022J(\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H&J\030\020\f\032\0020\r2\006\020\004\032\0020\0052\006\020\n\032\0020\013H&J)\020\016\032\0020\0172\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\020\032\0020\003H¦@ø\001\000¢\006\002\020\021ø\001\001\002\n\n\002\b\031\n\004\b!0\001¨\006\023À\006\001"}, d2 = {"Lcom/intellij/ml/llm/core/chat/session/ChatMessageHandler;", "", "createMessage", "Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;", "project", "Lcom/intellij/openapi/project/Project;", "chat", "Lcom/intellij/ml/llm/core/chat/session/ChatSession;", "text", "", "kind", "Lcom/intellij/ml/llm/core/chat/session/ChatKind;", "isApplicable", "", "serveMessage", "", "message", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/chat/session/ChatSession;Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "intellij.ml.llm"})
/*    */ public interface ChatMessageHandler { @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   boolean isApplicable(@NotNull Project paramProject, @NotNull ChatKind paramChatKind);
/*    */   @NotNull
/*    */   CompletableMessage createMessage(@NotNull Project paramProject, @NotNull ChatSession paramChatSession, @NotNull String paramString, @NotNull ChatKind paramChatKind);
/*    */   @Nullable
/*    */   Object serveMessage(@NotNull Project paramProject, @NotNull ChatSession paramChatSession, @NotNull CompletableMessage paramCompletableMessage, @NotNull Continuation<? super Unit> paramContinuation);
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\027\020\003\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/core/chat/session/ChatMessageHandler$Companion;", "", "()V", "EP", "Lcom/intellij/openapi/extensions/ExtensionPointName;", "Lcom/intellij/ml/llm/core/chat/session/ChatMessageHandler;", "getEP", "()Lcom/intellij/openapi/extensions/ExtensionPointName;", "intellij.ml.llm"})
/*    */   public static final class Companion { @NotNull
/* 12 */     private static final ExtensionPointName<ChatMessageHandler> EP = new ExtensionPointName("com.intellij.chatMessageHandler"); @NotNull public final ExtensionPointName<ChatMessageHandler> getEP() { return EP; }
/*    */      }
/*    */    }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/session/ChatMessageHandler.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */