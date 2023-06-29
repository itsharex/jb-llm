/*     */ package com.intellij.ml.llm.core;
/*     */ 
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.editor.RangeMarker;
/*     */ import com.intellij.openapi.editor.SelectionModel;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import com.intellij.psi.PsiNameIdentifierOwner;
/*     */ import java.util.List;
/*     */ import java.util.regex.Pattern;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000f\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\n\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020 \n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\003\bf\030\0002\0020\001J\020\020\020\032\0020\0072\006\020\021\032\0020\022H\026J\037\020\023\032\004\030\0010\0242\006\020\025\032\0020\0262\006\020\027\032\0020\030H\026¢\006\002\020\031J\036\020\032\032\020\022\004\022\0020\007\022\004\022\0020\007\030\0010\0332\006\020\034\032\0020\035H&J\022\020\036\032\004\030\0010\0352\006\020\021\032\0020\022H&J\022\020\037\032\004\030\0010\0222\006\020\021\032\0020\022H&J\020\020 \032\0020\0072\006\020\021\032\0020\022H\026J\020\020!\032\0020\0072\006\020\021\032\0020\022H\026J\b\020\"\032\0020\007H\026J\b\020#\032\0020\007H\026J\036\020$\032\b\022\004\022\0020\0350%2\006\020&\032\0020\0222\006\020'\032\0020(H&J\030\020)\032\0020*2\006\020+\032\0020,2\006\020-\032\0020\007H&J\020\020.\032\0020/2\006\020\021\032\0020\022H\026J\030\0200\032\0020/2\006\020\034\032\0020\0222\006\020-\032\0020\007H&J\024\0201\032\0020**\0020(2\006\020\021\032\0020\022H\026R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\007X¦\004¢\006\006\032\004\b\b\020\tR\022\020\n\032\0020\007X¦\004¢\006\006\032\004\b\013\020\tR\022\020\f\032\0020\007X¦\004¢\006\006\032\004\b\r\020\tR\022\020\016\032\0020\007X¦\004¢\006\006\032\004\b\017\020\tø\001\000\002\006\n\004\b!0\001¨\0062À\006\001"}, d2 = {"Lcom/intellij/ml/llm/core/LLMDocumentationSupport;", "", "commentBoundsRegex", "Ljava/util/regex/Pattern;", "getCommentBoundsRegex", "()Ljava/util/regex/Pattern;", "commentEnd", "", "getCommentEnd", "()Ljava/lang/String;", "commentStart", "getCommentStart", "docFormatInstruction", "getDocFormatInstruction", "emptyComment", "getEmptyComment", "calculateNewLineIndent", "element", "Lcom/intellij/psi/PsiElement;", "findEndOfCommentOffset", "", "editor", "Lcom/intellij/openapi/editor/Editor;", "range", "Lcom/intellij/openapi/editor/RangeMarker;", "(Lcom/intellij/openapi/editor/Editor;Lcom/intellij/openapi/editor/RangeMarker;)Ljava/lang/Integer;", "findExampleComment", "Lkotlin/Pair;", "declaration", "Lcom/intellij/psi/PsiNameIdentifierOwner;", "getClosestNamedElement", "getDocComment", "getDocumentationFormatInfoForElement", "getElementToDocumentText", "getParameterTagInstruction", "getReturnTagInstruction", "getSelectedElementToDocument", "", "root", "selectionModel", "Lcom/intellij/openapi/editor/SelectionModel;", "isValidComment", "", "project", "Lcom/intellij/openapi/project/Project;", "comment", "reformatFinalDocumentation", "", "replaceComment", "containsElement", "intellij.ml.llm"})
/*     */ public interface LLMDocumentationSupport
/*     */ {
/*     */   @NotNull
/*     */   String getEmptyComment();
/*     */   
/*     */   @NotNull
/*     */   String getCommentStart();
/*     */   
/*     */   @NotNull
/*     */   String getCommentEnd();
/*     */   
/*     */   @NotNull
/*     */   Pattern getCommentBoundsRegex();
/*     */   
/*     */   @NotNull
/*     */   String getDocFormatInstruction();
/*     */   
/*     */   @Nullable
/*     */   PsiElement getDocComment(@NotNull PsiElement paramPsiElement);
/*     */   
/*     */   boolean isValidComment(@NotNull Project paramProject, @NotNull String paramString);
/*     */   
/*     */   @Nullable
/*     */   Pair<String, String> findExampleComment(@NotNull PsiNameIdentifierOwner paramPsiNameIdentifierOwner);
/*     */   
/*     */   void replaceComment(@NotNull PsiElement paramPsiElement, @NotNull String paramString);
/*     */   
/*     */   @Nullable
/*     */   PsiNameIdentifierOwner getClosestNamedElement(@NotNull PsiElement paramPsiElement);
/*     */   
/*     */   @NotNull
/*     */   List<PsiNameIdentifierOwner> getSelectedElementToDocument(@NotNull PsiElement paramPsiElement, @NotNull SelectionModel paramSelectionModel);
/*     */   
/*     */   @Nullable
/*     */   default Integer findEndOfCommentOffset(@NotNull Editor editor, @NotNull RangeMarker range) {
/*  99 */     Intrinsics.checkNotNullParameter(editor, "editor"); Intrinsics.checkNotNullParameter(range, "range"); return Integer.valueOf(range.getEndOffset());
/*     */   }
/*     */   default boolean containsElement(@NotNull SelectionModel $this$containsElement, @NotNull PsiElement element) {
/* 102 */     Intrinsics.checkNotNullParameter($this$containsElement, "<this>"); Intrinsics.checkNotNullParameter(element, "element"); return ($this$containsElement.getSelectionStart() <= element.getTextRange().getStartOffset() && element.getTextRange().getEndOffset() <= $this$containsElement.getSelectionEnd());
/*     */   }
/*     */   @NotNull
/*     */   default String calculateNewLineIndent(@NotNull PsiElement element) {
/* 106 */     Intrinsics.checkNotNullParameter(element, "element"); return "";
/*     */   }
/*     */   @NotNull
/*     */   default String getParameterTagInstruction() {
/* 110 */     return "use @param tag";
/*     */   }
/*     */   @NotNull
/*     */   default String getReturnTagInstruction() {
/* 114 */     return "use @return tag";
/*     */   }
/*     */   @NotNull
/*     */   default String getDocumentationFormatInfoForElement(@NotNull PsiElement element) {
/* 118 */     Intrinsics.checkNotNullParameter(element, "element"); return "";
/*     */   }
/*     */   default void reformatFinalDocumentation(@NotNull PsiElement element) {
/* 121 */     Intrinsics.checkNotNullParameter(element, "element");
/*     */   } @NotNull
/*     */   default String getElementToDocumentText(@NotNull PsiElement element) {
/* 124 */     Intrinsics.checkNotNullParameter(element, "element"); Intrinsics.checkNotNullExpressionValue(element.getText(), "element.text"); return element.getText();
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/LLMDocumentationSupport.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */