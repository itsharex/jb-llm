/*    */ package ai.grazie.text;
/*    */ 
/*    */ import java.util.NoSuchElementException;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.ArraysKt;
/*    */ import kotlin.collections.IntIterator;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.ranges.IntRange;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\021\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\033\020\003\032\004\030\0010\0042\f\020\005\032\b\022\004\022\0020\0040\006¢\006\002\020\007J\021\020\b\032\0020\0042\006\020\t\032\0020\nH\002J\017\020\013\032\b\022\004\022\0020\0040\fHÆ\001¨\006\r"}, d2 = {"Lai/grazie/text/TextRange$Companion;", "", "()V", "covering", "Lai/grazie/text/TextRange;", "ranges", "", "([Lai/grazie/text/TextRange;)Lai/grazie/text/TextRange;", "invoke", "range", "Lkotlin/ranges/IntRange;", "serializer", "Lkotlinx/serialization/KSerializer;", "model-text"})
/*    */ @SourceDebugExtension({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nai/grazie/text/TextRange$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final KSerializer<TextRange> serializer() {
/* 83 */     return (KSerializer<TextRange>)TextRange.$serializer.INSTANCE; } @NotNull
/*    */   public final TextRange invoke(@NotNull IntRange range) {
/* 85 */     Intrinsics.checkNotNullParameter(range, "range"); return new TextRange(range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final TextRange covering(@NotNull TextRange[] ranges) {
/* 93 */     Intrinsics.checkNotNullParameter(ranges, "ranges"); if ((ranges.length == 0)) return null; 
/* 94 */     TextRange[] arrayOfTextRange = ranges; if ((arrayOfTextRange.length == 0)) throw new NoSuchElementException();  TextRange textRange1 = arrayOfTextRange[0];
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 99 */     int $i$a$-minOf-TextRange$Companion$covering$1 = 0; int j; IntIterator intIterator2; for (j = textRange1.getStart(), intIterator2 = (new IntRange(1, ArraysKt.getLastIndex((Object[])arrayOfTextRange))).iterator(); intIterator2.hasNext(); ) { int i2 = intIterator2.nextInt(); TextRange textRange = arrayOfTextRange[i2]; int i4 = 0; int i3 = textRange.getStart(); if (j > i3) j = i3;  }  arrayOfTextRange = ranges; int k = j; if ((arrayOfTextRange.length == 0)) throw new NoSuchElementException();  TextRange it = arrayOfTextRange[0]; int $i$a$-maxOf-TextRange$Companion$covering$2 = 0; int i; IntIterator intIterator1; for (i = it.getEndExclusive(), intIterator1 = (new IntRange(1, ArraysKt.getLastIndex((Object[])arrayOfTextRange))).iterator(); intIterator1.hasNext(); ) { int i2 = intIterator1.nextInt(); TextRange textRange = arrayOfTextRange[i2]; int i4 = 0;
/*    */       int i3 = textRange.getEndExclusive();
/*    */       if (i < i3)
/*    */         i = i3;  }
/*    */     
/*    */     int m = i, n = m, i1 = k;
/*    */     return new TextRange(i1, n);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/text/TextRange$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */