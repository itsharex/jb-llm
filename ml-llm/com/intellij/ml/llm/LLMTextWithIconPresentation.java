/*     */ package com.intellij.ml.llm;
/*     */ 
/*     */ import com.intellij.codeInsight.codeVision.ui.renderers.painters.CodeVisionScaledIconPainter;
/*     */ import com.intellij.codeInsight.codeVision.ui.renderers.painters.CodeVisionThemeInfoProvider;
/*     */ import com.intellij.codeInsight.hints.presentation.BasePresentation;
/*     */ import com.intellij.codeInsight.hints.presentation.InlayPresentation;
/*     */ import com.intellij.codeWithMe.ClientId;
/*     */ import com.intellij.openapi.application.ApplicationManager;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.editor.markup.TextAttributes;
/*     */ import com.intellij.util.ui.JBUI;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.FontMetrics;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Point;
/*     */ import javax.swing.Icon;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\004\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\b\000\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\002\020\bJ\030\020\022\032\0020\0232\006\020\024\032\0020\0252\006\020\026\032\0020\027H\026J\b\020\030\032\0020\031H\002J\b\020\032\032\0020\033H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\024\020\t\032\0020\n8VX\004¢\006\006\032\004\b\013\020\fR\016\020\006\032\0020\007X\004¢\006\002\n\000R\016\020\r\032\0020\nX\004¢\006\002\n\000R\016\020\016\032\0020\017X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\024\020\020\032\0020\n8VX\004¢\006\006\032\004\b\021\020\f¨\006\034"}, d2 = {"Lcom/intellij/ml/llm/LLMTextWithIconPresentation;", "Lcom/intellij/codeInsight/hints/presentation/BasePresentation;", "editor", "Lcom/intellij/openapi/editor/Editor;", "textPresentation", "Lcom/intellij/codeInsight/hints/presentation/InlayPresentation;", "icon", "Ljavax/swing/Icon;", "(Lcom/intellij/openapi/editor/Editor;Lcom/intellij/codeInsight/hints/presentation/InlayPresentation;Ljavax/swing/Icon;)V", "height", "", "getHeight", "()I", "iconGap", "iconPainter", "Lcom/intellij/codeInsight/codeVision/ui/renderers/painters/CodeVisionScaledIconPainter;", "width", "getWidth", "paint", "", "g", "Ljava/awt/Graphics2D;", "attributes", "Lcom/intellij/openapi/editor/markup/TextAttributes;", "size", "Ljava/awt/Dimension;", "toString", "", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nLLMInlayPresentations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMInlayPresentations.kt\ncom/intellij/ml/llm/LLMTextWithIconPresentation\n+ 2 service.kt\ncom/intellij/openapi/components/ServiceKt\n*L\n1#1,282:1\n43#2,3:283\n*S KotlinDebug\n*F\n+ 1 LLMInlayPresentations.kt\ncom/intellij/ml/llm/LLMTextWithIconPresentation\n*L\n253#1:283,3\n*E\n"})
/*     */ public final class LLMTextWithIconPresentation
/*     */   extends BasePresentation
/*     */ {
/*     */   @NotNull
/*     */   private final Editor editor;
/*     */   @NotNull
/*     */   private final InlayPresentation textPresentation;
/*     */   @NotNull
/*     */   private final Icon icon;
/*     */   @NotNull
/*     */   private final CodeVisionScaledIconPainter iconPainter;
/*     */   private final int iconGap;
/*     */   
/*     */   public LLMTextWithIconPresentation(@NotNull Editor editor, @NotNull InlayPresentation textPresentation, @NotNull Icon icon) {
/* 240 */     this.editor = editor;
/* 241 */     this.textPresentation = textPresentation;
/* 242 */     this.icon = icon;
/* 243 */     this.iconPainter = new CodeVisionScaledIconPainter(0.0D, 0.0D, 3, null);
/*     */     
/* 245 */     this.iconGap = JBUI.scale(2);
/*     */   }
/*     */   public int getWidth() {
/* 248 */     return (size()).width;
/*     */   } public int getHeight() {
/* 250 */     return (size()).height;
/*     */   }
/*     */   public void paint(@NotNull Graphics2D g, @NotNull TextAttributes attributes) {
/* 253 */     Intrinsics.checkNotNullParameter(g, "g"); Intrinsics.checkNotNullParameter(attributes, "attributes"); int $i$f$service = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 283 */     Class<CodeVisionThemeInfoProvider> serviceClass$iv = CodeVisionThemeInfoProvider.class;
/* 284 */     Object object = ApplicationManager.getApplication().getService(serviceClass$iv); if (object == null)
/* 285 */       throw new RuntimeException("Cannot find service " + serviceClass$iv.getName() + " (classloader=" + serviceClass$iv.getClassLoader() + ", client=" + ClientId.Companion.getCurrentOrNull() + ")"); 
/*     */     FontMetrics fontMetrics = this.editor.getComponent().getFontMetrics(CodeVisionThemeInfoProvider.font$default((CodeVisionThemeInfoProvider)object, this.editor, 0, 2, null));
/*     */     int x = 0;
/*     */     int y = fontMetrics.getHeight();
/*     */     float scaleFactor = this.iconPainter.scaleFactor(this.icon.getIconHeight(), (size()).height);
/*     */     this.iconPainter.paint(this.editor, g, this.icon, new Point(x, y), scaleFactor);
/*     */     x += this.iconPainter.width(this.icon, scaleFactor) + this.iconGap;
/*     */     try {
/*     */       g.translate(x, 0);
/*     */       this.textPresentation.paint(g, attributes);
/*     */     } finally {
/*     */       g.translate(-x, 0);
/*     */     } 
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "LLMTextWithIcon(" + this.textPresentation + ")";
/*     */   }
/*     */   
/*     */   private final Dimension size() {
/*     */     Dimension textSize = new Dimension(this.textPresentation.getWidth(), this.textPresentation.getHeight());
/*     */     float scaleFactor = this.iconPainter.scaleFactor(this.icon.getIconHeight(), textSize.height);
/*     */     int width = this.iconPainter.width(this.icon, scaleFactor) + this.iconGap;
/*     */     return new Dimension(width + textSize.width, textSize.height);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/LLMTextWithIconPresentation.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */