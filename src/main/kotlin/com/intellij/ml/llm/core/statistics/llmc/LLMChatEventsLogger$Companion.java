/*     */ package com.intellij.ml.llm.core.statistics.llmc;
/*     */ 
/*     */ import ai.grazie.model.llm.chat.LLMChatRole;
/*     */ import ai.grazie.model.llm.profile.OpenAIProfileIDs;
/*     */ import com.google.gson.Gson;
/*     */ import com.intellij.internal.statistic.eventLog.events.EventFields;
/*     */ import com.intellij.internal.statistic.eventLog.events.EventPair;
/*     */ import com.intellij.internal.statistic.eventLog.events.ObjectEventData;
/*     */ import com.intellij.internal.statistic.eventLog.events.VarargEventId;
/*     */ import com.intellij.ml.llm.core.chat.messages.ChatMessageAuthor;
/*     */ import com.intellij.ml.llm.core.chat.messages.CompletableMessage;
/*     */ import com.intellij.ml.llm.core.chat.session.ChatSession;
/*     */ import com.intellij.ml.llm.core.chat.session.ChatSessionStorage;
/*     */ import com.intellij.ml.llm.core.settings.LLMSettingsManager;
/*     */ import com.intellij.ml.llm.core.statistics.fus.AIAssistantChatEventLogger;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\r\n\002\020\t\n\002\b\b\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\b\020&\032\0020'H\002J \020(\032\0020)2\006\020*\032\0020+2\006\020,\032\0020\f2\006\020-\032\0020.H\007J\022\020/\032\0020)2\b\020*\032\004\030\0010+H\007J\030\0200\032\0020)2\006\020*\032\0020+2\006\020,\032\0020\fH\007J\"\0201\032\0020)2\b\020*\032\004\030\0010+2\006\0202\032\0020\f2\006\020-\032\0020.H\007J\022\0203\032\0020)2\b\020*\032\004\030\0010+H\007J \0204\032\0020)2\006\020*\032\0020+2\006\020,\032\0020\f2\006\020-\032\0020.H\007J\030\0205\032\0020)2\006\020*\032\0020+2\006\020,\032\0020\fH\007J \0206\032\0020)2\006\020*\032\0020+2\006\020,\032\0020\f2\006\020-\032\0020.H\007J \0207\032\0020)2\006\020*\032\0020+2\006\020,\032\0020\f2\006\020-\032\0020.H\007J$\0208\032\0020)2\b\020*\032\004\030\0010+2\b\020,\032\004\030\0010\f2\b\020-\032\004\030\0010.J0\0209\032\0020)2\006\020*\032\0020+2\006\020,\032\0020\f2\006\020:\032\0020.2\b\020-\032\004\030\0010.2\006\020;\032\0020<J0\020=\032\0020)2\006\020*\032\0020+2\006\020,\032\0020\f2\006\020:\032\0020.2\b\020-\032\004\030\0010.2\006\020;\032\0020<J:\020>\032\0020)2\006\020*\032\0020+2\006\020?\032\0020\0332\006\020,\032\0020\f2\006\020:\032\0020.2\b\020-\032\004\030\0010.2\006\020;\032\0020<H\002J\036\020@\032\0020)2\006\020*\032\0020+2\006\020,\032\0020\f2\006\020-\032\0020.J\026\020A\032\0020)2\006\020*\032\0020+2\006\020,\032\0020\fJ\026\020B\032\0020)2\006\020,\032\0020\f2\006\020*\032\0020+J\020\020C\032\0020\0072\006\020D\032\0020EH\002R\016\020\003\032\0020\004X\004¢\006\002\n\000R\024\020\005\032\b\022\004\022\0020\0070\006X\004¢\006\002\n\000R\016\020\b\032\0020\tX\004¢\006\002\n\000R\036\020\n\032\022\022\006\022\004\030\0010\f\022\006\022\004\030\0010\r0\013X\004¢\006\002\n\000R\016\020\016\032\0020\tX\004¢\006\002\n\000R\036\020\017\032\022\022\006\022\004\030\0010\f\022\006\022\004\030\0010\r0\013X\004¢\006\002\n\000R\016\020\020\032\0020\021X\004¢\006\002\n\000R\036\020\022\032\022\022\006\022\004\030\0010\f\022\006\022\004\030\0010\r0\013X\004¢\006\002\n\000R\026\020\023\032\n\022\006\022\004\030\0010\f0\024X\004¢\006\002\n\000R\036\020\025\032\022\022\006\022\004\030\0010\f\022\006\022\004\030\0010\r0\013X\004¢\006\002\n\000R\036\020\026\032\022\022\006\022\004\030\0010\f\022\006\022\004\030\0010\r0\013X\004¢\006\002\n\000R\016\020\027\032\0020\030X\004¢\006\002\n\000R\016\020\031\032\0020\021X\004¢\006\002\n\000R\016\020\032\032\0020\033X\004¢\006\002\n\000R\024\020\034\032\b\022\004\022\0020\0350\006X\004¢\006\002\n\000R\016\020\036\032\0020\033X\004¢\006\002\n\000R\016\020\037\032\0020\033X\004¢\006\002\n\000R\016\020 \032\0020\033X\004¢\006\002\n\000R\016\020!\032\0020\033X\004¢\006\002\n\000R$\020\"\032\030\022\006\022\004\030\0010\f\022\004\022\0020$\022\006\022\004\030\0010\r0#X\004¢\006\002\n\000R\016\020%\032\0020\033X\004¢\006\002\n\000¨\006F"}, d2 = {"Lcom/intellij/ml/llm/core/statistics/llmc/LLMChatEventsLogger$Companion;", "", "()V", "CHAT_HISTORY", "Lcom/intellij/internal/statistic/eventLog/events/ObjectListEventField;", "CHAT_ROLE", "Lcom/intellij/internal/statistic/eventLog/events/EnumEventField;", "Lai/grazie/model/llm/chat/LLMChatRole;", "CLICKED_ALL_CHATS", "Lcom/intellij/internal/statistic/eventLog/events/EventId;", "CODE_COPIED", "Lcom/intellij/internal/statistic/eventLog/events/EventId2;", "Lcom/intellij/ml/llm/core/chat/session/ChatSession;", "", "CODE_INSERTED", "CODE_SNIPPET_INSERTED_AT_CARET", "CONTEXT", "Lcom/intellij/ml/llm/core/statistics/llmc/RequestPrivateData;", "EDIT_MESSAGE_CANCELED", "EDIT_MESSAGE_CANCELED_MOUSE", "Lcom/intellij/internal/statistic/eventLog/events/EventId1;", "EDIT_MESSAGE_FINISHED", "EDIT_MESSAGE_STARTED", "GROUP", "Lcom/intellij/internal/statistic/eventLog/EventLogGroup;", "MESSAGES", "MESSAGE_RATED", "Lcom/intellij/internal/statistic/eventLog/events/VarargEventId;", "MESSAGE_RATING", "Lcom/intellij/ml/llm/core/chat/messages/ChatMessageRating;", "MESSAGE_RECEIVED", "MESSAGE_RECEIVED_CANCELED", "MESSAGE_SENT", "NEW_CHAT_CREATED", "OPENED_CHAT_FROM_HISTORY", "Lcom/intellij/internal/statistic/eventLog/events/EventId3;", "Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$SourceAction;", "chatLogsSent", "isEnabled", "", "lodCodeSnippetInsertedAtCaret", "", "project", "Lcom/intellij/openapi/project/Project;", "chatSession", "message", "Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;", "logAllChatsClicked", "logChatOpened", "logCodeCopiedEvent", "session", "logCodeInserted", "logEditUserMessageCancelled", "logEditUserMessageCancelledWithMouse", "logEditUserMessageFinished", "logEditUserMessageStarted", "logMessageRated", "logMessageReceived", "userMessage", "duration", "", "logMessageReceivedCancelled", "logMessageReceivedInternal", "event", "logMessageSent", "logNewChatCreated", "logPrivateChatSessionDataIfNeeded", "toChatRole", "author", "Lcom/intellij/ml/llm/core/chat/messages/ChatMessageAuthor;", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nLLMChatEventsLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMChatEventsLogger.kt\ncom/intellij/ml/llm/core/statistics/llmc/LLMChatEventsLogger$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n1549#2:223\n1620#2,3:224\n1549#2:234\n1620#2,3:235\n37#3,2:227\n37#3,2:229\n37#3,2:232\n1#4:231\n*S KotlinDebug\n*F\n+ 1 LLMChatEventsLogger.kt\ncom/intellij/ml/llm/core/statistics/llmc/LLMChatEventsLogger$Companion\n*L\n97#1:223\n97#1:224,3\n148#1:234\n148#1:235,3\n102#1:227,2\n130#1:229,2\n142#1:232,2\n*E\n"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   private final boolean isEnabled() {
/*  80 */     return LLMSettingsManager.Companion.getInstance().isDataSharingEnabled();
/*     */   }
/*     */   private final LLMChatRole toChatRole(ChatMessageAuthor author) {
/*  83 */     if (author == ChatMessageAuthor.Assistant) return LLMChatRole.Assistant; 
/*  84 */     return LLMChatRole.User;
/*     */   }
/*     */   
/*     */   public final void logNewChatCreated(@NotNull Project project, @NotNull ChatSession chatSession) {
/*  88 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(chatSession, "chatSession"); if (!isEnabled())
/*     */       return; 
/*  90 */     ChatSessionStorage.SourceAction sourceAction = chatSession.getStatisticData().getSourceAction();
/*  91 */     EventPair[] arrayOfEventPair = new EventPair[3]; arrayOfEventPair[0] = AIAssistantChatEventLogger.Companion.getCHAT_UUID().with(chatSession); arrayOfEventPair[1] = AIAssistantChatEventLogger.Companion.getSOURCE_ACTION().with(sourceAction); arrayOfEventPair[2] = LLMChatEventsLogger.access$getCONTEXT$cp().with(chatSession.getContext()); LLMChatEventsLogger.access$getNEW_CHAT_CREATED$cp().log(project, arrayOfEventPair);
/*     */   } public final void logMessageReceived(@NotNull Project project, @NotNull ChatSession chatSession, @NotNull CompletableMessage userMessage, @Nullable CompletableMessage message, long duration) { Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(chatSession, "chatSession"); Intrinsics.checkNotNullParameter(userMessage, "userMessage");
/*     */     if (!isEnabled())
/*     */       return; 
/*  95 */     logMessageReceivedInternal(project, LLMChatEventsLogger.access$getMESSAGE_RECEIVED$cp(), chatSession, userMessage, message, duration); } public final void logMessageSent(@NotNull Project project, @NotNull ChatSession chatSession, @NotNull CompletableMessage message) { Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(chatSession, "chatSession"); Intrinsics.checkNotNullParameter(message, "message"); if (!isEnabled())
/*     */       return; 
/*  97 */     Iterable $this$map$iv = chatSession.getMessages(); int $i$f$map = 0;
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
/* 223 */     Iterable iterable1 = $this$map$iv; Collection<ObjectEventData> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 224 */     for (Object item$iv$iv : iterable1) {
/* 225 */       CompletableMessage completableMessage = (CompletableMessage)item$iv$iv; Collection<ObjectEventData> collection = destination$iv$iv; int $i$a$-map-LLMChatEventsLogger$Companion$logMessageSent$history$1 = 0; EventPair[] arrayOfEventPair1 = new EventPair[2]; arrayOfEventPair1[0] = LLMChatEventsLogger.access$getCHAT_ROLE$cp().with(LLMChatEventsLogger.Companion.toChatRole(completableMessage.getAuthor())); arrayOfEventPair1[1] = AIAssistantChatEventLogger.Companion.getMESSAGE_UUID().with(completableMessage.getUid()); collection.add(new ObjectEventData(arrayOfEventPair1));
/* 226 */     }  List history = (List)destination$iv$iv; EventPair[] arrayOfEventPair = new EventPair[6]; arrayOfEventPair[0] = AIAssistantChatEventLogger.Companion.getCHAT_UUID().with(chatSession); arrayOfEventPair[1] = LLMCommonEventFieldsKt.getPROFILE().with(OpenAIProfileIDs.INSTANCE.getGPT4().getId()); arrayOfEventPair[2] = AIAssistantChatEventLogger.Companion.getSOURCE_ACTION().with(chatSession.getStatisticData().getSourceAction()); arrayOfEventPair[3] = AIAssistantChatEventLogger.Companion.getMESSAGE_UUID().with(message.getUid()); arrayOfEventPair[4] = LLMCommonEventFieldsKt.getUSER_REQUEST().with(message.getText()); arrayOfEventPair[5] = LLMChatEventsLogger.access$getCHAT_HISTORY$cp().with(history); ArrayList data = CollectionsKt.arrayListOf((Object[])arrayOfEventPair); Collection $this$toTypedArray$iv = data; int $i$f$toTypedArray = 0;
/* 227 */     Collection thisCollection$iv = $this$toTypedArray$iv;
/* 228 */     arrayOfEventPair = (EventPair[])thisCollection$iv.toArray((Object[])new EventPair[0]); LLMChatEventsLogger.access$getMESSAGE_SENT$cp().log(project, Arrays.<EventPair>copyOf(arrayOfEventPair, arrayOfEventPair.length)); }
/* 229 */   public final void logMessageReceivedCancelled(@NotNull Project project, @NotNull ChatSession chatSession, @NotNull CompletableMessage userMessage, @Nullable CompletableMessage message, long duration) { Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(chatSession, "chatSession"); Intrinsics.checkNotNullParameter(userMessage, "userMessage"); if (!isEnabled()) return;  logMessageReceivedInternal(project, LLMChatEventsLogger.access$getMESSAGE_RECEIVED_CANCELED$cp(), chatSession, userMessage, message, duration); } private final void logMessageReceivedInternal(Project project, VarargEventId event, ChatSession chatSession, CompletableMessage userMessage, CompletableMessage message, long duration) { if (!isEnabled()) return;  EventPair[] arrayOfEventPair = new EventPair[3]; arrayOfEventPair[0] = AIAssistantChatEventLogger.Companion.getCHAT_UUID().with(chatSession); arrayOfEventPair[1] = EventFields.DurationMs.with(Long.valueOf(duration)); arrayOfEventPair[2] = AIAssistantChatEventLogger.Companion.getUSER_MESSAGE_UUID().with(userMessage.getUid()); ArrayList<EventPair> data = CollectionsKt.arrayListOf((Object[])arrayOfEventPair); if (message != null) { CompletableMessage it = message; int $i$a$-let-LLMChatEventsLogger$Companion$logMessageReceivedInternal$1 = 0; data.add(AIAssistantChatEventLogger.Companion.getMESSAGE_UUID().with(it.getUid())); data.add(LLMCommonEventFieldsKt.getRESPONSE().with(it.getText())); } else {  }  Collection<EventPair> $this$toTypedArray$iv = data; int $i$f$toTypedArray = 0; Collection<EventPair> thisCollection$iv = $this$toTypedArray$iv;
/* 230 */     arrayOfEventPair = thisCollection$iv.<EventPair>toArray(new EventPair[0]); event.log(project, Arrays.<EventPair>copyOf(arrayOfEventPair, arrayOfEventPair.length)); } public final void logMessageRated(@Nullable Project project, @Nullable ChatSession chatSession, @Nullable CompletableMessage message) { if (!isEnabled())
/* 231 */       return;  ArrayList<EventPair> data = new ArrayList(); if (chatSession != null) { ChatSession it = chatSession; int $i$a$-let-LLMChatEventsLogger$Companion$logMessageRated$1 = 0; data.add(AIAssistantChatEventLogger.Companion.getCHAT_UUID().with(chatSession)); } else {  }  if (message != null) { CompletableMessage it = message; int $i$a$-let-LLMChatEventsLogger$Companion$logMessageRated$2 = 0; data.add(AIAssistantChatEventLogger.Companion.getMESSAGE_UUID().with(message.getUid())); data.add(LLMChatEventsLogger.access$getMESSAGE_RATING$cp().with(message.getRating())); } else {  }
/* 232 */      Collection<EventPair> $this$toTypedArray$iv = data; int $i$f$toTypedArray = 0; Collection<EventPair> thisCollection$iv = $this$toTypedArray$iv;
/* 233 */     EventPair[] arrayOfEventPair = thisCollection$iv.<EventPair>toArray(new EventPair[0]); LLMChatEventsLogger.access$getMESSAGE_RATED$cp().log(project, Arrays.<EventPair>copyOf(arrayOfEventPair, arrayOfEventPair.length)); } public final void logPrivateChatSessionDataIfNeeded(@NotNull ChatSession chatSession, @NotNull Project project) { Intrinsics.checkNotNullParameter(chatSession, "chatSession"); Intrinsics.checkNotNullParameter(project, "project"); if (!isEnabled())
/* 234 */       return;  Iterable $this$map$iv = chatSession.getMessages(); int $i$f$map = 0; Iterable iterable1 = $this$map$iv; Collection<ChatSessionStorage.SerializedChatMessage> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 235 */     for (Object item$iv$iv : iterable1) {
/* 236 */       CompletableMessage completableMessage = (CompletableMessage)item$iv$iv; Collection<ChatSessionStorage.SerializedChatMessage> collection = destination$iv$iv; int $i$a$-map-LLMChatEventsLogger$Companion$logPrivateChatSessionDataIfNeeded$messages$1 = 0; collection.add(new ChatSessionStorage.SerializedChatMessage(completableMessage.getUid(), completableMessage.getText(), completableMessage.getAuthor(), completableMessage.getRating()));
/* 237 */     }  List messages = (List)destination$iv$iv;
/*     */     EventPair[] arrayOfEventPair = new EventPair[4];
/*     */     arrayOfEventPair[0] = AIAssistantChatEventLogger.Companion.getCHAT_UUID().with(chatSession);
/*     */     arrayOfEventPair[1] = AIAssistantChatEventLogger.Companion.getSOURCE_ACTION().with(chatSession.getStatisticData().getSourceAction());
/*     */     arrayOfEventPair[2] = LLMChatEventsLogger.access$getCONTEXT$cp().with(chatSession.getContext());
/*     */     arrayOfEventPair[3] = LLMChatEventsLogger.access$getMESSAGES$cp().with((new Gson()).toJson(messages).toString());
/*     */     LLMChatEventsLogger.access$getChatLogsSent$cp().log(project, arrayOfEventPair); }
/*     */ 
/*     */   
/*     */   @JvmStatic
/*     */   public final void logCodeCopiedEvent(@Nullable Project project, @NotNull ChatSession session, @NotNull CompletableMessage message) {
/*     */     Intrinsics.checkNotNullParameter(session, "session");
/*     */     Intrinsics.checkNotNullParameter(message, "message");
/*     */     if (!isEnabled())
/*     */       return; 
/*     */     LLMChatEventsLogger.access$getCODE_COPIED$cp().log(project, session, message.getUid());
/*     */   }
/*     */   
/*     */   @JvmStatic
/*     */   public final void logCodeInserted(@Nullable Project project) {
/*     */     if (!isEnabled())
/*     */       return; 
/*     */     LLMChatEventsLogger.access$getCODE_INSERTED$cp().log(project);
/*     */   }
/*     */   
/*     */   @JvmStatic
/*     */   public final void logEditUserMessageStarted(@NotNull Project project, @NotNull ChatSession chatSession, @NotNull CompletableMessage message) {
/*     */     Intrinsics.checkNotNullParameter(project, "project");
/*     */     Intrinsics.checkNotNullParameter(chatSession, "chatSession");
/*     */     Intrinsics.checkNotNullParameter(message, "message");
/*     */     if (!isEnabled())
/*     */       return; 
/*     */     LLMChatEventsLogger.access$getEDIT_MESSAGE_STARTED$cp().log(project, chatSession, message.getUid());
/*     */   }
/*     */   
/*     */   @JvmStatic
/*     */   public final void logEditUserMessageCancelled(@NotNull Project project, @NotNull ChatSession chatSession, @NotNull CompletableMessage message) {
/*     */     Intrinsics.checkNotNullParameter(project, "project");
/*     */     Intrinsics.checkNotNullParameter(chatSession, "chatSession");
/*     */     Intrinsics.checkNotNullParameter(message, "message");
/*     */     if (!isEnabled())
/*     */       return; 
/*     */     LLMChatEventsLogger.access$getEDIT_MESSAGE_CANCELED$cp().log(project, chatSession, message.getUid());
/*     */   }
/*     */   
/*     */   @JvmStatic
/*     */   public final void logEditUserMessageCancelledWithMouse(@NotNull Project project, @NotNull ChatSession chatSession) {
/*     */     Intrinsics.checkNotNullParameter(project, "project");
/*     */     Intrinsics.checkNotNullParameter(chatSession, "chatSession");
/*     */     if (!isEnabled())
/*     */       return; 
/*     */     LLMChatEventsLogger.access$getEDIT_MESSAGE_CANCELED_MOUSE$cp().log(project, chatSession);
/*     */   }
/*     */   
/*     */   @JvmStatic
/*     */   public final void logEditUserMessageFinished(@NotNull Project project, @NotNull ChatSession chatSession, @NotNull CompletableMessage message) {
/*     */     Intrinsics.checkNotNullParameter(project, "project");
/*     */     Intrinsics.checkNotNullParameter(chatSession, "chatSession");
/*     */     Intrinsics.checkNotNullParameter(message, "message");
/*     */     if (!isEnabled())
/*     */       return; 
/*     */     LLMChatEventsLogger.access$getEDIT_MESSAGE_FINISHED$cp().log(project, chatSession, message.getUid());
/*     */   }
/*     */   
/*     */   @JvmStatic
/*     */   public final void logAllChatsClicked(@Nullable Project project) {
/*     */     if (!isEnabled())
/*     */       return; 
/*     */     LLMChatEventsLogger.access$getCLICKED_ALL_CHATS$cp().log(project);
/*     */   }
/*     */   
/*     */   @JvmStatic
/*     */   public final void logChatOpened(@NotNull Project project, @NotNull ChatSession chatSession) {
/*     */     Intrinsics.checkNotNullParameter(project, "project");
/*     */     Intrinsics.checkNotNullParameter(chatSession, "chatSession");
/*     */     if (!isEnabled())
/*     */       return; 
/*     */     ChatSessionStorage.SourceAction sourceAction = chatSession.getStatisticData().getSourceAction();
/*     */     LLMChatEventsLogger.access$getOPENED_CHAT_FROM_HISTORY$cp().log(project, chatSession, sourceAction, chatSession.getContext());
/*     */   }
/*     */   
/*     */   @JvmStatic
/*     */   public final void lodCodeSnippetInsertedAtCaret(@NotNull Project project, @NotNull ChatSession chatSession, @NotNull CompletableMessage message) {
/*     */     Intrinsics.checkNotNullParameter(project, "project");
/*     */     Intrinsics.checkNotNullParameter(chatSession, "chatSession");
/*     */     Intrinsics.checkNotNullParameter(message, "message");
/*     */     LLMChatEventsLogger.access$getCODE_SNIPPET_INSERTED_AT_CARET$cp().log(project, chatSession, message.getUid());
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/statistics/llmc/LLMChatEventsLogger$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */