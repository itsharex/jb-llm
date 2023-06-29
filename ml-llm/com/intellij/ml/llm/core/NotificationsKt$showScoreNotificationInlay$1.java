/*     */ package com.intellij.ml.llm.core;
/*     */ 
/*     */ import com.intellij.codeInsight.hints.presentation.InlayPresentation;
/*     */ import com.intellij.codeInsight.hints.presentation.InlayTextMetrics;
/*     */ import com.intellij.codeInsight.hints.presentation.InlayTextMetricsStorage;
/*     */ import com.intellij.codeInsight.hints.presentation.InsetPresentation;
/*     */ import com.intellij.codeInsight.hints.presentation.PresentationFactory;
/*     */ import com.intellij.codeInsight.hints.presentation.PresentationRenderer;
/*     */ import com.intellij.ml.llm.LLMBundle;
/*     */ import com.intellij.ml.llm.core.statistics.ScoreResult;
/*     */ import com.intellij.ml.llm.core.statistics.StatisticsIdeActivities;
/*     */ import com.intellij.openapi.Disposable;
/*     */ import com.intellij.openapi.application.CoroutinesKt;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.editor.EditorCustomElementRenderer;
/*     */ import com.intellij.openapi.editor.Inlay;
/*     */ import com.intellij.openapi.util.Disposer;
/*     */ import java.awt.Cursor;
/*     */ import java.util.List;
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
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @DebugMetadata(f = "Notifications.kt", l = {135}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.NotificationsKt$showScoreNotificationInlay$1")
/*     */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ final class NotificationsKt$showScoreNotificationInlay$1
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   NotificationsKt$showScoreNotificationInlay$1(PresentationFactory $factory, String $likeText, Editor $editor, Cursor $onHoverCursor, String $dislikeText, StatisticsIdeActivities $activity, int $startOffset, CoroutineScope $scope, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object invokeSuspend(@NotNull Object $result) {
/*     */     FeedbackButtonInlayPresentation like, dislike;
/*     */     InlayTextMetrics metrics;
/*     */     int topOffset;
/*     */     InsetPresentation result;
/*     */     InlayPresentation[] arrayOfInlayPresentation;
/* 101 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 106 */         Intrinsics.checkNotNullExpressionValue(this.$onHoverCursor, "onHoverCursor"); like = new FeedbackButtonInlayPresentation(this.$factory.text(this.$likeText), (InlayPresentation)this.$factory.withReferenceAttributes(this.$factory.text(this.$likeText)), this.$editor, this.$onHoverCursor);
/*     */ 
/*     */         
/* 109 */         like.addOnClickListener(new Function0<Unit>(this.$activity) { public final void invoke() {
/* 110 */                 this.$activity.scored(ScoreResult.YES);
/*     */               } }
/*     */           );
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 117 */         Intrinsics.checkNotNullExpressionValue(this.$onHoverCursor, "onHoverCursor"); dislike = new FeedbackButtonInlayPresentation(this.$factory.text(this.$dislikeText), (InlayPresentation)this.$factory.withReferenceAttributes(this.$factory.text(this.$dislikeText)), this.$editor, this.$onHoverCursor);
/*     */ 
/*     */         
/* 120 */         dislike.addOnClickListener(new Function0<Unit>(this.$activity) { public final void invoke() {
/* 121 */                 this.$activity.scored(ScoreResult.NO);
/*     */               } }
/*     */           );
/* 124 */         metrics = (new InlayTextMetricsStorage(this.$editor)).getFontMetrics(false);
/*     */         
/* 126 */         topOffset = (metrics.getLineHeight() - metrics.getFontHeight()) / 2;
/*     */ 
/*     */         
/* 129 */         arrayOfInlayPresentation = new InlayPresentation[3]; arrayOfInlayPresentation[0] = this.$factory.text(LLMBundle.message("notification.generation.score.message", new Object[0])); arrayOfInlayPresentation[1] = 
/* 130 */           (InlayPresentation)like;
/* 131 */         arrayOfInlayPresentation[2] = (InlayPresentation)dislike;
/* 132 */         result = new InsetPresentation(this.$factory.seq(arrayOfInlayPresentation), 0, 0, topOffset, 0, 22, null);
/*     */ 
/*     */         
/* 135 */         this.label = 1; if (CoroutinesKt.writeAction(new Function0<Unit>(this.$editor, this.$startOffset, result, this.$scope, like, dislike) {
/* 136 */               public final void invoke() { Intrinsics.checkNotNullExpressionValue(this.$editor.getInlayModel().getAfterLineEndElementsInRange(this.$startOffset, this.$startOffset), "editor.inlayModel.getAft…startOffset, startOffset)"); List offsetInlays = this.$editor.getInlayModel().getAfterLineEndElementsInRange(this.$startOffset, this.$startOffset);
/* 137 */                 if (!offsetInlays.isEmpty())
/*     */                   return; 
/* 139 */                 Inlay<PresentationRenderer> inlay = 
/* 140 */                   this.$editor.getInlayModel().addAfterLineEndElement(this.$startOffset, true, (EditorCustomElementRenderer)new PresentationRenderer((InlayPresentation)this.$result));
/*     */ 
/*     */ 
/*     */                 
/* 144 */                 if (inlay != null) { Inlay<PresentationRenderer> inlay1 = inlay; FeedbackButtonInlayPresentation feedbackButtonInlayPresentation1 = this.$like, feedbackButtonInlayPresentation2 = this.$dislike; Inlay<PresentationRenderer> it = inlay1; int $i$a$-let-NotificationsKt$showScoreNotificationInlay$1$3$1 = 0;
/* 145 */                   Function0<Unit> repaintOnChange = new NotificationsKt$showScoreNotificationInlay$1$3$1$repaintOnChange$1(it);
/*     */                   
/* 147 */                   feedbackButtonInlayPresentation1.addOnStateChangedListener(repaintOnChange);
/* 148 */                   feedbackButtonInlayPresentation2.addOnStateChangedListener(repaintOnChange);
/*     */                   
/* 150 */                   Function0<Unit> disposeOnClick = new NotificationsKt$showScoreNotificationInlay$1$3$1$disposeOnClick$1(it);
/*     */                   
/* 152 */                   feedbackButtonInlayPresentation1.addOnClickListener(disposeOnClick);
/* 153 */                   feedbackButtonInlayPresentation2.addOnClickListener(disposeOnClick); }
/*     */                 else
/*     */                 {  }
/* 156 */                  BuildersKt.launch$default(this.$scope, null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(inlay, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { // Byte code:
/*     */                         //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                         //   3: astore_2
/*     */                         //   4: aload_0
/*     */                         //   5: getfield label : I
/*     */                         //   8: tableswitch default -> 125, 0 -> 36, 1 -> 69, 2 -> 115
/*     */                         //   36: aload_1
/*     */                         //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                         //   40: aload_0
/*     */                         //   41: getfield $inlay : Lcom/intellij/openapi/editor/Inlay;
/*     */                         //   44: ifnull -> 121
/*     */                         //   47: ldc2_w 20000
/*     */                         //   50: aload_0
/*     */                         //   51: checkcast kotlin/coroutines/Continuation
/*     */                         //   54: aload_0
/*     */                         //   55: iconst_1
/*     */                         //   56: putfield label : I
/*     */                         //   59: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                         //   62: dup
/*     */                         //   63: aload_2
/*     */                         //   64: if_acmpne -> 74
/*     */                         //   67: aload_2
/*     */                         //   68: areturn
/*     */                         //   69: aload_1
/*     */                         //   70: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                         //   73: aload_1
/*     */                         //   74: pop
/*     */                         //   75: getstatic kotlinx/coroutines/Dispatchers.INSTANCE : Lkotlinx/coroutines/Dispatchers;
/*     */                         //   78: invokestatic getEDT : (Lkotlinx/coroutines/Dispatchers;)Lkotlin/coroutines/CoroutineContext;
/*     */                         //   81: new com/intellij/ml/llm/core/NotificationsKt$showScoreNotificationInlay$1$3$2$1
/*     */                         //   84: dup
/*     */                         //   85: aload_0
/*     */                         //   86: getfield $inlay : Lcom/intellij/openapi/editor/Inlay;
/*     */                         //   89: aconst_null
/*     */                         //   90: invokespecial <init> : (Lcom/intellij/openapi/editor/Inlay;Lkotlin/coroutines/Continuation;)V
/*     */                         //   93: checkcast kotlin/jvm/functions/Function2
/*     */                         //   96: aload_0
/*     */                         //   97: checkcast kotlin/coroutines/Continuation
/*     */                         //   100: aload_0
/*     */                         //   101: iconst_2
/*     */                         //   102: putfield label : I
/*     */                         //   105: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                         //   108: dup
/*     */                         //   109: aload_2
/*     */                         //   110: if_acmpne -> 120
/*     */                         //   113: aload_2
/*     */                         //   114: areturn
/*     */                         //   115: aload_1
/*     */                         //   116: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                         //   119: aload_1
/*     */                         //   120: pop
/*     */                         //   121: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */                         //   124: areturn
/*     */                         //   125: new java/lang/IllegalStateException
/*     */                         //   128: dup
/*     */                         //   129: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                         //   131: invokespecial <init> : (Ljava/lang/String;)V
/*     */                         //   134: athrow
/*     */                         // Line number table:
/*     */                         //   Java source line number -> byte code offset
/*     */                         //   #156	-> 3
/*     */                         //   #157	-> 40
/*     */                         //   #158	-> 47
/*     */                         //   #156	-> 67
/*     */                         //   #159	-> 74
/*     */                         //   #156	-> 113
/*     */                         //   #163	-> 120
/*     */                         //   #156	-> 125
/*     */                         // Local variable table:
/*     */                         //   start	length	slot	name	descriptor
/*     */                         //   40	85	0	this	Lcom/intellij/ml/llm/core/NotificationsKt$showScoreNotificationInlay$1$3$2;
/* 156 */                         //   40	85	1	$result	Ljava/lang/Object; } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$inlay, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }3, null); } }(Continuation)this) == object) return object;  CoroutinesKt.writeAction(new Function0<Unit>(this.$editor, this.$startOffset, result, this.$scope, like, dislike) { public final void invoke() { Intrinsics.checkNotNullExpressionValue(this.$editor.getInlayModel().getAfterLineEndElementsInRange(this.$startOffset, this.$startOffset), "editor.inlayModel.getAft…startOffset, startOffset)"); List offsetInlays = this.$editor.getInlayModel().getAfterLineEndElementsInRange(this.$startOffset, this.$startOffset); if (!offsetInlays.isEmpty()) return;  Inlay<PresentationRenderer> inlay = this.$editor.getInlayModel().addAfterLineEndElement(this.$startOffset, true, (EditorCustomElementRenderer)new PresentationRenderer((InlayPresentation)this.$result)); if (inlay != null) { Inlay<PresentationRenderer> inlay1 = inlay; FeedbackButtonInlayPresentation feedbackButtonInlayPresentation1 = this.$like, feedbackButtonInlayPresentation2 = this.$dislike; Inlay<PresentationRenderer> it = inlay1; int $i$a$-let-NotificationsKt$showScoreNotificationInlay$1$3$1 = 0; Function0<Unit> repaintOnChange = new NotificationsKt$showScoreNotificationInlay$1$3$1$repaintOnChange$1(it); feedbackButtonInlayPresentation1.addOnStateChangedListener(repaintOnChange); feedbackButtonInlayPresentation2.addOnStateChangedListener(repaintOnChange); Function0<Unit> disposeOnClick = new NotificationsKt$showScoreNotificationInlay$1$3$1$disposeOnClick$1(it); feedbackButtonInlayPresentation1.addOnClickListener(disposeOnClick); feedbackButtonInlayPresentation2.addOnClickListener(disposeOnClick); } else {  }  BuildersKt.launch$default(this.$scope, null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(inlay, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { // Byte code:
/*     */                         //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                         //   3: astore_2
/*     */                         //   4: aload_0
/*     */                         //   5: getfield label : I
/*     */                         //   8: tableswitch default -> 125, 0 -> 36, 1 -> 69, 2 -> 115
/*     */                         //   36: aload_1
/*     */                         //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                         //   40: aload_0
/*     */                         //   41: getfield $inlay : Lcom/intellij/openapi/editor/Inlay;
/*     */                         //   44: ifnull -> 121
/*     */                         //   47: ldc2_w 20000
/*     */                         //   50: aload_0
/*     */                         //   51: checkcast kotlin/coroutines/Continuation
/*     */                         //   54: aload_0
/*     */                         //   55: iconst_1
/*     */                         //   56: putfield label : I
/*     */                         //   59: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                         //   62: dup
/*     */                         //   63: aload_2
/*     */                         //   64: if_acmpne -> 74
/*     */                         //   67: aload_2
/*     */                         //   68: areturn
/*     */                         //   69: aload_1
/*     */                         //   70: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                         //   73: aload_1
/*     */                         //   74: pop
/*     */                         //   75: getstatic kotlinx/coroutines/Dispatchers.INSTANCE : Lkotlinx/coroutines/Dispatchers;
/*     */                         //   78: invokestatic getEDT : (Lkotlinx/coroutines/Dispatchers;)Lkotlin/coroutines/CoroutineContext;
/*     */                         //   81: new com/intellij/ml/llm/core/NotificationsKt$showScoreNotificationInlay$1$3$2$1
/*     */                         //   84: dup
/*     */                         //   85: aload_0
/*     */                         //   86: getfield $inlay : Lcom/intellij/openapi/editor/Inlay;
/*     */                         //   89: aconst_null
/*     */                         //   90: invokespecial <init> : (Lcom/intellij/openapi/editor/Inlay;Lkotlin/coroutines/Continuation;)V
/*     */                         //   93: checkcast kotlin/jvm/functions/Function2
/*     */                         //   96: aload_0
/*     */                         //   97: checkcast kotlin/coroutines/Continuation
/*     */                         //   100: aload_0
/*     */                         //   101: iconst_2
/*     */                         //   102: putfield label : I
/*     */                         //   105: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                         //   108: dup
/*     */                         //   109: aload_2
/*     */                         //   110: if_acmpne -> 120
/*     */                         //   113: aload_2
/*     */                         //   114: areturn
/*     */                         //   115: aload_1
/*     */                         //   116: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                         //   119: aload_1
/*     */                         //   120: pop
/*     */                         //   121: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */                         //   124: areturn
/*     */                         //   125: new java/lang/IllegalStateException
/*     */                         //   128: dup
/*     */                         //   129: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                         //   131: invokespecial <init> : (Ljava/lang/String;)V
/*     */                         //   134: athrow
/*     */                         // Line number table:
/*     */                         //   Java source line number -> byte code offset
/*     */                         //   #156	-> 3
/*     */                         //   #157	-> 40
/*     */                         //   #158	-> 47
/*     */                         //   #156	-> 67
/*     */                         //   #159	-> 74
/*     */                         //   #156	-> 113
/*     */                         //   #163	-> 120
/*     */                         //   #156	-> 125
/*     */                         // Local variable table:
/*     */                         //   start	length	slot	name	descriptor
/*     */                         //   40	85	0	this	Lcom/intellij/ml/llm/core/NotificationsKt$showScoreNotificationInlay$1$3$2;
/* 156 */                         //   40	85	1	$result	Ljava/lang/Object; } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$inlay, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }3, null); }
/*     */                }
/*     */             (Continuation)this);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 165 */         return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super NotificationsKt$showScoreNotificationInlay$1> $completion) {
/*     */     return (Continuation<Unit>)new NotificationsKt$showScoreNotificationInlay$1(this.$factory, this.$likeText, this.$editor, this.$onHoverCursor, this.$dislikeText, this.$activity, this.$startOffset, this.$scope, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */     return ((NotificationsKt$showScoreNotificationInlay$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/NotificationsKt$showScoreNotificationInlay$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */