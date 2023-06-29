/*    */ package com.intellij.ml.llm.completion.intention;
/*    */ import com.intellij.ml.llm.intentions.internal.editor.CodeCompletionIntention;
/*    */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*    */ import com.intellij.openapi.editor.Document;
/*    */ import com.intellij.openapi.project.Project;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\b\002\020\000\032\0020\001H\n¢\006\002\b\002¨\006\003"}, d2 = {"<anonymous>", "", "run", "com/intellij/openapi/command/ActionsKt$executeCommand$1"})
/*    */ @SourceDebugExtension({"SMAP\nactions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 actions.kt\ncom/intellij/openapi/command/ActionsKt$executeCommand$1\n+ 2 LLMCompletionInternalAction.kt\ncom/intellij/ml/llm/completion/intention/LLMCompletionInternalAction$actionPerformed$1$1\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,13:1\n32#2:14\n33#2:16\n1#3:15\n*E\n"})
/*    */ public final class LLMCompletionInternalAction$actionPerformed$1$1$invoke$$inlined$executeCommand$default$1 implements Runnable {
/*    */   public final void run() {
/* 11 */     int $i$a$-executeCommand$default-LLMCompletionInternalAction$actionPerformed$1$1$1 = 0;
/*    */ 
/*    */     
/* 14 */     if (this.$e$inlined.getProject() != null) { Project it = this.$e$inlined.getProject();
/* 15 */       int $i$a$-let-LLMCompletionInternalAction$actionPerformed$1$1$1$1 = 0;
/*    */       Intrinsics.checkNotNullExpressionValue(it, "it");
/*    */       CodeCompletionIntention.Companion.insertStringAndSaveChange$default(CodeCompletionIntention.Companion, it, ((InlineCompletionElement)CollectionsKt.first(this.$llmProposals$inlined)).getText(), this.$document$inlined, this.$offset$inlined, false, 16, null); }
/*    */     else
/*    */     { this.$e$inlined.getProject(); }
/*    */   
/*    */   }
/*    */   
/*    */   public LLMCompletionInternalAction$actionPerformed$1$1$invoke$$inlined$executeCommand$default$1(AnActionEvent paramAnActionEvent, List paramList, Document paramDocument, int paramInt) {}
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/completion/intention/LLMCompletionInternalAction$actionPerformed$1$1$invoke$$inlined$executeCommand$default$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */