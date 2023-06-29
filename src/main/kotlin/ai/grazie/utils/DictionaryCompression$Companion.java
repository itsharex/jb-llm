/*    */ package ai.grazie.utils;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J)\020\003\032\016\022\n\022\b\022\004\022\002H\0060\0050\004\"\004\b\001\020\0062\f\020\007\032\b\022\004\022\002H\0060\004HÆ\001¨\006\b"}, d2 = {"Lai/grazie/utils/DictionaryCompression$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/utils/DictionaryCompression;", "T0", "typeSerial0", "utils-common"})
/*    */ public final class Companion {
/*    */   @NotNull
/*    */   public final <T0> KSerializer<DictionaryCompression<T0>> serializer(@NotNull KSerializer typeSerial0) {
/* 10 */     Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0"); return (KSerializer<DictionaryCompression<T0>>)new DictionaryCompression.$serializer(typeSerial0);
/*    */   }
/*    */   
/*    */   private Companion() {}
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/DictionaryCompression$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */