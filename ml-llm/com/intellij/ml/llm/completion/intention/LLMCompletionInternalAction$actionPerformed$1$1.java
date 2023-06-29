/*    */ package com.intellij.ml.llm.completion.intention;
/*    */ 
/*    */ import com.intellij.codeInsight.inline.completion.InlineCompletionElement;
/*    */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*    */ import com.intellij.openapi.command.CommandProcessor;
/*    */ import com.intellij.openapi.editor.Document;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*    */ @SourceDebugExtension({"SMAP\nLLMCompletionInternalAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMCompletionInternalAction.kt\ncom/intellij/ml/llm/completion/intention/LLMCompletionInternalAction$actionPerformed$1$1\n+ 2 actions.kt\ncom/intellij/openapi/command/ActionsKt\n*L\n1#1,43:1\n7#2,6:44\n*S KotlinDebug\n*F\n+ 1 LLMCompletionInternalAction.kt\ncom/intellij/ml/llm/completion/intention/LLMCompletionInternalAction$actionPerformed$1$1\n*L\n31#1:44,6\n*E\n"})
/*    */ final class null
/*    */   extends Lambda
/*    */   implements Function0<Unit>
/*    */ {
/*    */   public final void invoke() {
/* 31 */     AnActionEvent anActionEvent = this.$e; List<InlineCompletionElement> list = this.$llmProposals; Document document = this.$document; int i = this.$offset;
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
/* 44 */     Project project$iv = null;
/* 45 */     String name$iv = null;
/* 46 */     String groupId$iv = null;
/*    */     int $i$f$executeCommand = 0;
/* 48 */     CommandProcessor.getInstance().executeCommand(project$iv, new LLMCompletionInternalAction$actionPerformed$1$1$invoke$$inlined$executeCommand$default$1(anActionEvent, list, document, i), name$iv, groupId$iv);
/*    */   }
/*    */   
/*    */   null(AnActionEvent $e, List<InlineCompletionElement> $llmProposals, Document $document, int $offset) {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/completion/intention/LLMCompletionInternalAction$actionPerformed$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */