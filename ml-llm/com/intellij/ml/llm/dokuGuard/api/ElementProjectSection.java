/*    */ package com.intellij.ml.llm.dokuGuard.api;
/*    */ 
/*    */ import com.intellij.lang.Language;
/*    */ import com.intellij.ml.llm.dokuGuard.api.languages.LanguageParameters;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006R\024\020\007\032\0020\bX\004¢\006\b\n\000\032\004\b\t\020\nR\024\020\013\032\0020\fX\004¢\006\b\n\000\032\004\b\r\020\016R\024\020\017\032\0020\020X\004¢\006\b\n\000\032\004\b\021\020\022¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/dokuGuard/api/ElementProjectSection;", "Lcom/intellij/ml/llm/dokuGuard/api/ProjectSection;", "element", "Lcom/intellij/psi/PsiElement;", "languageParameters", "Lcom/intellij/ml/llm/dokuGuard/api/languages/LanguageParameters;", "(Lcom/intellij/psi/PsiElement;Lcom/intellij/ml/llm/dokuGuard/api/languages/LanguageParameters;)V", "code", "", "getCode", "()Ljava/lang/String;", "language", "Lcom/intellij/lang/Language;", "getLanguage", "()Lcom/intellij/lang/Language;", "project", "Lcom/intellij/openapi/project/Project;", "getProject", "()Lcom/intellij/openapi/project/Project;", "intellij.ml.llm"})
/*    */ public final class ElementProjectSection implements ProjectSection {
/*    */   public ElementProjectSection(@NotNull PsiElement element, @NotNull LanguageParameters languageParameters) {
/* 14 */     this.code = languageParameters.extractAll(element);
/* 15 */     Intrinsics.checkNotNullExpressionValue(element.getLanguage(), "element.language"); this.language = element.getLanguage();
/* 16 */     Intrinsics.checkNotNullExpressionValue(element.getProject(), "element.project"); this.project = element.getProject();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private final String code;
/*    */   @NotNull
/*    */   private final Language language;
/*    */   @NotNull
/*    */   private final Project project;
/*    */   
/*    */   @NotNull
/*    */   public String getCode() {
/*    */     return this.code;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Language getLanguage() {
/*    */     return this.language;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Project getProject() {
/*    */     return this.project;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/dokuGuard/api/ElementProjectSection.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */