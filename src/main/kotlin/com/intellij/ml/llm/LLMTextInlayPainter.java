/*     */ package com.intellij.ml.llm;
/*     */ 
/*     */ import com.intellij.codeInsight.codeVision.ui.model.RangeCodeVisionModel;
/*     */ import com.intellij.codeInsight.codeVision.ui.renderers.painters.CodeVisionThemeInfoProvider;
/*     */ import com.intellij.codeInsight.codeVision.ui.renderers.painters.ICodeVisionEntryBasePainter;
/*     */ import com.intellij.codeWithMe.ClientId;
/*     */ import com.intellij.openapi.application.ApplicationManager;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.editor.markup.EffectType;
/*     */ import com.intellij.openapi.editor.markup.TextAttributes;
/*     */ import com.intellij.ui.paint.EffectPainter2D;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.FontMetrics;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Point;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\002\020\016\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\b\002\030\0002\b\022\004\022\0020\0020\001B\005¢\006\002\020\003J@\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\0022\006\020\r\032\0020\0162\006\020\017\032\0020\0202\006\020\021\032\0020\022H\026J \020\023\032\0020\0242\006\020\006\032\0020\0072\006\020\017\032\0020\0202\006\020\f\032\0020\002H\026¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/LLMTextInlayPainter;", "Lcom/intellij/codeInsight/codeVision/ui/renderers/painters/ICodeVisionEntryBasePainter;", "", "()V", "paint", "", "editor", "Lcom/intellij/openapi/editor/Editor;", "textAttributes", "Lcom/intellij/openapi/editor/markup/TextAttributes;", "g", "Ljava/awt/Graphics;", "value", "point", "Ljava/awt/Point;", "state", "Lcom/intellij/codeInsight/codeVision/ui/model/RangeCodeVisionModel$InlayState;", "hovered", "", "size", "Ljava/awt/Dimension;", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nLLMInlayPresentations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMInlayPresentations.kt\ncom/intellij/ml/llm/LLMTextInlayPainter\n+ 2 service.kt\ncom/intellij/openapi/components/ServiceKt\n*L\n1#1,282:1\n43#2,3:283\n43#2,3:286\n*S KotlinDebug\n*F\n+ 1 LLMInlayPresentations.kt\ncom/intellij/ml/llm/LLMTextInlayPainter\n*L\n31#1:283,3\n52#1:286,3\n*E\n"})
/*     */ final class LLMTextInlayPainter
/*     */   implements ICodeVisionEntryBasePainter<String>
/*     */ {
/*     */   public void paint(@NotNull Editor editor, @NotNull TextAttributes textAttributes, @NotNull Graphics g, @NotNull String value, @NotNull Point point, @NotNull RangeCodeVisionModel.InlayState state, boolean hovered) {
/*  31 */     Intrinsics.checkNotNullParameter(editor, "editor"); Intrinsics.checkNotNullParameter(textAttributes, "textAttributes"); Intrinsics.checkNotNullParameter(g, "g"); Intrinsics.checkNotNullParameter(value, "value"); Intrinsics.checkNotNullParameter(point, "point"); Intrinsics.checkNotNullParameter(state, "state"); int $i$f$service = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 285 */       throw new RuntimeException("Cannot find service " + serviceClass$iv.getName() + " (classloader=" + serviceClass$iv.getClassLoader() + ", client=" + ClientId.Companion.getCurrentOrNull() + ")");  CodeVisionThemeInfoProvider themeInfoProvider = (CodeVisionThemeInfoProvider)object; boolean inSelectedBlock = Intrinsics.areEqual(textAttributes.getBackgroundColor(), editor.getSelectionModel().getTextAttributes().getBackgroundColor()); if (textAttributes.getForegroundColor() != null) { g.setColor(textAttributes.getForegroundColor()); } else { if (inSelectedBlock) { if (editor.getSelectionModel().getTextAttributes().getForegroundColor() == null) { editor.getSelectionModel().getTextAttributes().getForegroundColor(); Intrinsics.checkNotNullExpressionValue(editor.getColorsScheme().getDefaultForeground(), "editor.colorsScheme.defaultForeground"); }  } else {  }  g.setColor(themeInfoProvider.foregroundColor(editor, hovered)); }  g.setFont(CodeVisionThemeInfoProvider.font$default(themeInfoProvider, editor, 0, 2, null)); g.drawString(value, point.x, point.y); Dimension textSize = size(editor, state, value); (Graphics2D)g; textAttributes.getEffectType(); if (((textAttributes.getEffectType() == null) ? true : WhenMappings.$EnumSwitchMapping$0[textAttributes.getEffectType().ordinal()]) == true)
/* 286 */       EffectPainter2D.LINE_UNDERSCORE.paint((Graphics2D)g, point.x, point.y, textSize.width, 5.0D, ((Graphics2D)g).getFont());  } @NotNull public Dimension size(@NotNull Editor editor, @NotNull RangeCodeVisionModel.InlayState state, @NotNull String value) { Intrinsics.checkNotNullParameter(editor, "editor"); Intrinsics.checkNotNullParameter(state, "state"); Intrinsics.checkNotNullParameter(value, "value"); int $i$f$service = 0; Class<CodeVisionThemeInfoProvider> serviceClass$iv = CodeVisionThemeInfoProvider.class;
/* 287 */     Object object = ApplicationManager.getApplication().getService(serviceClass$iv); if (object == null)
/* 288 */       throw new RuntimeException("Cannot find service " + serviceClass$iv.getName() + " (classloader=" + serviceClass$iv.getClassLoader() + ", client=" + ClientId.Companion.getCurrentOrNull() + ")"); 
/*     */     FontMetrics fontMetrics = editor.getComponent().getFontMetrics(CodeVisionThemeInfoProvider.font$default((CodeVisionThemeInfoProvider)object, editor, 0, 2, null));
/*     */     return new Dimension(fontMetrics.stringWidth(value), fontMetrics.getHeight()); }
/*     */ 
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/LLMTextInlayPainter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */