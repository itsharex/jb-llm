/*     */ package com.intellij.ml.llm.core.chat.ui.codeSnippet;
/*     */ 
/*     */ import com.intellij.openapi.editor.colors.EditorFontType;
/*     */ import com.intellij.ui.util.UiSizeUtilKt;
/*     */ import com.intellij.util.ui.components.BorderLayoutPanel;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.FontMetrics;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\021\n\000\n\002\030\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026¨\006\004"}, d2 = {"com/intellij/ml/llm/core/chat/ui/codeSnippet/EditorFragment$content$1", "Lcom/intellij/util/ui/components/BorderLayoutPanel;", "getPreferredSize", "Ljava/awt/Dimension;", "intellij.ml.llm"})
/*     */ public final class EditorFragment$content$1
/*     */   extends BorderLayoutPanel
/*     */ {
/*     */   @NotNull
/*     */   public Dimension getPreferredSize() {
/* 196 */     Dimension preferredSize = super.getPreferredSize();
/* 197 */     FontMetrics fontMetrics = EditorFragment.access$getEditor$p(EditorFragment.this).getContentComponent().getFontMetrics(EditorFragment.access$getEditor$p(EditorFragment.this).getColorsScheme().getFont(EditorFontType.PLAIN));
/* 198 */     int editorMaxWidth = fontMetrics.charWidth('a') * EditorFragment.access$getEditor$p(EditorFragment.this).getSettings().getRightMargin(EditorFragment.access$getProject$p(EditorFragment.this));
/* 199 */     boolean shouldCollapse = (EditorFragment.access$getEditor$p(EditorFragment.this).getDocument().getLineCount() > EditorFragment.access$getEditorLineThreshold$p(EditorFragment.this));
/* 200 */     if (shouldCollapse && EditorFragment.this.getCollapsed()) {
/* 201 */       int editorMaxHeight = 0; Intrinsics.checkNotNullExpressionValue(EditorFragment.access$getEditor$p(EditorFragment.this).getScrollPane().getInsets(), "editor.scrollPane.insets");
/* 202 */       Intrinsics.checkNotNullExpressionValue(getInsets(), "insets"); editorMaxHeight = EditorFragment.access$getEditor$p(EditorFragment.this).getLineHeight() * EditorFragment.access$getEditorLineThreshold$p(EditorFragment.this) + UiSizeUtilKt.getHeight(EditorFragment.access$getEditor$p(EditorFragment.this).getScrollPane().getInsets()) + (EditorFragment.access$getExpandCollapseTextLabel$p(EditorFragment.this).getPreferredSize()).height + UiSizeUtilKt.getHeight(getInsets());
/* 203 */       JComponent it = EditorFragment.access$getEditor$p(EditorFragment.this).getHeaderComponent(); int $i$a$-let-EditorFragment$content$1$getPreferredSize$1 = 0;
/* 204 */       editorMaxHeight += (it.getPreferredSize()).height;
/*     */       EditorFragment.access$getEditor$p(EditorFragment.this).getHeaderComponent();
/* 206 */       return new Dimension(editorMaxWidth, editorMaxHeight);
/*     */     } 
/* 208 */     return new Dimension(editorMaxWidth, preferredSize.height);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/codeSnippet/EditorFragment$content$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */