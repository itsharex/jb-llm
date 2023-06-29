/*     */ package com.intellij.ml.llm.core.models.openai;
/*     */ 
/*     */ import com.google.gson.annotations.SerializedName;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMResponseChoice;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\t\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\017\n\002\020\013\n\000\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B+\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\f\020\006\032\b\022\004\022\0020\b0\007\022\006\020\t\032\0020\n¢\006\002\020\013J\t\020\024\032\0020\003HÆ\003J\t\020\025\032\0020\005HÆ\003J\017\020\026\032\b\022\004\022\0020\b0\007HÆ\003J\t\020\027\032\0020\nHÆ\003J7\020\030\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\016\b\002\020\006\032\b\022\004\022\0020\b0\0072\b\b\002\020\t\032\0020\nHÆ\001J\023\020\031\032\0020\0322\b\020\033\032\004\030\0010\034HÖ\003J\016\020\035\032\b\022\004\022\0020\0360\007H\026J\t\020\037\032\0020 HÖ\001J\t\020!\032\0020\003HÖ\001R\034\020\006\032\b\022\004\022\0020\b0\0078\006X\004¢\006\b\n\000\032\004\b\f\020\rR\026\020\004\032\0020\0058\006X\004¢\006\b\n\000\032\004\b\016\020\017R\026\020\002\032\0020\0038\006X\004¢\006\b\n\000\032\004\b\020\020\021R\026\020\t\032\0020\n8\006X\004¢\006\b\n\000\032\004\b\022\020\023¨\006\""}, d2 = {"Lcom/intellij/ml/llm/core/models/openai/OpenAIResponse;", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseResponse;", "type", "", "created", "", "choices", "", "Lcom/intellij/ml/llm/core/models/openai/ResponseChoice;", "usage", "Lcom/intellij/ml/llm/core/models/openai/ResponseUsage;", "(Ljava/lang/String;JLjava/util/List;Lcom/intellij/ml/llm/core/models/openai/ResponseUsage;)V", "getChoices", "()Ljava/util/List;", "getCreated", "()J", "getType", "()Ljava/lang/String;", "getUsage", "()Lcom/intellij/ml/llm/core/models/openai/ResponseUsage;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "getSuggestions", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;", "hashCode", "", "toString", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nOpenAIResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenAIResponse.kt\ncom/intellij/ml/llm/core/models/openai/OpenAIResponse\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,135:1\n1549#2:136\n1620#2,3:137\n*S KotlinDebug\n*F\n+ 1 OpenAIResponse.kt\ncom/intellij/ml/llm/core/models/openai/OpenAIResponse\n*L\n51#1:136\n51#1:137,3\n*E\n"})
/*     */ public final class OpenAIResponse implements LLMBaseResponse {
/*     */   @SerializedName("object")
/*     */   @NotNull
/*     */   private final String type;
/*     */   @SerializedName("created")
/*     */   private final long created;
/*     */   @SerializedName("choices")
/*     */   @NotNull
/*     */   private final List<ResponseChoice> choices;
/*     */   @SerializedName("usage")
/*     */   @NotNull
/*     */   private final ResponseUsage usage;
/*     */   
/*     */   @NotNull
/*     */   public final String getType() {
/*     */     return this.type;
/*     */   }
/*     */   
/*     */   public final long getCreated() {
/*     */     return this.created;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<ResponseChoice> getChoices() {
/*     */     return this.choices;
/*     */   }
/*     */   
/*  39 */   public OpenAIResponse(@NotNull String type, long created, @NotNull List<ResponseChoice> choices, @NotNull ResponseUsage usage) { this.type = type;
/*     */ 
/*     */     
/*  42 */     this.created = created;
/*     */ 
/*     */     
/*  45 */     this.choices = choices;
/*     */ 
/*     */     
/*  48 */     this.usage = usage; } @NotNull
/*  49 */   public final ResponseUsage getUsage() { return this.usage; } @NotNull
/*     */   public List<LLMResponseChoice> getSuggestions() {
/*  51 */     Iterable<ResponseChoice> $this$map$iv = this.choices; int $i$f$map = 0;
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
/* 136 */     Iterable<ResponseChoice> iterable1 = $this$map$iv; Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 137 */     for (ResponseChoice item$iv$iv : iterable1) {
/* 138 */       ResponseChoice responseChoice1 = item$iv$iv; Collection collection = destination$iv$iv; int $i$a$-map-OpenAIResponse$getSuggestions$1 = 0; ResponseChoice responseChoice2 = responseChoice1;
/* 139 */     }  return (List<LLMResponseChoice>)destination$iv$iv;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component1() {
/*     */     return this.type;
/*     */   }
/*     */   
/*     */   public final long component2() {
/*     */     return this.created;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<ResponseChoice> component3() {
/*     */     return this.choices;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ResponseUsage component4() {
/*     */     return this.usage;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final OpenAIResponse copy(@NotNull String type, long created, @NotNull List<? extends ResponseChoice> choices, @NotNull ResponseUsage usage) {
/*     */     Intrinsics.checkNotNullParameter(type, "type");
/*     */     Intrinsics.checkNotNullParameter(choices, "choices");
/*     */     Intrinsics.checkNotNullParameter(usage, "usage");
/*     */     return new OpenAIResponse(type, created, choices, usage);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "OpenAIResponse(type=" + this.type + ", created=" + this.created + ", choices=" + this.choices + ", usage=" + this.usage + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.type.hashCode();
/*     */     result = result * 31 + Long.hashCode(this.created);
/*     */     result = result * 31 + this.choices.hashCode();
/*     */     return result * 31 + this.usage.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof OpenAIResponse))
/*     */       return false; 
/*     */     OpenAIResponse openAIResponse = (OpenAIResponse)other;
/*     */     return !Intrinsics.areEqual(this.type, openAIResponse.type) ? false : ((this.created != openAIResponse.created) ? false : (!Intrinsics.areEqual(this.choices, openAIResponse.choices) ? false : (!!Intrinsics.areEqual(this.usage, openAIResponse.usage))));
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/openai/OpenAIResponse.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */