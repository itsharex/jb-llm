/*    */ package com.intellij.ml.llm.java.actions;
/*    */ 
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\000\n\002\020 \n\002\020\016\n\000\020\000\032\0020\0012\f\020\002\032\b\022\004\022\0020\0040\003H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/java/actions/RunRenameBenchmarkAction$Row;", "<name for destructuring parameter 0>", "", "", "invoke"})
/*    */ final class RunRenameBenchmarkAction$actionPerformed$task$1$run$score$3
/*    */   extends Lambda
/*    */   implements Function1<List<? extends String>, RunRenameBenchmarkAction.Row>
/*    */ {
/*    */   public static final RunRenameBenchmarkAction$actionPerformed$task$1$run$score$3 INSTANCE = new RunRenameBenchmarkAction$actionPerformed$task$1$run$score$3();
/*    */   
/*    */   RunRenameBenchmarkAction$actionPerformed$task$1$run$score$3() {
/*    */     super(1);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final RunRenameBenchmarkAction.Row invoke(@NotNull List<String> paramList) {
/* 67 */     Intrinsics.checkNotNullParameter(paramList, "<name for destructuring parameter 0>"); String context = paramList.get(0), names = paramList.get(1), url = paramList.get(2), arrayOfString[] = new String[1]; arrayOfString[0] = ","; return new RunRenameBenchmarkAction.Row(context, StringsKt.split$default(names, arrayOfString, false, 0, 6, null), url);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/actions/RunRenameBenchmarkAction$actionPerformed$task$1$run$score$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */