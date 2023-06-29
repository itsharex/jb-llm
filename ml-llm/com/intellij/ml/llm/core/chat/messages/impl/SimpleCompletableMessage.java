/*     */ package com.intellij.ml.llm.core.chat.messages.impl;@Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000~\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\020!\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\n\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\n\n\002\020\003\n\002\b\004\030\0002\0020\001B!\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007¢\006\002\020\bJ\020\0208\032\002092\006\020:\032\0020\033H\026J\020\020;\032\002092\006\020<\032\0020\030H\026J\020\020=\032\002092\006\020<\032\00201H\026J\020\020>\032\002092\006\020<\032\00206H\026J\031\020?\032\002092\006\0202\032\0020\005H@ø\001\000¢\006\002\020@J\b\020A\032\00209H\026J\020\020B\032\002092\b\020C\032\004\030\0010DJ\020\020E\032\002092\006\020:\032\0020\033H\026J\020\020F\032\002092\006\020<\032\00201H\026J\020\020G\032\002092\006\020<\032\00206H\026R\034\020\t\032\004\030\0010\nX\016¢\006\016\n\000\032\004\b\013\020\f\"\004\b\r\020\016R\024\020\017\032\0020\0208VX\004¢\006\006\032\004\b\021\020\022R\022\020\023\032\0060\024j\002`\025X\004¢\006\002\n\000R\024\020\026\032\b\022\004\022\0020\0300\027X\004¢\006\002\n\000R\032\020\031\032\b\022\004\022\0020\0330\0328VX\004¢\006\006\032\004\b\034\020\035R\032\020\002\032\0020\003X\016¢\006\016\n\000\032\004\b\036\020\037\"\004\b \020!R\016\020\"\032\0020#X\016¢\006\002\n\000R\016\020$\032\0020\005X\016¢\006\002\n\000R\016\020%\032\0020&X\016¢\006\002\n\000R\016\020'\032\0020&X\016¢\006\002\n\000R\024\020(\032\b\022\004\022\0020\0330\027X\004¢\006\002\n\000R\032\020\006\032\0020\007X\016¢\006\016\n\000\032\004\b)\020*\"\004\b+\020,R\024\020-\032\0020#8VX\004¢\006\006\032\004\b.\020/R\024\0200\032\b\022\004\022\002010\027X\004¢\006\002\n\000R\024\0202\032\0020\0058VX\004¢\006\006\032\004\b3\0204R\024\0205\032\b\022\004\022\002060\027X\004¢\006\002\n\000R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b7\0204\002\004\n\002\b\031¨\006H"}, d2 = {"Lcom/intellij/ml/llm/core/chat/messages/impl/SimpleCompletableMessage;", "Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;", "chat", "Lcom/intellij/ml/llm/core/chat/session/ChatSession;", "uid", "", "rating", "Lcom/intellij/ml/llm/core/chat/messages/ChatMessageRating;", "(Lcom/intellij/ml/llm/core/chat/session/ChatSession;Ljava/lang/String;Lcom/intellij/ml/llm/core/chat/messages/ChatMessageRating;)V", "activeJob", "Lkotlinx/coroutines/Job;", "getActiveJob", "()Lkotlinx/coroutines/Job;", "setActiveJob", "(Lkotlinx/coroutines/Job;)V", "author", "Lcom/intellij/ml/llm/core/chat/messages/ChatMessageAuthor;", "getAuthor", "()Lcom/intellij/ml/llm/core/chat/messages/ChatMessageAuthor;", "builder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "buttonListener", "", "Lcom/intellij/ml/llm/core/chat/messages/CompletableMessageButtonListener;", "buttons", "", "Lcom/intellij/ml/llm/core/chat/messages/ChatMessageButton;", "getButtons", "()Ljava/util/List;", "getChat", "()Lcom/intellij/ml/llm/core/chat/session/ChatSession;", "setChat", "(Lcom/intellij/ml/llm/core/chat/session/ChatSession;)V", "currentState", "Lcom/intellij/ml/llm/core/chat/messages/MessageState;", "currentText", "currentTimeStamp", "", "lastTimeStamp", "messageButtons", "getRating", "()Lcom/intellij/ml/llm/core/chat/messages/ChatMessageRating;", "setRating", "(Lcom/intellij/ml/llm/core/chat/messages/ChatMessageRating;)V", "state", "getState", "()Lcom/intellij/ml/llm/core/chat/messages/MessageState;", "stateListeners", "Lcom/intellij/ml/llm/core/chat/messages/CompletableMessageStateListener;", "text", "getText", "()Ljava/lang/String;", "textListeners", "Lcom/intellij/ml/llm/core/chat/messages/CompletableMessageTextListener;", "getUid", "addButton", "", "button", "addButtonListener", "listener", "addStateListener", "addTextListener", "appendText", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "complete", "t", "", "removeButton", "removeStateListener", "removeTextListener", "intellij.ml.llm"}) public final class SimpleCompletableMessage implements CompletableMessage { @NotNull
/*     */   private ChatSession chat; @NotNull
/*     */   private final String uid; @NotNull
/*     */   private ChatMessageRating rating; @NotNull
/*     */   private MessageState currentState; @NotNull
/*     */   private final List<CompletableMessageStateListener> stateListeners; @NotNull
/*     */   private final List<CompletableMessageTextListener> textListeners; @NotNull
/*     */   private final List<CompletableMessageButtonListener> buttonListener; private int lastTimeStamp; private int currentTimeStamp; @NotNull
/*     */   private final StringBuilder builder; @NotNull
/*     */   private String currentText; @Nullable
/*     */   private Job activeJob; @NotNull
/*  12 */   private final List<ChatMessageButton> messageButtons; public SimpleCompletableMessage(@NotNull ChatSession chat, @NotNull String uid, @NotNull ChatMessageRating rating) { this.chat = chat; this.uid = uid;
/*  13 */     this.rating = rating;
/*  14 */     this.currentState = (MessageState)ThinkingState.INSTANCE;
/*  15 */     this.stateListeners = new ArrayList<>();
/*  16 */     this.textListeners = new ArrayList<>();
/*  17 */     this.buttonListener = new ArrayList<>();
/*     */ 
/*     */ 
/*     */     
/*  21 */     this.builder = new StringBuilder();
/*  22 */     this.currentText = "";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  40 */     this.messageButtons = new ArrayList<>(); }
/*     */   @NotNull public ChatSession getChat() { return this.chat; }
/*  42 */   public void setChat(@NotNull ChatSession <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.chat = <set-?>; } @NotNull public String getUid() { return this.uid; } @NotNull public ChatMessageRating getRating() { return this.rating; } public void setRating(@NotNull ChatMessageRating <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.rating = <set-?>; } @NotNull public List<ChatMessageButton> getButtons() { return this.messageButtons; }
/*     */   @Nullable public final Job getActiveJob() { return this.activeJob; }
/*     */   public final void setActiveJob(@Nullable Job <set-?>) { this.activeJob = <set-?>; }
/*  45 */   @NotNull public MessageState getState() { return this.currentState; } @NotNull public String getText() { if (this.lastTimeStamp == this.currentTimeStamp) return this.currentText;  Intrinsics.checkNotNullExpressionValue(this.builder.toString(), "builder.toString()"); this.currentText = this.builder.toString(); this.lastTimeStamp = this.currentTimeStamp; return this.currentText; } @NotNull public ChatMessageAuthor getAuthor() { return ChatMessageAuthor.Assistant; } public void addStateListener(@NotNull CompletableMessageStateListener listener) { Intrinsics.checkNotNullParameter(listener, "listener"); this.stateListeners.add(listener);
/*     */     
/*  47 */     listener.onStateChanged(); }
/*     */ 
/*     */   
/*     */   public void removeStateListener(@NotNull CompletableMessageStateListener listener) {
/*  51 */     Intrinsics.checkNotNullParameter(listener, "listener"); this.stateListeners.remove(listener);
/*     */   }
/*     */   
/*     */   public void addTextListener(@NotNull CompletableMessageTextListener listener) {
/*  55 */     Intrinsics.checkNotNullParameter(listener, "listener"); this.textListeners.add(listener);
/*     */     
/*  57 */     listener.onTextChanged(getText());
/*     */   }
/*     */   
/*     */   public void removeTextListener(@NotNull CompletableMessageTextListener listener) {
/*  61 */     Intrinsics.checkNotNullParameter(listener, "listener"); this.textListeners.remove(listener);
/*     */   }
/*     */   
/*     */   public void addButton(@NotNull ChatMessageButton button) {
/*  65 */     Intrinsics.checkNotNullParameter(button, "button"); this.messageButtons.add(button);
/*  66 */     for (CompletableMessageButtonListener listener : this.buttonListener)
/*  67 */       listener.onButtonsChanged(); 
/*     */   }
/*     */   
/*     */   public void removeButton(@NotNull ChatMessageButton button) {
/*  71 */     Intrinsics.checkNotNullParameter(button, "button"); this.messageButtons.remove(button);
/*  72 */     for (CompletableMessageButtonListener listener : this.buttonListener)
/*  73 */       listener.onButtonsChanged(); 
/*     */   }
/*     */   
/*     */   public void addButtonListener(@NotNull CompletableMessageButtonListener listener) {
/*  77 */     Intrinsics.checkNotNullParameter(listener, "listener"); this.buttonListener.add(listener);
/*  78 */     listener.onButtonsChanged();
/*     */   }
/*     */   
/*     */   public void cancel() {
/*  82 */     if (this.activeJob != null) { Job.DefaultImpls.cancel$default(this.activeJob, null, 1, null); } else {  }
/*  83 */      this.activeJob = null;
/*     */   }
/*     */   
/*     */   @Nullable
/*  87 */   public final Object appendText(@NotNull String text, @NotNull Continuation $completion) { if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new SimpleCompletableMessage$appendText$2(text, null), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new SimpleCompletableMessage$appendText$2(text, null), $completion);  BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new SimpleCompletableMessage$appendText$2(text, null), $completion); return Unit.INSTANCE; } @DebugMetadata(f = "SimpleCompletableMessage.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.chat.messages.impl.SimpleCompletableMessage$appendText$2") @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class SimpleCompletableMessage$appendText$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { int label; SimpleCompletableMessage$appendText$2(String $text, Continuation $completion) { super(2, $completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { SimpleCompletableMessage simpleCompletableMessage; int i; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*  88 */           simpleCompletableMessage = SimpleCompletableMessage.this; i = simpleCompletableMessage.currentTimeStamp; simpleCompletableMessage.currentTimeStamp = i + 1;
/*  89 */           SimpleCompletableMessage.this.builder.append(this.$text);
/*  90 */           for (CompletableMessageTextListener listener : SimpleCompletableMessage.this.textListeners) {
/*  91 */             listener.onTextChanged(this.$text);
/*     */           }
/*  93 */           return Unit.INSTANCE; }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super SimpleCompletableMessage$appendText$2> $completion) { return (Continuation<Unit>)new SimpleCompletableMessage$appendText$2(this.$text, $completion); }
/*     */     @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((SimpleCompletableMessage$appendText$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }
/*  97 */   public final void complete(@Nullable Throwable t) { this.activeJob = null;
/*     */     
/*  99 */     Throwable throwable = t;
/*     */ 
/*     */     
/* 102 */     if (t.getMessage() == null) t.getMessage();  super("Unknown exception", t); ((SimpleCompletableMessage)new ErrorState()).currentState = (throwable == null) ? (MessageState)ReadyState.INSTANCE : ((throwable instanceof java.util.concurrent.CancellationException) ? (MessageState)CancelledState.INSTANCE : (MessageState)new ErrorState());
/*     */ 
/*     */     
/* 105 */     for (CompletableMessageStateListener listener : this.stateListeners) {
/* 106 */       listener.onStateChanged();
/*     */     }
/*     */     
/* 109 */     this.stateListeners.clear();
/* 110 */     this.textListeners.clear(); }
/*     */    }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/messages/impl/SimpleCompletableMessage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */