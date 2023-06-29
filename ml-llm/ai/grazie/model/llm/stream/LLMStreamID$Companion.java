/*    */ package ai.grazie.model.llm.stream;
/*    */ 
/*    */ import ai.grazie.utils.mpp.UUID;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\006\020\003\032\0020\004J\017\020\005\032\b\022\004\022\0020\0040\006HÆ\001¨\006\007"}, d2 = {"Lai/grazie/model/llm/stream/LLMStreamID$Companion;", "", "()V", "random", "Lai/grazie/model/llm/stream/LLMStreamID;", "serializer", "Lkotlinx/serialization/KSerializer;", "model-llm"})
/*    */ public final class Companion {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/* 12 */   public final KSerializer<LLMStreamID> serializer() { return LLMStreamID.Serializer.INSTANCE; } @NotNull
/* 13 */   public final LLMStreamID random() { return new LLMStreamID(UUID.Companion.random()); }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/llm/stream/LLMStreamID$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */