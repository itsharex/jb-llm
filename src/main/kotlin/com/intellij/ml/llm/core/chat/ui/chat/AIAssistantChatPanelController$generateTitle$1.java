/*     */ package com.intellij.ml.llm.core.chat.ui.chat;
/*     */ 
/*     */ import com.intellij.ml.llm.core.chat.messages.CompletableMessage;
/*     */ import com.intellij.ml.llm.core.chat.services.AIRequestService;
/*     */ import com.intellij.ml.llm.core.chat.session.ChatTitle;
/*     */ import com.intellij.openapi.application.CoroutinesKt;
/*     */ import com.intellij.openapi.components.ComponentManager;
/*     */ import java.util.List;
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
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.Dispatchers;
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
/*     */ @DebugMetadata(f = "AIAssistantChatPanelController.kt", l = {117}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.chat.ui.chat.AIAssistantChatPanelController$generateTitle$1")
/*     */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ @SourceDebugExtension({"SMAP\nAIAssistantChatPanelController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIAssistantChatPanelController.kt\ncom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanelController$generateTitle$1\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,126:1\n29#2,3:127\n*S KotlinDebug\n*F\n+ 1 AIAssistantChatPanelController.kt\ncom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanelController$generateTitle$1\n*L\n117#1:127,3\n*E\n"})
/*     */ final class AIAssistantChatPanelController$generateTitle$1
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   AIAssistantChatPanelController$generateTitle$1(StringBuilder $prompt, List<CompletableMessage> $messagesToUse, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object invokeSuspend(@NotNull Object $result) {
/*     */     StringBuilder sb;
/*     */     ComponentManager $this$service$iv;
/*     */     int $i$f$service;
/*     */     Class<AIRequestService> serviceClass$iv;
/* 115 */     Object object1, object2 = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 116 */         sb = new StringBuilder();
/* 117 */         $this$service$iv = (ComponentManager)AIAssistantChatPanelController.access$getProject$p(AIAssistantChatPanelController.this); $i$f$service = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 127 */         serviceClass$iv = AIRequestService.class;
/* 128 */         object1 = $this$service$iv.getService(serviceClass$iv); if (object1 == null) throw new IllegalStateException((
/* 129 */               "Cannot find service " + serviceClass$iv.getName() + " in " + $this$service$iv + " (classloader=" + serviceClass$iv.getClassLoader()).toString()); 
/*     */         Intrinsics.checkNotNullExpressionValue(this.$prompt.toString(), "prompt.toString()");
/*     */         this.label = 1;
/*     */         if (((AIRequestService)object1).generateDialogTitle(this.$prompt.toString(), this.$messagesToUse, new Function2<String, Continuation<? super Unit>, Object>(AIAssistantChatPanelController.this, null) {
/*     */               int label;
/*     */               
/*     */               @Nullable
/*     */               public final Object invokeSuspend(@NotNull Object $result) {
/*     */                 String it;
/*     */                 Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                 switch (this.label) {
/*     */                   case 0:
/*     */                     ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                     it = (String)this.L$0;
/*     */                     this.$sb.append(it);
/*     */                     this.label = 1;
/*     */                     if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$sb, null) {
/*     */                           int label;
/*     */                           
/*     */                           @Nullable
/*     */                           public final Object invokeSuspend(@NotNull Object $result) {
/*     */                             IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                             switch (this.label) {
/*     */                               case 0:
/*     */                                 ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                                 Intrinsics.checkNotNullExpressionValue(this.$sb.toString(), "sb.toString()");
/*     */                                 AIAssistantChatPanelController.access$getSession$p(AIAssistantChatPanelController.this).setTitle(new ChatTitle(this.$sb.toString(), true));
/*     */                                 return Unit.INSTANCE;
/*     */                             } 
/*     */                             throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */                           }
/*     */                           
/*     */                           @NotNull
/*     */                           public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*     */                             return (Continuation)new Function2<>(AIAssistantChatPanelController.this, this.$sb, $completion);
/*     */                           }
/*     */                           
/*     */                           @Nullable
/*     */                           public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */                             return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                           }
/*     */                         }(Continuation)this) == object)
/*     */                       return object; 
/*     */                     BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$sb, null) {
/*     */                           int label;
/*     */                           
/*     */                           @Nullable
/*     */                           public final Object invokeSuspend(@NotNull Object $result) {
/*     */                             IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                             switch (this.label) {
/*     */                               case 0:
/*     */                                 ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                                 Intrinsics.checkNotNullExpressionValue(this.$sb.toString(), "sb.toString()");
/*     */                                 AIAssistantChatPanelController.access$getSession$p(AIAssistantChatPanelController.this).setTitle(new ChatTitle(this.$sb.toString(), true));
/*     */                                 return Unit.INSTANCE;
/*     */                             } 
/*     */                             throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */                           }
/*     */                           
/*     */                           @NotNull
/*     */                           public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*     */                             return (Continuation)new Function2<>(AIAssistantChatPanelController.this, this.$sb, $completion);
/*     */                           }
/*     */                           
/*     */                           @Nullable
/*     */                           public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */                             return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                           }
/*     */                         }(Continuation)this);
/*     */                     return Unit.INSTANCE;
/*     */                   case 1:
/*     */                     ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                     return Unit.INSTANCE;
/*     */                 } 
/*     */                 throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */               }
/*     */               
/*     */               @NotNull
/*     */               public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*     */                 Function2<String, Continuation<? super Unit>, Object> function2 = new Function2<>(this.$sb, AIAssistantChatPanelController.this, $completion);
/*     */                 function2.L$0 = value;
/*     */                 return (Continuation)function2;
/*     */               }
/*     */               
/*     */               @Nullable
/*     */               public final Object invoke(@NotNull String p1, @Nullable Continuation<?> p2) {
/*     */                 return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */               }
/*     */             }(Continuation)this) == object2)
/*     */           return object2; 
/*     */         ((AIRequestService)object1).generateDialogTitle(this.$prompt.toString(), this.$messagesToUse, new Function2<String, Continuation<? super Unit>, Object>(AIAssistantChatPanelController.this, null) {
/*     */               int label;
/*     */               
/*     */               @Nullable
/*     */               public final Object invokeSuspend(@NotNull Object $result) {
/*     */                 String it;
/*     */                 Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                 switch (this.label) {
/*     */                   case 0:
/*     */                     ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                     it = (String)this.L$0;
/*     */                     this.$sb.append(it);
/*     */                     this.label = 1;
/*     */                     if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$sb, null) {
/*     */                           int label;
/*     */                           
/*     */                           @Nullable
/*     */                           public final Object invokeSuspend(@NotNull Object $result) {
/*     */                             IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                             switch (this.label) {
/*     */                               case 0:
/*     */                                 ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                                 Intrinsics.checkNotNullExpressionValue(this.$sb.toString(), "sb.toString()");
/*     */                                 AIAssistantChatPanelController.access$getSession$p(AIAssistantChatPanelController.this).setTitle(new ChatTitle(this.$sb.toString(), true));
/*     */                                 return Unit.INSTANCE;
/*     */                             } 
/*     */                             throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */                           }
/*     */                           
/*     */                           @NotNull
/*     */                           public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*     */                             return (Continuation)new Function2<>(AIAssistantChatPanelController.this, this.$sb, $completion);
/*     */                           }
/*     */                           
/*     */                           @Nullable
/*     */                           public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */                             return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                           }
/*     */                         }(Continuation)this) == object)
/*     */                       return object; 
/*     */                     BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$sb, null) {
/*     */                           int label;
/*     */                           
/*     */                           @Nullable
/*     */                           public final Object invokeSuspend(@NotNull Object $result) {
/*     */                             IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                             switch (this.label) {
/*     */                               case 0:
/*     */                                 ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                                 Intrinsics.checkNotNullExpressionValue(this.$sb.toString(), "sb.toString()");
/*     */                                 AIAssistantChatPanelController.access$getSession$p(AIAssistantChatPanelController.this).setTitle(new ChatTitle(this.$sb.toString(), true));
/*     */                                 return Unit.INSTANCE;
/*     */                             } 
/*     */                             throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */                           }
/*     */                           
/*     */                           @NotNull
/*     */                           public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*     */                             return (Continuation)new Function2<>(AIAssistantChatPanelController.this, this.$sb, $completion);
/*     */                           }
/*     */                           
/*     */                           @Nullable
/*     */                           public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */                             return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                           }
/*     */                         }(Continuation)this);
/*     */                     return Unit.INSTANCE;
/*     */                   case 1:
/*     */                     ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                     return Unit.INSTANCE;
/*     */                 } 
/*     */                 throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */               }
/*     */               
/*     */               @NotNull
/*     */               public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*     */                 Function2<String, Continuation<? super Unit>, Object> function2 = new Function2<>(this.$sb, AIAssistantChatPanelController.this, $completion);
/*     */                 function2.L$0 = value;
/*     */                 return (Continuation)function2;
/*     */               }
/*     */               
/*     */               @Nullable
/*     */               public final Object invoke(@NotNull String p1, @Nullable Continuation<?> p2) {
/*     */                 return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */               }
/*     */             }(Continuation)this);
/*     */         return Unit.INSTANCE;
/*     */       case 1:
/*     */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */         return Unit.INSTANCE; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super AIAssistantChatPanelController$generateTitle$1> $completion) {
/*     */     return (Continuation<Unit>)new AIAssistantChatPanelController$generateTitle$1(this.$prompt, this.$messagesToUse, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */     return ((AIAssistantChatPanelController$generateTitle$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanelController$generateTitle$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */