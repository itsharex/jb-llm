/*     */ package com.intellij.ml.llm.core.chat.ui;
/*     */ 
/*     */ import com.intellij.ide.ui.laf.darcula.ui.DarculaButtonUI;
/*     */ import com.intellij.ml.llm.LLMBundle;
/*     */ import com.intellij.ml.llm.core.chat.services.AIAssistantServiceScope;
/*     */ import com.intellij.ml.llm.core.grazieAPI.GrazieAuthService;
/*     */ import com.intellij.ml.llm.core.grazieAPI.GrazieAuthServiceKt;
/*     */ import com.intellij.ml.llm.core.grazieAPI.GrazieAuthState;
/*     */ import com.intellij.openapi.observable.properties.ObservableProperty;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.ui.AnimatedIcon;
/*     */ import com.intellij.ui.ClientProperty;
/*     */ import com.intellij.ui.dsl.builder.Align;
/*     */ import com.intellij.ui.dsl.builder.AlignY;
/*     */ import com.intellij.ui.dsl.builder.EmptySpacingConfiguration;
/*     */ import com.intellij.ui.dsl.builder.Panel;
/*     */ import com.intellij.ui.dsl.builder.Row;
/*     */ import com.intellij.ui.dsl.builder.SpacingConfiguration;
/*     */ import com.intellij.ui.dsl.gridLayout.UnscaledGapsKt;
/*     */ import com.intellij.ui.dsl.gridLayout.UnscaledGapsYKt;
/*     */ import com.intellij.util.ui.JBFont;
/*     */ import java.awt.Font;
/*     */ import java.awt.event.ActionEvent;
/*     */ import javax.swing.Icon;
/*     */ import javax.swing.JButton;
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
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/ui/dsl/builder/Panel;", "invoke"})
/*     */ final class AIAssistantLoginPanel$createPanel$1
/*     */   extends Lambda
/*     */   implements Function1<Panel, Unit>
/*     */ {
/*     */   public final void invoke(@NotNull Panel $this$panel) {
/*  54 */     Intrinsics.checkNotNullParameter($this$panel, "$this$panel"); $this$panel.customizeSpacingConfiguration((SpacingConfiguration)new EmptySpacingConfiguration(), new Function1<Panel, Unit>(this.$project) { public final void invoke(@NotNull Panel $this$customizeSpacingConfiguration) {
/*  55 */             Intrinsics.checkNotNullParameter($this$customizeSpacingConfiguration, "$this$customizeSpacingConfiguration");
/*     */ 
/*     */ 
/*     */             
/*  59 */             GrazieAuthState[] arrayOfGrazieAuthState = new GrazieAuthState[3]; arrayOfGrazieAuthState[0] = GrazieAuthState.NoAuth; arrayOfGrazieAuthState[1] = GrazieAuthState.InProgress; arrayOfGrazieAuthState[2] = GrazieAuthState.WaitList; Panel.row$default($this$customizeSpacingConfiguration, null, null.INSTANCE, 1, null).visibleIf((ObservableProperty)StateFlowToObservablePropertyAdapterKt.asObservable$default(GrazieAuthServiceKt.isAnySelected(AIAssistantLoginPanel.access$getAuthState(AIAssistantLoginPanel.this), arrayOfGrazieAuthState), AIAssistantLoginPanel.access$getScope$p(AIAssistantLoginPanel.this), null, 2, null));
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  64 */             arrayOfGrazieAuthState = new GrazieAuthState[3]; arrayOfGrazieAuthState[0] = GrazieAuthState.NoAuth; arrayOfGrazieAuthState[1] = GrazieAuthState.InProgress; arrayOfGrazieAuthState[2] = GrazieAuthState.WaitList; Panel.row$default($this$customizeSpacingConfiguration, null, null.INSTANCE, 1, null).visibleIf((ObservableProperty)StateFlowToObservablePropertyAdapterKt.asObservable$default(GrazieAuthServiceKt.isAnySelected(AIAssistantLoginPanel.access$getAuthState(AIAssistantLoginPanel.this), arrayOfGrazieAuthState), AIAssistantLoginPanel.access$getScope$p(AIAssistantLoginPanel.this), null, 2, null));
/*  65 */             for (LoginSuggestion sugg : AIAssistantLoginPanel.access$getLoginSuggestions$p(AIAssistantLoginPanel.this)) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/*  71 */               GrazieAuthState[] arrayOfGrazieAuthState1 = new GrazieAuthState[3]; arrayOfGrazieAuthState1[0] = GrazieAuthState.NoAuth; arrayOfGrazieAuthState1[1] = GrazieAuthState.InProgress; arrayOfGrazieAuthState1[2] = GrazieAuthState.WaitList; Panel.row$default($this$customizeSpacingConfiguration, null, new Function1<Row, Unit>(sugg) { public final void invoke(@NotNull Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row"); $this$row.icon(this.$sugg.getIcon()).align((Align)AlignY.TOP.INSTANCE).customize(UnscaledGapsKt.UnscaledGaps$default(0, 0, 0, 6, 7, null)); Row.text$default($this$row, this.$sugg.getText(), 0, null, 6, null).customize(UnscaledGapsKt.UnscaledGaps$default(0, 0, 8, 0, 11, null)).applyToComponent(null.INSTANCE); } }1, null).visibleIf((ObservableProperty)StateFlowToObservablePropertyAdapterKt.asObservable$default(GrazieAuthServiceKt.isAnySelected(AIAssistantLoginPanel.access$getAuthState(AIAssistantLoginPanel.this), arrayOfGrazieAuthState1), AIAssistantLoginPanel.access$getScope$p(AIAssistantLoginPanel.this), null, 2, null));
/*     */             } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  81 */             arrayOfGrazieAuthState = new GrazieAuthState[1]; arrayOfGrazieAuthState[0] = GrazieAuthState.NoAuth; Panel.row$default($this$customizeSpacingConfiguration, null, new Function1<Row, Unit>(this.$project) { public final void invoke(@NotNull Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row"); $this$row.button("Log in to JetBrains AI…", new Function1<ActionEvent, Unit>(this.$project) { public final void invoke(@NotNull ActionEvent it) { Intrinsics.checkNotNullParameter(it, "it"); BuildersKt.launch$default(AIAssistantServiceScope.Companion.getScope(this.$project), null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$project, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (GrazieAuthService.Companion.getInstance().authenticate(this.$project, (Continuation)this) == object) return object;  GrazieAuthService.Companion.getInstance().authenticate(this.$project, (Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$project, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }3, null); } }).applyToComponent(null.INSTANCE); } }1, null).customize(UnscaledGapsYKt.UnscaledGapsY$default(26, 0, 2, null)).visibleIf((ObservableProperty)StateFlowToObservablePropertyAdapterKt.asObservable$default(GrazieAuthServiceKt.isAnySelected(AIAssistantLoginPanel.access$getAuthState(AIAssistantLoginPanel.this), arrayOfGrazieAuthState), AIAssistantLoginPanel.access$getScope$p(AIAssistantLoginPanel.this), null, 2, null));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  98 */             arrayOfGrazieAuthState = new GrazieAuthState[1]; arrayOfGrazieAuthState[0] = GrazieAuthState.InProgress; Panel.row$default($this$customizeSpacingConfiguration, null, new Function1<Row, Unit>(this.$project) { public final void invoke(@NotNull Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row"); Intrinsics.checkNotNullExpressionValue(AnimatedIcon.Default.INSTANCE, "INSTANCE"); $this$row.icon((Icon)AnimatedIcon.Default.INSTANCE).customize(UnscaledGapsKt.UnscaledGaps$default(0, 0, 0, 6, 7, null)).align((Align)AlignY.TOP.INSTANCE); $this$row.panel(new Function1<Panel, Unit>(this.$project) { public final void invoke(@NotNull Panel $this$panel) { Intrinsics.checkNotNullParameter($this$panel, "$this$panel"); Panel.row$default($this$panel, null, null.INSTANCE, 1, null); Panel.row$default($this$panel, null, new Function1<Row, Unit>(this.$project) { public final void invoke(@NotNull Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row"); $this$row.link("Cancel", new Function1<ActionEvent, Unit>(this.$project) { public final void invoke(@NotNull ActionEvent it) { Intrinsics.checkNotNullParameter(it, "it"); BuildersKt.launch$default(AIAssistantServiceScope.Companion.getScope(this.$project), null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); GrazieAuthService.Companion.getInstance().cancel(); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>($completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }3, null); } }); } }1, null); } }).align((Align)AlignY.TOP.INSTANCE); } }1, null).customize(UnscaledGapsYKt.UnscaledGapsY$default(32, 0, 2, null)).visibleIf((ObservableProperty)StateFlowToObservablePropertyAdapterKt.asObservable$default(GrazieAuthServiceKt.isAnySelected(AIAssistantLoginPanel.access$getAuthState(AIAssistantLoginPanel.this), arrayOfGrazieAuthState), AIAssistantLoginPanel.access$getScope$p(AIAssistantLoginPanel.this), null, 2, null))
/*  99 */               .resizableRow();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 111 */             arrayOfGrazieAuthState = new GrazieAuthState[1]; arrayOfGrazieAuthState[0] = GrazieAuthState.WaitList; Panel.row$default($this$customizeSpacingConfiguration, null, new Function1<Row, Unit>(this.$project) { public final void invoke(@NotNull Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row"); Row.text$default($this$row, LLMBundle.message("label.waiting.list", new Object[0]), 0, this.$project::invoke$lambda$0, 2, null).applyToComponent(null.INSTANCE); } private static final void invoke$lambda$0(Project $project, HyperlinkEvent it) { Intrinsics.checkNotNullParameter($project, "$project"); Intrinsics.checkNotNullParameter(it, "it"); BuildersKt.launch$default(AIAssistantServiceScope.Companion.getScope($project), null, null, new AIAssistantLoginPanel$createPanel$1$1$6$1$1($project, null), 3, null); } }1, null).customize(UnscaledGapsYKt.UnscaledGapsY$default(20, 0, 2, null)).resizableRow().visibleIf((ObservableProperty)StateFlowToObservablePropertyAdapterKt.asObservable$default(GrazieAuthServiceKt.isAnySelected(AIAssistantLoginPanel.access$getAuthState(AIAssistantLoginPanel.this), arrayOfGrazieAuthState), AIAssistantLoginPanel.access$getScope$p(AIAssistantLoginPanel.this), null, 2, null));
/*     */           } }
/*     */       );
/*     */   }
/*     */   
/*     */   AIAssistantLoginPanel$createPanel$1(Project $project) {
/*     */     super(1);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/AIAssistantLoginPanel$createPanel$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */