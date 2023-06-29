/*    */ package ai.grazie.model.cloud.ip;
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\020\022\n\002\b\004\n\002\020\016\n\002\b\004\030\000 \0132\0020\001:\001\013B\r\022\006\020\002\032\0020\003¢\006\002\020\004R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\005\020\006R\024\020\007\032\0020\bX\004¢\006\b\n\000\032\004\b\t\020\n¨\006\f"}, d2 = {"Lai/grazie/model/cloud/ip/IPv4Address;", "Lai/grazie/model/cloud/ip/IPAddress;", "bytes", "", "([B)V", "getBytes", "()[B", "display", "", "getDisplay", "()Ljava/lang/String;", "Companion", "model-cloud"})
/*    */ @SourceDebugExtension({"SMAP\nIPv4Address.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IPv4Address.kt\nai/grazie/model/cloud/ip/IPv4Address\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n1#2:32\n*E\n"})
/*    */ public final class IPv4Address implements IPAddress { @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*  6 */   public IPv4Address(@NotNull byte[] bytes) { this.bytes = bytes;
/*    */     
/*  8 */     if (!(((getBytes()).length == 4) ? 1 : 0)) {
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
/* 32 */       int $i$a$-require-IPv4Address$1 = 0; String str = "Invalid IPv4 address: " + getDisplay(); throw new IllegalArgumentException(str.toString());
/*    */     }  this.display = ArraysKt.joinToString$default(getBytes(), ".", null, null, 0, null, IPv4Address$display$1.INSTANCE, 30, null); } @NotNull private final byte[] bytes; @NotNull private final String display; @NotNull public byte[] getBytes() { return this.bytes; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\013\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J\016\020\007\032\0020\b2\006\020\005\032\0020\006J\020\020\t\032\004\030\0010\b2\006\020\005\032\0020\006¨\006\n"}, d2 = {"Lai/grazie/model/cloud/ip/IPv4Address$Companion;", "", "()V", "check", "", "ip", "", "parse", "Lai/grazie/model/cloud/ip/IPv4Address;", "parseOrNull", "model-cloud"}) @SourceDebugExtension({"SMAP\nIPv4Address.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IPv4Address.kt\nai/grazie/model/cloud/ip/IPv4Address$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,31:1\n1726#2,3:32\n1549#2:35\n1620#2,3:36\n*S KotlinDebug\n*F\n+ 1 IPv4Address.kt\nai/grazie/model/cloud/ip/IPv4Address$Companion\n*L\n15#1:32,3\n20#1:35\n20#1:36,3\n*E\n"}) public static final class Companion {
/*    */     private Companion() {} @Nullable public final IPv4Address parseOrNull(@NotNull String ip) { Intrinsics.checkNotNullParameter(ip, "ip"); if (!check(ip))
/* 35 */         return null;  String[] arrayOfString = new String[1]; arrayOfString[0] = "."; Iterable $this$map$iv = StringsKt.split$default(ip, arrayOfString, false, 0, 6, null); int $i$f$map = 0; Iterable iterable1 = $this$map$iv; Collection<Byte> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 36 */       for (Object item$iv$iv : iterable1) {
/* 37 */         String str = (String)item$iv$iv; Collection<Byte> collection = destination$iv$iv; int $i$a$-map-IPv4Address$Companion$parseOrNull$bytes$1 = 0; collection.add(Byte.valueOf(UStringsKt.toUByte(str)));
/* 38 */       }  byte[] bytes = CollectionsKt.toByteArray(destination$iv$iv);
/*    */       return new IPv4Address(bytes); }
/*    */ 
/*    */     
/*    */     public final boolean check(@NotNull String ip) {
/*    */       // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: ldc 'ip'
/*    */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   6: aload_1
/*    */       //   7: checkcast java/lang/CharSequence
/*    */       //   10: iconst_1
/*    */       //   11: anewarray java/lang/String
/*    */       //   14: astore_3
/*    */       //   15: aload_3
/*    */       //   16: iconst_0
/*    */       //   17: ldc '.'
/*    */       //   19: aastore
/*    */       //   20: aload_3
/*    */       //   21: iconst_0
/*    */       //   22: iconst_0
/*    */       //   23: bipush #6
/*    */       //   25: aconst_null
/*    */       //   26: invokestatic split$default : (Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
/*    */       //   29: astore_2
/*    */       //   30: aload_2
/*    */       //   31: invokeinterface size : ()I
/*    */       //   36: iconst_4
/*    */       //   37: if_icmpeq -> 42
/*    */       //   40: iconst_0
/*    */       //   41: ireturn
/*    */       //   42: aload_2
/*    */       //   43: checkcast java/lang/Iterable
/*    */       //   46: astore_3
/*    */       //   47: iconst_0
/*    */       //   48: istore #4
/*    */       //   50: aload_3
/*    */       //   51: instanceof java/util/Collection
/*    */       //   54: ifeq -> 73
/*    */       //   57: aload_3
/*    */       //   58: checkcast java/util/Collection
/*    */       //   61: invokeinterface isEmpty : ()Z
/*    */       //   66: ifeq -> 73
/*    */       //   69: iconst_1
/*    */       //   70: goto -> 162
/*    */       //   73: aload_3
/*    */       //   74: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */       //   79: astore #5
/*    */       //   81: aload #5
/*    */       //   83: invokeinterface hasNext : ()Z
/*    */       //   88: ifeq -> 161
/*    */       //   91: aload #5
/*    */       //   93: invokeinterface next : ()Ljava/lang/Object;
/*    */       //   98: astore #6
/*    */       //   100: aload #6
/*    */       //   102: checkcast java/lang/String
/*    */       //   105: astore #7
/*    */       //   107: iconst_0
/*    */       //   108: istore #8
/*    */       //   110: new kotlin/ranges/IntRange
/*    */       //   113: dup
/*    */       //   114: iconst_0
/*    */       //   115: sipush #255
/*    */       //   118: invokespecial <init> : (II)V
/*    */       //   121: astore #9
/*    */       //   123: aload #7
/*    */       //   125: invokestatic toIntOrNull : (Ljava/lang/String;)Ljava/lang/Integer;
/*    */       //   128: astore #10
/*    */       //   130: aload #10
/*    */       //   132: ifnull -> 152
/*    */       //   135: aload #9
/*    */       //   137: aload #10
/*    */       //   139: invokevirtual intValue : ()I
/*    */       //   142: invokevirtual contains : (I)Z
/*    */       //   145: ifeq -> 152
/*    */       //   148: iconst_1
/*    */       //   149: goto -> 153
/*    */       //   152: iconst_0
/*    */       //   153: nop
/*    */       //   154: ifne -> 81
/*    */       //   157: iconst_0
/*    */       //   158: goto -> 162
/*    */       //   161: iconst_1
/*    */       //   162: ireturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #13	-> 6
/*    */       //   #14	-> 30
/*    */       //   #15	-> 42
/*    */       //   #32	-> 50
/*    */       //   #33	-> 73
/*    */       //   #15	-> 110
/*    */       //   #15	-> 153
/*    */       //   #33	-> 154
/*    */       //   #34	-> 161
/*    */       //   #15	-> 162
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   110	44	8	$i$a$-all-IPv4Address$Companion$check$1	I
/*    */       //   107	47	7	it	Ljava/lang/String;
/*    */       //   100	61	6	element$iv	Ljava/lang/Object;
/*    */       //   50	112	4	$i$f$all	I
/*    */       //   47	115	3	$this$all$iv	Ljava/lang/Iterable;
/*    */       //   30	133	2	parts	Ljava/util/List;
/*    */       //   0	163	0	this	Lai/grazie/model/cloud/ip/IPv4Address$Companion;
/*    */       //   0	163	1	ip	Ljava/lang/String;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final IPv4Address parse(@NotNull String ip) {
/*    */       Intrinsics.checkNotNullParameter(ip, "ip");
/*    */       if (parseOrNull(ip) == null) {
/*    */         parseOrNull(ip);
/*    */         throw new IllegalStateException(("Invalid IPv4 address: " + ip).toString());
/*    */       } 
/*    */       return parseOrNull(ip);
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String getDisplay() {
/*    */     return this.display;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\r\n\000\n\002\020\005\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "", "invoke"})
/*    */   static final class IPv4Address$display$1 extends Lambda implements Function1<Byte, CharSequence> {
/*    */     public static final IPv4Address$display$1 INSTANCE = new IPv4Address$display$1();
/*    */     
/*    */     IPv4Address$display$1() {
/*    */       super(1);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final CharSequence invoke(byte it) {
/*    */       return UByte.toString-impl(UByte.constructor-impl(it));
/*    */     }
/*    */   } }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/cloud/ip/IPv4Address.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */