/*    */ package com.intellij.ml.llm.dokuGuard.api.languages;
/*    */ 
/*    */ import com.intellij.psi.PsiElement;
/*    */ import java.nio.file.Path;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.io.path.PathsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\005\n\002\020\013\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\020\002\n\002\b\002\bf\030\0002\0020\001J\020\020\b\032\0020\t2\006\020\n\032\0020\013H\026J\020\020\f\032\0020\0032\006\020\r\032\0020\016H&J\022\020\017\032\004\030\0010\0032\006\020\r\032\0020\016H&J\022\020\020\032\004\030\0010\0032\006\020\r\032\0020\016H&J\020\020\021\032\0020\t2\006\020\r\032\0020\016H&J\030\020\022\032\0020\0232\006\020\r\032\0020\0162\006\020\024\032\0020\003H&R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\003X¦\004¢\006\006\032\004\b\007\020\005ø\001\000\002\006\n\004\b!0\001¨\006\025À\006\001"}, d2 = {"Lcom/intellij/ml/llm/dokuGuard/api/languages/LanguageParameters;", "", "fileExtension", "", "getFileExtension", "()Ljava/lang/String;", "languageName", "getLanguageName", "acceptFile", "", "path", "Ljava/nio/file/Path;", "extractAll", "element", "Lcom/intellij/psi/PsiElement;", "extractDocumentation", "extractMethodBody", "isMethod", "setDocumentation", "", "documentation", "intellij.ml.llm"})
/*    */ public interface LanguageParameters {
/*    */   @NotNull
/*    */   String getFileExtension();
/*    */   
/*    */   @NotNull
/*    */   String getLanguageName();
/*    */   
/*    */   boolean isMethod(@NotNull PsiElement paramPsiElement);
/*    */   
/*    */   default boolean acceptFile(@NotNull Path path) {
/* 22 */     Intrinsics.checkNotNullParameter(path, "path"); return Intrinsics.areEqual(PathsKt.getExtension(path), getFileExtension());
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   String extractDocumentation(@NotNull PsiElement paramPsiElement);
/*    */   
/*    */   @Nullable
/*    */   String extractMethodBody(@NotNull PsiElement paramPsiElement);
/*    */   
/*    */   void setDocumentation(@NotNull PsiElement paramPsiElement, @NotNull String paramString);
/*    */   
/*    */   @NotNull
/*    */   String extractAll(@NotNull PsiElement paramPsiElement);
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/dokuGuard/api/languages/LanguageParameters.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */