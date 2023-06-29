/*   */ package com.intellij.ml.llm.runtimeErrorExplanation;
/*   */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\020\b\n\000\n\002\020\013\n\002\b\021\b\b\030\0002\0020\001B%\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b¢\006\002\020\tJ\t\020\020\032\0020\003HÆ\003J\t\020\021\032\0020\003HÆ\003J\t\020\022\032\0020\006HÆ\003J\t\020\023\032\0020\bHÆ\003J1\020\024\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\0062\b\b\002\020\007\032\0020\bHÆ\001J\023\020\025\032\0020\b2\b\020\026\032\004\030\0010\001HÖ\003J\t\020\027\032\0020\006HÖ\001J\t\020\030\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\n\020\013R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\007\020\fR\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\r\020\016R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\017\020\013¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/runtimeErrorExplanation/ErrorPlace;", "", "fileName", "", "programText", "lineNumber", "", "isProjectFile", "", "(Ljava/lang/String;Ljava/lang/String;IZ)V", "getFileName", "()Ljava/lang/String;", "()Z", "getLineNumber", "()I", "getProgramText", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "intellij.ml.llm"})
/*   */ public final class ErrorPlace { @NotNull
/*   */   private final String fileName; @NotNull
/* 5 */   private final String programText; public ErrorPlace(@NotNull String fileName, @NotNull String programText, int lineNumber, boolean isProjectFile) { this.fileName = fileName;
/* 6 */     this.programText = programText;
/* 7 */     this.lineNumber = lineNumber;
/* 8 */     this.isProjectFile = isProjectFile; } private final int lineNumber; private final boolean isProjectFile; @NotNull public final String getFileName() { return this.fileName; } public final boolean isProjectFile() { return this.isProjectFile; }
/*   */ 
/*   */   
/*   */   @NotNull
/*   */   public final String getProgramText() {
/*   */     return this.programText;
/*   */   }
/*   */   
/*   */   public final int getLineNumber() {
/*   */     return this.lineNumber;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final String component1() {
/*   */     return this.fileName;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final String component2() {
/*   */     return this.programText;
/*   */   }
/*   */   
/*   */   public final int component3() {
/*   */     return this.lineNumber;
/*   */   }
/*   */   
/*   */   public final boolean component4() {
/*   */     return this.isProjectFile;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final ErrorPlace copy(@NotNull String fileName, @NotNull String programText, int lineNumber, boolean isProjectFile) {
/*   */     Intrinsics.checkNotNullParameter(fileName, "fileName");
/*   */     Intrinsics.checkNotNullParameter(programText, "programText");
/*   */     return new ErrorPlace(fileName, programText, lineNumber, isProjectFile);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public String toString() {
/*   */     return "ErrorPlace(fileName=" + this.fileName + ", programText=" + this.programText + ", lineNumber=" + this.lineNumber + ", isProjectFile=" + this.isProjectFile + ")";
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     result = this.fileName.hashCode();
/*   */     result = result * 31 + this.programText.hashCode();
/*   */     result = result * 31 + Integer.hashCode(this.lineNumber);
/*   */     if (this.isProjectFile);
/*   */     return result * 31 + 1;
/*   */   }
/*   */   
/*   */   public boolean equals(@Nullable Object other) {
/*   */     if (this == other)
/*   */       return true; 
/*   */     if (!(other instanceof ErrorPlace))
/*   */       return false; 
/*   */     ErrorPlace errorPlace = (ErrorPlace)other;
/*   */     return !Intrinsics.areEqual(this.fileName, errorPlace.fileName) ? false : (!Intrinsics.areEqual(this.programText, errorPlace.programText) ? false : ((this.lineNumber != errorPlace.lineNumber) ? false : (!(this.isProjectFile != errorPlace.isProjectFile))));
/*   */   } }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/runtimeErrorExplanation/ErrorPlace.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */