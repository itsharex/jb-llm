/*     */ package com.intellij.ml.llm.core.statistics.fus;
/*     */ 
/*     */ import com.intellij.ml.llm.core.chat.session.ChatSession;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.TuplesKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\026\n\000\n\002\030\002\n\002\020\t\n\002\020\016\n\000\n\002\030\002\n\000\020\000\032\020\022\004\022\0020\002\022\006\022\004\030\0010\0030\0012\b\020\004\032\004\030\0010\005H\n¢\006\002\b\006"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "session", "Lcom/intellij/ml/llm/core/chat/session/ChatSession;", "invoke"})
/*     */ @SourceDebugExtension({"SMAP\nAIAssistantChatEventLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIAssistantChatEventLogger.kt\ncom/intellij/ml/llm/core/statistics/fus/AIAssistantChatEventLogger$Companion$CHAT_UUID$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,215:1\n1#2:216\n*E\n"})
/*     */ final class AIAssistantChatEventLogger$Companion$CHAT_UUID$1
/*     */   extends Lambda
/*     */   implements Function1<ChatSession, Pair<? extends Long, ? extends String>>
/*     */ {
/*     */   public static final AIAssistantChatEventLogger$Companion$CHAT_UUID$1 INSTANCE = new AIAssistantChatEventLogger$Companion$CHAT_UUID$1();
/*     */   
/*     */   @NotNull
/*     */   public final Pair<Long, String> invoke(@Nullable ChatSession session) {
/*  26 */     if (session != null) { ChatSession it = session;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 216 */       int $i$a$-let-AIAssistantChatEventLogger$Companion$CHAT_UUID$1$1 = 0;
/*     */       if (TuplesKt.to(Long.valueOf(session.getTimestamp()), session.getUid()) == null) {
/*     */         TuplesKt.to(Long.valueOf(session.getTimestamp()), session.getUid());
/*     */         return TuplesKt.to(Long.valueOf(System.currentTimeMillis()), null);
/*     */       } 
/*     */       return TuplesKt.to(Long.valueOf(session.getTimestamp()), session.getUid()); }
/*     */     
/*     */     TuplesKt.to(Long.valueOf(session.getTimestamp()), session.getUid());
/*     */     return TuplesKt.to(Long.valueOf(System.currentTimeMillis()), null);
/*     */   }
/*     */   
/*     */   AIAssistantChatEventLogger$Companion$CHAT_UUID$1() {
/*     */     super(1);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/statistics/fus/AIAssistantChatEventLogger$Companion$CHAT_UUID$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */