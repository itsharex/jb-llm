/*    */ package com.intellij.ml.llm.core.grazieAPI;
/*    */ 
/*    */ import com.intellij.util.concurrency.SequentialTaskExecutor;
/*    */ import com.intellij.util.messages.Topic;
/*    */ import java.util.concurrent.ExecutorService;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\032\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\"'\020\000\032\025\022\f\022\n \003*\004\030\0010\0020\0020\001¢\006\002\b\004X\004¢\006\b\n\000\032\004\b\005\020\006\"\023\020\007\032\0070\b¢\006\002\b\004X\004¢\006\002\n\000¨\006\t"}, d2 = {"GrazieAuthRestTopic", "Lcom/intellij/util/messages/Topic;", "Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthRestListener;", "kotlin.jvm.PlatformType", "Lorg/jetbrains/annotations/NotNull;", "getGrazieAuthRestTopic", "()Lcom/intellij/util/messages/Topic;", "authNotifierExecutor", "Ljava/util/concurrent/ExecutorService;", "intellij.ml.llm"})
/*    */ public final class GrazieAuthRestServiceKt
/*    */ {
/*    */   @NotNull
/* 93 */   private static final Topic<GrazieAuthRestListener> GrazieAuthRestTopic = Topic.create("llm.grazie.auth.rest", GrazieAuthRestListener.class); @NotNull public static final Topic<GrazieAuthRestListener> getGrazieAuthRestTopic() { return GrazieAuthRestTopic; } static { Intrinsics.checkNotNullExpressionValue(Topic.create("llm.grazie.auth.rest", GrazieAuthRestListener.class), "create(\"llm.grazie.auth.…RestListener::class.java)"); } @NotNull
/* 94 */   private static final ExecutorService authNotifierExecutor = SequentialTaskExecutor.createSequentialApplicationPoolExecutor("Grazie-auth-rest-notifier"); static { Intrinsics.checkNotNullExpressionValue(SequentialTaskExecutor.createSequentialApplicationPoolExecutor("Grazie-auth-rest-notifier"), "createSequentialApplicat…azie-auth-rest-notifier\")"); }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/grazieAPI/GrazieAuthRestServiceKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */