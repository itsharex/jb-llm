/*    */ package com.intellij.ml.llm.core.chat.session;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\f\b\001\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005j\002\b\006j\002\b\007j\002\b\bj\002\b\tj\002\b\nj\002\b\013j\002\b\f¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$SourceAction;", "", "(Ljava/lang/String;I)V", "UNKNOWN", "NEW_CHAT", "EXPLAIN_CODE_INTENTION", "FIND_PROBLEMS_INTENTION", "REFACTOR_THIS", "UNKNOWN_CHAT_INTENTION", "LOAD_STATE", "RUNTIME_ERROR_EXPLANATION", "UNITY_CREATE_NEW_FILE", "UNITY_GENERATE_CODE", "intellij.ml.llm"})
/*    */ public enum SourceAction
/*    */ {
/* 22 */   UNKNOWN,
/* 23 */   NEW_CHAT,
/* 24 */   EXPLAIN_CODE_INTENTION,
/* 25 */   FIND_PROBLEMS_INTENTION,
/* 26 */   REFACTOR_THIS,
/* 27 */   UNKNOWN_CHAT_INTENTION,
/* 28 */   LOAD_STATE,
/* 29 */   RUNTIME_ERROR_EXPLANATION,
/* 30 */   UNITY_CREATE_NEW_FILE,
/* 31 */   UNITY_GENERATE_CODE;
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/session/ChatSessionStorage$SourceAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */