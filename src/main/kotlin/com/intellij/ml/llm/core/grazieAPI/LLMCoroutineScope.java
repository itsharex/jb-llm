/*    */ package com.intellij.ml.llm.core.grazieAPI;
/*    */ 
/*    */ @Service({Service.Level.PROJECT})
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\b\007\030\000 \0052\0020\001:\001\005B\r\022\006\020\002\032\0020\003¢\006\002\020\004R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/core/grazieAPI/LLMCoroutineScope;", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "Companion", "intellij.ml.llm"})
/*    */ public final class LLMCoroutineScope {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*  9 */   public LLMCoroutineScope(@NotNull CoroutineScope coroutineScope) { this.coroutineScope = coroutineScope; } @NotNull private final CoroutineScope coroutineScope; @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/core/grazieAPI/LLMCoroutineScope$Companion;", "", "()V", "getScope", "Lkotlinx/coroutines/CoroutineScope;", "project", "Lcom/intellij/openapi/project/Project;", "intellij.ml.llm"}) @SourceDebugExtension({"SMAP\nLLMCoroutineScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMCoroutineScope.kt\ncom/intellij/ml/llm/core/grazieAPI/LLMCoroutineScope$Companion\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,14:1\n29#2,3:15\n*S KotlinDebug\n*F\n+ 1 LLMCoroutineScope.kt\ncom/intellij/ml/llm/core/grazieAPI/LLMCoroutineScope$Companion\n*L\n11#1:15,3\n*E\n"})
/*    */   public static final class Companion { private Companion() {} @NotNull
/* 11 */     public final CoroutineScope getScope(@NotNull Project project) { Intrinsics.checkNotNullParameter(project, "project"); ComponentManager $this$service$iv = (ComponentManager)project; int $i$f$service = 0;
/*    */ 
/*    */ 
/*    */       
/* 15 */       Class<LLMCoroutineScope> serviceClass$iv = LLMCoroutineScope.class;
/* 16 */       Object object = $this$service$iv.getService(serviceClass$iv); if (object == null) throw new IllegalStateException((
/* 17 */             "Cannot find service " + serviceClass$iv.getName() + " in " + $this$service$iv + " (classloader=" + serviceClass$iv.getClassLoader()).toString()); 
/*    */       return ((LLMCoroutineScope)object).coroutineScope; }
/*    */      }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/grazieAPI/LLMCoroutineScope.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */