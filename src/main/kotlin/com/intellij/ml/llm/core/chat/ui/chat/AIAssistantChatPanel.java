/*     */ package com.intellij.ml.llm.core.chat.ui.chat;
/*     */ import com.intellij.ide.HelpTooltip;
/*     */ import com.intellij.ml.llm.LLMBundle;
/*     */ import com.intellij.ml.llm.core.chat.messages.ChatMessageAuthor;
/*     */ import com.intellij.ml.llm.core.chat.messages.CompletableMessage;
/*     */ import com.intellij.ml.llm.core.chat.session.ChatSession;
/*     */ import com.intellij.ml.llm.core.chat.session.ChatSessionState;
/*     */ import com.intellij.ml.llm.core.chat.ui.AIAssistantColors;
/*     */ import com.intellij.ml.llm.core.statistics.fus.AIAssistantChatEventLogger;
/*     */ import com.intellij.openapi.actionSystem.DataKey;
/*     */ import com.intellij.openapi.actionSystem.Presentation;
/*     */ import com.intellij.openapi.application.ApplicationManager;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.observable.properties.ObservableProperty;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.ui.DialogPanel;
/*     */ import com.intellij.openapi.util.Key;
/*     */ import com.intellij.openapi.wm.IdeFocusManager;
/*     */ import com.intellij.ui.JBColor;
/*     */ import com.intellij.ui.components.ActionLink;
/*     */ import com.intellij.ui.components.panels.Wrapper;
/*     */ import com.intellij.ui.dsl.builder.Align;
/*     */ import com.intellij.ui.dsl.builder.AlignX;
/*     */ import com.intellij.ui.dsl.builder.Panel;
/*     */ import com.intellij.ui.dsl.builder.Row;
/*     */ import com.intellij.ui.dsl.gridLayout.UnscaledGapsKt;
/*     */ import java.awt.KeyEventDispatcher;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.AdjustmentEvent;
/*     */ import java.awt.event.KeyEvent;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JEditorPane;
/*     */ import javax.swing.JPanel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000¢\001\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020!\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\006\n\002\020\000\n\000\n\002\020\016\n\002\b\016*\002\016\034\030\000 H2\0020\0012\0020\0022\0020\003:\002HIB\025\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\002\020\bJ\016\020,\032\0020-2\006\020.\032\0020/J\016\0200\032\0020-2\006\020.\032\0020/J\006\0201\032\0020\000J\b\0202\032\00203H\026J\b\0204\032\00203H\002J\016\0205\032\002032\006\020.\032\0020/J\020\0205\032\002032\006\020.\032\0020(H\002J\020\0206\032\002032\006\0207\032\0020\007H\002J\006\0208\032\00203J\022\0209\032\004\030\0010:2\006\020;\032\0020<H\026J\020\020=\032\002032\006\020\004\032\0020\005H\002J\016\020>\032\002032\006\020\004\032\0020\005J\b\020?\032\00203H\002J\016\020@\032\002032\006\020A\032\0020(J\020\020B\032\002032\006\020.\032\0020(H\002J\b\020C\032\00203H\002J\020\020D\032\002032\006\020.\032\0020(H\002J\006\020E\032\00203J\b\020F\032\00203H\002J\b\020G\032\00203H\026R\016\020\t\032\0020\nX\016¢\006\002\n\000R\016\020\013\032\0020\fX\004¢\006\002\n\000R\020\020\r\032\0020\016X\004¢\006\004\n\002\020\017R\016\020\006\032\0020\007X\004¢\006\002\n\000R\016\020\020\032\0020\021X\004¢\006\002\n\000R\016\020\022\032\0020\023X\004¢\006\002\n\000R\016\020\024\032\0020\025X\004¢\006\002\n\000R\016\020\026\032\0020\027X\004¢\006\002\n\000R\020\020\030\032\004\030\0010\031X\016¢\006\002\n\000R\016\020\032\032\0020\021X\004¢\006\002\n\000R\020\020\033\032\0020\034X\004¢\006\004\n\002\020\035R\016\020\036\032\0020\037X\004¢\006\002\n\000R\024\020 \032\0020\n8BX\004¢\006\006\032\004\b \020!R\016\020\"\032\0020#X\004¢\006\002\n\000R\016\020$\032\0020%X\016¢\006\002\n\000R\024\020&\032\b\022\004\022\0020(0'X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020)\032\0020\nX\016¢\006\002\n\000R\016\020*\032\0020+X\004¢\006\002\n\000¨\006J"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel;", "Lcom/intellij/openapi/ui/SimpleToolWindowPanel;", "Lcom/intellij/openapi/actionSystem/DataProvider;", "Lcom/intellij/openapi/Disposable;", "project", "Lcom/intellij/openapi/project/Project;", "chatSession", "Lcom/intellij/ml/llm/core/chat/session/ChatSession;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/chat/session/ChatSession;)V", "autoscrollToEnd", "", "chatPanel", "Ljavax/swing/JPanel;", "chatScrollPane", "com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel$chatScrollPane$1", "Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel$chatScrollPane$1;", "content", "Lcom/intellij/openapi/ui/DialogPanel;", "contentContainer", "Lcom/intellij/ui/components/panels/Wrapper;", "controller", "Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanelController;", "editModeLabel", "Ljavax/swing/JComponent;", "editingContext", "Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel$EditingMessageContext;", "emptyStatePanel", "focusMouseListener", "com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel$focusMouseListener$1", "Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel$focusMouseListener$1;", "input", "Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputWithButton;", "isEditMode", "()Z", "isInEditMode", "Lcom/intellij/openapi/observable/properties/AtomicBooleanProperty;", "lastScrollValue", "", "messages", "", "Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageViewModel;", "scrollingToEnd", "shareFeedbackLabel", "Lcom/intellij/ui/components/ActionLink;", "addAIResponse", "Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView;", "message", "Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;", "addUserRequest", "beforeShown", "dispose", "", "endEditMode", "enterEditMode", "fillState", "chat", "focusInput", "getData", "", "dataId", "", "initTextInputArea", "initialize", "onInputSubmit", "recoverFromError", "errorMessage", "removeMessage", "restartChatFromEditedMessage", "restartChatFromMessage", "scrollToEndIfNeeded", "updateState", "updateUI", "Companion", "EditingMessageContext", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nAIAssistantChatPanel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIAssistantChatPanel.kt\ncom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,394:1\n288#2,2:395\n1855#2,2:397\n1855#2,2:399\n1#3:401\n10#4:402\n*S KotlinDebug\n*F\n+ 1 AIAssistantChatPanel.kt\ncom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel\n*L\n207#1:395,2\n268#1:397,2\n326#1:399,2\n54#1:402\n*E\n"})
/*     */ public final class AIAssistantChatPanel extends SimpleToolWindowPanel implements DataProvider, Disposable {
/*     */   public AIAssistantChatPanel(@NotNull Project project, @NotNull ChatSession chatSession) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'project'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'chatSession'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_0
/*     */     //   13: iconst_1
/*     */     //   14: iconst_1
/*     */     //   15: invokespecial <init> : (ZZ)V
/*     */     //   18: aload_0
/*     */     //   19: aload_1
/*     */     //   20: putfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   23: aload_0
/*     */     //   24: aload_2
/*     */     //   25: putfield chatSession : Lcom/intellij/ml/llm/core/chat/session/ChatSession;
/*     */     //   28: aload_0
/*     */     //   29: new com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel$focusMouseListener$1
/*     */     //   32: dup
/*     */     //   33: aload_0
/*     */     //   34: invokespecial <init> : (Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel;)V
/*     */     //   37: putfield focusMouseListener : Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel$focusMouseListener$1;
/*     */     //   40: aload_0
/*     */     //   41: new com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel$emptyStatePanel$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: invokespecial <init> : (Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel;)V
/*     */     //   49: checkcast kotlin/jvm/functions/Function1
/*     */     //   52: invokestatic panel : (Lkotlin/jvm/functions/Function1;)Lcom/intellij/openapi/ui/DialogPanel;
/*     */     //   55: astore_3
/*     */     //   56: aload_3
/*     */     //   57: astore #4
/*     */     //   59: astore #6
/*     */     //   61: iconst_0
/*     */     //   62: istore #5
/*     */     //   64: aload #4
/*     */     //   66: aload_0
/*     */     //   67: getfield focusMouseListener : Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel$focusMouseListener$1;
/*     */     //   70: checkcast java/awt/event/MouseListener
/*     */     //   73: invokevirtual addMouseListener : (Ljava/awt/event/MouseListener;)V
/*     */     //   76: nop
/*     */     //   77: aload #6
/*     */     //   79: aload_3
/*     */     //   80: putfield emptyStatePanel : Lcom/intellij/openapi/ui/DialogPanel;
/*     */     //   83: aload_0
/*     */     //   84: new com/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputWithButton
/*     */     //   87: dup
/*     */     //   88: aload_0
/*     */     //   89: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   92: aload_0
/*     */     //   93: checkcast com/intellij/openapi/Disposable
/*     */     //   96: invokespecial <init> : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/Disposable;)V
/*     */     //   99: putfield input : Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputWithButton;
/*     */     //   102: aload_0
/*     */     //   103: new javax/swing/JPanel
/*     */     //   106: dup
/*     */     //   107: getstatic com/intellij/ui/components/panels/ListLayout.Companion : Lcom/intellij/ui/components/panels/ListLayout$Companion;
/*     */     //   110: iconst_0
/*     */     //   111: aconst_null
/*     */     //   112: getstatic com/intellij/ui/components/panels/ListLayout$GrowPolicy.NO_GROW : Lcom/intellij/ui/components/panels/ListLayout$GrowPolicy;
/*     */     //   115: iconst_3
/*     */     //   116: aconst_null
/*     */     //   117: invokestatic vertical$default : (Lcom/intellij/ui/components/panels/ListLayout$Companion;ILcom/intellij/ui/components/panels/ListLayout$Alignment;Lcom/intellij/ui/components/panels/ListLayout$GrowPolicy;ILjava/lang/Object;)Lcom/intellij/ui/components/panels/ListLayout;
/*     */     //   120: checkcast java/awt/LayoutManager
/*     */     //   123: invokespecial <init> : (Ljava/awt/LayoutManager;)V
/*     */     //   126: putfield chatPanel : Ljavax/swing/JPanel;
/*     */     //   129: aload_0
/*     */     //   130: aload_0
/*     */     //   131: getfield chatPanel : Ljavax/swing/JPanel;
/*     */     //   134: astore_3
/*     */     //   135: new com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel$chatScrollPane$1
/*     */     //   138: dup
/*     */     //   139: aload_3
/*     */     //   140: invokespecial <init> : (Ljavax/swing/JPanel;)V
/*     */     //   143: astore_3
/*     */     //   144: aload_3
/*     */     //   145: astore #4
/*     */     //   147: astore #6
/*     */     //   149: iconst_0
/*     */     //   150: istore #5
/*     */     //   152: aload #4
/*     */     //   154: bipush #22
/*     */     //   156: invokevirtual setVerticalScrollBarPolicy : (I)V
/*     */     //   159: aload #4
/*     */     //   161: bipush #31
/*     */     //   163: invokevirtual setHorizontalScrollBarPolicy : (I)V
/*     */     //   166: aload #4
/*     */     //   168: aconst_null
/*     */     //   169: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
/*     */     //   172: aload #4
/*     */     //   174: invokevirtual getVerticalScrollBar : ()Ljavax/swing/JScrollBar;
/*     */     //   177: aload_0
/*     */     //   178: aload #4
/*     */     //   180: <illegal opcode> adjustmentValueChanged : (Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel;Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel$chatScrollPane$1;)Ljava/awt/event/AdjustmentListener;
/*     */     //   185: invokevirtual addAdjustmentListener : (Ljava/awt/event/AdjustmentListener;)V
/*     */     //   188: nop
/*     */     //   189: aload #6
/*     */     //   191: aload_3
/*     */     //   192: putfield chatScrollPane : Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel$chatScrollPane$1;
/*     */     //   195: aload_0
/*     */     //   196: getstatic com/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputNotification.INSTANCE : Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputNotification;
/*     */     //   199: ldc 'All history below this message will be deleted'
/*     */     //   201: ldc 'Cancel (Esc)'
/*     */     //   203: new com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel$editModeLabel$1
/*     */     //   206: dup
/*     */     //   207: aload_0
/*     */     //   208: invokespecial <init> : (Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel;)V
/*     */     //   211: checkcast kotlin/jvm/functions/Function0
/*     */     //   214: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljavax/swing/JComponent;
/*     */     //   217: astore_3
/*     */     //   218: aload_3
/*     */     //   219: astore #4
/*     */     //   221: astore #6
/*     */     //   223: iconst_0
/*     */     //   224: istore #5
/*     */     //   226: aload #4
/*     */     //   228: getstatic com/intellij/util/ui/JBUI$CurrentTheme$Banner.WARNING_BORDER_COLOR : Ljava/awt/Color;
/*     */     //   231: iconst_1
/*     */     //   232: iconst_0
/*     */     //   233: iconst_1
/*     */     //   234: iconst_0
/*     */     //   235: invokestatic customLine : (Ljava/awt/Color;IIII)Ljavax/swing/border/Border;
/*     */     //   238: iconst_3
/*     */     //   239: invokestatic empty : (I)Ljavax/swing/border/Border;
/*     */     //   242: invokestatic compound : (Ljavax/swing/border/Border;Ljavax/swing/border/Border;)Ljavax/swing/border/Border;
/*     */     //   245: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
/*     */     //   248: aload #4
/*     */     //   250: getstatic com/intellij/util/ui/JBUI$CurrentTheme$Banner.WARNING_BACKGROUND : Ljava/awt/Color;
/*     */     //   253: invokevirtual setBackground : (Ljava/awt/Color;)V
/*     */     //   256: nop
/*     */     //   257: aload #6
/*     */     //   259: aload_3
/*     */     //   260: putfield editModeLabel : Ljavax/swing/JComponent;
/*     */     //   263: aload_0
/*     */     //   264: new com/intellij/ui/components/ActionLink
/*     */     //   267: dup
/*     */     //   268: ldc 'label.share.feedback'
/*     */     //   270: iconst_0
/*     */     //   271: anewarray java/lang/Object
/*     */     //   274: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   277: getstatic com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel$shareFeedbackLabel$1.INSTANCE : Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel$shareFeedbackLabel$1;
/*     */     //   280: checkcast kotlin/jvm/functions/Function1
/*     */     //   283: invokespecial <init> : (Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
/*     */     //   286: astore_3
/*     */     //   287: aload_3
/*     */     //   288: astore #4
/*     */     //   290: astore #6
/*     */     //   292: iconst_0
/*     */     //   293: istore #5
/*     */     //   295: aload #4
/*     */     //   297: getstatic com/intellij/ml/llm/core/chat/ui/AIAssistantColors.INSTANCE : Lcom/intellij/ml/llm/core/chat/ui/AIAssistantColors;
/*     */     //   300: invokevirtual getEmptyStateForeground : ()Ljava/awt/Color;
/*     */     //   303: invokevirtual setForeground : (Ljava/awt/Color;)V
/*     */     //   306: aload #4
/*     */     //   308: invokevirtual setExternalLinkIcon : ()V
/*     */     //   311: nop
/*     */     //   312: aload #6
/*     */     //   314: aload_3
/*     */     //   315: putfield shareFeedbackLabel : Lcom/intellij/ui/components/ActionLink;
/*     */     //   318: aload_0
/*     */     //   319: new com/intellij/openapi/observable/properties/AtomicBooleanProperty
/*     */     //   322: dup
/*     */     //   323: iconst_0
/*     */     //   324: invokespecial <init> : (Z)V
/*     */     //   327: putfield isInEditMode : Lcom/intellij/openapi/observable/properties/AtomicBooleanProperty;
/*     */     //   330: aload_0
/*     */     //   331: new com/intellij/ui/components/panels/Wrapper
/*     */     //   334: dup
/*     */     //   335: invokespecial <init> : ()V
/*     */     //   338: putfield contentContainer : Lcom/intellij/ui/components/panels/Wrapper;
/*     */     //   341: aload_0
/*     */     //   342: new com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel$content$1
/*     */     //   345: dup
/*     */     //   346: aload_0
/*     */     //   347: invokespecial <init> : (Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel;)V
/*     */     //   350: checkcast kotlin/jvm/functions/Function1
/*     */     //   353: invokestatic panel : (Lkotlin/jvm/functions/Function1;)Lcom/intellij/openapi/ui/DialogPanel;
/*     */     //   356: putfield content : Lcom/intellij/openapi/ui/DialogPanel;
/*     */     //   359: aload_0
/*     */     //   360: new java/util/ArrayList
/*     */     //   363: dup
/*     */     //   364: invokespecial <init> : ()V
/*     */     //   367: checkcast java/util/List
/*     */     //   370: putfield messages : Ljava/util/List;
/*     */     //   373: aload_0
/*     */     //   374: iconst_1
/*     */     //   375: putfield autoscrollToEnd : Z
/*     */     //   378: aload_0
/*     */     //   379: new com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanelController
/*     */     //   382: dup
/*     */     //   383: aload_0
/*     */     //   384: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   387: aload_0
/*     */     //   388: getfield chatSession : Lcom/intellij/ml/llm/core/chat/session/ChatSession;
/*     */     //   391: aload_0
/*     */     //   392: invokespecial <init> : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/chat/session/ChatSession;Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel;)V
/*     */     //   395: putfield controller : Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanelController;
/*     */     //   398: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #51	-> 12
/*     */     //   #50	-> 18
/*     */     //   #58	-> 28
/*     */     //   #74	-> 40
/*     */     //   #65	-> 41
/*     */     //   #74	-> 56
/*     */     //   #75	-> 64
/*     */     //   #76	-> 76
/*     */     //   #74	-> 79
/*     */     //   #74	-> 80
/*     */     //   #78	-> 83
/*     */     //   #80	-> 102
/*     */     //   #87	-> 129
/*     */     //   #82	-> 130
/*     */     //   #87	-> 144
/*     */     //   #88	-> 152
/*     */     //   #89	-> 159
/*     */     //   #90	-> 166
/*     */     //   #91	-> 172
/*     */     //   #98	-> 188
/*     */     //   #87	-> 191
/*     */     //   #87	-> 192
/*     */     //   #103	-> 195
/*     */     //   #100	-> 196
/*     */     //   #103	-> 218
/*     */     //   #104	-> 226
/*     */     //   #105	-> 228
/*     */     //   #106	-> 238
/*     */     //   #104	-> 242
/*     */     //   #108	-> 248
/*     */     //   #109	-> 256
/*     */     //   #103	-> 259
/*     */     //   #103	-> 260
/*     */     //   #113	-> 263
/*     */     //   #111	-> 264
/*     */     //   #113	-> 277
/*     */     //   #111	-> 283
/*     */     //   #113	-> 287
/*     */     //   #114	-> 295
/*     */     //   #115	-> 306
/*     */     //   #116	-> 311
/*     */     //   #113	-> 314
/*     */     //   #113	-> 315
/*     */     //   #118	-> 318
/*     */     //   #119	-> 330
/*     */     //   #120	-> 341
/*     */     //   #149	-> 359
/*     */     //   #149	-> 370
/*     */     //   #155	-> 373
/*     */     //   #159	-> 378
/*     */     //   #50	-> 398
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   64	13	5	$i$a$-apply-AIAssistantChatPanel$emptyStatePanel$2	I
/*     */     //   61	16	4	$this$emptyStatePanel_u24lambda_u240	Lcom/intellij/openapi/ui/DialogPanel;
/*     */     //   152	37	5	$i$a$-apply-AIAssistantChatPanel$chatScrollPane$2	I
/*     */     //   149	40	4	$this$chatScrollPane_u24lambda_u242	Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel$chatScrollPane$1;
/*     */     //   226	31	5	$i$a$-apply-AIAssistantChatPanel$editModeLabel$2	I
/*     */     //   223	34	4	$this$editModeLabel_u24lambda_u243	Ljavax/swing/JComponent;
/*     */     //   295	17	5	$i$a$-apply-AIAssistantChatPanel$shareFeedbackLabel$2	I
/*     */     //   292	20	4	$this$shareFeedbackLabel_u24lambda_u244	Lcom/intellij/ui/components/ActionLink;
/*     */     //   0	399	0	this	Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel;
/*     */     //   0	399	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   0	399	2	chatSession	Lcom/intellij/ml/llm/core/chat/session/ChatSession;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R$\020\003\032\025\022\f\022\n \006*\004\030\0010\0050\0050\004¢\006\002\b\007¢\006\b\n\000\032\004\b\b\020\tR\016\020\n\032\0020\013X\004¢\006\002\n\000¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel$Companion;", "", "()V", "CurrentDialogKey", "Lcom/intellij/openapi/actionSystem/DataKey;", "Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel;", "kotlin.jvm.PlatformType", "Lorg/jetbrains/annotations/NotNull;", "getCurrentDialogKey", "()Lcom/intellij/openapi/actionSystem/DataKey;", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "intellij.ml.llm"})
/*     */   public static final class Companion {
/*     */     @NotNull
/*     */     public final DataKey<AIAssistantChatPanel> getCurrentDialogKey() {
/*  55 */       return AIAssistantChatPanel.CurrentDialogKey;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private Companion() {}
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static {
/*     */     int $i$f$logger = 0;
/* 402 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(AIAssistantContainerPanel.class), "getInstance(T::class.java)"); } @NotNull private static final DataKey<AIAssistantChatPanel> CurrentDialogKey = DataKey.create("CurrentAIDialogKey"); static { Intrinsics.checkNotNullExpressionValue(DataKey.create("CurrentAIDialogKey"), "create<AIAssistantChatPanel>(\"CurrentAIDialogKey\")"); } @NotNull private static final Logger logger = Logger.getInstance(AIAssistantContainerPanel.class);
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\022\020\002\032\0020\0032\b\020\004\032\004\030\0010\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel$focusMouseListener$1", "Ljava/awt/event/MouseAdapter;", "mouseClicked", "", "e", "Ljava/awt/event/MouseEvent;", "intellij.ml.llm"})
/*     */   public static final class AIAssistantChatPanel$focusMouseListener$1 extends MouseAdapter {
/*     */     public void mouseClicked(@Nullable MouseEvent e) {
/*     */       AIAssistantChatPanel.this.focusInput();
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/ui/dsl/builder/Panel;", "invoke"})
/*     */   static final class AIAssistantChatPanel$emptyStatePanel$1 extends Lambda implements Function1<Panel, Unit> {
/*     */     public final void invoke(@NotNull Panel $this$panel) {
/*     */       Intrinsics.checkNotNullParameter($this$panel, "$this$panel");
/*     */       Panel.row$default($this$panel, null, new Function1<Row, Unit>() {
/*     */             public final void invoke(@NotNull Row $this$row) {
/*     */               Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*     */               Row.text$default($this$row, LLMBundle.message("label.chat.empty.text", new Object[0]), 0, null, 6, null).align(Align.CENTER).applyToComponent(new Function1<JEditorPane, Unit>() {
/*     */                     public final void invoke(@NotNull JEditorPane $this$applyToComponent) {
/*     */                       Intrinsics.checkNotNullParameter($this$applyToComponent, "$this$applyToComponent");
/*     */                       $this$applyToComponent.addMouseListener(AIAssistantChatPanel.this.focusMouseListener);
/*     */                       $this$applyToComponent.setForeground(AIAssistantColors.INSTANCE.getEmptyStateForeground());
/*     */                     }
/*     */                   });
/*     */             }
/*     */           }1, null).resizableRow();
/*     */     }
/*     */     
/*     */     AIAssistantChatPanel$emptyStatePanel$1() {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\021\n\000\n\002\030\002\n\000\n\002\020\002\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026¨\006\004"}, d2 = {"com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel$chatScrollPane$1", "Lcom/intellij/ui/components/JBScrollPane;", "updateUI", "", "intellij.ml.llm"})
/*     */   public static final class AIAssistantChatPanel$chatScrollPane$1 extends JBScrollPane {
/*     */     AIAssistantChatPanel$chatScrollPane$1(JPanel $super_call_param$1) {
/*     */       super($super_call_param$1);
/*     */     }
/*     */     
/*     */     public void updateUI() {
/*     */       super.updateUI();
/*     */       setBorder(null);
/*     */     }
/*     */   }
/*     */   
/*     */   private static final void chatScrollPane$lambda$2$lambda$1(AIAssistantChatPanel this$0, AIAssistantChatPanel$chatScrollPane$1 $this_apply, AdjustmentEvent it) {
/*     */     Intrinsics.checkNotNullParameter(this$0, "this$0");
/*     */     Intrinsics.checkNotNullParameter($this_apply, "$this_apply");
/*     */     if (it.getValue() != this$0.lastScrollValue && !this$0.scrollingToEnd) {
/*     */       int maximum = (this$0.chatPanel.getPreferredSize()).height;
/*     */       this$0.autoscrollToEnd = (it.getValue() + $this_apply.getVerticalScrollBar().getModel().getExtent() >= maximum);
/*     */     } 
/*     */     this$0.lastScrollValue = it.getValue();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*     */   static final class AIAssistantChatPanel$editModeLabel$1 extends Lambda implements Function0<Unit> {
/*     */     public final void invoke() {
/*     */       AIAssistantChatEventLogger.Companion.logEditUserMessageCancelledWithMouse(AIAssistantChatPanel.this.project, AIAssistantChatPanel.this.chatSession);
/*     */       AIAssistantChatPanel.this.endEditMode();
/*     */     }
/*     */     
/*     */     AIAssistantChatPanel$editModeLabel$1() {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "Ljava/awt/event/ActionEvent;", "invoke"})
/*     */   static final class AIAssistantChatPanel$shareFeedbackLabel$1 extends Lambda implements Function1<ActionEvent, Unit> {
/*     */     public static final AIAssistantChatPanel$shareFeedbackLabel$1 INSTANCE = new AIAssistantChatPanel$shareFeedbackLabel$1();
/*     */     
/*     */     AIAssistantChatPanel$shareFeedbackLabel$1() {
/*     */       super(1);
/*     */     }
/*     */     
/*     */     public final void invoke(@NotNull ActionEvent it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       BrowserUtil.browse("https://jb.gg/aiassistant-feedback");
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/ui/dsl/builder/Panel;", "invoke"})
/*     */   static final class AIAssistantChatPanel$content$1 extends Lambda implements Function1<Panel, Unit> {
/*     */     public final void invoke(@NotNull Panel $this$panel) {
/*     */       Intrinsics.checkNotNullParameter($this$panel, "$this$panel");
/*     */       AIAssistantChatPanel.this.initTextInputArea(AIAssistantChatPanel.this.project);
/*     */       $this$panel.customizeSpacingConfiguration((SpacingConfiguration)new EmptySpacingConfiguration(), new Function1<Panel, Unit>() {
/*     */             public final void invoke(@NotNull Panel $this$customizeSpacingConfiguration) {
/*     */               Intrinsics.checkNotNullParameter($this$customizeSpacingConfiguration, "$this$customizeSpacingConfiguration");
/*     */               Panel.row$default($this$customizeSpacingConfiguration, null, new Function1<Row, Unit>() {
/*     */                     public final void invoke(@NotNull Row $this$row) {
/*     */                       Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*     */                       $this$row.cell((JComponent)AIAssistantChatPanel.this.contentContainer).align(Align.FILL);
/*     */                     }
/*     */                   }1, null).resizableRow();
/*     */               Panel.row$default($this$customizeSpacingConfiguration, null, new Function1<Row, Unit>() {
/*     */                     public final void invoke(@NotNull Row $this$row) {
/*     */                       Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*     */                       $this$row.cell((JComponent)new Wrapper(AIAssistantChatPanel.this.editModeLabel)).align((Align)AlignX.FILL.INSTANCE);
/*     */                     }
/*     */                   }1, null).visibleIf((ObservableProperty)AIAssistantChatPanel.this.isInEditMode);
/*     */               Panel.row$default($this$customizeSpacingConfiguration, null, new Function1<Row, Unit>() {
/*     */                     public final void invoke(@NotNull Row $this$row) {
/*     */                       Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*     */                       $this$row.cell((JComponent)AIAssistantChatPanel.this.shareFeedbackLabel).align((Align)AlignX.RIGHT.INSTANCE).customize(UnscaledGapsKt.UnscaledGaps(AIAssistantInputGaps.INSTANCE.getVGap(), AIAssistantInputGaps.INSTANCE.getHGap(), AIAssistantInputGaps.INSTANCE.getVGap(), AIAssistantInputGaps.INSTANCE.getHGap()));
/*     */                     }
/*     */                   }1, null);
/*     */               $this$customizeSpacingConfiguration.separator(JBColor.border()).visibleIf(PropertyOperationUtil.not((ObservableProperty)AIAssistantChatPanel.this.isInEditMode));
/*     */               $this$customizeSpacingConfiguration.panel(new Function1<Panel, Unit>() {
/*     */                     public final void invoke(@NotNull Panel $this$panel) {
/*     */                       Intrinsics.checkNotNullParameter($this$panel, "$this$panel");
/*     */                       Panel.row$default($this$panel, null, new Function1<Row, Unit>() {
/*     */                             public final void invoke(@NotNull Row $this$row) {
/*     */                               Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*     */                               $this$row.cell((JComponent)AIAssistantChatPanel.this.input).align((Align)AlignX.FILL.INSTANCE);
/*     */                             }
/*     */                           }1, null);
/*     */                     }
/*     */                   }).customize(UnscaledGapsKt.UnscaledGaps(10));
/*     */             }
/*     */           });
/*     */     }
/*     */     
/*     */     AIAssistantChatPanel$content$1() {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   private final boolean isEditMode() {
/*     */     return (this.editingContext != null);
/*     */   }
/*     */   
/*     */   public final void initialize(@NotNull Project project) {
/*     */     Intrinsics.checkNotNullParameter(project, "project");
/*     */     this.chatPanel.setBorder(JBUI.Borders.empty(20));
/*     */     updateState();
/*     */     setContent((JComponent)this.content);
/*     */     fillState(this.chatSession);
/*     */     focusInput();
/*     */     this.chatSession.addStateListener(new AIAssistantChatPanel$initialize$1());
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\031\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\003*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\b\020\006\032\0020\003H\026J\b\020\007\032\0020\003H\026¨\006\b"}, d2 = {"com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel$initialize$1", "Lcom/intellij/ml/llm/core/chat/session/ChatSessionStateListener;", "onChatStateChanged", "", "chatState", "Lcom/intellij/ml/llm/core/chat/session/ChatSessionState;", "onFinishSendingMessage", "onStartSendingMessage", "intellij.ml.llm"})
/*     */   public static final class AIAssistantChatPanel$initialize$1 implements ChatSessionStateListener {
/*     */     public void onChatStateChanged(@NotNull ChatSessionState chatState) {
/*     */       Intrinsics.checkNotNullParameter(chatState, "chatState");
/*     */     }
/*     */     
/*     */     public void onStartSendingMessage() {
/*     */       AIAssistantChatPanel.this.input.isEditorViewOnly(true);
/*     */       AIAssistantChatPanel.this.input.setWaitingText();
/*     */       AIAssistantChatPanel.this.input.updateButtonPresentation(AIAssistantChatPanel$initialize$1$onStartSendingMessage$1.INSTANCE);
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/openapi/actionSystem/Presentation;", "invoke"})
/*     */     static final class AIAssistantChatPanel$initialize$1$onStartSendingMessage$1 extends Lambda implements Function1<Presentation, Unit> {
/*     */       public static final AIAssistantChatPanel$initialize$1$onStartSendingMessage$1 INSTANCE = new AIAssistantChatPanel$initialize$1$onStartSendingMessage$1();
/*     */       
/*     */       public final void invoke(@NotNull Presentation $this$updateButtonPresentation) {
/*     */         Intrinsics.checkNotNullParameter($this$updateButtonPresentation, "$this$updateButtonPresentation");
/*     */         $this$updateButtonPresentation.setIcon(ExpUiIcons.Run.Stop);
/*     */         HelpTooltip helpTooltip1 = new HelpTooltip(), helpTooltip2 = helpTooltip1;
/*     */         Key key = ActionButton.CUSTOM_HELP_TOOLTIP;
/*     */         Presentation presentation = $this$updateButtonPresentation;
/*     */         int $i$a$-apply-AIAssistantChatPanel$initialize$1$onStartSendingMessage$1$1 = 0;
/*     */         helpTooltip2.setTitle("Stop");
/*     */         Unit unit = Unit.INSTANCE;
/*     */         presentation.putClientProperty(key, helpTooltip1);
/*     */       }
/*     */       
/*     */       AIAssistantChatPanel$initialize$1$onStartSendingMessage$1() {
/*     */         super(1);
/*     */       }
/*     */     }
/*     */     
/*     */     public void onFinishSendingMessage() {
/*     */       AIAssistantChatPanel.this.input.isEditorViewOnly(false);
/*     */       AIAssistantChatPanel.this.input.setDefaultPlaceholderText();
/*     */       AIAssistantChatPanel.this.input.updateButtonPresentation(AIAssistantChatPanel$initialize$1$onFinishSendingMessage$1.INSTANCE);
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/openapi/actionSystem/Presentation;", "invoke"})
/*     */     static final class AIAssistantChatPanel$initialize$1$onFinishSendingMessage$1 extends Lambda implements Function1<Presentation, Unit> {
/*     */       public static final AIAssistantChatPanel$initialize$1$onFinishSendingMessage$1 INSTANCE = new AIAssistantChatPanel$initialize$1$onFinishSendingMessage$1();
/*     */       
/*     */       public final void invoke(@NotNull Presentation $this$updateButtonPresentation) {
/*     */         Intrinsics.checkNotNullParameter($this$updateButtonPresentation, "$this$updateButtonPresentation");
/*     */         $this$updateButtonPresentation.setIcon(MLLlmIcons.Chat.Send);
/*     */         HelpTooltip helpTooltip1 = new HelpTooltip(), helpTooltip2 = helpTooltip1;
/*     */         Key key = ActionButton.CUSTOM_HELP_TOOLTIP;
/*     */         Presentation presentation = $this$updateButtonPresentation;
/*     */         int $i$a$-apply-AIAssistantChatPanel$initialize$1$onFinishSendingMessage$1$1 = 0;
/*     */         helpTooltip2.setTitle("Send");
/*     */         helpTooltip2.setShortcut("Enter");
/*     */         Unit unit = Unit.INSTANCE;
/*     */         presentation.putClientProperty(key, helpTooltip1);
/*     */       }
/*     */       
/*     */       AIAssistantChatPanel$initialize$1$onFinishSendingMessage$1() {
/*     */         super(1);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void dispose() {}
/*     */   
/*     */   public final void enterEditMode(@NotNull CompletableMessage message) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'message'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_0
/*     */     //   8: getfield messages : Ljava/util/List;
/*     */     //   11: checkcast java/lang/Iterable
/*     */     //   14: astore_3
/*     */     //   15: iconst_0
/*     */     //   16: istore #4
/*     */     //   18: aload_3
/*     */     //   19: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   24: astore #5
/*     */     //   26: aload #5
/*     */     //   28: invokeinterface hasNext : ()Z
/*     */     //   33: ifeq -> 77
/*     */     //   36: aload #5
/*     */     //   38: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   43: astore #6
/*     */     //   45: aload #6
/*     */     //   47: checkcast com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageViewModel
/*     */     //   50: astore #7
/*     */     //   52: iconst_0
/*     */     //   53: istore #8
/*     */     //   55: aload #7
/*     */     //   57: invokevirtual getCompletableMessage : ()Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;
/*     */     //   60: aload_1
/*     */     //   61: if_acmpne -> 68
/*     */     //   64: iconst_1
/*     */     //   65: goto -> 69
/*     */     //   68: iconst_0
/*     */     //   69: ifeq -> 26
/*     */     //   72: aload #6
/*     */     //   74: goto -> 78
/*     */     //   77: aconst_null
/*     */     //   78: checkcast com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageViewModel
/*     */     //   81: astore_2
/*     */     //   82: aload_2
/*     */     //   83: ifnonnull -> 104
/*     */     //   86: getstatic com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   89: aload_1
/*     */     //   90: invokeinterface getUid : ()Ljava/lang/String;
/*     */     //   95: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   100: invokevirtual error : (Ljava/lang/String;)V
/*     */     //   103: return
/*     */     //   104: aload_0
/*     */     //   105: aload_2
/*     */     //   106: invokespecial enterEditMode : (Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageViewModel;)V
/*     */     //   109: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #207	-> 7
/*     */     //   #395	-> 18
/*     */     //   #207	-> 55
/*     */     //   #395	-> 69
/*     */     //   #396	-> 77
/*     */     //   #207	-> 78
/*     */     //   #208	-> 82
/*     */     //   #209	-> 86
/*     */     //   #210	-> 103
/*     */     //   #213	-> 104
/*     */     //   #214	-> 109
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   55	14	8	$i$a$-firstOrNull-AIAssistantChatPanel$enterEditMode$vm$1	I
/*     */     //   52	17	7	it	Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageViewModel;
/*     */     //   45	32	6	element$iv	Ljava/lang/Object;
/*     */     //   18	60	4	$i$f$firstOrNull	I
/*     */     //   15	63	3	$this$firstOrNull$iv	Ljava/lang/Iterable;
/*     */     //   82	28	2	vm	Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageViewModel;
/*     */     //   0	110	0	this	Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel;
/*     */     //   0	110	1	message	Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;
/*     */   }
/*     */   
/*     */   private final void enterEditMode(AIAssistantChatMessageViewModel message) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: <illegal opcode> dispatchKeyEvent : (Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel;Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageViewModel;)Ljava/awt/KeyEventDispatcher;
/*     */     //   7: astore_2
/*     */     //   8: invokestatic getCurrentKeyboardFocusManager : ()Ljava/awt/KeyboardFocusManager;
/*     */     //   11: aload_2
/*     */     //   12: invokevirtual addKeyEventDispatcher : (Ljava/awt/KeyEventDispatcher;)V
/*     */     //   15: aload_0
/*     */     //   16: new com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel$EditingMessageContext
/*     */     //   19: dup
/*     */     //   20: aload_1
/*     */     //   21: aload_0
/*     */     //   22: getfield input : Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputWithButton;
/*     */     //   25: invokevirtual getText : ()Ljava/lang/String;
/*     */     //   28: aload_2
/*     */     //   29: invokespecial <init> : (Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageViewModel;Ljava/lang/String;Ljava/awt/KeyEventDispatcher;)V
/*     */     //   32: putfield editingContext : Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel$EditingMessageContext;
/*     */     //   35: aload_0
/*     */     //   36: getfield input : Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputWithButton;
/*     */     //   39: aload_1
/*     */     //   40: invokevirtual getText : ()Ljava/lang/String;
/*     */     //   43: invokevirtual setText : (Ljava/lang/String;)V
/*     */     //   46: aload_0
/*     */     //   47: getfield isInEditMode : Lcom/intellij/openapi/observable/properties/AtomicBooleanProperty;
/*     */     //   50: iconst_1
/*     */     //   51: invokevirtual set : (Z)V
/*     */     //   54: aload_0
/*     */     //   55: invokevirtual focusInput : ()V
/*     */     //   58: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #217	-> 0
/*     */     //   #225	-> 8
/*     */     //   #226	-> 15
/*     */     //   #227	-> 35
/*     */     //   #228	-> 46
/*     */     //   #229	-> 54
/*     */     //   #230	-> 58
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   8	51	2	dispatcher	Ljava/awt/KeyEventDispatcher;
/*     */     //   0	59	0	this	Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel;
/*     */     //   0	59	1	message	Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageViewModel;
/*     */   }
/*     */   
/*     */   private static final boolean enterEditMode$lambda$6(AIAssistantChatPanel this$0, AIAssistantChatMessageViewModel $message, KeyEvent e) {
/*     */     Intrinsics.checkNotNullParameter(this$0, "this$0");
/*     */     Intrinsics.checkNotNullParameter($message, "$message");
/*     */     if ((e != null) ? ((e.getKeyCode() == 27)) : false) {
/*     */       AIAssistantChatEventLogger.Companion.logEditUserMessageCancelled(this$0.project, $message.getChat(), $message.getCompletableMessage());
/*     */       this$0.endEditMode();
/*     */     } 
/*     */     return false;
/*     */   }
/*     */   
/*     */   public final void focusInput() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   4: invokestatic getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/wm/IdeFocusManager;
/*     */     //   7: astore_1
/*     */     //   8: aload_1
/*     */     //   9: astore_2
/*     */     //   10: iconst_0
/*     */     //   11: istore_3
/*     */     //   12: aload_2
/*     */     //   13: aload_2
/*     */     //   14: aload_0
/*     */     //   15: <illegal opcode> run : (Lcom/intellij/openapi/wm/IdeFocusManager;Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel;)Ljava/lang/Runnable;
/*     */     //   20: invokevirtual doWhenFocusSettlesDown : (Ljava/lang/Runnable;)V
/*     */     //   23: nop
/*     */     //   24: nop
/*     */     //   25: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #233	-> 0
/*     */     //   #234	-> 12
/*     */     //   #237	-> 23
/*     */     //   #233	-> 24
/*     */     //   #238	-> 25
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   12	12	3	$i$a$-apply-AIAssistantChatPanel$focusInput$1	I
/*     */     //   10	14	2	$this$focusInput_u24lambda_u248	Lcom/intellij/openapi/wm/IdeFocusManager;
/*     */     //   0	26	0	this	Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel;
/*     */   }
/*     */   
/*     */   private static final void focusInput$lambda$8$lambda$7(IdeFocusManager $this_apply, AIAssistantChatPanel this$0) {
/*     */     Intrinsics.checkNotNullParameter(this$0, "this$0");
/*     */     $this_apply.requestFocus(this$0.input.getFocusableComponent(), true);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final AIAssistantChatPanel beforeShown() {
/*     */     focusInput();
/*     */     return this;
/*     */   }
/*     */   
/*     */   private final void endEditMode() {
/*     */     EditingMessageContext currentContext;
/*     */     if (this.editingContext == null)
/*     */       return; 
/*     */     KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher(currentContext.getDispatcher());
/*     */     this.input.setText(currentContext.getPreviousText());
/*     */     this.editingContext = null;
/*     */     this.isInEditMode.set(false);
/*     */   }
/*     */   
/*     */   private final void updateState() {
/*     */     boolean hasScrollPane = this.contentContainer.getTargetComponent() instanceof JBScrollPane;
/*     */     boolean needScrollPane = ((!this.chatSession.getMessages().isEmpty()) || (!this.messages.isEmpty()));
/*     */     if (needScrollPane && !hasScrollPane) {
/*     */       this.contentContainer.setContent((JComponent)this.chatScrollPane);
/*     */     } else if (!needScrollPane) {
/*     */       this.contentContainer.setContent((JComponent)this.emptyStatePanel);
/*     */     } 
/*     */     revalidate();
/*     */   }
/*     */   
/*     */   private final void fillState(ChatSession chat) {
/*     */     Iterable $this$forEach$iv = chat.getMessages();
/*     */     int $i$f$forEach = 0;
/*     */     Iterator iterator = $this$forEach$iv.iterator();
/*     */     if (iterator.hasNext()) {
/*     */       AIAssistantChatMessageView aiResponse;
/*     */       Object element$iv = iterator.next();
/*     */       CompletableMessage message = (CompletableMessage)element$iv;
/*     */       int $i$a$-forEach-AIAssistantChatPanel$fillState$1 = 0;
/*     */       switch (WhenMappings.$EnumSwitchMapping$0[message.getAuthor().ordinal()]) {
/*     */         case 1:
/*     */         
/*     */         case 2:
/*     */           aiResponse = addAIResponse(message);
/*     */           aiResponse.addToLastPart(message.getText());
/*     */           aiResponse.getMessage().setMessageRating(message.getRating());
/*     */         default:
/*     */           throw new NoWhenBranchMatchedException();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private final void initTextInputArea(Project project) {
/*     */     this.input.addListener(new AIAssistantChatPanel$initTextInputArea$1());
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\026¨\006\b"}, d2 = {"com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel$initTextInputArea$1", "Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputListener;", "onSubmit", "", "component", "Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputWithButton;", "trigger", "Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputTrigger;", "intellij.ml.llm"})
/*     */   public static final class AIAssistantChatPanel$initTextInputArea$1 implements AIAssistantInputListener {
/*     */     public void onSubmit(@NotNull AIAssistantInputWithButton component, @NotNull AIAssistantInputTrigger trigger) {
/*     */       Intrinsics.checkNotNullParameter(component, "component");
/*     */       Intrinsics.checkNotNullParameter(trigger, "trigger");
/*     */       if (AIAssistantChatPanel.this.chatSession.getState() == ChatSessionState.Idle) {
/*     */         AIAssistantChatPanel.this.onInputSubmit();
/*     */       } else if (trigger == AIAssistantInputTrigger.Button) {
/*     */         ((CompletableMessage)CollectionsKt.last(AIAssistantChatPanel.this.chatSession.getMessages())).cancel();
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private final void onInputSubmit() {
/*     */     if ((((CharSequence)StringsKt.trim(this.input.getText()).toString()).length() == 0))
/*     */       return; 
/*     */     String userText = StringsKt.trim(this.input.getText()).toString();
/*     */     if (isEditMode())
/*     */       restartChatFromEditedMessage(); 
/*     */     this.input.setText("");
/*     */     this.controller.sendRequest(userText);
/*     */   }
/*     */   
/*     */   private final void restartChatFromEditedMessage() {
/*     */     AIAssistantChatMessageViewModel message;
/*     */     if (this.editingContext == null || this.editingContext.getMessage() == null) {
/*     */       this.editingContext.getMessage();
/*     */       return;
/*     */     } 
/*     */     restartChatFromMessage(message);
/*     */     AIAssistantChatEventLogger.Companion.logEditUserMessageFinished(this.project, message.getChat(), message.getCompletableMessage());
/*     */     endEditMode();
/*     */   }
/*     */   
/*     */   public final void recoverFromError(@NotNull AIAssistantChatMessageViewModel errorMessage) {
/*     */     Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
/*     */     AIAssistantChatMessageViewModel previous = this.messages.get(this.messages.indexOf(errorMessage) - 1);
/*     */     restartChatFromMessage(previous);
/*     */     this.controller.sendRequest(previous.getText());
/*     */   }
/*     */   
/*     */   private final void restartChatFromMessage(AIAssistantChatMessageViewModel message) {
/*     */     int targetMessageIndex = this.messages.indexOf(message);
/*     */     List toRemove = new ArrayList();
/*     */     for (int i = targetMessageIndex, j = this.messages.size(); i < j; i++)
/*     */       toRemove.add(this.messages.get(i)); 
/*     */     Iterable $this$forEach$iv = toRemove;
/*     */     int $i$f$forEach = 0;
/*     */     Iterator iterator = $this$forEach$iv.iterator();
/*     */     if (iterator.hasNext()) {
/*     */       Object element$iv = iterator.next();
/*     */       AIAssistantChatMessageViewModel it = (AIAssistantChatMessageViewModel)element$iv;
/*     */       int $i$a$-forEach-AIAssistantChatPanel$restartChatFromMessage$1 = 0;
/*     */       removeMessage(it);
/*     */     } 
/*     */     this.chatSession.rewind(targetMessageIndex);
/*     */   }
/*     */   
/*     */   public final void scrollToEndIfNeeded() {
/*     */     if (this.autoscrollToEnd) {
/*     */       this.scrollingToEnd = true;
/*     */       try {
/*     */         this.chatScrollPane.getVerticalScrollBar().setValue(this.chatScrollPane.getVerticalScrollBar().getMaximum());
/*     */       } finally {
/*     */         this.scrollingToEnd = false;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final AIAssistantChatMessageView addAIResponse(@NotNull CompletableMessage message) {
/*     */     Intrinsics.checkNotNullParameter(message, "message");
/*     */     AIAssistantChatMessageView assistantMessage = new AIAssistantChatMessageView(this.project, ChatMessageAuthor.Assistant, this.chatSession, message, this);
/*     */     this.chatPanel.add(assistantMessage, ListLayout.GrowPolicy.GROW);
/*     */     this.messages.add(assistantMessage.getMessage());
/*     */     ApplicationManager.getApplication().invokeLater(this::addAIResponse$lambda$11);
/*     */     return assistantMessage;
/*     */   }
/*     */   
/*     */   private static final void addAIResponse$lambda$11(AIAssistantChatPanel this$0) {
/*     */     Intrinsics.checkNotNullParameter(this$0, "this$0");
/*     */     this$0.scrollToEndIfNeeded();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final AIAssistantChatMessageView addUserRequest(@NotNull CompletableMessage message) {
/*     */     Intrinsics.checkNotNullParameter(message, "message");
/*     */     AIAssistantChatMessageView userMessageField = new AIAssistantChatMessageView(this.project, ChatMessageAuthor.User, this.chatSession, message, this);
/*     */     userMessageField.addPart(message.getText(), MessagePart.Type.PlainText);
/*     */     this.messages.add(userMessageField.getMessage());
/*     */     this.chatPanel.add(userMessageField, ListLayout.Alignment.END);
/*     */     updateState();
/*     */     PopupHandler.installPopupMenu(userMessageField, "AIAssistant.ToolWindow.Chat.Message.User.ContextActions", "AIAssistant.ToolWindow.Chat.Message");
/*     */     userMessageField.layoutAll();
/*     */     ApplicationManager.getApplication().invokeLater(this::addUserRequest$lambda$12);
/*     */     return userMessageField;
/*     */   }
/*     */   
/*     */   private static final void addUserRequest$lambda$12(AIAssistantChatPanel this$0) {
/*     */     Intrinsics.checkNotNullParameter(this$0, "this$0");
/*     */     this$0.scrollToEndIfNeeded();
/*     */   }
/*     */   
/*     */   private final void removeMessage(AIAssistantChatMessageViewModel message) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield chatPanel : Ljavax/swing/JPanel;
/*     */     //   4: invokevirtual getComponents : ()[Ljava/awt/Component;
/*     */     //   7: dup
/*     */     //   8: ldc_w 'chatPanel.components'
/*     */     //   11: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: checkcast [Ljava/lang/Object;
/*     */     //   17: astore_3
/*     */     //   18: iconst_0
/*     */     //   19: istore #4
/*     */     //   21: aload_3
/*     */     //   22: arraylength
/*     */     //   23: istore #5
/*     */     //   25: iload #4
/*     */     //   27: iload #5
/*     */     //   29: if_icmpge -> 95
/*     */     //   32: aload_3
/*     */     //   33: iload #4
/*     */     //   35: aaload
/*     */     //   36: astore #6
/*     */     //   38: aload #6
/*     */     //   40: checkcast java/awt/Component
/*     */     //   43: astore #7
/*     */     //   45: iconst_0
/*     */     //   46: istore #8
/*     */     //   48: aload #7
/*     */     //   50: instanceof com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView
/*     */     //   53: ifeq -> 64
/*     */     //   56: aload #7
/*     */     //   58: checkcast com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView
/*     */     //   61: goto -> 65
/*     */     //   64: aconst_null
/*     */     //   65: dup
/*     */     //   66: ifnull -> 75
/*     */     //   69: invokevirtual getMessage : ()Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageViewModel;
/*     */     //   72: goto -> 77
/*     */     //   75: pop
/*     */     //   76: aconst_null
/*     */     //   77: aload_1
/*     */     //   78: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   81: ifeq -> 89
/*     */     //   84: aload #6
/*     */     //   86: goto -> 96
/*     */     //   89: iinc #4, 1
/*     */     //   92: goto -> 25
/*     */     //   95: aconst_null
/*     */     //   96: checkcast java/awt/Component
/*     */     //   99: astore_2
/*     */     //   100: aload_0
/*     */     //   101: getfield chatPanel : Ljavax/swing/JPanel;
/*     */     //   104: aload_2
/*     */     //   105: invokevirtual remove : (Ljava/awt/Component;)V
/*     */     //   108: aload_0
/*     */     //   109: getfield messages : Ljava/util/List;
/*     */     //   112: aload_1
/*     */     //   113: invokeinterface remove : (Ljava/lang/Object;)Z
/*     */     //   118: pop
/*     */     //   119: aload_0
/*     */     //   120: invokespecial updateState : ()V
/*     */     //   123: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #370	-> 0
/*     */     //   #401	-> 45
/*     */     //   #370	-> 48
/*     */     //   #370	-> 81
/*     */     //   #370	-> 96
/*     */     //   #371	-> 100
/*     */     //   #372	-> 108
/*     */     //   #373	-> 119
/*     */     //   #374	-> 123
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   48	33	8	$i$a$-find-AIAssistantChatPanel$removeMessage$messageView$1	I
/*     */     //   45	36	7	component	Ljava/awt/Component;
/*     */     //   100	24	2	messageView	Ljava/awt/Component;
/*     */     //   0	124	0	this	Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel;
/*     */     //   0	124	1	message	Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageViewModel;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object getData(@NotNull String dataId) {
/*     */     Intrinsics.checkNotNullParameter(dataId, "dataId");
/*     */     if (CurrentDialogKey.is(dataId))
/*     */       return this; 
/*     */     if (ChatSession.Companion.getCurrentSession().is(dataId))
/*     */       return this.chatSession; 
/*     */     if (AIAssistantChatPanelController.Companion.getKey().is(dataId))
/*     */       return this.controller; 
/*     */     return null;
/*     */   }
/*     */   
/*     */   public void updateUI() {
/*     */     super.updateUI();
/*     */     setBackground(UIUtil.getPanelBackground());
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\b\b\002\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\002\020\bR\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\t\020\nR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\013\020\fR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\r\020\016¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel$EditingMessageContext;", "", "message", "Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageViewModel;", "previousText", "", "dispatcher", "Ljava/awt/KeyEventDispatcher;", "(Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageViewModel;Ljava/lang/String;Ljava/awt/KeyEventDispatcher;)V", "getDispatcher", "()Ljava/awt/KeyEventDispatcher;", "getMessage", "()Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageViewModel;", "getPreviousText", "()Ljava/lang/String;", "intellij.ml.llm"})
/*     */   private static final class EditingMessageContext {
/*     */     @NotNull
/*     */     private final AIAssistantChatMessageViewModel message;
/*     */     @NotNull
/*     */     private final String previousText;
/*     */     @NotNull
/*     */     private final KeyEventDispatcher dispatcher;
/*     */     
/*     */     public EditingMessageContext(@NotNull AIAssistantChatMessageViewModel message, @NotNull String previousText, @NotNull KeyEventDispatcher dispatcher) {
/*     */       this.message = message;
/*     */       this.previousText = previousText;
/*     */       this.dispatcher = dispatcher;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final AIAssistantChatMessageViewModel getMessage() {
/*     */       return this.message;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String getPreviousText() {
/*     */       return this.previousText;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final KeyEventDispatcher getDispatcher() {
/*     */       return this.dispatcher;
/*     */     }
/*     */   }
/*     */   @NotNull
/*     */   private final Project project;
/*     */   @NotNull
/*     */   private final ChatSession chatSession;
/*     */   @NotNull
/*     */   private final AIAssistantChatPanel$focusMouseListener$1 focusMouseListener;
/*     */   @NotNull
/*     */   private final DialogPanel emptyStatePanel;
/*     */   @NotNull
/*     */   private final AIAssistantInputWithButton input;
/*     */   @NotNull
/*     */   private final JPanel chatPanel;
/*     */   @NotNull
/*     */   private final AIAssistantChatPanel$chatScrollPane$1 chatScrollPane;
/*     */   @NotNull
/*     */   private final JComponent editModeLabel;
/*     */   @NotNull
/*     */   private final ActionLink shareFeedbackLabel;
/*     */   @NotNull
/*     */   private final AtomicBooleanProperty isInEditMode;
/*     */   @NotNull
/*     */   private final Wrapper contentContainer;
/*     */   @NotNull
/*     */   private final DialogPanel content;
/*     */   @NotNull
/*     */   private final List<AIAssistantChatMessageViewModel> messages;
/*     */   @Nullable
/*     */   private EditingMessageContext editingContext;
/*     */   private boolean autoscrollToEnd;
/*     */   private boolean scrollingToEnd;
/*     */   private int lastScrollValue;
/*     */   @NotNull
/*     */   private final AIAssistantChatPanelController controller;
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */