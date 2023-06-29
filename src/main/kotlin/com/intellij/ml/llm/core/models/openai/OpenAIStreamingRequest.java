/*     */ package com.intellij.ml.llm.core.models.openai;
/*     */ 
/*     */ import com.google.gson.Gson;
/*     */ import com.google.gson.GsonBuilder;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.EmptyLLMBaseResponse;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMBaseResponse;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMResponseChoice;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMStreamingRequestConsumer;
/*     */ import com.intellij.util.io.HttpRequests;
/*     */ import java.io.IOException;
/*     */ import java.net.HttpURLConnection;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.text.StringsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\026\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B\035\022\006\020\003\032\0020\004\022\006\020\005\032\0028\000\022\006\020\006\032\0020\007¢\006\002\020\bJ\022\020\t\032\004\030\0010\n2\006\020\013\032\0020\fH\026J\n\020\r\032\004\030\0010\nH\026R\016\020\006\032\0020\007X\004¢\006\002\n\000¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/core/models/openai/OpenAIStreamingRequest;", "Body", "Lcom/intellij/ml/llm/core/models/openai/OpenAIBaseRequest;", "path", "", "body", "consumer", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMStreamingRequestConsumer;", "(Ljava/lang/String;Ljava/lang/Object;Lcom/intellij/ml/llm/core/models/requestResponse/LLMStreamingRequestConsumer;)V", "handleResponse", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseResponse;", "request", "Lcom/intellij/util/io/HttpRequests$Request;", "sendSync", "intellij.ml.llm"})
/*     */ public class OpenAIStreamingRequest<Body>
/*     */   extends OpenAIBaseRequest<Body>
/*     */ {
/*     */   @NotNull
/*     */   private final LLMStreamingRequestConsumer consumer;
/*     */   
/*     */   public OpenAIStreamingRequest(@NotNull String path, Object body, @NotNull LLMStreamingRequestConsumer consumer) {
/*  68 */     super(path, (Body)body);
/*     */     this.consumer = consumer; } @Nullable
/*  70 */   public LLMBaseResponse sendSync() { if (getBody() instanceof OpenAiChatRequestBody) {
/*  71 */       ((OpenAiChatRequestBody)getBody()).setStream(Boolean.valueOf(true));
/*     */     }
/*  73 */     return super.sendSync(); }
/*     */   
/*     */   @Nullable
/*     */   public LLMBaseResponse handleResponse(@NotNull HttpRequests.Request request) {
/*  77 */     Intrinsics.checkNotNullParameter(request, "request"); Intrinsics.checkNotNull(request.getConnection(), "null cannot be cast to non-null type java.net.HttpURLConnection"); int responseCode = ((HttpURLConnection)request.getConnection()).getResponseCode();
/*  78 */     if (responseCode != 200) {
/*  79 */       return null;
/*     */     }
/*     */     
/*     */     while (true) {
/*  83 */       Thread.sleep(50L);
/*  84 */       String line = request.getReader().readLine();
/*  85 */       Intrinsics.checkNotNullExpressionValue(line, "line"); if (!((((CharSequence)line).length() == 0) ? 1 : 0)) {
/*     */         
/*  87 */         Intrinsics.checkNotNullExpressionValue(line, "line"); line = StringsKt.removePrefix(line, "data: ");
/*  88 */         Intrinsics.checkNotNullExpressionValue(line, "line"); if (StringsKt.startsWith$default(line, "[DONE]", false, 2, null)) {
/*  89 */           LLMStreamingRequestConsumer.finish$default(this.consumer, false, 1, null);
/*     */           break;
/*     */         } 
/*     */         try {
/*     */           ResponseChoice choice;
/*  94 */           Gson gson = (new GsonBuilder())
/*  95 */             .registerTypeAdapter(ResponseChoice.class, new ResponseChoiceTypeAdapter())
/*  96 */             .create();
/*  97 */           OpenAIResponse response = (OpenAIResponse)gson.fromJson(line, OpenAIResponse.class);
/*  98 */           if ((ResponseChoice)CollectionsKt.firstOrNull(response.getChoices()) == null) { (ResponseChoice)CollectionsKt.firstOrNull(response.getChoices()); continue; }
/*  99 */            if (choice instanceof ResponseChoiceCompletion && !this.consumer.run(new LLMResponseChoice(((ResponseChoiceCompletion)choice).getText()))) {
/* 100 */             this.consumer.finish(false);
/*     */             break;
/*     */           } 
/* 103 */           if (choice instanceof ResponseChoiceChatStreaming) {
/* 104 */             if (((ResponseChoiceChatStreaming)choice).getDelta().getContent() == null) ((ResponseChoiceChatStreaming)choice).getDelta().getContent();  super(""); if (!(new LLMResponseChoice()).run(new LLMResponseChoice())) {
/* 105 */               this.consumer.finish(false);
/*     */               break;
/*     */             } 
/*     */           } 
/* 109 */         } catch (Exception ex) {
/* 110 */           this.consumer.finish(false);
/* 111 */           throw new IOException((Throwable)ex);
/*     */         } 
/*     */       } 
/* 114 */     }  return (LLMBaseResponse)EmptyLLMBaseResponse.INSTANCE;
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/openai/OpenAIStreamingRequest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */