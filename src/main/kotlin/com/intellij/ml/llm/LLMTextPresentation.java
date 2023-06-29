/*     */ package com.intellij.ml.llm;
/*     */ 
/*     */ import com.intellij.codeInsight.codeVision.ui.model.RangeCodeVisionModel;
/*     */ import com.intellij.codeInsight.codeVision.ui.renderers.painters.CodeVisionThemeInfoProvider;
/*     */ import com.intellij.codeInsight.hints.presentation.BasePresentation;
/*     */ import com.intellij.codeWithMe.ClientId;
/*     */ import com.intellij.openapi.application.ApplicationManager;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.editor.markup.TextAttributes;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.FontMetrics;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Point;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\b\000\030\0002\0020\001B3\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\n\b\002\020\b\032\004\030\0010\t\022\b\b\002\020\n\032\0020\007¢\006\002\020\013J\030\020\026\032\0020\0272\006\020\030\032\0020\0312\006\020\032\032\0020\tH\026J\b\020\033\032\0020\034H\002J\b\020\035\032\0020\005H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\020\020\b\032\004\030\0010\tX\004¢\006\002\n\000R\024\020\f\032\0020\r8VX\004¢\006\006\032\004\b\016\020\017R\016\020\006\032\0020\007X\004¢\006\002\n\000R\016\020\020\032\0020\021X\004¢\006\002\n\000R\016\020\n\032\0020\007X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\022\032\0020\023X\004¢\006\002\n\000R\024\020\024\032\0020\r8VX\004¢\006\006\032\004\b\025\020\017¨\006\036"}, d2 = {"Lcom/intellij/ml/llm/LLMTextPresentation;", "Lcom/intellij/codeInsight/hints/presentation/BasePresentation;", "editor", "Lcom/intellij/openapi/editor/Editor;", "text", "", "hovered", "", "extraAttributes", "Lcom/intellij/openapi/editor/markup/TextAttributes;", "skipEffect", "(Lcom/intellij/openapi/editor/Editor;Ljava/lang/String;ZLcom/intellij/openapi/editor/markup/TextAttributes;Z)V", "height", "", "getHeight", "()I", "inlayState", "Lcom/intellij/codeInsight/codeVision/ui/model/RangeCodeVisionModel$InlayState;", "textPainter", "Lcom/intellij/ml/llm/LLMTextInlayPainter;", "width", "getWidth", "paint", "", "g", "Ljava/awt/Graphics2D;", "attributes", "size", "Ljava/awt/Dimension;", "toString", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nLLMInlayPresentations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMInlayPresentations.kt\ncom/intellij/ml/llm/LLMTextPresentation\n+ 2 service.kt\ncom/intellij/openapi/components/ServiceKt\n*L\n1#1,282:1\n43#2,3:283\n*S KotlinDebug\n*F\n+ 1 LLMInlayPresentations.kt\ncom/intellij/ml/llm/LLMTextPresentation\n*L\n229#1:283,3\n*E\n"})
/*     */ public final class LLMTextPresentation
/*     */   extends BasePresentation
/*     */ {
/*     */   @NotNull
/*     */   private final Editor editor;
/*     */   @NotNull
/*     */   private final String text;
/*     */   private final boolean hovered;
/*     */   @Nullable
/*     */   private final TextAttributes extraAttributes;
/*     */   private final boolean skipEffect;
/*     */   @NotNull
/*     */   private final RangeCodeVisionModel.InlayState inlayState;
/*     */   @NotNull
/*     */   private final LLMTextInlayPainter textPainter;
/*     */   
/*     */   public LLMTextPresentation(@NotNull Editor editor, @NotNull String text, boolean hovered, @Nullable TextAttributes extraAttributes, boolean skipEffect) {
/* 208 */     this.editor = editor;
/* 209 */     this.text = text;
/* 210 */     this.hovered = hovered;
/* 211 */     this.extraAttributes = extraAttributes;
/* 212 */     this.skipEffect = skipEffect;
/* 213 */     this.inlayState = RangeCodeVisionModel.InlayState.NORMAL;
/* 214 */     this.textPainter = new LLMTextInlayPainter();
/*     */   } public int getWidth() {
/* 216 */     return (size()).width;
/*     */   } public int getHeight() {
/* 218 */     return (size()).height;
/*     */   }
/*     */   public void paint(@NotNull Graphics2D g, @NotNull TextAttributes attributes) {
/* 221 */     Intrinsics.checkNotNullParameter(g, "g"); Intrinsics.checkNotNullParameter(attributes, "attributes"); TextAttributes updatedAttributes = new TextAttributes();
/* 222 */     updatedAttributes.copyFrom(attributes);
/* 223 */     if (((this.extraAttributes != null) ? this.extraAttributes.getForegroundColor() : null) != null) updatedAttributes.setForegroundColor(this.extraAttributes.getForegroundColor()); 
/* 224 */     if (!this.skipEffect) {
/* 225 */       if (((this.extraAttributes != null) ? this.extraAttributes.getEffectType() : null) != null) updatedAttributes.setEffectType(this.extraAttributes.getEffectType()); 
/* 226 */       if (((this.extraAttributes != null) ? this.extraAttributes.getEffectColor() : null) != null) updatedAttributes.setEffectColor(this.extraAttributes.getEffectColor());
/*     */     
/*     */     } 
/* 229 */     int $i$f$service = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */     this.textPainter.paint(this.editor, updatedAttributes, g, this.text, new Point(0, fontMetrics.getHeight()), this.inlayState, this.hovered);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "LLMText(" + this.text + ")";
/*     */   }
/*     */   
/*     */   private final Dimension size() {
/*     */     return this.textPainter.size(this.editor, this.inlayState, this.text);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/LLMTextPresentation.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */