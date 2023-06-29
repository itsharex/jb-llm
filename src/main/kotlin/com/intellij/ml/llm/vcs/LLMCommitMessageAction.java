/*     */ package com.intellij.ml.llm.vcs;
/*     */ import ai.grazie.model.llm.chat.LLMChat;
/*     */ import ai.grazie.model.llm.profile.LLMProfileID;
/*     */ import com.intellij.ml.llm.LLMBundle;
/*     */ import com.intellij.ml.llm.core.statistics.CommonLoggerService;
/*     */ import com.intellij.ml.llm.core.statistics.CompositeStatisticsIdeActivity;
/*     */ import com.intellij.openapi.actionSystem.ActionUpdateThread;
/*     */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*     */ import com.intellij.openapi.application.CoroutinesKt;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.progress.ProgressIndicator;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.vcs.VcsDataKeys;
/*     */ import com.intellij.openapi.vcs.changes.Change;
/*     */ import com.intellij.openapi.vcs.ui.CommitMessage;
/*     */ import com.intellij.openapi.wm.ToolWindow;
/*     */ import com.intellij.ui.EditorTextField;
/*     */ import com.intellij.vcs.commit.CommitWorkflowUi;
/*     */ import java.io.StringWriter;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.Dispatchers;
/*     */ import kotlinx.coroutines.flow.Flow;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000j\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\036\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\000\030\000 '2\0020\001:\001'B\005¢\006\002\020\002J\020\020\005\032\0020\0062\006\020\007\032\0020\bH\026J\036\020\t\032\0020\n2\f\020\013\032\b\022\004\022\0020\r0\f2\006\020\016\032\0020\017H\002J\b\020\020\032\0020\021H\026J \020\022\032\n\022\004\022\0020\r\030\0010\f2\006\020\007\032\0020\b2\006\020\023\032\0020\024H\002J\022\020\025\032\004\030\0010\0262\006\020\007\032\0020\bH\002J\030\020\027\032\0020\n2\006\020\030\032\0020\n2\006\020\031\032\0020\nH\002JA\020\032\032\n\022\004\022\0020\n\030\0010\0332\006\020\016\032\0020\0172\006\020\034\032\0020\0352\006\020\036\032\0020\0372\006\020 \032\0020!2\006\020\"\032\0020#H@ø\001\000¢\006\002\020$J\020\020%\032\0020\0062\006\020\007\032\0020\bH\026J\f\020&\032\0020\n*\0020\nH\002R\020\020\003\032\004\030\0010\004X\016¢\006\002\n\000\002\004\n\002\b\031¨\006("}, d2 = {"Lcom/intellij/ml/llm/vcs/LLMCommitMessageAction;", "Lcom/intellij/openapi/project/DumbAwareAction;", "()V", "progressIndicator", "Lcom/intellij/openapi/progress/ProgressIndicator;", "actionPerformed", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "calculateDiff", "", "changes", "", "Lcom/intellij/openapi/vcs/changes/Change;", "project", "Lcom/intellij/openapi/project/Project;", "getActionUpdateThread", "Lcom/intellij/openapi/actionSystem/ActionUpdateThread;", "getChanges", "onlyIncluded", "", "getCommitMessageUi", "Lcom/intellij/openapi/vcs/ui/CommitMessage;", "getInstruction", "diff", "text", "sendChatRequest", "Lkotlinx/coroutines/flow/Flow;", "numberOfFiles", "", "chat", "Lai/grazie/model/llm/chat/LLMChat;", "profile", "Lai/grazie/model/llm/profile/LLMProfileID;", "activity", "Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;", "(Lcom/intellij/openapi/project/Project;ILai/grazie/model/llm/chat/LLMChat;Lai/grazie/model/llm/profile/LLMProfileID;Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "trimDiff", "Companion", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nLLMCommitMessageAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMCommitMessageAction.kt\ncom/intellij/ml/llm/vcs/LLMCommitMessageAction\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,175:1\n1#2:176\n766#3:177\n857#3,2:178\n*S KotlinDebug\n*F\n+ 1 LLMCommitMessageAction.kt\ncom/intellij/ml/llm/vcs/LLMCommitMessageAction\n*L\n157#1:177\n157#1:178,2\n*E\n"})
/*     */ public final class LLMCommitMessageAction extends DumbAwareAction {
/*     */   public LLMCommitMessageAction() {
/*  44 */     super(LLMBundle.INSTANCE.getLazyMessage("action.commit.message.title", new Object[0]));
/*     */   }
/*     */   
/*     */   public void update(@NotNull AnActionEvent e) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'e'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: invokevirtual getPresentation : ()Lcom/intellij/openapi/actionSystem/Presentation;
/*     */     //   10: aload_0
/*     */     //   11: aload_1
/*     */     //   12: invokespecial getCommitMessageUi : (Lcom/intellij/openapi/actionSystem/AnActionEvent;)Lcom/intellij/openapi/vcs/ui/CommitMessage;
/*     */     //   15: ifnull -> 66
/*     */     //   18: aload_1
/*     */     //   19: getstatic com/intellij/openapi/vcs/VcsDataKeys.COMMIT_WORKFLOW_UI : Lcom/intellij/openapi/actionSystem/DataKey;
/*     */     //   22: invokevirtual getData : (Lcom/intellij/openapi/actionSystem/DataKey;)Ljava/lang/Object;
/*     */     //   25: ifnull -> 66
/*     */     //   28: nop
/*     */     //   29: aload_0
/*     */     //   30: aload_1
/*     */     //   31: iconst_1
/*     */     //   32: invokespecial getChanges : (Lcom/intellij/openapi/actionSystem/AnActionEvent;Z)Ljava/util/Collection;
/*     */     //   35: dup
/*     */     //   36: ifnonnull -> 46
/*     */     //   39: pop
/*     */     //   40: invokestatic emptyList : ()Ljava/util/List;
/*     */     //   43: checkcast java/util/Collection
/*     */     //   46: invokeinterface isEmpty : ()Z
/*     */     //   51: ifne -> 58
/*     */     //   54: iconst_1
/*     */     //   55: goto -> 59
/*     */     //   58: iconst_0
/*     */     //   59: ifeq -> 66
/*     */     //   62: iconst_1
/*     */     //   63: goto -> 67
/*     */     //   66: iconst_0
/*     */     //   67: invokevirtual setEnabled : (Z)V
/*     */     //   70: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #48	-> 6
/*     */     //   #49	-> 18
/*     */     //   #50	-> 28
/*     */     //   #50	-> 29
/*     */     //   #48	-> 67
/*     */     //   #51	-> 70
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	71	0	this	Lcom/intellij/ml/llm/vcs/LLMCommitMessageAction;
/*     */     //   0	71	1	e	Lcom/intellij/openapi/actionSystem/AnActionEvent;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public ActionUpdateThread getActionUpdateThread() {
/*  53 */     return ActionUpdateThread.BGT; } private static final void actionPerformed$lambda$1() {} @DebugMetadata(f = "LLMCommitMessageAction.kt", l = {127}, i = {0, 0, 0}, s = {"L$0", "L$1", "I$0"}, n = {"activity", "loggerService", "numberOfFiles"}, m = "sendChatRequest", c = "com.intellij.ml.llm.vcs.LLMCommitMessageAction") @Metadata(mv = {1, 8, 0}, k = 3, xi = 48) static final class LLMCommitMessageAction$sendChatRequest$1 extends ContinuationImpl {
/*     */     int I$0; Object L$0; Object L$1; int label; LLMCommitMessageAction$sendChatRequest$1(Continuation $completion) { super($completion); }
/*     */     @Nullable public final Object invokeSuspend(@NotNull Object $result) { this.result = $result; this.label |= Integer.MIN_VALUE; return LLMCommitMessageAction.this.sendChatRequest(null, 0, null, null, null, (Continuation)this); } }
/*  56 */   public void actionPerformed(@NotNull AnActionEvent e) { Project project; CommitMessage commitMessageUi; Collection<Change> includedSet; Intrinsics.checkNotNullParameter(e, "e"); if (e.getProject() == null) { e.getProject(); return; }
/*     */     
/*  58 */     if (!GrazieAuthServiceKt.isAuthenticated(GrazieAuthService.Companion.getInstance().waitAndGetAuthStatus(project)))
/*  59 */     { if (e.getProject() != null) { Project it = e.getProject();
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
/* 176 */         int $i$a$-let-LLMCommitMessageAction$actionPerformed$toolWindow$1 = 0; if (ToolWindowManager.Companion.getInstance(it).getToolWindow("AIAssistant") != null) { ToolWindow toolWindow; toolWindow.activate(LLMCommitMessageAction::actionPerformed$lambda$1); return; }  }  e.getProject(); return; }  if ((this.progressIndicator != null) ? ((this.progressIndicator.isRunning() == true)) : false) { if (this.progressIndicator != null) { this.progressIndicator.cancel(); } else {  }  this.progressIndicator = null; return; }  if (getCommitMessageUi(e) == null) { getCommitMessageUi(e); return; }  if (getChanges(e, false) == null) { getChanges(e, false); return; }  LLMCommonEventFieldsKt.askDataSharingConsentIfNeeded(project); int numberOfFiles = includedSet.size(); CompositeStatisticsIdeActivity activity = CommonLoggerService.Companion.getInstance().logCommitGenerationStarted(project, numberOfFiles); logger.info("Invoke commit message generation"); String str = LLMBundle.message("intentions.request.background.process.title", new Object[0]); LLMCommitMessageAction$actionPerformed$task$1 task = new LLMCommitMessageAction$actionPerformed$task$1(e, this, includedSet, numberOfFiles, activity, commitMessageUi, str); ProgressManager.getInstance().runProcessWithProgressAsynchronously(task, (ProgressIndicator)new BackgroundableProcessIndicator(task)); } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\031\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\003\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026J\b\020\004\032\0020\003H\026J\020\020\005\032\0020\0032\006\020\006\032\0020\007H\026¨\006\b"}, d2 = {"com/intellij/ml/llm/vcs/LLMCommitMessageAction$actionPerformed$task$1", "Lcom/intellij/openapi/progress/Task$Backgroundable;", "onCancel", "", "onFinished", "run", "indicator", "Lcom/intellij/openapi/progress/ProgressIndicator;", "intellij.ml.llm"}) public static final class LLMCommitMessageAction$actionPerformed$task$1 extends Task.Backgroundable { LLMCommitMessageAction$actionPerformed$task$1(AnActionEvent $e, LLMCommitMessageAction $receiver, Collection<Change> $includedSet, int $numberOfFiles, CompositeStatisticsIdeActivity $activity, CommitMessage $commitMessageUi, String $super_call_param$1) { super($project, $super_call_param$1); } public void onFinished() { this.$e.getPresentation().setIcon(MLLlmIcons.AiAssistant); } public void run(@NotNull ProgressIndicator indicator) { Intrinsics.checkNotNullParameter(indicator, "indicator"); LLMCommitMessageAction.this.progressIndicator = indicator; this.$e.getPresentation().setIcon(ExpUiIcons.Run.Stop); CoroutinesKt.runBlockingCancellable(new LLMCommitMessageAction$actionPerformed$task$1$run$1(LLMCommitMessageAction.this, this.$includedSet, this.$numberOfFiles, this.$activity, this.$commitMessageUi, null)); } @DebugMetadata(f = "LLMCommitMessageAction.kt", l = {87, 92, 98}, i = {2}, s = {"L$0"}, n = {"messageBuilder"}, m = "invokeSuspend", c = "com.intellij.ml.llm.vcs.LLMCommitMessageAction$actionPerformed$task$1$run$1") @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class LLMCommitMessageAction$actionPerformed$task$1$run$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { Object L$0; int label; LLMCommitMessageAction$actionPerformed$task$1$run$1(LLMCommitMessageAction $receiver, Collection<Change> $includedSet, int $numberOfFiles, CompositeStatisticsIdeActivity $activity, CommitMessage $commitMessageUi, Continuation $completion) { super(2, $completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { // Byte code:
/*     */         //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */         //   3: astore #14
/*     */         //   5: aload_0
/*     */         //   6: getfield label : I
/*     */         //   9: tableswitch default -> 377, 0 -> 40, 1 -> 75, 2 -> 173, 3 -> 252
/*     */         //   40: aload_1
/*     */         //   41: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */         //   44: getstatic com/intellij/ml/llm/core/tokenizer/TokenizerAccessPointService.Companion : Lcom/intellij/ml/llm/core/tokenizer/TokenizerAccessPointService$Companion;
/*     */         //   47: aload_0
/*     */         //   48: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */         //   51: invokevirtual getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/ml/llm/core/tokenizer/TokenizerAccessPointService;
/*     */         //   54: aload_0
/*     */         //   55: checkcast kotlin/coroutines/Continuation
/*     */         //   58: aload_0
/*     */         //   59: iconst_1
/*     */         //   60: putfield label : I
/*     */         //   63: invokevirtual getTokenizer : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */         //   66: dup
/*     */         //   67: aload #14
/*     */         //   69: if_acmpne -> 80
/*     */         //   72: aload #14
/*     */         //   74: areturn
/*     */         //   75: aload_1
/*     */         //   76: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */         //   79: aload_1
/*     */         //   80: checkcast com/intellij/ml/llm/core/tokenizer/Tokenizer
/*     */         //   83: astore_2
/*     */         //   84: aload_0
/*     */         //   85: getfield this$0 : Lcom/intellij/ml/llm/vcs/LLMCommitMessageAction;
/*     */         //   88: aload_0
/*     */         //   89: getfield $includedSet : Ljava/util/Collection;
/*     */         //   92: aload_0
/*     */         //   93: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */         //   96: invokestatic access$calculateDiff : (Lcom/intellij/ml/llm/vcs/LLMCommitMessageAction;Ljava/util/Collection;Lcom/intellij/openapi/project/Project;)Ljava/lang/String;
/*     */         //   99: astore_3
/*     */         //   100: getstatic ai/grazie/model/llm/chat/LLMChat.Companion : Lai/grazie/model/llm/chat/LLMChat$Companion;
/*     */         //   103: new com/intellij/ml/llm/vcs/LLMCommitMessageAction$actionPerformed$task$1$run$1$chat$1
/*     */         //   106: dup
/*     */         //   107: aload_2
/*     */         //   108: aload_0
/*     */         //   109: getfield this$0 : Lcom/intellij/ml/llm/vcs/LLMCommitMessageAction;
/*     */         //   112: aload_3
/*     */         //   113: aload_0
/*     */         //   114: getfield $commitMessageUi : Lcom/intellij/openapi/vcs/ui/CommitMessage;
/*     */         //   117: invokespecial <init> : (Lcom/intellij/ml/llm/core/tokenizer/Tokenizer;Lcom/intellij/ml/llm/vcs/LLMCommitMessageAction;Ljava/lang/String;Lcom/intellij/openapi/vcs/ui/CommitMessage;)V
/*     */         //   120: checkcast kotlin/jvm/functions/Function1
/*     */         //   123: invokevirtual build : (Lkotlin/jvm/functions/Function1;)Lai/grazie/model/llm/chat/LLMChat;
/*     */         //   126: astore #4
/*     */         //   128: aload_0
/*     */         //   129: getfield this$0 : Lcom/intellij/ml/llm/vcs/LLMCommitMessageAction;
/*     */         //   132: aload_0
/*     */         //   133: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */         //   136: aload_0
/*     */         //   137: getfield $numberOfFiles : I
/*     */         //   140: aload #4
/*     */         //   142: getstatic ai/grazie/model/llm/profile/OpenAIProfileIDs.INSTANCE : Lai/grazie/model/llm/profile/OpenAIProfileIDs;
/*     */         //   145: invokevirtual getGPT4 : ()Lai/grazie/model/llm/profile/LLMProfileID;
/*     */         //   148: aload_0
/*     */         //   149: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */         //   152: aload_0
/*     */         //   153: checkcast kotlin/coroutines/Continuation
/*     */         //   156: aload_0
/*     */         //   157: iconst_2
/*     */         //   158: putfield label : I
/*     */         //   161: invokestatic access$sendChatRequest : (Lcom/intellij/ml/llm/vcs/LLMCommitMessageAction;Lcom/intellij/openapi/project/Project;ILai/grazie/model/llm/chat/LLMChat;Lai/grazie/model/llm/profile/LLMProfileID;Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */         //   164: dup
/*     */         //   165: aload #14
/*     */         //   167: if_acmpne -> 178
/*     */         //   170: aload #14
/*     */         //   172: areturn
/*     */         //   173: aload_1
/*     */         //   174: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */         //   177: aload_1
/*     */         //   178: checkcast kotlinx/coroutines/flow/Flow
/*     */         //   181: astore #5
/*     */         //   183: aload #5
/*     */         //   185: ifnonnull -> 192
/*     */         //   188: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */         //   191: areturn
/*     */         //   192: new java/lang/StringBuilder
/*     */         //   195: dup
/*     */         //   196: invokespecial <init> : ()V
/*     */         //   199: astore #6
/*     */         //   201: aload #5
/*     */         //   203: new com/intellij/ml/llm/vcs/LLMCommitMessageAction$actionPerformed$task$1$run$1$1
/*     */         //   206: dup
/*     */         //   207: aload #6
/*     */         //   209: aload_0
/*     */         //   210: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */         //   213: aload_0
/*     */         //   214: getfield $commitMessageUi : Lcom/intellij/openapi/vcs/ui/CommitMessage;
/*     */         //   217: invokespecial <init> : (Ljava/lang/StringBuilder;Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;Lcom/intellij/openapi/vcs/ui/CommitMessage;)V
/*     */         //   220: checkcast kotlinx/coroutines/flow/FlowCollector
/*     */         //   223: aload_0
/*     */         //   224: checkcast kotlin/coroutines/Continuation
/*     */         //   227: aload_0
/*     */         //   228: aload #6
/*     */         //   230: putfield L$0 : Ljava/lang/Object;
/*     */         //   233: aload_0
/*     */         //   234: iconst_3
/*     */         //   235: putfield label : I
/*     */         //   238: invokeinterface collect : (Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */         //   243: dup
/*     */         //   244: aload #14
/*     */         //   246: if_acmpne -> 266
/*     */         //   249: aload #14
/*     */         //   251: areturn
/*     */         //   252: aload_0
/*     */         //   253: getfield L$0 : Ljava/lang/Object;
/*     */         //   256: checkcast java/lang/StringBuilder
/*     */         //   259: astore #6
/*     */         //   261: aload_1
/*     */         //   262: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */         //   265: aload_1
/*     */         //   266: pop
/*     */         //   267: getstatic com/intellij/ml/llm/core/statistics/CommonLoggerService.Companion : Lcom/intellij/ml/llm/core/statistics/CommonLoggerService$Companion;
/*     */         //   270: invokevirtual getInstance : ()Lcom/intellij/ml/llm/core/statistics/CommonLoggerService;
/*     */         //   273: aload_0
/*     */         //   274: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */         //   277: aload_0
/*     */         //   278: getfield $numberOfFiles : I
/*     */         //   281: aload #6
/*     */         //   283: invokevirtual toString : ()Ljava/lang/String;
/*     */         //   286: astore #7
/*     */         //   288: aload #7
/*     */         //   290: ldc 'messageBuilder.toString()'
/*     */         //   292: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */         //   295: aload #7
/*     */         //   297: getstatic com/intellij/ml/llm/core/statistics/FinishState.SUCCEED : Lcom/intellij/ml/llm/core/statistics/FinishState;
/*     */         //   300: invokevirtual logCommitGenerationFinished : (Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;ILjava/lang/String;Lcom/intellij/ml/llm/core/statistics/FinishState;)V
/*     */         //   303: aload_0
/*     */         //   304: getfield $commitMessageUi : Lcom/intellij/openapi/vcs/ui/CommitMessage;
/*     */         //   307: invokevirtual getEditorField : ()Lcom/intellij/ui/EditorTextField;
/*     */         //   310: invokevirtual getEditor : ()Lcom/intellij/openapi/editor/Editor;
/*     */         //   313: dup
/*     */         //   314: ifnull -> 371
/*     */         //   317: astore #8
/*     */         //   319: aload_0
/*     */         //   320: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */         //   323: astore #9
/*     */         //   325: aload_0
/*     */         //   326: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */         //   329: astore #10
/*     */         //   331: aload_0
/*     */         //   332: getfield $commitMessageUi : Lcom/intellij/openapi/vcs/ui/CommitMessage;
/*     */         //   335: astore #11
/*     */         //   337: aload #8
/*     */         //   339: astore #12
/*     */         //   341: iconst_0
/*     */         //   342: istore #13
/*     */         //   344: aload #9
/*     */         //   346: aload #12
/*     */         //   348: aload #10
/*     */         //   350: checkcast com/intellij/ml/llm/core/statistics/StatisticsIdeActivities
/*     */         //   353: aload #11
/*     */         //   355: invokevirtual getEditorField : ()Lcom/intellij/ui/EditorTextField;
/*     */         //   358: invokevirtual getText : ()Ljava/lang/String;
/*     */         //   361: invokevirtual length : ()I
/*     */         //   364: invokestatic showScoreNotificationInlay : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Editor;Lcom/intellij/ml/llm/core/statistics/StatisticsIdeActivities;I)V
/*     */         //   367: nop
/*     */         //   368: goto -> 373
/*     */         //   371: pop
/*     */         //   372: nop
/*     */         //   373: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */         //   376: areturn
/*     */         //   377: new java/lang/IllegalStateException
/*     */         //   380: dup
/*     */         //   381: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */         //   383: invokespecial <init> : (Ljava/lang/String;)V
/*     */         //   386: athrow
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #86	-> 3
/*     */         //   #87	-> 44
/*     */         //   #86	-> 72
/*     */         //   #88	-> 84
/*     */         //   #89	-> 100
/*     */         //   #92	-> 128
/*     */         //   #86	-> 170
/*     */         //   #93	-> 183
/*     */         //   #94	-> 188
/*     */         //   #97	-> 192
/*     */         //   #98	-> 201
/*     */         //   #86	-> 249
/*     */         //   #105	-> 266
/*     */         //   #106	-> 303
/*     */         //   #108	-> 344
/*     */         //   #107	-> 364
/*     */         //   #110	-> 367
/*     */         //   #106	-> 368
/*     */         //   #106	-> 371
/*     */         //   #111	-> 373
/*     */         //   #86	-> 377
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   84	44	2	tokenizer	Lcom/intellij/ml/llm/core/tokenizer/Tokenizer;
/*     */         //   100	28	3	diff	Ljava/lang/String;
/*     */         //   128	36	4	chat	Lai/grazie/model/llm/chat/LLMChat;
/*     */         //   183	5	5	flow	Lkotlinx/coroutines/flow/Flow;
/*     */         //   192	51	5	flow	Lkotlinx/coroutines/flow/Flow;
/*     */         //   201	51	6	messageBuilder	Ljava/lang/StringBuilder;
/*     */         //   261	27	6	messageBuilder	Ljava/lang/StringBuilder;
/*     */         //   341	27	12	it	Lcom/intellij/openapi/editor/Editor;
/*     */         //   344	24	13	$i$a$-let-LLMCommitMessageAction$actionPerformed$task$1$run$1$2	I
/*     */         //   44	333	0	this	Lcom/intellij/ml/llm/vcs/LLMCommitMessageAction$actionPerformed$task$1$run$1;
/* 176 */         //   44	333	1	$result	Ljava/lang/Object; } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super LLMCommitMessageAction$actionPerformed$task$1$run$1> $completion) { return (Continuation<Unit>)new LLMCommitMessageAction$actionPerformed$task$1$run$1(LLMCommitMessageAction.this, this.$includedSet, this.$numberOfFiles, this.$activity, this.$commitMessageUi, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((LLMCommitMessageAction$actionPerformed$task$1$run$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/llm/chat/LLMChat$Builder;", "invoke"}) static final class LLMCommitMessageAction$actionPerformed$task$1$run$1$chat$1 extends Lambda implements Function1<LLMChat.Builder, Unit> { public final void invoke(@NotNull LLMChat.Builder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); Intrinsics.checkNotNullExpressionValue(this.$commitMessageUi.getEditorField().getText(), "commitMessageUi.editorField.text"); $this$build.message(LLMChatRole.User, this.$tokenizer.trim(LLMCommitMessageAction.this.getInstruction(this.$diff, this.$commitMessageUi.getEditorField().getText()), 8192)); } LLMCommitMessageAction$actionPerformed$task$1$run$1$chat$1(LLMCommitMessageAction $receiver, String $diff, CommitMessage $commitMessageUi) { super(1); } } } public void onCancel() { CommonLoggerService.Companion.getInstance().logCommitGenerationFinished(this.$activity, this.$numberOfFiles, "", FinishState.CANCEL); } } private final Collection<Change> getChanges(AnActionEvent e, boolean onlyIncluded) { CommitWorkflowUi commitWorkflowUi = (CommitWorkflowUi)e.getData(VcsDataKeys.COMMIT_WORKFLOW_UI); if (commitWorkflowUi != null) { List<Change> list1 = commitWorkflowUi.getIncludedChanges(), it = list1; int $i$a$-takeIf-LLMCommitMessageAction$getChanges$1 = 0; (!it.isEmpty()) ? list1 : null; return (((!it.isEmpty()) ? list1 : null) != null) ? ((!it.isEmpty()) ? list1 : null) : (onlyIncluded ? null : commitWorkflowUi.getDisplayedChanges()); }  return null; }
/*     */   private final Object sendChatRequest(Project project, int numberOfFiles, LLMChat chat, LLMProfileID profile, CompositeStatisticsIdeActivity activity, Continuation<? super Flow<String>> paramContinuation) { // Byte code:
/*     */     //   0: aload #6
/*     */     //   2: instanceof com/intellij/ml/llm/vcs/LLMCommitMessageAction$sendChatRequest$1
/*     */     //   5: ifeq -> 43
/*     */     //   8: aload #6
/*     */     //   10: checkcast com/intellij/ml/llm/vcs/LLMCommitMessageAction$sendChatRequest$1
/*     */     //   13: astore #10
/*     */     //   15: aload #10
/*     */     //   17: getfield label : I
/*     */     //   20: ldc_w -2147483648
/*     */     //   23: iand
/*     */     //   24: ifeq -> 43
/*     */     //   27: aload #10
/*     */     //   29: dup
/*     */     //   30: getfield label : I
/*     */     //   33: ldc_w -2147483648
/*     */     //   36: isub
/*     */     //   37: putfield label : I
/*     */     //   40: goto -> 55
/*     */     //   43: new com/intellij/ml/llm/vcs/LLMCommitMessageAction$sendChatRequest$1
/*     */     //   46: dup
/*     */     //   47: aload_0
/*     */     //   48: aload #6
/*     */     //   50: invokespecial <init> : (Lcom/intellij/ml/llm/vcs/LLMCommitMessageAction;Lkotlin/coroutines/Continuation;)V
/*     */     //   53: astore #10
/*     */     //   55: aload #10
/*     */     //   57: getfield result : Ljava/lang/Object;
/*     */     //   60: astore #9
/*     */     //   62: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   65: astore #11
/*     */     //   67: aload #10
/*     */     //   69: getfield label : I
/*     */     //   72: tableswitch default -> 224, 0 -> 96, 1 -> 171
/*     */     //   96: aload #9
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: getstatic com/intellij/ml/llm/core/statistics/CommonLoggerService.Companion : Lcom/intellij/ml/llm/core/statistics/CommonLoggerService$Companion;
/*     */     //   104: invokevirtual getInstance : ()Lcom/intellij/ml/llm/core/statistics/CommonLoggerService;
/*     */     //   107: astore #7
/*     */     //   109: nop
/*     */     //   110: aload #7
/*     */     //   112: aload #5
/*     */     //   114: iload_2
/*     */     //   115: aload #4
/*     */     //   117: aload_3
/*     */     //   118: invokevirtual logCommitGenerationRequestSent : (Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;ILai/grazie/model/llm/profile/LLMProfileID;Lai/grazie/model/llm/chat/LLMChat;)V
/*     */     //   121: aload_1
/*     */     //   122: aload_3
/*     */     //   123: aload #4
/*     */     //   125: iconst_0
/*     */     //   126: aconst_null
/*     */     //   127: iconst_0
/*     */     //   128: aload #10
/*     */     //   130: bipush #56
/*     */     //   132: aconst_null
/*     */     //   133: aload #10
/*     */     //   135: aload #5
/*     */     //   137: putfield L$0 : Ljava/lang/Object;
/*     */     //   140: aload #10
/*     */     //   142: aload #7
/*     */     //   144: putfield L$1 : Ljava/lang/Object;
/*     */     //   147: aload #10
/*     */     //   149: iload_2
/*     */     //   150: putfield I$0 : I
/*     */     //   153: aload #10
/*     */     //   155: iconst_1
/*     */     //   156: putfield label : I
/*     */     //   159: invokestatic sendGrazieChatRequest$default : (Lcom/intellij/openapi/project/Project;Lai/grazie/model/llm/chat/LLMChat;Lai/grazie/model/llm/profile/LLMProfileID;ZLai/grazie/utils/attributes/Attributes;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   162: dup
/*     */     //   163: aload #11
/*     */     //   165: if_acmpne -> 205
/*     */     //   168: aload #11
/*     */     //   170: areturn
/*     */     //   171: aload #10
/*     */     //   173: getfield I$0 : I
/*     */     //   176: istore_2
/*     */     //   177: aload #10
/*     */     //   179: getfield L$1 : Ljava/lang/Object;
/*     */     //   182: checkcast com/intellij/ml/llm/core/statistics/CommonLoggerService
/*     */     //   185: astore #7
/*     */     //   187: aload #10
/*     */     //   189: getfield L$0 : Ljava/lang/Object;
/*     */     //   192: checkcast com/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity
/*     */     //   195: astore #5
/*     */     //   197: nop
/*     */     //   198: aload #9
/*     */     //   200: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   203: aload #9
/*     */     //   205: areturn
/*     */     //   206: astore #8
/*     */     //   208: aload #7
/*     */     //   210: aload #5
/*     */     //   212: iload_2
/*     */     //   213: ldc_w ''
/*     */     //   216: getstatic com/intellij/ml/llm/core/statistics/FinishState.ERROR : Lcom/intellij/ml/llm/core/statistics/FinishState;
/*     */     //   219: invokevirtual logCommitGenerationFinished : (Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;ILjava/lang/String;Lcom/intellij/ml/llm/core/statistics/FinishState;)V
/*     */     //   222: aconst_null
/*     */     //   223: areturn
/*     */     //   224: new java/lang/IllegalStateException
/*     */     //   227: dup
/*     */     //   228: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   231: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   234: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #121	-> 65
/*     */     //   #124	-> 101
/*     */     //   #125	-> 109
/*     */     //   #126	-> 110
/*     */     //   #127	-> 121
/*     */     //   #121	-> 168
/*     */     //   #129	-> 205
/*     */     //   #130	-> 208
/*     */     //   #131	-> 222
/*     */     //   #121	-> 224
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	61	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   101	70	2	numberOfFiles	I
/*     */     //   177	29	2	numberOfFiles	I
/*     */     //   206	18	2	numberOfFiles	I
/*     */     //   101	61	3	chat	Lai/grazie/model/llm/chat/LLMChat;
/*     */     //   101	61	4	profile	Lai/grazie/model/llm/profile/LLMProfileID;
/*     */     //   101	70	5	activity	Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */     //   197	9	5	activity	Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */     //   206	18	5	activity	Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */     //   109	62	7	loggerService	Lcom/intellij/ml/llm/core/statistics/CommonLoggerService;
/*     */     //   187	19	7	loggerService	Lcom/intellij/ml/llm/core/statistics/CommonLoggerService;
/*     */     //   206	18	7	loggerService	Lcom/intellij/ml/llm/core/statistics/CommonLoggerService;
/*     */     //   55	169	10	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   62	162	9	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   109	162	206	ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEvent
/* 177 */     //   197	206	206	ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEvent } private final CommitMessage getCommitMessageUi(AnActionEvent e) { Object object = e.getData(VcsDataKeys.COMMIT_MESSAGE_CONTROL); return (object instanceof CommitMessage) ? (CommitMessage)object : null; } private final String calculateDiff(Collection changes, Project project) { StringWriter writer = new StringWriter(); Intrinsics.checkNotNull(project.getBasePath()); Intrinsics.checkNotNullExpressionValue(IdeaTextPatchBuilder.buildPatch(project, changes, project.getBasePath(), false), "buildPatch(\n      projec…t.basePath!!, false\n    )"); List patches = IdeaTextPatchBuilder.buildPatch(project, changes, project.getBasePath(), false); UnifiedDiffWriter.write(project, ProjectKt.getStateStore(project).getProjectBasePath(), patches, writer, "\n", null, CollectionsKt.emptyList()); Intrinsics.checkNotNullExpressionValue(writer.toString(), "writer.toString()"); return trimDiff(writer.toString()); } private final String trimDiff(String $this$trimDiff) { Iterable $this$filter$iv = StringsKt.lines($this$trimDiff); int $i$f$filter = 0; Iterable iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 178 */     for (Object element$iv$iv : iterable1) { String it = (String)element$iv$iv; int $i$a$-filter-LLMCommitMessageAction$trimDiff$1 = 0; if ((!StringsKt.startsWith$default(it, "diff --git ", false, 2, null) && !StringsKt.startsWith$default(it, "index ", false, 2, null))) destination$iv$iv.add(element$iv$iv);  }
/* 179 */      return CollectionsKt.joinToString$default(destination$iv$iv, "\n", null, null, 0, null, null, 62, null); }
/*     */ 
/*     */   
/*     */   private final String getInstruction(String diff, String text) {
/*     */     return "Write a cohesive yet descriptive commit message for a given diff. \n      Make sure to include both information What was changed and Why. \n      Start with a short sentence in imperative form, no more than 50 characters long. \n      Then leave an empty line and continue with a more detailed explanation, if necessary.\n      Explanation should have less than 200 characters.\n    Diff:\n    " + diff + "\n    Commit message:\n    " + text + "\n    ";
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\023\020\003\032\0070\004¢\006\002\b\005X\004¢\006\002\n\000¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/vcs/LLMCommitMessageAction$Companion;", "", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "Lorg/jetbrains/annotations/NotNull;", "intellij.ml.llm"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @Nullable
/*     */   private ProgressIndicator progressIndicator;
/*     */   @NotNull
/*     */   private static final Logger logger = Logger.getInstance("#com.intellij.ml.llm");
/*     */   
/*     */   static {
/*     */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance("#com.intellij.ml.llm"), "getInstance(\"#com.intellij.ml.llm\")");
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/vcs/LLMCommitMessageAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */