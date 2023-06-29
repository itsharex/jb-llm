package ai.grazie.client.common.cloud;

import ai.grazie.model.cloud.sse.continuous.ContinuousSSEEvent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 3, xi = 176, d1 = {"\000\n\n\000\n\002\020\002\n\002\b\b\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\0032\006\020\004\032\002H\002H@¢\006\004\b\005\020\006¨\006\t"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "ai/grazie/client/common/extensions/SuspendableClientExtensionsKt$receiveContinuousSSE$$inlined$map$3$2"})
@SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SuspendableClientExtensions.kt\nai/grazie/client/common/extensions/SuspendableClientExtensionsKt\n+ 4 Extensions.kt\nai/grazie/model/cloud/sse/continuous/ExtensionsKt\n*L\n1#1,222:1\n48#2:223\n87#3:224\n20#4,5:225\n*S KotlinDebug\n*F\n+ 1 SuspendableClientExtensions.kt\nai/grazie/client/common/extensions/SuspendableClientExtensionsKt\n*L\n87#1:225,5\n*E\n"})
public final class null<T> implements FlowCollector {
  public null(FlowCollector $receiver, ContinuousSSEEvent.Companion paramCompanion) {}
  
  @Nullable
  public final Object emit(Object value, @NotNull Continuation paramContinuation) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof ai/grazie/client/common/cloud/SuspendableCloudClient$receiveContinuousSSE$$inlined$receiveContinuousSSE$2$2$1
    //   4: ifeq -> 36
    //   7: aload_2
    //   8: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient$receiveContinuousSSE$$inlined$receiveContinuousSSE$2$2$1
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
    //   36: new ai/grazie/client/common/cloud/SuspendableCloudClient$receiveContinuousSSE$$inlined$receiveContinuousSSE$2$2$1
    //   39: dup
    //   40: aload_0
    //   41: aload_2
    //   42: invokespecial <init> : (Lai/grazie/client/common/cloud/SuspendableCloudClient$receiveContinuousSSE$$inlined$receiveContinuousSSE$2$2;Lkotlin/coroutines/Continuation;)V
    //   45: astore_3
    //   46: aload_3
    //   47: getfield result : Ljava/lang/Object;
    //   50: astore #4
    //   52: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   55: astore #5
    //   57: aload_3
    //   58: getfield label : I
    //   61: tableswitch default -> 250, 0 -> 84, 1 -> 235
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
    //   140: ifeq -> 160
    //   143: aload #10
    //   145: iconst_1
    //   146: ldc 'O'
    //   148: invokestatic reifiedOperationMarker : (ILjava/lang/String;)V
    //   151: checkcast ai/grazie/model/cloud/sse/continuous/Data
    //   154: checkcast ai/grazie/model/cloud/sse/continuous/Data
    //   157: goto -> 210
    //   160: aload #14
    //   162: instanceof ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEvent$Error
    //   165: ifeq -> 174
    //   168: aload #10
    //   170: checkcast java/lang/Throwable
    //   173: athrow
    //   174: aload #14
    //   176: instanceof ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEvent$Cancellation
    //   179: ifeq -> 188
    //   182: aload #10
    //   184: checkcast java/lang/Throwable
    //   187: athrow
    //   188: aload #14
    //   190: instanceof ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEvent$Timeout
    //   193: ifeq -> 202
    //   196: aload #10
    //   198: checkcast java/lang/Throwable
    //   201: athrow
    //   202: new kotlin/NoWhenBranchMatchedException
    //   205: dup
    //   206: invokespecial <init> : ()V
    //   209: athrow
    //   210: nop
    //   211: nop
    //   212: aload #9
    //   214: swap
    //   215: aload_3
    //   216: aload_3
    //   217: iconst_1
    //   218: putfield label : I
    //   221: invokeinterface emit : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   226: dup
    //   227: aload #5
    //   229: if_acmpne -> 245
    //   232: aload #5
    //   234: areturn
    //   235: iconst_0
    //   236: istore #8
    //   238: aload #4
    //   240: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   243: aload #4
    //   245: pop
    //   246: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   249: areturn
    //   250: new java/lang/IllegalStateException
    //   253: dup
    //   254: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   256: invokespecial <init> : (Ljava/lang/String;)V
    //   259: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #0	-> 55
    //   #53	-> 89
    //   #223	-> 101
    //   #224	-> 123
    //   #225	-> 131
    //   #226	-> 135
    //   #227	-> 160
    //   #228	-> 174
    //   #229	-> 188
    //   #225	-> 210
    //   #224	-> 211
    //   #223	-> 212
    //   #0	-> 232
    //   #223	-> 245
    //   #0	-> 250
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   89	39	0	this	Lai/grazie/client/common/cloud/SuspendableCloudClient$receiveContinuousSSE$$inlined$receiveContinuousSSE$2$2;
    //   89	9	1	value	Ljava/lang/Object;
    //   98	19	6	value	Ljava/lang/Object;
    //   98	19	7	$this$map_u24lambda_u2d4	Lkotlinx/coroutines/flow/FlowCollector;
    //   117	95	10	p0	Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent;
    //   131	80	13	$i$f$handle	I
    //   120	92	11	$i$f$receiveContinuousSSE$handle	I
    //   123	89	12	$i$a$-map-SuspendableClientExtensionsKt$receiveContinuousSSE$4	I
    //   101	134	8	$i$a$-unsafeTransform-FlowKt__TransformKt$map$1	I
    //   46	204	3	$continuation	Lkotlin/coroutines/Continuation;
    //   52	198	4	$result	Ljava/lang/Object;
    //   238	8	8	$i$a$-unsafeTransform-FlowKt__TransformKt$map$1	I
  }
  
  @Nullable
  public final Object emit$$forInline(Object value, @NotNull Continuation $completion) {
    // Byte code:
    //   0: iconst_4
    //   1: invokestatic mark : (I)V
    //   4: new ai/grazie/client/common/cloud/SuspendableCloudClient$receiveContinuousSSE$$inlined$receiveContinuousSSE$2$2$1
    //   7: dup
    //   8: aload_0
    //   9: aload_2
    //   10: invokespecial <init> : (Lai/grazie/client/common/cloud/SuspendableCloudClient$receiveContinuousSSE$$inlined$receiveContinuousSSE$2$2;Lkotlin/coroutines/Continuation;)V
    //   13: iconst_5
    //   14: invokestatic mark : (I)V
    //   17: pop
    //   18: aload_0
    //   19: getfield $this_unsafeFlow : Lkotlinx/coroutines/flow/FlowCollector;
    //   22: aload_1
    //   23: aload_2
    //   24: astore_3
    //   25: astore #4
    //   27: astore #5
    //   29: iconst_0
    //   30: istore #6
    //   32: aload #5
    //   34: astore #7
    //   36: aload #4
    //   38: aload_2
    //   39: checkcast kotlin/coroutines/Continuation
    //   42: astore #8
    //   44: checkcast ai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent
    //   47: astore #9
    //   49: iconst_0
    //   50: istore #10
    //   52: iconst_0
    //   53: istore #11
    //   55: aload_0
    //   56: getfield receiver$inlined : Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;
    //   59: astore #12
    //   61: iconst_0
    //   62: istore #13
    //   64: aload #9
    //   66: astore #14
    //   68: aload #14
    //   70: instanceof ai/grazie/model/cloud/sse/continuous/Data
    //   73: ifeq -> 93
    //   76: aload #9
    //   78: iconst_1
    //   79: ldc 'O'
    //   81: invokestatic reifiedOperationMarker : (ILjava/lang/String;)V
    //   84: checkcast ai/grazie/model/cloud/sse/continuous/Data
    //   87: checkcast ai/grazie/model/cloud/sse/continuous/Data
    //   90: goto -> 143
    //   93: aload #14
    //   95: instanceof ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEvent$Error
    //   98: ifeq -> 107
    //   101: aload #9
    //   103: checkcast java/lang/Throwable
    //   106: athrow
    //   107: aload #14
    //   109: instanceof ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEvent$Cancellation
    //   112: ifeq -> 121
    //   115: aload #9
    //   117: checkcast java/lang/Throwable
    //   120: athrow
    //   121: aload #14
    //   123: instanceof ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEvent$Timeout
    //   126: ifeq -> 135
    //   129: aload #9
    //   131: checkcast java/lang/Throwable
    //   134: athrow
    //   135: new kotlin/NoWhenBranchMatchedException
    //   138: dup
    //   139: invokespecial <init> : ()V
    //   142: athrow
    //   143: nop
    //   144: nop
    //   145: astore #15
    //   147: aload #7
    //   149: aload #15
    //   151: aload_2
    //   152: iconst_0
    //   153: invokestatic mark : (I)V
    //   156: invokeinterface emit : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   161: iconst_1
    //   162: invokestatic mark : (I)V
    //   165: pop
    //   166: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   169: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #53	-> 18
    //   #223	-> 32
    //   #224	-> 55
    //   #225	-> 64
    //   #226	-> 68
    //   #227	-> 93
    //   #228	-> 107
    //   #229	-> 121
    //   #225	-> 143
    //   #224	-> 144
    //   #223	-> 145
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   64	80	13	$i$f$handle	I
    //   61	83	12	$this$handle$iv	Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;
    //   52	93	10	$i$f$receiveContinuousSSE$handle	I
    //   55	90	11	$i$a$-map-SuspendableClientExtensionsKt$receiveContinuousSSE$4	I
    //   49	96	9	p0	Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent;
    //   49	96	8	$completion	Lkotlin/coroutines/Continuation;
    //   32	134	6	$i$a$-unsafeTransform-FlowKt__TransformKt$map$1	I
    //   29	137	5	$this$map_u24lambda_u2d4	Lkotlinx/coroutines/flow/FlowCollector;
    //   29	137	4	value	Ljava/lang/Object;
    //   29	137	3	$completion	Lkotlin/coroutines/Continuation;
    //   0	170	0	this	Lai/grazie/client/common/cloud/SuspendableCloudClient$receiveContinuousSSE$$inlined$receiveContinuousSSE$2$2;
    //   0	170	1	value	Ljava/lang/Object;
    //   0	170	2	$completion	Lkotlin/coroutines/Continuation;
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/client/common/cloud/SuspendableCloudClient$receiveContinuousSSE$$inlined$receiveContinuousSSE$2$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */