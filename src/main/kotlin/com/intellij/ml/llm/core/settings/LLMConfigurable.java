/*     */ package com.intellij.ml.llm.core.settings;
/*     */ import com.intellij.codeWithMe.ClientId;
/*     */ import com.intellij.ml.llm.LLMBundle;
/*     */ import com.intellij.ml.llm.core.grazieAPI.GrazieAuthService;
/*     */ import com.intellij.ml.llm.core.grazieAPI.GrazieAuthServiceKt;
/*     */ import com.intellij.ml.llm.core.grazieAPI.GrazieAuthState;
/*     */ import com.intellij.openapi.application.ApplicationManager;
/*     */ import com.intellij.ui.dsl.builder.Panel;
/*     */ import com.intellij.ui.dsl.builder.Row;
/*     */ import java.awt.event.ActionEvent;
/*     */ import javax.swing.JEditorPane;
/*     */ import javax.swing.JLabel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\b\020\f\032\0020\rH\026J\036\020\016\032\b\022\004\022\002H\0200\017\"\004\b\000\020\020*\b\022\004\022\002H\0200\006H\002R\024\020\005\032\b\022\004\022\0020\0070\006X\004¢\006\002\n\000R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\b\032\0020\tX\004¢\006\002\n\000R\016\020\n\032\0020\013X\004¢\006\002\n\000¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/core/settings/LLMConfigurable;", "Lcom/intellij/openapi/options/BoundConfigurable;", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;)V", "authState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "settings", "Lcom/intellij/ml/llm/core/settings/LLMSettingsManager;", "createPanel", "Lcom/intellij/openapi/ui/DialogPanel;", "asObs", "Lcom/intellij/openapi/observable/properties/AbstractObservableProperty;", "T", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nLLMConfigurable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMConfigurable.kt\ncom/intellij/ml/llm/core/settings/LLMConfigurable\n+ 2 service.kt\ncom/intellij/openapi/components/ServiceKt\n*L\n1#1,110:1\n43#2,3:111\n43#2,3:114\n*S KotlinDebug\n*F\n+ 1 LLMConfigurable.kt\ncom/intellij/ml/llm/core/settings/LLMConfigurable\n*L\n37#1:111,3\n38#1:114,3\n*E\n"})
/*     */ public final class LLMConfigurable extends BoundConfigurable {
/*     */   public LLMConfigurable(@NotNull Project project) {
/*  33 */     super(LLMBundle.message("settings.configurable.display.name", new Object[0]), null, 2, null); this.project = project;
/*     */ 
/*     */     
/*  36 */     this.scope = CoroutineScopeKt.CoroutineScope((CoroutineContext)Dispatchers.getIO());
/*  37 */     int $i$f$service = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 111 */     Class<GrazieAuthService> clazz = GrazieAuthService.class;
/* 112 */     Object object = ApplicationManager.getApplication().getService(clazz); if (object == null)
/* 113 */       throw new RuntimeException("Cannot find service " + clazz.getName() + " (classloader=" + clazz.getClassLoader() + ", client=" + ClientId.Companion.getCurrentOrNull() + ")");  this.authState = ((GrazieAuthService)object).getAuthState(); $i$f$service = 0;
/* 114 */     Class<LLMSettingsManager> serviceClass$iv = LLMSettingsManager.class;
/* 115 */     object = ApplicationManager.getApplication().getService(serviceClass$iv); if (object == null)
/* 116 */       throw new RuntimeException("Cannot find service " + serviceClass$iv.getName() + " (classloader=" + serviceClass$iv.getClassLoader() + ", client=" + ClientId.Companion.getCurrentOrNull() + ")"); 
/*     */     this.settings = (LLMSettingsManager)object;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private final Project project;
/*     */   @NotNull
/*     */   private final CoroutineScope scope;
/*     */   @NotNull
/*     */   private final StateFlow<GrazieAuthState> authState;
/*     */   @NotNull
/*     */   private final LLMSettingsManager settings;
/*     */   
/*     */   private final <T> AbstractObservableProperty<T> asObs(StateFlow $this$asObs) {
/*     */     Intrinsics.checkNotNullExpressionValue(ModalityState.any(), "any()");
/*     */     return StateFlowToObservablePropertyAdapterKt.asObservable($this$asObs, this.scope, CoroutinesKt.getEDT(Dispatchers.INSTANCE).plus(ModalityKt.asContextElement(ModalityState.any())));
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public DialogPanel createPanel() {
/*     */     Intrinsics.checkNotNull(getDisposable());
/*     */     Disposer.register(getDisposable(), this::createPanel$lambda$0);
/*     */     return BuilderKt.panel(new LLMConfigurable$createPanel$2());
/*     */   }
/*     */   
/*     */   private static final void createPanel$lambda$0(LLMConfigurable this$0) {
/*     */     Intrinsics.checkNotNullParameter(this$0, "this$0");
/*     */     CoroutineScopeKt.cancel$default(this$0.scope, null, 1, null);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/ui/dsl/builder/Panel;", "invoke"})
/*     */   static final class LLMConfigurable$createPanel$2 extends Lambda implements Function1<Panel, Unit> {
/*     */     public final void invoke(@NotNull Panel $this$panel) {
/*     */       Intrinsics.checkNotNullParameter($this$panel, "$this$panel");
/*     */       $this$panel.rowsRange(new Function1<Panel, Unit>() {
/*     */             public final void invoke(@NotNull Panel $this$rowsRange) {
/*     */               Intrinsics.checkNotNullParameter($this$rowsRange, "$this$rowsRange");
/*     */               Panel.row$default($this$rowsRange, null, new Function1<Row, Unit>() {
/*     */                     public final void invoke(@NotNull Row $this$row) {
/*     */                       Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*     */                       GrazieAuthState[] arrayOfGrazieAuthState = new GrazieAuthState[1];
/*     */                       arrayOfGrazieAuthState[0] = GrazieAuthState.Authed;
/*     */                       $this$row.label("You're logged in to JetBrains AI").visibleIf((ObservableProperty)LLMConfigurable.this.asObs(GrazieAuthServiceKt.isAnySelected(LLMConfigurable.this.authState, arrayOfGrazieAuthState)));
/*     */                     }
/*     */                   }1, null);
/*     */               GrazieAuthState[] arrayOfGrazieAuthState = new GrazieAuthState[1];
/*     */               arrayOfGrazieAuthState[0] = GrazieAuthState.InProgress;
/*     */               Panel.row$default($this$rowsRange, null, new Function1<Row, Unit>() {
/*     */                     public final void invoke(@NotNull Row $this$row) {
/*     */                       Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*     */                       Intrinsics.checkNotNullExpressionValue(AnimatedIcon.Default.INSTANCE, "INSTANCE");
/*     */                       $this$row.icon((Icon)AnimatedIcon.Default.INSTANCE).customize(UnscaledGapsKt.UnscaledGaps$default(6, 0, 0, 6, 6, null)).align((Align)AlignY.TOP.INSTANCE);
/*     */                       $this$row.panel(new Function1<Panel, Unit>() {
/*     */                             public final void invoke(@NotNull Panel $this$panel) {
/*     */                               Intrinsics.checkNotNullParameter($this$panel, "$this$panel");
/*     */                               Panel.row$default($this$panel, null, null.INSTANCE, 1, null);
/*     */                               Panel.row$default($this$panel, null, new Function1<Row, Unit>() {
/*     */                                     public final void invoke(@NotNull Row $this$row) {
/*     */                                       Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*     */                                       $this$row.link("Cancel", new Function1<ActionEvent, Unit>() {
/*     */                                             public final void invoke(@NotNull ActionEvent it) {
/*     */                                               Intrinsics.checkNotNullParameter(it, "it");
/*     */                                               BuildersKt.launch$default(LLMConfigurable.this.scope, null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) {
/*     */                                                     int label;
/*     */                                                     
/*     */                                                     @Nullable
/*     */                                                     public final Object invokeSuspend(@NotNull Object $result) {
/*     */                                                       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                                                       switch (this.label) {
/*     */                                                         case 0:
/*     */                                                           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                                                           GrazieAuthService.Companion.getInstance().cancel();
/*     */                                                           return Unit.INSTANCE;
/*     */                                                       } 
/*     */                                                       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */                                                     }
/*     */                                                     
/*     */                                                     @NotNull
/*     */                                                     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*     */                                                       return (Continuation)new Function2<>($completion);
/*     */                                                     }
/*     */                                                     
/*     */                                                     @Nullable
/*     */                                                     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */                                                       return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                                                     }
/*     */                                                   }3, null);
/*     */                                             }
/*     */                                           });
/*     */                                     }
/*     */                                   }1, null);
/*     */                             }
/*     */                           }).align((Align)AlignY.TOP.INSTANCE);
/*     */                     }
/*     */                   }1, null).visibleIf((ObservableProperty)LLMConfigurable.this.asObs(GrazieAuthServiceKt.isAnySelected(LLMConfigurable.this.authState, arrayOfGrazieAuthState))).resizableRow();
/*     */               arrayOfGrazieAuthState = new GrazieAuthState[1];
/*     */               arrayOfGrazieAuthState[0] = GrazieAuthState.WaitList;
/*     */               Panel.row$default($this$rowsRange, null, new Function1<Row, Unit>() {
/*     */                     public final void invoke(@NotNull Row $this$row) {
/*     */                       Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*     */                       Row.text$default($this$row, LLMBundle.message("label.waiting.list", new Object[0]), 0, LLMConfigurable.this::invoke$lambda$0, 2, null).applyToComponent(null.INSTANCE);
/*     */                     }
/*     */                     
/*     */                     private static final void invoke$lambda$0(LLMConfigurable this$0, HyperlinkEvent it) {
/*     */                       Intrinsics.checkNotNullParameter(LLMConfigurable.this, "this$0");
/*     */                       Intrinsics.checkNotNullParameter(it, "it");
/*     */                       BuildersKt.launch$default(AIAssistantServiceScope.Companion.getScope(LLMConfigurable.this.project), null, null, new LLMConfigurable$createPanel$2$1$3$1$1(null), 3, null);
/*     */                     }
/*     */                   }1, null).visibleIf((ObservableProperty)LLMConfigurable.this.asObs(GrazieAuthServiceKt.isAnySelected(LLMConfigurable.this.authState, arrayOfGrazieAuthState)));
/*     */               Panel.row$default($this$rowsRange, null, new Function1<Row, Unit>() {
/*     */                     public final void invoke(@NotNull Row $this$row) {
/*     */                       Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*     */                       GrazieAuthState[] arrayOfGrazieAuthState = new GrazieAuthState[1];
/*     */                       arrayOfGrazieAuthState[0] = GrazieAuthState.NoAuth;
/*     */                       $this$row.button(LLMBundle.message("settings.button.log.in.to.grazie", new Object[0]), new Function1<ActionEvent, Unit>() {
/*     */                             public final void invoke(@NotNull ActionEvent it) {
/*     */                               Intrinsics.checkNotNullParameter(it, "it");
/*     */                               BuildersKt.launch$default(LLMConfigurable.this.scope, null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) {
/*     */                                     int label;
/*     */                                     
/*     */                                     @Nullable
/*     */                                     public final Object invokeSuspend(@NotNull Object $result) {
/*     */                                       int $i$f$service;
/*     */                                       Class<GrazieAuthService> serviceClass$iv;
/*     */                                       Object object1, object2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                                       switch (this.label) {
/*     */                                         case 0:
/*     */                                           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                                           $i$f$service = 0;
/*     */                                           serviceClass$iv = GrazieAuthService.class;
/*     */                                           object1 = ApplicationManager.getApplication().getService(serviceClass$iv);
/*     */                                           if (object1 == null)
/*     */                                             throw new RuntimeException("Cannot find service " + serviceClass$iv.getName() + " (classloader=" + serviceClass$iv.getClassLoader() + ", client=" + ClientId.Companion.getCurrentOrNull() + ")"); 
/*     */                                           this.label = 1;
/*     */                                           if (((GrazieAuthService)object1).authenticate(LLMConfigurable.this.project, (Continuation)this) == object2)
/*     */                                             return object2; 
/*     */                                           ((GrazieAuthService)object1).authenticate(LLMConfigurable.this.project, (Continuation)this);
/*     */                                           return Unit.INSTANCE;
/*     */                                         case 1:
/*     */                                           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                                           return Unit.INSTANCE;
/*     */                                       } 
/*     */                                       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */                                     }
/*     */                                     
/*     */                                     @NotNull
/*     */                                     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*     */                                       return (Continuation)new Function2<>(LLMConfigurable.this, $completion);
/*     */                                     }
/*     */                                     
/*     */                                     @Nullable
/*     */                                     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */                                       return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                                     }
/*     */                                   }3, null);
/*     */                             }
/*     */                           }).visibleIf((ObservableProperty)LLMConfigurable.this.asObs(GrazieAuthServiceKt.isAnySelected(LLMConfigurable.this.authState, arrayOfGrazieAuthState)));
/*     */                       arrayOfGrazieAuthState = new GrazieAuthState[1];
/*     */                       arrayOfGrazieAuthState[0] = GrazieAuthState.Authed;
/*     */                       $this$row.button(LLMBundle.message("settings.button.log.out", new Object[0]), null.INSTANCE).visibleIf((ObservableProperty)LLMConfigurable.this.asObs(GrazieAuthServiceKt.isAnySelected(LLMConfigurable.this.authState, arrayOfGrazieAuthState)));
/*     */                     }
/*     */                   }1, null);
/*     */               if (LLMOptionsApplicabilityFilter.Companion.isAnyFeatureApplicable()) {
/*     */                 arrayOfGrazieAuthState = new GrazieAuthState[1];
/*     */                 arrayOfGrazieAuthState[0] = GrazieAuthState.Authed;
/*     */                 Panel.buttonsGroup$default($this$rowsRange, LLMBundle.message("settings.group.features", new Object[0]), false, new Function1<Panel, Unit>() {
/*     */                       public final void invoke(@NotNull Panel $this$buttonsGroup) {
/*     */                         Intrinsics.checkNotNullParameter($this$buttonsGroup, "$this$buttonsGroup");
/*     */                         if (LLMOptionsApplicabilityFilter.Companion.isOptionApplicable(LLMFeatureId.NAME_SUGGESTION))
/*     */                           Panel.row$default($this$buttonsGroup, null, new Function1<Row, Unit>() {
/*     */                                 public final void invoke(@NotNull Row $this$row) {
/*     */                                   Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*     */                                   ButtonKt.bindSelected($this$row.checkBox(LLMBundle.message("settings.checkbox.provide.ai.generated.name.suggestions", new Object[0])), new Function0<Boolean>(LLMConfigurable.this.settings) {
/*     */                                         @NotNull
/*     */                                         public final Boolean invoke() {
/*     */                                           return Boolean.valueOf(((LLMSettingsManager)this.receiver).isNameSuggestionsEnabled());
/*     */                                         }
/*     */                                       },  new Function1<Boolean, Unit>(LLMConfigurable.this.settings) {
/*     */                                         public final void invoke(boolean p0) {
/*     */                                           ((LLMSettingsManager)this.receiver).setNameSuggestionsEnabled(p0);
/*     */                                         }
/*     */                                       });
/*     */                                 }
/*     */                               }1, null); 
/*     */                       }
/*     */                     }2, null).visibleIf((ObservableProperty)LLMConfigurable.this.asObs(GrazieAuthServiceKt.isAnySelected(LLMConfigurable.this.authState, arrayOfGrazieAuthState)));
/*     */               } 
/*     */               System.getProperty("llm.is.internal");
/*     */               Row.rowComment$default(Panel.row$default($this$rowsRange, null, null.INSTANCE, 1, null), "Internal only! Do not share your token with anyone", 0, null, 6, null).visible((System.getProperty("llm.is.internal") != null) ? ((Boolean.parseBoolean(System.getProperty("llm.is.internal")) == true)) : false);
/*     */             }
/*     */           });
/*     */     }
/*     */     
/*     */     LLMConfigurable$createPanel$2() {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/settings/LLMConfigurable.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */