/*    */ package com.intellij.ml.llm.core.chat.messages.impl;
/*    */ 
/*    */ import com.intellij.ml.llm.core.chat.messages.CompletableMessageTextListener;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @DebugMetadata(f = "SimpleCompletableMessage.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.chat.messages.impl.SimpleCompletableMessage$appendText$2")
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class SimpleCompletableMessage$appendText$2
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   SimpleCompletableMessage$appendText$2(String $text, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invokeSuspend(@NotNull Object $result) {
/*    */     SimpleCompletableMessage simpleCompletableMessage;
/*    */     int i;
/* 87 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 88 */         simpleCompletableMessage = SimpleCompletableMessage.this; i = SimpleCompletableMessage.access$getCurrentTimeStamp$p(simpleCompletableMessage); SimpleCompletableMessage.access$setCurrentTimeStamp$p(simpleCompletableMessage, i + 1);
/* 89 */         SimpleCompletableMessage.access$getBuilder$p(SimpleCompletableMessage.this).append(this.$text);
/* 90 */         for (CompletableMessageTextListener listener : SimpleCompletableMessage.access$getTextListeners$p(SimpleCompletableMessage.this)) {
/* 91 */           listener.onTextChanged(this.$text);
/*    */         }
/* 93 */         return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super SimpleCompletableMessage$appendText$2> $completion) {
/*    */     return (Continuation<Unit>)new SimpleCompletableMessage$appendText$2(this.$text, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */     return ((SimpleCompletableMessage$appendText$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/messages/impl/SimpleCompletableMessage$appendText$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */