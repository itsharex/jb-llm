/*     */ package com.intellij.ml.llm.core.settings;
/*     */ import com.intellij.codeWithMe.ClientId;
/*     */ import com.intellij.ml.llm.LLMBundle;
/*     */ import com.intellij.ml.llm.core.chat.ui.AIAssistantColors;
/*     */ import com.intellij.ml.llm.core.grazieAPI.GrazieAuthService;
/*     */ import com.intellij.ml.llm.core.grazieAPI.GrazieAuthServiceKt;
/*     */ import com.intellij.ml.llm.core.grazieAPI.GrazieAuthState;
/*     */ import com.intellij.openapi.application.ApplicationManager;
/*     */ import com.intellij.openapi.observable.properties.ObservableProperty;
/*     */ import com.intellij.ui.AnimatedIcon;
/*     */ import com.intellij.ui.dsl.builder.Align;
/*     */ import com.intellij.ui.dsl.builder.AlignY;
/*     */ import com.intellij.ui.dsl.builder.ButtonKt;
/*     */ import com.intellij.ui.dsl.builder.Panel;
/*     */ import com.intellij.ui.dsl.builder.Row;
/*     */ import java.awt.event.ActionEvent;
/*     */ import javax.swing.JEditorPane;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.event.HyperlinkEvent;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.FunctionReferenceImpl;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/ui/dsl/builder/Panel;", "invoke"})
/*     */ final class LLMConfigurable$createPanel$2 extends Lambda implements Function1<Panel, Unit> {
/*     */   public final void invoke(@NotNull Panel $this$panel) {
/*  42 */     Intrinsics.checkNotNullParameter($this$panel, "$this$panel"); $this$panel.rowsRange(new Function1<Panel, Unit>() { public final void invoke(@NotNull Panel $this$rowsRange) {
/*  43 */             Intrinsics.checkNotNullParameter($this$rowsRange, "$this$rowsRange"); Panel.row$default($this$rowsRange, null, new Function1<Row, Unit>() { public final void invoke(@NotNull Row $this$row) {
/*  44 */                     Intrinsics.checkNotNullParameter($this$row, "$this$row"); GrazieAuthState[] arrayOfGrazieAuthState = new GrazieAuthState[1]; arrayOfGrazieAuthState[0] = GrazieAuthState.Authed; $this$row.label("You're logged in to JetBrains AI").visibleIf((ObservableProperty)LLMConfigurable.access$asObs(LLMConfigurable.this, GrazieAuthServiceKt.isAnySelected(LLMConfigurable.access$getAuthState$p(LLMConfigurable.this), arrayOfGrazieAuthState)));
/*     */                   } }
/*     */                 1, null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  62 */             GrazieAuthState[] arrayOfGrazieAuthState = new GrazieAuthState[1]; arrayOfGrazieAuthState[0] = GrazieAuthState.InProgress; Panel.row$default($this$rowsRange, null, new Function1<Row, Unit>() { public final void invoke(@NotNull Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row"); Intrinsics.checkNotNullExpressionValue(AnimatedIcon.Default.INSTANCE, "INSTANCE"); $this$row.icon((Icon)AnimatedIcon.Default.INSTANCE).customize(UnscaledGapsKt.UnscaledGaps$default(6, 0, 0, 6, 6, null)).align((Align)AlignY.TOP.INSTANCE); $this$row.panel(new Function1<Panel, Unit>() { public final void invoke(@NotNull Panel $this$panel) { Intrinsics.checkNotNullParameter($this$panel, "$this$panel"); Panel.row$default($this$panel, null, null.INSTANCE, 1, null); Panel.row$default($this$panel, null, new Function1<Row, Unit>() { public final void invoke(@NotNull Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row"); $this$row.link("Cancel", new Function1<ActionEvent, Unit>() { public final void invoke(@NotNull ActionEvent it) { Intrinsics.checkNotNullParameter(it, "it"); BuildersKt.launch$default(LLMConfigurable.access$getScope$p(LLMConfigurable.this), null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); GrazieAuthService.Companion.getInstance().cancel(); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>($completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }3, null); } }); } }1, null); } }).align((Align)AlignY.TOP.INSTANCE); } }1, null).visibleIf((ObservableProperty)LLMConfigurable.access$asObs(LLMConfigurable.this, GrazieAuthServiceKt.isAnySelected(LLMConfigurable.access$getAuthState$p(LLMConfigurable.this), arrayOfGrazieAuthState))).resizableRow();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  75 */             arrayOfGrazieAuthState = new GrazieAuthState[1]; arrayOfGrazieAuthState[0] = GrazieAuthState.WaitList; Panel.row$default($this$rowsRange, null, new Function1<Row, Unit>() { public final void invoke(@NotNull Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row"); Row.text$default($this$row, LLMBundle.message("label.waiting.list", new Object[0]), 0, LLMConfigurable.this::invoke$lambda$0, 2, null).applyToComponent(null.INSTANCE); } private static final void invoke$lambda$0(LLMConfigurable this$0, HyperlinkEvent it) { Intrinsics.checkNotNullParameter(LLMConfigurable.this, "this$0"); Intrinsics.checkNotNullParameter(it, "it"); BuildersKt.launch$default(AIAssistantServiceScope.Companion.getScope(LLMConfigurable.access$getProject$p(LLMConfigurable.this)), null, null, new LLMConfigurable$createPanel$2$1$3$1$1(null), 3, null); } }1, null).visibleIf((ObservableProperty)LLMConfigurable.access$asObs(LLMConfigurable.this, GrazieAuthServiceKt.isAnySelected(LLMConfigurable.access$getAuthState$p(LLMConfigurable.this), arrayOfGrazieAuthState)));
/*     */             
/*  77 */             Panel.row$default($this$rowsRange, null, new Function1<Row, Unit>() { public final void invoke(@NotNull Row $this$row) {
/*  78 */                     Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*     */ 
/*     */ 
/*     */                     
/*  82 */                     GrazieAuthState[] arrayOfGrazieAuthState = new GrazieAuthState[1]; arrayOfGrazieAuthState[0] = GrazieAuthState.NoAuth;
/*     */                     $this$row.button(LLMBundle.message("settings.button.log.in.to.grazie", new Object[0]), new Function1<ActionEvent, Unit>()
/*     */                         {
/*     */                           public final void invoke(@NotNull ActionEvent it) {
/*     */                             Intrinsics.checkNotNullParameter(it, "it");
/*     */                             BuildersKt.launch$default(LLMConfigurable.access$getScope$p(LLMConfigurable.this), null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null)
/*     */                                 {
/*     */                                   int label;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                                   
/*     */                                   @Nullable
/*     */                                   public final Object invokeSuspend(@NotNull Object $result) {
/*     */                                     int $i$f$service;
/*     */                                     Class<GrazieAuthService> serviceClass$iv;
/*     */                                     Object object1, object2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                                     switch (this.label) {
/*     */                                       case 0:
/*     */                                         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                                         $i$f$service = 0;
/* 111 */                                         serviceClass$iv = GrazieAuthService.class;
/* 112 */                                         object1 = ApplicationManager.getApplication().getService(serviceClass$iv); if (object1 == null)
/* 113 */                                           throw new RuntimeException("Cannot find service " + serviceClass$iv.getName() + " (classloader=" + serviceClass$iv.getClassLoader() + ", client=" + ClientId.Companion.getCurrentOrNull() + ")"); 
/*     */                                         this.label = 1;
/*     */                                         if (((GrazieAuthService)object1).authenticate(LLMConfigurable.access$getProject$p(LLMConfigurable.this), (Continuation)this) == object2)
/*     */                                           return object2; 
/*     */                                         ((GrazieAuthService)object1).authenticate(LLMConfigurable.access$getProject$p(LLMConfigurable.this), (Continuation)this);
/*     */                                         return Unit.INSTANCE;
/*     */                                       case 1:
/*     */                                         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                                         return Unit.INSTANCE;
/*     */                                     } 
/*     */                                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */                                   }
/*     */                                   
/*     */                                   @NotNull
/*     */                                   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*     */                                     return (Continuation)new Function2<>(LLMConfigurable.this, $completion);
/*     */                                   }
/*     */                                   
/*     */                                   @Nullable
/*     */                                   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */                                     return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                                   }
/*     */                                 }3, null);
/*     */                           }
/*     */                         }).visibleIf((ObservableProperty)LLMConfigurable.access$asObs(LLMConfigurable.this, GrazieAuthServiceKt.isAnySelected(LLMConfigurable.access$getAuthState$p(LLMConfigurable.this), arrayOfGrazieAuthState)));
/*     */                     arrayOfGrazieAuthState = new GrazieAuthState[1];
/*     */                     arrayOfGrazieAuthState[0] = GrazieAuthState.Authed;
/*     */                     $this$row.button(LLMBundle.message("settings.button.log.out", new Object[0]), null.INSTANCE).visibleIf((ObservableProperty)LLMConfigurable.access$asObs(LLMConfigurable.this, GrazieAuthServiceKt.isAnySelected(LLMConfigurable.access$getAuthState$p(LLMConfigurable.this), arrayOfGrazieAuthState)));
/*     */                   } }
/*     */                 1, null);
/*     */             if (LLMOptionsApplicabilityFilter.Companion.isAnyFeatureApplicable()) {
/*     */               arrayOfGrazieAuthState = new GrazieAuthState[1];
/*     */               arrayOfGrazieAuthState[0] = GrazieAuthState.Authed;
/*     */               Panel.buttonsGroup$default($this$rowsRange, LLMBundle.message("settings.group.features", new Object[0]), false, new Function1<Panel, Unit>() {
/*     */                     public final void invoke(@NotNull Panel $this$buttonsGroup) {
/*     */                       Intrinsics.checkNotNullParameter($this$buttonsGroup, "$this$buttonsGroup");
/*     */                       if (LLMOptionsApplicabilityFilter.Companion.isOptionApplicable(LLMFeatureId.NAME_SUGGESTION))
/*     */                         Panel.row$default($this$buttonsGroup, null, new Function1<Row, Unit>() {
/*     */                               public final void invoke(@NotNull Row $this$row) {
/*     */                                 Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*     */                                 ButtonKt.bindSelected($this$row.checkBox(LLMBundle.message("settings.checkbox.provide.ai.generated.name.suggestions", new Object[0])), new Function0<Boolean>(LLMConfigurable.access$getSettings$p(LLMConfigurable.this)) {
/*     */                                       @NotNull
/*     */                                       public final Boolean invoke() {
/*     */                                         return Boolean.valueOf(((LLMSettingsManager)this.receiver).isNameSuggestionsEnabled());
/*     */                                       }
/*     */                                     },  new Function1<Boolean, Unit>(LLMConfigurable.access$getSettings$p(LLMConfigurable.this)) {
/*     */                                       public final void invoke(boolean p0) {
/*     */                                         ((LLMSettingsManager)this.receiver).setNameSuggestionsEnabled(p0);
/*     */                                       }
/*     */                                     });
/*     */                               }
/*     */                             }1, null); 
/*     */                     }
/*     */                   }2, null).visibleIf((ObservableProperty)LLMConfigurable.access$asObs(LLMConfigurable.this, GrazieAuthServiceKt.isAnySelected(LLMConfigurable.access$getAuthState$p(LLMConfigurable.this), arrayOfGrazieAuthState)));
/*     */             } 
/*     */             System.getProperty("llm.is.internal");
/*     */             Row.rowComment$default(Panel.row$default($this$rowsRange, null, null.INSTANCE, 1, null), "Internal only! Do not share your token with anyone", 0, null, 6, null).visible((System.getProperty("llm.is.internal") != null) ? ((Boolean.parseBoolean(System.getProperty("llm.is.internal")) == true)) : false);
/*     */           } }
/*     */       );
/*     */   }
/*     */   
/*     */   LLMConfigurable$createPanel$2() {
/*     */     super(1);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/settings/LLMConfigurable$createPanel$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */