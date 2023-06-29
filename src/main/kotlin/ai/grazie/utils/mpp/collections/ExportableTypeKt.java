/*    */ package ai.grazie.utils.mpp.collections;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlin.reflect.KClasses;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\"\n\000\n\002\020\002\n\002\030\002\n\000\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\021\n\002\b\002\032\022\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\004\032 \020\005\032\0020\002\"\006\b\000\020\006\030\001*\n\022\006\022\004\b\002H\0060\007H\bø\001\000\032.\020\005\032\0020\002\"\004\b\000\020\006*\n\022\006\022\004\b\002H\0060\0072\f\020\b\032\b\022\004\022\002H\0060\tø\001\000¢\006\002\020\n\002\004\n\002\b9¨\006\013"}, d2 = {"requireIsInstance", "", "Lai/grazie/utils/mpp/collections/ExportableType;", "value", "", "toExportable", "T", "Lkotlin/reflect/KClass;", "emptyArray", "", "(Lkotlin/reflect/KClass;[Ljava/lang/Object;)Lai/grazie/utils/mpp/collections/ExportableType;", "utils-common"})
/*    */ @SourceDebugExtension({"SMAP\nExportableType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExportableType.kt\nai/grazie/utils/mpp/collections/ExportableTypeKt\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,38:1\n26#2:39\n*S KotlinDebug\n*F\n+ 1 ExportableType.kt\nai/grazie/utils/mpp/collections/ExportableTypeKt\n*L\n33#1:39\n*E\n"})
/*    */ public final class ExportableTypeKt
/*    */ {
/*    */   @NotNull
/*    */   public static final <T> ExportableType toExportable(@NotNull KClass<?> $this$toExportable, @NotNull Object[] emptyArray) {
/* 31 */     Intrinsics.checkNotNullParameter($this$toExportable, "<this>"); Intrinsics.checkNotNullParameter(emptyArray, "emptyArray"); return new ExportableType($this$toExportable, emptyArray);
/*    */   }
/*    */ 
/*    */   
/*    */   public static final void requireIsInstance(@NotNull ExportableType $this$requireIsInstance, @NotNull Object value) {
/* 36 */     Intrinsics.checkNotNullParameter($this$requireIsInstance, "<this>"); Intrinsics.checkNotNullParameter(value, "value"); KClasses.cast($this$requireIsInstance.getKlass$utils_common(), value);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/mpp/collections/ExportableTypeKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */