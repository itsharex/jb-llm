/*    */ package com.intellij.ml.llm.core.grazieAPI;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\030\002\n\000\b`\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026ø\001\000\002\006\n\004\b!0\001¨\006\006À\006\001"}, d2 = {"Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthRestListener;", "", "onAuthenticated", "", "result", "Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthResult;", "intellij.ml.llm"})
/*    */ public interface GrazieAuthRestListener
/*    */ {
/*    */   default void onAuthenticated(@NotNull GrazieAuthResult result) {
/* 96 */     Intrinsics.checkNotNullParameter(result, "result");
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/grazieAPI/GrazieAuthRestListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */