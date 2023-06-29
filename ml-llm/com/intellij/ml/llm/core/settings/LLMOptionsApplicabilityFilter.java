/*   */ package com.intellij.ml.llm.core.settings;@Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\002\bf\030\000 \0062\0020\001:\001\006J\020\020\002\032\0020\0032\006\020\004\032\0020\005H&ø\001\000\002\006\n\004\b!0\001¨\006\007À\006\001"}, d2 = {"Lcom/intellij/ml/llm/core/settings/LLMOptionsApplicabilityFilter;", "", "isOptionApplicable", "", "featureId", "Lcom/intellij/ml/llm/core/settings/LLMFeatureId;", "Companion", "intellij.ml.llm"})
/*   */ public interface LLMOptionsApplicabilityFilter { @NotNull
/*   */   public static final Companion Companion = Companion.$$INSTANCE;
/*   */   boolean isOptionApplicable(@NotNull LLMFeatureId paramLLMFeatureId);
/*   */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\006\020\006\032\0020\007J\016\020\b\032\0020\0072\006\020\t\032\0020\nR\024\020\003\032\b\022\004\022\0020\0050\004X\004¢\006\002\n\000¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/core/settings/LLMOptionsApplicabilityFilter$Companion;", "", "()V", "EP_NAME", "Lcom/intellij/openapi/extensions/ExtensionPointName;", "Lcom/intellij/ml/llm/core/settings/LLMOptionsApplicabilityFilter;", "isAnyFeatureApplicable", "", "isOptionApplicable", "featureId", "Lcom/intellij/ml/llm/core/settings/LLMFeatureId;", "intellij.ml.llm"})
/*   */   @SourceDebugExtension({"SMAP\nLLMOptionsApplicabilityFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMOptionsApplicabilityFilter.kt\ncom/intellij/ml/llm/core/settings/LLMOptionsApplicabilityFilter$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,20:1\n12541#2,2:21\n18987#2,2:23\n*S KotlinDebug\n*F\n+ 1 LLMOptionsApplicabilityFilter.kt\ncom/intellij/ml/llm/core/settings/LLMOptionsApplicabilityFilter$Companion\n*L\n11#1:21,2\n15#1:23,2\n*E\n"})
/*   */   public static final class Companion { @NotNull
/* 8 */     private static final ExtensionPointName<LLMOptionsApplicabilityFilter> EP_NAME = ExtensionPointName.Companion.create("com.intellij.ml.llm.core.optionsApplicabilityFilter");
/*   */     
/*   */     public final boolean isAnyFeatureApplicable() {
/*   */       // Byte code:
/*   */       //   0: invokestatic values : ()[Lcom/intellij/ml/llm/core/settings/LLMFeatureId;
/*   */       //   3: astore_1
/*   */       //   4: iconst_0
/*   */       //   5: istore_2
/*   */       //   6: iconst_0
/*   */       //   7: istore_3
/*   */       //   8: aload_1
/*   */       //   9: arraylength
/*   */       //   10: istore #4
/*   */       //   12: iload_3
/*   */       //   13: iload #4
/*   */       //   15: if_icmpge -> 51
/*   */       //   18: aload_1
/*   */       //   19: iload_3
/*   */       //   20: aaload
/*   */       //   21: astore #5
/*   */       //   23: aload #5
/*   */       //   25: astore #6
/*   */       //   27: iconst_0
/*   */       //   28: istore #7
/*   */       //   30: getstatic com/intellij/ml/llm/core/settings/LLMOptionsApplicabilityFilter$Companion.$$INSTANCE : Lcom/intellij/ml/llm/core/settings/LLMOptionsApplicabilityFilter$Companion;
/*   */       //   33: aload #6
/*   */       //   35: invokevirtual isOptionApplicable : (Lcom/intellij/ml/llm/core/settings/LLMFeatureId;)Z
/*   */       //   38: ifne -> 45
/*   */       //   41: iconst_0
/*   */       //   42: goto -> 52
/*   */       //   45: iinc #3, 1
/*   */       //   48: goto -> 12
/*   */       //   51: iconst_1
/*   */       //   52: ireturn
/*   */       // Line number table:
/*   */       //   Java source line number -> byte code offset
/*   */       //   #11	-> 0
/*   */       //   #21	-> 6
/*   */       //   #11	-> 30
/*   */       //   #21	-> 38
/*   */       //   #22	-> 51
/*   */       //   #11	-> 52
/*   */       // Local variable table:
/*   */       //   start	length	slot	name	descriptor
/*   */       //   30	8	7	$i$a$-all-LLMOptionsApplicabilityFilter$Companion$isAnyFeatureApplicable$1	I
/*   */       //   27	11	6	it	Lcom/intellij/ml/llm/core/settings/LLMFeatureId;
/*   */       //   23	22	5	element$iv	Ljava/lang/Object;
/*   */       //   6	46	2	$i$f$all	I
/*   */       //   4	48	1	$this$all$iv	[Ljava/lang/Object;
/*   */       //   0	53	0	this	Lcom/intellij/ml/llm/core/settings/LLMOptionsApplicabilityFilter$Companion;
/*   */     }
/*   */     
/*   */     public final boolean isOptionApplicable(@NotNull LLMFeatureId featureId) {
/*   */       // Byte code:
/*   */       //   0: aload_1
/*   */       //   1: ldc 'featureId'
/*   */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*   */       //   6: getstatic com/intellij/ml/llm/core/settings/LLMOptionsApplicabilityFilter$Companion.EP_NAME : Lcom/intellij/openapi/extensions/ExtensionPointName;
/*   */       //   9: invokevirtual getExtensions : ()[Ljava/lang/Object;
/*   */       //   12: astore_2
/*   */       //   13: iconst_0
/*   */       //   14: istore_3
/*   */       //   15: iconst_0
/*   */       //   16: istore #4
/*   */       //   18: aload_2
/*   */       //   19: arraylength
/*   */       //   20: istore #5
/*   */       //   22: iload #4
/*   */       //   24: iload #5
/*   */       //   26: if_icmpge -> 74
/*   */       //   29: aload_2
/*   */       //   30: iload #4
/*   */       //   32: aaload
/*   */       //   33: astore #6
/*   */       //   35: aload #6
/*   */       //   37: checkcast com/intellij/ml/llm/core/settings/LLMOptionsApplicabilityFilter
/*   */       //   40: astore #7
/*   */       //   42: iconst_0
/*   */       //   43: istore #8
/*   */       //   45: aload #7
/*   */       //   47: aload_1
/*   */       //   48: invokeinterface isOptionApplicable : (Lcom/intellij/ml/llm/core/settings/LLMFeatureId;)Z
/*   */       //   53: ifne -> 60
/*   */       //   56: iconst_1
/*   */       //   57: goto -> 61
/*   */       //   60: iconst_0
/*   */       //   61: ifeq -> 68
/*   */       //   64: iconst_0
/*   */       //   65: goto -> 75
/*   */       //   68: iinc #4, 1
/*   */       //   71: goto -> 22
/*   */       //   74: iconst_1
/*   */       //   75: ireturn
/*   */       // Line number table:
/*   */       //   Java source line number -> byte code offset
/*   */       //   #15	-> 6
/*   */       //   #23	-> 15
/*   */       //   #15	-> 45
/*   */       //   #23	-> 61
/*   */       //   #24	-> 74
/*   */       //   #15	-> 75
/*   */       // Local variable table:
/*   */       //   start	length	slot	name	descriptor
/*   */       //   45	16	8	$i$a$-none-LLMOptionsApplicabilityFilter$Companion$isOptionApplicable$1	I
/*   */       //   42	19	7	it	Lcom/intellij/ml/llm/core/settings/LLMOptionsApplicabilityFilter;
/*   */       //   35	33	6	element$iv	Ljava/lang/Object;
/*   */       //   15	60	3	$i$f$none	I
/*   */       //   13	62	2	$this$none$iv	[Ljava/lang/Object;
/*   */       //   0	76	0	this	Lcom/intellij/ml/llm/core/settings/LLMOptionsApplicabilityFilter$Companion;
/*   */       //   0	76	1	featureId	Lcom/intellij/ml/llm/core/settings/LLMFeatureId;
/*   */     } }
/*   */    }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/settings/LLMOptionsApplicabilityFilter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */