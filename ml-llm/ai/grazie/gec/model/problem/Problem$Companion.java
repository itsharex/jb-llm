/*     */ package ai.grazie.gec.model.problem;
/*     */ 
/*     */ import ai.grazie.gec.model.SentenceWithCorrections;
/*     */ import ai.grazie.text.TextRange;
/*     */ import ai.grazie.utils.attributes.Attributes;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J\017\020\007\032\b\022\004\022\0020\0040\bHÆ\001¨\006\t"}, d2 = {"Lai/grazie/gec/model/problem/Problem$Companion;", "", "()V", "of", "Lai/grazie/gec/model/problem/Problem;", "correction", "Lai/grazie/gec/model/SentenceWithCorrections$Correction;", "serializer", "Lkotlinx/serialization/KSerializer;", "model-gec"})
/*     */ @SourceDebugExtension({"SMAP\nProblem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Problem.kt\nai/grazie/gec/model/problem/Problem$Companion\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,123:1\n26#2:124\n11335#3:125\n11670#3,3:126\n37#4,2:129\n*S KotlinDebug\n*F\n+ 1 Problem.kt\nai/grazie/gec/model/problem/Problem$Companion\n*L\n65#1:124\n67#1:125\n67#1:126,3\n71#1:129,2\n*E\n"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   @NotNull
/*     */   public final KSerializer<Problem> serializer() {
/*  53 */     return (KSerializer<Problem>)Problem.$serializer.INSTANCE; } @NotNull
/*     */   public final Problem of(@NotNull SentenceWithCorrections.Correction correction) {
/*  55 */     Intrinsics.checkNotNullParameter(correction, "correction");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  64 */     TextRange[] arrayOfTextRange = new TextRange[1]; arrayOfTextRange[0] = correction.getUnderlineRange();
/*  65 */     int $i$f$emptyArray = 0;
/*     */     
/*  67 */     String[] arrayOfString1 = correction.getReplacements(); ProblemHighlighting problemHighlighting1 = new ProblemHighlighting(arrayOfTextRange, 
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
/*     */ 
/*     */         
/* 124 */         new TextRange[0]); String str1 = correction.getMessage(); Problem.KindInfo kindInfo1 = new Problem.KindInfo(ProblemKindID.Companion.getLegacy(), ProblemCategory.OTHER, correction.getService(), "legacy"); int $i$f$map = 0;
/* 125 */     String[] arrayOfString2 = arrayOfString1; Collection destination$iv$iv = new ArrayList(arrayOfString1.length); int $i$f$mapTo = 0; byte b; int i;
/* 126 */     for (b = 0, i = arrayOfString2.length; b < i; arrayOfPart = new ProblemFix.Part[1], arrayOfPart[0] = new ProblemFix.Part.Change(correction.getErrorRange(), (String)object1)) { ProblemFix.Part[] arrayOfPart; Object item$iv$iv = arrayOfString2[b];
/* 127 */       Object object1 = item$iv$iv; Collection collection = destination$iv$iv; int $i$a$-map-Problem$Companion$of$1 = 0; }
/* 128 */      List list2 = (List)destination$iv$iv, list1 = list2; int $i$f$toTypedArray = 0;
/* 129 */     Collection thisCollection$iv = list1; Attributes attributes1 = null, attributes2 = null;
/* 130 */     ProblemFix[] arrayOfProblemFix = (ProblemFix[])thisCollection$iv.toArray((Object[])new ProblemFix[0]);
/*     */     ProblemHighlighting problemHighlighting2 = problemHighlighting1;
/*     */     String str2 = str1;
/*     */     Problem.KindInfo kindInfo2 = kindInfo1;
/*     */     return new Problem(kindInfo2, str2, problemHighlighting2, arrayOfProblemFix, attributes2, attributes1);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/gec/model/problem/Problem$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */