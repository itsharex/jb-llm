/*    */ package com.intellij.ml.llm.core.chat.session;
/*    */ 
/*    */ import com.intellij.openapi.actionSystem.DataKey;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R$\020\003\032\025\022\f\022\n \006*\004\030\0010\0050\0050\004¢\006\002\b\007¢\006\b\n\000\032\004\b\b\020\t¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/core/chat/session/ChatSession$Companion;", "", "()V", "CurrentSession", "Lcom/intellij/openapi/actionSystem/DataKey;", "Lcom/intellij/ml/llm/core/chat/session/ChatSession;", "kotlin.jvm.PlatformType", "Lorg/jetbrains/annotations/NotNull;", "getCurrentSession", "()Lcom/intellij/openapi/actionSystem/DataKey;", "intellij.ml.llm"})
/*    */ public final class Companion
/*    */ {
/*    */   @NotNull
/* 12 */   private static final DataKey<ChatSession> CurrentSession = DataKey.create("CurrentAIChatSession"); @NotNull public final DataKey<ChatSession> getCurrentSession() { return CurrentSession; } static { Intrinsics.checkNotNullExpressionValue(DataKey.create("CurrentAIChatSession"), "create<ChatSession>(\"CurrentAIChatSession\")"); }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/session/ChatSession$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */