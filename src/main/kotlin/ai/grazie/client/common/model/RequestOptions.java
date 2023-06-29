/*   */ package ai.grazie.client.common.model;
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\b\007\030\0002\0020\001B\031\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005¢\006\002\020\006R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\007\020\bR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\t\020\n¨\006\013"}, d2 = {"Lai/grazie/client/common/model/RequestOptions;", "Lai/grazie/DataHolder;", "headers", "Lai/grazie/client/common/model/HeaderCollection;", "queryParameters", "Lai/grazie/client/common/model/QueryParameterCollection;", "(Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;)V", "getHeaders", "()Lai/grazie/client/common/model/HeaderCollection;", "getQueryParameters", "()Lai/grazie/client/common/model/QueryParameterCollection;", "client-common"})
/*   */ public final class RequestOptions extends DataHolder {
/*   */   @NotNull
/*   */   private final HeaderCollection headers;
/*   */   
/*   */   @NotNull
/* 8 */   public final HeaderCollection getHeaders() { return this.headers; } @NotNull private final QueryParameterCollection queryParameters; @NotNull
/* 9 */   public final QueryParameterCollection getQueryParameters() { return this.queryParameters; } public RequestOptions(@NotNull HeaderCollection headers, @NotNull QueryParameterCollection queryParameters) { this.headers = headers; this.queryParameters = queryParameters; }
/*   */ 
/*   */   
/*   */   public RequestOptions() {
/*   */     this(null, null, 3, null);
/*   */   }
/*   */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/client/common/model/RequestOptions.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */