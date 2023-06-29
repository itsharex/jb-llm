/*    */ package com.intellij.ml.llm.core.grazieAPI;
/*    */ 
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\020\n\000\n\002\020\013\n\002\b\b\b\001\030\0002\b\022\004\022\0020\0000\001B\017\b\002\022\006\020\002\032\0020\003¢\006\002\020\004R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\002\020\005j\002\b\006j\002\b\007j\002\b\bj\002\b\tj\002\b\n¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;", "", "isAllowed", "", "(Ljava/lang/String;IZ)V", "()Z", "Unknown", "NoAuth", "InProgress", "WaitList", "Authed", "intellij.ml.llm"})
/*    */ public enum GrazieAuthState
/*    */ {
/* 33 */   Unknown(false),
/* 34 */   NoAuth(false),
/* 35 */   InProgress(false),
/* 36 */   WaitList(false),
/* 37 */   Authed(true);
/*    */   private final boolean isAllowed;
/*    */   
/*    */   GrazieAuthState(boolean isAllowed) {
/*    */     this.isAllowed = isAllowed;
/*    */   }
/*    */   
/*    */   public final boolean isAllowed() {
/*    */     return this.isAllowed;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/grazieAPI/GrazieAuthState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */