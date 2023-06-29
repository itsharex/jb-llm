/*    */ package com.intellij.ml.llm.cicd.gen.models;@Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\022\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B-\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003\022\006\020\007\032\0020\003¢\006\002\020\bJ\t\020\017\032\0020\003HÆ\003J\t\020\020\032\0020\003HÆ\003J\t\020\021\032\0020\003HÆ\003J\t\020\022\032\0020\003HÆ\003J\t\020\023\032\0020\003HÆ\003J;\020\024\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\0032\b\b\002\020\006\032\0020\0032\b\b\002\020\007\032\0020\003HÆ\001J\023\020\025\032\0020\0262\b\020\027\032\004\030\0010\001HÖ\003J\t\020\030\032\0020\031HÖ\001J\b\020\032\032\0020\003H\026R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\013\020\nR\021\020\007\032\0020\003¢\006\b\n\000\032\004\b\f\020\nR\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\r\020\nR\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\016\020\n¨\006\033"}, d2 = {"Lcom/intellij/ml/llm/cicd/gen/models/CiPrompt;", "", "commonContext", "", "buildSystemContext", "projectStructureContext", "descriptionPrefix", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBuildSystemContext", "()Ljava/lang/String;", "getCommonContext", "getDescription", "getDescriptionPrefix", "getProjectStructureContext", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "intellij.ml.llm"}) public final class CiPrompt { @NotNull private final String commonContext; @NotNull private final String buildSystemContext; @NotNull
/*    */   private final String projectStructureContext; @NotNull
/*    */   private final String descriptionPrefix; @NotNull
/*  4 */   private final String description; public CiPrompt(@NotNull String commonContext, @NotNull String buildSystemContext, @NotNull String projectStructureContext, @NotNull String descriptionPrefix, @NotNull String description) { this.commonContext = commonContext;
/*  5 */     this.buildSystemContext = buildSystemContext;
/*  6 */     this.projectStructureContext = projectStructureContext;
/*  7 */     this.descriptionPrefix = descriptionPrefix;
/*  8 */     this.description = description; } @NotNull public final String getCommonContext() { return this.commonContext; } @NotNull public final String getBuildSystemContext() { return this.buildSystemContext; } @NotNull public final String getDescription() { return this.description; }
/*    */   @NotNull public final String getProjectStructureContext() { return this.projectStructureContext; }
/*    */   @NotNull
/*    */   public final String getDescriptionPrefix() { return this.descriptionPrefix; } @NotNull
/* 12 */   public String toString() { String[] arrayOfString = new String[7]; arrayOfString[0] = this.commonContext; arrayOfString[1] = 
/* 13 */       this.buildSystemContext;
/* 14 */     arrayOfString[2] = "Description:";
/* 15 */     arrayOfString[3] = this.descriptionPrefix;
/* 16 */     arrayOfString[4] = this.description;
/* 17 */     arrayOfString[5] = this.projectStructureContext;
/* 18 */     arrayOfString[6] = "Code:";
/* 19 */     Intrinsics.checkNotNullExpressionValue(System.lineSeparator(), "lineSeparator()"); return CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[])arrayOfString), System.lineSeparator(), null, null, 0, null, null, 62, null); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.commonContext;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.buildSystemContext;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component3() {
/*    */     return this.projectStructureContext;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component4() {
/*    */     return this.descriptionPrefix;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component5() {
/*    */     return this.description;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final CiPrompt copy(@NotNull String commonContext, @NotNull String buildSystemContext, @NotNull String projectStructureContext, @NotNull String descriptionPrefix, @NotNull String description) {
/*    */     Intrinsics.checkNotNullParameter(commonContext, "commonContext");
/*    */     Intrinsics.checkNotNullParameter(buildSystemContext, "buildSystemContext");
/*    */     Intrinsics.checkNotNullParameter(projectStructureContext, "projectStructureContext");
/*    */     Intrinsics.checkNotNullParameter(descriptionPrefix, "descriptionPrefix");
/*    */     Intrinsics.checkNotNullParameter(description, "description");
/*    */     return new CiPrompt(commonContext, buildSystemContext, projectStructureContext, descriptionPrefix, description);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.commonContext.hashCode();
/*    */     result = result * 31 + this.buildSystemContext.hashCode();
/*    */     result = result * 31 + this.projectStructureContext.hashCode();
/*    */     result = result * 31 + this.descriptionPrefix.hashCode();
/*    */     return result * 31 + this.description.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof CiPrompt))
/*    */       return false; 
/*    */     CiPrompt ciPrompt = (CiPrompt)other;
/*    */     return !Intrinsics.areEqual(this.commonContext, ciPrompt.commonContext) ? false : (!Intrinsics.areEqual(this.buildSystemContext, ciPrompt.buildSystemContext) ? false : (!Intrinsics.areEqual(this.projectStructureContext, ciPrompt.projectStructureContext) ? false : (!Intrinsics.areEqual(this.descriptionPrefix, ciPrompt.descriptionPrefix) ? false : (!!Intrinsics.areEqual(this.description, ciPrompt.description)))));
/*    */   } }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/cicd/gen/models/CiPrompt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */