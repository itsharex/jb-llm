/*    */ package com.intellij.ml.llm.core.chat.layout;
/*    */ import com.intellij.ml.llm.core.chat.parts.MessagePart;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\000\030\000 \0162\0020\001:\001\016B\005¢\006\002\020\002J\030\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\bH\002J\020\020\t\032\0020\0042\006\020\005\032\0020\006H\002J\"\020\n\032\004\030\0010\0132\006\020\005\032\0020\0062\006\020\f\032\0020\r2\006\020\007\032\0020\bH\026¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/core/chat/layout/AIMessageCodeBlockCharProcessor;", "Lcom/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor;", "()V", "isCodeBlockEnd", "", "parameters", "Lcom/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor$Parameters;", "blockStart", "", "isCodeBlockStart", "suggestTypeChange", "Lcom/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor$ContextChange;", "currentContextType", "Lcom/intellij/ml/llm/core/chat/parts/MessagePart$Type;", "Companion", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nAIMessageCodeBlockCharProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIMessageCodeBlockCharProcessor.kt\ncom/intellij/ml/llm/core/chat/layout/AIMessageCodeBlockCharProcessor\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,72:1\n1064#2,2:73\n*S KotlinDebug\n*F\n+ 1 AIMessageCodeBlockCharProcessor.kt\ncom/intellij/ml/llm/core/chat/layout/AIMessageCodeBlockCharProcessor\n*L\n64#1:73,2\n*E\n"})
/*    */ public final class AIMessageCodeBlockCharProcessor implements AIMessageCharProcessor {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private static final char triggerChar = '`';
/*    */   
/*    */   @Nullable
/*    */   public AIMessageCharProcessor.ContextChange suggestTypeChange(@NotNull AIMessageCharProcessor.Parameters parameters, @NotNull MessagePart.Type currentContextType, int blockStart) {
/* 16 */     Intrinsics.checkNotNullParameter(parameters, "parameters"); Intrinsics.checkNotNullParameter(currentContextType, "currentContextType"); if (parameters.getChar() == '`' || parameters.getChar() == '\n') {
/* 17 */       if (currentContextType == MessagePart.Type.PlainText) {
/* 18 */         boolean shouldStartCodeBlock = isCodeBlockStart(parameters);
/* 19 */         if (shouldStartCodeBlock) {  } else {  }  return 
/*    */           
/* 21 */           null;
/*    */       } 
/* 23 */       if (currentContextType == MessagePart.Type.CodeEditor) {
/* 24 */         boolean shouldEndCodeBlock = isCodeBlockEnd(parameters, blockStart);
/* 25 */         if (shouldEndCodeBlock) {  } else {  }  return 
/*    */           
/* 27 */           null;
/*    */       } 
/*    */     } 
/*    */     
/* 31 */     return null;
/*    */   }
/*    */   @NotNull
/*    */   private static final String borderBlock = "```";
/*    */   private final boolean isCodeBlockEnd(AIMessageCharProcessor.Parameters parameters, int blockStart) {
/* 36 */     if (parameters.getCharIndex() - blockStart < 5) return false;
/*    */     
/* 38 */     if (parameters.getChar() == '`' && 
/* 39 */       parameters.getCharIndex() == parameters.getFullMessage().length() - 1 && 
/* 40 */       parameters.getCharIndex() - 3 >= 0 && 
/*    */       
/* 42 */       Intrinsics.areEqual(parameters.getFullMessage().subSequence(parameters.getCharIndex() - 3, parameters.getCharIndex() + 1), "\n```")) {
/* 43 */       return true;
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 50 */     if (parameters.getChar() == '\n' && 
/* 51 */       parameters.getCharIndex() - 3 - 1 >= 0 && 
/* 52 */       Intrinsics.areEqual(parameters.getFullMessage().subSequence(parameters.getCharIndex() - 4, parameters.getCharIndex()), "\n```")) {
/* 53 */       return true;
/*    */     }
/*    */     
/* 56 */     return false;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\020\f\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\016\020\003\032\0020\004XT¢\006\002\n\000R\016\020\005\032\0020\006XT¢\006\002\n\000¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/core/chat/layout/AIMessageCodeBlockCharProcessor$Companion;", "", "()V", "borderBlock", "", "triggerChar", "", "intellij.ml.llm"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */   
/*    */   private final boolean isCodeBlockStart(AIMessageCharProcessor.Parameters parameters) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: invokevirtual getChar : ()C
/*    */     //   4: bipush #96
/*    */     //   6: if_icmpeq -> 11
/*    */     //   9: iconst_0
/*    */     //   10: ireturn
/*    */     //   11: aload_1
/*    */     //   12: invokevirtual getCharIndex : ()I
/*    */     //   15: iconst_3
/*    */     //   16: iadd
/*    */     //   17: aload_1
/*    */     //   18: invokevirtual getFullMessage : ()Ljava/lang/String;
/*    */     //   21: invokevirtual length : ()I
/*    */     //   24: if_icmpge -> 146
/*    */     //   27: aload_1
/*    */     //   28: invokevirtual getCharIndex : ()I
/*    */     //   31: ifeq -> 52
/*    */     //   34: aload_1
/*    */     //   35: invokevirtual getFullMessage : ()Ljava/lang/String;
/*    */     //   38: aload_1
/*    */     //   39: invokevirtual getCharIndex : ()I
/*    */     //   42: iconst_1
/*    */     //   43: isub
/*    */     //   44: invokevirtual charAt : (I)C
/*    */     //   47: bipush #10
/*    */     //   49: if_icmpne -> 56
/*    */     //   52: iconst_1
/*    */     //   53: goto -> 57
/*    */     //   56: iconst_0
/*    */     //   57: istore_2
/*    */     //   58: iload_2
/*    */     //   59: ifeq -> 146
/*    */     //   62: aload_1
/*    */     //   63: invokevirtual getFullMessage : ()Ljava/lang/String;
/*    */     //   66: aload_1
/*    */     //   67: invokevirtual getCharIndex : ()I
/*    */     //   70: aload_1
/*    */     //   71: invokevirtual getCharIndex : ()I
/*    */     //   74: iconst_3
/*    */     //   75: iadd
/*    */     //   76: invokevirtual subSequence : (II)Ljava/lang/CharSequence;
/*    */     //   79: astore_3
/*    */     //   80: nop
/*    */     //   81: iconst_0
/*    */     //   82: istore #4
/*    */     //   84: iconst_0
/*    */     //   85: istore #5
/*    */     //   87: iload #5
/*    */     //   89: aload_3
/*    */     //   90: invokeinterface length : ()I
/*    */     //   95: if_icmpge -> 140
/*    */     //   98: aload_3
/*    */     //   99: iload #5
/*    */     //   101: invokeinterface charAt : (I)C
/*    */     //   106: istore #6
/*    */     //   108: iload #6
/*    */     //   110: istore #7
/*    */     //   112: iconst_0
/*    */     //   113: istore #8
/*    */     //   115: iload #7
/*    */     //   117: bipush #96
/*    */     //   119: if_icmpne -> 126
/*    */     //   122: iconst_1
/*    */     //   123: goto -> 127
/*    */     //   126: iconst_0
/*    */     //   127: ifne -> 134
/*    */     //   130: iconst_0
/*    */     //   131: goto -> 141
/*    */     //   134: iinc #5, 1
/*    */     //   137: goto -> 87
/*    */     //   140: iconst_1
/*    */     //   141: ifeq -> 146
/*    */     //   144: iconst_1
/*    */     //   145: ireturn
/*    */     //   146: iconst_0
/*    */     //   147: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #60	-> 0
/*    */     //   #61	-> 11
/*    */     //   #62	-> 27
/*    */     //   #63	-> 58
/*    */     //   #64	-> 70
/*    */     //   #63	-> 76
/*    */     //   #64	-> 80
/*    */     //   #73	-> 84
/*    */     //   #64	-> 115
/*    */     //   #73	-> 127
/*    */     //   #74	-> 140
/*    */     //   #64	-> 141
/*    */     //   #65	-> 144
/*    */     //   #68	-> 146
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   115	12	8	$i$a$-all-AIMessageCodeBlockCharProcessor$isCodeBlockStart$1	I
/*    */     //   112	15	7	it	C
/*    */     //   108	26	6	element$iv	C
/*    */     //   84	57	4	$i$f$all	I
/*    */     //   81	60	3	$this$all$iv	Ljava/lang/CharSequence;
/*    */     //   58	88	2	isLineStart	Z
/*    */     //   0	148	0	this	Lcom/intellij/ml/llm/core/chat/layout/AIMessageCodeBlockCharProcessor;
/*    */     //   0	148	1	parameters	Lcom/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor$Parameters;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/layout/AIMessageCodeBlockCharProcessor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */