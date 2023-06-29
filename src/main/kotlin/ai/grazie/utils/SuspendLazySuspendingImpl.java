/*    */ package ai.grazie.utils;
/*    */ 
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.BuildersKt;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.CoroutineStart;
/*    */ import kotlinx.coroutines.Deferred;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\b\002\030\000*\006\b\000\020\001 \0012\b\022\004\022\002H\0010\002B1\022'\020\003\032#\b\001\022\004\022\0020\005\022\n\022\b\022\004\022\0028\0000\006\022\006\022\004\030\0010\0070\004¢\006\002\b\bø\001\000¢\006\002\020\tJ\021\020\016\032\0028\000HBø\001\000¢\006\002\020\017R\032\020\n\032\b\022\004\022\0028\0000\013X\004¢\006\b\n\000\022\004\b\f\020\r\002\004\n\002\b\031¨\006\020"}, d2 = {"Lai/grazie/utils/SuspendLazySuspendingImpl;", "T", "Lai/grazie/utils/SuspendLazy;", "initializer", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)V", "deferred", "Lkotlinx/coroutines/Deferred;", "getDeferred$annotations", "()V", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "utils-common"})
/*    */ final class SuspendLazySuspendingImpl<T> implements SuspendLazy<T> {
/*    */   @NotNull
/*    */   private final Deferred<T> deferred;
/*    */   
/* 17 */   public SuspendLazySuspendingImpl(@NotNull Function2 initializer) { this.deferred = BuildersKt.async$default((CoroutineScope)GlobalScope.INSTANCE, null, CoroutineStart.LAZY, initializer, 1, null); } @Nullable
/* 18 */   public Object invoke(@NotNull Continuation $completion) { return this.deferred.await($completion); }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/SuspendLazySuspendingImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */