/*     */ package com.intellij.ml.llm.core.statistics.llmc;
/*     */ 
/*     */ import ai.grazie.model.llm.chat.LLMChatRole;
/*     */ import ai.grazie.model.llm.profile.OpenAIProfileIDs;
/*     */ import com.google.gson.Gson;
/*     */ import com.intellij.internal.statistic.eventLog.EventLogGroup;
/*     */ import com.intellij.internal.statistic.eventLog.events.EnumEventField;
/*     */ import com.intellij.internal.statistic.eventLog.events.EventField;
/*     */ import com.intellij.internal.statistic.eventLog.events.EventFields;
/*     */ import com.intellij.internal.statistic.eventLog.events.EventId;
/*     */ import com.intellij.internal.statistic.eventLog.events.EventId1;
/*     */ import com.intellij.internal.statistic.eventLog.events.EventId2;
/*     */ import com.intellij.internal.statistic.eventLog.events.EventId3;
/*     */ import com.intellij.internal.statistic.eventLog.events.EventPair;
/*     */ import com.intellij.internal.statistic.eventLog.events.ObjectEventData;
/*     */ import com.intellij.internal.statistic.eventLog.events.ObjectListEventField;
/*     */ import com.intellij.internal.statistic.eventLog.events.VarargEventId;
/*     */ import com.intellij.internal.statistic.service.fus.collectors.CounterUsagesCollector;
/*     */ import com.intellij.ml.llm.core.chat.messages.ChatMessageAuthor;
/*     */ import com.intellij.ml.llm.core.chat.messages.ChatMessageRating;
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
/*     */ import kotlin.jvm.functions.Function1;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\b\000\030\000 \0052\0020\001:\001\005B\005¢\006\002\020\002J\b\020\003\032\0020\004H\026¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/core/statistics/llmc/LLMChatEventsLogger;", "Lcom/intellij/internal/statistic/service/fus/collectors/CounterUsagesCollector;", "()V", "getGroup", "Lcom/intellij/internal/statistic/eventLog/EventLogGroup;", "Companion", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nLLMChatEventsLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMChatEventsLogger.kt\ncom/intellij/ml/llm/core/statistics/llmc/LLMChatEventsLogger\n+ 2 EventFields.kt\ncom/intellij/internal/statistic/eventLog/events/EventFields\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,222:1\n144#2,2:223\n144#2,2:225\n37#3,2:227\n*S KotlinDebug\n*F\n+ 1 LLMChatEventsLogger.kt\ncom/intellij/ml/llm/core/statistics/llmc/LLMChatEventsLogger\n*L\n29#1:223,2\n30#1:225,2\n36#1:227,2\n*E\n"})
/*     */ public final class LLMChatEventsLogger
/*     */   extends CounterUsagesCollector
/*     */ {
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\r\n\002\020\t\n\002\b\b\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\b\020&\032\0020'H\002J \020(\032\0020)2\006\020*\032\0020+2\006\020,\032\0020\f2\006\020-\032\0020.H\007J\022\020/\032\0020)2\b\020*\032\004\030\0010+H\007J\030\0200\032\0020)2\006\020*\032\0020+2\006\020,\032\0020\fH\007J\"\0201\032\0020)2\b\020*\032\004\030\0010+2\006\0202\032\0020\f2\006\020-\032\0020.H\007J\022\0203\032\0020)2\b\020*\032\004\030\0010+H\007J \0204\032\0020)2\006\020*\032\0020+2\006\020,\032\0020\f2\006\020-\032\0020.H\007J\030\0205\032\0020)2\006\020*\032\0020+2\006\020,\032\0020\fH\007J \0206\032\0020)2\006\020*\032\0020+2\006\020,\032\0020\f2\006\020-\032\0020.H\007J \0207\032\0020)2\006\020*\032\0020+2\006\020,\032\0020\f2\006\020-\032\0020.H\007J$\0208\032\0020)2\b\020*\032\004\030\0010+2\b\020,\032\004\030\0010\f2\b\020-\032\004\030\0010.J0\0209\032\0020)2\006\020*\032\0020+2\006\020,\032\0020\f2\006\020:\032\0020.2\b\020-\032\004\030\0010.2\006\020;\032\0020<J0\020=\032\0020)2\006\020*\032\0020+2\006\020,\032\0020\f2\006\020:\032\0020.2\b\020-\032\004\030\0010.2\006\020;\032\0020<J:\020>\032\0020)2\006\020*\032\0020+2\006\020?\032\0020\0332\006\020,\032\0020\f2\006\020:\032\0020.2\b\020-\032\004\030\0010.2\006\020;\032\0020<H\002J\036\020@\032\0020)2\006\020*\032\0020+2\006\020,\032\0020\f2\006\020-\032\0020.J\026\020A\032\0020)2\006\020*\032\0020+2\006\020,\032\0020\fJ\026\020B\032\0020)2\006\020,\032\0020\f2\006\020*\032\0020+J\020\020C\032\0020\0072\006\020D\032\0020EH\002R\016\020\003\032\0020\004X\004¢\006\002\n\000R\024\020\005\032\b\022\004\022\0020\0070\006X\004¢\006\002\n\000R\016\020\b\032\0020\tX\004¢\006\002\n\000R\036\020\n\032\022\022\006\022\004\030\0010\f\022\006\022\004\030\0010\r0\013X\004¢\006\002\n\000R\016\020\016\032\0020\tX\004¢\006\002\n\000R\036\020\017\032\022\022\006\022\004\030\0010\f\022\006\022\004\030\0010\r0\013X\004¢\006\002\n\000R\016\020\020\032\0020\021X\004¢\006\002\n\000R\036\020\022\032\022\022\006\022\004\030\0010\f\022\006\022\004\030\0010\r0\013X\004¢\006\002\n\000R\026\020\023\032\n\022\006\022\004\030\0010\f0\024X\004¢\006\002\n\000R\036\020\025\032\022\022\006\022\004\030\0010\f\022\006\022\004\030\0010\r0\013X\004¢\006\002\n\000R\036\020\026\032\022\022\006\022\004\030\0010\f\022\006\022\004\030\0010\r0\013X\004¢\006\002\n\000R\016\020\027\032\0020\030X\004¢\006\002\n\000R\016\020\031\032\0020\021X\004¢\006\002\n\000R\016\020\032\032\0020\033X\004¢\006\002\n\000R\024\020\034\032\b\022\004\022\0020\0350\006X\004¢\006\002\n\000R\016\020\036\032\0020\033X\004¢\006\002\n\000R\016\020\037\032\0020\033X\004¢\006\002\n\000R\016\020 \032\0020\033X\004¢\006\002\n\000R\016\020!\032\0020\033X\004¢\006\002\n\000R$\020\"\032\030\022\006\022\004\030\0010\f\022\004\022\0020$\022\006\022\004\030\0010\r0#X\004¢\006\002\n\000R\016\020%\032\0020\033X\004¢\006\002\n\000¨\006F"}, d2 = {"Lcom/intellij/ml/llm/core/statistics/llmc/LLMChatEventsLogger$Companion;", "", "()V", "CHAT_HISTORY", "Lcom/intellij/internal/statistic/eventLog/events/ObjectListEventField;", "CHAT_ROLE", "Lcom/intellij/internal/statistic/eventLog/events/EnumEventField;", "Lai/grazie/model/llm/chat/LLMChatRole;", "CLICKED_ALL_CHATS", "Lcom/intellij/internal/statistic/eventLog/events/EventId;", "CODE_COPIED", "Lcom/intellij/internal/statistic/eventLog/events/EventId2;", "Lcom/intellij/ml/llm/core/chat/session/ChatSession;", "", "CODE_INSERTED", "CODE_SNIPPET_INSERTED_AT_CARET", "CONTEXT", "Lcom/intellij/ml/llm/core/statistics/llmc/RequestPrivateData;", "EDIT_MESSAGE_CANCELED", "EDIT_MESSAGE_CANCELED_MOUSE", "Lcom/intellij/internal/statistic/eventLog/events/EventId1;", "EDIT_MESSAGE_FINISHED", "EDIT_MESSAGE_STARTED", "GROUP", "Lcom/intellij/internal/statistic/eventLog/EventLogGroup;", "MESSAGES", "MESSAGE_RATED", "Lcom/intellij/internal/statistic/eventLog/events/VarargEventId;", "MESSAGE_RATING", "Lcom/intellij/ml/llm/core/chat/messages/ChatMessageRating;", "MESSAGE_RECEIVED", "MESSAGE_RECEIVED_CANCELED", "MESSAGE_SENT", "NEW_CHAT_CREATED", "OPENED_CHAT_FROM_HISTORY", "Lcom/intellij/internal/statistic/eventLog/events/EventId3;", "Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$SourceAction;", "chatLogsSent", "isEnabled", "", "lodCodeSnippetInsertedAtCaret", "", "project", "Lcom/intellij/openapi/project/Project;", "chatSession", "message", "Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;", "logAllChatsClicked", "logChatOpened", "logCodeCopiedEvent", "session", "logCodeInserted", "logEditUserMessageCancelled", "logEditUserMessageCancelledWithMouse", "logEditUserMessageFinished", "logEditUserMessageStarted", "logMessageRated", "logMessageReceived", "userMessage", "duration", "", "logMessageReceivedCancelled", "logMessageReceivedInternal", "event", "logMessageSent", "logNewChatCreated", "logPrivateChatSessionDataIfNeeded", "toChatRole", "author", "Lcom/intellij/ml/llm/core/chat/messages/ChatMessageAuthor;", "intellij.ml.llm"})
/*     */   @SourceDebugExtension({"SMAP\nLLMChatEventsLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMChatEventsLogger.kt\ncom/intellij/ml/llm/core/statistics/llmc/LLMChatEventsLogger$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n1549#2:223\n1620#2,3:224\n1549#2:234\n1620#2,3:235\n37#3,2:227\n37#3,2:229\n37#3,2:232\n1#4:231\n*S KotlinDebug\n*F\n+ 1 LLMChatEventsLogger.kt\ncom/intellij/ml/llm/core/statistics/llmc/LLMChatEventsLogger$Companion\n*L\n97#1:223\n97#1:224,3\n148#1:234\n148#1:235,3\n102#1:227,2\n130#1:229,2\n142#1:232,2\n*E\n"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */     
/*     */     private final boolean isEnabled() {
/*  80 */       return LLMSettingsManager.Companion.getInstance().isDataSharingEnabled();
/*     */     }
/*     */     private final LLMChatRole toChatRole(ChatMessageAuthor author) {
/*  83 */       if (author == ChatMessageAuthor.Assistant) return LLMChatRole.Assistant; 
/*  84 */       return LLMChatRole.User;
/*     */     }
/*     */     
/*     */     public final void logNewChatCreated(@NotNull Project project, @NotNull ChatSession chatSession) {
/*  88 */       Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(chatSession, "chatSession"); if (!isEnabled())
/*     */         return; 
/*  90 */       ChatSessionStorage.SourceAction sourceAction = chatSession.getStatisticData().getSourceAction();
/*  91 */       EventPair[] arrayOfEventPair = new EventPair[3]; arrayOfEventPair[0] = AIAssistantChatEventLogger.Companion.getCHAT_UUID().with(chatSession); arrayOfEventPair[1] = AIAssistantChatEventLogger.Companion.getSOURCE_ACTION().with(sourceAction); arrayOfEventPair[2] = LLMChatEventsLogger.CONTEXT.with(chatSession.getContext()); LLMChatEventsLogger.NEW_CHAT_CREATED.log(project, arrayOfEventPair);
/*     */     } public final void logMessageReceived(@NotNull Project project, @NotNull ChatSession chatSession, @NotNull CompletableMessage userMessage, @Nullable CompletableMessage message, long duration) { Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(chatSession, "chatSession"); Intrinsics.checkNotNullParameter(userMessage, "userMessage");
/*     */       if (!isEnabled())
/*     */         return; 
/*  95 */       logMessageReceivedInternal(project, LLMChatEventsLogger.MESSAGE_RECEIVED, chatSession, userMessage, message, duration); } public final void logMessageSent(@NotNull Project project, @NotNull ChatSession chatSession, @NotNull CompletableMessage message) { Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(chatSession, "chatSession"); Intrinsics.checkNotNullParameter(message, "message"); if (!isEnabled())
/*     */         return; 
/*  97 */       Iterable $this$map$iv = chatSession.getMessages(); int $i$f$map = 0;
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
/* 223 */       Iterable iterable1 = $this$map$iv; Collection<ObjectEventData> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 224 */       for (Object item$iv$iv : iterable1) {
/* 225 */         CompletableMessage completableMessage = (CompletableMessage)item$iv$iv; Collection<ObjectEventData> collection = destination$iv$iv; int $i$a$-map-LLMChatEventsLogger$Companion$logMessageSent$history$1 = 0; EventPair[] arrayOfEventPair1 = new EventPair[2]; arrayOfEventPair1[0] = LLMChatEventsLogger.CHAT_ROLE.with(LLMChatEventsLogger.Companion.toChatRole(completableMessage.getAuthor())); arrayOfEventPair1[1] = AIAssistantChatEventLogger.Companion.getMESSAGE_UUID().with(completableMessage.getUid()); collection.add(new ObjectEventData(arrayOfEventPair1));
/* 226 */       }  List history = (List)destination$iv$iv; EventPair[] arrayOfEventPair = new EventPair[6]; arrayOfEventPair[0] = AIAssistantChatEventLogger.Companion.getCHAT_UUID().with(chatSession); arrayOfEventPair[1] = LLMCommonEventFieldsKt.getPROFILE().with(OpenAIProfileIDs.INSTANCE.getGPT4().getId()); arrayOfEventPair[2] = AIAssistantChatEventLogger.Companion.getSOURCE_ACTION().with(chatSession.getStatisticData().getSourceAction()); arrayOfEventPair[3] = AIAssistantChatEventLogger.Companion.getMESSAGE_UUID().with(message.getUid()); arrayOfEventPair[4] = LLMCommonEventFieldsKt.getUSER_REQUEST().with(message.getText()); arrayOfEventPair[5] = LLMChatEventsLogger.CHAT_HISTORY.with(history); ArrayList data = CollectionsKt.arrayListOf((Object[])arrayOfEventPair); Collection $this$toTypedArray$iv = data; int $i$f$toTypedArray = 0;
/* 227 */       Collection thisCollection$iv = $this$toTypedArray$iv;
/* 228 */       arrayOfEventPair = (EventPair[])thisCollection$iv.toArray((Object[])new EventPair[0]); LLMChatEventsLogger.MESSAGE_SENT.log(project, Arrays.copyOf(arrayOfEventPair, arrayOfEventPair.length)); }
/* 229 */     public final void logMessageReceivedCancelled(@NotNull Project project, @NotNull ChatSession chatSession, @NotNull CompletableMessage userMessage, @Nullable CompletableMessage message, long duration) { Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(chatSession, "chatSession"); Intrinsics.checkNotNullParameter(userMessage, "userMessage"); if (!isEnabled()) return;  logMessageReceivedInternal(project, LLMChatEventsLogger.MESSAGE_RECEIVED_CANCELED, chatSession, userMessage, message, duration); } private final void logMessageReceivedInternal(Project project, VarargEventId event, ChatSession chatSession, CompletableMessage userMessage, CompletableMessage message, long duration) { if (!isEnabled()) return;  EventPair[] arrayOfEventPair = new EventPair[3]; arrayOfEventPair[0] = AIAssistantChatEventLogger.Companion.getCHAT_UUID().with(chatSession); arrayOfEventPair[1] = EventFields.DurationMs.with(Long.valueOf(duration)); arrayOfEventPair[2] = AIAssistantChatEventLogger.Companion.getUSER_MESSAGE_UUID().with(userMessage.getUid()); ArrayList<EventPair> data = CollectionsKt.arrayListOf((Object[])arrayOfEventPair); if (message != null) { CompletableMessage it = message; int $i$a$-let-LLMChatEventsLogger$Companion$logMessageReceivedInternal$1 = 0; data.add(AIAssistantChatEventLogger.Companion.getMESSAGE_UUID().with(it.getUid())); data.add(LLMCommonEventFieldsKt.getRESPONSE().with(it.getText())); } else {  }  Collection<EventPair> $this$toTypedArray$iv = data; int $i$f$toTypedArray = 0; Collection<EventPair> thisCollection$iv = $this$toTypedArray$iv;
/* 230 */       arrayOfEventPair = thisCollection$iv.<EventPair>toArray(new EventPair[0]); event.log(project, Arrays.<EventPair>copyOf(arrayOfEventPair, arrayOfEventPair.length)); } public final void logMessageRated(@Nullable Project project, @Nullable ChatSession chatSession, @Nullable CompletableMessage message) { if (!isEnabled())
/* 231 */         return;  ArrayList<EventPair> data = new ArrayList(); if (chatSession != null) { ChatSession it = chatSession; int $i$a$-let-LLMChatEventsLogger$Companion$logMessageRated$1 = 0; data.add(AIAssistantChatEventLogger.Companion.getCHAT_UUID().with(chatSession)); } else {  }  if (message != null) { CompletableMessage it = message; int $i$a$-let-LLMChatEventsLogger$Companion$logMessageRated$2 = 0; data.add(AIAssistantChatEventLogger.Companion.getMESSAGE_UUID().with(message.getUid())); data.add(LLMChatEventsLogger.MESSAGE_RATING.with(message.getRating())); } else {  }
/* 232 */        Collection<EventPair> $this$toTypedArray$iv = data; int $i$f$toTypedArray = 0; Collection<EventPair> thisCollection$iv = $this$toTypedArray$iv;
/* 233 */       EventPair[] arrayOfEventPair = thisCollection$iv.<EventPair>toArray(new EventPair[0]); LLMChatEventsLogger.MESSAGE_RATED.log(project, Arrays.copyOf(arrayOfEventPair, arrayOfEventPair.length)); } public final void logPrivateChatSessionDataIfNeeded(@NotNull ChatSession chatSession, @NotNull Project project) { Intrinsics.checkNotNullParameter(chatSession, "chatSession"); Intrinsics.checkNotNullParameter(project, "project"); if (!isEnabled())
/* 234 */         return;  Iterable $this$map$iv = chatSession.getMessages(); int $i$f$map = 0; Iterable iterable1 = $this$map$iv; Collection<ChatSessionStorage.SerializedChatMessage> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 235 */       for (Object item$iv$iv : iterable1) {
/* 236 */         CompletableMessage completableMessage = (CompletableMessage)item$iv$iv; Collection<ChatSessionStorage.SerializedChatMessage> collection = destination$iv$iv; int $i$a$-map-LLMChatEventsLogger$Companion$logPrivateChatSessionDataIfNeeded$messages$1 = 0; collection.add(new ChatSessionStorage.SerializedChatMessage(completableMessage.getUid(), completableMessage.getText(), completableMessage.getAuthor(), completableMessage.getRating()));
/* 237 */       }  List messages = (List)destination$iv$iv;
/*     */       EventPair[] arrayOfEventPair = new EventPair[4];
/*     */       arrayOfEventPair[0] = AIAssistantChatEventLogger.Companion.getCHAT_UUID().with(chatSession);
/*     */       arrayOfEventPair[1] = AIAssistantChatEventLogger.Companion.getSOURCE_ACTION().with(chatSession.getStatisticData().getSourceAction());
/*     */       arrayOfEventPair[2] = LLMChatEventsLogger.CONTEXT.with(chatSession.getContext());
/*     */       arrayOfEventPair[3] = LLMChatEventsLogger.MESSAGES.with((new Gson()).toJson(messages).toString());
/*     */       LLMChatEventsLogger.chatLogsSent.log(project, arrayOfEventPair); }
/*     */ 
/*     */     
/*     */     @JvmStatic
/*     */     public final void logCodeCopiedEvent(@Nullable Project project, @NotNull ChatSession session, @NotNull CompletableMessage message) {
/*     */       Intrinsics.checkNotNullParameter(session, "session");
/*     */       Intrinsics.checkNotNullParameter(message, "message");
/*     */       if (!isEnabled())
/*     */         return; 
/*     */       LLMChatEventsLogger.CODE_COPIED.log(project, session, message.getUid());
/*     */     }
/*     */     
/*     */     @JvmStatic
/*     */     public final void logCodeInserted(@Nullable Project project) {
/*     */       if (!isEnabled())
/*     */         return; 
/*     */       LLMChatEventsLogger.CODE_INSERTED.log(project);
/*     */     }
/*     */     
/*     */     @JvmStatic
/*     */     public final void logEditUserMessageStarted(@NotNull Project project, @NotNull ChatSession chatSession, @NotNull CompletableMessage message) {
/*     */       Intrinsics.checkNotNullParameter(project, "project");
/*     */       Intrinsics.checkNotNullParameter(chatSession, "chatSession");
/*     */       Intrinsics.checkNotNullParameter(message, "message");
/*     */       if (!isEnabled())
/*     */         return; 
/*     */       LLMChatEventsLogger.EDIT_MESSAGE_STARTED.log(project, chatSession, message.getUid());
/*     */     }
/*     */     
/*     */     @JvmStatic
/*     */     public final void logEditUserMessageCancelled(@NotNull Project project, @NotNull ChatSession chatSession, @NotNull CompletableMessage message) {
/*     */       Intrinsics.checkNotNullParameter(project, "project");
/*     */       Intrinsics.checkNotNullParameter(chatSession, "chatSession");
/*     */       Intrinsics.checkNotNullParameter(message, "message");
/*     */       if (!isEnabled())
/*     */         return; 
/*     */       LLMChatEventsLogger.EDIT_MESSAGE_CANCELED.log(project, chatSession, message.getUid());
/*     */     }
/*     */     
/*     */     @JvmStatic
/*     */     public final void logEditUserMessageCancelledWithMouse(@NotNull Project project, @NotNull ChatSession chatSession) {
/*     */       Intrinsics.checkNotNullParameter(project, "project");
/*     */       Intrinsics.checkNotNullParameter(chatSession, "chatSession");
/*     */       if (!isEnabled())
/*     */         return; 
/*     */       LLMChatEventsLogger.EDIT_MESSAGE_CANCELED_MOUSE.log(project, chatSession);
/*     */     }
/*     */     
/*     */     @JvmStatic
/*     */     public final void logEditUserMessageFinished(@NotNull Project project, @NotNull ChatSession chatSession, @NotNull CompletableMessage message) {
/*     */       Intrinsics.checkNotNullParameter(project, "project");
/*     */       Intrinsics.checkNotNullParameter(chatSession, "chatSession");
/*     */       Intrinsics.checkNotNullParameter(message, "message");
/*     */       if (!isEnabled())
/*     */         return; 
/*     */       LLMChatEventsLogger.EDIT_MESSAGE_FINISHED.log(project, chatSession, message.getUid());
/*     */     }
/*     */     
/*     */     @JvmStatic
/*     */     public final void logAllChatsClicked(@Nullable Project project) {
/*     */       if (!isEnabled())
/*     */         return; 
/*     */       LLMChatEventsLogger.CLICKED_ALL_CHATS.log(project);
/*     */     }
/*     */     
/*     */     @JvmStatic
/*     */     public final void logChatOpened(@NotNull Project project, @NotNull ChatSession chatSession) {
/*     */       Intrinsics.checkNotNullParameter(project, "project");
/*     */       Intrinsics.checkNotNullParameter(chatSession, "chatSession");
/*     */       if (!isEnabled())
/*     */         return; 
/*     */       ChatSessionStorage.SourceAction sourceAction = chatSession.getStatisticData().getSourceAction();
/*     */       LLMChatEventsLogger.OPENED_CHAT_FROM_HISTORY.log(project, chatSession, sourceAction, chatSession.getContext());
/*     */     }
/*     */     
/*     */     @JvmStatic
/*     */     public final void lodCodeSnippetInsertedAtCaret(@NotNull Project project, @NotNull ChatSession chatSession, @NotNull CompletableMessage message) {
/*     */       Intrinsics.checkNotNullParameter(project, "project");
/*     */       Intrinsics.checkNotNullParameter(chatSession, "chatSession");
/*     */       Intrinsics.checkNotNullParameter(message, "message");
/*     */       LLMChatEventsLogger.CODE_SNIPPET_INSERTED_AT_CARET.log(project, chatSession, message.getUid());
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private static final EventLogGroup GROUP = new EventLogGroup("llm.chat.events", 3, "LLMC");
/*     */   @NotNull
/*     */   private static final RequestPrivateData CONTEXT = new RequestPrivateData("context");
/*     */   @NotNull
/*     */   private static final RequestPrivateData MESSAGES = new RequestPrivateData("messages");
/*     */   @NotNull
/*     */   private static final EnumEventField<LLMChatRole> CHAT_ROLE;
/*     */   @NotNull
/*     */   private static final EnumEventField<ChatMessageRating> MESSAGE_RATING;
/*     */   @NotNull
/*     */   private static final ObjectListEventField CHAT_HISTORY;
/*     */   @NotNull
/*     */   private static final VarargEventId NEW_CHAT_CREATED;
/*     */   @NotNull
/*     */   private static final VarargEventId MESSAGE_SENT;
/*     */   @NotNull
/*     */   private static final VarargEventId MESSAGE_RECEIVED;
/*     */   @NotNull
/*     */   private static final VarargEventId MESSAGE_RECEIVED_CANCELED;
/*     */   @NotNull
/*     */   private static final VarargEventId MESSAGE_RATED;
/*     */   
/*     */   static {
/*     */     EventFields eventFields1 = EventFields.INSTANCE;
/*     */     String name$iv = "role";
/*     */     Function1 transform$iv = eventFields1.getDefaultEnumTransform();
/*     */     int $i$f$Enum = 0;
/*     */     CHAT_ROLE = new EnumEventField(name$iv, LLMChatRole.class, transform$iv);
/*     */     EventFields $this$iv = EventFields.INSTANCE;
/*     */     name$iv = "score";
/*     */     transform$iv = $this$iv.getDefaultEnumTransform();
/*     */     $i$f$Enum = 0;
/*     */     MESSAGE_RATING = new EnumEventField(name$iv, ChatMessageRating.class, transform$iv);
/*     */     EventField[] arrayOfEventField2 = new EventField[2];
/*     */     arrayOfEventField2[0] = (EventField)CHAT_ROLE;
/*     */     arrayOfEventField2[1] = AIAssistantChatEventLogger.Companion.getMESSAGE_UUID();
/*     */     ArrayList arrayList = CollectionsKt.arrayListOf((Object[])arrayOfEventField2);
/*     */     int $i$f$toTypedArray = 0;
/*     */     Collection thisCollection$iv = arrayList;
/*     */     EventField[] arrayOfEventField1 = (EventField[])thisCollection$iv.toArray((Object[])new EventField[0]);
/*     */     CHAT_HISTORY = new ObjectListEventField("history", Arrays.<EventField>copyOf(arrayOfEventField1, arrayOfEventField1.length));
/*     */     arrayOfEventField1 = new EventField[3];
/*     */     arrayOfEventField1[0] = AIAssistantChatEventLogger.Companion.getCHAT_UUID();
/*     */     arrayOfEventField1[1] = (EventField)AIAssistantChatEventLogger.Companion.getSOURCE_ACTION();
/*     */     arrayOfEventField1[2] = (EventField)CONTEXT;
/*     */     NEW_CHAT_CREATED = GROUP.registerVarargEvent("new.chat.created", arrayOfEventField1);
/*     */     arrayOfEventField1 = new EventField[6];
/*     */     arrayOfEventField1[0] = AIAssistantChatEventLogger.Companion.getCHAT_UUID();
/*     */     arrayOfEventField1[1] = (EventField)LLMCommonEventFieldsKt.getPROFILE();
/*     */     arrayOfEventField1[2] = (EventField)AIAssistantChatEventLogger.Companion.getSOURCE_ACTION();
/*     */     arrayOfEventField1[3] = AIAssistantChatEventLogger.Companion.getMESSAGE_UUID();
/*     */     arrayOfEventField1[4] = (EventField)LLMCommonEventFieldsKt.getUSER_REQUEST();
/*     */     arrayOfEventField1[5] = (EventField)CHAT_HISTORY;
/*     */     MESSAGE_SENT = GROUP.registerVarargEvent("message.sent", arrayOfEventField1);
/*     */     arrayOfEventField1 = new EventField[5];
/*     */     arrayOfEventField1[0] = AIAssistantChatEventLogger.Companion.getCHAT_UUID();
/*     */     arrayOfEventField1[1] = AIAssistantChatEventLogger.Companion.getUSER_MESSAGE_UUID();
/*     */     arrayOfEventField1[2] = AIAssistantChatEventLogger.Companion.getMESSAGE_UUID();
/*     */     arrayOfEventField1[3] = (EventField)EventFields.DurationMs;
/*     */     arrayOfEventField1[4] = (EventField)LLMCommonEventFieldsKt.getRESPONSE();
/*     */     MESSAGE_RECEIVED = GROUP.registerVarargEvent("message.received", arrayOfEventField1);
/*     */     arrayOfEventField1 = new EventField[5];
/*     */     arrayOfEventField1[0] = AIAssistantChatEventLogger.Companion.getCHAT_UUID();
/*     */     arrayOfEventField1[1] = AIAssistantChatEventLogger.Companion.getUSER_MESSAGE_UUID();
/*     */     arrayOfEventField1[2] = AIAssistantChatEventLogger.Companion.getMESSAGE_UUID();
/*     */     arrayOfEventField1[3] = (EventField)EventFields.DurationMs;
/*     */     arrayOfEventField1[4] = (EventField)LLMCommonEventFieldsKt.getRESPONSE();
/*     */     MESSAGE_RECEIVED_CANCELED = GROUP.registerVarargEvent("message.received.canceled", arrayOfEventField1);
/*     */     arrayOfEventField1 = new EventField[3];
/*     */     arrayOfEventField1[0] = AIAssistantChatEventLogger.Companion.getCHAT_UUID();
/*     */     arrayOfEventField1[1] = AIAssistantChatEventLogger.Companion.getMESSAGE_UUID();
/*     */     arrayOfEventField1[2] = (EventField)MESSAGE_RATING;
/*     */     MESSAGE_RATED = GROUP.registerVarargEvent("message.scored", arrayOfEventField1);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final EventId2<ChatSession, String> CODE_COPIED = GROUP.registerEvent("code.copied", AIAssistantChatEventLogger.Companion.getCHAT_UUID(), AIAssistantChatEventLogger.Companion.getMESSAGE_UUID());
/*     */   @NotNull
/*     */   private static final EventId2<ChatSession, String> CODE_SNIPPET_INSERTED_AT_CARET = GROUP.registerEvent("code.snippet.inserted.at.caret", AIAssistantChatEventLogger.Companion.getCHAT_UUID(), AIAssistantChatEventLogger.Companion.getMESSAGE_UUID());
/*     */   @NotNull
/*     */   private static final EventId CODE_INSERTED = GROUP.registerEvent("code.inserted");
/*     */   @NotNull
/*     */   private static final EventId2<ChatSession, String> EDIT_MESSAGE_STARTED = GROUP.registerEvent("edit.user.message.started", AIAssistantChatEventLogger.Companion.getCHAT_UUID(), AIAssistantChatEventLogger.Companion.getMESSAGE_UUID());
/*     */   @NotNull
/*     */   private static final EventId2<ChatSession, String> EDIT_MESSAGE_FINISHED = GROUP.registerEvent("edit.usage.message.finished", AIAssistantChatEventLogger.Companion.getCHAT_UUID(), AIAssistantChatEventLogger.Companion.getMESSAGE_UUID());
/*     */   @NotNull
/*     */   private static final EventId2<ChatSession, String> EDIT_MESSAGE_CANCELED = GROUP.registerEvent("edit.user.message.cancelled", AIAssistantChatEventLogger.Companion.getCHAT_UUID(), AIAssistantChatEventLogger.Companion.getMESSAGE_UUID());
/*     */   @NotNull
/*     */   private static final EventId1<ChatSession> EDIT_MESSAGE_CANCELED_MOUSE = GROUP.registerEvent("edit.user.message.cancelled.with.mouse", AIAssistantChatEventLogger.Companion.getCHAT_UUID());
/*     */   @NotNull
/*     */   private static final EventId CLICKED_ALL_CHATS = GROUP.registerEvent("all.chats.clicked");
/*     */   @NotNull
/*     */   private static final EventId3<ChatSession, ChatSessionStorage.SourceAction, String> OPENED_CHAT_FROM_HISTORY = GROUP.registerEvent("chat.from.history.opened", AIAssistantChatEventLogger.Companion.getCHAT_UUID(), (EventField)AIAssistantChatEventLogger.Companion.getSOURCE_ACTION(), (EventField)CONTEXT);
/*     */   @NotNull
/*     */   private static final VarargEventId chatLogsSent;
/*     */   
/*     */   static {
/*     */     arrayOfEventField1 = new EventField[4];
/*     */     arrayOfEventField1[0] = AIAssistantChatEventLogger.Companion.getCHAT_UUID();
/*     */     arrayOfEventField1[1] = (EventField)AIAssistantChatEventLogger.Companion.getSOURCE_ACTION();
/*     */     arrayOfEventField1[2] = (EventField)CONTEXT;
/*     */     arrayOfEventField1[3] = (EventField)MESSAGES;
/*     */     chatLogsSent = GROUP.registerVarargEvent("chatLogsSent", arrayOfEventField1);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public EventLogGroup getGroup() {
/*     */     return GROUP;
/*     */   }
/*     */   
/*     */   @JvmStatic
/*     */   public static final void logCodeCopiedEvent(@Nullable Project project, @NotNull ChatSession session, @NotNull CompletableMessage message) {
/*     */     Companion.logCodeCopiedEvent(project, session, message);
/*     */   }
/*     */   
/*     */   @JvmStatic
/*     */   public static final void logCodeInserted(@Nullable Project project) {
/*     */     Companion.logCodeInserted(project);
/*     */   }
/*     */   
/*     */   @JvmStatic
/*     */   public static final void logEditUserMessageStarted(@NotNull Project project, @NotNull ChatSession chatSession, @NotNull CompletableMessage message) {
/*     */     Companion.logEditUserMessageStarted(project, chatSession, message);
/*     */   }
/*     */   
/*     */   @JvmStatic
/*     */   public static final void logEditUserMessageCancelled(@NotNull Project project, @NotNull ChatSession chatSession, @NotNull CompletableMessage message) {
/*     */     Companion.logEditUserMessageCancelled(project, chatSession, message);
/*     */   }
/*     */   
/*     */   @JvmStatic
/*     */   public static final void logEditUserMessageCancelledWithMouse(@NotNull Project project, @NotNull ChatSession chatSession) {
/*     */     Companion.logEditUserMessageCancelledWithMouse(project, chatSession);
/*     */   }
/*     */   
/*     */   @JvmStatic
/*     */   public static final void logEditUserMessageFinished(@NotNull Project project, @NotNull ChatSession chatSession, @NotNull CompletableMessage message) {
/*     */     Companion.logEditUserMessageFinished(project, chatSession, message);
/*     */   }
/*     */   
/*     */   @JvmStatic
/*     */   public static final void logAllChatsClicked(@Nullable Project project) {
/*     */     Companion.logAllChatsClicked(project);
/*     */   }
/*     */   
/*     */   @JvmStatic
/*     */   public static final void logChatOpened(@NotNull Project project, @NotNull ChatSession chatSession) {
/*     */     Companion.logChatOpened(project, chatSession);
/*     */   }
/*     */   
/*     */   @JvmStatic
/*     */   public static final void lodCodeSnippetInsertedAtCaret(@NotNull Project project, @NotNull ChatSession chatSession, @NotNull CompletableMessage message) {
/*     */     Companion.lodCodeSnippetInsertedAtCaret(project, chatSession, message);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/statistics/llmc/LLMChatEventsLogger.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */