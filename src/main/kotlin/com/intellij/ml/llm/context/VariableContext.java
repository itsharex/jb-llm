/*    */ package com.intellij.ml.llm.context;
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\020 \n\002\030\002\n\000\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\t\n\002\030\002\n\002\b\013\030\0002\0020\001B]\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\n\b\002\020\006\032\004\030\0010\005\022\n\b\002\020\007\032\004\030\0010\003\022\n\b\002\020\b\032\004\030\0010\003\022\016\b\002\020\t\032\b\022\004\022\0020\0130\n\022\b\b\002\020\f\032\0020\r\022\b\b\002\020\016\032\0020\r¢\006\002\020\017J\b\020$\032\0020\005H\026J\b\020%\032\0020\005H\026R\023\020\020\032\004\030\0010\021¢\006\b\n\000\032\004\b\022\020\023R\023\020\b\032\004\030\0010\003¢\006\b\n\000\032\004\b\024\020\025R\023\020\007\032\004\030\0010\003¢\006\b\n\000\032\004\b\026\020\025R\021\020\016\032\0020\r¢\006\b\n\000\032\004\b\027\020\030R\021\020\f\032\0020\r¢\006\b\n\000\032\004\b\031\020\030R\023\020\032\032\004\030\0010\033¢\006\b\n\000\032\004\b\034\020\035R\026\020\006\032\004\030\0010\005X\004¢\006\b\n\000\032\004\b\036\020\037R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b \020\025R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b!\020\037R\027\020\t\032\b\022\004\022\0020\0130\n¢\006\b\n\000\032\004\b\"\020#¨\006&"}, d2 = {"Lcom/intellij/ml/llm/context/VariableContext;", "Lcom/intellij/ml/llm/context/NamedElementContext;", "root", "Lcom/intellij/psi/PsiElement;", "text", "", "name", "enclosingMethod", "enclosingClass", "usages", "", "Lcom/intellij/psi/PsiReference;", "includeMethodContext", "", "includeClassContext", "(Lcom/intellij/psi/PsiElement;Ljava/lang/String;Ljava/lang/String;Lcom/intellij/psi/PsiElement;Lcom/intellij/psi/PsiElement;Ljava/util/List;ZZ)V", "classContext", "Lcom/intellij/ml/llm/context/ClassContext;", "getClassContext", "()Lcom/intellij/ml/llm/context/ClassContext;", "getEnclosingClass", "()Lcom/intellij/psi/PsiElement;", "getEnclosingMethod", "getIncludeClassContext", "()Z", "getIncludeMethodContext", "methodContext", "Lcom/intellij/ml/llm/context/MethodContext;", "getMethodContext", "()Lcom/intellij/ml/llm/context/MethodContext;", "getName", "()Ljava/lang/String;", "getRoot", "getText", "getUsages", "()Ljava/util/List;", "toJson", "toQuery", "intellij.ml.llm"})
/*    */ public final class VariableContext extends NamedElementContext { @NotNull
/*    */   private final PsiElement root; @NotNull
/*    */   private final String text; @Nullable
/*    */   private final String name; @Nullable
/*    */   private final PsiElement enclosingMethod; @Nullable
/*    */   private final PsiElement enclosingClass;
/*    */   
/*    */   @NotNull
/* 11 */   public PsiElement getRoot() { return this.root; } @NotNull private final List<PsiReference> usages; private final boolean includeMethodContext; private final boolean includeClassContext; @Nullable private final MethodContext methodContext; @Nullable private final ClassContext classContext; @NotNull
/* 12 */   public String getText() { return this.text; } @Nullable
/* 13 */   public String getName() { return this.name; } @Nullable
/* 14 */   public final PsiElement getEnclosingMethod() { return this.enclosingMethod; } @Nullable
/* 15 */   public final PsiElement getEnclosingClass() { return this.enclosingClass; } @NotNull
/* 16 */   public final List<PsiReference> getUsages() { return this.usages; }
/* 17 */   public final boolean getIncludeMethodContext() { return this.includeMethodContext; }
/* 18 */   public final boolean getIncludeClassContext() { return this.includeClassContext; }
/* 19 */   public VariableContext(@NotNull PsiElement root, @NotNull String text, @Nullable String name, @Nullable PsiElement enclosingMethod, @Nullable PsiElement enclosingClass, @NotNull List<PsiReference> usages, boolean includeMethodContext, boolean includeClassContext) { super(root, text, name); this.root = root; this.text = text; this.name = name; this.enclosingMethod = enclosingMethod; this.enclosingClass = enclosingClass; this.usages = usages; this.includeMethodContext = includeMethodContext;
/*    */     this.includeClassContext = includeClassContext;
/* 21 */     this.methodContext = (this.includeMethodContext && this.enclosingMethod != null) ? (
/* 22 */       new MethodContextProvider(false, false, 3, null)).from(this.enclosingMethod) : 
/*    */ 
/*    */       
/* 25 */       null;
/*    */ 
/*    */     
/* 28 */     this.classContext = (this.includeClassContext && this.enclosingClass != null) ? (
/* 29 */       new ClassContextProvider(false, 1, null)).from(this.enclosingClass) : 
/*    */ 
/*    */       
/* 32 */       null; } @Nullable
/*    */   public final MethodContext getMethodContext() {
/*    */     return this.methodContext;
/*    */   } @Nullable
/*    */   public final ClassContext getClassContext() {
/*    */     return this.classContext;
/*    */   } @NotNull
/*    */   public String toQuery() {
/* 40 */     if (getName() == null) getName();  String varName = "_";
/* 41 */     if (this.methodContext == null || this.methodContext.getName() == null) this.methodContext.getName();  String varMethodName = "_";
/* 42 */     if (this.methodContext == null || this.methodContext.getName() == null) this.methodContext.getName();  String varClassName = "_";
/* 43 */     return "var name: " + varName + "\nvar method name: " + 
/* 44 */       varMethodName + "\nvar class name: " + 
/* 45 */       varClassName + "\n";
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toJson() {
/* 50 */     Pair[] arrayOfPair = new Pair[3]; arrayOfPair[0] = TuplesKt.to("name", getName()); arrayOfPair[1] = 
/* 51 */       TuplesKt.to("methodName", (this.methodContext != null) ? this.methodContext.getName() : null);
/* 52 */     arrayOfPair[2] = TuplesKt.to("className", (this.classContext != null) ? this.classContext.getName() : null);
/*    */     Intrinsics.checkNotNullExpressionValue((new Gson()).toJson(MapsKt.mapOf(arrayOfPair)), "Gson().toJson(\n    mapOf…sContext?.name,\n    )\n  )");
/*    */     return (new Gson()).toJson(MapsKt.mapOf(arrayOfPair));
/*    */   } }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/context/VariableContext.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */