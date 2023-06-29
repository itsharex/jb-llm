/*    */ package com.intellij.ml.llm.dokuGuard.api;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\004\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\005¢\006\002\020\002J\030\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\rH\026R \020\005\032\0020\0042\006\020\003\032\0020\0048F@BX\016¢\006\b\n\000\032\004\b\006\020\007¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/dokuGuard/api/CountingListener;", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationListener;", "()V", "<set-?>", "", "count", "getCount", "()I", "sectionValidated", "", "projectSection", "Lcom/intellij/ml/llm/dokuGuard/api/ProjectSection;", "decision", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecision;", "intellij.ml.llm"})
/*    */ public final class CountingListener implements ValidationListener {
/*    */   public final int getCount() {
/*  9 */     return this.count;
/*    */   }
/*    */   private int count;
/*    */   public void sectionValidated(@NotNull ProjectSection projectSection, @NotNull ValidationDecision decision) {
/* 13 */     Intrinsics.checkNotNullParameter(projectSection, "projectSection"); Intrinsics.checkNotNullParameter(decision, "decision"); this.count++;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/dokuGuard/api/CountingListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */