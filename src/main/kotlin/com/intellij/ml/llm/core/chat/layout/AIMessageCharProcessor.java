/*    */ package com.intellij.ml.llm.core.chat.layout;@Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\005\bf\030\000 \0132\0020\001:\004\n\013\f\rJ\"\020\002\032\004\030\0010\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\tH&ø\001\000\002\006\n\004\b!0\001¨\006\016À\006\001"}, d2 = {"Lcom/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor;", "", "suggestTypeChange", "Lcom/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor$ContextChange;", "parameters", "Lcom/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor$Parameters;", "currentContextType", "Lcom/intellij/ml/llm/core/chat/parts/MessagePart$Type;", "blockStart", "", "BorderType", "Companion", "ContextChange", "Parameters", "intellij.ml.llm"})
/*    */ public interface AIMessageCharProcessor { @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   @Nullable
/*    */   ContextChange suggestTypeChange(@NotNull Parameters paramParameters, @NotNull MessagePart.Type paramType, int paramInt);
/*    */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J \020\006\032\004\030\0010\0072\006\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\rR\024\020\003\032\b\022\004\022\0020\0050\004X\004¢\006\002\n\000¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor$Companion;", "", "()V", "EP", "Lcom/intellij/openapi/extensions/ExtensionPointName;", "Lcom/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor;", "suggestTypeChange", "Lcom/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor$ContextChange;", "parameters", "Lcom/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor$Parameters;", "currentContextType", "Lcom/intellij/ml/llm/core/chat/parts/MessagePart$Type;", "blockStart", "", "intellij.ml.llm"})
/*    */   public static final class Companion { @NotNull
/*  8 */     private static final ExtensionPointName<AIMessageCharProcessor> EP = new ExtensionPointName("com.intellij.assistantMessageLayouter");
/*    */ 
/*    */     
/*    */     @Nullable
/*    */     public final AIMessageCharProcessor.ContextChange suggestTypeChange(@NotNull AIMessageCharProcessor.Parameters parameters, @NotNull MessagePart.Type currentContextType, int blockStart) {
/*    */       // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: ldc 'parameters'
/*    */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   6: aload_2
/*    */       //   7: ldc 'currentContextType'
/*    */       //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   12: getstatic com/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor$Companion.EP : Lcom/intellij/openapi/extensions/ExtensionPointName;
/*    */       //   15: invokevirtual getExtensions : ()[Ljava/lang/Object;
/*    */       //   18: astore #4
/*    */       //   20: iconst_0
/*    */       //   21: istore #5
/*    */       //   23: aload #4
/*    */       //   25: arraylength
/*    */       //   26: istore #6
/*    */       //   28: iload #5
/*    */       //   30: iload #6
/*    */       //   32: if_icmpge -> 69
/*    */       //   35: aload #4
/*    */       //   37: iload #5
/*    */       //   39: aaload
/*    */       //   40: checkcast com/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor
/*    */       //   43: astore #7
/*    */       //   45: iconst_0
/*    */       //   46: istore #8
/*    */       //   48: aload #7
/*    */       //   50: aload_1
/*    */       //   51: aload_2
/*    */       //   52: iload_3
/*    */       //   53: invokeinterface suggestTypeChange : (Lcom/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor$Parameters;Lcom/intellij/ml/llm/core/chat/parts/MessagePart$Type;I)Lcom/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor$ContextChange;
/*    */       //   58: dup
/*    */       //   59: ifnonnull -> 70
/*    */       //   62: pop
/*    */       //   63: iinc #5, 1
/*    */       //   66: goto -> 28
/*    */       //   69: aconst_null
/*    */       //   70: areturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #13	-> 12
/*    */       //   #14	-> 48
/*    */       //   #13	-> 58
/*    */       //   #13	-> 70
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   48	10	8	$i$a$-firstNotNullOfOrNull-AIMessageCharProcessor$Companion$suggestTypeChange$1	I
/*    */       //   45	13	7	it	Lcom/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor;
/*    */       //   0	71	0	this	Lcom/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor$Companion;
/*    */       //   0	71	1	parameters	Lcom/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor$Parameters;
/*    */       //   0	71	2	currentContextType	Lcom/intellij/ml/llm/core/chat/parts/MessagePart$Type;
/*    */       //   0	71	3	blockStart	I
/*    */     } }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\004\b\001\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004¨\006\005"}, d2 = {"Lcom/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor$BorderType;", "", "(Ljava/lang/String;I)V", "START", "END", "intellij.ml.llm"})
/*    */   public enum BorderType
/*    */   {
/* 20 */     START,
/* 21 */     END;
/*    */   } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\020\f\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\b\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\002\020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\013\020\fR\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\r\020\016¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor$Parameters;", "", "char", "", "charIndex", "", "fullMessage", "", "(CILjava/lang/String;)V", "getChar", "()C", "getCharIndex", "()I", "getFullMessage", "()Ljava/lang/String;", "intellij.ml.llm"})
/*    */   public static final class Parameters { private final char char; private final int charIndex; @NotNull
/* 24 */     private final String fullMessage; public Parameters(char char, int charIndex, @NotNull String fullMessage) { this.char = char; this.charIndex = charIndex; this.fullMessage = fullMessage; } public final char getChar() { return this.char; } public final int getCharIndex() { return this.charIndex; } @NotNull public final String getFullMessage() { return this.fullMessage; } } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\007\020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\n¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor$ContextChange;", "", "contextType", "Lcom/intellij/ml/llm/core/chat/parts/MessagePart$Type;", "borderType", "Lcom/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor$BorderType;", "(Lcom/intellij/ml/llm/core/chat/parts/MessagePart$Type;Lcom/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor$BorderType;)V", "getBorderType", "()Lcom/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor$BorderType;", "getContextType", "()Lcom/intellij/ml/llm/core/chat/parts/MessagePart$Type;", "intellij.ml.llm"}) public static final class ContextChange { @NotNull
/*    */     private final MessagePart.Type contextType; @NotNull
/* 26 */     private final AIMessageCharProcessor.BorderType borderType; public ContextChange(@NotNull MessagePart.Type contextType, @NotNull AIMessageCharProcessor.BorderType borderType) { this.contextType = contextType; this.borderType = borderType; } @NotNull public final MessagePart.Type getContextType() { return this.contextType; } @NotNull public final AIMessageCharProcessor.BorderType getBorderType() { return this.borderType; }
/*    */      }
/*    */    }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */