/*     */ package com.intellij.ml.llm.core.chat.ui.chat;
/*     */ 
/*     */ import com.intellij.ml.llm.LLMBundle;
/*     */ import com.intellij.ml.llm.core.chat.ui.AIAssistantUIUtil;
/*     */ import com.intellij.openapi.Disposable;
/*     */ import com.intellij.openapi.actionSystem.AnAction;
/*     */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*     */ import com.intellij.openapi.actionSystem.AnActionResult;
/*     */ import com.intellij.openapi.actionSystem.CommonDataKeys;
/*     */ import com.intellij.openapi.actionSystem.CustomShortcutSet;
/*     */ import com.intellij.openapi.actionSystem.KeyboardShortcut;
/*     */ import com.intellij.openapi.actionSystem.Shortcut;
/*     */ import com.intellij.openapi.actionSystem.ShortcutSet;
/*     */ import com.intellij.openapi.actionSystem.ex.AnActionListener;
/*     */ import com.intellij.openapi.editor.Document;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.editor.EditorModificationUtil;
/*     */ import com.intellij.openapi.editor.actions.IncrementalFindAction;
/*     */ import com.intellij.openapi.editor.event.DocumentEvent;
/*     */ import com.intellij.openapi.editor.event.DocumentListener;
/*     */ import com.intellij.openapi.editor.ex.EditorEx;
/*     */ import com.intellij.openapi.fileTypes.FileType;
/*     */ import com.intellij.openapi.fileTypes.FileTypes;
/*     */ import com.intellij.openapi.fileTypes.PlainTextFileType;
/*     */ import com.intellij.openapi.fileTypes.UnknownFileType;
/*     */ import com.intellij.openapi.project.DumbAwareAction;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import com.intellij.openapi.vfs.VirtualFileUtil;
/*     */ import com.intellij.testFramework.LightVirtualFile;
/*     */ import com.intellij.ui.EditorTextField;
/*     */ import com.intellij.util.EventDispatcher;
/*     */ import com.intellij.util.ui.JBUI;
/*     */ import java.awt.Color;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.UUID;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.KeyStroke;
/*     */ import javax.swing.border.Border;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000n\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\005\b\002\030\0002\0020\001B+\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\f\020\006\032\b\022\004\022\0020\b0\007\022\006\020\t\032\0020\n¢\006\002\020\013J\b\020\021\032\0020\022H\024J\b\020\023\032\0020\024H\026J\022\020\025\032\004\030\0010\0262\006\020\027\032\0020\030H\026J\020\020\031\032\0020\0322\006\020\033\032\0020\034H\002J\016\020\035\032\0020\0322\006\020\036\032\0020\037J\020\020 \032\0020\0322\006\020!\032\0020\"H\024J\006\020#\032\0020\032J\006\020$\032\0020\032J\006\020%\032\0020\032J\020\020&\032\0020\0322\006\020!\032\0020\022H\024R!\020\f\032\025\022\f\022\n \017*\004\030\0010\0160\0160\r¢\006\002\b\020X\004¢\006\002\n\000R\024\020\006\032\b\022\004\022\0020\b0\007X\004¢\006\002\n\000¨\006'"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInput;", "Lcom/intellij/ui/EditorTextField;", "parent", "Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputWithButton;", "project", "Lcom/intellij/openapi/project/Project;", "listeners", "", "Lcom/intellij/openapi/editor/event/DocumentListener;", "disposable", "Lcom/intellij/openapi/Disposable;", "(Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputWithButton;Lcom/intellij/openapi/project/Project;Ljava/util/List;Lcom/intellij/openapi/Disposable;)V", "editorListeners", "Lcom/intellij/util/EventDispatcher;", "Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputListener;", "kotlin.jvm.PlatformType", "Lorg/jetbrains/annotations/NotNull;", "createEditor", "Lcom/intellij/openapi/editor/ex/EditorEx;", "getBackground", "Ljava/awt/Color;", "getData", "", "dataId", "", "initializeDocumentListeners", "", "document", "Lcom/intellij/openapi/editor/Document;", "isViewOnly", "isIt", "", "onEditorAdded", "editor", "Lcom/intellij/openapi/editor/Editor;", "recreateDocument", "setDefaultPlaceholderText", "setWaitingText", "setupBorder", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nAIAssistantInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIAssistantInput.kt\ncom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInput\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,350:1\n1855#2,2:351\n1#3:353\n*S KotlinDebug\n*F\n+ 1 AIAssistantInput.kt\ncom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInput\n*L\n250#1:351,2\n*E\n"})
/*     */ final class AIAssistantInput
/*     */   extends EditorTextField
/*     */ {
/*     */   @NotNull
/*     */   private final List<DocumentListener> listeners;
/*     */   @NotNull
/*     */   private final EventDispatcher<AIAssistantInputListener> editorListeners;
/*     */   
/*     */   public AIAssistantInput(@NotNull AIAssistantInputWithButton parent, @NotNull Project project, @NotNull List<DocumentListener> listeners, @NotNull Disposable disposable) {
/* 183 */     super(project, (FileType)FileTypes.PLAIN_TEXT); this.listeners = listeners;
/* 184 */     this.editorListeners = parent.getEditorListeners$intellij_ml_llm();
/*     */ 
/*     */     
/* 187 */     setOneLineMode(false);
/*     */     
/* 189 */     setFontInheritedFromLAF(true);
/*     */     
/* 191 */     addSettingsProvider(AIAssistantInput::_init_$lambda$0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 213 */     Shortcut[] arrayOfShortcut = new Shortcut[2]; arrayOfShortcut[0] = (Shortcut)new KeyboardShortcut(KeyStroke.getKeyStroke(10, 64), null); arrayOfShortcut[1] = 
/* 214 */       (Shortcut)new KeyboardShortcut(KeyStroke.getKeyStroke(10, 128), null); DumbAwareAction.create(new Function1<AnActionEvent, Unit>(project) { public final void invoke(AnActionEvent it) { // Byte code:
/*     */             //   0: aload_0
/*     */             //   1: getfield this$0 : Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInput;
/*     */             //   4: invokevirtual getEditor : ()Lcom/intellij/openapi/editor/Editor;
/*     */             //   7: dup
/*     */             //   8: ifnull -> 51
/*     */             //   11: astore_2
/*     */             //   12: aload_0
/*     */             //   13: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */             //   16: astore_3
/*     */             //   17: aload_0
/*     */             //   18: getfield this$0 : Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInput;
/*     */             //   21: astore #4
/*     */             //   23: aload_2
/*     */             //   24: astore #5
/*     */             //   26: iconst_0
/*     */             //   27: istore #6
/*     */             //   29: invokestatic getInstance : ()Lcom/intellij/openapi/command/CommandProcessor;
/*     */             //   32: aload_3
/*     */             //   33: aload #5
/*     */             //   35: aload #4
/*     */             //   37: <illegal opcode> run : (Lcom/intellij/openapi/editor/Editor;Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInput;)Ljava/lang/Runnable;
/*     */             //   42: aconst_null
/*     */             //   43: aconst_null
/*     */             //   44: invokevirtual executeCommand : (Lcom/intellij/openapi/project/Project;Ljava/lang/Runnable;Ljava/lang/String;Ljava/lang/Object;)V
/*     */             //   47: nop
/*     */             //   48: goto -> 53
/*     */             //   51: pop
/*     */             //   52: nop
/*     */             //   53: return
/*     */             // Line number table:
/*     */             //   Java source line number -> byte code offset
/*     */             //   #201	-> 0
/*     */             //   #202	-> 29
/*     */             //   #210	-> 42
/*     */             //   #202	-> 44
/*     */             //   #211	-> 47
/*     */             //   #201	-> 48
/*     */             //   #201	-> 51
/*     */             //   #212	-> 53
/*     */             // Local variable table:
/*     */             //   start	length	slot	name	descriptor
/*     */             //   29	19	6	$i$a$-let-AIAssistantInput$2$1	I
/*     */             //   26	22	5	it	Lcom/intellij/openapi/editor/Editor;
/*     */             //   0	54	0	this	Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInput$2;
/*     */             //   0	54	1	it	Lcom/intellij/openapi/actionSystem/AnActionEvent; } private static final void invoke$lambda$2$lambda$1(Editor $it, AIAssistantInput this$0) { // Byte code:
/*     */             //   0: aload_0
/*     */             //   1: ldc '$it'
/*     */             //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */             //   6: aload_1
/*     */             //   7: ldc 'this$0'
/*     */             //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */             //   12: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*     */             //   15: aload_0
/*     */             //   16: aload_1
/*     */             //   17: <illegal opcode> run : (Lcom/intellij/openapi/editor/Editor;Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInput;)Ljava/lang/Runnable;
/*     */             //   22: invokeinterface runWriteAction : (Ljava/lang/Runnable;)V
/*     */             //   27: return
/*     */             // Line number table:
/*     */             //   Java source line number -> byte code offset
/*     */             //   #203	-> 12
/*     */             //   #210	-> 27
/*     */             // Local variable table:
/*     */             //   start	length	slot	name	descriptor
/*     */             //   0	28	0	$it	Lcom/intellij/openapi/editor/Editor;
/*     */             //   0	28	1	this$0	Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInput; } private static final void invoke$lambda$2$lambda$1$lambda$0(Editor $it, AIAssistantInput this$0) { Intrinsics.checkNotNullParameter($it, "$it"); Intrinsics.checkNotNullParameter(AIAssistantInput.this, "this$0"); String eol = "\n"; int caretOffset = $it.getCaretModel().getOffset(); AIAssistantInput.this.getDocument().insertString(caretOffset, eol); $it.getCaretModel().moveToOffset(caretOffset + eol.length()); EditorModificationUtil.scrollToCaret($it); } }
/* 215 */         ::_init_$lambda$1).registerCustomShortcutSet((ShortcutSet)new CustomShortcutSet(arrayOfShortcut), (JComponent)this);
/*     */ 
/*     */     
/* 218 */     Intrinsics.checkNotNullExpressionValue(AnActionListener.TOPIC, "TOPIC"); project.getMessageBus().connect(disposable).subscribe(AnActionListener.TOPIC, new AnActionListener(parent)
/*     */         {
/* 220 */           public void afterActionPerformed(@NotNull AnAction action, @NotNull AnActionEvent event, @NotNull AnActionResult result) { Intrinsics.checkNotNullParameter(action, "action"); Intrinsics.checkNotNullParameter(event, "event"); Intrinsics.checkNotNullParameter(result, "result"); if (event.getDataContext().getData(CommonDataKeys.EDITOR) != AIAssistantInput.this.getEditor())
/* 221 */               return;  if (!(action instanceof com.intellij.openapi.editor.actions.EnterAction))
/*     */               return; 
/* 223 */             ((AIAssistantInputListener)AIAssistantInput.this.editorListeners.getMulticaster()).onSubmit(this.$parent, AIAssistantInputTrigger.Key); }
/*     */         });
/*     */   } private static final void _init_$lambda$0(EditorEx it) { it.putUserData(IncrementalFindAction.SEARCH_DISABLED, Boolean.valueOf(true)); it.getColorsScheme().setLineSpacing(1.0F); it.getSettings().setUseSoftWraps(true);
/*     */     it.getSettings().setPaintSoftWraps(false);
/*     */     it.setEmbeddedIntoDialogWrapper(true);
/*     */     it.getContentComponent().setOpaque(false); } private static final void _init_$lambda$1(Function1 $tmp0, Object p0) { Intrinsics.checkNotNullParameter($tmp0, "$tmp0");
/* 229 */     $tmp0.invoke(p0); } @NotNull public Color getBackground() { getEditor().getColorsScheme(); if (((getEditor() != null && getEditor().getColorsScheme() != null) ? getEditor().getColorsScheme().getDefaultBackground() : null) == null) { (getEditor() != null && getEditor().getColorsScheme() != null) ? getEditor().getColorsScheme().getDefaultBackground() : null; Intrinsics.checkNotNullExpressionValue(super.getBackground(), "super.getBackground()"); }  return super.getBackground(); }
/*     */   
/*     */   public final void recreateDocument() {
/*     */     Document inputDocument;
/* 233 */     LightVirtualFile lightVirtualFile1 = new LightVirtualFile("AIAssistantInput-" + UUID.randomUUID(), AIAssistantUIUtil.INSTANCE.findLanguage("Markdown"), ""), $this$recreateDocument_u24lambda_u242 = lightVirtualFile1; int $i$a$-apply-AIAssistantInput$recreateDocument$inputDocument$1 = 0;
/* 234 */     if (Intrinsics.areEqual($this$recreateDocument_u24lambda_u242.getFileType(), UnknownFileType.INSTANCE)) $this$recreateDocument_u24lambda_u242.setFileType((FileType)PlainTextFileType.INSTANCE); 
/* 235 */     if (VirtualFileUtil.findDocument((VirtualFile)lightVirtualFile1) == null) { VirtualFileUtil.findDocument((VirtualFile)lightVirtualFile1); throw new IllegalStateException("Can't create inmemory document".toString()); }
/*     */     
/* 237 */     initializeDocumentListeners(inputDocument);
/* 238 */     setDocument(inputDocument);
/*     */   }
/*     */   
/*     */   private final void initializeDocumentListeners(Document document) {
/* 242 */     document.addDocumentListener(new AIAssistantInput$initializeDocumentListeners$1(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 250 */     Iterable<DocumentListener> $this$forEach$iv = this.listeners; int $i$f$forEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 351 */     Iterator<DocumentListener> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); DocumentListener it = (DocumentListener)element$iv; int $i$a$-forEach-AIAssistantInput$initializeDocumentListeners$2 = 0;
/*     */       document.addDocumentListener(it); }
/*     */   
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/core/chat/ui/chat/AIAssistantInput$initializeDocumentListeners$1", "Lcom/intellij/openapi/editor/event/DocumentListener;", "documentChanged", "", "event", "Lcom/intellij/openapi/editor/event/DocumentEvent;", "intellij.ml.llm"})
/*     */   public static final class AIAssistantInput$initializeDocumentListeners$1 implements DocumentListener {
/*     */     AIAssistantInput$initializeDocumentListeners$1(AIAssistantInput $receiver) {}
/*     */     
/*     */     public void documentChanged(@NotNull DocumentEvent event) {
/*     */       Intrinsics.checkNotNullParameter(event, "event");
/*     */       if (this.$document.getTextLength() == 0)
/*     */         AIAssistantInput.this.setPlaceholder(LLMBundle.message("chat.placeholder.label.initial.text", new Object[0])); 
/*     */     }
/*     */   }
/*     */   
/*     */   public final void setDefaultPlaceholderText() {
/*     */     setPlaceholder(LLMBundle.message("chat.placeholder.label.initial.text", new Object[0]));
/*     */   }
/*     */   
/*     */   public final void setWaitingText() {
/*     */     setPlaceholder(LLMBundle.message("chat.placeholder.label.waiting.text", new Object[0]));
/*     */   }
/*     */   
/*     */   protected void onEditorAdded(@NotNull Editor editor) {
/*     */     Intrinsics.checkNotNullParameter(editor, "editor");
/*     */     ((AIAssistantInputListener)this.editorListeners.getMulticaster()).editorAdded((EditorEx)editor);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   protected EditorEx createEditor() {
/*     */     Intrinsics.checkNotNullExpressionValue(super.createEditor(), "super.createEditor()");
/*     */     EditorEx editorEx1 = super.createEditor(), $this$createEditor_u24lambda_u244 = editorEx1;
/*     */     int $i$a$-apply-AIAssistantInput$createEditor$1 = 0;
/*     */     $this$createEditor_u24lambda_u244.setVerticalScrollbarVisible(true);
/*     */     setBorder((Border)JBUI.Borders.empty());
/*     */     $this$createEditor_u24lambda_u244.setShowPlaceholderWhenFocused(true);
/*     */     $this$createEditor_u24lambda_u244.setPlaceholder(LLMBundle.message("chat.placeholder.label.initial.text", new Object[0]));
/*     */     $this$createEditor_u24lambda_u244.getCaretModel().moveToOffset(0);
/*     */     $this$createEditor_u24lambda_u244.getScrollPane().setBorder(getBorder());
/*     */     $this$createEditor_u24lambda_u244.getContentComponent().setOpaque(false);
/*     */     return editorEx1;
/*     */   }
/*     */   
/*     */   public final void isViewOnly(boolean isIt) {
/*     */     Editor editor = getEditor();
/*     */     if (((editor instanceof com.intellij.openapi.editor.impl.EditorImpl) ? editor : null) == null) {
/*     */       (editor instanceof com.intellij.openapi.editor.impl.EditorImpl) ? editor : null;
/*     */     } else {
/*     */       ((editor instanceof com.intellij.openapi.editor.impl.EditorImpl) ? editor : null).setViewer(isIt);
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object getData(@NotNull String dataId) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'dataId'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: getstatic com/intellij/openapi/actionSystem/PlatformCoreDataKeys.FILE_EDITOR : Lcom/intellij/openapi/actionSystem/DataKey;
/*     */     //   10: aload_1
/*     */     //   11: invokevirtual is : (Ljava/lang/String;)Z
/*     */     //   14: ifeq -> 50
/*     */     //   17: aload_0
/*     */     //   18: invokevirtual getEditor : ()Lcom/intellij/openapi/editor/Editor;
/*     */     //   21: dup
/*     */     //   22: ifnull -> 43
/*     */     //   25: astore_2
/*     */     //   26: iconst_0
/*     */     //   27: istore_3
/*     */     //   28: getstatic com/intellij/openapi/fileEditor/impl/text/TextEditorProvider.Companion : Lcom/intellij/openapi/fileEditor/impl/text/TextEditorProvider$Companion;
/*     */     //   31: invokevirtual getInstance : ()Lcom/intellij/openapi/fileEditor/impl/text/TextEditorProvider;
/*     */     //   34: aload_2
/*     */     //   35: invokevirtual getTextEditor : (Lcom/intellij/openapi/editor/Editor;)Lcom/intellij/openapi/fileEditor/TextEditor;
/*     */     //   38: nop
/*     */     //   39: dup
/*     */     //   40: ifnonnull -> 49
/*     */     //   43: pop
/*     */     //   44: aload_0
/*     */     //   45: aload_1
/*     */     //   46: invokespecial getData : (Ljava/lang/String;)Ljava/lang/Object;
/*     */     //   49: areturn
/*     */     //   50: aload_0
/*     */     //   51: aload_1
/*     */     //   52: invokespecial getData : (Ljava/lang/String;)Ljava/lang/Object;
/*     */     //   55: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #284	-> 7
/*     */     //   #285	-> 17
/*     */     //   #353	-> 26
/*     */     //   #285	-> 28
/*     */     //   #285	-> 38
/*     */     //   #285	-> 39
/*     */     //   #287	-> 50
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   28	10	3	$i$a$-let-AIAssistantInput$getData$1	I
/*     */     //   26	12	2	it	Lcom/intellij/openapi/editor/Editor;
/*     */     //   0	56	0	this	Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInput;
/*     */     //   0	56	1	dataId	Ljava/lang/String;
/*     */   }
/*     */   
/*     */   protected void setupBorder(@NotNull EditorEx editor) {
/*     */     Intrinsics.checkNotNullParameter(editor, "editor");
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/chat/AIAssistantInput.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */