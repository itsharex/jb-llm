/*     */ package com.intellij.ml.llm.core.chat.ui.chat;
/*     */ 
/*     */ import com.intellij.ml.llm.core.chat.messages.ChatMessageAuthor;
/*     */ import com.intellij.ml.llm.core.chat.messages.CompletableMessage;
/*     */ import com.intellij.ml.llm.core.chat.messages.CompletableMessageStateListener;
/*     */ import com.intellij.ml.llm.core.chat.session.ChatSessionMessageListener;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanelController$1", "Lcom/intellij/ml/llm/core/chat/session/ChatSessionMessageListener;", "onMessagesChanged", "", "newMessage", "Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;", "intellij.ml.llm"})
/*     */ public final class null
/*     */   implements ChatSessionMessageListener
/*     */ {
/*     */   null(AIAssistantChatPanelController $receiver) {}
/*     */   
/*     */   public void onMessagesChanged(@NotNull CompletableMessage newMessage) {
/*  31 */     Intrinsics.checkNotNullParameter(newMessage, "newMessage"); if (newMessage.getAuthor() == ChatMessageAuthor.User)
/*     */       return; 
/*  33 */     newMessage.addStateListener(new AIAssistantChatPanelController$1$onMessagesChanged$1(this.$hasScheduledTitleGeneration, AIAssistantChatPanelController.this)); } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\021\n\000\n\002\030\002\n\000\n\002\020\002\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026¨\006\004"}, d2 = {"com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanelController$1$onMessagesChanged$1", "Lcom/intellij/ml/llm/core/chat/messages/CompletableMessageStateListener;", "onStateChanged", "", "intellij.ml.llm"})
/*     */   @SourceDebugExtension({"SMAP\nAIAssistantChatPanelController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIAssistantChatPanelController.kt\ncom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanelController$1$onMessagesChanged$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,126:1\n766#2:127\n857#2,2:128\n*S KotlinDebug\n*F\n+ 1 AIAssistantChatPanelController.kt\ncom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanelController$1$onMessagesChanged$1\n*L\n37#1:127\n37#1:128,2\n*E\n"})
/*  35 */   public static final class AIAssistantChatPanelController$1$onMessagesChanged$1 implements CompletableMessageStateListener { public void onStateChanged() { if (this.$newMessage.getState() instanceof com.intellij.ml.llm.core.chat.messages.CompletedState && !(this.$newMessage.getState() instanceof com.intellij.ml.llm.core.chat.messages.ErrorState) && 
/*  36 */         !this.$hasScheduledTitleGeneration.element && !AIAssistantChatPanelController.access$getSession$p(AIAssistantChatPanelController.this).getTitle().isCustom()) {
/*  37 */         Iterable $this$filter$iv = AIAssistantChatPanelController.access$getSession$p(AIAssistantChatPanelController.this).getMessages(); int $i$f$filter = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 127 */         Iterable iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 128 */         for (Object element$iv$iv : iterable1) { CompletableMessage it = (CompletableMessage)element$iv$iv; int $i$a$-filter-AIAssistantChatPanelController$1$onMessagesChanged$1$onStateChanged$messagesToUse$1 = 0; if ((it.getState() instanceof com.intellij.ml.llm.core.chat.messages.CompletedState && !(it.getState() instanceof com.intellij.ml.llm.core.chat.messages.ErrorState))) destination$iv$iv.add(element$iv$iv);  }
/* 129 */          List messagesToUse = CollectionsKt.toList(destination$iv$iv);
/*     */         if (messagesToUse.size() >= 2) {
/*     */           this.$hasScheduledTitleGeneration.element = true;
/*     */           AIAssistantChatPanelController.access$generateTitle(AIAssistantChatPanelController.this, AIAssistantChatPanelController.access$getSession$p(AIAssistantChatPanelController.this).getContext(), messagesToUse);
/*     */         } 
/*     */       }  }
/*     */ 
/*     */     
/*     */     AIAssistantChatPanelController$1$onMessagesChanged$1(Ref.BooleanRef $hasScheduledTitleGeneration, AIAssistantChatPanelController $receiver) {} }
/*     */ 
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanelController$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */