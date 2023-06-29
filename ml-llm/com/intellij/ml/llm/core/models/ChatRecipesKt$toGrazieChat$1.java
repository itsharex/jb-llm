/*    */ package com.intellij.ml.llm.core.models;
/*    */ 
/*    */ import ai.grazie.model.llm.chat.LLMChat;
/*    */ import ai.grazie.model.llm.chat.LLMChatRole;
/*    */ import com.intellij.ml.llm.core.models.openai.OpenAiChatMessage;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/llm/chat/LLMChat$Builder;", "invoke"})
/*    */ @SourceDebugExtension({"SMAP\nChatRecipes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatRecipes.kt\ncom/intellij/ml/llm/core/models/ChatRecipesKt$toGrazieChat$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1855#2,2:37\n*S KotlinDebug\n*F\n+ 1 ChatRecipes.kt\ncom/intellij/ml/llm/core/models/ChatRecipesKt$toGrazieChat$1\n*L\n31#1:37,2\n*E\n"})
/*    */ final class ChatRecipesKt$toGrazieChat$1
/*    */   extends Lambda
/*    */   implements Function1<LLMChat.Builder, Unit>
/*    */ {
/*    */   public final void invoke(@NotNull LLMChat.Builder $this$build) {
/* 31 */     Intrinsics.checkNotNullParameter($this$build, "$this$build"); Iterable<OpenAiChatMessage> $this$forEach$iv = this.$messages; int $i$f$forEach = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 37 */     Iterator<OpenAiChatMessage> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); OpenAiChatMessage message = (OpenAiChatMessage)element$iv; int $i$a$-forEach-ChatRecipesKt$toGrazieChat$1$1 = 0;
/*    */       $this$build.message(LLMChatRole.valueOf(StringsKt.capitalize(message.getRole())), message.getContent()); }
/*    */   
/*    */   }
/*    */   
/*    */   ChatRecipesKt$toGrazieChat$1(List<OpenAiChatMessage> $messages) {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/ChatRecipesKt$toGrazieChat$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */