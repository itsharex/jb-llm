/*    */ package com.intellij.ml.llm.vcs;
/*    */ 
/*    */ import ai.grazie.model.llm.chat.LLMChat;
/*    */ import ai.grazie.model.llm.chat.LLMChatRole;
/*    */ import com.intellij.ml.llm.core.tokenizer.Tokenizer;
/*    */ import com.intellij.openapi.vcs.ui.CommitMessage;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/llm/chat/LLMChat$Builder;", "invoke"})
/*    */ final class LLMCommitMessageAction$actionPerformed$task$1$run$1$chat$1
/*    */   extends Lambda
/*    */   implements Function1<LLMChat.Builder, Unit>
/*    */ {
/*    */   public final void invoke(@NotNull LLMChat.Builder $this$build) {
/* 90 */     Intrinsics.checkNotNullParameter($this$build, "$this$build"); Intrinsics.checkNotNullExpressionValue(this.$commitMessageUi.getEditorField().getText(), "commitMessageUi.editorField.text"); $this$build.message(LLMChatRole.User, this.$tokenizer.trim(LLMCommitMessageAction.access$getInstruction(LLMCommitMessageAction.this, this.$diff, this.$commitMessageUi.getEditorField().getText()), 8192));
/*    */   }
/*    */   
/*    */   LLMCommitMessageAction$actionPerformed$task$1$run$1$chat$1(LLMCommitMessageAction $receiver, String $diff, CommitMessage $commitMessageUi) {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/vcs/LLMCommitMessageAction$actionPerformed$task$1$run$1$chat$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */