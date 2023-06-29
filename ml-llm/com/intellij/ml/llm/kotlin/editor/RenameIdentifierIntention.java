/*     */ package com.intellij.ml.llm.kotlin.editor;
/*     */ 
/*     */ import com.intellij.ml.llm.evaluation.CompletedLLMRequest;
/*     */ import com.intellij.ml.llm.evaluation.IntentionCallContext;
/*     */ import com.intellij.ml.llm.evaluation.PsiElementCallLocation;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import com.intellij.psi.PsiNameIdentifierOwner;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000n\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\002\030\0002\0020\0012\0020\002B\005¢\006\002\020\003J\030\020\013\032\0020\f2\006\020\r\032\0020\0162\006\020\017\032\0020\020H\026J\036\020\021\032\004\030\0010\0222\b\020\023\032\004\030\0010\0242\b\020\025\032\004\030\0010\026H\002J\036\020\027\032\b\022\004\022\0020\0310\0302\006\020\032\032\0020\0332\006\020\034\032\0020\035H\026J\b\020\036\032\0020\005H\026J0\020\037\032\0020\f2\006\020\r\032\0020\0162\036\020 \032\032\022\026\022\024\022\004\022\0020\016\022\004\022\0020\020\022\004\022\0020\f0!0\030H\026J\b\020\"\032\0020\005H\026J%\020#\032\0020\f2\006\020\032\032\0020\0332\b\020\025\032\004\030\0010\0262\b\020\023\032\004\030\0010\024H\002J$\020$\032\0020%2\006\020\032\032\0020\0332\b\020\025\032\004\030\0010\0262\b\020\023\032\004\030\0010\024H\026J\b\020&\032\0020%H\026R\024\020\004\032\0020\005XD¢\006\b\n\000\032\004\b\006\020\007R\023\020\b\032\0070\t¢\006\002\b\nX\004¢\006\002\n\000¨\006'"}, d2 = {"Lcom/intellij/ml/llm/kotlin/editor/RenameIdentifierIntention;", "Lcom/intellij/codeInsight/intention/IntentionAction;", "Lcom/intellij/ml/llm/evaluation/EvaluatableIntention;", "()V", "featureName", "", "getFeatureName", "()Ljava/lang/String;", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "Lorg/jetbrains/annotations/NotNull;", "applyLLMSuggestion", "", "callContext", "Lcom/intellij/ml/llm/evaluation/IntentionCallContext;", "completedLLMRequest", "Lcom/intellij/ml/llm/evaluation/CompletedLLMRequest;", "findNamedElement", "Lcom/intellij/psi/PsiNameIdentifierOwner;", "file", "Lcom/intellij/psi/PsiFile;", "editor", "Lcom/intellij/openapi/editor/Editor;", "gatherRandomApplicationLocations", "", "Lcom/intellij/ml/llm/evaluation/CallLocation;", "project", "Lcom/intellij/openapi/project/Project;", "n", "", "getFamilyName", "getLLMSuggestion", "callbacks", "Lkotlin/Function2;", "getText", "invoke", "isAvailable", "", "startInWriteAction", "intellij.ml.llm.kotlin"})
/*     */ @SourceDebugExtension({"SMAP\nRenameIdentifierIntention.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenameIdentifierIntention.kt\ncom/intellij/ml/llm/kotlin/editor/RenameIdentifierIntention\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1603#2,9:94\n1855#2:103\n1856#2:105\n1612#2:106\n1549#2:107\n1620#2,3:108\n1#3:104\n*S KotlinDebug\n*F\n+ 1 RenameIdentifierIntention.kt\ncom/intellij/ml/llm/kotlin/editor/RenameIdentifierIntention\n*L\n55#1:94,9\n55#1:103\n55#1:105\n55#1:106\n59#1:107\n59#1:108,3\n55#1:104\n*E\n"})
/*     */ public final class RenameIdentifierIntention implements IntentionAction, EvaluatableIntention {
/*     */   @NotNull
/*     */   private final Logger logger;
/*     */   @NotNull
/*     */   private final String featureName;
/*     */   
/*  27 */   public RenameIdentifierIntention() { Intrinsics.checkNotNullExpressionValue(Logger.getInstance("#com.intellij.ml.llm"), "getInstance(\"#com.intellij.ml.llm\")"); this.logger = Logger.getInstance("#com.intellij.ml.llm");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  50 */     this.featureName = "llmRename"; } @NotNull public String getFamilyName() { return LLMBundle.message("intentions.code.rename.family.name", new Object[0]); } @NotNull public String getText() { return LLMBundle.message("intentions.code.rename.name", new Object[0]); } public boolean isAvailable(@NotNull Project project, @Nullable Editor editor, @Nullable PsiFile file) { Intrinsics.checkNotNullParameter(project, "project"); return (Registry.is("llm.is.internal") && findNamedElement(file, editor) != null); } @NotNull public String getFeatureName() { return this.featureName; }
/*     */   private final PsiNameIdentifierOwner findNamedElement(PsiFile file, Editor editor) { if (editor == null || file == null) return null;  int offset = editor.getCaretModel().getOffset(); return (PsiNameIdentifierOwner)PsiTreeUtil.findElementOfClassAtOffset(file, offset, PsiNameIdentifierOwner.class, false); }
/*     */   public void invoke(@NotNull Project project, @Nullable Editor editor, @Nullable PsiFile file) { Intrinsics.checkNotNullParameter(project, "project"); if (editor == null || file == null) return;  getLLMSuggestion(new IntentionCallContext(project, editor, file), new RenameIdentifierIntention$invoke$1(this)); }
/*  53 */   public boolean startInWriteAction() { return false; } @NotNull public List<CallLocation> gatherRandomApplicationLocations(@NotNull Project project, int n) { Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullExpressionValue(FileTypeIndex.getFiles((FileType)KotlinFileType.INSTANCE, GlobalSearchScope.projectScope(project)), "getFiles(KotlinFileType.…pe.projectScope(project))"); Collection kotlinFiles = FileTypeIndex.getFiles((FileType)KotlinFileType.INSTANCE, GlobalSearchScope.projectScope(project));
/*  54 */     List shuffledKotlinFiles = CollectionsKt.shuffled(kotlinFiles);
/*  55 */     Iterable $this$mapNotNull$iv = shuffledKotlinFiles; int $i$f$mapNotNull = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  94 */     Iterable iterable1 = $this$mapNotNull$iv; Collection<PsiElementCallLocation> destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 102 */     Iterable $this$forEach$iv$iv$iv = iterable1; int $i$f$forEach = 0;
/* 103 */     Iterator iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; VirtualFile file = (VirtualFile)element$iv$iv;
/*     */       int $i$a$-mapNotNull-RenameIdentifierIntention$gatherRandomApplicationLocations$selectedLocations$1 = 0; }
/*     */     
/* 106 */     List selectedLocations = CollectionsKt.take(destination$iv$iv, n); Iterable $this$map$iv = selectedLocations; int $i$f$map = 0;
/* 107 */     Iterable $this$mapNotNullTo$iv$iv = $this$map$iv; destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 108 */     for (Object item$iv$iv : $this$mapNotNullTo$iv$iv) {
/* 109 */       PsiNameIdentifierOwner psiNameIdentifierOwner = (PsiNameIdentifierOwner)item$iv$iv; Collection<PsiElementCallLocation> collection = destination$iv$iv; int $i$a$-map-RenameIdentifierIntention$gatherRandomApplicationLocations$1 = 0; Intrinsics.checkNotNullExpressionValue(psiNameIdentifierOwner.getContainingFile(), "element.containingFile"); collection.add(new PsiElementCallLocation(project, psiNameIdentifierOwner.getContainingFile(), (PsiElement)psiNameIdentifierOwner));
/* 110 */     }  return (List)destination$iv$iv; }
/*     */ 
/*     */   
/*     */   public void getLLMSuggestion(@NotNull IntentionCallContext callContext, @NotNull List<? extends Function2<? super IntentionCallContext, ? super CompletedLLMRequest, Unit>> callbacks) {
/*     */     PsiNameIdentifierOwner element;
/*     */     TextRange nameRange;
/*     */     Intrinsics.checkNotNullParameter(callContext, "callContext");
/*     */     Intrinsics.checkNotNullParameter(callbacks, "callbacks");
/*     */     Project project = callContext.getProject();
/*     */     if (findNamedElement(callContext.getFile(), callContext.getEditor()) == null) {
/*     */       findNamedElement(callContext.getFile(), callContext.getEditor());
/*     */       return;
/*     */     } 
/*     */     String elementText = element.getText();
/*     */     if (element.getNameIdentifier() == null || element.getNameIdentifier().getTextRange() == null || element.getNameIdentifier().getTextRange().shiftLeft(element.getTextRange().getStartOffset()) == null) {
/*     */       element.getNameIdentifier().getTextRange().shiftLeft(element.getTextRange().getStartOffset());
/*     */       return;
/*     */     } 
/*     */     Intrinsics.checkNotNullExpressionValue(elementText, "elementText");
/*     */     String prefix = StringsKt.take(elementText, nameRange.getStartOffset());
/*     */     String suffix = StringsKt.drop(elementText, nameRange.getEndOffset());
/*     */     this.logger.info("Invoke code completion with prefix='" + prefix + "'");
/*     */     String str1 = LLMBundle.message("intentions.request.background.process.title", new Object[0]);
/*     */     RenameIdentifierIntention$getLLMSuggestion$task$1 task = new RenameIdentifierIntention$getLLMSuggestion$task$1(prefix, suffix, this, callbacks, callContext, str1);
/*     */     ProgressManager.getInstance().runProcessWithProgressAsynchronously(task, (ProgressIndicator)new BackgroundableProcessIndicator(task));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/kotlin/editor/RenameIdentifierIntention$getLLMSuggestion$task$1", "Lcom/intellij/openapi/progress/Task$Backgroundable;", "run", "", "indicator", "Lcom/intellij/openapi/progress/ProgressIndicator;", "intellij.ml.llm.kotlin"})
/*     */   @SourceDebugExtension({"SMAP\nRenameIdentifierIntention.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenameIdentifierIntention.kt\ncom/intellij/ml/llm/kotlin/editor/RenameIdentifierIntention$getLLMSuggestion$task$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,93:1\n1855#2,2:94\n*S KotlinDebug\n*F\n+ 1 RenameIdentifierIntention.kt\ncom/intellij/ml/llm/kotlin/editor/RenameIdentifierIntention$getLLMSuggestion$task$1\n*L\n77#1:94,2\n*E\n"})
/*     */   public static final class RenameIdentifierIntention$getLLMSuggestion$task$1 extends Task.Backgroundable {
/*     */     RenameIdentifierIntention$getLLMSuggestion$task$1(String $prefix, String $suffix, RenameIdentifierIntention $receiver, List<Function2<IntentionCallContext, CompletedLLMRequest, Unit>> $callbacks, IntentionCallContext $callContext, String $super_call_param$1) {
/*     */       super($project, $super_call_param$1);
/*     */     }
/*     */     
/*     */     public void run(@NotNull ProgressIndicator indicator) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'indicator'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_0
/*     */       //   7: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   10: aload_0
/*     */       //   11: getfield $prefix : Ljava/lang/String;
/*     */       //   14: aload_0
/*     */       //   15: getfield $suffix : Ljava/lang/String;
/*     */       //   18: aconst_null
/*     */       //   19: aconst_null
/*     */       //   20: aconst_null
/*     */       //   21: aconst_null
/*     */       //   22: aconst_null
/*     */       //   23: aconst_null
/*     */       //   24: iconst_0
/*     */       //   25: aconst_null
/*     */       //   26: aconst_null
/*     */       //   27: aconst_null
/*     */       //   28: sipush #8184
/*     */       //   31: aconst_null
/*     */       //   32: invokestatic sendCompletionChatRequest$default : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;ILkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/core/models/requestResponse/LLMStreamingRequestConsumer;Lcom/intellij/ml/llm/core/models/requestResponse/LLMRequestProvider;ILjava/lang/Object;)Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseResponse;
/*     */       //   35: dup
/*     */       //   36: ifnull -> 64
/*     */       //   39: invokeinterface getSuggestions : ()Ljava/util/List;
/*     */       //   44: dup
/*     */       //   45: ifnull -> 64
/*     */       //   48: invokestatic firstOrNull : (Ljava/util/List;)Ljava/lang/Object;
/*     */       //   51: checkcast com/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice
/*     */       //   54: dup
/*     */       //   55: ifnull -> 64
/*     */       //   58: invokevirtual getText : ()Ljava/lang/String;
/*     */       //   61: goto -> 66
/*     */       //   64: pop
/*     */       //   65: aconst_null
/*     */       //   66: astore_2
/*     */       //   67: aload_0
/*     */       //   68: getfield this$0 : Lcom/intellij/ml/llm/kotlin/editor/RenameIdentifierIntention;
/*     */       //   71: invokestatic access$getLogger$p : (Lcom/intellij/ml/llm/kotlin/editor/RenameIdentifierIntention;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   74: aload_2
/*     */       //   75: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   80: invokevirtual info : (Ljava/lang/String;)V
/*     */       //   83: aload_2
/*     */       //   84: dup
/*     */       //   85: ifnull -> 127
/*     */       //   88: checkcast java/lang/CharSequence
/*     */       //   91: iconst_1
/*     */       //   92: anewarray java/lang/String
/*     */       //   95: astore #5
/*     */       //   97: aload #5
/*     */       //   99: iconst_0
/*     */       //   100: ldc ' '
/*     */       //   102: aastore
/*     */       //   103: aload #5
/*     */       //   105: iconst_0
/*     */       //   106: iconst_0
/*     */       //   107: bipush #6
/*     */       //   109: aconst_null
/*     */       //   110: invokestatic split$default : (Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
/*     */       //   113: dup
/*     */       //   114: ifnull -> 127
/*     */       //   117: invokestatic lastOrNull : (Ljava/util/List;)Ljava/lang/Object;
/*     */       //   120: checkcast java/lang/String
/*     */       //   123: dup
/*     */       //   124: ifnonnull -> 129
/*     */       //   127: pop
/*     */       //   128: return
/*     */       //   129: astore_3
/*     */       //   130: new com/intellij/ml/llm/evaluation/CompletedLLMRequest
/*     */       //   133: dup
/*     */       //   134: aload_3
/*     */       //   135: iconst_1
/*     */       //   136: invokespecial <init> : (Ljava/lang/String;Z)V
/*     */       //   139: astore #4
/*     */       //   141: aload_0
/*     */       //   142: getfield $callbacks : Ljava/util/List;
/*     */       //   145: checkcast java/lang/Iterable
/*     */       //   148: astore #5
/*     */       //   150: aload_0
/*     */       //   151: getfield $callContext : Lcom/intellij/ml/llm/evaluation/IntentionCallContext;
/*     */       //   154: astore #6
/*     */       //   156: iconst_0
/*     */       //   157: istore #7
/*     */       //   159: aload #5
/*     */       //   161: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   166: astore #8
/*     */       //   168: aload #8
/*     */       //   170: invokeinterface hasNext : ()Z
/*     */       //   175: ifeq -> 224
/*     */       //   178: aload #8
/*     */       //   180: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   185: astore #9
/*     */       //   187: aload #9
/*     */       //   189: checkcast kotlin/jvm/functions/Function2
/*     */       //   192: astore #10
/*     */       //   194: iconst_0
/*     */       //   195: istore #11
/*     */       //   197: aconst_null
/*     */       //   198: new com/intellij/ml/llm/kotlin/editor/RenameIdentifierIntention$getLLMSuggestion$task$1$run$1$1
/*     */       //   201: dup
/*     */       //   202: aload #10
/*     */       //   204: aload #6
/*     */       //   206: aload #4
/*     */       //   208: invokespecial <init> : (Lkotlin/jvm/functions/Function2;Lcom/intellij/ml/llm/evaluation/IntentionCallContext;Lcom/intellij/ml/llm/evaluation/CompletedLLMRequest;)V
/*     */       //   211: checkcast kotlin/jvm/functions/Function0
/*     */       //   214: iconst_1
/*     */       //   215: aconst_null
/*     */       //   216: invokestatic invokeLater$default : (Lcom/intellij/openapi/application/ModalityState;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V
/*     */       //   219: nop
/*     */       //   220: nop
/*     */       //   221: goto -> 168
/*     */       //   224: nop
/*     */       //   225: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #73	-> 6
/*     */       //   #74	-> 67
/*     */       //   #75	-> 83
/*     */       //   #76	-> 130
/*     */       //   #77	-> 141
/*     */       //   #94	-> 159
/*     */       //   #78	-> 197
/*     */       //   #81	-> 219
/*     */       //   #94	-> 220
/*     */       //   #95	-> 224
/*     */       //   #82	-> 225
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   197	23	11	$i$a$-forEach-RenameIdentifierIntention$getLLMSuggestion$task$1$run$1	I
/*     */       //   194	26	10	it	Lkotlin/jvm/functions/Function2;
/*     */       //   187	34	9	element$iv	Ljava/lang/Object;
/*     */       //   159	66	7	$i$f$forEach	I
/*     */       //   156	69	5	$this$forEach$iv	Ljava/lang/Iterable;
/*     */       //   67	159	2	predictedText	Ljava/lang/String;
/*     */       //   130	96	3	predictedName	Ljava/lang/String;
/*     */       //   141	85	4	completedLLMRequest	Lcom/intellij/ml/llm/evaluation/CompletedLLMRequest;
/*     */       //   0	226	0	this	Lcom/intellij/ml/llm/kotlin/editor/RenameIdentifierIntention$getLLMSuggestion$task$1;
/*     */       //   0	226	1	indicator	Lcom/intellij/openapi/progress/ProgressIndicator;
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*     */     static final class RenameIdentifierIntention$getLLMSuggestion$task$1$run$1$1 extends Lambda implements Function0<Unit> {
/*     */       public final void invoke() {
/*     */         this.$it.invoke(this.$callContext, this.$completedLLMRequest);
/*     */       }
/*     */       
/*     */       RenameIdentifierIntention$getLLMSuggestion$task$1$run$1$1(Function2<IntentionCallContext, CompletedLLMRequest, Unit> $it, IntentionCallContext $callContext, CompletedLLMRequest $completedLLMRequest) {
/*     */         super(0);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void applyLLMSuggestion(@NotNull IntentionCallContext callContext, @NotNull CompletedLLMRequest completedLLMRequest) {
/*     */     PsiNameIdentifierOwner element;
/*     */     Intrinsics.checkNotNullParameter(callContext, "callContext");
/*     */     Intrinsics.checkNotNullParameter(completedLLMRequest, "completedLLMRequest");
/*     */     if (findNamedElement(callContext.getFile(), callContext.getEditor()) == null) {
/*     */       findNamedElement(callContext.getFile(), callContext.getEditor());
/*     */       return;
/*     */     } 
/*     */     String predictedName = completedLLMRequest.getSuggestion();
/*     */     (new RenameProcessor(element.getProject(), (PsiElement)element, predictedName, false, false)).doRun();
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/editor/RenameIdentifierIntention.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */