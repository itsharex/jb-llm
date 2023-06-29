/*    */ package ai.grazie.gec.model.problem;@Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\022\n\000\n\002\020\021\n\002\030\002\n\002\020\034\n\002\b\002\032\033\020\000\032\b\022\004\022\0020\0020\001*\b\022\004\022\0020\0020\003¢\006\002\020\004¨\006\005"}, d2 = {"withSkipsBetween", "", "Lai/grazie/gec/model/problem/ProblemFix$Part;", "", "(Ljava/lang/Iterable;)[Lai/grazie/gec/model/problem/ProblemFix$Part;", "model-gec"})
/*    */ @SourceDebugExtension({"SMAP\nProblemUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProblemUtils.kt\nai/grazie/gec/model/problem/ProblemUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,6:1\n1360#2:7\n1446#2,5:8\n37#3,2:13\n*S KotlinDebug\n*F\n+ 1 ProblemUtils.kt\nai/grazie/gec/model/problem/ProblemUtilsKt\n*L\n4#1:7\n4#1:8,5\n4#1:13,2\n*E\n"})
/*    */ public final class ProblemUtilsKt { @NotNull
/*  4 */   public static final ProblemFix.Part[] withSkipsBetween(@NotNull Iterable $this$withSkipsBetween) { Intrinsics.checkNotNullParameter($this$withSkipsBetween, "<this>"); Iterable $this$flatMap$iv = $this$withSkipsBetween; int $i$f$flatMap = 0;
/*    */ 
/*    */     
/*  7 */     Iterable iterable1 = $this$flatMap$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$flatMapTo = 0;
/*  8 */     for (Object element$iv$iv : iterable1) {
/*  9 */       ProblemFix.Part it = (ProblemFix.Part)element$iv$iv; int $i$a$-flatMap-ProblemUtilsKt$withSkipsBetween$1 = 0; ProblemFix.Part[] arrayOfPart = new ProblemFix.Part[2]; arrayOfPart[0] = it; arrayOfPart[1] = new ProblemFix.Part.Skip(); Iterable list$iv$iv = CollectionsKt.listOf((Object[])arrayOfPart);
/* 10 */       CollectionsKt.addAll(destination$iv$iv, list$iv$iv);
/*    */     } 
/* 12 */     Collection $this$toTypedArray$iv = CollectionsKt.dropLast((List)destination$iv$iv, 1); int $i$f$toTypedArray = 0;
/* 13 */     Collection thisCollection$iv = $this$toTypedArray$iv;
/* 14 */     return (ProblemFix.Part[])thisCollection$iv.toArray((Object[])new ProblemFix.Part[0]); }
/*    */    }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/gec/model/problem/ProblemUtilsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */