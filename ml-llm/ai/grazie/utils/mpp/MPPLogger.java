/*    */ package ai.grazie.utils.mpp;
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\030\002\n\002\020\013\n\000\n\002\020\016\n\002\b\003\n\002\020\003\n\002\b\005\n\002\030\002\n\002\030\002\n\002\b\002\bf\030\0002\0020\001J$\020\002\032\0020\0032\f\020\004\032\b\022\004\022\0020\0060\0052\f\020\007\032\b\022\004\022\0020\b0\005H\026J\026\020\t\032\0020\0032\f\020\007\032\b\022\004\022\0020\b0\005H&J\"\020\n\032\0020\0032\f\020\007\032\b\022\004\022\0020\b0\0052\n\b\002\020\013\032\004\030\0010\fH&J\026\020\r\032\0020\0032\f\020\007\032\b\022\004\022\0020\b0\005H&J\"\020\016\032\0020\0032\f\020\007\032\b\022\004\022\0020\b0\0052\n\b\002\020\013\032\004\030\0010\fH&JC\020\017\032\002H\020\"\004\b\000\020\0202\f\020\007\032\b\022\004\022\0020\b0\0052\034\020\021\032\030\b\001\022\n\022\b\022\004\022\002H\0200\023\022\006\022\004\030\0010\0010\022H@ø\001\000¢\006\002\020\024ø\001\001\002\n\n\002\b\031\n\004\b!0\001¨\006\025À\006\001"}, d2 = {"Lai/grazie/utils/mpp/MPPLogger;", "", "bomb", "", "condition", "Lkotlin/Function0;", "", "message", "", "debug", "error", "e", "", "info", "warning", "withTimer", "T", "body", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "utils-common"})
/*    */ public interface MPPLogger {
/*    */   void debug(@NotNull Function0<String> paramFunction0);
/*    */   
/*    */   void info(@NotNull Function0<String> paramFunction0);
/*    */   
/*    */   void warning(@NotNull Function0<String> paramFunction0, @Nullable Throwable paramThrowable);
/*    */   
/*    */   void error(@NotNull Function0<String> paramFunction0, @Nullable Throwable paramThrowable);
/*    */   
/*    */   @Nullable
/*    */   default <T> Object withTimer(@NotNull Function0<String> message, @NotNull Function1<? super Continuation<?>, ? extends Object> body, @NotNull Continuation<?> $completion) {
/*    */     return withTimer$suspendImpl(this, message, body, $completion);
/*    */   }
/*    */   
/* 17 */   default void bomb(@NotNull Function0 condition, @NotNull Function0 message) { Intrinsics.checkNotNullParameter(condition, "condition"); Intrinsics.checkNotNullParameter(message, "message"); if (((Boolean)condition.invoke()).booleanValue()) error$default(this, message, null, 2, null);  } @DebugMetadata(f = "Logger.kt", l = {23}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"$this", "message", "start"}, m = "withTimer$suspendImpl", c = "ai.grazie.utils.mpp.MPPLogger") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48) static final class MPPLogger$withTimer$1<T> extends ContinuationImpl {
/*    */     Object L$0; Object L$1; Object L$2; int label; MPPLogger$withTimer$1(Continuation $completion) { super($completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return MPPLogger.withTimer$suspendImpl(MPPLogger.this, null, null, (Continuation)this); }
/*    */   } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\016\n\002\b\002\020\000\032\0020\001\"\004\b\000\020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "T", "invoke"}) static final class MPPLogger$withTimer$2 extends Lambda implements Function0<String> {
/* 22 */     @NotNull public final String invoke() { return "Start " + this.$message.invoke(); } MPPLogger$withTimer$2(Function0<String> $message) { super(0); }
/*    */   } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\016\n\002\b\002\020\000\032\0020\001\"\004\b\000\020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "T", "invoke"}) static final class MPPLogger$withTimer$3 extends Lambda implements Function0<String> {
/* 24 */     MPPLogger$withTimer$3(Function0<String> $message, Timer $start) { super(0); } @NotNull public final String invoke() { return "Finish " + this.$message.invoke() + "; Total time " + this.$start.elapsed().getMillis() + "ms."; }
/*    */   
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/mpp/MPPLogger.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */