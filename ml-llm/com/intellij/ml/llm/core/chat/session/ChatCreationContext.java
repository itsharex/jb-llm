/*    */ package com.intellij.ml.llm.core.chat.session;
/*    */ 
/*    */ import com.intellij.ml.llm.core.chat.context.ChatContextItem;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\017\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B1\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\n\b\002\020\006\032\004\030\0010\007\022\016\b\002\020\b\032\b\022\004\022\0020\n0\t¢\006\002\020\013J\t\020\024\032\0020\003HÆ\003J\t\020\025\032\0020\005HÆ\003J\013\020\026\032\004\030\0010\007HÆ\003J\017\020\027\032\b\022\004\022\0020\n0\tHÆ\003J9\020\030\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\0072\016\b\002\020\b\032\b\022\004\022\0020\n0\tHÆ\001J\023\020\031\032\0020\0322\b\020\033\032\004\030\0010\001HÖ\003J\t\020\034\032\0020\035HÖ\001J\t\020\036\032\0020\037HÖ\001R\027\020\b\032\b\022\004\022\0020\n0\t¢\006\b\n\000\032\004\b\f\020\rR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\016\020\017R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\020\020\021R\023\020\006\032\004\030\0010\007¢\006\b\n\000\032\004\b\022\020\023¨\006 "}, d2 = {"Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;", "", "origin", "Lcom/intellij/ml/llm/core/chat/session/ChatOrigin;", "sourceActionForStatistic", "Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$SourceAction;", "sourceFile", "Lcom/intellij/psi/PsiFile;", "extraItems", "", "Lcom/intellij/ml/llm/core/chat/context/ChatContextItem;", "(Lcom/intellij/ml/llm/core/chat/session/ChatOrigin;Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$SourceAction;Lcom/intellij/psi/PsiFile;Ljava/util/List;)V", "getExtraItems", "()Ljava/util/List;", "getOrigin", "()Lcom/intellij/ml/llm/core/chat/session/ChatOrigin;", "getSourceActionForStatistic", "()Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$SourceAction;", "getSourceFile", "()Lcom/intellij/psi/PsiFile;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "intellij.ml.llm"})
/*    */ public final class ChatCreationContext
/*    */ {
/*    */   @NotNull
/*    */   private final ChatOrigin origin;
/*    */   @NotNull
/*    */   private final ChatSessionStorage.SourceAction sourceActionForStatistic;
/*    */   @Nullable
/*    */   private final PsiFile sourceFile;
/*    */   @NotNull
/*    */   private final List<ChatContextItem> extraItems;
/*    */   
/*    */   public ChatCreationContext(@NotNull ChatOrigin origin, @NotNull ChatSessionStorage.SourceAction sourceActionForStatistic, @Nullable PsiFile sourceFile, @NotNull List<ChatContextItem> extraItems) {
/* 58 */     this.origin = origin;
/* 59 */     this.sourceActionForStatistic = sourceActionForStatistic;
/* 60 */     this.sourceFile = sourceFile;
/* 61 */     this.extraItems = extraItems; } @NotNull public final List<ChatContextItem> getExtraItems() { return this.extraItems; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final ChatOrigin getOrigin() {
/*    */     return this.origin;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ChatSessionStorage.SourceAction getSourceActionForStatistic() {
/*    */     return this.sourceActionForStatistic;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final PsiFile getSourceFile() {
/*    */     return this.sourceFile;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ChatOrigin component1() {
/*    */     return this.origin;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ChatSessionStorage.SourceAction component2() {
/*    */     return this.sourceActionForStatistic;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final PsiFile component3() {
/*    */     return this.sourceFile;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<ChatContextItem> component4() {
/*    */     return this.extraItems;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ChatCreationContext copy(@NotNull ChatOrigin origin, @NotNull ChatSessionStorage.SourceAction sourceActionForStatistic, @Nullable PsiFile sourceFile, @NotNull List<ChatContextItem> extraItems) {
/*    */     Intrinsics.checkNotNullParameter(origin, "origin");
/*    */     Intrinsics.checkNotNullParameter(sourceActionForStatistic, "sourceActionForStatistic");
/*    */     Intrinsics.checkNotNullParameter(extraItems, "extraItems");
/*    */     return new ChatCreationContext(origin, sourceActionForStatistic, sourceFile, extraItems);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ChatCreationContext(origin=" + this.origin + ", sourceActionForStatistic=" + this.sourceActionForStatistic + ", sourceFile=" + this.sourceFile + ", extraItems=" + this.extraItems + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.origin.hashCode();
/*    */     result = result * 31 + this.sourceActionForStatistic.hashCode();
/*    */     result = result * 31 + ((this.sourceFile == null) ? 0 : this.sourceFile.hashCode());
/*    */     return result * 31 + this.extraItems.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ChatCreationContext))
/*    */       return false; 
/*    */     ChatCreationContext chatCreationContext = (ChatCreationContext)other;
/*    */     return !Intrinsics.areEqual(this.origin, chatCreationContext.origin) ? false : ((this.sourceActionForStatistic != chatCreationContext.sourceActionForStatistic) ? false : (!Intrinsics.areEqual(this.sourceFile, chatCreationContext.sourceFile) ? false : (!!Intrinsics.areEqual(this.extraItems, chatCreationContext.extraItems))));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/session/ChatCreationContext.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */