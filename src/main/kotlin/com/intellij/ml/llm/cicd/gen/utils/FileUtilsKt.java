/*    */ package com.intellij.ml.llm.cicd.gen.utils;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\020\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\003\032 \020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0012\006\020\005\032\0020\001H\000¨\006\006"}, d2 = {"generateUniqueFilename", "", "dir", "Ljava/nio/file/Path;", "defaultFilename", "extension", "intellij.ml.llm"})
/*    */ public final class FileUtilsKt {
/*    */   @NotNull
/*    */   public static final String generateUniqueFilename(@NotNull Path dir, @NotNull String defaultFilename, @NotNull String extension) {
/*  7 */     Intrinsics.checkNotNullParameter(dir, "dir"); Intrinsics.checkNotNullParameter(defaultFilename, "defaultFilename"); Intrinsics.checkNotNullParameter(extension, "extension"); Intrinsics.checkNotNullExpressionValue(dir.resolve(defaultFilename + defaultFilename), "dir.resolve(defaultFilename + extension)"); Path path = dir.resolve(defaultFilename + defaultFilename); LinkOption[] arrayOfLinkOption = new LinkOption[0]; if (Files.exists(path, Arrays.<LinkOption>copyOf(arrayOfLinkOption, arrayOfLinkOption.length))) {
/*  8 */       int cnt = 1; while (true) {
/*  9 */         Intrinsics.checkNotNullExpressionValue(dir.resolve(defaultFilename + "-" + defaultFilename + cnt), "dir.resolve(\"$defaultFilename-$cnt$extension\")"); Path path1 = dir.resolve(defaultFilename + "-" + defaultFilename + cnt); LinkOption[] arrayOfLinkOption1 = new LinkOption[0]; if (Files.exists(path1, Arrays.<LinkOption>copyOf(arrayOfLinkOption1, arrayOfLinkOption1.length))) cnt++;
/*    */       
/*    */       } 
/*    */     } 
/* 13 */     return defaultFilename;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/cicd/gen/utils/FileUtilsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */