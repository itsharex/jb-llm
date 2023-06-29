/*    */ package ai.grazie.model.cloud.ip;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.text.StringsKt;
/*    */ import kotlin.text.UStringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\013\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J\016\020\007\032\0020\b2\006\020\005\032\0020\006J\020\020\t\032\004\030\0010\b2\006\020\005\032\0020\006¨\006\n"}, d2 = {"Lai/grazie/model/cloud/ip/IPv4Address$Companion;", "", "()V", "check", "", "ip", "", "parse", "Lai/grazie/model/cloud/ip/IPv4Address;", "parseOrNull", "model-cloud"})
/*    */ @SourceDebugExtension({"SMAP\nIPv4Address.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IPv4Address.kt\nai/grazie/model/cloud/ip/IPv4Address$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,31:1\n1726#2,3:32\n1549#2:35\n1620#2,3:36\n*S KotlinDebug\n*F\n+ 1 IPv4Address.kt\nai/grazie/model/cloud/ip/IPv4Address$Companion\n*L\n15#1:32,3\n20#1:35\n20#1:36,3\n*E\n"})
/*    */ public final class Companion {
/*    */   @Nullable
/*    */   public final IPv4Address parseOrNull(@NotNull String ip) {
/* 19 */     Intrinsics.checkNotNullParameter(ip, "ip"); if (!check(ip)) return null; 
/* 20 */     String[] arrayOfString = new String[1]; arrayOfString[0] = "."; Iterable $this$map$iv = StringsKt.split$default(ip, arrayOfString, false, 0, 6, null); int $i$f$map = 0;
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
/* 35 */     Iterable iterable1 = $this$map$iv; Collection<Byte> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 36 */     for (Object item$iv$iv : iterable1) {
/* 37 */       String str = (String)item$iv$iv; Collection<Byte> collection = destination$iv$iv; int $i$a$-map-IPv4Address$Companion$parseOrNull$bytes$1 = 0; collection.add(Byte.valueOf(UStringsKt.toUByte(str)));
/* 38 */     }  byte[] bytes = CollectionsKt.toByteArray(destination$iv$iv);
/*    */     return new IPv4Address(bytes);
/*    */   }
/*    */   
/*    */   private Companion() {}
/*    */   
/*    */   public final boolean check(@NotNull String ip) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'ip'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: checkcast java/lang/CharSequence
/*    */     //   10: iconst_1
/*    */     //   11: anewarray java/lang/String
/*    */     //   14: astore_3
/*    */     //   15: aload_3
/*    */     //   16: iconst_0
/*    */     //   17: ldc '.'
/*    */     //   19: aastore
/*    */     //   20: aload_3
/*    */     //   21: iconst_0
/*    */     //   22: iconst_0
/*    */     //   23: bipush #6
/*    */     //   25: aconst_null
/*    */     //   26: invokestatic split$default : (Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
/*    */     //   29: astore_2
/*    */     //   30: aload_2
/*    */     //   31: invokeinterface size : ()I
/*    */     //   36: iconst_4
/*    */     //   37: if_icmpeq -> 42
/*    */     //   40: iconst_0
/*    */     //   41: ireturn
/*    */     //   42: aload_2
/*    */     //   43: checkcast java/lang/Iterable
/*    */     //   46: astore_3
/*    */     //   47: iconst_0
/*    */     //   48: istore #4
/*    */     //   50: aload_3
/*    */     //   51: instanceof java/util/Collection
/*    */     //   54: ifeq -> 73
/*    */     //   57: aload_3
/*    */     //   58: checkcast java/util/Collection
/*    */     //   61: invokeinterface isEmpty : ()Z
/*    */     //   66: ifeq -> 73
/*    */     //   69: iconst_1
/*    */     //   70: goto -> 162
/*    */     //   73: aload_3
/*    */     //   74: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   79: astore #5
/*    */     //   81: aload #5
/*    */     //   83: invokeinterface hasNext : ()Z
/*    */     //   88: ifeq -> 161
/*    */     //   91: aload #5
/*    */     //   93: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   98: astore #6
/*    */     //   100: aload #6
/*    */     //   102: checkcast java/lang/String
/*    */     //   105: astore #7
/*    */     //   107: iconst_0
/*    */     //   108: istore #8
/*    */     //   110: new kotlin/ranges/IntRange
/*    */     //   113: dup
/*    */     //   114: iconst_0
/*    */     //   115: sipush #255
/*    */     //   118: invokespecial <init> : (II)V
/*    */     //   121: astore #9
/*    */     //   123: aload #7
/*    */     //   125: invokestatic toIntOrNull : (Ljava/lang/String;)Ljava/lang/Integer;
/*    */     //   128: astore #10
/*    */     //   130: aload #10
/*    */     //   132: ifnull -> 152
/*    */     //   135: aload #9
/*    */     //   137: aload #10
/*    */     //   139: invokevirtual intValue : ()I
/*    */     //   142: invokevirtual contains : (I)Z
/*    */     //   145: ifeq -> 152
/*    */     //   148: iconst_1
/*    */     //   149: goto -> 153
/*    */     //   152: iconst_0
/*    */     //   153: nop
/*    */     //   154: ifne -> 81
/*    */     //   157: iconst_0
/*    */     //   158: goto -> 162
/*    */     //   161: iconst_1
/*    */     //   162: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #13	-> 6
/*    */     //   #14	-> 30
/*    */     //   #15	-> 42
/*    */     //   #32	-> 50
/*    */     //   #33	-> 73
/*    */     //   #15	-> 110
/*    */     //   #15	-> 153
/*    */     //   #33	-> 154
/*    */     //   #34	-> 161
/*    */     //   #15	-> 162
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   110	44	8	$i$a$-all-IPv4Address$Companion$check$1	I
/*    */     //   107	47	7	it	Ljava/lang/String;
/*    */     //   100	61	6	element$iv	Ljava/lang/Object;
/*    */     //   50	112	4	$i$f$all	I
/*    */     //   47	115	3	$this$all$iv	Ljava/lang/Iterable;
/*    */     //   30	133	2	parts	Ljava/util/List;
/*    */     //   0	163	0	this	Lai/grazie/model/cloud/ip/IPv4Address$Companion;
/*    */     //   0	163	1	ip	Ljava/lang/String;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final IPv4Address parse(@NotNull String ip) {
/*    */     Intrinsics.checkNotNullParameter(ip, "ip");
/*    */     if (parseOrNull(ip) == null) {
/*    */       parseOrNull(ip);
/*    */       throw new IllegalStateException(("Invalid IPv4 address: " + ip).toString());
/*    */     } 
/*    */     return parseOrNull(ip);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/cloud/ip/IPv4Address$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */