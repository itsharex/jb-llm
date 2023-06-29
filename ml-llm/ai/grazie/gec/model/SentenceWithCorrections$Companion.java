/*    */ package ai.grazie.gec.model;
/*    */ 
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\021\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\037\020\003\032\b\022\004\022\0020\0050\0042\f\020\006\032\b\022\004\022\0020\0070\004¢\006\002\020\bJ\017\020\t\032\b\022\004\022\0020\0050\nHÆ\001¨\006\013"}, d2 = {"Lai/grazie/gec/model/SentenceWithCorrections$Companion;", "", "()V", "empty", "", "Lai/grazie/gec/model/SentenceWithCorrections;", "texts", "", "([Ljava/lang/String;)[Lai/grazie/gec/model/SentenceWithCorrections;", "serializer", "Lkotlinx/serialization/KSerializer;", "model-gec"})
/*    */ @SourceDebugExtension({"SMAP\nSentenceWithCorrections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentenceWithCorrections.kt\nai/grazie/gec/model/SentenceWithCorrections$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,77:1\n11335#2:78\n11670#2,2:79\n11672#2:82\n26#3:81\n37#4,2:83\n*S KotlinDebug\n*F\n+ 1 SentenceWithCorrections.kt\nai/grazie/gec/model/SentenceWithCorrections$Companion\n*L\n13#1:78\n13#1:79,2\n13#1:82\n13#1:81\n13#1:83,2\n*E\n"})
/*    */ public final class Companion {
/*    */   @NotNull
/* 11 */   public final KSerializer<SentenceWithCorrections> serializer() { return (KSerializer<SentenceWithCorrections>)SentenceWithCorrections.$serializer.INSTANCE; } private Companion() {} @NotNull
/*    */   public final SentenceWithCorrections[] empty(@NotNull String[] texts) {
/* 13 */     Intrinsics.checkNotNullParameter(texts, "texts"); String[] arrayOfString1 = texts; int $i$f$map = 0;
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
/* 78 */     String[] arrayOfString2 = arrayOfString1; Collection destination$iv$iv = new ArrayList(arrayOfString1.length); int $i$f$mapTo = 0; byte b; int i;
/* 79 */     for (b = 0, i = arrayOfString2.length; b < i; $i$f$emptyArray = 0) { int $i$f$emptyArray; Object item$iv$iv = arrayOfString2[b];
/* 80 */       Object object1 = item$iv$iv; Collection collection = destination$iv$iv; int $i$a$-map-SentenceWithCorrections$Companion$empty$1 = 0; }
/*    */     
/* 82 */     List list = (List)destination$iv$iv; int $i$f$toTypedArray = 0;
/* 83 */     Collection thisCollection$iv = list;
/* 84 */     return (SentenceWithCorrections[])thisCollection$iv.toArray((Object[])new SentenceWithCorrections[0]);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/gec/model/SentenceWithCorrections$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */