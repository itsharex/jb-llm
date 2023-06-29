/*    */ package com.intellij.ml.llm.core.chat.parts;
/*    */ 
/*    */ import com.intellij.openapi.util.text.StringUtil;
/*    */ import com.intellij.util.ui.HTMLEditorKitBuilder;
/*    */ import javax.swing.JEditorPane;
/*    */ import javax.swing.text.Caret;
/*    */ import javax.swing.text.html.HTMLEditorKit;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\006\020\003\032\0020\004¨\006\005"}, d2 = {"Lcom/intellij/ml/llm/core/chat/parts/TextPart$Companion;", "", "()V", "createBaseComponent", "Ljavax/swing/JEditorPane;", "intellij.ml.llm"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final JEditorPane createBaseComponent() {
/* 36 */     JEditorPane jEditorPane1 = new JEditorPane(), $this$createBaseComponent_u24lambda_u241 = jEditorPane1; int $i$a$-apply-TextPart$Companion$createBaseComponent$component$1 = 0;
/* 37 */     $this$createBaseComponent_u24lambda_u241.setContentType("text/html");
/* 38 */     Function2[] arrayOfFunction2 = new Function2[1]; arrayOfFunction2[0] = (Function2)new LineSpacingExtension(0.2F); HTMLEditorKit hTMLEditorKit1 = (new HTMLEditorKitBuilder()).withWordWrapViewFactory().withViewFactoryExtensions(arrayOfFunction2).build(), hTMLEditorKit2 = hTMLEditorKit1; JEditorPane jEditorPane2 = $this$createBaseComponent_u24lambda_u241; int $i$a$-apply-TextPart$Companion$createBaseComponent$component$1$1 = 0;
/* 39 */     hTMLEditorKit2.getStyleSheet().addRule("p {margin-top: 1px}");
/* 40 */     jEditorPane2.setEditorKit(hTMLEditorKit1);
/* 41 */     $this$createBaseComponent_u24lambda_u241.setEditable(false);
/* 42 */     $this$createBaseComponent_u24lambda_u241.putClientProperty("JEditorPane.honorDisplayProperties", Boolean.valueOf(true));
/* 43 */     $this$createBaseComponent_u24lambda_u241.setOpaque(false);
/* 44 */     $this$createBaseComponent_u24lambda_u241.setBorder(null);
/*    */     
/*    */     JEditorPane component = jEditorPane1;
/* 47 */     component.putClientProperty("AccessibleName", StringUtil.unescapeXmlEntities(StringUtil.stripHtml("", " ")));
/*    */     
/* 49 */     component.setText("");
/*    */     
/* 51 */     if (component.getCaret() != null) {
/* 52 */       component.setCaretPosition(0);
/* 53 */       Caret caret = component.getCaret(); if (((caret instanceof javax.swing.text.DefaultCaret) ? caret : null) == null) { (caret instanceof javax.swing.text.DefaultCaret) ? caret : null; } else { ((caret instanceof javax.swing.text.DefaultCaret) ? caret : null).setUpdatePolicy(1); }
/*    */     
/*    */     } 
/* 56 */     return component;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/parts/TextPart$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */