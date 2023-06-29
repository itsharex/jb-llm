/*     */ package com.intellij.ml.llm;
/*     */ 
/*     */ import com.intellij.codeInsight.hints.presentation.InlayPresentation;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import java.awt.Cursor;
/*     */ import java.awt.Point;
/*     */ import java.awt.event.MouseEvent;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.reflect.KClass;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\b\000\030\0002\0020\001BQ\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\003\022\032\b\002\020\005\032\024\022\004\022\0020\007\022\004\022\0020\b\022\004\022\0020\t0\006\022\032\b\002\020\n\032\024\022\004\022\0020\007\022\004\022\0020\b\022\004\022\0020\t0\006¢\006\002\020\013J\006\020\020\032\0020\003J6\020\021\032\0020\t2\006\020\022\032\0020\0232\006\020\024\032\0020\t2\n\020\025\032\006\022\002\b\0030\0262\b\020\027\032\004\030\0010\0072\b\020\030\032\004\030\0010\bJ\026\020\031\032\0020\t2\006\020\027\032\0020\0072\006\020\030\032\0020\bR\016\020\002\032\0020\003X\004¢\006\002\n\000R \020\005\032\024\022\004\022\0020\007\022\004\022\0020\b\022\004\022\0020\t0\006X\004¢\006\002\n\000R\026\020\f\032\n \016*\004\030\0010\r0\rX\004¢\006\002\n\000R \020\n\032\024\022\004\022\0020\007\022\004\022\0020\b\022\004\022\0020\t0\006X\004¢\006\002\n\000R\016\020\017\032\0020\tX\016¢\006\002\n\000R\020\020\004\032\004\030\0010\003X\004¢\006\002\n\000¨\006\032"}, d2 = {"Lcom/intellij/ml/llm/LLMOnHoverButton;", "", "basePresentation", "Lcom/intellij/codeInsight/hints/presentation/InlayPresentation;", "onHoverPresentation", "clickListener", "Lkotlin/Function2;", "Ljava/awt/event/MouseEvent;", "Ljava/awt/Point;", "", "hoverListener", "(Lcom/intellij/codeInsight/hints/presentation/InlayPresentation;Lcom/intellij/codeInsight/hints/presentation/InlayPresentation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "cursor", "Ljava/awt/Cursor;", "kotlin.jvm.PlatformType", "hovered", "getPresentation", "mouseEvent", "editor", "Lcom/intellij/openapi/editor/Editor;", "isInside", "cursorRequestor", "Lkotlin/reflect/KClass;", "event", "translated", "onClick", "intellij.ml.llm"})
/*     */ public final class LLMOnHoverButton
/*     */ {
/*     */   @NotNull
/*     */   private final InlayPresentation basePresentation;
/*     */   @Nullable
/*     */   private final InlayPresentation onHoverPresentation;
/*     */   @NotNull
/*     */   private final Function2<MouseEvent, Point, Boolean> clickListener;
/*     */   @NotNull
/*     */   private final Function2<MouseEvent, Point, Boolean> hoverListener;
/*     */   private final Cursor cursor;
/*     */   private boolean hovered;
/*     */   
/*     */   public LLMOnHoverButton(@NotNull InlayPresentation basePresentation, @Nullable InlayPresentation onHoverPresentation, @NotNull Function2<MouseEvent, Point, Boolean> clickListener, @NotNull Function2<MouseEvent, Point, Boolean> hoverListener) {
/* 176 */     this.basePresentation = basePresentation;
/* 177 */     this.onHoverPresentation = onHoverPresentation;
/* 178 */     this.clickListener = clickListener;
/* 179 */     this.hoverListener = hoverListener;
/*     */     
/* 181 */     this.cursor = Cursor.getPredefinedCursor(12);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final InlayPresentation getPresentation() {
/* 186 */     if (this.hovered && this.onHoverPresentation != null) return this.onHoverPresentation; 
/* 187 */     return this.basePresentation;
/*     */   }
/*     */   
/*     */   public final boolean mouseEvent(@NotNull Editor editor, boolean isInside, @NotNull KClass cursorRequestor, @Nullable MouseEvent event, @Nullable Point translated) {
/* 191 */     Intrinsics.checkNotNullParameter(editor, "editor"); Intrinsics.checkNotNullParameter(cursorRequestor, "cursorRequestor"); if (this.onHoverPresentation == null) return false; 
/* 192 */     if (isInside && !this.hovered && event != null && translated != null) {
/* 193 */       boolean onHover = ((Boolean)this.hoverListener.invoke(event, translated)).booleanValue();
/* 194 */       if (!onHover) return false; 
/* 195 */       this.hovered = true;
/* 196 */       if (((editor instanceof com.intellij.openapi.editor.impl.EditorImpl) ? editor : null) != null) { ((editor instanceof com.intellij.openapi.editor.impl.EditorImpl) ? editor : null).setCustomCursor(cursorRequestor, this.cursor); } else { (editor instanceof com.intellij.openapi.editor.impl.EditorImpl) ? editor : null; }
/*     */     
/* 198 */     }  if (!isInside && this.hovered) {
/* 199 */       this.hovered = false;
/* 200 */       if (((editor instanceof com.intellij.openapi.editor.impl.EditorImpl) ? editor : null) != null) { ((editor instanceof com.intellij.openapi.editor.impl.EditorImpl) ? editor : null).setCustomCursor(cursorRequestor, null); } else { (editor instanceof com.intellij.openapi.editor.impl.EditorImpl) ? editor : null; }
/*     */     
/* 202 */     }  return true;
/*     */   }
/*     */   public final boolean onClick(@NotNull MouseEvent event, @NotNull Point translated) {
/* 205 */     Intrinsics.checkNotNullParameter(event, "event"); Intrinsics.checkNotNullParameter(translated, "translated"); return ((Boolean)this.clickListener.invoke(event, translated)).booleanValue();
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/LLMOnHoverButton.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */