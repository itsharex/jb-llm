/*    */ package com.intellij.ml.llm.python.intentions.inline;
/*    */ 
/*    */ import com.intellij.ml.llm.core.models.requestResponse.LLMResponseChoice;
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.util.TextRange;
/*    */ import com.intellij.openapi.util.text.StringUtil;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.refactoring.suggested.UtilsKt;
/*    */ import com.jetbrains.python.psi.PyFunction;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.text.StringsKt;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */ final class PythonAddTypeAnnotationsIntention$invoke$task$1$run$1$1
/*    */   extends Lambda
/*    */   implements Function0<Unit>
/*    */ {
/*    */   public final void invoke() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield $project : Lcom/intellij/openapi/project/Project;
/*    */     //   4: ldc 'intentions.write.documentation.write.action.name'
/*    */     //   6: iconst_0
/*    */     //   7: anewarray java/lang/Object
/*    */     //   10: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   13: aload_0
/*    */     //   14: getfield this$0 : Lcom/intellij/ml/llm/python/intentions/inline/PythonAddTypeAnnotationsIntention;
/*    */     //   17: invokestatic access$getWriteActionGroupId$p : (Lcom/intellij/ml/llm/python/intentions/inline/PythonAddTypeAnnotationsIntention;)Ljava/lang/String;
/*    */     //   20: aload_0
/*    */     //   21: getfield $it : Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;
/*    */     //   24: aload_0
/*    */     //   25: getfield $function : Lcom/jetbrains/python/psi/PyFunction;
/*    */     //   28: aload_0
/*    */     //   29: getfield $project : Lcom/intellij/openapi/project/Project;
/*    */     //   32: aload_0
/*    */     //   33: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*    */     //   36: <illegal opcode> run : (Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;Lcom/jetbrains/python/psi/PyFunction;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Editor;)Ljava/lang/Runnable;
/*    */     //   41: iconst_0
/*    */     //   42: anewarray com/intellij/psi/PsiFile
/*    */     //   45: invokestatic runWriteCommandAction : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;[Lcom/intellij/psi/PsiFile;)V
/*    */     //   48: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #81	-> 0
/*    */     //   #82	-> 13
/*    */     //   #81	-> 20
/*    */     //   #95	-> 48
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	49	0	this	Lcom/intellij/ml/llm/python/intentions/inline/PythonAddTypeAnnotationsIntention$invoke$task$1$run$1$1;
/*    */   }
/*    */   
/*    */   private static final void invoke$lambda$0(LLMResponseChoice $it, PyFunction $function, Project $project, Editor $editor) {
/* 83 */     Intrinsics.checkNotNullParameter($it, "$it"); Intrinsics.checkNotNullParameter($function, "$function"); Intrinsics.checkNotNullParameter($project, "$project"); Intrinsics.checkNotNullExpressionValue(StringUtil.convertLineSeparators($it.getText()), "convertLineSeparators(it.text)"); String suggestion = StringUtil.convertLineSeparators($it.getText());
/* 84 */     Intrinsics.checkNotNullExpressionValue($function.getStatementList(), "function.statementList"); TextRange textRange = new TextRange($function.getTextRange().getStartOffset(), UtilsKt.getStartOffset((PsiElement)$function.getStatementList()));
/*    */     
/* 86 */     int startIndex = StringsKt.indexOf$default(suggestion, "def", 0, false, 6, null);
/* 87 */     Intrinsics.checkNotNullExpressionValue($function.getStatementList().getText(), "function.statementList.text"); int endIndex = StringsKt.indexOf$default(suggestion, $function.getStatementList().getText(), 0, false, 6, null);
/*    */     
/* 89 */     if (startIndex != -1 && endIndex != -1 && startIndex < endIndex) {
/* 90 */       Intrinsics.checkNotNullExpressionValue(suggestion.substring(startIndex, endIndex), "this as java.lang.String…ing(startIndex, endIndex)"); String suggestionText = suggestion.substring(startIndex, endIndex);
/*    */       
/* 92 */       Intrinsics.checkNotNullExpressionValue($editor.getDocument(), "editor.document"); PythonAddTypeAnnotationsIntention.Companion.updateDocument$intellij_ml_llm_python($project, suggestionText, $editor.getDocument(), textRange);
/*    */     } 
/*    */   }
/*    */   
/*    */   PythonAddTypeAnnotationsIntention$invoke$task$1$run$1$1(PythonAddTypeAnnotationsIntention $receiver, LLMResponseChoice $it, PyFunction $function, Editor $editor) {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/python/intentions/inline/PythonAddTypeAnnotationsIntention$invoke$task$1$run$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */