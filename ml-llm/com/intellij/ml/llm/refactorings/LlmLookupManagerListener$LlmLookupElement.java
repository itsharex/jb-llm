/*     */ package com.intellij.ml.llm.refactorings;
/*     */ 
/*     */ import com.intellij.codeInsight.lookup.LookupElement;
/*     */ import com.intellij.codeInsight.lookup.LookupElementPresentation;
/*     */ import com.intellij.codeInsight.template.impl.TemplateManagerImpl;
/*     */ import com.intellij.codeInsight.template.impl.TemplateState;
/*     */ import com.intellij.ml.llm.MLLlmIcons;
/*     */ import com.intellij.openapi.editor.Editor;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\b\020\005\032\0020\003H\026J\016\020\006\032\0020\0072\006\020\b\032\0020\tJ\020\020\n\032\0020\0072\006\020\013\032\0020\fH\026R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/refactorings/LlmLookupManagerListener$LlmLookupElement;", "Lcom/intellij/codeInsight/lookup/LookupElement;", "lookup", "", "(Ljava/lang/String;)V", "getLookupString", "handleInsert", "", "editor", "Lcom/intellij/openapi/editor/Editor;", "renderElement", "presentation", "Lcom/intellij/codeInsight/lookup/LookupElementPresentation;", "intellij.ml.llm"})
/*     */ public final class LlmLookupElement
/*     */   extends LookupElement
/*     */ {
/*     */   @NotNull
/*     */   private final String lookup;
/*     */   
/*     */   public LlmLookupElement(@NotNull String lookup) {
/* 119 */     this.lookup = lookup; } @NotNull
/*     */   public String getLookupString() {
/* 121 */     return this.lookup;
/*     */   }
/*     */   public final void handleInsert(@NotNull Editor editor) {
/*     */     TemplateState templateState;
/* 125 */     Intrinsics.checkNotNullParameter(editor, "editor"); if (TemplateManagerImpl.getTemplateState(editor) == null) { TemplateManagerImpl.getTemplateState(editor); return; }
/* 126 */      if (!templateState.isFinished()) {
/* 127 */       templateState.update();
/* 128 */       templateState.considerNextTabOnLookupItemSelected(this);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void renderElement(@NotNull LookupElementPresentation presentation) {
/* 133 */     Intrinsics.checkNotNullParameter(presentation, "presentation"); presentation.setIcon(MLLlmIcons.AiAssistant);
/* 134 */     super.renderElement(presentation);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/refactorings/LlmLookupManagerListener$LlmLookupElement.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */