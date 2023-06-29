/*     */ package com.intellij.ml.llm.core;
/*     */ import com.intellij.codeInsight.hints.presentation.InlayPresentation;
/*     */ import com.intellij.codeInsight.hints.presentation.InsetPresentation;
/*     */ import com.intellij.codeInsight.hints.presentation.PresentationRenderer;
/*     */ import com.intellij.ml.llm.core.statistics.StatisticsIdeActivities;
/*     */ import com.intellij.notification.Notification;
/*     */ import com.intellij.openapi.Disposable;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.editor.Inlay;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.util.Disposer;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000:\n\000\n\002\020\t\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\b\n\002\b\002\032\006\020\002\032\0020\003\032\020\020\004\032\0020\0052\006\020\006\032\0020\007H\000\032\026\020\b\032\0020\0052\006\020\006\032\0020\0072\006\020\t\032\0020\n\032\026\020\013\032\0020\0052\006\020\006\032\0020\0072\006\020\f\032\0020\r\032&\020\016\032\0020\0052\006\020\006\032\0020\0072\006\020\017\032\0020\0202\006\020\f\032\0020\r2\006\020\021\032\0020\022\032\020\020\023\032\0020\0052\006\020\006\032\0020\007H\000\"\016\020\000\032\0020\001XT¢\006\002\n\000¨\006\024"}, d2 = {"INLAY_FEEDBACK_ALIVE_TIME", "", "createNotificationGroup", "Lcom/intellij/notification/NotificationGroup;", "showAuthorizationFailedNotification", "", "project", "Lcom/intellij/openapi/project/Project;", "showRequestFailedNotification", "message", "", "showScoreNotification", "activity", "Lcom/intellij/ml/llm/core/statistics/StatisticsIdeActivities;", "showScoreNotificationInlay", "editor", "Lcom/intellij/openapi/editor/Editor;", "startOffset", "", "showUnauthorizedNotification", "intellij.ml.llm"})
/*     */ public final class NotificationsKt {
/*     */   private static final long INLAY_FEEDBACK_ALIVE_TIME = 20000L;
/*     */   
/*     */   @NotNull
/*     */   public static final NotificationGroup createNotificationGroup() {
/*  33 */     Intrinsics.checkNotNullExpressionValue(NotificationGroupManager.getInstance().getNotificationGroup("AI notification group"), "getInstance().getNotific…(\"AI notification group\")"); return NotificationGroupManager.getInstance().getNotificationGroup("AI notification group");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static final void showUnauthorizedNotification(@NotNull Project project) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'project'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: invokestatic createNotificationGroup : ()Lcom/intellij/notification/NotificationGroup;
/*     */     //   9: ldc 'notification.unauthorized.title'
/*     */     //   11: iconst_0
/*     */     //   12: anewarray java/lang/Object
/*     */     //   15: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   18: ldc 'notification.unauthorized.key.not.provided'
/*     */     //   20: iconst_0
/*     */     //   21: anewarray java/lang/Object
/*     */     //   24: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   27: getstatic com/intellij/notification/NotificationType.WARNING : Lcom/intellij/notification/NotificationType;
/*     */     //   30: invokevirtual createNotification : (Ljava/lang/String;Ljava/lang/String;Lcom/intellij/notification/NotificationType;)Lcom/intellij/notification/Notification;
/*     */     //   33: astore_1
/*     */     //   34: ldc 'notification.unauthorized.key.not.provided.action'
/*     */     //   36: iconst_0
/*     */     //   37: anewarray java/lang/Object
/*     */     //   40: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   43: astore_2
/*     */     //   44: aload_1
/*     */     //   45: aload_2
/*     */     //   46: aload_0
/*     */     //   47: aload_1
/*     */     //   48: <illegal opcode> run : (Lcom/intellij/openapi/project/Project;Lcom/intellij/notification/Notification;)Ljava/lang/Runnable;
/*     */     //   53: invokestatic createSimple : (Ljava/lang/String;Ljava/lang/Runnable;)Lcom/intellij/notification/NotificationAction;
/*     */     //   56: checkcast com/intellij/openapi/actionSystem/AnAction
/*     */     //   59: invokevirtual addAction : (Lcom/intellij/openapi/actionSystem/AnAction;)Lcom/intellij/notification/Notification;
/*     */     //   62: pop
/*     */     //   63: aload_1
/*     */     //   64: aload_0
/*     */     //   65: invokevirtual notify : (Lcom/intellij/openapi/project/Project;)V
/*     */     //   68: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #37	-> 6
/*     */     //   #38	-> 9
/*     */     //   #39	-> 18
/*     */     //   #40	-> 27
/*     */     //   #37	-> 30
/*     */     //   #43	-> 34
/*     */     //   #44	-> 44
/*     */     //   #48	-> 63
/*     */     //   #49	-> 68
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   34	35	1	notification	Lcom/intellij/notification/Notification;
/*     */     //   44	25	2	action	Ljava/lang/String;
/*     */     //   0	69	0	project	Lcom/intellij/openapi/project/Project;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static final void showUnauthorizedNotification$lambda$0(Project $project, Notification $notification) {
/*  45 */     Intrinsics.checkNotNullParameter($project, "$project"); Intrinsics.checkNotNullParameter($notification, "$notification"); LLMConfigurableKt.openLlmSettingsDialog($project);
/*  46 */     $notification.expire();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final void showAuthorizationFailedNotification(@NotNull Project project) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'project'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: invokestatic createNotificationGroup : ()Lcom/intellij/notification/NotificationGroup;
/*     */     //   9: ldc 'notification.unauthorized.title'
/*     */     //   11: iconst_0
/*     */     //   12: anewarray java/lang/Object
/*     */     //   15: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   18: ldc 'notification.unauthorized.key.is.invalid'
/*     */     //   20: iconst_0
/*     */     //   21: anewarray java/lang/Object
/*     */     //   24: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   27: getstatic com/intellij/notification/NotificationType.WARNING : Lcom/intellij/notification/NotificationType;
/*     */     //   30: invokevirtual createNotification : (Ljava/lang/String;Ljava/lang/String;Lcom/intellij/notification/NotificationType;)Lcom/intellij/notification/Notification;
/*     */     //   33: astore_1
/*     */     //   34: ldc 'notification.unauthorized.key.not.provided.action'
/*     */     //   36: iconst_0
/*     */     //   37: anewarray java/lang/Object
/*     */     //   40: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   43: astore_2
/*     */     //   44: aload_1
/*     */     //   45: aload_2
/*     */     //   46: aload_0
/*     */     //   47: aload_1
/*     */     //   48: <illegal opcode> run : (Lcom/intellij/openapi/project/Project;Lcom/intellij/notification/Notification;)Ljava/lang/Runnable;
/*     */     //   53: invokestatic createSimple : (Ljava/lang/String;Ljava/lang/Runnable;)Lcom/intellij/notification/NotificationAction;
/*     */     //   56: checkcast com/intellij/openapi/actionSystem/AnAction
/*     */     //   59: invokevirtual addAction : (Lcom/intellij/openapi/actionSystem/AnAction;)Lcom/intellij/notification/Notification;
/*     */     //   62: pop
/*     */     //   63: aload_1
/*     */     //   64: aload_0
/*     */     //   65: invokevirtual notify : (Lcom/intellij/openapi/project/Project;)V
/*     */     //   68: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #52	-> 6
/*     */     //   #53	-> 9
/*     */     //   #54	-> 18
/*     */     //   #55	-> 27
/*     */     //   #52	-> 30
/*     */     //   #58	-> 34
/*     */     //   #59	-> 44
/*     */     //   #63	-> 63
/*     */     //   #64	-> 68
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   34	35	1	notification	Lcom/intellij/notification/Notification;
/*     */     //   44	25	2	action	Ljava/lang/String;
/*     */     //   0	69	0	project	Lcom/intellij/openapi/project/Project;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final void showAuthorizationFailedNotification$lambda$1(Project $project, Notification $notification) {
/*  60 */     Intrinsics.checkNotNullParameter($project, "$project"); Intrinsics.checkNotNullParameter($notification, "$notification"); LLMConfigurableKt.openLlmSettingsDialog($project);
/*  61 */     $notification.expire();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static final void showRequestFailedNotification(@NotNull Project project, @NotNull String message) {
/*  67 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(message, "message"); createNotificationGroup().createNotification(
/*  68 */         LLMBundle.message("notification.request.failed.title", new Object[0]), 
/*  69 */         message, 
/*  70 */         NotificationType.WARNING)
/*  71 */       .notify(project);
/*     */   }
/*     */ 
/*     */   
/*     */   public static final void showScoreNotification(@NotNull Project project, @NotNull StatisticsIdeActivities activity) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'project'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'activity'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: invokestatic createNotificationGroup : ()Lcom/intellij/notification/NotificationGroup;
/*     */     //   15: ldc 'notification.generation.score.message'
/*     */     //   17: iconst_0
/*     */     //   18: anewarray java/lang/Object
/*     */     //   21: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   24: getstatic com/intellij/notification/NotificationType.INFORMATION : Lcom/intellij/notification/NotificationType;
/*     */     //   27: invokevirtual createNotification : (Ljava/lang/String;Lcom/intellij/notification/NotificationType;)Lcom/intellij/notification/Notification;
/*     */     //   30: astore_2
/*     */     //   31: aload_2
/*     */     //   32: ldc 'notification.generation.score.yes.action'
/*     */     //   34: iconst_0
/*     */     //   35: anewarray java/lang/Object
/*     */     //   38: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   41: aload_1
/*     */     //   42: aload_2
/*     */     //   43: <illegal opcode> run : (Lcom/intellij/ml/llm/core/statistics/StatisticsIdeActivities;Lcom/intellij/notification/Notification;)Ljava/lang/Runnable;
/*     */     //   48: invokestatic createSimple : (Ljava/lang/String;Ljava/lang/Runnable;)Lcom/intellij/notification/NotificationAction;
/*     */     //   51: checkcast com/intellij/openapi/actionSystem/AnAction
/*     */     //   54: invokevirtual addAction : (Lcom/intellij/openapi/actionSystem/AnAction;)Lcom/intellij/notification/Notification;
/*     */     //   57: pop
/*     */     //   58: aload_2
/*     */     //   59: ldc 'notification.generation.score.no.action'
/*     */     //   61: iconst_0
/*     */     //   62: anewarray java/lang/Object
/*     */     //   65: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   68: aload_1
/*     */     //   69: aload_2
/*     */     //   70: <illegal opcode> run : (Lcom/intellij/ml/llm/core/statistics/StatisticsIdeActivities;Lcom/intellij/notification/Notification;)Ljava/lang/Runnable;
/*     */     //   75: invokestatic createSimple : (Ljava/lang/String;Ljava/lang/Runnable;)Lcom/intellij/notification/NotificationAction;
/*     */     //   78: checkcast com/intellij/openapi/actionSystem/AnAction
/*     */     //   81: invokevirtual addAction : (Lcom/intellij/openapi/actionSystem/AnAction;)Lcom/intellij/notification/Notification;
/*     */     //   84: pop
/*     */     //   85: aload_2
/*     */     //   86: aload_0
/*     */     //   87: invokevirtual notify : (Lcom/intellij/openapi/project/Project;)V
/*     */     //   90: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #75	-> 12
/*     */     //   #76	-> 15
/*     */     //   #77	-> 24
/*     */     //   #75	-> 27
/*     */     //   #80	-> 31
/*     */     //   #84	-> 58
/*     */     //   #88	-> 85
/*     */     //   #89	-> 90
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   31	60	2	notification	Lcom/intellij/notification/Notification;
/*     */     //   0	91	0	project	Lcom/intellij/openapi/project/Project;
/*     */     //   0	91	1	activity	Lcom/intellij/ml/llm/core/statistics/StatisticsIdeActivities;
/*     */   }
/*     */ 
/*     */   
/*     */   private static final void showScoreNotification$lambda$2(StatisticsIdeActivities $activity, Notification $notification) {
/*  81 */     Intrinsics.checkNotNullParameter($activity, "$activity"); Intrinsics.checkNotNullParameter($notification, "$notification"); $activity.scored(ScoreResult.YES);
/*  82 */     $notification.expire();
/*     */   }
/*     */   private static final void showScoreNotification$lambda$3(StatisticsIdeActivities $activity, Notification $notification) {
/*  85 */     Intrinsics.checkNotNullParameter($activity, "$activity"); Intrinsics.checkNotNullParameter($notification, "$notification"); $activity.scored(ScoreResult.NO);
/*  86 */     $notification.expire();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final void showScoreNotificationInlay(@NotNull Project project, @NotNull Editor editor, @NotNull StatisticsIdeActivities activity, int startOffset) {
/*  95 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(editor, "editor"); Intrinsics.checkNotNullParameter(activity, "activity"); String likeText = "  Yes ";
/*  96 */     String dislikeText = " No ";
/*  97 */     PresentationFactory factory = new PresentationFactory(editor);
/*  98 */     CoroutineScope scope = LLMCoroutineScope.Companion.getScope(project);
/*  99 */     Cursor onHoverCursor = Cursor.getPredefinedCursor(12);
/*     */     
/* 101 */     BuildersKt.launch$default(scope, null, null, new NotificationsKt$showScoreNotificationInlay$1(factory, likeText, editor, onHoverCursor, dislikeText, activity, startOffset, scope, null), 3, null); } @DebugMetadata(f = "Notifications.kt", l = {135}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.NotificationsKt$showScoreNotificationInlay$1") @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class NotificationsKt$showScoreNotificationInlay$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { int label; NotificationsKt$showScoreNotificationInlay$1(PresentationFactory $factory, String $likeText, Editor $editor, Cursor $onHoverCursor, String $dislikeText, StatisticsIdeActivities $activity, int $startOffset, CoroutineScope $scope, Continuation $completion) { super(2, $completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { FeedbackButtonInlayPresentation like, dislike; InlayTextMetrics metrics; int topOffset; InsetPresentation result; InlayPresentation[] arrayOfInlayPresentation; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 106 */           Intrinsics.checkNotNullExpressionValue(this.$onHoverCursor, "onHoverCursor"); like = new FeedbackButtonInlayPresentation(this.$factory.text(this.$likeText), (InlayPresentation)this.$factory.withReferenceAttributes(this.$factory.text(this.$likeText)), this.$editor, this.$onHoverCursor);
/*     */ 
/*     */           
/* 109 */           like.addOnClickListener(new Function0<Unit>(this.$activity) { public final void invoke() {
/* 110 */                   this.$activity.scored(ScoreResult.YES);
/*     */                 } }
/*     */             );
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 117 */           Intrinsics.checkNotNullExpressionValue(this.$onHoverCursor, "onHoverCursor"); dislike = new FeedbackButtonInlayPresentation(this.$factory.text(this.$dislikeText), (InlayPresentation)this.$factory.withReferenceAttributes(this.$factory.text(this.$dislikeText)), this.$editor, this.$onHoverCursor);
/*     */ 
/*     */           
/* 120 */           dislike.addOnClickListener(new Function0<Unit>(this.$activity) { public final void invoke() {
/* 121 */                   this.$activity.scored(ScoreResult.NO);
/*     */                 } }
/*     */             );
/* 124 */           metrics = (new InlayTextMetricsStorage(this.$editor)).getFontMetrics(false);
/*     */           
/* 126 */           topOffset = (metrics.getLineHeight() - metrics.getFontHeight()) / 2;
/*     */ 
/*     */           
/* 129 */           arrayOfInlayPresentation = new InlayPresentation[3]; arrayOfInlayPresentation[0] = this.$factory.text(LLMBundle.message("notification.generation.score.message", new Object[0])); arrayOfInlayPresentation[1] = 
/* 130 */             (InlayPresentation)like;
/* 131 */           arrayOfInlayPresentation[2] = (InlayPresentation)dislike;
/* 132 */           result = new InsetPresentation(this.$factory.seq(arrayOfInlayPresentation), 0, 0, topOffset, 0, 22, null);
/*     */ 
/*     */           
/* 135 */           this.label = 1; if (CoroutinesKt.writeAction(new Function0<Unit>(this.$editor, this.$startOffset, result, this.$scope, like, dislike) {
/* 136 */                 public final void invoke() { Intrinsics.checkNotNullExpressionValue(this.$editor.getInlayModel().getAfterLineEndElementsInRange(this.$startOffset, this.$startOffset), "editor.inlayModel.getAft…startOffset, startOffset)"); List offsetInlays = this.$editor.getInlayModel().getAfterLineEndElementsInRange(this.$startOffset, this.$startOffset);
/* 137 */                   if (!offsetInlays.isEmpty())
/*     */                     return; 
/* 139 */                   Inlay<PresentationRenderer> inlay = 
/* 140 */                     this.$editor.getInlayModel().addAfterLineEndElement(this.$startOffset, true, (EditorCustomElementRenderer)new PresentationRenderer((InlayPresentation)this.$result));
/*     */ 
/*     */ 
/*     */                   
/* 144 */                   if (inlay != null) { Inlay<PresentationRenderer> inlay1 = inlay; FeedbackButtonInlayPresentation feedbackButtonInlayPresentation1 = this.$like, feedbackButtonInlayPresentation2 = this.$dislike; Inlay<PresentationRenderer> it = inlay1; int $i$a$-let-NotificationsKt$showScoreNotificationInlay$1$3$1 = 0;
/* 145 */                     Function0<Unit> repaintOnChange = new NotificationsKt$showScoreNotificationInlay$1$3$1$repaintOnChange$1(it);
/*     */                     
/* 147 */                     feedbackButtonInlayPresentation1.addOnStateChangedListener(repaintOnChange);
/* 148 */                     feedbackButtonInlayPresentation2.addOnStateChangedListener(repaintOnChange);
/*     */                     
/* 150 */                     Function0<Unit> disposeOnClick = new NotificationsKt$showScoreNotificationInlay$1$3$1$disposeOnClick$1(it);
/*     */                     
/* 152 */                     feedbackButtonInlayPresentation1.addOnClickListener(disposeOnClick);
/* 153 */                     feedbackButtonInlayPresentation2.addOnClickListener(disposeOnClick); }
/*     */                   else
/*     */                   {  }
/* 156 */                    BuildersKt.launch$default(this.$scope, null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(inlay, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { // Byte code:
/*     */                           //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                           //   3: astore_2
/*     */                           //   4: aload_0
/*     */                           //   5: getfield label : I
/*     */                           //   8: tableswitch default -> 125, 0 -> 36, 1 -> 69, 2 -> 115
/*     */                           //   36: aload_1
/*     */                           //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                           //   40: aload_0
/*     */                           //   41: getfield $inlay : Lcom/intellij/openapi/editor/Inlay;
/*     */                           //   44: ifnull -> 121
/*     */                           //   47: ldc2_w 20000
/*     */                           //   50: aload_0
/*     */                           //   51: checkcast kotlin/coroutines/Continuation
/*     */                           //   54: aload_0
/*     */                           //   55: iconst_1
/*     */                           //   56: putfield label : I
/*     */                           //   59: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                           //   62: dup
/*     */                           //   63: aload_2
/*     */                           //   64: if_acmpne -> 74
/*     */                           //   67: aload_2
/*     */                           //   68: areturn
/*     */                           //   69: aload_1
/*     */                           //   70: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                           //   73: aload_1
/*     */                           //   74: pop
/*     */                           //   75: getstatic kotlinx/coroutines/Dispatchers.INSTANCE : Lkotlinx/coroutines/Dispatchers;
/*     */                           //   78: invokestatic getEDT : (Lkotlinx/coroutines/Dispatchers;)Lkotlin/coroutines/CoroutineContext;
/*     */                           //   81: new com/intellij/ml/llm/core/NotificationsKt$showScoreNotificationInlay$1$3$2$1
/*     */                           //   84: dup
/*     */                           //   85: aload_0
/*     */                           //   86: getfield $inlay : Lcom/intellij/openapi/editor/Inlay;
/*     */                           //   89: aconst_null
/*     */                           //   90: invokespecial <init> : (Lcom/intellij/openapi/editor/Inlay;Lkotlin/coroutines/Continuation;)V
/*     */                           //   93: checkcast kotlin/jvm/functions/Function2
/*     */                           //   96: aload_0
/*     */                           //   97: checkcast kotlin/coroutines/Continuation
/*     */                           //   100: aload_0
/*     */                           //   101: iconst_2
/*     */                           //   102: putfield label : I
/*     */                           //   105: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                           //   108: dup
/*     */                           //   109: aload_2
/*     */                           //   110: if_acmpne -> 120
/*     */                           //   113: aload_2
/*     */                           //   114: areturn
/*     */                           //   115: aload_1
/*     */                           //   116: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                           //   119: aload_1
/*     */                           //   120: pop
/*     */                           //   121: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */                           //   124: areturn
/*     */                           //   125: new java/lang/IllegalStateException
/*     */                           //   128: dup
/*     */                           //   129: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                           //   131: invokespecial <init> : (Ljava/lang/String;)V
/*     */                           //   134: athrow
/*     */                           // Line number table:
/*     */                           //   Java source line number -> byte code offset
/*     */                           //   #156	-> 3
/*     */                           //   #157	-> 40
/*     */                           //   #158	-> 47
/*     */                           //   #156	-> 67
/*     */                           //   #159	-> 74
/*     */                           //   #156	-> 113
/*     */                           //   #163	-> 120
/*     */                           //   #156	-> 125
/*     */                           // Local variable table:
/*     */                           //   start	length	slot	name	descriptor
/*     */                           //   40	85	0	this	Lcom/intellij/ml/llm/core/NotificationsKt$showScoreNotificationInlay$1$3$2;
/* 156 */                           //   40	85	1	$result	Ljava/lang/Object; } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$inlay, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }3, null); } }(Continuation)this) == object) return object;  CoroutinesKt.writeAction(new Function0<Unit>(this.$editor, this.$startOffset, result, this.$scope, like, dislike) { public final void invoke() { Intrinsics.checkNotNullExpressionValue(this.$editor.getInlayModel().getAfterLineEndElementsInRange(this.$startOffset, this.$startOffset), "editor.inlayModel.getAft…startOffset, startOffset)"); List offsetInlays = this.$editor.getInlayModel().getAfterLineEndElementsInRange(this.$startOffset, this.$startOffset); if (!offsetInlays.isEmpty()) return;  Inlay<PresentationRenderer> inlay = this.$editor.getInlayModel().addAfterLineEndElement(this.$startOffset, true, (EditorCustomElementRenderer)new PresentationRenderer((InlayPresentation)this.$result)); if (inlay != null) { Inlay<PresentationRenderer> inlay1 = inlay; FeedbackButtonInlayPresentation feedbackButtonInlayPresentation1 = this.$like, feedbackButtonInlayPresentation2 = this.$dislike; Inlay<PresentationRenderer> it = inlay1; int $i$a$-let-NotificationsKt$showScoreNotificationInlay$1$3$1 = 0; Function0<Unit> repaintOnChange = new NotificationsKt$showScoreNotificationInlay$1$3$1$repaintOnChange$1(it); feedbackButtonInlayPresentation1.addOnStateChangedListener(repaintOnChange); feedbackButtonInlayPresentation2.addOnStateChangedListener(repaintOnChange); Function0<Unit> disposeOnClick = new NotificationsKt$showScoreNotificationInlay$1$3$1$disposeOnClick$1(it); feedbackButtonInlayPresentation1.addOnClickListener(disposeOnClick); feedbackButtonInlayPresentation2.addOnClickListener(disposeOnClick); } else {  }  BuildersKt.launch$default(this.$scope, null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(inlay, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { // Byte code:
/*     */                           //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                           //   3: astore_2
/*     */                           //   4: aload_0
/*     */                           //   5: getfield label : I
/*     */                           //   8: tableswitch default -> 125, 0 -> 36, 1 -> 69, 2 -> 115
/*     */                           //   36: aload_1
/*     */                           //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                           //   40: aload_0
/*     */                           //   41: getfield $inlay : Lcom/intellij/openapi/editor/Inlay;
/*     */                           //   44: ifnull -> 121
/*     */                           //   47: ldc2_w 20000
/*     */                           //   50: aload_0
/*     */                           //   51: checkcast kotlin/coroutines/Continuation
/*     */                           //   54: aload_0
/*     */                           //   55: iconst_1
/*     */                           //   56: putfield label : I
/*     */                           //   59: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                           //   62: dup
/*     */                           //   63: aload_2
/*     */                           //   64: if_acmpne -> 74
/*     */                           //   67: aload_2
/*     */                           //   68: areturn
/*     */                           //   69: aload_1
/*     */                           //   70: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                           //   73: aload_1
/*     */                           //   74: pop
/*     */                           //   75: getstatic kotlinx/coroutines/Dispatchers.INSTANCE : Lkotlinx/coroutines/Dispatchers;
/*     */                           //   78: invokestatic getEDT : (Lkotlinx/coroutines/Dispatchers;)Lkotlin/coroutines/CoroutineContext;
/*     */                           //   81: new com/intellij/ml/llm/core/NotificationsKt$showScoreNotificationInlay$1$3$2$1
/*     */                           //   84: dup
/*     */                           //   85: aload_0
/*     */                           //   86: getfield $inlay : Lcom/intellij/openapi/editor/Inlay;
/*     */                           //   89: aconst_null
/*     */                           //   90: invokespecial <init> : (Lcom/intellij/openapi/editor/Inlay;Lkotlin/coroutines/Continuation;)V
/*     */                           //   93: checkcast kotlin/jvm/functions/Function2
/*     */                           //   96: aload_0
/*     */                           //   97: checkcast kotlin/coroutines/Continuation
/*     */                           //   100: aload_0
/*     */                           //   101: iconst_2
/*     */                           //   102: putfield label : I
/*     */                           //   105: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                           //   108: dup
/*     */                           //   109: aload_2
/*     */                           //   110: if_acmpne -> 120
/*     */                           //   113: aload_2
/*     */                           //   114: areturn
/*     */                           //   115: aload_1
/*     */                           //   116: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                           //   119: aload_1
/*     */                           //   120: pop
/*     */                           //   121: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */                           //   124: areturn
/*     */                           //   125: new java/lang/IllegalStateException
/*     */                           //   128: dup
/*     */                           //   129: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                           //   131: invokespecial <init> : (Ljava/lang/String;)V
/*     */                           //   134: athrow
/*     */                           // Line number table:
/*     */                           //   Java source line number -> byte code offset
/*     */                           //   #156	-> 3
/*     */                           //   #157	-> 40
/*     */                           //   #158	-> 47
/*     */                           //   #156	-> 67
/*     */                           //   #159	-> 74
/*     */                           //   #156	-> 113
/*     */                           //   #163	-> 120
/*     */                           //   #156	-> 125
/*     */                           // Local variable table:
/*     */                           //   start	length	slot	name	descriptor
/*     */                           //   40	85	0	this	Lcom/intellij/ml/llm/core/NotificationsKt$showScoreNotificationInlay$1$3$2;
/* 156 */                           //   40	85	1	$result	Ljava/lang/Object; } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$inlay, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }3, null); }
/*     */                  }
/*     */               (Continuation)this);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 165 */           return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super NotificationsKt$showScoreNotificationInlay$1> $completion) {
/*     */       return (Continuation<Unit>)new NotificationsKt$showScoreNotificationInlay$1(this.$factory, this.$likeText, this.$editor, this.$onHoverCursor, this.$dislikeText, this.$activity, this.$startOffset, this.$scope, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */       return ((NotificationsKt$showScoreNotificationInlay$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/NotificationsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */