/*    */ package com.intellij.ml.llm.context;
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\006\n\002\020 \n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\033\n\002\020\000\n\000\n\002\020\b\n\002\b\b\b\b\030\0002\0020\001Bo\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\020\006\032\004\030\0010\005\022\b\020\007\032\004\030\0010\005\022\b\020\b\032\004\030\0010\003\022\b\020\t\032\004\030\0010\005\022\b\020\n\032\004\030\0010\005\022\f\020\013\032\b\022\004\022\0020\0050\f\022\b\b\002\020\r\032\0020\016\022\016\b\002\020\017\032\b\022\004\022\0020\0200\f¢\006\002\020\021J\t\020\"\032\0020\003HÆ\003J\017\020#\032\b\022\004\022\0020\0200\fHÆ\003J\t\020$\032\0020\005HÆ\003J\013\020%\032\004\030\0010\005HÆ\003J\013\020&\032\004\030\0010\005HÆ\003J\013\020'\032\004\030\0010\003HÆ\003J\013\020(\032\004\030\0010\005HÆ\003J\013\020)\032\004\030\0010\005HÆ\003J\017\020*\032\b\022\004\022\0020\0050\fHÆ\003J\t\020+\032\0020\016HÆ\003J\001\020,\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\0052\n\b\002\020\007\032\004\030\0010\0052\n\b\002\020\b\032\004\030\0010\0032\n\b\002\020\t\032\004\030\0010\0052\n\b\002\020\n\032\004\030\0010\0052\016\b\002\020\013\032\b\022\004\022\0020\0050\f2\b\b\002\020\r\032\0020\0162\016\b\002\020\017\032\b\022\004\022\0020\0200\fHÆ\001J\023\020-\032\0020\0162\b\020.\032\004\030\0010/HÖ\003J\t\0200\032\00201HÖ\001J\b\0202\032\0020\005H\026J\b\0203\032\0020\005H\026J\t\0204\032\0020\005HÖ\001J\036\0205\032\0020\0052\006\0206\032\002012\006\0207\032\002012\006\0208\032\0020\016R\020\020\022\032\004\030\0010\023X\004¢\006\002\n\000R\023\020\b\032\004\030\0010\003¢\006\b\n\000\032\004\b\024\020\025R\021\020\r\032\0020\016¢\006\b\n\000\032\004\b\026\020\027R\023\020\t\032\004\030\0010\005¢\006\b\n\000\032\004\b\030\020\031R\026\020\006\032\004\030\0010\005X\004¢\006\b\n\000\032\004\b\032\020\031R\027\020\013\032\b\022\004\022\0020\0050\f¢\006\b\n\000\032\004\b\033\020\034R\023\020\n\032\004\030\0010\005¢\006\b\n\000\032\004\b\035\020\031R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\036\020\025R\023\020\007\032\004\030\0010\005¢\006\b\n\000\032\004\b\037\020\031R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b \020\031R\027\020\017\032\b\022\004\022\0020\0200\f¢\006\b\n\000\032\004\b!\020\034¨\0069"}, d2 = {"Lcom/intellij/ml/llm/context/MethodContext;", "Lcom/intellij/ml/llm/context/NamedElementContext;", "root", "Lcom/intellij/psi/PsiElement;", "text", "", "name", "signature", "enclosingClass", "language", "returnType", "paramNames", "", "includeClassContext", "", "usages", "Lcom/intellij/psi/PsiReference;", "(Lcom/intellij/psi/PsiElement;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/intellij/psi/PsiElement;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;)V", "classContext", "Lcom/intellij/ml/llm/context/ClassContext;", "getEnclosingClass", "()Lcom/intellij/psi/PsiElement;", "getIncludeClassContext", "()Z", "getLanguage", "()Ljava/lang/String;", "getName", "getParamNames", "()Ljava/util/List;", "getReturnType", "getRoot", "getSignature", "getText", "getUsages", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toJson", "toQuery", "toString", "toTextQuery", "prevLines", "postLines", "withLineNumbers", "intellij.ml.llm"})
/*    */ public final class MethodContext extends NamedElementContext { @NotNull
/*    */   private final PsiElement root; @NotNull
/*    */   private final String text;
/*    */   @Nullable
/*    */   private final String name;
/*    */   @Nullable
/*    */   private final String signature;
/*    */   @Nullable
/*    */   private final PsiElement enclosingClass;
/*    */   
/*    */   @NotNull
/* 14 */   public PsiElement getRoot() { return this.root; } @Nullable private final String language; @Nullable private final String returnType; @NotNull private final List<String> paramNames; private final boolean includeClassContext; @NotNull private final List<PsiReference> usages; @Nullable private final ClassContext classContext; @NotNull
/* 15 */   public String getText() { return this.text; } @Nullable
/* 16 */   public String getName() { return this.name; } @Nullable
/* 17 */   public final String getSignature() { return this.signature; } @Nullable
/* 18 */   public final PsiElement getEnclosingClass() { return this.enclosingClass; } @Nullable
/* 19 */   public final String getLanguage() { return this.language; } @Nullable
/* 20 */   public final String getReturnType() { return this.returnType; } @NotNull
/* 21 */   public final List<String> getParamNames() { return this.paramNames; }
/* 22 */   public final boolean getIncludeClassContext() { return this.includeClassContext; } @NotNull
/* 23 */   public final List<PsiReference> getUsages() { return this.usages; } public MethodContext(@NotNull PsiElement root, @NotNull String text, @Nullable String name, @Nullable String signature, @Nullable PsiElement enclosingClass, @Nullable String language, @Nullable String returnType, @NotNull List<String> paramNames, boolean includeClassContext, @NotNull List<PsiReference> usages) {
/* 24 */     super(root, text, name); this.root = root; this.text = text; this.name = name; this.signature = signature; this.enclosingClass = enclosingClass; this.language = language; this.returnType = returnType; this.paramNames = paramNames; this.includeClassContext = includeClassContext;
/*    */     this.usages = usages;
/* 26 */     this.classContext = (this.includeClassContext && this.enclosingClass != null) ? (
/* 27 */       new ClassContextProvider(false, 1, null)).from(this.enclosingClass) : 
/*    */ 
/*    */       
/* 30 */       null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public String toQuery() {
/* 38 */     if (getName() == null) getName();  String methodName = "_";
/* 39 */     if (this.signature == null); String methodSignature = "_";
/* 40 */     String method = getText();
/* 41 */     if (this.language == null); String methodLanguage = "_";
/*    */     
/* 43 */     String query = "fun name: " + methodName + "\nfun language: " + 
/* 44 */       methodLanguage + "\nfun signature: " + 
/* 45 */       methodSignature + "\nfun code: " + 
/* 46 */       method + "\n";
/*    */     
/* 48 */     if (this.classContext != null) {
/* 49 */       String classQuery = this.classContext.toQuery();
/* 50 */       return query + query;
/*    */     } 
/*    */     
/* 53 */     return query;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String toTextQuery(int prevLines, int postLines, boolean withLineNumbers) {
/* 65 */     return (new ElementContext(getRoot())).toQuery(prevLines, postLines, withLineNumbers);
/*    */   }
/*    */   @NotNull
/*    */   public String toJson() {
/* 69 */     Pair[] arrayOfPair = new Pair[7]; arrayOfPair[0] = TuplesKt.to("text", getText()); arrayOfPair[1] = 
/* 70 */       TuplesKt.to("name", getName());
/* 71 */     arrayOfPair[2] = TuplesKt.to("signature", this.signature);
/* 72 */     arrayOfPair[3] = TuplesKt.to("returnType", this.returnType);
/* 73 */     arrayOfPair[4] = TuplesKt.to("paramNames", this.paramNames);
/* 74 */     arrayOfPair[5] = TuplesKt.to("language", this.language);
/* 75 */     arrayOfPair[6] = TuplesKt.to("class", (this.classContext != null) ? this.classContext.toJson() : null);
/*    */     Intrinsics.checkNotNullExpressionValue((new Gson()).toJson(MapsKt.mapOf(arrayOfPair)), "Gson().toJson(\n    mapOf…text?.toJson(),\n    )\n  )");
/*    */     return (new Gson()).toJson(MapsKt.mapOf(arrayOfPair));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final PsiElement component1() {
/*    */     return this.root;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.text;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component3() {
/*    */     return this.name;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component4() {
/*    */     return this.signature;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final PsiElement component5() {
/*    */     return this.enclosingClass;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component6() {
/*    */     return this.language;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component7() {
/*    */     return this.returnType;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<String> component8() {
/*    */     return this.paramNames;
/*    */   }
/*    */   
/*    */   public final boolean component9() {
/*    */     return this.includeClassContext;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<PsiReference> component10() {
/*    */     return this.usages;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final MethodContext copy(@NotNull PsiElement root, @NotNull String text, @Nullable String name, @Nullable String signature, @Nullable PsiElement enclosingClass, @Nullable String language, @Nullable String returnType, @NotNull List<String> paramNames, boolean includeClassContext, @NotNull List<? extends PsiReference> usages) {
/*    */     Intrinsics.checkNotNullParameter(root, "root");
/*    */     Intrinsics.checkNotNullParameter(text, "text");
/*    */     Intrinsics.checkNotNullParameter(paramNames, "paramNames");
/*    */     Intrinsics.checkNotNullParameter(usages, "usages");
/*    */     return new MethodContext(root, text, name, signature, enclosingClass, language, returnType, paramNames, includeClassContext, usages);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "MethodContext(root=" + this.root + ", text=" + this.text + ", name=" + this.name + ", signature=" + this.signature + ", enclosingClass=" + this.enclosingClass + ", language=" + this.language + ", returnType=" + this.returnType + ", paramNames=" + this.paramNames + ", includeClassContext=" + this.includeClassContext + ", usages=" + this.usages + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.root.hashCode();
/*    */     result = result * 31 + this.text.hashCode();
/*    */     result = result * 31 + ((this.name == null) ? 0 : this.name.hashCode());
/*    */     result = result * 31 + ((this.signature == null) ? 0 : this.signature.hashCode());
/*    */     result = result * 31 + ((this.enclosingClass == null) ? 0 : this.enclosingClass.hashCode());
/*    */     result = result * 31 + ((this.language == null) ? 0 : this.language.hashCode());
/*    */     result = result * 31 + ((this.returnType == null) ? 0 : this.returnType.hashCode());
/*    */     result = result * 31 + this.paramNames.hashCode();
/*    */     if (this.includeClassContext);
/*    */     result = result * 31 + 1;
/*    */     return result * 31 + this.usages.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof MethodContext))
/*    */       return false; 
/*    */     MethodContext methodContext = (MethodContext)other;
/*    */     return !Intrinsics.areEqual(this.root, methodContext.root) ? false : (!Intrinsics.areEqual(this.text, methodContext.text) ? false : (!Intrinsics.areEqual(this.name, methodContext.name) ? false : (!Intrinsics.areEqual(this.signature, methodContext.signature) ? false : (!Intrinsics.areEqual(this.enclosingClass, methodContext.enclosingClass) ? false : (!Intrinsics.areEqual(this.language, methodContext.language) ? false : (!Intrinsics.areEqual(this.returnType, methodContext.returnType) ? false : (!Intrinsics.areEqual(this.paramNames, methodContext.paramNames) ? false : ((this.includeClassContext != methodContext.includeClassContext) ? false : (!!Intrinsics.areEqual(this.usages, methodContext.usages))))))))));
/*    */   } }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/context/MethodContext.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */