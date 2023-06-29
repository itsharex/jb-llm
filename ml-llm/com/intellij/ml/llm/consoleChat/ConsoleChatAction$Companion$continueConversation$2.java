/*    */ package com.intellij.ml.llm.consoleChat;
/*    */ 
/*    */ import com.intellij.ml.llm.LLMBundle;
/*    */ import com.intellij.openapi.command.CommandProcessor;
/*    */ import com.intellij.openapi.editor.Document;
/*    */ import com.intellij.openapi.project.Project;
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
/*    */ @SourceDebugExtension({"SMAP\nConsoleChatAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsoleChatAction.kt\ncom/intellij/ml/llm/consoleChat/ConsoleChatAction$Companion$continueConversation$2\n+ 2 actions.kt\ncom/intellij/openapi/command/ActionsKt\n*L\n1#1,66:1\n7#2,6:67\n*S KotlinDebug\n*F\n+ 1 ConsoleChatAction.kt\ncom/intellij/ml/llm/consoleChat/ConsoleChatAction$Companion$continueConversation$2\n*L\n57#1:67,6\n*E\n"})
/*    */ final class ConsoleChatAction$Companion$continueConversation$2
/*    */   extends Lambda
/*    */   implements Function0<Unit>
/*    */ {
/*    */   public final void invoke() {
/* 57 */     Project project1 = this.$project; String str1 = LLMBundle.message("mock.chat.add.responce.text", new Object[0]); Document document = this.$document; String str2 = this.$response; Project project2 = this.$project;
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
/* 69 */     String groupId$iv = null;
/*    */     int $i$f$executeCommand = 0;
/* 71 */     CommandProcessor.getInstance().executeCommand(project1, new ConsoleChatAction$Companion$continueConversation$2$invoke$$inlined$executeCommand$default$1(document, str2, project2), str1, groupId$iv);
/*    */   }
/*    */   
/*    */   ConsoleChatAction$Companion$continueConversation$2(Project $project, Document $document, String $response) {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/consoleChat/ConsoleChatAction$Companion$continueConversation$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */