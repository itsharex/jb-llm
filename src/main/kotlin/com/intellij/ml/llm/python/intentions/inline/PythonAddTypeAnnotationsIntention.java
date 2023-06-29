/*     */ package com.intellij.ml.llm.python.intentions.inline;
/*     */ 
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMBaseResponse;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMResponseChoice;
/*     */ import com.intellij.ml.llm.python.PythonLLMBundle;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.editor.Document;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.progress.ProgressIndicator;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.util.TextRange;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import com.jetbrains.python.psi.PyFunction;
/*     */ import com.jetbrains.python.psi.PyIndentUtil;
/*     */ import com.jetbrains.python.psi.PyParameter;
/*     */ import java.util.Collection;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.text.StringsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\003\030\000 \0272\0020\001:\001\027B\005¢\006\002\020\002J\b\020\b\032\0020\007H\026J\022\020\t\032\004\030\0010\n2\006\020\013\032\0020\fH\002J\b\020\r\032\0020\007H\026J%\020\016\032\0020\0172\006\020\020\032\0020\0212\b\020\013\032\004\030\0010\f2\b\020\022\032\004\030\0010\023H\002J$\020\024\032\0020\0252\006\020\020\032\0020\0212\b\020\013\032\004\030\0010\f2\b\020\022\032\004\030\0010\023H\026J\b\020\026\032\0020\025H\026R\023\020\003\032\0070\004¢\006\002\b\005X\004¢\006\002\n\000R\016\020\006\032\0020\007XD¢\006\002\n\000¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/python/intentions/inline/PythonAddTypeAnnotationsIntention;", "Lcom/intellij/codeInsight/intention/IntentionAction;", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "Lorg/jetbrains/annotations/NotNull;", "writeActionGroupId", "", "getFamilyName", "getPyFunctionAtCaret", "Lcom/jetbrains/python/psi/PyFunction;", "editor", "Lcom/intellij/openapi/editor/Editor;", "getText", "invoke", "", "project", "Lcom/intellij/openapi/project/Project;", "file", "Lcom/intellij/psi/PsiFile;", "isAvailable", "", "startInWriteAction", "Companion", "intellij.ml.llm.python"})
/*     */ @SourceDebugExtension({"SMAP\nPythonAddTypeAnnotationsIntention.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PythonAddTypeAnnotationsIntention.kt\ncom/intellij/ml/llm/python/intentions/inline/PythonAddTypeAnnotationsIntention\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n1549#2:123\n1620#2,3:124\n*S KotlinDebug\n*F\n+ 1 PythonAddTypeAnnotationsIntention.kt\ncom/intellij/ml/llm/python/intentions/inline/PythonAddTypeAnnotationsIntention\n*L\n56#1:123\n56#1:124,3\n*E\n"})
/*     */ public final class PythonAddTypeAnnotationsIntention implements IntentionAction {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   
/*  32 */   public PythonAddTypeAnnotationsIntention() { Intrinsics.checkNotNullExpressionValue(Logger.getInstance("#com.intellij.ml.llm"), "getInstance(\"#com.intellij.ml.llm\")"); this.logger = Logger.getInstance("#com.intellij.ml.llm");
/*     */     
/*  34 */     this.writeActionGroupId = "python.add.type.annotations.write.action"; } @NotNull
/*     */   private final Logger logger; @NotNull
/*  36 */   private final String writeActionGroupId; public boolean startInWriteAction() { return false; }
/*     */   @NotNull
/*  38 */   public String getFamilyName() { return PythonLLMBundle.message("intentions.add.type.annotations.family.name", new Object[0]); } @NotNull
/*     */   public String getText() {
/*  40 */     return PythonLLMBundle.message("intentions.add.type.annotations.name", new Object[0]);
/*     */   }
/*     */   public boolean isAvailable(@NotNull Project project, @Nullable Editor editor, @Nullable PsiFile file) {
/*  43 */     Intrinsics.checkNotNullParameter(project, "project"); if (!Registry.is("llm.is.internal")) return false; 
/*  44 */     if (editor == null || file == null) return false; 
/*  45 */     PyFunction function = getPyFunctionAtCaret(editor);
/*  46 */     return (function != null);
/*     */   } public void invoke(@NotNull Project project, @Nullable Editor editor, @Nullable PsiFile file) {
/*     */     PyFunction function;
/*     */     String functionName;
/*  50 */     Intrinsics.checkNotNullParameter(project, "project"); if (!isAvailable(project, editor, file))
/*  51 */       return;  if (editor == null)
/*  52 */       return;  if (getPyFunctionAtCaret(editor) == null) { getPyFunctionAtCaret(editor); return; }
/*  53 */      if (function.getName() == null) { function.getName(); return; }
/*     */     
/*  55 */     Intrinsics.checkNotNullExpressionValue(PyIndentUtil.changeIndent(function.getText(), true, StringsKt.repeat(" ", 4)), "changeIndent(function.text, true, \" \".repeat(4))"); String functionText = PyIndentUtil.changeIndent(function.getText(), true, StringsKt.repeat(" ", 4));
/*  56 */     Intrinsics.checkNotNullExpressionValue(function.getParameterList().getParameters(), "function.parameterList.parameters"); Iterable $this$map$iv = ArraysKt.toList((Object[])function.getParameterList().getParameters()); int $i$f$map = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 123 */     Iterable iterable1 = $this$map$iv; Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 124 */     for (Object item$iv$iv : iterable1) {
/* 125 */       PyParameter pyParameter = (PyParameter)item$iv$iv; Collection collection = destination$iv$iv; int $i$a$-map-PythonAddTypeAnnotationsIntention$invoke$1 = 0; pyParameter.getAsNamed();
/* 126 */     }  (List)destination$iv$iv;
/*     */     String str1 = LLMBundle.message("intentions.request.background.process.title", new Object[0]);
/*     */     PythonAddTypeAnnotationsIntention$invoke$task$1 task = new PythonAddTypeAnnotationsIntention$invoke$task$1(function, functionName, functionText, this, editor, str1);
/*     */     ProgressManager.getInstance().runProcessWithProgressAsynchronously(task, (ProgressIndicator)new BackgroundableProcessIndicator(task));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/python/intentions/inline/PythonAddTypeAnnotationsIntention$invoke$task$1", "Lcom/intellij/openapi/progress/Task$Backgroundable;", "run", "", "indicator", "Lcom/intellij/openapi/progress/ProgressIndicator;", "intellij.ml.llm.python"})
/*     */   public static final class PythonAddTypeAnnotationsIntention$invoke$task$1 extends Task.Backgroundable {
/*     */     PythonAddTypeAnnotationsIntention$invoke$task$1(PyFunction $function, String $functionName, String $functionText, PythonAddTypeAnnotationsIntention $receiver, Editor $editor, String $super_call_param$1) {
/*     */       super($project, $super_call_param$1);
/*     */     }
/*     */     
/*     */     public void run(@NotNull ProgressIndicator indicator) {
/*     */       Intrinsics.checkNotNullParameter(indicator, "indicator");
/*     */       String usagesText = PythonContextUtils.INSTANCE.getFunctionUsagesText(this.$function);
/*     */       String instruction = StringsKt.trimIndent("\nAdd return value and parameters type annotations for function (" + this.$functionName + ")\n\nUsages of the " + this.$functionName + ":\n" + usagesText + "   \n          ");
/*     */       LLMBaseResponse response = SenderKt.sendEditRequest$default(this.$project, this.$functionText, instruction, null, null, null, null, 120, null);
/*     */       if (response != null) {
/*     */         LLMResponseChoice lLMResponseChoice1 = (LLMResponseChoice)CollectionsKt.firstOrNull(response.getSuggestions());
/*     */         PythonAddTypeAnnotationsIntention pythonAddTypeAnnotationsIntention = PythonAddTypeAnnotationsIntention.this;
/*     */         Project project = this.$project;
/*     */         PyFunction pyFunction = this.$function;
/*     */         Editor editor = this.$editor;
/*     */         LLMResponseChoice it = lLMResponseChoice1;
/*     */         int $i$a$-let-PythonAddTypeAnnotationsIntention$invoke$task$1$run$1 = 0;
/*     */         pythonAddTypeAnnotationsIntention.logger.info("Suggested change: " + it);
/*     */         ActionsKt.invokeLater$default(null, new PythonAddTypeAnnotationsIntention$invoke$task$1$run$1$1(pythonAddTypeAnnotationsIntention, it, pyFunction, editor), 1, null);
/*     */         (LLMResponseChoice)CollectionsKt.firstOrNull(response.getSuggestions());
/*     */       } 
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*     */     static final class PythonAddTypeAnnotationsIntention$invoke$task$1$run$1$1 extends Lambda implements Function0<Unit> {
/*     */       public final void invoke() {
/*     */         // Byte code:
/*     */         //   0: aload_0
/*     */         //   1: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */         //   4: ldc 'intentions.write.documentation.write.action.name'
/*     */         //   6: iconst_0
/*     */         //   7: anewarray java/lang/Object
/*     */         //   10: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */         //   13: aload_0
/*     */         //   14: getfield this$0 : Lcom/intellij/ml/llm/python/intentions/inline/PythonAddTypeAnnotationsIntention;
/*     */         //   17: invokestatic access$getWriteActionGroupId$p : (Lcom/intellij/ml/llm/python/intentions/inline/PythonAddTypeAnnotationsIntention;)Ljava/lang/String;
/*     */         //   20: aload_0
/*     */         //   21: getfield $it : Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;
/*     */         //   24: aload_0
/*     */         //   25: getfield $function : Lcom/jetbrains/python/psi/PyFunction;
/*     */         //   28: aload_0
/*     */         //   29: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */         //   32: aload_0
/*     */         //   33: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*     */         //   36: <illegal opcode> run : (Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;Lcom/jetbrains/python/psi/PyFunction;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Editor;)Ljava/lang/Runnable;
/*     */         //   41: iconst_0
/*     */         //   42: anewarray com/intellij/psi/PsiFile
/*     */         //   45: invokestatic runWriteCommandAction : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;[Lcom/intellij/psi/PsiFile;)V
/*     */         //   48: return
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #81	-> 0
/*     */         //   #82	-> 13
/*     */         //   #81	-> 20
/*     */         //   #95	-> 48
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   0	49	0	this	Lcom/intellij/ml/llm/python/intentions/inline/PythonAddTypeAnnotationsIntention$invoke$task$1$run$1$1;
/*     */       }
/*     */       
/*     */       private static final void invoke$lambda$0(LLMResponseChoice $it, PyFunction $function, Project $project, Editor $editor) {
/*     */         Intrinsics.checkNotNullParameter($it, "$it");
/*     */         Intrinsics.checkNotNullParameter($function, "$function");
/*     */         Intrinsics.checkNotNullParameter($project, "$project");
/*     */         Intrinsics.checkNotNullExpressionValue(StringUtil.convertLineSeparators($it.getText()), "convertLineSeparators(it.text)");
/*     */         String suggestion = StringUtil.convertLineSeparators($it.getText());
/*     */         Intrinsics.checkNotNullExpressionValue($function.getStatementList(), "function.statementList");
/*     */         TextRange textRange = new TextRange($function.getTextRange().getStartOffset(), UtilsKt.getStartOffset((PsiElement)$function.getStatementList()));
/*     */         int startIndex = StringsKt.indexOf$default(suggestion, "def", 0, false, 6, null);
/*     */         Intrinsics.checkNotNullExpressionValue($function.getStatementList().getText(), "function.statementList.text");
/*     */         int endIndex = StringsKt.indexOf$default(suggestion, $function.getStatementList().getText(), 0, false, 6, null);
/*     */         if (startIndex != -1 && endIndex != -1 && startIndex < endIndex) {
/*     */           Intrinsics.checkNotNullExpressionValue(suggestion.substring(startIndex, endIndex), "this as java.lang.String…ing(startIndex, endIndex)");
/*     */           String suggestionText = suggestion.substring(startIndex, endIndex);
/*     */           Intrinsics.checkNotNullExpressionValue($editor.getDocument(), "editor.document");
/*     */           PythonAddTypeAnnotationsIntention.Companion.updateDocument$intellij_ml_llm_python($project, suggestionText, $editor.getDocument(), textRange);
/*     */         } 
/*     */       }
/*     */       
/*     */       PythonAddTypeAnnotationsIntention$invoke$task$1$run$1$1(PythonAddTypeAnnotationsIntention $receiver, LLMResponseChoice $it, PyFunction $function, Editor $editor) {
/*     */         super(0);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private final PyFunction getPyFunctionAtCaret(Editor editor) {
/*     */     PsiElement element = PsiUtilBase.getElementAtCaret(editor);
/*     */     return (PyFunction)PsiTreeUtil.getParentOfType(element, PyFunction.class);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J-\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\fH\000¢\006\002\b\r¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/python/intentions/inline/PythonAddTypeAnnotationsIntention$Companion;", "", "()V", "updateDocument", "", "project", "Lcom/intellij/openapi/project/Project;", "suggestion", "", "document", "Lcom/intellij/openapi/editor/Document;", "textRange", "Lcom/intellij/openapi/util/TextRange;", "updateDocument$intellij_ml_llm_python", "intellij.ml.llm.python"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     public final void updateDocument$intellij_ml_llm_python(@NotNull Project project, @NotNull String suggestion, @NotNull Document document, @NotNull TextRange textRange) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'project'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_2
/*     */       //   7: ldc 'suggestion'
/*     */       //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   12: aload_3
/*     */       //   13: ldc 'document'
/*     */       //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   18: aload #4
/*     */       //   20: ldc 'textRange'
/*     */       //   22: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   25: invokestatic getInstance : ()Lcom/intellij/openapi/command/CommandProcessor;
/*     */       //   28: aload_1
/*     */       //   29: aload_3
/*     */       //   30: aload #4
/*     */       //   32: aload_2
/*     */       //   33: aload_1
/*     */       //   34: <illegal opcode> run : (Lcom/intellij/openapi/editor/Document;Lcom/intellij/openapi/util/TextRange;Ljava/lang/String;Lcom/intellij/openapi/project/Project;)Ljava/lang/Runnable;
/*     */       //   39: ldc '...'
/*     */       //   41: aconst_null
/*     */       //   42: invokevirtual executeCommand : (Lcom/intellij/openapi/project/Project;Ljava/lang/Runnable;Ljava/lang/String;Ljava/lang/Object;)V
/*     */       //   45: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #111	-> 25
/*     */       //   #119	-> 39
/*     */       //   #111	-> 42
/*     */       //   #120	-> 45
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	46	0	this	Lcom/intellij/ml/llm/python/intentions/inline/PythonAddTypeAnnotationsIntention$Companion;
/*     */       //   0	46	1	project	Lcom/intellij/openapi/project/Project;
/*     */       //   0	46	2	suggestion	Ljava/lang/String;
/*     */       //   0	46	3	document	Lcom/intellij/openapi/editor/Document;
/*     */       //   0	46	4	textRange	Lcom/intellij/openapi/util/TextRange;
/*     */     }
/*     */     
/*     */     private static final void updateDocument$lambda$1(Document $document, TextRange $textRange, String $suggestion, Project $project) {
/*     */       Intrinsics.checkNotNullParameter($document, "$document");
/*     */       Intrinsics.checkNotNullParameter($textRange, "$textRange");
/*     */       Intrinsics.checkNotNullParameter($suggestion, "$suggestion");
/*     */       Intrinsics.checkNotNullParameter($project, "$project");
/*     */       $document.replaceString($textRange.getStartOffset(), $textRange.getEndOffset(), $suggestion);
/*     */       PsiDocumentManager.getInstance($project).commitDocument($document);
/*     */       PsiFile psiFile = PsiDocumentManager.getInstance($project).getPsiFile($document);
/*     */       PsiFile it = psiFile;
/*     */       int $i$a$-let-PythonAddTypeAnnotationsIntention$Companion$updateDocument$1$1 = 0;
/*     */       TextRange reformatRange = new TextRange($textRange.getStartOffset(), $textRange.getStartOffset() + $suggestion.length());
/*     */       CodeStyleManager.getInstance($project).reformatText(it, CollectionsKt.listOf(reformatRange));
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/python/intentions/inline/PythonAddTypeAnnotationsIntention.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */