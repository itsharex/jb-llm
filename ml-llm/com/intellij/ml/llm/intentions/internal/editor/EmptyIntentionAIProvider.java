/*     */ package com.intellij.ml.llm.intentions.internal.editor;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMBaseRequest;
/*     */ import com.intellij.ml.llm.core.statistics.CommonLoggerService;
/*     */ import com.intellij.ml.llm.core.statistics.CompositeStatisticsIdeActivity;
/*     */ import com.intellij.openapi.editor.Document;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.editor.SelectionModel;
/*     */ import com.intellij.openapi.editor.event.DocumentEvent;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.util.TextRange;
/*     */ import com.intellij.psi.PsiDocumentManager;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import com.intellij.psi.PsiNameIdentifierOwner;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.Regex;
/*     */ import kotlin.text.StringsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\007\030\0002\0020\001B\005¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\004H\002J\030\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\002J,\020\f\032\0020\r2\006\020\016\032\0020\0172\b\020\n\032\004\030\0010\0132\b\020\020\032\004\030\0010\0212\006\020\005\032\0020\004H\026J\020\020\022\032\0020\0042\006\020\005\032\0020\004H\002J8\020\023\032\0020\0242\006\020\016\032\0020\0172\006\020\020\032\0020\0212\006\020\025\032\0020\0042\006\020\n\032\0020\0132\006\020\026\032\0020\0072\006\020\027\032\0020\004H\002J(\020\030\032\0020\0242\006\020\016\032\0020\0172\006\020\031\032\0020\0042\006\020\b\032\0020\t2\006\020\026\032\0020\007H\002J\020\020\032\032\004\030\0010\004*\004\030\0010\004H\002¨\006\033"}, d2 = {"Lcom/intellij/ml/llm/intentions/internal/editor/EmptyIntentionAIProvider;", "Lcom/intellij/codeInsight/daemon/impl/EmptyIntentionProvider;", "()V", "getInstruction", "", "template", "getLineTextRange", "Lcom/intellij/openapi/util/TextRange;", "document", "Lcom/intellij/openapi/editor/Document;", "editor", "Lcom/intellij/openapi/editor/Editor;", "invoke", "", "project", "Lcom/intellij/openapi/project/Project;", "file", "Lcom/intellij/psi/PsiFile;", "normalizedTemplate", "transform", "", "text", "textRange", "instruction", "updateDocument", "suggestion", "normalize", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nEmptyIntentionAIProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmptyIntentionAIProvider.kt\ncom/intellij/ml/llm/intentions/internal/editor/EmptyIntentionAIProvider\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,127:1\n361#2,7:128\n361#2,7:135\n*S KotlinDebug\n*F\n+ 1 EmptyIntentionAIProvider.kt\ncom/intellij/ml/llm/intentions/internal/editor/EmptyIntentionAIProvider\n*L\n101#1:128,7\n102#1:135,7\n*E\n"})
/*     */ public final class EmptyIntentionAIProvider implements EmptyIntentionProvider {
/*     */   public boolean invoke(@NotNull Project project, @Nullable Editor editor, @Nullable PsiFile file, @NotNull String template) {
/*  27 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(template, "template"); if (editor == null || file == null) return false; 
/*  28 */     Intrinsics.checkNotNullExpressionValue(editor.getDocument(), "editor.document"); Document document = editor.getDocument();
/*  29 */     Intrinsics.checkNotNullExpressionValue(editor.getSelectionModel(), "editor.selectionModel"); SelectionModel selectionModel = editor.getSelectionModel();
/*  30 */     String selectedText = selectionModel.getSelectedText();
/*  31 */     String normalizedTemplate = normalizedTemplate(template);
/*     */     
/*  33 */     CharSequence charSequence = selectedText; if (!((charSequence == null || StringsKt.isBlank(charSequence)) ? 1 : 0)) {
/*  34 */       Intrinsics.checkNotNullExpressionValue(TextRange.create(selectionModel.getSelectionStart(), selectionModel.getSelectionEnd()), "create(selectionModel.se…ectionModel.selectionEnd)"); TextRange textRange = TextRange.create(selectionModel.getSelectionStart(), selectionModel.getSelectionEnd());
/*  35 */       transform(project, file, selectedText, editor, textRange, getInstruction(normalizedTemplate));
/*     */     } else {
/*     */       
/*  38 */       PsiNameIdentifierOwner namedElement = (PsiNameIdentifierOwner)PsiTreeUtil.getParentOfType(PsiUtilBase.getElementAtCaret(editor), PsiNameIdentifierOwner.class);
/*     */       
/*  40 */       if (namedElement != null) {
/*  41 */         String queryText = namedElement.getText();
/*  42 */         String instructionText = getInstruction(normalizedTemplate);
/*  43 */         TextRange textRange = namedElement.getTextRange();
/*  44 */         selectionModel.setSelection(textRange.getStartOffset(), textRange.getEndOffset());
/*  45 */         Intrinsics.checkNotNullExpressionValue(queryText, "queryText"); Intrinsics.checkNotNullExpressionValue(textRange, "textRange"); transform(project, file, queryText, editor, textRange, instructionText);
/*     */       } else {
/*     */         
/*  48 */         selectionModel.selectLineAtCaret();
/*  49 */         TextRange textRange = getLineTextRange(document, editor);
/*  50 */         Intrinsics.checkNotNullExpressionValue(document.getText(textRange), "document.getText(textRange)"); transform(project, file, document.getText(textRange), editor, textRange, getInstruction(normalizedTemplate));
/*     */       } 
/*     */     } 
/*  53 */     return true;
/*     */   }
/*     */   private final String normalizedTemplate(String template) {
/*  56 */     Intrinsics.checkNotNullExpressionValue(StringUtil.removeHtmlTags(template), "removeHtmlTags(template)");
/*     */ 
/*     */     
/*  59 */     return StringsKt.trim(StringsKt.replace$default(StringsKt.replace$default(StringUtil.removeHtmlTags(template), "#ref", "", false, 4, null), "#loc", "", false, 4, null)).toString();
/*     */   }
/*     */   private final String getInstruction(String template) {
/*  62 */     return "// Fix the bug \"" + template + "\" in the below code\n\n";
/*     */   }
/*     */   
/*     */   private final TextRange getLineTextRange(Document document, Editor editor) {
/*  66 */     int lineNumber = document.getLineNumber(editor.getCaretModel().getOffset());
/*  67 */     int startOffset = document.getLineStartOffset(lineNumber);
/*  68 */     int endOffset = document.getLineEndOffset(lineNumber);
/*  69 */     Intrinsics.checkNotNullExpressionValue(TextRange.create(startOffset, endOffset), "create(startOffset, endOffset)"); return TextRange.create(startOffset, endOffset);
/*     */   }
/*     */   
/*     */   private final void transform(Project project, PsiFile file, String text, Editor editor, TextRange textRange, String instruction) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: invokeinterface getCaretModel : ()Lcom/intellij/openapi/editor/CaretModel;
/*     */     //   7: invokeinterface getOffset : ()I
/*     */     //   12: istore #7
/*     */     //   14: getstatic com/intellij/ml/llm/intentions/internal/editor/EmptyIntentionProviderManager.Companion : Lcom/intellij/ml/llm/intentions/internal/editor/EmptyIntentionProviderManager$Companion;
/*     */     //   17: aload_1
/*     */     //   18: invokevirtual getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/ml/llm/intentions/internal/editor/EmptyIntentionProviderManager;
/*     */     //   21: astore #8
/*     */     //   23: aload_1
/*     */     //   24: invokestatic getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/fileEditor/FileEditorManager;
/*     */     //   27: aload_2
/*     */     //   28: invokeinterface getOriginalFile : ()Lcom/intellij/psi/PsiFile;
/*     */     //   33: invokeinterface getVirtualFile : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   38: invokevirtual getSelectedEditor : (Lcom/intellij/openapi/vfs/VirtualFile;)Lcom/intellij/openapi/fileEditor/FileEditor;
/*     */     //   41: dup
/*     */     //   42: ldc 'null cannot be cast to non-null type com.intellij.openapi.fileEditor.TextEditor'
/*     */     //   44: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   47: checkcast com/intellij/openapi/fileEditor/TextEditor
/*     */     //   50: invokeinterface getEditor : ()Lcom/intellij/openapi/editor/Editor;
/*     */     //   55: invokeinterface getDocument : ()Lcom/intellij/openapi/editor/Document;
/*     */     //   60: astore #10
/*     */     //   62: aload #10
/*     */     //   64: ldc 'FileEditorManager.getIns…xtEditor).editor.document'
/*     */     //   66: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   69: aload #10
/*     */     //   71: astore #9
/*     */     //   73: aload #9
/*     */     //   75: new com/intellij/ml/llm/intentions/internal/editor/EmptyIntentionAIProvider$transform$1
/*     */     //   78: dup
/*     */     //   79: aload #8
/*     */     //   81: aload #9
/*     */     //   83: invokespecial <init> : (Lcom/intellij/ml/llm/intentions/internal/editor/EmptyIntentionProviderManager;Lcom/intellij/openapi/editor/Document;)V
/*     */     //   86: checkcast com/intellij/openapi/editor/event/DocumentListener
/*     */     //   89: invokeinterface addDocumentListener : (Lcom/intellij/openapi/editor/event/DocumentListener;)V
/*     */     //   94: aload_2
/*     */     //   95: invokeinterface isPhysical : ()Z
/*     */     //   100: ifeq -> 185
/*     */     //   103: aload #8
/*     */     //   105: invokevirtual getMap : ()Ljava/util/Map;
/*     */     //   108: aload #9
/*     */     //   110: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   115: checkcast java/util/Map
/*     */     //   118: astore #10
/*     */     //   120: aload #10
/*     */     //   122: ifnull -> 185
/*     */     //   125: aload #10
/*     */     //   127: iload #7
/*     */     //   129: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   132: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   137: checkcast java/util/Map
/*     */     //   140: astore #11
/*     */     //   142: aload #11
/*     */     //   144: ifnull -> 185
/*     */     //   147: aload #11
/*     */     //   149: aload #6
/*     */     //   151: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   156: checkcast java/lang/String
/*     */     //   159: astore #12
/*     */     //   161: aload #12
/*     */     //   163: ifnull -> 185
/*     */     //   166: aload #12
/*     */     //   168: astore #14
/*     */     //   170: iconst_0
/*     */     //   171: istore #15
/*     */     //   173: aload_0
/*     */     //   174: aload_1
/*     */     //   175: aload #14
/*     */     //   177: aload #9
/*     */     //   179: aload #5
/*     */     //   181: invokespecial updateDocument : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Lcom/intellij/openapi/editor/Document;Lcom/intellij/openapi/util/TextRange;)V
/*     */     //   184: return
/*     */     //   185: getstatic com/intellij/ml/llm/core/statistics/CommonLoggerService.Companion : Lcom/intellij/ml/llm/core/statistics/CommonLoggerService$Companion;
/*     */     //   188: invokevirtual getInstance : ()Lcom/intellij/ml/llm/core/statistics/CommonLoggerService;
/*     */     //   191: aload_1
/*     */     //   192: aconst_null
/*     */     //   193: aconst_null
/*     */     //   194: bipush #6
/*     */     //   196: aconst_null
/*     */     //   197: invokestatic logEditStarted$default : (Lcom/intellij/ml/llm/core/statistics/CommonLoggerService;Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiElement;Lcom/intellij/lang/Language;ILjava/lang/Object;)Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */     //   200: astore #10
/*     */     //   202: new com/intellij/ml/llm/intentions/internal/editor/EmptyIntentionAIProvider$transform$onRequestSent$1
/*     */     //   205: dup
/*     */     //   206: aload #10
/*     */     //   208: invokespecial <init> : (Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;)V
/*     */     //   211: checkcast kotlin/jvm/functions/Function1
/*     */     //   214: astore #11
/*     */     //   216: aload_0
/*     */     //   217: aload_1
/*     */     //   218: aload_3
/*     */     //   219: aload #6
/*     */     //   221: aconst_null
/*     */     //   222: aconst_null
/*     */     //   223: aload #11
/*     */     //   225: aconst_null
/*     */     //   226: bipush #88
/*     */     //   228: aconst_null
/*     */     //   229: invokestatic sendEditRequest$default : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/core/models/requestResponse/LLMRequestProvider;ILjava/lang/Object;)Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseResponse;
/*     */     //   232: astore #13
/*     */     //   234: aload #13
/*     */     //   236: ifnull -> 276
/*     */     //   239: aload #13
/*     */     //   241: invokeinterface getSuggestions : ()Ljava/util/List;
/*     */     //   246: astore #14
/*     */     //   248: aload #14
/*     */     //   250: ifnull -> 276
/*     */     //   253: aload #14
/*     */     //   255: invokestatic firstOrNull : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   258: checkcast com/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice
/*     */     //   261: astore #15
/*     */     //   263: aload #15
/*     */     //   265: ifnull -> 276
/*     */     //   268: aload #15
/*     */     //   270: invokevirtual getText : ()Ljava/lang/String;
/*     */     //   273: goto -> 277
/*     */     //   276: aconst_null
/*     */     //   277: invokespecial normalize : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   280: astore #12
/*     */     //   282: aload #12
/*     */     //   284: ifnull -> 464
/*     */     //   287: aload #12
/*     */     //   289: astore #14
/*     */     //   291: iconst_0
/*     */     //   292: istore #15
/*     */     //   294: aload_0
/*     */     //   295: aload_1
/*     */     //   296: aload #14
/*     */     //   298: aload #4
/*     */     //   300: invokeinterface getDocument : ()Lcom/intellij/openapi/editor/Document;
/*     */     //   305: dup
/*     */     //   306: ldc 'editor.document'
/*     */     //   308: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   311: aload #5
/*     */     //   313: invokespecial updateDocument : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Lcom/intellij/openapi/editor/Document;Lcom/intellij/openapi/util/TextRange;)V
/*     */     //   316: aload #8
/*     */     //   318: invokevirtual getMap : ()Ljava/util/Map;
/*     */     //   321: astore #16
/*     */     //   323: nop
/*     */     //   324: iconst_0
/*     */     //   325: istore #17
/*     */     //   327: aload #16
/*     */     //   329: aload #9
/*     */     //   331: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   336: astore #18
/*     */     //   338: aload #18
/*     */     //   340: ifnonnull -> 376
/*     */     //   343: iconst_0
/*     */     //   344: istore #19
/*     */     //   346: new java/util/LinkedHashMap
/*     */     //   349: dup
/*     */     //   350: invokespecial <init> : ()V
/*     */     //   353: checkcast java/util/Map
/*     */     //   356: nop
/*     */     //   357: astore #19
/*     */     //   359: aload #16
/*     */     //   361: aload #9
/*     */     //   363: aload #19
/*     */     //   365: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   370: pop
/*     */     //   371: aload #19
/*     */     //   373: goto -> 378
/*     */     //   376: aload #18
/*     */     //   378: nop
/*     */     //   379: checkcast java/util/Map
/*     */     //   382: astore #16
/*     */     //   384: iload #7
/*     */     //   386: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   389: astore #17
/*     */     //   391: nop
/*     */     //   392: iconst_0
/*     */     //   393: istore #18
/*     */     //   395: aload #16
/*     */     //   397: aload #17
/*     */     //   399: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   404: astore #19
/*     */     //   406: aload #19
/*     */     //   408: ifnonnull -> 444
/*     */     //   411: iconst_0
/*     */     //   412: istore #20
/*     */     //   414: new java/util/LinkedHashMap
/*     */     //   417: dup
/*     */     //   418: invokespecial <init> : ()V
/*     */     //   421: checkcast java/util/Map
/*     */     //   424: nop
/*     */     //   425: astore #20
/*     */     //   427: aload #16
/*     */     //   429: aload #17
/*     */     //   431: aload #20
/*     */     //   433: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   438: pop
/*     */     //   439: aload #20
/*     */     //   441: goto -> 446
/*     */     //   444: aload #19
/*     */     //   446: nop
/*     */     //   447: checkcast java/util/Map
/*     */     //   450: aload #6
/*     */     //   452: aload #14
/*     */     //   454: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   459: pop
/*     */     //   460: nop
/*     */     //   461: goto -> 465
/*     */     //   464: nop
/*     */     //   465: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #73	-> 0
/*     */     //   #74	-> 14
/*     */     //   #75	-> 23
/*     */     //   #76	-> 27
/*     */     //   #75	-> 38
/*     */     //   #76	-> 50
/*     */     //   #75	-> 62
/*     */     //   #78	-> 73
/*     */     //   #85	-> 94
/*     */     //   #86	-> 103
/*     */     //   #87	-> 173
/*     */     //   #88	-> 184
/*     */     //   #92	-> 185
/*     */     //   #93	-> 202
/*     */     //   #98	-> 216
/*     */     //   #97	-> 216
/*     */     //   #96	-> 217
/*     */     //   #97	-> 234
/*     */     //   #96	-> 239
/*     */     //   #97	-> 241
/*     */     //   #98	-> 282
/*     */     //   #97	-> 287
/*     */     //   #98	-> 289
/*     */     //   #99	-> 294
/*     */     //   #100	-> 316
/*     */     //   #101	-> 323
/*     */     //   #128	-> 327
/*     */     //   #129	-> 338
/*     */     //   #130	-> 343
/*     */     //   #101	-> 346
/*     */     //   #101	-> 356
/*     */     //   #130	-> 357
/*     */     //   #131	-> 359
/*     */     //   #132	-> 371
/*     */     //   #134	-> 376
/*     */     //   #129	-> 378
/*     */     //   #102	-> 391
/*     */     //   #135	-> 395
/*     */     //   #136	-> 406
/*     */     //   #137	-> 411
/*     */     //   #102	-> 414
/*     */     //   #102	-> 424
/*     */     //   #137	-> 425
/*     */     //   #138	-> 427
/*     */     //   #139	-> 439
/*     */     //   #141	-> 444
/*     */     //   #136	-> 446
/*     */     //   #100	-> 450
/*     */     //   #103	-> 460
/*     */     //   #98	-> 461
/*     */     //   #98	-> 464
/*     */     //   #104	-> 465
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   173	12	15	$i$a$-let-EmptyIntentionAIProvider$transform$2	I
/*     */     //   170	15	14	it	Ljava/lang/String;
/*     */     //   346	11	19	$i$a$-getOrPut-EmptyIntentionAIProvider$transform$3$1	I
/*     */     //   359	14	19	answer$iv	Ljava/lang/Object;
/*     */     //   327	52	17	$i$f$getOrPut	I
/*     */     //   338	41	18	value$iv	Ljava/lang/Object;
/*     */     //   324	55	16	$this$getOrPut$iv	Ljava/util/Map;
/*     */     //   414	11	20	$i$a$-getOrPut-EmptyIntentionAIProvider$transform$3$2	I
/*     */     //   427	14	20	answer$iv	Ljava/lang/Object;
/*     */     //   395	52	18	$i$f$getOrPut	I
/*     */     //   406	41	19	value$iv	Ljava/lang/Object;
/*     */     //   392	55	16	$this$getOrPut$iv	Ljava/util/Map;
/*     */     //   392	55	17	key$iv	Ljava/lang/Object;
/*     */     //   294	167	15	$i$a$-let-EmptyIntentionAIProvider$transform$3	I
/*     */     //   291	170	14	it	Ljava/lang/String;
/*     */     //   14	452	7	offset	I
/*     */     //   23	443	8	manager	Lcom/intellij/ml/llm/intentions/internal/editor/EmptyIntentionProviderManager;
/*     */     //   73	393	9	originalDocument	Lcom/intellij/openapi/editor/Document;
/*     */     //   202	264	10	activity	Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */     //   216	250	11	onRequestSent	Lkotlin/jvm/functions/Function1;
/*     */     //   0	466	0	this	Lcom/intellij/ml/llm/intentions/internal/editor/EmptyIntentionAIProvider;
/*     */     //   0	466	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   0	466	2	file	Lcom/intellij/psi/PsiFile;
/*     */     //   0	466	3	text	Ljava/lang/String;
/*     */     //   0	466	4	editor	Lcom/intellij/openapi/editor/Editor;
/*     */     //   0	466	5	textRange	Lcom/intellij/openapi/util/TextRange;
/*     */     //   0	466	6	instruction	Ljava/lang/String;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/intentions/internal/editor/EmptyIntentionAIProvider$transform$1", "Lcom/intellij/openapi/editor/event/DocumentListener;", "documentChanged", "", "event", "Lcom/intellij/openapi/editor/event/DocumentEvent;", "intellij.ml.llm"})
/*     */   public static final class EmptyIntentionAIProvider$transform$1 implements DocumentListener { EmptyIntentionAIProvider$transform$1(EmptyIntentionProviderManager $manager, Document $originalDocument) {}
/*     */     
/*     */     public void documentChanged(@NotNull DocumentEvent event) {
/*  80 */       Intrinsics.checkNotNullParameter(event, "event"); this.$manager.getMap().remove(this.$originalDocument);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\n\020\002\032\006\022\002\b\0030\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "request", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseRequest;", "invoke"})
/*     */   @SourceDebugExtension({"SMAP\nEmptyIntentionAIProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmptyIntentionAIProvider.kt\ncom/intellij/ml/llm/intentions/internal/editor/EmptyIntentionAIProvider$transform$onRequestSent$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,127:1\n1#2:128\n*E\n"})
/*     */   static final class EmptyIntentionAIProvider$transform$onRequestSent$1
/*     */     extends Lambda
/*     */     implements Function1<LLMBaseRequest<?>, Unit>
/*     */   {
/*     */     public final void invoke(@NotNull LLMBaseRequest request) {
/*  94 */       Intrinsics.checkNotNullParameter(request, "request"); CompositeStatisticsIdeActivity it = this.$activity;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 128 */       int $i$a$-let-EmptyIntentionAIProvider$transform$onRequestSent$1$1 = 0;
/*     */       CommonLoggerService.logSendEditRequest$default(CommonLoggerService.Companion.getInstance(), it, request.getBody(), null, null, 12, null);
/*     */     }
/*     */     
/*     */     EmptyIntentionAIProvider$transform$onRequestSent$1(CompositeStatisticsIdeActivity $activity) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   private final String normalize(String $this$normalize) {
/*     */     if ($this$normalize != null) {
/*     */       CharSequence charSequence = $this$normalize;
/*     */       Regex regex = new Regex("```\\w*\\n");
/*     */       String str = "";
/*     */       if (regex.replace(charSequence, str) != null);
/*     */     } 
/*     */     StringsKt.replace$default(regex.replace(charSequence, str), "```", "", false, 4, null);
/*     */     return null;
/*     */   }
/*     */   
/*     */   private final void updateDocument(Project project, String suggestion, Document document, TextRange textRange) {
/*     */     document.replaceString(textRange.getStartOffset(), textRange.getEndOffset(), suggestion);
/*     */     PsiDocumentManager.getInstance(project).commitDocument(document);
/*     */     PsiFile psiFile = PsiDocumentManager.getInstance(project).getPsiFile(document);
/*     */     PsiFile it = psiFile;
/*     */     int $i$a$-let-EmptyIntentionAIProvider$updateDocument$1 = 0;
/*     */     TextRange reformatRange = new TextRange(textRange.getStartOffset(), textRange.getStartOffset() + suggestion.length());
/*     */     CodeStyleManager.getInstance(project).reformatText(it, CollectionsKt.listOf(reformatRange));
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/internal/editor/EmptyIntentionAIProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */