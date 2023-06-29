/*    */ package com.intellij.ml.llm.performanceTesting.name.suggestion;
/*    */ import kotlin.coroutines.Continuation;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\002\b\003\030\000 \r2\0020\001:\001\rB\032\022\013\020\002\032\0070\003¢\006\002\b\004\022\006\020\005\032\0020\006¢\006\002\020\007J\031\020\b\032\0020\t2\006\020\n\032\0020\013H@ø\001\000¢\006\002\020\f\002\004\n\002\b\031¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/performanceTesting/name/suggestion/StopNameSuggestionBenchmark;", "Lcom/intellij/openapi/ui/playback/commands/PlaybackCommandCoroutineAdapter;", "text", "", "Lorg/jetbrains/annotations/NonNls;", "line", "", "(Ljava/lang/String;I)V", "doExecute", "", "context", "Lcom/intellij/openapi/ui/playback/PlaybackContext;", "(Lcom/intellij/openapi/ui/playback/PlaybackContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "intellij.ml.llm.performanceTesting"})
/*    */ public final class StopNameSuggestionBenchmark extends PlaybackCommandCoroutineAdapter {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   public StopNameSuggestionBenchmark(@NotNull String text, int line) {
/* 10 */     super(text, line);
/*    */   } @NotNull
/*    */   public static final String PREFIX = "%stopNameSuggestionBenchmark"; @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\023\020\003\032\0070\004¢\006\002\b\005XT¢\006\002\n\000¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/performanceTesting/name/suggestion/StopNameSuggestionBenchmark$Companion;", "", "()V", "PREFIX", "", "Lorg/jetbrains/annotations/NonNls;", "intellij.ml.llm.performanceTesting"})
/*    */   public static final class Companion {
/*    */     private Companion() {} } @Nullable
/*    */   protected Object doExecute(@NotNull PlaybackContext context, @NotNull Continuation $completion) {
/* 16 */     if (BuildersKt.withContext((CoroutineContext)Dispatchers.getDefault(), new StopNameSuggestionBenchmark$doExecute$2(null), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return BuildersKt.withContext((CoroutineContext)Dispatchers.getDefault(), new StopNameSuggestionBenchmark$doExecute$2(null), $completion);  BuildersKt.withContext((CoroutineContext)Dispatchers.getDefault(), new StopNameSuggestionBenchmark$doExecute$2(null), $completion); return Unit.INSTANCE; } @DebugMetadata(f = "StopNameSuggestionBenchmark.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.performanceTesting.name.suggestion.StopNameSuggestionBenchmark$doExecute$2") @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) @SourceDebugExtension({"SMAP\nStopNameSuggestionBenchmark.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StopNameSuggestionBenchmark.kt\ncom/intellij/ml/llm/performanceTesting/name/suggestion/StopNameSuggestionBenchmark$doExecute$2\n+ 2 service.kt\ncom/intellij/openapi/components/ServiceKt\n*L\n1#1,21:1\n43#2,3:22\n*S KotlinDebug\n*F\n+ 1 StopNameSuggestionBenchmark.kt\ncom/intellij/ml/llm/performanceTesting/name/suggestion/StopNameSuggestionBenchmark$doExecute$2\n*L\n18#1:22,3\n*E\n"}) static final class StopNameSuggestionBenchmark$doExecute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { int label; StopNameSuggestionBenchmark$doExecute$2(Continuation $completion) { super(2, $completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { String reportPath; int $i$f$service; Class<NameSuggestionBenchmarkService> serviceClass$iv; Object object; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 17 */           reportPath = StopNameSuggestionBenchmark.this.extractCommandArgument("%stopNameSuggestionBenchmark");
/* 18 */           $i$f$service = 0;
/*    */ 
/*    */ 
/*    */           
/* 22 */           serviceClass$iv = NameSuggestionBenchmarkService.class;
/* 23 */           object = ApplicationManager.getApplication().getService(serviceClass$iv); if (object == null)
/* 24 */             throw new RuntimeException("Cannot find service " + serviceClass$iv.getName() + " (classloader=" + serviceClass$iv.getClassLoader() + ", client=" + ClientId.Companion.getCurrentOrNull() + ")"); 
/*    */           ((NameSuggestionBenchmarkService)object).stopBenchmark(reportPath);
/*    */           return Unit.INSTANCE; }
/*    */       
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super StopNameSuggestionBenchmark$doExecute$2> $completion) {
/*    */       return (Continuation<Unit>)new StopNameSuggestionBenchmark$doExecute$2($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */       return ((StopNameSuggestionBenchmark$doExecute$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/performanceTesting/name/suggestion/StopNameSuggestionBenchmark.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */