package ai.grazie.api.gateway.client.api.cloud.llm;

import ai.grazie.model.cloud.sse.continuous.ContinuousSSEEvent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\b\t\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\0032\006\020\004\032\002H\002H@¢\006\004\b\005\020\006¨\006\n"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "ai/grazie/client/common/extensions/SuspendableClientExtensionsKt$receiveContinuousSSE$$inlined$map$3$2", "ai/grazie/client/common/cloud/SuspendableCloudClient$receiveContinuousSSE$$inlined$receiveContinuousSSE$2$2"})
@SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SuspendableClientExtensions.kt\nai/grazie/client/common/extensions/SuspendableClientExtensionsKt\n+ 4 Extensions.kt\nai/grazie/model/cloud/sse/continuous/ExtensionsKt\n*L\n1#1,222:1\n48#2:223\n87#3:224\n20#4,5:225\n*S KotlinDebug\n*F\n+ 1 SuspendableClientExtensions.kt\nai/grazie/client/common/extensions/SuspendableClientExtensionsKt\n*L\n87#1:225,5\n*E\n"})
public final class null<T> implements FlowCollector {
  public null(FlowCollector $receiver, ContinuousSSEEvent.Companion paramCompanion) {}
  
  @Nullable
  public final Object emit(Object value, @NotNull Continuation paramContinuation) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof ai/grazie/api/gateway/client/api/cloud/llm/LlmAPIClient$chat$$inlined$receiveContinuousSSE$default$3$2$1
    //   4: ifeq -> 36
    //   7: aload_2
    //   8: checkcast ai/grazie/api/gateway/client/api/cloud/llm/LlmAPIClient$chat$$inlined$receiveContinuousSSE$default$3$2$1
    //   11: astore_3
    //   12: aload_3
    //   13: getfield label : I
    //   16: ldc -2147483648
    //   18: iand
    //   19: ifeq -> 36
    //   22: aload_3
    //   23: dup
    //   24: getfield label : I
    //   27: ldc -2147483648
    //   29: isub
    //   30: putfield label : I
    //   33: goto -> 46
    //   36: new ai/grazie/api/gateway/client/api/cloud/llm/LlmAPIClient$chat$$inlined$receiveContinuousSSE$default$3$2$1
    //   39: dup
    //   40: aload_0
    //   41: aload_2
    //   42: invokespecial <init> : (Lai/grazie/api/gateway/client/api/cloud/llm/LlmAPIClient$chat$$inlined$receiveContinuousSSE$default$3$2;Lkotlin/coroutines/Continuation;)V
    //   45: astore_3
    //   46: aload_3
    //   47: getfield result : Ljava/lang/Object;
    //   50: astore #4
    //   52: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   55: astore #5
    //   57: aload_3
    //   58: getfield label : I
    //   61: tableswitch default -> 258, 0 -> 84, 1 -> 243
    //   84: aload #4
    //   86: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   89: aload_0
    //   90: getfield $this_unsafeFlow : Lkotlinx/coroutines/flow/FlowCollector;
    //   93: aload_1
    //   94: astore #6
    //   96: astore #7
    //   98: iconst_0
    //   99: istore #8
    //   101: aload #7
    //   103: astore #9
    //   105: aload #6
    //   107: aload_3
    //   108: checkcast kotlin/coroutines/Continuation
    //   111: pop
    //   112: checkcast ai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent
    //   115: astore #10
    //   117: iconst_0
    //   118: istore #11
    //   120: iconst_0
    //   121: istore #12
    //   123: aload_0
    //   124: getfield receiver$inlined : Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;
    //   127: pop
    //   128: iconst_0
    //   129: istore #13
    //   131: aload #10
    //   133: astore #14
    //   135: aload #14
    //   137: instanceof ai/grazie/model/cloud/sse/continuous/Data
    //   140: ifeq -> 168
    //   143: aload #10
    //   145: dup
    //   146: ifnonnull -> 159
    //   149: new java/lang/NullPointerException
    //   152: dup
    //   153: ldc 'null cannot be cast to non-null type ai.grazie.api.gateway.api.cloud.llm.LlmAPI.Chat.Stream.V3.Response'
    //   155: invokespecial <init> : (Ljava/lang/String;)V
    //   158: athrow
    //   159: checkcast ai/grazie/api/gateway/api/cloud/llm/LlmAPI$Chat$Stream$V3$Response
    //   162: checkcast ai/grazie/model/cloud/sse/continuous/Data
    //   165: goto -> 218
    //   168: aload #14
    //   170: instanceof ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEvent$Error
    //   173: ifeq -> 182
    //   176: aload #10
    //   178: checkcast java/lang/Throwable
    //   181: athrow
    //   182: aload #14
    //   184: instanceof ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEvent$Cancellation
    //   187: ifeq -> 196
    //   190: aload #10
    //   192: checkcast java/lang/Throwable
    //   195: athrow
    //   196: aload #14
    //   198: instanceof ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEvent$Timeout
    //   201: ifeq -> 210
    //   204: aload #10
    //   206: checkcast java/lang/Throwable
    //   209: athrow
    //   210: new kotlin/NoWhenBranchMatchedException
    //   213: dup
    //   214: invokespecial <init> : ()V
    //   217: athrow
    //   218: nop
    //   219: nop
    //   220: aload #9
    //   222: swap
    //   223: aload_3
    //   224: aload_3
    //   225: iconst_1
    //   226: putfield label : I
    //   229: invokeinterface emit : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   234: dup
    //   235: aload #5
    //   237: if_acmpne -> 253
    //   240: aload #5
    //   242: areturn
    //   243: iconst_0
    //   244: istore #8
    //   246: aload #4
    //   248: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   251: aload #4
    //   253: pop
    //   254: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   257: areturn
    //   258: new java/lang/IllegalStateException
    //   261: dup
    //   262: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   264: invokespecial <init> : (Ljava/lang/String;)V
    //   267: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #0	-> 55
    //   #53	-> 89
    //   #223	-> 101
    //   #224	-> 123
    //   #225	-> 131
    //   #226	-> 135
    //   #227	-> 168
    //   #228	-> 182
    //   #229	-> 196
    //   #225	-> 218
    //   #224	-> 219
    //   #223	-> 220
    //   #0	-> 240
    //   #223	-> 253
    //   #0	-> 258
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   89	39	0	this	Lai/grazie/api/gateway/client/api/cloud/llm/LlmAPIClient$chat$$inlined$receiveContinuousSSE$default$3$2;
    //   89	9	1	value	Ljava/lang/Object;
    //   98	19	6	value	Ljava/lang/Object;
    //   98	19	7	$this$map_u24lambda_u2d4	Lkotlinx/coroutines/flow/FlowCollector;
    //   117	103	10	p0	Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent;
    //   131	88	13	$i$f$handle	I
    //   120	100	11	$i$f$receiveContinuousSSE$handle	I
    //   123	97	12	$i$a$-map-SuspendableClientExtensionsKt$receiveContinuousSSE$4	I
    //   101	142	8	$i$a$-unsafeTransform-FlowKt__TransformKt$map$1	I
    //   46	212	3	$continuation	Lkotlin/coroutines/Continuation;
    //   52	206	4	$result	Ljava/lang/Object;
    //   246	8	8	$i$a$-unsafeTransform-FlowKt__TransformKt$map$1	I
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/client/api/cloud/llm/LlmAPIClient$chat$$inlined$receiveContinuousSSE$default$3$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */