/*     */ package com.intellij.ml.llm.core.chat.parts;
/*     */ 
/*     */ import java.awt.event.MouseAdapter;
/*     */ import java.awt.event.MouseEvent;
/*     */ import javax.swing.JEditorPane;
/*     */ import javax.swing.SwingUtilities;
/*     */ import kotlin.Metadata;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\022\020\002\032\0020\0032\b\020\004\032\004\030\0010\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/core/chat/parts/TextPart$createComponent$2", "Ljava/awt/event/MouseAdapter;", "mouseClicked", "", "e", "Ljava/awt/event/MouseEvent;", "intellij.ml.llm"})
/*     */ public final class TextPart$createComponent$2
/*     */   extends MouseAdapter
/*     */ {
/*     */   TextPart$createComponent$2(JEditorPane $component) {}
/*     */   
/*     */   public void mouseClicked(@Nullable MouseEvent e) {
/*  99 */     if (e != null) {
/* 100 */       MouseEvent event = new MouseEvent(e.getComponent(), e.getID(), e.getWhen(), e.getModifiersEx(), e.getX(), e.getY(), e.getClickCount(), (
/* 101 */           SwingUtilities.isRightMouseButton(e) && e.getClickCount() == 1));
/* 102 */       if (this.$component.getParent() != null) { this.$component.getParent().dispatchEvent(event); } else { this.$component.getParent(); }
/*     */     
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/parts/TextPart$createComponent$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */