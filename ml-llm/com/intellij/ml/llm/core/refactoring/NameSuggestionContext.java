/*    */ package com.intellij.ml.llm.core.refactoring;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\016\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B%\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\006\022\006\020\007\032\0020\003¢\006\002\020\bJ\t\020\017\032\0020\003HÆ\003J\t\020\020\032\0020\003HÆ\003J\t\020\021\032\0020\006HÆ\003J\t\020\022\032\0020\003HÆ\003J1\020\023\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\0062\b\b\002\020\007\032\0020\003HÆ\001J\023\020\024\032\0020\0252\b\020\026\032\004\030\0010\001HÖ\003J\t\020\027\032\0020\030HÖ\001J\t\020\031\032\0020\003HÖ\001R\021\020\007\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\013\020\fR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\r\020\nR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\016\020\n¨\006\032"}, d2 = {"Lcom/intellij/ml/llm/core/refactoring/NameSuggestionContext;", "", "placeholderName", "", "originalName", "objectType", "Lcom/intellij/ml/llm/core/refactoring/ObjectType;", "context", "(Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/core/refactoring/ObjectType;Ljava/lang/String;)V", "getContext", "()Ljava/lang/String;", "getObjectType", "()Lcom/intellij/ml/llm/core/refactoring/ObjectType;", "getOriginalName", "getPlaceholderName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "intellij.ml.llm"})
/*    */ public final class NameSuggestionContext
/*    */ {
/*    */   @NotNull
/*    */   private final String placeholderName;
/*    */   @NotNull
/*    */   private final String originalName;
/*    */   @NotNull
/*    */   private final ObjectType objectType;
/*    */   @NotNull
/*    */   private final String context;
/*    */   
/*    */   public NameSuggestionContext(@NotNull String placeholderName, @NotNull String originalName, @NotNull ObjectType objectType, @NotNull String context) {
/* 52 */     this.placeholderName = placeholderName;
/*    */ 
/*    */ 
/*    */     
/* 56 */     this.originalName = originalName;
/*    */ 
/*    */ 
/*    */     
/* 60 */     this.objectType = objectType;
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
/* 74 */     this.context = context; } @NotNull public final String getContext() { return this.context; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String getPlaceholderName() {
/*    */     return this.placeholderName;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getOriginalName() {
/*    */     return this.originalName;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ObjectType getObjectType() {
/*    */     return this.objectType;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.placeholderName;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.originalName;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ObjectType component3() {
/*    */     return this.objectType;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component4() {
/*    */     return this.context;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final NameSuggestionContext copy(@NotNull String placeholderName, @NotNull String originalName, @NotNull ObjectType objectType, @NotNull String context) {
/*    */     Intrinsics.checkNotNullParameter(placeholderName, "placeholderName");
/*    */     Intrinsics.checkNotNullParameter(originalName, "originalName");
/*    */     Intrinsics.checkNotNullParameter(objectType, "objectType");
/*    */     Intrinsics.checkNotNullParameter(context, "context");
/*    */     return new NameSuggestionContext(placeholderName, originalName, objectType, context);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "NameSuggestionContext(placeholderName=" + this.placeholderName + ", originalName=" + this.originalName + ", objectType=" + this.objectType + ", context=" + this.context + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.placeholderName.hashCode();
/*    */     result = result * 31 + this.originalName.hashCode();
/*    */     result = result * 31 + this.objectType.hashCode();
/*    */     return result * 31 + this.context.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof NameSuggestionContext))
/*    */       return false; 
/*    */     NameSuggestionContext nameSuggestionContext = (NameSuggestionContext)other;
/*    */     return !Intrinsics.areEqual(this.placeholderName, nameSuggestionContext.placeholderName) ? false : (!Intrinsics.areEqual(this.originalName, nameSuggestionContext.originalName) ? false : ((this.objectType != nameSuggestionContext.objectType) ? false : (!!Intrinsics.areEqual(this.context, nameSuggestionContext.context))));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/refactoring/NameSuggestionContext.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */