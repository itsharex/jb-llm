/*    */ package ai.grazie.client.common.model;
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\020\022\n\002\b\013\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\027\b\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006B\027\022\006\020\002\032\0020\003\022\b\020\007\032\004\030\0010\b¢\006\002\020\tJ\t\020\020\032\0020\003HÆ\003J\013\020\021\032\004\030\0010\bHÆ\003J\037\020\022\032\0020\0002\b\b\002\020\002\032\0020\0032\n\b\002\020\007\032\004\030\0010\bHÆ\001J\023\020\023\032\0020\0242\b\020\025\032\004\030\0010\001H\002J\b\020\026\032\0020\027H\026J\t\020\030\032\0020\005HÖ\001R\023\020\007\032\004\030\0010\b¢\006\b\n\000\032\004\b\n\020\013R\023\020\004\032\004\030\0010\0058F¢\006\006\032\004\b\f\020\rR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\016\020\017¨\006\031"}, d2 = {"Lai/grazie/client/common/model/HTTPResponse;", "", "headers", "Lai/grazie/client/common/model/HeaderCollection;", "content", "", "(Lai/grazie/client/common/model/HeaderCollection;Ljava/lang/String;)V", "bytes", "", "(Lai/grazie/client/common/model/HeaderCollection;[B)V", "getBytes", "()[B", "getContent", "()Ljava/lang/String;", "getHeaders", "()Lai/grazie/client/common/model/HeaderCollection;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "client-common"})
/*    */ public final class HTTPResponse {
/*    */   @NotNull
/*    */   private final HeaderCollection headers;
/*    */   
/*  7 */   public HTTPResponse(@NotNull HeaderCollection headers, @Nullable byte[] bytes) { this.headers = headers; this.bytes = bytes; } @Nullable private final byte[] bytes; @NotNull public final HeaderCollection getHeaders() { return this.headers; } @Nullable public final byte[] getBytes() { return this.bytes; }
/*    */    public HTTPResponse(@NotNull HeaderCollection headers, @NotNull String content) {
/*  9 */     this(headers, StringsKt.encodeToByteArray(content));
/*    */   } @Nullable
/*    */   public final String getContent() {
/* 12 */     return (this.bytes != null) ? StringsKt.decodeToString(this.bytes) : null;
/*    */   }
/*    */   public boolean equals(@Nullable Object other) {
/* 15 */     if (this == other) return true; 
/* 16 */     if (other == null || getClass() != other.getClass()) return false;
/*    */     
/* 18 */     (HTTPResponse)other;
/*    */     
/* 20 */     if (!Intrinsics.areEqual(this.headers, ((HTTPResponse)other).headers)) return false; 
/* 21 */     if (this.bytes != null)
/* 22 */     { if (((HTTPResponse)other).bytes == null) return false; 
/* 23 */       if (!Arrays.equals(this.bytes, ((HTTPResponse)other).bytes)) return false;  }
/* 24 */     else if (((HTTPResponse)other).bytes != null) { return false; }
/*    */     
/* 26 */     return true;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 30 */     int result = this.headers.hashCode();
/* 31 */     result = 31 * result + ((this.bytes != null) ? Arrays.hashCode(this.bytes) : 0);
/* 32 */     return result;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final HeaderCollection component1() {
/*    */     return this.headers;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final byte[] component2() {
/*    */     return this.bytes;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final HTTPResponse copy(@NotNull HeaderCollection headers, @Nullable byte[] bytes) {
/*    */     Intrinsics.checkNotNullParameter(headers, "headers");
/*    */     return new HTTPResponse(headers, bytes);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "HTTPResponse(headers=" + this.headers + ", bytes=" + Arrays.toString(this.bytes) + ")";
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/client/common/model/HTTPResponse.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */