/*     */ package ai.grazie.api.gateway.client.api.cloud.llm;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.flow.Flow;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\031\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\005*\001\000\b\n\030\0002\b\022\004\022\0028\0000\001J\037\020\002\032\0020\0032\f\020\004\032\b\022\004\022\0028\0000\005H@ø\001\000¢\006\002\020\006\002\004\n\002\b\031¨\006\007¸\006\n"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1", "ai/grazie/client/common/extensions/SuspendableClientExtensionsKt$receiveContinuousSSE$$inlined$map$1"})
/*     */ @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
/*     */ public final class LlmAPIClient$complete$$inlined$receiveContinuousSSE$default$1
/*     */   implements Flow<String>
/*     */ {
/*     */   public LlmAPIClient$complete$$inlined$receiveContinuousSSE$default$1(Flow paramFlow) {}
/*     */   
/*     */   @Nullable
/*     */   public Object collect(@NotNull FlowCollector collector, @NotNull Continuation $completion) {
/* 108 */     Continuation continuation = $completion; FlowCollector $this$unsafeTransform_u24lambda_u2d0 = collector; int $i$a$-unsafeFlow-FlowKt__EmittersKt$unsafeTransform$1 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 113 */     if (this.$this_unsafeTransform$inlined.collect((FlowCollector)new Object($this$unsafeTransform_u24lambda_u2d0), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return this.$this_unsafeTransform$inlined.collect((FlowCollector)new Object($this$unsafeTransform_u24lambda_u2d0), $completion);  this.$this_unsafeTransform$inlined.collect((FlowCollector)new Object($this$unsafeTransform_u24lambda_u2d0), $completion);
/*     */ 
/*     */ 
/*     */     
/* 117 */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/client/api/cloud/llm/LlmAPIClient$complete$$inlined$receiveContinuousSSE$default$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */