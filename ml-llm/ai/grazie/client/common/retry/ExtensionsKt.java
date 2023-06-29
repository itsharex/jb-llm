package ai.grazie.client.common.retry;

import ai.grazie.client.common.SuspendableHTTPClient;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\0008\n\002\b\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\003\n\002\020\013\n\000\n\002\030\002\n\002\030\002\n\002\020\000\n\002\030\002\n\002\b\002\032h\020\000\032\002H\001\"\004\b\000\020\001*\0020\0022\006\020\003\032\0020\0042\006\020\005\032\0020\0062\022\020\007\032\016\022\004\022\0020\t\022\004\022\0020\n0\b2'\020\013\032#\b\001\022\004\022\0020\002\022\n\022\b\022\004\022\002H\0010\r\022\006\022\004\030\0010\0160\f¢\006\002\b\017H@ø\001\000¢\006\002\020\020\002\004\n\002\b\031¨\006\021"}, d2 = {"withRetry", "T", "Lai/grazie/client/common/SuspendableHTTPClient;", "total", "", "strategy", "Lai/grazie/client/common/retry/ClientRetryStrategy;", "on", "Lkotlin/Function1;", "", "", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lai/grazie/client/common/SuspendableHTTPClient;ILai/grazie/client/common/retry/ClientRetryStrategy;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "client-common"})
public final class ExtensionsKt {
  @Nullable
  public static final <T> Object withRetry(@NotNull SuspendableHTTPClient $this$withRetry, int total, @NotNull ClientRetryStrategy strategy, @NotNull Function1 on, @NotNull Function2 block, @NotNull Continuation<? super T> paramContinuation) {
    // Byte code:
    //   0: aload #5
    //   2: instanceof ai/grazie/client/common/retry/ExtensionsKt$withRetry$1
    //   5: ifeq -> 41
    //   8: aload #5
    //   10: checkcast ai/grazie/client/common/retry/ExtensionsKt$withRetry$1
    //   13: astore #9
    //   15: aload #9
    //   17: getfield label : I
    //   20: ldc -2147483648
    //   22: iand
    //   23: ifeq -> 41
    //   26: aload #9
    //   28: dup
    //   29: getfield label : I
    //   32: ldc -2147483648
    //   34: isub
    //   35: putfield label : I
    //   38: goto -> 52
    //   41: new ai/grazie/client/common/retry/ExtensionsKt$withRetry$1
    //   44: dup
    //   45: aload #5
    //   47: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
    //   50: astore #9
    //   52: aload #9
    //   54: getfield result : Ljava/lang/Object;
    //   57: astore #8
    //   59: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   62: astore #10
    //   64: aload #9
    //   66: getfield label : I
    //   69: tableswitch default -> 282, 0 -> 92, 1 -> 170
    //   92: aload #8
    //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   97: iconst_0
    //   98: istore #6
    //   100: iload #6
    //   102: iload_1
    //   103: if_icmpge -> 272
    //   106: nop
    //   107: aload #4
    //   109: aload_0
    //   110: aload #9
    //   112: aload #9
    //   114: aload_0
    //   115: putfield L$0 : Ljava/lang/Object;
    //   118: aload #9
    //   120: aload_2
    //   121: putfield L$1 : Ljava/lang/Object;
    //   124: aload #9
    //   126: aload_3
    //   127: putfield L$2 : Ljava/lang/Object;
    //   130: aload #9
    //   132: aload #4
    //   134: putfield L$3 : Ljava/lang/Object;
    //   137: aload #9
    //   139: iload_1
    //   140: putfield I$0 : I
    //   143: aload #9
    //   145: iload #6
    //   147: putfield I$1 : I
    //   150: aload #9
    //   152: iconst_1
    //   153: putfield label : I
    //   156: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   161: dup
    //   162: aload #10
    //   164: if_acmpne -> 228
    //   167: aload #10
    //   169: areturn
    //   170: aload #9
    //   172: getfield I$1 : I
    //   175: istore #6
    //   177: aload #9
    //   179: getfield I$0 : I
    //   182: istore_1
    //   183: aload #9
    //   185: getfield L$3 : Ljava/lang/Object;
    //   188: checkcast kotlin/jvm/functions/Function2
    //   191: astore #4
    //   193: aload #9
    //   195: getfield L$2 : Ljava/lang/Object;
    //   198: checkcast kotlin/jvm/functions/Function1
    //   201: astore_3
    //   202: aload #9
    //   204: getfield L$1 : Ljava/lang/Object;
    //   207: checkcast ai/grazie/client/common/retry/ClientRetryStrategy
    //   210: astore_2
    //   211: aload #9
    //   213: getfield L$0 : Ljava/lang/Object;
    //   216: checkcast ai/grazie/client/common/SuspendableHTTPClient
    //   219: astore_0
    //   220: nop
    //   221: aload #8
    //   223: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   226: aload #8
    //   228: areturn
    //   229: astore #7
    //   231: iinc #6, 1
    //   234: aload_3
    //   235: aload #7
    //   237: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   242: checkcast java/lang/Boolean
    //   245: invokevirtual booleanValue : ()Z
    //   248: ifeq -> 269
    //   251: iload #6
    //   253: iload_1
    //   254: if_icmpge -> 269
    //   257: aload_2
    //   258: iload #6
    //   260: invokeinterface delay : (I)Lai/grazie/utils/mpp/time/Duration;
    //   265: pop
    //   266: goto -> 100
    //   269: aload #7
    //   271: athrow
    //   272: new java/lang/IllegalStateException
    //   275: dup
    //   276: ldc 'Should not be here'
    //   278: invokespecial <init> : (Ljava/lang/String;)V
    //   281: athrow
    //   282: new java/lang/IllegalStateException
    //   285: dup
    //   286: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   288: invokespecial <init> : (Ljava/lang/String;)V
    //   291: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #12	-> 62
    //   #18	-> 97
    //   #19	-> 100
    //   #20	-> 106
    //   #21	-> 107
    //   #12	-> 167
    //   #22	-> 228
    //   #23	-> 231
    //   #24	-> 234
    //   #25	-> 257
    //   #26	-> 266
    //   #28	-> 269
    //   #32	-> 272
    //   #12	-> 282
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   97	73	0	$this$withRetry	Lai/grazie/client/common/SuspendableHTTPClient;
    //   220	9	0	$this$withRetry	Lai/grazie/client/common/SuspendableHTTPClient;
    //   229	40	0	$this$withRetry	Lai/grazie/client/common/SuspendableHTTPClient;
    //   97	73	1	total	I
    //   183	46	1	total	I
    //   229	40	1	total	I
    //   97	73	2	strategy	Lai/grazie/client/common/retry/ClientRetryStrategy;
    //   211	18	2	strategy	Lai/grazie/client/common/retry/ClientRetryStrategy;
    //   229	40	2	strategy	Lai/grazie/client/common/retry/ClientRetryStrategy;
    //   97	73	3	on	Lkotlin/jvm/functions/Function1;
    //   202	27	3	on	Lkotlin/jvm/functions/Function1;
    //   229	40	3	on	Lkotlin/jvm/functions/Function1;
    //   97	73	4	block	Lkotlin/jvm/functions/Function2;
    //   193	36	4	block	Lkotlin/jvm/functions/Function2;
    //   229	40	4	block	Lkotlin/jvm/functions/Function2;
    //   100	70	6	retry	I
    //   177	52	6	retry	I
    //   229	40	6	retry	I
    //   231	26	7	e	Ljava/lang/Throwable;
    //   269	3	7	e	Ljava/lang/Throwable;
    //   52	230	9	$continuation	Lkotlin/coroutines/Continuation;
    //   59	223	8	$result	Ljava/lang/Object;
    // Exception table:
    //   from	to	target	type
    //   106	161	229	java/lang/Throwable
    //   220	229	229	java/lang/Throwable
  }
  
  @DebugMetadata(f = "Extensions.kt", l = {21}, i = {0, 0, 0, 0, 0, 0}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1"}, n = {"$this$withRetry", "strategy", "on", "block", "total", "retry"}, m = "withRetry", c = "ai.grazie.client.common.retry.ExtensionsKt")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class ExtensionsKt$withRetry$1<T> extends ContinuationImpl {
    Object L$0;
    
    Object L$1;
    
    Object L$2;
    
    Object L$3;
    
    int I$0;
    
    int I$1;
    
    int label;
    
    ExtensionsKt$withRetry$1(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return ExtensionsKt.withRetry(null, 0, null, null, null, (Continuation)this);
    }
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/client/common/retry/ExtensionsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */