/*     */ package com.intellij.ml.llm.core.chat.ui.codeSnippet;
/*     */ 
/*     */ import com.intellij.icons.AllIcons;
/*     */ import com.intellij.ml.llm.LLMBundle;
/*     */ import com.intellij.ml.llm.core.chat.messages.CompletableMessage;
/*     */ import com.intellij.ml.llm.core.chat.ui.AIAssistantColors;
/*     */ import com.intellij.ml.llm.core.statistics.fus.AIAssistantChatEventLogger;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.editor.colors.EditorFontType;
/*     */ import com.intellij.openapi.editor.ex.EditorEx;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.ui.hover.HoverStateListener;
/*     */ import com.intellij.ui.util.UiSizeUtilKt;
/*     */ import com.intellij.util.ui.JBUI;
/*     */ import com.intellij.util.ui.components.BorderLayoutPanel;
/*     */ import java.awt.Component;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.FontMetrics;
/*     */ import java.awt.event.MouseAdapter;
/*     */ import java.awt.event.MouseEvent;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.border.Border;
/*     */ import kotlin.Metadata;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000E\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\006\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\000*\001\021\b\002\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\002\020\bJ\006\020\027\032\0020\030J\006\020\031\032\0020\032R$\020\013\032\0020\n2\006\020\t\032\0020\n@FX\016¢\006\016\n\000\032\004\b\f\020\r\"\004\b\016\020\017R\020\020\020\032\0020\021X\004¢\006\004\n\002\020\022R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\023\032\0020\024XD¢\006\002\n\000R\016\020\025\032\0020\026X\004¢\006\002\n\000R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\033"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/codeSnippet/EditorFragment;", "", "project", "Lcom/intellij/openapi/project/Project;", "editor", "Lcom/intellij/openapi/editor/ex/EditorEx;", "message", "Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/ex/EditorEx;Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;)V", "value", "", "collapsed", "getCollapsed", "()Z", "setCollapsed", "(Z)V", "content", "com/intellij/ml/llm/core/chat/ui/codeSnippet/EditorFragment$content$1", "Lcom/intellij/ml/llm/core/chat/ui/codeSnippet/EditorFragment$content$1;", "editorLineThreshold", "", "expandCollapseTextLabel", "Lcom/intellij/ml/llm/core/chat/ui/codeSnippet/AIAssistantFoldLabel;", "getContent", "Ljavax/swing/JComponent;", "updateExpandCollapseLabel", "", "intellij.ml.llm"})
/*     */ final class EditorFragment
/*     */ {
/*     */   @NotNull
/*     */   private final Project project;
/*     */   @NotNull
/*     */   private final EditorEx editor;
/*     */   private final int editorLineThreshold;
/*     */   @NotNull
/*     */   private final AIAssistantFoldLabel expandCollapseTextLabel;
/*     */   @NotNull
/*     */   private final EditorFragment$content$1 content;
/*     */   private boolean collapsed;
/*     */   
/*     */   public EditorFragment(@NotNull Project project, @NotNull EditorEx editor, @NotNull CompletableMessage message) {
/* 190 */     this.project = project; this.editor = editor;
/*     */     
/* 192 */     this.editorLineThreshold = 6;
/* 193 */     this.expandCollapseTextLabel = new AIAssistantFoldLabel(message.getAuthor());
/* 194 */     this.content = new EditorFragment$content$1();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 219 */     this.content.setBorder(JBUI.Borders.compound(
/* 220 */           (Border)JBUI.Borders.empty(10, 0), 
/* 221 */           JBUI.Borders.customLine(AIAssistantColors.INSTANCE.getMessageBorder(message.getAuthor()))));
/*     */     
/* 223 */     this.content.setOpaque(false);
/* 224 */     this.content.addToLeft(new EditorPadding((Editor)this.editor, 5));
/* 225 */     this.content.addToCenter(this.editor.getComponent());
/* 226 */     this.content.addToRight(new EditorPadding((Editor)this.editor, 5));
/* 227 */     this.content.addToBottom((Component)this.expandCollapseTextLabel);
/*     */     
/* 229 */     EditorFragment$hoverListener$1 hoverListener = new EditorFragment$hoverListener$1(message);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 235 */     hoverListener.addTo((JComponent)this.expandCollapseTextLabel);
/*     */     
/* 237 */     this.expandCollapseTextLabel.addMouseListener(new MouseAdapter(message)
/*     */         {
/* 239 */           public void mouseClicked(@Nullable MouseEvent e) { EditorFragment.this.setCollapsed(!EditorFragment.this.getCollapsed());
/* 240 */             AIAssistantChatEventLogger.Companion.logCodeSnippetPresentationChanged(EditorFragment.this.project, this.$message.getChat(), this.$message, EditorFragment.this.editor.getDocument().getLineCount(), EditorFragment.this.getCollapsed());
/* 241 */             EditorFragment.this.content.invalidate(); }
/*     */         });
/*     */   } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\021\n\000\n\002\030\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026¨\006\004"}, d2 = {"com/intellij/ml/llm/core/chat/ui/codeSnippet/EditorFragment$content$1", "Lcom/intellij/util/ui/components/BorderLayoutPanel;", "getPreferredSize", "Ljava/awt/Dimension;", "intellij.ml.llm"}) public static final class EditorFragment$content$1 extends BorderLayoutPanel {
/*     */     @NotNull public Dimension getPreferredSize() { Dimension preferredSize = super.getPreferredSize(); FontMetrics fontMetrics = EditorFragment.this.editor.getContentComponent().getFontMetrics(EditorFragment.this.editor.getColorsScheme().getFont(EditorFontType.PLAIN)); int editorMaxWidth = fontMetrics.charWidth('a') * EditorFragment.this.editor.getSettings().getRightMargin(EditorFragment.this.project); boolean shouldCollapse = (EditorFragment.this.editor.getDocument().getLineCount() > EditorFragment.this.editorLineThreshold); if (shouldCollapse && EditorFragment.this.getCollapsed()) {
/*     */         int editorMaxHeight = 0; Intrinsics.checkNotNullExpressionValue(EditorFragment.this.editor.getScrollPane().getInsets(), "editor.scrollPane.insets"); Intrinsics.checkNotNullExpressionValue(getInsets(), "insets"); editorMaxHeight = EditorFragment.this.editor.getLineHeight() * EditorFragment.this.editorLineThreshold + UiSizeUtilKt.getHeight(EditorFragment.this.editor.getScrollPane().getInsets()) + (EditorFragment.this.expandCollapseTextLabel.getPreferredSize()).height + UiSizeUtilKt.getHeight(getInsets()); JComponent it = EditorFragment.this.editor.getHeaderComponent(); int $i$a$-let-EditorFragment$content$1$getPreferredSize$1 = 0; editorMaxHeight += (it.getPreferredSize()).height; EditorFragment.this.editor.getHeaderComponent(); return new Dimension(editorMaxWidth, editorMaxHeight);
/*     */       } 
/* 247 */       return new Dimension(editorMaxWidth, preferredSize.height); } } public final boolean getCollapsed() { return this.collapsed; } public final void updateExpandCollapseLabel() { int linesCount = this.editor.getDocument().getLineCount();
/* 248 */     this.expandCollapseTextLabel.setVisible((linesCount > this.editorLineThreshold));
/*     */     
/* 250 */     if (this.collapsed) {
/* 251 */       Intrinsics.checkNotNullExpressionValue(this.editor.getScrollPane(), "editor.scrollPane"); CodeViewerKt.access$scrollToTopWhenNeeded(this.editor.getScrollPane());
/* 252 */       Object[] arrayOfObject = new Object[1]; arrayOfObject[0] = Integer.valueOf(linesCount - this.editorLineThreshold); this.expandCollapseTextLabel.setText(LLMBundle.message("label.more.lines", arrayOfObject));
/* 253 */       this.expandCollapseTextLabel.setIcon(AllIcons.General.ChevronDown);
/*     */     } else {
/*     */       
/* 256 */       this.expandCollapseTextLabel.setText("");
/* 257 */       this.expandCollapseTextLabel.setIcon(AllIcons.General.ChevronUp);
/*     */     }  }
/*     */   public final void setCollapsed(boolean value) { this.collapsed = value; updateExpandCollapseLabel(); }
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000*\001\000\b\n\030\0002\0020\001J\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\024¨\006\b"}, d2 = {"com/intellij/ml/llm/core/chat/ui/codeSnippet/EditorFragment$hoverListener$1", "Lcom/intellij/ui/hover/HoverStateListener;", "hoverChanged", "", "component", "Ljava/awt/Component;", "hovered", "", "intellij.ml.llm"}) public static final class EditorFragment$hoverListener$1 extends HoverStateListener {
/*     */     EditorFragment$hoverListener$1(CompletableMessage $message) {} protected void hoverChanged(@NotNull Component component, boolean hovered) { Intrinsics.checkNotNullParameter(component, "component"); EditorFragment.this.expandCollapseTextLabel.setForeground(AIAssistantColors.INSTANCE.getSnippetMoreLinesForeground(this.$message.getAuthor(), hovered));
/* 262 */       EditorFragment.this.expandCollapseTextLabel.setBackgroundReal(AIAssistantColors.INSTANCE.getSnippetMoreLinesBackground(this.$message.getAuthor(), hovered)); } } @NotNull public final JComponent getContent() { return (JComponent)this.content; }
/*     */ 
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/codeSnippet/EditorFragment.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */