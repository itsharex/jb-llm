/*     */ package com.intellij.ml.llm.python.refactorings;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import com.jetbrains.python.psi.PyReferenceExpression;
/*     */ import com.jetbrains.python.psi.PyTargetExpression;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\000\n\002\020 \n\002\b\013\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\034\020\007\032\0020\0042\006\020\b\032\0020\t2\n\b\002\020\n\032\004\030\0010\004H\002J\034\020\013\032\0020\0042\006\020\f\032\0020\r2\n\b\002\020\n\032\004\030\0010\004H\002J2\020\016\032\0020\0042\006\020\017\032\0020\0202\006\020\n\032\0020\0042\006\020\021\032\0020\0222\b\020\023\032\004\030\0010\0242\006\020\025\032\0020\004H\002J\036\020\016\032\0020\0042\006\020\f\032\0020\r2\006\020\n\032\0020\0042\006\020\021\032\0020\022J\036\020\016\032\0020\0042\006\020\b\032\0020\t2\006\020\n\032\0020\0042\006\020\021\032\0020\022J\034\020\026\032\0020\0042\006\020\027\032\0020\0222\n\b\002\020\030\032\004\030\0010\004H\002J\022\020\031\032\004\030\0010\0042\006\020\032\032\0020\033H\002J\026\020\034\032\b\022\004\022\0020\0330\0352\006\020\017\032\0020\022H\002J\026\020\036\032\b\022\004\022\0020\0220\0352\006\020\017\032\0020\022H\002J\026\020\037\032\b\022\004\022\0020\0220\0352\006\020\017\032\0020\022H\002J\026\020 \032\b\022\004\022\0020\t0\0352\006\020!\032\0020\022H\002J\022\020\"\032\004\030\0010\0222\006\020#\032\0020\033H\002J&\020$\032\b\022\004\022\0020\0040\0352\006\020\017\032\0020\0202\006\020\n\032\0020\0042\006\020\021\032\0020\022H\002J\"\020%\032\0020\0222\006\020\017\032\0020\0222\006\020&\032\0020\0042\b\020'\032\004\030\0010\004H\002R\016\020\003\032\0020\004X\004¢\006\002\n\000R\016\020\005\032\0020\006XT¢\006\002\n\000¨\006("}, d2 = {"Lcom/intellij/ml/llm/python/refactorings/VariableContextCollector;", "", "()V", "CODE_INDENT", "", "INDENT", "", "createContextForDeclaration", "variable", "Lcom/jetbrains/python/psi/PyTargetExpression;", "newVariableName", "createContextForDeclarationParameter", "parameter", "Lcom/jetbrains/python/psi/PyNamedParameter;", "createContextPrompt", "element", "Lcom/intellij/psi/PsiNamedElement;", "originalElement", "Lcom/intellij/psi/PsiElement;", "assignedValue", "Lcom/jetbrains/python/psi/PyExpression;", "declarationContext", "createContextString", "context", "variableToExplain", "findParameterForCallArgument", "argument", "Lcom/jetbrains/python/psi/PyReferenceExpression;", "findReferenceExpressionsUsages", "", "findUsages", "findUsagesInScopeOwner", "findUsedVariables", "scope", "getContextForReference", "reference", "getElementUsagesTexts", "replaceReferenceExpressions", "oldName", "newName", "intellij.ml.llm.python"})
/*     */ @SourceDebugExtension({"SMAP\nVariableContextCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VariableContextCollector.kt\ncom/intellij/ml/llm/python/refactorings/VariableContextCollector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n1549#2:164\n1620#2,3:165\n800#2,11:169\n766#2:180\n857#2,2:181\n1855#2,2:183\n1549#2:185\n1620#2,3:186\n800#2,11:189\n766#2:200\n857#2,2:201\n1603#2,9:203\n1855#2:212\n1856#2:214\n1612#2:215\n1#3:168\n1#3:213\n*S KotlinDebug\n*F\n+ 1 VariableContextCollector.kt\ncom/intellij/ml/llm/python/refactorings/VariableContextCollector\n*L\n36#1:164\n36#1:165,3\n83#1:169,11\n118#1:180\n118#1:181,2\n119#1:183,2\n143#1:185\n143#1:186,3\n144#1:189,11\n99#1:200\n99#1:201,2\n100#1:203,9\n100#1:212\n100#1:214\n100#1:215\n100#1:213\n*E\n"})
/*     */ public final class VariableContextCollector {
/*     */   @NotNull
/*  12 */   public static final VariableContextCollector INSTANCE = new VariableContextCollector(); private static final int INDENT = 4; @NotNull private static final String CODE_INDENT = StringsKt.repeat(" ", 8);
/*     */   @NotNull
/*     */   public final String createContextPrompt(@NotNull PyTargetExpression variable, @NotNull String newVariableName, @NotNull PsiElement originalElement) {
/*  15 */     Intrinsics.checkNotNullParameter(variable, "variable"); Intrinsics.checkNotNullParameter(newVariableName, "newVariableName"); Intrinsics.checkNotNullParameter(originalElement, "originalElement"); PyExpression assignedValue = variable.findAssignedValue();
/*  16 */     String declarationContext = createContextForDeclaration(variable, newVariableName);
/*  17 */     return createContextPrompt((PsiNamedElement)variable, newVariableName, originalElement, assignedValue, declarationContext);
/*     */   }
/*     */   
/*     */   @NotNull
/*  21 */   public final String createContextPrompt(@NotNull PyNamedParameter parameter, @NotNull String newVariableName, @NotNull PsiElement originalElement) { Intrinsics.checkNotNullParameter(parameter, "parameter"); Intrinsics.checkNotNullParameter(newVariableName, "newVariableName"); Intrinsics.checkNotNullParameter(originalElement, "originalElement"); PyExpression assignedValue = parameter.getDefaultValue();
/*  22 */     String declarationContext = createContextForDeclarationParameter(parameter, newVariableName);
/*  23 */     return createContextPrompt((PsiNamedElement)parameter, newVariableName, originalElement, assignedValue, declarationContext); }
/*     */   private final List<String> getElementUsagesTexts(PsiNamedElement element, String newVariableName, PsiElement originalElement) { List<PsiElement> list1 = CollectionsKt.toMutableList(findReferenceExpressionsUsages((PsiElement)element)); List<PsiElement> $this$getElementUsagesTexts_u24lambda_u241 = list1; int $i$a$-apply-VariableContextCollector$getElementUsagesTexts$1 = 0; if (originalElement instanceof PyReferenceExpression) $this$getElementUsagesTexts_u24lambda_u241.add(originalElement);  return SequencesKt.toList(SequencesKt.map(SequencesKt.map(SequencesKt.distinct(SequencesKt.mapNotNull(CollectionsKt.asSequence(list1), new VariableContextCollector$getElementUsagesTexts$2(INSTANCE))), new VariableContextCollector$getElementUsagesTexts$3(element, newVariableName)), new VariableContextCollector$getElementUsagesTexts$4(newVariableName))); }
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "Lcom/intellij/psi/PsiElement;", "context", "invoke"}) static final class VariableContextCollector$getElementUsagesTexts$3 extends Lambda implements Function1<PsiElement, PsiElement> {
/*     */     VariableContextCollector$getElementUsagesTexts$3(PsiNamedElement $element, String $newVariableName) { super(1); }
/*     */     @NotNull public final PsiElement invoke(@NotNull PsiElement context) { Intrinsics.checkNotNullParameter(context, "context"); if (this.$element.getName() == null) this.$element.getName();  return context.replaceReferenceExpressions((PsiElement)this.$element.getName(), "", this.$newVariableName); } } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\016\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "context", "Lcom/intellij/psi/PsiElement;", "invoke"}) static final class VariableContextCollector$getElementUsagesTexts$4 extends Lambda implements Function1<PsiElement, String> {
/*  28 */     VariableContextCollector$getElementUsagesTexts$4(String $newVariableName) { super(1); } @NotNull public final String invoke(@NotNull PsiElement context) { Intrinsics.checkNotNullParameter(context, "context"); return VariableContextCollector.INSTANCE.createContextString(context, this.$newVariableName); } } private final String createContextPrompt(PsiNamedElement element, String newVariableName, PsiElement originalElement, PyExpression assignedValue, String declarationContext) { List variablesInsideInitializer = (assignedValue != null) ? 
/*  29 */       findUsedVariables((PsiElement)assignedValue) : 
/*     */ 
/*     */       
/*  32 */       CollectionsKt.emptyList();
/*     */ 
/*     */     
/*  35 */     List list1 = variablesInsideInitializer;
/*  36 */     int $i$f$map = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 164 */     List list2 = list1; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10)); int $i$f$mapTo = 0;
/* 165 */     for (Object item$iv$iv : list2) {
/* 166 */       PyTargetExpression pyTargetExpression = (PyTargetExpression)item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-VariableContextCollector$createContextPrompt$declarationsForDependencyVariables$1 = 0; collection.add(createContextForDeclaration$default(INSTANCE, pyTargetExpression, null, 2, null));
/* 167 */     }  List declarationsForDependencyVariables = (List)destination$iv$iv; List<String> usages = getElementUsagesTexts(element, newVariableName, originalElement); PyFunction containingMethod = (PyFunction)PsiTreeUtil.getParentOfType((PsiElement)element, PyFunction.class); if (containingMethod == null || containingMethod.getReturnStatementType(TypeEvalContext.codeInsightFallback(element.getProject())) == null || containingMethod.getReturnStatementType(TypeEvalContext.codeInsightFallback(element.getProject())).getName() == null) containingMethod.getReturnStatementType(TypeEvalContext.codeInsightFallback(element.getProject())).getName();  String returnType = "Any"; if (containingMethod == null || containingMethod.getName() == null) containingMethod.getName();  String name = "test"; if ((PyClass)PsiTreeUtil.getParentOfType((PsiElement)element, PyClass.class) == null || ((PyClass)PsiTreeUtil.getParentOfType((PsiElement)element, PyClass.class)).getName() == null)
/* 168 */       ((PyClass)PsiTreeUtil.getParentOfType((PsiElement)element, PyClass.class)).getName();  String className = "C"; String separator = "\n" + CODE_INDENT; return StringsKt.trimIndent("\nclass " + className + " \n    def " + name + "() -> " + returnType + ":\n        " + CollectionsKt.joinToString$default(declarationsForDependencyVariables, separator, null, null, 0, null, null, 62, null) + "\n        " + declarationContext + "\n        " + CollectionsKt.joinToString$default(usages, separator, null, null, 0, null, null, 62, null) + "\n    "); } private final String findParameterForCallArgument(PyReferenceExpression argument) { Object object3, object4; PyParameter parameter; PsiElement psiElement1 = argument.getParent(); if (((psiElement1 instanceof com.jetbrains.python.psi.PyArgumentList) ? psiElement1 : null) == null) { (psiElement1 instanceof com.jetbrains.python.psi.PyArgumentList) ? psiElement1 : null; return null; }  Intrinsics.checkNotNullExpressionValue(object1.getArgumentExpressions(), "argumentList.argumentExpressions"); Integer integer = Integer.valueOf(CollectionsKt.indexOf(object1.getArgumentExpressions(), argument)); int it = integer.intValue(); int $i$a$-takeIf-VariableContextCollector$findParameterForCallArgument$argumentPosition$1 = 0; if ((((it >= 0)) ? integer : null) != null) {  } else { (((it >= 0)) ? integer : null).intValue(); return null; }  Object object1 = (psiElement1 instanceof com.jetbrains.python.psi.PyArgumentList) ? psiElement1 : null; Object object2 = object1; PsiElement psiElement2 = object1.getParent(); if (((psiElement2 instanceof com.jetbrains.python.psi.PyCallExpression) ? psiElement2 : null) == null) { (psiElement2 instanceof com.jetbrains.python.psi.PyCallExpression) ? psiElement2 : null; return null; }  object3.getCallee().getReference(); PsiElement psiElement3 = (object3.getCallee() != null && object3.getCallee().getReference() != null) ? object3.getCallee().getReference().resolve() : null; if (((psiElement3 instanceof PyFunction) ? psiElement3 : null) == null) { (psiElement3 instanceof PyFunction) ? psiElement3 : null; return null; }  Intrinsics.checkNotNullExpressionValue(object4.getParameterList().getParameters(), "resolvedMethod.parameterList.parameters"); PyParameter[] parameters = object4.getParameterList().getParameters(); if (object2 >= parameters.length)
/* 169 */       return null;  if (parameters[object2] == null) { parameters[object2]; return null; }  return parameter.getName(); } private final List<PyReferenceExpression> findReferenceExpressionsUsages(PsiElement element) { Iterable<PsiElement> $this$filterIsInstance$iv = findUsages(element); int $i$f$filterIsInstance = 0; Iterable<PsiElement> iterable1 = $this$filterIsInstance$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterIsInstanceTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 178 */     for (PsiElement element$iv$iv : iterable1) { if (element$iv$iv instanceof PyReferenceExpression) destination$iv$iv.add(element$iv$iv);  }
/* 179 */      return (List)destination$iv$iv; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final PsiElement getContextForReference(PyReferenceExpression reference) {
/*     */     PyStatement context = (PyStatement)PsiTreeUtil.getParentOfType((PsiElement)reference, PyStatement.class);
/*     */     return (PsiElement)context;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final String createContextString$createContextForArguments(String $variableToExplain, PsiElement $context) {
/*     */     if ($variableToExplain == null) {
/*     */       return "";
/*     */     }
/*     */     Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.findChildrenOfType($context, PyReferenceExpression.class), "findChildrenOfType(conte…ceExpression::class.java)");
/*     */     Collection collection1 = PsiTreeUtil.findChildrenOfType($context, PyReferenceExpression.class);
/*     */     int $i$f$filter = 0;
/* 200 */     Collection collection2 = collection1; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 201 */     for (Object element$iv$iv : collection2) { PyReferenceExpression reference = (PyReferenceExpression)element$iv$iv; int $i$a$-filter-VariableContextCollector$createContextString$createContextForArguments$argumentsAsAssignments$1 = 0; if (Intrinsics.areEqual(reference.getText(), $variableToExplain)) destination$iv$iv.add(element$iv$iv);  }
/* 202 */      Iterable $this$filter$iv = destination$iv$iv; VariableContextCollector variableContextCollector = INSTANCE; int $i$f$mapNotNull = 0;
/* 203 */     Iterable iterable1 = $this$filter$iv; Collection collection3 = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 211 */     Iterable $this$forEach$iv$iv$iv = iterable1; int $i$f$forEach = 0;
/* 212 */     Iterator iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; PyReferenceExpression p0 = (PyReferenceExpression)element$iv$iv;
/*     */       int $i$a$-mapNotNull-VariableContextCollector$createContextString$createContextForArguments$argumentsAsAssignments$2 = 0; }
/*     */     
/* 215 */     List argumentsAsAssignments = (List)collection3;
/*     */     if (argumentsAsAssignments.isEmpty())
/*     */       return ""; 
/*     */     return " # " + CollectionsKt.joinToString$default(argumentsAsAssignments, ", ", null, null, 0, null, new VariableContextCollector$createContextString$createContextForArguments$1($variableToExplain), 30, null);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\r\n\000\n\002\020\016\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "parameterName", "", "invoke"})
/*     */   static final class VariableContextCollector$createContextString$createContextForArguments$1 extends Lambda implements Function1<String, CharSequence> {
/*     */     VariableContextCollector$createContextString$createContextForArguments$1(String $variableToExplain) {
/*     */       super(1);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final CharSequence invoke(@NotNull String parameterName) {
/*     */       Intrinsics.checkNotNullParameter(parameterName, "parameterName");
/*     */       return this.$variableToExplain + " = " + this.$variableToExplain;
/*     */     }
/*     */   }
/*     */   
/*     */   private final String createContextString(PsiElement context, String variableToExplain) {
/*     */     Intrinsics.checkNotNullExpressionValue(PyIndentUtil.changeIndent(context.getText(), true, CODE_INDENT), "changeIndent(context.text, true, CODE_INDENT)");
/*     */     String textWithCodeIndent = PyIndentUtil.changeIndent(context.getText(), true, CODE_INDENT);
/*     */     String contextRes = textWithCodeIndent + textWithCodeIndent;
/*     */     return contextRes;
/*     */   }
/*     */   
/*     */   private final PsiElement replaceReferenceExpressions(PsiElement element, String oldName, String newName) {
/*     */     if (newName == null)
/*     */       return element; 
/*     */     Intrinsics.checkNotNullExpressionValue(LanguageLevel.forElement(element), "forElement(element)");
/*     */     LanguageLevel languageLevel = LanguageLevel.forElement(element);
/*     */     PsiElement copiedElement = element.copy();
/*     */     PyElementGenerator factory = PyElementGenerator.getInstance(element.getProject());
/*     */     Class[] arrayOfClass = new Class[1];
/*     */     arrayOfClass[0] = PyReferenceExpression.class;
/*     */     Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.findChildrenOfAnyType(copiedElement, false, arrayOfClass), "findChildrenOfAnyType(co…ceExpression::class.java)");
/*     */     Collection collection1 = PsiTreeUtil.findChildrenOfAnyType(copiedElement, false, arrayOfClass);
/*     */     int $i$f$filter = 0;
/*     */     Collection collection2 = collection1;
/*     */     Collection<Object> destination$iv$iv = new ArrayList();
/*     */     int $i$f$filterTo = 0;
/*     */     for (Object element$iv$iv : collection2) {
/*     */       PyReferenceExpression reference = (PyReferenceExpression)element$iv$iv;
/*     */       int $i$a$-filter-VariableContextCollector$replaceReferenceExpressions$1 = 0;
/*     */       if (Intrinsics.areEqual(reference.getText(), oldName))
/*     */         destination$iv$iv.add(element$iv$iv); 
/*     */     } 
/*     */     Iterable $this$filter$iv = destination$iv$iv;
/*     */     int $i$f$forEach = 0;
/*     */     Iterator iterator = $this$filter$iv.iterator();
/*     */     if (iterator.hasNext()) {
/*     */       Object element$iv = iterator.next();
/*     */       PyReferenceExpression reference = (PyReferenceExpression)element$iv;
/*     */       int $i$a$-forEach-VariableContextCollector$replaceReferenceExpressions$2 = 0;
/*     */       reference.replace((PsiElement)factory.createExpressionFromText(languageLevel, newName));
/*     */     } 
/*     */     Intrinsics.checkNotNullExpressionValue(copiedElement, "copiedElement");
/*     */     return copiedElement;
/*     */   }
/*     */   
/*     */   private final String createContextForDeclaration(PyTargetExpression variable, String newVariableName) {
/*     */     variable.findAssignedValue();
/*     */     if (((variable.findAssignedValue() != null) ? variable.findAssignedValue().getText() : null) == null)
/*     */       (variable.findAssignedValue() != null) ? variable.findAssignedValue().getText() : null; 
/*     */     String assignedValueText = "...";
/*     */     if (newVariableName != null) {
/*     */       Intrinsics.checkNotNull(variable.copy(), "null cannot be cast to non-null type com.jetbrains.python.psi.PyTargetExpression");
/*     */       PyTargetExpression renamedVariable = (PyTargetExpression)variable.copy();
/*     */       renamedVariable.setName(newVariableName);
/*     */       return renamedVariable.getName() + " = " + renamedVariable.getName();
/*     */     } 
/*     */     return variable.getName() + " = " + variable.getName();
/*     */   }
/*     */   
/*     */   private final String createContextForDeclarationParameter(PyNamedParameter parameter, String newVariableName) {
/*     */     parameter.getDefaultValue();
/*     */     if (((parameter.getDefaultValue() != null) ? parameter.getDefaultValue().getText() : null) == null)
/*     */       (parameter.getDefaultValue() != null) ? parameter.getDefaultValue().getText() : null; 
/*     */     String assignedValueText = "...";
/*     */     if (newVariableName != null)
/*     */       return newVariableName + "= " + newVariableName; 
/*     */     return parameter.getName() + " = " + parameter.getName();
/*     */   }
/*     */   
/*     */   private final List<PyTargetExpression> findUsedVariables(PsiElement scope) {
/*     */     Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.findChildrenOfType(scope, PyReferenceExpression.class), "findChildrenOfType(scope…ceExpression::class.java)");
/*     */     Collection collection1 = PsiTreeUtil.findChildrenOfType(scope, PyReferenceExpression.class);
/*     */     int $i$f$map = 0;
/*     */     Collection collection2 = collection1;
/*     */     Collection<PsiElement> collection = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection1, 10));
/*     */     int $i$f$mapTo = 0;
/*     */     for (Object item$iv$iv : collection2) {
/*     */       PyReferenceExpression pyReferenceExpression = (PyReferenceExpression)item$iv$iv;
/*     */       Collection<PsiElement> collection3 = collection;
/*     */       int $i$a$-map-VariableContextCollector$findUsedVariables$1 = 0;
/*     */       collection3.add(pyReferenceExpression.getReference().resolve());
/*     */     } 
/*     */     Iterable $this$map$iv = collection;
/*     */     int $i$f$filterIsInstance = 0;
/*     */     Iterable $this$mapTo$iv$iv = $this$map$iv;
/*     */     Collection<Object> destination$iv$iv = new ArrayList();
/*     */     int $i$f$filterIsInstanceTo = 0;
/*     */     for (Object element$iv$iv : $this$mapTo$iv$iv) {
/*     */       if (element$iv$iv instanceof PyTargetExpression)
/*     */         destination$iv$iv.add(element$iv$iv); 
/*     */     } 
/*     */     return (List)destination$iv$iv;
/*     */   }
/*     */   
/*     */   private final List<PsiElement> findUsagesInScopeOwner(PsiElement element) {
/*     */     ScopeOwner scope;
/*     */     if (ScopeUtil.getScopeOwner(element) == null) {
/*     */       ScopeUtil.getScopeOwner(element);
/*     */       return CollectionsKt.emptyList();
/*     */     } 
/*     */     ArrayList<PsiElement> result = new ArrayList();
/*     */     PsiTreeUtil.processElements((PsiElement)scope, new VariableContextCollector$findUsagesInScopeOwner$1<>(element, result));
/*     */     return result;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\013\n\000\n\002\030\002\n\000\020\000\032\0020\0012\b\020\002\032\004\030\0010\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "e", "Lcom/intellij/psi/PsiElement;", "execute"})
/*     */   static final class VariableContextCollector$findUsagesInScopeOwner$1<T extends PsiElement> implements PsiElementProcessor {
/*     */     VariableContextCollector$findUsagesInScopeOwner$1(PsiElement $element, ArrayList<PsiElement> $result) {}
/*     */     
/*     */     public final boolean execute(@Nullable PsiElement e) {
/*     */       if (e instanceof PyReferenceExpression && ((PyReferenceExpression)e).getReference().isReferenceTo(this.$element))
/*     */         this.$result.add(e); 
/*     */       return true;
/*     */     }
/*     */   }
/*     */   
/*     */   private final List<PsiElement> findUsages(PsiElement element) {
/*     */     return findUsagesInScopeOwner(element);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/python/refactorings/VariableContextCollector.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */