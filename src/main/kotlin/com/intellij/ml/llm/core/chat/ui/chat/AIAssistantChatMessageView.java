/*     */ package com.intellij.ml.llm.core.chat.ui.chat;
/*     */ import com.intellij.ide.DataManager;
/*     */ import com.intellij.ml.llm.core.chat.layout.AIMessageLayouter;
/*     */ import com.intellij.ml.llm.core.chat.messages.ChatMessageAuthor;
/*     */ import com.intellij.ml.llm.core.chat.messages.ChatMessageButton;
/*     */ import com.intellij.ml.llm.core.chat.messages.CompletableMessage;
/*     */ import com.intellij.ml.llm.core.chat.messages.ErrorState;
/*     */ import com.intellij.ml.llm.core.chat.messages.MessageState;
/*     */ import com.intellij.ml.llm.core.chat.parts.MessagePart;
/*     */ import com.intellij.ml.llm.core.grazieAPI.GrazieAuthService;
/*     */ import com.intellij.openapi.actionSystem.ActionGroup;
/*     */ import com.intellij.openapi.actionSystem.impl.ActionToolbarImpl;
/*     */ import com.intellij.openapi.components.ComponentManager;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.util.ui.components.BorderLayoutPanel;
/*     */ import java.awt.Color;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.RenderingHints;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000²\001\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\n\002\020 \n\002\b\003\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\007\030\000 H2\0020\0012\0020\002:\003HIJB-\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n\022\006\020\013\032\0020\f¢\006\002\020\rJ\020\020\035\032\0020\0362\006\020\037\032\0020 H\002J\026\020\035\032\0020\0362\006\020!\032\0020\"2\006\020#\032\0020$J\016\020%\032\0020\0362\006\020!\032\0020\"J\r\020&\032\0070'¢\006\002\b\032H\002J\b\020(\032\0020\001H\002J\b\020)\032\0020\036H\002J\022\020*\032\004\030\0010+2\006\020,\032\0020\"H\026J\b\020-\032\0020.H\026J\b\020/\032\0020.H\026J\b\0200\032\0020.H\026J\006\0201\032\0020\036J$\0202\032\0020\0362\f\0203\032\b\022\004\022\0020 042\f\0205\032\b\022\004\022\0020 04H\002J\020\0206\032\0020\0362\006\0207\032\00208H\024J\020\0209\032\0020\0362\006\020\037\032\0020 H\002J\b\020:\032\0020\036H\002J\022\020;\032\0020\0362\b\020<\032\004\030\0010=H\026J\030\020>\032\0020\0362\006\020?\032\0020@2\006\020A\032\0020@H\002J\024\020B\032\0020C*\0020D2\006\020\003\032\0020\004H\002J(\020E\032\b\022\004\022\0020 04*\b\022\004\022\0020 042\006\020F\032\0020 2\006\020G\032\0020 H\002R\016\020\005\032\0020\006X\004¢\006\002\n\000R\016\020\016\032\0020\001X\004¢\006\002\n\000R\016\020\t\032\0020\nX\004¢\006\002\n\000R\016\020\017\032\0020\020X\016¢\006\002\n\000R\021\020\021\032\0020\022¢\006\b\n\000\032\004\b\023\020\024R\016\020\025\032\0020\026X\004¢\006\002\n\000R\016\020\013\032\0020\fX\004¢\006\002\n\000R\016\020\027\032\0020\001X\004¢\006\002\n\000R\016\020\003\032\0020\004X\004¢\006\002\n\000R\023\020\030\032\0070\031¢\006\002\b\032X\004¢\006\002\n\000R\016\020\033\032\0020\034X\004¢\006\002\n\000¨\006K"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView;", "Ljavax/swing/JPanel;", "Lcom/intellij/openapi/actionSystem/DataProvider;", "project", "Lcom/intellij/openapi/project/Project;", "author", "Lcom/intellij/ml/llm/core/chat/messages/ChatMessageAuthor;", "session", "Lcom/intellij/ml/llm/core/chat/session/ChatSession;", "completableMessage", "Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;", "parentPanel", "Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/chat/messages/ChatMessageAuthor;Lcom/intellij/ml/llm/core/chat/session/ChatSession;Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel;)V", "buttonsContainer", "hasWaitingState", "", "message", "Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageViewModel;", "getMessage", "()Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageViewModel;", "myNameLabel", "Ljavax/swing/JLabel;", "partsContainer", "tailIcon", "Ljavax/swing/Icon;", "Lorg/jetbrains/annotations/NotNull;", "updateAlarm", "Lcom/intellij/util/SingleAlarm;", "addPart", "", "part", "Lcom/intellij/ml/llm/core/chat/parts/MessagePart;", "content", "", "type", "Lcom/intellij/ml/llm/core/chat/parts/MessagePart$Type;", "addToLastPart", "createBorder", "Lcom/intellij/util/ui/JBEmptyBorder;", "createTitlePanel", "doWaitingState", "getData", "", "dataId", "getMaximumSize", "Ljava/awt/Dimension;", "getMinimumSize", "getPreferredSize", "layoutAll", "mergePartsAndUpdateUI", "oldParts", "", "newPart", "paintComponent", "g", "Ljava/awt/Graphics;", "removePart", "removeWaitingState", "setBackground", "bg", "Ljava/awt/Color;", "updateMessageState", "previousState", "Lcom/intellij/ml/llm/core/chat/messages/MessageState;", "newState", "getRetryAction", "Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView$ErrorStateDescriptor;", "Lcom/intellij/ml/llm/core/chat/messages/ErrorState;", "replace", "element", "replacer", "Companion", "ErrorStateAction", "ErrorStateDescriptor", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nAIAssistantChatMessageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIAssistantChatMessageView.kt\ncom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,363:1\n1#2:364\n3792#3:365\n4307#3,2:366\n1855#4,2:368\n1549#4:370\n1620#4,3:371\n1855#4,2:374\n1864#4,3:379\n29#5,3:376\n*S KotlinDebug\n*F\n+ 1 AIAssistantChatMessageView.kt\ncom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView\n*L\n187#1:365\n187#1:366,2\n188#1:368,2\n206#1:370\n206#1:371,3\n206#1:374,2\n288#1:379,3\n282#1:376,3\n*E\n"})
/*     */ public final class AIAssistantChatMessageView extends JPanel implements DataProvider {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final Project project;
/*     */   @NotNull
/*     */   private final ChatMessageAuthor author;
/*     */   @NotNull
/*     */   private final CompletableMessage completableMessage;
/*     */   
/*     */   @NotNull
/*     */   public final AIAssistantChatMessageViewModel getMessage() {
/*  52 */     return this.message;
/*     */   } @NotNull
/*     */   private final AIAssistantChatPanel parentPanel; @NotNull
/*     */   private final AIAssistantChatMessageViewModel message; @NotNull
/*     */   private final JLabel myNameLabel; @NotNull
/*     */   private final Icon tailIcon; @NotNull
/*     */   private final SingleAlarm updateAlarm; @NotNull
/*     */   private final JPanel partsContainer; @NotNull
/*     */   private final JPanel buttonsContainer; private boolean hasWaitingState; private static final int SidePadding = 25; private static final int BottomPadding = 15; public AIAssistantChatMessageView(@NotNull Project project, @NotNull ChatMessageAuthor author, @NotNull ChatSession session, @NotNull CompletableMessage completableMessage, @NotNull AIAssistantChatPanel parentPanel) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'project'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'author'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_3
/*     */     //   13: ldc 'session'
/*     */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   18: aload #4
/*     */     //   20: ldc 'completableMessage'
/*     */     //   22: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   25: aload #5
/*     */     //   27: ldc 'parentPanel'
/*     */     //   29: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   32: aload_0
/*     */     //   33: invokespecial <init> : ()V
/*     */     //   36: aload_0
/*     */     //   37: aload_1
/*     */     //   38: putfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   41: aload_0
/*     */     //   42: aload_2
/*     */     //   43: putfield author : Lcom/intellij/ml/llm/core/chat/messages/ChatMessageAuthor;
/*     */     //   46: aload_0
/*     */     //   47: aload #4
/*     */     //   49: putfield completableMessage : Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;
/*     */     //   52: aload_0
/*     */     //   53: aload #5
/*     */     //   55: putfield parentPanel : Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel;
/*     */     //   58: aload_0
/*     */     //   59: new com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageViewModel
/*     */     //   62: dup
/*     */     //   63: aload_3
/*     */     //   64: aload_0
/*     */     //   65: getfield completableMessage : Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;
/*     */     //   68: aload_0
/*     */     //   69: getfield author : Lcom/intellij/ml/llm/core/chat/messages/ChatMessageAuthor;
/*     */     //   72: invokespecial <init> : (Lcom/intellij/ml/llm/core/chat/session/ChatSession;Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;Lcom/intellij/ml/llm/core/chat/messages/ChatMessageAuthor;)V
/*     */     //   75: putfield message : Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageViewModel;
/*     */     //   78: aload_0
/*     */     //   79: new javax/swing/JLabel
/*     */     //   82: dup
/*     */     //   83: invokespecial <init> : ()V
/*     */     //   86: astore #6
/*     */     //   88: aload #6
/*     */     //   90: astore #7
/*     */     //   92: astore #9
/*     */     //   94: iconst_0
/*     */     //   95: istore #8
/*     */     //   97: aload #7
/*     */     //   99: invokestatic h4 : ()Lcom/intellij/util/ui/JBFont;
/*     */     //   102: checkcast java/awt/Font
/*     */     //   105: invokevirtual setFont : (Ljava/awt/Font;)V
/*     */     //   108: aload #7
/*     */     //   110: aload_0
/*     */     //   111: getfield message : Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageViewModel;
/*     */     //   114: invokevirtual getAuthor : ()Lcom/intellij/ml/llm/core/chat/messages/ChatMessageAuthor;
/*     */     //   117: getstatic com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */     //   120: swap
/*     */     //   121: invokevirtual ordinal : ()I
/*     */     //   124: iaload
/*     */     //   125: tableswitch default -> 172, 1 -> 148, 2 -> 160
/*     */     //   148: ldc 'name.me'
/*     */     //   150: iconst_0
/*     */     //   151: anewarray java/lang/Object
/*     */     //   154: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   157: goto -> 180
/*     */     //   160: ldc 'name.assistant'
/*     */     //   162: iconst_0
/*     */     //   163: anewarray java/lang/Object
/*     */     //   166: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   169: goto -> 180
/*     */     //   172: new kotlin/NoWhenBranchMatchedException
/*     */     //   175: dup
/*     */     //   176: invokespecial <init> : ()V
/*     */     //   179: athrow
/*     */     //   180: invokevirtual setText : (Ljava/lang/String;)V
/*     */     //   183: aload #7
/*     */     //   185: getstatic com/intellij/ml/llm/core/chat/ui/AIAssistantColors.INSTANCE : Lcom/intellij/ml/llm/core/chat/ui/AIAssistantColors;
/*     */     //   188: invokevirtual getMessageForeground : ()Ljava/awt/Color;
/*     */     //   191: invokevirtual setForeground : (Ljava/awt/Color;)V
/*     */     //   194: nop
/*     */     //   195: aload #9
/*     */     //   197: aload #6
/*     */     //   199: putfield myNameLabel : Ljavax/swing/JLabel;
/*     */     //   202: aload_0
/*     */     //   203: getstatic com/intellij/ml/llm/MLLlmIcons.MessageTail : Ljavax/swing/Icon;
/*     */     //   206: dup
/*     */     //   207: ldc 'MessageTail'
/*     */     //   209: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   212: putfield tailIcon : Ljavax/swing/Icon;
/*     */     //   215: aload_0
/*     */     //   216: new com/intellij/util/SingleAlarm
/*     */     //   219: dup
/*     */     //   220: aload_0
/*     */     //   221: <illegal opcode> run : (Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView;)Ljava/lang/Runnable;
/*     */     //   226: sipush #1000
/*     */     //   229: aconst_null
/*     */     //   230: getstatic com/intellij/util/Alarm$ThreadToUse.SWING_THREAD : Lcom/intellij/util/Alarm$ThreadToUse;
/*     */     //   233: aload_0
/*     */     //   234: checkcast java/awt/Component
/*     */     //   237: invokestatic stateForComponent : (Ljava/awt/Component;)Lcom/intellij/openapi/application/ModalityState;
/*     */     //   240: invokespecial <init> : (Ljava/lang/Runnable;ILcom/intellij/openapi/Disposable;Lcom/intellij/util/Alarm$ThreadToUse;Lcom/intellij/openapi/application/ModalityState;)V
/*     */     //   243: putfield updateAlarm : Lcom/intellij/util/SingleAlarm;
/*     */     //   246: aload_0
/*     */     //   247: new javax/swing/JPanel
/*     */     //   250: dup
/*     */     //   251: getstatic com/intellij/ui/components/panels/ListLayout.Companion : Lcom/intellij/ui/components/panels/ListLayout$Companion;
/*     */     //   254: iconst_0
/*     */     //   255: aconst_null
/*     */     //   256: aconst_null
/*     */     //   257: bipush #7
/*     */     //   259: aconst_null
/*     */     //   260: invokestatic vertical$default : (Lcom/intellij/ui/components/panels/ListLayout$Companion;ILcom/intellij/ui/components/panels/ListLayout$Alignment;Lcom/intellij/ui/components/panels/ListLayout$GrowPolicy;ILjava/lang/Object;)Lcom/intellij/ui/components/panels/ListLayout;
/*     */     //   263: checkcast java/awt/LayoutManager
/*     */     //   266: invokespecial <init> : (Ljava/awt/LayoutManager;)V
/*     */     //   269: astore #6
/*     */     //   271: aload #6
/*     */     //   273: astore #7
/*     */     //   275: astore #9
/*     */     //   277: iconst_0
/*     */     //   278: istore #8
/*     */     //   280: aload #7
/*     */     //   282: iconst_0
/*     */     //   283: invokevirtual setOpaque : (Z)V
/*     */     //   286: nop
/*     */     //   287: aload #9
/*     */     //   289: aload #6
/*     */     //   291: putfield partsContainer : Ljavax/swing/JPanel;
/*     */     //   294: aload_0
/*     */     //   295: new javax/swing/JPanel
/*     */     //   298: dup
/*     */     //   299: new com/intellij/util/ui/WrapLayout
/*     */     //   302: dup
/*     */     //   303: iconst_0
/*     */     //   304: invokespecial <init> : (I)V
/*     */     //   307: checkcast java/awt/LayoutManager
/*     */     //   310: invokespecial <init> : (Ljava/awt/LayoutManager;)V
/*     */     //   313: astore #6
/*     */     //   315: aload #6
/*     */     //   317: astore #7
/*     */     //   319: astore #9
/*     */     //   321: iconst_0
/*     */     //   322: istore #8
/*     */     //   324: aload #7
/*     */     //   326: iconst_0
/*     */     //   327: invokevirtual setOpaque : (Z)V
/*     */     //   330: aload #7
/*     */     //   332: iconst_0
/*     */     //   333: invokevirtual setVisible : (Z)V
/*     */     //   336: nop
/*     */     //   337: aload #9
/*     */     //   339: aload #6
/*     */     //   341: putfield buttonsContainer : Ljavax/swing/JPanel;
/*     */     //   344: nop
/*     */     //   345: aload_0
/*     */     //   346: getstatic com/intellij/ml/llm/core/chat/ui/AIAssistantColors.INSTANCE : Lcom/intellij/ml/llm/core/chat/ui/AIAssistantColors;
/*     */     //   349: aload_0
/*     */     //   350: getfield author : Lcom/intellij/ml/llm/core/chat/messages/ChatMessageAuthor;
/*     */     //   353: invokevirtual getMessageBackground : (Lcom/intellij/ml/llm/core/chat/messages/ChatMessageAuthor;)Ljava/awt/Color;
/*     */     //   356: invokevirtual setBackground : (Ljava/awt/Color;)V
/*     */     //   359: aload_0
/*     */     //   360: aload_0
/*     */     //   361: invokevirtual getBackground : ()Ljava/awt/Color;
/*     */     //   364: ifnonnull -> 371
/*     */     //   367: iconst_1
/*     */     //   368: goto -> 372
/*     */     //   371: iconst_0
/*     */     //   372: invokevirtual setOpaque : (Z)V
/*     */     //   375: new kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   378: dup
/*     */     //   379: invokespecial <init> : ()V
/*     */     //   382: astore #6
/*     */     //   384: aload #6
/*     */     //   386: aload_0
/*     */     //   387: getfield completableMessage : Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;
/*     */     //   390: invokeinterface getState : ()Lcom/intellij/ml/llm/core/chat/messages/MessageState;
/*     */     //   395: putfield element : Ljava/lang/Object;
/*     */     //   398: aload_0
/*     */     //   399: getfield completableMessage : Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;
/*     */     //   402: new com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView$1
/*     */     //   405: dup
/*     */     //   406: aload_0
/*     */     //   407: aload #6
/*     */     //   409: invokespecial <init> : (Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView;Lkotlin/jvm/internal/Ref$ObjectRef;)V
/*     */     //   412: checkcast com/intellij/ml/llm/core/chat/messages/CompletableMessageStateListener
/*     */     //   415: invokeinterface addStateListener : (Lcom/intellij/ml/llm/core/chat/messages/CompletableMessageStateListener;)V
/*     */     //   420: aload_0
/*     */     //   421: getstatic com/intellij/ui/components/panels/ListLayout.Companion : Lcom/intellij/ui/components/panels/ListLayout$Companion;
/*     */     //   424: iconst_0
/*     */     //   425: aconst_null
/*     */     //   426: getstatic com/intellij/ui/components/panels/ListLayout$GrowPolicy.GROW : Lcom/intellij/ui/components/panels/ListLayout$GrowPolicy;
/*     */     //   429: iconst_3
/*     */     //   430: aconst_null
/*     */     //   431: invokestatic vertical$default : (Lcom/intellij/ui/components/panels/ListLayout$Companion;ILcom/intellij/ui/components/panels/ListLayout$Alignment;Lcom/intellij/ui/components/panels/ListLayout$GrowPolicy;ILjava/lang/Object;)Lcom/intellij/ui/components/panels/ListLayout;
/*     */     //   434: checkcast java/awt/LayoutManager
/*     */     //   437: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
/*     */     //   440: aload_0
/*     */     //   441: aload_0
/*     */     //   442: invokespecial createBorder : ()Lcom/intellij/util/ui/JBEmptyBorder;
/*     */     //   445: checkcast javax/swing/border/Border
/*     */     //   448: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
/*     */     //   451: aload_0
/*     */     //   452: aload_0
/*     */     //   453: invokespecial createTitlePanel : ()Ljavax/swing/JPanel;
/*     */     //   456: checkcast java/awt/Component
/*     */     //   459: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
/*     */     //   462: pop
/*     */     //   463: aload_0
/*     */     //   464: getfield completableMessage : Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;
/*     */     //   467: invokeinterface getState : ()Lcom/intellij/ml/llm/core/chat/messages/MessageState;
/*     */     //   472: instanceof com/intellij/ml/llm/core/chat/messages/ThinkingState
/*     */     //   475: ifeq -> 482
/*     */     //   478: aload_0
/*     */     //   479: invokespecial doWaitingState : ()V
/*     */     //   482: aload_0
/*     */     //   483: aload_0
/*     */     //   484: getfield partsContainer : Ljavax/swing/JPanel;
/*     */     //   487: checkcast java/awt/Component
/*     */     //   490: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
/*     */     //   493: pop
/*     */     //   494: aload_0
/*     */     //   495: aload_0
/*     */     //   496: getfield buttonsContainer : Ljavax/swing/JPanel;
/*     */     //   499: checkcast java/awt/Component
/*     */     //   502: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
/*     */     //   505: pop
/*     */     //   506: aload_0
/*     */     //   507: getfield completableMessage : Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;
/*     */     //   510: new com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView$2
/*     */     //   513: dup
/*     */     //   514: aload_0
/*     */     //   515: invokespecial <init> : (Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView;)V
/*     */     //   518: checkcast com/intellij/ml/llm/core/chat/messages/CompletableMessageButtonListener
/*     */     //   521: invokeinterface addButtonListener : (Lcom/intellij/ml/llm/core/chat/messages/CompletableMessageButtonListener;)V
/*     */     //   526: nop
/*     */     //   527: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #47	-> 32
/*     */     //   #45	-> 36
/*     */     //   #46	-> 46
/*     */     //   #47	-> 52
/*     */     //   #52	-> 58
/*     */     //   #54	-> 78
/*     */     //   #55	-> 97
/*     */     //   #56	-> 108
/*     */     //   #57	-> 148
/*     */     //   #58	-> 160
/*     */     //   #56	-> 180
/*     */     //   #60	-> 183
/*     */     //   #61	-> 194
/*     */     //   #54	-> 197
/*     */     //   #54	-> 199
/*     */     //   #63	-> 202
/*     */     //   #65	-> 215
/*     */     //   #67	-> 246
/*     */     //   #68	-> 280
/*     */     //   #69	-> 286
/*     */     //   #67	-> 289
/*     */     //   #67	-> 291
/*     */     //   #71	-> 294
/*     */     //   #72	-> 324
/*     */     //   #73	-> 330
/*     */     //   #74	-> 336
/*     */     //   #71	-> 339
/*     */     //   #71	-> 341
/*     */     //   #76	-> 344
/*     */     //   #77	-> 345
/*     */     //   #78	-> 359
/*     */     //   #79	-> 375
/*     */     //   #80	-> 398
/*     */     //   #89	-> 420
/*     */     //   #90	-> 440
/*     */     //   #92	-> 451
/*     */     //   #94	-> 463
/*     */     //   #95	-> 478
/*     */     //   #98	-> 482
/*     */     //   #99	-> 494
/*     */     //   #101	-> 506
/*     */     //   #120	-> 526
/*     */     //   #45	-> 527
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	98	8	$i$a$-apply-AIAssistantChatMessageView$myNameLabel$1	I
/*     */     //   94	101	7	$this$myNameLabel_u24lambda_u240	Ljavax/swing/JLabel;
/*     */     //   280	7	8	$i$a$-apply-AIAssistantChatMessageView$partsContainer$1	I
/*     */     //   277	10	7	$this$partsContainer_u24lambda_u242	Ljavax/swing/JPanel;
/*     */     //   324	13	8	$i$a$-apply-AIAssistantChatMessageView$buttonsContainer$1	I
/*     */     //   321	16	7	$this$buttonsContainer_u24lambda_u243	Ljavax/swing/JPanel;
/*     */     //   384	142	6	previousState	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   0	528	0	this	Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView;
/*     */     //   0	528	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   0	528	2	author	Lcom/intellij/ml/llm/core/chat/messages/ChatMessageAuthor;
/*     */     //   0	528	3	session	Lcom/intellij/ml/llm/core/chat/session/ChatSession;
/*     */     //   0	528	4	completableMessage	Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;
/*     */     //   0	528	5	parentPanel	Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel;
/*     */   } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\016\020\003\032\0020\004XT¢\006\002\n\000R\016\020\005\032\0020\004XT¢\006\002\n\000¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView$Companion;", "", "()V", "BottomPadding", "", "SidePadding", "intellij.ml.llm"})
/*     */   public static final class Companion {
/*     */     private Companion() {} } private static final void updateAlarm$lambda$1(AIAssistantChatMessageView this$0) {
/*  65 */     Intrinsics.checkNotNullParameter(this$0, "this$0"); this$0.layoutAll();
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
/*     */   private final JPanel createTitlePanel() {
/* 123 */     BorderLayoutPanel borderLayoutPanel1 = new BorderLayoutPanel(), $this$createTitlePanel_u24lambda_u245 = borderLayoutPanel1; int $i$a$-apply-AIAssistantChatMessageView$createTitlePanel$1 = 0;
/* 124 */     $this$createTitlePanel_u24lambda_u245.setOpaque(false);
/* 125 */     $this$createTitlePanel_u24lambda_u245.addToCenter(this.myNameLabel);
/*     */     
/* 127 */     ActionGroup group = ActionUtil.getActionGroup("AIAssistant.ToolWindow.Message.Toolbar." + this.author);
/* 128 */     if (group != null) {
/* 129 */       ActionToolbarImpl actionToolbarImpl1 = new ActionToolbarImpl(getClass().getName(), group, true), $this$createTitlePanel_u24lambda_u245_u24lambda_u244 = actionToolbarImpl1; int $i$a$-apply-AIAssistantChatMessageView$createTitlePanel$1$toolbar$1 = 0;
/* 130 */       $this$createTitlePanel_u24lambda_u245_u24lambda_u244.setLayoutPolicy(0);
/* 131 */       $this$createTitlePanel_u24lambda_u245_u24lambda_u244.getComponent().setOpaque(false);
/* 132 */       $this$createTitlePanel_u24lambda_u245_u24lambda_u244.getComponent().setBorder((Border)JBUI.Borders.empty());
/* 133 */       $this$createTitlePanel_u24lambda_u245_u24lambda_u244.setTargetComponent(this);
/*     */       ActionToolbarImpl toolbar = actionToolbarImpl1;
/* 135 */       $this$createTitlePanel_u24lambda_u245.addToRight(toolbar.getComponent());
/*     */     } 
/* 137 */     $this$createTitlePanel_u24lambda_u245.setOpaque(false);
/*     */     return (JPanel)borderLayoutPanel1;
/*     */   }
/*     */   @NotNull
/*     */   public Dimension getMinimumSize() {
/* 142 */     Dimension orig = super.getMinimumSize();
/* 143 */     return new Dimension(Math.min(orig.width, getParent().getWidth()), orig.height);
/*     */   }
/*     */   @NotNull
/*     */   public Dimension getMaximumSize() {
/* 147 */     Dimension orig = super.getMaximumSize();
/* 148 */     return new Dimension(getParent().getWidth(), orig.height);
/*     */   }
/*     */   @NotNull
/*     */   public Dimension getPreferredSize() {
/* 152 */     Dimension orig = super.getPreferredSize();
/* 153 */     return new Dimension(Math.min(orig.width, getParent().getWidth()), orig.height);
/*     */   }
/*     */   private final JBEmptyBorder createBorder() {
/* 156 */     switch (WhenMappings.$EnumSwitchMapping$0[this.author.ordinal()]) { case 2: 
/*     */       case 1:
/* 158 */        }  throw new NoWhenBranchMatchedException();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private final void doWaitingState() {
/* 164 */     if (this.hasWaitingState)
/* 165 */       return;  JLabel jLabel1 = new JLabel("█ Generating Answer..."), jLabel2 = jLabel1; JPanel jPanel = this.partsContainer; int $i$a$-apply-AIAssistantChatMessageView$doWaitingState$1 = 0;
/* 166 */     jLabel2.setForeground(UIUtil.getLabelDisabledForeground());
/* 167 */     jLabel2.setName("WaitingLabel");
/* 168 */     jPanel.add(jLabel1);
/* 169 */     this.hasWaitingState = true;
/* 170 */     this.partsContainer.revalidate();
/* 171 */     this.partsContainer.repaint();
/*     */   }
/*     */   
/*     */   private final void removeWaitingState() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield hasWaitingState : Z
/*     */     //   4: ifne -> 8
/*     */     //   7: return
/*     */     //   8: aload_0
/*     */     //   9: getfield partsContainer : Ljavax/swing/JPanel;
/*     */     //   12: invokevirtual getComponents : ()[Ljava/awt/Component;
/*     */     //   15: dup
/*     */     //   16: ldc_w 'partsContainer.components'
/*     */     //   19: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   22: checkcast [Ljava/lang/Object;
/*     */     //   25: astore_1
/*     */     //   26: iconst_0
/*     */     //   27: istore_2
/*     */     //   28: aload_1
/*     */     //   29: arraylength
/*     */     //   30: istore_3
/*     */     //   31: iload_2
/*     */     //   32: iload_3
/*     */     //   33: if_icmpge -> 76
/*     */     //   36: aload_1
/*     */     //   37: iload_2
/*     */     //   38: aaload
/*     */     //   39: astore #4
/*     */     //   41: aload #4
/*     */     //   43: checkcast java/awt/Component
/*     */     //   46: astore #5
/*     */     //   48: iconst_0
/*     */     //   49: istore #6
/*     */     //   51: aload #5
/*     */     //   53: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   56: ldc_w 'WaitingLabel'
/*     */     //   59: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   62: ifeq -> 70
/*     */     //   65: aload #4
/*     */     //   67: goto -> 77
/*     */     //   70: iinc #2, 1
/*     */     //   73: goto -> 31
/*     */     //   76: aconst_null
/*     */     //   77: checkcast java/awt/Component
/*     */     //   80: dup
/*     */     //   81: ifnull -> 98
/*     */     //   84: astore_1
/*     */     //   85: iconst_0
/*     */     //   86: istore_2
/*     */     //   87: aload_0
/*     */     //   88: getfield partsContainer : Ljavax/swing/JPanel;
/*     */     //   91: aload_1
/*     */     //   92: invokevirtual remove : (Ljava/awt/Component;)V
/*     */     //   95: goto -> 100
/*     */     //   98: pop
/*     */     //   99: nop
/*     */     //   100: aload_0
/*     */     //   101: iconst_0
/*     */     //   102: putfield hasWaitingState : Z
/*     */     //   105: aload_0
/*     */     //   106: getfield partsContainer : Ljavax/swing/JPanel;
/*     */     //   109: invokevirtual revalidate : ()V
/*     */     //   112: aload_0
/*     */     //   113: getfield partsContainer : Ljavax/swing/JPanel;
/*     */     //   116: invokevirtual repaint : ()V
/*     */     //   119: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #175	-> 0
/*     */     //   #176	-> 8
/*     */     //   #364	-> 48
/*     */     //   #176	-> 51
/*     */     //   #176	-> 62
/*     */     //   #176	-> 77
/*     */     //   #364	-> 85
/*     */     //   #176	-> 87
/*     */     //   #176	-> 95
/*     */     //   #176	-> 98
/*     */     //   #177	-> 100
/*     */     //   #178	-> 105
/*     */     //   #179	-> 112
/*     */     //   #180	-> 119
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   51	11	6	$i$a$-find-AIAssistantChatMessageView$removeWaitingState$1	I
/*     */     //   48	14	5	it	Ljava/awt/Component;
/*     */     //   87	8	2	$i$a$-let-AIAssistantChatMessageView$removeWaitingState$2	I
/*     */     //   85	10	1	it	Ljava/awt/Component;
/*     */     //   0	120	0	this	Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView;
/*     */   }
/*     */   
/*     */   private final void updateMessageState(MessageState previousState, MessageState newState) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: getstatic com/intellij/ml/llm/core/chat/messages/ThinkingState.INSTANCE : Lcom/intellij/ml/llm/core/chat/messages/ThinkingState;
/*     */     //   4: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   7: ifeq -> 21
/*     */     //   10: aload_2
/*     */     //   11: getstatic com/intellij/ml/llm/core/chat/messages/CancelledState.INSTANCE : Lcom/intellij/ml/llm/core/chat/messages/CancelledState;
/*     */     //   14: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   17: ifeq -> 21
/*     */     //   20: return
/*     */     //   21: aload_2
/*     */     //   22: astore_3
/*     */     //   23: aload_3
/*     */     //   24: instanceof com/intellij/ml/llm/core/chat/messages/ErrorState
/*     */     //   27: ifeq -> 399
/*     */     //   30: aload_0
/*     */     //   31: getfield partsContainer : Ljavax/swing/JPanel;
/*     */     //   34: invokevirtual getComponents : ()[Ljava/awt/Component;
/*     */     //   37: dup
/*     */     //   38: ldc_w 'partsContainer.components'
/*     */     //   41: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   44: checkcast [Ljava/lang/Object;
/*     */     //   47: astore #4
/*     */     //   49: iconst_0
/*     */     //   50: istore #5
/*     */     //   52: aload #4
/*     */     //   54: astore #6
/*     */     //   56: new java/util/ArrayList
/*     */     //   59: dup
/*     */     //   60: invokespecial <init> : ()V
/*     */     //   63: checkcast java/util/Collection
/*     */     //   66: astore #7
/*     */     //   68: iconst_0
/*     */     //   69: istore #8
/*     */     //   71: iconst_0
/*     */     //   72: istore #9
/*     */     //   74: aload #6
/*     */     //   76: arraylength
/*     */     //   77: istore #10
/*     */     //   79: iload #9
/*     */     //   81: iload #10
/*     */     //   83: if_icmpge -> 188
/*     */     //   86: aload #6
/*     */     //   88: iload #9
/*     */     //   90: aaload
/*     */     //   91: astore #11
/*     */     //   93: aload #11
/*     */     //   95: checkcast java/awt/Component
/*     */     //   98: astore #12
/*     */     //   100: iconst_0
/*     */     //   101: istore #13
/*     */     //   103: aload #12
/*     */     //   105: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   108: astore #14
/*     */     //   110: aload #14
/*     */     //   112: dup
/*     */     //   113: ifnull -> 145
/*     */     //   116: ldc_w 'name'
/*     */     //   119: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   122: aload #14
/*     */     //   124: ldc_w 'MessagePart-'
/*     */     //   127: iconst_0
/*     */     //   128: iconst_2
/*     */     //   129: aconst_null
/*     */     //   130: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
/*     */     //   133: iconst_1
/*     */     //   134: if_icmpne -> 141
/*     */     //   137: iconst_1
/*     */     //   138: goto -> 147
/*     */     //   141: iconst_0
/*     */     //   142: goto -> 147
/*     */     //   145: pop
/*     */     //   146: iconst_0
/*     */     //   147: ifne -> 164
/*     */     //   150: aload #12
/*     */     //   152: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   155: ldc_w 'WaitingLabel'
/*     */     //   158: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   161: ifeq -> 168
/*     */     //   164: iconst_1
/*     */     //   165: goto -> 169
/*     */     //   168: iconst_0
/*     */     //   169: ifeq -> 182
/*     */     //   172: aload #7
/*     */     //   174: aload #11
/*     */     //   176: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   181: pop
/*     */     //   182: iinc #9, 1
/*     */     //   185: goto -> 79
/*     */     //   188: aload #7
/*     */     //   190: checkcast java/util/List
/*     */     //   193: nop
/*     */     //   194: checkcast java/lang/Iterable
/*     */     //   197: astore #4
/*     */     //   199: nop
/*     */     //   200: iconst_0
/*     */     //   201: istore #5
/*     */     //   203: aload #4
/*     */     //   205: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   210: astore #6
/*     */     //   212: aload #6
/*     */     //   214: invokeinterface hasNext : ()Z
/*     */     //   219: ifeq -> 254
/*     */     //   222: aload #6
/*     */     //   224: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   229: astore #7
/*     */     //   231: aload #7
/*     */     //   233: checkcast java/awt/Component
/*     */     //   236: astore #8
/*     */     //   238: iconst_0
/*     */     //   239: istore #9
/*     */     //   241: aload_0
/*     */     //   242: getfield partsContainer : Ljavax/swing/JPanel;
/*     */     //   245: aload #8
/*     */     //   247: invokevirtual remove : (Ljava/awt/Component;)V
/*     */     //   250: nop
/*     */     //   251: goto -> 212
/*     */     //   254: nop
/*     */     //   255: aload_0
/*     */     //   256: aload_2
/*     */     //   257: checkcast com/intellij/ml/llm/core/chat/messages/ErrorState
/*     */     //   260: aload_0
/*     */     //   261: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   264: invokespecial getRetryAction : (Lcom/intellij/ml/llm/core/chat/messages/ErrorState;Lcom/intellij/openapi/project/Project;)Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView$ErrorStateDescriptor;
/*     */     //   267: astore #4
/*     */     //   269: aconst_null
/*     */     //   270: astore #5
/*     */     //   272: aload #4
/*     */     //   274: instanceof com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView$ErrorStateDescriptor$Actionable
/*     */     //   277: ifeq -> 348
/*     */     //   280: aload #4
/*     */     //   282: checkcast com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView$ErrorStateDescriptor$Actionable
/*     */     //   285: invokevirtual getAction : ()Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView$ErrorStateAction;
/*     */     //   288: instanceof com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView$ErrorStateAction$DefaultRetry
/*     */     //   291: ifeq -> 308
/*     */     //   294: new com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView$updateMessageState$action$1
/*     */     //   297: dup
/*     */     //   298: aload_0
/*     */     //   299: invokespecial <init> : (Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView;)V
/*     */     //   302: checkcast kotlin/jvm/functions/Function0
/*     */     //   305: goto -> 320
/*     */     //   308: new com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView$updateMessageState$action$2
/*     */     //   311: dup
/*     */     //   312: aload #4
/*     */     //   314: invokespecial <init> : (Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView$ErrorStateDescriptor;)V
/*     */     //   317: checkcast kotlin/jvm/functions/Function0
/*     */     //   320: astore #6
/*     */     //   322: getstatic com/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputNotification.INSTANCE : Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputNotification;
/*     */     //   325: aload #4
/*     */     //   327: invokevirtual getText : ()Ljava/lang/String;
/*     */     //   330: aload #4
/*     */     //   332: checkcast com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView$ErrorStateDescriptor$Actionable
/*     */     //   335: invokevirtual getLinkText : ()Ljava/lang/String;
/*     */     //   338: aload #6
/*     */     //   340: invokevirtual error : (Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljavax/swing/JComponent;
/*     */     //   343: astore #5
/*     */     //   345: goto -> 363
/*     */     //   348: getstatic com/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputNotification.INSTANCE : Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputNotification;
/*     */     //   351: aload #4
/*     */     //   353: invokevirtual getText : ()Ljava/lang/String;
/*     */     //   356: aconst_null
/*     */     //   357: aconst_null
/*     */     //   358: invokevirtual error : (Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljavax/swing/JComponent;
/*     */     //   361: astore #5
/*     */     //   363: aload #5
/*     */     //   365: ldc_w 'ErrorLabel'
/*     */     //   368: invokevirtual setName : (Ljava/lang/String;)V
/*     */     //   371: aload #5
/*     */     //   373: iconst_5
/*     */     //   374: invokestatic emptyTop : (I)Lcom/intellij/util/ui/JBEmptyBorder;
/*     */     //   377: checkcast javax/swing/border/Border
/*     */     //   380: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
/*     */     //   383: aload_0
/*     */     //   384: getfield partsContainer : Ljavax/swing/JPanel;
/*     */     //   387: aload #5
/*     */     //   389: checkcast java/awt/Component
/*     */     //   392: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
/*     */     //   395: pop
/*     */     //   396: goto -> 697
/*     */     //   399: aload_3
/*     */     //   400: instanceof com/intellij/ml/llm/core/chat/messages/ThinkingState
/*     */     //   403: ifeq -> 410
/*     */     //   406: iconst_1
/*     */     //   407: goto -> 414
/*     */     //   410: aload_3
/*     */     //   411: instanceof com/intellij/ml/llm/core/chat/messages/CompletedState
/*     */     //   414: ifeq -> 697
/*     */     //   417: aload_0
/*     */     //   418: invokespecial removeWaitingState : ()V
/*     */     //   421: aload_0
/*     */     //   422: getfield partsContainer : Ljavax/swing/JPanel;
/*     */     //   425: invokevirtual getComponents : ()[Ljava/awt/Component;
/*     */     //   428: dup
/*     */     //   429: ldc_w 'partsContainer.components'
/*     */     //   432: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   435: checkcast [Ljava/lang/Object;
/*     */     //   438: astore #6
/*     */     //   440: iconst_0
/*     */     //   441: istore #7
/*     */     //   443: aload #6
/*     */     //   445: arraylength
/*     */     //   446: istore #8
/*     */     //   448: iload #7
/*     */     //   450: iload #8
/*     */     //   452: if_icmpge -> 497
/*     */     //   455: aload #6
/*     */     //   457: iload #7
/*     */     //   459: aaload
/*     */     //   460: astore #9
/*     */     //   462: aload #9
/*     */     //   464: checkcast java/awt/Component
/*     */     //   467: astore #10
/*     */     //   469: iconst_0
/*     */     //   470: istore #11
/*     */     //   472: aload #10
/*     */     //   474: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   477: ldc_w 'ErrorLabel'
/*     */     //   480: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   483: ifeq -> 491
/*     */     //   486: aload #9
/*     */     //   488: goto -> 498
/*     */     //   491: iinc #7, 1
/*     */     //   494: goto -> 448
/*     */     //   497: aconst_null
/*     */     //   498: checkcast java/awt/Component
/*     */     //   501: dup
/*     */     //   502: ifnull -> 522
/*     */     //   505: astore #6
/*     */     //   507: iconst_0
/*     */     //   508: istore #7
/*     */     //   510: aload_0
/*     */     //   511: getfield partsContainer : Ljavax/swing/JPanel;
/*     */     //   514: aload #6
/*     */     //   516: invokevirtual remove : (Ljava/awt/Component;)V
/*     */     //   519: goto -> 524
/*     */     //   522: pop
/*     */     //   523: nop
/*     */     //   524: aload_0
/*     */     //   525: getfield message : Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageViewModel;
/*     */     //   528: invokevirtual getAllParts : ()Ljava/util/List;
/*     */     //   531: checkcast java/lang/Iterable
/*     */     //   534: astore #4
/*     */     //   536: iconst_0
/*     */     //   537: istore #5
/*     */     //   539: aload #4
/*     */     //   541: astore #6
/*     */     //   543: new java/util/ArrayList
/*     */     //   546: dup
/*     */     //   547: aload #4
/*     */     //   549: bipush #10
/*     */     //   551: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   554: invokespecial <init> : (I)V
/*     */     //   557: checkcast java/util/Collection
/*     */     //   560: astore #7
/*     */     //   562: iconst_0
/*     */     //   563: istore #8
/*     */     //   565: aload #6
/*     */     //   567: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   572: astore #9
/*     */     //   574: aload #9
/*     */     //   576: invokeinterface hasNext : ()Z
/*     */     //   581: ifeq -> 626
/*     */     //   584: aload #9
/*     */     //   586: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   591: astore #10
/*     */     //   593: aload #7
/*     */     //   595: aload #10
/*     */     //   597: checkcast com/intellij/ml/llm/core/chat/parts/MessagePart
/*     */     //   600: astore #11
/*     */     //   602: astore #15
/*     */     //   604: iconst_0
/*     */     //   605: istore #12
/*     */     //   607: aload #11
/*     */     //   609: invokeinterface getComponent : ()Ljavax/swing/JComponent;
/*     */     //   614: aload #15
/*     */     //   616: swap
/*     */     //   617: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   622: pop
/*     */     //   623: goto -> 574
/*     */     //   626: aload #7
/*     */     //   628: checkcast java/util/List
/*     */     //   631: nop
/*     */     //   632: checkcast java/lang/Iterable
/*     */     //   635: astore #4
/*     */     //   637: nop
/*     */     //   638: iconst_0
/*     */     //   639: istore #5
/*     */     //   641: aload #4
/*     */     //   643: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   648: astore #6
/*     */     //   650: aload #6
/*     */     //   652: invokeinterface hasNext : ()Z
/*     */     //   657: ifeq -> 696
/*     */     //   660: aload #6
/*     */     //   662: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   667: astore #7
/*     */     //   669: aload #7
/*     */     //   671: checkcast javax/swing/JComponent
/*     */     //   674: astore #8
/*     */     //   676: iconst_0
/*     */     //   677: istore #9
/*     */     //   679: aload_0
/*     */     //   680: getfield partsContainer : Ljavax/swing/JPanel;
/*     */     //   683: aload #8
/*     */     //   685: checkcast java/awt/Component
/*     */     //   688: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
/*     */     //   691: pop
/*     */     //   692: nop
/*     */     //   693: goto -> 650
/*     */     //   696: nop
/*     */     //   697: aload_0
/*     */     //   698: getfield partsContainer : Ljavax/swing/JPanel;
/*     */     //   701: invokevirtual revalidate : ()V
/*     */     //   704: aload_0
/*     */     //   705: getfield partsContainer : Ljavax/swing/JPanel;
/*     */     //   708: invokevirtual repaint : ()V
/*     */     //   711: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #183	-> 0
/*     */     //   #185	-> 21
/*     */     //   #186	-> 23
/*     */     //   #187	-> 30
/*     */     //   #365	-> 52
/*     */     //   #366	-> 71
/*     */     //   #187	-> 103
/*     */     //   #366	-> 169
/*     */     //   #367	-> 188
/*     */     //   #365	-> 193
/*     */     //   #188	-> 199
/*     */     //   #368	-> 203
/*     */     //   #188	-> 241
/*     */     //   #368	-> 250
/*     */     //   #369	-> 254
/*     */     //   #190	-> 255
/*     */     //   #192	-> 272
/*     */     //   #193	-> 280
/*     */     //   #194	-> 322
/*     */     //   #197	-> 348
/*     */     //   #199	-> 363
/*     */     //   #200	-> 371
/*     */     //   #201	-> 383
/*     */     //   #203	-> 399
/*     */     //   #204	-> 417
/*     */     //   #205	-> 421
/*     */     //   #364	-> 469
/*     */     //   #205	-> 472
/*     */     //   #205	-> 483
/*     */     //   #205	-> 498
/*     */     //   #364	-> 507
/*     */     //   #205	-> 510
/*     */     //   #205	-> 519
/*     */     //   #205	-> 522
/*     */     //   #206	-> 524
/*     */     //   #370	-> 539
/*     */     //   #371	-> 565
/*     */     //   #372	-> 593
/*     */     //   #206	-> 607
/*     */     //   #372	-> 617
/*     */     //   #373	-> 626
/*     */     //   #370	-> 631
/*     */     //   #206	-> 637
/*     */     //   #374	-> 641
/*     */     //   #206	-> 679
/*     */     //   #374	-> 692
/*     */     //   #375	-> 696
/*     */     //   #209	-> 697
/*     */     //   #210	-> 704
/*     */     //   #211	-> 711
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   103	66	13	$i$a$-filter-AIAssistantChatMessageView$updateMessageState$1	I
/*     */     //   100	69	12	it	Ljava/awt/Component;
/*     */     //   93	89	11	element$iv$iv	Ljava/lang/Object;
/*     */     //   71	119	8	$i$f$filterTo	I
/*     */     //   68	122	6	$this$filterTo$iv$iv	[Ljava/lang/Object;
/*     */     //   68	122	7	destination$iv$iv	Ljava/util/Collection;
/*     */     //   52	142	5	$i$f$filter	I
/*     */     //   49	145	4	$this$filter$iv	[Ljava/lang/Object;
/*     */     //   241	9	9	$i$a$-forEach-AIAssistantChatMessageView$updateMessageState$2	I
/*     */     //   238	12	8	it	Ljava/awt/Component;
/*     */     //   231	20	7	element$iv	Ljava/lang/Object;
/*     */     //   203	52	5	$i$f$forEach	I
/*     */     //   200	55	4	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   322	23	6	action	Lkotlin/jvm/functions/Function0;
/*     */     //   269	127	4	descr	Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView$ErrorStateDescriptor;
/*     */     //   272	124	5	comp	Ljavax/swing/JComponent;
/*     */     //   472	11	11	$i$a$-find-AIAssistantChatMessageView$updateMessageState$3	I
/*     */     //   469	14	10	it	Ljava/awt/Component;
/*     */     //   510	9	7	$i$a$-let-AIAssistantChatMessageView$updateMessageState$4	I
/*     */     //   507	12	6	it	Ljava/awt/Component;
/*     */     //   607	7	12	$i$a$-map-AIAssistantChatMessageView$updateMessageState$5	I
/*     */     //   604	10	11	it	Lcom/intellij/ml/llm/core/chat/parts/MessagePart;
/*     */     //   593	30	10	item$iv$iv	Ljava/lang/Object;
/*     */     //   565	63	8	$i$f$mapTo	I
/*     */     //   562	66	6	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   562	66	7	destination$iv$iv	Ljava/util/Collection;
/*     */     //   539	93	5	$i$f$map	I
/*     */     //   536	96	4	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   679	13	9	$i$a$-forEach-AIAssistantChatMessageView$updateMessageState$6	I
/*     */     //   676	16	8	it	Ljavax/swing/JComponent;
/*     */     //   669	24	7	element$iv	Ljava/lang/Object;
/*     */     //   641	56	5	$i$f$forEach	I
/*     */     //   638	59	4	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   0	712	0	this	Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView;
/*     */     //   0	712	1	previousState	Lcom/intellij/ml/llm/core/chat/messages/MessageState;
/*     */     //   0	712	2	newState	Lcom/intellij/ml/llm/core/chat/messages/MessageState;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*     */   static final class AIAssistantChatMessageView$updateMessageState$action$1
/*     */     extends Lambda
/*     */     implements Function0<Unit>
/*     */   {
/*     */     AIAssistantChatMessageView$updateMessageState$action$1() {
/*     */       super(0);
/*     */     }
/*     */     
/*     */     public final void invoke()
/*     */     {
/* 193 */       AIAssistantChatMessageView.this.parentPanel.recoverFromError(AIAssistantChatMessageView.this.getMessage()); } } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"}) static final class AIAssistantChatMessageView$updateMessageState$action$2 extends Lambda implements Function0<Unit> { AIAssistantChatMessageView$updateMessageState$action$2(AIAssistantChatMessageView.ErrorStateDescriptor $descr) { super(0); } public final void invoke() { ((AIAssistantChatMessageView.ErrorStateDescriptor.Actionable)this.$descr).getAction().doAction(); }
/*     */      }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBackground(@Nullable Color bg) {
/* 214 */     if (this.author != null) {
/* 215 */       super.setBackground(AIAssistantColors.INSTANCE.getMessageBackground(this.author));
/*     */     }
/*     */   }
/*     */   
/*     */   protected void paintComponent(@NotNull Graphics g) {
/* 220 */     Intrinsics.checkNotNullParameter(g, "g"); super.paintComponent(g);
/* 221 */     if (!(g instanceof Graphics2D))
/* 222 */       return;  if (getBackground() != null && this.author == ChatMessageAuthor.User) {
/* 223 */       ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
/*     */       
/* 225 */       Color c = ((Graphics2D)g).getColor();
/* 226 */       ((Graphics2D)g).setColor(getBackground());
/*     */       
/* 228 */       int radius = 10;
/* 229 */       int x = 25;
/* 230 */       int y = 0;
/* 231 */       int rectWidth = getWidth() - 1 - 25;
/* 232 */       int rectHeight = getHeight() - 1 - this.tailIcon.getIconHeight() - 15;
/* 233 */       g.fillRoundRect(x, y, rectWidth, rectHeight, radius * 2, radius * 2);
/* 234 */       g.fillRect(rectWidth - radius + 25, rectHeight - radius, radius, radius);
/*     */ 
/*     */       
/* 237 */       Intrinsics.checkNotNullExpressionValue(getBackground(), "background"); IconUtil.colorize$default((Graphics2D)g, this.tailIcon, getBackground(), false, 8, null)
/* 238 */         .paintIcon(this, g, rectWidth - this.tailIcon.getIconWidth() + 25, rectHeight - 1);
/*     */       
/* 240 */       ((Graphics2D)g).setColor(c);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public final void addPart(@NotNull String content, @NotNull MessagePart.Type type) {
/* 246 */     Intrinsics.checkNotNullParameter(content, "content"); Intrinsics.checkNotNullParameter(type, "type"); MessagePart part = AIAssistantUIUtil.INSTANCE.createMessagePart(this.project, type, content, this.completableMessage, this.parentPanel);
/* 247 */     addPart(part);
/*     */   }
/*     */   
/*     */   private final void addPart(MessagePart part) {
/* 251 */     part.initialize();
/*     */     
/* 253 */     part.getComponent().setForeground(AIAssistantColors.INSTANCE.getMessageForeground());
/* 254 */     part.getComponent().setName("MessagePart-" + UUID.randomUUID());
/*     */     
/* 256 */     this.message.addPart(part);
/* 257 */     this.partsContainer.add(part.getComponent());
/* 258 */     this.partsContainer.revalidate();
/*     */   }
/*     */   
/*     */   private final void removePart(MessagePart part) {
/* 262 */     this.message.removePart(part);
/* 263 */     this.partsContainer.remove(part.getComponent());
/* 264 */     this.partsContainer.revalidate();
/*     */   }
/*     */   
/*     */   public final void addToLastPart(@NotNull String content) {
/* 268 */     Intrinsics.checkNotNullParameter(content, "content"); if (this.message.getAllParts().isEmpty()) {
/* 269 */       addPart("", MessagePart.Type.PlainText);
/*     */     
/*     */     }
/* 272 */     else if (this.hasWaitingState && !((((CharSequence)content).length() == 0) ? 1 : 0)) {
/* 273 */       removeWaitingState();
/*     */     } 
/*     */     
/* 276 */     ((MessagePart)CollectionsKt.last(this.message.getAllParts())).addContent(content);
/* 277 */     SingleAlarm.request$default(this.updateAlarm, false, 0, 3, null);
/*     */   }
/*     */   
/*     */   public final void layoutAll() {
/* 281 */     String messageText = CollectionsKt.joinToString$default(this.message.getAllParts(), "", null, null, 0, null, AIAssistantChatMessageView$layoutAll$messageText$1.INSTANCE, 30, null);
/* 282 */     ComponentManager $this$service$iv = (ComponentManager)this.project; int $i$f$service = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 376 */     Class<AIMessageLayouter> serviceClass$iv = AIMessageLayouter.class;
/* 377 */     Object object = $this$service$iv.getService(serviceClass$iv); if (object == null) throw new IllegalStateException((
/* 378 */           "Cannot find service " + serviceClass$iv.getName() + " in " + $this$service$iv + " (classloader=" + serviceClass$iv.getClassLoader()).toString());  List<? extends MessagePart> newParts = ((AIMessageLayouter)object).layout(messageText, this.completableMessage, this.parentPanel); List<? extends MessagePart> oldParts = CollectionsKt.toList(this.message.getAllParts()); mergePartsAndUpdateUI(oldParts, newParts);
/* 379 */   } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\r\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/ml/llm/core/chat/parts/MessagePart;", "invoke"}) static final class AIAssistantChatMessageView$layoutAll$messageText$1 extends Lambda implements Function1<MessagePart, CharSequence> { public static final AIAssistantChatMessageView$layoutAll$messageText$1 INSTANCE = new AIAssistantChatMessageView$layoutAll$messageText$1(); AIAssistantChatMessageView$layoutAll$messageText$1() { super(1); } @NotNull public final CharSequence invoke(@NotNull MessagePart it) { Intrinsics.checkNotNullParameter(it, "it"); return it.getTextContent(); } } private final void mergePartsAndUpdateUI(List<MessagePart> oldParts, List<MessagePart> newPart) { Iterable<MessagePart> $this$forEachIndexed$iv = oldParts; int $i$f$forEachIndexed = 0; int index$iv = 0;
/* 380 */     Iterator iterator = $this$forEachIndexed$iv.iterator(); if (iterator.hasNext()) { Object item$iv = iterator.next(); int i = index$iv++; if (i < 0) CollectionsKt.throwIndexOverflow();  MessagePart messagePart = (MessagePart)item$iv; int oldIndex = i, $i$a$-forEachIndexed-AIAssistantChatMessageView$mergePartsAndUpdateUI$1 = 0;
/*     */       if (oldIndex < newPart.size()) {
/*     */         MessagePart newMessagePart = newPart.get(oldIndex);
/*     */         if (newMessagePart.getType() == messagePart.getType()) {
/*     */           messagePart.replaceContent(newMessagePart.getTextContent());
/*     */         } else {
/*     */           Intrinsics.checkNotNullExpressionValue(this.partsContainer.getComponents(), "partsContainer.components");
/*     */           int componentIndex = ArraysKt.indexOf((Object[])this.partsContainer.getComponents(), messagePart.getComponent());
/*     */           this.partsContainer.remove(messagePart.getComponent());
/*     */           this.partsContainer.add(newMessagePart.getComponent(), componentIndex);
/*     */           List<MessagePart> newItems = replace(this.message.getAllParts(), messagePart, newMessagePart);
/*     */           this.message.removeAllParts();
/*     */           this.message.addParts(newItems);
/*     */         } 
/*     */       }  }
/*     */     
/*     */     if (oldParts.size() <= newPart.size()) {
/*     */       for (int i = oldParts.size(); i < $i$f$forEachIndexed; i++) {
/*     */         MessagePart part = newPart.get(i);
/*     */         addPart(part);
/*     */       } 
/*     */     } else {
/*     */       for (int i = newPart.size(); i < $i$f$forEachIndexed; i++) {
/*     */         MessagePart part = oldParts.get(i);
/*     */         removePart(part);
/*     */       } 
/*     */     } 
/*     */     if ((AIAssistantChatPanel)DataManager.getInstance().getDataContext(this).getData(AIAssistantChatPanel.Companion.getCurrentDialogKey()) != null) {
/*     */       ((AIAssistantChatPanel)DataManager.getInstance().getDataContext(this).getData(AIAssistantChatPanel.Companion.getCurrentDialogKey())).scrollToEndIfNeeded();
/*     */     } else {
/*     */       (AIAssistantChatPanel)DataManager.getInstance().getDataContext(this).getData(AIAssistantChatPanel.Companion.getCurrentDialogKey());
/*     */     }  }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public Object getData(@NotNull String dataId) {
/*     */     Intrinsics.checkNotNullParameter(dataId, "dataId");
/*     */     if (CompletableMessage.Companion.getKey().is(dataId))
/*     */       return this.completableMessage; 
/*     */     return null;
/*     */   }
/*     */   
/*     */   private final List<MessagePart> replace(List $this$replace, MessagePart element, MessagePart replacer) {
/*     */     List<MessagePart> mutableList = CollectionsKt.toMutableList($this$replace);
/*     */     int index = $this$replace.indexOf(element);
/*     */     mutableList.set(index, replacer);
/*     */     return mutableList;
/*     */   }
/*     */   
/*     */   private final ErrorStateDescriptor getRetryAction(ErrorState $this$getRetryAction, Project project) {
/*     */     return ($this$getRetryAction.getError() instanceof java.nio.channels.UnresolvedAddressException) ? new ErrorStateDescriptor.Actionable("No internet connection. Check your connection and try again", "Try again", ErrorStateAction.DefaultRetry.INSTANCE) : (($this$getRetryAction.getError() instanceof HTTPStatusException.AccessProhibited) ? new ErrorStateDescriptor.Actionable("Failed to log in to JetBrains AI. Try to log in again", "Log in", project::getRetryAction$lambda$16) : (($this$getRetryAction.getError() instanceof HTTPStatusException.TooManyRequests) ? new ErrorStateDescriptor.Actionable("JetBrains AI is overloaded. Please try again later", "Try again", ErrorStateAction.DefaultRetry.INSTANCE) : (($this$getRetryAction.getError() instanceof HTTPStatusException && ((HTTPStatusException)$this$getRetryAction.getError()).isServerError()) ? new ErrorStateDescriptor.Actionable("JetBrains AI server error. Try to repeat your request. If the issue persists, contact us", "Try again", ErrorStateAction.DefaultRetry.INSTANCE) : new ErrorStateDescriptor.Actionable("Unknown error", "Try again", ErrorStateAction.DefaultRetry.INSTANCE))));
/*     */   }
/*     */   
/*     */   private static final void getRetryAction$lambda$16(Project $project) {
/*     */     Intrinsics.checkNotNullParameter($project, "$project");
/*     */     BuildersKt.launch$default(AIAssistantServiceScope.Companion.getScope($project), null, null, new AIAssistantChatMessageView$getRetryAction$1$1($project, null), 3, null);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AIAssistantChatMessageView.kt", l = {341}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.chat.ui.chat.AIAssistantChatMessageView$getRetryAction$1$1")
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class AIAssistantChatMessageView$getRetryAction$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     AIAssistantChatMessageView$getRetryAction$1$1(Project $project, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       GrazieAuthService grazieAuthService1;
/*     */       Project project;
/*     */       GrazieAuthService $this$invokeSuspend_u24lambda_u240;
/*     */       int $i$a$-apply-AIAssistantChatMessageView$getRetryAction$1$1$1;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           grazieAuthService1 = GrazieAuthService.Companion.getInstance();
/*     */           project = this.$project;
/*     */           $this$invokeSuspend_u24lambda_u240 = grazieAuthService1;
/*     */           $i$a$-apply-AIAssistantChatMessageView$getRetryAction$1$1$1 = 0;
/*     */           $this$invokeSuspend_u24lambda_u240.logout();
/*     */           this.L$0 = grazieAuthService1;
/*     */           this.label = 1;
/*     */           if ($this$invokeSuspend_u24lambda_u240.authenticate(project, (Continuation)this) == object)
/*     */             return object; 
/*     */           $this$invokeSuspend_u24lambda_u240.authenticate(project, (Continuation)this);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           $i$a$-apply-AIAssistantChatMessageView$getRetryAction$1$1$1 = 0;
/*     */           grazieAuthService1 = (GrazieAuthService)this.L$0;
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super AIAssistantChatMessageView$getRetryAction$1$1> $completion) {
/*     */       return (Continuation<Unit>)new AIAssistantChatMessageView$getRetryAction$1$1(this.$project, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */       return ((AIAssistantChatMessageView$getRetryAction$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\030\002\n\002\b\004\n\002\030\002\n\000\b2\030\0002\0020\001:\001\bB\024\b\004\022\013\020\002\032\0070\003¢\006\002\b\004¢\006\002\020\005R\026\020\002\032\0070\003¢\006\002\b\004¢\006\b\n\000\032\004\b\006\020\007\001\001\t¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView$ErrorStateDescriptor;", "", "text", "", "Lorg/jetbrains/annotations/Nls;", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "Actionable", "Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView$ErrorStateDescriptor$Actionable;", "intellij.ml.llm"})
/*     */   private static abstract class ErrorStateDescriptor {
/*     */     @NotNull
/*     */     private final String text;
/*     */     
/*     */     private ErrorStateDescriptor(String text) {
/*     */       this.text = text;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String getText() {
/*     */       return this.text;
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\006\030\0002\0020\001B'\022\013\020\002\032\0070\003¢\006\002\b\004\022\013\020\005\032\0070\003¢\006\002\b\004\022\006\020\006\032\0020\007¢\006\002\020\bR\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\t\020\nR\026\020\005\032\0070\003¢\006\002\b\004¢\006\b\n\000\032\004\b\013\020\f¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView$ErrorStateDescriptor$Actionable;", "Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView$ErrorStateDescriptor;", "text", "", "Lorg/jetbrains/annotations/Nls;", "linkText", "action", "Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView$ErrorStateAction;", "(Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView$ErrorStateAction;)V", "getAction", "()Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView$ErrorStateAction;", "getLinkText", "()Ljava/lang/String;", "intellij.ml.llm"})
/*     */     public static final class Actionable extends ErrorStateDescriptor {
/*     */       @NotNull
/*     */       private final String linkText;
/*     */       @NotNull
/*     */       private final AIAssistantChatMessageView.ErrorStateAction action;
/*     */       
/*     */       public Actionable(@NotNull String text, @NotNull String linkText, @NotNull AIAssistantChatMessageView.ErrorStateAction action) {
/*     */         super(text, null);
/*     */         this.linkText = linkText;
/*     */         this.action = action;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final String getLinkText() {
/*     */         return this.linkText;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final AIAssistantChatMessageView.ErrorStateAction getAction() {
/*     */         return this.action;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\006\030\0002\0020\001B'\022\013\020\002\032\0070\003¢\006\002\b\004\022\013\020\005\032\0070\003¢\006\002\b\004\022\006\020\006\032\0020\007¢\006\002\020\bR\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\t\020\nR\026\020\005\032\0070\003¢\006\002\b\004¢\006\b\n\000\032\004\b\013\020\f¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView$ErrorStateDescriptor$Actionable;", "Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView$ErrorStateDescriptor;", "text", "", "Lorg/jetbrains/annotations/Nls;", "linkText", "action", "Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView$ErrorStateAction;", "(Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView$ErrorStateAction;)V", "getAction", "()Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView$ErrorStateAction;", "getLinkText", "()Ljava/lang/String;", "intellij.ml.llm"})
/*     */   public static final class Actionable extends ErrorStateDescriptor {
/*     */     @NotNull
/*     */     private final String linkText;
/*     */     @NotNull
/*     */     private final AIAssistantChatMessageView.ErrorStateAction action;
/*     */     
/*     */     public Actionable(@NotNull String text, @NotNull String linkText, @NotNull AIAssistantChatMessageView.ErrorStateAction action) {
/*     */       super(text, null);
/*     */       this.linkText = linkText;
/*     */       this.action = action;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String getLinkText() {
/*     */       return this.linkText;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final AIAssistantChatMessageView.ErrorStateAction getAction() {
/*     */       return this.action;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\002\b\002\bæ\001\030\0002\0020\001:\001\004J\b\020\002\032\0020\003H&ø\001\000\002\006\n\004\b!0\001¨\006\005À\006\001"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView$ErrorStateAction;", "", "doAction", "", "DefaultRetry", "intellij.ml.llm"})
/*     */   public static interface ErrorStateAction {
/*     */     void doAction();
/*     */     
/*     */     @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\b\020\003\032\0020\004H\026¨\006\005"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView$ErrorStateAction$DefaultRetry;", "Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView$ErrorStateAction;", "()V", "doAction", "", "intellij.ml.llm"})
/*     */     public static final class DefaultRetry implements ErrorStateAction {
/*     */       @NotNull
/*     */       public static final DefaultRetry INSTANCE = new DefaultRetry();
/*     */       
/*     */       public void doAction() {
/*     */         throw new IllegalStateException("This method should not be called".toString());
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\b\020\003\032\0020\004H\026¨\006\005"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView$ErrorStateAction$DefaultRetry;", "Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView$ErrorStateAction;", "()V", "doAction", "", "intellij.ml.llm"})
/*     */   public static final class DefaultRetry implements ErrorStateAction {
/*     */     @NotNull
/*     */     public static final DefaultRetry INSTANCE = new DefaultRetry();
/*     */     
/*     */     public void doAction() {
/*     */       throw new IllegalStateException("This method should not be called".toString());
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */