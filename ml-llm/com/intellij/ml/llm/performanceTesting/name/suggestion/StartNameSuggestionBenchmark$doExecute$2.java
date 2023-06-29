/*    */ package com.intellij.ml.llm.performanceTesting.name.suggestion;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @DebugMetadata(f = "StartNameSuggestionBenchmark.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.performanceTesting.name.suggestion.StartNameSuggestionBenchmark$doExecute$2")
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ @SourceDebugExtension({"SMAP\nStartNameSuggestionBenchmark.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartNameSuggestionBenchmark.kt\ncom/intellij/ml/llm/performanceTesting/name/suggestion/StartNameSuggestionBenchmark$doExecute$2\n+ 2 service.kt\ncom/intellij/openapi/components/ServiceKt\n*L\n1#1,20:1\n43#2,3:21\n*S KotlinDebug\n*F\n+ 1 StartNameSuggestionBenchmark.kt\ncom/intellij/ml/llm/performanceTesting/name/suggestion/StartNameSuggestionBenchmark$doExecute$2\n*L\n17#1:21,3\n*E\n"})
/*    */ final class StartNameSuggestionBenchmark$doExecute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*    */   @Nullable
/*    */   public final Object invokeSuspend(@NotNull Object $result) {
/*    */     int $i$f$service;
/*    */     Class<NameSuggestionBenchmarkService> serviceClass$iv;
/*    */     Object object;
/* 16 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 17 */         $i$f$service = 0;
/*    */ 
/*    */ 
/*    */         
/* 21 */         serviceClass$iv = NameSuggestionBenchmarkService.class;
/* 22 */         object = ApplicationManager.getApplication().getService(serviceClass$iv); if (object == null)
/* 23 */           throw new RuntimeException("Cannot find service " + serviceClass$iv.getName() + " (classloader=" + serviceClass$iv.getClassLoader() + ", client=" + ClientId.Companion.getCurrentOrNull() + ")"); 
/*    */         ((NameSuggestionBenchmarkService)object).startBenchmark();
/*    */         return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   int label;
/*    */   
/*    */   StartNameSuggestionBenchmark$doExecute$2(Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super StartNameSuggestionBenchmark$doExecute$2> $completion) {
/*    */     return (Continuation<Unit>)new StartNameSuggestionBenchmark$doExecute$2($completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */     return ((StartNameSuggestionBenchmark$doExecute$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/performanceTesting/name/suggestion/StartNameSuggestionBenchmark$doExecute$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */