/*     */ package ai.grazie.utils.mpp;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.io.InputStream;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\022\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\004H\026J\031\020\006\032\0020\0072\006\020\005\032\0020\004H@ø\001\000¢\006\002\020\bJ\020\020\t\032\0020\n2\006\020\005\032\0020\004H\026J\031\020\013\032\0020\f2\006\020\005\032\0020\004H@ø\001\000¢\006\002\020\b\002\004\n\002\b\031¨\006\r"}, d2 = {"Lai/grazie/utils/mpp/FromServerTestResourcesDataLoader;", "Lai/grazie/utils/mpp/RootStreamDataLoader;", "()V", "absolute", "Lai/grazie/utils/mpp/DataLoader$Path;", "path", "bytes", "", "(Lai/grazie/utils/mpp/DataLoader$Path;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stream", "Ljava/io/InputStream;", "text", "", "utils-common"})
/*     */ @SourceDebugExtension({"SMAP\nLoaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Loaders.kt\nai/grazie/utils/mpp/FromServerTestResourcesDataLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
/*     */ public final class FromServerTestResourcesDataLoader
/*     */   implements RootStreamDataLoader
/*     */ {
/*     */   @NotNull
/*     */   public static final FromServerTestResourcesDataLoader INSTANCE = new FromServerTestResourcesDataLoader();
/*     */   
/*     */   @NotNull
/*     */   public InputStream stream(@NotNull DataLoader.Path path) {
/*  79 */     Intrinsics.checkNotNullParameter(path, "path"); if (TestResources.INSTANCE.streamOrNull(path.toAbsolutePath()) == null) TestResources.INSTANCE.streamOrNull(path.toAbsolutePath());  return FromServerResourcesDataLoader.INSTANCE.stream(path);
/*     */   }
/*     */   @Nullable
/*     */   public Object bytes(@NotNull DataLoader.Path path, @NotNull Continuation<? super byte[]> $completion) {
/*  83 */     if (TestResources.INSTANCE.bytesOrNull(path.toAbsolutePath()) == null) { TestResources.INSTANCE.bytesOrNull(path.toAbsolutePath()); return FromServerResourcesDataLoader.INSTANCE.bytes(path, $completion); }  return TestResources.INSTANCE.bytesOrNull(path.toAbsolutePath());
/*     */   }
/*     */   @Nullable
/*     */   public Object text(@NotNull DataLoader.Path path, @NotNull Continuation<? super String> $completion) {
/*  87 */     if (TestResources.INSTANCE.textOrNull(path.toAbsolutePath()) == null) { TestResources.INSTANCE.textOrNull(path.toAbsolutePath()); return FromServerResourcesDataLoader.INSTANCE.text(path, $completion); }  return TestResources.INSTANCE.textOrNull(path.toAbsolutePath());
/*     */   }
/*     */   @NotNull
/*     */   public DataLoader.Path absolute(@NotNull DataLoader.Path path) {
/*  91 */     Intrinsics.checkNotNullParameter(path, "path"); String it = (new File(TestResources.INSTANCE.path(path).toRelativePath())).getAbsolutePath();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 148 */     int $i$a$-let-FromServerTestResourcesDataLoader$absolute$1 = 0;
/*     */     Intrinsics.checkNotNullExpressionValue(it, "it");
/*     */     return new DataLoader.Path(it);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/mpp/FromServerTestResourcesDataLoader.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */