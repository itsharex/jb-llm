package ai.grazie.nlp.encoder.tiktoken.cl100k;

import ai.grazie.nlp.encoder.TiktokenEncoder;
import ai.grazie.utils.mpp.FromResourceProvider;
import ai.grazie.utils.mpp.RootDataLoader;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\b\003\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\031\020\006\032\0020\0022\006\020\007\032\0020\bH@ø\001\000¢\006\002\020\tR\016\020\004\032\0020\005X\004¢\006\002\n\000\002\004\n\002\b\031¨\006\n"}, d2 = {"Lai/grazie/nlp/encoder/tiktoken/cl100k/TiktokenCL100KBaseEncoder$Companion;", "Lai/grazie/utils/mpp/FromResourceProvider;", "Lai/grazie/nlp/encoder/TiktokenEncoder;", "()V", "PATTERN", "Lkotlin/text/Regex;", "load", "loader", "Lai/grazie/utils/mpp/RootDataLoader;", "(Lai/grazie/utils/mpp/RootDataLoader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nlp-encoder-tiktoken-cl100k-base"})
@SourceDebugExtension({"SMAP\nTiktokenCL100KBaseEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TiktokenCL100KBaseEncoder.kt\nai/grazie/nlp/encoder/tiktoken/cl100k/TiktokenCL100KBaseEncoder$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,29:1\n766#2:30\n857#2,2:31\n1179#2,2:33\n1253#2,4:35\n*S KotlinDebug\n*F\n+ 1 TiktokenCL100KBaseEncoder.kt\nai/grazie/nlp/encoder/tiktoken/cl100k/TiktokenCL100KBaseEncoder$Companion\n*L\n20#1:30\n20#1:31,2\n20#1:33,2\n20#1:35,4\n*E\n"})
public final class Companion implements FromResourceProvider<TiktokenEncoder> {
  private Companion() {}
  
  @Nullable
  public Object load(@NotNull RootDataLoader loader, @NotNull Continuation<? super TiktokenEncoder> paramContinuation) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof ai/grazie/nlp/encoder/tiktoken/cl100k/TiktokenCL100KBaseEncoder$Companion$load$1
    //   4: ifeq -> 39
    //   7: aload_2
    //   8: checkcast ai/grazie/nlp/encoder/tiktoken/cl100k/TiktokenCL100KBaseEncoder$Companion$load$1
    //   11: astore #21
    //   13: aload #21
    //   15: getfield label : I
    //   18: ldc -2147483648
    //   20: iand
    //   21: ifeq -> 39
    //   24: aload #21
    //   26: dup
    //   27: getfield label : I
    //   30: ldc -2147483648
    //   32: isub
    //   33: putfield label : I
    //   36: goto -> 50
    //   39: new ai/grazie/nlp/encoder/tiktoken/cl100k/TiktokenCL100KBaseEncoder$Companion$load$1
    //   42: dup
    //   43: aload_0
    //   44: aload_2
    //   45: invokespecial <init> : (Lai/grazie/nlp/encoder/tiktoken/cl100k/TiktokenCL100KBaseEncoder$Companion;Lkotlin/coroutines/Continuation;)V
    //   48: astore #21
    //   50: aload #21
    //   52: getfield result : Ljava/lang/Object;
    //   55: astore #20
    //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   60: astore #22
    //   62: aload #21
    //   64: getfield label : I
    //   67: tableswitch default -> 465, 0 -> 88, 1 -> 137
    //   88: aload #20
    //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   93: new ai/grazie/utils/mpp/PrefixedDataLoader
    //   96: dup
    //   97: new ai/grazie/utils/mpp/DataLoader$Path
    //   100: dup
    //   101: ldc 'encoder'
    //   103: invokespecial <init> : (Ljava/lang/String;)V
    //   106: aload_1
    //   107: checkcast ai/grazie/utils/mpp/DataLoader
    //   110: invokespecial <init> : (Lai/grazie/utils/mpp/DataLoader$Path;Lai/grazie/utils/mpp/DataLoader;)V
    //   113: astore_3
    //   114: aload_3
    //   115: ldc 'cl100k_base.txt'
    //   117: aload #21
    //   119: aload #21
    //   121: iconst_1
    //   122: putfield label : I
    //   125: invokevirtual text : (Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   128: dup
    //   129: aload #22
    //   131: if_acmpne -> 144
    //   134: aload #22
    //   136: areturn
    //   137: aload #20
    //   139: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   142: aload #20
    //   144: checkcast java/lang/CharSequence
    //   147: invokestatic lines : (Ljava/lang/CharSequence;)Ljava/util/List;
    //   150: checkcast java/lang/Iterable
    //   153: astore #5
    //   155: iconst_0
    //   156: istore #6
    //   158: aload #5
    //   160: astore #7
    //   162: new java/util/ArrayList
    //   165: dup
    //   166: invokespecial <init> : ()V
    //   169: checkcast java/util/Collection
    //   172: astore #8
    //   174: iconst_0
    //   175: istore #9
    //   177: aload #7
    //   179: invokeinterface iterator : ()Ljava/util/Iterator;
    //   184: astore #10
    //   186: aload #10
    //   188: invokeinterface hasNext : ()Z
    //   193: ifeq -> 248
    //   196: aload #10
    //   198: invokeinterface next : ()Ljava/lang/Object;
    //   203: astore #11
    //   205: aload #11
    //   207: checkcast java/lang/String
    //   210: astore #12
    //   212: iconst_0
    //   213: istore #13
    //   215: aload #12
    //   217: checkcast java/lang/CharSequence
    //   220: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
    //   223: ifne -> 230
    //   226: iconst_1
    //   227: goto -> 231
    //   230: iconst_0
    //   231: nop
    //   232: ifeq -> 186
    //   235: aload #8
    //   237: aload #11
    //   239: invokeinterface add : (Ljava/lang/Object;)Z
    //   244: pop
    //   245: goto -> 186
    //   248: aload #8
    //   250: checkcast java/util/List
    //   253: nop
    //   254: checkcast java/lang/Iterable
    //   257: astore #5
    //   259: iconst_0
    //   260: istore #6
    //   262: aload #5
    //   264: bipush #10
    //   266: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
    //   269: invokestatic mapCapacity : (I)I
    //   272: bipush #16
    //   274: invokestatic coerceAtLeast : (II)I
    //   277: istore #7
    //   279: aload #5
    //   281: astore #8
    //   283: new java/util/LinkedHashMap
    //   286: dup
    //   287: iload #7
    //   289: invokespecial <init> : (I)V
    //   292: checkcast java/util/Map
    //   295: astore #9
    //   297: iconst_0
    //   298: istore #10
    //   300: aload #8
    //   302: invokeinterface iterator : ()Ljava/util/Iterator;
    //   307: astore #11
    //   309: aload #11
    //   311: invokeinterface hasNext : ()Z
    //   316: ifeq -> 450
    //   319: aload #11
    //   321: invokeinterface next : ()Ljava/lang/Object;
    //   326: astore #12
    //   328: aload #9
    //   330: astore #13
    //   332: aload #12
    //   334: checkcast java/lang/String
    //   337: astore #14
    //   339: iconst_0
    //   340: istore #15
    //   342: aload #14
    //   344: checkcast java/lang/CharSequence
    //   347: iconst_1
    //   348: anewarray java/lang/String
    //   351: astore #16
    //   353: aload #16
    //   355: iconst_0
    //   356: ldc ' '
    //   358: aastore
    //   359: aload #16
    //   361: iconst_0
    //   362: iconst_0
    //   363: bipush #6
    //   365: aconst_null
    //   366: invokestatic split$default : (Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
    //   369: astore #17
    //   371: aload #17
    //   373: iconst_0
    //   374: invokeinterface get : (I)Ljava/lang/Object;
    //   379: checkcast java/lang/String
    //   382: astore #16
    //   384: aload #17
    //   386: iconst_1
    //   387: invokeinterface get : (I)Ljava/lang/Object;
    //   392: checkcast java/lang/String
    //   395: astore #18
    //   397: new ai/grazie/nlp/encoder/ByteArrayKey
    //   400: dup
    //   401: getstatic ai/grazie/utils/mpp/Base64.INSTANCE : Lai/grazie/utils/mpp/Base64;
    //   404: aload #16
    //   406: invokevirtual decode : (Ljava/lang/String;)[B
    //   409: invokespecial <init> : ([B)V
    //   412: astore #19
    //   414: aload #19
    //   416: aload #18
    //   418: invokestatic parseInt : (Ljava/lang/String;)I
    //   421: invokestatic boxInt : (I)Ljava/lang/Integer;
    //   424: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
    //   427: astore #14
    //   429: aload #13
    //   431: aload #14
    //   433: invokevirtual getFirst : ()Ljava/lang/Object;
    //   436: aload #14
    //   438: invokevirtual getSecond : ()Ljava/lang/Object;
    //   441: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   446: pop
    //   447: goto -> 309
    //   450: aload #9
    //   452: nop
    //   453: astore #4
    //   455: new ai/grazie/nlp/encoder/tiktoken/cl100k/TiktokenCL100KBaseEncoder
    //   458: dup
    //   459: aload #4
    //   461: invokespecial <init> : (Ljava/util/Map;)V
    //   464: areturn
    //   465: new java/lang/IllegalStateException
    //   468: dup
    //   469: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   471: invokespecial <init> : (Ljava/lang/String;)V
    //   474: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #18	-> 60
    //   #19	-> 93
    //   #20	-> 114
    //   #18	-> 134
    //   #20	-> 144
    //   #30	-> 158
    //   #31	-> 177
    //   #20	-> 215
    //   #20	-> 231
    //   #31	-> 232
    //   #32	-> 248
    //   #30	-> 253
    //   #20	-> 259
    //   #33	-> 262
    //   #34	-> 279
    //   #35	-> 300
    //   #36	-> 328
    //   #21	-> 342
    //   #21	-> 382
    //   #21	-> 395
    //   #22	-> 397
    //   #23	-> 414
    //   #23	-> 424
    //   #36	-> 427
    //   #38	-> 450
    //   #34	-> 452
    //   #20	-> 453
    //   #25	-> 455
    //   #18	-> 465
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   93	21	1	loader	Lai/grazie/utils/mpp/RootDataLoader;
    //   114	14	3	encoderLoader	Lai/grazie/utils/mpp/PrefixedDataLoader;
    //   455	10	4	vocabulary	Ljava/util/Map;
    //   155	19	5	$this$filter$iv	Ljava/lang/Iterable;
    //   259	38	5	$this$associate$iv	Ljava/lang/Iterable;
    //   174	12	7	$this$filterTo$iv$iv	Ljava/lang/Iterable;
    //   279	18	7	capacity$iv	I
    //   174	76	8	destination$iv$iv	Ljava/util/Collection;
    //   297	12	8	$this$associateTo$iv$iv	Ljava/lang/Iterable;
    //   297	155	9	destination$iv$iv	Ljava/util/Map;
    //   205	40	11	element$iv$iv	Ljava/lang/Object;
    //   212	18	12	it	Ljava/lang/String;
    //   328	119	12	element$iv$iv	Ljava/lang/Object;
    //   339	88	14	it	Ljava/lang/String;
    //   384	43	16	token	Ljava/lang/String;
    //   397	30	18	index	Ljava/lang/String;
    //   414	13	19	decodedToken	Lai/grazie/nlp/encoder/ByteArrayKey;
    //   215	17	13	$i$a$-filter-TiktokenCL100KBaseEncoder$Companion$load$vocabulary$1	I
    //   177	73	9	$i$f$filterTo	I
    //   158	96	6	$i$f$filter	I
    //   342	85	15	$i$a$-associate-TiktokenCL100KBaseEncoder$Companion$load$vocabulary$2	I
    //   300	152	10	$i$f$associateTo	I
    //   262	191	6	$i$f$associate	I
    //   50	415	21	$continuation	Lkotlin/coroutines/Continuation;
    //   57	408	20	$result	Ljava/lang/Object;
  }
  
  @DebugMetadata(f = "TiktokenCL100KBaseEncoder.kt", l = {20}, i = {}, s = {}, n = {}, m = "load", c = "ai.grazie.nlp.encoder.tiktoken.cl100k.TiktokenCL100KBaseEncoder$Companion")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class TiktokenCL100KBaseEncoder$Companion$load$1 extends ContinuationImpl {
    int label;
    
    TiktokenCL100KBaseEncoder$Companion$load$1(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return TiktokenCL100KBaseEncoder.Companion.this.load(null, (Continuation<? super TiktokenEncoder>)this);
    }
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/nlp/encoder/tiktoken/cl100k/TiktokenCL100KBaseEncoder$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */