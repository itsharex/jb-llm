/*    */ package ai.grazie.model.llm.bdg.chat;
/*    */ 
/*    */ import ai.grazie.model.llm.chat.LLMChat;
/*    */ import ai.grazie.model.llm.chat.LLMChatMessage;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\020\b\n\000\n\002\030\002\n\002\b\b\n\002\020\013\n\002\b\003\n\002\020\016\n\000\b\b\030\0002\0020\001B-\022\022\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003\022\022\020\006\032\016\022\004\022\0020\007\022\004\022\0020\0050\003¢\006\002\020\bJ\025\020\f\032\016\022\004\022\0020\004\022\004\022\0020\0050\003HÆ\003J\025\020\r\032\016\022\004\022\0020\007\022\004\022\0020\0050\003HÆ\003J5\020\016\032\0020\0002\024\b\002\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\0032\024\b\002\020\006\032\016\022\004\022\0020\007\022\004\022\0020\0050\003HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\005HÖ\001J\t\020\023\032\0020\024HÖ\001R\035\020\006\032\016\022\004\022\0020\007\022\004\022\0020\0050\003¢\006\b\n\000\032\004\b\t\020\nR\035\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003¢\006\b\n\000\032\004\b\013\020\n¨\006\025"}, d2 = {"Lai/grazie/model/llm/bdg/chat/LLMChatBudgetEstimator$Adjuster;", "", "message", "Lkotlin/Function1;", "Lai/grazie/model/llm/chat/LLMChatMessage;", "", "chat", "Lai/grazie/model/llm/chat/LLMChat;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getChat", "()Lkotlin/jvm/functions/Function1;", "getMessage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "model-llm"})
/*    */ public final class Adjuster
/*    */ {
/*    */   @NotNull
/*    */   private final Function1<LLMChatMessage, Integer> message;
/*    */   @NotNull
/*    */   private final Function1<LLMChat, Integer> chat;
/*    */   
/*    */   public Adjuster(@NotNull Function1<LLMChatMessage, Integer> message, @NotNull Function1<LLMChat, Integer> chat) {
/* 22 */     this.message = message; this.chat = chat; } @NotNull public final Function1<LLMChatMessage, Integer> getMessage() { return this.message; } @NotNull public final Function1<LLMChat, Integer> getChat() { return this.chat; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final Function1<LLMChatMessage, Integer> component1() {
/*    */     return this.message;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Function1<LLMChat, Integer> component2() {
/*    */     return this.chat;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Adjuster copy(@NotNull Function1<? super LLMChatMessage, Integer> message, @NotNull Function1<? super LLMChat, Integer> chat) {
/*    */     Intrinsics.checkNotNullParameter(message, "message");
/*    */     Intrinsics.checkNotNullParameter(chat, "chat");
/*    */     return new Adjuster(message, chat);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Adjuster(message=" + this.message + ", chat=" + this.chat + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.message.hashCode();
/*    */     return result * 31 + this.chat.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Adjuster))
/*    */       return false; 
/*    */     Adjuster adjuster = (Adjuster)other;
/*    */     return !Intrinsics.areEqual(this.message, adjuster.message) ? false : (!!Intrinsics.areEqual(this.chat, adjuster.chat));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/llm/bdg/chat/LLMChatBudgetEstimator$Adjuster.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */