/*     */ package com.intellij.ml.llm.core.chat.parts;
/*     */ 
/*     */ import com.intellij.util.ui.ExtendableHTMLViewFactory;
/*     */ import javax.swing.text.Element;
/*     */ import javax.swing.text.View;
/*     */ import javax.swing.text.html.ParagraphView;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\020\007\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\033\020\007\032\004\030\0010\b2\006\020\t\032\0020\n2\006\020\013\032\0020\bH\002R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/core/chat/parts/LineSpacingExtension;", "Lcom/intellij/util/ui/ExtendableHTMLViewFactory$Extension;", "lineSpacing", "", "(F)V", "getLineSpacing", "()F", "invoke", "Ljavax/swing/text/View;", "elem", "Ljavax/swing/text/Element;", "defaultView", "intellij.ml.llm"})
/*     */ final class LineSpacingExtension
/*     */   implements ExtendableHTMLViewFactory.Extension
/*     */ {
/*     */   private final float lineSpacing;
/*     */   
/*     */   public LineSpacingExtension(float lineSpacing) {
/* 119 */     this.lineSpacing = lineSpacing; } public final float getLineSpacing() { return this.lineSpacing; } @Nullable
/*     */   public View invoke(@NotNull Element elem, @NotNull View defaultView) {
/* 121 */     Intrinsics.checkNotNullParameter(elem, "elem"); Intrinsics.checkNotNullParameter(defaultView, "defaultView"); return (defaultView instanceof ParagraphView) ? 
/* 122 */       new LineSpacingExtension$invoke$1(this, elem) : 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 132 */       null;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\007\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\024¨\006\006"}, d2 = {"com/intellij/ml/llm/core/chat/parts/LineSpacingExtension$invoke$1", "Ljavax/swing/text/html/ParagraphView;", "setLineSpacing", "", "ls", "", "intellij.ml.llm"})
/*     */   public static final class LineSpacingExtension$invoke$1 extends ParagraphView {
/*     */     LineSpacingExtension$invoke$1(LineSpacingExtension $receiver, Element $elem) {
/*     */       super($elem);
/*     */       super.setLineSpacing($receiver.getLineSpacing());
/*     */     }
/*     */     
/*     */     protected void setLineSpacing(float ls) {}
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/parts/LineSpacingExtension.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */