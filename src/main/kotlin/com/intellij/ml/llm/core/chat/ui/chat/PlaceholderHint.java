/*     */ package com.intellij.ml.llm.core.chat.ui.chat;
/*     */ import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.editor.Inlay;
/*     */ import com.intellij.openapi.editor.markup.TextAttributes;
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
/*     */ import java.awt.FontMetrics;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Rectangle;
/*     */ import java.awt.RenderingHints;
/*     */ import java.awt.font.FontRenderContext;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000d\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\b\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\000\030\0002\0020\001:\001#B\022\022\013\020\002\032\0070\003¢\006\002\b\004¢\006\002\020\005J\032\020\016\032\0020\0172\b\020\002\032\004\030\0010\0032\006\020\020\032\0020\021H\002J\024\020\022\032\0020\0172\n\020\023\032\006\022\002\b\0030\024H\026J\020\020\025\032\0020\0262\006\020\027\032\0020\030H\002J\020\020\031\032\0020\b2\006\020\027\032\0020\030H\002J\022\020\032\032\004\030\0010\0332\006\020\027\032\0020\030H\002J,\020\034\032\0020\0352\n\020\023\032\006\022\002\b\0030\0242\006\020\036\032\0020\0372\006\020 \032\0020!2\006\020\"\032\0020\033H\026R!\020\006\032\025\022\f\022\n \t*\004\030\0010\b0\b0\007¢\006\002\b\nX\004¢\006\002\n\000R\037\020\002\032\0070\003¢\006\002\b\004X\016¢\006\016\n\000\032\004\b\013\020\f\"\004\b\r\020\005¨\006$"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/chat/PlaceholderHint;", "Lcom/intellij/openapi/editor/EditorCustomElementRenderer;", "text", "", "Lorg/jetbrains/annotations/Nls;", "(Ljava/lang/String;)V", "HINT_FONT_METRICS", "Lcom/intellij/openapi/util/Key;", "Lcom/intellij/ml/llm/core/chat/ui/chat/PlaceholderHint$MyFontMetrics;", "kotlin.jvm.PlatformType", "Lorg/jetbrains/annotations/NotNull;", "getText", "()Ljava/lang/String;", "setText", "calcHintTextWidth", "", "fontMetrics", "Ljava/awt/FontMetrics;", "calcWidthInPixels", "inlay", "Lcom/intellij/openapi/editor/Inlay;", "getFont", "Ljava/awt/Font;", "editor", "Lcom/intellij/openapi/editor/Editor;", "getFontMetrics", "getTextAttributes", "Lcom/intellij/openapi/editor/markup/TextAttributes;", "paint", "", "g", "Ljava/awt/Graphics;", "r", "Ljava/awt/Rectangle;", "textAttributes", "MyFontMetrics", "intellij.ml.llm"})
/*     */ public final class PlaceholderHint implements EditorCustomElementRenderer {
/*     */   public PlaceholderHint(@NotNull String text) {
/*  20 */     this.text = text;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 121 */     Intrinsics.checkNotNullExpressionValue(Key.create("ParameterHintFontMetrics"), "create<MyFontMetrics>(\"ParameterHintFontMetrics\")"); this.HINT_FONT_METRICS = Key.create("ParameterHintFontMetrics");
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private String text;
/*     */   @NotNull
/*     */   private final Key<MyFontMetrics> HINT_FONT_METRICS;
/*     */   
/*     */   @NotNull
/*     */   public final String getText() {
/*     */     return this.text;
/*     */   }
/*     */   
/*     */   public final void setText(@NotNull String <set-?>) {
/*     */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */     this.text = <set-?>;
/*     */   }
/*     */   
/*     */   public int calcWidthInPixels(@NotNull Inlay inlay) {
/*     */     Intrinsics.checkNotNullParameter(inlay, "inlay");
/*     */     Intrinsics.checkNotNullExpressionValue(inlay.getEditor(), "inlay.editor");
/*     */     return calcHintTextWidth(this.text, getFontMetrics(inlay.getEditor()).getMetrics());
/*     */   }
/*     */   
/*     */   private final TextAttributes getTextAttributes(Editor editor) {
/*     */     TextAttributes textAttributes1 = editor.getColorsScheme().getAttributes(HighlighterColors.TEXT).clone(), $this$getTextAttributes_u24lambda_u240 = textAttributes1;
/*     */     int $i$a$-apply-PlaceholderHint$getTextAttributes$1 = 0;
/*     */     editor.getColorsScheme().getAttributes(DefaultLanguageHighlighterColors.INLINE_PARAMETER_HINT);
/*     */     $this$getTextAttributes_u24lambda_u240.setForegroundColor((editor.getColorsScheme().getAttributes(DefaultLanguageHighlighterColors.INLINE_PARAMETER_HINT) != null) ? editor.getColorsScheme().getAttributes(DefaultLanguageHighlighterColors.INLINE_PARAMETER_HINT).getForegroundColor() : null);
/*     */     return textAttributes1;
/*     */   }
/*     */   
/*     */   public void paint(@NotNull Inlay inlay, @NotNull Graphics g, @NotNull Rectangle r, @NotNull TextAttributes textAttributes) {
/*     */     Intrinsics.checkNotNullParameter(inlay, "inlay");
/*     */     Intrinsics.checkNotNullParameter(g, "g");
/*     */     Intrinsics.checkNotNullParameter(r, "r");
/*     */     Intrinsics.checkNotNullParameter(textAttributes, "textAttributes");
/*     */     Intrinsics.checkNotNullExpressionValue(inlay.getEditor(), "inlay.editor");
/*     */     Editor editor = inlay.getEditor();
/*     */     if (!(editor instanceof EditorImpl))
/*     */       return; 
/*     */     TextAttributes attributes = getTextAttributes(editor);
/*     */     int ascent = ((EditorImpl)editor).getAscent();
/*     */     Graphics2D g2d = (Graphics2D)g;
/*     */     if (attributes != null) {
/*     */       MyFontMetrics fontMetrics = getFontMetrics(editor);
/*     */       Color foregroundColor = attributes.getForegroundColor();
/*     */       if (foregroundColor != null) {
/*     */         Object savedHint = g2d.getRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING);
/*     */         Shape savedClip = g.getClip();
/*     */         g.setColor(foregroundColor);
/*     */         g.setFont(getFont(editor));
/*     */         g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, AntialiasingType.getKeyForCurrentScope(false));
/*     */         g.clipRect(r.x, r.y + 2, r.width - 6, r.height - 4);
/*     */         FontMetrics metrics = fontMetrics.getMetrics();
/*     */         int startX = r.x + 4;
/*     */         int startY = r.y + Math.max(ascent, (r.height + metrics.getAscent() - metrics.getDescent()) / 2);
/*     */         g.drawString(this.text, startX, startY);
/*     */         g.setClip(savedClip);
/*     */         g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, savedHint);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\007\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\016\n\000\030\0002\0020\001B!\b\000\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\b\001\020\006\032\0020\007¢\006\002\020\bJ\020\020\024\032\0020\0252\006\020\002\032\0020\003H\002J&\020\026\032\0020\0272\006\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\030\032\0020\031R\021\020\t\032\0020\n8F¢\006\006\032\004\b\013\020\fR\021\020\r\032\0020\007¢\006\b\n\000\032\004\b\016\020\017R\021\020\020\032\0020\021¢\006\b\n\000\032\004\b\022\020\023¨\006\032"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/chat/PlaceholderHint$MyFontMetrics;", "", "editor", "Lcom/intellij/openapi/editor/Editor;", "size", "", "fontType", "", "(Lcom/intellij/openapi/editor/Editor;FI)V", "font", "Ljava/awt/Font;", "getFont", "()Ljava/awt/Font;", "lineHeight", "getLineHeight", "()I", "metrics", "Ljava/awt/FontMetrics;", "getMetrics", "()Ljava/awt/FontMetrics;", "getCurrentContext", "Ljava/awt/font/FontRenderContext;", "isActual", "", "familyName", "", "intellij.ml.llm"})
/*     */   public static final class MyFontMetrics {
/*     */     @NotNull
/*     */     private final FontMetrics metrics;
/*     */     private final int lineHeight;
/*     */     
/*     */     public MyFontMetrics(@NotNull Editor editor, float size, @FontStyle int fontType) {
/*     */       MyFontMetrics $this$_init__u24lambda_u240 = this;
/*     */       int $i$a$-run-PlaceholderHint$MyFontMetrics$font$1 = 0;
/*     */       Font editorFont = StartupUiUtil.getLabelFont();
/*     */       Font font = editorFont.deriveFont(fontType, size);
/*     */       FontRenderContext context = getCurrentContext(editor);
/*     */       Intrinsics.checkNotNullExpressionValue(FontInfo.getFontMetrics(font, context), "getFontMetrics(font, context)");
/*     */       this.metrics = FontInfo.getFontMetrics(font, context);
/*     */       this.lineHeight = (int)Math.ceil(font.createGlyphVector(context, "Ap").getVisualBounds().getHeight());
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final FontMetrics getMetrics() {
/*     */       return this.metrics;
/*     */     }
/*     */     
/*     */     public final int getLineHeight() {
/*     */       return this.lineHeight;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Font getFont() {
/*     */       Intrinsics.checkNotNullExpressionValue(this.metrics.getFont(), "metrics.font");
/*     */       return this.metrics.getFont();
/*     */     }
/*     */     
/*     */     public final boolean isActual(@NotNull Editor editor, float size, int fontType, @NotNull String familyName) {
/*     */       Intrinsics.checkNotNullParameter(editor, "editor");
/*     */       Intrinsics.checkNotNullParameter(familyName, "familyName");
/*     */       Font font = this.metrics.getFont();
/*     */       if (!Intrinsics.areEqual(familyName, font.getFamily()) || !((size == font.getSize2D()) ? 1 : 0) || fontType != font.getStyle())
/*     */         return false; 
/*     */       FontRenderContext currentContext = getCurrentContext(editor);
/*     */       return currentContext.equals(this.metrics.getFontRenderContext());
/*     */     }
/*     */     
/*     */     private final FontRenderContext getCurrentContext(Editor editor) {
/*     */       FontRenderContext editorContext = FontInfo.getFontRenderContext(editor.getContentComponent());
/*     */       return new FontRenderContext(editorContext.getTransform(), AntialiasingType.getKeyForCurrentScope(false), UISettings.Companion.getEditorFractionalMetricsHint());
/*     */     }
/*     */   }
/*     */   
/*     */   private final MyFontMetrics getFontMetrics(Editor editor) {
/*     */     float size = editor.getColorsScheme().getEditorFontSize2D();
/*     */     MyFontMetrics metrics = (MyFontMetrics)editor.getUserData(this.HINT_FONT_METRICS);
/*     */     TextAttributes attributes = editor.getColorsScheme().getAttributes(DefaultLanguageHighlighterColors.INLINE_PARAMETER_HINT);
/*     */     int fontType = attributes.getFontType();
/*     */     String familyName = StartupUiUtil.getLabelFont().getFamily();
/*     */     Intrinsics.checkNotNullExpressionValue(familyName, "familyName");
/*     */     if (metrics != null && !metrics.isActual(editor, size, fontType, familyName))
/*     */       metrics = null; 
/*     */     if (metrics == null) {
/*     */       metrics = new MyFontMetrics(editor, size, fontType);
/*     */       editor.putUserData(this.HINT_FONT_METRICS, metrics);
/*     */     } 
/*     */     return metrics;
/*     */   }
/*     */   
/*     */   private final Font getFont(Editor editor) {
/*     */     return getFontMetrics(editor).getFont();
/*     */   }
/*     */   
/*     */   private final int calcHintTextWidth(String text, FontMetrics fontMetrics) {
/*     */     return (text == null) ? 0 : (fontMetrics.stringWidth(text) + 14);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/chat/PlaceholderHint.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */