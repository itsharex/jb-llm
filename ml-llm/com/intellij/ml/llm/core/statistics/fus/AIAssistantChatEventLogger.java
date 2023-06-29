/*     */ package com.intellij.ml.llm.core.statistics.fus;
/*     */ import com.intellij.internal.statistic.eventLog.events.EventField;
/*     */ import com.intellij.internal.statistic.eventLog.events.EventFields;
/*     */ import com.intellij.internal.statistic.eventLog.events.EventPair;
/*     */ import com.intellij.ml.llm.core.chat.messages.CompletableMessage;
/*     */ import com.intellij.ml.llm.core.chat.session.ChatSession;
/*     */ import com.intellij.ml.llm.core.statistics.llmc.LLMChatEventsLogger;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\b\000\030\000 \0052\0020\001:\001\005B\005¢\006\002\020\002J\b\020\003\032\0020\004H\026¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/core/statistics/fus/AIAssistantChatEventLogger;", "Lcom/intellij/internal/statistic/service/fus/collectors/CounterUsagesCollector;", "()V", "getGroup", "Lcom/intellij/internal/statistic/eventLog/EventLogGroup;", "Companion", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nAIAssistantChatEventLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIAssistantChatEventLogger.kt\ncom/intellij/ml/llm/core/statistics/fus/AIAssistantChatEventLogger\n+ 2 EventFields.kt\ncom/intellij/internal/statistic/eventLog/events/EventFields\n*L\n1#1,215:1\n144#2,2:216\n*S KotlinDebug\n*F\n+ 1 AIAssistantChatEventLogger.kt\ncom/intellij/ml/llm/core/statistics/fus/AIAssistantChatEventLogger\n*L\n33#1:216,2\n*E\n"})
/*     */ public final class AIAssistantChatEventLogger extends CounterUsagesCollector {
/*     */   @NotNull
/*     */   public EventLogGroup getGroup() {
/*  19 */     return GROUP;
/*     */   } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000¬\001\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\005\n\002\020!\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\004\n\002\020\b\n\000\n\002\020\013\n\002\b\t\n\002\020\t\n\002\b\005\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\032\0206\032\f\022\b\022\006\022\002\b\00308072\006\0209\032\0020\007H\002J\022\020:\032\0020;2\b\020<\032\004\030\0010=H\007J\030\020>\032\0020;2\006\020<\032\0020=2\006\0209\032\0020\007H\007J\"\020?\032\0020;2\b\020<\032\004\030\0010=2\006\020@\032\0020\0072\006\020A\032\0020BH\007J\022\020C\032\0020;2\b\020<\032\004\030\0010=H\007J \020D\032\0020;2\006\020<\032\0020=2\006\0209\032\0020\0072\006\020A\032\0020BH\007J0\020E\032\0020;2\006\020<\032\0020=2\006\0209\032\0020\0072\006\020A\032\0020B2\006\020F\032\0020G2\006\020H\032\0020IH\007J \020J\032\0020;2\006\020<\032\0020=2\006\0209\032\0020\0072\006\020A\032\0020BH\007J\030\020K\032\0020;2\006\020<\032\0020=2\006\0209\032\0020\007H\007J \020L\032\0020;2\006\020<\032\0020=2\006\0209\032\0020\0072\006\020A\032\0020BH\007J \020M\032\0020;2\006\020<\032\0020=2\006\0209\032\0020\0072\006\020A\032\0020BH\007J&\020N\032\0020;2\b\020<\032\004\030\0010=2\b\020@\032\004\030\0010\0072\b\020A\032\004\030\0010BH\007J2\020O\032\0020;2\006\020<\032\0020=2\006\0209\032\0020\0072\006\020P\032\0020B2\b\020Q\032\004\030\0010B2\006\020R\032\0020SH\007J0\020T\032\0020;2\006\020<\032\0020=2\006\0209\032\0020\0072\006\020R\032\0020S2\006\020P\032\0020B2\006\020Q\032\0020BH\007J \020U\032\0020;2\006\020<\032\0020=2\006\0209\032\0020\0072\006\020A\032\0020BH\007J\030\020V\032\0020;2\006\020<\032\0020=2\006\0209\032\0020\007H\007J\020\020W\032\0020;2\006\020<\032\0020=H\002R\016\020\003\032\0020\004X\004¢\006\002\n\000R\031\020\005\032\n\022\006\022\004\030\0010\0070\006¢\006\b\n\000\032\004\b\b\020\tR\016\020\n\032\0020\013X\004¢\006\002\n\000R\016\020\f\032\0020\rX\004¢\006\002\n\000R\024\020\016\032\b\022\004\022\0020\0200\017X\004¢\006\002\n\000R\031\020\021\032\n\022\006\022\004\030\0010\0220\006¢\006\b\n\000\032\004\b\023\020\tR\016\020\024\032\0020\025X\004¢\006\002\n\000R\016\020\026\032\0020\027X\004¢\006\002\n\000R\016\020\030\032\0020\027X\004¢\006\002\n\000R\016\020\031\032\0020\025X\004¢\006\002\n\000R\016\020\032\032\0020\027X\004¢\006\002\n\000R\027\020\033\032\b\022\004\022\0020\0340\017¢\006\b\n\000\032\004\b\035\020\036R\031\020\037\032\n\022\006\022\004\030\0010\0220\006¢\006\b\n\000\032\004\b \020\tR\016\020!\032\0020\"X\004¢\006\002\n\000R\016\020#\032\0020$X\004¢\006\002\n\000R\026\020%\032\n\022\006\022\004\030\0010\0070&X\004¢\006\002\n\000R\036\020'\032\022\022\006\022\004\030\0010\007\022\006\022\004\030\0010\0220(X\004¢\006\002\n\000R\016\020)\032\0020\"X\004¢\006\002\n\000R\036\020*\032\022\022\006\022\004\030\0010\007\022\006\022\004\030\0010\0220(X\004¢\006\002\n\000R\016\020+\032\0020$X\004¢\006\002\n\000R\036\020,\032\022\022\006\022\004\030\0010\007\022\006\022\004\030\0010\0220(X\004¢\006\002\n\000R\026\020-\032\n\022\006\022\004\030\0010\0070&X\004¢\006\002\n\000R\036\020.\032\022\022\006\022\004\030\0010\007\022\006\022\004\030\0010\0220(X\004¢\006\002\n\000R\036\020/\032\022\022\006\022\004\030\0010\007\022\006\022\004\030\0010\0220(X\004¢\006\002\n\000R$\0200\032\030\022\006\022\004\030\0010\007\022\006\022\004\030\0010\022\022\004\022\0020\02001X\004¢\006\002\n\000R\016\0202\032\0020$X\004¢\006\002\n\000R\016\0203\032\0020$X\004¢\006\002\n\000R\016\0204\032\0020$X\004¢\006\002\n\000R\016\0205\032\0020$X\004¢\006\002\n\000¨\006X"}, d2 = {"Lcom/intellij/ml/llm/core/statistics/fus/AIAssistantChatEventLogger$Companion;", "", "()V", "CHAT_KIND", "Lcom/intellij/internal/statistic/eventLog/events/ClassEventField;", "CHAT_UUID", "Lcom/intellij/internal/statistic/eventLog/events/EventField;", "Lcom/intellij/ml/llm/core/chat/session/ChatSession;", "getCHAT_UUID", "()Lcom/intellij/internal/statistic/eventLog/events/EventField;", "GROUP", "Lcom/intellij/internal/statistic/eventLog/EventLogGroup;", "IS_COLLAPSED", "Lcom/intellij/internal/statistic/eventLog/events/BooleanEventField;", "MESSAGE_RATING", "Lcom/intellij/internal/statistic/eventLog/events/EnumEventField;", "Lcom/intellij/ml/llm/core/chat/messages/ChatMessageRating;", "MESSAGE_UUID", "", "getMESSAGE_UUID", "NUMBER_OF_CHARACTERS", "Lcom/intellij/internal/statistic/eventLog/events/RoundedIntEventField;", "NUMBER_OF_DISLIKED_MESSAGES", "Lcom/intellij/internal/statistic/eventLog/events/IntEventField;", "NUMBER_OF_LIKED_MESSAGES", "NUMBER_OF_LINES", "NUMBER_OF_MESSAGES", "SOURCE_ACTION", "Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$SourceAction;", "getSOURCE_ACTION", "()Lcom/intellij/internal/statistic/eventLog/events/EnumEventField;", "USER_MESSAGE_UUID", "getUSER_MESSAGE_UUID", "allChatsClicked", "Lcom/intellij/internal/statistic/eventLog/events/EventId;", "assistantChatSummarySent", "Lcom/intellij/internal/statistic/eventLog/events/VarargEventId;", "chatFromHistoryOpened", "Lcom/intellij/internal/statistic/eventLog/events/EventId1;", "codeCopied", "Lcom/intellij/internal/statistic/eventLog/events/EventId2;", "codeInserted", "codeSnippetInsertedAtCaret", "codeSnippetPresentationChanged", "editUserMessageCancelled", "editUserMessageCancelledWithMouse", "editUserMessageFinished", "editUserMessageStarted", "messageReacted", "Lcom/intellij/internal/statistic/eventLog/events/EventId3;", "messageReceived", "messageReceivingCancelled", "messageSent", "newChatCreated", "getChatData", "", "Lcom/intellij/internal/statistic/eventLog/events/EventPair;", "chatSession", "logAllChatsClicked", "", "project", "Lcom/intellij/openapi/project/Project;", "logChatOpened", "logCodeCopiedEvent", "session", "message", "Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;", "logCodeInserted", "logCodeInsertedAtCaret", "logCodeSnippetPresentationChanged", "numberOfLines", "", "isCollapsed", "", "logEditUserMessageCancelled", "logEditUserMessageCancelledWithMouse", "logEditUserMessageFinished", "logEditUserMessageStarted", "logMessageReacted", "logMessageReceived", "userMessage", "receivedMessage", "duration", "", "logMessageReceivingCancelled", "logMessageSent", "logNewChatCreated", "syncChatEvaluationData", "intellij.ml.llm"})
/*     */   @SourceDebugExtension({"SMAP\nAIAssistantChatEventLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIAssistantChatEventLogger.kt\ncom/intellij/ml/llm/core/statistics/fus/AIAssistantChatEventLogger$Companion\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,215:1\n29#2,3:216\n1855#3,2:219\n766#3:221\n857#3,2:222\n766#3:224\n857#3,2:225\n*S KotlinDebug\n*F\n+ 1 AIAssistantChatEventLogger.kt\ncom/intellij/ml/llm/core/statistics/fus/AIAssistantChatEventLogger$Companion\n*L\n93#1:216,3\n93#1:219,2\n209#1:221\n209#1:222,2\n210#1:224\n210#1:225,2\n*E\n"})
/*     */   public static final class Companion { private Companion() {}
/*     */     @NotNull
/*     */     public final EventField<ChatSession> getCHAT_UUID() {
/*  25 */       return AIAssistantChatEventLogger.CHAT_UUID;
/*     */     }
/*     */     @NotNull
/*  28 */     public final EventField<String> getUSER_MESSAGE_UUID() { return AIAssistantChatEventLogger.USER_MESSAGE_UUID; } @NotNull
/*  29 */     public final EventField<String> getMESSAGE_UUID() { return AIAssistantChatEventLogger.MESSAGE_UUID; }
/*     */     
/*     */     @NotNull
/*     */     public final EnumEventField<ChatSessionStorage.SourceAction> getSOURCE_ACTION() {
/*  33 */       return AIAssistantChatEventLogger.SOURCE_ACTION;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @JvmStatic
/*     */     public final void logNewChatCreated(@NotNull Project project, @NotNull ChatSession chatSession) {
/*  80 */       Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(chatSession, "chatSession"); EventPair[] arrayOfEventPair = new EventPair[2]; arrayOfEventPair[0] = getCHAT_UUID().with(chatSession); arrayOfEventPair[1] = getSOURCE_ACTION().with(chatSession.getStatisticData().getSourceAction()); AIAssistantChatEventLogger.newChatCreated.log(project, arrayOfEventPair);
/*  81 */       LLMChatEventsLogger.Companion.logNewChatCreated(project, chatSession);
/*     */       
/*  83 */       syncChatEvaluationData(project);
/*     */     }
/*     */     
/*     */     @JvmStatic
/*     */     public final void logChatOpened(@NotNull Project project, @NotNull ChatSession chatSession) {
/*  88 */       Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(chatSession, "chatSession"); AIAssistantChatEventLogger.chatFromHistoryOpened.log(project, chatSession);
/*  89 */       LLMChatEventsLogger.Companion.logChatOpened(project, chatSession);
/*     */     }
/*     */     
/*     */     private final void syncChatEvaluationData(Project project) {
/*  93 */       ComponentManager $this$service$iv = (ComponentManager)project; int $i$f$service = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 216 */       Class<ChatSessionHost> serviceClass$iv = ChatSessionHost.class;
/* 217 */       Object object = $this$service$iv.getService(serviceClass$iv); if (object == null) throw new IllegalStateException((
/* 218 */             "Cannot find service " + serviceClass$iv.getName() + " in " + $this$service$iv + " (classloader=" + serviceClass$iv.getClassLoader()).toString());  Iterable $this$forEach$iv = ((ChatSessionHost)object).getAllChats(); int $i$f$forEach = 0;
/* 219 */       Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); ChatSession chat = (ChatSession)element$iv; int $i$a$-forEach-AIAssistantChatEventLogger$Companion$syncChatEvaluationData$1 = 0; if (chat.getStatisticData().getLastTimestamp() != chat.getTimestamp() && !chat.getMessages().isEmpty()) { LLMChatEventsLogger.Companion.logPrivateChatSessionDataIfNeeded(chat, project); AIAssistantChatEventLogger.assistantChatSummarySent.log(project, AIAssistantChatEventLogger.Companion.getChatData(chat)); chat.getStatisticData().setLastTimestamp(chat.getTimestamp()); }  }
/*     */     
/* 221 */     } @JvmStatic public final void logCodeCopiedEvent(@Nullable Project project, @NotNull ChatSession session, @NotNull CompletableMessage message) { Intrinsics.checkNotNullParameter(session, "session"); Intrinsics.checkNotNullParameter(message, "message"); AIAssistantChatEventLogger.codeCopied.log(project, session, message.getUid()); LLMChatEventsLogger.Companion.logCodeCopiedEvent(project, session, message); } private final List<EventPair<?>> getChatData(ChatSession chatSession) { EventPair[] arrayOfEventPair1 = new EventPair[5]; arrayOfEventPair1[0] = getCHAT_UUID().with(chatSession); arrayOfEventPair1[1] = getSOURCE_ACTION().with(chatSession.getStatisticData().getSourceAction()); arrayOfEventPair1[2] = AIAssistantChatEventLogger.NUMBER_OF_MESSAGES.with(Integer.valueOf(chatSession.getMessages().size())); List list1 = chatSession.getMessages(); IntEventField intEventField = AIAssistantChatEventLogger.NUMBER_OF_LIKED_MESSAGES; byte b = 3; EventPair[] arrayOfEventPair2 = arrayOfEventPair1; int $i$f$filter = 0; List list2 = list1; Collection<Object> collection1 = new ArrayList(); int $i$f$filterTo = 0;
/* 222 */       for (Object element$iv$iv : list2) { CompletableMessage it = (CompletableMessage)element$iv$iv; int $i$a$-filter-AIAssistantChatEventLogger$Companion$getChatData$1 = 0; if ((it.getRating() == ChatMessageRating.Like)) collection1.add(element$iv$iv);  }
/* 223 */        List list3 = (List)collection1; arrayOfEventPair2[b] = intEventField.with(Integer.valueOf(list3.size())); Iterable $this$filter$iv = chatSession.getMessages(); intEventField = AIAssistantChatEventLogger.NUMBER_OF_DISLIKED_MESSAGES; b = 4; arrayOfEventPair2 = arrayOfEventPair1; $i$f$filter = 0;
/* 224 */       Iterable $this$filterTo$iv$iv = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); $i$f$filterTo = 0;
/* 225 */       for (Object element$iv$iv : $this$filterTo$iv$iv) { CompletableMessage it = (CompletableMessage)element$iv$iv; int $i$a$-filter-AIAssistantChatEventLogger$Companion$getChatData$2 = 0; if ((it.getRating() == ChatMessageRating.Dislike)) destination$iv$iv.add(element$iv$iv);  }
/* 226 */        list3 = (List)destination$iv$iv;
/*     */       arrayOfEventPair2[b] = intEventField.with(Integer.valueOf(list3.size()));
/*     */       return CollectionsKt.arrayListOf((Object[])arrayOfEventPair1); }
/*     */ 
/*     */     
/*     */     @JvmStatic
/*     */     public final void logCodeInsertedAtCaret(@NotNull Project project, @NotNull ChatSession chatSession, @NotNull CompletableMessage message) {
/*     */       Intrinsics.checkNotNullParameter(project, "project");
/*     */       Intrinsics.checkNotNullParameter(chatSession, "chatSession");
/*     */       Intrinsics.checkNotNullParameter(message, "message");
/*     */       AIAssistantChatEventLogger.codeSnippetInsertedAtCaret.log(project, chatSession, message.getUid());
/*     */       LLMChatEventsLogger.Companion.lodCodeSnippetInsertedAtCaret(project, chatSession, message);
/*     */     }
/*     */     
/*     */     @JvmStatic
/*     */     public final void logCodeInserted(@Nullable Project project) {
/*     */       AIAssistantChatEventLogger.codeInserted.log(project);
/*     */       LLMChatEventsLogger.Companion.logCodeInserted(project);
/*     */     }
/*     */     
/*     */     @JvmStatic
/*     */     public final void logEditUserMessageStarted(@NotNull Project project, @NotNull ChatSession chatSession, @NotNull CompletableMessage message) {
/*     */       Intrinsics.checkNotNullParameter(project, "project");
/*     */       Intrinsics.checkNotNullParameter(chatSession, "chatSession");
/*     */       Intrinsics.checkNotNullParameter(message, "message");
/*     */       AIAssistantChatEventLogger.editUserMessageStarted.log(project, chatSession, message.getUid());
/*     */       LLMChatEventsLogger.Companion.logEditUserMessageStarted(project, chatSession, message);
/*     */     }
/*     */     
/*     */     @JvmStatic
/*     */     public final void logEditUserMessageCancelled(@NotNull Project project, @NotNull ChatSession chatSession, @NotNull CompletableMessage message) {
/*     */       Intrinsics.checkNotNullParameter(project, "project");
/*     */       Intrinsics.checkNotNullParameter(chatSession, "chatSession");
/*     */       Intrinsics.checkNotNullParameter(message, "message");
/*     */       AIAssistantChatEventLogger.editUserMessageCancelled.log(project, chatSession, message.getUid());
/*     */       LLMChatEventsLogger.Companion.logEditUserMessageCancelled(project, chatSession, message);
/*     */     }
/*     */     
/*     */     @JvmStatic
/*     */     public final void logEditUserMessageCancelledWithMouse(@NotNull Project project, @NotNull ChatSession chatSession) {
/*     */       Intrinsics.checkNotNullParameter(project, "project");
/*     */       Intrinsics.checkNotNullParameter(chatSession, "chatSession");
/*     */       AIAssistantChatEventLogger.editUserMessageCancelledWithMouse.log(project, chatSession);
/*     */       LLMChatEventsLogger.Companion.logEditUserMessageCancelledWithMouse(project, chatSession);
/*     */     }
/*     */     
/*     */     @JvmStatic
/*     */     public final void logEditUserMessageFinished(@NotNull Project project, @NotNull ChatSession chatSession, @NotNull CompletableMessage message) {
/*     */       Intrinsics.checkNotNullParameter(project, "project");
/*     */       Intrinsics.checkNotNullParameter(chatSession, "chatSession");
/*     */       Intrinsics.checkNotNullParameter(message, "message");
/*     */       AIAssistantChatEventLogger.editUserMessageFinished.log(project, chatSession, message.getUid());
/*     */       LLMChatEventsLogger.Companion.logEditUserMessageFinished(project, chatSession, message);
/*     */     }
/*     */     
/*     */     @JvmStatic
/*     */     public final void logMessageSent(@NotNull Project project, @NotNull ChatSession chatSession, @NotNull CompletableMessage message) {
/*     */       Intrinsics.checkNotNullParameter(project, "project");
/*     */       Intrinsics.checkNotNullParameter(chatSession, "chatSession");
/*     */       Intrinsics.checkNotNullParameter(message, "message");
/*     */       String text = StringsKt.trim(message.getText()).toString();
/*     */       EventPair[] arrayOfEventPair = new EventPair[5];
/*     */       arrayOfEventPair[0] = getCHAT_UUID().with(chatSession);
/*     */       arrayOfEventPair[1] = getMESSAGE_UUID().with(message.getUid());
/*     */       arrayOfEventPair[2] = getSOURCE_ACTION().with(chatSession.getStatisticData().getSourceAction());
/*     */       arrayOfEventPair[3] = AIAssistantChatEventLogger.NUMBER_OF_CHARACTERS.with(Integer.valueOf(text.length()));
/*     */       arrayOfEventPair[4] = AIAssistantChatEventLogger.NUMBER_OF_LINES.with(Integer.valueOf(StringsKt.lines(text).size()));
/*     */       AIAssistantChatEventLogger.messageSent.log(project, arrayOfEventPair);
/*     */       LLMChatEventsLogger.Companion.logMessageSent(project, chatSession, message);
/*     */     }
/*     */     
/*     */     @JvmStatic
/*     */     public final void logMessageReceived(@NotNull Project project, @NotNull ChatSession chatSession, @NotNull CompletableMessage userMessage, @Nullable CompletableMessage receivedMessage, long duration) {
/*     */       Intrinsics.checkNotNullParameter(project, "project");
/*     */       Intrinsics.checkNotNullParameter(chatSession, "chatSession");
/*     */       Intrinsics.checkNotNullParameter(userMessage, "userMessage");
/*     */       if (receivedMessage == null || receivedMessage.getText() == null)
/*     */         receivedMessage.getText(); 
/*     */       String text = "";
/*     */       EventPair[] arrayOfEventPair = new EventPair[6];
/*     */       arrayOfEventPair[0] = getCHAT_UUID().with(chatSession);
/*     */       arrayOfEventPair[1] = getUSER_MESSAGE_UUID().with(userMessage.getUid());
/*     */       arrayOfEventPair[2] = getMESSAGE_UUID().with((receivedMessage != null) ? receivedMessage.getUid() : null);
/*     */       arrayOfEventPair[3] = AIAssistantChatEventLogger.NUMBER_OF_CHARACTERS.with(Integer.valueOf(text.length()));
/*     */       arrayOfEventPair[4] = AIAssistantChatEventLogger.NUMBER_OF_LINES.with(Integer.valueOf(StringsKt.lines(text).size()));
/*     */       arrayOfEventPair[5] = EventFields.DurationMs.with(Long.valueOf(duration));
/*     */       AIAssistantChatEventLogger.messageReceived.log(project, arrayOfEventPair);
/*     */       LLMChatEventsLogger.Companion.logMessageReceived(project, chatSession, userMessage, receivedMessage, duration);
/*     */     }
/*     */     
/*     */     @JvmStatic
/*     */     public final void logCodeSnippetPresentationChanged(@NotNull Project project, @NotNull ChatSession chatSession, @NotNull CompletableMessage message, int numberOfLines, boolean isCollapsed) {
/*     */       Intrinsics.checkNotNullParameter(project, "project");
/*     */       Intrinsics.checkNotNullParameter(chatSession, "chatSession");
/*     */       Intrinsics.checkNotNullParameter(message, "message");
/*     */       EventPair[] arrayOfEventPair = new EventPair[4];
/*     */       arrayOfEventPair[0] = getCHAT_UUID().with(chatSession);
/*     */       arrayOfEventPair[1] = getMESSAGE_UUID().with(message.getUid());
/*     */       arrayOfEventPair[2] = AIAssistantChatEventLogger.NUMBER_OF_LINES.with(Integer.valueOf(numberOfLines));
/*     */       arrayOfEventPair[3] = AIAssistantChatEventLogger.IS_COLLAPSED.with(Boolean.valueOf(isCollapsed));
/*     */       AIAssistantChatEventLogger.codeSnippetPresentationChanged.log(project, arrayOfEventPair);
/*     */     }
/*     */     
/*     */     @JvmStatic
/*     */     public final void logMessageReceivingCancelled(@NotNull Project project, @NotNull ChatSession chatSession, long duration, @NotNull CompletableMessage userMessage, @NotNull CompletableMessage receivedMessage) {
/*     */       Intrinsics.checkNotNullParameter(project, "project");
/*     */       Intrinsics.checkNotNullParameter(chatSession, "chatSession");
/*     */       Intrinsics.checkNotNullParameter(userMessage, "userMessage");
/*     */       Intrinsics.checkNotNullParameter(receivedMessage, "receivedMessage");
/*     */       EventPair[] arrayOfEventPair = new EventPair[6];
/*     */       arrayOfEventPair[0] = AIAssistantChatEventLogger.NUMBER_OF_CHARACTERS.with(Integer.valueOf(receivedMessage.getText().length()));
/*     */       arrayOfEventPair[1] = getCHAT_UUID().with(chatSession);
/*     */       arrayOfEventPair[2] = getUSER_MESSAGE_UUID().with(userMessage.getUid());
/*     */       arrayOfEventPair[3] = getMESSAGE_UUID().with(receivedMessage.getUid());
/*     */       arrayOfEventPair[4] = AIAssistantChatEventLogger.NUMBER_OF_LINES.with(Integer.valueOf(StringsKt.lines(receivedMessage.getText()).size()));
/*     */       arrayOfEventPair[5] = EventFields.DurationMs.with(Long.valueOf(duration));
/*     */       AIAssistantChatEventLogger.messageReceivingCancelled.log(project, arrayOfEventPair);
/*     */       LLMChatEventsLogger.Companion.logMessageReceivedCancelled(project, chatSession, userMessage, receivedMessage, duration);
/*     */     }
/*     */     
/*     */     @JvmStatic
/*     */     public final void logAllChatsClicked(@Nullable Project project) {
/*     */       AIAssistantChatEventLogger.allChatsClicked.log(project);
/*     */       LLMChatEventsLogger.Companion.logAllChatsClicked(project);
/*     */     }
/*     */     
/*     */     @JvmStatic
/*     */     public final void logMessageReacted(@Nullable Project project, @Nullable ChatSession session, @Nullable CompletableMessage message) {
/*     */       CompletableMessage it = message;
/*     */       int $i$a$-let-AIAssistantChatEventLogger$Companion$logMessageReacted$1 = 0;
/*     */       AIAssistantChatEventLogger.messageReacted.log(project, session, it.getUid(), it.getRating());
/*     */       LLMChatEventsLogger.Companion.logMessageRated(project, session, it);
/*     */     } }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private static final EventLogGroup GROUP = new EventLogGroup("llm.chat", 13, null, 4, null);
/*     */   @NotNull
/*     */   private static final EventField<ChatSession> CHAT_UUID = EventFields.DatedShortAnonymizedField("chat_session_id", AIAssistantChatEventLogger$Companion$CHAT_UUID$1.INSTANCE);
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\026\n\000\n\002\030\002\n\002\020\t\n\002\020\016\n\000\n\002\030\002\n\000\020\000\032\020\022\004\022\0020\002\022\006\022\004\030\0010\0030\0012\b\020\004\032\004\030\0010\005H\n¢\006\002\b\006"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "session", "Lcom/intellij/ml/llm/core/chat/session/ChatSession;", "invoke"})
/*     */   @SourceDebugExtension({"SMAP\nAIAssistantChatEventLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIAssistantChatEventLogger.kt\ncom/intellij/ml/llm/core/statistics/fus/AIAssistantChatEventLogger$Companion$CHAT_UUID$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,215:1\n1#2:216\n*E\n"})
/*     */   static final class AIAssistantChatEventLogger$Companion$CHAT_UUID$1 extends Lambda implements Function1<ChatSession, Pair<? extends Long, ? extends String>> {
/*     */     public static final AIAssistantChatEventLogger$Companion$CHAT_UUID$1 INSTANCE = new AIAssistantChatEventLogger$Companion$CHAT_UUID$1();
/*     */     
/*     */     @NotNull
/*     */     public final Pair<Long, String> invoke(@Nullable ChatSession session) {
/*     */       if (session != null) {
/*     */         ChatSession it = session;
/*     */         int $i$a$-let-AIAssistantChatEventLogger$Companion$CHAT_UUID$1$1 = 0;
/*     */         if (TuplesKt.to(Long.valueOf(session.getTimestamp()), session.getUid()) == null) {
/*     */           TuplesKt.to(Long.valueOf(session.getTimestamp()), session.getUid());
/*     */           return TuplesKt.to(Long.valueOf(System.currentTimeMillis()), null);
/*     */         } 
/*     */         return TuplesKt.to(Long.valueOf(session.getTimestamp()), session.getUid());
/*     */       } 
/*     */       TuplesKt.to(Long.valueOf(session.getTimestamp()), session.getUid());
/*     */       return TuplesKt.to(Long.valueOf(System.currentTimeMillis()), null);
/*     */     }
/*     */     
/*     */     AIAssistantChatEventLogger$Companion$CHAT_UUID$1() {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   @NotNull
/*     */   private static final EventField<String> USER_MESSAGE_UUID = EventFields.ShortAnonymizedField("user_message_id");
/*     */   @NotNull
/*     */   private static final EventField<String> MESSAGE_UUID = EventFields.ShortAnonymizedField("message_id");
/*     */   @NotNull
/*     */   private static final RoundedIntEventField NUMBER_OF_CHARACTERS = EventFields.RoundedInt("number_of_characters");
/*     */   @NotNull
/*     */   private static final RoundedIntEventField NUMBER_OF_LINES = EventFields.RoundedInt("number_of_lines");
/*     */   @NotNull
/*     */   private static final EnumEventField<ChatSessionStorage.SourceAction> SOURCE_ACTION;
/*     */   
/*     */   static {
/*     */     EventFields eventFields = EventFields.INSTANCE;
/*     */     String name$iv = "source_action";
/*     */     Function1 transform$iv = eventFields.getDefaultEnumTransform();
/*     */     int $i$f$Enum = 0;
/*     */     SOURCE_ACTION = new EnumEventField(name$iv, ChatSessionStorage.SourceAction.class, transform$iv);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final EnumEventField<ChatMessageRating> MESSAGE_RATING = EventFields.Enum$default("rating", ChatMessageRating.class, null, 4, null);
/*     */   @NotNull
/*     */   private static final BooleanEventField IS_COLLAPSED = EventFields.Boolean("is_collapsed");
/*     */   @NotNull
/*     */   private static final ClassEventField CHAT_KIND = EventFields.Class("chat_kind");
/*     */   @NotNull
/*     */   private static final IntEventField NUMBER_OF_MESSAGES = EventFields.Int("number_of_messages");
/*     */   @NotNull
/*     */   private static final IntEventField NUMBER_OF_LIKED_MESSAGES = EventFields.Int("number_of_liked_message");
/*     */   @NotNull
/*     */   private static final IntEventField NUMBER_OF_DISLIKED_MESSAGES = EventFields.Int("number_of_disliked_message");
/*     */   @NotNull
/*     */   private static final VarargEventId newChatCreated;
/*     */   @NotNull
/*     */   private static final VarargEventId messageSent;
/*     */   @NotNull
/*     */   private static final VarargEventId messageReceived;
/*     */   @NotNull
/*     */   private static final VarargEventId messageReceivingCancelled;
/*     */   
/*     */   static {
/*     */     EventField[] arrayOfEventField = new EventField[4];
/*     */     arrayOfEventField[0] = CHAT_UUID;
/*     */     arrayOfEventField[1] = (EventField)CHAT_KIND;
/*     */     arrayOfEventField[2] = (EventField)SOURCE_ACTION;
/*     */     arrayOfEventField[3] = (EventField)EventFields.StartTime;
/*     */     newChatCreated = GROUP.registerVarargEvent("new.chat.created", arrayOfEventField);
/*     */     arrayOfEventField = new EventField[5];
/*     */     arrayOfEventField[0] = CHAT_UUID;
/*     */     arrayOfEventField[1] = MESSAGE_UUID;
/*     */     arrayOfEventField[2] = (EventField)SOURCE_ACTION;
/*     */     arrayOfEventField[3] = (EventField)NUMBER_OF_CHARACTERS;
/*     */     arrayOfEventField[4] = (EventField)NUMBER_OF_LINES;
/*     */     messageSent = GROUP.registerVarargEvent("message.sent", arrayOfEventField);
/*     */     arrayOfEventField = new EventField[6];
/*     */     arrayOfEventField[0] = CHAT_UUID;
/*     */     arrayOfEventField[1] = USER_MESSAGE_UUID;
/*     */     arrayOfEventField[2] = MESSAGE_UUID;
/*     */     arrayOfEventField[3] = (EventField)NUMBER_OF_CHARACTERS;
/*     */     arrayOfEventField[4] = (EventField)NUMBER_OF_LINES;
/*     */     arrayOfEventField[5] = (EventField)EventFields.DurationMs;
/*     */     messageReceived = GROUP.registerVarargEvent("message.received", arrayOfEventField);
/*     */     arrayOfEventField = new EventField[6];
/*     */     arrayOfEventField[0] = CHAT_UUID;
/*     */     arrayOfEventField[1] = USER_MESSAGE_UUID;
/*     */     arrayOfEventField[2] = MESSAGE_UUID;
/*     */     arrayOfEventField[3] = (EventField)NUMBER_OF_CHARACTERS;
/*     */     arrayOfEventField[4] = (EventField)NUMBER_OF_LINES;
/*     */     arrayOfEventField[5] = (EventField)EventFields.DurationMs;
/*     */     messageReceivingCancelled = GROUP.registerVarargEvent("message.receiving.cancelled", arrayOfEventField);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final EventId2<ChatSession, String> codeCopied = GROUP.registerEvent("code.copied", CHAT_UUID, MESSAGE_UUID);
/*     */   @NotNull
/*     */   private static final EventId2<ChatSession, String> codeSnippetInsertedAtCaret = GROUP.registerEvent("code.snippet.inserted.at.caret", CHAT_UUID, MESSAGE_UUID);
/*     */   @NotNull
/*     */   private static final EventId codeInserted = GROUP.registerEvent("code.inserted");
/*     */   @NotNull
/*     */   private static final VarargEventId codeSnippetPresentationChanged;
/*     */   
/*     */   static {
/*     */     arrayOfEventField = new EventField[4];
/*     */     arrayOfEventField[0] = CHAT_UUID;
/*     */     arrayOfEventField[1] = MESSAGE_UUID;
/*     */     arrayOfEventField[2] = (EventField)NUMBER_OF_LINES;
/*     */     arrayOfEventField[3] = (EventField)IS_COLLAPSED;
/*     */     codeSnippetPresentationChanged = GROUP.registerVarargEvent("code.snippet.presentation.changed", arrayOfEventField);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final EventId3<ChatSession, String, ChatMessageRating> messageReacted = GROUP.registerEvent("message.reacted", CHAT_UUID, MESSAGE_UUID, (EventField)MESSAGE_RATING);
/*     */   @NotNull
/*     */   private static final EventId2<ChatSession, String> editUserMessageStarted = GROUP.registerEvent("edit.user.message.started", CHAT_UUID, MESSAGE_UUID);
/*     */   @NotNull
/*     */   private static final EventId2<ChatSession, String> editUserMessageFinished = GROUP.registerEvent("edit.usage.message.finished", CHAT_UUID, MESSAGE_UUID);
/*     */   @NotNull
/*     */   private static final EventId2<ChatSession, String> editUserMessageCancelled = GROUP.registerEvent("edit.user.message.cancelled", CHAT_UUID, MESSAGE_UUID);
/*     */   @NotNull
/*     */   private static final EventId1<ChatSession> editUserMessageCancelledWithMouse = GROUP.registerEvent("edit.user.message.cancelled.with.mouse", CHAT_UUID);
/*     */   @NotNull
/*     */   private static final EventId allChatsClicked = GROUP.registerEvent("all.chats.clicked");
/*     */   @NotNull
/*     */   private static final EventId1<ChatSession> chatFromHistoryOpened = GROUP.registerEvent("chat.from.history.opened", CHAT_UUID);
/*     */   @NotNull
/*     */   private static final VarargEventId assistantChatSummarySent;
/*     */   
/*     */   static {
/*     */     arrayOfEventField = new EventField[5];
/*     */     arrayOfEventField[0] = CHAT_UUID;
/*     */     arrayOfEventField[1] = (EventField)SOURCE_ACTION;
/*     */     arrayOfEventField[2] = (EventField)NUMBER_OF_MESSAGES;
/*     */     arrayOfEventField[3] = (EventField)NUMBER_OF_LIKED_MESSAGES;
/*     */     arrayOfEventField[4] = (EventField)NUMBER_OF_DISLIKED_MESSAGES;
/*     */     assistantChatSummarySent = GROUP.registerVarargEvent("assistant.chat.summary.sent", arrayOfEventField);
/*     */   }
/*     */   
/*     */   @JvmStatic
/*     */   public static final void logNewChatCreated(@NotNull Project project, @NotNull ChatSession chatSession) {
/*     */     Companion.logNewChatCreated(project, chatSession);
/*     */   }
/*     */   
/*     */   @JvmStatic
/*     */   public static final void logChatOpened(@NotNull Project project, @NotNull ChatSession chatSession) {
/*     */     Companion.logChatOpened(project, chatSession);
/*     */   }
/*     */   
/*     */   @JvmStatic
/*     */   public static final void logCodeCopiedEvent(@Nullable Project project, @NotNull ChatSession session, @NotNull CompletableMessage message) {
/*     */     Companion.logCodeCopiedEvent(project, session, message);
/*     */   }
/*     */   
/*     */   @JvmStatic
/*     */   public static final void logCodeInsertedAtCaret(@NotNull Project project, @NotNull ChatSession chatSession, @NotNull CompletableMessage message) {
/*     */     Companion.logCodeInsertedAtCaret(project, chatSession, message);
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
/*     */   public static final void logMessageSent(@NotNull Project project, @NotNull ChatSession chatSession, @NotNull CompletableMessage message) {
/*     */     Companion.logMessageSent(project, chatSession, message);
/*     */   }
/*     */   
/*     */   @JvmStatic
/*     */   public static final void logMessageReceived(@NotNull Project project, @NotNull ChatSession chatSession, @NotNull CompletableMessage userMessage, @Nullable CompletableMessage receivedMessage, long duration) {
/*     */     Companion.logMessageReceived(project, chatSession, userMessage, receivedMessage, duration);
/*     */   }
/*     */   
/*     */   @JvmStatic
/*     */   public static final void logCodeSnippetPresentationChanged(@NotNull Project project, @NotNull ChatSession chatSession, @NotNull CompletableMessage message, int numberOfLines, boolean isCollapsed) {
/*     */     Companion.logCodeSnippetPresentationChanged(project, chatSession, message, numberOfLines, isCollapsed);
/*     */   }
/*     */   
/*     */   @JvmStatic
/*     */   public static final void logMessageReceivingCancelled(@NotNull Project project, @NotNull ChatSession chatSession, long duration, @NotNull CompletableMessage userMessage, @NotNull CompletableMessage receivedMessage) {
/*     */     Companion.logMessageReceivingCancelled(project, chatSession, duration, userMessage, receivedMessage);
/*     */   }
/*     */   
/*     */   @JvmStatic
/*     */   public static final void logAllChatsClicked(@Nullable Project project) {
/*     */     Companion.logAllChatsClicked(project);
/*     */   }
/*     */   
/*     */   @JvmStatic
/*     */   public static final void logMessageReacted(@Nullable Project project, @Nullable ChatSession session, @Nullable CompletableMessage message) {
/*     */     Companion.logMessageReacted(project, session, message);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/statistics/fus/AIAssistantChatEventLogger.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */