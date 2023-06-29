/*     */ package com.intellij.ml.llm.core.chat.ui;
/*     */ import com.intellij.ml.llm.core.chat.session.ChatCreationContext;
/*     */ import com.intellij.ml.llm.core.chat.session.ChatOrigin;
/*     */ import com.intellij.ml.llm.core.chat.session.ChatSession;
/*     */ import com.intellij.ml.llm.core.chat.session.ChatSessionStorage;
/*     */ import com.intellij.ml.llm.core.chat.ui.chat.AIAssistantChatPanel;
/*     */ import com.intellij.ml.llm.core.grazieAPI.GrazieAuthState;
/*     */ import com.intellij.openapi.application.CoroutinesKt;
/*     */ import javax.swing.JComponent;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.Dispatchers;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000r\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020%\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\002\n\002\020\000\n\000\n\002\020\016\n\002\b\005\n\002\030\002\n\002\b\006\030\000 02\0020\0012\0020\002:\0010B\025\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006¢\006\002\020\007J\b\020\037\032\0020 H\002J\006\020!\032\0020 J\022\020\"\032\004\030\0010#2\006\020$\032\0020%H\026J\020\020&\032\0020\0242\006\020'\032\0020\023H\002J\006\020(\032\0020 J\031\020)\032\0020 2\006\020*\032\0020+H@ø\001\000¢\006\002\020,J\020\020-\032\0020 2\006\020.\032\0020\032H\002J\b\020/\032\0020 H\026R\032\020\b\032\b\022\004\022\0020\n0\t8BX\004¢\006\006\032\004\b\013\020\fR\024\020\r\032\0020\0168BX\004¢\006\006\032\004\b\017\020\020R\032\020\021\032\016\022\004\022\0020\023\022\004\022\0020\0240\022X\004¢\006\002\n\000R\024\020\025\032\0020\0268BX\004¢\006\006\032\004\b\027\020\030R\020\020\031\032\004\030\0010\032X\016¢\006\002\n\000R\016\020\003\032\0020\004X\004¢\006\002\n\000R\024\020\033\032\0020\0348BX\004¢\006\006\032\004\b\035\020\036\002\004\n\002\b\031¨\0061"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/AIAssistantContainerPanel;", "Lcom/intellij/util/ui/components/BorderLayoutPanel;", "Lcom/intellij/openapi/actionSystem/DataProvider;", "project", "Lcom/intellij/openapi/project/Project;", "disposable", "Lcom/intellij/openapi/Disposable;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/Disposable;)V", "authState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;", "getAuthState", "()Lkotlinx/coroutines/flow/StateFlow;", "chatManager", "Lcom/intellij/ml/llm/core/chat/session/ChatSessionHost;", "getChatManager", "()Lcom/intellij/ml/llm/core/chat/session/ChatSessionHost;", "chatPanelCache", "", "Lcom/intellij/ml/llm/core/chat/session/ChatSession;", "Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel;", "focusedChatManager", "Lcom/intellij/ml/llm/core/chat/session/FocusedChatSessionHost;", "getFocusedChatManager", "()Lcom/intellij/ml/llm/core/chat/session/FocusedChatSessionHost;", "lastShownPanel", "Ljavax/swing/JComponent;", "serviceScope", "Lkotlinx/coroutines/CoroutineScope;", "getServiceScope", "()Lkotlinx/coroutines/CoroutineScope;", "cleanupEmptyDialog", "", "focusDefaultComponent", "getData", "", "dataId", "", "getOrCreateChatPanel", "chat", "goToAllDialogs", "goToNewDialog", "chatCreationContext", "Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;", "(Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "goToPanel", "comp", "updateUI", "Companion", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nAIAssistantContainerPanel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIAssistantContainerPanel.kt\ncom/intellij/ml/llm/core/chat/ui/AIAssistantContainerPanel\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,167:1\n29#2,3:168\n29#2,3:171\n766#3:174\n857#3,2:175\n361#4,7:177\n*S KotlinDebug\n*F\n+ 1 AIAssistantContainerPanel.kt\ncom/intellij/ml/llm/core/chat/ui/AIAssistantContainerPanel\n*L\n33#1:168,3\n34#1:171,3\n114#1:174\n114#1:175,2\n137#1:177,7\n*E\n"})
/*     */ public final class AIAssistantContainerPanel extends BorderLayoutPanel implements DataProvider {
/*     */   public AIAssistantContainerPanel(@NotNull Project project, @NotNull Disposable disposable) {
/*  27 */     this.project = project;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  35 */     this.chatPanelCache = new LinkedHashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  45 */     setMinimumSize((Dimension)new JBDimension(20, 20));
/*     */     
/*  47 */     BuildersKt.launch$default(getServiceScope(), null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { GrazieAuthState[] arrayOfGrazieAuthState; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*  48 */                 arrayOfGrazieAuthState = new GrazieAuthState[1]; arrayOfGrazieAuthState[0] = GrazieAuthState.Authed; this.label = 1; if (GrazieAuthServiceKt.isAnySelected(AIAssistantContainerPanel.this.getAuthState(), arrayOfGrazieAuthState).collect(new FlowCollector() { @Nullable
/*  49 */                       public final Object emit(boolean isAuthed, @NotNull Continuation $completion) { if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(AIAssistantContainerPanel.this, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*  50 */                                     if (this.$isAuthed) {
/*  51 */                                       JComponent lsp = AIAssistantContainerPanel.this.lastShownPanel;
/*  52 */                                       if (lsp != null && !(lsp instanceof AIAssistantLoginPanel)) {
/*  53 */                                         AIAssistantContainerPanel.this.goToPanel(lsp);
/*     */                                       } else {
/*     */                                         
/*  56 */                                         this.label = 1; if (AIAssistantContainerPanel.this.goToNewDialog(new ChatCreationContext((ChatOrigin)ChatOrigin.AIAssistantTool.INSTANCE, ChatSessionStorage.SourceAction.NEW_CHAT, null, null, 12, null), (Continuation<? super Unit>)this) == object) return object;  AIAssistantContainerPanel.this.goToNewDialog(new ChatCreationContext((ChatOrigin)ChatOrigin.AIAssistantTool.INSTANCE, ChatSessionStorage.SourceAction.NEW_CHAT, null, null, 12, null), (Continuation<? super Unit>)this);
/*     */                                       } 
/*     */                                     } else {
/*     */                                       
/*  60 */                                       AIAssistantContainerPanel.this.goToPanel(new AIAssistantLoginPanel(AIAssistantContainerPanel.this.getServiceScope(), AIAssistantContainerPanel.this.project));
/*     */                                     } 
/*  62 */                                     return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$isAuthed, AIAssistantContainerPanel.this, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }$completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(AIAssistantContainerPanel.this, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); if (this.$isAuthed) { JComponent lsp = AIAssistantContainerPanel.this.lastShownPanel; if (lsp != null && !(lsp instanceof AIAssistantLoginPanel)) { AIAssistantContainerPanel.this.goToPanel(lsp); } else { this.label = 1; if (AIAssistantContainerPanel.this.goToNewDialog(new ChatCreationContext((ChatOrigin)ChatOrigin.AIAssistantTool.INSTANCE, ChatSessionStorage.SourceAction.NEW_CHAT, null, null, 12, null), (Continuation<? super Unit>)this) == object) return object;  AIAssistantContainerPanel.this.goToNewDialog(new ChatCreationContext((ChatOrigin)ChatOrigin.AIAssistantTool.INSTANCE, ChatSessionStorage.SourceAction.NEW_CHAT, null, null, 12, null), (Continuation<? super Unit>)this); }  } else { AIAssistantContainerPanel.this.goToPanel(new AIAssistantLoginPanel(AIAssistantContainerPanel.this.getServiceScope(), AIAssistantContainerPanel.this.project)); }  return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$isAuthed, AIAssistantContainerPanel.this, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }$completion);  BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(AIAssistantContainerPanel.this, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); if (this.$isAuthed) { JComponent lsp = AIAssistantContainerPanel.this.lastShownPanel; if (lsp != null && !(lsp instanceof AIAssistantLoginPanel)) { AIAssistantContainerPanel.this.goToPanel(lsp); } else { this.label = 1; if (AIAssistantContainerPanel.this.goToNewDialog(new ChatCreationContext((ChatOrigin)ChatOrigin.AIAssistantTool.INSTANCE, ChatSessionStorage.SourceAction.NEW_CHAT, null, null, 12, null), (Continuation<? super Unit>)this) == object) return object;  AIAssistantContainerPanel.this.goToNewDialog(new ChatCreationContext((ChatOrigin)ChatOrigin.AIAssistantTool.INSTANCE, ChatSessionStorage.SourceAction.NEW_CHAT, null, null, 12, null), (Continuation<? super Unit>)this); }  } else { AIAssistantContainerPanel.this.goToPanel(new AIAssistantLoginPanel(AIAssistantContainerPanel.this.getServiceScope(), AIAssistantContainerPanel.this.project)); }  return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$isAuthed, AIAssistantContainerPanel.this, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }$completion); return Unit.INSTANCE; } }(Continuation)this) == object) return object;  GrazieAuthServiceKt.isAnySelected(AIAssistantContainerPanel.this.getAuthState(), arrayOfGrazieAuthState).collect(new FlowCollector() { @Nullable public final Object emit(boolean isAuthed, @NotNull Continuation $completion) { if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(AIAssistantContainerPanel.this, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); if (this.$isAuthed) { JComponent lsp = AIAssistantContainerPanel.this.lastShownPanel; if (lsp != null && !(lsp instanceof AIAssistantLoginPanel)) { AIAssistantContainerPanel.this.goToPanel(lsp); } else { this.label = 1; if (AIAssistantContainerPanel.this.goToNewDialog(new ChatCreationContext((ChatOrigin)ChatOrigin.AIAssistantTool.INSTANCE, ChatSessionStorage.SourceAction.NEW_CHAT, null, null, 12, null), (Continuation<? super Unit>)this) == object) return object;  AIAssistantContainerPanel.this.goToNewDialog(new ChatCreationContext((ChatOrigin)ChatOrigin.AIAssistantTool.INSTANCE, ChatSessionStorage.SourceAction.NEW_CHAT, null, null, 12, null), (Continuation<? super Unit>)this); }  } else { AIAssistantContainerPanel.this.goToPanel(new AIAssistantLoginPanel(AIAssistantContainerPanel.this.getServiceScope(), AIAssistantContainerPanel.this.project)); }  return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$isAuthed, AIAssistantContainerPanel.this, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }$completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(AIAssistantContainerPanel.this, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); if (this.$isAuthed) { JComponent lsp = AIAssistantContainerPanel.this.lastShownPanel; if (lsp != null && !(lsp instanceof AIAssistantLoginPanel)) { AIAssistantContainerPanel.this.goToPanel(lsp); } else { this.label = 1; if (AIAssistantContainerPanel.this.goToNewDialog(new ChatCreationContext((ChatOrigin)ChatOrigin.AIAssistantTool.INSTANCE, ChatSessionStorage.SourceAction.NEW_CHAT, null, null, 12, null), (Continuation<? super Unit>)this) == object) return object;  AIAssistantContainerPanel.this.goToNewDialog(new ChatCreationContext((ChatOrigin)ChatOrigin.AIAssistantTool.INSTANCE, ChatSessionStorage.SourceAction.NEW_CHAT, null, null, 12, null), (Continuation<? super Unit>)this); }  } else { AIAssistantContainerPanel.this.goToPanel(new AIAssistantLoginPanel(AIAssistantContainerPanel.this.getServiceScope(), AIAssistantContainerPanel.this.project)); }  return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$isAuthed, AIAssistantContainerPanel.this, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }$completion);  BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(AIAssistantContainerPanel.this, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); if (this.$isAuthed) { JComponent lsp = AIAssistantContainerPanel.this.lastShownPanel; if (lsp != null && !(lsp instanceof AIAssistantLoginPanel)) { AIAssistantContainerPanel.this.goToPanel(lsp); } else { this.label = 1; if (AIAssistantContainerPanel.this.goToNewDialog(new ChatCreationContext((ChatOrigin)ChatOrigin.AIAssistantTool.INSTANCE, ChatSessionStorage.SourceAction.NEW_CHAT, null, null, 12, null), (Continuation<? super Unit>)this) == object) return object;  AIAssistantContainerPanel.this.goToNewDialog(new ChatCreationContext((ChatOrigin)ChatOrigin.AIAssistantTool.INSTANCE, ChatSessionStorage.SourceAction.NEW_CHAT, null, null, 12, null), (Continuation<? super Unit>)this); }  } else { AIAssistantContainerPanel.this.goToPanel(new AIAssistantLoginPanel(AIAssistantContainerPanel.this.getServiceScope(), AIAssistantContainerPanel.this.project)); }  return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */                               @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$isAuthed, AIAssistantContainerPanel.this, $completion); }
/*     */                               @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }$completion); return Unit.INSTANCE; } }(Continuation)this); throw new KotlinNothingValueException();case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); throw new KotlinNothingValueException(); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */           @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(AIAssistantContainerPanel.this, $completion); }
/*  66 */           @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }3, null); AIAssistantContainerPanel$chatListener$1 chatListener = new AIAssistantContainerPanel$chatListener$1();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  78 */     getChatManager().addListener(chatListener);
/*  79 */     DisposerUtilKt.whenDisposed(disposable, new Function0<Unit>(chatListener) { public final void invoke() {
/*  80 */             AIAssistantContainerPanel.this.getChatManager().removeListener(this.$chatListener);
/*     */             
/*  82 */             for (AIAssistantChatPanel chatPanel : AIAssistantContainerPanel.this.chatPanelCache.values()) {
/*  83 */               Disposer.dispose((Disposable)chatPanel);
/*     */             }
/*     */           } }
/*     */       );
/*  87 */     AIAssistantContainerPanel$focusListener$1 focusListener = new AIAssistantContainerPanel$focusListener$1();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  93 */     getFocusedChatManager().addListener(focusListener);
/*  94 */     DisposerUtilKt.whenDisposed(disposable, new Function0<Unit>(focusListener) { public final void invoke() {
/*  95 */             AIAssistantContainerPanel.this.getFocusedChatManager().removeListener(this.$focusListener);
/*     */           } }
/*     */       );
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R$\020\003\032\025\022\f\022\n \006*\004\030\0010\0050\0050\004¢\006\002\b\007¢\006\b\n\000\032\004\b\b\020\t¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/AIAssistantContainerPanel$Companion;", "", "()V", "AIAssistantContainer", "Lcom/intellij/openapi/actionSystem/DataKey;", "Lcom/intellij/ml/llm/core/chat/ui/AIAssistantContainerPanel;", "kotlin.jvm.PlatformType", "Lorg/jetbrains/annotations/NotNull;", "getAIAssistantContainer", "()Lcom/intellij/openapi/actionSystem/DataKey;", "intellij.ml.llm"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final DataKey<AIAssistantContainerPanel> getAIAssistantContainer() {
/*     */       return AIAssistantContainerPanel.AIAssistantContainer;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private final Project project;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private final Map<ChatSession, AIAssistantChatPanel> chatPanelCache;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   private JComponent lastShownPanel;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private static final DataKey<AIAssistantContainerPanel> AIAssistantContainer = DataKey.create("AIAssistantContainer");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static {
/*     */     Intrinsics.checkNotNullExpressionValue(DataKey.create("AIAssistantContainer"), "create<AIAssistantContai…>(\"AIAssistantContainer\")");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final ChatSessionHost getChatManager()
/*     */   {
/*     */     ComponentManager $this$service$iv = (ComponentManager)this.project;
/*     */     int $i$f$service = 0;
/* 168 */     Class<ChatSessionHost> serviceClass$iv = ChatSessionHost.class;
/* 169 */     Object object = $this$service$iv.getService(serviceClass$iv); if (object == null) throw new IllegalStateException((
/* 170 */           "Cannot find service " + serviceClass$iv.getName() + " in " + $this$service$iv + " (classloader=" + serviceClass$iv.getClassLoader()).toString());  return (ChatSessionHost)object;
/* 171 */   } private final StateFlow<GrazieAuthState> getAuthState() { return GrazieAuthService.Companion.getInstance().getAuthState(); } private final CoroutineScope getServiceScope() { return AIAssistantServiceScope.Companion.getScope(this.project); } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\031\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\004\032\0020\005H\026¨\006\007"}, d2 = {"com/intellij/ml/llm/core/chat/ui/AIAssistantContainerPanel$chatListener$1", "Lcom/intellij/ml/llm/core/chat/session/ChatSessionHostListener;", "chatCreated", "", "session", "Lcom/intellij/ml/llm/core/chat/session/ChatSession;", "chatRemoved", "intellij.ml.llm"}) public static final class AIAssistantContainerPanel$chatListener$1 implements ChatSessionHostListener { public void chatCreated(@NotNull ChatSession session) { Intrinsics.checkNotNullParameter(session, "session"); } public void chatRemoved(@NotNull ChatSession session) { Intrinsics.checkNotNullParameter(session, "session"); AIAssistantChatPanel chatPanel = (AIAssistantChatPanel)AIAssistantContainerPanel.this.chatPanelCache.remove(session); AIAssistantChatPanel it = chatPanel; int $i$a$-let-AIAssistantContainerPanel$chatListener$1$chatRemoved$1 = 0; Disposer.dispose((Disposable)it); } } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/core/chat/ui/AIAssistantContainerPanel$focusListener$1", "Lcom/intellij/ml/llm/core/chat/session/FocusedChatSessionListener;", "onFocusChanged", "", "chatSession", "Lcom/intellij/ml/llm/core/chat/session/ChatSession;", "intellij.ml.llm"}) public static final class AIAssistantContainerPanel$focusListener$1 implements FocusedChatSessionListener { public void onFocusChanged(@NotNull ChatSession chatSession) { Intrinsics.checkNotNullParameter(chatSession, "chatSession"); AIAssistantContainerPanel.this.goToPanel((JComponent)AIAssistantContainerPanel.this.getOrCreateChatPanel(chatSession)); } } private final FocusedChatSessionHost getFocusedChatManager() { ComponentManager $this$service$iv = (ComponentManager)this.project; int $i$f$service = 0; Class<FocusedChatSessionHost> serviceClass$iv = FocusedChatSessionHost.class;
/* 172 */     Object object = $this$service$iv.getService(serviceClass$iv); if (object == null) throw new IllegalStateException((
/* 173 */           "Cannot find service " + serviceClass$iv.getName() + " in " + $this$service$iv + " (classloader=" + serviceClass$iv.getClassLoader()).toString());  return (FocusedChatSessionHost)object; }
/* 174 */   public final void goToAllDialogs() { goToPanel((JComponent)new AIAssistantChatListPanel(this.project, getChatManager(), getFocusedChatManager())); } private final void cleanupEmptyDialog() { Iterable $this$filter$iv = getChatManager().getAllChats(); int $i$f$filter = 0; Iterable iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 175 */     for (Object element$iv$iv : iterable1) { ChatSession it = (ChatSession)element$iv$iv; int $i$a$-filter-AIAssistantContainerPanel$cleanupEmptyDialog$emptyChats$1 = 0; if (it.getMessages().isEmpty()) destination$iv$iv.add(element$iv$iv);  }
/* 176 */      List emptyChats = CollectionsKt.toList(destination$iv$iv); for (ChatSession chat : emptyChats) getChatManager().removeChatSession(chat);  } @Nullable public final Object goToNewDialog(@NotNull ChatCreationContext chatCreationContext, @NotNull Continuation<? super Unit> paramContinuation) { // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/core/chat/ui/AIAssistantContainerPanel$goToNewDialog$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/core/chat/ui/AIAssistantContainerPanel$goToNewDialog$1
/*     */     //   11: astore #5
/*     */     //   13: aload #5
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #5
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/core/chat/ui/AIAssistantContainerPanel$goToNewDialog$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/core/chat/ui/AIAssistantContainerPanel;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #5
/*     */     //   50: aload #5
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #4
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #6
/*     */     //   62: aload #5
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 209, 0 -> 92, 1 -> 132, 2 -> 197
/*     */     //   92: aload #4
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_0
/*     */     //   98: invokespecial cleanupEmptyDialog : ()V
/*     */     //   101: aload_0
/*     */     //   102: invokespecial getChatManager : ()Lcom/intellij/ml/llm/core/chat/session/ChatSessionHost;
/*     */     //   105: aload_1
/*     */     //   106: aload #5
/*     */     //   108: aload #5
/*     */     //   110: aload_0
/*     */     //   111: putfield L$0 : Ljava/lang/Object;
/*     */     //   114: aload #5
/*     */     //   116: iconst_1
/*     */     //   117: putfield label : I
/*     */     //   120: invokevirtual createChatSession : (Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   123: dup
/*     */     //   124: aload #6
/*     */     //   126: if_acmpne -> 148
/*     */     //   129: aload #6
/*     */     //   131: areturn
/*     */     //   132: aload #5
/*     */     //   134: getfield L$0 : Ljava/lang/Object;
/*     */     //   137: checkcast com/intellij/ml/llm/core/chat/ui/AIAssistantContainerPanel
/*     */     //   140: astore_0
/*     */     //   141: aload #4
/*     */     //   143: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   146: aload #4
/*     */     //   148: checkcast com/intellij/ml/llm/core/chat/session/ChatSession
/*     */     //   151: astore_3
/*     */     //   152: getstatic kotlinx/coroutines/Dispatchers.INSTANCE : Lkotlinx/coroutines/Dispatchers;
/*     */     //   155: invokestatic getEDT : (Lkotlinx/coroutines/Dispatchers;)Lkotlin/coroutines/CoroutineContext;
/*     */     //   158: new com/intellij/ml/llm/core/chat/ui/AIAssistantContainerPanel$goToNewDialog$2
/*     */     //   161: dup
/*     */     //   162: aload_0
/*     */     //   163: aload_3
/*     */     //   164: aconst_null
/*     */     //   165: invokespecial <init> : (Lcom/intellij/ml/llm/core/chat/ui/AIAssistantContainerPanel;Lcom/intellij/ml/llm/core/chat/session/ChatSession;Lkotlin/coroutines/Continuation;)V
/*     */     //   168: checkcast kotlin/jvm/functions/Function2
/*     */     //   171: aload #5
/*     */     //   173: aload #5
/*     */     //   175: aconst_null
/*     */     //   176: putfield L$0 : Ljava/lang/Object;
/*     */     //   179: aload #5
/*     */     //   181: iconst_2
/*     */     //   182: putfield label : I
/*     */     //   185: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   188: dup
/*     */     //   189: aload #6
/*     */     //   191: if_acmpne -> 204
/*     */     //   194: aload #6
/*     */     //   196: areturn
/*     */     //   197: aload #4
/*     */     //   199: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   202: aload #4
/*     */     //   204: pop
/*     */     //   205: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   208: areturn
/*     */     //   209: new java/lang/IllegalStateException
/*     */     //   212: dup
/*     */     //   213: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   216: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   219: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #103	-> 60
/*     */     //   #104	-> 97
/*     */     //   #105	-> 101
/*     */     //   #103	-> 129
/*     */     //   #107	-> 152
/*     */     //   #103	-> 194
/*     */     //   #111	-> 204
/*     */     //   #103	-> 209
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	35	0	this	Lcom/intellij/ml/llm/core/chat/ui/AIAssistantContainerPanel;
/*     */     //   141	47	0	this	Lcom/intellij/ml/llm/core/chat/ui/AIAssistantContainerPanel;
/*     */     //   97	26	1	chatCreationContext	Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;
/*     */     //   152	36	3	newChat	Lcom/intellij/ml/llm/core/chat/session/ChatSession;
/*     */     //   50	159	5	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	152	4	$result	Ljava/lang/Object; } @DebugMetadata(f = "AIAssistantContainerPanel.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.chat.ui.AIAssistantContainerPanel$goToNewDialog$2") @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class AIAssistantContainerPanel$goToNewDialog$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/* 177 */     int label; AIAssistantContainerPanel$goToNewDialog$2(ChatSession $newChat, Continuation $completion) { super(2, $completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); AIAssistantContainerPanel.this.focusDefaultComponent(); AIAssistantContainerPanel.this.getFocusedChatManager().focusChatSession(this.$newChat); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super AIAssistantContainerPanel$goToNewDialog$2> $completion) { return (Continuation<Unit>)new AIAssistantContainerPanel$goToNewDialog$2(this.$newChat, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((AIAssistantContainerPanel$goToNewDialog$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } private final void goToPanel(JComponent comp) { ApplicationKt.getApplication().assertIsDispatchThread(); if (!(comp instanceof AIAssistantLoginPanel)) this.lastShownPanel = comp;  removeAll(); GrazieAuthState[] arrayOfGrazieAuthState = new GrazieAuthState[1]; arrayOfGrazieAuthState[0] = GrazieAuthState.Authed; if (((Boolean)GrazieAuthServiceKt.isAnySelected(getAuthState(), arrayOfGrazieAuthState).getValue()).booleanValue()) { addToCenter(comp); } else { addToCenter(new AIAssistantLoginPanel(getServiceScope(), this.project)); }  focusDefaultComponent(); revalidate(); repaint(); } private final AIAssistantChatPanel getOrCreateChatPanel(ChatSession chat) { Map<ChatSession, AIAssistantChatPanel> $this$getOrPut$iv = this.chatPanelCache; int $i$f$getOrPut = 0; Object value$iv = $this$getOrPut$iv.get(chat);
/* 178 */     if (value$iv == null) {
/* 179 */       int $i$a$-getOrPut-AIAssistantContainerPanel$getOrCreateChatPanel$1 = 0; AIAssistantChatPanel aIAssistantChatPanel1 = new AIAssistantChatPanel(this.project, chat), $this$getOrCreateChatPanel_u24lambda_u242_u24lambda_u241 = aIAssistantChatPanel1;
/*     */       int $i$a$-apply-AIAssistantContainerPanel$getOrCreateChatPanel$1$1 = 0;
/*     */       $this$getOrCreateChatPanel_u24lambda_u242_u24lambda_u241.initialize(this.project);
/*     */     } 
/* 183 */     return ((AIAssistantChatPanel)value$iv).beforeShown(); }
/*     */ 
/*     */   
/*     */   public final void focusDefaultComponent() {
/*     */     Intrinsics.checkNotNullExpressionValue(getComponents(), "components");
/*     */     Component content = (Component)ArraysKt.getOrNull((Object[])getComponents(), 0);
/*     */     if (content instanceof AIAssistantChatPanel) {
/*     */       ((AIAssistantChatPanel)content).focusInput();
/*     */     } else {
/*     */       return;
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object getData(@NotNull String dataId) {
/*     */     Intrinsics.checkNotNullParameter(dataId, "dataId");
/*     */     if (AIAssistantContainer.is(dataId))
/*     */       return this; 
/*     */     return null;
/*     */   }
/*     */   
/*     */   public void updateUI() {
/*     */     super.updateUI();
/*     */     if (this.chatPanelCache != null)
/*     */       for (AIAssistantChatPanel panel : this.chatPanelCache.values()) {
/*     */         if (panel.getParent() == null)
/*     */           IJSwingUtilities.updateComponentTreeUI((Component)panel); 
/*     */       }  
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AIAssistantContainerPanel.kt", l = {105, 107}, i = {0}, s = {"L$0"}, n = {"this"}, m = "goToNewDialog", c = "com.intellij.ml.llm.core.chat.ui.AIAssistantContainerPanel")
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
/*     */   static final class AIAssistantContainerPanel$goToNewDialog$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     AIAssistantContainerPanel$goToNewDialog$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AIAssistantContainerPanel.this.goToNewDialog((ChatCreationContext)null, (Continuation<? super Unit>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/AIAssistantContainerPanel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */