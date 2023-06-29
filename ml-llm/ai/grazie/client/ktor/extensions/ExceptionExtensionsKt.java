/*   */ package ai.grazie.client.ktor.extensions;
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\032\022\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\004¨\006\005"}, d2 = {"of", "Lai/grazie/model/cloud/exceptions/HTTPStatusException;", "Lai/grazie/model/cloud/exceptions/HTTPStatusException$Companion;", "e", "Lai/grazie/utils/http/JsonKtorHTTPClient$KtorHttpException;", "client-ktor"})
/*   */ public final class ExceptionExtensionsKt {
/*   */   @NotNull
/*   */   public static final HTTPStatusException of(@NotNull HTTPStatusException.Companion $this$of, @NotNull JsonKtorHTTPClient.KtorHttpException e) {
/* 7 */     Intrinsics.checkNotNullParameter($this$of, "<this>"); Intrinsics.checkNotNullParameter(e, "e"); return $this$of.of(e.getCode(), e.getMessage(), (Exception)e);
/*   */   }
/*   */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/client/ktor/extensions/ExceptionExtensionsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */