/*    */ package com.intellij.ml.llm.core.tokenizer;
/*    */ 
/*    */ import com.intellij.openapi.components.ComponentManager;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/core/tokenizer/TokenizerAccessPointService$Companion;", "", "()V", "getInstance", "Lcom/intellij/ml/llm/core/tokenizer/TokenizerAccessPointService;", "project", "Lcom/intellij/openapi/project/Project;", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nTokenizerAccessPointService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TokenizerAccessPointService.kt\ncom/intellij/ml/llm/core/tokenizer/TokenizerAccessPointService$Companion\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,32:1\n29#2,3:33\n*S KotlinDebug\n*F\n+ 1 TokenizerAccessPointService.kt\ncom/intellij/ml/llm/core/tokenizer/TokenizerAccessPointService$Companion\n*L\n30#1:33,3\n*E\n"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final TokenizerAccessPointService getInstance(@NotNull Project project) {
/* 30 */     Intrinsics.checkNotNullParameter(project, "project"); ComponentManager $this$service$iv = (ComponentManager)project; int $i$f$service = 0;
/*    */ 
/*    */     
/* 33 */     Class<TokenizerAccessPointService> serviceClass$iv = TokenizerAccessPointService.class;
/* 34 */     Object object = $this$service$iv.getService(serviceClass$iv); if (object == null) throw new IllegalStateException((
/* 35 */           "Cannot find service " + serviceClass$iv.getName() + " in " + $this$service$iv + " (classloader=" + serviceClass$iv.getClassLoader()).toString()); 
/*    */     return (TokenizerAccessPointService)object;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/tokenizer/TokenizerAccessPointService$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */