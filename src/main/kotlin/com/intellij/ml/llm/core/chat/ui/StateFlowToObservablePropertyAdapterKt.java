/*    */ package com.intellij.ml.llm.core.chat.ui;
/*    */ import kotlin.coroutines.CoroutineContext;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.flow.StateFlow;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\032\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\0320\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0032\006\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\007¨\006\b"}, d2 = {"asObservable", "Lcom/intellij/openapi/observable/properties/AbstractObservableProperty;", "T", "Lkotlinx/coroutines/flow/StateFlow;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "ctx", "Lkotlin/coroutines/CoroutineContext;", "intellij.ml.llm"})
/*    */ public final class StateFlowToObservablePropertyAdapterKt {
/*    */   @NotNull
/*    */   public static final <T> AbstractObservableProperty<T> asObservable(@NotNull StateFlow<? extends T> $this$asObservable, @NotNull CoroutineScope scope, @Nullable CoroutineContext ctx) {
/* 10 */     Intrinsics.checkNotNullParameter($this$asObservable, "<this>"); Intrinsics.checkNotNullParameter(scope, "scope"); return new StateFlowToObservablePropertyAdapter<>(scope, ctx, $this$asObservable);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/StateFlowToObservablePropertyAdapterKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */