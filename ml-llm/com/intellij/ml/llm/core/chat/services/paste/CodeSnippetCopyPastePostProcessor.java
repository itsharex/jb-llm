/*    */ package com.intellij.ml.llm.core.chat.services.paste;
/*    */ 
/*    */ import com.intellij.codeInsight.editorActions.CopyPastePostProcessor;
/*    */ import com.intellij.codeInsight.editorActions.TextBlockTransferableData;
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.editor.RangeMarker;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.util.Ref;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import java.awt.datatransfer.Transferable;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import java.util.Locale;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020!\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\025\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\020\013\n\002\b\002\b\000\030\0002\b\022\004\022\0020\0020\001B\005¢\006\002\020\003J.\020\004\032\b\022\004\022\0020\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\013H\026J\026\020\r\032\b\022\004\022\0020\0020\0052\006\020\016\032\0020\017H\026JH\020\020\032\0020\0212\006\020\022\032\0020\0232\006\020\b\032\0020\t2\006\020\024\032\0020\0252\006\020\026\032\0020\0272\016\020\030\032\n\022\006\b\000\022\0020\0320\0312\016\020\033\032\n\022\006\b\001\022\0020\0020\005H\026¨\006\034"}, d2 = {"Lcom/intellij/ml/llm/core/chat/services/paste/CodeSnippetCopyPastePostProcessor;", "Lcom/intellij/codeInsight/editorActions/CopyPastePostProcessor;", "Lcom/intellij/codeInsight/editorActions/TextBlockTransferableData;", "()V", "collectTransferableData", "", "file", "Lcom/intellij/psi/PsiFile;", "editor", "Lcom/intellij/openapi/editor/Editor;", "startOffsets", "", "endOffsets", "extractTransferableData", "content", "Ljava/awt/datatransfer/Transferable;", "processTransferableData", "", "project", "Lcom/intellij/openapi/project/Project;", "bounds", "Lcom/intellij/openapi/editor/RangeMarker;", "caretOffset", "", "indented", "Lcom/intellij/openapi/util/Ref;", "", "values", "intellij.ml.llm"})
/*    */ public final class CodeSnippetCopyPastePostProcessor
/*    */   extends CopyPastePostProcessor<TextBlockTransferableData>
/*    */ {
/*    */   @NotNull
/*    */   public List<TextBlockTransferableData> collectTransferableData(@NotNull PsiFile file, @NotNull Editor editor, @NotNull int[] startOffsets, @NotNull int[] endOffsets) {
/* 37 */     Intrinsics.checkNotNullParameter(file, "file"); Intrinsics.checkNotNullParameter(editor, "editor"); Intrinsics.checkNotNullParameter(startOffsets, "startOffsets"); Intrinsics.checkNotNullParameter(endOffsets, "endOffsets"); if (CodeSnippetCopyPastePostProcessorKt.access$isAIAssistInput(editor)) return new ArrayList<>(); 
/* 38 */     TextBlockTransferableData[] arrayOfTextBlockTransferableData = new TextBlockTransferableData[1]; Intrinsics.checkNotNullExpressionValue(file.getLanguage(), "file.language"); arrayOfTextBlockTransferableData[0] = new AIAssistantPasteData(file.getLanguage()); return CollectionsKt.mutableListOf((Object[])arrayOfTextBlockTransferableData);
/*    */   }
/*    */   @NotNull
/*    */   public List<TextBlockTransferableData> extractTransferableData(@NotNull Transferable content) {
/* 42 */     Intrinsics.checkNotNullParameter(content, "content"); try {
/* 43 */       if (content.isDataFlavorSupported(AIAssistantPasteData.Companion.getDATA_FLAVOR())) {
/* 44 */         TextBlockTransferableData[] arrayOfTextBlockTransferableData = new TextBlockTransferableData[1]; Intrinsics.checkNotNull(content.getTransferData(AIAssistantPasteData.Companion.getDATA_FLAVOR()), "null cannot be cast to non-null type com.intellij.codeInsight.editorActions.TextBlockTransferableData"); arrayOfTextBlockTransferableData[0] = (TextBlockTransferableData)content.getTransferData(AIAssistantPasteData.Companion.getDATA_FLAVOR()); return CollectionsKt.mutableListOf((Object[])arrayOfTextBlockTransferableData);
/*    */       }
/*    */     
/* 47 */     } catch (Throwable e) {
/* 48 */       if (e instanceof com.intellij.openapi.diagnostic.ControlFlowException) throw e; 
/*    */     } 
/* 50 */     return new ArrayList<>();
/*    */   }
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
/*    */   public void processTransferableData(@NotNull Project project, @NotNull Editor editor, @NotNull RangeMarker bounds, int caretOffset, @NotNull Ref indented, @NotNull List values) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'project'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_2
/*    */     //   7: ldc 'editor'
/*    */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: aload_3
/*    */     //   13: ldc 'bounds'
/*    */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   18: aload #5
/*    */     //   20: ldc 'indented'
/*    */     //   22: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   25: aload #6
/*    */     //   27: ldc 'values'
/*    */     //   29: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   32: aload #6
/*    */     //   34: invokestatic single : (Ljava/util/List;)Ljava/lang/Object;
/*    */     //   37: dup
/*    */     //   38: ldc 'null cannot be cast to non-null type com.intellij.ml.llm.core.chat.services.paste.AIAssistantPasteData'
/*    */     //   40: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   43: checkcast com/intellij/ml/llm/core/chat/services/paste/AIAssistantPasteData
/*    */     //   46: astore #7
/*    */     //   48: aload_2
/*    */     //   49: invokestatic access$isAIAssistInput : (Lcom/intellij/openapi/editor/Editor;)Z
/*    */     //   52: ifne -> 56
/*    */     //   55: return
/*    */     //   56: getstatic com/intellij/ml/llm/core/statistics/fus/AIAssistantChatEventLogger.Companion : Lcom/intellij/ml/llm/core/statistics/fus/AIAssistantChatEventLogger$Companion;
/*    */     //   59: aload_1
/*    */     //   60: invokevirtual logCodeInserted : (Lcom/intellij/openapi/project/Project;)V
/*    */     //   63: aload_1
/*    */     //   64: invokestatic getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/psi/PsiDocumentManager;
/*    */     //   67: aload_2
/*    */     //   68: invokeinterface getDocument : ()Lcom/intellij/openapi/editor/Document;
/*    */     //   73: invokevirtual getPsiFile : (Lcom/intellij/openapi/editor/Document;)Lcom/intellij/psi/PsiFile;
/*    */     //   76: dup
/*    */     //   77: ifnull -> 90
/*    */     //   80: iload #4
/*    */     //   82: invokeinterface findElementAt : (I)Lcom/intellij/psi/PsiElement;
/*    */     //   87: goto -> 92
/*    */     //   90: pop
/*    */     //   91: aconst_null
/*    */     //   92: astore #8
/*    */     //   94: aload #8
/*    */     //   96: ifnull -> 126
/*    */     //   99: getstatic org/intellij/plugins/markdown/injection/MarkdownCodeFenceUtils.INSTANCE : Lorg/intellij/plugins/markdown/injection/MarkdownCodeFenceUtils;
/*    */     //   102: aload #8
/*    */     //   104: invokeinterface getNode : ()Lcom/intellij/lang/ASTNode;
/*    */     //   109: dup
/*    */     //   110: ldc 'currentElement.node'
/*    */     //   112: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   115: invokevirtual inCodeFence : (Lcom/intellij/lang/ASTNode;)Z
/*    */     //   118: istore #9
/*    */     //   120: iload #9
/*    */     //   122: ifeq -> 126
/*    */     //   125: return
/*    */     //   126: aload_2
/*    */     //   127: invokeinterface getDocument : ()Lcom/intellij/openapi/editor/Document;
/*    */     //   132: aload_3
/*    */     //   133: invokeinterface getTextRange : ()Lcom/intellij/openapi/util/TextRange;
/*    */     //   138: invokeinterface getText : (Lcom/intellij/openapi/util/TextRange;)Ljava/lang/String;
/*    */     //   143: dup
/*    */     //   144: ldc 'editor.document.getText(bounds.textRange)'
/*    */     //   146: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   149: checkcast java/lang/CharSequence
/*    */     //   152: bipush #10
/*    */     //   154: iconst_0
/*    */     //   155: iconst_2
/*    */     //   156: aconst_null
/*    */     //   157: invokestatic contains$default : (Ljava/lang/CharSequence;CZILjava/lang/Object;)Z
/*    */     //   160: istore #9
/*    */     //   162: iload #9
/*    */     //   164: ifeq -> 172
/*    */     //   167: ldc '```'
/*    */     //   169: goto -> 174
/*    */     //   172: ldc '`'
/*    */     //   174: astore #10
/*    */     //   176: aload_2
/*    */     //   177: invokestatic access$getTICKS_LEN_KEY$p : ()Lcom/intellij/openapi/util/Key;
/*    */     //   180: aload #10
/*    */     //   182: invokevirtual length : ()I
/*    */     //   185: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   188: invokeinterface putUserData : (Lcom/intellij/openapi/util/Key;Ljava/lang/Object;)V
/*    */     //   193: aload_1
/*    */     //   194: invokestatic writeCommandAction : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/command/WriteCommandAction$Builder;
/*    */     //   197: iload #9
/*    */     //   199: aload_2
/*    */     //   200: aload_3
/*    */     //   201: aload #10
/*    */     //   203: aload #7
/*    */     //   205: <illegal opcode> run : (ZLcom/intellij/openapi/editor/Editor;Lcom/intellij/openapi/editor/RangeMarker;Ljava/lang/String;Lcom/intellij/ml/llm/core/chat/services/paste/AIAssistantPasteData;)Lcom/intellij/util/ThrowableRunnable;
/*    */     //   210: invokeinterface run : (Lcom/intellij/util/ThrowableRunnable;)V
/*    */     //   215: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #59	-> 32
/*    */     //   #60	-> 48
/*    */     //   #61	-> 56
/*    */     //   #62	-> 63
/*    */     //   #63	-> 94
/*    */     //   #64	-> 99
/*    */     //   #65	-> 120
/*    */     //   #66	-> 125
/*    */     //   #70	-> 126
/*    */     //   #71	-> 162
/*    */     //   #73	-> 176
/*    */     //   #75	-> 193
/*    */     //   #85	-> 215
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   120	6	9	inCodeFence	Z
/*    */     //   48	168	7	data	Lcom/intellij/ml/llm/core/chat/services/paste/AIAssistantPasteData;
/*    */     //   94	122	8	currentElement	Lcom/intellij/psi/PsiElement;
/*    */     //   162	54	9	hasLineBreaks	Z
/*    */     //   176	40	10	ticks	Ljava/lang/String;
/*    */     //   0	216	0	this	Lcom/intellij/ml/llm/core/chat/services/paste/CodeSnippetCopyPastePostProcessor;
/*    */     //   0	216	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   0	216	2	editor	Lcom/intellij/openapi/editor/Editor;
/*    */     //   0	216	3	bounds	Lcom/intellij/openapi/editor/RangeMarker;
/*    */     //   0	216	4	caretOffset	I
/*    */     //   0	216	5	indented	Lcom/intellij/openapi/util/Ref;
/*    */     //   0	216	6	values	Ljava/util/List;
/*    */   }
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
/*    */   private static final void processTransferableData$lambda$0(boolean $hasLineBreaks, Editor $editor, RangeMarker $bounds, String $ticks, AIAssistantPasteData $data) {
/* 76 */     Intrinsics.checkNotNullParameter($editor, "$editor"); Intrinsics.checkNotNullParameter($bounds, "$bounds"); Intrinsics.checkNotNullParameter($ticks, "$ticks"); Intrinsics.checkNotNullParameter($data, "$data"); if ($hasLineBreaks) {
/* 77 */       Intrinsics.checkNotNullExpressionValue($data.getLanguage().getID(), "data.language.id"); Intrinsics.checkNotNullExpressionValue($data.getLanguage().getID().toLowerCase(Locale.ROOT), "this as java.lang.String).toLowerCase(Locale.ROOT)"); $editor.getDocument().insertString($bounds.getStartOffset(), "\n" + $ticks + $data.getLanguage().getID().toLowerCase(Locale.ROOT) + "\n");
/* 78 */       $editor.getDocument().insertString($bounds.getEndOffset(), "\n" + $ticks + "\n");
/*    */     } else {
/*    */       
/* 81 */       $editor.getDocument().insertString($bounds.getStartOffset(), $ticks);
/* 82 */       $editor.getDocument().insertString($bounds.getEndOffset(), $ticks);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/services/paste/CodeSnippetCopyPastePostProcessor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */