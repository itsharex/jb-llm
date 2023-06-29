/*    */ package com.intellij.ml.llm.core.chat.session;
/*    */ 
/*    */ import com.intellij.ml.llm.core.chat.session.impl.ChatSessionImpl;
/*    */ import com.intellij.ml.llm.core.statistics.fus.AIAssistantChatEventLogger;
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
/*    */ @DebugMetadata(f = "ChatSessionHost.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.chat.session.ChatSessionHost$createChatSession$2")
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class ChatSessionHost$createChatSession$2
/*    */   extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*    */   int label;
/*    */   
/*    */   @Nullable
/*    */   public final Object invokeSuspend(@NotNull Object $result) {
/* 25 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 26 */         this.$storage.getChatSessions().add(this.$session);
/* 27 */         ((ChatSessionHostListener)ChatSessionHost.access$getListeners$p(ChatSessionHost.this).getMulticaster()).chatCreated((ChatSession)this.$session);
/* 28 */         AIAssistantChatEventLogger.Companion.logNewChatCreated(ChatSessionHost.access$getProject$p(ChatSessionHost.this), (ChatSession)this.$session);
/* 29 */         return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   ChatSessionHost$createChatSession$2(ChatSessionImpl $session, ChatSessionHost $receiver, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super ChatSessionHost$createChatSession$2> $completion) {
/*    */     return (Continuation<Unit>)new ChatSessionHost$createChatSession$2(this.$session, ChatSessionHost.this, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */     return ((ChatSessionHost$createChatSession$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/session/ChatSessionHost$createChatSession$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */