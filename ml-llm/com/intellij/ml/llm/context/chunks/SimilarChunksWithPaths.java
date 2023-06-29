/*     */ package com.intellij.ml.llm.context.chunks;
/*     */ 
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\002\n\002\020 \n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\006\n\002\b\002\n\002\020\"\n\002\b\002\n\002\030\002\n\002\b\006\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J*\020\006\032\016\022\n\022\b\022\004\022\0020\b0\0070\0072\006\020\t\032\0020\n2\f\020\013\032\b\022\004\022\0020\f0\007H\002J\026\020\r\032\b\022\004\022\0020\f0\0072\006\020\t\032\0020\nH\002J*\020\016\032\0020\017\"\004\b\000\020\0202\f\020\021\032\b\022\004\022\002H\0200\0222\f\020\023\032\b\022\004\022\002H\0200\022H\002J\016\020\024\032\0020\0252\006\020\t\032\0020\nJ0\020\026\032\016\022\n\022\b\022\004\022\0020\0170\0070\0072\022\020\027\032\016\022\n\022\b\022\004\022\0020\b0\0070\0072\006\020\t\032\0020\nH\002J\026\020\030\032\b\022\004\022\0020\b0\0072\006\020\031\032\0020\bH\002J\026\020\032\032\004\030\0010\b*\0020\f2\006\020\t\032\0020\nH\002R\016\020\003\032\0020\004XT¢\006\002\n\000R\016\020\005\032\0020\004XT¢\006\002\n\000¨\006\033"}, d2 = {"Lcom/intellij/ml/llm/context/chunks/SimilarChunksWithPaths;", "", "()V", "CHUNK_SIZE", "", "MAX_RELEVANT_FILES", "extractChunks", "", "", "element", "Lcom/intellij/psi/PsiElement;", "mostRecentFiles", "Lcom/intellij/openapi/vfs/VirtualFile;", "getMostRecentFiles", "jaccardSimilarity", "", "T", "set1", "", "set2", "similarChunksWithPaths", "Lcom/intellij/ml/llm/context/SimilarChunkContext;", "tokenLevelJaccardSimilarity", "chunks", "tokenize", "chunk", "relativePathTo", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nSimilarChunksWithPaths.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimilarChunksWithPaths.kt\ncom/intellij/ml/llm/context/chunks/SimilarChunksWithPaths\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1549#2:95\n1620#2,3:96\n1559#2:99\n1590#2,4:100\n1549#2:104\n1620#2,2:105\n1549#2:107\n1620#2,3:108\n1622#2:111\n766#2:112\n857#2,2:113\n1603#2,9:115\n1855#2:124\n1856#2:126\n1612#2:127\n1549#2:128\n1620#2,2:129\n1549#2:131\n1620#2,3:132\n1622#2:135\n766#2:136\n857#2,2:137\n1#3:125\n*S KotlinDebug\n*F\n+ 1 SimilarChunksWithPaths.kt\ncom/intellij/ml/llm/context/chunks/SimilarChunksWithPaths\n*L\n19#1:95\n19#1:96,3\n27#1:99\n27#1:100,4\n54#1:104\n54#1:105,2\n55#1:107\n55#1:108,3\n54#1:111\n63#1:112\n63#1:113,2\n73#1:115,9\n73#1:124\n73#1:126\n73#1:127\n75#1:128\n75#1:129,2\n76#1:131\n76#1:132,3\n75#1:135\n85#1:136\n85#1:137,2\n73#1:125\n*E\n"})
/*     */ public final class SimilarChunksWithPaths {
/*     */   @NotNull
/*     */   public static final SimilarChunksWithPaths INSTANCE = new SimilarChunksWithPaths();
/*     */   private static final int CHUNK_SIZE = 60;
/*     */   private static final int MAX_RELEVANT_FILES = 20;
/*     */   
/*     */   @NotNull
/*  18 */   public final SimilarChunkContext similarChunksWithPaths(@NotNull PsiElement element) { Intrinsics.checkNotNullParameter(element, "element"); List<VirtualFile> mostRecentFiles = getMostRecentFiles(element);
/*  19 */     Iterable<VirtualFile> $this$map$iv = mostRecentFiles; int $i$f$map = 0;
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
/*  95 */     Iterable<VirtualFile> iterable1 = $this$map$iv; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/*  96 */     for (VirtualFile item$iv$iv : iterable1) {
/*  97 */       VirtualFile virtualFile1 = item$iv$iv; Collection<String> collection1 = destination$iv$iv; int $i$a$-map-SimilarChunksWithPaths$similarChunksWithPaths$mostRecentFilesRelativePaths$1 = 0; Intrinsics.checkNotNull(INSTANCE.relativePathTo(virtualFile1, element)); collection1.add(INSTANCE.relativePathTo(virtualFile1, element));
/*  98 */     }  List mostRecentFilesRelativePaths = (List)destination$iv$iv; List<List<String>> chunks = extractChunks(element, mostRecentFiles); List<List<Double>> jaccardSimilarities = tokenLevelJaccardSimilarity(chunks, element); List paths = new ArrayList(); List chunksList = new ArrayList(); Iterable<List<Double>> $this$mapIndexed$iv = jaccardSimilarities; int $i$f$mapIndexed = 0;
/*  99 */     Iterable<List<Double>> iterable2 = $this$mapIndexed$iv; Collection<Boolean> collection = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$mapIndexed$iv, 10)); int $i$f$mapIndexedTo = 0;
/* 100 */     int index$iv$iv = 0;
/* 101 */     for (Object<Double> item$iv$iv : iterable2) {
/* 102 */       int i = index$iv$iv++; if (i < 0) CollectionsKt.throwIndexOverflow();  List list = (List)item$iv$iv; int j = i; Collection<Boolean> collection1 = collection; int $i$a$-mapIndexed-SimilarChunksWithPaths$similarChunksWithPaths$1 = 0; int maxIndex = list.indexOf(Double.valueOf(CollectionsKt.maxOrThrow(list))); paths.add(mostRecentFilesRelativePaths.get(j)); collection1.add(Boolean.valueOf(chunksList.add(((List)chunks.get(j)).get(maxIndex))));
/* 103 */     }  (List)collection; Intrinsics.checkNotNullExpressionValue(element.getLanguage(), "element.language"); return new SimilarChunkContext(element.getLanguage(), paths, chunksList); } private final List<List<Double>> tokenLevelJaccardSimilarity(List chunks, PsiElement element) { Intrinsics.checkNotNullExpressionValue(element.getContainingFile().getText(), "element.containingFile.text"); Set currentFileTokens = CollectionsKt.toSet(tokenize(element.getContainingFile().getText())); Set tokenizedFile = currentFileTokens; int $i$a$-let-SimilarChunksWithPaths$tokenLevelJaccardSimilarity$1 = 0; Iterable $this$map$iv = chunks; int $i$f$map = 0;
/* 104 */     Iterable iterable1 = $this$map$iv; Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 105 */     for (Object item$iv$iv : iterable1) {
/* 106 */       List list = (List)item$iv$iv; Collection collection1 = destination$iv$iv; int $i$a$-map-SimilarChunksWithPaths$tokenLevelJaccardSimilarity$1$1 = 0; Iterable iterable2 = list; int i = 0;
/* 107 */       Iterable iterable3 = iterable2; Collection collection2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10)); int j = 0;
/* 108 */       Iterator iterator = iterable3.iterator();
/*     */     } 
/*     */     
/* 111 */     return (List<List<Double>>)destination$iv$iv; }
/* 112 */   private final String relativePathTo(VirtualFile $this$relativePathTo, PsiElement element) { Intrinsics.checkNotNullExpressionValue(ProjectRootManager.getInstance(element.getProject()).getFileIndex(), "getInstance(element.project).fileIndex"); ProjectFileIndex fileIndex = ProjectRootManager.getInstance(element.getProject()).getFileIndex(); VirtualFile contentRoot = fileIndex.getContentRootForFile($this$relativePathTo); if (contentRoot == null) contentRoot = fileIndex.getClassRootForFile($this$relativePathTo);  if (contentRoot != null) { String relativePath = VfsUtilCore.getRelativePath($this$relativePathTo, contentRoot, File.separatorChar); if (relativePath != null) return relativePath;  }  return null; } private final List<String> tokenize(String chunk) { CharSequence charSequence = chunk; Regex regex = new Regex("[^a-zA-Z0-9]"); boolean bool = false; List list1 = regex.split(charSequence, bool); int $i$f$filter = 0; List list2 = list1; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 113 */     for (Object element$iv$iv : list2) { String it = (String)element$iv$iv; int $i$a$-filter-SimilarChunksWithPaths$tokenize$1 = 0; if (!StringsKt.isBlank(it)) destination$iv$iv.add(element$iv$iv);  }
/* 114 */      return (List)destination$iv$iv; } private final <T> double jaccardSimilarity(Set set1, Set set2) { int intersectionSize = CollectionsKt.intersect(set1, set2).size(); int unionSize = CollectionsKt.union(set1, set2).size(); return intersectionSize / unionSize; }
/* 115 */   private final List<List<String>> extractChunks(PsiElement element, List mostRecentFiles) { Intrinsics.checkNotNullExpressionValue(PsiManager.getInstance(element.getProject()), "getInstance(element.project)"); PsiManager psiManager = PsiManager.getInstance(element.getProject()); Iterable $this$mapNotNull$iv = mostRecentFiles; int $i$f$mapNotNull = 0; Iterable iterable1 = $this$mapNotNull$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 123 */     Iterable $this$forEach$iv$iv$iv = iterable1; int $i$f$forEach = 0;
/* 124 */     Iterator iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; VirtualFile it = (VirtualFile)element$iv$iv;
/*     */       int $i$a$-mapNotNull-SimilarChunksWithPaths$extractChunks$lastFilesContent$1 = 0; }
/*     */     
/* 127 */     List lastFilesContent = (List)destination$iv$iv; Iterable $this$map$iv = lastFilesContent; int $i$f$map = 0;
/* 128 */     Iterable iterable2 = $this$map$iv; Collection collection1 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 129 */     for (Object item$iv$iv : iterable2) {
/* 130 */       String str = (String)item$iv$iv; Collection collection3 = collection1; int $i$a$-map-SimilarChunksWithPaths$extractChunks$chunks$1 = 0; String[] arrayOfString = new String[1]; arrayOfString[0] = "\n"; Iterable iterable3 = CollectionsKt.chunked(StringsKt.split$default(str, arrayOfString, false, 0, 6, null), 60); int i = 0;
/* 131 */       Iterable iterable4 = iterable3; Collection collection2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable3, 10)); int j = 0;
/* 132 */       Iterator iterator1 = iterable4.iterator();
/*     */     } 
/*     */     
/* 135 */     List<List<String>> chunks = (List)collection1; return chunks; } private final List<VirtualFile> getMostRecentFiles(PsiElement element) { FileType fileType; if (element.getContainingFile() == null || element.getContainingFile().getFileType() == null) { element.getContainingFile().getFileType(); return CollectionsKt.emptyList(); }
/* 136 */      Intrinsics.checkNotNullExpressionValue(element.getProject(), "element.project"); Iterable $this$filter$iv = EditorHistoryManager.Companion.getInstance(element.getProject()).getFileList(); int $i$f$filter = 0; Iterable iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 137 */     for (Object element$iv$iv : iterable1) { VirtualFile it = (VirtualFile)element$iv$iv; int $i$a$-filter-SimilarChunksWithPaths$getMostRecentFiles$recentFiles$1 = 0; if ((it.isValid() && Intrinsics.areEqual(it.getFileType(), fileType))) destination$iv$iv.add(element$iv$iv);  }
/* 138 */      List recentFiles = (List)destination$iv$iv;
/*     */     int start = RangesKt.coerceAtLeast(recentFiles.size() - 20 + 1, 0);
/*     */     int end = RangesKt.coerceAtLeast(recentFiles.size() - 1, 0);
/*     */     return CollectionsKt.toList(recentFiles.subList(start, end)); }
/*     */ 
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/context/chunks/SimilarChunksWithPaths.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */