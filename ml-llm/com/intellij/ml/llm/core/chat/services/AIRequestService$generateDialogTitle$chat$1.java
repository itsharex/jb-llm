/*    */ package com.intellij.ml.llm.core.chat.services;
/*    */ 
/*    */ import ai.grazie.model.llm.chat.LLMChat;
/*    */ import ai.grazie.model.llm.chat.LLMChatRole;
/*    */ import com.intellij.ml.llm.core.chat.messages.CompletableMessage;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/llm/chat/LLMChat$Builder;", "invoke"})
/*    */ @SourceDebugExtension({"SMAP\nAIRequestService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIRequestService.kt\ncom/intellij/ml/llm/core/chat/services/AIRequestService$generateDialogTitle$chat$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,56:1\n1855#2,2:57\n*S KotlinDebug\n*F\n+ 1 AIRequestService.kt\ncom/intellij/ml/llm/core/chat/services/AIRequestService$generateDialogTitle$chat$1\n*L\n36#1:57,2\n*E\n"})
/*    */ final class AIRequestService$generateDialogTitle$chat$1
/*    */   extends Lambda
/*    */   implements Function1<LLMChat.Builder, Unit>
/*    */ {
/*    */   public final void invoke(@NotNull LLMChat.Builder $this$build) {
/* 36 */     Intrinsics.checkNotNullParameter($this$build, "$this$build"); List list = AIRequestService.access$getFilteredMessages(AIRequestService.this, this.$messages, 2); AIRequestService aIRequestService = AIRequestService.this; int $i$f$forEach = 0;
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
/* 57 */     Iterator iterator = list.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); CompletableMessage it = (CompletableMessage)element$iv; int $i$a$-forEach-AIRequestService$generateDialogTitle$chat$1$1 = 0;
/*    */       $this$build.message(AIRequestService.access$toLLMChatRole(aIRequestService, it.getAuthor()), it.getText()); }
/*    */     
/*    */     $this$build.message(LLMChatRole.User, this.$prompt);
/*    */   }
/*    */   
/*    */   AIRequestService$generateDialogTitle$chat$1(List<CompletableMessage> $messages, String $prompt) {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/services/AIRequestService$generateDialogTitle$chat$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */