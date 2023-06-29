/*     */ package com.intellij.ml.llm.context;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\020 \n\002\b\003\n\002\030\002\n\002\b\024\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\b\n\002\b\b\b\b\030\0002\0020\001Bg\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\005\022\n\b\002\020\006\032\004\030\0010\005\022\016\b\002\020\007\032\b\022\004\022\0020\0030\b\022\016\b\002\020\t\032\b\022\004\022\0020\0030\b\022\020\b\002\020\n\032\n\022\004\022\0020\005\030\0010\b\022\016\b\002\020\013\032\b\022\004\022\0020\f0\b¢\006\002\020\rJ\t\020\030\032\0020\003HÆ\003J\013\020\031\032\004\030\0010\005HÆ\003J\013\020\032\032\004\030\0010\005HÆ\003J\017\020\033\032\b\022\004\022\0020\0030\bHÆ\003J\017\020\034\032\b\022\004\022\0020\0030\bHÆ\003J\021\020\035\032\n\022\004\022\0020\005\030\0010\bHÆ\003J\017\020\036\032\b\022\004\022\0020\f0\bHÆ\003Jm\020\037\032\0020\0002\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\0052\n\b\002\020\006\032\004\030\0010\0052\016\b\002\020\007\032\b\022\004\022\0020\0030\b2\016\b\002\020\t\032\b\022\004\022\0020\0030\b2\020\b\002\020\n\032\n\022\004\022\0020\005\030\0010\b2\016\b\002\020\013\032\b\022\004\022\0020\f0\bHÆ\001J\023\020 \032\0020!2\b\020\"\032\004\030\0010#HÖ\003J\f\020$\032\b\022\004\022\0020\0050\bJ\f\020%\032\b\022\004\022\0020\0050\bJ\t\020&\032\0020'HÖ\001J\b\020(\032\0020\005H\026J\b\020)\032\0020\005H\026J\t\020*\032\0020\005HÖ\001J\036\020+\032\0020\0052\006\020,\032\0020'2\006\020-\032\0020'2\006\020.\032\0020!R\027\020\t\032\b\022\004\022\0020\0030\b¢\006\b\n\000\032\004\b\016\020\017R\027\020\007\032\b\022\004\022\0020\0030\b¢\006\b\n\000\032\004\b\020\020\017R\026\020\006\032\004\030\0010\005X\004¢\006\b\n\000\032\004\b\021\020\022R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\023\020\024R\031\020\n\032\n\022\004\022\0020\005\030\0010\b¢\006\b\n\000\032\004\b\025\020\017R\026\020\004\032\004\030\0010\005X\004¢\006\b\n\000\032\004\b\026\020\022R\027\020\013\032\b\022\004\022\0020\f0\b¢\006\b\n\000\032\004\b\027\020\017¨\006/"}, d2 = {"Lcom/intellij/ml/llm/context/ClassContext;", "Lcom/intellij/ml/llm/context/NamedElementContext;", "root", "Lcom/intellij/psi/PsiElement;", "text", "", "name", "methods", "", "fields", "superClasses", "usages", "Lcom/intellij/psi/PsiReference;", "(Lcom/intellij/psi/PsiElement;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getFields", "()Ljava/util/List;", "getMethods", "getName", "()Ljava/lang/String;", "getRoot", "()Lcom/intellij/psi/PsiElement;", "getSuperClasses", "getText", "getUsages", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "getFieldNames", "getMethodSignatures", "hashCode", "", "toJson", "toQuery", "toString", "toTextQuery", "prevLines", "postLines", "withLineNumbers", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nClassContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassContext.kt\ncom/intellij/ml/llm/context/ClassContext\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1603#2,9:95\n1855#2:104\n1856#2:106\n1612#2:107\n1603#2,9:108\n1855#2:117\n1856#2:119\n1612#2:120\n1#3:105\n1#3:118\n*S KotlinDebug\n*F\n+ 1 ClassContext.kt\ncom/intellij/ml/llm/context/ClassContext\n*L\n32#1:95,9\n32#1:104\n32#1:106\n32#1:107\n40#1:108,9\n40#1:117\n40#1:119\n40#1:120\n32#1:105\n40#1:118\n*E\n"})
/*     */ public final class ClassContext extends NamedElementContext {
/*     */   @NotNull
/*     */   private final PsiElement root;
/*     */   @Nullable
/*     */   private final String text;
/*     */   @Nullable
/*     */   private final String name;
/*     */   
/*     */   @NotNull
/*  14 */   public PsiElement getRoot() { return this.root; } @NotNull private final List<PsiElement> methods; @NotNull private final List<PsiElement> fields; @Nullable private final List<String> superClasses; @NotNull private final List<PsiReference> usages; @Nullable
/*  15 */   public String getText() { return this.text; } @Nullable
/*  16 */   public String getName() { return this.name; } @NotNull
/*  17 */   public final List<PsiElement> getMethods() { return this.methods; } @NotNull
/*  18 */   public final List<PsiElement> getFields() { return this.fields; } @Nullable
/*  19 */   public final List<String> getSuperClasses() { return this.superClasses; } @NotNull
/*  20 */   public final List<PsiReference> getUsages() { return this.usages; }
/*  21 */   public ClassContext(@NotNull PsiElement root, @Nullable String text, @Nullable String name, @NotNull List<PsiElement> methods, @NotNull List<PsiElement> fields, @Nullable List<String> superClasses, @NotNull List<PsiReference> usages) { super(root, text, name); this.root = root;
/*     */     this.text = text;
/*     */     this.name = name;
/*     */     this.methods = methods;
/*     */     this.fields = fields;
/*     */     this.superClasses = superClasses;
/*  27 */     this.usages = usages; } @NotNull public final List<String> getFieldNames() { VariableContextProvider variableContextProvider = new VariableContextProvider(
/*  28 */         false, 
/*  29 */         false, 
/*  30 */         false);
/*     */     
/*  32 */     Iterable<PsiElement> $this$mapNotNull$iv = this.fields; int $i$f$mapNotNull = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  95 */     Iterable<PsiElement> iterable1 = $this$mapNotNull$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 103 */     Iterable<PsiElement> $this$forEach$iv$iv$iv = iterable1; int $i$f$forEach = 0;
/* 104 */     Iterator<PsiElement> iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; PsiElement it = (PsiElement)element$iv$iv;
/*     */       int $i$a$-mapNotNull-ClassContext$getFieldNames$1 = 0; }
/*     */     
/* 107 */     return (List<String>)destination$iv$iv; } @NotNull public final List<String> getMethodSignatures() { MethodContextProvider methodContextProvider = new MethodContextProvider(false, false); Iterable<PsiElement> $this$mapNotNull$iv = this.methods; int $i$f$mapNotNull = 0;
/* 108 */     Iterable<PsiElement> iterable1 = $this$mapNotNull$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 116 */     Iterable<PsiElement> $this$forEach$iv$iv$iv = iterable1; int $i$f$forEach = 0;
/* 117 */     Iterator<PsiElement> iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; PsiElement it = (PsiElement)element$iv$iv;
/*     */       int $i$a$-mapNotNull-ClassContext$getMethodSignatures$1 = 0; }
/*     */     
/* 120 */     return (List<String>)destination$iv$iv; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public String toQuery() {
/*     */     if (getName() == null)
/*     */       getName(); 
/*     */     String className = "_";
/*     */     String classFields = CollectionsKt.joinToString$default(getFieldNames(), " ", null, null, 0, null, null, 62, null);
/*     */     String classMethods = CollectionsKt.joinToString$default(getMethodSignatures(), "\n", null, null, 0, null, null, 62, null);
/*     */     return "class name: " + className + "\nclass fields: " + classFields + "\nclass methods: " + classMethods + "\nsuper classes: " + this.superClasses + "\n";
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String toTextQuery(int prevLines, int postLines, boolean withLineNumbers) {
/*     */     return (new ElementContext(getRoot())).toQuery(prevLines, postLines, withLineNumbers);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toJson() {
/*     */     Pair[] arrayOfPair = new Pair[3];
/*     */     arrayOfPair[0] = TuplesKt.to("name", getName());
/*     */     arrayOfPair[1] = TuplesKt.to("methods", getMethodSignatures());
/*     */     arrayOfPair[2] = TuplesKt.to("fields", getFieldNames());
/*     */     Intrinsics.checkNotNullExpressionValue((new Gson()).toJson(MapsKt.mapOf(arrayOfPair)), "Gson().toJson(\n      map…eldNames(),\n      )\n    )");
/*     */     return (new Gson()).toJson(MapsKt.mapOf(arrayOfPair));
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PsiElement component1() {
/*     */     return this.root;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String component2() {
/*     */     return this.text;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String component3() {
/*     */     return this.name;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<PsiElement> component4() {
/*     */     return this.methods;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<PsiElement> component5() {
/*     */     return this.fields;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final List<String> component6() {
/*     */     return this.superClasses;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<PsiReference> component7() {
/*     */     return this.usages;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ClassContext copy(@NotNull PsiElement root, @Nullable String text, @Nullable String name, @NotNull List<? extends PsiElement> methods, @NotNull List<? extends PsiElement> fields, @Nullable List<String> superClasses, @NotNull List<? extends PsiReference> usages) {
/*     */     Intrinsics.checkNotNullParameter(root, "root");
/*     */     Intrinsics.checkNotNullParameter(methods, "methods");
/*     */     Intrinsics.checkNotNullParameter(fields, "fields");
/*     */     Intrinsics.checkNotNullParameter(usages, "usages");
/*     */     return new ClassContext(root, text, name, methods, fields, superClasses, usages);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "ClassContext(root=" + this.root + ", text=" + this.text + ", name=" + this.name + ", methods=" + this.methods + ", fields=" + this.fields + ", superClasses=" + this.superClasses + ", usages=" + this.usages + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.root.hashCode();
/*     */     result = result * 31 + ((this.text == null) ? 0 : this.text.hashCode());
/*     */     result = result * 31 + ((this.name == null) ? 0 : this.name.hashCode());
/*     */     result = result * 31 + this.methods.hashCode();
/*     */     result = result * 31 + this.fields.hashCode();
/*     */     result = result * 31 + ((this.superClasses == null) ? 0 : this.superClasses.hashCode());
/*     */     return result * 31 + this.usages.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof ClassContext))
/*     */       return false; 
/*     */     ClassContext classContext = (ClassContext)other;
/*     */     return !Intrinsics.areEqual(this.root, classContext.root) ? false : (!Intrinsics.areEqual(this.text, classContext.text) ? false : (!Intrinsics.areEqual(this.name, classContext.name) ? false : (!Intrinsics.areEqual(this.methods, classContext.methods) ? false : (!Intrinsics.areEqual(this.fields, classContext.fields) ? false : (!Intrinsics.areEqual(this.superClasses, classContext.superClasses) ? false : (!!Intrinsics.areEqual(this.usages, classContext.usages)))))));
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/context/ClassContext.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */