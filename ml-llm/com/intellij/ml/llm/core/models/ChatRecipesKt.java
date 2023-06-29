/*    */ package com.intellij.ml.llm.core.models;
/*    */ import ai.grazie.model.llm.chat.LLMChat;
/*    */ import com.intellij.ml.llm.core.models.openai.OpenAiChatMessage;
/*    */ import java.util.List;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\034\n\000\n\002\020\016\n\000\n\002\020 \n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\002\032\024\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\001\032\034\020\006\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\0012\006\020\007\032\0020\001\032\034\020\b\032\b\022\004\022\0020\0040\0032\006\020\t\032\0020\0012\006\020\n\032\0020\001\032\024\020\013\032\0020\f2\f\020\r\032\b\022\004\022\0020\0040\003\"\016\020\000\032\0020\001XT¢\006\002\n\000¨\006\016"}, d2 = {"ERROR_TAG", "", "customCompletionChat", "", "Lcom/intellij/ml/llm/core/models/openai/OpenAiChatMessage;", "input", "customEditChat", "instruction", "customRenameChat", "contextPrompt", "systemPrompt", "toGrazieChat", "Lai/grazie/model/llm/chat/LLMChat;", "messages", "intellij.ml.llm"})
/*    */ public final class ChatRecipesKt {
/*    */   @NotNull
/*    */   public static final List<OpenAiChatMessage> customEditChat(@NotNull String input, @NotNull String instruction) {
/* 13 */     Intrinsics.checkNotNullParameter(input, "input"); Intrinsics.checkNotNullParameter(instruction, "instruction"); OpenAiChatMessage[] arrayOfOpenAiChatMessage = new OpenAiChatMessage[2]; arrayOfOpenAiChatMessage[0] = new OpenAiChatMessage("user", input); arrayOfOpenAiChatMessage[1] = new OpenAiChatMessage("system", "You are a software developer. Reply only with code according to that instruction: " + 
/* 14 */         instruction);
/*    */     return CollectionsKt.listOf((Object[])arrayOfOpenAiChatMessage);
/*    */   } @NotNull
/*    */   public static final String ERROR_TAG = "<ERROR>"; @NotNull
/*    */   public static final List<OpenAiChatMessage> customCompletionChat(@NotNull String input) {
/* 19 */     Intrinsics.checkNotNullParameter(input, "input"); OpenAiChatMessage[] arrayOfOpenAiChatMessage = new OpenAiChatMessage[2]; arrayOfOpenAiChatMessage[0] = new OpenAiChatMessage("system", "You are a software developer. Reply only with code"); arrayOfOpenAiChatMessage[1] = 
/* 20 */       new OpenAiChatMessage("user", input);
/*    */     return CollectionsKt.listOf((Object[])arrayOfOpenAiChatMessage);
/*    */   }
/*    */   @NotNull
/*    */   public static final List<OpenAiChatMessage> customRenameChat(@NotNull String contextPrompt, @NotNull String systemPrompt) {
/* 25 */     Intrinsics.checkNotNullParameter(contextPrompt, "contextPrompt"); Intrinsics.checkNotNullParameter(systemPrompt, "systemPrompt"); OpenAiChatMessage[] arrayOfOpenAiChatMessage = new OpenAiChatMessage[2]; arrayOfOpenAiChatMessage[0] = new OpenAiChatMessage("system", systemPrompt); arrayOfOpenAiChatMessage[1] = 
/* 26 */       new OpenAiChatMessage("user", contextPrompt);
/*    */     return CollectionsKt.listOf((Object[])arrayOfOpenAiChatMessage);
/*    */   }
/*    */   @NotNull
/* 30 */   public static final LLMChat toGrazieChat(@NotNull List<OpenAiChatMessage> messages) { Intrinsics.checkNotNullParameter(messages, "messages"); return LLMChat.Companion.build(new ChatRecipesKt$toGrazieChat$1(messages)); } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/llm/chat/LLMChat$Builder;", "invoke"}) @SourceDebugExtension({"SMAP\nChatRecipes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatRecipes.kt\ncom/intellij/ml/llm/core/models/ChatRecipesKt$toGrazieChat$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1855#2,2:37\n*S KotlinDebug\n*F\n+ 1 ChatRecipes.kt\ncom/intellij/ml/llm/core/models/ChatRecipesKt$toGrazieChat$1\n*L\n31#1:37,2\n*E\n"})
/* 31 */   static final class ChatRecipesKt$toGrazieChat$1 extends Lambda implements Function1<LLMChat.Builder, Unit> { public final void invoke(@NotNull LLMChat.Builder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); Iterable<OpenAiChatMessage> $this$forEach$iv = this.$messages; int $i$f$forEach = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 37 */       Iterator<OpenAiChatMessage> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); OpenAiChatMessage message = (OpenAiChatMessage)element$iv; int $i$a$-forEach-ChatRecipesKt$toGrazieChat$1$1 = 0;
/*    */         $this$build.message(LLMChatRole.valueOf(StringsKt.capitalize(message.getRole())), message.getContent()); }
/*    */        }
/*    */ 
/*    */     
/*    */     ChatRecipesKt$toGrazieChat$1(List<OpenAiChatMessage> $messages) {
/*    */       super(1);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/ChatRecipesKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */