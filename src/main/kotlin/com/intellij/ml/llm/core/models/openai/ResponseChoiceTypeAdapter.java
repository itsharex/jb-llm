/*    */ package com.intellij.ml.llm.core.models.openai;
/*    */ import com.google.gson.Gson;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.stream.JsonReader;
/*    */ import com.google.gson.stream.JsonWriter;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\030\0002\b\022\004\022\0020\0020\001B\005¢\006\002\020\003J\020\020\004\032\0020\0022\006\020\005\032\0020\006H\026J\030\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\002H\026¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/core/models/openai/ResponseChoiceTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/intellij/ml/llm/core/models/openai/ResponseChoice;", "()V", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "write", "", "p0", "Lcom/google/gson/stream/JsonWriter;", "p1", "intellij.ml.llm"})
/*    */ public final class ResponseChoiceTypeAdapter extends TypeAdapter<ResponseChoice> {
/*    */   @NotNull
/*    */   public ResponseChoice read(@NotNull JsonReader reader) {
/* 14 */     Intrinsics.checkNotNullParameter(reader, "reader"); Gson gson = new Gson();
/* 15 */     JsonToken peeked = reader.peek();
/* 16 */     Intrinsics.checkNotNullExpressionValue(
/* 17 */         gson.fromJson(reader, JsonObject.class), "{\n      gson.fromJson(re…Object::class.java)\n    }"); JsonObject jsonObject = (peeked == JsonToken.BEGIN_OBJECT) ? (JsonObject)gson.fromJson(reader, JsonObject.class) : 
/*    */ 
/*    */       
/* 20 */       new JsonObject();
/*    */     
/* 22 */     if (jsonObject.has("text")) {
/* 23 */       Intrinsics.checkNotNullExpressionValue(gson.fromJson((JsonElement)jsonObject, ResponseChoiceCompletion.class), "gson.fromJson(jsonObject…ceCompletion::class.java)"); return (ResponseChoice)gson.fromJson((JsonElement)jsonObject, ResponseChoiceCompletion.class);
/*    */     } 
/* 25 */     if (jsonObject.has("delta")) {
/* 26 */       Intrinsics.checkNotNullExpressionValue(gson.fromJson((JsonElement)jsonObject, ResponseChoiceChatStreaming.class), "gson.fromJson(jsonObject…hatStreaming::class.java)"); return (ResponseChoice)gson.fromJson((JsonElement)jsonObject, ResponseChoiceChatStreaming.class);
/*    */     } 
/*    */     
/* 29 */     Intrinsics.checkNotNullExpressionValue(gson.fromJson((JsonElement)jsonObject, ResponseChoiceChat.class), "gson.fromJson(jsonObject…seChoiceChat::class.java)"); return (ResponseChoice)gson.fromJson((JsonElement)jsonObject, ResponseChoiceChat.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public void write(@NotNull JsonWriter p0, @NotNull ResponseChoice p1) {
/* 34 */     Intrinsics.checkNotNullParameter(p0, "p0"); Intrinsics.checkNotNullParameter(p1, "p1"); String str = "Not yet implemented"; throw new NotImplementedError("An operation is not implemented: " + str);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/openai/ResponseChoiceTypeAdapter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */