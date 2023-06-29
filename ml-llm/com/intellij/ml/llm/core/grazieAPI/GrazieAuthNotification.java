/*    */ package com.intellij.ml.llm.core.grazieAPI;
/*    */ import com.intellij.notification.Notification;
/*    */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\005¢\006\002\020\002J\024\020\b\032\0020\t2\f\020\n\032\b\022\004\022\0020\t0\013R\016\020\003\032\0020\004X\004¢\006\002\n\000R\024\020\005\032\b\022\004\022\0020\0070\006X\004¢\006\002\n\000¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthNotification;", "", "()V", "allowToAsk", "Ljava/util/concurrent/atomic/AtomicBoolean;", "pendingNotification", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/intellij/notification/Notification;", "showNotification", "", "action", "Lkotlin/Function0;", "intellij.ml.llm"})
/*    */ public final class GrazieAuthNotification {
/*    */   @NotNull
/* 12 */   private final AtomicBoolean allowToAsk = new AtomicBoolean(true); @NotNull
/* 13 */   private final AtomicReference<Notification> pendingNotification = new AtomicReference<>(null);
/*    */ 
/*    */   
/*    */   public final void showNotification(@NotNull Function0 action) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'action'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: getfield allowToAsk : Ljava/util/concurrent/atomic/AtomicBoolean;
/*    */     //   10: invokevirtual get : ()Z
/*    */     //   13: ifeq -> 26
/*    */     //   16: aload_0
/*    */     //   17: getfield pendingNotification : Ljava/util/concurrent/atomic/AtomicReference;
/*    */     //   20: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   23: ifnull -> 27
/*    */     //   26: return
/*    */     //   27: invokestatic getInstance : ()Lcom/intellij/notification/NotificationGroupManager;
/*    */     //   30: ldc 'AI notification group'
/*    */     //   32: invokeinterface getNotificationGroup : (Ljava/lang/String;)Lcom/intellij/notification/NotificationGroup;
/*    */     //   37: ldc 'grazie.auth.notification.title'
/*    */     //   39: iconst_0
/*    */     //   40: anewarray java/lang/Object
/*    */     //   43: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   46: ldc 'grazie.notification.content'
/*    */     //   48: iconst_0
/*    */     //   49: anewarray java/lang/Object
/*    */     //   52: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   55: getstatic com/intellij/notification/NotificationType.INFORMATION : Lcom/intellij/notification/NotificationType;
/*    */     //   58: invokevirtual createNotification : (Ljava/lang/String;Ljava/lang/String;Lcom/intellij/notification/NotificationType;)Lcom/intellij/notification/Notification;
/*    */     //   61: ldc 'grazie.auth.notification.content.log.in'
/*    */     //   63: iconst_0
/*    */     //   64: anewarray java/lang/Object
/*    */     //   67: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   70: new com/intellij/ml/llm/core/grazieAPI/GrazieAuthNotification$showNotification$notification$1
/*    */     //   73: dup
/*    */     //   74: aload_1
/*    */     //   75: invokespecial <init> : (Lkotlin/jvm/functions/Function0;)V
/*    */     //   78: checkcast kotlin/jvm/functions/Function2
/*    */     //   81: <illegal opcode> accept : (Lkotlin/jvm/functions/Function2;)Ljava/util/function/BiConsumer;
/*    */     //   86: invokestatic createExpiring : (Ljava/lang/String;Ljava/util/function/BiConsumer;)Lcom/intellij/notification/NotificationAction;
/*    */     //   89: checkcast com/intellij/openapi/actionSystem/AnAction
/*    */     //   92: invokevirtual addAction : (Lcom/intellij/openapi/actionSystem/AnAction;)Lcom/intellij/notification/Notification;
/*    */     //   95: dup
/*    */     //   96: ldc 'action: () -> Unit) {\\n  …        action()\\n      })'
/*    */     //   98: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   101: astore_2
/*    */     //   102: aload_2
/*    */     //   103: aload_0
/*    */     //   104: aload_2
/*    */     //   105: <illegal opcode> run : (Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthNotification;Lcom/intellij/notification/Notification;)Ljava/lang/Runnable;
/*    */     //   110: invokevirtual whenExpired : (Ljava/lang/Runnable;)Lcom/intellij/notification/Notification;
/*    */     //   113: pop
/*    */     //   114: aload_0
/*    */     //   115: getfield pendingNotification : Ljava/util/concurrent/atomic/AtomicReference;
/*    */     //   118: aconst_null
/*    */     //   119: aload_2
/*    */     //   120: invokevirtual compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   123: ifne -> 127
/*    */     //   126: return
/*    */     //   127: aload_0
/*    */     //   128: getfield allowToAsk : Ljava/util/concurrent/atomic/AtomicBoolean;
/*    */     //   131: iconst_1
/*    */     //   132: iconst_0
/*    */     //   133: invokevirtual compareAndSet : (ZZ)Z
/*    */     //   136: ifne -> 140
/*    */     //   139: return
/*    */     //   140: aload_2
/*    */     //   141: aconst_null
/*    */     //   142: invokevirtual notify : (Lcom/intellij/openapi/project/Project;)V
/*    */     //   145: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #16	-> 6
/*    */     //   #17	-> 27
/*    */     //   #18	-> 30
/*    */     //   #20	-> 37
/*    */     //   #21	-> 46
/*    */     //   #22	-> 55
/*    */     //   #19	-> 58
/*    */     //   #23	-> 61
/*    */     //   #17	-> 101
/*    */     //   #26	-> 102
/*    */     //   #27	-> 114
/*    */     //   #28	-> 127
/*    */     //   #29	-> 140
/*    */     //   #30	-> 145
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   102	44	2	notification	Lcom/intellij/notification/Notification;
/*    */     //   0	146	0	this	Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthNotification;
/*    */     //   0	146	1	action	Lkotlin/jvm/functions/Function0;
/*    */   }
/*    */ 
/*    */   
/*    */   private static final void showNotification$lambda$0(Function2 $tmp0, Object p0, Object p1)
/*    */   {
/* 23 */     Intrinsics.checkNotNullParameter($tmp0, "$tmp0"); $tmp0.invoke(p0, p1);
/* 24 */   } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\026\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\020\000\032\0020\0012\016\020\002\032\n \004*\004\030\0010\0030\0032\016\020\005\032\n \004*\004\030\0010\0060\006H\n¢\006\002\b\007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "Lcom/intellij/notification/Notification;", "invoke"}) static final class GrazieAuthNotification$showNotification$notification$1 extends Lambda implements Function2<AnActionEvent, Notification, Unit> { GrazieAuthNotification$showNotification$notification$1(Function0<Unit> $action) { super(2); } public final void invoke(AnActionEvent param1AnActionEvent, Notification param1Notification) { this.$action.invoke(); }
/*    */      } private static final void showNotification$lambda$1(GrazieAuthNotification this$0, Notification $notification) {
/* 26 */     Intrinsics.checkNotNullParameter(this$0, "this$0"); Intrinsics.checkNotNullParameter($notification, "$notification"); this$0.pendingNotification.compareAndSet($notification, null);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/grazieAPI/GrazieAuthNotification.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */