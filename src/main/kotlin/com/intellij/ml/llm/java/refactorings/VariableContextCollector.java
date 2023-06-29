/*     */ package com.intellij.ml.llm.java.refactorings;
/*     */ 
/*     */ import com.intellij.psi.PsiElement;
/*     */ import com.intellij.psi.PsiVariable;
/*     */ import java.util.Collection;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020 \n\002\b\013\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\036\020\003\032\004\030\0010\0042\006\020\005\032\0020\0062\n\b\002\020\007\032\004\030\0010\004H\002J\026\020\b\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\004J\034\020\t\032\0020\0042\006\020\n\032\0020\0132\n\b\002\020\f\032\004\030\0010\004H\002J\022\020\r\032\004\030\0010\0042\006\020\016\032\0020\017H\002J\026\020\020\032\b\022\004\022\0020\0060\0212\006\020\022\032\0020\013H\002J\026\020\023\032\b\022\004\022\0020\0170\0212\006\020\005\032\0020\006H\002J\022\020\024\032\004\030\0010\0132\006\020\025\032\0020\017H\002J\"\020\026\032\0020\0132\006\020\027\032\0020\0132\006\020\030\032\0020\0042\b\020\031\032\004\030\0010\004H\002J\024\020\032\032\0020\004*\0020\0042\006\020\033\032\0020\004H\002¨\006\034"}, d2 = {"Lcom/intellij/ml/llm/java/refactorings/VariableContextCollector;", "", "()V", "createContextForDeclaration", "", "variable", "Lcom/intellij/psi/PsiVariable;", "newVariableName", "createContextPrompt", "createContextString", "context", "Lcom/intellij/psi/PsiElement;", "variableToExplain", "findParameterForCallArgument", "argument", "Lcom/intellij/psi/PsiReferenceExpression;", "findUsedVariables", "", "scope", "findVariableReferences", "getContextForReference", "reference", "replaceReferenceExpressions", "element", "oldName", "newName", "ensureEndsWith", "suffix", "intellij.ml.llm.java"})
/*     */ @SourceDebugExtension({"SMAP\nVariableContextCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VariableContextCollector.kt\ncom/intellij/ml/llm/java/refactorings/VariableContextCollector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1549#2:118\n1620#2,3:119\n1360#2:123\n1446#2,5:124\n766#2:129\n857#2,2:130\n1603#2,9:132\n1855#2:141\n1856#2:143\n1612#2:144\n1045#2:145\n1549#2:146\n1620#2,3:147\n1603#2,9:150\n1855#2:159\n1856#2:161\n1612#2:162\n1549#2:163\n1620#2,3:164\n1549#2:167\n1620#2,3:168\n766#2:171\n857#2,2:172\n1855#2,2:174\n1549#2:176\n1620#2,3:177\n800#2,11:180\n766#2:191\n857#2,2:192\n1603#2,9:194\n1855#2:203\n1856#2:205\n1612#2:206\n1#3:122\n1#3:142\n1#3:160\n1#3:204\n*S KotlinDebug\n*F\n+ 1 VariableContextCollector.kt\ncom/intellij/ml/llm/java/refactorings/VariableContextCollector\n*L\n14#1:118\n14#1:119,3\n18#1:123\n18#1:124,5\n19#1:129\n19#1:130,2\n20#1:132,9\n20#1:141\n20#1:143\n20#1:144\n21#1:145\n24#1:146\n24#1:147,3\n27#1:150,9\n27#1:159\n27#1:161\n27#1:162\n29#1:163\n29#1:164,3\n30#1:167\n30#1:168,3\n93#1:171\n93#1:172,2\n94#1:174,2\n113#1:176\n113#1:177,3\n114#1:180,11\n77#1:191\n77#1:192,2\n78#1:194,9\n78#1:203\n78#1:205\n78#1:206\n20#1:142\n27#1:160\n78#1:204\n*E\n"})
/*     */ public final class VariableContextCollector {
/*     */   @NotNull
/*  11 */   public final String createContextPrompt(@NotNull PsiVariable variable, @NotNull String newVariableName) { Intrinsics.checkNotNullParameter(variable, "variable"); Intrinsics.checkNotNullParameter(newVariableName, "newVariableName"); List<PsiVariable> variablesInsideInitializer = findUsedVariables((PsiElement)variable);
/*     */     
/*  13 */     List<PsiVariable> list1 = variablesInsideInitializer;
/*  14 */     int $i$f$map = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 118 */     List<PsiVariable> list4 = list1; Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10)); int $i$f$mapTo = 0;
/* 119 */     for (PsiVariable item$iv$iv : list4) {
/* 120 */       PsiVariable psiVariable1 = item$iv$iv; Collection collection5 = destination$iv$iv; int $i$a$-map-VariableContextCollector$createContextPrompt$declarationsForDependencyVariables$1 = 0; createContextForDeclaration$default(INSTANCE, psiVariable1, null, 2, null);
/* 121 */     }  List declarationsForDependencyVariables = (List)destination$iv$iv; List<PsiVariable> list2 = findUsedVariables((PsiElement)variable); List<PsiVariable> variables = list2;
/* 122 */     int $i$a$-takeIf-VariableContextCollector$createContextPrompt$usagesOfPassedVariables$1 = 0; if ((((variables.size() < 3)) ? list2 : null) == null)
/* 123 */       ((variables.size() < 3)) ? list2 : null;  list2 = CollectionsKt.emptyList(); VariableContextCollector variableContextCollector1 = INSTANCE; int $i$f$flatMap = 0; List<PsiVariable> list5 = list2; Collection collection3 = new ArrayList(); int $i$f$flatMapTo = 0;
/* 124 */     for (PsiVariable element$iv$iv : list5) {
/* 125 */       PsiVariable p0 = element$iv$iv; int $i$a$-flatMap-VariableContextCollector$createContextPrompt$usagesOfPassedVariables$2 = 0; Iterable<PsiReferenceExpression> list$iv$iv = variableContextCollector1.findVariableReferences(p0);
/* 126 */       CollectionsKt.addAll(collection3, list$iv$iv);
/*     */     } 
/* 128 */     Iterable $this$flatMap$iv = collection3; int $i$f$filter = 0;
/* 129 */     Iterable iterable2 = $this$flatMap$iv; Collection<Object> collection = new ArrayList(); int $i$f$filterTo = 0;
/* 130 */     for (Object element$iv$iv : iterable2) { PsiReferenceExpression reference = (PsiReferenceExpression)element$iv$iv; int $i$a$-filter-VariableContextCollector$createContextPrompt$usagesOfPassedVariables$3 = 0; if ((reference.getTextRange().getEndOffset() < variable.getTextRange().getStartOffset())) collection.add(element$iv$iv);  }
/* 131 */      Iterable $this$filter$iv = collection; int $i$f$mapNotNull = 0;
/* 132 */     Iterable $this$filterTo$iv$iv = $this$filter$iv; Collection<String> collection1 = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 140 */     Iterable $this$forEach$iv$iv$iv = $this$filterTo$iv$iv; int $i$f$forEach = 0;
/* 141 */     Iterator iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; PsiReferenceExpression reference = (PsiReferenceExpression)element$iv$iv;
/*     */       int $i$a$-mapNotNull-VariableContextCollector$createContextPrompt$usagesOfPassedVariables$4 = 0; }
/*     */     
/* 144 */     Iterable $this$mapNotNull$iv = collection1; int $i$f$sortedBy = 0;
/* 145 */     Iterable $this$sortedBy$iv = CollectionsKt.distinct(CollectionsKt.takeLast(CollectionsKt.sortedWith($this$mapNotNull$iv, new VariableContextCollector$createContextPrompt$$inlined$sortedBy$1()), 3)); int i = 0;
/* 146 */     Iterable $this$mapNotNullTo$iv$iv = $this$sortedBy$iv; collection1 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$sortedBy$iv, 10)); int m = 0;
/* 147 */     for (Object item$iv$iv : $this$mapNotNullTo$iv$iv) {
/* 148 */       PsiElement psiElement = (PsiElement)item$iv$iv; Collection<String> collection5 = collection1; int $i$a$-map-VariableContextCollector$createContextPrompt$usagesOfPassedVariables$6 = 0; collection5.add(createContextString$default(INSTANCE, psiElement, null, 2, null));
/* 149 */     }  List usagesOfPassedVariables = (List)collection1; List<PsiReferenceExpression> list3 = findVariableReferences(variable); VariableContextCollector variableContextCollector2 = INSTANCE; int k = 0;
/* 150 */     List<PsiReferenceExpression> list6 = list3; Collection collection4 = new ArrayList(); int i1 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 158 */     Iterable<PsiReferenceExpression> iterable = list6; int i2 = 0;
/* 159 */     Iterator<PsiReferenceExpression> iterator1 = iterable.iterator(); if (iterator1.hasNext()) { Object element$iv$iv$iv = iterator1.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; PsiReferenceExpression p0 = (PsiReferenceExpression)element$iv$iv;
/*     */       int $i$a$-mapNotNull-VariableContextCollector$createContextPrompt$usages$1 = 0; }
/*     */     
/* 162 */     Iterable iterable1 = CollectionsKt.distinct(collection4); int j = 0;
/* 163 */     Iterable $this$flatMapTo$iv$iv = iterable1; Collection<String> collection2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable1, 10)); int n = 0;
/* 164 */     for (Object item$iv$iv : $this$flatMapTo$iv$iv)
/* 165 */     { PsiElement psiElement = (PsiElement)item$iv$iv; Collection<String> collection5 = collection2; int $i$a$-map-VariableContextCollector$createContextPrompt$usages$2 = 0; if (variable.getName() == null)
/* 166 */         variable.getName();  }  Iterable $this$map$iv = collection2; j = 0;
/* 167 */     Iterable $this$mapTo$iv$iv = $this$map$iv; collection2 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); n = 0;
/* 168 */     for (Object item$iv$iv : $this$mapTo$iv$iv) {
/* 169 */       PsiElement context = (PsiElement)item$iv$iv; Collection<String> collection5 = collection2; int $i$a$-map-VariableContextCollector$createContextPrompt$usages$3 = 0; collection5.add(INSTANCE.createContextString(context, newVariableName));
/* 170 */     }  List usages = (List)collection2; PsiMethod containingMethod = (PsiMethod)PsiTreeUtil.getParentOfType((PsiElement)variable, PsiMethod.class); containingMethod.getReturnTypeElement(); if (((containingMethod != null && containingMethod.getReturnTypeElement() != null) ? containingMethod.getReturnTypeElement().getText() : null) == null)
/*     */       (containingMethod != null && containingMethod.getReturnTypeElement() != null) ? containingMethod.getReturnTypeElement().getText() : null;  String returnType = ""; if (containingMethod == null || containingMethod.getName() == null)
/*     */       containingMethod.getName();  String name = "test"; if ((PsiClass)PsiTreeUtil.getParentOfType((PsiElement)variable, PsiClass.class) == null || ((PsiClass)PsiTreeUtil.getParentOfType((PsiElement)variable, PsiClass.class)).getName() == null)
/*     */       ((PsiClass)PsiTreeUtil.getParentOfType((PsiElement)variable, PsiClass.class)).getName();  String className = "C"; String declarationContext = createContextForDeclaration(variable, newVariableName); String str1 = declarationContext, str2 = str1; String str5 = name, str4 = returnType, str3 = className;
/*     */     int $i$a$-takeIf-VariableContextCollector$createContextPrompt$1 = 0;
/*     */     boolean bool = variable instanceof PsiParameter;
/*     */     if ((bool ? str1 : null) == null)
/*     */       bool ? str1 : null; 
/*     */     String it = str1 = declarationContext;
/*     */     String str8 = CollectionsKt.joinToString$default(usagesOfPassedVariables, "\n        ", null, null, 0, null, null, 62, null), str7 = CollectionsKt.joinToString$default(declarationsForDependencyVariables, "\n        ", null, null, 0, null, null, 62, null), str6 = "";
/*     */     Object object = bool ? str1 : null;
/*     */     str3 = str4 = str5;
/*     */     int $i$a$-takeIf-VariableContextCollector$createContextPrompt$2 = 0;
/*     */     boolean bool1 = !(variable instanceof PsiParameter) ? true : false;
/*     */     if ((bool1 ? str1 : null) == null)
/*     */       bool1 ? str1 : null; 
/*     */     return StringsKt.trimIndent("\nclass " + str4 + " {\n    " + object + " " + str6 + "(" + str7 + "){\n        " + str8 + "\n        " + (bool1 ? str1 : null) + "\n        " + "" + "\n        " + CollectionsKt.joinToString$default(usages, "\n        ", null, null, 0, null, null, 62, null) + "\n    }\n}\n"); } @NotNull public static final VariableContextCollector INSTANCE = new VariableContextCollector(); private static final String createContextString$createContextForArguments(String $variableToExplain, PsiElement $context) { if ($variableToExplain == null)
/*     */       return ""; 
/*     */     Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.findChildrenOfType($context, PsiReferenceExpression.class), "findChildrenOfType(conte…ceExpression::class.java)");
/*     */     Collection collection1 = PsiTreeUtil.findChildrenOfType($context, PsiReferenceExpression.class);
/*     */     int $i$f$filter = 0;
/* 191 */     Collection collection2 = collection1; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 192 */     for (Object element$iv$iv : collection2) { PsiReferenceExpression reference = (PsiReferenceExpression)element$iv$iv; int $i$a$-filter-VariableContextCollector$createContextString$createContextForArguments$argumentsAsAssignments$1 = 0; if (Intrinsics.areEqual(reference.getText(), $variableToExplain)) destination$iv$iv.add(element$iv$iv);  }
/* 193 */      Iterable $this$filter$iv = destination$iv$iv; VariableContextCollector variableContextCollector = INSTANCE; int $i$f$mapNotNull = 0;
/* 194 */     Iterable iterable1 = $this$filter$iv; Collection collection3 = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 202 */     Iterable $this$forEach$iv$iv$iv = iterable1; int $i$f$forEach = 0;
/* 203 */     Iterator iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; PsiReferenceExpression p0 = (PsiReferenceExpression)element$iv$iv;
/*     */       int $i$a$-mapNotNull-VariableContextCollector$createContextString$createContextForArguments$argumentsAsAssignments$2 = 0; }
/*     */     
/* 206 */     List argumentsAsAssignments = (List)collection3;
/*     */     if (argumentsAsAssignments.isEmpty())
/*     */       return ""; 
/*     */     return "//" + CollectionsKt.joinToString$default(argumentsAsAssignments, ", ", null, null, 0, null, new VariableContextCollector$createContextString$createContextForArguments$1($variableToExplain), 30, null); }
/*     */ 
/*     */   
/*     */   private final String findParameterForCallArgument(PsiReferenceExpression argument) {
/*     */     Object object3;
/*     */     PsiMethod resolvedMethod;
/*     */     PsiParameter parameter;
/*     */     PsiElement psiElement1 = argument.getParent();
/*     */     if (((psiElement1 instanceof com.intellij.psi.PsiExpressionList) ? psiElement1 : null) == null) {
/*     */       (psiElement1 instanceof com.intellij.psi.PsiExpressionList) ? psiElement1 : null;
/*     */       return null;
/*     */     } 
/*     */     Intrinsics.checkNotNullExpressionValue(object1.getExpressions(), "argumentList.expressions");
/*     */     Integer integer = Integer.valueOf(ArraysKt.indexOf((Object[])object1.getExpressions(), argument));
/*     */     int it = integer.intValue();
/*     */     int $i$a$-takeIf-VariableContextCollector$findParameterForCallArgument$argumentPosition$1 = 0;
/*     */     if ((((it >= 0)) ? integer : null) != null) {
/*     */     
/*     */     } else {
/*     */       (((it >= 0)) ? integer : null).intValue();
/*     */       return null;
/*     */     } 
/*     */     Object object1 = (psiElement1 instanceof com.intellij.psi.PsiExpressionList) ? psiElement1 : null;
/*     */     Object object2 = object1;
/*     */     PsiElement psiElement2 = object1.getParent();
/*     */     if (((psiElement2 instanceof com.intellij.psi.PsiMethodCallExpression) ? psiElement2 : null) == null) {
/*     */       (psiElement2 instanceof com.intellij.psi.PsiMethodCallExpression) ? psiElement2 : null;
/*     */       return null;
/*     */     } 
/*     */     if (object3.resolveMethod() == null) {
/*     */       object3.resolveMethod();
/*     */       return null;
/*     */     } 
/*     */     if (resolvedMethod.getParameterList().getParameter(object2) == null) {
/*     */       resolvedMethod.getParameterList().getParameter(object2);
/*     */       return null;
/*     */     } 
/*     */     return parameter.getName();
/*     */   }
/*     */   
/*     */   private final List<PsiReferenceExpression> findVariableReferences(PsiVariable variable) {
/*     */     (PsiElement)PsiTreeUtil.getParentOfType((PsiElement)variable, PsiCodeBlock.class);
/*     */     PsiElement scope = ((PsiElement)PsiTreeUtil.getParentOfType((PsiElement)variable, PsiCodeBlock.class) != null) ? PsiTreeUtil.getParentOfType((PsiElement)variable, PsiCodeBlock.class) : PsiTreeUtil.getParentOfType((PsiElement)variable, PsiMember.class);
/*     */     Intrinsics.checkNotNullExpressionValue(VariableAccessUtils.getVariableReferences(variable, scope), "getVariableReferences(variable, scope)");
/*     */     return VariableAccessUtils.getVariableReferences(variable, scope);
/*     */   }
/*     */   
/*     */   private final PsiElement getContextForReference(PsiReferenceExpression reference) {
/*     */     PsiStatement context = (PsiStatement)PsiTreeUtil.getParentOfType((PsiElement)reference, PsiStatement.class);
/*     */     if (context instanceof PsiIfStatement)
/*     */       return (PsiElement)((PsiIfStatement)context).getCondition(); 
/*     */     return (PsiElement)context;
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
/*     */     Intrinsics.checkNotNullExpressionValue(context.getText(), "context.text");
/*     */     return ensureEndsWith(context.getText(), ";") + ensureEndsWith(context.getText(), ";");
/*     */   }
/*     */   
/*     */   private final PsiElement replaceReferenceExpressions(PsiElement element, String oldName, String newName) {
/*     */     if (newName == null)
/*     */       return element; 
/*     */     PsiElement copiedElement = element.copy();
/*     */     PsiElementFactory factory = PsiElementFactory.getInstance(element.getProject());
/*     */     Class[] arrayOfClass = new Class[1];
/*     */     arrayOfClass[0] = PsiReferenceExpression.class;
/*     */     Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.findChildrenOfAnyType(copiedElement, false, arrayOfClass), "findChildrenOfAnyType(co…ceExpression::class.java)");
/*     */     Collection collection1 = PsiTreeUtil.findChildrenOfAnyType(copiedElement, false, arrayOfClass);
/*     */     int $i$f$filter = 0;
/*     */     Collection collection2 = collection1;
/*     */     Collection<Object> destination$iv$iv = new ArrayList();
/*     */     int $i$f$filterTo = 0;
/*     */     for (Object element$iv$iv : collection2) {
/*     */       PsiReferenceExpression reference = (PsiReferenceExpression)element$iv$iv;
/*     */       int $i$a$-filter-VariableContextCollector$replaceReferenceExpressions$1 = 0;
/*     */       if (Intrinsics.areEqual(reference.getText(), oldName))
/*     */         destination$iv$iv.add(element$iv$iv); 
/*     */     } 
/*     */     Iterable $this$filter$iv = destination$iv$iv;
/*     */     int $i$f$forEach = 0;
/*     */     Iterator iterator = $this$filter$iv.iterator();
/*     */     if (iterator.hasNext()) {
/*     */       Object element$iv = iterator.next();
/*     */       PsiReferenceExpression reference = (PsiReferenceExpression)element$iv;
/*     */       int $i$a$-forEach-VariableContextCollector$replaceReferenceExpressions$2 = 0;
/*     */       reference.replace((PsiElement)factory.createExpressionFromText(newName, reference.getContext()));
/*     */     } 
/*     */     Intrinsics.checkNotNullExpressionValue(copiedElement, "copiedElement");
/*     */     return copiedElement;
/*     */   }
/*     */   
/*     */   private final String createContextForDeclaration(PsiVariable variable, String newVariableName) {
/*     */     if (newVariableName != null) {
/*     */       Intrinsics.checkNotNull(variable.copy(), "null cannot be cast to non-null type com.intellij.psi.PsiVariable");
/*     */       PsiVariable renamedVariable = (PsiVariable)variable.copy();
/*     */       renamedVariable.setName(newVariableName);
/*     */       return renamedVariable.getText();
/*     */     } 
/*     */     return variable.getText();
/*     */   }
/*     */   
/*     */   private final String ensureEndsWith(String $this$ensureEndsWith, String suffix) {
/*     */     return StringsKt.endsWith$default($this$ensureEndsWith, suffix, false, 2, null) ? $this$ensureEndsWith : ($this$ensureEndsWith + $this$ensureEndsWith);
/*     */   }
/*     */   
/*     */   private final List<PsiVariable> findUsedVariables(PsiElement scope) {
/*     */     Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.findChildrenOfType(scope, PsiReferenceExpression.class), "findChildrenOfType(scope…ceExpression::class.java)");
/*     */     Collection collection1 = PsiTreeUtil.findChildrenOfType(scope, PsiReferenceExpression.class);
/*     */     int $i$f$map = 0;
/*     */     Collection collection2 = collection1;
/*     */     Collection<PsiElement> collection = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection1, 10));
/*     */     int $i$f$mapTo = 0;
/*     */     for (Object item$iv$iv : collection2) {
/*     */       PsiReferenceExpression psiReferenceExpression = (PsiReferenceExpression)item$iv$iv;
/*     */       Collection<PsiElement> collection3 = collection;
/*     */       int $i$a$-map-VariableContextCollector$findUsedVariables$1 = 0;
/*     */       collection3.add(psiReferenceExpression.resolve());
/*     */     } 
/*     */     Iterable $this$map$iv = collection;
/*     */     int $i$f$filterIsInstance = 0;
/*     */     Iterable $this$mapTo$iv$iv = $this$map$iv;
/*     */     Collection<Object> destination$iv$iv = new ArrayList();
/*     */     int $i$f$filterIsInstanceTo = 0;
/*     */     for (Object element$iv$iv : $this$mapTo$iv$iv) {
/*     */       if (element$iv$iv instanceof PsiVariable)
/*     */         destination$iv$iv.add(element$iv$iv); 
/*     */     } 
/*     */     return (List)destination$iv$iv;
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/refactorings/VariableContextCollector.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */