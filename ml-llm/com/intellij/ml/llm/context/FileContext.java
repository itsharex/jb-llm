/*    */ package com.intellij.ml.llm.context;
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\021\030\0002\0020\001BY\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\n\b\002\020\007\032\004\030\0010\005\022\016\b\002\020\b\032\b\022\004\022\0020\n0\t\022\016\b\002\020\013\032\b\022\004\022\0020\n0\t\022\016\b\002\020\f\032\b\022\004\022\0020\n0\t¢\006\002\020\rJ\f\020\030\032\b\022\004\022\0020\0050\tJ\b\020\031\032\0020\005H\026J\b\020\032\032\0020\005H\026R\027\020\013\032\b\022\004\022\0020\n0\t¢\006\b\n\000\032\004\b\016\020\017R\027\020\b\032\b\022\004\022\0020\n0\t¢\006\b\n\000\032\004\b\020\020\017R\027\020\f\032\b\022\004\022\0020\n0\t¢\006\b\n\000\032\004\b\021\020\017R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\022\020\023R\023\020\007\032\004\030\0010\005¢\006\b\n\000\032\004\b\024\020\023R\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\025\020\023R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\026\020\027¨\006\033"}, d2 = {"Lcom/intellij/ml/llm/context/FileContext;", "Lcom/intellij/ml/llm/context/LLMQueryContext;", "root", "Lcom/intellij/psi/PsiFile;", "name", "", "path", "packageString", "imports", "", "Lcom/intellij/psi/PsiElement;", "classes", "methods", "(Lcom/intellij/psi/PsiFile;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getClasses", "()Ljava/util/List;", "getImports", "getMethods", "getName", "()Ljava/lang/String;", "getPackageString", "getPath", "getRoot", "()Lcom/intellij/psi/PsiFile;", "getClassNames", "toJson", "toQuery", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nFileContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileContext.kt\ncom/intellij/ml/llm/context/FileContext\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1603#2,9:63\n1855#2:72\n1856#2:74\n1612#2:75\n1#3:73\n*S KotlinDebug\n*F\n+ 1 FileContext.kt\ncom/intellij/ml/llm/context/FileContext\n*L\n25#1:63,9\n25#1:72\n25#1:74\n25#1:75\n25#1:73\n*E\n"})
/*    */ public final class FileContext implements LLMQueryContext { @NotNull
/*    */   private final PsiFile root;
/*    */   @NotNull
/*    */   private final String name;
/*    */   @NotNull
/*    */   private final String path;
/*    */   
/* 11 */   public FileContext(@NotNull PsiFile root, @NotNull String name, @NotNull String path, @Nullable String packageString, @NotNull List<PsiElement> imports, @NotNull List<PsiElement> classes, @NotNull List<PsiElement> methods) { this.root = root;
/* 12 */     this.name = name;
/* 13 */     this.path = path;
/* 14 */     this.packageString = packageString;
/* 15 */     this.imports = imports;
/* 16 */     this.classes = classes;
/* 17 */     this.methods = methods; } @Nullable private final String packageString; @NotNull private final List<PsiElement> imports; @NotNull private final List<PsiElement> classes; @NotNull private final List<PsiElement> methods; @NotNull public final PsiFile getRoot() { return this.root; } @NotNull public final String getName() { return this.name; } @NotNull public final String getPath() { return this.path; } @NotNull public final List<PsiElement> getMethods() { return this.methods; } @Nullable
/*    */   public final String getPackageString() { return this.packageString; }
/*    */   @NotNull
/*    */   public final List<PsiElement> getImports() { return this.imports; }
/*    */   @NotNull
/*    */   public final List<PsiElement> getClasses() { return this.classes; }
/*    */   @NotNull
/* 24 */   public final List<String> getClassNames() { ClassContextProvider classContextProvider = new ClassContextProvider(false);
/* 25 */     Iterable<PsiElement> $this$mapNotNull$iv = this.classes; int $i$f$mapNotNull = 0;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 63 */     Iterable<PsiElement> iterable1 = $this$mapNotNull$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 71 */     Iterable<PsiElement> $this$forEach$iv$iv$iv = iterable1; int $i$f$forEach = 0;
/* 72 */     Iterator<PsiElement> iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; PsiElement it = (PsiElement)element$iv$iv;
/*    */       int $i$a$-mapNotNull-FileContext$getClassNames$1 = 0; }
/*    */     
/* 75 */     return (List<String>)destination$iv$iv; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public String toQuery() {
/*    */     if (this.packageString == null);
/*    */     String filePackage = "_";
/*    */     String fileImports = CollectionsKt.joinToString$default(this.imports, " ", null, null, 0, null, FileContext$toQuery$fileImports$1.INSTANCE, 30, null);
/*    */     String fileClassNames = CollectionsKt.joinToString$default(getClassNames(), ", ", null, null, 0, null, null, 62, null);
/*    */     return "file name: " + this.name + "\nfile path: " + this.path + "\nfile package: " + filePackage + "\nfile imports: " + fileImports + "\nfile classes: " + fileClassNames;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\r\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/psi/PsiElement;", "invoke"})
/*    */   static final class FileContext$toQuery$fileImports$1 extends Lambda implements Function1<PsiElement, CharSequence> {
/*    */     public static final FileContext$toQuery$fileImports$1 INSTANCE = new FileContext$toQuery$fileImports$1();
/*    */     
/*    */     FileContext$toQuery$fileImports$1() {
/*    */       super(1);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final CharSequence invoke(@NotNull PsiElement it) {
/*    */       Intrinsics.checkNotNullParameter(it, "it");
/*    */       Intrinsics.checkNotNullExpressionValue(it.getText(), "it.text");
/*    */       return it.getText();
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toJson() {
/*    */     Pair[] arrayOfPair = new Pair[3];
/*    */     arrayOfPair[0] = TuplesKt.to("name", this.name);
/*    */     arrayOfPair[1] = TuplesKt.to("path", this.path);
/*    */     arrayOfPair[2] = TuplesKt.to("package", this.packageString);
/*    */     Intrinsics.checkNotNullExpressionValue((new Gson()).toJson(MapsKt.mapOf(arrayOfPair)), "Gson().toJson(mapOf(\n   …e\" to packageString,\n  ))");
/*    */     return (new Gson()).toJson(MapsKt.mapOf(arrayOfPair));
/*    */   } }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/context/FileContext.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */