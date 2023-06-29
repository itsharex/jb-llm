/*     */ package ai.grazie.utils.mpp.number;
/*     */ 
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\020\000\n\000\n\002\020\t\n\002\b\005\n\002\020\006\n\000\n\002\020\007\n\000\n\002\020\016\n\002\b\004\n\002\020\b\n\002\b\002\n\002\020\013\n\002\b\t\b\007\030\000 \0352\0020\001:\001\035B\027\b\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\002\020\005B\037\b\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\006\032\0020\003¢\006\002\020\007B\017\b\027\022\006\020\b\032\0020\t¢\006\002\020\nB\017\b\027\022\006\020\b\032\0020\013¢\006\002\020\fB\017\b\027\022\006\020\b\032\0020\r¢\006\002\020\016J\006\020\017\032\0020\tJ\006\020\020\032\0020\013J\021\020\021\032\0020\0222\006\020\023\032\0020\000H\002J\023\020\024\032\0020\0252\b\020\023\032\004\030\0010\001H\002J\b\020\026\032\0020\022H\026J\021\020\027\032\0020\0002\006\020\023\032\0020\000H\002J\021\020\030\032\0020\0002\006\020\023\032\0020\000H\002J\021\020\031\032\0020\0002\006\020\023\032\0020\022H\002J\b\020\032\032\0020\rH\026J\006\020\033\032\0020\rJ\006\020\034\032\0020\rR\016\020\004\032\0020\003X\004¢\006\002\n\000R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\036"}, d2 = {"Lai/grazie/utils/mpp/number/FixedPrecisionFloat;", "", "integer", "", "fraction", "(JJ)V", "exponent", "(JJJ)V", "value", "", "(D)V", "", "(F)V", "", "(Ljava/lang/String;)V", "asDouble", "asFloat", "compareTo", "", "other", "equals", "", "hashCode", "minus", "plus", "times", "toString", "toStringFraction", "toStringInteger", "Companion", "utils-common"})
/*     */ @SourceDebugExtension({"SMAP\nFixedPrecisionFloat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FixedPrecisionFloat.kt\nai/grazie/utils/mpp/number/FixedPrecisionFloat\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,132:1\n141#2:133\n130#2,5:134\n*S KotlinDebug\n*F\n+ 1 FixedPrecisionFloat.kt\nai/grazie/utils/mpp/number/FixedPrecisionFloat\n*L\n108#1:133\n108#1:134,5\n*E\n"})
/*     */ public final class FixedPrecisionFloat
/*     */ {
/*     */   public FixedPrecisionFloat(long integer, long fraction) {
/*  25 */     this.integer = integer + fraction / 1000000000000L;
/*  26 */     this.fraction = fraction % 1000000000000L;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FixedPrecisionFloat(long integer, long fraction, long exponent) {
/*  37 */     this(integer, fraction * 1000000000000L / exponent);
/*     */   }
/*     */   public FixedPrecisionFloat(double value) {
/*  40 */     this((long)value, (long)(value % true * 1000000000000L));
/*     */   }
/*     */   public FixedPrecisionFloat(float value) {
/*  43 */     this((long)value, (long)(value % true * (float)1000000000000L));
/*     */   }
/*     */   
/*     */   public FixedPrecisionFloat(@NotNull String value) {
/*  47 */     char[] arrayOfChar = new char[1]; arrayOfChar[0] = '.'; List<String> list = StringsKt.split$default(value, arrayOfChar, false, 0, 6, null); String integer = list.get(0), fraction = list.get(1);
/*  48 */     this.integer = Long.parseLong(integer);
/*  49 */     this.fraction = Long.parseLong(StringsKt.padEnd(fraction, 12, '0'));
/*     */   }
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\t\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\016\020\007\032\0020\bXT¢\006\002\n\000¨\006\t"}, d2 = {"Lai/grazie/utils/mpp/number/FixedPrecisionFloat$Companion;", "", "()V", "ZERO", "Lai/grazie/utils/mpp/number/FixedPrecisionFloat;", "getZERO", "()Lai/grazie/utils/mpp/number/FixedPrecisionFloat;", "exponent", "", "utils-common"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     @NotNull
/*  55 */     public final FixedPrecisionFloat getZERO() { return FixedPrecisionFloat.ZERO; } } @NotNull public static final Companion Companion = new Companion(null); private final long integer; private final long fraction; private static final long exponent = 1000000000000L; @NotNull private static final FixedPrecisionFloat ZERO = new FixedPrecisionFloat(0L, 0L);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final float asFloat() {
/*  62 */     return (float)this.integer + (float)this.fraction / 1.0E12F;
/*     */   }
/*     */ 
/*     */   
/*     */   public final double asDouble() {
/*  67 */     return this.integer + this.fraction / 1.0E12D;
/*     */   } @NotNull
/*     */   public final FixedPrecisionFloat plus(@NotNull FixedPrecisionFloat other) {
/*  70 */     Intrinsics.checkNotNullParameter(other, "other"); long fraction = this.fraction + other.fraction;
/*  71 */     long integer = this.integer + other.integer + fraction / 1000000000000L;
/*  72 */     return new FixedPrecisionFloat(integer, fraction % 1000000000000L);
/*     */   }
/*     */   @NotNull
/*     */   public final FixedPrecisionFloat times(int other) {
/*  76 */     long fraction = this.fraction * other % 1000000000000L;
/*  77 */     long integer = this.integer * other + fraction / 1000000000000L;
/*  78 */     return new FixedPrecisionFloat(integer, fraction % 1000000000000L);
/*     */   }
/*     */   @NotNull
/*     */   public final FixedPrecisionFloat minus(@NotNull FixedPrecisionFloat other) {
/*  82 */     Intrinsics.checkNotNullParameter(other, "other"); long fraction = this.fraction - other.fraction;
/*  83 */     if (fraction >= 0L) {
/*  84 */       return new FixedPrecisionFloat(this.integer - other.integer, fraction);
/*     */     }
/*  86 */     if (fraction < 0L) {
/*  87 */       return new FixedPrecisionFloat(this.integer - other.integer - 1L, fraction + 1000000000000L);
/*     */     }
/*  89 */     long integer = this.integer - other.integer - fraction / 1000000000000L;
/*  90 */     return new FixedPrecisionFloat(integer, fraction % 1000000000000L);
/*     */   }
/*     */   
/*     */   public final int compareTo(@NotNull FixedPrecisionFloat other) {
/*  94 */     Intrinsics.checkNotNullParameter(other, "other"); if (this.integer != other.integer) {
/*  95 */       return Intrinsics.compare(this.integer, other.integer);
/*     */     }
/*  97 */     return Intrinsics.compare(this.fraction, other.fraction);
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final String toStringInteger() {
/* 103 */     return String.valueOf(this.integer);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String toStringFraction() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield fraction : J
/*     */     //   4: invokestatic valueOf : (J)Ljava/lang/String;
/*     */     //   7: bipush #12
/*     */     //   9: bipush #48
/*     */     //   11: invokestatic padStart : (Ljava/lang/String;IC)Ljava/lang/String;
/*     */     //   14: astore_1
/*     */     //   15: iconst_0
/*     */     //   16: istore_2
/*     */     //   17: aload_1
/*     */     //   18: checkcast java/lang/CharSequence
/*     */     //   21: astore_3
/*     */     //   22: iconst_0
/*     */     //   23: istore #4
/*     */     //   25: aload_3
/*     */     //   26: invokeinterface length : ()I
/*     */     //   31: iconst_m1
/*     */     //   32: iadd
/*     */     //   33: istore #5
/*     */     //   35: iconst_0
/*     */     //   36: iload #5
/*     */     //   38: if_icmpgt -> 96
/*     */     //   41: iload #5
/*     */     //   43: istore #6
/*     */     //   45: iinc #5, -1
/*     */     //   48: aload_3
/*     */     //   49: iload #6
/*     */     //   51: invokeinterface charAt : (I)C
/*     */     //   56: istore #7
/*     */     //   58: iconst_0
/*     */     //   59: istore #8
/*     */     //   61: iload #7
/*     */     //   63: bipush #48
/*     */     //   65: if_icmpne -> 72
/*     */     //   68: iconst_1
/*     */     //   69: goto -> 73
/*     */     //   72: iconst_0
/*     */     //   73: ifne -> 90
/*     */     //   76: aload_3
/*     */     //   77: iconst_0
/*     */     //   78: iload #6
/*     */     //   80: iconst_1
/*     */     //   81: iadd
/*     */     //   82: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
/*     */     //   87: goto -> 101
/*     */     //   90: iconst_0
/*     */     //   91: iload #5
/*     */     //   93: if_icmple -> 41
/*     */     //   96: ldc ''
/*     */     //   98: checkcast java/lang/CharSequence
/*     */     //   101: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   104: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #108	-> 0
/*     */     //   #133	-> 17
/*     */     //   #134	-> 25
/*     */     //   #135	-> 48
/*     */     //   #108	-> 61
/*     */     //   #135	-> 73
/*     */     //   #136	-> 76
/*     */     //   #134	-> 90
/*     */     //   #138	-> 96
/*     */     //   #133	-> 101
/*     */     //   #108	-> 104
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   61	12	8	$i$a$-trimEnd-FixedPrecisionFloat$toStringFraction$1	I
/*     */     //   58	15	7	it	C
/*     */     //   45	51	6	index$iv$iv	I
/*     */     //   25	76	4	$i$f$trimEnd	I
/*     */     //   22	79	3	$this$trimEnd$iv$iv	Ljava/lang/CharSequence;
/*     */     //   17	87	2	$i$f$trimEnd	I
/*     */     //   15	89	1	$this$trimEnd$iv	Ljava/lang/String;
/*     */     //   0	105	0	this	Lai/grazie/utils/mpp/number/FixedPrecisionFloat;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/* 113 */     return toStringInteger() + "." + toStringInteger();
/*     */   }
/*     */   public boolean equals(@Nullable Object other) {
/* 116 */     if (this == other) return true; 
/* 117 */     if (other == null || getClass() != other.getClass()) return false;
/*     */     
/* 119 */     (FixedPrecisionFloat)other;
/*     */     
/* 121 */     if (this.integer != ((FixedPrecisionFloat)other).integer) return false; 
/* 122 */     return (this.fraction == ((FixedPrecisionFloat)other).fraction);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/* 126 */     int result = Long.hashCode(this.integer);
/* 127 */     result = 31 * result + Long.hashCode(this.fraction);
/* 128 */     return result;
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/mpp/number/FixedPrecisionFloat.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */