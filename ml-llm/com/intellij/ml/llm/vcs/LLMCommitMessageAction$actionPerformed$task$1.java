/*     */ package com.intellij.ml.llm.vcs;
/*     */ 
/*     */ import ai.grazie.model.llm.chat.LLMChat;
/*     */ import ai.grazie.model.llm.chat.LLMChatRole;
/*     */ import com.intellij.icons.ExpUiIcons;
/*     */ import com.intellij.ml.llm.MLLlmIcons;
/*     */ import com.intellij.ml.llm.core.statistics.CommonLoggerService;
/*     */ import com.intellij.ml.llm.core.statistics.CompositeStatisticsIdeActivity;
/*     */ import com.intellij.ml.llm.core.statistics.FinishState;
/*     */ import com.intellij.ml.llm.core.tokenizer.Tokenizer;
/*     */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*     */ import com.intellij.openapi.application.CoroutinesKt;
/*     */ import com.intellij.openapi.progress.CoroutinesKt;
/*     */ import com.intellij.openapi.progress.ProgressIndicator;
/*     */ import com.intellij.openapi.progress.Task;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.vcs.changes.Change;
/*     */ import com.intellij.openapi.vcs.ui.CommitMessage;
/*     */ import com.intellij.ui.EditorTextField;
/*     */ import java.util.Collection;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.Dispatchers;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\031\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\003\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026J\b\020\004\032\0020\003H\026J\020\020\005\032\0020\0032\006\020\006\032\0020\007H\026¨\006\b"}, d2 = {"com/intellij/ml/llm/vcs/LLMCommitMessageAction$actionPerformed$task$1", "Lcom/intellij/openapi/progress/Task$Backgroundable;", "onCancel", "", "onFinished", "run", "indicator", "Lcom/intellij/openapi/progress/ProgressIndicator;", "intellij.ml.llm"})
/*     */ public final class LLMCommitMessageAction$actionPerformed$task$1
/*     */   extends Task.Backgroundable
/*     */ {
/*     */   LLMCommitMessageAction$actionPerformed$task$1(AnActionEvent $e, LLMCommitMessageAction $receiver, Collection<Change> $includedSet, int $numberOfFiles, CompositeStatisticsIdeActivity $activity, CommitMessage $commitMessageUi, String $super_call_param$1) {
/*  78 */     super($project, $super_call_param$1);
/*     */   } public void onFinished() {
/*  80 */     this.$e.getPresentation().setIcon(MLLlmIcons.AiAssistant);
/*     */   }
/*     */   
/*     */   public void run(@NotNull ProgressIndicator indicator) {
/*  84 */     Intrinsics.checkNotNullParameter(indicator, "indicator"); LLMCommitMessageAction.access$setProgressIndicator$p(LLMCommitMessageAction.this, indicator);
/*  85 */     this.$e.getPresentation().setIcon(ExpUiIcons.Run.Stop);
/*  86 */     CoroutinesKt.runBlockingCancellable(new LLMCommitMessageAction$actionPerformed$task$1$run$1(LLMCommitMessageAction.this, this.$includedSet, this.$numberOfFiles, this.$activity, this.$commitMessageUi, null));
/*     */   } @DebugMetadata(f = "LLMCommitMessageAction.kt", l = {87, 92, 98}, i = {2}, s = {"L$0"}, n = {"messageBuilder"}, m = "invokeSuspend", c = "com.intellij.ml.llm.vcs.LLMCommitMessageAction$actionPerformed$task$1$run$1") @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class LLMCommitMessageAction$actionPerformed$task$1$run$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*     */   {
/*     */     Object L$0; int label; LLMCommitMessageAction$actionPerformed$task$1$run$1(LLMCommitMessageAction $receiver, Collection<Change> $includedSet, int $numberOfFiles, CompositeStatisticsIdeActivity $activity, CommitMessage $commitMessageUi, Continuation $completion) { super(2, $completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #14
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 377, 0 -> 40, 1 -> 75, 2 -> 173, 3 -> 252
/*     */       //   40: aload_1
/*     */       //   41: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   44: getstatic com/intellij/ml/llm/core/tokenizer/TokenizerAccessPointService.Companion : Lcom/intellij/ml/llm/core/tokenizer/TokenizerAccessPointService$Companion;
/*     */       //   47: aload_0
/*     */       //   48: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   51: invokevirtual getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/ml/llm/core/tokenizer/TokenizerAccessPointService;
/*     */       //   54: aload_0
/*     */       //   55: checkcast kotlin/coroutines/Continuation
/*     */       //   58: aload_0
/*     */       //   59: iconst_1
/*     */       //   60: putfield label : I
/*     */       //   63: invokevirtual getTokenizer : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   66: dup
/*     */       //   67: aload #14
/*     */       //   69: if_acmpne -> 80
/*     */       //   72: aload #14
/*     */       //   74: areturn
/*     */       //   75: aload_1
/*     */       //   76: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   79: aload_1
/*     */       //   80: checkcast com/intellij/ml/llm/core/tokenizer/Tokenizer
/*     */       //   83: astore_2
/*     */       //   84: aload_0
/*     */       //   85: getfield this$0 : Lcom/intellij/ml/llm/vcs/LLMCommitMessageAction;
/*     */       //   88: aload_0
/*     */       //   89: getfield $includedSet : Ljava/util/Collection;
/*     */       //   92: aload_0
/*     */       //   93: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   96: invokestatic access$calculateDiff : (Lcom/intellij/ml/llm/vcs/LLMCommitMessageAction;Ljava/util/Collection;Lcom/intellij/openapi/project/Project;)Ljava/lang/String;
/*     */       //   99: astore_3
/*     */       //   100: getstatic ai/grazie/model/llm/chat/LLMChat.Companion : Lai/grazie/model/llm/chat/LLMChat$Companion;
/*     */       //   103: new com/intellij/ml/llm/vcs/LLMCommitMessageAction$actionPerformed$task$1$run$1$chat$1
/*     */       //   106: dup
/*     */       //   107: aload_2
/*     */       //   108: aload_0
/*     */       //   109: getfield this$0 : Lcom/intellij/ml/llm/vcs/LLMCommitMessageAction;
/*     */       //   112: aload_3
/*     */       //   113: aload_0
/*     */       //   114: getfield $commitMessageUi : Lcom/intellij/openapi/vcs/ui/CommitMessage;
/*     */       //   117: invokespecial <init> : (Lcom/intellij/ml/llm/core/tokenizer/Tokenizer;Lcom/intellij/ml/llm/vcs/LLMCommitMessageAction;Ljava/lang/String;Lcom/intellij/openapi/vcs/ui/CommitMessage;)V
/*     */       //   120: checkcast kotlin/jvm/functions/Function1
/*     */       //   123: invokevirtual build : (Lkotlin/jvm/functions/Function1;)Lai/grazie/model/llm/chat/LLMChat;
/*     */       //   126: astore #4
/*     */       //   128: aload_0
/*     */       //   129: getfield this$0 : Lcom/intellij/ml/llm/vcs/LLMCommitMessageAction;
/*     */       //   132: aload_0
/*     */       //   133: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   136: aload_0
/*     */       //   137: getfield $numberOfFiles : I
/*     */       //   140: aload #4
/*     */       //   142: getstatic ai/grazie/model/llm/profile/OpenAIProfileIDs.INSTANCE : Lai/grazie/model/llm/profile/OpenAIProfileIDs;
/*     */       //   145: invokevirtual getGPT4 : ()Lai/grazie/model/llm/profile/LLMProfileID;
/*     */       //   148: aload_0
/*     */       //   149: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */       //   152: aload_0
/*     */       //   153: checkcast kotlin/coroutines/Continuation
/*     */       //   156: aload_0
/*     */       //   157: iconst_2
/*     */       //   158: putfield label : I
/*     */       //   161: invokestatic access$sendChatRequest : (Lcom/intellij/ml/llm/vcs/LLMCommitMessageAction;Lcom/intellij/openapi/project/Project;ILai/grazie/model/llm/chat/LLMChat;Lai/grazie/model/llm/profile/LLMProfileID;Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   164: dup
/*     */       //   165: aload #14
/*     */       //   167: if_acmpne -> 178
/*     */       //   170: aload #14
/*     */       //   172: areturn
/*     */       //   173: aload_1
/*     */       //   174: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   177: aload_1
/*     */       //   178: checkcast kotlinx/coroutines/flow/Flow
/*     */       //   181: astore #5
/*     */       //   183: aload #5
/*     */       //   185: ifnonnull -> 192
/*     */       //   188: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   191: areturn
/*     */       //   192: new java/lang/StringBuilder
/*     */       //   195: dup
/*     */       //   196: invokespecial <init> : ()V
/*     */       //   199: astore #6
/*     */       //   201: aload #5
/*     */       //   203: new com/intellij/ml/llm/vcs/LLMCommitMessageAction$actionPerformed$task$1$run$1$1
/*     */       //   206: dup
/*     */       //   207: aload #6
/*     */       //   209: aload_0
/*     */       //   210: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */       //   213: aload_0
/*     */       //   214: getfield $commitMessageUi : Lcom/intellij/openapi/vcs/ui/CommitMessage;
/*     */       //   217: invokespecial <init> : (Ljava/lang/StringBuilder;Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;Lcom/intellij/openapi/vcs/ui/CommitMessage;)V
/*     */       //   220: checkcast kotlinx/coroutines/flow/FlowCollector
/*     */       //   223: aload_0
/*     */       //   224: checkcast kotlin/coroutines/Continuation
/*     */       //   227: aload_0
/*     */       //   228: aload #6
/*     */       //   230: putfield L$0 : Ljava/lang/Object;
/*     */       //   233: aload_0
/*     */       //   234: iconst_3
/*     */       //   235: putfield label : I
/*     */       //   238: invokeinterface collect : (Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   243: dup
/*     */       //   244: aload #14
/*     */       //   246: if_acmpne -> 266
/*     */       //   249: aload #14
/*     */       //   251: areturn
/*     */       //   252: aload_0
/*     */       //   253: getfield L$0 : Ljava/lang/Object;
/*     */       //   256: checkcast java/lang/StringBuilder
/*     */       //   259: astore #6
/*     */       //   261: aload_1
/*     */       //   262: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   265: aload_1
/*     */       //   266: pop
/*     */       //   267: getstatic com/intellij/ml/llm/core/statistics/CommonLoggerService.Companion : Lcom/intellij/ml/llm/core/statistics/CommonLoggerService$Companion;
/*     */       //   270: invokevirtual getInstance : ()Lcom/intellij/ml/llm/core/statistics/CommonLoggerService;
/*     */       //   273: aload_0
/*     */       //   274: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */       //   277: aload_0
/*     */       //   278: getfield $numberOfFiles : I
/*     */       //   281: aload #6
/*     */       //   283: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   286: astore #7
/*     */       //   288: aload #7
/*     */       //   290: ldc 'messageBuilder.toString()'
/*     */       //   292: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   295: aload #7
/*     */       //   297: getstatic com/intellij/ml/llm/core/statistics/FinishState.SUCCEED : Lcom/intellij/ml/llm/core/statistics/FinishState;
/*     */       //   300: invokevirtual logCommitGenerationFinished : (Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;ILjava/lang/String;Lcom/intellij/ml/llm/core/statistics/FinishState;)V
/*     */       //   303: aload_0
/*     */       //   304: getfield $commitMessageUi : Lcom/intellij/openapi/vcs/ui/CommitMessage;
/*     */       //   307: invokevirtual getEditorField : ()Lcom/intellij/ui/EditorTextField;
/*     */       //   310: invokevirtual getEditor : ()Lcom/intellij/openapi/editor/Editor;
/*     */       //   313: dup
/*     */       //   314: ifnull -> 371
/*     */       //   317: astore #8
/*     */       //   319: aload_0
/*     */       //   320: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   323: astore #9
/*     */       //   325: aload_0
/*     */       //   326: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */       //   329: astore #10
/*     */       //   331: aload_0
/*     */       //   332: getfield $commitMessageUi : Lcom/intellij/openapi/vcs/ui/CommitMessage;
/*     */       //   335: astore #11
/*     */       //   337: aload #8
/*     */       //   339: astore #12
/*     */       //   341: iconst_0
/*     */       //   342: istore #13
/*     */       //   344: aload #9
/*     */       //   346: aload #12
/*     */       //   348: aload #10
/*     */       //   350: checkcast com/intellij/ml/llm/core/statistics/StatisticsIdeActivities
/*     */       //   353: aload #11
/*     */       //   355: invokevirtual getEditorField : ()Lcom/intellij/ui/EditorTextField;
/*     */       //   358: invokevirtual getText : ()Ljava/lang/String;
/*     */       //   361: invokevirtual length : ()I
/*     */       //   364: invokestatic showScoreNotificationInlay : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Editor;Lcom/intellij/ml/llm/core/statistics/StatisticsIdeActivities;I)V
/*     */       //   367: nop
/*     */       //   368: goto -> 373
/*     */       //   371: pop
/*     */       //   372: nop
/*     */       //   373: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   376: areturn
/*     */       //   377: new java/lang/IllegalStateException
/*     */       //   380: dup
/*     */       //   381: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   383: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   386: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #86	-> 3
/*     */       //   #87	-> 44
/*     */       //   #86	-> 72
/*     */       //   #88	-> 84
/*     */       //   #89	-> 100
/*     */       //   #92	-> 128
/*     */       //   #86	-> 170
/*     */       //   #93	-> 183
/*     */       //   #94	-> 188
/*     */       //   #97	-> 192
/*     */       //   #98	-> 201
/*     */       //   #86	-> 249
/*     */       //   #105	-> 266
/*     */       //   #106	-> 303
/*     */       //   #108	-> 344
/*     */       //   #107	-> 364
/*     */       //   #110	-> 367
/*     */       //   #106	-> 368
/*     */       //   #106	-> 371
/*     */       //   #111	-> 373
/*     */       //   #86	-> 377
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   84	44	2	tokenizer	Lcom/intellij/ml/llm/core/tokenizer/Tokenizer;
/*     */       //   100	28	3	diff	Ljava/lang/String;
/*     */       //   128	36	4	chat	Lai/grazie/model/llm/chat/LLMChat;
/*     */       //   183	5	5	flow	Lkotlinx/coroutines/flow/Flow;
/*     */       //   192	51	5	flow	Lkotlinx/coroutines/flow/Flow;
/*     */       //   201	51	6	messageBuilder	Ljava/lang/StringBuilder;
/*     */       //   261	27	6	messageBuilder	Ljava/lang/StringBuilder;
/*     */       //   341	27	12	it	Lcom/intellij/openapi/editor/Editor;
/*     */       //   344	24	13	$i$a$-let-LLMCommitMessageAction$actionPerformed$task$1$run$1$2	I
/*     */       //   44	333	0	this	Lcom/intellij/ml/llm/vcs/LLMCommitMessageAction$actionPerformed$task$1$run$1;
/*     */       //   44	333	1	$result	Ljava/lang/Object; } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super LLMCommitMessageAction$actionPerformed$task$1$run$1> $completion) { return (Continuation<Unit>)new LLMCommitMessageAction$actionPerformed$task$1$run$1(LLMCommitMessageAction.this, this.$includedSet, this.$numberOfFiles, this.$activity, this.$commitMessageUi, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((LLMCommitMessageAction$actionPerformed$task$1$run$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/llm/chat/LLMChat$Builder;", "invoke"}) static final class LLMCommitMessageAction$actionPerformed$task$1$run$1$chat$1 extends Lambda implements Function1<LLMChat.Builder, Unit> {
/*  90 */       public final void invoke(@NotNull LLMChat.Builder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); Intrinsics.checkNotNullExpressionValue(this.$commitMessageUi.getEditorField().getText(), "commitMessageUi.editorField.text"); $this$build.message(LLMChatRole.User, this.$tokenizer.trim(LLMCommitMessageAction.access$getInstruction(LLMCommitMessageAction.this, this.$diff, this.$commitMessageUi.getEditorField().getText()), 8192)); }
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
/*     */       LLMCommitMessageAction$actionPerformed$task$1$run$1$chat$1(LLMCommitMessageAction $receiver, String $diff, CommitMessage $commitMessageUi) {
/*     */         super(1);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onCancel() {
/* 115 */     CommonLoggerService.Companion.getInstance().logCommitGenerationFinished(this.$activity, this.$numberOfFiles, "", FinishState.CANCEL);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/vcs/LLMCommitMessageAction$actionPerformed$task$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */