/*    */ package com.intellij.ml.llm.core.models.requestResponse;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
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
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020!\n\002\030\002\n\002\020\002\n\000\n\002\020\013\n\002\b\005\n\002\030\002\n\000\b&\030\0002\0020\001B\005¢\006\002\020\002J\024\020\007\032\0020\b2\f\020\t\032\b\022\004\022\0020\0060\005J\022\020\n\032\0020\0062\b\b\002\020\013\032\0020\bH\026J\020\020\f\032\0020\b2\006\020\r\032\0020\016H&R\032\020\003\032\016\022\n\022\b\022\004\022\0020\0060\0050\004X\004¢\006\002\n\000¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/core/models/requestResponse/LLMStreamingRequestConsumer;", "", "()V", "finishListeners", "", "Lkotlin/Function0;", "", "addFinishListener", "", "listener", "finish", "success", "run", "choice", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nLLMBaseRequests.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMBaseRequests.kt\ncom/intellij/ml/llm/core/models/requestResponse/LLMStreamingRequestConsumer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,51:1\n1855#2,2:52\n*S KotlinDebug\n*F\n+ 1 LLMBaseRequests.kt\ncom/intellij/ml/llm/core/models/requestResponse/LLMStreamingRequestConsumer\n*L\n47#1:52,2\n*E\n"})
/*    */ public abstract class LLMStreamingRequestConsumer
/*    */ {
/*    */   @NotNull
/* 43 */   private final List<Function0<Unit>> finishListeners = new ArrayList<>();
/*    */ 
/*    */   
/*    */   public void finish(boolean success) {
/* 47 */     Iterable<Function0<Unit>> $this$forEach$iv = this.finishListeners; int $i$f$forEach = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 52 */     Iterator<Function0<Unit>> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object<Unit> element$iv = (Object<Unit>)iterator.next(); Function0 it = (Function0)element$iv; int $i$a$-forEach-LLMStreamingRequestConsumer$finish$1 = 0;
/*    */       it.invoke(); }
/*    */   
/*    */   }
/*    */   
/*    */   public final boolean addFinishListener(@NotNull Function0<Unit> listener) {
/*    */     Intrinsics.checkNotNullParameter(listener, "listener");
/*    */     return this.finishListeners.add(listener);
/*    */   }
/*    */   
/*    */   public abstract boolean run(@NotNull LLMResponseChoice paramLLMResponseChoice);
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/requestResponse/LLMStreamingRequestConsumer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */