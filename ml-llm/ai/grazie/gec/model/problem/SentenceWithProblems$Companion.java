/*    */ package ai.grazie.gec.model.problem;
/*    */ 
/*    */ import ai.grazie.gec.model.SentenceWithCorrections;
/*    */ import java.util.Collection;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\021\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J'\020\003\032\b\022\004\022\0020\0050\0042\f\020\006\032\b\022\004\022\0020\0070\0042\006\020\b\032\0020\t¢\006\002\020\nJ\026\020\013\032\0020\0052\006\020\b\032\0020\t2\006\020\f\032\0020\rJ\017\020\016\032\b\022\004\022\0020\0050\017HÆ\001¨\006\020"}, d2 = {"Lai/grazie/gec/model/problem/SentenceWithProblems$Companion;", "", "()V", "empty", "", "Lai/grazie/gec/model/problem/SentenceWithProblems;", "sentences", "", "language", "Lai/grazie/nlp/langs/Language;", "([Ljava/lang/String;Lai/grazie/nlp/langs/Language;)[Lai/grazie/gec/model/problem/SentenceWithProblems;", "of", "corrections", "Lai/grazie/gec/model/SentenceWithCorrections;", "serializer", "Lkotlinx/serialization/KSerializer;", "model-gec"})
/*    */ @SourceDebugExtension({"SMAP\nSentenceWithProblems.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentenceWithProblems.kt\nai/grazie/gec/model/problem/SentenceWithProblems$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,42:1\n11335#2:43\n11670#2,2:44\n11672#2:47\n11335#2:50\n11670#2,3:51\n26#3:46\n37#4,2:48\n37#4,2:54\n*S KotlinDebug\n*F\n+ 1 SentenceWithProblems.kt\nai/grazie/gec/model/problem/SentenceWithProblems$Companion\n*L\n13#1:43\n13#1:44,2\n13#1:47\n17#1:50\n17#1:51,3\n13#1:46\n13#1:48,2\n20#1:54,2\n*E\n"})
/*    */ public final class Companion {
/*    */   @NotNull
/* 11 */   public final KSerializer<SentenceWithProblems> serializer() { return (KSerializer<SentenceWithProblems>)SentenceWithProblems.$serializer.INSTANCE; } private Companion() {} @NotNull
/*    */   public final SentenceWithProblems[] empty(@NotNull String[] sentences, @NotNull Language language) {
/* 13 */     Intrinsics.checkNotNullParameter(sentences, "sentences"); Intrinsics.checkNotNullParameter(language, "language"); String[] arrayOfString1 = sentences; int $i$f$map = 0;
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
/* 43 */     String[] arrayOfString2 = arrayOfString1; Collection destination$iv$iv = new ArrayList(arrayOfString1.length); int $i$f$mapTo = 0; byte b; int i;
/* 44 */     for (b = 0, i = arrayOfString2.length; b < i; $i$f$emptyArray = 0) { int $i$f$emptyArray; Object item$iv$iv = arrayOfString2[b];
/* 45 */       Object object1 = item$iv$iv; Collection collection = destination$iv$iv; int $i$a$-map-SentenceWithProblems$Companion$empty$1 = 0; }
/*    */     
/* 47 */     List list = (List)destination$iv$iv; int $i$f$toTypedArray = 0;
/* 48 */     Collection thisCollection$iv = list;
/* 49 */     return (SentenceWithProblems[])thisCollection$iv.toArray((Object[])new SentenceWithProblems[0]); } @NotNull public final SentenceWithProblems of(@NotNull Language language, @NotNull SentenceWithCorrections corrections) { Intrinsics.checkNotNullParameter(language, "language"); Intrinsics.checkNotNullParameter(corrections, "corrections"); SentenceWithCorrections.Correction[] arrayOfCorrection1 = corrections.getCorrections(); int $i$f$map = 0;
/* 50 */     SentenceWithCorrections.Correction[] arrayOfCorrection2 = arrayOfCorrection1; Collection<Problem> destination$iv$iv = new ArrayList(arrayOfCorrection1.length); int $i$f$mapTo = 0; byte b; int i;
/* 51 */     for (b = 0, i = arrayOfCorrection2.length; b < i; ) { Object item$iv$iv = arrayOfCorrection2[b];
/* 52 */       Object object1 = item$iv$iv; Collection<Problem> collection = destination$iv$iv; int $i$a$-map-SentenceWithProblems$Companion$of$problems$1 = 0; collection.add(Problem.Companion.of((SentenceWithCorrections.Correction)object1)); }
/* 53 */      List problems = (List)destination$iv$iv; Collection $this$toTypedArray$iv = problems; int $i$f$toTypedArray = 0;
/* 54 */     Collection thisCollection$iv = $this$toTypedArray$iv;
/* 55 */     return new SentenceWithProblems(corrections.getText(), language, (Problem[])thisCollection$iv.toArray((Object[])new Problem[0])); }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/gec/model/problem/SentenceWithProblems$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */