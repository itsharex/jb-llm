/*     */ package com.intellij.ml.llm.java;
/*     */ 
/*     */ import com.intellij.openapi.editor.SelectionModel;
/*     */ import com.intellij.psi.PsiClass;
/*     */ import com.intellij.psi.PsiDocCommentOwner;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import com.intellij.psi.PsiNameIdentifierOwner;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\t\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\000\b\007\030\0002\0020\001B\005¢\006\002\020\002J\036\020\021\032\020\022\004\022\0020\b\022\004\022\0020\b\030\0010\0222\006\020\023\032\0020\024H\026J\022\020\025\032\004\030\0010\0242\006\020\026\032\0020\027H\026J\022\020\030\032\004\030\0010\0272\006\020\026\032\0020\027H\026J\036\020\031\032\b\022\004\022\0020\0240\0322\006\020\033\032\0020\0272\006\020\034\032\0020\035H\026J\030\020\036\032\0020\0372\006\020 \032\0020!2\006\020\"\032\0020\bH\026J\030\020#\032\0020$2\006\020\023\032\0020\0272\006\020\"\032\0020\bH\026R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006R\024\020\007\032\0020\b8VX\004¢\006\006\032\004\b\t\020\nR\024\020\013\032\0020\b8VX\004¢\006\006\032\004\b\f\020\nR\024\020\r\032\0020\b8VX\004¢\006\006\032\004\b\016\020\nR\024\020\017\032\0020\b8VX\004¢\006\006\032\004\b\020\020\n¨\006%"}, d2 = {"Lcom/intellij/ml/llm/java/LLMJavaDocumentationSupport;", "Lcom/intellij/ml/llm/core/LLMDocumentationSupport;", "()V", "commentBoundsRegex", "Ljava/util/regex/Pattern;", "getCommentBoundsRegex", "()Ljava/util/regex/Pattern;", "commentEnd", "", "getCommentEnd", "()Ljava/lang/String;", "commentStart", "getCommentStart", "docFormatInstruction", "getDocFormatInstruction", "emptyComment", "getEmptyComment", "findExampleComment", "Lkotlin/Pair;", "declaration", "Lcom/intellij/psi/PsiNameIdentifierOwner;", "getClosestNamedElement", "element", "Lcom/intellij/psi/PsiElement;", "getDocComment", "getSelectedElementToDocument", "", "root", "selectionModel", "Lcom/intellij/openapi/editor/SelectionModel;", "isValidComment", "", "project", "Lcom/intellij/openapi/project/Project;", "comment", "replaceComment", "", "intellij.ml.llm.java"})
/*     */ @VisibleForTesting
/*     */ @SourceDebugExtension({"SMAP\nLLMJavaDocumentationSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMJavaDocumentationSupport.kt\ncom/intellij/ml/llm/java/LLMJavaDocumentationSupport\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,116:1\n1#2:117\n3792#3:118\n4307#3,2:119\n3792#3:121\n4307#3,2:122\n3792#3:124\n4307#3,2:125\n800#4,11:127\n*S KotlinDebug\n*F\n+ 1 LLMJavaDocumentationSupport.kt\ncom/intellij/ml/llm/java/LLMJavaDocumentationSupport\n*L\n89#1:118\n89#1:119,2\n97#1:121\n97#1:122,2\n99#1:124\n99#1:125,2\n99#1:127,11\n*E\n"})
/*     */ public final class LLMJavaDocumentationSupport implements LLMDocumentationSupport {
/*     */   @NotNull
/*     */   private final Pattern commentBoundsRegex;
/*     */   
/*  21 */   public LLMJavaDocumentationSupport() { Intrinsics.checkNotNullExpressionValue(Pattern.compile("/\\*\\*|\\*/"), "compile(\"/\\\\*\\\\*|\\\\*/\")"); this.commentBoundsRegex = Pattern.compile("/\\*\\*|\\*/"); } @NotNull public String getEmptyComment() { return "/**\n*/"; } @NotNull public Pattern getCommentBoundsRegex() { return this.commentBoundsRegex; }
/*     */   @NotNull public String getCommentStart() { return "/**"; }
/*  23 */   @NotNull public String getCommentEnd() { return "*/"; } @NotNull public String getDocFormatInstruction() { return "write javadoc"; }
/*     */    @Nullable
/*     */   public PsiElement getDocComment(@NotNull PsiElement element) {
/*  26 */     Intrinsics.checkNotNullParameter(element, "element"); (element instanceof PsiDocCommentOwner) ? element : null; return (((element instanceof PsiDocCommentOwner) ? element : null) != null) ? (PsiElement)((element instanceof PsiDocCommentOwner) ? element : null).getDocComment() : null;
/*     */   }
/*     */   
/*     */   public boolean isValidComment(@NotNull Project project, @NotNull String comment) {
/*  30 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(comment, "comment"); try {
/*  31 */       JavaPsiFacade.getElementFactory(project).createDocCommentFromText(comment, null);
/*  32 */       return true;
/*     */     }
/*  34 */     catch (Exception e) {
/*  35 */       return false;
/*     */     }
/*  37 */     catch (AssertionError e) {
/*  38 */       return false;
/*     */     } 
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
/*     */   @Nullable
/*     */   public Pair<String, String> findExampleComment(@NotNull PsiNameIdentifierOwner declaration) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'declaration'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: instanceof com/intellij/psi/PsiMethod
/*     */     //   10: ifeq -> 243
/*     */     //   13: aload_1
/*     */     //   14: checkcast com/intellij/psi/PsiElement
/*     */     //   17: invokestatic skipWhitespacesAndCommentsBackward : (Lcom/intellij/psi/PsiElement;)Lcom/intellij/psi/PsiElement;
/*     */     //   20: astore_2
/*     */     //   21: aload_2
/*     */     //   22: ifnull -> 55
/*     */     //   25: aload_2
/*     */     //   26: instanceof com/intellij/psi/PsiMethod
/*     */     //   29: ifeq -> 47
/*     */     //   32: aload_2
/*     */     //   33: checkcast com/intellij/psi/PsiMethod
/*     */     //   36: invokeinterface getDocComment : ()Lcom/intellij/psi/javadoc/PsiDocComment;
/*     */     //   41: ifnull -> 47
/*     */     //   44: goto -> 55
/*     */     //   47: aload_2
/*     */     //   48: invokestatic skipWhitespacesAndCommentsBackward : (Lcom/intellij/psi/PsiElement;)Lcom/intellij/psi/PsiElement;
/*     */     //   51: astore_2
/*     */     //   52: goto -> 21
/*     */     //   55: aload_2
/*     */     //   56: dup
/*     */     //   57: ifnonnull -> 152
/*     */     //   60: pop
/*     */     //   61: aload_1
/*     */     //   62: checkcast com/intellij/psi/PsiMethod
/*     */     //   65: invokeinterface getContainingClass : ()Lcom/intellij/psi/PsiClass;
/*     */     //   70: dup
/*     */     //   71: ifnull -> 147
/*     */     //   74: invokeinterface getMethods : ()[Lcom/intellij/psi/PsiMethod;
/*     */     //   79: dup
/*     */     //   80: ifnull -> 147
/*     */     //   83: astore #8
/*     */     //   85: iconst_0
/*     */     //   86: istore #9
/*     */     //   88: aload #8
/*     */     //   90: arraylength
/*     */     //   91: istore #10
/*     */     //   93: iload #9
/*     */     //   95: iload #10
/*     */     //   97: if_icmpge -> 143
/*     */     //   100: aload #8
/*     */     //   102: iload #9
/*     */     //   104: aaload
/*     */     //   105: astore #11
/*     */     //   107: aload #11
/*     */     //   109: astore #12
/*     */     //   111: iconst_0
/*     */     //   112: istore #13
/*     */     //   114: aload #12
/*     */     //   116: invokeinterface getDocComment : ()Lcom/intellij/psi/javadoc/PsiDocComment;
/*     */     //   121: ifnull -> 128
/*     */     //   124: iconst_1
/*     */     //   125: goto -> 129
/*     */     //   128: iconst_0
/*     */     //   129: ifeq -> 137
/*     */     //   132: aload #11
/*     */     //   134: goto -> 149
/*     */     //   137: iinc #9, 1
/*     */     //   140: goto -> 93
/*     */     //   143: aconst_null
/*     */     //   144: goto -> 149
/*     */     //   147: pop
/*     */     //   148: aconst_null
/*     */     //   149: checkcast com/intellij/psi/PsiElement
/*     */     //   152: astore_3
/*     */     //   153: aload_3
/*     */     //   154: instanceof com/intellij/psi/PsiMethod
/*     */     //   157: ifeq -> 243
/*     */     //   160: aload_3
/*     */     //   161: checkcast com/intellij/psi/PsiMethod
/*     */     //   164: invokeinterface getDocComment : ()Lcom/intellij/psi/javadoc/PsiDocComment;
/*     */     //   169: dup
/*     */     //   170: ifnonnull -> 187
/*     */     //   173: pop
/*     */     //   174: new java/lang/IllegalStateException
/*     */     //   177: dup
/*     */     //   178: ldc 'Should be present'
/*     */     //   180: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   183: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   186: athrow
/*     */     //   187: astore #4
/*     */     //   189: aload_3
/*     */     //   190: checkcast com/intellij/psi/PsiMethod
/*     */     //   193: invokeinterface getText : ()Ljava/lang/String;
/*     */     //   198: dup
/*     */     //   199: ldc 'methodWithComment.text'
/*     */     //   201: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   204: astore #6
/*     */     //   206: aload #4
/*     */     //   208: invokeinterface getTextLength : ()I
/*     */     //   213: istore #7
/*     */     //   215: aload #6
/*     */     //   217: iload #7
/*     */     //   219: invokevirtual substring : (I)Ljava/lang/String;
/*     */     //   222: dup
/*     */     //   223: ldc 'this as java.lang.String).substring(startIndex)'
/*     */     //   225: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   228: astore #5
/*     */     //   230: aload #5
/*     */     //   232: aload #4
/*     */     //   234: invokeinterface getText : ()Ljava/lang/String;
/*     */     //   239: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
/*     */     //   242: areturn
/*     */     //   243: aconst_null
/*     */     //   244: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #43	-> 6
/*     */     //   #44	-> 13
/*     */     //   #45	-> 21
/*     */     //   #46	-> 25
/*     */     //   #47	-> 44
/*     */     //   #49	-> 47
/*     */     //   #52	-> 55
/*     */     //   #117	-> 111
/*     */     //   #52	-> 114
/*     */     //   #52	-> 129
/*     */     //   #52	-> 147
/*     */     //   #51	-> 152
/*     */     //   #53	-> 153
/*     */     //   #54	-> 160
/*     */     //   #55	-> 189
/*     */     //   #55	-> 228
/*     */     //   #56	-> 230
/*     */     //   #60	-> 243
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   114	15	13	$i$a$-find-LLMJavaDocumentationSupport$findExampleComment$methodWithComment$1	I
/*     */     //   111	18	12	it	Lcom/intellij/psi/PsiMethod;
/*     */     //   189	54	4	docComment	Lcom/intellij/psi/javadoc/PsiDocComment;
/*     */     //   230	13	5	methodTextWithoutDoc	Ljava/lang/String;
/*     */     //   21	222	2	prevMethodWithComment	Lcom/intellij/psi/PsiElement;
/*     */     //   153	90	3	methodWithComment	Lcom/intellij/psi/PsiElement;
/*     */     //   0	245	0	this	Lcom/intellij/ml/llm/java/LLMJavaDocumentationSupport;
/*     */     //   0	245	1	declaration	Lcom/intellij/psi/PsiNameIdentifierOwner;
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
/*     */   public void replaceComment(@NotNull PsiElement declaration, @NotNull String comment) {
/*  64 */     Intrinsics.checkNotNullParameter(declaration, "declaration"); Intrinsics.checkNotNullParameter(comment, "comment"); Intrinsics.checkNotNullExpressionValue(declaration.getProject(), "declaration.project"); Project project = declaration.getProject();
/*  65 */     PsiElementFactory factory = JavaPsiFacade.getElementFactory(project);
/*  66 */     Intrinsics.checkNotNullExpressionValue(factory.createDocCommentFromText(comment), "factory.createDocCommentFromText(comment)"); PsiDocComment newDocComment = factory.createDocCommentFromText(comment);
/*     */     try {
/*  68 */       PsiDocCommentOwner commentedDeclaration = (declaration instanceof PsiDocCommentOwner) ? (PsiDocCommentOwner)declaration : null;
/*  69 */       commentedDeclaration.getDocComment(); if (((commentedDeclaration != null && commentedDeclaration.getDocComment() != null) ? commentedDeclaration.getDocComment().replace((PsiElement)newDocComment) : null) == null) { (commentedDeclaration != null && commentedDeclaration.getDocComment() != null) ? commentedDeclaration.getDocComment().replace((PsiElement)newDocComment) : null; throw new IncorrectOperationException(); }  (commentedDeclaration != null && commentedDeclaration.getDocComment() != null) ? commentedDeclaration.getDocComment().replace((PsiElement)newDocComment) : null;
/*     */     }
/*  71 */     catch (IncorrectOperationException e) {
/*  72 */       declaration.getParent().addBefore((PsiElement)newDocComment, declaration);
/*  73 */       declaration.getParent().addBefore(
/*  74 */           PsiParserFacade.getInstance(project).createWhiteSpaceFromText("\n"), 
/*  75 */           declaration);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public List<PsiNameIdentifierOwner> getSelectedElementToDocument(@NotNull PsiElement root, @NotNull SelectionModel selectionModel) {
/*     */     PsiElement commonParent;
/*     */     PsiNameIdentifierOwner closestNamedElement;
/*  84 */     Intrinsics.checkNotNullParameter(root, "root"); Intrinsics.checkNotNullParameter(selectionModel, "selectionModel"); if (CollectHighlightsUtil.findCommonParent(root, 
/*  85 */         selectionModel.getSelectionStart(), 
/*  86 */         selectionModel.getSelectionEnd()) == null) { CollectHighlightsUtil.findCommonParent(root, selectionModel.getSelectionStart(), selectionModel.getSelectionEnd()); return CollectionsKt.emptyList(); }
/*  87 */      if (commonParent instanceof PsiJavaFile)
/*  88 */     { List list3 = CollectionsKt.createListBuilder(), $this$getSelectedElementToDocument_u24lambda_u242 = list3; int $i$a$-buildList-LLMJavaDocumentationSupport$getSelectedElementToDocument$1 = 0;
/*  89 */       Intrinsics.checkNotNullExpressionValue(((PsiJavaFile)commonParent).getClasses(), "commonParent.classes"); Object[] arrayOfObject4 = (Object[])((PsiJavaFile)commonParent).getClasses(); List list4 = $this$getSelectedElementToDocument_u24lambda_u242; int n = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 118 */       Object[] arrayOfObject5 = arrayOfObject4; Collection<Object> collection = new ArrayList(); int i1 = 0; byte b1; int i2;
/* 119 */       for (b1 = 0, i2 = arrayOfObject5.length; b1 < i2; ) { Object element$iv$iv = arrayOfObject5[b1]; PsiClass it = (PsiClass)element$iv$iv; int $i$a$-filter-LLMJavaDocumentationSupport$getSelectedElementToDocument$1$1 = 0; Intrinsics.checkNotNullExpressionValue(it, "it"); if (containsElement(selectionModel, (PsiElement)it)) collection.add(element$iv$iv);  }
/* 120 */        list4.addAll(collection); return CollectionsKt.build(list3); }  if (getClosestNamedElement(commonParent) == null) { getClosestNamedElement(commonParent); return CollectionsKt.emptyList(); }  if (!(closestNamedElement instanceof PsiClass) || containsElement(selectionModel, (PsiElement)closestNamedElement))
/* 121 */       return CollectionsKt.listOf(closestNamedElement);  Intrinsics.checkNotNullExpressionValue(((PsiClass)closestNamedElement).getFields(), "closestNamedElement.fields"); Object[] arrayOfObject1 = (Object[])((PsiClass)closestNamedElement).getFields(); int $i$f$filter = 0; Object[] arrayOfObject2 = arrayOfObject1; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0; int k;
/* 122 */     for (byte b = 0; b < k; ) { Object element$iv$iv = arrayOfObject2[b]; PsiField it = (PsiField)element$iv$iv; int $i$a$-filter-LLMJavaDocumentationSupport$getSelectedElementToDocument$fieldsInRange$1 = 0; Intrinsics.checkNotNullExpressionValue(it, "it"); if (containsElement(selectionModel, (PsiElement)it)) destination$iv$iv.add(element$iv$iv);  }
/* 123 */      List fieldsInRange = (List)destination$iv$iv; Intrinsics.checkNotNullExpressionValue(((PsiClass)closestNamedElement).getMethods(), "closestNamedElement.methods"); Object[] $this$filter$iv = (Object[])((PsiClass)closestNamedElement).getMethods(); int i = 0;
/* 124 */     Object[] arrayOfObject3 = $this$filter$iv; Collection<Object> collection2 = new ArrayList(); int j = 0; int m;
/* 125 */     for (k = 0, m = arrayOfObject3.length; k < m; ) { Object element$iv$iv = arrayOfObject3[k]; PsiMethod it = (PsiMethod)element$iv$iv; int $i$a$-filter-LLMJavaDocumentationSupport$getSelectedElementToDocument$methodsInRange$1 = 0; Intrinsics.checkNotNullExpressionValue(it, "it"); if (containsElement(selectionModel, (PsiElement)it)) collection2.add(element$iv$iv);  }
/* 126 */      List list1 = (List)collection2; int $i$f$filterIsInstance = 0;
/* 127 */     List list2 = list1; Collection<Object> collection1 = new ArrayList(); int $i$f$filterIsInstanceTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 136 */     for (Object element$iv$iv : list2) { if (element$iv$iv instanceof PsiMethod) collection1.add(element$iv$iv);  }
/* 137 */      List methodsInRange = (List)collection1;
/*     */     Iterable $this$filterIsInstance$iv = CollectionsKt.createListBuilder(), iterable1 = $this$filterIsInstance$iv;
/*     */     int $i$a$-buildList-LLMJavaDocumentationSupport$getSelectedElementToDocument$2 = 0;
/*     */     iterable1.addAll(fieldsInRange);
/*     */     iterable1.addAll(methodsInRange);
/*     */     return CollectionsKt.build((List)$this$filterIsInstance$iv);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public PsiNameIdentifierOwner getClosestNamedElement(@NotNull PsiElement element) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'element'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: instanceof com/intellij/psi/PsiMethod
/*     */     //   10: ifne -> 20
/*     */     //   13: aload_1
/*     */     //   14: instanceof com/intellij/psi/PsiClass
/*     */     //   17: ifeq -> 25
/*     */     //   20: aload_1
/*     */     //   21: checkcast com/intellij/psi/PsiNameIdentifierOwner
/*     */     //   24: areturn
/*     */     //   25: aload_1
/*     */     //   26: ldc com/intellij/psi/PsiNameIdentifierOwner
/*     */     //   28: invokestatic getParentOfType : (Lcom/intellij/psi/PsiElement;Ljava/lang/Class;)Lcom/intellij/psi/PsiElement;
/*     */     //   31: checkcast com/intellij/psi/PsiNameIdentifierOwner
/*     */     //   34: astore_2
/*     */     //   35: aload_2
/*     */     //   36: instanceof com/intellij/psi/PsiMethod
/*     */     //   39: ifne -> 65
/*     */     //   42: aload_1
/*     */     //   43: ldc com/intellij/psi/PsiMethod
/*     */     //   45: invokestatic getParentOfType : (Lcom/intellij/psi/PsiElement;Ljava/lang/Class;)Lcom/intellij/psi/PsiElement;
/*     */     //   48: checkcast com/intellij/psi/PsiMethod
/*     */     //   51: dup
/*     */     //   52: ifnull -> 61
/*     */     //   55: checkcast com/intellij/psi/PsiNameIdentifierOwner
/*     */     //   58: goto -> 64
/*     */     //   61: pop
/*     */     //   62: aload_2
/*     */     //   63: areturn
/*     */     //   64: areturn
/*     */     //   65: aload_2
/*     */     //   66: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #108	-> 6
/*     */     //   #109	-> 25
/*     */     //   #110	-> 35
/*     */     //   #111	-> 42
/*     */     //   #113	-> 65
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   35	32	2	closestIdentifierOwner	Lcom/intellij/psi/PsiNameIdentifierOwner;
/*     */     //   0	67	0	this	Lcom/intellij/ml/llm/java/LLMJavaDocumentationSupport;
/*     */     //   0	67	1	element	Lcom/intellij/psi/PsiElement;
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/LLMJavaDocumentationSupport.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */