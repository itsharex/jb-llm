/*    */ package ai.grazie.utils.mpp.collections;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Pair;
/*    */ import kotlin.TuplesKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.reflect.KClass;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\030\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\0325\020\000\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\006\b\000\020\002\030\001\"\006\b\001\020\003\030\001*\016\022\004\022\002H\002\022\004\022\002H\0030\004H\b\032>\020\000\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\004\b\001\020\003*\016\022\004\022\002H\002\022\004\022\002H\0030\0042\006\020\005\032\0020\0062\006\020\007\032\0020\006\032.\020\b\032\016\022\004\022\002H\002\022\004\022\002H\0030\004\"\004\b\000\020\002\"\004\b\001\020\003*\016\022\004\022\002H\002\022\004\022\002H\0030\001¨\006\t"}, d2 = {"toExportable", "Lai/grazie/utils/mpp/collections/ExportablePair;", "K", "V", "Lkotlin/Pair;", "keysType", "Lai/grazie/utils/mpp/collections/ExportableType;", "valuesType", "toPair", "utils-common"})
/*    */ @SourceDebugExtension({"SMAP\nExportablePair.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExportablePair.kt\nai/grazie/utils/mpp/collections/ExportablePairKt\n+ 2 ExportableType.kt\nai/grazie/utils/mpp/collections/ExportableTypeKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,55:1\n33#2:56\n33#2:58\n26#3:57\n26#3:59\n*S KotlinDebug\n*F\n+ 1 ExportablePair.kt\nai/grazie/utils/mpp/collections/ExportablePairKt\n*L\n51#1:56\n52#1:58\n51#1:57\n52#1:59\n*E\n"})
/*    */ public final class ExportablePairKt
/*    */ {
/*    */   @NotNull
/*    */   public static final <K, V> Pair<K, V> toPair(@NotNull ExportablePair $this$toPair) {
/* 41 */     Intrinsics.checkNotNullParameter($this$toPair, "<this>"); return TuplesKt.to($this$toPair.getFirst(), $this$toPair.getSecond());
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final <K, V> ExportablePair<K, V> toExportable(@NotNull Pair $this$toExportable, @NotNull ExportableType keysType, @NotNull ExportableType valuesType) {
/* 47 */     Intrinsics.checkNotNullParameter($this$toExportable, "<this>"); Intrinsics.checkNotNullParameter(keysType, "keysType"); Intrinsics.checkNotNullParameter(valuesType, "valuesType"); return new ExportablePair<>((K)$this$toExportable.getFirst(), (V)$this$toExportable.getSecond(), keysType, valuesType);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/mpp/collections/ExportablePairKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */