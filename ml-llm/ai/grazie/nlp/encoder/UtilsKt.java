/*    */ package ai.grazie.nlp.encoder;
/*    */ import java.util.Map;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Pair;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\032\n\000\n\002\020$\n\002\020\005\n\002\020\f\n\002\b\b\n\002\030\002\n\002\b\005\0322\020\013\032\016\022\004\022\002H\r\022\004\022\002H\0160\f\"\004\b\000\020\r\"\004\b\001\020\016*\002H\r2\006\020\017\032\002H\016H\004¢\006\002\020\020\"'\020\000\032\016\022\004\022\0020\002\022\004\022\0020\0030\0018FX\002¢\006\f\n\004\b\006\020\007\032\004\b\004\020\005\"'\020\b\032\016\022\004\022\0020\003\022\004\022\0020\0020\0018FX\002¢\006\f\n\004\b\n\020\007\032\004\b\t\020\005¨\006\021"}, d2 = {"bytesToUnicode", "", "", "", "getBytesToUnicode", "()Ljava/util/Map;", "bytesToUnicode$delegate", "Lkotlin/Lazy;", "unicodeToBytes", "getUnicodeToBytes", "unicodeToBytes$delegate", "toM", "Lai/grazie/nlp/encoder/MutablePair;", "First", "Second", "second", "(Ljava/lang/Object;Ljava/lang/Object;)Lai/grazie/nlp/encoder/MutablePair;", "nlp-encoder-engine"})
/*    */ public final class UtilsKt {
/*    */   @NotNull
/* 12 */   private static final Lazy bytesToUnicode$delegate = LazyKt.lazy(UtilsKt$bytesToUnicode$2.INSTANCE); @NotNull public static final Map<Byte, Character> getBytesToUnicode() { Lazy lazy = bytesToUnicode$delegate; return (Map<Byte, Character>)lazy.getValue(); }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020$\n\002\020\005\n\002\020\f\n\000\020\000\032\016\022\004\022\0020\002\022\004\022\0020\0030\001H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "", "", "invoke"})
/*    */   @SourceDebugExtension({"SMAP\nutils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 utils.kt\nai/grazie/nlp/encoder/UtilsKt$bytesToUnicode$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,54:1\n3433#2,7:55\n*S KotlinDebug\n*F\n+ 1 utils.kt\nai/grazie/nlp/encoder/UtilsKt$bytesToUnicode$2\n*L\n26#1:55,7\n*E\n"})
/*    */   static final class UtilsKt$bytesToUnicode$2 extends Lambda implements Function0<Map<Byte, ? extends Character>> {
/*    */     public static final UtilsKt$bytesToUnicode$2 INSTANCE = new UtilsKt$bytesToUnicode$2();
/*    */     
/*    */     @NotNull
/*    */     public final Map<Byte, Character> invoke() {
/*    */       // Byte code:
/*    */       //   0: new kotlin/ranges/IntRange
/*    */       //   3: dup
/*    */       //   4: bipush #33
/*    */       //   6: bipush #126
/*    */       //   8: invokespecial <init> : (II)V
/*    */       //   11: checkcast java/lang/Iterable
/*    */       //   14: invokestatic toList : (Ljava/lang/Iterable;)Ljava/util/List;
/*    */       //   17: checkcast java/util/Collection
/*    */       //   20: new kotlin/ranges/IntRange
/*    */       //   23: dup
/*    */       //   24: sipush #161
/*    */       //   27: sipush #172
/*    */       //   30: invokespecial <init> : (II)V
/*    */       //   33: checkcast java/lang/Iterable
/*    */       //   36: invokestatic toList : (Ljava/lang/Iterable;)Ljava/util/List;
/*    */       //   39: checkcast java/lang/Iterable
/*    */       //   42: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
/*    */       //   45: checkcast java/util/Collection
/*    */       //   48: new kotlin/ranges/IntRange
/*    */       //   51: dup
/*    */       //   52: sipush #174
/*    */       //   55: sipush #255
/*    */       //   58: invokespecial <init> : (II)V
/*    */       //   61: checkcast java/lang/Iterable
/*    */       //   64: invokestatic toList : (Ljava/lang/Iterable;)Ljava/util/List;
/*    */       //   67: checkcast java/lang/Iterable
/*    */       //   70: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
/*    */       //   73: checkcast java/util/Collection
/*    */       //   76: invokestatic toMutableList : (Ljava/util/Collection;)Ljava/util/List;
/*    */       //   79: astore_1
/*    */       //   80: aload_1
/*    */       //   81: checkcast java/util/Collection
/*    */       //   84: invokestatic toMutableList : (Ljava/util/Collection;)Ljava/util/List;
/*    */       //   87: astore_2
/*    */       //   88: sipush #256
/*    */       //   91: istore_3
/*    */       //   92: iconst_0
/*    */       //   93: istore #4
/*    */       //   95: iconst_0
/*    */       //   96: istore #5
/*    */       //   98: iload #5
/*    */       //   100: iload_3
/*    */       //   101: if_icmpge -> 154
/*    */       //   104: aload_1
/*    */       //   105: iload #5
/*    */       //   107: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */       //   110: invokeinterface contains : (Ljava/lang/Object;)Z
/*    */       //   115: ifne -> 148
/*    */       //   118: aload_1
/*    */       //   119: iload #5
/*    */       //   121: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */       //   124: invokeinterface add : (Ljava/lang/Object;)Z
/*    */       //   129: pop
/*    */       //   130: aload_2
/*    */       //   131: iload_3
/*    */       //   132: iload #4
/*    */       //   134: iadd
/*    */       //   135: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */       //   138: invokeinterface add : (Ljava/lang/Object;)Z
/*    */       //   143: pop
/*    */       //   144: iinc #4, 1
/*    */       //   147: nop
/*    */       //   148: iinc #5, 1
/*    */       //   151: goto -> 98
/*    */       //   154: aload_1
/*    */       //   155: checkcast java/lang/Iterable
/*    */       //   158: astore #5
/*    */       //   160: iconst_0
/*    */       //   161: istore #6
/*    */       //   163: aload #5
/*    */       //   165: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */       //   170: astore #7
/*    */       //   172: aload_2
/*    */       //   173: checkcast java/lang/Iterable
/*    */       //   176: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */       //   181: astore #8
/*    */       //   183: new java/util/ArrayList
/*    */       //   186: dup
/*    */       //   187: aload #5
/*    */       //   189: bipush #10
/*    */       //   191: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*    */       //   194: aload_2
/*    */       //   195: checkcast java/lang/Iterable
/*    */       //   198: bipush #10
/*    */       //   200: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*    */       //   203: invokestatic min : (II)I
/*    */       //   206: invokespecial <init> : (I)V
/*    */       //   209: astore #9
/*    */       //   211: aload #7
/*    */       //   213: invokeinterface hasNext : ()Z
/*    */       //   218: ifeq -> 333
/*    */       //   221: aload #8
/*    */       //   223: invokeinterface hasNext : ()Z
/*    */       //   228: ifeq -> 333
/*    */       //   231: aload #9
/*    */       //   233: aload #7
/*    */       //   235: invokeinterface next : ()Ljava/lang/Object;
/*    */       //   240: aload #8
/*    */       //   242: invokeinterface next : ()Ljava/lang/Object;
/*    */       //   247: checkcast java/lang/Number
/*    */       //   250: invokevirtual intValue : ()I
/*    */       //   253: istore #10
/*    */       //   255: checkcast java/lang/Number
/*    */       //   258: invokevirtual intValue : ()I
/*    */       //   261: istore #11
/*    */       //   263: astore #13
/*    */       //   265: iconst_0
/*    */       //   266: istore #12
/*    */       //   268: iload #11
/*    */       //   270: i2b
/*    */       //   271: invokestatic valueOf : (B)Ljava/lang/Byte;
/*    */       //   274: iload #10
/*    */       //   276: iflt -> 286
/*    */       //   279: iload #10
/*    */       //   281: ldc 65535
/*    */       //   283: if_icmple -> 314
/*    */       //   286: new java/lang/IllegalArgumentException
/*    */       //   289: dup
/*    */       //   290: new java/lang/StringBuilder
/*    */       //   293: dup
/*    */       //   294: invokespecial <init> : ()V
/*    */       //   297: ldc 'Invalid Char code: '
/*    */       //   299: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */       //   302: iload #10
/*    */       //   304: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */       //   307: invokevirtual toString : ()Ljava/lang/String;
/*    */       //   310: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   313: athrow
/*    */       //   314: iload #10
/*    */       //   316: i2c
/*    */       //   317: invokestatic valueOf : (C)Ljava/lang/Character;
/*    */       //   320: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
/*    */       //   323: aload #13
/*    */       //   325: swap
/*    */       //   326: invokevirtual add : (Ljava/lang/Object;)Z
/*    */       //   329: pop
/*    */       //   330: goto -> 211
/*    */       //   333: aload #9
/*    */       //   335: checkcast java/util/List
/*    */       //   338: checkcast java/lang/Iterable
/*    */       //   341: invokestatic toMap : (Ljava/lang/Iterable;)Ljava/util/Map;
/*    */       //   344: areturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #13	-> 0
/*    */       //   #14	-> 80
/*    */       //   #16	-> 88
/*    */       //   #18	-> 92
/*    */       //   #19	-> 95
/*    */       //   #20	-> 104
/*    */       //   #21	-> 118
/*    */       //   #22	-> 130
/*    */       //   #23	-> 147
/*    */       //   #19	-> 148
/*    */       //   #26	-> 154
/*    */       //   #55	-> 163
/*    */       //   #56	-> 172
/*    */       //   #57	-> 183
/*    */       //   #57	-> 206
/*    */       //   #58	-> 211
/*    */       //   #59	-> 231
/*    */       //   #26	-> 268
/*    */       //   #26	-> 320
/*    */       //   #59	-> 326
/*    */       //   #61	-> 333
/*    */       //   #26	-> 341
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   98	56	5	b	I
/*    */       //   268	55	12	$i$a$-zip-UtilsKt$bytesToUnicode$2$1	I
/*    */       //   265	58	11	b	I
/*    */       //   265	58	10	c	I
/*    */       //   163	175	6	$i$f$zip	I
/*    */       //   172	166	7	first$iv	Ljava/util/Iterator;
/*    */       //   183	155	8	second$iv	Ljava/util/Iterator;
/*    */       //   211	127	9	list$iv	Ljava/util/ArrayList;
/*    */       //   160	178	5	$this$zip$iv	Ljava/lang/Iterable;
/*    */       //   80	265	1	bs	Ljava/util/List;
/*    */       //   88	257	2	cs	Ljava/util/List;
/*    */       //   92	253	3	byteRange	I
/*    */       //   95	250	4	n	I
/*    */       //   0	345	0	this	Lai/grazie/nlp/encoder/UtilsKt$bytesToUnicode$2;
/*    */     }
/*    */     
/*    */     UtilsKt$bytesToUnicode$2() {
/*    */       super(0);
/*    */     } }
/*    */   @NotNull
/* 29 */   private static final Lazy unicodeToBytes$delegate = LazyKt.lazy(UtilsKt$unicodeToBytes$2.INSTANCE); @NotNull public static final Map<Character, Byte> getUnicodeToBytes() { Lazy lazy = unicodeToBytes$delegate; return (Map<Character, Byte>)lazy.getValue(); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020$\n\002\020\f\n\002\020\005\n\000\020\000\032\016\022\004\022\0020\002\022\004\022\0020\0030\001H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "", "", "invoke"}) @SourceDebugExtension({"SMAP\nutils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 utils.kt\nai/grazie/nlp/encoder/UtilsKt$unicodeToBytes$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,54:1\n1179#2,2:55\n1253#2,4:57\n*S KotlinDebug\n*F\n+ 1 utils.kt\nai/grazie/nlp/encoder/UtilsKt$unicodeToBytes$2\n*L\n30#1:55,2\n30#1:57,4\n*E\n"}) static final class UtilsKt$unicodeToBytes$2 extends Lambda implements Function0<Map<Character, ? extends Byte>> { public static final UtilsKt$unicodeToBytes$2 INSTANCE = new UtilsKt$unicodeToBytes$2(); @NotNull
/* 30 */     public final Map<Character, Byte> invoke() { Iterable<Map.Entry<Byte, Character>> $this$associate$iv = UtilsKt.getBytesToUnicode().entrySet(); int $i$f$associate = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 55 */       int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associate$iv, 10)), 16);
/* 56 */       Iterable<Map.Entry<Byte, Character>> iterable1 = $this$associate$iv; Map<Object, Object> destination$iv$iv = new LinkedHashMap<>(capacity$iv); int $i$f$associateTo = 0;
/* 57 */       for (Object<Byte, Character> element$iv$iv : iterable1) {
/* 58 */         Map<Object, Object> map = destination$iv$iv; Map.Entry it = (Map.Entry)element$iv$iv; int $i$a$-associate-UtilsKt$unicodeToBytes$2$1 = 0; Pair pair = TuplesKt.to(it.getValue(), it.getKey()); map.put(pair.getFirst(), pair.getSecond());
/*    */       } 
/* 60 */       return (Map)destination$iv$iv; }
/*    */ 
/*    */     
/*    */     UtilsKt$unicodeToBytes$2() {
/*    */       super(0);
/*    */     } }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final <First, Second> MutablePair<First, Second> toM(Object $this$toM, Object second) {
/*    */     return new MutablePair<>((First)$this$toM, (Second)second);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/nlp/encoder/UtilsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */