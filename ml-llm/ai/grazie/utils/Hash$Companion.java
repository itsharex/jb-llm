/*    */ package ai.grazie.utils;
/*    */ import kotlin.Metadata;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/utils/Hash$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/utils/Hash;", "utils-common"})
/*    */ public final class Companion {
/*    */   @NotNull
/*    */   public final KSerializer<Hash> serializer() {
/* 10 */     return Hash.Serializer.INSTANCE;
/*    */   }
/*    */   
/*    */   private Companion() {}
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/Hash$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */