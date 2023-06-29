/*    */ package com.intellij.ml.llm.refactorings;
/*    */ 
/*    */ import com.intellij.codeInsight.lookup.impl.LookupImpl;
/*    */ import com.intellij.openapi.application.CoroutinesKt;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import java.util.Set;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Lambda;
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
/*    */ @DebugMetadata(f = "LlmLookupManagerListener.kt", l = {63}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.refactorings.LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$standardSuggestions$1")
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\"\n\002\020\016\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001*\0020\003H@"}, d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$standardSuggestions$1
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Set<? extends String>>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$standardSuggestions$1(PsiElement $targetElement, LookupImpl $lookup, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invokeSuspend(@NotNull Object $result) {
/* 63 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; return (CoroutinesKt.smartReadAction(LlmLookupManagerListener.access$getProject$p(LlmLookupManagerListener.this), new Function0<Set<? extends String>>(this.$targetElement, this.$lookup) { @NotNull public final Set<String> invoke() { return LlmLookupManagerListener.access$getStandardNameSuggestions(LlmLookupManagerListener.this, this.$targetElement, this.$lookup.getPsiElement()); } }(Continuation)this) == object) ? object : CoroutinesKt.smartReadAction(LlmLookupManagerListener.access$getProject$p(LlmLookupManagerListener.this), new Function0<Set<? extends String>>(this.$targetElement, this.$lookup) { @NotNull public final Set<String> invoke() { return LlmLookupManagerListener.access$getStandardNameSuggestions(LlmLookupManagerListener.this, this.$targetElement, this.$lookup.getPsiElement()); } }(Continuation)this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$standardSuggestions$1> $completion) {
/*    */     return (Continuation<Unit>)new LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$standardSuggestions$1(this.$targetElement, this.$lookup, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */     return ((LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$standardSuggestions$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/refactorings/LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$standardSuggestions$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */