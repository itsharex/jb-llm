/*    */ package ai.grazie.model.cloud.exceptions;@Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\036\n\000\n\002\020\001\n\000\n\002\020\016\n\002\b\016\n\002\030\002\n\000\n\002\030\002\n\002\b\002\032\022\020\000\032\0020\0012\n\b\002\020\002\032\004\030\0010\003\032\022\020\004\032\0020\0012\n\b\002\020\002\032\004\030\0010\003\032\022\020\005\032\0020\0012\n\b\002\020\002\032\004\030\0010\003\032\022\020\006\032\0020\0012\n\b\002\020\002\032\004\030\0010\003\032\022\020\007\032\0020\0012\n\b\002\020\002\032\004\030\0010\003\032\022\020\b\032\0020\0012\n\b\002\020\002\032\004\030\0010\003\032\022\020\t\032\0020\0012\n\b\002\020\002\032\004\030\0010\003\032\022\020\n\032\0020\0012\n\b\002\020\002\032\004\030\0010\003\032\022\020\013\032\0020\0012\n\b\002\020\002\032\004\030\0010\003\032\022\020\f\032\0020\0012\n\b\002\020\002\032\004\030\0010\003\032\022\020\r\032\0020\0012\n\b\002\020\002\032\004\030\0010\003\032\022\020\016\032\0020\0012\n\b\002\020\002\032\004\030\0010\003\032\022\020\017\032\0020\0012\n\b\002\020\002\032\004\030\0010\003\032-\020\020\032\004\030\001H\021\"\004\b\000\020\021*\0020\0222\016\020\023\032\n\022\006\022\004\030\001H\0210\024H\bø\001\000¢\006\002\020\025\002\007\n\005\b20\001¨\006\026"}, d2 = {"badRequest", "", "description", "", "closedRequest", "contentTooLarge", "forbidden", "internalServerError", "lengthRequired", "notFound", "preconditionFailed", "requestTimeout", "tooManyRequests", "unauthorized", "unavailableForLegalReasons", "unprocessableContent", "tryOrNull", "T", "Lai/grazie/model/cloud/exceptions/HTTPStatusException$AccessProhibited$Companion;", "body", "Lkotlin/Function0;", "(Lai/grazie/model/cloud/exceptions/HTTPStatusException$AccessProhibited$Companion;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "model-cloud"})
/*    */ public final class ExtensionsKt { @NotNull
/*  3 */   public static final Void unauthorized(@Nullable String description) { throw new HTTPStatusException.Unauthorized(description, null, 2, null); }
/*    */   @NotNull
/*  5 */   public static final Void forbidden(@Nullable String description) { throw new HTTPStatusException.Forbidden(description, null, 2, null); }
/*    */   @NotNull
/*  7 */   public static final Void badRequest(@Nullable String description) { throw new HTTPStatusException.BadRequest(description, null, 2, null); }
/*    */   @NotNull
/*  9 */   public static final Void tooManyRequests(@Nullable String description) { throw new HTTPStatusException.TooManyRequests(description, null, 2, null); }
/*    */   @NotNull
/* 11 */   public static final Void unavailableForLegalReasons(@Nullable String description) { throw new HTTPStatusException.UnavailableForLegalReasons(description, null, 2, null); }
/*    */   @NotNull
/* 13 */   public static final Void internalServerError(@Nullable String description) { throw new HTTPStatusException.InternalServerError(description, null, 2, null); } @NotNull
/* 14 */   public static final Void lengthRequired(@Nullable String description) { throw new HTTPStatusException.LengthRequired(description, null, 2, null); }
/*    */   @NotNull
/* 16 */   public static final Void notFound(@Nullable String description) { throw new HTTPStatusException.NotFound(description, null, 2, null); } @NotNull
/* 17 */   public static final Void contentTooLarge(@Nullable String description) { throw new HTTPStatusException.ContentTooLarge(description, null, 2, null); }
/*    */   @NotNull
/* 19 */   public static final Void preconditionFailed(@Nullable String description) { throw new HTTPStatusException.PreconditionFailed(description, null, 2, null); }
/*    */   @NotNull
/* 21 */   public static final Void closedRequest(@Nullable String description) { throw new HTTPStatusException.ClosedRequest(description, null, 2, null); } @NotNull
/* 22 */   public static final Void requestTimeout(@Nullable String description) { throw new HTTPStatusException.RequestTimeout(description, null, 2, null); }
/*    */   @NotNull
/* 24 */   public static final Void unprocessableContent(@Nullable String description) { throw new HTTPStatusException.UnprocessableContent(description, null, 2, null); } @Nullable
/*    */   public static final <T> T tryOrNull(@NotNull HTTPStatusException.AccessProhibited.Companion $this$tryOrNull, @NotNull Function0 body) {
/*    */     Object object;
/* 27 */     Intrinsics.checkNotNullParameter($this$tryOrNull, "<this>"); Intrinsics.checkNotNullParameter(body, "body"); int $i$f$tryOrNull = 0; 
/* 28 */     try { object = body.invoke(); }
/* 29 */     catch (AccessProhibited e)
/* 30 */     { return null; }  return (T)object;
/*    */   } }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/cloud/exceptions/ExtensionsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */