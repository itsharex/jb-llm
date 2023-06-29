/*    */ package com.intellij.ml.llm.core.chat.context;
/*    */ import java.util.List;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.internal.Ref;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @DebugMetadata(f = "Utils.kt", l = {18}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.chat.context.UtilsKt$collectChatContext$2")
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\013\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class UtilsKt$collectChatContext$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
/*    */   @Nullable
/*    */   public final Object invokeSuspend(@NotNull Object $result) {
/*    */     List items;
/* 17 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 18 */         this.label = 1; if (this.$chatContextProvider.collect(this.$project, this.$creationContext, (Continuation<? super List<ChatContextItem>>)this) == object) return object;  items = (List)this.$chatContextProvider.collect(this.$project, this.$creationContext, (Continuation<? super List<ChatContextItem>>)this);
/* 19 */         return Boxing.boxBoolean(((List)this.$allItems.element).addAll(items));case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); items = (List)SYNTHETIC_LOCAL_VARIABLE_1; return Boxing.boxBoolean(((List)this.$allItems.element).addAll(items)); }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   int label;
/*    */   
/*    */   UtilsKt$collectChatContext$2(ChatContextProvider $chatContextProvider, Project $project, ChatCreationContext $creationContext, Ref.ObjectRef<List<ChatContextItem>> $allItems, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super UtilsKt$collectChatContext$2> $completion) {
/*    */     return (Continuation<Unit>)new UtilsKt$collectChatContext$2(this.$chatContextProvider, this.$project, this.$creationContext, this.$allItems, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */     return ((UtilsKt$collectChatContext$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/context/UtilsKt$collectChatContext$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */