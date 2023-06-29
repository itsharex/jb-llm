/*    */ package com.intellij.ml.llm.java.actions;
/*    */ 
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020 \n\002\020\016\n\002\b\002\020\000\032\b\022\004\022\0020\0020\0012\006\020\003\032\0020\002H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "", "it", "invoke"})
/*    */ final class RunRenameBenchmarkAction$actionPerformed$task$1$run$score$2
/*    */   extends Lambda
/*    */   implements Function1<String, List<? extends String>>
/*    */ {
/*    */   public static final RunRenameBenchmarkAction$actionPerformed$task$1$run$score$2 INSTANCE = new RunRenameBenchmarkAction$actionPerformed$task$1$run$score$2();
/*    */   
/*    */   RunRenameBenchmarkAction$actionPerformed$task$1$run$score$2() {
/*    */     super(1);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<String> invoke(@NotNull String it) {
/* 66 */     Intrinsics.checkNotNullParameter(it, "it"); String[] arrayOfString = new String[1]; arrayOfString[0] = ";"; return CollectionsKt.take(StringsKt.split$default(it, arrayOfString, false, 0, 6, null), 3);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/actions/RunRenameBenchmarkAction$actionPerformed$task$1$run$score$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */