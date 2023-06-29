/*    */ package com.intellij.ml.llm.core.chat.services;
/*    */ 
/*    */ import com.intellij.openapi.components.Service;
/*    */ import kotlin.Metadata;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ @Service({Service.Level.APP})
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\004\b\007\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/core/chat/services/AIAssistantServiceApplicationScope;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "intellij.ml.llm"})
/*    */ public final class AIAssistantServiceApplicationScope
/*    */ {
/*    */   @NotNull
/*    */   private final CoroutineScope scope;
/*    */   
/*    */   public AIAssistantServiceApplicationScope(@NotNull CoroutineScope scope) {
/* 17 */     this.scope = scope; } @NotNull public final CoroutineScope getScope() { return this.scope; }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/services/AIAssistantServiceApplicationScope.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */