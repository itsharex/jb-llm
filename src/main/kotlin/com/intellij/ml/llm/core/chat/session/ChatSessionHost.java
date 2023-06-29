/*    */ package com.intellij.ml.llm.core.chat.session;
/*    */ 
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.util.EventDispatcher;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Service({Service.Level.PROJECT})
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020 \n\002\b\004\b\007\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\016\020\n\032\0020\0132\006\020\f\032\0020\007J\006\020\r\032\0020\013J\031\020\016\032\0020\0172\006\020\020\032\0020\021H@ø\001\000¢\006\002\020\022J\f\020\023\032\b\022\004\022\0020\0170\024J\016\020\025\032\0020\0132\006\020\026\032\0020\017J\016\020\027\032\0020\0132\006\020\f\032\0020\007R!\020\005\032\025\022\f\022\n \b*\004\030\0010\0070\0070\006¢\006\002\b\tX\004¢\006\002\n\000R\016\020\002\032\0020\003X\004¢\006\002\n\000\002\004\n\002\b\031¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/core/chat/session/ChatSessionHost;", "", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;)V", "listeners", "Lcom/intellij/util/EventDispatcher;", "Lcom/intellij/ml/llm/core/chat/session/ChatSessionHostListener;", "kotlin.jvm.PlatformType", "Lorg/jetbrains/annotations/NotNull;", "addListener", "", "listener", "clearChats", "createChatSession", "Lcom/intellij/ml/llm/core/chat/session/ChatSession;", "creationContext", "Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;", "(Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllChats", "", "removeChatSession", "chatSession", "removeListener", "intellij.ml.llm"})
/*    */ public final class ChatSessionHost {
/*    */   @NotNull
/*    */   private final Project project;
/*    */   @NotNull
/*    */   private final EventDispatcher<ChatSessionHostListener> listeners;
/*    */   
/* 18 */   public ChatSessionHost(@NotNull Project project) { this.project = project;
/* 19 */     Intrinsics.checkNotNullExpressionValue(EventDispatcher.create(ChatSessionHostListener.class), "create(ChatSessionHostListener::class.java)"); this.listeners = EventDispatcher.create(ChatSessionHostListener.class); }
/*    */   @Nullable public final Object createChatSession(@NotNull ChatCreationContext creationContext, @NotNull Continuation<? super ChatSession> paramContinuation) { // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof com/intellij/ml/llm/core/chat/session/ChatSessionHost$createChatSession$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast com/intellij/ml/llm/core/chat/session/ChatSessionHost$createChatSession$1
/*    */     //   11: astore #7
/*    */     //   13: aload #7
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #7
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/core/chat/session/ChatSessionHost$createChatSession$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/core/chat/session/ChatSessionHost;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #7
/*    */     //   50: aload #7
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #6
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #8
/*    */     //   62: aload #7
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 204, 0 -> 88, 1 -> 183
/*    */     //   88: aload #6
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: getstatic com/intellij/ml/llm/core/chat/session/ChatSessionStorage.Companion : Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$Companion;
/*    */     //   96: aload_0
/*    */     //   97: getfield project : Lcom/intellij/openapi/project/Project;
/*    */     //   100: invokevirtual getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage;
/*    */     //   103: astore_3
/*    */     //   104: new com/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl
/*    */     //   107: dup
/*    */     //   108: aload_1
/*    */     //   109: invokestatic randomUUID : ()Ljava/util/UUID;
/*    */     //   112: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   115: astore #5
/*    */     //   117: aload #5
/*    */     //   119: ldc 'randomUUID().toString()'
/*    */     //   121: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   124: aload #5
/*    */     //   126: invokestatic currentTimeMillis : ()J
/*    */     //   129: aconst_null
/*    */     //   130: invokespecial <init> : (Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;Ljava/lang/String;JLjava/lang/String;)V
/*    */     //   133: astore #4
/*    */     //   135: getstatic kotlinx/coroutines/Dispatchers.INSTANCE : Lkotlinx/coroutines/Dispatchers;
/*    */     //   138: invokestatic getEDT : (Lkotlinx/coroutines/Dispatchers;)Lkotlin/coroutines/CoroutineContext;
/*    */     //   141: new com/intellij/ml/llm/core/chat/session/ChatSessionHost$createChatSession$2
/*    */     //   144: dup
/*    */     //   145: aload_3
/*    */     //   146: aload #4
/*    */     //   148: aload_0
/*    */     //   149: aconst_null
/*    */     //   150: invokespecial <init> : (Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage;Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;Lcom/intellij/ml/llm/core/chat/session/ChatSessionHost;Lkotlin/coroutines/Continuation;)V
/*    */     //   153: checkcast kotlin/jvm/functions/Function2
/*    */     //   156: aload #7
/*    */     //   158: aload #7
/*    */     //   160: aload #4
/*    */     //   162: putfield L$0 : Ljava/lang/Object;
/*    */     //   165: aload #7
/*    */     //   167: iconst_1
/*    */     //   168: putfield label : I
/*    */     //   171: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   174: dup
/*    */     //   175: aload #8
/*    */     //   177: if_acmpne -> 200
/*    */     //   180: aload #8
/*    */     //   182: areturn
/*    */     //   183: aload #7
/*    */     //   185: getfield L$0 : Ljava/lang/Object;
/*    */     //   188: checkcast com/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl
/*    */     //   191: astore #4
/*    */     //   193: aload #6
/*    */     //   195: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   198: aload #6
/*    */     //   200: pop
/*    */     //   201: aload #4
/*    */     //   203: areturn
/*    */     //   204: new java/lang/IllegalStateException
/*    */     //   207: dup
/*    */     //   208: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   210: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   213: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #21	-> 60
/*    */     //   #22	-> 93
/*    */     //   #23	-> 104
/*    */     //   #24	-> 126
/*    */     //   #23	-> 130
/*    */     //   #25	-> 135
/*    */     //   #21	-> 180
/*    */     //   #30	-> 200
/*    */     //   #21	-> 204
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	81	0	this	Lcom/intellij/ml/llm/core/chat/session/ChatSessionHost;
/*    */     //   93	24	1	creationContext	Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;
/*    */     //   104	70	3	storage	Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage;
/*    */     //   135	48	4	session	Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;
/*    */     //   193	11	4	session	Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;
/*    */     //   50	154	7	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	147	6	$result	Ljava/lang/Object; } @DebugMetadata(f = "ChatSessionHost.kt", l = {25}, i = {0}, s = {"L$0"}, n = {"session"}, m = "createChatSession", c = "com.intellij.ml.llm.core.chat.session.ChatSessionHost") @Metadata(mv = {1, 8, 0}, k = 3, xi = 48) static final class ChatSessionHost$createChatSession$1 extends ContinuationImpl {
/*    */     Object L$0; int label; ChatSessionHost$createChatSession$1(Continuation $completion) { super($completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return ChatSessionHost.this.createChatSession(null, (Continuation<? super ChatSession>)this); }
/*    */   } @DebugMetadata(f = "ChatSessionHost.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.chat.session.ChatSessionHost$createChatSession$2") @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class ChatSessionHost$createChatSession$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/* 25 */     int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 26 */           this.$storage.getChatSessions().add(this.$session);
/* 27 */           ((ChatSessionHostListener)ChatSessionHost.this.listeners.getMulticaster()).chatCreated((ChatSession)this.$session);
/* 28 */           AIAssistantChatEventLogger.Companion.logNewChatCreated(ChatSessionHost.this.project, (ChatSession)this.$session);
/* 29 */           return Unit.INSTANCE; }
/*    */       
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */     ChatSessionHost$createChatSession$2(ChatSessionImpl $session, ChatSessionHost $receiver, Continuation $completion) { super(2, $completion); }
/*    */     @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super ChatSessionHost$createChatSession$2> $completion) { return (Continuation<Unit>)new ChatSessionHost$createChatSession$2(this.$session, ChatSessionHost.this, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((ChatSessionHost$createChatSession$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE); }
/* 34 */   } public final void removeChatSession(@NotNull ChatSession chatSession) { Intrinsics.checkNotNullParameter(chatSession, "chatSession"); if (ChatSessionStorage.Companion.getInstance(this.project).getChatSessions().remove(chatSession)) {
/* 35 */       ((ChatSessionImpl)chatSession).onRemove();
/*    */       
/* 37 */       ((ChatSessionHostListener)this.listeners.getMulticaster()).chatRemoved(chatSession);
/*    */     }  }
/*    */    @NotNull
/*    */   public final List<ChatSession> getAllChats() {
/* 41 */     return ChatSessionStorage.Companion.getInstance(this.project).getChatSessions();
/*    */   }
/*    */   public final void clearChats() {
/* 44 */     List toRemove = CollectionsKt.toList(ChatSessionStorage.Companion.getInstance(this.project).getChatSessions());
/* 45 */     for (ChatSession chat : toRemove)
/* 46 */       removeChatSession(chat); 
/*    */   }
/*    */   
/*    */   public final void addListener(@NotNull ChatSessionHostListener listener) {
/* 50 */     Intrinsics.checkNotNullParameter(listener, "listener"); this.listeners.addListener(listener);
/*    */   }
/*    */   
/*    */   public final void removeListener(@NotNull ChatSessionHostListener listener) {
/* 54 */     Intrinsics.checkNotNullParameter(listener, "listener"); this.listeners.removeListener(listener);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/session/ChatSessionHost.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */