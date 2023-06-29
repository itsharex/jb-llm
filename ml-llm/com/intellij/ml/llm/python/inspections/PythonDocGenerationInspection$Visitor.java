/*    */ package com.intellij.ml.llm.python.inspections;
/*    */ 
/*    */ import com.intellij.codeInspection.ProblemsHolder;
/*    */ import com.intellij.openapi.roots.ProjectRootManager;
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import com.jetbrains.python.inspections.PyInspectionVisitor;
/*    */ import com.jetbrains.python.psi.PyClass;
/*    */ import com.jetbrains.python.psi.PyDocStringOwner;
/*    */ import com.jetbrains.python.psi.PyFunction;
/*    */ import com.jetbrains.python.psi.types.TypeEvalContext;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\b\002\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\030\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\002\032\0020\003H\002J\022\020\013\032\0020\f2\b\020\t\032\004\030\0010\rH\002J\020\020\016\032\0020\b2\006\020\017\032\0020\020H\026J\020\020\021\032\0020\b2\006\020\017\032\0020\022H\026¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/python/inspections/PythonDocGenerationInspection$Visitor;", "Lcom/jetbrains/python/inspections/PyInspectionVisitor;", "holder", "Lcom/intellij/codeInspection/ProblemsHolder;", "context", "Lcom/jetbrains/python/psi/types/TypeEvalContext;", "(Lcom/intellij/codeInspection/ProblemsHolder;Lcom/jetbrains/python/psi/types/TypeEvalContext;)V", "checkDocString", "", "element", "Lcom/jetbrains/python/psi/PyDocStringOwner;", "isInTestSourceContent", "", "Lcom/intellij/psi/PsiElement;", "visitPyClass", "node", "Lcom/jetbrains/python/psi/PyClass;", "visitPyFunction", "Lcom/jetbrains/python/psi/PyFunction;", "intellij.ml.llm.python"})
/*    */ @SourceDebugExtension({"SMAP\nPythonDocGenerationInspection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PythonDocGenerationInspection.kt\ncom/intellij/ml/llm/python/inspections/PythonDocGenerationInspection$Visitor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1#2:65\n*E\n"})
/*    */ final class Visitor
/*    */   extends PyInspectionVisitor
/*    */ {
/*    */   public Visitor(@NotNull ProblemsHolder holder, @NotNull TypeEvalContext context) {
/* 25 */     super(holder, context);
/*    */   } public void visitPyFunction(@NotNull PyFunction node) {
/* 27 */     Intrinsics.checkNotNullParameter(node, "node"); super.visitPyFunction(node);
/* 28 */     Intrinsics.checkNotNull(getHolder()); checkDocString((PyDocStringOwner)node, getHolder());
/*    */   }
/*    */   
/*    */   public void visitPyClass(@NotNull PyClass node) {
/* 32 */     Intrinsics.checkNotNullParameter(node, "node"); super.visitPyClass(node);
/* 33 */     Intrinsics.checkNotNull(getHolder()); checkDocString((PyDocStringOwner)node, getHolder());
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
/*    */   private final void checkDocString(PyDocStringOwner element, ProblemsHolder holder) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload_1
/*    */     //   2: checkcast com/intellij/psi/PsiElement
/*    */     //   5: invokespecial isInTestSourceContent : (Lcom/intellij/psi/PsiElement;)Z
/*    */     //   8: ifeq -> 12
/*    */     //   11: return
/*    */     //   12: aload_1
/*    */     //   13: invokeinterface getName : ()Ljava/lang/String;
/*    */     //   18: dup
/*    */     //   19: ifnonnull -> 24
/*    */     //   22: pop
/*    */     //   23: return
/*    */     //   24: astore_3
/*    */     //   25: aload_3
/*    */     //   26: ldc '_'
/*    */     //   28: iconst_0
/*    */     //   29: iconst_2
/*    */     //   30: aconst_null
/*    */     //   31: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
/*    */     //   34: ifeq -> 38
/*    */     //   37: return
/*    */     //   38: aload_1
/*    */     //   39: invokeinterface getDocStringExpression : ()Lcom/jetbrains/python/psi/PyStringLiteralExpression;
/*    */     //   44: astore #4
/*    */     //   46: aload #4
/*    */     //   48: ifnull -> 52
/*    */     //   51: return
/*    */     //   52: bipush #15
/*    */     //   54: istore #5
/*    */     //   56: aload_1
/*    */     //   57: invokeinterface getText : ()Ljava/lang/String;
/*    */     //   62: dup
/*    */     //   63: ldc 'element.text'
/*    */     //   65: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   68: checkcast java/lang/CharSequence
/*    */     //   71: invokestatic lines : (Ljava/lang/CharSequence;)Ljava/util/List;
/*    */     //   74: invokeinterface size : ()I
/*    */     //   79: iload #5
/*    */     //   81: if_icmplt -> 215
/*    */     //   84: aload_1
/*    */     //   85: invokeinterface getName : ()Ljava/lang/String;
/*    */     //   90: dup
/*    */     //   91: ifnull -> 123
/*    */     //   94: astore #10
/*    */     //   96: iconst_0
/*    */     //   97: istore #11
/*    */     //   99: ldc 'inspection.missing.docstring.for'
/*    */     //   101: iconst_1
/*    */     //   102: anewarray java/lang/Object
/*    */     //   105: astore #12
/*    */     //   107: aload #12
/*    */     //   109: iconst_0
/*    */     //   110: aload #10
/*    */     //   112: aastore
/*    */     //   113: aload #12
/*    */     //   115: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   118: nop
/*    */     //   119: dup
/*    */     //   120: ifnonnull -> 133
/*    */     //   123: pop
/*    */     //   124: ldc 'inspection.missing.docstring'
/*    */     //   126: iconst_0
/*    */     //   127: anewarray java/lang/Object
/*    */     //   130: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   133: astore #6
/*    */     //   135: new com/intellij/ml/llm/intentions/editor/WriteDocumentationIntention
/*    */     //   138: dup
/*    */     //   139: aload_1
/*    */     //   140: checkcast com/intellij/psi/PsiElement
/*    */     //   143: invokespecial <init> : (Lcom/intellij/psi/PsiElement;)V
/*    */     //   146: checkcast com/intellij/codeInsight/intention/IntentionAction
/*    */     //   149: aload_2
/*    */     //   150: invokevirtual getFile : ()Lcom/intellij/psi/PsiFile;
/*    */     //   153: invokestatic wrapToQuickFix : (Lcom/intellij/codeInsight/intention/IntentionAction;Lcom/intellij/psi/PsiFile;)Lcom/intellij/codeInspection/LocalQuickFix;
/*    */     //   156: astore #7
/*    */     //   158: aload_1
/*    */     //   159: instanceof com/intellij/psi/PsiNameIdentifierOwner
/*    */     //   162: ifeq -> 172
/*    */     //   165: aload_1
/*    */     //   166: checkcast com/intellij/psi/PsiNameIdentifierOwner
/*    */     //   169: goto -> 173
/*    */     //   172: aconst_null
/*    */     //   173: dup
/*    */     //   174: ifnull -> 186
/*    */     //   177: invokeinterface getNameIdentifier : ()Lcom/intellij/psi/PsiElement;
/*    */     //   182: dup
/*    */     //   183: ifnonnull -> 188
/*    */     //   186: pop
/*    */     //   187: return
/*    */     //   188: astore #8
/*    */     //   190: aload_2
/*    */     //   191: aload #8
/*    */     //   193: aload #6
/*    */     //   195: getstatic com/intellij/codeInspection/ProblemHighlightType.WEAK_WARNING : Lcom/intellij/codeInspection/ProblemHighlightType;
/*    */     //   198: iconst_1
/*    */     //   199: anewarray com/intellij/codeInspection/LocalQuickFix
/*    */     //   202: astore #9
/*    */     //   204: aload #9
/*    */     //   206: iconst_0
/*    */     //   207: aload #7
/*    */     //   209: aastore
/*    */     //   210: aload #9
/*    */     //   212: invokevirtual registerProblem : (Lcom/intellij/psi/PsiElement;Ljava/lang/String;Lcom/intellij/codeInspection/ProblemHighlightType;[Lcom/intellij/codeInspection/LocalQuickFix;)V
/*    */     //   215: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #37	-> 0
/*    */     //   #38	-> 11
/*    */     //   #40	-> 12
/*    */     //   #41	-> 25
/*    */     //   #42	-> 38
/*    */     //   #43	-> 46
/*    */     //   #45	-> 52
/*    */     //   #46	-> 56
/*    */     //   #47	-> 84
/*    */     //   #65	-> 96
/*    */     //   #47	-> 99
/*    */     //   #47	-> 118
/*    */     //   #47	-> 119
/*    */     //   #48	-> 124
/*    */     //   #47	-> 133
/*    */     //   #49	-> 135
/*    */     //   #50	-> 158
/*    */     //   #51	-> 190
/*    */     //   #53	-> 215
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   99	19	11	$i$a$-let-PythonDocGenerationInspection$Visitor$checkDocString$message$1	I
/*    */     //   96	22	10	it	Ljava/lang/String;
/*    */     //   135	80	6	message	Ljava/lang/String;
/*    */     //   158	57	7	fix	Lcom/intellij/codeInspection/LocalQuickFix;
/*    */     //   190	25	8	nameIdentifier	Lcom/intellij/psi/PsiElement;
/*    */     //   25	191	3	elementName	Ljava/lang/String;
/*    */     //   46	170	4	docString	Lcom/jetbrains/python/psi/PyStringLiteralExpression;
/*    */     //   56	160	5	linesThreshold	I
/*    */     //   0	216	0	this	Lcom/intellij/ml/llm/python/inspections/PythonDocGenerationInspection$Visitor;
/*    */     //   0	216	1	element	Lcom/jetbrains/python/psi/PyDocStringOwner;
/*    */     //   0	216	2	holder	Lcom/intellij/codeInspection/ProblemsHolder;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private final boolean isInTestSourceContent(PsiElement element) {
/* 56 */     if (element == null) {
/* 57 */       return false;
/*    */     }
/* 59 */     PsiFile file = element.getContainingFile();
/* 60 */     VirtualFile virtualFile = (file != null) ? file.getVirtualFile() : null;
/* 61 */     Intrinsics.checkNotNull(file); return (virtualFile != null && ProjectRootManager.getInstance(file.getProject()).getFileIndex().isInTestSourceContent(virtualFile));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/python/inspections/PythonDocGenerationInspection$Visitor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */