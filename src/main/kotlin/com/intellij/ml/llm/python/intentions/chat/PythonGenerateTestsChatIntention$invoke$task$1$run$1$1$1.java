/*     */ package com.intellij.ml.llm.python.intentions.chat;
/*     */ 
/*     */ import com.intellij.ml.llm.core.chat.session.ChatKind;
/*     */ import com.intellij.ml.llm.core.chat.session.ChatSession;
/*     */ import com.intellij.ml.llm.core.chat.session.ChatSessionHost;
/*     */ import com.intellij.ml.llm.core.chat.session.FocusedChatSessionHost;
/*     */ import com.intellij.ml.llm.core.chat.session.SimpleChat;
/*     */ import com.intellij.openapi.application.CoroutinesKt;
/*     */ import com.intellij.openapi.components.ComponentManager;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
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
/*     */ @DebugMetadata(f = "PythonGenerateTestsChatIntention.kt", l = {67, 69, 73}, i = {1}, s = {"L$0"}, n = {"chat"}, m = "invokeSuspend", c = "com.intellij.ml.llm.python.intentions.chat.PythonGenerateTestsChatIntention$invoke$task$1$run$1$1$1")
/*     */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ @SourceDebugExtension({"SMAP\nPythonGenerateTestsChatIntention.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PythonGenerateTestsChatIntention.kt\ncom/intellij/ml/llm/python/intentions/chat/PythonGenerateTestsChatIntention$invoke$task$1$run$1$1$1\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,187:1\n29#2,3:188\n*S KotlinDebug\n*F\n+ 1 PythonGenerateTestsChatIntention.kt\ncom/intellij/ml/llm/python/intentions/chat/PythonGenerateTestsChatIntention$invoke$task$1$run$1$1$1\n*L\n67#1:188,3\n*E\n"})
/*     */ final class PythonGenerateTestsChatIntention$invoke$task$1$run$1$1$1
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*     */ {
/*     */   Object L$0;
/*     */   int label;
/*     */   
/*     */   PythonGenerateTestsChatIntention$invoke$task$1$run$1$1$1(PythonGenerateTestsChatIntention $receiver, PsiFile $containingFile, String $message, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object invokeSuspend(@NotNull Object $result) {
/*     */     ChatSession chat;
/*     */     ComponentManager $this$service$iv;
/*     */     int $i$f$service;
/*     */     Class<ChatSessionHost> serviceClass$iv;
/*  66 */     Object object1, object2 = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*  67 */         $this$service$iv = (ComponentManager)this.$project; $i$f$service = 0;
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
/* 188 */         serviceClass$iv = ChatSessionHost.class;
/* 189 */         object1 = $this$service$iv.getService(serviceClass$iv); if (object1 == null) throw new IllegalStateException((
/* 190 */               "Cannot find service " + serviceClass$iv.getName() + " in " + $this$service$iv + " (classloader=" + serviceClass$iv.getClassLoader()).toString());  this.label = 1; if (((ChatSessionHost)object1).createChatSession(PythonGenerateTestsChatIntention.this.getChatCreationContext(this.$containingFile), (Continuation)this) == object2) return object2;  chat = (ChatSession)((ChatSessionHost)object1).createChatSession(PythonGenerateTestsChatIntention.this.getChatCreationContext(this.$containingFile), (Continuation)this); this.L$0 = chat; this.label = 2; if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$project, chat, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { ComponentManager $this$service$iv; int $i$f$service; Class<FocusedChatSessionHost> serviceClass$iv; Object object; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$service$iv = (ComponentManager)this.$project; $i$f$service = 0; serviceClass$iv = FocusedChatSessionHost.class; object = $this$service$iv.getService(serviceClass$iv); if (object == null) throw new IllegalStateException(("Cannot find service " + serviceClass$iv.getName() + " in " + $this$service$iv + " (classloader=" + serviceClass$iv.getClassLoader()).toString());  ((FocusedChatSessionHost)object).focusChatSession(this.$chat); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$project, this.$chat, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this) == object2) return object2;  BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$project, chat, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { ComponentManager $this$service$iv; int $i$f$service; Class<FocusedChatSessionHost> serviceClass$iv; Object object; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$service$iv = (ComponentManager)this.$project; $i$f$service = 0; serviceClass$iv = FocusedChatSessionHost.class; object = $this$service$iv.getService(serviceClass$iv); if (object == null) throw new IllegalStateException(("Cannot find service " + serviceClass$iv.getName() + " in " + $this$service$iv + " (classloader=" + serviceClass$iv.getClassLoader()).toString());  ((FocusedChatSessionHost)object).focusChatSession(this.$chat); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$project, this.$chat, $completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { ComponentManager $this$service$iv; int $i$f$service; Class<FocusedChatSessionHost> serviceClass$iv; Object object; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$service$iv = (ComponentManager)this.$project; $i$f$service = 0; serviceClass$iv = FocusedChatSessionHost.class; object = $this$service$iv.getService(serviceClass$iv); if (object == null) throw new IllegalStateException(("Cannot find service " + serviceClass$iv.getName() + " in " + $this$service$iv + " (classloader=" + serviceClass$iv.getClassLoader()).toString());  ((FocusedChatSessionHost)object).focusChatSession(this.$chat); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this); this.L$0 = null; this.label = 3; if (chat.send(this.$project, this.$message, (ChatKind)SimpleChat.INSTANCE, (Continuation)this) == object2) return object2;  chat.send(this.$project, this.$message, (ChatKind)SimpleChat.INSTANCE, (Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); chat = (ChatSession)SYNTHETIC_LOCAL_VARIABLE_1; this.L$0 = chat; this.label = 2; if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$project, chat, null) { int label; @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$project, this.$chat, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this) == object2) return object2;  BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$project, chat, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { ComponentManager $this$service$iv; int $i$f$service; Class<FocusedChatSessionHost> serviceClass$iv; Object object; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$service$iv = (ComponentManager)this.$project; $i$f$service = 0; serviceClass$iv = FocusedChatSessionHost.class; object = $this$service$iv.getService(serviceClass$iv); if (object == null) throw new IllegalStateException(("Cannot find service " + serviceClass$iv.getName() + " in " + $this$service$iv + " (classloader=" + serviceClass$iv.getClassLoader()).toString()); 
/*     */                     ((FocusedChatSessionHost)object).focusChatSession(this.$chat);
/*     */                     return Unit.INSTANCE; }
/*     */                 
/*     */                 throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */ 
/*     */               
/*     */               @NotNull
/*     */               public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*     */                 return (Continuation)new Function2<>(this.$project, this.$chat, $completion);
/*     */               }
/*     */               
/*     */               @Nullable
/*     */               public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */                 return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */               } }
/*     */             (Continuation)this);
/*     */         this.L$0 = null;
/*     */         this.label = 3;
/*     */         if (chat.send(this.$project, this.$message, (ChatKind)SimpleChat.INSTANCE, (Continuation)this) == object2)
/*     */           return object2; 
/*     */         chat.send(this.$project, this.$message, (ChatKind)SimpleChat.INSTANCE, (Continuation)this);
/*     */         return Unit.INSTANCE;
/*     */       case 2:
/*     */         chat = (ChatSession)this.L$0;
/*     */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */         this.L$0 = null;
/*     */         this.label = 3;
/*     */         if (chat.send(this.$project, this.$message, (ChatKind)SimpleChat.INSTANCE, (Continuation)this) == object2)
/*     */           return object2; 
/*     */         chat.send(this.$project, this.$message, (ChatKind)SimpleChat.INSTANCE, (Continuation)this);
/*     */         return Unit.INSTANCE;
/*     */       case 3:
/*     */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */         return Unit.INSTANCE; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super PythonGenerateTestsChatIntention$invoke$task$1$run$1$1$1> $completion) {
/*     */     return (Continuation<Unit>)new PythonGenerateTestsChatIntention$invoke$task$1$run$1$1$1(PythonGenerateTestsChatIntention.this, this.$containingFile, this.$message, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */     return ((PythonGenerateTestsChatIntention$invoke$task$1$run$1$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/python/intentions/chat/PythonGenerateTestsChatIntention$invoke$task$1$run$1$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */