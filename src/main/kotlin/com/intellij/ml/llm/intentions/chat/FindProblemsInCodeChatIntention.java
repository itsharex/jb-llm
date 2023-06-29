/*    */ package com.intellij.ml.llm.intentions.chat;
/*    */ 
/*    */ import com.intellij.lang.Language;
/*    */ import com.intellij.ml.llm.LLMBundle;
/*    */ import com.intellij.ml.llm.core.chat.session.ChatOrigin;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\003\030\0002\0020\001B\005¢\006\002\020\002J \020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\0042\006\020\b\032\0020\004H\024J \020\t\032\0020\n2\f\020\013\032\b\022\004\022\0020\r0\f2\b\020\016\032\004\030\0010\017H\024J\b\020\020\032\0020\004H\026J\b\020\021\032\0020\004H\026¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/intentions/chat/FindProblemsInCodeChatIntention;", "Lcom/intellij/ml/llm/intentions/chat/AbstractChatIntention;", "()V", "buildMessageFromPrompt", "", "language", "Lcom/intellij/lang/Language;", "code", "prompt", "getChatCreationContext", "Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;", "extraItems", "", "Lcom/intellij/ml/llm/core/chat/context/ChatContextItem;", "sourceFile", "Lcom/intellij/psi/PsiFile;", "getFamilyName", "getText", "intellij.ml.llm"})
/*    */ public final class FindProblemsInCodeChatIntention extends AbstractChatIntention {
/* 12 */   public FindProblemsInCodeChatIntention() { super("Find potential problems in the code:"); } @NotNull
/* 13 */   public String getText() { return LLMBundle.message("intentions.chat.find.problems.code.name", new Object[0]); } @NotNull
/*    */   public String getFamilyName() {
/* 15 */     return LLMBundle.message("intentions.chat.find.problems.code.family.name", new Object[0]);
/*    */   } @NotNull
/*    */   protected String buildMessageFromPrompt(@NotNull Language language, @NotNull String code, @NotNull String prompt) {
/* 18 */     Intrinsics.checkNotNullParameter(language, "language"); Intrinsics.checkNotNullParameter(code, "code"); Intrinsics.checkNotNullParameter(prompt, "prompt"); return prompt + "\n```" + prompt + "\n" + language.getDisplayName() + "\n```";
/*    */   } @NotNull
/*    */   protected ChatCreationContext getChatCreationContext(@NotNull List extraItems, @Nullable PsiFile sourceFile) {
/* 21 */     Intrinsics.checkNotNullParameter(extraItems, "extraItems"); return new ChatCreationContext(
/* 22 */         (ChatOrigin)ChatOrigin.CustomIntention.INSTANCE, ChatSessionStorage.SourceAction.FIND_PROBLEMS_INTENTION, sourceFile, null, 8, null);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/chat/FindProblemsInCodeChatIntention.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */