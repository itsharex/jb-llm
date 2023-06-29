/*    */ package ai.grazie.model.cloud.paging;
/*    */ 
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020 \n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\022\020\003\032\b\022\004\022\002H\0050\004\"\004\b\001\020\005J.\020\006\032\b\022\004\022\002H\0050\004\"\004\b\001\020\0052\f\020\007\032\b\022\004\022\002H\0050\b2\f\020\t\032\b\022\004\022\002H\0050\nJ)\020\013\032\016\022\n\022\b\022\004\022\002H\r0\0040\f\"\004\b\001\020\r2\f\020\016\032\b\022\004\022\002H\r0\fHÆ\001¨\006\017"}, d2 = {"Lai/grazie/model/cloud/paging/IterableWithNext$Companion;", "", "()V", "empty", "Lai/grazie/model/cloud/paging/IterableWithNext;", "T", "from", "values", "", "page", "Lai/grazie/model/cloud/paging/IterablePage;", "serializer", "Lkotlinx/serialization/KSerializer;", "T0", "typeSerial0", "model-cloud"})
/*    */ public final class Companion {
/*    */   @NotNull
/*  9 */   public final <T0> KSerializer<IterableWithNext<T0>> serializer(@NotNull KSerializer typeSerial0) { Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0"); return (KSerializer<IterableWithNext<T0>>)new IterableWithNext.$serializer(typeSerial0); } private Companion() {} @NotNull
/* 10 */   public final <T> IterableWithNext<T> empty() { return new IterableWithNext<>(CollectionsKt.emptyList(), false); } @NotNull
/*    */   public final <T> IterableWithNext<T> from(@NotNull List<? extends T> values, @NotNull IterablePage page) {
/* 12 */     Intrinsics.checkNotNullParameter(values, "values"); Intrinsics.checkNotNullParameter(page, "page"); return new IterableWithNext<>(values, (values.size() == page.getSize()));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/cloud/paging/IterableWithNext$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */