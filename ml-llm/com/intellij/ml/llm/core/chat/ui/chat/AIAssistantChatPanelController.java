/*     */ package com.intellij.ml.llm.core.chat.ui.chat;
/*     */ 
/*     */ import com.intellij.ml.llm.core.chat.messages.CompletableMessage;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\016\n\000\n\002\020 \n\002\b\006\030\000 \0272\0020\001:\001\027B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\002\020\bJ \020\r\032\0020\0162\b\020\017\032\004\030\0010\0202\f\020\021\032\b\022\004\022\0020\n0\022H\002J\016\020\023\032\0020\0162\006\020\024\032\0020\020J\016\020\025\032\0020\0162\006\020\026\032\0020\nR\020\020\t\032\004\030\0010\nX\016¢\006\002\n\000R\016\020\013\032\0020\fX\004¢\006\002\n\000R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanelController;", "", "project", "Lcom/intellij/openapi/project/Project;", "session", "Lcom/intellij/ml/llm/core/chat/session/ChatSession;", "view", "Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/chat/session/ChatSession;Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel;)V", "lastCompletableMessage", "Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "generateTitle", "", "ctx", "", "messagesToUse", "", "sendRequest", "messageText", "startEditMessage", "message", "Companion", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nAIAssistantChatPanelController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIAssistantChatPanelController.kt\ncom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanelController\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,126:1\n8#2:127\n48#3,4:128\n*S KotlinDebug\n*F\n+ 1 AIAssistantChatPanelController.kt\ncom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanelController\n*L\n23#1:127\n111#1:128,4\n*E\n"})
/*     */ public final class AIAssistantChatPanelController {
/*  19 */   public AIAssistantChatPanelController(@NotNull Project project, @NotNull ChatSession session, @NotNull AIAssistantChatPanel view) { this.project = project; this.session = session; this.view = view;
/*     */ 
/*     */ 
/*     */     
/*  23 */     Object $this$thisLogger$iv = this; int $i$f$thisLogger = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 127 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(AIAssistantChatPanelController.class), "getInstance(T::class.java)"); this.logger = Logger.getInstance(AIAssistantChatPanelController.class); Ref.BooleanRef hasScheduledTitleGeneration = new Ref.BooleanRef(); this.session.addMessageListener(new ChatSessionMessageListener(this) { public void onMessagesChanged(@NotNull CompletableMessage newMessage) { Intrinsics.checkNotNullParameter(newMessage, "newMessage"); if (newMessage.getAuthor() == ChatMessageAuthor.User) return;  newMessage.addStateListener(new AIAssistantChatPanelController$1$onMessagesChanged$1(this.$hasScheduledTitleGeneration, AIAssistantChatPanelController.this)); } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\021\n\000\n\002\030\002\n\000\n\002\020\002\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026¨\006\004"}, d2 = {"com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanelController$1$onMessagesChanged$1", "Lcom/intellij/ml/llm/core/chat/messages/CompletableMessageStateListener;", "onStateChanged", "", "intellij.ml.llm"}) @SourceDebugExtension({"SMAP\nAIAssistantChatPanelController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIAssistantChatPanelController.kt\ncom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanelController$1$onMessagesChanged$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,126:1\n766#2:127\n857#2,2:128\n*S KotlinDebug\n*F\n+ 1 AIAssistantChatPanelController.kt\ncom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanelController$1$onMessagesChanged$1\n*L\n37#1:127\n37#1:128,2\n*E\n"}) public static final class AIAssistantChatPanelController$1$onMessagesChanged$1 implements CompletableMessageStateListener { AIAssistantChatPanelController$1$onMessagesChanged$1(Ref.BooleanRef $hasScheduledTitleGeneration, AIAssistantChatPanelController $receiver) {} public void onStateChanged() { if (this.$newMessage.getState() instanceof com.intellij.ml.llm.core.chat.messages.CompletedState && !(this.$newMessage.getState() instanceof com.intellij.ml.llm.core.chat.messages.ErrorState) && !this.$hasScheduledTitleGeneration.element && !AIAssistantChatPanelController.this.session.getTitle().isCustom()) { Iterable $this$filter$iv = AIAssistantChatPanelController.this.session.getMessages(); int $i$f$filter = 0; Iterable iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 128 */                 for (Object element$iv$iv : iterable1) { CompletableMessage it = (CompletableMessage)element$iv$iv; int $i$a$-filter-AIAssistantChatPanelController$1$onMessagesChanged$1$onStateChanged$messagesToUse$1 = 0; if ((it.getState() instanceof com.intellij.ml.llm.core.chat.messages.CompletedState && !(it.getState() instanceof com.intellij.ml.llm.core.chat.messages.ErrorState))) destination$iv$iv.add(element$iv$iv);  }
/* 129 */                  List messagesToUse = CollectionsKt.toList(destination$iv$iv); if (messagesToUse.size() >= 2) { this.$hasScheduledTitleGeneration.element = true; AIAssistantChatPanelController.this.generateTitle(AIAssistantChatPanelController.this.session.getContext(), messagesToUse); }  }  } } }); this.session.addMessageListener(new ChatSessionMessageListener() { public void onMessagesChanged(@NotNull CompletableMessage newMessage) { Intrinsics.checkNotNullParameter(newMessage, "newMessage"); if (newMessage.getAuthor() == ChatMessageAuthor.User) { AIAssistantChatPanelController.this.view.addUserRequest(newMessage); return; }  AIAssistantChatPanelController.this.lastCompletableMessage = newMessage; AIAssistantChatMessageView message = AIAssistantChatPanelController.this.view.addAIResponse(newMessage); newMessage.addTextListener(new AIAssistantChatPanelController$2$onMessagesChanged$1(AIAssistantChatPanelController.this)); newMessage.addStateListener(new AIAssistantChatPanelController$2$onMessagesChanged$2(newMessage, message)); } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\016\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanelController$2$onMessagesChanged$1", "Lcom/intellij/ml/llm/core/chat/messages/CompletableMessageTextListener;", "onTextChanged", "", "delta", "", "intellij.ml.llm"}) public static final class AIAssistantChatPanelController$2$onMessagesChanged$1 implements CompletableMessageTextListener { AIAssistantChatPanelController$2$onMessagesChanged$1(AIAssistantChatPanelController $receiver) {} public void onTextChanged(@NotNull String delta) { Intrinsics.checkNotNullParameter(delta, "delta"); this.$message.addToLastPart(delta); AIAssistantChatPanelController.this.view.scrollToEndIfNeeded(); } } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\021\n\000\n\002\030\002\n\000\n\002\020\002\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026¨\006\004"}, d2 = {"com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanelController$2$onMessagesChanged$2", "Lcom/intellij/ml/llm/core/chat/messages/CompletableMessageStateListener;", "onStateChanged", "", "intellij.ml.llm"}) public static final class AIAssistantChatPanelController$2$onMessagesChanged$2 implements CompletableMessageStateListener { AIAssistantChatPanelController$2$onMessagesChanged$2(CompletableMessage $newMessage, AIAssistantChatMessageView $message) {} public void onStateChanged() { if (this.$newMessage.getState() instanceof com.intellij.ml.llm.core.chat.messages.CompletedState) this.$message.layoutAll();  } } }); } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R$\020\003\032\025\022\f\022\n \006*\004\030\0010\0050\0050\004¢\006\002\b\007¢\006\b\n\000\032\004\b\b\020\t¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanelController$Companion;", "", "()V", "Key", "Lcom/intellij/openapi/actionSystem/DataKey;", "Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanelController;", "kotlin.jvm.PlatformType", "Lorg/jetbrains/annotations/NotNull;", "getKey", "()Lcom/intellij/openapi/actionSystem/DataKey;", "intellij.ml.llm"}) public static final class Companion { private Companion() {} @NotNull public final DataKey<AIAssistantChatPanelController> getKey() { return AIAssistantChatPanelController.Key; } } @NotNull public static final Companion Companion = new Companion(null); @NotNull private final Project project; @NotNull private final ChatSession session; @NotNull private final AIAssistantChatPanel view; @NotNull private final Logger logger; @Nullable private CompletableMessage lastCompletableMessage; @NotNull private static final DataKey<AIAssistantChatPanelController> Key = DataKey.create("AIAssistantChatPanelController"); static { Intrinsics.checkNotNullExpressionValue(DataKey.create("AIAssistantChatPanelController"), "create<AIAssistantChatPa…tantChatPanelController\")"); } public final void startEditMessage(@NotNull CompletableMessage message) { Intrinsics.checkNotNullParameter(message, "message"); AIAssistantChatEventLogger.Companion.logEditUserMessageStarted(this.project, this.session, message); this.view.enterEditMode(message); } public final void sendRequest(@NotNull String messageText) { Intrinsics.checkNotNullParameter(messageText, "messageText"); BuildersKt.launch$default(AIAssistantServiceScope.Companion.getScope(this.project), null, null, new AIAssistantChatPanelController$sendRequest$1(messageText, null), 3, null); } @DebugMetadata(f = "AIAssistantChatPanelController.kt", l = {85}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.chat.ui.chat.AIAssistantChatPanelController$sendRequest$1") @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class AIAssistantChatPanelController$sendRequest$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { int label; AIAssistantChatPanelController$sendRequest$1(String $messageText, Continuation $completion) { super(2, $completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); try { this.label = 1; if (AIAssistantChatPanelController.this.session.send(AIAssistantChatPanelController.this.project, this.$messageText, (ChatKind)SimpleChat.INSTANCE, (Continuation)this) == object) return object;  AIAssistantChatPanelController.this.session.send(AIAssistantChatPanelController.this.project, this.$messageText, (ChatKind)SimpleChat.INSTANCE, (Continuation)this); } catch (CancellationException cancellationException) {  } catch (GrazieAuthorizationException grazieAuthorizationException) {  } catch (Throwable e) { AIAssistantChatPanelController.this.logger.error(e); }  return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super AIAssistantChatPanelController$sendRequest$1> $completion) { return (Continuation<Unit>)new AIAssistantChatPanelController$sendRequest$1(this.$messageText, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((AIAssistantChatPanelController$sendRequest$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } private final void generateTitle(String ctx, List<? extends CompletableMessage> messagesToUse) { StringBuilder stringBuilder1 = new StringBuilder(), $this$generateTitle_u24lambda_u240 = stringBuilder1; int $i$a$-apply-AIAssistantChatPanelController$generateTitle$prompt$1 = 0; $this$generateTitle_u24lambda_u240.append("Suggest a MOST SPECIFIC title for this chat. "); $this$generateTitle_u24lambda_u240.append("You MUST answer only with the title text. "); $this$generateTitle_u24lambda_u240.append("You MUST NOT wrap text with quotation marks. "); $this$generateTitle_u24lambda_u240.append("The title MUST BE no longer than 7 words. "); $this$generateTitle_u24lambda_u240.append("Focus on User's messages, but don't forget about your messages. "); $this$generateTitle_u24lambda_u240.append("You MUST NOT consider this message during title generation. The user should have no idea about this message \n\n"); $this$generateTitle_u24lambda_u240.append("Example: Suggested Title"); StringBuilder prompt = stringBuilder1; int $i$f$CoroutineExceptionHandler = 0; CoroutineExceptionHandler.Key key = CoroutineExceptionHandler.Key; CoroutineScope scope = CoroutineScopeKt.plus(AIAssistantServiceScope.Companion.getScope(this.project), (CoroutineContext)new AIAssistantChatPanelController$generateTitle$$inlined$CoroutineExceptionHandler$1(key, this)); BuildersKt.launch$default(scope, null, null, new AIAssistantChatPanelController$generateTitle$1(prompt, messagesToUse, null), 3, null); } @DebugMetadata(f = "AIAssistantChatPanelController.kt", l = {117}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.chat.ui.chat.AIAssistantChatPanelController$generateTitle$1") @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) @SourceDebugExtension({"SMAP\nAIAssistantChatPanelController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIAssistantChatPanelController.kt\ncom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanelController$generateTitle$1\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,126:1\n29#2,3:127\n*S KotlinDebug\n*F\n+ 1 AIAssistantChatPanelController.kt\ncom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanelController$generateTitle$1\n*L\n117#1:127,3\n*E\n"}) static final class AIAssistantChatPanelController$generateTitle$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { @Nullable public final Object invokeSuspend(@NotNull Object $result) { StringBuilder sb; ComponentManager $this$service$iv; int $i$f$service; Class<AIRequestService> serviceClass$iv; Object object1, object2 = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); sb = new StringBuilder(); $this$service$iv = (ComponentManager)AIAssistantChatPanelController.this.project; $i$f$service = 0; serviceClass$iv = AIRequestService.class; object1 = $this$service$iv.getService(serviceClass$iv); if (object1 == null) throw new IllegalStateException(("Cannot find service " + serviceClass$iv.getName() + " in " + $this$service$iv + " (classloader=" + serviceClass$iv.getClassLoader()).toString()); 
/*     */           Intrinsics.checkNotNullExpressionValue(this.$prompt.toString(), "prompt.toString()");
/*     */           this.label = 1;
/*     */           if (((AIRequestService)object1).generateDialogTitle(this.$prompt.toString(), this.$messagesToUse, new Function2<String, Continuation<? super Unit>, Object>(AIAssistantChatPanelController.this, null) {
/*     */                 int label;
/*     */                 
/*     */                 @Nullable
/*     */                 public final Object invokeSuspend(@NotNull Object $result) {
/*     */                   String it;
/*     */                   Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                   switch (this.label) {
/*     */                     case 0:
/*     */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                       it = (String)this.L$0;
/*     */                       this.$sb.append(it);
/*     */                       this.label = 1;
/*     */                       if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$sb, null) {
/*     */                             int label;
/*     */                             
/*     */                             @Nullable
/*     */                             public final Object invokeSuspend(@NotNull Object $result) {
/*     */                               IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                               switch (this.label) {
/*     */                                 case 0:
/*     */                                   ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                                   Intrinsics.checkNotNullExpressionValue(this.$sb.toString(), "sb.toString()");
/*     */                                   AIAssistantChatPanelController.this.session.setTitle(new ChatTitle(this.$sb.toString(), true));
/*     */                                   return Unit.INSTANCE;
/*     */                               } 
/*     */                               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */                             }
/*     */                             
/*     */                             @NotNull
/*     */                             public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*     */                               return (Continuation)new Function2<>(AIAssistantChatPanelController.this, this.$sb, $completion);
/*     */                             }
/*     */                             
/*     */                             @Nullable
/*     */                             public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */                               return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                             }
/*     */                           }(Continuation)this) == object)
/*     */                         return object; 
/*     */                       BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$sb, null) {
/*     */                             int label;
/*     */                             
/*     */                             @Nullable
/*     */                             public final Object invokeSuspend(@NotNull Object $result) {
/*     */                               IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                               switch (this.label) {
/*     */                                 case 0:
/*     */                                   ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                                   Intrinsics.checkNotNullExpressionValue(this.$sb.toString(), "sb.toString()");
/*     */                                   AIAssistantChatPanelController.this.session.setTitle(new ChatTitle(this.$sb.toString(), true));
/*     */                                   return Unit.INSTANCE;
/*     */                               } 
/*     */                               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */                             }
/*     */                             
/*     */                             @NotNull
/*     */                             public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*     */                               return (Continuation)new Function2<>(AIAssistantChatPanelController.this, this.$sb, $completion);
/*     */                             }
/*     */                             
/*     */                             @Nullable
/*     */                             public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */                               return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                             }
/*     */                           }(Continuation)this);
/*     */                       return Unit.INSTANCE;
/*     */                     case 1:
/*     */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                       return Unit.INSTANCE;
/*     */                   } 
/*     */                   throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */                 }
/*     */                 
/*     */                 @NotNull
/*     */                 public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*     */                   Function2<String, Continuation<? super Unit>, Object> function2 = new Function2<>(this.$sb, AIAssistantChatPanelController.this, $completion);
/*     */                   function2.L$0 = value;
/*     */                   return (Continuation)function2;
/*     */                 }
/*     */                 
/*     */                 @Nullable
/*     */                 public final Object invoke(@NotNull String p1, @Nullable Continuation<?> p2) {
/*     */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                 }
/*     */               }(Continuation)this) == object2)
/*     */             return object2; 
/*     */           ((AIRequestService)object1).generateDialogTitle(this.$prompt.toString(), this.$messagesToUse, new Function2<String, Continuation<? super Unit>, Object>(AIAssistantChatPanelController.this, null) {
/*     */                 int label;
/*     */                 
/*     */                 @Nullable
/*     */                 public final Object invokeSuspend(@NotNull Object $result) {
/*     */                   String it;
/*     */                   Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                   switch (this.label) {
/*     */                     case 0:
/*     */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                       it = (String)this.L$0;
/*     */                       this.$sb.append(it);
/*     */                       this.label = 1;
/*     */                       if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$sb, null) {
/*     */                             int label;
/*     */                             
/*     */                             @Nullable
/*     */                             public final Object invokeSuspend(@NotNull Object $result) {
/*     */                               IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                               switch (this.label) {
/*     */                                 case 0:
/*     */                                   ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                                   Intrinsics.checkNotNullExpressionValue(this.$sb.toString(), "sb.toString()");
/*     */                                   AIAssistantChatPanelController.this.session.setTitle(new ChatTitle(this.$sb.toString(), true));
/*     */                                   return Unit.INSTANCE;
/*     */                               } 
/*     */                               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */                             }
/*     */                             
/*     */                             @NotNull
/*     */                             public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*     */                               return (Continuation)new Function2<>(AIAssistantChatPanelController.this, this.$sb, $completion);
/*     */                             }
/*     */                             
/*     */                             @Nullable
/*     */                             public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */                               return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                             }
/*     */                           }(Continuation)this) == object)
/*     */                         return object; 
/*     */                       BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$sb, null) {
/*     */                             int label;
/*     */                             
/*     */                             @Nullable
/*     */                             public final Object invokeSuspend(@NotNull Object $result) {
/*     */                               IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                               switch (this.label) {
/*     */                                 case 0:
/*     */                                   ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                                   Intrinsics.checkNotNullExpressionValue(this.$sb.toString(), "sb.toString()");
/*     */                                   AIAssistantChatPanelController.this.session.setTitle(new ChatTitle(this.$sb.toString(), true));
/*     */                                   return Unit.INSTANCE;
/*     */                               } 
/*     */                               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */                             }
/*     */                             
/*     */                             @NotNull
/*     */                             public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*     */                               return (Continuation)new Function2<>(AIAssistantChatPanelController.this, this.$sb, $completion);
/*     */                             }
/*     */                             
/*     */                             @Nullable
/*     */                             public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */                               return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                             }
/*     */                           }(Continuation)this);
/*     */                       return Unit.INSTANCE;
/*     */                     case 1:
/*     */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                       return Unit.INSTANCE;
/*     */                   } 
/*     */                   throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */                 }
/*     */                 
/*     */                 @NotNull
/*     */                 public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*     */                   Function2<String, Continuation<? super Unit>, Object> function2 = new Function2<>(this.$sb, AIAssistantChatPanelController.this, $completion);
/*     */                   function2.L$0 = value;
/*     */                   return (Continuation)function2;
/*     */                 }
/*     */                 
/*     */                 @Nullable
/*     */                 public final Object invoke(@NotNull String p1, @Nullable Continuation<?> p2) {
/*     */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                 }
/*     */               }(Continuation)this);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE; }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */     
/*     */     int label;
/*     */     
/*     */     AIAssistantChatPanelController$generateTitle$1(StringBuilder $prompt, List<CompletableMessage> $messagesToUse, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super AIAssistantChatPanelController$generateTitle$1> $completion) {
/*     */       return (Continuation<Unit>)new AIAssistantChatPanelController$generateTitle$1(this.$prompt, this.$messagesToUse, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */       return ((AIAssistantChatPanelController$generateTitle$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanelController.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */