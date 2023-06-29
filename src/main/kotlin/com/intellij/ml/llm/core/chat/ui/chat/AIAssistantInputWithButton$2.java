/*     */ package com.intellij.ml.llm.core.chat.ui.chat;
/*     */ 
/*     */ import com.intellij.openapi.editor.ex.EditorEx;
/*     */ import com.intellij.util.ui.UIUtil;
/*     */ import java.awt.Component;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.border.Border;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputWithButton$2", "Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputListener;", "editorAdded", "", "editorq", "Lcom/intellij/openapi/editor/ex/EditorEx;", "intellij.ml.llm"})
/*     */ public final class null
/*     */   implements AIAssistantInputListener
/*     */ {
/*     */   null(AIAssistantInputWithButton $l) {}
/*     */   
/*     */   public void editorAdded(@NotNull EditorEx editorq) {
/* 129 */     Intrinsics.checkNotNullParameter(editorq, "editorq"); this.$l.setBorder((Border)new MyCoolBorder(editorq, (JComponent)this.$l));
/*     */     
/* 131 */     UIUtil.forEachComponentInHierarchy((Component)this.$l, AIAssistantInputWithButton$2$editorAdded$1.INSTANCE::editorAdded$lambda$0); } private static final void editorAdded$lambda$0(Function1 $tmp0, Object p0) { Intrinsics.checkNotNullParameter($tmp0, "$tmp0"); $tmp0.invoke(p0); } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\016\020\002\032\n \004*\004\030\0010\0030\003H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "it", "Ljava/awt/Component;", "kotlin.jvm.PlatformType", "invoke"})
/* 132 */   static final class AIAssistantInputWithButton$2$editorAdded$1 extends Lambda implements Function1<Component, Unit> { public final void invoke(Component it) { if (((it instanceof JComponent) ? it : null) == null) { (it instanceof JComponent) ? it : null; } else { ((it instanceof JComponent) ? it : null).setOpaque(false); }
/*     */        }
/*     */ 
/*     */     
/*     */     public static final AIAssistantInputWithButton$2$editorAdded$1 INSTANCE = new AIAssistantInputWithButton$2$editorAdded$1();
/*     */     
/*     */     AIAssistantInputWithButton$2$editorAdded$1() {
/*     */       super(1);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputWithButton$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */