/*   */ package com.intellij.ml.llm.cicd.gen.prompts;@Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\004\030\0002\0020\001B\017\022\b\b\002\020\002\032\0020\003¢\006\002\020\004J\016\020\b\032\0020\0032\006\020\t\032\0020\003R\016\020\005\032\0020\006X\004¢\006\002\n\000R\016\020\007\032\0020\003X\004¢\006\002\n\000¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/cicd/gen/prompts/PromptsLoader;", "", "prefix", "", "(Ljava/lang/String;)V", "classLoader", "Ljava/lang/ClassLoader;", "defaultPrefix", "getPrompt", "path", "intellij.ml.llm"})
/*   */ public final class PromptsLoader {
/*   */   public PromptsLoader(@NotNull String prefix) {
/* 4 */     Intrinsics.checkNotNullExpressionValue(getClass().getClassLoader(), "this::class.java.classLoader"); this.classLoader = getClass().getClassLoader();
/*   */ 
/*   */ 
/*   */     
/* 8 */     char[] arrayOfChar = new char[1]; arrayOfChar[0] = '/'; this.defaultPrefix = StringsKt.trimEnd(prefix, arrayOfChar);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   private final ClassLoader classLoader;
/*   */   @NotNull
/*   */   private final String defaultPrefix;
/*   */   
/*   */   @NotNull
/*   */   public final String getPrompt(@NotNull String path) {
/*   */     // Byte code:
/*   */     //   0: aload_1
/*   */     //   1: ldc 'path'
/*   */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*   */     //   6: aload_0
/*   */     //   7: getfield classLoader : Ljava/lang/ClassLoader;
/*   */     //   10: aload_0
/*   */     //   11: getfield defaultPrefix : Ljava/lang/String;
/*   */     //   14: aload_1
/*   */     //   15: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*   */     //   20: invokevirtual getResource : (Ljava/lang/String;)Ljava/net/URL;
/*   */     //   23: dup
/*   */     //   24: ifnull -> 51
/*   */     //   27: astore_2
/*   */     //   28: getstatic kotlin/text/Charsets.UTF_8 : Ljava/nio/charset/Charset;
/*   */     //   31: astore_3
/*   */     //   32: aload_2
/*   */     //   33: invokestatic readBytes : (Ljava/net/URL;)[B
/*   */     //   36: astore #4
/*   */     //   38: new java/lang/String
/*   */     //   41: dup
/*   */     //   42: aload #4
/*   */     //   44: aload_3
/*   */     //   45: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
/*   */     //   48: goto -> 66
/*   */     //   51: pop
/*   */     //   52: new com/intellij/ml/llm/cicd/gen/prompts/PromptNotFoundError
/*   */     //   55: dup
/*   */     //   56: aload_1
/*   */     //   57: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*   */     //   62: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   65: athrow
/*   */     //   66: areturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #12	-> 6
/*   */     //   #12	-> 48
/*   */     //   #13	-> 52
/*   */     //   #12	-> 66
/*   */     // Local variable table:
/*   */     //   start	length	slot	name	descriptor
/*   */     //   0	67	0	this	Lcom/intellij/ml/llm/cicd/gen/prompts/PromptsLoader;
/*   */     //   0	67	1	path	Ljava/lang/String;
/*   */   }
/*   */   
/*   */   public PromptsLoader() {
/*   */     this(null, 1, null);
/*   */   }
/*   */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/cicd/gen/prompts/PromptsLoader.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */