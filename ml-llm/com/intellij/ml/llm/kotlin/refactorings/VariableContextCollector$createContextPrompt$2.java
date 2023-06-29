package com.intellij.ml.llm.kotlin.refactorings;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.psi.KtValVarKeywordOwner;

@Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
@SourceDebugExtension({"SMAP\nVariableContextCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VariableContextCollector.kt\ncom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector$createContextPrompt$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1#2:158\n*E\n"})
final class VariableContextCollector$createContextPrompt$2 extends Lambda implements Function0<String> {
  @NotNull
  public final String invoke() {
    // Byte code:
    //   0: aload_0
    //   1: getfield $variable : Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;
    //   4: checkcast com/intellij/psi/PsiElement
    //   7: ldc org/jetbrains/kotlin/psi/KtFunction
    //   9: invokestatic getParentOfType : (Lcom/intellij/psi/PsiElement;Ljava/lang/Class;)Lcom/intellij/psi/PsiElement;
    //   12: checkcast org/jetbrains/kotlin/psi/KtFunction
    //   15: astore_1
    //   16: aload_1
    //   17: dup
    //   18: ifnull -> 54
    //   21: invokeinterface getTypeReference : ()Lorg/jetbrains/kotlin/psi/KtTypeReference;
    //   26: dup
    //   27: ifnull -> 54
    //   30: invokevirtual getTypeText : ()Ljava/lang/String;
    //   33: dup
    //   34: ifnull -> 54
    //   37: astore #7
    //   39: iconst_0
    //   40: istore #8
    //   42: aload #7
    //   44: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   49: nop
    //   50: dup
    //   51: ifnonnull -> 57
    //   54: pop
    //   55: ldc ''
    //   57: astore_2
    //   58: aload_1
    //   59: dup
    //   60: ifnull -> 72
    //   63: invokeinterface getName : ()Ljava/lang/String;
    //   68: dup
    //   69: ifnonnull -> 75
    //   72: pop
    //   73: ldc 'test'
    //   75: astore_3
    //   76: aload_0
    //   77: getfield $variable : Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;
    //   80: checkcast com/intellij/psi/PsiElement
    //   83: ldc org/jetbrains/kotlin/psi/KtClass
    //   85: invokestatic getParentOfType : (Lcom/intellij/psi/PsiElement;Ljava/lang/Class;)Lcom/intellij/psi/PsiElement;
    //   88: checkcast org/jetbrains/kotlin/psi/KtClass
    //   91: dup
    //   92: ifnull -> 102
    //   95: invokevirtual getName : ()Ljava/lang/String;
    //   98: dup
    //   99: ifnonnull -> 105
    //   102: pop
    //   103: ldc 'C'
    //   105: astore #4
    //   107: aload_0
    //   108: getfield $declarationContext : Ljava/lang/String;
    //   111: astore #6
    //   113: aload_0
    //   114: getfield $variable : Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;
    //   117: astore #7
    //   119: aload #6
    //   121: astore #8
    //   123: iconst_0
    //   124: istore #9
    //   126: aload #7
    //   128: instanceof org/jetbrains/kotlin/psi/KtParameter
    //   131: ifeq -> 139
    //   134: aload #6
    //   136: goto -> 140
    //   139: aconst_null
    //   140: dup
    //   141: ifnonnull -> 147
    //   144: pop
    //   145: ldc ''
    //   147: astore #5
    //   149: aload_0
    //   150: getfield $declarationContext : Ljava/lang/String;
    //   153: astore #8
    //   155: aload_0
    //   156: getfield $variable : Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;
    //   159: astore #9
    //   161: aload #8
    //   163: astore #10
    //   165: iconst_0
    //   166: istore #11
    //   168: aload #9
    //   170: instanceof org/jetbrains/kotlin/psi/KtParameter
    //   173: ifne -> 180
    //   176: iconst_1
    //   177: goto -> 181
    //   180: iconst_0
    //   181: ifeq -> 189
    //   184: aload #8
    //   186: goto -> 190
    //   189: aconst_null
    //   190: dup
    //   191: ifnull -> 222
    //   194: astore #8
    //   196: aload_0
    //   197: getfield $variable : Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;
    //   200: astore #9
    //   202: aload #8
    //   204: astore #10
    //   206: iconst_0
    //   207: istore #11
    //   209: getstatic com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector.INSTANCE : Lcom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector;
    //   212: aload #10
    //   214: aload #9
    //   216: invokestatic access$addVarIfNeeded : (Lcom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector;Ljava/lang/String;Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;)Ljava/lang/String;
    //   219: goto -> 224
    //   222: pop
    //   223: aconst_null
    //   224: dup
    //   225: ifnonnull -> 231
    //   228: pop
    //   229: ldc ''
    //   231: astore #6
    //   233: aload #4
    //   235: aload_3
    //   236: aload #5
    //   238: aload_2
    //   239: getstatic com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector.INSTANCE : Lcom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector;
    //   242: aload_0
    //   243: getfield $declarationsForDependencyVariables : Ljava/util/List;
    //   246: checkcast java/util/Collection
    //   249: aconst_null
    //   250: iconst_1
    //   251: aconst_null
    //   252: invokestatic indent$default : (Lcom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector;Ljava/util/Collection;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
    //   255: getstatic com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector.INSTANCE : Lcom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector;
    //   258: aload_0
    //   259: getfield $usagesOfPassedVariables : Ljava/util/List;
    //   262: checkcast java/util/Collection
    //   265: aconst_null
    //   266: iconst_1
    //   267: aconst_null
    //   268: invokestatic indent$default : (Lcom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector;Ljava/util/Collection;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
    //   271: aload #6
    //   273: astore #8
    //   275: astore #17
    //   277: astore #16
    //   279: astore #15
    //   281: astore #14
    //   283: astore #13
    //   285: astore #12
    //   287: iconst_0
    //   288: istore #9
    //   290: aload #8
    //   292: checkcast java/lang/CharSequence
    //   295: invokeinterface length : ()I
    //   300: ifne -> 307
    //   303: iconst_1
    //   304: goto -> 308
    //   307: iconst_0
    //   308: ifeq -> 316
    //   311: ldc ''
    //   313: goto -> 323
    //   316: aload #8
    //   318: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   323: astore #18
    //   325: aload #12
    //   327: aload #13
    //   329: aload #14
    //   331: aload #15
    //   333: aload #16
    //   335: aload #17
    //   337: aload #18
    //   339: nop
    //   340: getstatic com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector.INSTANCE : Lcom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector;
    //   343: aload_0
    //   344: getfield $usageContext : Ljava/util/List;
    //   347: checkcast java/util/Collection
    //   350: aconst_null
    //   351: iconst_1
    //   352: aconst_null
    //   353: invokestatic indent$default : (Lcom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector;Ljava/util/Collection;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
    //   356: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    //   361: invokestatic trimIndent : (Ljava/lang/String;)Ljava/lang/String;
    //   364: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #45	-> 0
    //   #46	-> 16
    //   #158	-> 39
    //   #46	-> 42
    //   #46	-> 49
    //   #46	-> 50
    //   #47	-> 58
    //   #48	-> 76
    //   #49	-> 107
    //   #158	-> 123
    //   #49	-> 126
    //   #49	-> 131
    //   #49	-> 140
    //   #49	-> 147
    //   #50	-> 149
    //   #158	-> 165
    //   #50	-> 168
    //   #50	-> 181
    //   #50	-> 190
    //   #158	-> 206
    //   #50	-> 209
    //   #50	-> 219
    //   #50	-> 222
    //   #50	-> 231
    //   #52	-> 233
    //   #53	-> 235
    //   #54	-> 239
    //   #55	-> 255
    //   #56	-> 271
    //   #158	-> 275
    //   #56	-> 290
    //   #56	-> 308
    //   #56	-> 339
    //   #57	-> 340
    //   #60	-> 361
    //   #51	-> 364
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   42	7	8	$i$a$-let-VariableContextCollector$createContextPrompt$2$returnType$1	I
    //   39	10	7	it	Ljava/lang/String;
    //   126	5	9	$i$a$-takeIf-VariableContextCollector$createContextPrompt$2$parameters$1	I
    //   123	8	8	it	Ljava/lang/String;
    //   168	13	11	$i$a$-takeIf-VariableContextCollector$createContextPrompt$2$declaration$1	I
    //   165	16	10	it	Ljava/lang/String;
    //   209	10	11	$i$a$-let-VariableContextCollector$createContextPrompt$2$declaration$2	I
    //   206	13	10	it	Ljava/lang/String;
    //   290	33	9	$i$a$-let-VariableContextCollector$createContextPrompt$2$1	I
    //   287	36	8	it	Ljava/lang/String;
    //   16	349	1	containingFunction	Lorg/jetbrains/kotlin/psi/KtFunction;
    //   58	307	2	returnType	Ljava/lang/String;
    //   76	289	3	name	Ljava/lang/String;
    //   107	258	4	className	Ljava/lang/String;
    //   149	216	5	parameters	Ljava/lang/String;
    //   233	132	6	declaration	Ljava/lang/String;
    //   0	365	0	this	Lcom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector$createContextPrompt$2;
  }
  
  VariableContextCollector$createContextPrompt$2(KtValVarKeywordOwner $variable, String $declarationContext, List<String> $declarationsForDependencyVariables, List<String> $usagesOfPassedVariables, List<String> $usageContext) {
    super(0);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector$createContextPrompt$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */