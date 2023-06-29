/*    */ package ai.grazie.client.common.extensions;
/*    */ 
/*    */ import ai.grazie.client.common.SuspendableHTTPClient;
/*    */ import ai.grazie.client.common.model.HTTPResponse;
/*    */ import ai.grazie.client.common.model.RequestOptions;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.jvm.internal.InlineMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.SerializersKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000F\n\002\b\002\n\002\020\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\002\b\t\n\002\020\002\n\002\b\003\032=\020\000\032\002H\001\"\n\b\000\020\001\030\001*\0020\002*\0020\0032\006\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\tHHø\001\000¢\006\002\020\n\032q\020\013\032\b\022\004\022\002H\0010\f\"\n\b\000\020\r\030\001*\0020\002\"\n\b\001\020\001\030\001*\0020\016*\0020\0032\006\020\004\032\0020\0052\006\020\017\032\002H\r2\016\b\002\020\020\032\b\022\004\022\002H\0010\0212\b\b\002\020\022\032\0020\0232\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\tHHø\001\000¢\006\002\020\024\032Q\020\025\032\002H\001\"\n\b\000\020\r\030\001*\0020\002\"\n\b\001\020\001\030\001*\0020\002*\0020\0032\006\020\004\032\0020\0052\006\020\017\032\002H\r2\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\tHHø\001\000¢\006\002\020\026\032i\020\025\032\002H\001\"\b\b\000\020\r*\0020\002\"\b\b\001\020\001*\0020\002*\0020\0032\006\020\004\032\0020\0052\006\020\017\032\002H\r2\f\020\027\032\b\022\004\022\002H\r0\0212\f\020\030\032\b\022\004\022\002H\0010\0212\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\tH@ø\001\000¢\006\002\020\031\032I\020\025\032\002H\001\"\b\b\000\020\001*\0020\002*\0020\0032\006\020\032\032\0020\0052\f\020\030\032\b\022\004\022\002H\0010\0212\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\tH@ø\001\000¢\006\002\020\033\032E\020\034\032\0020\035\"\n\b\000\020\r\030\001*\0020\002*\0020\0032\006\020\004\032\0020\0052\006\020\017\032\002H\r2\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\tHHø\001\000¢\006\002\020\026\032Q\020\034\032\0020\035\"\b\b\000\020\r*\0020\002*\0020\0032\006\020\004\032\0020\0052\006\020\017\032\002H\r2\f\020\027\032\b\022\004\022\002H\r0\0212\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\tH@ø\001\000¢\006\002\020\036\032'\020\034\032\0020\035*\0020\0032\006\020\004\032\0020\0052\b\b\002\020\006\032\0020\007H@ø\001\000¢\006\002\020\037\002\004\n\002\b\031¨\006 "}, d2 = {"get", "O", "", "Lai/grazie/client/common/SuspendableHTTPClient;", "url", "", "options", "Lai/grazie/client/common/model/RequestOptions;", "json", "Lai/grazie/utils/json/JSON;", "(Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveContinuousSSE", "Lkotlinx/coroutines/flow/Flow;", "I", "Lai/grazie/model/cloud/sse/continuous/Data;", "content", "serializer", "Lkotlinx/serialization/KSerializer;", "reconnect", "", "(Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/String;Ljava/lang/Object;Lkotlinx/serialization/KSerializer;ZLai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendAndGet", "(Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/String;Ljava/lang/Object;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "input", "output", "(Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/String;Ljava/lang/Object;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api", "(Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/String;Lkotlinx/serialization/KSerializer;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendAndWait", "", "(Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/String;Ljava/lang/Object;Lkotlinx/serialization/KSerializer;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "client-common"})
/*    */ @SourceDebugExtension({"SMAP\nSuspendableClientExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendableClientExtensions.kt\nai/grazie/client/common/extensions/SuspendableClientExtensionsKt\n+ 2 Serializers.kt\nkotlinx/serialization/SerializersKt__SerializersKt\n+ 3 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 4 JSON.kt\nai/grazie/utils/json/JSON\n+ 5 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 6 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 7 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,89:1\n24#2:90\n24#2:92\n24#2:94\n24#2:97\n24#2:114\n24#2:116\n80#3:91\n80#3:93\n80#3:95\n80#3:98\n80#3:115\n80#3:117\n28#4:96\n47#5:99\n49#5:103\n47#5:104\n49#5:108\n47#5:109\n49#5:113\n49#5:119\n47#5:120\n49#5:124\n47#5:125\n49#5:129\n50#6:100\n55#6:102\n50#6:105\n55#6:107\n50#6:110\n55#6:112\n55#6:118\n50#6:121\n55#6:123\n50#6:126\n55#6:128\n106#7:101\n106#7:106\n106#7:111\n106#7:122\n106#7:127\n*S KotlinDebug\n*F\n+ 1 SuspendableClientExtensions.kt\nai/grazie/client/common/extensions/SuspendableClientExtensionsKt\n*L\n31#1:90\n65#1:92\n74#1:94\n83#1:97\n78#1:114\n83#1:116\n31#1:91\n65#1:93\n74#1:95\n83#1:98\n78#1:115\n83#1:117\n83#1:96\n84#1:99\n84#1:103\n86#1:104\n86#1:108\n87#1:109\n87#1:113\n84#1:119\n86#1:120\n86#1:124\n87#1:125\n87#1:129\n84#1:100\n84#1:102\n86#1:105\n86#1:107\n87#1:110\n87#1:112\n84#1:118\n86#1:121\n86#1:123\n87#1:126\n87#1:128\n84#1:101\n86#1:106\n87#1:111\n86#1:122\n87#1:127\n*E\n"})
/*    */ public final class SuspendableClientExtensionsKt
/*    */ {
/*    */   @Nullable
/*    */   public static final <I, O> Object sendAndGet(@NotNull SuspendableHTTPClient $this$sendAndGet, @NotNull String url, @NotNull Object content, @NotNull KSerializer input, @NotNull KSerializer output, @NotNull RequestOptions options, @NotNull JSON json, @NotNull Continuation<? super O> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload #7
/*    */     //   2: instanceof ai/grazie/client/common/extensions/SuspendableClientExtensionsKt$sendAndGet$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #7
/*    */     //   10: checkcast ai/grazie/client/common/extensions/SuspendableClientExtensionsKt$sendAndGet$1
/*    */     //   13: astore #11
/*    */     //   15: aload #11
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #11
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 52
/*    */     //   41: new ai/grazie/client/common/extensions/SuspendableClientExtensionsKt$sendAndGet$1
/*    */     //   44: dup
/*    */     //   45: aload #7
/*    */     //   47: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*    */     //   50: astore #11
/*    */     //   52: aload #11
/*    */     //   54: getfield result : Ljava/lang/Object;
/*    */     //   57: astore #10
/*    */     //   59: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   62: astore #12
/*    */     //   64: aload #11
/*    */     //   66: getfield label : I
/*    */     //   69: tableswitch default -> 203, 0 -> 92, 1 -> 151
/*    */     //   92: aload #10
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: aload #6
/*    */     //   99: aload_3
/*    */     //   100: checkcast kotlinx/serialization/SerializationStrategy
/*    */     //   103: aload_2
/*    */     //   104: invokevirtual string : (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   107: astore #8
/*    */     //   109: aload_0
/*    */     //   110: aload_1
/*    */     //   111: aload #8
/*    */     //   113: aload #5
/*    */     //   115: aload #11
/*    */     //   117: aload #11
/*    */     //   119: aload #4
/*    */     //   121: putfield L$0 : Ljava/lang/Object;
/*    */     //   124: aload #11
/*    */     //   126: aload #6
/*    */     //   128: putfield L$1 : Ljava/lang/Object;
/*    */     //   131: aload #11
/*    */     //   133: iconst_1
/*    */     //   134: putfield label : I
/*    */     //   137: invokeinterface send : (Ljava/lang/String;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   142: dup
/*    */     //   143: aload #12
/*    */     //   145: if_acmpne -> 178
/*    */     //   148: aload #12
/*    */     //   150: areturn
/*    */     //   151: aload #11
/*    */     //   153: getfield L$1 : Ljava/lang/Object;
/*    */     //   156: checkcast ai/grazie/utils/json/JSON
/*    */     //   159: astore #6
/*    */     //   161: aload #11
/*    */     //   163: getfield L$0 : Ljava/lang/Object;
/*    */     //   166: checkcast kotlinx/serialization/KSerializer
/*    */     //   169: astore #4
/*    */     //   171: aload #10
/*    */     //   173: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   176: aload #10
/*    */     //   178: checkcast ai/grazie/client/common/model/HTTPResponse
/*    */     //   181: astore #9
/*    */     //   183: aload #6
/*    */     //   185: aload #4
/*    */     //   187: checkcast kotlinx/serialization/DeserializationStrategy
/*    */     //   190: aload #9
/*    */     //   192: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   195: dup
/*    */     //   196: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   199: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   202: areturn
/*    */     //   203: new java/lang/IllegalStateException
/*    */     //   206: dup
/*    */     //   207: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   209: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   212: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #12	-> 62
/*    */     //   #20	-> 97
/*    */     //   #21	-> 109
/*    */     //   #12	-> 148
/*    */     //   #22	-> 183
/*    */     //   #12	-> 203
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	45	0	$this$sendAndGet	Lai/grazie/client/common/SuspendableHTTPClient;
/*    */     //   97	45	1	url	Ljava/lang/String;
/*    */     //   97	12	2	content	Ljava/lang/Object;
/*    */     //   97	12	3	input	Lkotlinx/serialization/KSerializer;
/*    */     //   97	54	4	output	Lkotlinx/serialization/KSerializer;
/*    */     //   171	32	4	output	Lkotlinx/serialization/KSerializer;
/*    */     //   97	45	5	options	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   97	54	6	json	Lai/grazie/utils/json/JSON;
/*    */     //   161	42	6	json	Lai/grazie/utils/json/JSON;
/*    */     //   109	33	8	serialized	Ljava/lang/String;
/*    */     //   183	20	9	response	Lai/grazie/client/common/model/HTTPResponse;
/*    */     //   52	151	11	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   59	144	10	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public static final <O> Object sendAndGet(@NotNull SuspendableHTTPClient $this$sendAndGet, @NotNull String api, @NotNull KSerializer output, @NotNull RequestOptions options, @NotNull JSON json, @NotNull Continuation<? super O> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload #5
/*    */     //   2: instanceof ai/grazie/client/common/extensions/SuspendableClientExtensionsKt$sendAndGet$3
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #5
/*    */     //   10: checkcast ai/grazie/client/common/extensions/SuspendableClientExtensionsKt$sendAndGet$3
/*    */     //   13: astore #8
/*    */     //   15: aload #8
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #8
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 52
/*    */     //   41: new ai/grazie/client/common/extensions/SuspendableClientExtensionsKt$sendAndGet$3
/*    */     //   44: dup
/*    */     //   45: aload #5
/*    */     //   47: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*    */     //   50: astore #8
/*    */     //   52: aload #8
/*    */     //   54: getfield result : Ljava/lang/Object;
/*    */     //   57: astore #7
/*    */     //   59: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   62: astore #9
/*    */     //   64: aload #8
/*    */     //   66: getfield label : I
/*    */     //   69: tableswitch default -> 185, 0 -> 92, 1 -> 135
/*    */     //   92: aload #7
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: aload_0
/*    */     //   98: aload_1
/*    */     //   99: aload_3
/*    */     //   100: aload #8
/*    */     //   102: aload #8
/*    */     //   104: aload_2
/*    */     //   105: putfield L$0 : Ljava/lang/Object;
/*    */     //   108: aload #8
/*    */     //   110: aload #4
/*    */     //   112: putfield L$1 : Ljava/lang/Object;
/*    */     //   115: aload #8
/*    */     //   117: iconst_1
/*    */     //   118: putfield label : I
/*    */     //   121: invokeinterface send : (Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   126: dup
/*    */     //   127: aload #9
/*    */     //   129: if_acmpne -> 161
/*    */     //   132: aload #9
/*    */     //   134: areturn
/*    */     //   135: aload #8
/*    */     //   137: getfield L$1 : Ljava/lang/Object;
/*    */     //   140: checkcast ai/grazie/utils/json/JSON
/*    */     //   143: astore #4
/*    */     //   145: aload #8
/*    */     //   147: getfield L$0 : Ljava/lang/Object;
/*    */     //   150: checkcast kotlinx/serialization/KSerializer
/*    */     //   153: astore_2
/*    */     //   154: aload #7
/*    */     //   156: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   159: aload #7
/*    */     //   161: checkcast ai/grazie/client/common/model/HTTPResponse
/*    */     //   164: astore #6
/*    */     //   166: aload #4
/*    */     //   168: aload_2
/*    */     //   169: checkcast kotlinx/serialization/DeserializationStrategy
/*    */     //   172: aload #6
/*    */     //   174: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   177: dup
/*    */     //   178: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   181: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   184: areturn
/*    */     //   185: new java/lang/IllegalStateException
/*    */     //   188: dup
/*    */     //   189: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   191: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   194: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #34	-> 62
/*    */     //   #40	-> 97
/*    */     //   #34	-> 132
/*    */     //   #41	-> 166
/*    */     //   #34	-> 185
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	29	0	$this$sendAndGet	Lai/grazie/client/common/SuspendableHTTPClient;
/*    */     //   97	29	1	api	Ljava/lang/String;
/*    */     //   97	38	2	output	Lkotlinx/serialization/KSerializer;
/*    */     //   154	31	2	output	Lkotlinx/serialization/KSerializer;
/*    */     //   97	29	3	options	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   97	38	4	json	Lai/grazie/utils/json/JSON;
/*    */     //   145	40	4	json	Lai/grazie/utils/json/JSON;
/*    */     //   166	19	6	response	Lai/grazie/client/common/model/HTTPResponse;
/*    */     //   52	133	8	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   59	126	7	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public static final Object sendAndWait(@NotNull SuspendableHTTPClient $this$sendAndWait, @NotNull String url, @NotNull RequestOptions options, @NotNull Continuation $completion) {
/* 45 */     if ($this$sendAndWait.send(url, options, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return $this$sendAndWait.send(url, options, $completion);  $this$sendAndWait.send(url, options, $completion); return Unit.INSTANCE;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public static final <I> Object sendAndWait(@NotNull SuspendableHTTPClient $this$sendAndWait, @NotNull String url, @NotNull Object content, @NotNull KSerializer input, @NotNull RequestOptions options, @NotNull JSON json, @NotNull Continuation $completion) {
/* 55 */     String serialized = json.string((SerializationStrategy)input, content);
/* 56 */     if ($this$sendAndWait.send(url, serialized, options, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return $this$sendAndWait.send(url, serialized, options, $completion);  $this$sendAndWait.send(url, serialized, options, $completion); return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "SuspendableClientExtensions.kt", l = {21}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"output", "json"}, m = "sendAndGet", c = "ai.grazie.client.common.extensions.SuspendableClientExtensionsKt")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class SuspendableClientExtensionsKt$sendAndGet$1<I, O> extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     SuspendableClientExtensionsKt$sendAndGet$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return SuspendableClientExtensionsKt.sendAndGet(null, null, null, null, null, null, null, (Continuation)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "SuspendableClientExtensions.kt", l = {40}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"output", "json"}, m = "sendAndGet", c = "ai.grazie.client.common.extensions.SuspendableClientExtensionsKt")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class SuspendableClientExtensionsKt$sendAndGet$3<O> extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     SuspendableClientExtensionsKt$sendAndGet$3(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return SuspendableClientExtensionsKt.sendAndGet((SuspendableHTTPClient)null, (String)null, (KSerializer<?>)null, (RequestOptions)null, (JSON)null, (Continuation)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/client/common/extensions/SuspendableClientExtensionsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */