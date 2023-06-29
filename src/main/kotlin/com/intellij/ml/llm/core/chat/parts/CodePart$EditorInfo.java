/*     */ package com.intellij.ml.llm.core.chat.parts;
/*     */ 
/*     */ import com.intellij.lang.Language;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.observable.properties.GraphProperty;
/*     */ import com.intellij.testFramework.LightVirtualFile;
/*     */ import javax.swing.JComponent;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\006\030\0002\0020\001B+\022\f\020\002\032\b\022\004\022\0020\0040\003\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n¢\006\002\020\013R\027\020\002\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\f\020\rR\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\016\020\017R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\020\020\021R\016\020\t\032\0020\nX\004¢\006\002\n\000R$\020\024\032\0020\0232\006\020\022\032\0020\0238F@FX\016¢\006\f\032\004\b\025\020\026\"\004\b\027\020\030¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/core/chat/parts/CodePart$EditorInfo;", "", "code", "Lcom/intellij/openapi/observable/properties/GraphProperty;", "", "component", "Ljavax/swing/JComponent;", "editor", "Lcom/intellij/openapi/editor/Editor;", "file", "Lcom/intellij/testFramework/LightVirtualFile;", "(Lcom/intellij/openapi/observable/properties/GraphProperty;Ljavax/swing/JComponent;Lcom/intellij/openapi/editor/Editor;Lcom/intellij/testFramework/LightVirtualFile;)V", "getCode", "()Lcom/intellij/openapi/observable/properties/GraphProperty;", "getComponent", "()Ljavax/swing/JComponent;", "getEditor", "()Lcom/intellij/openapi/editor/Editor;", "value", "Lcom/intellij/lang/Language;", "language", "getLanguage", "()Lcom/intellij/lang/Language;", "setLanguage", "(Lcom/intellij/lang/Language;)V", "intellij.ml.llm"})
/*     */ public final class EditorInfo
/*     */ {
/*     */   @NotNull
/*     */   private final GraphProperty<String> code;
/*     */   @NotNull
/*     */   private final JComponent component;
/*     */   @NotNull
/*     */   private final Editor editor;
/*     */   @NotNull
/*     */   private final LightVirtualFile file;
/*     */   
/*     */   @NotNull
/*     */   public final GraphProperty<String> getCode() {
/*     */     return this.code;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final JComponent getComponent() {
/*     */     return this.component;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Editor getEditor() {
/*     */     return this.editor;
/*     */   }
/*     */   
/*     */   public EditorInfo(@NotNull GraphProperty<String> code, @NotNull JComponent component, @NotNull Editor editor, @NotNull LightVirtualFile file) {
/* 102 */     this.code = code;
/* 103 */     this.component = component;
/* 104 */     this.editor = editor;
/* 105 */     this.file = file; } @NotNull
/*     */   public final Language getLanguage() {
/* 107 */     Intrinsics.checkNotNullExpressionValue(this.file.getLanguage(), "file.language"); return this.file.getLanguage();
/*     */   } public final void setLanguage(@NotNull Language value) {
/* 109 */     Intrinsics.checkNotNullParameter(value, "value"); this.file.setLanguage(value);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/parts/CodePart$EditorInfo.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */