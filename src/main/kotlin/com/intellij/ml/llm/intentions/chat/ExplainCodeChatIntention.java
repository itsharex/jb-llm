/*    */ package com.intellij.ml.llm.intentions.chat;
/*    */ import com.intellij.lang.Language;
/*    */ import com.intellij.ml.llm.core.chat.session.ChatOrigin;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import java.util.List;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\026\030\0002\0020\001B\005¢\006\002\020\002J \020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\0042\006\020\b\032\0020\004H\024J \020\t\032\0020\n2\f\020\013\032\b\022\004\022\0020\r0\f2\b\020\016\032\004\030\0010\017H\024J\b\020\020\032\0020\004H\026J\034\020\021\032\004\030\0010\0042\006\020\022\032\0020\0232\b\020\024\032\004\030\0010\025H\024J\b\020\026\032\0020\004H\026¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/intentions/chat/ExplainCodeChatIntention;", "Lcom/intellij/ml/llm/intentions/chat/AbstractChatIntention;", "()V", "buildMessageFromPrompt", "", "language", "Lcom/intellij/lang/Language;", "code", "prompt", "getChatCreationContext", "Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;", "extraItems", "", "Lcom/intellij/ml/llm/core/chat/context/ChatContextItem;", "sourceFile", "Lcom/intellij/psi/PsiFile;", "getFamilyName", "getPrompt", "project", "Lcom/intellij/openapi/project/Project;", "context", "Lcom/intellij/psi/PsiElement;", "getText", "intellij.ml.llm"})
/*    */ public class ExplainCodeChatIntention extends AbstractChatIntention {
/*    */   public ExplainCodeChatIntention() {
/* 13 */     super(null, 1, null);
/*    */   } @Nullable
/*    */   protected String getPrompt(@NotNull Project project, @Nullable PsiElement context) {
/* 16 */     Intrinsics.checkNotNullParameter(project, "project"); if (context == null || context.getLanguage() == null || context.getLanguage().getDisplayName() == null) context.getLanguage().getDisplayName();  String lang = "";
/* 17 */     String kind = (context instanceof PsiFile) ? "expression" : "code";
/* 18 */     return "Explain the following " + lang + " " + kind + ":";
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   protected String buildMessageFromPrompt(@NotNull Language language, @NotNull String code, @NotNull String prompt) {
/* 23 */     Intrinsics.checkNotNullParameter(language, "language"); Intrinsics.checkNotNullParameter(code, "code"); Intrinsics.checkNotNullParameter(prompt, "prompt"); return prompt + "\n```" + prompt + "\n" + language.getDisplayName() + "\n```";
/*    */   } @NotNull
/* 25 */   public String getText() { return LLMBundle.message("intentions.chat.explain.code.name", new Object[0]); }
/*    */   @NotNull
/* 27 */   public String getFamilyName() { return LLMBundle.message("intentions.chat.explain.code.family.name", new Object[0]); } @NotNull
/*    */   protected ChatCreationContext getChatCreationContext(@NotNull List extraItems, @Nullable PsiFile sourceFile) {
/* 29 */     Intrinsics.checkNotNullParameter(extraItems, "extraItems"); return new ChatCreationContext(
/* 30 */         (ChatOrigin)ChatOrigin.CustomIntention.INSTANCE, ChatSessionStorage.SourceAction.EXPLAIN_CODE_INTENTION, sourceFile, extraItems);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/chat/ExplainCodeChatIntention.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */