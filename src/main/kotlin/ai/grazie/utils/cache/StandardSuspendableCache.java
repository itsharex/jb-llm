/*   */ package ai.grazie.utils.cache;
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\000\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\006\n\002\030\002\n\002\b\006\b\000\030\000*\b\b\000\020\001*\0020\002*\b\b\001\020\003*\0020\0022\016\022\004\022\002H\001\022\004\022\002H\0030\004B\037\022\030\020\005\032\024\022\004\022\0028\000\022\n\022\b\022\004\022\0028\0010\0070\006¢\006\002\020\bJ\021\020\021\032\0020\022H@ø\001\000¢\006\002\020\023J\033\020\024\032\004\030\0018\0012\006\020\025\032\0028\000H@ø\001\000¢\006\002\020\026J'\020\027\032\0028\0012\006\020\025\032\0028\0002\f\020\030\032\b\022\004\022\0028\0010\031H@ø\001\000¢\006\002\020\032J\031\020\033\032\0020\0222\006\020\025\032\0028\000H@ø\001\000¢\006\002\020\026J!\020\034\032\0020\0222\006\020\025\032\0028\0002\006\020\035\032\0028\001H@ø\001\000¢\006\002\020\036R#\020\005\032\024\022\004\022\0028\000\022\n\022\b\022\004\022\0028\0010\0070\006¢\006\b\n\000\032\004\b\t\020\nR6\020\013\032*\022\004\022\0028\000\022\n\022\b\022\004\022\0028\0010\r0\fj\024\022\004\022\0028\000\022\n\022\b\022\004\022\0028\0010\r`\016X\004¢\006\002\n\000R\016\020\017\032\0020\020X\004¢\006\002\n\000\002\004\n\002\b\031¨\006\037"}, d2 = {"Lai/grazie/utils/cache/StandardSuspendableCache;", "Key", "", "Value", "Lai/grazie/utils/cache/SuspendableCache;", "condition", "Lai/grazie/utils/cache/CacheCondition;", "Lai/grazie/utils/cache/CacheValue$WithTime;", "(Lai/grazie/utils/cache/CacheCondition;)V", "getCondition", "()Lai/grazie/utils/cache/CacheCondition;", "data", "Ljava/util/HashMap;", "Lai/grazie/utils/cache/CacheValue$WithTime$Default;", "Lkotlin/collections/HashMap;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "key", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrPut", "loader", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invalidate", "put", "value", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "utils-common"})
/*   */ @SourceDebugExtension({"SMAP\nStandardSuspendableCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandardSuspendableCache.kt\nai/grazie/utils/cache/StandardSuspendableCache\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,47:1\n107#2,10:48\n107#2,8:58\n116#2:68\n115#2:69\n107#2,10:70\n107#2,10:80\n107#2,10:90\n1855#3,2:66\n*S KotlinDebug\n*F\n+ 1 StandardSuspendableCache.kt\nai/grazie/utils/cache/StandardSuspendableCache\n*L\n11#1:48,10\n17#1:58,8\n17#1:68\n17#1:69\n26#1:70,10\n32#1:80,10\n42#1:90,10\n19#1:66,2\n*E\n"})
/*   */ public final class StandardSuspendableCache<Key, Value> implements SuspendableCache<Key, Value> {
/*   */   public StandardSuspendableCache(@NotNull CacheCondition<Key, CacheValue.WithTime<Value>> condition) {
/* 6 */     this.condition = condition;
/* 7 */     this.mutex = MutexKt.Mutex(false);
/* 8 */     this.data = new HashMap<>();
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   private final CacheCondition<Key, CacheValue.WithTime<Value>> condition;
/*   */   @NotNull
/*   */   private final Mutex mutex;
/*   */   @NotNull
/*   */   private final HashMap<Key, CacheValue.WithTime.Default<Value>> data;
/*   */   
/*   */   @NotNull
/*   */   public final CacheCondition<Key, CacheValue.WithTime<Value>> getCondition() {
/*   */     return this.condition;
/*   */   }
/*   */   
/*   */   @Nullable
/*   */   public Object get(@NotNull Object key, @NotNull Continuation<? super Value> paramContinuation) {
/*   */     // Byte code:
/*   */     //   0: aload_2
/*   */     //   1: instanceof ai/grazie/utils/cache/StandardSuspendableCache$get$1
/*   */     //   4: ifeq -> 39
/*   */     //   7: aload_2
/*   */     //   8: checkcast ai/grazie/utils/cache/StandardSuspendableCache$get$1
/*   */     //   11: astore #9
/*   */     //   13: aload #9
/*   */     //   15: getfield label : I
/*   */     //   18: ldc -2147483648
/*   */     //   20: iand
/*   */     //   21: ifeq -> 39
/*   */     //   24: aload #9
/*   */     //   26: dup
/*   */     //   27: getfield label : I
/*   */     //   30: ldc -2147483648
/*   */     //   32: isub
/*   */     //   33: putfield label : I
/*   */     //   36: goto -> 50
/*   */     //   39: new ai/grazie/utils/cache/StandardSuspendableCache$get$1
/*   */     //   42: dup
/*   */     //   43: aload_0
/*   */     //   44: aload_2
/*   */     //   45: invokespecial <init> : (Lai/grazie/utils/cache/StandardSuspendableCache;Lkotlin/coroutines/Continuation;)V
/*   */     //   48: astore #9
/*   */     //   50: aload #9
/*   */     //   52: getfield result : Ljava/lang/Object;
/*   */     //   55: astore #8
/*   */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*   */     //   60: astore #10
/*   */     //   62: aload #9
/*   */     //   64: getfield label : I
/*   */     //   67: tableswitch default -> 242, 0 -> 88, 1 -> 148
/*   */     //   88: aload #8
/*   */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*   */     //   93: aload_0
/*   */     //   94: getfield mutex : Lkotlinx/coroutines/sync/Mutex;
/*   */     //   97: astore_3
/*   */     //   98: aconst_null
/*   */     //   99: astore #4
/*   */     //   101: iconst_0
/*   */     //   102: istore #5
/*   */     //   104: nop
/*   */     //   105: aload_3
/*   */     //   106: aload #4
/*   */     //   108: aload #9
/*   */     //   110: aload #9
/*   */     //   112: aload_0
/*   */     //   113: putfield L$0 : Ljava/lang/Object;
/*   */     //   116: aload #9
/*   */     //   118: aload_1
/*   */     //   119: putfield L$1 : Ljava/lang/Object;
/*   */     //   122: aload #9
/*   */     //   124: aload_3
/*   */     //   125: putfield L$2 : Ljava/lang/Object;
/*   */     //   128: aload #9
/*   */     //   130: iconst_1
/*   */     //   131: putfield label : I
/*   */     //   134: invokeinterface lock : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*   */     //   139: dup
/*   */     //   140: aload #10
/*   */     //   142: if_acmpne -> 185
/*   */     //   145: aload #10
/*   */     //   147: areturn
/*   */     //   148: iconst_0
/*   */     //   149: istore #5
/*   */     //   151: aconst_null
/*   */     //   152: astore #4
/*   */     //   154: aload #9
/*   */     //   156: getfield L$2 : Ljava/lang/Object;
/*   */     //   159: checkcast kotlinx/coroutines/sync/Mutex
/*   */     //   162: astore_3
/*   */     //   163: aload #9
/*   */     //   165: getfield L$1 : Ljava/lang/Object;
/*   */     //   168: astore_1
/*   */     //   169: aload #9
/*   */     //   171: getfield L$0 : Ljava/lang/Object;
/*   */     //   174: checkcast ai/grazie/utils/cache/StandardSuspendableCache
/*   */     //   177: astore_0
/*   */     //   178: aload #8
/*   */     //   180: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*   */     //   183: aload #8
/*   */     //   185: pop
/*   */     //   186: nop
/*   */     //   187: iconst_0
/*   */     //   188: istore #6
/*   */     //   190: aload_0
/*   */     //   191: getfield data : Ljava/util/HashMap;
/*   */     //   194: aload_1
/*   */     //   195: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   198: checkcast ai/grazie/utils/cache/CacheValue$WithTime$Default
/*   */     //   201: dup
/*   */     //   202: ifnull -> 211
/*   */     //   205: invokevirtual getValue : ()Ljava/lang/Object;
/*   */     //   208: goto -> 213
/*   */     //   211: pop
/*   */     //   212: aconst_null
/*   */     //   213: astore #7
/*   */     //   215: aload_3
/*   */     //   216: aload #4
/*   */     //   218: invokeinterface unlock : (Ljava/lang/Object;)V
/*   */     //   223: aload #7
/*   */     //   225: goto -> 241
/*   */     //   228: astore #7
/*   */     //   230: aload_3
/*   */     //   231: aload #4
/*   */     //   233: invokeinterface unlock : (Ljava/lang/Object;)V
/*   */     //   238: aload #7
/*   */     //   240: athrow
/*   */     //   241: areturn
/*   */     //   242: new java/lang/IllegalStateException
/*   */     //   245: dup
/*   */     //   246: ldc 'call to 'resume' before 'invoke' with coroutine'
/*   */     //   248: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   251: athrow
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #10	-> 60
/*   */     //   #11	-> 93
/*   */     //   #48	-> 98
/*   */     //   #49	-> 104
/*   */     //   #53	-> 105
/*   */     //   #10	-> 145
/*   */     //   #54	-> 185
/*   */     //   #55	-> 187
/*   */     //   #12	-> 190
/*   */     //   #55	-> 213
/*   */     //   #57	-> 215
/*   */     //   #55	-> 225
/*   */     //   #56	-> 228
/*   */     //   #57	-> 230
/*   */     //   #11	-> 241
/*   */     //   #10	-> 242
/*   */     // Local variable table:
/*   */     //   start	length	slot	name	descriptor
/*   */     //   93	55	0	this	Lai/grazie/utils/cache/StandardSuspendableCache;
/*   */     //   178	33	0	this	Lai/grazie/utils/cache/StandardSuspendableCache;
/*   */     //   93	55	1	key	Ljava/lang/Object;
/*   */     //   169	42	1	key	Ljava/lang/Object;
/*   */     //   98	50	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*   */     //   163	50	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*   */     //   213	12	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*   */     //   228	13	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*   */     //   101	47	4	owner$iv	Ljava/lang/Object;
/*   */     //   163	50	4	owner$iv	Ljava/lang/Object;
/*   */     //   213	12	4	owner$iv	Ljava/lang/Object;
/*   */     //   228	13	4	owner$iv	Ljava/lang/Object;
/*   */     //   190	23	6	$i$a$-withLock$default-StandardSuspendableCache$get$2	I
/*   */     //   104	44	5	$i$f$withLock	I
/*   */     //   50	192	9	$continuation	Lkotlin/coroutines/Continuation;
/*   */     //   57	185	8	$result	Ljava/lang/Object;
/*   */     //   151	90	5	$i$f$withLock	I
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   186	215	228	finally
/*   */     //   228	230	228	finally
/*   */   }
/*   */   
/*   */   @Nullable
/*   */   public Object put(@NotNull Object key, @NotNull Object value, @NotNull Continuation<? super Unit> paramContinuation) {
/*   */     // Byte code:
/*   */     //   0: aload_3
/*   */     //   1: instanceof ai/grazie/utils/cache/StandardSuspendableCache$put$1
/*   */     //   4: ifeq -> 39
/*   */     //   7: aload_3
/*   */     //   8: checkcast ai/grazie/utils/cache/StandardSuspendableCache$put$1
/*   */     //   11: astore #17
/*   */     //   13: aload #17
/*   */     //   15: getfield label : I
/*   */     //   18: ldc -2147483648
/*   */     //   20: iand
/*   */     //   21: ifeq -> 39
/*   */     //   24: aload #17
/*   */     //   26: dup
/*   */     //   27: getfield label : I
/*   */     //   30: ldc -2147483648
/*   */     //   32: isub
/*   */     //   33: putfield label : I
/*   */     //   36: goto -> 50
/*   */     //   39: new ai/grazie/utils/cache/StandardSuspendableCache$put$1
/*   */     //   42: dup
/*   */     //   43: aload_0
/*   */     //   44: aload_3
/*   */     //   45: invokespecial <init> : (Lai/grazie/utils/cache/StandardSuspendableCache;Lkotlin/coroutines/Continuation;)V
/*   */     //   48: astore #17
/*   */     //   50: aload #17
/*   */     //   52: getfield result : Ljava/lang/Object;
/*   */     //   55: astore #16
/*   */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*   */     //   60: astore #18
/*   */     //   62: aload #17
/*   */     //   64: getfield label : I
/*   */     //   67: tableswitch default -> 347, 0 -> 88, 1 -> 157
/*   */     //   88: aload #16
/*   */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*   */     //   93: aload_0
/*   */     //   94: getfield mutex : Lkotlinx/coroutines/sync/Mutex;
/*   */     //   97: astore #4
/*   */     //   99: aconst_null
/*   */     //   100: astore #5
/*   */     //   102: iconst_0
/*   */     //   103: istore #6
/*   */     //   105: nop
/*   */     //   106: aload #4
/*   */     //   108: aload #5
/*   */     //   110: aload #17
/*   */     //   112: aload #17
/*   */     //   114: aload_0
/*   */     //   115: putfield L$0 : Ljava/lang/Object;
/*   */     //   118: aload #17
/*   */     //   120: aload_1
/*   */     //   121: putfield L$1 : Ljava/lang/Object;
/*   */     //   124: aload #17
/*   */     //   126: aload_2
/*   */     //   127: putfield L$2 : Ljava/lang/Object;
/*   */     //   130: aload #17
/*   */     //   132: aload #4
/*   */     //   134: putfield L$3 : Ljava/lang/Object;
/*   */     //   137: aload #17
/*   */     //   139: iconst_1
/*   */     //   140: putfield label : I
/*   */     //   143: invokeinterface lock : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*   */     //   148: dup
/*   */     //   149: aload #18
/*   */     //   151: if_acmpne -> 201
/*   */     //   154: aload #18
/*   */     //   156: areturn
/*   */     //   157: iconst_0
/*   */     //   158: istore #6
/*   */     //   160: aconst_null
/*   */     //   161: astore #5
/*   */     //   163: aload #17
/*   */     //   165: getfield L$3 : Ljava/lang/Object;
/*   */     //   168: checkcast kotlinx/coroutines/sync/Mutex
/*   */     //   171: astore #4
/*   */     //   173: aload #17
/*   */     //   175: getfield L$2 : Ljava/lang/Object;
/*   */     //   178: astore_2
/*   */     //   179: aload #17
/*   */     //   181: getfield L$1 : Ljava/lang/Object;
/*   */     //   184: astore_1
/*   */     //   185: aload #17
/*   */     //   187: getfield L$0 : Ljava/lang/Object;
/*   */     //   190: checkcast ai/grazie/utils/cache/StandardSuspendableCache
/*   */     //   193: astore_0
/*   */     //   194: aload #16
/*   */     //   196: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*   */     //   199: aload #16
/*   */     //   201: pop
/*   */     //   202: nop
/*   */     //   203: iconst_0
/*   */     //   204: istore #7
/*   */     //   206: aload_0
/*   */     //   207: getfield condition : Lai/grazie/utils/cache/CacheCondition;
/*   */     //   210: aload_0
/*   */     //   211: getfield data : Ljava/util/HashMap;
/*   */     //   214: checkcast java/util/Map
/*   */     //   217: invokestatic emptySet : ()Ljava/util/Set;
/*   */     //   220: invokeinterface toFilterOut : (Ljava/util/Map;Ljava/util/Set;)Ljava/util/Set;
/*   */     //   225: astore #8
/*   */     //   227: aload #8
/*   */     //   229: checkcast java/lang/Iterable
/*   */     //   232: astore #9
/*   */     //   234: iconst_0
/*   */     //   235: istore #10
/*   */     //   237: aload #9
/*   */     //   239: invokeinterface iterator : ()Ljava/util/Iterator;
/*   */     //   244: astore #11
/*   */     //   246: aload #11
/*   */     //   248: invokeinterface hasNext : ()Z
/*   */     //   253: ifeq -> 285
/*   */     //   256: aload #11
/*   */     //   258: invokeinterface next : ()Ljava/lang/Object;
/*   */     //   263: astore #12
/*   */     //   265: aload #12
/*   */     //   267: astore #13
/*   */     //   269: iconst_0
/*   */     //   270: istore #14
/*   */     //   272: aload_0
/*   */     //   273: getfield data : Ljava/util/HashMap;
/*   */     //   276: aload #13
/*   */     //   278: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   281: pop
/*   */     //   282: goto -> 246
/*   */     //   285: nop
/*   */     //   286: aload_0
/*   */     //   287: getfield data : Ljava/util/HashMap;
/*   */     //   290: checkcast java/util/Map
/*   */     //   293: aload_1
/*   */     //   294: new ai/grazie/utils/cache/CacheValue$WithTime$Default
/*   */     //   297: dup
/*   */     //   298: aload_2
/*   */     //   299: lconst_0
/*   */     //   300: iconst_2
/*   */     //   301: aconst_null
/*   */     //   302: invokespecial <init> : (Ljava/lang/Object;JILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*   */     //   305: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   310: pop
/*   */     //   311: nop
/*   */     //   312: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*   */     //   315: astore #15
/*   */     //   317: aload #4
/*   */     //   319: aload #5
/*   */     //   321: invokeinterface unlock : (Ljava/lang/Object;)V
/*   */     //   326: goto -> 343
/*   */     //   329: astore #15
/*   */     //   331: aload #4
/*   */     //   333: aload #5
/*   */     //   335: invokeinterface unlock : (Ljava/lang/Object;)V
/*   */     //   340: aload #15
/*   */     //   342: athrow
/*   */     //   343: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*   */     //   346: areturn
/*   */     //   347: new java/lang/IllegalStateException
/*   */     //   350: dup
/*   */     //   351: ldc 'call to 'resume' before 'invoke' with coroutine'
/*   */     //   353: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   356: athrow
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #16	-> 60
/*   */     //   #17	-> 93
/*   */     //   #58	-> 99
/*   */     //   #59	-> 105
/*   */     //   #63	-> 106
/*   */     //   #16	-> 154
/*   */     //   #64	-> 201
/*   */     //   #65	-> 203
/*   */     //   #18	-> 206
/*   */     //   #19	-> 227
/*   */     //   #66	-> 237
/*   */     //   #19	-> 272
/*   */     //   #66	-> 282
/*   */     //   #67	-> 285
/*   */     //   #21	-> 286
/*   */     //   #22	-> 311
/*   */     //   #65	-> 315
/*   */     //   #68	-> 317
/*   */     //   #65	-> 326
/*   */     //   #69	-> 329
/*   */     //   #68	-> 331
/*   */     //   #23	-> 346
/*   */     //   #16	-> 347
/*   */     // Local variable table:
/*   */     //   start	length	slot	name	descriptor
/*   */     //   93	64	0	this	Lai/grazie/utils/cache/StandardSuspendableCache;
/*   */     //   194	117	0	this	Lai/grazie/utils/cache/StandardSuspendableCache;
/*   */     //   93	64	1	key	Ljava/lang/Object;
/*   */     //   185	126	1	key	Ljava/lang/Object;
/*   */     //   93	64	2	value	Ljava/lang/Object;
/*   */     //   179	132	2	value	Ljava/lang/Object;
/*   */     //   99	58	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*   */     //   173	139	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*   */     //   312	14	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*   */     //   329	14	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*   */     //   102	55	5	owner$iv	Ljava/lang/Object;
/*   */     //   173	139	5	owner$iv	Ljava/lang/Object;
/*   */     //   312	14	5	owner$iv	Ljava/lang/Object;
/*   */     //   329	14	5	owner$iv	Ljava/lang/Object;
/*   */     //   227	7	8	toRemove	Ljava/util/Set;
/*   */     //   234	12	9	$this$forEach$iv	Ljava/lang/Iterable;
/*   */     //   265	17	12	element$iv	Ljava/lang/Object;
/*   */     //   269	13	13	it	Ljava/lang/Object;
/*   */     //   272	10	14	$i$a$-forEach-StandardSuspendableCache$put$2$1	I
/*   */     //   237	49	10	$i$f$forEach	I
/*   */     //   206	106	7	$i$a$-withLock$default-StandardSuspendableCache$put$2	I
/*   */     //   105	52	6	$i$f$withLock	I
/*   */     //   50	297	17	$continuation	Lkotlin/coroutines/Continuation;
/*   */     //   57	290	16	$result	Ljava/lang/Object;
/*   */     //   160	183	6	$i$f$withLock	I
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   202	317	329	finally
/*   */     //   329	331	329	finally
/*   */   }
/*   */   
/*   */   @Nullable
/*   */   public Object invalidate(@NotNull Object key, @NotNull Continuation<? super Unit> paramContinuation) {
/*   */     // Byte code:
/*   */     //   0: aload_2
/*   */     //   1: instanceof ai/grazie/utils/cache/StandardSuspendableCache$invalidate$1
/*   */     //   4: ifeq -> 39
/*   */     //   7: aload_2
/*   */     //   8: checkcast ai/grazie/utils/cache/StandardSuspendableCache$invalidate$1
/*   */     //   11: astore #9
/*   */     //   13: aload #9
/*   */     //   15: getfield label : I
/*   */     //   18: ldc -2147483648
/*   */     //   20: iand
/*   */     //   21: ifeq -> 39
/*   */     //   24: aload #9
/*   */     //   26: dup
/*   */     //   27: getfield label : I
/*   */     //   30: ldc -2147483648
/*   */     //   32: isub
/*   */     //   33: putfield label : I
/*   */     //   36: goto -> 50
/*   */     //   39: new ai/grazie/utils/cache/StandardSuspendableCache$invalidate$1
/*   */     //   42: dup
/*   */     //   43: aload_0
/*   */     //   44: aload_2
/*   */     //   45: invokespecial <init> : (Lai/grazie/utils/cache/StandardSuspendableCache;Lkotlin/coroutines/Continuation;)V
/*   */     //   48: astore #9
/*   */     //   50: aload #9
/*   */     //   52: getfield result : Ljava/lang/Object;
/*   */     //   55: astore #8
/*   */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*   */     //   60: astore #10
/*   */     //   62: aload #9
/*   */     //   64: getfield label : I
/*   */     //   67: tableswitch default -> 231, 0 -> 88, 1 -> 148
/*   */     //   88: aload #8
/*   */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*   */     //   93: aload_0
/*   */     //   94: getfield mutex : Lkotlinx/coroutines/sync/Mutex;
/*   */     //   97: astore_3
/*   */     //   98: aconst_null
/*   */     //   99: astore #4
/*   */     //   101: iconst_0
/*   */     //   102: istore #5
/*   */     //   104: nop
/*   */     //   105: aload_3
/*   */     //   106: aload #4
/*   */     //   108: aload #9
/*   */     //   110: aload #9
/*   */     //   112: aload_0
/*   */     //   113: putfield L$0 : Ljava/lang/Object;
/*   */     //   116: aload #9
/*   */     //   118: aload_1
/*   */     //   119: putfield L$1 : Ljava/lang/Object;
/*   */     //   122: aload #9
/*   */     //   124: aload_3
/*   */     //   125: putfield L$2 : Ljava/lang/Object;
/*   */     //   128: aload #9
/*   */     //   130: iconst_1
/*   */     //   131: putfield label : I
/*   */     //   134: invokeinterface lock : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*   */     //   139: dup
/*   */     //   140: aload #10
/*   */     //   142: if_acmpne -> 185
/*   */     //   145: aload #10
/*   */     //   147: areturn
/*   */     //   148: iconst_0
/*   */     //   149: istore #5
/*   */     //   151: aconst_null
/*   */     //   152: astore #4
/*   */     //   154: aload #9
/*   */     //   156: getfield L$2 : Ljava/lang/Object;
/*   */     //   159: checkcast kotlinx/coroutines/sync/Mutex
/*   */     //   162: astore_3
/*   */     //   163: aload #9
/*   */     //   165: getfield L$1 : Ljava/lang/Object;
/*   */     //   168: astore_1
/*   */     //   169: aload #9
/*   */     //   171: getfield L$0 : Ljava/lang/Object;
/*   */     //   174: checkcast ai/grazie/utils/cache/StandardSuspendableCache
/*   */     //   177: astore_0
/*   */     //   178: aload #8
/*   */     //   180: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*   */     //   183: aload #8
/*   */     //   185: pop
/*   */     //   186: nop
/*   */     //   187: iconst_0
/*   */     //   188: istore #6
/*   */     //   190: aload_0
/*   */     //   191: getfield data : Ljava/util/HashMap;
/*   */     //   194: aload_1
/*   */     //   195: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   198: checkcast ai/grazie/utils/cache/CacheValue$WithTime$Default
/*   */     //   201: astore #7
/*   */     //   203: aload_3
/*   */     //   204: aload #4
/*   */     //   206: invokeinterface unlock : (Ljava/lang/Object;)V
/*   */     //   211: goto -> 227
/*   */     //   214: astore #7
/*   */     //   216: aload_3
/*   */     //   217: aload #4
/*   */     //   219: invokeinterface unlock : (Ljava/lang/Object;)V
/*   */     //   224: aload #7
/*   */     //   226: athrow
/*   */     //   227: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*   */     //   230: areturn
/*   */     //   231: new java/lang/IllegalStateException
/*   */     //   234: dup
/*   */     //   235: ldc 'call to 'resume' before 'invoke' with coroutine'
/*   */     //   237: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   240: athrow
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #25	-> 60
/*   */     //   #26	-> 93
/*   */     //   #70	-> 98
/*   */     //   #71	-> 104
/*   */     //   #75	-> 105
/*   */     //   #25	-> 145
/*   */     //   #76	-> 185
/*   */     //   #77	-> 187
/*   */     //   #27	-> 190
/*   */     //   #77	-> 201
/*   */     //   #79	-> 203
/*   */     //   #77	-> 211
/*   */     //   #78	-> 214
/*   */     //   #79	-> 216
/*   */     //   #29	-> 230
/*   */     //   #25	-> 231
/*   */     // Local variable table:
/*   */     //   start	length	slot	name	descriptor
/*   */     //   93	55	0	this	Lai/grazie/utils/cache/StandardSuspendableCache;
/*   */     //   178	23	0	this	Lai/grazie/utils/cache/StandardSuspendableCache;
/*   */     //   93	55	1	key	Ljava/lang/Object;
/*   */     //   169	32	1	key	Ljava/lang/Object;
/*   */     //   98	50	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*   */     //   163	38	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*   */     //   201	10	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*   */     //   214	13	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*   */     //   101	47	4	owner$iv	Ljava/lang/Object;
/*   */     //   163	38	4	owner$iv	Ljava/lang/Object;
/*   */     //   201	10	4	owner$iv	Ljava/lang/Object;
/*   */     //   214	13	4	owner$iv	Ljava/lang/Object;
/*   */     //   190	11	6	$i$a$-withLock$default-StandardSuspendableCache$invalidate$2	I
/*   */     //   104	44	5	$i$f$withLock	I
/*   */     //   50	181	9	$continuation	Lkotlin/coroutines/Continuation;
/*   */     //   57	174	8	$result	Ljava/lang/Object;
/*   */     //   151	76	5	$i$f$withLock	I
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   186	203	214	finally
/*   */     //   214	216	214	finally
/*   */   }
/*   */   
/*   */   @Nullable
/*   */   public Object getOrPut(@NotNull Object key, @NotNull Function0 loader, @NotNull Continuation<? super Value> paramContinuation) {
/*   */     // Byte code:
/*   */     //   0: aload_3
/*   */     //   1: instanceof ai/grazie/utils/cache/StandardSuspendableCache$getOrPut$1
/*   */     //   4: ifeq -> 39
/*   */     //   7: aload_3
/*   */     //   8: checkcast ai/grazie/utils/cache/StandardSuspendableCache$getOrPut$1
/*   */     //   11: astore #11
/*   */     //   13: aload #11
/*   */     //   15: getfield label : I
/*   */     //   18: ldc -2147483648
/*   */     //   20: iand
/*   */     //   21: ifeq -> 39
/*   */     //   24: aload #11
/*   */     //   26: dup
/*   */     //   27: getfield label : I
/*   */     //   30: ldc -2147483648
/*   */     //   32: isub
/*   */     //   33: putfield label : I
/*   */     //   36: goto -> 50
/*   */     //   39: new ai/grazie/utils/cache/StandardSuspendableCache$getOrPut$1
/*   */     //   42: dup
/*   */     //   43: aload_0
/*   */     //   44: aload_3
/*   */     //   45: invokespecial <init> : (Lai/grazie/utils/cache/StandardSuspendableCache;Lkotlin/coroutines/Continuation;)V
/*   */     //   48: astore #11
/*   */     //   50: aload #11
/*   */     //   52: getfield result : Ljava/lang/Object;
/*   */     //   55: astore #10
/*   */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*   */     //   60: astore #12
/*   */     //   62: aload #11
/*   */     //   64: getfield label : I
/*   */     //   67: tableswitch default -> 531, 0 -> 100, 1 -> 169, 2 -> 268, 3 -> 379, 4 -> 469
/*   */     //   100: aload #10
/*   */     //   102: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*   */     //   105: aload_0
/*   */     //   106: getfield mutex : Lkotlinx/coroutines/sync/Mutex;
/*   */     //   109: astore #4
/*   */     //   111: aconst_null
/*   */     //   112: astore #5
/*   */     //   114: iconst_0
/*   */     //   115: istore #6
/*   */     //   117: nop
/*   */     //   118: aload #4
/*   */     //   120: aload #5
/*   */     //   122: aload #11
/*   */     //   124: aload #11
/*   */     //   126: aload_0
/*   */     //   127: putfield L$0 : Ljava/lang/Object;
/*   */     //   130: aload #11
/*   */     //   132: aload_1
/*   */     //   133: putfield L$1 : Ljava/lang/Object;
/*   */     //   136: aload #11
/*   */     //   138: aload_2
/*   */     //   139: putfield L$2 : Ljava/lang/Object;
/*   */     //   142: aload #11
/*   */     //   144: aload #4
/*   */     //   146: putfield L$3 : Ljava/lang/Object;
/*   */     //   149: aload #11
/*   */     //   151: iconst_1
/*   */     //   152: putfield label : I
/*   */     //   155: invokeinterface lock : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*   */     //   160: dup
/*   */     //   161: aload #12
/*   */     //   163: if_acmpne -> 216
/*   */     //   166: aload #12
/*   */     //   168: areturn
/*   */     //   169: iconst_0
/*   */     //   170: istore #6
/*   */     //   172: aconst_null
/*   */     //   173: astore #5
/*   */     //   175: aload #11
/*   */     //   177: getfield L$3 : Ljava/lang/Object;
/*   */     //   180: checkcast kotlinx/coroutines/sync/Mutex
/*   */     //   183: astore #4
/*   */     //   185: aload #11
/*   */     //   187: getfield L$2 : Ljava/lang/Object;
/*   */     //   190: checkcast kotlin/jvm/functions/Function0
/*   */     //   193: astore_2
/*   */     //   194: aload #11
/*   */     //   196: getfield L$1 : Ljava/lang/Object;
/*   */     //   199: astore_1
/*   */     //   200: aload #11
/*   */     //   202: getfield L$0 : Ljava/lang/Object;
/*   */     //   205: checkcast ai/grazie/utils/cache/StandardSuspendableCache
/*   */     //   208: astore_0
/*   */     //   209: aload #10
/*   */     //   211: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*   */     //   214: aload #10
/*   */     //   216: pop
/*   */     //   217: nop
/*   */     //   218: iconst_0
/*   */     //   219: istore #7
/*   */     //   221: aload_0
/*   */     //   222: aload_1
/*   */     //   223: aload #11
/*   */     //   225: aload #11
/*   */     //   227: aload_0
/*   */     //   228: putfield L$0 : Ljava/lang/Object;
/*   */     //   231: aload #11
/*   */     //   233: aload_1
/*   */     //   234: putfield L$1 : Ljava/lang/Object;
/*   */     //   237: aload #11
/*   */     //   239: aload_2
/*   */     //   240: putfield L$2 : Ljava/lang/Object;
/*   */     //   243: aload #11
/*   */     //   245: aload #4
/*   */     //   247: putfield L$3 : Ljava/lang/Object;
/*   */     //   250: aload #11
/*   */     //   252: iconst_2
/*   */     //   253: putfield label : I
/*   */     //   256: invokevirtual get : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*   */     //   259: dup
/*   */     //   260: aload #12
/*   */     //   262: if_acmpne -> 319
/*   */     //   265: aload #12
/*   */     //   267: areturn
/*   */     //   268: iconst_0
/*   */     //   269: istore #6
/*   */     //   271: iconst_0
/*   */     //   272: istore #7
/*   */     //   274: aconst_null
/*   */     //   275: astore #5
/*   */     //   277: aload #11
/*   */     //   279: getfield L$3 : Ljava/lang/Object;
/*   */     //   282: checkcast kotlinx/coroutines/sync/Mutex
/*   */     //   285: astore #4
/*   */     //   287: aload #11
/*   */     //   289: getfield L$2 : Ljava/lang/Object;
/*   */     //   292: checkcast kotlin/jvm/functions/Function0
/*   */     //   295: astore_2
/*   */     //   296: aload #11
/*   */     //   298: getfield L$1 : Ljava/lang/Object;
/*   */     //   301: astore_1
/*   */     //   302: aload #11
/*   */     //   304: getfield L$0 : Ljava/lang/Object;
/*   */     //   307: checkcast ai/grazie/utils/cache/StandardSuspendableCache
/*   */     //   310: astore_0
/*   */     //   311: nop
/*   */     //   312: aload #10
/*   */     //   314: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*   */     //   317: aload #10
/*   */     //   319: astore #8
/*   */     //   321: aload #8
/*   */     //   323: ifnonnull -> 422
/*   */     //   326: aload_0
/*   */     //   327: aload_1
/*   */     //   328: aload_2
/*   */     //   329: invokeinterface invoke : ()Ljava/lang/Object;
/*   */     //   334: aload #11
/*   */     //   336: aload #11
/*   */     //   338: aload_0
/*   */     //   339: putfield L$0 : Ljava/lang/Object;
/*   */     //   342: aload #11
/*   */     //   344: aload_1
/*   */     //   345: putfield L$1 : Ljava/lang/Object;
/*   */     //   348: aload #11
/*   */     //   350: aload #4
/*   */     //   352: putfield L$2 : Ljava/lang/Object;
/*   */     //   355: aload #11
/*   */     //   357: aconst_null
/*   */     //   358: putfield L$3 : Ljava/lang/Object;
/*   */     //   361: aload #11
/*   */     //   363: iconst_3
/*   */     //   364: putfield label : I
/*   */     //   367: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*   */     //   370: dup
/*   */     //   371: aload #12
/*   */     //   373: if_acmpne -> 421
/*   */     //   376: aload #12
/*   */     //   378: areturn
/*   */     //   379: iconst_0
/*   */     //   380: istore #6
/*   */     //   382: iconst_0
/*   */     //   383: istore #7
/*   */     //   385: aconst_null
/*   */     //   386: astore #5
/*   */     //   388: aload #11
/*   */     //   390: getfield L$2 : Ljava/lang/Object;
/*   */     //   393: checkcast kotlinx/coroutines/sync/Mutex
/*   */     //   396: astore #4
/*   */     //   398: aload #11
/*   */     //   400: getfield L$1 : Ljava/lang/Object;
/*   */     //   403: astore_1
/*   */     //   404: aload #11
/*   */     //   406: getfield L$0 : Ljava/lang/Object;
/*   */     //   409: checkcast ai/grazie/utils/cache/StandardSuspendableCache
/*   */     //   412: astore_0
/*   */     //   413: nop
/*   */     //   414: aload #10
/*   */     //   416: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*   */     //   419: aload #10
/*   */     //   421: pop
/*   */     //   422: aload_0
/*   */     //   423: aload_1
/*   */     //   424: aload #11
/*   */     //   426: aload #11
/*   */     //   428: aload #4
/*   */     //   430: putfield L$0 : Ljava/lang/Object;
/*   */     //   433: aload #11
/*   */     //   435: aconst_null
/*   */     //   436: putfield L$1 : Ljava/lang/Object;
/*   */     //   439: aload #11
/*   */     //   441: aconst_null
/*   */     //   442: putfield L$2 : Ljava/lang/Object;
/*   */     //   445: aload #11
/*   */     //   447: aconst_null
/*   */     //   448: putfield L$3 : Ljava/lang/Object;
/*   */     //   451: aload #11
/*   */     //   453: iconst_4
/*   */     //   454: putfield label : I
/*   */     //   457: invokevirtual get : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*   */     //   460: dup
/*   */     //   461: aload #12
/*   */     //   463: if_acmpne -> 496
/*   */     //   466: aload #12
/*   */     //   468: areturn
/*   */     //   469: iconst_0
/*   */     //   470: istore #6
/*   */     //   472: iconst_0
/*   */     //   473: istore #7
/*   */     //   475: aconst_null
/*   */     //   476: astore #5
/*   */     //   478: aload #11
/*   */     //   480: getfield L$0 : Ljava/lang/Object;
/*   */     //   483: checkcast kotlinx/coroutines/sync/Mutex
/*   */     //   486: astore #4
/*   */     //   488: nop
/*   */     //   489: aload #10
/*   */     //   491: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*   */     //   494: aload #10
/*   */     //   496: dup
/*   */     //   497: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*   */     //   500: astore #9
/*   */     //   502: aload #4
/*   */     //   504: aload #5
/*   */     //   506: invokeinterface unlock : (Ljava/lang/Object;)V
/*   */     //   511: aload #9
/*   */     //   513: goto -> 530
/*   */     //   516: astore #9
/*   */     //   518: aload #4
/*   */     //   520: aload #5
/*   */     //   522: invokeinterface unlock : (Ljava/lang/Object;)V
/*   */     //   527: aload #9
/*   */     //   529: athrow
/*   */     //   530: areturn
/*   */     //   531: new java/lang/IllegalStateException
/*   */     //   534: dup
/*   */     //   535: ldc 'call to 'resume' before 'invoke' with coroutine'
/*   */     //   537: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   540: athrow
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #31	-> 60
/*   */     //   #32	-> 105
/*   */     //   #80	-> 111
/*   */     //   #81	-> 117
/*   */     //   #85	-> 118
/*   */     //   #31	-> 166
/*   */     //   #86	-> 216
/*   */     //   #87	-> 218
/*   */     //   #33	-> 221
/*   */     //   #31	-> 265
/*   */     //   #34	-> 321
/*   */     //   #35	-> 326
/*   */     //   #31	-> 376
/*   */     //   #37	-> 421
/*   */     //   #31	-> 466
/*   */     //   #37	-> 496
/*   */     //   #87	-> 500
/*   */     //   #89	-> 502
/*   */     //   #87	-> 513
/*   */     //   #88	-> 516
/*   */     //   #89	-> 518
/*   */     //   #32	-> 530
/*   */     //   #31	-> 531
/*   */     // Local variable table:
/*   */     //   start	length	slot	name	descriptor
/*   */     //   105	64	0	this	Lai/grazie/utils/cache/StandardSuspendableCache;
/*   */     //   209	59	0	this	Lai/grazie/utils/cache/StandardSuspendableCache;
/*   */     //   311	68	0	this	Lai/grazie/utils/cache/StandardSuspendableCache;
/*   */     //   413	47	0	this	Lai/grazie/utils/cache/StandardSuspendableCache;
/*   */     //   105	64	1	key	Ljava/lang/Object;
/*   */     //   200	68	1	key	Ljava/lang/Object;
/*   */     //   302	77	1	key	Ljava/lang/Object;
/*   */     //   404	56	1	key	Ljava/lang/Object;
/*   */     //   105	64	2	loader	Lkotlin/jvm/functions/Function0;
/*   */     //   194	74	2	loader	Lkotlin/jvm/functions/Function0;
/*   */     //   296	74	2	loader	Lkotlin/jvm/functions/Function0;
/*   */     //   111	58	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*   */     //   185	83	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*   */     //   287	92	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*   */     //   398	71	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*   */     //   488	12	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*   */     //   500	13	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*   */     //   516	14	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*   */     //   114	55	5	owner$iv	Ljava/lang/Object;
/*   */     //   185	83	5	owner$iv	Ljava/lang/Object;
/*   */     //   287	92	5	owner$iv	Ljava/lang/Object;
/*   */     //   398	71	5	owner$iv	Ljava/lang/Object;
/*   */     //   500	13	5	owner$iv	Ljava/lang/Object;
/*   */     //   516	14	5	owner$iv	Ljava/lang/Object;
/*   */     //   321	5	8	value	Ljava/lang/Object;
/*   */     //   221	47	7	$i$a$-withLock$default-StandardSuspendableCache$getOrPut$2	I
/*   */     //   117	52	6	$i$f$withLock	I
/*   */     //   50	481	11	$continuation	Lkotlin/coroutines/Continuation;
/*   */     //   57	474	10	$result	Ljava/lang/Object;
/*   */     //   172	96	6	$i$f$withLock	I
/*   */     //   274	105	7	$i$a$-withLock$default-StandardSuspendableCache$getOrPut$2	I
/*   */     //   271	108	6	$i$f$withLock	I
/*   */     //   385	84	7	$i$a$-withLock$default-StandardSuspendableCache$getOrPut$2	I
/*   */     //   382	87	6	$i$f$withLock	I
/*   */     //   475	25	7	$i$a$-withLock$default-StandardSuspendableCache$getOrPut$2	I
/*   */     //   472	58	6	$i$f$withLock	I
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   217	259	516	finally
/*   */     //   311	370	516	finally
/*   */     //   413	460	516	finally
/*   */     //   488	502	516	finally
/*   */     //   516	518	516	finally
/*   */   }
/*   */   
/*   */   @Nullable
/*   */   public Object clear(@NotNull Continuation<? super Unit> paramContinuation) {
/*   */     // Byte code:
/*   */     //   0: aload_1
/*   */     //   1: instanceof ai/grazie/utils/cache/StandardSuspendableCache$clear$1
/*   */     //   4: ifeq -> 39
/*   */     //   7: aload_1
/*   */     //   8: checkcast ai/grazie/utils/cache/StandardSuspendableCache$clear$1
/*   */     //   11: astore #8
/*   */     //   13: aload #8
/*   */     //   15: getfield label : I
/*   */     //   18: ldc -2147483648
/*   */     //   20: iand
/*   */     //   21: ifeq -> 39
/*   */     //   24: aload #8
/*   */     //   26: dup
/*   */     //   27: getfield label : I
/*   */     //   30: ldc -2147483648
/*   */     //   32: isub
/*   */     //   33: putfield label : I
/*   */     //   36: goto -> 50
/*   */     //   39: new ai/grazie/utils/cache/StandardSuspendableCache$clear$1
/*   */     //   42: dup
/*   */     //   43: aload_0
/*   */     //   44: aload_1
/*   */     //   45: invokespecial <init> : (Lai/grazie/utils/cache/StandardSuspendableCache;Lkotlin/coroutines/Continuation;)V
/*   */     //   48: astore #8
/*   */     //   50: aload #8
/*   */     //   52: getfield result : Ljava/lang/Object;
/*   */     //   55: astore #7
/*   */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*   */     //   60: astore #9
/*   */     //   62: aload #8
/*   */     //   64: getfield label : I
/*   */     //   67: tableswitch default -> 214, 0 -> 88, 1 -> 140
/*   */     //   88: aload #7
/*   */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*   */     //   93: aload_0
/*   */     //   94: getfield mutex : Lkotlinx/coroutines/sync/Mutex;
/*   */     //   97: astore_2
/*   */     //   98: aconst_null
/*   */     //   99: astore_3
/*   */     //   100: iconst_0
/*   */     //   101: istore #4
/*   */     //   103: nop
/*   */     //   104: aload_2
/*   */     //   105: aload_3
/*   */     //   106: aload #8
/*   */     //   108: aload #8
/*   */     //   110: aload_0
/*   */     //   111: putfield L$0 : Ljava/lang/Object;
/*   */     //   114: aload #8
/*   */     //   116: aload_2
/*   */     //   117: putfield L$1 : Ljava/lang/Object;
/*   */     //   120: aload #8
/*   */     //   122: iconst_1
/*   */     //   123: putfield label : I
/*   */     //   126: invokeinterface lock : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*   */     //   131: dup
/*   */     //   132: aload #9
/*   */     //   134: if_acmpne -> 170
/*   */     //   137: aload #9
/*   */     //   139: areturn
/*   */     //   140: iconst_0
/*   */     //   141: istore #4
/*   */     //   143: aconst_null
/*   */     //   144: astore_3
/*   */     //   145: aload #8
/*   */     //   147: getfield L$1 : Ljava/lang/Object;
/*   */     //   150: checkcast kotlinx/coroutines/sync/Mutex
/*   */     //   153: astore_2
/*   */     //   154: aload #8
/*   */     //   156: getfield L$0 : Ljava/lang/Object;
/*   */     //   159: checkcast ai/grazie/utils/cache/StandardSuspendableCache
/*   */     //   162: astore_0
/*   */     //   163: aload #7
/*   */     //   165: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*   */     //   168: aload #7
/*   */     //   170: pop
/*   */     //   171: nop
/*   */     //   172: iconst_0
/*   */     //   173: istore #5
/*   */     //   175: aload_0
/*   */     //   176: getfield data : Ljava/util/HashMap;
/*   */     //   179: invokevirtual clear : ()V
/*   */     //   182: nop
/*   */     //   183: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*   */     //   186: astore #6
/*   */     //   188: aload_2
/*   */     //   189: aload_3
/*   */     //   190: invokeinterface unlock : (Ljava/lang/Object;)V
/*   */     //   195: goto -> 210
/*   */     //   198: astore #6
/*   */     //   200: aload_2
/*   */     //   201: aload_3
/*   */     //   202: invokeinterface unlock : (Ljava/lang/Object;)V
/*   */     //   207: aload #6
/*   */     //   209: athrow
/*   */     //   210: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*   */     //   213: areturn
/*   */     //   214: new java/lang/IllegalStateException
/*   */     //   217: dup
/*   */     //   218: ldc 'call to 'resume' before 'invoke' with coroutine'
/*   */     //   220: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   223: athrow
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #41	-> 60
/*   */     //   #42	-> 93
/*   */     //   #90	-> 98
/*   */     //   #91	-> 103
/*   */     //   #95	-> 104
/*   */     //   #41	-> 137
/*   */     //   #96	-> 170
/*   */     //   #97	-> 172
/*   */     //   #43	-> 175
/*   */     //   #44	-> 182
/*   */     //   #97	-> 186
/*   */     //   #99	-> 188
/*   */     //   #97	-> 195
/*   */     //   #98	-> 198
/*   */     //   #99	-> 200
/*   */     //   #45	-> 213
/*   */     //   #41	-> 214
/*   */     // Local variable table:
/*   */     //   start	length	slot	name	descriptor
/*   */     //   93	47	0	this	Lai/grazie/utils/cache/StandardSuspendableCache;
/*   */     //   163	19	0	this	Lai/grazie/utils/cache/StandardSuspendableCache;
/*   */     //   98	42	2	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*   */     //   154	29	2	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*   */     //   183	12	2	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*   */     //   198	12	2	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*   */     //   100	40	3	owner$iv	Ljava/lang/Object;
/*   */     //   154	29	3	owner$iv	Ljava/lang/Object;
/*   */     //   183	12	3	owner$iv	Ljava/lang/Object;
/*   */     //   198	12	3	owner$iv	Ljava/lang/Object;
/*   */     //   175	8	5	$i$a$-withLock$default-StandardSuspendableCache$clear$2	I
/*   */     //   103	37	4	$i$f$withLock	I
/*   */     //   50	164	8	$continuation	Lkotlin/coroutines/Continuation;
/*   */     //   57	157	7	$result	Ljava/lang/Object;
/*   */     //   143	67	4	$i$f$withLock	I
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   171	188	198	finally
/*   */     //   198	200	198	finally
/*   */   }
/*   */   
/*   */   @DebugMetadata(f = "StandardSuspendableCache.kt", l = {53}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "$this$withLock_u24default$iv"}, m = "clear", c = "ai.grazie.utils.cache.StandardSuspendableCache")
/*   */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*   */   static final class StandardSuspendableCache$clear$1 extends ContinuationImpl {
/*   */     Object L$0;
/*   */     Object L$1;
/*   */     int label;
/*   */     
/*   */     StandardSuspendableCache$clear$1(Continuation $completion) {
/*   */       super($completion);
/*   */     }
/*   */     
/*   */     @Nullable
/*   */     public final Object invokeSuspend(@NotNull Object $result) {
/*   */       this.result = $result;
/*   */       this.label |= Integer.MIN_VALUE;
/*   */       return StandardSuspendableCache.this.clear((Continuation<? super Unit>)this);
/*   */     }
/*   */   }
/*   */   
/*   */   @DebugMetadata(f = "StandardSuspendableCache.kt", l = {53}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"this", "key", "$this$withLock_u24default$iv"}, m = "get", c = "ai.grazie.utils.cache.StandardSuspendableCache")
/*   */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*   */   static final class StandardSuspendableCache$get$1 extends ContinuationImpl {
/*   */     Object L$0;
/*   */     Object L$1;
/*   */     Object L$2;
/*   */     int label;
/*   */     
/*   */     StandardSuspendableCache$get$1(Continuation $completion) {
/*   */       super($completion);
/*   */     }
/*   */     
/*   */     @Nullable
/*   */     public final Object invokeSuspend(@NotNull Object $result) {
/*   */       this.result = $result;
/*   */       this.label |= Integer.MIN_VALUE;
/*   */       return StandardSuspendableCache.this.get(null, (Continuation<? super Value>)this);
/*   */     }
/*   */   }
/*   */   
/*   */   @DebugMetadata(f = "StandardSuspendableCache.kt", l = {53, 33, 35, 37}, i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 3}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0"}, n = {"this", "key", "loader", "$this$withLock_u24default$iv", "this", "key", "loader", "$this$withLock_u24default$iv", "this", "key", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, m = "getOrPut", c = "ai.grazie.utils.cache.StandardSuspendableCache")
/*   */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*   */   static final class StandardSuspendableCache$getOrPut$1 extends ContinuationImpl {
/*   */     Object L$0;
/*   */     Object L$1;
/*   */     Object L$2;
/*   */     Object L$3;
/*   */     int label;
/*   */     
/*   */     StandardSuspendableCache$getOrPut$1(Continuation $completion) {
/*   */       super($completion);
/*   */     }
/*   */     
/*   */     @Nullable
/*   */     public final Object invokeSuspend(@NotNull Object $result) {
/*   */       this.result = $result;
/*   */       this.label |= Integer.MIN_VALUE;
/*   */       return StandardSuspendableCache.this.getOrPut(null, null, (Continuation<? super Value>)this);
/*   */     }
/*   */   }
/*   */   
/*   */   @DebugMetadata(f = "StandardSuspendableCache.kt", l = {53}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"this", "key", "$this$withLock_u24default$iv"}, m = "invalidate", c = "ai.grazie.utils.cache.StandardSuspendableCache")
/*   */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*   */   static final class StandardSuspendableCache$invalidate$1 extends ContinuationImpl {
/*   */     Object L$0;
/*   */     Object L$1;
/*   */     Object L$2;
/*   */     int label;
/*   */     
/*   */     StandardSuspendableCache$invalidate$1(Continuation $completion) {
/*   */       super($completion);
/*   */     }
/*   */     
/*   */     @Nullable
/*   */     public final Object invokeSuspend(@NotNull Object $result) {
/*   */       this.result = $result;
/*   */       this.label |= Integer.MIN_VALUE;
/*   */       return StandardSuspendableCache.this.invalidate(null, (Continuation<? super Unit>)this);
/*   */     }
/*   */   }
/*   */   
/*   */   @DebugMetadata(f = "StandardSuspendableCache.kt", l = {53}, i = {0, 0, 0, 0}, s = {"L$0", "L$1", "L$2", "L$3"}, n = {"this", "key", "value", "$this$withLock_u24default$iv"}, m = "put", c = "ai.grazie.utils.cache.StandardSuspendableCache")
/*   */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*   */   static final class StandardSuspendableCache$put$1 extends ContinuationImpl {
/*   */     Object L$0;
/*   */     Object L$1;
/*   */     Object L$2;
/*   */     Object L$3;
/*   */     int label;
/*   */     
/*   */     StandardSuspendableCache$put$1(Continuation $completion) {
/*   */       super($completion);
/*   */     }
/*   */     
/*   */     @Nullable
/*   */     public final Object invokeSuspend(@NotNull Object $result) {
/*   */       this.result = $result;
/*   */       this.label |= Integer.MIN_VALUE;
/*   */       return StandardSuspendableCache.this.put(null, null, (Continuation<? super Unit>)this);
/*   */     }
/*   */   }
/*   */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/cache/StandardSuspendableCache.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */