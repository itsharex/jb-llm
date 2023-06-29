/*     */ package ai.grazie.client.common.extensions;
/*     */ 
/*     */ import ai.grazie.model.cloud.sse.continuous.ContinuousSSEEvent;
/*     */ import ai.grazie.model.cloud.sse.continuous.ExtensionsKt;
/*     */ import ai.grazie.utils.json.JSON;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.internal.InlineMarker;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
/*     */ import kotlinx.serialization.KSerializer;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 176, d1 = {"\000\n\n\000\n\002\020\002\n\002\b\007\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\0032\006\020\004\032\002H\002H@¢\006\004\b\005\020\006¨\006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"})
/*     */ @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SuspendableClientExtensions.kt\nai/grazie/client/common/extensions/SuspendableClientExtensionsKt\n*L\n1#1,222:1\n48#2:223\n86#3:224\n*E\n"})
/*     */ public final class null<T>
/*     */   implements FlowCollector
/*     */ {
/*     */   public null(FlowCollector $receiver, KSerializer paramKSerializer, JSON paramJSON) {}
/*     */   
/*     */   @Nullable
/*     */   public final Object emit(Object value, @NotNull Continuation paramContinuation) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof ai/grazie/client/common/extensions/SuspendableClientExtensionsKt$receiveContinuousSSE$$inlined$map$2$2$1
/*     */     //   4: ifeq -> 36
/*     */     //   7: aload_2
/*     */     //   8: checkcast ai/grazie/client/common/extensions/SuspendableClientExtensionsKt$receiveContinuousSSE$$inlined$map$2$2$1
/*     */     //   11: astore_3
/*     */     //   12: aload_3
/*     */     //   13: getfield label : I
/*     */     //   16: ldc -2147483648
/*     */     //   18: iand
/*     */     //   19: ifeq -> 36
/*     */     //   22: aload_3
/*     */     //   23: dup
/*     */     //   24: getfield label : I
/*     */     //   27: ldc -2147483648
/*     */     //   29: isub
/*     */     //   30: putfield label : I
/*     */     //   33: goto -> 46
/*     */     //   36: new ai/grazie/client/common/extensions/SuspendableClientExtensionsKt$receiveContinuousSSE$$inlined$map$2$2$1
/*     */     //   39: dup
/*     */     //   40: aload_0
/*     */     //   41: aload_2
/*     */     //   42: invokespecial <init> : (Lai/grazie/client/common/extensions/SuspendableClientExtensionsKt$receiveContinuousSSE$$inlined$map$2$2;Lkotlin/coroutines/Continuation;)V
/*     */     //   45: astore_3
/*     */     //   46: aload_3
/*     */     //   47: getfield result : Ljava/lang/Object;
/*     */     //   50: astore #4
/*     */     //   52: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   55: astore #5
/*     */     //   57: aload_3
/*     */     //   58: getfield label : I
/*     */     //   61: tableswitch default -> 174, 0 -> 84, 1 -> 159
/*     */     //   84: aload #4
/*     */     //   86: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   89: aload_0
/*     */     //   90: getfield $this_unsafeFlow : Lkotlinx/coroutines/flow/FlowCollector;
/*     */     //   93: aload_1
/*     */     //   94: astore #6
/*     */     //   96: astore #7
/*     */     //   98: iconst_0
/*     */     //   99: istore #8
/*     */     //   101: aload #7
/*     */     //   103: astore #9
/*     */     //   105: aload #6
/*     */     //   107: aload_3
/*     */     //   108: checkcast kotlin/coroutines/Continuation
/*     */     //   111: pop
/*     */     //   112: checkcast java/lang/String
/*     */     //   115: astore #10
/*     */     //   117: iconst_0
/*     */     //   118: istore #11
/*     */     //   120: getstatic ai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent.Companion : Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;
/*     */     //   123: aload #10
/*     */     //   125: aload_0
/*     */     //   126: getfield $serializer$inlined : Lkotlinx/serialization/KSerializer;
/*     */     //   129: aload_0
/*     */     //   130: getfield $json$inlined : Lai/grazie/utils/json/JSON;
/*     */     //   133: invokestatic parse : (Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;Ljava/lang/String;Lkotlinx/serialization/KSerializer;Lai/grazie/utils/json/JSON;)Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent;
/*     */     //   136: aload #9
/*     */     //   138: swap
/*     */     //   139: aload_3
/*     */     //   140: aload_3
/*     */     //   141: iconst_1
/*     */     //   142: putfield label : I
/*     */     //   145: invokeinterface emit : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   150: dup
/*     */     //   151: aload #5
/*     */     //   153: if_acmpne -> 169
/*     */     //   156: aload #5
/*     */     //   158: areturn
/*     */     //   159: iconst_0
/*     */     //   160: istore #8
/*     */     //   162: aload #4
/*     */     //   164: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   167: aload #4
/*     */     //   169: pop
/*     */     //   170: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   173: areturn
/*     */     //   174: new java/lang/IllegalStateException
/*     */     //   177: dup
/*     */     //   178: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   180: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   183: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #0	-> 55
/*     */     //   #53	-> 89
/*     */     //   #223	-> 101
/*     */     //   #224	-> 120
/*     */     //   #223	-> 136
/*     */     //   #0	-> 156
/*     */     //   #223	-> 169
/*     */     //   #0	-> 174
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   89	47	0	this	Lai/grazie/client/common/extensions/SuspendableClientExtensionsKt$receiveContinuousSSE$$inlined$map$2$2;
/*     */     //   89	9	1	value	Ljava/lang/Object;
/*     */     //   98	19	6	value	Ljava/lang/Object;
/*     */     //   98	19	7	$this$map_u24lambda_u2d4	Lkotlinx/coroutines/flow/FlowCollector;
/*     */     //   117	19	10	it	Ljava/lang/String;
/*     */     //   120	16	11	$i$a$-map-SuspendableClientExtensionsKt$receiveContinuousSSE$3	I
/*     */     //   101	58	8	$i$a$-unsafeTransform-FlowKt__TransformKt$map$1	I
/*     */     //   46	128	3	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   52	122	4	$result	Ljava/lang/Object;
/*     */     //   162	8	8	$i$a$-unsafeTransform-FlowKt__TransformKt$map$1	I
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object emit$$forInline(Object value, @NotNull Continuation $completion) {
/*  53 */     InlineMarker.mark(4); InlineMarker.mark(5); new ContinuationImpl($completion) { int label; Object L$0; @Nullable public final Object invokeSuspend(@NotNull Object $result) { this.result = $result; this.label |= Integer.MIN_VALUE; return SuspendableClientExtensionsKt$receiveContinuousSSE$$inlined$map$2.null.this.emit(null, (Continuation)this); } }; Continuation continuation1 = $completion; Object object = value; FlowCollector $this$map_u24lambda_u2d4 = this.$this_unsafeFlow; int $i$a$-unsafeTransform-FlowKt__TransformKt$map$1 = 0;
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
/* 223 */     FlowCollector flowCollector1 = $this$map_u24lambda_u2d4; Continuation continuation2 = $completion; String it = (String)object; int $i$a$-map-SuspendableClientExtensionsKt$receiveContinuousSSE$3 = 0; ContinuousSSEEvent continuousSSEEvent = 
/* 224 */       ExtensionsKt.parse(ContinuousSSEEvent.Companion, it, this.$serializer$inlined, this.$json$inlined);
/*     */     InlineMarker.mark(0);
/*     */     InlineMarker.mark(1);
/*     */     flowCollector1.emit(continuousSSEEvent, $completion);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/client/common/extensions/SuspendableClientExtensionsKt$receiveContinuousSSE$$inlined$map$2$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */