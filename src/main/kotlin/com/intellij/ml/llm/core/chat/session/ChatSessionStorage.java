/*    */ package com.intellij.ml.llm.core.chat.session;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Service({Service.Level.PROJECT})
/*    */ @State(name = "ChatSessionStateTemp", storages = {@Storage("$PRODUCT_WORKSPACE_FILE$")})
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020!\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\006\n\002\020\002\n\002\b\t\b\007\030\000 \0242\b\022\004\022\0020\0020\001:\007\023\024\025\026\027\030\031B\005¢\006\002\020\003J\b\020\017\032\0020\002H\026J\020\020\020\032\0020\0212\006\020\022\032\0020\002H\026R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\bR\032\020\t\032\0020\nX\016¢\006\016\n\000\032\004\b\013\020\f\"\004\b\r\020\016¨\006\032"}, d2 = {"Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage;", "Lcom/intellij/openapi/components/PersistentStateComponent;", "Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$State;", "()V", "chatSessions", "", "Lcom/intellij/ml/llm/core/chat/session/ChatSession;", "getChatSessions", "()Ljava/util/List;", "currentChatIndex", "", "getCurrentChatIndex", "()I", "setCurrentChatIndex", "(I)V", "getState", "loadState", "", "state", "ChatStatisticInformation", "Companion", "SerializedChat", "SerializedChatMessage", "SerializedChatTitle", "SourceAction", "State", "intellij.ml.llm"})
/*    */ public final class ChatSessionStorage implements PersistentStateComponent<ChatSessionStorage.State> {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$Companion;", "", "()V", "getInstance", "Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage;", "project", "Lcom/intellij/openapi/project/Project;", "intellij.ml.llm"})
/*    */   @SourceDebugExtension({"SMAP\nChatSessionStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatSessionStorage.kt\ncom/intellij/ml/llm/core/chat/session/ChatSessionStorage$Companion\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,95:1\n29#2,3:96\n*S KotlinDebug\n*F\n+ 1 ChatSessionStorage.kt\ncom/intellij/ml/llm/core/chat/session/ChatSessionStorage$Companion\n*L\n16#1:96,3\n*E\n"})
/*    */   public static final class Companion {
/*    */     @NotNull
/*    */     public final ChatSessionStorage getInstance(@NotNull Project project) {
/* 16 */       Intrinsics.checkNotNullParameter(project, "project"); ComponentManager $this$service$iv = (ComponentManager)project; int $i$f$service = 0;
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
/* 96 */       Class<ChatSessionStorage> serviceClass$iv = ChatSessionStorage.class;
/* 97 */       Object object = $this$service$iv.getService(serviceClass$iv); if (object == null) throw new IllegalStateException((
/* 98 */             "Cannot find service " + serviceClass$iv.getName() + " in " + $this$service$iv + " (classloader=" + serviceClass$iv.getClassLoader()).toString()); 
/*    */       return (ChatSessionStorage)object;
/*    */     }
/*    */     
/*    */     private Companion() {}
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private final List<ChatSession> chatSessions = new ArrayList<>();
/*    */   private int currentChatIndex;
/*    */   
/*    */   @NotNull
/*    */   public final List<ChatSession> getChatSessions() {
/*    */     return this.chatSessions;
/*    */   }
/*    */   
/*    */   public final int getCurrentChatIndex() {
/*    */     return this.currentChatIndex;
/*    */   }
/*    */   
/*    */   public final void setCurrentChatIndex(int <set-?>) {
/*    */     this.currentChatIndex = <set-?>;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\f\b\001\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005j\002\b\006j\002\b\007j\002\b\bj\002\b\tj\002\b\nj\002\b\013j\002\b\f¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$SourceAction;", "", "(Ljava/lang/String;I)V", "UNKNOWN", "NEW_CHAT", "EXPLAIN_CODE_INTENTION", "FIND_PROBLEMS_INTENTION", "REFACTOR_THIS", "UNKNOWN_CHAT_INTENTION", "LOAD_STATE", "RUNTIME_ERROR_EXPLANATION", "UNITY_CREATE_NEW_FILE", "UNITY_GENERATE_CODE", "intellij.ml.llm"})
/*    */   public enum SourceAction {
/*    */     UNKNOWN, NEW_CHAT, EXPLAIN_CODE_INTENTION, FIND_PROBLEMS_INTENTION, REFACTOR_THIS, UNKNOWN_CHAT_INTENTION, LOAD_STATE, RUNTIME_ERROR_EXPLANATION, UNITY_CREATE_NEW_FILE, UNITY_GENERATE_CODE;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\t\n\002\b\020\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B#\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007¢\006\002\020\bJ\t\020\023\032\0020\003HÆ\003J\t\020\024\032\0020\005HÆ\003J\t\020\025\032\0020\007HÆ\003J'\020\026\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\007HÆ\001J\023\020\027\032\0020\0302\b\020\031\032\004\030\0010\001HÖ\003J\t\020\032\032\0020\033HÖ\001J\t\020\034\032\0020\003HÖ\001R\032\020\004\032\0020\005X\016¢\006\016\n\000\032\004\b\t\020\n\"\004\b\013\020\fR\032\020\006\032\0020\007X\016¢\006\016\n\000\032\004\b\r\020\016\"\004\b\017\020\020R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\021\020\022¨\006\035"}, d2 = {"Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$ChatStatisticInformation;", "", "uid", "", "sourceActionType", "Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$SourceAction;", "timestamp", "", "(Ljava/lang/String;Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$SourceAction;J)V", "getSourceActionType", "()Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$SourceAction;", "setSourceActionType", "(Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$SourceAction;)V", "getTimestamp", "()J", "setTimestamp", "(J)V", "getUid", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "intellij.ml.llm"})
/*    */   public static final class ChatStatisticInformation {
/*    */     @NotNull
/*    */     private final String uid;
/*    */     @NotNull
/*    */     private ChatSessionStorage.SourceAction sourceActionType;
/*    */     private long timestamp;
/*    */     
/*    */     public ChatStatisticInformation(@NotNull String uid, @NotNull ChatSessionStorage.SourceAction sourceActionType, long timestamp) {
/*    */       this.uid = uid;
/*    */       this.sourceActionType = sourceActionType;
/*    */       this.timestamp = timestamp;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String getUid() {
/*    */       return this.uid;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final ChatSessionStorage.SourceAction getSourceActionType() {
/*    */       return this.sourceActionType;
/*    */     }
/*    */     
/*    */     public final void setSourceActionType(@NotNull ChatSessionStorage.SourceAction <set-?>) {
/*    */       Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*    */       this.sourceActionType = <set-?>;
/*    */     }
/*    */     
/*    */     public final long getTimestamp() {
/*    */       return this.timestamp;
/*    */     }
/*    */     
/*    */     public final void setTimestamp(long <set-?>) {
/*    */       this.timestamp = <set-?>;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String component1() {
/*    */       return this.uid;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final ChatSessionStorage.SourceAction component2() {
/*    */       return this.sourceActionType;
/*    */     }
/*    */     
/*    */     public final long component3() {
/*    */       return this.timestamp;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final ChatStatisticInformation copy(@NotNull String uid, @NotNull ChatSessionStorage.SourceAction sourceActionType, long timestamp) {
/*    */       Intrinsics.checkNotNullParameter(uid, "uid");
/*    */       Intrinsics.checkNotNullParameter(sourceActionType, "sourceActionType");
/*    */       return new ChatStatisticInformation(uid, sourceActionType, timestamp);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "ChatStatisticInformation(uid=" + this.uid + ", sourceActionType=" + this.sourceActionType + ", timestamp=" + this.timestamp + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       result = this.uid.hashCode();
/*    */       result = result * 31 + this.sourceActionType.hashCode();
/*    */       return result * 31 + Long.hashCode(this.timestamp);
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof ChatStatisticInformation))
/*    */         return false; 
/*    */       ChatStatisticInformation chatStatisticInformation = (ChatStatisticInformation)other;
/*    */       return !Intrinsics.areEqual(this.uid, chatStatisticInformation.uid) ? false : ((this.sourceActionType != chatStatisticInformation.sourceActionType) ? false : (!(this.timestamp != chatStatisticInformation.timestamp)));
/*    */     }
/*    */     
/*    */     public ChatStatisticInformation() {
/*    */       this(null, null, 0L, 7, null);
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\013\n\002\b\016\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\031\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005¢\006\002\020\006J\t\020\016\032\0020\003HÆ\003J\t\020\017\032\0020\005HÆ\003J\035\020\020\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\021\032\0020\0052\b\020\022\032\004\030\0010\001HÖ\003J\t\020\023\032\0020\024HÖ\001J\t\020\025\032\0020\003HÖ\001R\032\020\004\032\0020\005X\016¢\006\016\n\000\032\004\b\004\020\007\"\004\b\b\020\tR\032\020\002\032\0020\003X\016¢\006\016\n\000\032\004\b\n\020\013\"\004\b\f\020\r¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$SerializedChatTitle;", "", "text", "", "isCustom", "", "(Ljava/lang/String;Z)V", "()Z", "setCustom", "(Z)V", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "intellij.ml.llm"})
/*    */   public static final class SerializedChatTitle {
/*    */     @NotNull
/*    */     private String text;
/*    */     private boolean isCustom;
/*    */     
/*    */     public SerializedChatTitle(@NotNull String text, boolean isCustom) {
/*    */       this.text = text;
/*    */       this.isCustom = isCustom;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String getText() {
/*    */       return this.text;
/*    */     }
/*    */     
/*    */     public final void setText(@NotNull String <set-?>) {
/*    */       Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*    */       this.text = <set-?>;
/*    */     }
/*    */     
/*    */     public final boolean isCustom() {
/*    */       return this.isCustom;
/*    */     }
/*    */     
/*    */     public final void setCustom(boolean <set-?>) {
/*    */       this.isCustom = <set-?>;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String component1() {
/*    */       return this.text;
/*    */     }
/*    */     
/*    */     public final boolean component2() {
/*    */       return this.isCustom;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final SerializedChatTitle copy(@NotNull String text, boolean isCustom) {
/*    */       Intrinsics.checkNotNullParameter(text, "text");
/*    */       return new SerializedChatTitle(text, isCustom);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "SerializedChatTitle(text=" + this.text + ", isCustom=" + this.isCustom + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       result = this.text.hashCode();
/*    */       if (this.isCustom);
/*    */       return result * 31 + 1;
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof SerializedChatTitle))
/*    */         return false; 
/*    */       SerializedChatTitle serializedChatTitle = (SerializedChatTitle)other;
/*    */       return !Intrinsics.areEqual(this.text, serializedChatTitle.text) ? false : (!(this.isCustom != serializedChatTitle.isCustom));
/*    */     }
/*    */     
/*    */     public SerializedChatTitle() {
/*    */       this(null, false, 3, null);
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\002\n\002\020\t\n\000\n\002\030\002\n\002\b\037\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001BI\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\016\b\002\020\006\032\b\022\004\022\0020\b0\007\022\n\b\002\020\t\032\004\030\0010\003\022\b\b\002\020\n\032\0020\013\022\b\b\002\020\f\032\0020\r¢\006\002\020\016J\t\020%\032\0020\003HÆ\003J\t\020&\032\0020\005HÆ\003J\017\020'\032\b\022\004\022\0020\b0\007HÆ\003J\013\020(\032\004\030\0010\003HÆ\003J\t\020)\032\0020\013HÆ\003J\t\020*\032\0020\rHÆ\003JM\020+\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\016\b\002\020\006\032\b\022\004\022\0020\b0\0072\n\b\002\020\t\032\004\030\0010\0032\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\rHÆ\001J\023\020,\032\0020-2\b\020.\032\004\030\0010\001HÖ\003J\t\020/\032\00200HÖ\001J\t\0201\032\0020\003HÖ\001R\034\020\t\032\004\030\0010\003X\016¢\006\016\n\000\032\004\b\017\020\020\"\004\b\021\020\022R \020\006\032\b\022\004\022\0020\b0\007X\016¢\006\016\n\000\032\004\b\023\020\024\"\004\b\025\020\026R\032\020\n\032\0020\013X\016¢\006\016\n\000\032\004\b\027\020\030\"\004\b\031\020\032R\032\020\f\032\0020\rX\016¢\006\016\n\000\032\004\b\033\020\034\"\004\b\035\020\036R\032\020\004\032\0020\005X\016¢\006\016\n\000\032\004\b\037\020 \"\004\b!\020\"R\032\020\002\032\0020\003X\016¢\006\016\n\000\032\004\b#\020\020\"\004\b$\020\022¨\0062"}, d2 = {"Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$SerializedChat;", "", "uid", "", "title", "Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$SerializedChatTitle;", "messages", "", "Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$SerializedChatMessage;", "context", "modifiedAt", "", "statisticInformation", "Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$ChatStatisticInformation;", "(Ljava/lang/String;Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$SerializedChatTitle;Ljava/util/List;Ljava/lang/String;JLcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$ChatStatisticInformation;)V", "getContext", "()Ljava/lang/String;", "setContext", "(Ljava/lang/String;)V", "getMessages", "()Ljava/util/List;", "setMessages", "(Ljava/util/List;)V", "getModifiedAt", "()J", "setModifiedAt", "(J)V", "getStatisticInformation", "()Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$ChatStatisticInformation;", "setStatisticInformation", "(Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$ChatStatisticInformation;)V", "getTitle", "()Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$SerializedChatTitle;", "setTitle", "(Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$SerializedChatTitle;)V", "getUid", "setUid", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "intellij.ml.llm"})
/*    */   public static final class SerializedChat {
/*    */     @NotNull
/*    */     private String uid;
/*    */     @NotNull
/*    */     private ChatSessionStorage.SerializedChatTitle title;
/*    */     @NotNull
/*    */     private List<ChatSessionStorage.SerializedChatMessage> messages;
/*    */     @Nullable
/*    */     private String context;
/*    */     private long modifiedAt;
/*    */     @NotNull
/*    */     private ChatSessionStorage.ChatStatisticInformation statisticInformation;
/*    */     
/*    */     public SerializedChat(@NotNull String uid, @NotNull ChatSessionStorage.SerializedChatTitle title, @NotNull List<ChatSessionStorage.SerializedChatMessage> messages, @Nullable String context, long modifiedAt, @NotNull ChatSessionStorage.ChatStatisticInformation statisticInformation) {
/*    */       this.uid = uid;
/*    */       this.title = title;
/*    */       this.messages = messages;
/*    */       this.context = context;
/*    */       this.modifiedAt = modifiedAt;
/*    */       this.statisticInformation = statisticInformation;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String getUid() {
/*    */       return this.uid;
/*    */     }
/*    */     
/*    */     public final void setUid(@NotNull String <set-?>) {
/*    */       Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*    */       this.uid = <set-?>;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final ChatSessionStorage.SerializedChatTitle getTitle() {
/*    */       return this.title;
/*    */     }
/*    */     
/*    */     public final void setTitle(@NotNull ChatSessionStorage.SerializedChatTitle <set-?>) {
/*    */       Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*    */       this.title = <set-?>;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final List<ChatSessionStorage.SerializedChatMessage> getMessages() {
/*    */       return this.messages;
/*    */     }
/*    */     
/*    */     public final void setMessages(@NotNull List<ChatSessionStorage.SerializedChatMessage> <set-?>) {
/*    */       Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*    */       this.messages = <set-?>;
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final String getContext() {
/*    */       return this.context;
/*    */     }
/*    */     
/*    */     public final void setContext(@Nullable String <set-?>) {
/*    */       this.context = <set-?>;
/*    */     }
/*    */     
/*    */     public final long getModifiedAt() {
/*    */       return this.modifiedAt;
/*    */     }
/*    */     
/*    */     public final void setModifiedAt(long <set-?>) {
/*    */       this.modifiedAt = <set-?>;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final ChatSessionStorage.ChatStatisticInformation getStatisticInformation() {
/*    */       return this.statisticInformation;
/*    */     }
/*    */     
/*    */     public final void setStatisticInformation(@NotNull ChatSessionStorage.ChatStatisticInformation <set-?>) {
/*    */       Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*    */       this.statisticInformation = <set-?>;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String component1() {
/*    */       return this.uid;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final ChatSessionStorage.SerializedChatTitle component2() {
/*    */       return this.title;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final List<ChatSessionStorage.SerializedChatMessage> component3() {
/*    */       return this.messages;
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final String component4() {
/*    */       return this.context;
/*    */     }
/*    */     
/*    */     public final long component5() {
/*    */       return this.modifiedAt;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final ChatSessionStorage.ChatStatisticInformation component6() {
/*    */       return this.statisticInformation;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final SerializedChat copy(@NotNull String uid, @NotNull ChatSessionStorage.SerializedChatTitle title, @NotNull List<ChatSessionStorage.SerializedChatMessage> messages, @Nullable String context, long modifiedAt, @NotNull ChatSessionStorage.ChatStatisticInformation statisticInformation) {
/*    */       Intrinsics.checkNotNullParameter(uid, "uid");
/*    */       Intrinsics.checkNotNullParameter(title, "title");
/*    */       Intrinsics.checkNotNullParameter(messages, "messages");
/*    */       Intrinsics.checkNotNullParameter(statisticInformation, "statisticInformation");
/*    */       return new SerializedChat(uid, title, messages, context, modifiedAt, statisticInformation);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "SerializedChat(uid=" + this.uid + ", title=" + this.title + ", messages=" + this.messages + ", context=" + this.context + ", modifiedAt=" + this.modifiedAt + ", statisticInformation=" + this.statisticInformation + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       result = this.uid.hashCode();
/*    */       result = result * 31 + this.title.hashCode();
/*    */       result = result * 31 + this.messages.hashCode();
/*    */       result = result * 31 + ((this.context == null) ? 0 : this.context.hashCode());
/*    */       result = result * 31 + Long.hashCode(this.modifiedAt);
/*    */       return result * 31 + this.statisticInformation.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof SerializedChat))
/*    */         return false; 
/*    */       SerializedChat serializedChat = (SerializedChat)other;
/*    */       return !Intrinsics.areEqual(this.uid, serializedChat.uid) ? false : (!Intrinsics.areEqual(this.title, serializedChat.title) ? false : (!Intrinsics.areEqual(this.messages, serializedChat.messages) ? false : (!Intrinsics.areEqual(this.context, serializedChat.context) ? false : ((this.modifiedAt != serializedChat.modifiedAt) ? false : (!!Intrinsics.areEqual(this.statisticInformation, serializedChat.statisticInformation))))));
/*    */     }
/*    */     
/*    */     public SerializedChat() {
/*    */       this(null, null, null, null, 0L, null, 63, null);
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\025\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B-\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\003\022\b\b\002\020\005\032\0020\006\022\b\b\002\020\007\032\0020\b¢\006\002\020\tJ\t\020\030\032\0020\003HÆ\003J\t\020\031\032\0020\003HÆ\003J\t\020\032\032\0020\006HÆ\003J\t\020\033\032\0020\bHÆ\003J1\020\034\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\0062\b\b\002\020\007\032\0020\bHÆ\001J\023\020\035\032\0020\0362\b\020\037\032\004\030\0010\001HÖ\003J\t\020 \032\0020!HÖ\001J\t\020\"\032\0020\003HÖ\001R\032\020\005\032\0020\006X\016¢\006\016\n\000\032\004\b\n\020\013\"\004\b\f\020\rR\032\020\004\032\0020\003X\016¢\006\016\n\000\032\004\b\016\020\017\"\004\b\020\020\021R\032\020\007\032\0020\bX\016¢\006\016\n\000\032\004\b\022\020\023\"\004\b\024\020\025R\032\020\002\032\0020\003X\016¢\006\016\n\000\032\004\b\026\020\017\"\004\b\027\020\021¨\006#"}, d2 = {"Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$SerializedChatMessage;", "", "uid", "", "content", "author", "Lcom/intellij/ml/llm/core/chat/messages/ChatMessageAuthor;", "rating", "Lcom/intellij/ml/llm/core/chat/messages/ChatMessageRating;", "(Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/core/chat/messages/ChatMessageAuthor;Lcom/intellij/ml/llm/core/chat/messages/ChatMessageRating;)V", "getAuthor", "()Lcom/intellij/ml/llm/core/chat/messages/ChatMessageAuthor;", "setAuthor", "(Lcom/intellij/ml/llm/core/chat/messages/ChatMessageAuthor;)V", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "getRating", "()Lcom/intellij/ml/llm/core/chat/messages/ChatMessageRating;", "setRating", "(Lcom/intellij/ml/llm/core/chat/messages/ChatMessageRating;)V", "getUid", "setUid", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "intellij.ml.llm"})
/*    */   public static final class SerializedChatMessage {
/*    */     @NotNull
/*    */     private String uid;
/*    */     @NotNull
/*    */     private String content;
/*    */     @NotNull
/*    */     private ChatMessageAuthor author;
/*    */     @NotNull
/*    */     private ChatMessageRating rating;
/*    */     
/*    */     public SerializedChatMessage(@NotNull String uid, @NotNull String content, @NotNull ChatMessageAuthor author, @NotNull ChatMessageRating rating) {
/*    */       this.uid = uid;
/*    */       this.content = content;
/*    */       this.author = author;
/*    */       this.rating = rating;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String getUid() {
/*    */       return this.uid;
/*    */     }
/*    */     
/*    */     public final void setUid(@NotNull String <set-?>) {
/*    */       Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*    */       this.uid = <set-?>;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String getContent() {
/*    */       return this.content;
/*    */     }
/*    */     
/*    */     public final void setContent(@NotNull String <set-?>) {
/*    */       Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*    */       this.content = <set-?>;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final ChatMessageAuthor getAuthor() {
/*    */       return this.author;
/*    */     }
/*    */     
/*    */     public final void setAuthor(@NotNull ChatMessageAuthor <set-?>) {
/*    */       Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*    */       this.author = <set-?>;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final ChatMessageRating getRating() {
/*    */       return this.rating;
/*    */     }
/*    */     
/*    */     public final void setRating(@NotNull ChatMessageRating <set-?>) {
/*    */       Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*    */       this.rating = <set-?>;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String component1() {
/*    */       return this.uid;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String component2() {
/*    */       return this.content;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final ChatMessageAuthor component3() {
/*    */       return this.author;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final ChatMessageRating component4() {
/*    */       return this.rating;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final SerializedChatMessage copy(@NotNull String uid, @NotNull String content, @NotNull ChatMessageAuthor author, @NotNull ChatMessageRating rating) {
/*    */       Intrinsics.checkNotNullParameter(uid, "uid");
/*    */       Intrinsics.checkNotNullParameter(content, "content");
/*    */       Intrinsics.checkNotNullParameter(author, "author");
/*    */       Intrinsics.checkNotNullParameter(rating, "rating");
/*    */       return new SerializedChatMessage(uid, content, author, rating);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "SerializedChatMessage(uid=" + this.uid + ", content=" + this.content + ", author=" + this.author + ", rating=" + this.rating + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       result = this.uid.hashCode();
/*    */       result = result * 31 + this.content.hashCode();
/*    */       result = result * 31 + this.author.hashCode();
/*    */       return result * 31 + this.rating.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof SerializedChatMessage))
/*    */         return false; 
/*    */       SerializedChatMessage serializedChatMessage = (SerializedChatMessage)other;
/*    */       return !Intrinsics.areEqual(this.uid, serializedChatMessage.uid) ? false : (!Intrinsics.areEqual(this.content, serializedChatMessage.content) ? false : ((this.author != serializedChatMessage.author) ? false : (!(this.rating != serializedChatMessage.rating))));
/*    */     }
/*    */     
/*    */     public SerializedChatMessage() {
/*    */       this(null, null, null, null, 15, null);
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\002\n\002\020!\n\002\030\002\n\002\b\005\n\002\020\b\n\002\b\005\030\0002\0020\001B\005¢\006\002\020\002R \020\003\032\b\022\004\022\0020\0050\004X\016¢\006\016\n\000\032\004\b\006\020\007\"\004\b\b\020\tR\032\020\n\032\0020\013X\016¢\006\016\n\000\032\004\b\f\020\r\"\004\b\016\020\017¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$State;", "", "()V", "chats", "", "Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$SerializedChat;", "getChats", "()Ljava/util/List;", "setChats", "(Ljava/util/List;)V", "currentChatIndex", "", "getCurrentChatIndex", "()I", "setCurrentChatIndex", "(I)V", "intellij.ml.llm"})
/*    */   public static final class State {
/*    */     @NotNull
/*    */     private List<ChatSessionStorage.SerializedChat> chats = new ArrayList<>();
/*    */     private int currentChatIndex;
/*    */     
/*    */     @NotNull
/*    */     public final List<ChatSessionStorage.SerializedChat> getChats() {
/*    */       return this.chats;
/*    */     }
/*    */     
/*    */     public final void setChats(@NotNull List<ChatSessionStorage.SerializedChat> <set-?>) {
/*    */       Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*    */       this.chats = <set-?>;
/*    */     }
/*    */     
/*    */     public final int getCurrentChatIndex() {
/*    */       return this.currentChatIndex;
/*    */     }
/*    */     
/*    */     public final void setCurrentChatIndex(int <set-?>) {
/*    */       this.currentChatIndex = <set-?>;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public State getState() {
/*    */     State result = new State();
/*    */     for (ChatSession chat : this.chatSessions) {
/*    */       if (!chat.getMessages().isEmpty()) {
/*    */         List<SerializedChatMessage> messages = new ArrayList();
/*    */         for (CompletableMessage message : chat.getMessages()) {
/*    */           if (Intrinsics.areEqual(message.getState(), ReadyState.INSTANCE))
/*    */             messages.add(new SerializedChatMessage(message.getUid(), message.getText(), message.getAuthor(), message.getRating())); 
/*    */         } 
/*    */         result.getChats().add(new SerializedChat(chat.getUid(), new SerializedChatTitle(chat.getTitle().getText(), chat.getTitle().isCustom()), messages, chat.getContext(), chat.getTimestamp(), new ChatStatisticInformation(chat.getUid(), chat.getStatisticData().getSourceAction(), chat.getStatisticData().getLastTimestamp())));
/*    */       } 
/*    */     } 
/*    */     result.setCurrentChatIndex(this.currentChatIndex);
/*    */     return result;
/*    */   }
/*    */   
/*    */   public void loadState(@NotNull State state) {
/*    */     Intrinsics.checkNotNullParameter(state, "state");
/*    */     for (SerializedChat chat : state.getChats()) {
/*    */       ChatCreationContext creationContext = new ChatCreationContext(ChatOrigin.Restored.INSTANCE, SourceAction.LOAD_STATE, null, null, 12, null);
/*    */       ChatSessionImpl restoredChat = new ChatSessionImpl(creationContext, chat.getUid(), chat.getModifiedAt(), chat.getContext());
/*    */       restoredChat.setStatData(new StatisticData(chat.getStatisticInformation().getSourceActionType(), chat.getStatisticInformation().getTimestamp()));
/*    */       restoredChat.setTitle(new ChatTitle(chat.getTitle().getText(), chat.getTitle().isCustom()));
/*    */       for (SerializedChatMessage message : chat.getMessages())
/*    */         restoredChat.addMessage((CompletableMessage)new RestoredMessage((ChatSession)restoredChat, message.getUid(), message.getContent(), message.getAuthor(), message.getRating())); 
/*    */       this.chatSessions.add(restoredChat);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/session/ChatSessionStorage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */