/*     */ package ai.grazie.nlp.langs;
/*     */ import ai.grazie.nlp.langs.alphabet.Alphabet;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import kotlin.Lazy;
/*     */ import kotlin.LazyKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.descriptors.PrimitiveKind;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Serializable(with = Language.Serializer.class)
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\020\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b(\b\001\030\000 +2\b\022\004\022\0020\0000\001:\002+,B\027\b\002\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\007\020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nj\002\b\013j\002\b\fj\002\b\rj\002\b\016j\002\b\017j\002\b\020j\002\b\021j\002\b\022j\002\b\023j\002\b\024j\002\b\025j\002\b\026j\002\b\027j\002\b\030j\002\b\031j\002\b\032j\002\b\033j\002\b\034j\002\b\035j\002\b\036j\002\b\037j\002\b j\002\b!j\002\b\"j\002\b#j\002\b$j\002\b%j\002\b&j\002\b'j\002\b(j\002\b)j\002\b*¨\006-"}, d2 = {"Lai/grazie/nlp/langs/Language;", "", "iso", "Lai/grazie/nlp/langs/LanguageISO;", "alphabet", "Lai/grazie/nlp/langs/alphabet/Alphabet;", "(Ljava/lang/String;ILai/grazie/nlp/langs/LanguageISO;Lai/grazie/nlp/langs/alphabet/Alphabet;)V", "getAlphabet", "()Lai/grazie/nlp/langs/alphabet/Alphabet;", "getIso", "()Lai/grazie/nlp/langs/LanguageISO;", "CHINESE", "JAPANESE", "KOREAN", "ENGLISH", "FRENCH", "GERMAN", "DUTCH", "ITALIAN", "POLISH", "PORTUGUESE", "ROMANIAN", "SLOVAK", "SPANISH", "ASTURIAN", "BRETON", "CATALAN", "DANISH", "ESPERANTO", "GALICIAN", "IRISH", "SLOVENE", "SWEDISH", "TAGALOG", "GREEK", "KHMER", "TAMIL", "ARABIC", "PERSIAN", "RUSSIAN", "UKRAINIAN", "BELARUSIAN", "UNKNOWN", "Companion", "Serializer", "nlp-langs"})
/*     */ public enum Language {
/*  23 */   CHINESE(LanguageISO.ZH, Alphabet.Companion.getCHINESE()),
/*  24 */   JAPANESE(LanguageISO.JA, Alphabet.Companion.getJAPANESE()),
/*  25 */   KOREAN(LanguageISO.KO, Alphabet.Companion.getKOREAN()),
/*     */   
/*  27 */   ENGLISH(LanguageISO.EN, Alphabet.Companion.getENGLISH()),
/*  28 */   FRENCH(LanguageISO.FR, Alphabet.Companion.getFRENCH()),
/*  29 */   GERMAN(LanguageISO.DE, Alphabet.Companion.getGERMAN()),
/*  30 */   DUTCH(LanguageISO.NL, Alphabet.Companion.getDUTCH()),
/*  31 */   ITALIAN(LanguageISO.IT, Alphabet.Companion.getITALIAN()),
/*  32 */   POLISH(LanguageISO.PL, Alphabet.Companion.getPOLISH()),
/*  33 */   PORTUGUESE(LanguageISO.PT, Alphabet.Companion.getPORTUGUESE()),
/*  34 */   ROMANIAN(LanguageISO.RO, Alphabet.Companion.getROMANIAN()),
/*  35 */   SLOVAK(LanguageISO.SK, Alphabet.Companion.getSLOVAK()),
/*  36 */   SPANISH(LanguageISO.ES, Alphabet.Companion.getSPANISH()),
/*  37 */   ASTURIAN(LanguageISO.AST, Alphabet.Companion.getASTURIAN()),
/*  38 */   BRETON(LanguageISO.BR, Alphabet.Companion.getBRETON()),
/*  39 */   CATALAN(LanguageISO.CA, Alphabet.Companion.getCATALAN()),
/*  40 */   DANISH(LanguageISO.DA, Alphabet.Companion.getDANISH()),
/*  41 */   ESPERANTO(LanguageISO.EO, Alphabet.Companion.getESPERANTO()),
/*  42 */   GALICIAN(LanguageISO.GL, Alphabet.Companion.getGALICIAN()),
/*  43 */   IRISH(LanguageISO.GA, Alphabet.Companion.getIRISH()),
/*  44 */   SLOVENE(LanguageISO.SL, Alphabet.Companion.getSLOVENE()),
/*  45 */   SWEDISH(LanguageISO.SV, Alphabet.Companion.getSWEDISH()),
/*  46 */   TAGALOG(LanguageISO.TL, Alphabet.Companion.getTAGALOG()),
/*     */   
/*  48 */   GREEK(LanguageISO.EL, Alphabet.Companion.getGREEK()),
/*     */   
/*  50 */   KHMER(LanguageISO.KM, Alphabet.Companion.getKHMER()),
/*     */   
/*  52 */   TAMIL(LanguageISO.TA, Alphabet.Companion.getTAMIL()),
/*     */   
/*  54 */   ARABIC(LanguageISO.AR, Alphabet.Companion.getARABIC()),
/*  55 */   PERSIAN(LanguageISO.FA, Alphabet.Companion.getPERSIAN()),
/*     */   
/*  57 */   RUSSIAN(LanguageISO.RU, Alphabet.Companion.getRUSSIAN()),
/*  58 */   UKRAINIAN(LanguageISO.UK, Alphabet.Companion.getUKRANIAN()),
/*  59 */   BELARUSIAN(LanguageISO.BE, Alphabet.Companion.getBELARUSIAN()),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  66 */   UNKNOWN(LanguageISO.UNKNOWN, Alphabet.Companion.getNONE()); @NotNull public static final Companion Companion; @NotNull private final LanguageISO iso; @NotNull private final Alphabet alphabet; @NotNull private static final Lazy<List<Language>> all$delegate; @NotNull private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate; Language(LanguageISO iso, Alphabet alphabet) { this.iso = iso; this.alphabet = alphabet; } @NotNull public final LanguageISO getIso() { return this.iso; } @NotNull public final Alphabet getAlphabet() { return this.alphabet; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÀ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\020\020\b\032\0020\0022\006\020\t\032\0020\nH\026J\030\020\013\032\0020\f2\006\020\r\032\0020\0162\006\020\017\032\0020\002H\026R\024\020\004\032\0020\0058VX\004¢\006\006\032\004\b\006\020\007¨\006\020"}, d2 = {"Lai/grazie/nlp/langs/Language$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/nlp/langs/Language;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "nlp-langs"}) public static final class Serializer implements KSerializer<Language> { @NotNull public static final Serializer INSTANCE = new Serializer(); @NotNull public Language deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); String value = decoder.decodeString(); if (Language.Companion.parse(value) == null) { Language.Companion.parse(value); throw new IllegalStateException(("Unknown language " + value).toString()); }  return Language.Companion.parse(value); } @NotNull public SerialDescriptor getDescriptor() { return SerialDescriptorsKt.PrimitiveSerialDescriptor("Language", (PrimitiveKind)PrimitiveKind.STRING.INSTANCE); } public void serialize(@NotNull Encoder encoder, @NotNull Language value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); Intrinsics.checkNotNullExpressionValue(value.getIso().name().toLowerCase(Locale.ROOT), "this as java.lang.String).toLowerCase(Locale.ROOT)"); encoder.encodeString(value.getIso().name().toLowerCase(Locale.ROOT)); } } static { Companion = new Companion(null);
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
/*  84 */     all$delegate = LazyKt.lazy(Language$Companion$all$2.INSTANCE); $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Language$Companion$$cachedSerializer$delegate$1.INSTANCE); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\n\032\0020\0052\006\020\013\032\0020\fJ\020\020\r\032\004\030\0010\0052\006\020\016\032\0020\017J\017\020\020\032\b\022\004\022\0020\0050\021HÆ\001R!\020\003\032\b\022\004\022\0020\0050\0048FX\002¢\006\f\n\004\b\b\020\t\032\004\b\006\020\007¨\006\022"}, d2 = {"Lai/grazie/nlp/langs/Language$Companion;", "", "()V", "all", "", "Lai/grazie/nlp/langs/Language;", "getAll", "()Ljava/util/List;", "all$delegate", "Lkotlin/Lazy;", "getByIsoCode6391", "isoCode", "Lai/grazie/nlp/langs/LanguageISO;", "parse", "text", "", "serializer", "Lkotlinx/serialization/KSerializer;", "nlp-langs"}) @SourceDebugExtension({"SMAP\nLanguage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Language.kt\nai/grazie/nlp/langs/Language$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<Language> serializer() { return (KSerializer<Language>)get$cachedSerializer$delegate().getValue(); } @NotNull public final List<Language> getAll() { Lazy lazy = Language.all$delegate; return (List<Language>)lazy.getValue(); } @NotNull public final Language getByIsoCode6391(@NotNull LanguageISO isoCode) { // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'isoCode'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: invokestatic values : ()[Lai/grazie/nlp/langs/Language;
/*     */       //   9: astore_2
/*     */       //   10: iconst_0
/*     */       //   11: istore_3
/*     */       //   12: aload_2
/*     */       //   13: arraylength
/*     */       //   14: istore #4
/*     */       //   16: iload_3
/*     */       //   17: iload #4
/*     */       //   19: if_icmpge -> 62
/*     */       //   22: aload_2
/*     */       //   23: iload_3
/*     */       //   24: aaload
/*     */       //   25: astore #5
/*     */       //   27: aload #5
/*     */       //   29: astore #6
/*     */       //   31: iconst_0
/*     */       //   32: istore #7
/*     */       //   34: aload #6
/*     */       //   36: invokevirtual getIso : ()Lai/grazie/nlp/langs/LanguageISO;
/*     */       //   39: aload_1
/*     */       //   40: if_acmpne -> 47
/*     */       //   43: iconst_1
/*     */       //   44: goto -> 48
/*     */       //   47: iconst_0
/*     */       //   48: ifeq -> 56
/*     */       //   51: aload #5
/*     */       //   53: goto -> 63
/*     */       //   56: iinc #3, 1
/*     */       //   59: goto -> 16
/*     */       //   62: aconst_null
/*     */       //   63: dup
/*     */       //   64: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */       //   67: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #89	-> 6
/*     */       //   #103	-> 31
/*     */       //   #89	-> 34
/*     */       //   #89	-> 48
/*     */       //   #89	-> 67
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   34	14	7	$i$a$-find-Language$Companion$getByIsoCode6391$1	I
/*     */       //   31	17	6	it	Lai/grazie/nlp/langs/Language;
/*     */       //   0	68	0	this	Lai/grazie/nlp/langs/Language$Companion;
/*     */       //   0	68	1	isoCode	Lai/grazie/nlp/langs/LanguageISO; } @Nullable public final Language parse(@NotNull String text) { // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'text'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aconst_null
/*     */       //   7: astore_2
/*     */       //   8: aload_1
/*     */       //   9: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*     */       //   12: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*     */       //   15: dup
/*     */       //   16: ldc 'this as java.lang.String).toLowerCase(Locale.ROOT)'
/*     */       //   18: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   21: astore_2
/*     */       //   22: aload_2
/*     */       //   23: checkcast java/lang/CharSequence
/*     */       //   26: ldc '-'
/*     */       //   28: checkcast java/lang/CharSequence
/*     */       //   31: iconst_0
/*     */       //   32: iconst_2
/*     */       //   33: aconst_null
/*     */       //   34: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*     */       //   37: ifeq -> 67
/*     */       //   40: aload_2
/*     */       //   41: checkcast java/lang/CharSequence
/*     */       //   44: iconst_1
/*     */       //   45: anewarray java/lang/String
/*     */       //   48: astore_3
/*     */       //   49: aload_3
/*     */       //   50: iconst_0
/*     */       //   51: ldc '-'
/*     */       //   53: aastore
/*     */       //   54: aload_3
/*     */       //   55: iconst_0
/*     */       //   56: iconst_0
/*     */       //   57: bipush #6
/*     */       //   59: aconst_null
/*     */       //   60: invokestatic split$default : (Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
/*     */       //   63: invokestatic first : (Ljava/util/List;)Ljava/lang/Object;
/*     */       //   66: astore_2
/*     */       //   67: invokestatic values : ()[Lai/grazie/nlp/langs/Language;
/*     */       //   70: astore #4
/*     */       //   72: iconst_0
/*     */       //   73: istore #5
/*     */       //   75: aload #4
/*     */       //   77: arraylength
/*     */       //   78: istore #6
/*     */       //   80: iload #5
/*     */       //   82: iload #6
/*     */       //   84: if_icmpge -> 195
/*     */       //   87: aload #4
/*     */       //   89: iload #5
/*     */       //   91: aaload
/*     */       //   92: astore #7
/*     */       //   94: aload #7
/*     */       //   96: astore #8
/*     */       //   98: iconst_0
/*     */       //   99: istore #9
/*     */       //   101: aload #8
/*     */       //   103: invokevirtual getIso : ()Lai/grazie/nlp/langs/LanguageISO;
/*     */       //   106: invokevirtual name : ()Ljava/lang/String;
/*     */       //   109: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*     */       //   112: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*     */       //   115: dup
/*     */       //   116: ldc 'this as java.lang.String).toLowerCase(Locale.ROOT)'
/*     */       //   118: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   121: aload_2
/*     */       //   122: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   125: ifne -> 176
/*     */       //   128: aload #8
/*     */       //   130: invokestatic getEnglishName : (Lai/grazie/nlp/langs/Language;)Ljava/lang/String;
/*     */       //   133: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*     */       //   136: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*     */       //   139: dup
/*     */       //   140: ldc 'this as java.lang.String).toLowerCase(Locale.ROOT)'
/*     */       //   142: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   145: aload_2
/*     */       //   146: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   149: ifne -> 176
/*     */       //   152: aload #8
/*     */       //   154: invokestatic getNativeName : (Lai/grazie/nlp/langs/Language;)Ljava/lang/String;
/*     */       //   157: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*     */       //   160: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*     */       //   163: dup
/*     */       //   164: ldc 'this as java.lang.String).toLowerCase(Locale.ROOT)'
/*     */       //   166: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   169: aload_2
/*     */       //   170: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   173: ifeq -> 180
/*     */       //   176: iconst_1
/*     */       //   177: goto -> 181
/*     */       //   180: iconst_0
/*     */       //   181: ifeq -> 189
/*     */       //   184: aload #7
/*     */       //   186: goto -> 196
/*     */       //   189: iinc #5, 1
/*     */       //   192: goto -> 80
/*     */       //   195: aconst_null
/*     */       //   196: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #92	-> 6
/*     */       //   #92	-> 21
/*     */       //   #94	-> 22
/*     */       //   #95	-> 40
/*     */       //   #98	-> 67
/*     */       //   #103	-> 98
/*     */       //   #98	-> 101
/*     */       //   #98	-> 121
/*     */       //   #98	-> 145
/*     */       //   #98	-> 169
/*     */       //   #98	-> 181
/*     */       //   #98	-> 196
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   101	80	9	$i$a$-find-Language$Companion$parse$1	I
/*     */       //   98	83	8	it	Lai/grazie/nlp/langs/Language;
/*     */       //   8	189	2	lowered	Ljava/lang/Object;
/*     */       //   0	197	0	this	Lai/grazie/nlp/langs/Language$Companion;
/*  84 */       //   0	197	1	text	Ljava/lang/String; } } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48) static final class Language$Companion$$cachedSerializer$delegate$1 extends Lambda implements Function0<KSerializer<Object>> { public static final Language$Companion$$cachedSerializer$delegate$1 INSTANCE = new Language$Companion$$cachedSerializer$delegate$1(); Language$Companion$$cachedSerializer$delegate$1() { super(0); } @NotNull public final KSerializer<Object> invoke() { return Language.Serializer.INSTANCE; } } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020 \n\002\030\002\n\000\020\000\032\b\022\004\022\0020\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/nlp/langs/Language;", "invoke"}) @SourceDebugExtension({"SMAP\nLanguage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Language.kt\nai/grazie/nlp/langs/Language$Companion$all$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,102:1\n4117#2:103\n4217#2,2:104\n*S KotlinDebug\n*F\n+ 1 Language.kt\nai/grazie/nlp/langs/Language$Companion$all$2\n*L\n84#1:103\n84#1:104,2\n*E\n"}) static final class Language$Companion$all$2 extends Lambda implements Function0<List<? extends Language>> { public static final Language$Companion$all$2 INSTANCE = new Language$Companion$all$2(); Language$Companion$all$2() { super(0); } @NotNull public final List<Language> invoke() { Language[] arrayOfLanguage1 = Language.values(); int $i$f$filterNot = 0;
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
/* 103 */       Language[] arrayOfLanguage2 = arrayOfLanguage1; Collection destination$iv$iv = new ArrayList(); int $i$f$filterNotTo = 0; byte b; int i;
/* 104 */       for (b = 0, i = arrayOfLanguage2.length; b < i; arrayOfLanguage = new Language[1], arrayOfLanguage[0] = Language.UNKNOWN) { Language[] arrayOfLanguage; Object element$iv$iv = arrayOfLanguage2[b], object1 = element$iv$iv; int $i$a$-filterNot-Language$Companion$all$2$1 = 0; }
/* 105 */        return (List<Language>)destination$iv$iv; }
/*     */      }
/*     */ 
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/nlp/langs/Language.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */