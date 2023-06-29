/*    */ package com.intellij.ml.llm.core.chat;
/*    */ 
/*    */ import com.intellij.ml.llm.core.chat.services.AIAssistantServiceScope;
/*    */ import com.intellij.ml.llm.core.chat.ui.AIAssistantContainerPanel;
/*    */ import com.intellij.openapi.application.CoroutinesKt;
/*    */ import com.intellij.openapi.diagnostic.Logger;
/*    */ import com.intellij.openapi.wm.ToolWindow;
/*    */ import com.intellij.openapi.wm.ex.ToolWindowManagerListener;
/*    */ import com.intellij.ui.content.Content;
/*    */ import javax.swing.JComponent;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.collections.ArraysKt;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.coroutines.BuildersKt;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.DelayKt;
/*    */ import kotlinx.coroutines.Dispatchers;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\b\000\030\0002\0020\001B\005¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/core/chat/AIAssistantToolWindowFocusActivator;", "Lcom/intellij/openapi/wm/ex/ToolWindowManagerListener;", "()V", "toolWindowShown", "", "toolWindow", "Lcom/intellij/openapi/wm/ToolWindow;", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nAIAssistantToolWindowFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIAssistantToolWindowFactory.kt\ncom/intellij/ml/llm/core/chat/AIAssistantToolWindowFocusActivator\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,56:1\n8#2:57\n*S KotlinDebug\n*F\n+ 1 AIAssistantToolWindowFactory.kt\ncom/intellij/ml/llm/core/chat/AIAssistantToolWindowFocusActivator\n*L\n46#1:57\n*E\n"})
/*    */ public final class AIAssistantToolWindowFocusActivator
/*    */   implements ToolWindowManagerListener
/*    */ {
/*    */   public void toolWindowShown(@NotNull ToolWindow toolWindow) {
/* 42 */     Intrinsics.checkNotNullParameter(toolWindow, "toolWindow"); if (!Intrinsics.areEqual(toolWindow.getId(), "AIAssistant"))
/*    */       return; 
/* 44 */     Intrinsics.checkNotNullExpressionValue(toolWindow.getContentManager().getContents(), "toolWindow.contentManager.contents"); (Content)ArraysKt.firstOrNull((Object[])toolWindow.getContentManager().getContents()); JComponent jComponent = ((Content)ArraysKt.firstOrNull((Object[])toolWindow.getContentManager().getContents()) != null) ? ((Content)ArraysKt.firstOrNull((Object[])toolWindow.getContentManager().getContents())).getComponent() : null; AIAssistantContainerPanel component = (jComponent instanceof AIAssistantContainerPanel) ? (AIAssistantContainerPanel)jComponent : null;
/* 45 */     if (component == null) {
/* 46 */       Object $this$thisLogger$iv = this; int $i$f$thisLogger = 0;
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
/* 57 */       Intrinsics.checkNotNullExpressionValue(Logger.getInstance(AIAssistantToolWindowFocusActivator.class), "getInstance(T::class.java)"); Logger.getInstance(AIAssistantToolWindowFocusActivator.class).error("Panel has wrong type");
/*    */       return;
/*    */     } 
/*    */     Intrinsics.checkNotNullExpressionValue(toolWindow.getProject(), "toolWindow.project");
/*    */     BuildersKt.launch$default(AIAssistantServiceScope.Companion.getScope(toolWindow.getProject()), null, null, new AIAssistantToolWindowFocusActivator$toolWindowShown$1(component, null), 3, null);
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "AIAssistantToolWindowFactory.kt", l = {50, 51}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.chat.AIAssistantToolWindowFocusActivator$toolWindowShown$1")
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */   static final class AIAssistantToolWindowFocusActivator$toolWindowShown$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*    */     int label;
/*    */     
/*    */     AIAssistantToolWindowFocusActivator$toolWindowShown$1(AIAssistantContainerPanel $component, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */       switch (this.label) {
/*    */         case 0:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           this.label = 1;
/*    */           if (DelayKt.delay(500L, (Continuation)this) == object)
/*    */             return object; 
/*    */           DelayKt.delay(500L, (Continuation)this);
/*    */           this.label = 2;
/*    */           if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$component, null) {
/*    */                 int label;
/*    */                 
/*    */                 @Nullable
/*    */                 public final Object invokeSuspend(@NotNull Object $result) {
/*    */                   IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */                   switch (this.label) {
/*    */                     case 0:
/*    */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */                       this.$component.focusDefaultComponent();
/*    */                       return Unit.INSTANCE;
/*    */                   } 
/*    */                   throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */                 }
/*    */                 
/*    */                 @NotNull
/*    */                 public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*    */                   return (Continuation)new Function2<>(this.$component, $completion);
/*    */                 }
/*    */                 
/*    */                 @Nullable
/*    */                 public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */                 }
/*    */               }(Continuation)this) == object)
/*    */             return object; 
/*    */           BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$component, null) {
/*    */                 int label;
/*    */                 
/*    */                 @Nullable
/*    */                 public final Object invokeSuspend(@NotNull Object $result) {
/*    */                   IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */                   switch (this.label) {
/*    */                     case 0:
/*    */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */                       this.$component.focusDefaultComponent();
/*    */                       return Unit.INSTANCE;
/*    */                   } 
/*    */                   throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */                 }
/*    */                 
/*    */                 @NotNull
/*    */                 public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*    */                   return (Continuation)new Function2<>(this.$component, $completion);
/*    */                 }
/*    */                 
/*    */                 @Nullable
/*    */                 public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */                 }
/*    */               }(Continuation)this);
/*    */           return Unit.INSTANCE;
/*    */         case 1:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           this.label = 2;
/*    */           if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$component, null) {
/*    */                 int label;
/*    */                 
/*    */                 @Nullable
/*    */                 public final Object invokeSuspend(@NotNull Object $result) {
/*    */                   IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */                   switch (this.label) {
/*    */                     case 0:
/*    */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */                       this.$component.focusDefaultComponent();
/*    */                       return Unit.INSTANCE;
/*    */                   } 
/*    */                   throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */                 }
/*    */                 
/*    */                 @NotNull
/*    */                 public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*    */                   return (Continuation)new Function2<>(this.$component, $completion);
/*    */                 }
/*    */                 
/*    */                 @Nullable
/*    */                 public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */                 }
/*    */               }(Continuation)this) == object)
/*    */             return object; 
/*    */           BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$component, null) {
/*    */                 int label;
/*    */                 
/*    */                 @Nullable
/*    */                 public final Object invokeSuspend(@NotNull Object $result) {
/*    */                   IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */                   switch (this.label) {
/*    */                     case 0:
/*    */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */                       this.$component.focusDefaultComponent();
/*    */                       return Unit.INSTANCE;
/*    */                   } 
/*    */                   throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */                 }
/*    */                 
/*    */                 @NotNull
/*    */                 public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*    */                   return (Continuation)new Function2<>(this.$component, $completion);
/*    */                 }
/*    */                 
/*    */                 @Nullable
/*    */                 public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */                 }
/*    */               }(Continuation)this);
/*    */           return Unit.INSTANCE;
/*    */         case 2:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           return Unit.INSTANCE;
/*    */       } 
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super AIAssistantToolWindowFocusActivator$toolWindowShown$1> $completion) {
/*    */       return (Continuation<Unit>)new AIAssistantToolWindowFocusActivator$toolWindowShown$1(this.$component, $completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */       return ((AIAssistantToolWindowFocusActivator$toolWindowShown$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/AIAssistantToolWindowFocusActivator.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */