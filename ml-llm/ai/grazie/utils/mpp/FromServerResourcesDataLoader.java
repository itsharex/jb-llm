/*    */ package ai.grazie.utils.mpp;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.InputStream;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.io.FilesKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\022\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\004H\026J\031\020\006\032\0020\0072\006\020\005\032\0020\004H@ø\001\000¢\006\002\020\bJ\020\020\t\032\0020\n2\006\020\005\032\0020\004H\026J\031\020\013\032\0020\f2\006\020\005\032\0020\004H@ø\001\000¢\006\002\020\b\002\004\n\002\b\031¨\006\r"}, d2 = {"Lai/grazie/utils/mpp/FromServerResourcesDataLoader;", "Lai/grazie/utils/mpp/RootStreamDataLoader;", "()V", "absolute", "Lai/grazie/utils/mpp/DataLoader$Path;", "path", "bytes", "", "(Lai/grazie/utils/mpp/DataLoader$Path;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stream", "Ljava/io/InputStream;", "text", "", "utils-common"})
/*    */ public final class FromServerResourcesDataLoader
/*    */   implements RootStreamDataLoader
/*    */ {
/*    */   @NotNull
/*    */   public static final FromServerResourcesDataLoader INSTANCE = new FromServerResourcesDataLoader();
/*    */   
/*    */   @NotNull
/*    */   public InputStream stream(@NotNull DataLoader.Path path) {
/* 48 */     Intrinsics.checkNotNullParameter(path, "path"); if (Resources.INSTANCE.streamOrNull(path.toAbsolutePath()) == null) Resources.INSTANCE.streamOrNull(path.toAbsolutePath());  return new FileInputStream(new File(absolute(path).toAbsolutePath()));
/*    */   }
/*    */   @Nullable
/*    */   public Object bytes(@NotNull DataLoader.Path path, @NotNull Continuation $completion) {
/* 52 */     if (Resources.INSTANCE.bytesOrNull(path.toAbsolutePath()) == null) Resources.INSTANCE.bytesOrNull(path.toAbsolutePath());  return FilesKt.readBytes(new File(absolute(path).toAbsolutePath()));
/*    */   }
/*    */   @Nullable
/*    */   public Object text(@NotNull DataLoader.Path path, @NotNull Continuation $completion) {
/* 56 */     if (Resources.INSTANCE.textOrNull(path.toAbsolutePath()) == null) Resources.INSTANCE.textOrNull(path.toAbsolutePath());  return FilesKt.readText$default(new File(absolute(path).toAbsolutePath()), null, 1, null);
/*    */   }
/*    */   @NotNull
/*    */   public DataLoader.Path absolute(@NotNull DataLoader.Path path) {
/* 60 */     Intrinsics.checkNotNullParameter(path, "path"); DataLoader.Path server = new DataLoader.Path("/server/lib", path);
/* 61 */     if ((new File(server.toAbsolutePath())).exists()) return server;
/*    */ 
/*    */     
/* 64 */     DataLoader.Path test = new DataLoader.Path("build/processedResources/" + PlatformKt.<String>forPlatform("js", "jvm") + "/main", path);
/* 65 */     if ((new File(test.toRelativePath())).exists()) { Intrinsics.checkNotNullExpressionValue((new File(test.toRelativePath())).getAbsolutePath(), "File(test.toRelativePath()).absolutePath"); return new DataLoader.Path((new File(test.toRelativePath())).getAbsolutePath()); }  throw new IllegalStateException(("Can't find " + 
/*    */         
/* 67 */         path + " in test resources or in server/lib directory").toString());
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/mpp/FromServerResourcesDataLoader.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */