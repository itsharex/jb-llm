/*    */ package com.intellij.ml.llm.consoleChat;
/*    */ import com.intellij.openapi.editor.Document;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.psi.PsiDocumentManager;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\b\002\020\000\032\0020\001H\n¢\006\002\b\002¨\006\003"}, d2 = {"<anonymous>", "", "run", "com/intellij/openapi/command/ActionsKt$executeCommand$1"})
/*    */ @SourceDebugExtension({"SMAP\nactions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 actions.kt\ncom/intellij/openapi/command/ActionsKt$executeCommand$1\n+ 2 ConsoleChatAction.kt\ncom/intellij/ml/llm/consoleChat/ConsoleChatAction$Companion$continueConversation$2\n*L\n1#1,13:1\n58#2,3:14\n*E\n"})
/*    */ public final class ConsoleChatAction$Companion$continueConversation$2$invoke$$inlined$executeCommand$default$1 implements Runnable {
/*    */   public final void run() {
/* 11 */     int $i$a$-executeCommand$default-ConsoleChatAction$Companion$continueConversation$2$1 = 0;
/*    */ 
/*    */     
/* 14 */     this.$document$inlined.insertString(this.$document$inlined.getTextLength(), this.$response$inlined);
/* 15 */     PsiDocumentManager.getInstance(this.$project$inlined).commitDocument(this.$document$inlined);
/*    */   }
/*    */   
/*    */   public ConsoleChatAction$Companion$continueConversation$2$invoke$$inlined$executeCommand$default$1(Document paramDocument, String paramString, Project paramProject) {}
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/consoleChat/ConsoleChatAction$Companion$continueConversation$2$invoke$$inlined$executeCommand$default$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */