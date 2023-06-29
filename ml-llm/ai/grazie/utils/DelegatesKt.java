/*   */ package ai.grazie.utils;
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\"\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\030\002\n\002\b\002\032C\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\0022'\020\003\032#\b\001\022\004\022\0020\005\022\n\022\b\022\004\022\002H\0020\006\022\006\022\004\030\0010\0070\004¢\006\002\b\bø\001\000¢\006\002\020\t\002\004\n\002\b\031¨\006\n"}, d2 = {"suspendLazy", "Lai/grazie/utils/SuspendLazy;", "T", "initializer", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)Lai/grazie/utils/SuspendLazy;", "utils-common"})
/*   */ public final class DelegatesKt {
/*   */   @NotNull
/*   */   public static final <T> SuspendLazy<T> suspendLazy(@NotNull Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> initializer) {
/* 7 */     Intrinsics.checkNotNullParameter(initializer, "initializer"); return new SuspendLazySuspendingImpl<>(initializer);
/*   */   }
/*   */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/DelegatesKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */