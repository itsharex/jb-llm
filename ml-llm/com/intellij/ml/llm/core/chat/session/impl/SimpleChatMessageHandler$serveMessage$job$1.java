/*    */ package com.intellij.ml.llm.core.chat.session.impl;
/*    */ import com.intellij.ml.llm.core.chat.messages.CompletableMessage;
/*    */ import com.intellij.ml.llm.core.chat.messages.impl.SimpleCompletableMessage;
/*    */ import com.intellij.ml.llm.core.chat.services.AIRequestService;
/*    */ import com.intellij.ml.llm.core.chat.session.ChatSession;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.BuildersKt;
/*    */ import kotlinx.coroutines.CompletableDeferred;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @DebugMetadata(f = "SimpleChatMessageHandler.kt", l = {31, 35}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.chat.session.impl.SimpleChatMessageHandler$serveMessage$job$1")
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ @SourceDebugExtension({"SMAP\nSimpleChatMessageHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleChatMessageHandler.kt\ncom/intellij/ml/llm/core/chat/session/impl/SimpleChatMessageHandler$serveMessage$job$1\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n29#2,3:58\n29#2,3:64\n766#3:61\n857#3,2:62\n*S KotlinDebug\n*F\n+ 1 SimpleChatMessageHandler.kt\ncom/intellij/ml/llm/core/chat/session/impl/SimpleChatMessageHandler$serveMessage$job$1\n*L\n31#1:58,3\n43#1:64,3\n31#1:61\n31#1:62,2\n*E\n"})
/*    */ final class SimpleChatMessageHandler$serveMessage$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*    */   int label;
/*    */   
/*    */   SimpleChatMessageHandler$serveMessage$job$1(Project $project, ChatSession $chat, CompletableDeferred<Unit> $deferred, CompletableMessage $message, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invokeSuspend(@NotNull Object $result) {
/* 29 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */         
/* 31 */         try { ComponentManager $this$service$iv = (ComponentManager)this.$project; int $i$f$service = 0;
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
/* 58 */           Class<AIRequestService> serviceClass$iv = AIRequestService.class;
/* 59 */           Object object1 = $this$service$iv.getService(serviceClass$iv); if (object1 == null) throw new IllegalStateException((
/* 60 */                 "Cannot find service " + serviceClass$iv.getName() + " in " + $this$service$iv + " (classloader=" + serviceClass$iv.getClassLoader()).toString());  List list1 = this.$chat.getMessages(); String str = this.$chat.getContext(); AIRequestService aIRequestService = (AIRequestService)object1; int $i$f$filter = 0;
/* 61 */           List list2 = list1; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 62 */           for (Object element$iv$iv : list2) { CompletableMessage it = (CompletableMessage)element$iv$iv; int $i$a$-filter-SimpleChatMessageHandler$serveMessage$job$1$1 = 0; if (it.getState() instanceof com.intellij.ml.llm.core.chat.messages.ReadyState) destination$iv$iv.add(element$iv$iv);  }
/* 63 */            List list3 = (List)destination$iv$iv; this.label = 1; if (aIRequestService.sendMessage(str, CollectionsKt.take(list3, this.$chat.getMessages().size() - 1), new Function2<String, Continuation<? super Unit>, Object>(this.$message, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { String it; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (String)this.L$0; this.label = 1; if (((SimpleCompletableMessage)this.$message).appendText(it, (Continuation)this) == object) return object;  ((SimpleCompletableMessage)this.$message).appendText(it, (Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { Function2<String, Continuation<? super Unit>, Object> function2 = new Function2<>(this.$message, $completion); function2.L$0 = value; return (Continuation)function2; } @Nullable public final Object invoke(@NotNull String p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }
/* 64 */               (Continuation)this) == object) return object;  aIRequestService.sendMessage(str, CollectionsKt.take(list3, this.$chat.getMessages().size() - 1), new Function2<String, Continuation<? super Unit>, Object>(this.$message, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { String it; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (String)this.L$0; this.label = 1; if (((SimpleCompletableMessage)this.$message).appendText(it, (Continuation)this) == object) return object;  ((SimpleCompletableMessage)this.$message).appendText(it, (Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { Function2<String, Continuation<? super Unit>, Object> function2 = new Function2<>(this.$message, $completion); function2.L$0 = value; return (Continuation)function2; } @Nullable public final Object invoke(@NotNull String p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this); this.label = 2; if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$chat, this.$message, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.$chat.setTimestamp(System.currentTimeMillis()); ((SimpleCompletableMessage)this.$message).complete(null); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$chat, this.$message, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this) == object) return object;  BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$chat, this.$message, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.$chat.setTimestamp(System.currentTimeMillis()); ((SimpleCompletableMessage)this.$message).complete(null); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$chat, this.$message, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this); this.$deferred.complete(Unit.INSTANCE); } catch (Throwable e) { Iterable $this$filter$iv; ComponentManager $this$service$iv = (ComponentManager)this.$project; int $i$f$service = 0; Class<AIAssistantServiceScope> serviceClass$iv = AIAssistantServiceScope.class;
/* 65 */           Object object1 = $this$service$iv.getService(serviceClass$iv); if (object1 == null) throw new IllegalStateException((
/* 66 */                 "Cannot find service " + serviceClass$iv.getName() + " in " + $this$service$iv + " (classloader=" + serviceClass$iv.getClassLoader()).toString()); 
/*    */           BuildersKt.launch$default(((AIAssistantServiceScope)object1).getScope(), null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$chat, this.$message, (Throwable)$this$filter$iv, this.$deferred, null) {
/*    */                 int label;
/*    */                 
/*    */                 @Nullable
/*    */                 public final Object invokeSuspend(@NotNull Object $result) {
/*    */                   Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */                   switch (this.label) {
/*    */                     case 0:
/*    */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */                       this.label = 1;
/*    */                       if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$chat, this.$message, this.$e, this.$deferred, null) {
/*    */                             int label;
/*    */                             
/*    */                             @Nullable
/*    */                             public final Object invokeSuspend(@NotNull Object $result) {
/*    */                               IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */                               switch (this.label) {
/*    */                                 case 0:
/*    */                                   ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */                                   this.$chat.setTimestamp(System.currentTimeMillis());
/*    */                                   ((SimpleCompletableMessage)this.$message).complete(this.$e);
/*    */                                   this.$deferred.completeExceptionally(this.$e);
/*    */                                   return Unit.INSTANCE;
/*    */                               } 
/*    */                               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */                             }
/*    */                             
/*    */                             @NotNull
/*    */                             public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*    */                               return (Continuation)new Function2<>(this.$chat, this.$message, this.$e, this.$deferred, $completion);
/*    */                             }
/*    */                             
/*    */                             @Nullable
/*    */                             public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */                               return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */                             }
/*    */                           }(Continuation)this) == object)
/*    */                         return object; 
/*    */                       BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$chat, this.$message, this.$e, this.$deferred, null) {
/*    */                             int label;
/*    */                             
/*    */                             @Nullable
/*    */                             public final Object invokeSuspend(@NotNull Object $result) {
/*    */                               IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */                               switch (this.label) {
/*    */                                 case 0:
/*    */                                   ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */                                   this.$chat.setTimestamp(System.currentTimeMillis());
/*    */                                   ((SimpleCompletableMessage)this.$message).complete(this.$e);
/*    */                                   this.$deferred.completeExceptionally(this.$e);
/*    */                                   return Unit.INSTANCE;
/*    */                               } 
/*    */                               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */                             }
/*    */                             
/*    */                             @NotNull
/*    */                             public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*    */                               return (Continuation)new Function2<>(this.$chat, this.$message, this.$e, this.$deferred, $completion);
/*    */                             }
/*    */                             
/*    */                             @Nullable
/*    */                             public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */                               return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */                             }
/*    */                           }(Continuation)this);
/*    */                       return Unit.INSTANCE;
/*    */                     case 1:
/*    */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */                       return Unit.INSTANCE;
/*    */                   } 
/*    */                   throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */                 }
/*    */                 
/*    */                 @NotNull
/*    */                 public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*    */                   return (Continuation)new Function2<>(this.$chat, this.$message, this.$e, this.$deferred, $completion);
/*    */                 }
/*    */                 
/*    */                 @Nullable
/*    */                 public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */                 }
/*    */               }3, null); }
/*    */         
/*    */         return Unit.INSTANCE;
/*    */       case 1:
/*    */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */         this.label = 2;
/*    */         if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$chat, this.$message, null) {
/*    */               int label;
/*    */               
/*    */               @Nullable
/*    */               public final Object invokeSuspend(@NotNull Object $result) {
/*    */                 IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */                 switch (this.label) {
/*    */                   case 0:
/*    */                     ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */                     this.$chat.setTimestamp(System.currentTimeMillis());
/*    */                     ((SimpleCompletableMessage)this.$message).complete(null);
/*    */                     return Unit.INSTANCE;
/*    */                 } 
/*    */                 throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */               }
/*    */               
/*    */               @NotNull
/*    */               public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*    */                 return (Continuation)new Function2<>(this.$chat, this.$message, $completion);
/*    */               }
/*    */               
/*    */               @Nullable
/*    */               public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */                 return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */               }
/*    */             }(Continuation)this) == object)
/*    */           return object; 
/*    */         BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$chat, this.$message, null) {
/*    */               int label;
/*    */               
/*    */               @Nullable
/*    */               public final Object invokeSuspend(@NotNull Object $result) {
/*    */                 IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */                 switch (this.label) {
/*    */                   case 0:
/*    */                     ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */                     this.$chat.setTimestamp(System.currentTimeMillis());
/*    */                     ((SimpleCompletableMessage)this.$message).complete(null);
/*    */                     return Unit.INSTANCE;
/*    */                 } 
/*    */                 throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */               }
/*    */               
/*    */               @NotNull
/*    */               public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*    */                 return (Continuation)new Function2<>(this.$chat, this.$message, $completion);
/*    */               }
/*    */               
/*    */               @Nullable
/*    */               public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */                 return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */               }
/*    */             }(Continuation)this);
/*    */         this.$deferred.complete(Unit.INSTANCE);
/*    */       case 2:
/*    */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */         this.$deferred.complete(Unit.INSTANCE); }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super SimpleChatMessageHandler$serveMessage$job$1> $completion) {
/*    */     return (Continuation<Unit>)new SimpleChatMessageHandler$serveMessage$job$1(this.$project, this.$chat, this.$deferred, this.$message, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */     return ((SimpleChatMessageHandler$serveMessage$job$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/session/impl/SimpleChatMessageHandler$serveMessage$job$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */