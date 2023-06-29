/*    */ package ai.grazie.model.cloud.ip;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\013\n\000\n\002\020\016\n\000\n\002\020 \n\000\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J\026\020\007\032\b\022\004\022\0020\0060\b2\006\020\005\032\0020\006H\002J\016\020\t\032\0020\n2\006\020\005\032\0020\006J\020\020\013\032\004\030\0010\n2\006\020\005\032\0020\006¨\006\f"}, d2 = {"Lai/grazie/model/cloud/ip/IPv6Address$Companion;", "", "()V", "check", "", "ip", "", "chunks", "", "parse", "Lai/grazie/model/cloud/ip/IPv6Address;", "parseOrNull", "model-cloud"})
/*    */ @SourceDebugExtension({"SMAP\nIPv6Address.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IPv6Address.kt\nai/grazie/model/cloud/ip/IPv6Address$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,44:1\n1549#2:45\n1620#2,3:46\n1726#2,3:49\n1360#2:52\n1446#2,5:53\n1549#2:58\n1620#2,3:59\n*S KotlinDebug\n*F\n+ 1 IPv6Address.kt\nai/grazie/model/cloud/ip/IPv6Address$Companion\n*L\n12#1:45\n12#1:46,3\n17#1:49,3\n23#1:52\n23#1:53,5\n25#1:58\n25#1:59,3\n*E\n"})
/*    */ public final class Companion {
/* 12 */   private final List<String> chunks(String ip) { String[] arrayOfString = new String[1]; arrayOfString[0] = ":"; Iterable $this$map$iv = StringsKt.split$default(ip, arrayOfString, false, 0, 6, null); int $i$f$map = 0;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 45 */     Iterable iterable1 = $this$map$iv; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 46 */     for (Object item$iv$iv : iterable1) {
/* 47 */       String str = (String)item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-IPv6Address$Companion$chunks$1 = 0; collection.add(StringsKt.padStart(str, 4, '0'));
/* 48 */     }  return (List<String>)destination$iv$iv; } private Companion() {} @Nullable public final IPv6Address parseOrNull(@NotNull String ip) { Intrinsics.checkNotNullParameter(ip, "ip"); if (!check(ip))
/*    */       return null;  List<String> parts = chunks(ip);
/*    */     Iterable<String> $this$flatMap$iv = parts;
/*    */     int $i$f$flatMap = 0;
/* 52 */     Iterable<String> iterable1 = $this$flatMap$iv; Collection<Byte> destination$iv$iv = new ArrayList(); int $i$f$flatMapTo = 0;
/* 53 */     for (String element$iv$iv : iterable1) {
/* 54 */       String it = element$iv$iv; int $i$a$-flatMap-IPv6Address$Companion$parseOrNull$bytes$1 = 0; Iterable list$iv$iv = StringsKt.toList(it);
/* 55 */       CollectionsKt.addAll(destination$iv$iv, list$iv$iv);
/*    */     } 
/* 57 */     $this$flatMap$iv = CollectionsKt.chunked(destination$iv$iv, 2); int $i$f$map = 0;
/* 58 */     Iterable<String> $this$flatMapTo$iv$iv = $this$flatMap$iv; destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$flatMap$iv, 10)); int $i$f$mapTo = 0;
/* 59 */     for (String item$iv$iv : $this$flatMapTo$iv$iv) {
/* 60 */       List list = (List)item$iv$iv; Collection<Byte> collection = destination$iv$iv; int $i$a$-map-IPv6Address$Companion$parseOrNull$bytes$2 = 0; collection.add(Byte.valueOf(UStringsKt.toUByte(CollectionsKt.joinToString$default(list, "", null, null, 0, null, null, 62, null), 16)));
/* 61 */     }  byte[] bytes = CollectionsKt.toByteArray(destination$iv$iv);
/*    */     return new IPv6Address(bytes); }
/*    */ 
/*    */   
/*    */   public final boolean check(@NotNull String ip) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'ip'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: aload_1
/*    */     //   8: invokespecial chunks : (Ljava/lang/String;)Ljava/util/List;
/*    */     //   11: astore_2
/*    */     //   12: aload_2
/*    */     //   13: invokeinterface size : ()I
/*    */     //   18: bipush #8
/*    */     //   20: if_icmpne -> 244
/*    */     //   23: aload_2
/*    */     //   24: checkcast java/lang/Iterable
/*    */     //   27: astore_3
/*    */     //   28: iconst_0
/*    */     //   29: istore #4
/*    */     //   31: aload_3
/*    */     //   32: instanceof java/util/Collection
/*    */     //   35: ifeq -> 54
/*    */     //   38: aload_3
/*    */     //   39: checkcast java/util/Collection
/*    */     //   42: invokeinterface isEmpty : ()Z
/*    */     //   47: ifeq -> 54
/*    */     //   50: iconst_1
/*    */     //   51: goto -> 113
/*    */     //   54: aload_3
/*    */     //   55: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   60: astore #5
/*    */     //   62: aload #5
/*    */     //   64: invokeinterface hasNext : ()Z
/*    */     //   69: ifeq -> 112
/*    */     //   72: aload #5
/*    */     //   74: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   79: astore #6
/*    */     //   81: aload #6
/*    */     //   83: checkcast java/lang/String
/*    */     //   86: astore #7
/*    */     //   88: iconst_0
/*    */     //   89: istore #8
/*    */     //   91: aload #7
/*    */     //   93: invokevirtual length : ()I
/*    */     //   96: iconst_4
/*    */     //   97: if_icmpgt -> 104
/*    */     //   100: iconst_1
/*    */     //   101: goto -> 105
/*    */     //   104: iconst_0
/*    */     //   105: ifne -> 62
/*    */     //   108: iconst_0
/*    */     //   109: goto -> 113
/*    */     //   112: iconst_1
/*    */     //   113: ifeq -> 244
/*    */     //   116: aload_2
/*    */     //   117: checkcast java/lang/Iterable
/*    */     //   120: astore_3
/*    */     //   121: iconst_0
/*    */     //   122: istore #4
/*    */     //   124: aload_3
/*    */     //   125: instanceof java/util/Collection
/*    */     //   128: ifeq -> 147
/*    */     //   131: aload_3
/*    */     //   132: checkcast java/util/Collection
/*    */     //   135: invokeinterface isEmpty : ()Z
/*    */     //   140: ifeq -> 147
/*    */     //   143: iconst_1
/*    */     //   144: goto -> 237
/*    */     //   147: aload_3
/*    */     //   148: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   153: astore #5
/*    */     //   155: aload #5
/*    */     //   157: invokeinterface hasNext : ()Z
/*    */     //   162: ifeq -> 236
/*    */     //   165: aload #5
/*    */     //   167: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   172: astore #6
/*    */     //   174: aload #6
/*    */     //   176: checkcast java/lang/String
/*    */     //   179: astore #7
/*    */     //   181: iconst_0
/*    */     //   182: istore #8
/*    */     //   184: new kotlin/ranges/IntRange
/*    */     //   187: dup
/*    */     //   188: iconst_0
/*    */     //   189: ldc 65535
/*    */     //   191: invokespecial <init> : (II)V
/*    */     //   194: astore #9
/*    */     //   196: aload #7
/*    */     //   198: bipush #16
/*    */     //   200: invokestatic toIntOrNull : (Ljava/lang/String;I)Ljava/lang/Integer;
/*    */     //   203: astore #10
/*    */     //   205: aload #10
/*    */     //   207: ifnull -> 227
/*    */     //   210: aload #9
/*    */     //   212: aload #10
/*    */     //   214: invokevirtual intValue : ()I
/*    */     //   217: invokevirtual contains : (I)Z
/*    */     //   220: ifeq -> 227
/*    */     //   223: iconst_1
/*    */     //   224: goto -> 228
/*    */     //   227: iconst_0
/*    */     //   228: nop
/*    */     //   229: ifne -> 155
/*    */     //   232: iconst_0
/*    */     //   233: goto -> 237
/*    */     //   236: iconst_1
/*    */     //   237: ifeq -> 244
/*    */     //   240: iconst_1
/*    */     //   241: goto -> 245
/*    */     //   244: iconst_0
/*    */     //   245: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #15	-> 6
/*    */     //   #17	-> 12
/*    */     //   #49	-> 31
/*    */     //   #50	-> 54
/*    */     //   #17	-> 91
/*    */     //   #50	-> 105
/*    */     //   #51	-> 112
/*    */     //   #17	-> 116
/*    */     //   #49	-> 124
/*    */     //   #50	-> 147
/*    */     //   #17	-> 184
/*    */     //   #17	-> 228
/*    */     //   #50	-> 229
/*    */     //   #51	-> 236
/*    */     //   #17	-> 245
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   91	14	8	$i$a$-all-IPv6Address$Companion$check$1	I
/*    */     //   88	17	7	it	Ljava/lang/String;
/*    */     //   81	31	6	element$iv	Ljava/lang/Object;
/*    */     //   31	82	4	$i$f$all	I
/*    */     //   28	85	3	$this$all$iv	Ljava/lang/Iterable;
/*    */     //   184	45	8	$i$a$-all-IPv6Address$Companion$check$2	I
/*    */     //   181	48	7	it	Ljava/lang/String;
/*    */     //   174	62	6	element$iv	Ljava/lang/Object;
/*    */     //   124	113	4	$i$f$all	I
/*    */     //   121	116	3	$this$all$iv	Ljava/lang/Iterable;
/*    */     //   12	234	2	parts	Ljava/util/List;
/*    */     //   0	246	0	this	Lai/grazie/model/cloud/ip/IPv6Address$Companion;
/*    */     //   0	246	1	ip	Ljava/lang/String;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final IPv6Address parse(@NotNull String ip) {
/*    */     Intrinsics.checkNotNullParameter(ip, "ip");
/*    */     if (parseOrNull(ip) == null) {
/*    */       parseOrNull(ip);
/*    */       throw new IllegalStateException(("Invalid IPv6 address: " + ip).toString());
/*    */     } 
/*    */     return parseOrNull(ip);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/cloud/ip/IPv6Address$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */