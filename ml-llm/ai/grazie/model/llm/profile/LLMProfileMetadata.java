/*    */ package ai.grazie.model.llm.profile;
/*    */ import ai.grazie.model.llm.tokens.LLMTokenCounter;
/*    */ import ai.grazie.utils.mpp.FromResourceProvider;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlinx.coroutines.sync.Mutex;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\030\0002\0020\001B\025\022\016\020\002\032\n\022\006\b\001\022\0020\0040\003¢\006\002\020\005J\031\020\t\032\0020\0042\006\020\n\032\0020\013H@ø\001\000¢\006\002\020\fR\016\020\006\032\0020\004X.¢\006\002\n\000R\016\020\007\032\0020\bX\004¢\006\002\n\000R\026\020\002\032\n\022\006\b\001\022\0020\0040\003X\004¢\006\002\n\000\002\004\n\002\b\031¨\006\r"}, d2 = {"Lai/grazie/model/llm/profile/LLMProfileMetadata;", "", "tokenCounterProvider", "Lai/grazie/utils/mpp/FromResourceProvider;", "Lai/grazie/model/llm/tokens/LLMTokenCounter;", "(Lai/grazie/utils/mpp/FromResourceProvider;)V", "counter", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "tokenCounter", "loader", "Lai/grazie/utils/mpp/RootDataLoader;", "(Lai/grazie/utils/mpp/RootDataLoader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "model-llm"})
/*    */ @SourceDebugExtension({"SMAP\nLLMProfileMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMProfileMetadata.kt\nai/grazie/model/llm/profile/LLMProfileMetadata\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n107#2,8:27\n116#2:36\n115#2:37\n1#3:35\n*S KotlinDebug\n*F\n+ 1 LLMProfileMetadata.kt\nai/grazie/model/llm/profile/LLMProfileMetadata\n*L\n23#1:27,8\n23#1:36\n23#1:37\n*E\n"})
/*    */ public final class LLMProfileMetadata {
/*    */   public LLMProfileMetadata(@NotNull FromResourceProvider<? extends LLMTokenCounter> tokenCounterProvider) {
/* 14 */     this.tokenCounterProvider = tokenCounterProvider;
/*    */     
/* 16 */     this.mutex = MutexKt.Mutex(false);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private final FromResourceProvider<? extends LLMTokenCounter> tokenCounterProvider;
/*    */   private LLMTokenCounter counter;
/*    */   @NotNull
/*    */   private final Mutex mutex;
/*    */   
/*    */   @Nullable
/*    */   public final Object tokenCounter(@NotNull RootDataLoader loader, @NotNull Continuation<? super LLMTokenCounter> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof ai/grazie/model/llm/profile/LLMProfileMetadata$tokenCounter$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast ai/grazie/model/llm/profile/LLMProfileMetadata$tokenCounter$1
/*    */     //   11: astore #12
/*    */     //   13: aload #12
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #12
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/model/llm/profile/LLMProfileMetadata$tokenCounter$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lai/grazie/model/llm/profile/LLMProfileMetadata;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #12
/*    */     //   50: aload #12
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #11
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #13
/*    */     //   62: aload #12
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 355, 0 -> 92, 1 -> 152, 2 -> 267
/*    */     //   92: aload #11
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: aload_0
/*    */     //   98: getfield mutex : Lkotlinx/coroutines/sync/Mutex;
/*    */     //   101: astore_3
/*    */     //   102: aconst_null
/*    */     //   103: astore #4
/*    */     //   105: iconst_0
/*    */     //   106: istore #5
/*    */     //   108: nop
/*    */     //   109: aload_3
/*    */     //   110: aload #4
/*    */     //   112: aload #12
/*    */     //   114: aload #12
/*    */     //   116: aload_0
/*    */     //   117: putfield L$0 : Ljava/lang/Object;
/*    */     //   120: aload #12
/*    */     //   122: aload_1
/*    */     //   123: putfield L$1 : Ljava/lang/Object;
/*    */     //   126: aload #12
/*    */     //   128: aload_3
/*    */     //   129: putfield L$2 : Ljava/lang/Object;
/*    */     //   132: aload #12
/*    */     //   134: iconst_1
/*    */     //   135: putfield label : I
/*    */     //   138: invokeinterface lock : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   143: dup
/*    */     //   144: aload #13
/*    */     //   146: if_acmpne -> 192
/*    */     //   149: aload #13
/*    */     //   151: areturn
/*    */     //   152: iconst_0
/*    */     //   153: istore #5
/*    */     //   155: aconst_null
/*    */     //   156: astore #4
/*    */     //   158: aload #12
/*    */     //   160: getfield L$2 : Ljava/lang/Object;
/*    */     //   163: checkcast kotlinx/coroutines/sync/Mutex
/*    */     //   166: astore_3
/*    */     //   167: aload #12
/*    */     //   169: getfield L$1 : Ljava/lang/Object;
/*    */     //   172: checkcast ai/grazie/utils/mpp/RootDataLoader
/*    */     //   175: astore_1
/*    */     //   176: aload #12
/*    */     //   178: getfield L$0 : Ljava/lang/Object;
/*    */     //   181: checkcast ai/grazie/model/llm/profile/LLMProfileMetadata
/*    */     //   184: astore_0
/*    */     //   185: aload #11
/*    */     //   187: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   190: aload #11
/*    */     //   192: pop
/*    */     //   193: nop
/*    */     //   194: iconst_0
/*    */     //   195: istore #6
/*    */     //   197: aload_0
/*    */     //   198: getfield counter : Lai/grazie/model/llm/tokens/LLMTokenCounter;
/*    */     //   201: ifnull -> 222
/*    */     //   204: aload_0
/*    */     //   205: getfield counter : Lai/grazie/model/llm/tokens/LLMTokenCounter;
/*    */     //   208: dup
/*    */     //   209: ifnonnull -> 325
/*    */     //   212: pop
/*    */     //   213: ldc 'counter'
/*    */     //   215: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
/*    */     //   218: aconst_null
/*    */     //   219: goto -> 325
/*    */     //   222: aload_0
/*    */     //   223: getfield tokenCounterProvider : Lai/grazie/utils/mpp/FromResourceProvider;
/*    */     //   226: aload_1
/*    */     //   227: aload #12
/*    */     //   229: aload #12
/*    */     //   231: aload_0
/*    */     //   232: putfield L$0 : Ljava/lang/Object;
/*    */     //   235: aload #12
/*    */     //   237: aload_3
/*    */     //   238: putfield L$1 : Ljava/lang/Object;
/*    */     //   241: aload #12
/*    */     //   243: aconst_null
/*    */     //   244: putfield L$2 : Ljava/lang/Object;
/*    */     //   247: aload #12
/*    */     //   249: iconst_2
/*    */     //   250: putfield label : I
/*    */     //   253: invokeinterface load : (Lai/grazie/utils/mpp/RootDataLoader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   258: dup
/*    */     //   259: aload #13
/*    */     //   261: if_acmpne -> 302
/*    */     //   264: aload #13
/*    */     //   266: areturn
/*    */     //   267: iconst_0
/*    */     //   268: istore #5
/*    */     //   270: iconst_0
/*    */     //   271: istore #6
/*    */     //   273: aconst_null
/*    */     //   274: astore #4
/*    */     //   276: aload #12
/*    */     //   278: getfield L$1 : Ljava/lang/Object;
/*    */     //   281: checkcast kotlinx/coroutines/sync/Mutex
/*    */     //   284: astore_3
/*    */     //   285: aload #12
/*    */     //   287: getfield L$0 : Ljava/lang/Object;
/*    */     //   290: checkcast ai/grazie/model/llm/profile/LLMProfileMetadata
/*    */     //   293: astore_0
/*    */     //   294: nop
/*    */     //   295: aload #11
/*    */     //   297: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   300: aload #11
/*    */     //   302: astore #7
/*    */     //   304: aload #7
/*    */     //   306: checkcast ai/grazie/model/llm/tokens/LLMTokenCounter
/*    */     //   309: astore #8
/*    */     //   311: iconst_0
/*    */     //   312: istore #9
/*    */     //   314: aload_0
/*    */     //   315: aload #8
/*    */     //   317: putfield counter : Lai/grazie/model/llm/tokens/LLMTokenCounter;
/*    */     //   320: aload #7
/*    */     //   322: checkcast ai/grazie/model/llm/tokens/LLMTokenCounter
/*    */     //   325: nop
/*    */     //   326: astore #10
/*    */     //   328: aload_3
/*    */     //   329: aload #4
/*    */     //   331: invokeinterface unlock : (Ljava/lang/Object;)V
/*    */     //   336: aload #10
/*    */     //   338: goto -> 354
/*    */     //   341: astore #10
/*    */     //   343: aload_3
/*    */     //   344: aload #4
/*    */     //   346: invokeinterface unlock : (Ljava/lang/Object;)V
/*    */     //   351: aload #10
/*    */     //   353: athrow
/*    */     //   354: areturn
/*    */     //   355: new java/lang/IllegalStateException
/*    */     //   358: dup
/*    */     //   359: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   361: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   364: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #22	-> 60
/*    */     //   #23	-> 97
/*    */     //   #27	-> 102
/*    */     //   #28	-> 108
/*    */     //   #32	-> 109
/*    */     //   #22	-> 149
/*    */     //   #33	-> 192
/*    */     //   #34	-> 194
/*    */     //   #23	-> 197
/*    */     //   #22	-> 264
/*    */     //   #35	-> 311
/*    */     //   #23	-> 314
/*    */     //   #23	-> 320
/*    */     //   #23	-> 325
/*    */     //   #34	-> 326
/*    */     //   #36	-> 328
/*    */     //   #34	-> 338
/*    */     //   #37	-> 341
/*    */     //   #36	-> 343
/*    */     //   #23	-> 354
/*    */     //   #22	-> 355
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	55	0	this	Lai/grazie/model/llm/profile/LLMProfileMetadata;
/*    */     //   185	23	0	this	Lai/grazie/model/llm/profile/LLMProfileMetadata;
/*    */     //   222	45	0	this	Lai/grazie/model/llm/profile/LLMProfileMetadata;
/*    */     //   294	26	0	this	Lai/grazie/model/llm/profile/LLMProfileMetadata;
/*    */     //   97	55	1	loader	Lai/grazie/utils/mpp/RootDataLoader;
/*    */     //   176	32	1	loader	Lai/grazie/utils/mpp/RootDataLoader;
/*    */     //   222	36	1	loader	Lai/grazie/utils/mpp/RootDataLoader;
/*    */     //   102	50	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*    */     //   167	100	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*    */     //   285	41	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*    */     //   326	12	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*    */     //   341	13	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*    */     //   105	47	4	owner$iv	Ljava/lang/Object;
/*    */     //   167	100	4	owner$iv	Ljava/lang/Object;
/*    */     //   285	41	4	owner$iv	Ljava/lang/Object;
/*    */     //   326	12	4	owner$iv	Ljava/lang/Object;
/*    */     //   341	13	4	owner$iv	Ljava/lang/Object;
/*    */     //   311	9	8	it	Lai/grazie/model/llm/tokens/LLMTokenCounter;
/*    */     //   314	6	9	$i$a$-also-LLMProfileMetadata$tokenCounter$2$2	I
/*    */     //   197	70	6	$i$a$-withLock$default-LLMProfileMetadata$tokenCounter$2	I
/*    */     //   108	44	5	$i$f$withLock	I
/*    */     //   50	305	12	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	298	11	$result	Ljava/lang/Object;
/*    */     //   155	112	5	$i$f$withLock	I
/*    */     //   273	53	6	$i$a$-withLock$default-LLMProfileMetadata$tokenCounter$2	I
/*    */     //   270	84	5	$i$f$withLock	I
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   193	258	341	finally
/*    */     //   294	328	341	finally
/*    */     //   341	343	341	finally
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "LLMProfileMetadata.kt", l = {32, 23}, i = {0, 0, 0, 1, 1}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"}, n = {"this", "loader", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, m = "tokenCounter", c = "ai.grazie.model.llm.profile.LLMProfileMetadata")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class LLMProfileMetadata$tokenCounter$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     int label;
/*    */     
/*    */     LLMProfileMetadata$tokenCounter$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return LLMProfileMetadata.this.tokenCounter(null, (Continuation<? super LLMTokenCounter>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/llm/profile/LLMProfileMetadata.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */