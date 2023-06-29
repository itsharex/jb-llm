/*     */ package com.intellij.ml.llm.core.chat.ui.codeSnippet;
/*     */ 
/*     */ import com.intellij.codeInsight.daemon.impl.analysis.FileHighlightingSetting;
/*     */ import com.intellij.codeInsight.daemon.impl.analysis.HighlightingSettingsPerFile;
/*     */ import com.intellij.lang.Language;
/*     */ import com.intellij.ml.llm.core.chat.messages.CompletableMessage;
/*     */ import com.intellij.ml.llm.core.chat.parts.CodePart;
/*     */ import com.intellij.openapi.Disposable;
/*     */ import com.intellij.openapi.actionSystem.ActionGroup;
/*     */ import com.intellij.openapi.actionSystem.impl.ActionToolbarImpl;
/*     */ import com.intellij.openapi.editor.Document;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.editor.colors.EditorColorsScheme;
/*     */ import com.intellij.openapi.editor.event.EditorMouseEvent;
/*     */ import com.intellij.openapi.editor.ex.EditorEx;
/*     */ import com.intellij.openapi.editor.ex.FocusChangeListener;
/*     */ import com.intellij.openapi.fileEditor.OpenFileDescriptor;
/*     */ import com.intellij.openapi.observable.properties.GraphProperty;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import com.intellij.util.SingleAlarm;
/*     */ import com.intellij.util.ui.JBUI;
/*     */ import java.awt.event.AdjustmentEvent;
/*     */ import java.awt.event.AdjustmentListener;
/*     */ import javax.swing.JScrollBar;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.border.Border;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000D\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\0326\020\000\032\0020\0012\006\020\002\032\0020\0032\f\020\004\032\b\022\004\022\0020\0060\0052\006\020\007\032\0020\b2\b\b\002\020\t\032\0020\n2\006\020\013\032\0020\f\032\034\020\r\032\004\030\0010\0162\006\020\017\032\0020\0202\b\020\021\032\004\030\0010\006H\002\032\020\020\022\032\0020\0232\006\020\024\032\0020\025H\002¨\006\026"}, d2 = {"createCodeViewer", "Lcom/intellij/ml/llm/core/chat/parts/CodePart$EditorInfo;", "project", "Lcom/intellij/openapi/project/Project;", "code", "Lcom/intellij/openapi/observable/properties/GraphProperty;", "", "disposable", "Lcom/intellij/openapi/Disposable;", "language", "Lcom/intellij/lang/Language;", "message", "Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;", "getEditorData", "Lcom/intellij/openapi/editor/Editor;", "editor", "Lcom/intellij/openapi/editor/ex/EditorEx;", "dataId", "scrollToTopWhenNeeded", "", "scrollPane", "Ljavax/swing/JScrollPane;", "intellij.ml.llm"})
/*     */ public final class CodeViewerKt
/*     */ {
/*     */   @NotNull
/*     */   public static final CodePart.EditorInfo createCodeViewer(@NotNull Project project, @NotNull GraphProperty code, @NotNull Disposable disposable, @NotNull Language language, @NotNull CompletableMessage message) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'project'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'code'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_2
/*     */     //   13: ldc 'disposable'
/*     */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   18: aload_3
/*     */     //   19: ldc 'language'
/*     */     //   21: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   24: aload #4
/*     */     //   26: ldc 'message'
/*     */     //   28: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   31: aload #4
/*     */     //   33: invokeinterface getAuthor : ()Lcom/intellij/ml/llm/core/chat/messages/ChatMessageAuthor;
/*     */     //   38: getstatic com/intellij/ml/llm/core/chat/messages/ChatMessageAuthor.User : Lcom/intellij/ml/llm/core/chat/messages/ChatMessageAuthor;
/*     */     //   41: if_acmpne -> 48
/*     */     //   44: iconst_1
/*     */     //   45: goto -> 49
/*     */     //   48: iconst_0
/*     */     //   49: istore #5
/*     */     //   51: new com/intellij/testFramework/LightVirtualFile
/*     */     //   54: dup
/*     */     //   55: ldc 'AIAssistantSnippet'
/*     */     //   57: aload_3
/*     */     //   58: aload_1
/*     */     //   59: invokeinterface get : ()Ljava/lang/Object;
/*     */     //   64: checkcast java/lang/CharSequence
/*     */     //   67: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/lang/Language;Ljava/lang/CharSequence;)V
/*     */     //   70: astore #6
/*     */     //   72: aload #6
/*     */     //   74: invokevirtual getFileType : ()Lcom/intellij/openapi/fileTypes/FileType;
/*     */     //   77: getstatic com/intellij/openapi/fileTypes/UnknownFileType.INSTANCE : Lcom/intellij/openapi/fileTypes/FileType;
/*     */     //   80: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   83: ifeq -> 97
/*     */     //   86: aload #6
/*     */     //   88: getstatic com/intellij/openapi/fileTypes/PlainTextFileType.INSTANCE : Lcom/intellij/openapi/fileTypes/PlainTextFileType;
/*     */     //   91: checkcast com/intellij/openapi/fileTypes/FileType
/*     */     //   94: invokevirtual setFileType : (Lcom/intellij/openapi/fileTypes/FileType;)V
/*     */     //   97: aload #6
/*     */     //   99: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   102: invokestatic findDocument : (Lcom/intellij/openapi/vfs/VirtualFile;)Lcom/intellij/openapi/editor/Document;
/*     */     //   105: dup
/*     */     //   106: ifnonnull -> 123
/*     */     //   109: pop
/*     */     //   110: new java/lang/IllegalStateException
/*     */     //   113: dup
/*     */     //   114: ldc 'Can't create inmemory document'
/*     */     //   116: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   119: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   122: athrow
/*     */     //   123: astore #7
/*     */     //   125: aload_0
/*     */     //   126: aload #7
/*     */     //   128: aload_3
/*     */     //   129: aload_2
/*     */     //   130: invokestatic createEditorForChatCodeSnippet : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Document;Lcom/intellij/lang/Language;Lcom/intellij/openapi/Disposable;)Lcom/intellij/openapi/editor/Editor;
/*     */     //   133: dup
/*     */     //   134: ldc 'null cannot be cast to non-null type com.intellij.openapi.editor.ex.EditorEx'
/*     */     //   136: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   139: checkcast com/intellij/openapi/editor/ex/EditorEx
/*     */     //   142: astore #8
/*     */     //   144: aload #8
/*     */     //   146: aload #6
/*     */     //   148: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   151: invokeinterface setFile : (Lcom/intellij/openapi/vfs/VirtualFile;)V
/*     */     //   156: aload_0
/*     */     //   157: invokestatic getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/psi/PsiManager;
/*     */     //   160: aload #6
/*     */     //   162: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   165: invokevirtual findFile : (Lcom/intellij/openapi/vfs/VirtualFile;)Lcom/intellij/psi/PsiFile;
/*     */     //   168: dup
/*     */     //   169: ifnull -> 210
/*     */     //   172: astore #11
/*     */     //   174: iconst_0
/*     */     //   175: istore #12
/*     */     //   177: aload #8
/*     */     //   179: invokeinterface getComponent : ()Ljavax/swing/JComponent;
/*     */     //   184: checkcast java/awt/Component
/*     */     //   187: invokestatic stateForComponent : (Ljava/awt/Component;)Lcom/intellij/openapi/application/ModalityState;
/*     */     //   190: new com/intellij/ml/llm/core/chat/ui/codeSnippet/CodeViewerKt$createCodeViewer$1$1
/*     */     //   193: dup
/*     */     //   194: aload_0
/*     */     //   195: aload #11
/*     */     //   197: invokespecial <init> : (Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiFile;)V
/*     */     //   200: checkcast kotlin/jvm/functions/Function0
/*     */     //   203: invokestatic invokeLater : (Lcom/intellij/openapi/application/ModalityState;Lkotlin/jvm/functions/Function0;)V
/*     */     //   206: nop
/*     */     //   207: goto -> 212
/*     */     //   210: pop
/*     */     //   211: nop
/*     */     //   212: invokestatic getInstance : ()Lcom/intellij/openapi/editor/highlighter/EditorHighlighterFactory;
/*     */     //   215: aload_0
/*     */     //   216: aload #6
/*     */     //   218: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   221: invokevirtual createEditorHighlighter : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/vfs/VirtualFile;)Lcom/intellij/openapi/editor/highlighter/EditorHighlighter;
/*     */     //   224: dup
/*     */     //   225: ldc 'getInstance().createEdit…ighlighter(project, file)'
/*     */     //   227: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   230: astore #9
/*     */     //   232: aload #8
/*     */     //   234: aload #9
/*     */     //   236: invokeinterface setHighlighter : (Lcom/intellij/openapi/editor/highlighter/EditorHighlighter;)V
/*     */     //   241: aload #8
/*     */     //   243: invokeinterface getMarkupModel : ()Lcom/intellij/openapi/editor/ex/MarkupModelEx;
/*     */     //   248: dup
/*     */     //   249: ldc 'null cannot be cast to non-null type com.intellij.openapi.editor.ex.EditorMarkupModel'
/*     */     //   251: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   254: checkcast com/intellij/openapi/editor/ex/EditorMarkupModel
/*     */     //   257: iconst_0
/*     */     //   258: invokeinterface setErrorStripeVisible : (Z)V
/*     */     //   263: aload #8
/*     */     //   265: <illegal opcode> handlePopup : ()Lcom/intellij/openapi/editor/ex/EditorPopupHandler;
/*     */     //   270: invokeinterface installPopupHandler : (Lcom/intellij/openapi/editor/ex/EditorPopupHandler;)V
/*     */     //   275: aload #8
/*     */     //   277: invokeinterface getSettings : ()Lcom/intellij/openapi/editor/EditorSettings;
/*     */     //   282: astore #10
/*     */     //   284: aload #10
/*     */     //   286: astore #11
/*     */     //   288: iconst_0
/*     */     //   289: istore #12
/*     */     //   291: aload #11
/*     */     //   293: iconst_0
/*     */     //   294: invokeinterface setDndEnabled : (Z)V
/*     */     //   299: aload #11
/*     */     //   301: iconst_0
/*     */     //   302: invokeinterface setLineNumbersShown : (Z)V
/*     */     //   307: aload #11
/*     */     //   309: iconst_0
/*     */     //   310: invokeinterface setAdditionalLinesCount : (I)V
/*     */     //   315: aload #11
/*     */     //   317: iconst_0
/*     */     //   318: invokeinterface setLineMarkerAreaShown : (Z)V
/*     */     //   323: aload #11
/*     */     //   325: iconst_0
/*     */     //   326: invokeinterface setFoldingOutlineShown : (Z)V
/*     */     //   331: aload #11
/*     */     //   333: iconst_0
/*     */     //   334: invokeinterface setRightMarginShown : (Z)V
/*     */     //   339: aload #11
/*     */     //   341: iconst_0
/*     */     //   342: invokeinterface setShowIntentionBulb : (Z)V
/*     */     //   347: aload #11
/*     */     //   349: iconst_1
/*     */     //   350: invokeinterface setUseSoftWraps : (Z)V
/*     */     //   355: aload #11
/*     */     //   357: iconst_0
/*     */     //   358: invokeinterface setPaintSoftWraps : (Z)V
/*     */     //   363: aload #11
/*     */     //   365: iconst_1
/*     */     //   366: invokeinterface setRefrainFromScrolling : (Z)V
/*     */     //   371: aload #11
/*     */     //   373: iconst_0
/*     */     //   374: invokeinterface setAdditionalPageAtBottom : (Z)V
/*     */     //   379: aload #11
/*     */     //   381: iconst_0
/*     */     //   382: invokeinterface setCaretRowShown : (Z)V
/*     */     //   387: aload #8
/*     */     //   389: invokeinterface getComponent : ()Ljavax/swing/JComponent;
/*     */     //   394: aload #8
/*     */     //   396: <illegal opcode> getData : (Lcom/intellij/openapi/editor/ex/EditorEx;)Lcom/intellij/openapi/actionSystem/DataProvider;
/*     */     //   401: invokestatic registerDataProvider : (Ljavax/swing/JComponent;Lcom/intellij/openapi/actionSystem/DataProvider;)V
/*     */     //   404: nop
/*     */     //   405: nop
/*     */     //   406: aload #8
/*     */     //   408: new com/intellij/ml/llm/core/chat/ui/codeSnippet/CodeViewerKt$createCodeViewer$4
/*     */     //   411: dup
/*     */     //   412: aload #8
/*     */     //   414: invokespecial <init> : (Lcom/intellij/openapi/editor/ex/EditorEx;)V
/*     */     //   417: checkcast com/intellij/openapi/editor/ex/FocusChangeListener
/*     */     //   420: invokeinterface addFocusListener : (Lcom/intellij/openapi/editor/ex/FocusChangeListener;)V
/*     */     //   425: aload #8
/*     */     //   427: invokeinterface getScrollPane : ()Ljavax/swing/JScrollPane;
/*     */     //   432: dup
/*     */     //   433: ldc_w 'editor.scrollPane'
/*     */     //   436: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   439: invokestatic scrollToTopWhenNeeded : (Ljavax/swing/JScrollPane;)V
/*     */     //   442: ldc_w 'AIAssistant.ToolWindow.Snippet.Toolbar'
/*     */     //   445: invokestatic getActionGroup : (Ljava/lang/String;)Lcom/intellij/openapi/actionSystem/ActionGroup;
/*     */     //   448: astore #10
/*     */     //   450: aload #10
/*     */     //   452: ifnull -> 546
/*     */     //   455: new com/intellij/ml/llm/core/chat/ui/codeSnippet/CodeViewerKt$createCodeViewer$snippetToolbar$1
/*     */     //   458: dup
/*     */     //   459: aload #10
/*     */     //   461: aload #8
/*     */     //   463: invokespecial <init> : (Lcom/intellij/openapi/actionSystem/ActionGroup;Lcom/intellij/openapi/editor/ex/EditorEx;)V
/*     */     //   466: astore #11
/*     */     //   468: aload #11
/*     */     //   470: aload #8
/*     */     //   472: invokeinterface getBackgroundColor : ()Ljava/awt/Color;
/*     */     //   477: invokevirtual setBackground : (Ljava/awt/Color;)V
/*     */     //   480: aload #11
/*     */     //   482: iconst_1
/*     */     //   483: invokevirtual setOpaque : (Z)V
/*     */     //   486: aload #11
/*     */     //   488: aload #8
/*     */     //   490: invokeinterface getContentComponent : ()Ljavax/swing/JComponent;
/*     */     //   495: invokevirtual setTargetComponent : (Ljavax/swing/JComponent;)V
/*     */     //   498: aload #8
/*     */     //   500: aload #11
/*     */     //   502: checkcast javax/swing/JComponent
/*     */     //   505: invokeinterface setHeaderComponent : (Ljavax/swing/JComponent;)V
/*     */     //   510: aload_0
/*     */     //   511: invokeinterface getMessageBus : ()Lcom/intellij/util/messages/MessageBus;
/*     */     //   516: aload_2
/*     */     //   517: invokeinterface connect : (Lcom/intellij/openapi/Disposable;)Lcom/intellij/util/messages/MessageBusConnection;
/*     */     //   522: getstatic com/intellij/openapi/editor/colors/EditorColorsManager.TOPIC : Lcom/intellij/util/messages/Topic;
/*     */     //   525: dup
/*     */     //   526: ldc_w 'TOPIC'
/*     */     //   529: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   532: aload #11
/*     */     //   534: aload #8
/*     */     //   536: <illegal opcode> globalSchemeChange : (Lcom/intellij/ml/llm/core/chat/ui/codeSnippet/CodeViewerKt$createCodeViewer$snippetToolbar$1;Lcom/intellij/openapi/editor/ex/EditorEx;)Lcom/intellij/openapi/editor/colors/EditorColorsListener;
/*     */     //   541: invokeinterface subscribe : (Lcom/intellij/util/messages/Topic;Ljava/lang/Object;)V
/*     */     //   546: aload #8
/*     */     //   548: invokeinterface getScrollPane : ()Ljavax/swing/JScrollPane;
/*     */     //   553: invokestatic empty : ()Lcom/intellij/util/ui/JBEmptyBorder;
/*     */     //   556: checkcast javax/swing/border/Border
/*     */     //   559: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
/*     */     //   562: aload #8
/*     */     //   564: invokeinterface getComponent : ()Ljavax/swing/JComponent;
/*     */     //   569: invokestatic empty : ()Lcom/intellij/util/ui/JBEmptyBorder;
/*     */     //   572: checkcast javax/swing/border/Border
/*     */     //   575: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
/*     */     //   578: new com/intellij/ml/llm/core/chat/ui/codeSnippet/EditorFragment
/*     */     //   581: dup
/*     */     //   582: aload_0
/*     */     //   583: aload #8
/*     */     //   585: aload #4
/*     */     //   587: invokespecial <init> : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/ex/EditorEx;Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;)V
/*     */     //   590: astore #11
/*     */     //   592: aload #11
/*     */     //   594: iload #5
/*     */     //   596: invokevirtual setCollapsed : (Z)V
/*     */     //   599: aload #11
/*     */     //   601: invokevirtual updateExpandCollapseLabel : ()V
/*     */     //   604: new com/intellij/util/SingleAlarm
/*     */     //   607: dup
/*     */     //   608: aload #11
/*     */     //   610: <illegal opcode> run : (Lcom/intellij/ml/llm/core/chat/ui/codeSnippet/EditorFragment;)Ljava/lang/Runnable;
/*     */     //   615: sipush #500
/*     */     //   618: aconst_null
/*     */     //   619: aconst_null
/*     */     //   620: aconst_null
/*     */     //   621: bipush #24
/*     */     //   623: aconst_null
/*     */     //   624: invokespecial <init> : (Ljava/lang/Runnable;ILcom/intellij/openapi/Disposable;Lcom/intellij/util/Alarm$ThreadToUse;Lcom/intellij/openapi/application/ModalityState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   627: astore #12
/*     */     //   629: aload_1
/*     */     //   630: new com/intellij/ml/llm/core/chat/ui/codeSnippet/CodeViewerKt$createCodeViewer$6
/*     */     //   633: dup
/*     */     //   634: aload #7
/*     */     //   636: aload #12
/*     */     //   638: aload_0
/*     */     //   639: invokespecial <init> : (Lcom/intellij/openapi/editor/Document;Lcom/intellij/util/SingleAlarm;Lcom/intellij/openapi/project/Project;)V
/*     */     //   642: checkcast kotlin/jvm/functions/Function1
/*     */     //   645: invokeinterface afterChange : (Lkotlin/jvm/functions/Function1;)V
/*     */     //   650: new com/intellij/ml/llm/core/chat/parts/CodePart$EditorInfo
/*     */     //   653: dup
/*     */     //   654: aload_1
/*     */     //   655: aload #11
/*     */     //   657: invokevirtual getContent : ()Ljavax/swing/JComponent;
/*     */     //   660: aload #8
/*     */     //   662: checkcast com/intellij/openapi/editor/Editor
/*     */     //   665: aload #6
/*     */     //   667: invokespecial <init> : (Lcom/intellij/openapi/observable/properties/GraphProperty;Ljavax/swing/JComponent;Lcom/intellij/openapi/editor/Editor;Lcom/intellij/testFramework/LightVirtualFile;)V
/*     */     //   670: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #62	-> 31
/*     */     //   #64	-> 51
/*     */     //   #65	-> 72
/*     */     //   #66	-> 97
/*     */     //   #68	-> 125
/*     */     //   #69	-> 144
/*     */     //   #74	-> 156
/*     */     //   #75	-> 177
/*     */     //   #80	-> 206
/*     */     //   #74	-> 207
/*     */     //   #74	-> 210
/*     */     //   #82	-> 212
/*     */     //   #84	-> 232
/*     */     //   #86	-> 241
/*     */     //   #89	-> 263
/*     */     //   #93	-> 275
/*     */     //   #94	-> 291
/*     */     //   #95	-> 299
/*     */     //   #96	-> 307
/*     */     //   #97	-> 315
/*     */     //   #98	-> 323
/*     */     //   #99	-> 331
/*     */     //   #100	-> 339
/*     */     //   #101	-> 347
/*     */     //   #102	-> 355
/*     */     //   #103	-> 363
/*     */     //   #104	-> 371
/*     */     //   #105	-> 379
/*     */     //   #106	-> 387
/*     */     //   #110	-> 404
/*     */     //   #93	-> 405
/*     */     //   #112	-> 406
/*     */     //   #123	-> 425
/*     */     //   #125	-> 442
/*     */     //   #126	-> 450
/*     */     //   #127	-> 455
/*     */     //   #135	-> 468
/*     */     //   #136	-> 480
/*     */     //   #137	-> 486
/*     */     //   #138	-> 498
/*     */     //   #140	-> 510
/*     */     //   #141	-> 522
/*     */     //   #140	-> 532
/*     */     //   #147	-> 546
/*     */     //   #148	-> 562
/*     */     //   #150	-> 578
/*     */     //   #151	-> 592
/*     */     //   #154	-> 599
/*     */     //   #155	-> 604
/*     */     //   #156	-> 629
/*     */     //   #180	-> 650
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   177	30	12	$i$a$-let-CodeViewerKt$createCodeViewer$1	I
/*     */     //   174	33	11	psiFile	Lcom/intellij/psi/PsiFile;
/*     */     //   291	114	12	$i$a$-apply-CodeViewerKt$createCodeViewer$3	I
/*     */     //   288	117	11	$this$createCodeViewer_u24lambda_u243	Lcom/intellij/openapi/editor/EditorSettings;
/*     */     //   468	78	11	snippetToolbar	Lcom/intellij/ml/llm/core/chat/ui/codeSnippet/CodeViewerKt$createCodeViewer$snippetToolbar$1;
/*     */     //   51	620	5	forceFoldEditorByDefault	Z
/*     */     //   72	599	6	file	Lcom/intellij/testFramework/LightVirtualFile;
/*     */     //   125	546	7	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   144	527	8	editor	Lcom/intellij/openapi/editor/ex/EditorEx;
/*     */     //   232	439	9	highlighter	Lcom/intellij/openapi/editor/highlighter/EditorHighlighter;
/*     */     //   450	221	10	toolbarActionGroup	Lcom/intellij/openapi/actionSystem/ActionGroup;
/*     */     //   592	79	11	editorFragment	Lcom/intellij/ml/llm/core/chat/ui/codeSnippet/EditorFragment;
/*     */     //   629	42	12	updateAlarm	Lcom/intellij/util/SingleAlarm;
/*     */     //   0	671	0	project	Lcom/intellij/openapi/project/Project;
/*     */     //   0	671	1	code	Lcom/intellij/openapi/observable/properties/GraphProperty;
/*     */     //   0	671	2	disposable	Lcom/intellij/openapi/Disposable;
/*     */     //   0	671	3	language	Lcom/intellij/lang/Language;
/*     */     //   0	671	4	message	Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*     */   static final class CodeViewerKt$createCodeViewer$1$1
/*     */     extends Lambda
/*     */     implements Function0<Unit>
/*     */   {
/*     */     public final void invoke() {
/*  76 */       HighlightingSettingsPerFile settingsPerFile = HighlightingSettingsPerFile.getInstance(this.$project);
/*  77 */       if (this.$psiFile.getFirstChild() == null)
/*  78 */         return;  settingsPerFile.setHighlightingSettingForRoot(this.$psiFile.getFirstChild(), FileHighlightingSetting.ESSENTIAL);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     CodeViewerKt$createCodeViewer$1$1(Project $project, PsiFile $psiFile) {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private static final boolean createCodeViewer$lambda$1(EditorMouseEvent it) {
/*  90 */     Intrinsics.checkNotNullParameter(it, "it"); return true;
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
/*     */   private static final Object createCodeViewer$lambda$3$lambda$2(EditorEx $editor, String dataId) {
/* 107 */     Intrinsics.checkNotNullParameter($editor, "$editor"); return getEditorData($editor, dataId);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\031\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\004\032\0020\005H\026¨\006\007"}, d2 = {"com/intellij/ml/llm/core/chat/ui/codeSnippet/CodeViewerKt$createCodeViewer$4", "Lcom/intellij/openapi/editor/ex/FocusChangeListener;", "focusGained", "", "focusEditor", "Lcom/intellij/openapi/editor/Editor;", "focusLost", "intellij.ml.llm"})
/*     */   public static final class CodeViewerKt$createCodeViewer$4 implements FocusChangeListener { CodeViewerKt$createCodeViewer$4(EditorEx $editor) {}
/*     */     
/*     */     public void focusGained(@NotNull Editor focusEditor) {
/* 114 */       Intrinsics.checkNotNullParameter(focusEditor, "focusEditor"); this.$editor.getSettings().setCaretRowShown(true);
/*     */     }
/*     */     
/*     */     public void focusLost(@NotNull Editor focusEditor) {
/* 118 */       Intrinsics.checkNotNullParameter(focusEditor, "focusEditor"); this.$editor.getSettings().setCaretRowShown(false);
/* 119 */       this.$editor.getMarkupModel().removeAllHighlighters();
/*     */     } }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\002\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\024J\b\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/core/chat/ui/codeSnippet/CodeViewerKt$createCodeViewer$snippetToolbar$1", "Lcom/intellij/openapi/actionSystem/impl/ActionToolbarImpl;", "forceRightAlignment", "", "updateUI", "", "intellij.ml.llm"})
/*     */   public static final class CodeViewerKt$createCodeViewer$snippetToolbar$1
/*     */     extends ActionToolbarImpl {
/*     */     CodeViewerKt$createCodeViewer$snippetToolbar$1(ActionGroup $toolbarActionGroup, EditorEx $editor) {
/* 127 */       super("EditorToolbar", $toolbarActionGroup, true); } protected boolean forceRightAlignment() {
/* 128 */       return true;
/*     */     } public void updateUI() {
/* 130 */       super.updateUI();
/*     */       
/* 132 */       this.$editor.getComponent().setBorder((Border)JBUI.Borders.empty());
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final void createCodeViewer$lambda$4(CodeViewerKt$createCodeViewer$snippetToolbar$1 $snippetToolbar, EditorEx $editor, EditorColorsScheme it) {
/* 143 */     Intrinsics.checkNotNullParameter($snippetToolbar, "$snippetToolbar"); Intrinsics.checkNotNullParameter($editor, "$editor"); $snippetToolbar.setBackground($editor.getBackgroundColor());
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
/*     */   private static final void createCodeViewer$lambda$5(EditorFragment $editorFragment) {
/* 155 */     Intrinsics.checkNotNullParameter($editorFragment, "$editorFragment"); $editorFragment.updateExpandCollapseLabel();
/*     */   }
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\020\016\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "newDocText", "", "invoke"})
/*     */   static final class CodeViewerKt$createCodeViewer$6 extends Lambda implements Function1<String, Unit> { public final void invoke(@NotNull String newDocText) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'newDocText'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_0
/*     */       //   7: getfield $document : Lcom/intellij/openapi/editor/Document;
/*     */       //   10: invokeinterface getText : ()Ljava/lang/String;
/*     */       //   15: dup
/*     */       //   16: ldc 'document.text'
/*     */       //   18: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   21: astore_2
/*     */       //   22: aload_1
/*     */       //   23: aload_2
/*     */       //   24: iconst_0
/*     */       //   25: iconst_2
/*     */       //   26: aconst_null
/*     */       //   27: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
/*     */       //   30: ifeq -> 67
/*     */       //   33: aload_1
/*     */       //   34: aload_2
/*     */       //   35: aconst_null
/*     */       //   36: iconst_2
/*     */       //   37: aconst_null
/*     */       //   38: invokestatic substringAfter$default : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
/*     */       //   41: astore_3
/*     */       //   42: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*     */       //   45: aload_0
/*     */       //   46: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   49: aload_0
/*     */       //   50: getfield $document : Lcom/intellij/openapi/editor/Document;
/*     */       //   53: aload_3
/*     */       //   54: <illegal opcode> run : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Document;Ljava/lang/String;)Ljava/lang/Runnable;
/*     */       //   59: invokeinterface runWriteAction : (Ljava/lang/Runnable;)V
/*     */       //   64: goto -> 85
/*     */       //   67: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*     */       //   70: aload_0
/*     */       //   71: getfield $document : Lcom/intellij/openapi/editor/Document;
/*     */       //   74: aload_1
/*     */       //   75: <illegal opcode> run : (Lcom/intellij/openapi/editor/Document;Ljava/lang/String;)Ljava/lang/Runnable;
/*     */       //   80: invokeinterface runWriteAction : (Ljava/lang/Runnable;)V
/*     */       //   85: aload_0
/*     */       //   86: getfield $updateAlarm : Lcom/intellij/util/SingleAlarm;
/*     */       //   89: iconst_0
/*     */       //   90: iconst_1
/*     */       //   91: aconst_null
/*     */       //   92: invokestatic cancelAndRequest$default : (Lcom/intellij/util/SingleAlarm;ZILjava/lang/Object;)V
/*     */       //   95: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #157	-> 6
/*     */       //   #158	-> 22
/*     */       //   #159	-> 33
/*     */       //   #160	-> 42
/*     */       //   #171	-> 67
/*     */       //   #177	-> 85
/*     */       //   #178	-> 95
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   42	22	3	newPart	Ljava/lang/String;
/*     */       //   22	74	2	oldDocText	Ljava/lang/String;
/*     */       //   0	96	0	this	Lcom/intellij/ml/llm/core/chat/ui/codeSnippet/CodeViewerKt$createCodeViewer$6;
/*     */       //   0	96	1	newDocText	Ljava/lang/String;
/*     */     }
/*     */     
/*     */     private static final void invoke$lambda$1$lambda$0(Document $document, String $newPart) {
/* 163 */       Intrinsics.checkNotNullParameter($document, "$document"); Intrinsics.checkNotNullParameter($newPart, "$newPart"); $document.setReadOnly(false);
/* 164 */       $document.insertString($document.getTextLength(), $newPart);
/* 165 */       $document.setReadOnly(true);
/*     */     }
/*     */     private static final void invoke$lambda$1(Project $project, Document $document, String $newPart) {
/*     */       // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: ldc '$project'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_1
/*     */       //   7: ldc '$document'
/*     */       //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   12: aload_2
/*     */       //   13: ldc '$newPart'
/*     */       //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   18: aload_0
/*     */       //   19: invokestatic writeCommandAction : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/command/WriteCommandAction$Builder;
/*     */       //   22: aload_1
/*     */       //   23: aload_2
/*     */       //   24: <illegal opcode> run : (Lcom/intellij/openapi/editor/Document;Ljava/lang/String;)Lcom/intellij/util/ThrowableRunnable;
/*     */       //   29: invokeinterface run : (Lcom/intellij/util/ThrowableRunnable;)V
/*     */       //   34: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #161	-> 18
/*     */       //   #162	-> 22
/*     */       //   #167	-> 34
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	35	0	$project	Lcom/intellij/openapi/project/Project;
/*     */       //   0	35	1	$document	Lcom/intellij/openapi/editor/Document;
/*     */       //   0	35	2	$newPart	Ljava/lang/String;
/*     */     }
/*     */     
/*     */     private static final void invoke$lambda$2(Document $document, String $newDocText) {
/* 172 */       Intrinsics.checkNotNullParameter($document, "$document"); Intrinsics.checkNotNullParameter($newDocText, "$newDocText"); $document.setReadOnly(false);
/* 173 */       $document.setText($newDocText);
/* 174 */       $document.setReadOnly(true);
/*     */     }
/*     */ 
/*     */     
/*     */     CodeViewerKt$createCodeViewer$6(Document $document, SingleAlarm $updateAlarm, Project $project) {
/*     */       super(1);
/*     */     } }
/*     */ 
/*     */   
/*     */   private static final Editor getEditorData(EditorEx editor, String dataId) {
/* 184 */     if (OpenFileDescriptor.NAVIGATE_IN_EDITOR.is(dataId)) {
/* 185 */       return (Editor)editor;
/*     */     }
/* 187 */     return null;
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
/*     */   private static final void scrollToTopWhenNeeded(JScrollPane scrollPane)
/*     */   {
/* 267 */     int initScrollPos = scrollPane.getVerticalScrollBar().getValue();
/* 268 */     if (initScrollPos != 0) {
/* 269 */       scrollPane.getVerticalScrollBar().setValue(0);
/*     */       return;
/*     */     } 
/* 272 */     scrollPane.getVerticalScrollBar().addAdjustmentListener(new CodeViewerKt$scrollToTopWhenNeeded$1(initScrollPos, scrollPane)); } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/core/chat/ui/codeSnippet/CodeViewerKt$scrollToTopWhenNeeded$1", "Ljava/awt/event/AdjustmentListener;", "adjustmentValueChanged", "", "e", "Ljava/awt/event/AdjustmentEvent;", "intellij.ml.llm"})
/*     */   public static final class CodeViewerKt$scrollToTopWhenNeeded$1 implements AdjustmentListener { public void adjustmentValueChanged(@NotNull AdjustmentEvent e) {
/* 274 */       Intrinsics.checkNotNullParameter(e, "e"); CodeViewerKt$scrollToTopWhenNeeded$1 l = this;
/* 275 */       if (this.$initScrollPos != e.getValue()) {
/* 276 */         JScrollBar jScrollBar1 = this.$scrollPane.getVerticalScrollBar(), $this$adjustmentValueChanged_u24lambda_u240 = jScrollBar1; int $i$a$-apply-CodeViewerKt$scrollToTopWhenNeeded$1$adjustmentValueChanged$1 = 0;
/* 277 */         $this$adjustmentValueChanged_u24lambda_u240.setValue(0);
/* 278 */         $this$adjustmentValueChanged_u24lambda_u240.removeAdjustmentListener(l);
/*     */       } 
/*     */     }
/*     */     
/*     */     CodeViewerKt$scrollToTopWhenNeeded$1(int $initScrollPos, JScrollPane $scrollPane) {} }
/*     */ 
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/codeSnippet/CodeViewerKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */