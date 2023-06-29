/*    */ package com.intellij.ml.llm.core.chat.context;
/*    */ 
/*    */ import com.intellij.ml.llm.core.chat.session.ChatCreationContext;
/*    */ import com.intellij.openapi.extensions.ExtensionPointName;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.util.concurrency.annotations.RequiresBackgroundThread;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\013\n\002\b\002\bf\030\000 \0162\0020\001:\001\016J'\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\0062\006\020\007\032\0020\bH§@ø\001\000¢\006\002\020\tJ$\020\n\032\b\022\004\022\0020\0040\0032\f\020\013\032\b\022\004\022\0020\0040\0032\006\020\007\032\0020\bH\026J\030\020\f\032\0020\r2\006\020\005\032\0020\0062\006\020\007\032\0020\bH'ø\001\001\002\n\n\002\b\031\n\004\b!0\001¨\006\017À\006\001"}, d2 = {"Lcom/intellij/ml/llm/core/chat/context/ChatContextProvider;", "", "collect", "", "Lcom/intellij/ml/llm/core/chat/context/ChatContextItem;", "project", "Lcom/intellij/openapi/project/Project;", "creationContext", "Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "filterItems", "items", "isApplicable", "", "Companion", "intellij.ml.llm"})
/*    */ public interface ChatContextProvider {
/*    */   @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   
/*    */   @NotNull
/* 20 */   default List<ChatContextItem> filterItems(@NotNull List<ChatContextItem> items, @NotNull ChatCreationContext creationContext) { Intrinsics.checkNotNullParameter(items, "items"); Intrinsics.checkNotNullParameter(creationContext, "creationContext"); return items; } @RequiresReadLock boolean isApplicable(@NotNull Project paramProject, @NotNull ChatCreationContext paramChatCreationContext); @RequiresBackgroundThread @Nullable
/*    */   Object collect(@NotNull Project paramProject, @NotNull ChatCreationContext paramChatCreationContext, @NotNull Continuation<? super List<ChatContextItem>> paramContinuation); @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\027\020\003\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/core/chat/context/ChatContextProvider$Companion;", "", "()V", "EP_NAME", "Lcom/intellij/openapi/extensions/ExtensionPointName;", "Lcom/intellij/ml/llm/core/chat/context/ChatContextProvider;", "getEP_NAME", "()Lcom/intellij/openapi/extensions/ExtensionPointName;", "intellij.ml.llm"})
/*    */   public static final class Companion { @NotNull
/* 23 */     private static final ExtensionPointName<ChatContextProvider> EP_NAME = new ExtensionPointName("com.intellij.chatContextProvider"); @NotNull public final ExtensionPointName<ChatContextProvider> getEP_NAME() { return EP_NAME; }
/*    */      }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/context/ChatContextProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */