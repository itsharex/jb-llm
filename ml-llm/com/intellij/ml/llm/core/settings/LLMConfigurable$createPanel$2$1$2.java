/*    */ package com.intellij.ml.llm.core.settings;
/*    */ 
/*    */ import com.intellij.ml.llm.LLMBundle;
/*    */ import com.intellij.ml.llm.core.chat.ui.AIAssistantColors;
/*    */ import com.intellij.ml.llm.core.grazieAPI.GrazieAuthService;
/*    */ import com.intellij.ui.AnimatedIcon;
/*    */ import com.intellij.ui.dsl.builder.Align;
/*    */ import com.intellij.ui.dsl.builder.AlignY;
/*    */ import com.intellij.ui.dsl.builder.Panel;
/*    */ import com.intellij.ui.dsl.builder.Row;
/*    */ import com.intellij.ui.dsl.gridLayout.UnscaledGapsKt;
/*    */ import java.awt.event.ActionEvent;
/*    */ import javax.swing.Icon;
/*    */ import javax.swing.JLabel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlinx.coroutines.BuildersKt;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/ui/dsl/builder/Row;", "invoke"})
/*    */ final class null
/*    */   extends Lambda
/*    */   implements Function1<Row, Unit>
/*    */ {
/*    */   public final void invoke(@NotNull Row $this$row) {
/* 47 */     Intrinsics.checkNotNullParameter($this$row, "$this$row"); Intrinsics.checkNotNullExpressionValue(AnimatedIcon.Default.INSTANCE, "INSTANCE"); $this$row.icon((Icon)AnimatedIcon.Default.INSTANCE).customize(UnscaledGapsKt.UnscaledGaps$default(6, 0, 0, 6, 6, null)).align((Align)AlignY.TOP.INSTANCE);
/* 48 */     $this$row.panel(new Function1<Panel, Unit>() {
/* 49 */           public final void invoke(@NotNull Panel $this$panel) { Intrinsics.checkNotNullParameter($this$panel, "$this$panel"); Panel.row$default($this$panel, null, null.INSTANCE, 1, null);
/*    */ 
/*    */ 
/*    */ 
/*    */             
/* 54 */             Panel.row$default($this$panel, null, new Function1<Row, Unit>() {
/* 55 */                   public final void invoke(@NotNull Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row"); $this$row.link("Cancel", new Function1<ActionEvent, Unit>() {
/* 56 */                           public final void invoke(@NotNull ActionEvent it) { Intrinsics.checkNotNullParameter(it, "it"); BuildersKt.launch$default(LLMConfigurable.access$getScope$p(LLMConfigurable.this), null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) { int label; @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>($completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 57 */                                         GrazieAuthService.Companion.getInstance().cancel();
/* 58 */                                         return Unit.INSTANCE; }
/*    */                                     
/*    */                                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }3, null); } }); } }1, null); }
/* 61 */         }).align((Align)AlignY.TOP.INSTANCE);
/*    */   }
/*    */   
/*    */   null() {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/settings/LLMConfigurable$createPanel$2$1$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */