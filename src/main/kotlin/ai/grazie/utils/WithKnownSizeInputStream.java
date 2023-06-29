/*    */ package ai.grazie.utils;
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\000\n\002\020\022\n\002\b\002\n\002\020\t\n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\003\030\000 \0212\0020\001:\001\021B\017\b\026\022\006\020\002\032\0020\003¢\006\002\020\004B\025\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b¢\006\002\020\tJ)\020\f\032\002H\r\"\b\b\000\020\r*\0020\b2\022\020\016\032\016\022\004\022\0020\b\022\004\022\002H\r0\017¢\006\002\020\020R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\n\020\013¨\006\022"}, d2 = {"Lai/grazie/utils/WithKnownSizeInputStream;", "Ljava/io/FilterInputStream;", "byteArray", "", "([B)V", "size", "", "inputStream", "Ljava/io/InputStream;", "(JLjava/io/InputStream;)V", "getSize", "()J", "wrap", "T", "wrapper", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)Ljava/io/InputStream;", "Companion", "utils-common"})
/*    */ public final class WithKnownSizeInputStream extends FilterInputStream { @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*  6 */   public WithKnownSizeInputStream(long size, @NotNull InputStream inputStream) { super(inputStream); this.size = size; } private final long size; public final long getSize() { return this.size; } public WithKnownSizeInputStream(@NotNull byte[] byteArray) {
/*  7 */     this(byteArray.length, new ByteArrayInputStream(byteArray));
/*    */   } @NotNull
/*    */   public final <T extends InputStream> T wrap(@NotNull Function1 wrapper) {
/* 10 */     Intrinsics.checkNotNullParameter(wrapper, "wrapper"); Intrinsics.checkNotNullExpressionValue(this.in, "`in`"); InputStream wrapped = (InputStream)wrapper.invoke(this.in);
/* 11 */     this.in = wrapped;
/*    */     
/* 13 */     return (T)wrapped;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002¨\006\003"}, d2 = {"Lai/grazie/utils/WithKnownSizeInputStream$Companion;", "", "()V", "utils-common"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   } }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/WithKnownSizeInputStream.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */