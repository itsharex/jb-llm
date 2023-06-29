/*     */ package com.intellij.ml.llm.core.settings;
/*     */ 
/*     */ import com.intellij.codeWithMe.ClientId;
/*     */ import com.intellij.ml.llm.core.grazieAPI.GrazieAuthService;
/*     */ import com.intellij.openapi.application.ApplicationManager;
/*     */ import java.awt.event.ActionEvent;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.BuildersKt;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "Ljava/awt/event/ActionEvent;", "invoke"})
/*     */ final class null
/*     */   extends Lambda
/*     */   implements Function1<ActionEvent, Unit>
/*     */ {
/*     */   public final void invoke(@NotNull ActionEvent it) {
/*  79 */     Intrinsics.checkNotNullParameter(it, "it"); BuildersKt.launch$default(LLMConfigurable.access$getScope$p(LLMConfigurable.this), null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) { @Nullable public final Object invokeSuspend(@NotNull Object $result) { int $i$f$service; Class<GrazieAuthService> serviceClass$iv; Object object1, object2 = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*  80 */                 $i$f$service = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/* 111 */                 serviceClass$iv = GrazieAuthService.class;
/* 112 */                 object1 = ApplicationManager.getApplication().getService(serviceClass$iv); if (object1 == null)
/* 113 */                   throw new RuntimeException("Cannot find service " + serviceClass$iv.getName() + " (classloader=" + serviceClass$iv.getClassLoader() + ", client=" + ClientId.Companion.getCurrentOrNull() + ")"); 
/*     */                 this.label = 1;
/*     */                 if (((GrazieAuthService)object1).authenticate(LLMConfigurable.access$getProject$p(LLMConfigurable.this), (Continuation)this) == object2)
/*     */                   return object2; 
/*     */                 ((GrazieAuthService)object1).authenticate(LLMConfigurable.access$getProject$p(LLMConfigurable.this), (Continuation)this);
/*     */                 return Unit.INSTANCE;
/*     */               case 1:
/*     */                 ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                 return Unit.INSTANCE; }
/*     */             
/*     */             throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */ 
/*     */           
/*     */           int label;
/*     */           
/*     */           @NotNull
/*     */           public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*     */             return (Continuation)new Function2<>(LLMConfigurable.this, $completion);
/*     */           }
/*     */           
/*     */           @Nullable
/*     */           public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */             return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */           } }
/*     */         3, null);
/*     */   }
/*     */   
/*     */   null() {
/*     */     super(1);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/settings/LLMConfigurable$createPanel$2$1$4$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */