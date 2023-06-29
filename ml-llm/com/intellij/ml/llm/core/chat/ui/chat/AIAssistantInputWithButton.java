/*     */ package com.intellij.ml.llm.core.chat.ui.chat;
/*     */ 
/*     */ import com.intellij.ide.HelpTooltip;
/*     */ import com.intellij.ml.llm.MLLlmIcons;
/*     */ import com.intellij.openapi.Disposable;
/*     */ import com.intellij.openapi.actionSystem.AnAction;
/*     */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*     */ import com.intellij.openapi.actionSystem.Presentation;
/*     */ import com.intellij.openapi.actionSystem.impl.ActionButton;
/*     */ import com.intellij.openapi.editor.event.DocumentEvent;
/*     */ import com.intellij.openapi.editor.event.DocumentListener;
/*     */ import com.intellij.openapi.editor.ex.EditorEx;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.util.Key;
/*     */ import com.intellij.openapi.wm.IdeFocusManager;
/*     */ import com.intellij.util.EventDispatcher;
/*     */ import com.intellij.util.ui.UIUtil;
/*     */ import com.intellij.util.ui.components.BorderLayoutPanel;
/*     */ import java.awt.Color;
/*     */ import java.awt.Component;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.event.MouseAdapter;
/*     */ import java.awt.event.MouseEvent;
/*     */ import javax.swing.Box;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.border.Border;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\004\n\002\030\002\n\002\b\005\n\002\030\002\n\002\030\002\n\000*\001\023\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\016\020\033\032\0020\0342\006\020\035\032\0020\rJ\n\020\036\032\004\030\0010\037H\026J\006\020 \032\0020!J\b\020\"\032\0020#H\002J\b\020$\032\0020%H\026J\016\020&\032\0020\0342\006\020'\032\0020(J\022\020)\032\0020\0342\b\020*\032\004\030\0010\037H\026J\022\020+\032\0020\0342\b\020,\032\004\030\0010-H\026J\006\020.\032\0020\034J\016\020/\032\0020\0342\006\020\027\032\0020\030J\006\0200\032\0020\034J\037\0201\032\0020\0342\027\0202\032\023\022\004\022\0020\n\022\004\022\0020\03403¢\006\002\b4R\016\020\007\032\0020\bX\004¢\006\002\n\000R\016\020\t\032\0020\nX\004¢\006\002\n\000R'\020\013\032\025\022\f\022\n \016*\004\030\0010\r0\r0\f¢\006\002\b\017X\004¢\006\b\n\000\032\004\b\020\020\021R\020\020\022\032\0020\023X\004¢\006\004\n\002\020\024R\016\020\025\032\0020\026X\004¢\006\002\n\000R\021\020\027\032\0020\0308F¢\006\006\032\004\b\031\020\032¨\0065"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputWithButton;", "Lcom/intellij/util/ui/components/BorderLayoutPanel;", "project", "Lcom/intellij/openapi/project/Project;", "disposable", "Lcom/intellij/openapi/Disposable;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/Disposable;)V", "button", "Lcom/intellij/openapi/actionSystem/impl/ActionButton;", "buttonPresentation", "Lcom/intellij/openapi/actionSystem/Presentation;", "editorListeners", "Lcom/intellij/util/EventDispatcher;", "Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputListener;", "kotlin.jvm.PlatformType", "Lorg/jetbrains/annotations/NotNull;", "getEditorListeners$intellij_ml_llm", "()Lcom/intellij/util/EventDispatcher;", "heightDocumentListener", "com/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputWithButton$heightDocumentListener$1", "Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputWithButton$heightDocumentListener$1;", "input", "Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInput;", "text", "", "getText", "()Ljava/lang/String;", "addListener", "", "listener", "getBackground", "Ljava/awt/Color;", "getFocusableComponent", "Ljavax/swing/JComponent;", "getMaxHeight", "", "getPreferredSize", "Ljava/awt/Dimension;", "isEditorViewOnly", "isIt", "", "setBackground", "bg", "setBorder", "border", "Ljavax/swing/border/Border;", "setDefaultPlaceholderText", "setText", "setWaitingText", "updateButtonPresentation", "action", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "intellij.ml.llm"})
/*     */ public final class AIAssistantInputWithButton
/*     */   extends BorderLayoutPanel
/*     */ {
/*     */   @NotNull
/*     */   private final EventDispatcher<AIAssistantInputListener> editorListeners;
/*     */   @NotNull
/*     */   private final Presentation buttonPresentation;
/*     */   @NotNull
/*     */   private final ActionButton button;
/*     */   @NotNull
/*     */   private final AIAssistantInputWithButton$heightDocumentListener$1 heightDocumentListener;
/*     */   @NotNull
/*     */   private final AIAssistantInput input;
/*     */   
/*     */   public AIAssistantInputWithButton(@NotNull Project project, @NotNull Disposable disposable) {
/*  68 */     Intrinsics.checkNotNullExpressionValue(EventDispatcher.create(AIAssistantInputListener.class), "create(AIAssistantInputListener::class.java)"); this.editorListeners = EventDispatcher.create(AIAssistantInputListener.class);
/*     */ 
/*     */     
/*  71 */     Presentation presentation1 = new Presentation("Send"), presentation2 = presentation1; AIAssistantInputWithButton aIAssistantInputWithButton2 = this; int $i$a$-apply-AIAssistantInputWithButton$buttonPresentation$1 = 0;
/*  72 */     presentation2.setIcon(MLLlmIcons.Chat.Send);
/*  73 */     HelpTooltip helpTooltip1 = new HelpTooltip(), helpTooltip2 = helpTooltip1; Key key = ActionButton.CUSTOM_HELP_TOOLTIP; Presentation presentation3 = presentation2; int $i$a$-apply-AIAssistantInputWithButton$buttonPresentation$1$1 = 0;
/*  74 */     helpTooltip2.setTitle("Send");
/*  75 */     helpTooltip2.setShortcut("Enter");
/*  76 */     Unit unit = Unit.INSTANCE; presentation3.putClientProperty(key, helpTooltip1);
/*  77 */     aIAssistantInputWithButton2.buttonPresentation = presentation1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  91 */     AIAssistantInputWithButton aIAssistantInputWithButton1 = this; aIAssistantInputWithButton2 = this; int $i$a$-run-AIAssistantInputWithButton$button$1 = 0;
/*  92 */     AIAssistantInputWithButton$button$1$action$1 action = new AIAssistantInputWithButton$button$1$action$1(this);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  97 */     aIAssistantInputWithButton2.button = new ActionButton(action, aIAssistantInputWithButton1.buttonPresentation, "", new Dimension(20, 20));
/*     */ 
/*     */     
/* 100 */     this.heightDocumentListener = new AIAssistantInputWithButton$heightDocumentListener$1();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 111 */     this.input = new AIAssistantInput(this, project, CollectionsKt.listOf(this.heightDocumentListener), disposable);
/* 112 */     this.input.recreateDocument();
/*     */     
/* 114 */     addToCenter((Component)this.input);
/*     */     
/* 116 */     BorderLayoutPanel borderLayoutPanel1 = new BorderLayoutPanel(), borderLayoutPanel2 = borderLayoutPanel1; aIAssistantInputWithButton2 = this; int $i$a$-apply-AIAssistantInputWithButton$1 = 0;
/* 117 */     Component component1 = Box.createHorizontalGlue(), component2 = component1; BorderLayoutPanel borderLayoutPanel3 = borderLayoutPanel2; int $i$a$-apply-AIAssistantInputWithButton$1$1 = 0;
/* 118 */     component2.addMouseListener(new AIAssistantInputWithButton$1$1$1(this));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 123 */     borderLayoutPanel3.addToCenter(component1);
/* 124 */     borderLayoutPanel2.addToRight((Component)this.button);
/* 125 */     aIAssistantInputWithButton2.addToBottom((Component)borderLayoutPanel1);
/* 126 */     AIAssistantInputWithButton l = this;
/* 127 */     addListener(new AIAssistantInputListener(l)
/*     */         {
/* 129 */           public void editorAdded(@NotNull EditorEx editorq) { Intrinsics.checkNotNullParameter(editorq, "editorq"); this.$l.setBorder((Border)new MyCoolBorder(editorq, (JComponent)this.$l));
/*     */             
/* 131 */             UIUtil.forEachComponentInHierarchy((Component)this.$l, AIAssistantInputWithButton$2$editorAdded$1.INSTANCE::editorAdded$lambda$0); } private static final void editorAdded$lambda$0(Function1 $tmp0, Object p0) { Intrinsics.checkNotNullParameter($tmp0, "$tmp0"); $tmp0.invoke(p0); } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\016\020\002\032\n \004*\004\030\0010\0030\003H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "it", "Ljava/awt/Component;", "kotlin.jvm.PlatformType", "invoke"}) static final class AIAssistantInputWithButton$2$editorAdded$1 extends Lambda implements Function1<Component, Unit> {
/* 132 */             public static final AIAssistantInputWithButton$2$editorAdded$1 INSTANCE = new AIAssistantInputWithButton$2$editorAdded$1(); AIAssistantInputWithButton$2$editorAdded$1() { super(1); } public final void invoke(Component it) { if (((it instanceof JComponent) ? it : null) == null) { (it instanceof JComponent) ? it : null; } else { ((it instanceof JComponent) ? it : null).setOpaque(false); }
/*     */                }
/*     */           }
/*     */         });
/*     */   } @NotNull public final EventDispatcher<AIAssistantInputListener> getEditorListeners$intellij_ml_llm() { return this.editorListeners; } @NotNull public final String getText() { Intrinsics.checkNotNullExpressionValue(this.input.getText(), "input.text"); return this.input.getText(); } @NotNull public Dimension getPreferredSize() { Dimension result = super.getPreferredSize();
/*     */     result.height = Math.max(Math.min(result.height, getMaxHeight()), (getMinimumSize()).height);
/*     */     Intrinsics.checkNotNullExpressionValue(result, "result");
/* 139 */     return result; } public void setBorder(@Nullable Border border) { if (border instanceof MyCoolBorder)
/* 140 */       super.setBorder(border);  } private final int getMaxHeight() { // Byte code:
/*     */     //   0: ldc com/intellij/openapi/wm/impl/InternalDecorator
/*     */     //   2: aload_0
/*     */     //   3: checkcast java/awt/Component
/*     */     //   6: invokestatic getParentOfType : (Ljava/lang/Class;Ljava/awt/Component;)Ljava/lang/Object;
/*     */     //   9: checkcast com/intellij/openapi/wm/impl/InternalDecorator
/*     */     //   12: astore_1
/*     */     //   13: aload_1
/*     */     //   14: dup
/*     */     //   15: ifnull -> 40
/*     */     //   18: invokevirtual getContentManager : ()Lcom/intellij/ui/content/ContentManager;
/*     */     //   21: dup
/*     */     //   22: ifnull -> 40
/*     */     //   25: invokeinterface getComponent : ()Ljavax/swing/JComponent;
/*     */     //   30: dup
/*     */     //   31: ifnull -> 40
/*     */     //   34: invokevirtual getHeight : ()I
/*     */     //   37: goto -> 48
/*     */     //   40: pop
/*     */     //   41: sipush #200
/*     */     //   44: invokestatic scale : (I)I
/*     */     //   47: ireturn
/*     */     //   48: istore_2
/*     */     //   49: iload_2
/*     */     //   50: iconst_2
/*     */     //   51: idiv
/*     */     //   52: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #86	-> 2
/*     */     //   #87	-> 13
/*     */     //   #88	-> 49
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   13	40	1	decorator	Lcom/intellij/openapi/wm/impl/InternalDecorator;
/*     */     //   49	4	2	toolWindowHeight	I
/*     */     //   0	53	0	this	Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputWithButton; } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputWithButton$button$1$action$1", "Lcom/intellij/openapi/actionSystem/AnAction;", "actionPerformed", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "intellij.ml.llm"}) public static final class AIAssistantInputWithButton$button$1$action$1 extends AnAction {
/*     */     AIAssistantInputWithButton$button$1$action$1(AIAssistantInputWithButton aIAssistantInputWithButton1) {} public void actionPerformed(@NotNull AnActionEvent e) { Intrinsics.checkNotNullParameter(e, "e"); ((AIAssistantInputListener)this.$this_run.getEditorListeners$intellij_ml_llm().getMulticaster()).onSubmit(AIAssistantInputWithButton.this, AIAssistantInputTrigger.Button); } }
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputWithButton$heightDocumentListener$1", "Lcom/intellij/openapi/editor/event/DocumentListener;", "documentChanged", "", "event", "Lcom/intellij/openapi/editor/event/DocumentEvent;", "intellij.ml.llm"}) public static final class AIAssistantInputWithButton$heightDocumentListener$1 implements DocumentListener {
/*     */     public void documentChanged(@NotNull DocumentEvent event) { Intrinsics.checkNotNullParameter(event, "event"); if ((AIAssistantInputWithButton.this.input.getPreferredSize()).height != AIAssistantInputWithButton.this.input.getHeight()) AIAssistantInputWithButton.this.revalidate();  } }
/* 144 */   @NotNull public final JComponent getFocusableComponent() { return (JComponent)this.input; }
/*     */ 
/*     */ 
/*     */   
/*     */   public final void isEditorViewOnly(boolean isIt) {}
/*     */   
/*     */   @Nullable
/*     */   public Color getBackground() {
/* 152 */     if (this.input == null || this.input.getEditor() == null || this.input.getEditor().getColorsScheme() == null || this.input.getEditor().getColorsScheme().getDefaultBackground() == null) this.input.getEditor().getColorsScheme().getDefaultBackground();  return super.getBackground();
/*     */   }
/*     */   
/*     */   public void setBackground(@Nullable Color bg) {}
/*     */   
/*     */   public final void updateButtonPresentation(@NotNull Function1 action) {
/* 158 */     Intrinsics.checkNotNullParameter(action, "action"); action.invoke(this.buttonPresentation);
/*     */   }
/*     */   
/*     */   public final void addListener(@NotNull AIAssistantInputListener listener) {
/* 162 */     Intrinsics.checkNotNullParameter(listener, "listener"); this.editorListeners.addListener(listener);
/*     */   }
/*     */   
/*     */   public final void setDefaultPlaceholderText() {
/* 166 */     this.input.setDefaultPlaceholderText();
/*     */   }
/*     */   
/*     */   public final void setWaitingText() {
/* 170 */     this.input.setWaitingText();
/*     */   }
/*     */   
/*     */   public final void setText(@NotNull String text) {
/* 174 */     Intrinsics.checkNotNullParameter(text, "text"); this.input.recreateDocument();
/* 175 */     this.input.setText(text);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputWithButton.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */