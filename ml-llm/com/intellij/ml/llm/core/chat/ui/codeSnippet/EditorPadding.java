/*    */ package com.intellij.ml.llm.core.chat.ui.codeSnippet;
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.editor.event.CaretEvent;
/*    */ import java.awt.Dimension;
/*    */ import java.awt.Graphics;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\b\020\007\032\0020\bH\026J\020\020\t\032\0020\n2\006\020\013\032\0020\fH\024R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/codeSnippet/EditorPadding;", "Ljavax/swing/Box$Filler;", "editor", "Lcom/intellij/openapi/editor/Editor;", "pad", "", "(Lcom/intellij/openapi/editor/Editor;I)V", "getBackground", "Ljava/awt/Color;", "paintComponent", "", "g", "Ljava/awt/Graphics;", "intellij.ml.llm"})
/*    */ public final class EditorPadding extends Box.Filler {
/*    */   public EditorPadding(@NotNull Editor editor, int pad) {
/* 13 */     super(new Dimension(pad, 0), new Dimension(pad, 0), 
/* 14 */         new Dimension(pad, 32767));
/*    */     this.editor = editor;
/* 16 */     setOpaque(true);
/* 17 */     this.editor.getCaretModel().addCaretListener(new CaretListener() {
/*    */           public void caretPositionChanged(@NotNull CaretEvent event) {
/* 19 */             Intrinsics.checkNotNullParameter(event, "event"); EditorPadding.this.repaint();
/*    */           }
/*    */         });
/*    */   } @NotNull
/*    */   private final Editor editor; @NotNull
/*    */   public Color getBackground() {
/* 25 */     Intrinsics.checkNotNullExpressionValue(this.editor.getContentComponent().getBackground(), "editor.contentComponent.background"); return this.editor.getContentComponent().getBackground();
/*    */   }
/*    */   
/*    */   protected void paintComponent(@NotNull Graphics g) {
/* 29 */     Intrinsics.checkNotNullParameter(g, "g"); super.paintComponent(g);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/codeSnippet/EditorPadding.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */