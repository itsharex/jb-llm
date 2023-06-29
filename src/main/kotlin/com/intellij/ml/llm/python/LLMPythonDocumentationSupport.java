/*     */ package com.intellij.ml.llm.python;
/*     */ 
/*     */ import com.intellij.openapi.editor.RangeMarker;
/*     */ import com.intellij.openapi.editor.SelectionModel;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import com.intellij.psi.PsiNameIdentifierOwner;
/*     */ import com.jetbrains.python.documentation.docstrings.PyDocstringGenerator;
/*     */ import com.jetbrains.python.psi.PyClass;
/*     */ import com.jetbrains.python.psi.PyDocStringOwner;
/*     */ import com.jetbrains.python.psi.PyIndentUtil;
/*     */ import com.jetbrains.python.psi.PyStringLiteralExpression;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000t\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\n\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020 \n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\002\b\000\030\0002\0020\001B\005¢\006\002\020\002J\020\020\021\032\0020\b2\006\020\022\032\0020\023H\026J\037\020\024\032\004\030\0010\0252\006\020\026\032\0020\0272\006\020\030\032\0020\031H\026¢\006\002\020\032J\036\020\033\032\020\022\004\022\0020\b\022\004\022\0020\b\030\0010\0342\006\020\035\032\0020\036H\026J\022\020\037\032\004\030\0010\0362\006\020\022\032\0020\023H\026J\022\020 \032\004\030\0010\0232\006\020\022\032\0020\023H\026J\020\020!\032\0020\b2\006\020\022\032\0020\023H\026J\020\020\"\032\0020\b2\006\020\022\032\0020\023H\026J\b\020#\032\0020\bH\026J\b\020$\032\0020\bH\026J2\020%\032\b\022\004\022\0020\0360&2\f\020'\032\b\022\004\022\0020(0&2\f\020)\032\b\022\004\022\0020*0&2\006\020+\032\0020,H\002J\036\020-\032\b\022\004\022\0020\0360&2\006\020.\032\0020\0232\006\020+\032\0020,H\026J\030\020/\032\002002\006\0201\032\002022\006\0203\032\0020\bH\026J\020\0204\032\002052\006\020\022\032\0020\023H\026J\030\0206\032\002052\006\020\035\032\0020\0232\006\0203\032\0020\bH\026R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006R\024\020\007\032\0020\b8VX\004¢\006\006\032\004\b\t\020\nR\024\020\013\032\0020\b8VX\004¢\006\006\032\004\b\f\020\nR\024\020\r\032\0020\b8VX\004¢\006\006\032\004\b\016\020\nR\024\020\017\032\0020\b8VX\004¢\006\006\032\004\b\020\020\n¨\0067"}, d2 = {"Lcom/intellij/ml/llm/python/LLMPythonDocumentationSupport;", "Lcom/intellij/ml/llm/core/LLMDocumentationSupport;", "()V", "commentBoundsRegex", "Ljava/util/regex/Pattern;", "getCommentBoundsRegex", "()Ljava/util/regex/Pattern;", "commentEnd", "", "getCommentEnd", "()Ljava/lang/String;", "commentStart", "getCommentStart", "docFormatInstruction", "getDocFormatInstruction", "emptyComment", "getEmptyComment", "calculateNewLineIndent", "element", "Lcom/intellij/psi/PsiElement;", "findEndOfCommentOffset", "", "editor", "Lcom/intellij/openapi/editor/Editor;", "range", "Lcom/intellij/openapi/editor/RangeMarker;", "(Lcom/intellij/openapi/editor/Editor;Lcom/intellij/openapi/editor/RangeMarker;)Ljava/lang/Integer;", "findExampleComment", "Lkotlin/Pair;", "declaration", "Lcom/intellij/psi/PsiNameIdentifierOwner;", "getClosestNamedElement", "getDocComment", "getDocumentationFormatInfoForElement", "getElementToDocumentText", "getParameterTagInstruction", "getReturnTagInstruction", "getSelectedClassesAndFunctions", "", "classes", "Lcom/jetbrains/python/psi/PyClass;", "functions", "Lcom/jetbrains/python/psi/PyFunction;", "selectionModel", "Lcom/intellij/openapi/editor/SelectionModel;", "getSelectedElementToDocument", "root", "isValidComment", "", "project", "Lcom/intellij/openapi/project/Project;", "comment", "reformatFinalDocumentation", "", "replaceComment", "intellij.ml.llm.python"})
/*     */ @SourceDebugExtension({"SMAP\nLLMPythonDocumentationSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMPythonDocumentationSupport.kt\ncom/intellij/ml/llm/python/LLMPythonDocumentationSupport\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,142:1\n384#2,4:143\n766#3:147\n857#3,2:148\n*S KotlinDebug\n*F\n+ 1 LLMPythonDocumentationSupport.kt\ncom/intellij/ml/llm/python/LLMPythonDocumentationSupport\n*L\n34#1:143,4\n57#1:147\n57#1:148,2\n*E\n"})
/*     */ public final class LLMPythonDocumentationSupport implements LLMDocumentationSupport {
/*     */   @NotNull
/*     */   private final Pattern commentBoundsRegex;
/*     */   
/*  24 */   public LLMPythonDocumentationSupport() { Intrinsics.checkNotNullExpressionValue(Pattern.compile("\"\"\""), "compile(\"\\\"\\\"\\\"\")"); this.commentBoundsRegex = Pattern.compile("\"\"\""); } @NotNull public String getEmptyComment() { return "\"\"\"\n\"\"\""; } @NotNull public Pattern getCommentBoundsRegex() { return this.commentBoundsRegex; }
/*     */   @NotNull public String getCommentStart() { return "\"\"\""; }
/*  26 */   @NotNull public String getCommentEnd() { return "\"\"\""; } @NotNull public String getDocFormatInstruction() { return "write Docstring"; }
/*     */    @Nullable
/*     */   public PsiElement getDocComment(@NotNull PsiElement element) {
/*  29 */     Intrinsics.checkNotNullParameter(element, "element"); (element instanceof PyDocStringOwner) ? element : null; return (((element instanceof PyDocStringOwner) ? element : null) != null) ? (PsiElement)((element instanceof PyDocStringOwner) ? element : null).getDocStringExpression() : null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isValidComment(@NotNull Project project, @NotNull String comment) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'project'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'comment'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: nop
/*     */     //   13: aload_2
/*     */     //   14: astore #4
/*     */     //   16: iconst_0
/*     */     //   17: istore #5
/*     */     //   19: aload #4
/*     */     //   21: checkcast java/lang/CharSequence
/*     */     //   24: invokestatic getLastIndex : (Ljava/lang/CharSequence;)I
/*     */     //   27: istore #6
/*     */     //   29: iconst_m1
/*     */     //   30: iload #6
/*     */     //   32: if_icmpge -> 99
/*     */     //   35: aload #4
/*     */     //   37: iload #6
/*     */     //   39: invokevirtual charAt : (I)C
/*     */     //   42: istore #7
/*     */     //   44: iconst_0
/*     */     //   45: istore #8
/*     */     //   47: iload #7
/*     */     //   49: bipush #10
/*     */     //   51: if_icmpne -> 58
/*     */     //   54: iconst_1
/*     */     //   55: goto -> 59
/*     */     //   58: iconst_0
/*     */     //   59: ifne -> 93
/*     */     //   62: aload #4
/*     */     //   64: astore #7
/*     */     //   66: iconst_0
/*     */     //   67: istore #8
/*     */     //   69: iload #6
/*     */     //   71: iconst_1
/*     */     //   72: iadd
/*     */     //   73: istore #9
/*     */     //   75: aload #7
/*     */     //   77: iload #8
/*     */     //   79: iload #9
/*     */     //   81: invokevirtual substring : (II)Ljava/lang/String;
/*     */     //   84: dup
/*     */     //   85: ldc 'this as java.lang.String…ing(startIndex, endIndex)'
/*     */     //   87: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   90: goto -> 101
/*     */     //   93: iinc #6, -1
/*     */     //   96: goto -> 29
/*     */     //   99: ldc ''
/*     */     //   101: astore_3
/*     */     //   102: aload_1
/*     */     //   103: invokestatic getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/jetbrains/python/psi/PyElementGenerator;
/*     */     //   106: aload_3
/*     */     //   107: invokevirtual createDocstring : (Ljava/lang/String;)Lcom/jetbrains/python/psi/PyExpressionStatement;
/*     */     //   110: pop
/*     */     //   111: iconst_1
/*     */     //   112: ireturn
/*     */     //   113: astore_3
/*     */     //   114: iconst_0
/*     */     //   115: ireturn
/*     */     //   116: astore_3
/*     */     //   117: iconst_0
/*     */     //   118: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #33	-> 12
/*     */     //   #34	-> 13
/*     */     //   #143	-> 19
/*     */     //   #144	-> 35
/*     */     //   #34	-> 47
/*     */     //   #144	-> 59
/*     */     //   #145	-> 62
/*     */     //   #145	-> 90
/*     */     //   #143	-> 93
/*     */     //   #146	-> 99
/*     */     //   #34	-> 101
/*     */     //   #35	-> 102
/*     */     //   #36	-> 111
/*     */     //   #38	-> 113
/*     */     //   #39	-> 114
/*     */     //   #41	-> 116
/*     */     //   #42	-> 117
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   47	12	8	$i$a$-dropLastWhile-LLMPythonDocumentationSupport$isValidComment$trimmedComment$1	I
/*     */     //   44	15	7	it	C
/*     */     //   29	70	6	index$iv	I
/*     */     //   19	82	5	$i$f$dropLastWhile	I
/*     */     //   16	85	4	$this$dropLastWhile$iv	Ljava/lang/String;
/*     */     //   102	11	3	trimmedComment	Ljava/lang/String;
/*     */     //   114	2	3	e	Ljava/lang/Exception;
/*     */     //   117	2	3	e	Ljava/lang/AssertionError;
/*     */     //   0	119	0	this	Lcom/intellij/ml/llm/python/LLMPythonDocumentationSupport;
/*     */     //   0	119	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   0	119	2	comment	Ljava/lang/String;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   12	113	113	java/lang/Exception
/*     */     //   12	113	116	java/lang/AssertionError
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public Pair<String, String> findExampleComment(@NotNull PsiNameIdentifierOwner declaration) {
/*  46 */     Intrinsics.checkNotNullParameter(declaration, "declaration"); return null;
/*     */   }
/*     */   public void replaceComment(@NotNull PsiElement declaration, @NotNull String comment) {
/*  49 */     Intrinsics.checkNotNullParameter(declaration, "declaration"); Intrinsics.checkNotNullParameter(comment, "comment"); if (!(declaration instanceof PyDocStringOwner)) throw new IncorrectOperationException(); 
/*  50 */     Intrinsics.checkNotNullExpressionValue(PyDocstringGenerator.forDocStringOwner((PyDocStringOwner)declaration), "forDocStringOwner(declaration)"); PyDocstringGenerator docstringGenerator = PyDocstringGenerator.forDocStringOwner((PyDocStringOwner)declaration);
/*  51 */     docstringGenerator.buildAndInsert(comment);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private final List<PsiNameIdentifierOwner> getSelectedClassesAndFunctions(List classes, List functions, SelectionModel selectionModel) {
/*  57 */     Iterable $this$filter$iv = classes; int $i$f$filter = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 147 */     Iterable iterable1 = $this$filter$iv; Collection<Object> collection1 = new ArrayList(); int $i$f$filterTo = 0;
/* 148 */     for (Object element$iv$iv : iterable1) { PyClass it = (PyClass)element$iv$iv; int $i$a$-filter-LLMPythonDocumentationSupport$getSelectedClassesAndFunctions$1 = 0; if (containsElement(selectionModel, (PsiElement)it)) collection1.add(element$iv$iv);  }
/* 149 */      $this$filter$iv = functions; List list = (List)collection1; $i$f$filter = 0; Iterable $this$filterTo$iv$iv = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); $i$f$filterTo = 0; for (Object element$iv$iv : $this$filterTo$iv$iv) { PyFunction it = (PyFunction)element$iv$iv; int $i$a$-filter-LLMPythonDocumentationSupport$getSelectedClassesAndFunctions$2 = 0; if (containsElement(selectionModel, (PsiElement)it)) destination$iv$iv.add(element$iv$iv);  }  return CollectionsKt.plus(list, destination$iv$iv);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public List<PsiNameIdentifierOwner> getSelectedElementToDocument(@NotNull PsiElement root, @NotNull SelectionModel selectionModel) {
/*     */     PsiElement commonParent;
/*     */     PsiNameIdentifierOwner closestNamedElement;
/*     */     Intrinsics.checkNotNullParameter(root, "root");
/*     */     Intrinsics.checkNotNullParameter(selectionModel, "selectionModel");
/*     */     if (CollectHighlightsUtil.findCommonParent(root, selectionModel.getSelectionStart(), selectionModel.getSelectionEnd()) == null) {
/*     */       CollectHighlightsUtil.findCommonParent(root, selectionModel.getSelectionStart(), selectionModel.getSelectionEnd());
/*     */       return CollectionsKt.emptyList();
/*     */     } 
/*     */     if (commonParent instanceof PyFile) {
/*     */       Intrinsics.checkNotNullExpressionValue(((PyFile)commonParent).getTopLevelClasses(), "commonParent.topLevelClasses");
/*     */       Intrinsics.checkNotNullExpressionValue(((PyFile)commonParent).getTopLevelFunctions(), "commonParent.topLevelFunctions");
/*     */       return getSelectedClassesAndFunctions(((PyFile)commonParent).getTopLevelClasses(), ((PyFile)commonParent).getTopLevelFunctions(), selectionModel);
/*     */     } 
/*     */     if (getClosestNamedElement(commonParent) == null) {
/*     */       getClosestNamedElement(commonParent);
/*     */       return CollectionsKt.emptyList();
/*     */     } 
/*     */     if (!(closestNamedElement instanceof PyClass) || containsElement(selectionModel, (PsiElement)closestNamedElement))
/*     */       return CollectionsKt.listOf(closestNamedElement); 
/*     */     Intrinsics.checkNotNullExpressionValue(((PyClass)closestNamedElement).getNestedClasses(), "closestNamedElement.nestedClasses");
/*     */     Intrinsics.checkNotNullExpressionValue(((PyClass)closestNamedElement).getMethods(), "closestNamedElement.methods");
/*     */     return getSelectedClassesAndFunctions(ArraysKt.toList((Object[])((PyClass)closestNamedElement).getNestedClasses()), ArraysKt.toList((Object[])((PyClass)closestNamedElement).getMethods()), selectionModel);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public PsiNameIdentifierOwner getClosestNamedElement(@NotNull PsiElement element) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'element'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: instanceof com/jetbrains/python/psi/PyFunction
/*     */     //   10: ifne -> 20
/*     */     //   13: aload_1
/*     */     //   14: instanceof com/jetbrains/python/psi/PyClass
/*     */     //   17: ifeq -> 25
/*     */     //   20: aload_1
/*     */     //   21: checkcast com/intellij/psi/PsiNameIdentifierOwner
/*     */     //   24: areturn
/*     */     //   25: aload_1
/*     */     //   26: ldc_w com/intellij/psi/PsiNameIdentifierOwner
/*     */     //   29: invokestatic getParentOfType : (Lcom/intellij/psi/PsiElement;Ljava/lang/Class;)Lcom/intellij/psi/PsiElement;
/*     */     //   32: checkcast com/intellij/psi/PsiNameIdentifierOwner
/*     */     //   35: astore_2
/*     */     //   36: aload_2
/*     */     //   37: instanceof com/jetbrains/python/psi/PyFunction
/*     */     //   40: ifne -> 66
/*     */     //   43: aload_1
/*     */     //   44: ldc com/jetbrains/python/psi/PyFunction
/*     */     //   46: invokestatic getParentOfType : (Lcom/intellij/psi/PsiElement;Ljava/lang/Class;)Lcom/intellij/psi/PsiElement;
/*     */     //   49: checkcast com/jetbrains/python/psi/PyFunction
/*     */     //   52: dup
/*     */     //   53: ifnull -> 62
/*     */     //   56: checkcast com/intellij/psi/PsiNameIdentifierOwner
/*     */     //   59: goto -> 65
/*     */     //   62: pop
/*     */     //   63: aload_2
/*     */     //   64: areturn
/*     */     //   65: areturn
/*     */     //   66: aload_2
/*     */     //   67: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #76	-> 6
/*     */     //   #77	-> 25
/*     */     //   #78	-> 36
/*     */     //   #79	-> 43
/*     */     //   #81	-> 66
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   36	32	2	closestIdentifierOwner	Lcom/intellij/psi/PsiNameIdentifierOwner;
/*     */     //   0	68	0	this	Lcom/intellij/ml/llm/python/LLMPythonDocumentationSupport;
/*     */     //   0	68	1	element	Lcom/intellij/psi/PsiElement;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Integer findEndOfCommentOffset(@NotNull Editor editor, @NotNull RangeMarker range) {
/*     */     Intrinsics.checkNotNullParameter(editor, "editor");
/*     */     Intrinsics.checkNotNullParameter(range, "range");
/*     */     Intrinsics.checkNotNullExpressionValue(editor.getDocument().getText(range.getTextRange()), "editor.document.getText(range.textRange)");
/*     */     int commentCloseIndex = StringsKt.lastIndexOf$default(editor.getDocument().getText(range.getTextRange()), getCommentEnd(), 0, false, 6, null);
/*     */     if (commentCloseIndex < 0)
/*     */       return Integer.valueOf(range.getEndOffset()); 
/*     */     return Integer.valueOf(range.getStartOffset() + commentCloseIndex);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String calculateNewLineIndent(@NotNull PsiElement element) {
/*     */     PyStringLiteralExpression docStringExpression;
/*     */     Intrinsics.checkNotNullParameter(element, "element");
/*     */     if (!(element instanceof PyDocStringOwner))
/*     */       return ""; 
/*     */     if (((PyDocStringOwner)element).getDocStringExpression() == null) {
/*     */       ((PyDocStringOwner)element).getDocStringExpression();
/*     */       return "";
/*     */     } 
/*     */     Intrinsics.checkNotNullExpressionValue(PyIndentUtil.getElementIndent((PsiElement)docStringExpression), "getElementIndent(docStringExpression)");
/*     */     return PyIndentUtil.getElementIndent((PsiElement)docStringExpression);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String getDocumentationFormatInfoForElement(@NotNull PsiElement element) {
/*     */     Intrinsics.checkNotNullParameter(element, "element");
/*     */     if (!(element instanceof PyDocStringOwner))
/*     */       return ""; 
/*     */     PyDocstringGenerator pyDocstringGenerator1 = PyDocstringGenerator.forDocStringOwner((PyDocStringOwner)element).withInferredParameters(true);
/*     */     Intrinsics.checkNotNullExpressionValue(pyDocstringGenerator1, "forDocStringOwner(elemen…hInferredParameters(true)");
/*     */     PyDocstringGenerator generator = pyDocstringGenerator1;
/*     */     Intrinsics.checkNotNullExpressionValue(generator.getDocStringFormat().getName(), "generator.docStringFormat.getName()");
/*     */     String formatName = generator.getDocStringFormat().getName();
/*     */     Intrinsics.checkNotNullExpressionValue(generator.buildDocString(), "generator.buildDocString()");
/*     */     String example = generator.buildDocString();
/*     */     Intrinsics.checkNotNullExpressionValue(PyIndentUtil.changeIndent(example, true, ""), "changeIndent(example, true, \"\")");
/*     */     String exampleWithProperIndent = PyIndentUtil.changeIndent(example, true, "");
/*     */     String result = StringsKt.trimIndent("\nuse " + formatName + " format for python docstring\nyou MUST NOT add common indent\nformat:\n" + exampleWithProperIndent + "\n");
/*     */     return result;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String getParameterTagInstruction() {
/*     */     return "method has parameters";
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String getReturnTagInstruction() {
/*     */     return "method has return type";
/*     */   }
/*     */   
/*     */   public void reformatFinalDocumentation(@NotNull PsiElement element) {
/*     */     PyStringLiteralExpression docstring;
/*     */     Intrinsics.checkNotNullParameter(element, "element");
/*     */     if (!(element instanceof PyDocStringOwner))
/*     */       return; 
/*     */     if (((PyDocStringOwner)element).getDocStringExpression() == null) {
/*     */       ((PyDocStringOwner)element).getDocStringExpression();
/*     */       return;
/*     */     } 
/*     */     Intrinsics.checkNotNullExpressionValue(((PyDocStringOwner)element).getProject(), "element.project");
/*     */     Project project = ((PyDocStringOwner)element).getProject();
/*     */     Intrinsics.checkNotNullExpressionValue(PyIndentUtil.getElementIndent((PsiElement)docstring), "getElementIndent(docstring)");
/*     */     String indent = PyIndentUtil.getElementIndent((PsiElement)docstring);
/*     */     String text = docstring.getText();
/*     */     Intrinsics.checkNotNullExpressionValue(PyIndentUtil.changeIndent(text, true, indent), "changeIndent(text, true, indent)");
/*     */     String newText = PyIndentUtil.changeIndent(text, true, indent);
/*     */     Intrinsics.checkNotNullExpressionValue(PyElementGenerator.getInstance(project).createDocstring(newText).getExpression(), "getInstance(project).cre…tring(newText).expression");
/*     */     PyExpression newDocstring = PyElementGenerator.getInstance(project).createDocstring(newText).getExpression();
/*     */     docstring.replace((PsiElement)newDocstring);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String getElementToDocumentText(@NotNull PsiElement element) {
/*     */     Intrinsics.checkNotNullParameter(element, "element");
/*     */     if (!(element instanceof PyDocStringOwner)) {
/*     */       Intrinsics.checkNotNullExpressionValue(element.getText(), "element.text");
/*     */       return element.getText();
/*     */     } 
/*     */     PsiElement elementWithoutDoc = element.copy();
/*     */     if (((elementWithoutDoc instanceof PyDocStringOwner) ? elementWithoutDoc : null) != null && ((elementWithoutDoc instanceof PyDocStringOwner) ? elementWithoutDoc : null).getDocStringExpression() != null) {
/*     */       ((elementWithoutDoc instanceof PyDocStringOwner) ? elementWithoutDoc : null).getDocStringExpression().delete();
/*     */     } else {
/*     */       ((elementWithoutDoc instanceof PyDocStringOwner) ? elementWithoutDoc : null).getDocStringExpression();
/*     */     } 
/*     */     Intrinsics.checkNotNullExpressionValue(elementWithoutDoc.getText(), "elementWithoutDoc.text");
/*     */     return elementWithoutDoc.getText();
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/python/LLMPythonDocumentationSupport.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */