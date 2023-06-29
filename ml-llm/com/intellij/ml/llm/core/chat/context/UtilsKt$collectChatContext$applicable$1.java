/*    */ package com.intellij.ml.llm.core.chat.context;
/*    */ 
/*    */ import com.intellij.ml.llm.core.chat.session.ChatCreationContext;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\013\n\002\b\002\020\000\032\0020\001H\n¢\006\004\b\002\020\003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"})
/*    */ final class UtilsKt$collectChatContext$applicable$1 extends Lambda implements Function0<Boolean> {
/*    */   @NotNull
/*    */   public final Boolean invoke() {
/* 14 */     return Boolean.valueOf(this.$chatContextProvider.isApplicable(this.$project, this.$creationContext));
/*    */   }
/*    */   
/*    */   UtilsKt$collectChatContext$applicable$1(ChatContextProvider $chatContextProvider, Project $project, ChatCreationContext $creationContext) {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/context/UtilsKt$collectChatContext$applicable$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */