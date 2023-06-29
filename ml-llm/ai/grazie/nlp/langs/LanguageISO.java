/*     */ package ai.grazie.nlp.langs;
/*     */ 
/*     */ import java.util.Locale;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Lazy;
/*     */ import kotlin.LazyKt;
/*     */ import kotlin.LazyThreadSafetyMode;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.EnumDescriptor;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ @Serializable
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\020\n\002\b\002\n\002\020\016\n\002\b#\b\001\030\000 &2\b\022\004\022\0020\0000\001:\002%&B\007\b\002¢\006\002\020\002J\b\020\003\032\0020\004H\026j\002\b\005j\002\b\006j\002\b\007j\002\b\bj\002\b\tj\002\b\nj\002\b\013j\002\b\fj\002\b\rj\002\b\016j\002\b\017j\002\b\020j\002\b\021j\002\b\022j\002\b\023j\002\b\024j\002\b\025j\002\b\026j\002\b\027j\002\b\030j\002\b\031j\002\b\032j\002\b\033j\002\b\034j\002\b\035j\002\b\036j\002\b\037j\002\b j\002\b!j\002\b\"j\002\b#j\002\b$¨\006'"}, d2 = {"Lai/grazie/nlp/langs/LanguageISO;", "", "(Ljava/lang/String;I)V", "toString", "", "AST", "DE", "EL", "KM", "EN", "SL", "SV", "TL", "BR", "EO", "CA", "GL", "GA", "DA", "ES", "TA", "AR", "FA", "FR", "IT", "JA", "KO", "NL", "PL", "PT", "RO", "RU", "SK", "UK", "BE", "ZH", "UNKNOWN", "$serializer", "Companion", "nlp-langs"})
/*     */ public enum LanguageISO
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion;
/*  34 */   AST,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  39 */   DE,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  44 */   EL,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  49 */   KM,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  54 */   EN,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  59 */   SL,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  64 */   SV,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  69 */   TL,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  74 */   BR,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  79 */   EO,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  84 */   CA,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  89 */   GL,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  94 */   GA,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  99 */   DA,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 104 */   ES,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 109 */   TA,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 114 */   AR,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 119 */   FA,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 124 */   FR,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 129 */   IT,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 134 */   JA,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 139 */   KO,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 144 */   NL,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 149 */   PL,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 154 */   PT,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 159 */   RO,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 164 */   RU,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 169 */   SK,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 174 */   UK,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 179 */   BE,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 184 */   ZH,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 189 */   UNKNOWN; @NotNull private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate; @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/nlp/langs/LanguageISO.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/nlp/langs/LanguageISO;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "nlp-langs"}) public static final class $serializer implements GeneratedSerializer<LanguageISO> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { return (KSerializer<?>[])new KSerializer[0]; } @NotNull public LanguageISO deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); return LanguageISO.values()[decoder.decodeEnum(getDescriptor())]; } public void serialize(@NotNull Encoder encoder, @NotNull LanguageISO value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); encoder.encodeEnum(getDescriptor(), value.ordinal()); } static { EnumDescriptor enumDescriptor = new EnumDescriptor("ai.grazie.nlp.langs.LanguageISO", 32); enumDescriptor.addElement("AST", false); enumDescriptor.addElement("DE", false); enumDescriptor.addElement("EL", false); enumDescriptor.addElement("KM", false); enumDescriptor.addElement("EN", false); enumDescriptor.addElement("SL", false); enumDescriptor.addElement("SV", false); enumDescriptor.addElement("TL", false); enumDescriptor.addElement("BR", false); enumDescriptor.addElement("EO", false); enumDescriptor.addElement("CA", false); enumDescriptor.addElement("GL", false); enumDescriptor.addElement("GA", false); enumDescriptor.addElement("DA", false); enumDescriptor.addElement("ES", false); enumDescriptor.addElement("TA", false); enumDescriptor.addElement("AR", false); enumDescriptor.addElement("FA", false); enumDescriptor.addElement("FR", false); enumDescriptor.addElement("IT", false); enumDescriptor.addElement("JA", false); enumDescriptor.addElement("KO", false); enumDescriptor.addElement("NL", false); enumDescriptor.addElement("PL", false); enumDescriptor.addElement("PT", false); enumDescriptor.addElement("RO", false); enumDescriptor.addElement("RU", false); enumDescriptor.addElement("SK", false); enumDescriptor.addElement("UK", false); enumDescriptor.addElement("BE", false); enumDescriptor.addElement("ZH", false); enumDescriptor.addElement("UNKNOWN", false); descriptor = enumDescriptor; } } static { Companion = new Companion(null);
/*     */ 
/*     */ 
/*     */     
/* 193 */     $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, LanguageISO$Companion$$cachedSerializer$delegate$1.INSTANCE); } @NotNull public String toString() { Intrinsics.checkNotNullExpressionValue(name().toLowerCase(Locale.ROOT), "this as java.lang.String).toLowerCase(Locale.ROOT)"); return name().toLowerCase(Locale.ROOT); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48) static final class LanguageISO$Companion$$cachedSerializer$delegate$1 extends Lambda implements Function0<KSerializer<Object>> { public static final LanguageISO$Companion$$cachedSerializer$delegate$1 INSTANCE = new LanguageISO$Companion$$cachedSerializer$delegate$1(); LanguageISO$Companion$$cachedSerializer$delegate$1() { super(0); } @NotNull public final KSerializer<Object> invoke() { return (KSerializer<Object>)LanguageISO.$serializer.INSTANCE; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\003\032\004\030\0010\0042\006\020\005\032\0020\006J\017\020\007\032\b\022\004\022\0020\0040\bHÆ\001¨\006\t"}, d2 = {"Lai/grazie/nlp/langs/LanguageISO$Companion;", "", "()V", "parse", "Lai/grazie/nlp/langs/LanguageISO;", "code", "", "serializer", "Lkotlinx/serialization/KSerializer;", "nlp-langs"}) @SourceDebugExtension({"SMAP\nLanguageISO.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageISO.kt\nai/grazie/nlp/langs/LanguageISO$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,199:1\n1#2:200\n*E\n"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<LanguageISO> serializer() { return (KSerializer<LanguageISO>)get$cachedSerializer$delegate().getValue(); }
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public final LanguageISO parse(@NotNull String code) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'code'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: invokestatic values : ()[Lai/grazie/nlp/langs/LanguageISO;
/*     */       //   9: astore_2
/*     */       //   10: iconst_0
/*     */       //   11: istore_3
/*     */       //   12: aload_2
/*     */       //   13: arraylength
/*     */       //   14: istore #4
/*     */       //   16: iload_3
/*     */       //   17: iload #4
/*     */       //   19: if_icmpge -> 82
/*     */       //   22: aload_2
/*     */       //   23: iload_3
/*     */       //   24: aaload
/*     */       //   25: astore #5
/*     */       //   27: aload #5
/*     */       //   29: astore #6
/*     */       //   31: iconst_0
/*     */       //   32: istore #7
/*     */       //   34: aload #6
/*     */       //   36: invokevirtual name : ()Ljava/lang/String;
/*     */       //   39: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*     */       //   42: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*     */       //   45: dup
/*     */       //   46: ldc 'this as java.lang.String).toLowerCase(Locale.ROOT)'
/*     */       //   48: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   51: aload_1
/*     */       //   52: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*     */       //   55: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*     */       //   58: dup
/*     */       //   59: ldc 'this as java.lang.String).toLowerCase(Locale.ROOT)'
/*     */       //   61: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   64: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   67: nop
/*     */       //   68: ifeq -> 76
/*     */       //   71: aload #5
/*     */       //   73: goto -> 83
/*     */       //   76: iinc #3, 1
/*     */       //   79: goto -> 16
/*     */       //   82: aconst_null
/*     */       //   83: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #195	-> 6
/*     */       //   #200	-> 31
/*     */       //   #195	-> 34
/*     */       //   #195	-> 51
/*     */       //   #195	-> 67
/*     */       //   #195	-> 68
/*     */       //   #195	-> 83
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   34	34	7	$i$a$-find-LanguageISO$Companion$parse$1	I
/*     */       //   31	37	6	it	Lai/grazie/nlp/langs/LanguageISO;
/*     */       //   0	84	0	this	Lai/grazie/nlp/langs/LanguageISO$Companion;
/*     */       //   0	84	1	code	Ljava/lang/String;
/*     */     } }
/*     */ 
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/nlp/langs/LanguageISO.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */