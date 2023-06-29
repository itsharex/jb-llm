/*     */ package com.intellij.ml.llm.core.chat.ui.list;
/*     */ 
/*     */ import com.intellij.ml.llm.core.chat.session.ChatCreationContext;
/*     */ import com.intellij.ml.llm.core.chat.ui.AIAssistantContainerPanel;
/*     */ import com.intellij.openapi.actionSystem.DataContext;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @DebugMetadata(f = "AIAssistantChatListPanel.kt", l = {67}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.chat.ui.list.AIAssistantChatListPanel$1$1$1")
/*     */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ @SourceDebugExtension({"SMAP\nAIAssistantChatListPanel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIAssistantChatListPanel.kt\ncom/intellij/ml/llm/core/chat/ui/list/AIAssistantChatListPanel$1$1$1\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,145:1\n8#2:146\n*S KotlinDebug\n*F\n+ 1 AIAssistantChatListPanel.kt\ncom/intellij/ml/llm/core/chat/ui/list/AIAssistantChatListPanel$1$1$1\n*L\n64#1:146\n*E\n"})
/*     */ final class AIAssistantChatListPanel$1$1$1
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   AIAssistantChatListPanel$1$1$1(DataContext $dataContext, ChatCreationContext $context, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object invokeSuspend(@NotNull Object $result) {
/*     */     CoroutineScope $this$launch;
/*     */     AIAssistantContainerPanel containerPanel;
/*  62 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$launch = (CoroutineScope)this.L$0;
/*  63 */         if ((AIAssistantContainerPanel)this.$dataContext.getData(AIAssistantContainerPanel.Companion.getAIAssistantContainer()) == null) { (AIAssistantContainerPanel)this.$dataContext.getData(AIAssistantContainerPanel.Companion.getAIAssistantContainer()); CoroutineScope $this$invokeSuspend_u24lambda_u240 = $this$launch; int $i$a$-run-AIAssistantChatListPanel$1$1$1$containerPanel$1 = 0;
/*  64 */           int $i$f$thisLogger = 0;
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
/*     */           
/* 146 */           Intrinsics.checkNotNullExpressionValue(Logger.getInstance(CoroutineScope.class), "getInstance(T::class.java)"); Logger.getInstance(CoroutineScope.class).warn("Container panel was not found when creating chat from empty state");
/*     */           return Unit.INSTANCE; }
/*     */         
/*     */         this.label = 1;
/*     */         if (containerPanel.goToNewDialog(this.$context, (Continuation)this) == object)
/*     */           return object; 
/*     */         containerPanel.goToNewDialog(this.$context, (Continuation)this);
/*     */         return Unit.INSTANCE;
/*     */       case 1:
/*     */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */         return Unit.INSTANCE; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super AIAssistantChatListPanel$1$1$1> $completion) {
/*     */     AIAssistantChatListPanel$1$1$1 aIAssistantChatListPanel$1$1$1 = new AIAssistantChatListPanel$1$1$1(this.$dataContext, this.$context, $completion);
/*     */     aIAssistantChatListPanel$1$1$1.L$0 = value;
/*     */     return (Continuation<Unit>)aIAssistantChatListPanel$1$1$1;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */     return ((AIAssistantChatListPanel$1$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/list/AIAssistantChatListPanel$1$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */