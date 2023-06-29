/*    */ package com.intellij.ml.llm.runtimeErrorExplanation;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\003\n\002\020 \n\002\030\002\n\000\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\034\020\t\032\0020\b2\006\020\n\032\0020\b2\f\020\013\032\b\022\004\022\0020\r0\fR\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\007\032\0020\bX\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/runtimeErrorExplanation/PromptConstructor;", "", "maxLength", "", "tokenizer", "Lcom/intellij/ml/llm/core/tokenizer/Tokenizer;", "(ILcom/intellij/ml/llm/core/tokenizer/Tokenizer;)V", "promptTemplate", "", "makePrompt", "errorText", "errorPlaces", "", "Lcom/intellij/ml/llm/runtimeErrorExplanation/ErrorPlace;", "intellij.ml.llm"})
/*    */ public final class PromptConstructor {
/*    */   public PromptConstructor(int maxLength, @NotNull Tokenizer tokenizer) {
/*  6 */     this.maxLength = maxLength;
/*  7 */     this.tokenizer = tokenizer;
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
/* 35 */     this.promptTemplate = "As a helpful assistant with expertise in code debugging, your objective is to identify the roots of runtime problems by analyzing console logs and providing general solutions to fix the issues. When assisting users, follow these rules:\n\n1. Always be helpful and professional.\n2. Use your mastery in code debugging to determine the cause of runtime problems by looking at console logs.\n3. Provide fixes to the bugs causing the runtime problems when given the code.\n4. Ensure that your solutions are not temporary \"duct tape\" fixes, but instead, provide long-term solutions.\n5. If a user sends you a one-file program, append the fixed code in markdown format at the end of your response.\nThis code will be extracted using re.findall(r\"`{{3}}(\\w*)\\n([\\S\\s]+?)\\n`{{3}}\", model_response)\nso adhere to this formatting strictly.\n6. If you can fix the problem strictly by modifying the code, do so. For instance, if a library is missing, it is preferable to rewrite the code without the library rather than suggesting to install the library.\n7. Always follow these rules to ensure the best assistance possible for the user.\n\nNow, consider this user request:\n\n\"Please help me understand what the problem is and try to fix the code. Here's the console output and the program text:\n\nConsole output:\n```\n\"%s\"\n```\nTexts of programs:\n```\n\"%s\"\n```\nProvide a helpful response that addresses the user's concerns, adheres to the rules, and offers a solution for the runtime problem.";
/*    */   }
/*    */   private final int maxLength; @NotNull
/*    */   private final Tokenizer tokenizer; @NotNull
/*    */   private final String promptTemplate;
/*    */   @NotNull
/*    */   public final String makePrompt(@NotNull String errorText, @NotNull List errorPlaces) {
/* 42 */     Intrinsics.checkNotNullParameter(errorText, "errorText"); Intrinsics.checkNotNullParameter(errorPlaces, "errorPlaces"); String sourceCode = "";
/* 43 */     for (ErrorPlace errorPlace : errorPlaces) {
/* 44 */       if (errorPlace.isProjectFile()) {
/* 45 */         sourceCode = "filename: " + errorPlace.getFileName() + "\n\n" + errorPlace.getProgramText();
/*    */         break;
/*    */       } 
/*    */     } 
/* 49 */     int capacity = this.maxLength - this.promptTemplate.length() - 4;
/* 50 */     int maxLengthForPiece = capacity / 2;
/*    */     
/* 52 */     String sourceCodeTrimmed = this.tokenizer.trim(sourceCode, maxLengthForPiece);
/* 53 */     String errorTextTrimmed = this.tokenizer.trim(errorText, maxLengthForPiece);
/* 54 */     String str1 = this.promptTemplate; Object[] arrayOfObject = new Object[2]; arrayOfObject[0] = errorTextTrimmed; arrayOfObject[1] = sourceCodeTrimmed; arrayOfObject = arrayOfObject; Intrinsics.checkNotNullExpressionValue(String.format(str1, Arrays.copyOf(arrayOfObject, arrayOfObject.length)), "format(this, *args)"); return String.format(str1, Arrays.copyOf(arrayOfObject, arrayOfObject.length));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/runtimeErrorExplanation/PromptConstructor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */