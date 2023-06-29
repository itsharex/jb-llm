/*    */ package com.intellij.ml.llm.cicd.gen.utils;
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import com.intellij.psi.PsiManager;
/*    */ import java.util.Set;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\036\n\000\n\002\020#\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\013\n\000\032$\020\000\032\b\022\004\022\0020\0020\001*\0020\0032\022\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0070\005¨\006\b"}, d2 = {"extractPsiFilesByPredicate", "", "Lcom/intellij/psi/PsiFile;", "Lcom/intellij/openapi/project/Project;", "filePredicate", "Lkotlin/Function1;", "Lcom/intellij/openapi/vfs/VirtualFile;", "", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nPsiUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PsiUtils.kt\ncom/intellij/ml/llm/cicd/gen/utils/PsiUtilsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n11653#2,9:29\n13579#2:38\n13580#2:40\n11662#2:41\n1#3:39\n*S KotlinDebug\n*F\n+ 1 PsiUtils.kt\ncom/intellij/ml/llm/cicd/gen/utils/PsiUtilsKt\n*L\n17#1:29,9\n17#1:38\n17#1:40\n17#1:41\n17#1:39\n*E\n"})
/*    */ public final class PsiUtilsKt {
/*    */   @NotNull
/*    */   public static final Set<PsiFile> extractPsiFilesByPredicate(@NotNull Project $this$extractPsiFilesByPredicate, @NotNull Function1 filePredicate) {
/* 13 */     Intrinsics.checkNotNullParameter($this$extractPsiFilesByPredicate, "<this>"); Intrinsics.checkNotNullParameter(filePredicate, "filePredicate"); Set<PsiFile> projectPsiFiles = new LinkedHashSet();
/* 14 */     ProjectRootManager projectRootManager = ProjectRootManager.getInstance($this$extractPsiFilesByPredicate);
/* 15 */     Intrinsics.checkNotNullExpressionValue(PsiManager.getInstance($this$extractPsiFilesByPredicate), "getInstance(this)"); PsiManager psiManager = PsiManager.getInstance($this$extractPsiFilesByPredicate);
/*    */     
/* 17 */     Intrinsics.checkNotNullExpressionValue(projectRootManager.getContentRoots(), "projectRootManager.contentRoots"); Object[] $this$mapNotNull$iv = (Object[])projectRootManager.getContentRoots(); int $i$f$mapNotNull = 0;
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
/* 29 */     Object[] arrayOfObject1 = $this$mapNotNull$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 37 */     Object[] $this$forEach$iv$iv$iv = arrayOfObject1; int $i$f$forEach = 0;
/* 38 */     byte b = 0; int i = $this$forEach$iv$iv$iv.length; if (b < i) { Object element$iv$iv$iv = $this$forEach$iv$iv$iv[b], element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-ArraysKt___ArraysKt$mapNotNullTo$1$iv$iv = 0; VirtualFile root = (VirtualFile)element$iv$iv;
/*    */       int $i$a$-mapNotNull-PsiUtilsKt$extractPsiFilesByPredicate$1 = 0; }
/*    */     
/* 41 */     (List)destination$iv$iv;
/*    */     return projectPsiFiles;
/*    */   }
/*    */   
/*    */   private static final boolean extractPsiFilesByPredicate$lambda$1$lambda$0(Function1 $filePredicate, PsiManager $psiManager, Set<PsiFile> $projectPsiFiles, VirtualFile virtualFile) {
/*    */     PsiFile psi;
/*    */     Intrinsics.checkNotNullParameter($filePredicate, "$filePredicate");
/*    */     Intrinsics.checkNotNullParameter($psiManager, "$psiManager");
/*    */     Intrinsics.checkNotNullParameter($projectPsiFiles, "$projectPsiFiles");
/*    */     Intrinsics.checkNotNullParameter(virtualFile, "virtualFile");
/*    */     if (!((Boolean)$filePredicate.invoke(virtualFile)).booleanValue() || virtualFile.getCanonicalPath() == null)
/*    */       return true; 
/*    */     if ($psiManager.findFile(virtualFile) == null) {
/*    */       $psiManager.findFile(virtualFile);
/*    */       return true;
/*    */     } 
/*    */     return $projectPsiFiles.add(psi);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/cicd/gen/utils/PsiUtilsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */