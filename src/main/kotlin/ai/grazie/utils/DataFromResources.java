/*    */ package ai.grazie.utils;
/*    */ 
/*    */ import ai.grazie.utils.mpp.StreamDataLoader;
/*    */ import java.nio.file.Path;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\b&\030\0002\0020\001B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\b\b\002\020\005\032\0020\006¢\006\002\020\007R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\n\020\013¨\006\f"}, d2 = {"Lai/grazie/utils/DataFromResources;", "Lai/grazie/utils/FileFromResources;", "name", "", "ext", "loader", "Lai/grazie/utils/mpp/StreamDataLoader;", "(Ljava/lang/String;Ljava/lang/String;Lai/grazie/utils/mpp/StreamDataLoader;)V", "path", "Ljava/nio/file/Path;", "getPath", "()Ljava/nio/file/Path;", "utils-common"})
/*    */ public abstract class DataFromResources
/*    */   extends FileFromResources
/*    */ {
/*    */   @NotNull
/*    */   private final Path path;
/*    */   
/*    */   public DataFromResources(@NotNull String name, @NotNull String ext, @NotNull StreamDataLoader loader) {
/* 56 */     super(loader);
/* 57 */     this.path = file(name, ext); } @NotNull public final Path getPath() { return this.path; }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/DataFromResources.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */