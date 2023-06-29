/*    */ package com.intellij.ml.llm.kotlin.inspections;
/*    */ 
/*    */ import com.intellij.codeInspection.ProblemsHolder;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.PsiElementVisitor;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.kotlin.descriptors.DeclarationDescriptor;
/*    */ import org.jetbrains.kotlin.descriptors.DeclarationDescriptorWithSource;
/*    */ import org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde;
/*    */ import org.jetbrains.kotlin.idea.codeinsight.api.classic.inspections.AbstractKotlinInspection;
/*    */ import org.jetbrains.kotlin.psi.KtClassOrObject;
/*    */ import org.jetbrains.kotlin.psi.KtNamedDeclaration;
/*    */ import org.jetbrains.kotlin.psi.KtNamedFunction;
/*    */ import org.jetbrains.kotlin.psi.KtVisitorVoid;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\002\n\000\n\002\030\002\n\000\b\000\030\0002\0020\001B\005¢\006\002\020\002J\030\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\bH\026J\030\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\005\032\0020\006H\002¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/kotlin/inspections/KotlinDocGenerationInspection;", "Lorg/jetbrains/kotlin/idea/codeinsight/api/classic/inspections/AbstractKotlinInspection;", "()V", "buildVisitor", "Lcom/intellij/psi/PsiElementVisitor;", "holder", "Lcom/intellij/codeInspection/ProblemsHolder;", "isOnTheFly", "", "checkDock", "", "element", "Lorg/jetbrains/kotlin/psi/KtNamedDeclaration;", "intellij.ml.llm.kotlin"})
/*    */ @SourceDebugExtension({"SMAP\nKotlinDocGenerationInspection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinDocGenerationInspection.kt\ncom/intellij/ml/llm/kotlin/inspections/KotlinDocGenerationInspection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
/*    */ public final class KotlinDocGenerationInspection extends AbstractKotlinInspection {
/*    */   @NotNull
/* 25 */   public PsiElementVisitor buildVisitor(@NotNull ProblemsHolder holder, boolean isOnTheFly) { Intrinsics.checkNotNullParameter(holder, "holder"); return (PsiElementVisitor)new KotlinDocGenerationInspection$buildVisitor$1(holder); } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\037\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\007\032\0020\bH\026¨\006\t"}, d2 = {"com/intellij/ml/llm/kotlin/inspections/KotlinDocGenerationInspection$buildVisitor$1", "Lorg/jetbrains/kotlin/psi/KtVisitorVoid;", "visitClassOrObject", "", "classOrObject", "Lorg/jetbrains/kotlin/psi/KtClassOrObject;", "visitNamedFunction", "function", "Lorg/jetbrains/kotlin/psi/KtNamedFunction;", "intellij.ml.llm.kotlin"})
/*    */   public static final class KotlinDocGenerationInspection$buildVisitor$1 extends KtVisitorVoid { public void visitNamedFunction(@NotNull KtNamedFunction function) {
/* 27 */       Intrinsics.checkNotNullParameter(function, "function"); super.visitNamedFunction(function);
/* 28 */       KotlinDocGenerationInspection.this.checkDock((KtNamedDeclaration)function, this.$holder);
/*    */     }
/*    */     KotlinDocGenerationInspection$buildVisitor$1(ProblemsHolder $holder) {}
/*    */     public void visitClassOrObject(@NotNull KtClassOrObject classOrObject) {
/* 32 */       Intrinsics.checkNotNullParameter(classOrObject, "classOrObject"); super.visitClassOrObject(classOrObject);
/* 33 */       KotlinDocGenerationInspection.this.checkDock((KtNamedDeclaration)classOrObject, this.$holder);
/*    */     } }
/*    */   private final void checkDock(KtNamedDeclaration element, ProblemsHolder holder) {
/*    */     // Byte code:
/*    */     //   0: invokestatic isK2Plugin : ()Z
/*    */     //   3: ifeq -> 7
/*    */     //   6: return
/*    */     //   7: aload_1
/*    */     //   8: checkcast com/intellij/psi/PsiElement
/*    */     //   11: invokestatic isInTestSourceContent : (Lcom/intellij/psi/PsiElement;)Z
/*    */     //   14: ifeq -> 18
/*    */     //   17: return
/*    */     //   18: aload_1
/*    */     //   19: invokeinterface getNameIdentifier : ()Lcom/intellij/psi/PsiElement;
/*    */     //   24: dup
/*    */     //   25: ifnonnull -> 30
/*    */     //   28: pop
/*    */     //   29: return
/*    */     //   30: astore_3
/*    */     //   31: aload_1
/*    */     //   32: checkcast org/jetbrains/kotlin/psi/KtElement
/*    */     //   35: new com/intellij/ml/llm/kotlin/inspections/KotlinDocGenerationInspection$checkDock$1
/*    */     //   38: dup
/*    */     //   39: aload_1
/*    */     //   40: invokespecial <init> : (Lorg/jetbrains/kotlin/psi/KtNamedDeclaration;)V
/*    */     //   43: checkcast kotlin/jvm/functions/Function1
/*    */     //   46: invokestatic findKDoc : (Lorg/jetbrains/kotlin/psi/KtElement;Lkotlin/jvm/functions/Function1;)Lorg/jetbrains/kotlin/idea/kdoc/KDocContent;
/*    */     //   49: ifnonnull -> 193
/*    */     //   52: aload_1
/*    */     //   53: checkcast org/jetbrains/kotlin/psi/KtDeclaration
/*    */     //   56: aconst_null
/*    */     //   57: iconst_1
/*    */     //   58: aconst_null
/*    */     //   59: invokestatic resolveToDescriptorIfAny$default : (Lorg/jetbrains/kotlin/psi/KtDeclaration;Lorg/jetbrains/kotlin/resolve/lazy/BodyResolveMode;ILjava/lang/Object;)Lorg/jetbrains/kotlin/descriptors/DeclarationDescriptor;
/*    */     //   62: astore #6
/*    */     //   64: aload #6
/*    */     //   66: instanceof org/jetbrains/kotlin/descriptors/DeclarationDescriptorWithVisibility
/*    */     //   69: ifeq -> 80
/*    */     //   72: aload #6
/*    */     //   74: checkcast org/jetbrains/kotlin/descriptors/DeclarationDescriptorWithVisibility
/*    */     //   77: goto -> 81
/*    */     //   80: aconst_null
/*    */     //   81: dup
/*    */     //   82: ifnonnull -> 87
/*    */     //   85: pop
/*    */     //   86: return
/*    */     //   87: astore #4
/*    */     //   89: aload #4
/*    */     //   91: invokestatic isEffectivelyPublicApi : (Lorg/jetbrains/kotlin/descriptors/DeclarationDescriptorWithVisibility;)Z
/*    */     //   94: ifeq -> 193
/*    */     //   97: aload_1
/*    */     //   98: invokestatic describe : (Lorg/jetbrains/kotlin/psi/KtNamedDeclaration;)Ljava/lang/String;
/*    */     //   101: dup
/*    */     //   102: ifnull -> 134
/*    */     //   105: astore #8
/*    */     //   107: iconst_0
/*    */     //   108: istore #9
/*    */     //   110: ldc '0.is.missing.documentation'
/*    */     //   112: iconst_1
/*    */     //   113: anewarray java/lang/Object
/*    */     //   116: astore #10
/*    */     //   118: aload #10
/*    */     //   120: iconst_0
/*    */     //   121: aload #8
/*    */     //   123: aastore
/*    */     //   124: aload #10
/*    */     //   126: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   129: nop
/*    */     //   130: dup
/*    */     //   131: ifnonnull -> 144
/*    */     //   134: pop
/*    */     //   135: ldc 'missing.documentation'
/*    */     //   137: iconst_0
/*    */     //   138: anewarray java/lang/Object
/*    */     //   141: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   144: astore #5
/*    */     //   146: new com/intellij/ml/llm/intentions/editor/WriteDocumentationIntention
/*    */     //   149: dup
/*    */     //   150: aload_1
/*    */     //   151: checkcast com/intellij/psi/PsiElement
/*    */     //   154: invokespecial <init> : (Lcom/intellij/psi/PsiElement;)V
/*    */     //   157: checkcast com/intellij/codeInsight/intention/IntentionAction
/*    */     //   160: aload_2
/*    */     //   161: invokevirtual getFile : ()Lcom/intellij/psi/PsiFile;
/*    */     //   164: invokestatic wrapToQuickFix : (Lcom/intellij/codeInsight/intention/IntentionAction;Lcom/intellij/psi/PsiFile;)Lcom/intellij/codeInspection/LocalQuickFix;
/*    */     //   167: astore #6
/*    */     //   169: aload_2
/*    */     //   170: aload_3
/*    */     //   171: aload #5
/*    */     //   173: getstatic com/intellij/codeInspection/ProblemHighlightType.WEAK_WARNING : Lcom/intellij/codeInspection/ProblemHighlightType;
/*    */     //   176: iconst_1
/*    */     //   177: anewarray com/intellij/codeInspection/LocalQuickFix
/*    */     //   180: astore #7
/*    */     //   182: aload #7
/*    */     //   184: iconst_0
/*    */     //   185: aload #6
/*    */     //   187: aastore
/*    */     //   188: aload #7
/*    */     //   190: invokevirtual registerProblem : (Lcom/intellij/psi/PsiElement;Ljava/lang/String;Lcom/intellij/codeInspection/ProblemHighlightType;[Lcom/intellij/codeInspection/LocalQuickFix;)V
/*    */     //   193: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #40	-> 0
/*    */     //   #42	-> 7
/*    */     //   #43	-> 17
/*    */     //   #45	-> 18
/*    */     //   #46	-> 31
/*    */     //   #48	-> 52
/*    */     //   #47	-> 87
/*    */     //   #49	-> 89
/*    */     //   #50	-> 97
/*    */     //   #58	-> 107
/*    */     //   #50	-> 110
/*    */     //   #50	-> 129
/*    */     //   #50	-> 130
/*    */     //   #51	-> 135
/*    */     //   #50	-> 144
/*    */     //   #52	-> 146
/*    */     //   #53	-> 169
/*    */     //   #56	-> 193
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   110	19	9	$i$a$-let-KotlinDocGenerationInspection$checkDock$message$1	I
/*    */     //   107	22	8	it	Ljava/lang/String;
/*    */     //   146	47	5	message	Ljava/lang/String;
/*    */     //   169	24	6	fix	Lcom/intellij/codeInspection/LocalQuickFix;
/*    */     //   89	104	4	descriptor	Lorg/jetbrains/kotlin/descriptors/DeclarationDescriptorWithVisibility;
/*    */     //   31	163	3	nameIdentifier	Lcom/intellij/psi/PsiElement;
/*    */     //   0	194	0	this	Lcom/intellij/ml/llm/kotlin/inspections/KotlinDocGenerationInspection;
/*    */     //   0	194	1	element	Lorg/jetbrains/kotlin/psi/KtNamedDeclaration;
/*    */     //   0	194	2	holder	Lcom/intellij/codeInspection/ProblemsHolder;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\004\030\0010\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Lcom/intellij/psi/PsiElement;", "it", "Lorg/jetbrains/kotlin/descriptors/DeclarationDescriptorWithSource;", "invoke"})
/*    */   static final class KotlinDocGenerationInspection$checkDock$1 extends Lambda implements Function1<DeclarationDescriptorWithSource, PsiElement> { KotlinDocGenerationInspection$checkDock$1(KtNamedDeclaration $element) {
/*    */       super(1);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final PsiElement invoke(@NotNull DeclarationDescriptorWithSource it) {
/* 46 */       Intrinsics.checkNotNullParameter(it, "it"); Intrinsics.checkNotNullExpressionValue(this.$element.getProject(), "element.project"); return DescriptorToSourceUtilsIde.INSTANCE.getAnyDeclaration(this.$element.getProject(), (DeclarationDescriptor)it);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/inspections/KotlinDocGenerationInspection.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */