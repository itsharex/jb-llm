/*    */ package ai.grazie.model.llm.profile;
/*    */ 
/*    */ import ai.grazie.model.llm.LLMType;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\b\b&\030\0002\0020\001B!\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\n\b\002\020\006\032\004\030\0010\007¢\006\002\020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\023\020\006\032\004\030\0010\007¢\006\b\n\000\032\004\b\013\020\fR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\r\020\016¨\006\017"}, d2 = {"Lai/grazie/model/llm/profile/LLMProfile;", "", "id", "Lai/grazie/model/llm/profile/LLMProfileID;", "type", "Lai/grazie/model/llm/LLMType;", "metadata", "Lai/grazie/model/llm/profile/LLMProfileMetadata;", "(Lai/grazie/model/llm/profile/LLMProfileID;Lai/grazie/model/llm/LLMType;Lai/grazie/model/llm/profile/LLMProfileMetadata;)V", "getId", "()Lai/grazie/model/llm/profile/LLMProfileID;", "getMetadata", "()Lai/grazie/model/llm/profile/LLMProfileMetadata;", "getType", "()Lai/grazie/model/llm/LLMType;", "model-llm"})
/*    */ public abstract class LLMProfile {
/*    */   @NotNull
/*    */   private final LLMProfileID id;
/*    */   
/* 11 */   public LLMProfile(@NotNull LLMProfileID id, @NotNull LLMType type, @Nullable LLMProfileMetadata metadata) { this.id = id; this.type = type; this.metadata = metadata; } @NotNull private final LLMType type; @Nullable private final LLMProfileMetadata metadata; @NotNull public final LLMProfileID getId() { return this.id; } @NotNull public final LLMType getType() { return this.type; } @Nullable public final LLMProfileMetadata getMetadata() { return this.metadata; }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/llm/profile/LLMProfile.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */