/*    */ package com.intellij.ml.llm.core.chat.ui;
/*    */ 
/*    */ import com.intellij.ml.llm.core.chat.session.ChatCreationContext;
/*    */ import com.intellij.ml.llm.core.chat.session.ChatOrigin;
/*    */ import com.intellij.ml.llm.core.chat.session.ChatSessionStorage;
/*    */ import com.intellij.openapi.application.CoroutinesKt;
/*    */ import javax.swing.JComponent;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.BuildersKt;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.Dispatchers;
/*    */ import kotlinx.coroutines.flow.FlowCollector;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\000\n\002\020\013\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H@¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "isAuthed", "", "emit", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"})
/*    */ final class null<T>
/*    */   implements FlowCollector
/*    */ {
/*    */   @Nullable
/*    */   public final Object emit(boolean isAuthed, @NotNull Continuation $completion) {
/* 49 */     if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(AIAssistantContainerPanel.this, null) { int label; @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$isAuthed, AIAssistantContainerPanel.this, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 50 */                 if (this.$isAuthed) {
/* 51 */                   JComponent lsp = AIAssistantContainerPanel.access$getLastShownPanel$p(AIAssistantContainerPanel.this);
/* 52 */                   if (lsp != null && !(lsp instanceof AIAssistantLoginPanel)) {
/* 53 */                     AIAssistantContainerPanel.access$goToPanel(AIAssistantContainerPanel.this, lsp);
/*    */                   } else {
/*    */                     
/* 56 */                     this.label = 1; if (AIAssistantContainerPanel.this.goToNewDialog(new ChatCreationContext((ChatOrigin)ChatOrigin.AIAssistantTool.INSTANCE, ChatSessionStorage.SourceAction.NEW_CHAT, null, null, 12, null), (Continuation<? super Unit>)this) == object) return object;  AIAssistantContainerPanel.this.goToNewDialog(new ChatCreationContext((ChatOrigin)ChatOrigin.AIAssistantTool.INSTANCE, ChatSessionStorage.SourceAction.NEW_CHAT, null, null, 12, null), (Continuation<? super Unit>)this);
/*    */                   } 
/*    */                 } else {
/*    */                   
/* 60 */                   AIAssistantContainerPanel.access$goToPanel(AIAssistantContainerPanel.this, new AIAssistantLoginPanel(AIAssistantContainerPanel.access$getServiceScope(AIAssistantContainerPanel.this), AIAssistantContainerPanel.access$getProject$p(AIAssistantContainerPanel.this)));
/*    */                 } 
/* 62 */                 return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } }$completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(AIAssistantContainerPanel.this, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); if (this.$isAuthed) { JComponent lsp = AIAssistantContainerPanel.access$getLastShownPanel$p(AIAssistantContainerPanel.this); if (lsp != null && !(lsp instanceof AIAssistantLoginPanel)) { AIAssistantContainerPanel.access$goToPanel(AIAssistantContainerPanel.this, lsp); } else { this.label = 1; if (AIAssistantContainerPanel.this.goToNewDialog(new ChatCreationContext((ChatOrigin)ChatOrigin.AIAssistantTool.INSTANCE, ChatSessionStorage.SourceAction.NEW_CHAT, null, null, 12, null), (Continuation<? super Unit>)this) == object) return object;  AIAssistantContainerPanel.this.goToNewDialog(new ChatCreationContext((ChatOrigin)ChatOrigin.AIAssistantTool.INSTANCE, ChatSessionStorage.SourceAction.NEW_CHAT, null, null, 12, null), (Continuation<? super Unit>)this); }  } else { AIAssistantContainerPanel.access$goToPanel(AIAssistantContainerPanel.this, new AIAssistantLoginPanel(AIAssistantContainerPanel.access$getServiceScope(AIAssistantContainerPanel.this), AIAssistantContainerPanel.access$getProject$p(AIAssistantContainerPanel.this))); }  return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$isAuthed, AIAssistantContainerPanel.this, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }$completion);  BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(AIAssistantContainerPanel.this, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); if (this.$isAuthed) { JComponent lsp = AIAssistantContainerPanel.access$getLastShownPanel$p(AIAssistantContainerPanel.this); if (lsp != null && !(lsp instanceof AIAssistantLoginPanel)) { AIAssistantContainerPanel.access$goToPanel(AIAssistantContainerPanel.this, lsp); } else { this.label = 1; if (AIAssistantContainerPanel.this.goToNewDialog(new ChatCreationContext((ChatOrigin)ChatOrigin.AIAssistantTool.INSTANCE, ChatSessionStorage.SourceAction.NEW_CHAT, null, null, 12, null), (Continuation<? super Unit>)this) == object) return object;  AIAssistantContainerPanel.this.goToNewDialog(new ChatCreationContext((ChatOrigin)ChatOrigin.AIAssistantTool.INSTANCE, ChatSessionStorage.SourceAction.NEW_CHAT, null, null, 12, null), (Continuation<? super Unit>)this); }  } else { AIAssistantContainerPanel.access$goToPanel(AIAssistantContainerPanel.this, new AIAssistantLoginPanel(AIAssistantContainerPanel.access$getServiceScope(AIAssistantContainerPanel.this), AIAssistantContainerPanel.access$getProject$p(AIAssistantContainerPanel.this))); }  return Unit.INSTANCE;
/*    */               case 1:
/*    */                 ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); }
/*    */             
/*    */             throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */ 
/*    */           
/*    */           @NotNull
/*    */           public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*    */             return (Continuation)new Function2<>(this.$isAuthed, AIAssistantContainerPanel.this, $completion);
/*    */           }
/*    */           
/*    */           @Nullable
/*    */           public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */             return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */           } }
/*    */         $completion);
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/AIAssistantContainerPanel$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */