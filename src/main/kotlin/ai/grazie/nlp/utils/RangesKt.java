/*    */ package ai.grazie.nlp.utils;@Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\026\n\000\n\002\020\b\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\t\032\034\020\t\032\0020\n*\0020\0022\006\020\013\032\0020\0022\b\b\002\020\f\032\0020\n\032\022\020\r\032\0020\n*\0020\0022\006\020\013\032\0020\002\032\022\020\016\032\0020\002*\0020\0022\006\020\017\032\0020\001\032\022\020\020\032\0020\002*\0020\0022\006\020\021\032\0020\001\032\022\020\022\032\0020\002*\0020\0022\006\020\017\032\0020\001\"\025\020\000\032\0020\001*\0020\0028F¢\006\006\032\004\b\003\020\004\"\025\020\005\032\0020\001*\0020\0028F¢\006\006\032\004\b\006\020\004\"\025\020\007\032\0020\001*\0020\0028F¢\006\006\032\004\b\b\020\004¨\006\023"}, d2 = {"checkedEndExclusive", "", "Lkotlin/ranges/IntRange;", "getCheckedEndExclusive", "(Lkotlin/ranges/IntRange;)I", "length", "getLength", "startExclusive", "getStartExclusive", "inside", "", "other", "strictly", "intersects", "withLeftExpand", "expand", "withOffset", "offset", "withRightExpand", "nlp-common"}) @SourceDebugExtension({"SMAP\nRanges.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ranges.kt\nai/grazie/nlp/utils/RangesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n1#2:32\n*E\n"})
/*    */ public final class RangesKt { @NotNull
/*  3 */   public static final IntRange withOffset(@NotNull IntRange $this$withOffset, int offset) { Intrinsics.checkNotNullParameter($this$withOffset, "<this>"); return new IntRange($this$withOffset.getStart().intValue() + offset, $this$withOffset.getEndInclusive().intValue() + offset); } @NotNull
/*  4 */   public static final IntRange withRightExpand(@NotNull IntRange $this$withRightExpand, int expand) { Intrinsics.checkNotNullParameter($this$withRightExpand, "<this>"); return new IntRange($this$withRightExpand.getStart().intValue(), $this$withRightExpand.getEndInclusive().intValue() + expand); } @NotNull
/*  5 */   public static final IntRange withLeftExpand(@NotNull IntRange $this$withLeftExpand, int expand) { Intrinsics.checkNotNullParameter($this$withLeftExpand, "<this>"); return new IntRange($this$withLeftExpand.getStart().intValue() + expand, $this$withLeftExpand.getEndInclusive().intValue()); }
/*    */   
/*    */   public static final boolean intersects(@NotNull IntRange $this$intersects, @NotNull IntRange other) {
/*  8 */     Intrinsics.checkNotNullParameter($this$intersects, "<this>"); Intrinsics.checkNotNullParameter(other, "other"); return (($this$intersects.getStart().intValue() >= other.getStart().intValue() && $this$intersects.getStart().intValue() <= other.getEndInclusive().intValue()) || (
/*  9 */       $this$intersects.getEndInclusive().intValue() >= other.getStart().intValue() && $this$intersects.getEndInclusive().intValue() <= other.getEndInclusive().intValue()) || (
/* 10 */       $this$intersects.getStart().intValue() <= other.getStart().intValue() && $this$intersects.getEndInclusive().intValue() >= other.getEndInclusive().intValue()));
/*    */   }
/*    */   
/*    */   public static final boolean inside(@NotNull IntRange $this$inside, @NotNull IntRange other, boolean strictly) {
/* 14 */     Intrinsics.checkNotNullParameter($this$inside, "<this>"); Intrinsics.checkNotNullParameter(other, "other"); return !strictly ? (
/* 15 */       ($this$inside.getStart().intValue() >= other.getStart().intValue() && $this$inside.getEndInclusive().intValue() <= other.getEndInclusive().intValue())) : (
/*    */       
/* 17 */       ($this$inside.getStart().intValue() > other.getStart().intValue() && $this$inside.getEndInclusive().intValue() < other.getEndInclusive().intValue()));
/*    */   }
/*    */ 
/*    */   
/*    */   public static final int getStartExclusive(@NotNull IntRange $this$startExclusive) {
/* 22 */     Intrinsics.checkNotNullParameter($this$startExclusive, "<this>"); return $this$startExclusive.getStart().intValue() - 1;
/*    */   }
/*    */   public static final int getLength(@NotNull IntRange $this$length) {
/* 25 */     Intrinsics.checkNotNullParameter($this$length, "<this>"); return getCheckedEndExclusive($this$length) - $this$length.getStart().intValue();
/*    */   }
/*    */   public static final int getCheckedEndExclusive(@NotNull IntRange $this$checkedEndExclusive) {
/* 28 */     Intrinsics.checkNotNullParameter($this$checkedEndExclusive, "<this>"); if (!(($this$checkedEndExclusive.getLast() != Integer.MAX_VALUE) ? 1 : 0)) {
/*    */ 
/*    */ 
/*    */       
/* 32 */       int $i$a$-check-RangesKt$checkedEndExclusive$1 = 0;
/*    */       String str = "Cannot return the exclusive upper bound of a range that includes MAX_VALUE.";
/*    */       throw new IllegalStateException(str.toString());
/*    */     } 
/*    */     return $this$checkedEndExclusive.getLast() + 1;
/*    */   } }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/nlp/utils/RangesKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */