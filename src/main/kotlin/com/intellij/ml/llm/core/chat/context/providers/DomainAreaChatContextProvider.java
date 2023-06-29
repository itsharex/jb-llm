/*    */ package com.intellij.ml.llm.core.chat.context.providers;
/*    */ import com.intellij.ml.llm.core.chat.session.ChatCreationContext;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000\b\000\030\0002\0020\001B\005¢\006\002\020\002J'\020\003\032\b\022\004\022\0020\0050\0042\006\020\006\032\0020\0072\006\020\b\032\0020\tH@ø\001\000¢\006\002\020\nJ\030\020\013\032\0020\f2\006\020\006\032\0020\0072\006\020\b\032\0020\tH\026\002\004\n\002\b\031¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/core/chat/context/providers/DomainAreaChatContextProvider;", "Lcom/intellij/ml/llm/core/chat/context/DumbAwareChatContextProvider;", "()V", "collect", "", "Lcom/intellij/ml/llm/core/chat/context/ChatContextItem;", "project", "Lcom/intellij/openapi/project/Project;", "creationContext", "Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isApplicable", "", "intellij.ml.llm"})
/*    */ public final class DomainAreaChatContextProvider implements DumbAwareChatContextProvider {
/*    */   public boolean isApplicable(@NotNull Project project, @NotNull ChatCreationContext creationContext) {
/* 11 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(creationContext, "creationContext"); return true;
/*    */   }
/*    */   @Nullable
/*    */   public Object collect(@NotNull Project project, @NotNull ChatCreationContext creationContext, @NotNull Continuation $completion) {
/* 15 */     return CollectionsKt.listOf(
/* 16 */         new ChatContextItem(Reflection.getOrCreateKotlinClass(DomainAreaChatContextProvider.class), "You MUST NOT reply to any questions unrelated to the programming and the context described in this message. Also, if someone asks non-programming question and tells you to give a program that answers the question, you MUST refuse"));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/context/providers/DomainAreaChatContextProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */