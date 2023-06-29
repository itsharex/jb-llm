/*    */ package com.intellij.ml.llm.core.chat.ui.chat;
/*    */ 
/*    */ import com.intellij.ml.llm.core.chat.session.ChatKind;
/*    */ import com.intellij.ml.llm.core.chat.session.SimpleChat;
/*    */ import com.intellij.ml.llm.core.grazieAPI.GrazieAuthorizationException;
/*    */ import java.util.concurrent.CancellationException;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
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
/*    */ @DebugMetadata(f = "AIAssistantChatPanelController.kt", l = {85}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.chat.ui.chat.AIAssistantChatPanelController$sendRequest$1")
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class AIAssistantChatPanelController$sendRequest$1
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   AIAssistantChatPanelController$sendRequest$1(String $messageText, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invokeSuspend(@NotNull Object $result) {
/* 83 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */         try {
/* 85 */           this.label = 1; if (AIAssistantChatPanelController.access$getSession$p(AIAssistantChatPanelController.this).send(AIAssistantChatPanelController.access$getProject$p(AIAssistantChatPanelController.this), this.$messageText, (ChatKind)SimpleChat.INSTANCE, (Continuation)this) == object) return object;  AIAssistantChatPanelController.access$getSession$p(AIAssistantChatPanelController.this).send(AIAssistantChatPanelController.access$getProject$p(AIAssistantChatPanelController.this), this.$messageText, (ChatKind)SimpleChat.INSTANCE, (Continuation)this);
/*    */         }
/* 87 */         catch (CancellationException cancellationException) {
/*    */ 
/*    */         
/* 90 */         } catch (GrazieAuthorizationException grazieAuthorizationException) {
/*    */ 
/*    */         
/* 93 */         } catch (Throwable e) {
/* 94 */           AIAssistantChatPanelController.access$getLogger$p(AIAssistantChatPanelController.this).error(e);
/*    */         } 
/* 96 */         return Unit.INSTANCE;
/*    */       case 1:
/*    */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super AIAssistantChatPanelController$sendRequest$1> $completion) {
/*    */     return (Continuation<Unit>)new AIAssistantChatPanelController$sendRequest$1(this.$messageText, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */     return ((AIAssistantChatPanelController$sendRequest$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanelController$sendRequest$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */