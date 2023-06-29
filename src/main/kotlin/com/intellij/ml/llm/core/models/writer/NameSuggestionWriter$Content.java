/*    */ package com.intellij.ml.llm.core.models.writer;
/*    */ 
/*    */ import kotlin.Metadata;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\022\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B/\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003\022\b\020\007\032\004\030\0010\003¢\006\002\020\bJ\t\020\017\032\0020\003HÆ\003J\t\020\020\032\0020\003HÆ\003J\t\020\021\032\0020\003HÆ\003J\t\020\022\032\0020\003HÆ\003J\013\020\023\032\004\030\0010\003HÆ\003J=\020\024\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\0032\b\b\002\020\006\032\0020\0032\n\b\002\020\007\032\004\030\0010\003HÆ\001J\023\020\025\032\0020\0262\b\020\027\032\004\030\0010\001HÖ\003J\t\020\030\032\0020\031HÖ\001J\t\020\032\032\0020\003HÖ\001R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\013\020\nR\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\f\020\nR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\r\020\nR\023\020\007\032\004\030\0010\003¢\006\b\n\000\032\004\b\016\020\n¨\006\033"}, d2 = {"Lcom/intellij/ml/llm/core/models/writer/NameSuggestionWriter$Content;", "", "oldName", "", "contextPrompt", "objectType", "objectToRename", "prefix", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContextPrompt", "()Ljava/lang/String;", "getObjectToRename", "getObjectType", "getOldName", "getPrefix", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "intellij.ml.llm"})
/*    */ final class Content
/*    */ {
/*    */   @NotNull
/*    */   private final String oldName;
/*    */   @NotNull
/*    */   private final String contextPrompt;
/*    */   @NotNull
/*    */   private final String objectType;
/*    */   @NotNull
/*    */   private final String objectToRename;
/*    */   @Nullable
/*    */   private final String prefix;
/*    */   
/*    */   public Content(@NotNull String oldName, @NotNull String contextPrompt, @NotNull String objectType, @NotNull String objectToRename, @Nullable String prefix) {
/* 61 */     this.oldName = oldName;
/* 62 */     this.contextPrompt = contextPrompt;
/* 63 */     this.objectType = objectType;
/* 64 */     this.objectToRename = objectToRename;
/* 65 */     this.prefix = prefix; } @Nullable public final String getPrefix() { return this.prefix; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String getOldName() {
/*    */     return this.oldName;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getContextPrompt() {
/*    */     return this.contextPrompt;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getObjectType() {
/*    */     return this.objectType;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getObjectToRename() {
/*    */     return this.objectToRename;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.oldName;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.contextPrompt;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component3() {
/*    */     return this.objectType;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component4() {
/*    */     return this.objectToRename;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component5() {
/*    */     return this.prefix;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Content copy(@NotNull String oldName, @NotNull String contextPrompt, @NotNull String objectType, @NotNull String objectToRename, @Nullable String prefix) {
/*    */     Intrinsics.checkNotNullParameter(oldName, "oldName");
/*    */     Intrinsics.checkNotNullParameter(contextPrompt, "contextPrompt");
/*    */     Intrinsics.checkNotNullParameter(objectType, "objectType");
/*    */     Intrinsics.checkNotNullParameter(objectToRename, "objectToRename");
/*    */     return new Content(oldName, contextPrompt, objectType, objectToRename, prefix);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Content(oldName=" + this.oldName + ", contextPrompt=" + this.contextPrompt + ", objectType=" + this.objectType + ", objectToRename=" + this.objectToRename + ", prefix=" + this.prefix + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.oldName.hashCode();
/*    */     result = result * 31 + this.contextPrompt.hashCode();
/*    */     result = result * 31 + this.objectType.hashCode();
/*    */     result = result * 31 + this.objectToRename.hashCode();
/*    */     return result * 31 + ((this.prefix == null) ? 0 : this.prefix.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Content))
/*    */       return false; 
/*    */     Content content = (Content)other;
/*    */     return !Intrinsics.areEqual(this.oldName, content.oldName) ? false : (!Intrinsics.areEqual(this.contextPrompt, content.contextPrompt) ? false : (!Intrinsics.areEqual(this.objectType, content.objectType) ? false : (!Intrinsics.areEqual(this.objectToRename, content.objectToRename) ? false : (!!Intrinsics.areEqual(this.prefix, content.prefix)))));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/writer/NameSuggestionWriter$Content.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */