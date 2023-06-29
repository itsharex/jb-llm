/*     */ package com.intellij.ml.llm.core.models.openai;
/*     */ 
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMBaseResponse;
/*     */ import com.intellij.util.io.HttpRequests;
/*     */ import java.net.URLConnection;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\026\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B\025\022\006\020\003\032\0020\004\022\006\020\005\032\0028\000¢\006\002\020\006J\022\020\b\032\004\030\0010\t2\006\020\n\032\0020\013H\026J\n\020\f\032\004\030\0010\tH\026R\016\020\007\032\0020\004X\004¢\006\002\n\000¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/core/models/openai/OpenAIBaseRequest;", "Body", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseRequest;", "path", "", "body", "(Ljava/lang/String;Ljava/lang/Object;)V", "url", "handleResponse", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseResponse;", "request", "Lcom/intellij/util/io/HttpRequests$Request;", "sendSync", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nOpenAIRequests.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenAIRequests.kt\ncom/intellij/ml/llm/core/models/openai/OpenAIBaseRequest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n1#2:140\n*E\n"})
/*     */ public class OpenAIBaseRequest<Body> extends LLMBaseRequest<Body> {
/*  11 */   public OpenAIBaseRequest(@NotNull String path, Object body) { super(body);
/*  12 */     this.url = "https://api.openai.com/v1/" + path; } @NotNull
/*     */   private final String url; @Nullable
/*     */   public LLMBaseResponse sendSync() {
/*  15 */     if (CredentialsHolder.Companion.getInstance().getOpenAiApiKey() != null) { CharSequence charSequence = CredentialsHolder.Companion.getInstance().getOpenAiApiKey();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 140 */       int $i$a$-ifEmpty-OpenAIBaseRequest$sendSync$apiKey$1 = 0;
/*     */       if ((String)(((charSequence.length() == 0)) ? null : (String)charSequence) != null) {
/*     */         String apiKey;
/*     */         return (LLMBaseResponse)HttpRequests.post(this.url, "application/json").tuner(apiKey::sendSync$lambda$2).connect(this::sendSync$lambda$3);
/*     */       }  }
/*     */     
/*     */     CredentialsHolder.Companion.getInstance().getOpenAiApiKey();
/*     */     throw new AuthorizationException("OpenAI API Key is not provided");
/*     */   }
/*     */   
/*     */   private static final void sendSync$lambda$2(String $apiKey, URLConnection it) {
/*     */     Intrinsics.checkNotNullParameter($apiKey, "$apiKey");
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     it.setRequestProperty("Authorization", "Bearer " + $apiKey);
/*     */     String organization = CredentialsHolder.Companion.getInstance().getOpenAiOrganization();
/*     */     int $i$a$-let-OpenAIBaseRequest$sendSync$1$1 = 0;
/*     */     it.setRequestProperty("OpenAI-Organization", organization);
/*     */     CredentialsHolder.Companion.getInstance().getOpenAiOrganization();
/*     */   }
/*     */   
/*     */   private static final LLMBaseResponse sendSync$lambda$3(OpenAIBaseRequest this$0, HttpRequests.Request request) {
/*     */     Intrinsics.checkNotNullParameter(this$0, "this$0");
/*     */     Intrinsics.checkNotNullParameter(request, "request");
/*     */     request.write((new GsonBuilder()).create().toJson(this$0.getBody()));
/*     */     return this$0.handleResponse(request);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public LLMBaseResponse handleResponse(@NotNull HttpRequests.Request request) {
/*     */     Intrinsics.checkNotNullParameter(request, "request");
/*     */     Intrinsics.checkNotNull(request.getConnection(), "null cannot be cast to non-null type java.net.HttpURLConnection");
/*     */     int responseCode = ((HttpURLConnection)request.getConnection()).getResponseCode();
/*     */     Intrinsics.checkNotNullExpressionValue(request.readString(), "request.readString()");
/*     */     String response = request.readString();
/*     */     Gson gson = (new GsonBuilder()).registerTypeAdapter(ResponseChoice.class, new ResponseChoiceTypeAdapter()).create();
/*     */     return (responseCode == 200) ? (LLMBaseResponse)gson.fromJson(response, OpenAIResponse.class) : null;
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/openai/OpenAIBaseRequest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */