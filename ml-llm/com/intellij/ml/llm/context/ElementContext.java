/*    */ package com.intellij.ml.llm.context;
/*    */ 
/*    */ import kotlin.Pair;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\b\n\002\b\005\n\002\020\016\n\002\b\004\n\002\020\013\n\000\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\b\020\r\032\0020\016H\026J\b\020\017\032\0020\016H\026J\036\020\017\032\0020\0162\006\020\020\032\0020\b2\006\020\021\032\0020\b2\006\020\022\032\0020\023R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\t\020\nR\021\020\013\032\0020\b¢\006\b\n\000\032\004\b\f\020\n¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/context/ElementContext;", "Lcom/intellij/ml/llm/context/LLMQueryContext;", "element", "Lcom/intellij/psi/PsiElement;", "(Lcom/intellij/psi/PsiElement;)V", "getElement", "()Lcom/intellij/psi/PsiElement;", "endLineNumber", "", "getEndLineNumber", "()I", "startLineNumber", "getStartLineNumber", "toJson", "", "toQuery", "prevLines", "postLines", "withLineNumbers", "", "intellij.ml.llm"})
/*    */ public final class ElementContext implements LLMQueryContext {
/*    */   @NotNull
/*    */   private final PsiElement element;
/*    */   
/* 10 */   public ElementContext(@NotNull PsiElement element) { this.element = element;
/*    */     
/* 12 */     this.startLineNumber = ElementContextKt.access$getLineNumber(this.element, true);
/* 13 */     this.endLineNumber = ElementContextKt.access$getLineNumber(this.element, false); } private final int startLineNumber; private final int endLineNumber; @NotNull public final PsiElement getElement() { return this.element; } public final int getStartLineNumber() { return this.startLineNumber; } public final int getEndLineNumber() { return this.endLineNumber; }
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
/*    */   @NotNull
/*    */   public final String toQuery(int prevLines, int postLines, boolean withLineNumbers) {
/* 27 */     Intrinsics.checkNotNullExpressionValue(this.element.getContainingFile().getText(), "element.containingFile.text"); List documentLines = StringsKt.lines(this.element.getContainingFile().getText());
/* 28 */     int fromLine = Integer.max(0, this.startLineNumber - prevLines);
/* 29 */     int toLine = Integer.min(documentLines.size(), this.endLineNumber + postLines + 1);
/* 30 */     System.out.println("" + fromLine + " " + fromLine + " " + this.startLineNumber + " " + this.endLineNumber);
/* 31 */     String text = (prevLines == 0 && postLines == 0) ? this.element.getText() : CollectionsKt.joinToString$default(documentLines.subList(fromLine, toLine), "\n", null, null, 0, null, null, 62, null);
/*    */     
/* 33 */     if (withLineNumbers) {
/* 34 */       Intrinsics.checkNotNullExpressionValue(text, "text"); text = ContextCollectionUtilsKt.addLineNumbers(text);
/*    */     } 
/* 36 */     Intrinsics.checkNotNullExpressionValue(text, "text"); return text;
/*    */   } @NotNull
/*    */   public String toQuery() {
/* 39 */     return toQuery(0, 0, false);
/*    */   } @NotNull
/*    */   public String toJson() {
/* 42 */     Pair[] arrayOfPair = new Pair[3]; arrayOfPair[0] = TuplesKt.to("startLine", Integer.valueOf(this.startLineNumber)); arrayOfPair[1] = 
/* 43 */       TuplesKt.to("endLine", Integer.valueOf(this.endLineNumber));
/* 44 */     arrayOfPair[2] = TuplesKt.to("text", this.element.getText());
/*    */     Intrinsics.checkNotNullExpressionValue((new Gson()).toJson(MapsKt.mapOf(arrayOfPair)), "Gson().toJson(mapOf(\n   …xt\" to element.text,\n  ))");
/*    */     return (new Gson()).toJson(MapsKt.mapOf(arrayOfPair));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/context/ElementContext.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */