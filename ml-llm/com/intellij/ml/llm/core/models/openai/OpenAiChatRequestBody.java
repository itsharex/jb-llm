/*    */ package com.intellij.ml.llm.core.models.openai;
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\020 \n\002\030\002\n\000\n\002\020\006\n\002\b\002\n\002\020\b\n\000\n\002\020\013\n\002\b\005\n\002\020$\n\002\b.\b\b\030\0002\0020\001B­\001\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\003\022\016\020\005\032\n\022\004\022\0020\007\030\0010\006\022\n\b\002\020\b\032\004\030\0010\t\022\n\b\002\020\n\032\004\030\0010\t\022\n\b\002\020\013\032\004\030\0010\f\022\n\b\002\020\r\032\004\030\0010\016\022\n\b\002\020\017\032\004\030\0010\003\022\n\b\002\020\020\032\004\030\0010\f\022\n\b\002\020\021\032\004\030\0010\t\022\n\b\002\020\022\032\004\030\0010\t\022\026\b\002\020\023\032\020\022\004\022\0020\003\022\004\022\0020\f\030\0010\024\022\n\b\002\020\025\032\004\030\0010\003¢\006\002\020\026J\t\020/\032\0020\003HÆ\003J\020\0200\032\004\030\0010\tHÆ\003¢\006\002\020\030J\020\0201\032\004\030\0010\tHÆ\003¢\006\002\020\030J\027\0202\032\020\022\004\022\0020\003\022\004\022\0020\f\030\0010\024HÆ\003J\013\0203\032\004\030\0010\003HÆ\003J\013\0204\032\004\030\0010\003HÆ\003J\021\0205\032\n\022\004\022\0020\007\030\0010\006HÆ\003J\020\0206\032\004\030\0010\tHÆ\003¢\006\002\020\030J\020\0207\032\004\030\0010\tHÆ\003¢\006\002\020\030J\020\0208\032\004\030\0010\fHÆ\003¢\006\002\020\035J\020\0209\032\004\030\0010\016HÆ\003¢\006\002\020(J\013\020:\032\004\030\0010\003HÆ\003J\020\020;\032\004\030\0010\fHÆ\003¢\006\002\020\035Jº\001\020<\032\0020\0002\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\0032\020\b\002\020\005\032\n\022\004\022\0020\007\030\0010\0062\n\b\002\020\b\032\004\030\0010\t2\n\b\002\020\n\032\004\030\0010\t2\n\b\002\020\013\032\004\030\0010\f2\n\b\002\020\r\032\004\030\0010\0162\n\b\002\020\017\032\004\030\0010\0032\n\b\002\020\020\032\004\030\0010\f2\n\b\002\020\021\032\004\030\0010\t2\n\b\002\020\022\032\004\030\0010\t2\026\b\002\020\023\032\020\022\004\022\0020\003\022\004\022\0020\f\030\0010\0242\n\b\002\020\025\032\004\030\0010\003HÆ\001¢\006\002\020=J\023\020>\032\0020\0162\b\020?\032\004\030\0010\001HÖ\003J\t\020@\032\0020\fHÖ\001J\t\020A\032\0020\003HÖ\001R\032\020\022\032\004\030\0010\t8\006X\004¢\006\n\n\002\020\031\032\004\b\027\020\030R$\020\023\032\020\022\004\022\0020\003\022\004\022\0020\f\030\0010\0248\006X\004¢\006\b\n\000\032\004\b\032\020\033R\032\020\020\032\004\030\0010\f8\006X\004¢\006\n\n\002\020\036\032\004\b\034\020\035R\036\020\005\032\n\022\004\022\0020\007\030\0010\0068\006X\004¢\006\b\n\000\032\004\b\037\020 R\026\020\002\032\0020\0038\006X\004¢\006\b\n\000\032\004\b!\020\"R\032\020\013\032\004\030\0010\f8\006X\004¢\006\n\n\002\020\036\032\004\b#\020\035R\032\020\021\032\004\030\0010\t8\006X\004¢\006\n\n\002\020\031\032\004\b$\020\030R\030\020\004\032\004\030\0010\0038\006X\004¢\006\b\n\000\032\004\b%\020\"R\030\020\017\032\004\030\0010\0038\006X\004¢\006\b\n\000\032\004\b&\020\"R\"\020\r\032\004\030\0010\0168\006@\006X\016¢\006\020\n\002\020+\032\004\b'\020(\"\004\b)\020*R\032\020\b\032\004\030\0010\t8\006X\004¢\006\n\n\002\020\031\032\004\b,\020\030R\032\020\n\032\004\030\0010\t8\006X\004¢\006\n\n\002\020\031\032\004\b-\020\030R\030\020\025\032\004\030\0010\0038\006X\004¢\006\b\n\000\032\004\b.\020\"¨\006B"}, d2 = {"Lcom/intellij/ml/llm/core/models/openai/OpenAiChatRequestBody;", "", "model", "", "prompt", "messages", "", "Lcom/intellij/ml/llm/core/models/openai/OpenAiChatMessage;", "temperature", "", "topP", "numberOfSuggestions", "", "stream", "", "stop", "maxTokens", "presencePenalty", "frequencyPenalty", "logitBias", "", "user", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;Ljava/lang/String;)V", "getFrequencyPenalty", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLogitBias", "()Ljava/util/Map;", "getMaxTokens", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMessages", "()Ljava/util/List;", "getModel", "()Ljava/lang/String;", "getNumberOfSuggestions", "getPresencePenalty", "getPrompt", "getStop", "getStream", "()Ljava/lang/Boolean;", "setStream", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getTemperature", "getTopP", "getUser", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;Ljava/lang/String;)Lcom/intellij/ml/llm/core/models/openai/OpenAiChatRequestBody;", "equals", "other", "hashCode", "toString", "intellij.ml.llm"})
/*    */ public final class OpenAiChatRequestBody { @SerializedName("model")
/*    */   @NotNull
/*    */   private final String model; @SerializedName("prompt")
/*    */   @Nullable
/*    */   private final String prompt; @SerializedName("messages")
/*    */   @Nullable
/*    */   private final List<OpenAiChatMessage> messages; @SerializedName("temperature")
/*    */   @Nullable
/*    */   private final Double temperature; @SerializedName("top_p")
/*    */   @Nullable
/*    */   private final Double topP; @SerializedName("n")
/*    */   @Nullable
/*    */   private final Integer numberOfSuggestions;
/*    */   
/* 17 */   public OpenAiChatRequestBody(@NotNull String model, @Nullable String prompt, @Nullable List<OpenAiChatMessage> messages, @Nullable Double temperature, @Nullable Double topP, @Nullable Integer numberOfSuggestions, @Nullable Boolean stream, @Nullable String stop, @Nullable Integer maxTokens, @Nullable Double presencePenalty, @Nullable Double frequencyPenalty, @Nullable Map<String, Integer> logitBias, @Nullable String user) { this.model = model;
/*    */ 
/*    */     
/* 20 */     this.prompt = prompt;
/*    */ 
/*    */     
/* 23 */     this.messages = messages;
/*    */ 
/*    */     
/* 26 */     this.temperature = temperature;
/*    */ 
/*    */     
/* 29 */     this.topP = topP;
/*    */ 
/*    */     
/* 32 */     this.numberOfSuggestions = numberOfSuggestions;
/*    */ 
/*    */     
/* 35 */     this.stream = stream;
/*    */ 
/*    */     
/* 38 */     this.stop = stop;
/*    */ 
/*    */     
/* 41 */     this.maxTokens = maxTokens;
/*    */ 
/*    */     
/* 44 */     this.presencePenalty = presencePenalty;
/*    */ 
/*    */     
/* 47 */     this.frequencyPenalty = frequencyPenalty;
/*    */ 
/*    */     
/* 50 */     this.logitBias = logitBias;
/*    */ 
/*    */     
/* 53 */     this.user = user; }
/* 54 */   @SerializedName("stream") @Nullable private Boolean stream; @SerializedName("stop") @Nullable private final String stop; @SerializedName("max_tokens") @Nullable private final Integer maxTokens; @SerializedName("presence_penalty") @Nullable private final Double presencePenalty; @SerializedName("frequency_penalty") @Nullable private final Double frequencyPenalty; @SerializedName("logit_bias") @Nullable private final Map<String, Integer> logitBias; @SerializedName("user") @Nullable private final String user; @NotNull public final String getModel() { return this.model; } @Nullable public final String getPrompt() { return this.prompt; } @Nullable public final List<OpenAiChatMessage> getMessages() { return this.messages; } @Nullable public final Double getTemperature() { return this.temperature; } @Nullable public final Double getTopP() { return this.topP; } @Nullable public final Integer getNumberOfSuggestions() { return this.numberOfSuggestions; } @Nullable public final String getUser() { return this.user; }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final Boolean getStream() {
/*    */     return this.stream;
/*    */   }
/*    */   
/*    */   public final void setStream(@Nullable Boolean <set-?>) {
/*    */     this.stream = <set-?>;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String getStop() {
/*    */     return this.stop;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Integer getMaxTokens() {
/*    */     return this.maxTokens;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Double getPresencePenalty() {
/*    */     return this.presencePenalty;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Double getFrequencyPenalty() {
/*    */     return this.frequencyPenalty;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Map<String, Integer> getLogitBias() {
/*    */     return this.logitBias;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.model;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component2() {
/*    */     return this.prompt;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final List<OpenAiChatMessage> component3() {
/*    */     return this.messages;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Double component4() {
/*    */     return this.temperature;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Double component5() {
/*    */     return this.topP;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Integer component6() {
/*    */     return this.numberOfSuggestions;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Boolean component7() {
/*    */     return this.stream;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component8() {
/*    */     return this.stop;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Integer component9() {
/*    */     return this.maxTokens;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Double component10() {
/*    */     return this.presencePenalty;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Double component11() {
/*    */     return this.frequencyPenalty;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Map<String, Integer> component12() {
/*    */     return this.logitBias;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component13() {
/*    */     return this.user;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final OpenAiChatRequestBody copy(@NotNull String model, @Nullable String prompt, @Nullable List<OpenAiChatMessage> messages, @Nullable Double temperature, @Nullable Double topP, @Nullable Integer numberOfSuggestions, @Nullable Boolean stream, @Nullable String stop, @Nullable Integer maxTokens, @Nullable Double presencePenalty, @Nullable Double frequencyPenalty, @Nullable Map<String, Integer> logitBias, @Nullable String user) {
/*    */     Intrinsics.checkNotNullParameter(model, "model");
/*    */     return new OpenAiChatRequestBody(model, prompt, messages, temperature, topP, numberOfSuggestions, stream, stop, maxTokens, presencePenalty, frequencyPenalty, logitBias, user);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "OpenAiChatRequestBody(model=" + this.model + ", prompt=" + this.prompt + ", messages=" + this.messages + ", temperature=" + this.temperature + ", topP=" + this.topP + ", numberOfSuggestions=" + this.numberOfSuggestions + ", stream=" + this.stream + ", stop=" + this.stop + ", maxTokens=" + this.maxTokens + ", presencePenalty=" + this.presencePenalty + ", frequencyPenalty=" + this.frequencyPenalty + ", logitBias=" + this.logitBias + ", user=" + this.user + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.model.hashCode();
/*    */     result = result * 31 + ((this.prompt == null) ? 0 : this.prompt.hashCode());
/*    */     result = result * 31 + ((this.messages == null) ? 0 : this.messages.hashCode());
/*    */     result = result * 31 + ((this.temperature == null) ? 0 : this.temperature.hashCode());
/*    */     result = result * 31 + ((this.topP == null) ? 0 : this.topP.hashCode());
/*    */     result = result * 31 + ((this.numberOfSuggestions == null) ? 0 : this.numberOfSuggestions.hashCode());
/*    */     result = result * 31 + ((this.stream == null) ? 0 : this.stream.hashCode());
/*    */     result = result * 31 + ((this.stop == null) ? 0 : this.stop.hashCode());
/*    */     result = result * 31 + ((this.maxTokens == null) ? 0 : this.maxTokens.hashCode());
/*    */     result = result * 31 + ((this.presencePenalty == null) ? 0 : this.presencePenalty.hashCode());
/*    */     result = result * 31 + ((this.frequencyPenalty == null) ? 0 : this.frequencyPenalty.hashCode());
/*    */     result = result * 31 + ((this.logitBias == null) ? 0 : this.logitBias.hashCode());
/*    */     return result * 31 + ((this.user == null) ? 0 : this.user.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof OpenAiChatRequestBody))
/*    */       return false; 
/*    */     OpenAiChatRequestBody openAiChatRequestBody = (OpenAiChatRequestBody)other;
/*    */     return !Intrinsics.areEqual(this.model, openAiChatRequestBody.model) ? false : (!Intrinsics.areEqual(this.prompt, openAiChatRequestBody.prompt) ? false : (!Intrinsics.areEqual(this.messages, openAiChatRequestBody.messages) ? false : (!Intrinsics.areEqual(this.temperature, openAiChatRequestBody.temperature) ? false : (!Intrinsics.areEqual(this.topP, openAiChatRequestBody.topP) ? false : (!Intrinsics.areEqual(this.numberOfSuggestions, openAiChatRequestBody.numberOfSuggestions) ? false : (!Intrinsics.areEqual(this.stream, openAiChatRequestBody.stream) ? false : (!Intrinsics.areEqual(this.stop, openAiChatRequestBody.stop) ? false : (!Intrinsics.areEqual(this.maxTokens, openAiChatRequestBody.maxTokens) ? false : (!Intrinsics.areEqual(this.presencePenalty, openAiChatRequestBody.presencePenalty) ? false : (!Intrinsics.areEqual(this.frequencyPenalty, openAiChatRequestBody.frequencyPenalty) ? false : (!Intrinsics.areEqual(this.logitBias, openAiChatRequestBody.logitBias) ? false : (!!Intrinsics.areEqual(this.user, openAiChatRequestBody.user)))))))))))));
/*    */   } }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/openai/OpenAiChatRequestBody.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */