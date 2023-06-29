/*    */ package ai.grazie.nlp.encoder;
/*    */ 
/*    */ import java.util.Arrays;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.ArraysKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\020\022\n\002\b\002\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\006\n\002\020\016\n\000\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\023\020\t\032\0020\n2\b\020\013\032\004\030\0010\001H\002J\b\020\f\032\0020\006H\026J\026\020\r\032\0020\0002\006\020\016\032\0020\0062\006\020\017\032\0020\006J\b\020\020\032\0020\021H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\021\020\005\032\0020\0068F¢\006\006\032\004\b\007\020\b¨\006\022"}, d2 = {"Lai/grazie/nlp/encoder/ByteArrayKey;", "", "bytes", "", "([B)V", "size", "", "getSize", "()I", "equals", "", "other", "hashCode", "range", "start", "end", "toString", "", "nlp-encoder-engine"})
/*    */ public final class ByteArrayKey
/*    */ {
/*    */   @NotNull
/*    */   private final byte[] bytes;
/*    */   
/*    */   public ByteArrayKey(@NotNull byte[] bytes) {
/* 36 */     this.bytes = bytes;
/*    */   } public final int getSize() {
/* 38 */     return this.bytes.length;
/*    */   } @NotNull
/*    */   public final ByteArrayKey range(int start, int end) {
/* 41 */     byte[] arrayOfByte = this.bytes; return new ByteArrayKey(ArraysKt.copyOfRange(arrayOfByte, start, end));
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/* 45 */     return (this == other || (other instanceof ByteArrayKey && Arrays.equals(this.bytes, ((ByteArrayKey)other).bytes)));
/*    */   }
/* 47 */   public int hashCode() { return Arrays.hashCode(this.bytes); } @NotNull
/* 48 */   public String toString() { Intrinsics.checkNotNullExpressionValue(Arrays.toString(this.bytes), "toString(this)"); return Arrays.toString(this.bytes); }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/nlp/encoder/ByteArrayKey.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */