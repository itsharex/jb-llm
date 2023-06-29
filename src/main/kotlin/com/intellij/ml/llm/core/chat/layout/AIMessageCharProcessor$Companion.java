/*   */ package com.intellij.ml.llm.core.chat.layout;
/*   */ import com.intellij.openapi.extensions.ExtensionPointName;
/*   */ import org.jetbrains.annotations.NotNull;
/*   */ 
/*   */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J \020\006\032\004\030\0010\0072\006\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\rR\024\020\003\032\b\022\004\022\0020\0050\004X\004¢\006\002\n\000¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor$Companion;", "", "()V", "EP", "Lcom/intellij/openapi/extensions/ExtensionPointName;", "Lcom/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor;", "suggestTypeChange", "Lcom/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor$ContextChange;", "parameters", "Lcom/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor$Parameters;", "currentContextType", "Lcom/intellij/ml/llm/core/chat/parts/MessagePart$Type;", "blockStart", "", "intellij.ml.llm"})
/*   */ public final class Companion {
/*   */   @NotNull
/* 8 */   private static final ExtensionPointName<AIMessageCharProcessor> EP = new ExtensionPointName("com.intellij.assistantMessageLayouter");
/*   */   
/*   */   @Nullable
/*   */   public final AIMessageCharProcessor.ContextChange suggestTypeChange(@NotNull AIMessageCharProcessor.Parameters parameters, @NotNull MessagePart.Type currentContextType, int blockStart) {
/*   */     // Byte code:
/*   */     //   0: aload_1
/*   */     //   1: ldc 'parameters'
/*   */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*   */     //   6: aload_2
/*   */     //   7: ldc 'currentContextType'
/*   */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*   */     //   12: getstatic com/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor$Companion.EP : Lcom/intellij/openapi/extensions/ExtensionPointName;
/*   */     //   15: invokevirtual getExtensions : ()[Ljava/lang/Object;
/*   */     //   18: astore #4
/*   */     //   20: iconst_0
/*   */     //   21: istore #5
/*   */     //   23: aload #4
/*   */     //   25: arraylength
/*   */     //   26: istore #6
/*   */     //   28: iload #5
/*   */     //   30: iload #6
/*   */     //   32: if_icmpge -> 69
/*   */     //   35: aload #4
/*   */     //   37: iload #5
/*   */     //   39: aaload
/*   */     //   40: checkcast com/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor
/*   */     //   43: astore #7
/*   */     //   45: iconst_0
/*   */     //   46: istore #8
/*   */     //   48: aload #7
/*   */     //   50: aload_1
/*   */     //   51: aload_2
/*   */     //   52: iload_3
/*   */     //   53: invokeinterface suggestTypeChange : (Lcom/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor$Parameters;Lcom/intellij/ml/llm/core/chat/parts/MessagePart$Type;I)Lcom/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor$ContextChange;
/*   */     //   58: dup
/*   */     //   59: ifnonnull -> 70
/*   */     //   62: pop
/*   */     //   63: iinc #5, 1
/*   */     //   66: goto -> 28
/*   */     //   69: aconst_null
/*   */     //   70: areturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #13	-> 12
/*   */     //   #14	-> 48
/*   */     //   #13	-> 58
/*   */     //   #13	-> 70
/*   */     // Local variable table:
/*   */     //   start	length	slot	name	descriptor
/*   */     //   48	10	8	$i$a$-firstNotNullOfOrNull-AIMessageCharProcessor$Companion$suggestTypeChange$1	I
/*   */     //   45	13	7	it	Lcom/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor;
/*   */     //   0	71	0	this	Lcom/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor$Companion;
/*   */     //   0	71	1	parameters	Lcom/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor$Parameters;
/*   */     //   0	71	2	currentContextType	Lcom/intellij/ml/llm/core/chat/parts/MessagePart$Type;
/*   */     //   0	71	3	blockStart	I
/*   */   }
/*   */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */