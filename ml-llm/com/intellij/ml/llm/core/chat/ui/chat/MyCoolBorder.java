/*     */ package com.intellij.ml.llm.core.chat.ui.chat;
/*     */ 
/*     */ import com.intellij.ide.ui.laf.darcula.DarculaUIUtil;
/*     */ import com.intellij.ide.ui.laf.darcula.ui.DarculaTextBorder;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.editor.ex.EditorEx;
/*     */ import com.intellij.openapi.editor.ex.FocusChangeListener;
/*     */ import com.intellij.ui.ComponentUtil;
/*     */ import com.intellij.util.ui.JBInsets;
/*     */ import com.intellij.util.ui.JBUI;
/*     */ import com.intellij.util.ui.MacUIUtil;
/*     */ import java.awt.Component;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Insets;
/*     */ import java.awt.Rectangle;
/*     */ import java.awt.RenderingHints;
/*     */ import java.awt.geom.Rectangle2D;
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JComponent;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\005\b\002\030\000 \0262\0020\001:\001\026B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\020\020\007\032\0020\b2\006\020\t\032\0020\nH\026J\b\020\013\032\0020\fH\026J8\020\r\032\0020\0162\006\020\t\032\0020\n2\006\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\0222\006\020\024\032\0020\0222\006\020\025\032\0020\022H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/chat/MyCoolBorder;", "Lcom/intellij/ide/ui/laf/darcula/ui/DarculaTextBorder;", "editor", "Lcom/intellij/openapi/editor/ex/EditorEx;", "parent", "Ljavax/swing/JComponent;", "(Lcom/intellij/openapi/editor/ex/EditorEx;Ljavax/swing/JComponent;)V", "getBorderInsets", "Ljava/awt/Insets;", "c", "Ljava/awt/Component;", "isBorderOpaque", "", "paintBorder", "", "g", "Ljava/awt/Graphics;", "x", "", "y", "width", "height", "Companion", "intellij.ml.llm"})
/*     */ final class MyCoolBorder
/*     */   extends DarculaTextBorder
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final EditorEx editor;
/*     */   
/*     */   public MyCoolBorder(@NotNull EditorEx editor, @NotNull JComponent parent) {
/* 294 */     this.editor = editor;
/*     */     
/* 296 */     this.editor.addFocusListener(new FocusChangeListener(parent) {
/*     */           public void focusGained(@NotNull Editor editor) {
/* 298 */             Intrinsics.checkNotNullParameter(editor, "editor"); this.$parent.repaint();
/*     */           }
/*     */           
/*     */           public void focusLost(@NotNull Editor editor) {
/* 302 */             Intrinsics.checkNotNullParameter(editor, "editor"); this.$parent.repaint();
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public void paintBorder(@NotNull Component c, @NotNull Graphics g, int x, int y, int width, int height) {
/* 308 */     Intrinsics.checkNotNullParameter(c, "c"); Intrinsics.checkNotNullParameter(g, "g"); boolean hasFocus = this.editor.getContentComponent().hasFocus();
/* 309 */     Rectangle r = new Rectangle(x, y, width, height);
/* 310 */     Intrinsics.checkNotNull(g.create(), "null cannot be cast to non-null type java.awt.Graphics2D"); Graphics2D g2 = (Graphics2D)g.create();
/*     */     try {
/* 312 */       g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
/* 313 */       g2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, 
/* 314 */           MacUIUtil.USE_QUARTZ ? RenderingHints.VALUE_STROKE_PURE : RenderingHints.VALUE_STROKE_NORMALIZE);
/* 315 */       JBInsets.removeFrom(r, (Insets)JBUI.insets(1));
/* 316 */       g2.translate(r.x, r.y);
/* 317 */       float bw = bw();
/* 318 */       Rectangle2D.Float outer = new Rectangle2D.Float(bw, bw, r.width - bw * 2, r.height - bw * 2);
/* 319 */       g2.setColor(c.getBackground());
/* 320 */       g2.fill(outer);
/* 321 */       if (this.editor.getContentComponent().isEnabled() && this.editor.getContentComponent().isVisible()) {
/* 322 */         g2.setColor(hasFocus ? JBUI.CurrentTheme.Focus.focusColor() : 
/* 323 */             DarculaUIUtil.getOutlineColor(this.editor.getContentComponent().isEnabled(), false));
/* 324 */         DarculaUIUtil.doPaint(g2, r.width, r.height, 5.0F, hasFocus ? 1.0F : 0.5F, true);
/*     */       } 
/*     */     } finally {
/*     */       
/* 328 */       g2.dispose();
/*     */     } 
/*     */   }
/*     */   @NotNull
/*     */   public Insets getBorderInsets(@NotNull Component c) {
/* 333 */     Intrinsics.checkNotNullParameter(c, "c");
/* 334 */     Intrinsics.checkNotNullExpressionValue(JBInsets.create(2, 3).asUIResource(), "create(2,\n              …        3).asUIResource()");
/* 335 */     Intrinsics.checkNotNullExpressionValue(JBInsets.create(AIAssistantInputGaps.INSTANCE.getVGap(), AIAssistantInputGaps.INSTANCE.getHGap()).asUIResource(), "create(AIAssistantInputG…Gaps.hGap).asUIResource()"); return (DarculaUIUtil.isTableCellEditor(c) || DarculaUIUtil.isCompact(c) || Companion.isComboBoxEditor(c)) ? (Insets)JBInsets.create(2, 3).asUIResource() : (Insets)JBInsets.create(AIAssistantInputGaps.INSTANCE.getVGap(), AIAssistantInputGaps.INSTANCE.getHGap()).asUIResource();
/*     */   }
/*     */   public boolean isBorderOpaque() {
/* 338 */     return true;
/*     */   }
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\003\032\0020\0042\b\020\005\032\004\030\0010\006¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/chat/MyCoolBorder$Companion;", "", "()V", "isComboBoxEditor", "", "c", "Ljava/awt/Component;", "intellij.ml.llm"})
/*     */   public static final class Companion { public final boolean isComboBoxEditor(@Nullable Component c) {
/* 342 */       return (ComponentUtil.getParentOfType(JComboBox.class, c) != null);
/*     */     }
/*     */     
/*     */     private Companion() {} }
/*     */ 
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/chat/MyCoolBorder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */