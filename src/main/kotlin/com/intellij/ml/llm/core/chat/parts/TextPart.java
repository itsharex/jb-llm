/*     */ package com.intellij.ml.llm.core.chat.parts;
/*     */ 
/*     */ import com.intellij.markdown.utils.MarkdownToHtmlConverterKt;
/*     */ import com.intellij.ml.llm.core.chat.messages.CompletableMessage;
/*     */ import com.intellij.openapi.util.text.StringUtil;
/*     */ import com.intellij.xml.util.XmlStringUtil;
/*     */ import java.awt.event.MouseEvent;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JEditorPane;
/*     */ import javax.swing.event.HyperlinkEvent;
/*     */ import javax.swing.text.Caret;
/*     */ import javax.swing.text.html.HTMLEditorKit;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\007\030\000 \0352\0020\001:\001\035B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\022\020\026\032\0020\0272\b\b\001\020\030\032\0020\017H\026J\b\020\031\032\0020\rH\002J\020\020\032\032\0020\0172\006\020\033\032\0020\017H\002J\020\020\034\032\0020\0272\006\020\030\032\0020\017H\026R\024\020\005\032\0020\0068VX\004¢\006\006\032\004\b\007\020\bR\022\020\t\032\0060\nj\002`\013X\004¢\006\002\n\000R\016\020\f\032\0020\rX\004¢\006\002\n\000R\016\020\002\032\0020\003X\004¢\006\002\n\000R\024\020\016\032\0020\0178VX\004¢\006\006\032\004\b\020\020\021R\024\020\022\032\0020\023X\004¢\006\b\n\000\032\004\b\024\020\025¨\006\036"}, d2 = {"Lcom/intellij/ml/llm/core/chat/parts/TextPart;", "Lcom/intellij/ml/llm/core/chat/parts/MessagePart;", "message", "Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;", "(Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;)V", "component", "Ljavax/swing/JComponent;", "getComponent", "()Ljavax/swing/JComponent;", "document", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "editorPane", "Ljavax/swing/JEditorPane;", "textContent", "", "getTextContent", "()Ljava/lang/String;", "type", "Lcom/intellij/ml/llm/core/chat/parts/MessagePart$Type;", "getType", "()Lcom/intellij/ml/llm/core/chat/parts/MessagePart$Type;", "addContent", "", "content", "createComponent", "parseText", "txt", "replaceContent", "Companion", "intellij.ml.llm"})
/*     */ public final class TextPart implements MessagePart {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final CompletableMessage message;
/*     */   @NotNull
/*     */   private final JEditorPane editorPane;
/*     */   @NotNull
/*     */   private final MessagePart.Type type;
/*     */   @NotNull
/*     */   private final StringBuilder document;
/*     */   
/*  33 */   public TextPart(@NotNull CompletableMessage message) { this.message = message;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  60 */     this.editorPane = createComponent();
/*     */     
/*  62 */     this.type = MessagePart.Type.PlainText;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  67 */     this.document = new StringBuilder(); }
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\006\020\003\032\0020\004¨\006\005"}, d2 = {"Lcom/intellij/ml/llm/core/chat/parts/TextPart$Companion;", "", "()V", "createBaseComponent", "Ljavax/swing/JEditorPane;", "intellij.ml.llm"}) public static final class Companion {
/*     */     private Companion() {} @NotNull public final JEditorPane createBaseComponent() { JEditorPane jEditorPane1 = new JEditorPane(), $this$createBaseComponent_u24lambda_u241 = jEditorPane1; int $i$a$-apply-TextPart$Companion$createBaseComponent$component$1 = 0; $this$createBaseComponent_u24lambda_u241.setContentType("text/html"); Function2[] arrayOfFunction2 = new Function2[1]; arrayOfFunction2[0] = (Function2)new LineSpacingExtension(0.2F); HTMLEditorKit hTMLEditorKit1 = (new HTMLEditorKitBuilder()).withWordWrapViewFactory().withViewFactoryExtensions(arrayOfFunction2).build(), hTMLEditorKit2 = hTMLEditorKit1; JEditorPane jEditorPane2 = $this$createBaseComponent_u24lambda_u241; int $i$a$-apply-TextPart$Companion$createBaseComponent$component$1$1 = 0; hTMLEditorKit2.getStyleSheet().addRule("p {margin-top: 1px}"); jEditorPane2.setEditorKit(hTMLEditorKit1); $this$createBaseComponent_u24lambda_u241.setEditable(false); $this$createBaseComponent_u24lambda_u241.putClientProperty("JEditorPane.honorDisplayProperties", Boolean.valueOf(true)); $this$createBaseComponent_u24lambda_u241.setOpaque(false); $this$createBaseComponent_u24lambda_u241.setBorder((Border)null); JEditorPane component = jEditorPane1; component.putClientProperty("AccessibleName", StringUtil.unescapeXmlEntities(StringUtil.stripHtml("", " "))); component.setText(""); if (component.getCaret() != null) { component.setCaretPosition(0); Caret caret = component.getCaret(); if (((caret instanceof javax.swing.text.DefaultCaret) ? caret : null) == null) { (caret instanceof javax.swing.text.DefaultCaret) ? caret : null; } else { ((caret instanceof javax.swing.text.DefaultCaret) ? caret : null).setUpdatePolicy(1); }  }
/*  70 */        return component; } } public void addContent(@NlsSafe @NotNull String content) { Intrinsics.checkNotNullParameter(content, "content"); this.document.append(content);
/*  71 */     Intrinsics.checkNotNullExpressionValue(this.document.toString(), "document.toString()"); this.editorPane.setText(parseText(this.document.toString()));
/*  72 */     this.editorPane.invalidate(); }
/*     */   @NotNull
/*     */   public MessagePart.Type getType() { return this.type; }
/*     */   @NotNull
/*  76 */   public JComponent getComponent() { return this.editorPane; } public void replaceContent(@NotNull String content) { Intrinsics.checkNotNullParameter(content, "content"); StringsKt.clear(this.document);
/*  77 */     this.document.append(content);
/*  78 */     Intrinsics.checkNotNullExpressionValue(this.document.toString(), "document.toString()"); this.editorPane.setText(parseText(this.document.toString()));
/*  79 */     this.editorPane.invalidate(); }
/*     */   
/*     */   @NotNull
/*     */   public String getTextContent() {
/*  83 */     Intrinsics.checkNotNullExpressionValue(this.document.toString(), "document.toString()"); return this.document.toString();
/*     */   }
/*     */   
/*  86 */   private final JEditorPane createComponent() { JEditorPane jEditorPane1 = Companion.createBaseComponent(), $this$createComponent_u24lambda_u240 = jEditorPane1; int $i$a$-apply-TextPart$createComponent$component$1 = 0;
/*  87 */     $this$createComponent_u24lambda_u240.setForeground(AIAssistantColors.INSTANCE.getMessageForeground());
/*     */     
/*     */     JEditorPane component = jEditorPane1;
/*  90 */     component.addHyperlinkListener(TextPart::createComponent$lambda$1);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  97 */     component.addMouseListener(new TextPart$createComponent$2(component));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 107 */     return component; } private static final void createComponent$lambda$1(HyperlinkEvent it) { if (Intrinsics.areEqual(it.getEventType(), HyperlinkEvent.EventType.ACTIVATED))
/*     */       BrowserUtil.browse(it.getURL());  } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\022\020\002\032\0020\0032\b\020\004\032\004\030\0010\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/core/chat/parts/TextPart$createComponent$2", "Ljava/awt/event/MouseAdapter;", "mouseClicked", "", "e", "Ljava/awt/event/MouseEvent;", "intellij.ml.llm"}) public static final class TextPart$createComponent$2 extends MouseAdapter {
/*     */     TextPart$createComponent$2(JEditorPane $component) {}
/*     */     public void mouseClicked(@Nullable MouseEvent e) { if (e != null) { MouseEvent event = new MouseEvent(e.getComponent(), e.getID(), e.getWhen(), e.getModifiersEx(), e.getX(), e.getY(), e.getClickCount(), (SwingUtilities.isRightMouseButton(e) && e.getClickCount() == 1)); if (this.$component.getParent() != null) { this.$component.getParent().dispatchEvent(event); } else { this.$component.getParent(); }  }  } }
/* 111 */   private final String parseText(String txt) { if (this.message.getAuthor() == ChatMessageAuthor.Assistant) {
/* 112 */       return MarkdownToHtmlConverterKt.convertMarkdownToHtml(txt);
/*     */     }
/*     */     
/* 115 */     Intrinsics.checkNotNullExpressionValue(XmlStringUtil.escapeString(txt), "escapeString(txt)"); return XmlStringUtil.escapeString(txt); }
/*     */ 
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/parts/TextPart.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */