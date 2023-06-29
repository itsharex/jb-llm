/*    */ package com.intellij.ml.llm.core.grazieAPI;
/*    */ import com.intellij.openapi.components.ComponentManager;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/core/grazieAPI/LLMCoroutineScope$Companion;", "", "()V", "getScope", "Lkotlinx/coroutines/CoroutineScope;", "project", "Lcom/intellij/openapi/project/Project;", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nLLMCoroutineScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMCoroutineScope.kt\ncom/intellij/ml/llm/core/grazieAPI/LLMCoroutineScope$Companion\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,14:1\n29#2,3:15\n*S KotlinDebug\n*F\n+ 1 LLMCoroutineScope.kt\ncom/intellij/ml/llm/core/grazieAPI/LLMCoroutineScope$Companion\n*L\n11#1:15,3\n*E\n"})
/*    */ public final class Companion {
/*    */   @NotNull
/*    */   public final CoroutineScope getScope(@NotNull Project project) {
/* 11 */     Intrinsics.checkNotNullParameter(project, "project"); ComponentManager $this$service$iv = (ComponentManager)project; int $i$f$service = 0;
/*    */ 
/*    */ 
/*    */     
/* 15 */     Class<LLMCoroutineScope> serviceClass$iv = LLMCoroutineScope.class;
/* 16 */     Object object = $this$service$iv.getService(serviceClass$iv); if (object == null) throw new IllegalStateException((
/* 17 */           "Cannot find service " + serviceClass$iv.getName() + " in " + $this$service$iv + " (classloader=" + serviceClass$iv.getClassLoader()).toString()); 
/*    */     return LLMCoroutineScope.access$getCoroutineScope$p((LLMCoroutineScope)object);
/*    */   }
/*    */   
/*    */   private Companion() {}
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/grazieAPI/LLMCoroutineScope$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */