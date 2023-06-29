/*     */ package com.intellij.ml.llm.kotlin;
/*     */ 
/*     */ import com.intellij.openapi.editor.SelectionModel;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import com.intellij.psi.PsiNameIdentifierOwner;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.regex.Pattern;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.kotlin.kdoc.psi.api.KDoc;
/*     */ import org.jetbrains.kotlin.psi.KtDeclaration;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\t\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\000\b\007\030\0002\0020\001B\005¢\006\002\020\002J\036\020\021\032\020\022\004\022\0020\b\022\004\022\0020\b\030\0010\0222\006\020\023\032\0020\024H\026J\022\020\025\032\004\030\0010\0242\006\020\026\032\0020\027H\026J\022\020\030\032\004\030\0010\0272\006\020\026\032\0020\027H\026J\036\020\031\032\b\022\004\022\0020\0240\0322\006\020\033\032\0020\0272\006\020\034\032\0020\035H\026J\030\020\036\032\0020\0372\006\020 \032\0020!2\006\020\"\032\0020\bH\026J\030\020#\032\0020$2\006\020\023\032\0020\0272\006\020\"\032\0020\bH\026R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006R\024\020\007\032\0020\b8VX\004¢\006\006\032\004\b\t\020\nR\024\020\013\032\0020\b8VX\004¢\006\006\032\004\b\f\020\nR\024\020\r\032\0020\b8VX\004¢\006\006\032\004\b\016\020\nR\024\020\017\032\0020\b8VX\004¢\006\006\032\004\b\020\020\n¨\006%"}, d2 = {"Lcom/intellij/ml/llm/kotlin/LLMKotlinDocumentationSupport;", "Lcom/intellij/ml/llm/core/LLMDocumentationSupport;", "()V", "commentBoundsRegex", "Ljava/util/regex/Pattern;", "getCommentBoundsRegex", "()Ljava/util/regex/Pattern;", "commentEnd", "", "getCommentEnd", "()Ljava/lang/String;", "commentStart", "getCommentStart", "docFormatInstruction", "getDocFormatInstruction", "emptyComment", "getEmptyComment", "findExampleComment", "Lkotlin/Pair;", "declaration", "Lcom/intellij/psi/PsiNameIdentifierOwner;", "getClosestNamedElement", "element", "Lcom/intellij/psi/PsiElement;", "getDocComment", "getSelectedElementToDocument", "", "root", "selectionModel", "Lcom/intellij/openapi/editor/SelectionModel;", "isValidComment", "", "project", "Lcom/intellij/openapi/project/Project;", "comment", "replaceComment", "", "intellij.ml.llm.kotlin"})
/*     */ @VisibleForTesting
/*     */ @SourceDebugExtension({"SMAP\nLLMKotlinDocumentationSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMKotlinDocumentationSupport.kt\ncom/intellij/ml/llm/kotlin/LLMKotlinDocumentationSupport\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,80:1\n384#2,4:81\n800#3,11:85\n766#3:96\n857#3,2:97\n800#3,11:99\n766#3:110\n857#3,2:111\n*S KotlinDebug\n*F\n+ 1 LLMKotlinDocumentationSupport.kt\ncom/intellij/ml/llm/kotlin/LLMKotlinDocumentationSupport\n*L\n34#1:81,4\n62#1:85,11\n62#1:96\n62#1:97,2\n68#1:99,11\n68#1:110\n68#1:111,2\n*E\n"})
/*     */ public final class LLMKotlinDocumentationSupport implements LLMDocumentationSupport {
/*     */   @NotNull
/*     */   private final Pattern commentBoundsRegex;
/*     */   
/*  24 */   public LLMKotlinDocumentationSupport() { Intrinsics.checkNotNullExpressionValue(Pattern.compile("/\\*\\*|\\*/"), "compile(\"/\\\\*\\\\*|\\\\*/\")"); this.commentBoundsRegex = Pattern.compile("/\\*\\*|\\*/"); } @NotNull public String getEmptyComment() { return "/**\n*/"; } @NotNull public Pattern getCommentBoundsRegex() { return this.commentBoundsRegex; }
/*     */   @NotNull public String getCommentStart() { return "/**"; }
/*  26 */   @NotNull public String getCommentEnd() { return "*/"; } @NotNull public String getDocFormatInstruction() { return "write KDoc"; }
/*     */    @Nullable
/*     */   public PsiElement getDocComment(@NotNull PsiElement element) {
/*  29 */     Intrinsics.checkNotNullParameter(element, "element"); (element instanceof KtDeclaration) ? element : null; return (((element instanceof KtDeclaration) ? element : null) != null) ? (PsiElement)((element instanceof KtDeclaration) ? element : null).getDocComment() : null;
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
/*     */     //   102: new org/jetbrains/kotlin/psi/KtPsiFactory
/*     */     //   105: dup
/*     */     //   106: aload_1
/*     */     //   107: iconst_0
/*     */     //   108: iconst_2
/*     */     //   109: aconst_null
/*     */     //   110: invokespecial <init> : (Lcom/intellij/openapi/project/Project;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   113: aload_3
/*     */     //   114: invokevirtual createComment : (Ljava/lang/String;)Lcom/intellij/psi/PsiComment;
/*     */     //   117: pop
/*     */     //   118: iconst_1
/*     */     //   119: ireturn
/*     */     //   120: astore_3
/*     */     //   121: iconst_0
/*     */     //   122: ireturn
/*     */     //   123: astore_3
/*     */     //   124: iconst_0
/*     */     //   125: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #33	-> 12
/*     */     //   #34	-> 13
/*     */     //   #81	-> 19
/*     */     //   #82	-> 35
/*     */     //   #34	-> 47
/*     */     //   #82	-> 59
/*     */     //   #83	-> 62
/*     */     //   #83	-> 90
/*     */     //   #81	-> 93
/*     */     //   #84	-> 99
/*     */     //   #34	-> 101
/*     */     //   #35	-> 102
/*     */     //   #36	-> 118
/*     */     //   #38	-> 120
/*     */     //   #39	-> 121
/*     */     //   #41	-> 123
/*     */     //   #42	-> 124
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   47	12	8	$i$a$-dropLastWhile-LLMKotlinDocumentationSupport$isValidComment$trimmedComment$1	I
/*     */     //   44	15	7	it	C
/*     */     //   29	70	6	index$iv	I
/*     */     //   19	82	5	$i$f$dropLastWhile	I
/*     */     //   16	85	4	$this$dropLastWhile$iv	Ljava/lang/String;
/*     */     //   102	18	3	trimmedComment	Ljava/lang/String;
/*     */     //   121	2	3	e	Ljava/lang/Exception;
/*     */     //   124	2	3	e	Ljava/lang/AssertionError;
/*     */     //   0	126	0	this	Lcom/intellij/ml/llm/kotlin/LLMKotlinDocumentationSupport;
/*     */     //   0	126	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   0	126	2	comment	Ljava/lang/String;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   12	120	120	java/lang/Exception
/*     */     //   12	120	123	java/lang/AssertionError
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public Pair<String, String> findExampleComment(@NotNull PsiNameIdentifierOwner declaration) {
/*  46 */     Intrinsics.checkNotNullParameter(declaration, "declaration"); return null;
/*     */   } public void replaceComment(@NotNull PsiElement declaration, @NotNull String comment) {
/*     */     Object object;
/*  49 */     Intrinsics.checkNotNullParameter(declaration, "declaration"); Intrinsics.checkNotNullParameter(comment, "comment"); if (((declaration instanceof KtDeclaration) ? declaration : null) == null) { (declaration instanceof KtDeclaration) ? declaration : null; throw new IncorrectOperationException(); }
/*  50 */      Intrinsics.checkNotNullExpressionValue(((KtDeclaration)declaration).getProject(), "declaration.project"); KDoc docComment = (new KDocElementFactory(((KtDeclaration)declaration).getProject())).createKDocFromText(comment);
/*  51 */     if (((KtDeclaration)declaration).getDocComment() == null || ((KtDeclaration)declaration).getDocComment().replace((PsiElement)docComment) == null) { ((KtDeclaration)declaration).getDocComment().replace((PsiElement)docComment); LLMKotlinDocumentationSupport $this$replaceComment_u24lambda_u241 = this; int $i$a$-run-LLMKotlinDocumentationSupport$replaceComment$1 = 0; }
/*  52 */      object.addBefore((PsiElement)docComment, object.getFirstChild());
/*     */   }
/*     */   @NotNull
/*     */   public List<PsiNameIdentifierOwner> getSelectedElementToDocument(@NotNull PsiElement root, @NotNull SelectionModel selectionModel) {
/*     */     PsiElement commonParent;
/*     */     PsiNameIdentifierOwner closestNamedElement;
/*  58 */     Intrinsics.checkNotNullParameter(root, "root"); Intrinsics.checkNotNullParameter(selectionModel, "selectionModel"); if (CollectHighlightsUtil.findCommonParent(root, 
/*  59 */         selectionModel.getSelectionStart(), 
/*  60 */         selectionModel.getSelectionEnd()) == null) { CollectHighlightsUtil.findCommonParent(root, selectionModel.getSelectionStart(), selectionModel.getSelectionEnd()); return CollectionsKt.emptyList(); }
/*  61 */      if (commonParent instanceof KtFile)
/*  62 */     { Iterable iterable2 = ((KtFile)commonParent).getDeclarations(); int j = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  85 */       Iterable iterable4 = iterable2; Collection<Object> collection3 = new ArrayList(); int m = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  94 */       for (Object element$iv$iv : iterable4) { if (element$iv$iv instanceof PsiNameIdentifierOwner) collection3.add(element$iv$iv);  }
/*  95 */        iterable2 = collection3; int i = 0;
/*  96 */       Iterable iterable3 = iterable2; Collection<Object> collection2 = new ArrayList(); int k = 0;
/*  97 */       for (Object element$iv$iv : iterable3) { PsiNameIdentifierOwner it = (PsiNameIdentifierOwner)element$iv$iv; int $i$a$-filter-LLMKotlinDocumentationSupport$getSelectedElementToDocument$1 = 0; if (containsElement(selectionModel, (PsiElement)it)) collection2.add(element$iv$iv);  }
/*  98 */        return (List)collection2; }  if (getClosestNamedElement(commonParent) == null) { getClosestNamedElement(commonParent); return CollectionsKt.emptyList(); }  if (!(closestNamedElement instanceof KtClassOrObject) || containsElement(selectionModel, (PsiElement)closestNamedElement))
/*  99 */       return CollectionsKt.listOf(closestNamedElement);  Iterable $this$filterIsInstance$iv = ((KtClassOrObject)closestNamedElement).getDeclarations(); int $i$f$filterIsInstance = 0; Iterable iterable1 = $this$filterIsInstance$iv; Collection<Object> collection1 = new ArrayList(); int $i$f$filterIsInstanceTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 108 */     for (Object element$iv$iv : iterable1) { if (element$iv$iv instanceof PsiNameIdentifierOwner) collection1.add(element$iv$iv);  }
/* 109 */      $this$filterIsInstance$iv = collection1; int $i$f$filter = 0;
/* 110 */     Iterable $this$filterIsInstanceTo$iv$iv = $this$filterIsInstance$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 111 */     for (Object element$iv$iv : $this$filterIsInstanceTo$iv$iv) { PsiNameIdentifierOwner it = (PsiNameIdentifierOwner)element$iv$iv; int $i$a$-filter-LLMKotlinDocumentationSupport$getSelectedElementToDocument$2 = 0; if (containsElement(selectionModel, (PsiElement)it)) destination$iv$iv.add(element$iv$iv);  }
/* 112 */      return (List)destination$iv$iv;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public PsiNameIdentifierOwner getClosestNamedElement(@NotNull PsiElement element) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'element'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: instanceof org/jetbrains/kotlin/psi/KtNamedFunction
/*     */     //   10: ifne -> 20
/*     */     //   13: aload_1
/*     */     //   14: instanceof org/jetbrains/kotlin/psi/KtClassOrObject
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
/*     */     //   36: instanceof org/jetbrains/kotlin/psi/KtNamedFunction
/*     */     //   39: ifne -> 66
/*     */     //   42: aload_1
/*     */     //   43: ldc_w org/jetbrains/kotlin/psi/KtNamedFunction
/*     */     //   46: invokestatic getParentOfType : (Lcom/intellij/psi/PsiElement;Ljava/lang/Class;)Lcom/intellij/psi/PsiElement;
/*     */     //   49: checkcast org/jetbrains/kotlin/psi/KtNamedFunction
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
/*     */     //   #72	-> 6
/*     */     //   #73	-> 25
/*     */     //   #74	-> 35
/*     */     //   #75	-> 42
/*     */     //   #77	-> 66
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   35	33	2	closestIdentifierOwner	Lcom/intellij/psi/PsiNameIdentifierOwner;
/*     */     //   0	68	0	this	Lcom/intellij/ml/llm/kotlin/LLMKotlinDocumentationSupport;
/*     */     //   0	68	1	element	Lcom/intellij/psi/PsiElement;
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/LLMKotlinDocumentationSupport.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */