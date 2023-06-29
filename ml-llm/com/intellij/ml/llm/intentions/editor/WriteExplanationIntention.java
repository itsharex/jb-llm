/*    */ package com.intellij.ml.llm.intentions.editor;
/*    */ import com.intellij.codeInsight.intention.HighPriorityAction;
/*    */ import com.intellij.ml.llm.LLMBundle;
/*    */ import com.intellij.ml.llm.core.chat.context.ChatContextItem;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\005\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\000\030\0002\0020\0012\0020\002B\005¢\006\002\020\003J\030\020\n\032\b\022\004\022\0020\f0\0132\b\020\r\032\004\030\0010\016H\024J\b\020\017\032\0020\005H\026J$\020\020\032\0020\0212\006\020\022\032\0020\0232\b\020\024\032\004\030\0010\0252\b\020\026\032\004\030\0010\027H\026R\032\020\004\032\0020\005X\016¢\006\016\n\000\032\004\b\006\020\007\"\004\b\b\020\t¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/intentions/editor/WriteExplanationIntention;", "Lcom/intellij/ml/llm/intentions/chat/ExplainCodeChatIntention;", "Lcom/intellij/codeInsight/intention/HighPriorityAction;", "()V", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getContextItems", "", "Lcom/intellij/ml/llm/core/chat/context/ChatContextItem;", "elementToExplain", "Lcom/intellij/psi/PsiElement;", "getText", "isAvailable", "", "project", "Lcom/intellij/openapi/project/Project;", "editor", "Lcom/intellij/openapi/editor/Editor;", "file", "Lcom/intellij/psi/PsiFile;", "intellij.ml.llm"})
/*    */ public final class WriteExplanationIntention extends ExplainCodeChatIntention implements HighPriorityAction {
/*    */   @NotNull
/* 15 */   private String title = ""; @NotNull public final String getTitle() { return this.title; } public final void setTitle(@NotNull String <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.title = <set-?>; } @NotNull
/*    */   public String getText() {
/* 17 */     return this.title;
/*    */   }
/*    */   public boolean isAvailable(@NotNull Project project, @Nullable Editor editor, @Nullable PsiFile file) {
/* 20 */     Intrinsics.checkNotNullParameter(project, "project"); if (file != null && InjectedLanguageManager.getInstance(project).isInjectedFragment(file)) {
/* 21 */       Object[] arrayOfObject = new Object[1]; Intrinsics.checkNotNullExpressionValue(file.getLanguage().getDisplayName(), "file.language.displayName"); arrayOfObject[0] = file.getLanguage().getDisplayName(); this.title = LLMBundle.message("intentions.explain.fragment.name", arrayOfObject);
/* 22 */       return true;
/*    */     } 
/* 24 */     return false;
/*    */   }
/*    */   @NotNull
/*    */   protected List<ChatContextItem> getContextItems(@Nullable PsiElement elementToExplain) {
/* 28 */     return CollectionsKt.listOf(new ChatContextItem(Reflection.getOrCreateKotlinClass(WriteExplanationIntention.class), 
/* 29 */           "give only summary\ndo not repeat the expression in your answer\ndo not explain components\ndo not provide examples"));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/editor/WriteExplanationIntention.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */