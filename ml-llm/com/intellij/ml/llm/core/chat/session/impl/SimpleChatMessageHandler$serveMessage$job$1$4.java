/*    */ package com.intellij.ml.llm.core.chat.session.impl;
/*    */ 
/*    */ import com.intellij.ml.llm.core.chat.messages.CompletableMessage;
/*    */ import com.intellij.ml.llm.core.chat.messages.impl.SimpleCompletableMessage;
/*    */ import com.intellij.ml.llm.core.chat.session.ChatSession;
/*    */ import com.intellij.openapi.application.CoroutinesKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.BuildersKt;
/*    */ import kotlinx.coroutines.CompletableDeferred;
/*    */ import kotlinx.coroutines.CoroutineScope;
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
/*    */ @DebugMetadata(f = "SimpleChatMessageHandler.kt", l = {44}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.chat.session.impl.SimpleChatMessageHandler$serveMessage$job$1$4")
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class null
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   null(ChatSession $chat, CompletableMessage $message, Throwable $e, CompletableDeferred<Unit> $deferred, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invokeSuspend(@NotNull Object $result) {
/* 43 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 44 */         this.label = 1; if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$chat, this.$message, this.$e, this.$deferred, null) { int label; @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$chat, this.$message, this.$e, this.$deferred, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 45 */                     this.$chat.setTimestamp(System.currentTimeMillis());
/* 46 */                     ((SimpleCompletableMessage)this.$message).complete(this.$e);
/* 47 */                     this.$deferred.completeExceptionally(this.$e);
/* 48 */                     return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } }(Continuation)this) == object) return object;  BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$chat, this.$message, this.$e, this.$deferred, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.$chat.setTimestamp(System.currentTimeMillis()); ((SimpleCompletableMessage)this.$message).complete(this.$e); this.$deferred.completeExceptionally(this.$e); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$chat, this.$message, this.$e, this.$deferred, $completion); }
/* 49 */               @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*    */     return (Continuation<Unit>)new Object(this.$chat, this.$message, this.$e, this.$deferred, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */     return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/session/impl/SimpleChatMessageHandler$serveMessage$job$1$4.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */