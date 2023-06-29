/*    */ package com.intellij.ml.llm.core.chat.ui.chat;
/*    */ 
/*    */ import com.intellij.ide.ui.AntialiasingType;
/*    */ import com.intellij.ide.ui.UISettings;
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.editor.impl.FontInfo;
/*    */ import com.intellij.util.ui.StartupUiUtil;
/*    */ import java.awt.Font;
/*    */ import java.awt.FontMetrics;
/*    */ import java.awt.font.FontRenderContext;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.intellij.lang.annotations.JdkConstants.FontStyle;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\007\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\016\n\000\030\0002\0020\001B!\b\000\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\b\001\020\006\032\0020\007¢\006\002\020\bJ\020\020\024\032\0020\0252\006\020\002\032\0020\003H\002J&\020\026\032\0020\0272\006\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\030\032\0020\031R\021\020\t\032\0020\n8F¢\006\006\032\004\b\013\020\fR\021\020\r\032\0020\007¢\006\b\n\000\032\004\b\016\020\017R\021\020\020\032\0020\021¢\006\b\n\000\032\004\b\022\020\023¨\006\032"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/chat/PlaceholderHint$MyFontMetrics;", "", "editor", "Lcom/intellij/openapi/editor/Editor;", "size", "", "fontType", "", "(Lcom/intellij/openapi/editor/Editor;FI)V", "font", "Ljava/awt/Font;", "getFont", "()Ljava/awt/Font;", "lineHeight", "getLineHeight", "()I", "metrics", "Ljava/awt/FontMetrics;", "getMetrics", "()Ljava/awt/FontMetrics;", "getCurrentContext", "Ljava/awt/font/FontRenderContext;", "isActual", "", "familyName", "", "intellij.ml.llm"})
/*    */ public final class MyFontMetrics
/*    */ {
/*    */   @NotNull
/*    */   private final FontMetrics metrics;
/*    */   private final int lineHeight;
/*    */   
/*    */   public MyFontMetrics(@NotNull Editor editor, float size, @FontStyle int fontType) {
/* 72 */     MyFontMetrics $this$_init__u24lambda_u240 = this; int $i$a$-run-PlaceholderHint$MyFontMetrics$font$1 = 0;
/* 73 */     Font editorFont = StartupUiUtil.getLabelFont();
/* 74 */     Font font = editorFont.deriveFont(fontType, size);
/*    */     
/* 76 */     FontRenderContext context = getCurrentContext(editor);
/* 77 */     Intrinsics.checkNotNullExpressionValue(FontInfo.getFontMetrics(font, context), "getFontMetrics(font, context)"); this.metrics = FontInfo.getFontMetrics(font, context);
/*    */     
/* 79 */     this.lineHeight = (int)Math.ceil(font.createGlyphVector(context, "Ap").getVisualBounds().getHeight());
/*    */   } @NotNull
/*    */   public final FontMetrics getMetrics() {
/*    */     return this.metrics;
/* 83 */   } public final boolean isActual(@NotNull Editor editor, float size, int fontType, @NotNull String familyName) { Intrinsics.checkNotNullParameter(editor, "editor"); Intrinsics.checkNotNullParameter(familyName, "familyName"); Font font = this.metrics.getFont();
/* 84 */     if (!Intrinsics.areEqual(familyName, font.getFamily()) || !((size == font.getSize2D()) ? 1 : 0) || fontType != font.getStyle()) return false; 
/* 85 */     FontRenderContext currentContext = getCurrentContext(editor);
/* 86 */     return currentContext.equals(this.metrics.getFontRenderContext()); }
/*    */   public final int getLineHeight() { return this.lineHeight; }
/*    */   @NotNull
/*    */   public final Font getFont() { Intrinsics.checkNotNullExpressionValue(this.metrics.getFont(), "metrics.font");
/* 90 */     return this.metrics.getFont(); } private final FontRenderContext getCurrentContext(Editor editor) { FontRenderContext editorContext = FontInfo.getFontRenderContext(editor.getContentComponent());
/* 91 */     return new FontRenderContext(editorContext.getTransform(), 
/* 92 */         AntialiasingType.getKeyForCurrentScope(false), 
/* 93 */         UISettings.Companion.getEditorFractionalMetricsHint()); }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/chat/PlaceholderHint$MyFontMetrics.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */