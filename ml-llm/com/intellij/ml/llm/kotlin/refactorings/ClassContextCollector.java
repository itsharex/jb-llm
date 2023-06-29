/*    */ package com.intellij.ml.llm.kotlin.refactorings;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.kotlin.psi.KtClass;
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J)\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\004H@ø\001\000¢\006\002\020\n\002\004\n\002\b\031¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/kotlin/refactorings/ClassContextCollector;", "", "()V", "createContextPrompt", "", "project", "Lcom/intellij/openapi/project/Project;", "clazz", "Lorg/jetbrains/kotlin/psi/KtClass;", "namePlaceholder", "(Lcom/intellij/openapi/project/Project;Lorg/jetbrains/kotlin/psi/KtClass;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intellij.ml.llm.kotlin"}) public final class ClassContextCollector { @NotNull
/*    */   public static final ClassContextCollector INSTANCE = new ClassContextCollector(); @Nullable
/*    */   public final Object createContextPrompt(@NotNull Project project, @NotNull KtClass clazz, @NotNull String namePlaceholder, @NotNull Continuation<? super String> paramContinuation) { // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: instanceof com/intellij/ml/llm/kotlin/refactorings/ClassContextCollector$createContextPrompt$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #4
/*    */     //   10: checkcast com/intellij/ml/llm/kotlin/refactorings/ClassContextCollector$createContextPrompt$1
/*    */     //   13: astore #9
/*    */     //   15: aload #9
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #9
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new com/intellij/ml/llm/kotlin/refactorings/ClassContextCollector$createContextPrompt$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #4
/*    */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/kotlin/refactorings/ClassContextCollector;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #9
/*    */     //   53: aload #9
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #8
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #10
/*    */     //   65: aload #9
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 392, 0 -> 100, 1 -> 155, 2 -> 251, 3 -> 360
/*    */     //   100: aload #8
/*    */     //   102: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   105: new com/intellij/ml/llm/kotlin/refactorings/ClassContextCollector$createContextPrompt$classCopy$1
/*    */     //   108: dup
/*    */     //   109: aload_2
/*    */     //   110: aload_3
/*    */     //   111: invokespecial <init> : (Lorg/jetbrains/kotlin/psi/KtClass;Ljava/lang/String;)V
/*    */     //   114: checkcast kotlin/jvm/functions/Function0
/*    */     //   117: aload #9
/*    */     //   119: aload #9
/*    */     //   121: aload_1
/*    */     //   122: putfield L$0 : Ljava/lang/Object;
/*    */     //   125: aload #9
/*    */     //   127: aload_2
/*    */     //   128: putfield L$1 : Ljava/lang/Object;
/*    */     //   131: aload #9
/*    */     //   133: aload_3
/*    */     //   134: putfield L$2 : Ljava/lang/Object;
/*    */     //   137: aload #9
/*    */     //   139: iconst_1
/*    */     //   140: putfield label : I
/*    */     //   143: invokestatic writeAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   146: dup
/*    */     //   147: aload #10
/*    */     //   149: if_acmpne -> 189
/*    */     //   152: aload #10
/*    */     //   154: areturn
/*    */     //   155: aload #9
/*    */     //   157: getfield L$2 : Ljava/lang/Object;
/*    */     //   160: checkcast java/lang/String
/*    */     //   163: astore_3
/*    */     //   164: aload #9
/*    */     //   166: getfield L$1 : Ljava/lang/Object;
/*    */     //   169: checkcast org/jetbrains/kotlin/psi/KtClass
/*    */     //   172: astore_2
/*    */     //   173: aload #9
/*    */     //   175: getfield L$0 : Ljava/lang/Object;
/*    */     //   178: checkcast com/intellij/openapi/project/Project
/*    */     //   181: astore_1
/*    */     //   182: aload #8
/*    */     //   184: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   187: aload #8
/*    */     //   189: checkcast org/jetbrains/kotlin/psi/KtClass
/*    */     //   192: astore #5
/*    */     //   194: aload_1
/*    */     //   195: new com/intellij/ml/llm/kotlin/refactorings/ClassContextCollector$createContextPrompt$packageText$1
/*    */     //   198: dup
/*    */     //   199: aload_2
/*    */     //   200: invokespecial <init> : (Lorg/jetbrains/kotlin/psi/KtClass;)V
/*    */     //   203: checkcast kotlin/jvm/functions/Function0
/*    */     //   206: aload #9
/*    */     //   208: aload #9
/*    */     //   210: aload_1
/*    */     //   211: putfield L$0 : Ljava/lang/Object;
/*    */     //   214: aload #9
/*    */     //   216: aload_2
/*    */     //   217: putfield L$1 : Ljava/lang/Object;
/*    */     //   220: aload #9
/*    */     //   222: aload_3
/*    */     //   223: putfield L$2 : Ljava/lang/Object;
/*    */     //   226: aload #9
/*    */     //   228: aload #5
/*    */     //   230: putfield L$3 : Ljava/lang/Object;
/*    */     //   233: aload #9
/*    */     //   235: iconst_2
/*    */     //   236: putfield label : I
/*    */     //   239: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   242: dup
/*    */     //   243: aload #10
/*    */     //   245: if_acmpne -> 295
/*    */     //   248: aload #10
/*    */     //   250: areturn
/*    */     //   251: aload #9
/*    */     //   253: getfield L$3 : Ljava/lang/Object;
/*    */     //   256: checkcast org/jetbrains/kotlin/psi/KtClass
/*    */     //   259: astore #5
/*    */     //   261: aload #9
/*    */     //   263: getfield L$2 : Ljava/lang/Object;
/*    */     //   266: checkcast java/lang/String
/*    */     //   269: astore_3
/*    */     //   270: aload #9
/*    */     //   272: getfield L$1 : Ljava/lang/Object;
/*    */     //   275: checkcast org/jetbrains/kotlin/psi/KtClass
/*    */     //   278: astore_2
/*    */     //   279: aload #9
/*    */     //   281: getfield L$0 : Ljava/lang/Object;
/*    */     //   284: checkcast com/intellij/openapi/project/Project
/*    */     //   287: astore_1
/*    */     //   288: aload #8
/*    */     //   290: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   293: aload #8
/*    */     //   295: checkcast java/lang/String
/*    */     //   298: astore #6
/*    */     //   300: aload_1
/*    */     //   301: new com/intellij/ml/llm/kotlin/refactorings/ClassContextCollector$createContextPrompt$classText$1
/*    */     //   304: dup
/*    */     //   305: aload #5
/*    */     //   307: aload_2
/*    */     //   308: aload_3
/*    */     //   309: invokespecial <init> : (Lorg/jetbrains/kotlin/psi/KtClass;Lorg/jetbrains/kotlin/psi/KtClass;Ljava/lang/String;)V
/*    */     //   312: checkcast kotlin/jvm/functions/Function0
/*    */     //   315: aload #9
/*    */     //   317: aload #9
/*    */     //   319: aload #6
/*    */     //   321: putfield L$0 : Ljava/lang/Object;
/*    */     //   324: aload #9
/*    */     //   326: aconst_null
/*    */     //   327: putfield L$1 : Ljava/lang/Object;
/*    */     //   330: aload #9
/*    */     //   332: aconst_null
/*    */     //   333: putfield L$2 : Ljava/lang/Object;
/*    */     //   336: aload #9
/*    */     //   338: aconst_null
/*    */     //   339: putfield L$3 : Ljava/lang/Object;
/*    */     //   342: aload #9
/*    */     //   344: iconst_3
/*    */     //   345: putfield label : I
/*    */     //   348: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   351: dup
/*    */     //   352: aload #10
/*    */     //   354: if_acmpne -> 377
/*    */     //   357: aload #10
/*    */     //   359: areturn
/*    */     //   360: aload #9
/*    */     //   362: getfield L$0 : Ljava/lang/Object;
/*    */     //   365: checkcast java/lang/String
/*    */     //   368: astore #6
/*    */     //   370: aload #8
/*    */     //   372: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   375: aload #8
/*    */     //   377: checkcast java/lang/String
/*    */     //   380: astore #7
/*    */     //   382: aload #6
/*    */     //   384: aload #7
/*    */     //   386: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*    */     //   391: areturn
/*    */     //   392: new java/lang/IllegalStateException
/*    */     //   395: dup
/*    */     //   396: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   398: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   401: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #13	-> 63
/*    */     //   #14	-> 105
/*    */     //   #13	-> 152
/*    */     //   #27	-> 194
/*    */     //   #13	-> 248
/*    */     //   #28	-> 300
/*    */     //   #13	-> 357
/*    */     //   #29	-> 382
/*    */     //   #13	-> 392
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   105	50	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   182	69	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   288	63	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   105	50	2	clazz	Lorg/jetbrains/kotlin/psi/KtClass;
/*    */     //   173	78	2	clazz	Lorg/jetbrains/kotlin/psi/KtClass;
/*    */     //   279	72	2	clazz	Lorg/jetbrains/kotlin/psi/KtClass;
/*    */     //   105	50	3	namePlaceholder	Ljava/lang/String;
/*    */     //   164	87	3	namePlaceholder	Ljava/lang/String;
/*    */     //   270	81	3	namePlaceholder	Ljava/lang/String;
/*    */     //   194	57	5	classCopy	Lorg/jetbrains/kotlin/psi/KtClass;
/*    */     //   261	90	5	classCopy	Lorg/jetbrains/kotlin/psi/KtClass;
/*    */     //   300	60	6	packageText	Ljava/lang/String;
/*    */     //   370	22	6	packageText	Ljava/lang/String;
/*    */     //   382	10	7	classText	Ljava/lang/String;
/*    */     //   53	339	9	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	332	8	$result	Ljava/lang/Object; } @DebugMetadata(f = "ClassContextCollector.kt", l = {14, 27, 28}, i = {0, 0, 0, 1, 1, 1, 1, 2}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0"}, n = {"project", "clazz", "namePlaceholder", "project", "clazz", "namePlaceholder", "classCopy", "packageText"}, m = "createContextPrompt", c = "com.intellij.ml.llm.kotlin.refactorings.ClassContextCollector")
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
/*    */   static final class ClassContextCollector$createContextPrompt$1 extends ContinuationImpl { Object L$0; Object L$1; Object L$2; Object L$3; int label; ClassContextCollector$createContextPrompt$1(Continuation $completion) { super($completion); } @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) { this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return ClassContextCollector.this.createContextPrompt(null, null, null, (Continuation<? super String>)this); } } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lorg/jetbrains/kotlin/psi/KtClass;", "invoke"})
/*    */   @SourceDebugExtension({"SMAP\nClassContextCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassContextCollector.kt\ncom/intellij/ml/llm/kotlin/refactorings/ClassContextCollector$createContextPrompt$classCopy$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,31:1\n1855#2,2:32\n*S KotlinDebug\n*F\n+ 1 ClassContextCollector.kt\ncom/intellij/ml/llm/kotlin/refactorings/ClassContextCollector$createContextPrompt$classCopy$1\n*L\n17#1:32,2\n*E\n"})
/*    */   static final class ClassContextCollector$createContextPrompt$classCopy$1 extends Lambda implements Function0<KtClass> { @NotNull
/* 15 */     public final KtClass invoke() { Intrinsics.checkNotNull(this.$clazz.copy(), "null cannot be cast to non-null type org.jetbrains.kotlin.psi.KtClass"); KtClass ktClass1 = (KtClass)this.$clazz.copy(); String str = this.$namePlaceholder; KtClass it = ktClass1; int $i$a$-also-ClassContextCollector$createContextPrompt$classCopy$1$1 = 0;
/* 16 */       it.setName(str);
/* 17 */       Iterable $this$forEach$iv = it.getDeclarations(); int $i$f$forEach = 0;
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
/* 32 */       Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); KtDeclaration declaration = (KtDeclaration)element$iv; int $i$a$-forEach-ClassContextCollector$createContextPrompt$classCopy$1$1$1 = 0; KtDeclaration ktDeclaration1 = declaration; }  return ktClass1; } ClassContextCollector$createContextPrompt$classCopy$1(KtClass $clazz, String $namePlaceholder) { super(0); } } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"}) @SourceDebugExtension({"SMAP\nClassContextCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassContextCollector.kt\ncom/intellij/ml/llm/kotlin/refactorings/ClassContextCollector$createContextPrompt$packageText$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n1#2:32\n*E\n"}) static final class ClassContextCollector$createContextPrompt$packageText$1 extends Lambda implements Function0<String> { ClassContextCollector$createContextPrompt$packageText$1(KtClass $clazz) { super(0); } @NotNull public final String invoke() { PsiFile psiFile = this.$clazz.getContainingFile(); FqName pkg = ((psiFile instanceof org.jetbrains.kotlin.psi.KtFile) ? psiFile : null).getPackageFqName(); int $i$a$-let-ClassContextCollector$createContextPrompt$packageText$1$1 = 0;
/*    */       ((psiFile instanceof org.jetbrains.kotlin.psi.KtFile) ? psiFile : null).getPackageFqName();
/*    */       if (((((psiFile instanceof org.jetbrains.kotlin.psi.KtFile) ? psiFile : null) != null && ((psiFile instanceof org.jetbrains.kotlin.psi.KtFile) ? psiFile : null).getPackageFqName() != null) ? ("package " + pkg + "\n\n") : null) == null)
/*    */         (((psiFile instanceof org.jetbrains.kotlin.psi.KtFile) ? psiFile : null) != null && ((psiFile instanceof org.jetbrains.kotlin.psi.KtFile) ? psiFile : null).getPackageFqName() != null) ? ("package " + pkg + "\n\n") : null; 
/*    */       return ""; }
/*    */      }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */   static final class ClassContextCollector$createContextPrompt$classText$1 extends Lambda implements Function0<String> {
/*    */     ClassContextCollector$createContextPrompt$classText$1(KtClass $classCopy, KtClass $clazz, String $namePlaceholder) {
/*    */       super(0);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String invoke() {
/*    */       Intrinsics.checkNotNullExpressionValue(this.$classCopy.getText(), "classCopy.text");
/*    */       this.$clazz.getIdentifyingElement();
/*    */       if (((this.$clazz.getIdentifyingElement() != null) ? this.$clazz.getIdentifyingElement().getText() : null) == null)
/*    */         (this.$clazz.getIdentifyingElement() != null) ? this.$clazz.getIdentifyingElement().getText() : null; 
/*    */       return StringsKt.replace$default((this.$clazz.getIdentifyingElement() != null) ? this.$clazz.getIdentifyingElement().getText() : null, "", this.$namePlaceholder, false, 4, null);
/*    */     }
/*    */   } }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/refactorings/ClassContextCollector.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */