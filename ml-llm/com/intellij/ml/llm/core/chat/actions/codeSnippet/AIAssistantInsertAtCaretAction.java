/*    */ package com.intellij.ml.llm.core.chat.actions.codeSnippet;
/*    */ 
/*    */ import com.intellij.codeInsight.editorActions.TypingActionsExtension;
/*    */ import com.intellij.openapi.actionSystem.ActionUpdateThread;
/*    */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.editor.SelectionModel;
/*    */ import com.intellij.openapi.editor.impl.EditorCopyPasteHelperImpl;
/*    */ import com.intellij.openapi.fileEditor.FileEditorManager;
/*    */ import com.intellij.openapi.project.DumbAwareAction;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.util.TextRange;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\b\000\030\0002\0020\001B\005¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\006H\026J\b\020\007\032\0020\bH\026J\020\020\t\032\0020\n2\006\020\013\032\0020\fH\002J\020\020\r\032\0020\0042\006\020\005\032\0020\006H\026¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/core/chat/actions/codeSnippet/AIAssistantInsertAtCaretAction;", "Lcom/intellij/openapi/project/DumbAwareAction;", "()V", "actionPerformed", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "getActionUpdateThread", "Lcom/intellij/openapi/actionSystem/ActionUpdateThread;", "getTextToPaste", "", "editor", "Lcom/intellij/openapi/editor/Editor;", "update", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nAIAssistantInsertAtCaretAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIAssistantInsertAtCaretAction.kt\ncom/intellij/ml/llm/core/chat/actions/codeSnippet/AIAssistantInsertAtCaretAction\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1#2:79\n*E\n"})
/*    */ public final class AIAssistantInsertAtCaretAction
/*    */   extends DumbAwareAction
/*    */ {
/*    */   public void actionPerformed(@NotNull AnActionEvent e) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'e'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*    */     //   10: dup
/*    */     //   11: ifnonnull -> 16
/*    */     //   14: pop
/*    */     //   15: return
/*    */     //   16: astore_2
/*    */     //   17: aload_1
/*    */     //   18: getstatic com/intellij/openapi/actionSystem/PlatformDataKeys.EDITOR : Lcom/intellij/openapi/actionSystem/DataKey;
/*    */     //   21: invokevirtual getData : (Lcom/intellij/openapi/actionSystem/DataKey;)Ljava/lang/Object;
/*    */     //   24: checkcast com/intellij/openapi/editor/Editor
/*    */     //   27: dup
/*    */     //   28: ifnonnull -> 33
/*    */     //   31: pop
/*    */     //   32: return
/*    */     //   33: astore_3
/*    */     //   34: aload_0
/*    */     //   35: aload_3
/*    */     //   36: invokespecial getTextToPaste : (Lcom/intellij/openapi/editor/Editor;)Ljava/lang/String;
/*    */     //   39: astore #4
/*    */     //   41: aload_2
/*    */     //   42: invokestatic getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/fileEditor/FileEditorManager;
/*    */     //   45: invokevirtual getSelectedTextEditor : ()Lcom/intellij/openapi/editor/Editor;
/*    */     //   48: dup
/*    */     //   49: ifnonnull -> 54
/*    */     //   52: pop
/*    */     //   53: return
/*    */     //   54: astore #5
/*    */     //   56: aload #5
/*    */     //   58: invokeinterface getCaretModel : ()Lcom/intellij/openapi/editor/CaretModel;
/*    */     //   63: invokeinterface getLogicalPosition : ()Lcom/intellij/openapi/editor/LogicalPosition;
/*    */     //   68: getfield column : I
/*    */     //   71: istore #6
/*    */     //   73: aload_2
/*    */     //   74: invokestatic getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/psi/PsiDocumentManager;
/*    */     //   77: aload_3
/*    */     //   78: invokeinterface getDocument : ()Lcom/intellij/openapi/editor/Document;
/*    */     //   83: invokevirtual getPsiFile : (Lcom/intellij/openapi/editor/Document;)Lcom/intellij/psi/PsiFile;
/*    */     //   86: astore #7
/*    */     //   88: aload #7
/*    */     //   90: ifnull -> 107
/*    */     //   93: getstatic com/intellij/lang/LanguageFormatting.INSTANCE : Lcom/intellij/lang/LanguageFormatting;
/*    */     //   96: aload #7
/*    */     //   98: checkcast com/intellij/psi/PsiElement
/*    */     //   101: invokevirtual forContext : (Lcom/intellij/psi/PsiElement;)Lcom/intellij/formatting/FormattingModelBuilder;
/*    */     //   104: ifnonnull -> 111
/*    */     //   107: iconst_2
/*    */     //   108: goto -> 112
/*    */     //   111: iconst_3
/*    */     //   112: istore #8
/*    */     //   114: aload_2
/*    */     //   115: invokestatic writeCommandAction : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/command/WriteCommandAction$Builder;
/*    */     //   118: aload #5
/*    */     //   120: aload #4
/*    */     //   122: <illegal opcode> compute : (Lcom/intellij/openapi/editor/Editor;Ljava/lang/String;)Lcom/intellij/openapi/util/ThrowableComputable;
/*    */     //   127: invokeinterface compute : (Lcom/intellij/openapi/util/ThrowableComputable;)Ljava/lang/Object;
/*    */     //   132: checkcast com/intellij/openapi/util/TextRange
/*    */     //   135: astore #9
/*    */     //   137: aload_1
/*    */     //   138: invokevirtual getDataContext : ()Lcom/intellij/openapi/actionSystem/DataContext;
/*    */     //   141: getstatic com/intellij/ml/llm/core/chat/messages/CompletableMessage.Companion : Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage$Companion;
/*    */     //   144: invokevirtual getKey : ()Lcom/intellij/openapi/actionSystem/DataKey;
/*    */     //   147: invokeinterface getData : (Lcom/intellij/openapi/actionSystem/DataKey;)Ljava/lang/Object;
/*    */     //   152: checkcast com/intellij/ml/llm/core/chat/messages/CompletableMessage
/*    */     //   155: astore #10
/*    */     //   157: aload_1
/*    */     //   158: invokevirtual getDataContext : ()Lcom/intellij/openapi/actionSystem/DataContext;
/*    */     //   161: getstatic com/intellij/ml/llm/core/chat/session/ChatSession.Companion : Lcom/intellij/ml/llm/core/chat/session/ChatSession$Companion;
/*    */     //   164: invokevirtual getCurrentSession : ()Lcom/intellij/openapi/actionSystem/DataKey;
/*    */     //   167: invokeinterface getData : (Lcom/intellij/openapi/actionSystem/DataKey;)Ljava/lang/Object;
/*    */     //   172: checkcast com/intellij/ml/llm/core/chat/session/ChatSession
/*    */     //   175: astore #11
/*    */     //   177: aload #10
/*    */     //   179: ifnull -> 198
/*    */     //   182: aload #11
/*    */     //   184: ifnull -> 198
/*    */     //   187: getstatic com/intellij/ml/llm/core/statistics/fus/AIAssistantChatEventLogger.Companion : Lcom/intellij/ml/llm/core/statistics/fus/AIAssistantChatEventLogger$Companion;
/*    */     //   190: aload_2
/*    */     //   191: aload #11
/*    */     //   193: aload #10
/*    */     //   195: invokevirtual logCodeInsertedAtCaret : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/chat/session/ChatSession;Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;)V
/*    */     //   198: aload_2
/*    */     //   199: aload #5
/*    */     //   201: invokestatic findForContext : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Editor;)Lcom/intellij/codeInsight/editorActions/TypingActionsExtension;
/*    */     //   204: dup
/*    */     //   205: ldc 'findForContext(project, selectedTextEditor)'
/*    */     //   207: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   210: astore #12
/*    */     //   212: aload_2
/*    */     //   213: invokestatic writeCommandAction : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/command/WriteCommandAction$Builder;
/*    */     //   216: aload #12
/*    */     //   218: aload_2
/*    */     //   219: aload #5
/*    */     //   221: iload #8
/*    */     //   223: aload #9
/*    */     //   225: iload #6
/*    */     //   227: <illegal opcode> run : (Lcom/intellij/codeInsight/editorActions/TypingActionsExtension;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Editor;ILcom/intellij/openapi/util/TextRange;I)Lcom/intellij/util/ThrowableRunnable;
/*    */     //   232: invokeinterface run : (Lcom/intellij/util/ThrowableRunnable;)V
/*    */     //   237: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #24	-> 6
/*    */     //   #25	-> 17
/*    */     //   #26	-> 34
/*    */     //   #27	-> 41
/*    */     //   #29	-> 56
/*    */     //   #30	-> 73
/*    */     //   #32	-> 88
/*    */     //   #33	-> 111
/*    */     //   #32	-> 112
/*    */     //   #31	-> 112
/*    */     //   #35	-> 114
/*    */     //   #41	-> 137
/*    */     //   #42	-> 157
/*    */     //   #43	-> 177
/*    */     //   #44	-> 187
/*    */     //   #46	-> 198
/*    */     //   #47	-> 212
/*    */     //   #53	-> 237
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   17	221	2	project	Lcom/intellij/openapi/project/Project;
/*    */     //   34	204	3	editor	Lcom/intellij/openapi/editor/Editor;
/*    */     //   41	197	4	textToPaste	Ljava/lang/String;
/*    */     //   56	182	5	selectedTextEditor	Lcom/intellij/openapi/editor/Editor;
/*    */     //   73	165	6	column	I
/*    */     //   88	150	7	psiFile	Lcom/intellij/psi/PsiFile;
/*    */     //   114	124	8	indentOptions	I
/*    */     //   137	101	9	pastedRange	Lcom/intellij/openapi/util/TextRange;
/*    */     //   157	81	10	message	Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;
/*    */     //   177	61	11	chatSession	Lcom/intellij/ml/llm/core/chat/session/ChatSession;
/*    */     //   212	26	12	extensions	Lcom/intellij/codeInsight/editorActions/TypingActionsExtension;
/*    */     //   0	238	0	this	Lcom/intellij/ml/llm/core/chat/actions/codeSnippet/AIAssistantInsertAtCaretAction;
/*    */     //   0	238	1	e	Lcom/intellij/openapi/actionSystem/AnActionEvent;
/*    */   }
/*    */   
/*    */   private static final TextRange actionPerformed$lambda$1(Editor $selectedTextEditor, String $textToPaste) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc_w '$selectedTextEditor'
/*    */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   7: aload_1
/*    */     //   8: ldc_w '$textToPaste'
/*    */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   14: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*    */     //   17: aload_0
/*    */     //   18: aload_1
/*    */     //   19: <illegal opcode> compute : (Lcom/intellij/openapi/editor/Editor;Ljava/lang/String;)Lcom/intellij/openapi/util/Computable;
/*    */     //   24: invokeinterface runWriteAction : (Lcom/intellij/openapi/util/Computable;)Ljava/lang/Object;
/*    */     //   29: checkcast com/intellij/openapi/util/TextRange
/*    */     //   32: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #36	-> 14
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	33	0	$selectedTextEditor	Lcom/intellij/openapi/editor/Editor;
/*    */     //   0	33	1	$textToPaste	Ljava/lang/String;
/*    */   }
/*    */   
/*    */   private static final TextRange actionPerformed$lambda$1$lambda$0(Editor $selectedTextEditor, String $textToPaste) {
/* 38 */     Intrinsics.checkNotNullParameter($selectedTextEditor, "$selectedTextEditor"); Intrinsics.checkNotNullParameter($textToPaste, "$textToPaste"); return EditorCopyPasteHelperImpl.insertStringAtCaret($selectedTextEditor, $textToPaste);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static final void actionPerformed$lambda$3(TypingActionsExtension $extensions, Project $project, Editor $selectedTextEditor, int $indentOptions, TextRange $pastedRange, int $column) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc_w '$extensions'
/*    */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   7: aload_1
/*    */     //   8: ldc_w '$project'
/*    */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   14: aload_2
/*    */     //   15: ldc_w '$selectedTextEditor'
/*    */     //   18: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   21: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*    */     //   24: aload_0
/*    */     //   25: aload_1
/*    */     //   26: aload_2
/*    */     //   27: iload_3
/*    */     //   28: aload #4
/*    */     //   30: iload #5
/*    */     //   32: <illegal opcode> run : (Lcom/intellij/codeInsight/editorActions/TypingActionsExtension;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Editor;ILcom/intellij/openapi/util/TextRange;I)Ljava/lang/Runnable;
/*    */     //   37: invokeinterface runWriteAction : (Ljava/lang/Runnable;)V
/*    */     //   42: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #48	-> 21
/*    */     //   #52	-> 42
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	43	0	$extensions	Lcom/intellij/codeInsight/editorActions/TypingActionsExtension;
/*    */     //   0	43	1	$project	Lcom/intellij/openapi/project/Project;
/*    */     //   0	43	2	$selectedTextEditor	Lcom/intellij/openapi/editor/Editor;
/*    */     //   0	43	3	$indentOptions	I
/*    */     //   0	43	4	$pastedRange	Lcom/intellij/openapi/util/TextRange;
/*    */     //   0	43	5	$column	I
/*    */   }
/*    */ 
/*    */   
/*    */   private static final void actionPerformed$lambda$3$lambda$2(TypingActionsExtension $extensions, Project $project, Editor $selectedTextEditor, int $indentOptions, TextRange $pastedRange, int $column) {
/* 49 */     Intrinsics.checkNotNullParameter($extensions, "$extensions"); Intrinsics.checkNotNullParameter($project, "$project"); Intrinsics.checkNotNullParameter($selectedTextEditor, "$selectedTextEditor"); $extensions.format($project, $selectedTextEditor, $indentOptions, $pastedRange.getStartOffset(), $pastedRange.getEndOffset(), 
/* 50 */         $column, true);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private final String getTextToPaste(Editor editor) {
/* 56 */     SelectionModel selectionModel1 = editor.getSelectionModel(), it = selectionModel1;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 79 */     int $i$a$-takeIf-AIAssistantInsertAtCaretAction$getTextToPaste$1 = 0;
/*    */     it.hasSelection() ? selectionModel1 : null;
/*    */     String str = ((it.hasSelection() ? selectionModel1 : null) != null) ? (it.hasSelection() ? selectionModel1 : null).getSelectedText() : null;
/*    */     Intrinsics.checkNotNullExpressionValue(editor.getDocument().getText(), "editor.document.text");
/*    */     return (str == null) ? StringsKt.trimEnd(editor.getDocument().getText()).toString() : str;
/*    */   }
/*    */   
/*    */   public void update(@NotNull AnActionEvent e) {
/*    */     Project project;
/*    */     Editor selectedTextEditor;
/*    */     Intrinsics.checkNotNullParameter(e, "e");
/*    */     if (e.getProject() == null) {
/*    */       e.getProject();
/*    */       int $i$a$-run-AIAssistantInsertAtCaretAction$update$project$1 = 0;
/*    */       e.getPresentation().setEnabled(false);
/*    */       return;
/*    */     } 
/*    */     if (FileEditorManager.getInstance(project).getSelectedTextEditor() == null) {
/*    */       FileEditorManager.getInstance(project).getSelectedTextEditor();
/*    */       int $i$a$-run-AIAssistantInsertAtCaretAction$update$selectedTextEditor$1 = 0;
/*    */       e.getPresentation().setEnabled(false);
/*    */       return;
/*    */     } 
/*    */     if (!selectedTextEditor.getDocument().isWritable()) {
/*    */       e.getPresentation().setEnabled(false);
/*    */       return;
/*    */     } 
/*    */     e.getPresentation().setEnabled(true);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public ActionUpdateThread getActionUpdateThread() {
/*    */     return ActionUpdateThread.BGT;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/actions/codeSnippet/AIAssistantInsertAtCaretAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */