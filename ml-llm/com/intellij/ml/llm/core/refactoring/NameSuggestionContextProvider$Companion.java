/*    */ package com.intellij.ml.llm.core.refactoring;
/*    */ 
/*    */ import com.intellij.lang.Language;
/*    */ import com.intellij.lang.LanguageExtension;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\020\016\n\002\b\004\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J#\020\006\032\004\030\0010\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H@ø\001\000¢\006\002\020\fJ)\020\r\032\0020\0162\006\020\b\032\0020\t2\006\020\017\032\0020\0202\006\020\021\032\0020\013H@ø\001\000¢\006\002\020\022J\016\020\023\032\0020\0162\006\020\024\032\0020\025R\024\020\003\032\b\022\004\022\0020\0050\004X\004¢\006\002\n\000\002\004\n\002\b\031¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/core/refactoring/NameSuggestionContextProvider$Companion;", "", "()V", "EP_NAME", "Lcom/intellij/lang/LanguageExtension;", "Lcom/intellij/ml/llm/core/refactoring/NameSuggestionContextProvider;", "getContext", "Lcom/intellij/ml/llm/core/refactoring/NameSuggestionContext;", "project", "Lcom/intellij/openapi/project/Project;", "targetElement", "Lcom/intellij/psi/PsiElement;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isNameAlreadyUsed", "", "name", "", "element", "(Lcom/intellij/openapi/project/Project;Ljava/lang/String;Lcom/intellij/psi/PsiElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isSupportedForLanguage", "language", "Lcom/intellij/lang/Language;", "intellij.ml.llm"})
/*    */ public final class Companion
/*    */ {
/*    */   @NotNull
/* 33 */   private static final LanguageExtension<NameSuggestionContextProvider> EP_NAME = new LanguageExtension("com.intellij.ml.llm.nameSuggestionContextProvider"); @Nullable
/*    */   public final Object getContext(@NotNull Project project, @NotNull PsiElement targetElement, @NotNull Continuation<? super NameSuggestionContext> $completion) {
/* 35 */     return ((NameSuggestionContextProvider)EP_NAME.forLanguage(targetElement.getLanguage())).getContext(project, targetElement, $completion);
/*    */   }
/*    */   @Nullable
/*    */   public final Object isNameAlreadyUsed(@NotNull Project project, @NotNull String name, @NotNull PsiElement element, @NotNull Continuation<? super Boolean> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: instanceof com/intellij/ml/llm/core/refactoring/NameSuggestionContextProvider$Companion$isNameAlreadyUsed$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #4
/*    */     //   10: checkcast com/intellij/ml/llm/core/refactoring/NameSuggestionContextProvider$Companion$isNameAlreadyUsed$1
/*    */     //   13: astore #6
/*    */     //   15: aload #6
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #6
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new com/intellij/ml/llm/core/refactoring/NameSuggestionContextProvider$Companion$isNameAlreadyUsed$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #4
/*    */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/core/refactoring/NameSuggestionContextProvider$Companion;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #6
/*    */     //   53: aload #6
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #5
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #7
/*    */     //   65: aload #6
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 171, 0 -> 92, 1 -> 141
/*    */     //   92: aload #5
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: getstatic com/intellij/ml/llm/core/refactoring/NameSuggestionContextProvider$Companion.EP_NAME : Lcom/intellij/lang/LanguageExtension;
/*    */     //   100: aload_3
/*    */     //   101: invokeinterface getLanguage : ()Lcom/intellij/lang/Language;
/*    */     //   106: invokevirtual forLanguage : (Lcom/intellij/lang/Language;)Ljava/lang/Object;
/*    */     //   109: checkcast com/intellij/ml/llm/core/refactoring/NameSuggestionContextProvider
/*    */     //   112: dup
/*    */     //   113: ifnull -> 165
/*    */     //   116: aload_1
/*    */     //   117: aload_2
/*    */     //   118: aload_3
/*    */     //   119: aload #6
/*    */     //   121: aload #6
/*    */     //   123: iconst_1
/*    */     //   124: putfield label : I
/*    */     //   127: invokeinterface isNameAlreadyUsed : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Lcom/intellij/psi/PsiElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   132: dup
/*    */     //   133: aload #7
/*    */     //   135: if_acmpne -> 148
/*    */     //   138: aload #7
/*    */     //   140: areturn
/*    */     //   141: aload #5
/*    */     //   143: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   146: aload #5
/*    */     //   148: checkcast java/lang/Boolean
/*    */     //   151: invokevirtual booleanValue : ()Z
/*    */     //   154: ifeq -> 161
/*    */     //   157: iconst_1
/*    */     //   158: goto -> 167
/*    */     //   161: iconst_0
/*    */     //   162: goto -> 167
/*    */     //   165: pop
/*    */     //   166: iconst_0
/*    */     //   167: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   170: areturn
/*    */     //   171: new java/lang/IllegalStateException
/*    */     //   174: dup
/*    */     //   175: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   177: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   180: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #38	-> 63
/*    */     //   #39	-> 97
/*    */     //   #38	-> 138
/*    */     //   #39	-> 148
/*    */     //   #38	-> 171
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	35	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   97	35	2	name	Ljava/lang/String;
/*    */     //   97	35	3	element	Lcom/intellij/psi/PsiElement;
/*    */     //   53	118	6	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	111	5	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   public final boolean isSupportedForLanguage(@NotNull Language language) {
/* 43 */     Intrinsics.checkNotNullParameter(language, "language"); return (EP_NAME.forLanguage(language) != null);
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "NameSuggestionContextProvider.kt", l = {39}, i = {}, s = {}, n = {}, m = "isNameAlreadyUsed", c = "com.intellij.ml.llm.core.refactoring.NameSuggestionContextProvider$Companion")
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
/*    */   static final class NameSuggestionContextProvider$Companion$isNameAlreadyUsed$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     NameSuggestionContextProvider$Companion$isNameAlreadyUsed$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return NameSuggestionContextProvider.Companion.this.isNameAlreadyUsed(null, null, null, (Continuation<? super Boolean>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/refactoring/NameSuggestionContextProvider$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */