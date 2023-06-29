/*    */ package com.intellij.ml.llm.core.chat.ui;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.coroutines.flow.Flow;
/*    */ import kotlinx.coroutines.flow.FlowKt;
/*    */ import kotlinx.coroutines.flow.StateFlow;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\034\n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\032r\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\003\"\004\b\001\020\004\"\004\b\002\020\0022\f\020\005\032\b\022\004\022\002H\0030\0012\f\020\006\032\b\022\004\022\002H\0040\00126\020\007\0322\022\023\022\021H\003¢\006\f\b\t\022\b\b\n\022\004\b\b(\013\022\023\022\021H\004¢\006\f\b\t\022\b\b\n\022\004\b\b(\f\022\004\022\002H\0020\b\032E\020\r\032\b\022\004\022\002H\0020\001\"\004\b\000\020\003\"\004\b\001\020\002*\b\022\004\022\002H\0030\0012!\020\007\032\035\022\023\022\021H\003¢\006\f\b\t\022\b\b\n\022\004\b\b(\013\022\004\022\002H\0020\016¨\006\017"}, d2 = {"combineStates", "Lkotlinx/coroutines/flow/StateFlow;", "R", "T1", "T2", "flow", "flow2", "transform", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "a", "b", "mapState", "Lkotlin/Function1;", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nDerivedStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DerivedStateFlow.kt\ncom/intellij/ml/llm/core/chat/ui/DerivedStateFlowKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,37:1\n53#2:38\n55#2:42\n50#3:39\n55#3:41\n106#4:40\n*S KotlinDebug\n*F\n+ 1 DerivedStateFlow.kt\ncom/intellij/ml/llm/core/chat/ui/DerivedStateFlowKt\n*L\n28#1:38\n28#1:42\n28#1:39\n28#1:41\n28#1:40\n*E\n"})
/*    */ public final class DerivedStateFlowKt {
/*    */   @NotNull
/*    */   public static final <T1, R> StateFlow<R> mapState(@NotNull StateFlow<? extends T1> $this$mapState, @NotNull Function1<? super T1, ? extends R> transform) {
/* 26 */     Intrinsics.checkNotNullParameter($this$mapState, "<this>"); Intrinsics.checkNotNullParameter(transform, "transform");
/*    */     
/* 28 */     Flow $this$map$iv = (Flow)$this$mapState; int $i$f$map = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 38 */     Flow $this$unsafeTransform$iv$iv = $this$map$iv; int $i$f$unsafeTransform = 0;
/* 39 */     int $i$f$unsafeFlow = 0;
/* 40 */     return new DerivedStateFlow<>(new DerivedStateFlowKt$mapState$1(transform, $this$mapState), new DerivedStateFlowKt$mapState$$inlined$map$1($this$unsafeTransform$iv$iv, transform));
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\004\n\002\b\005\020\000\032\002H\001\"\004\b\000\020\002\"\004\b\001\020\001H\n¢\006\004\b\003\020\004"}, d2 = {"<anonymous>", "R", "T1", "invoke", "()Ljava/lang/Object;"})
/*    */   static final class DerivedStateFlowKt$mapState$1 extends Lambda implements Function0<R> {
/*    */     DerivedStateFlowKt$mapState$1(Function1<T1, R> $transform, StateFlow<T1> $receiver) {
/*    */       super(0);
/*    */     }
/*    */     
/*    */     public final R invoke() {
/*    */       return (R)this.$transform.invoke(this.$this_mapState.getValue());
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final <T1, T2, R> StateFlow<R> combineStates(@NotNull StateFlow<? extends T1> flow, @NotNull StateFlow<? extends T2> flow2, @NotNull Function2<? super T1, ? super T2, ? extends R> transform) {
/*    */     Intrinsics.checkNotNullParameter(flow, "flow");
/*    */     Intrinsics.checkNotNullParameter(flow2, "flow2");
/*    */     Intrinsics.checkNotNullParameter(transform, "transform");
/*    */     return new DerivedStateFlow<>(new DerivedStateFlowKt$combineStates$1(transform, flow, flow2), FlowKt.combine((Flow)flow, (Flow)flow2, new DerivedStateFlowKt$combineStates$2(transform, null)));
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\004\n\002\b\006\020\000\032\002H\001\"\004\b\000\020\002\"\004\b\001\020\003\"\004\b\002\020\001H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "R", "T1", "T2", "invoke", "()Ljava/lang/Object;"})
/*    */   static final class DerivedStateFlowKt$combineStates$1 extends Lambda implements Function0<R> {
/*    */     DerivedStateFlowKt$combineStates$1(Function2<T1, T2, R> $transform, StateFlow<T1> $flow, StateFlow<T2> $flow2) {
/*    */       super(0);
/*    */     }
/*    */     
/*    */     public final R invoke() {
/*    */       return (R)this.$transform.invoke(this.$flow.getValue(), this.$flow2.getValue());
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "DerivedStateFlow.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.chat.ui.DerivedStateFlowKt$combineStates$2")
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\004\n\002\b\006\020\000\032\002H\001\"\004\b\000\020\002\"\004\b\001\020\003\"\004\b\002\020\0012\006\020\004\032\002H\0022\006\020\005\032\002H\003H@"}, d2 = {"<anonymous>", "R", "T1", "T2", "a", "b"})
/*    */   static final class DerivedStateFlowKt$combineStates$2 extends SuspendLambda implements Function3<T1, T2, Continuation<? super R>, Object> {
/*    */     int label;
/*    */     
/*    */     DerivedStateFlowKt$combineStates$2(Function2<T1, T2, R> $transform, Continuation $completion) {
/*    */       super(3, $completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       Object a, b;
/*    */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */       switch (this.label) {
/*    */         case 0:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           a = this.L$0;
/*    */           b = this.L$1;
/*    */           return this.$transform.invoke(a, b);
/*    */       } 
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invoke(Object p1, Object p2, @Nullable Continuation<? super DerivedStateFlowKt$combineStates$2> p3) {
/*    */       DerivedStateFlowKt$combineStates$2 derivedStateFlowKt$combineStates$2 = new DerivedStateFlowKt$combineStates$2(this.$transform, p3);
/*    */       derivedStateFlowKt$combineStates$2.L$0 = p1;
/*    */       derivedStateFlowKt$combineStates$2.L$1 = p2;
/*    */       return derivedStateFlowKt$combineStates$2.invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/DerivedStateFlowKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */