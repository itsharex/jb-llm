/*    */ package com.intellij.ml.llm.core.chat.services;
/*    */ 
/*    */ import com.intellij.openapi.components.ComponentManager;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\006\020\003\032\0020\004J\016\020\003\032\0020\0042\006\020\005\032\0020\006¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/core/chat/services/AIAssistantServiceScope$Companion;", "", "()V", "getScope", "Lkotlinx/coroutines/CoroutineScope;", "project", "Lcom/intellij/openapi/project/Project;", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nAIAssistantServiceScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIAssistantServiceScope.kt\ncom/intellij/ml/llm/core/chat/services/AIAssistantServiceScope$Companion\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n+ 3 service.kt\ncom/intellij/openapi/components/ServiceKt\n*L\n1#1,17:1\n29#2,3:18\n43#3,3:21\n*S KotlinDebug\n*F\n+ 1 AIAssistantServiceScope.kt\ncom/intellij/ml/llm/core/chat/services/AIAssistantServiceScope$Companion\n*L\n11#1:18,3\n12#1:21,3\n*E\n"})
/*    */ public final class Companion {
/*    */   @NotNull
/* 11 */   public final CoroutineScope getScope(@NotNull Project project) { Intrinsics.checkNotNullParameter(project, "project"); ComponentManager $this$service$iv = (ComponentManager)project; int $i$f$service = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 18 */     Class<AIAssistantServiceScope> serviceClass$iv = AIAssistantServiceScope.class;
/* 19 */     Object object = $this$service$iv.getService(serviceClass$iv); if (object == null) throw new IllegalStateException((
/* 20 */           "Cannot find service " + serviceClass$iv.getName() + " in " + $this$service$iv + " (classloader=" + serviceClass$iv.getClassLoader()).toString());  return ((AIAssistantServiceScope)object).getScope(); } private Companion() {} @NotNull public final CoroutineScope getScope() { int $i$f$service = 0;
/* 21 */     Class<AIAssistantServiceApplicationScope> serviceClass$iv = AIAssistantServiceApplicationScope.class;
/* 22 */     Object object = ApplicationManager.getApplication().getService(serviceClass$iv); if (object == null)
/* 23 */       throw new RuntimeException("Cannot find service " + serviceClass$iv.getName() + " (classloader=" + serviceClass$iv.getClassLoader() + ", client=" + ClientId.Companion.getCurrentOrNull() + ")"); 
/*    */     return ((AIAssistantServiceApplicationScope)object).getScope(); }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/services/AIAssistantServiceScope$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */