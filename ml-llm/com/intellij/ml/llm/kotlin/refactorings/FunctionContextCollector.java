/*    */ package com.intellij.ml.llm.kotlin.refactorings;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.kotlin.psi.KtFunction;
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J)\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\004H@ø\001\000¢\006\002\020\n\002\004\n\002\b\031¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/kotlin/refactorings/FunctionContextCollector;", "", "()V", "createContextPrompt", "", "project", "Lcom/intellij/openapi/project/Project;", "function", "Lorg/jetbrains/kotlin/psi/KtFunction;", "namePlaceholder", "(Lcom/intellij/openapi/project/Project;Lorg/jetbrains/kotlin/psi/KtFunction;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intellij.ml.llm.kotlin"}) public final class FunctionContextCollector { @NotNull public static final FunctionContextCollector INSTANCE = new FunctionContextCollector(); @Nullable public final Object createContextPrompt(@NotNull Project project, @NotNull KtFunction function, @NotNull String namePlaceholder, @NotNull Continuation<? super String> paramContinuation) { // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: instanceof com/intellij/ml/llm/kotlin/refactorings/FunctionContextCollector$createContextPrompt$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #4
/*    */     //   10: checkcast com/intellij/ml/llm/kotlin/refactorings/FunctionContextCollector$createContextPrompt$1
/*    */     //   13: astore #7
/*    */     //   15: aload #7
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #7
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new com/intellij/ml/llm/kotlin/refactorings/FunctionContextCollector$createContextPrompt$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #4
/*    */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/kotlin/refactorings/FunctionContextCollector;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #7
/*    */     //   53: aload #7
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #6
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #8
/*    */     //   65: aload #7
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 229, 0 -> 96, 1 -> 145, 2 -> 221
/*    */     //   96: aload #6
/*    */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   101: new com/intellij/ml/llm/kotlin/refactorings/FunctionContextCollector$createContextPrompt$methodCopy$1
/*    */     //   104: dup
/*    */     //   105: aload_2
/*    */     //   106: aload_3
/*    */     //   107: invokespecial <init> : (Lorg/jetbrains/kotlin/psi/KtFunction;Ljava/lang/String;)V
/*    */     //   110: checkcast kotlin/jvm/functions/Function0
/*    */     //   113: aload #7
/*    */     //   115: aload #7
/*    */     //   117: aload_1
/*    */     //   118: putfield L$0 : Ljava/lang/Object;
/*    */     //   121: aload #7
/*    */     //   123: aload_2
/*    */     //   124: putfield L$1 : Ljava/lang/Object;
/*    */     //   127: aload #7
/*    */     //   129: iconst_1
/*    */     //   130: putfield label : I
/*    */     //   133: invokestatic writeAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   136: dup
/*    */     //   137: aload #8
/*    */     //   139: if_acmpne -> 170
/*    */     //   142: aload #8
/*    */     //   144: areturn
/*    */     //   145: aload #7
/*    */     //   147: getfield L$1 : Ljava/lang/Object;
/*    */     //   150: checkcast org/jetbrains/kotlin/psi/KtFunction
/*    */     //   153: astore_2
/*    */     //   154: aload #7
/*    */     //   156: getfield L$0 : Ljava/lang/Object;
/*    */     //   159: checkcast com/intellij/openapi/project/Project
/*    */     //   162: astore_1
/*    */     //   163: aload #6
/*    */     //   165: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   168: aload #6
/*    */     //   170: checkcast org/jetbrains/kotlin/psi/KtFunction
/*    */     //   173: astore #5
/*    */     //   175: aload_1
/*    */     //   176: new com/intellij/ml/llm/kotlin/refactorings/FunctionContextCollector$createContextPrompt$2
/*    */     //   179: dup
/*    */     //   180: aload_2
/*    */     //   181: aload #5
/*    */     //   183: invokespecial <init> : (Lorg/jetbrains/kotlin/psi/KtFunction;Lorg/jetbrains/kotlin/psi/KtFunction;)V
/*    */     //   186: checkcast kotlin/jvm/functions/Function0
/*    */     //   189: aload #7
/*    */     //   191: aload #7
/*    */     //   193: aconst_null
/*    */     //   194: putfield L$0 : Ljava/lang/Object;
/*    */     //   197: aload #7
/*    */     //   199: aconst_null
/*    */     //   200: putfield L$1 : Ljava/lang/Object;
/*    */     //   203: aload #7
/*    */     //   205: iconst_2
/*    */     //   206: putfield label : I
/*    */     //   209: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   212: dup
/*    */     //   213: aload #8
/*    */     //   215: if_acmpne -> 228
/*    */     //   218: aload #8
/*    */     //   220: areturn
/*    */     //   221: aload #6
/*    */     //   223: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   226: aload #6
/*    */     //   228: areturn
/*    */     //   229: new java/lang/IllegalStateException
/*    */     //   232: dup
/*    */     //   233: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   235: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   238: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #11	-> 63
/*    */     //   #12	-> 101
/*    */     //   #11	-> 142
/*    */     //   #13	-> 175
/*    */     //   #11	-> 218
/*    */     //   #13	-> 228
/*    */     //   #11	-> 229
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   101	44	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   163	49	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   101	44	2	function	Lorg/jetbrains/kotlin/psi/KtFunction;
/*    */     //   154	58	2	function	Lorg/jetbrains/kotlin/psi/KtFunction;
/*    */     //   101	35	3	namePlaceholder	Ljava/lang/String;
/*    */     //   175	37	5	methodCopy	Lorg/jetbrains/kotlin/psi/KtFunction;
/*    */     //   53	176	7	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	169	6	$result	Ljava/lang/Object; } @DebugMetadata(f = "FunctionContextCollector.kt", l = {12, 13}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"project", "function"}, m = "createContextPrompt", c = "com.intellij.ml.llm.kotlin.refactorings.FunctionContextCollector") @Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
/*    */   static final class FunctionContextCollector$createContextPrompt$1 extends ContinuationImpl { Object L$0; Object L$1; int label; FunctionContextCollector$createContextPrompt$1(Continuation $completion) { super($completion); } @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) { this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return FunctionContextCollector.this.createContextPrompt(null, null, null, (Continuation<? super String>)this); } } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lorg/jetbrains/kotlin/psi/KtFunction;", "invoke"})
/*    */   @SourceDebugExtension({"SMAP\nFunctionContextCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FunctionContextCollector.kt\ncom/intellij/ml/llm/kotlin/refactorings/FunctionContextCollector$createContextPrompt$methodCopy$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n1#2:27\n*E\n"})
/*    */   static final class FunctionContextCollector$createContextPrompt$methodCopy$1 extends Lambda implements Function0<KtFunction> { @NotNull
/* 12 */     public final KtFunction invoke() { Intrinsics.checkNotNull(this.$function.copy(), "null cannot be cast to non-null type org.jetbrains.kotlin.psi.KtFunction"); KtFunction ktFunction1 = (KtFunction)this.$function.copy(); String str = this.$namePlaceholder; KtFunction it = ktFunction1;
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
/* 27 */       int $i$a$-also-FunctionContextCollector$createContextPrompt$methodCopy$1$1 = 0;
/*    */       it.setName(str);
/*    */       return ktFunction1; }
/*    */ 
/*    */     
/*    */     FunctionContextCollector$createContextPrompt$methodCopy$1(KtFunction $function, String $namePlaceholder) {
/*    */       super(0);
/*    */     } }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */   static final class FunctionContextCollector$createContextPrompt$2 extends Lambda implements Function0<String> {
/*    */     @NotNull
/*    */     public final String invoke() {
/*    */       KtClassOrObject clazz;
/*    */       if (KtPsiUtilKt.getContainingClassOrObject((KtDeclaration)this.$function) == null) {
/*    */         KtPsiUtilKt.getContainingClassOrObject((KtDeclaration)this.$function);
/*    */         Intrinsics.checkNotNullExpressionValue(this.$methodCopy.getText(), "methodCopy.text");
/*    */         return this.$methodCopy.getText();
/*    */       } 
/*    */       if (clazz.getName() == null)
/*    */         clazz.getName(); 
/*    */       String className = "C";
/*    */       PsiFile psiFile = clazz.getContainingFile();
/*    */       if (((psiFile instanceof org.jetbrains.kotlin.psi.KtFile) ? psiFile : null) == null || ((psiFile instanceof org.jetbrains.kotlin.psi.KtFile) ? psiFile : null).getPackageFqName() == null)
/*    */         ((psiFile instanceof org.jetbrains.kotlin.psi.KtFile) ? psiFile : null).getPackageFqName(); 
/*    */       Object packageStatement = "";
/*    */       return StringsKt.trimIndent("\npackage " + packageStatement + "\n\nclass " + className + " {\n  " + this.$methodCopy.getText() + "\n}\n");
/*    */     }
/*    */     
/*    */     FunctionContextCollector$createContextPrompt$2(KtFunction $function, KtFunction $methodCopy) {
/*    */       super(0);
/*    */     }
/*    */   } }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/refactorings/FunctionContextCollector.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */