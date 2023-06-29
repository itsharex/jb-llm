/*    */ package com.intellij.ml.llm.context;@Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\n\b&\030\0002\0020\001B%\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\005\022\n\b\002\020\006\032\004\030\0010\005¢\006\002\020\007J\b\020\r\032\0020\005H\026J\b\020\016\032\0020\005H\026R\026\020\006\032\004\030\0010\005X\004¢\006\b\n\000\032\004\b\b\020\tR\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\n\020\013R\026\020\004\032\004\030\0010\005X\004¢\006\b\n\000\032\004\b\f\020\t¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/context/NamedElementContext;", "Lcom/intellij/ml/llm/context/LLMQueryContext;", "root", "Lcom/intellij/psi/PsiElement;", "text", "", "name", "(Lcom/intellij/psi/PsiElement;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getRoot", "()Lcom/intellij/psi/PsiElement;", "getText", "toJson", "toQuery", "intellij.ml.llm"})
/*    */ public abstract class NamedElementContext implements LLMQueryContext { @NotNull
/*    */   private final PsiElement root; @Nullable
/*    */   private final String text; @Nullable
/*    */   private final String name;
/*  6 */   public NamedElementContext(@NotNull PsiElement root, @Nullable String text, @Nullable String name) { this.root = root;
/*  7 */     this.text = text;
/*  8 */     this.name = name; } @NotNull public PsiElement getRoot() { return this.root; } @Nullable public String getName() { return this.name; }
/*    */   @Nullable
/*    */   public String getText() { return this.text; } @NotNull
/* 11 */   public String toQuery() { String str = "Not yet implemented"; throw new NotImplementedError("An operation is not implemented: " + str); }
/*    */   
/*    */   @NotNull
/*    */   public String toJson() {
/* 15 */     String str = "Not yet implemented"; throw new NotImplementedError("An operation is not implemented: " + str);
/*    */   } }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/context/NamedElementContext.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */