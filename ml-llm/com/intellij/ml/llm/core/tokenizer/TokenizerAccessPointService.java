/*    */ package com.intellij.ml.llm.core.tokenizer;
/*    */ import com.intellij.openapi.components.ComponentManager;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Service
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\007\030\000 \n2\0020\001:\001\nB\005¢\006\002\020\002J\021\020\007\032\0020\006H@ø\001\000¢\006\002\020\bJ\021\020\t\032\0020\006H@ø\001\000¢\006\002\020\bR\016\020\003\032\0020\004X\004¢\006\002\n\000R\020\020\005\032\004\030\0010\006X\016¢\006\002\n\000\002\004\n\002\b\031¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/core/tokenizer/TokenizerAccessPointService;", "", "()V", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "tokenizer", "Lcom/intellij/ml/llm/core/tokenizer/Tokenizer;", "getTokenizer", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initTokenizer", "Companion", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nTokenizerAccessPointService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TokenizerAccessPointService.kt\ncom/intellij/ml/llm/core/tokenizer/TokenizerAccessPointService\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,32:1\n120#2,10:33\n*S KotlinDebug\n*F\n+ 1 TokenizerAccessPointService.kt\ncom/intellij/ml/llm/core/tokenizer/TokenizerAccessPointService\n*L\n18#1:33,10\n*E\n"})
/*    */ public final class TokenizerAccessPointService {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/* 15 */   private final Mutex mutex = MutexKt.Mutex$default(false, 1, null); @Nullable
/*    */   private Tokenizer tokenizer;
/*    */   @Nullable
/*    */   public final Object getTokenizer(@NotNull Continuation<? super Tokenizer> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: instanceof com/intellij/ml/llm/core/tokenizer/TokenizerAccessPointService$getTokenizer$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_1
/*    */     //   8: checkcast com/intellij/ml/llm/core/tokenizer/TokenizerAccessPointService$getTokenizer$1
/*    */     //   11: astore #11
/*    */     //   13: aload #11
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #11
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/core/tokenizer/TokenizerAccessPointService$getTokenizer$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_1
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/core/tokenizer/TokenizerAccessPointService;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #11
/*    */     //   50: aload #11
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #10
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #12
/*    */     //   62: aload #11
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 317, 0 -> 92, 1 -> 153, 2 -> 230
/*    */     //   92: aload #10
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: aload_0
/*    */     //   98: getfield tokenizer : Lcom/intellij/ml/llm/core/tokenizer/Tokenizer;
/*    */     //   101: dup
/*    */     //   102: ifnonnull -> 316
/*    */     //   105: pop
/*    */     //   106: aload_0
/*    */     //   107: getfield mutex : Lkotlinx/coroutines/sync/Mutex;
/*    */     //   110: astore_2
/*    */     //   111: aconst_null
/*    */     //   112: astore_3
/*    */     //   113: iconst_0
/*    */     //   114: istore #4
/*    */     //   116: nop
/*    */     //   117: aload_2
/*    */     //   118: aload_3
/*    */     //   119: aload #11
/*    */     //   121: aload #11
/*    */     //   123: aload_0
/*    */     //   124: putfield L$0 : Ljava/lang/Object;
/*    */     //   127: aload #11
/*    */     //   129: aload_2
/*    */     //   130: putfield L$1 : Ljava/lang/Object;
/*    */     //   133: aload #11
/*    */     //   135: iconst_1
/*    */     //   136: putfield label : I
/*    */     //   139: invokeinterface lock : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   144: dup
/*    */     //   145: aload #12
/*    */     //   147: if_acmpne -> 183
/*    */     //   150: aload #12
/*    */     //   152: areturn
/*    */     //   153: iconst_0
/*    */     //   154: istore #4
/*    */     //   156: aconst_null
/*    */     //   157: astore_3
/*    */     //   158: aload #11
/*    */     //   160: getfield L$1 : Ljava/lang/Object;
/*    */     //   163: checkcast kotlinx/coroutines/sync/Mutex
/*    */     //   166: astore_2
/*    */     //   167: aload #11
/*    */     //   169: getfield L$0 : Ljava/lang/Object;
/*    */     //   172: checkcast com/intellij/ml/llm/core/tokenizer/TokenizerAccessPointService
/*    */     //   175: astore_0
/*    */     //   176: aload #10
/*    */     //   178: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   181: aload #10
/*    */     //   183: pop
/*    */     //   184: nop
/*    */     //   185: iconst_0
/*    */     //   186: istore #5
/*    */     //   188: aload_0
/*    */     //   189: getfield tokenizer : Lcom/intellij/ml/llm/core/tokenizer/Tokenizer;
/*    */     //   192: dup
/*    */     //   193: ifnonnull -> 288
/*    */     //   196: pop
/*    */     //   197: aload_0
/*    */     //   198: aload #11
/*    */     //   200: aload #11
/*    */     //   202: aload_0
/*    */     //   203: putfield L$0 : Ljava/lang/Object;
/*    */     //   206: aload #11
/*    */     //   208: aload_2
/*    */     //   209: putfield L$1 : Ljava/lang/Object;
/*    */     //   212: aload #11
/*    */     //   214: iconst_2
/*    */     //   215: putfield label : I
/*    */     //   218: invokespecial initTokenizer : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   221: dup
/*    */     //   222: aload #12
/*    */     //   224: if_acmpne -> 264
/*    */     //   227: aload #12
/*    */     //   229: areturn
/*    */     //   230: iconst_0
/*    */     //   231: istore #4
/*    */     //   233: iconst_0
/*    */     //   234: istore #5
/*    */     //   236: aconst_null
/*    */     //   237: astore_3
/*    */     //   238: aload #11
/*    */     //   240: getfield L$1 : Ljava/lang/Object;
/*    */     //   243: checkcast kotlinx/coroutines/sync/Mutex
/*    */     //   246: astore_2
/*    */     //   247: aload #11
/*    */     //   249: getfield L$0 : Ljava/lang/Object;
/*    */     //   252: checkcast com/intellij/ml/llm/core/tokenizer/TokenizerAccessPointService
/*    */     //   255: astore_0
/*    */     //   256: nop
/*    */     //   257: aload #10
/*    */     //   259: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   262: aload #10
/*    */     //   264: astore #6
/*    */     //   266: aload #6
/*    */     //   268: checkcast com/intellij/ml/llm/core/tokenizer/Tokenizer
/*    */     //   271: astore #7
/*    */     //   273: iconst_0
/*    */     //   274: istore #8
/*    */     //   276: aload_0
/*    */     //   277: aload #7
/*    */     //   279: putfield tokenizer : Lcom/intellij/ml/llm/core/tokenizer/Tokenizer;
/*    */     //   282: nop
/*    */     //   283: aload #6
/*    */     //   285: checkcast com/intellij/ml/llm/core/tokenizer/Tokenizer
/*    */     //   288: nop
/*    */     //   289: astore #9
/*    */     //   291: aload_2
/*    */     //   292: aload_3
/*    */     //   293: invokeinterface unlock : (Ljava/lang/Object;)V
/*    */     //   298: aload #9
/*    */     //   300: goto -> 315
/*    */     //   303: astore #9
/*    */     //   305: aload_2
/*    */     //   306: aload_3
/*    */     //   307: invokeinterface unlock : (Ljava/lang/Object;)V
/*    */     //   312: aload #9
/*    */     //   314: athrow
/*    */     //   315: areturn
/*    */     //   316: areturn
/*    */     //   317: new java/lang/IllegalStateException
/*    */     //   320: dup
/*    */     //   321: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   323: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   326: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #17	-> 60
/*    */     //   #18	-> 97
/*    */     //   #33	-> 111
/*    */     //   #34	-> 116
/*    */     //   #38	-> 117
/*    */     //   #17	-> 150
/*    */     //   #39	-> 183
/*    */     //   #40	-> 185
/*    */     //   #19	-> 188
/*    */     //   #17	-> 227
/*    */     //   #20	-> 276
/*    */     //   #21	-> 282
/*    */     //   #19	-> 283
/*    */     //   #19	-> 288
/*    */     //   #40	-> 289
/*    */     //   #42	-> 291
/*    */     //   #40	-> 300
/*    */     //   #42	-> 303
/*    */     //   #23	-> 315
/*    */     //   #18	-> 316
/*    */     //   #17	-> 317
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	56	0	this	Lcom/intellij/ml/llm/core/tokenizer/TokenizerAccessPointService;
/*    */     //   176	54	0	this	Lcom/intellij/ml/llm/core/tokenizer/TokenizerAccessPointService;
/*    */     //   256	26	0	this	Lcom/intellij/ml/llm/core/tokenizer/TokenizerAccessPointService;
/*    */     //   111	42	2	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*    */     //   167	63	2	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*    */     //   247	42	2	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*    */     //   289	11	2	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*    */     //   303	12	2	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*    */     //   113	40	3	owner$iv	Ljava/lang/Object;
/*    */     //   167	63	3	owner$iv	Ljava/lang/Object;
/*    */     //   247	42	3	owner$iv	Ljava/lang/Object;
/*    */     //   289	11	3	owner$iv	Ljava/lang/Object;
/*    */     //   303	12	3	owner$iv	Ljava/lang/Object;
/*    */     //   273	10	7	it	Lcom/intellij/ml/llm/core/tokenizer/Tokenizer;
/*    */     //   276	7	8	$i$a$-also-TokenizerAccessPointService$getTokenizer$2$1	I
/*    */     //   188	42	5	$i$a$-withLock$default-TokenizerAccessPointService$getTokenizer$2	I
/*    */     //   116	37	4	$i$f$withLock	I
/*    */     //   50	267	11	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	260	10	$result	Ljava/lang/Object;
/*    */     //   156	74	4	$i$f$withLock	I
/*    */     //   236	53	5	$i$a$-withLock$default-TokenizerAccessPointService$getTokenizer$2	I
/*    */     //   233	82	4	$i$f$withLock	I
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   184	221	303	finally
/*    */     //   256	291	303	finally
/*    */     //   303	305	303	finally
/*    */   }
/*    */   private final Object initTokenizer(Continuation<? super Tokenizer> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: instanceof com/intellij/ml/llm/core/tokenizer/TokenizerAccessPointService$initTokenizer$1
/*    */     //   4: ifeq -> 36
/*    */     //   7: aload_1
/*    */     //   8: checkcast com/intellij/ml/llm/core/tokenizer/TokenizerAccessPointService$initTokenizer$1
/*    */     //   11: astore_3
/*    */     //   12: aload_3
/*    */     //   13: getfield label : I
/*    */     //   16: ldc -2147483648
/*    */     //   18: iand
/*    */     //   19: ifeq -> 36
/*    */     //   22: aload_3
/*    */     //   23: dup
/*    */     //   24: getfield label : I
/*    */     //   27: ldc -2147483648
/*    */     //   29: isub
/*    */     //   30: putfield label : I
/*    */     //   33: goto -> 46
/*    */     //   36: new com/intellij/ml/llm/core/tokenizer/TokenizerAccessPointService$initTokenizer$1
/*    */     //   39: dup
/*    */     //   40: aload_0
/*    */     //   41: aload_1
/*    */     //   42: invokespecial <init> : (Lcom/intellij/ml/llm/core/tokenizer/TokenizerAccessPointService;Lkotlin/coroutines/Continuation;)V
/*    */     //   45: astore_3
/*    */     //   46: aload_3
/*    */     //   47: getfield result : Ljava/lang/Object;
/*    */     //   50: astore_2
/*    */     //   51: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   54: astore #5
/*    */     //   56: aload_3
/*    */     //   57: getfield label : I
/*    */     //   60: tableswitch default -> 135, 0 -> 84, 1 -> 115
/*    */     //   84: aload_2
/*    */     //   85: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   88: getstatic ai/grazie/nlp/encoder/tiktoken/cl100k/TiktokenCL100KBaseEncoder.Companion : Lai/grazie/nlp/encoder/tiktoken/cl100k/TiktokenCL100KBaseEncoder$Companion;
/*    */     //   91: getstatic com/intellij/ml/llm/core/grazieAPI/CL100KLoader.INSTANCE : Lcom/intellij/ml/llm/core/grazieAPI/CL100KLoader;
/*    */     //   94: checkcast ai/grazie/utils/mpp/RootDataLoader
/*    */     //   97: aload_3
/*    */     //   98: aload_3
/*    */     //   99: iconst_1
/*    */     //   100: putfield label : I
/*    */     //   103: invokevirtual load : (Lai/grazie/utils/mpp/RootDataLoader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   106: dup
/*    */     //   107: aload #5
/*    */     //   109: if_acmpne -> 120
/*    */     //   112: aload #5
/*    */     //   114: areturn
/*    */     //   115: aload_2
/*    */     //   116: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   119: aload_2
/*    */     //   120: checkcast ai/grazie/nlp/encoder/TiktokenEncoder
/*    */     //   123: astore #4
/*    */     //   125: new com/intellij/ml/llm/core/tokenizer/Tokenizer
/*    */     //   128: dup
/*    */     //   129: aload #4
/*    */     //   131: invokespecial <init> : (Lai/grazie/nlp/encoder/TiktokenEncoder;)V
/*    */     //   134: areturn
/*    */     //   135: new java/lang/IllegalStateException
/*    */     //   138: dup
/*    */     //   139: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   141: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   144: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #25	-> 54
/*    */     //   #26	-> 88
/*    */     //   #25	-> 112
/*    */     //   #26	-> 120
/*    */     //   #25	-> 135
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   46	89	3	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   51	84	2	$result	Ljava/lang/Object;
/*    */   }
/*    */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/core/tokenizer/TokenizerAccessPointService$Companion;", "", "()V", "getInstance", "Lcom/intellij/ml/llm/core/tokenizer/TokenizerAccessPointService;", "project", "Lcom/intellij/openapi/project/Project;", "intellij.ml.llm"})
/*    */   @SourceDebugExtension({"SMAP\nTokenizerAccessPointService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TokenizerAccessPointService.kt\ncom/intellij/ml/llm/core/tokenizer/TokenizerAccessPointService$Companion\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,32:1\n29#2,3:33\n*S KotlinDebug\n*F\n+ 1 TokenizerAccessPointService.kt\ncom/intellij/ml/llm/core/tokenizer/TokenizerAccessPointService$Companion\n*L\n30#1:33,3\n*E\n"})
/*    */   public static final class Companion { private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final TokenizerAccessPointService getInstance(@NotNull Project project) {
/* 30 */       Intrinsics.checkNotNullParameter(project, "project"); ComponentManager $this$service$iv = (ComponentManager)project; int $i$f$service = 0;
/*    */ 
/*    */       
/* 33 */       Class<TokenizerAccessPointService> serviceClass$iv = TokenizerAccessPointService.class;
/* 34 */       Object object = $this$service$iv.getService(serviceClass$iv); if (object == null) throw new IllegalStateException((
/* 35 */             "Cannot find service " + serviceClass$iv.getName() + " in " + $this$service$iv + " (classloader=" + serviceClass$iv.getClassLoader()).toString()); 
/*    */       return (TokenizerAccessPointService)object;
/*    */     } }
/*    */ 
/*    */   
/*    */   @DebugMetadata(f = "TokenizerAccessPointService.kt", l = {38, 19}, i = {0, 0, 1, 1}, s = {"L$0", "L$1", "L$0", "L$1"}, n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, m = "getTokenizer", c = "com.intellij.ml.llm.core.tokenizer.TokenizerAccessPointService")
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
/*    */   static final class TokenizerAccessPointService$getTokenizer$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     TokenizerAccessPointService$getTokenizer$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return TokenizerAccessPointService.this.getTokenizer((Continuation<? super Tokenizer>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "TokenizerAccessPointService.kt", l = {26}, i = {}, s = {}, n = {}, m = "initTokenizer", c = "com.intellij.ml.llm.core.tokenizer.TokenizerAccessPointService")
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
/*    */   static final class TokenizerAccessPointService$initTokenizer$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     TokenizerAccessPointService$initTokenizer$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return TokenizerAccessPointService.this.initTokenizer((Continuation)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/tokenizer/TokenizerAccessPointService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */