/*    */ package ai.grazie.utils;
/*    */ 
/*    */ import ai.grazie.utils.mpp.StreamDataLoader;
/*    */ import java.nio.file.Files;
/*    */ import java.nio.file.LinkOption;
/*    */ import java.nio.file.Path;
/*    */ import java.util.Arrays;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.concurrent.ThreadsKt;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\b&\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005¢\006\002\020\006J\f\020\t\032\0020\n*\0020\nH\004R\016\020\007\032\0020\bX\004¢\006\002\n\000¨\006\013"}, d2 = {"Lai/grazie/utils/ToolFromResources;", "Lai/grazie/utils/FileFromResources;", "name", "", "loader", "Lai/grazie/utils/mpp/StreamDataLoader;", "(Ljava/lang/String;Lai/grazie/utils/mpp/StreamDataLoader;)V", "errorsPath", "Ljava/nio/file/Path;", "logErrors", "Ljava/lang/ProcessBuilder;", "utils-common"})
/*    */ public abstract class ToolFromResources
/*    */   extends FileFromResources
/*    */ {
/*    */   @NotNull
/*    */   private final Path errorsPath;
/*    */   
/*    */   public ToolFromResources(@NotNull String name, @NotNull StreamDataLoader loader) {
/* 32 */     super(loader);
/* 33 */     this.errorsPath = file(name + "_err", ".txt");
/*    */ 
/*    */     
/* 36 */     Runtime.getRuntime().addShutdownHook(ThreadsKt.thread$default(false, false, null, null, 0, new Function0<Unit>() { public final void invoke() {
/* 37 */               if (Files.exists(ToolFromResources.this.errorsPath, Arrays.<LinkOption>copyOf(new LinkOption[0], (new LinkOption[0]).length)) && Files.size(ToolFromResources.this.errorsPath) == 0L) {
/* 38 */                 Files.deleteIfExists(ToolFromResources.this.errorsPath);
/*    */               }
/*    */             } }
/*    */           30, null));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   protected final ProcessBuilder logErrors(@NotNull ProcessBuilder $this$logErrors) {
/* 49 */     Intrinsics.checkNotNullParameter($this$logErrors, "<this>"); Intrinsics.checkNotNullExpressionValue($this$logErrors.redirectError(this.errorsPath.toFile()), "redirectError(errorsPath.toFile())"); return $this$logErrors.redirectError(this.errorsPath.toFile());
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/ToolFromResources.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */