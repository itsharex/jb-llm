/*     */ package com.intellij.ml.llm.kotlin.commitChecks;
/*     */ 
/*     */ import com.intellij.codeInsight.CodeSmellInfo;
/*     */ import com.intellij.codeInspection.LocalInspectionTool;
/*     */ import com.intellij.codeInspection.ProblemDescriptor;
/*     */ import com.intellij.codeInspection.ex.LocalInspectionToolWrapper;
/*     */ import com.intellij.ide.errorTreeView.NewErrorTreeViewPanel;
/*     */ import com.intellij.ide.util.PropertiesComponent;
/*     */ import com.intellij.openapi.Disposable;
/*     */ import com.intellij.openapi.fileEditor.FileDocumentManager;
/*     */ import com.intellij.openapi.fileEditor.OpenFileDescriptor;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.vcs.CheckinProjectPanel;
/*     */ import com.intellij.openapi.vcs.checkin.CommitCheck;
/*     */ import com.intellij.openapi.vcs.checkin.CommitProblem;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import com.intellij.openapi.wm.ToolWindowManager;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import com.intellij.ui.content.Content;
/*     */ import com.intellij.ui.content.ContentFactory;
/*     */ import com.intellij.ui.content.MessageView;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.swing.JComponent;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\030\000 \0232\0020\0012\0020\002:\002\023\024B\025\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006¢\006\002\020\007J\b\020\b\032\0020\tH\026J\b\020\n\032\0020\013H\026J\b\020\f\032\0020\rH\026J\033\020\016\032\004\030\0010\0172\006\020\020\032\0020\021H@ø\001\000¢\006\002\020\022R\016\020\005\032\0020\006X\004¢\006\002\n\000R\016\020\003\032\0020\004X\004¢\006\002\n\000\002\004\n\002\b\031¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/kotlin/commitChecks/VerifyChangedFunctionsDocumentationCheckinHandler;", "Lcom/intellij/openapi/vcs/checkin/CheckinHandler;", "Lcom/intellij/openapi/vcs/checkin/CommitCheck;", "project", "Lcom/intellij/openapi/project/Project;", "panel", "Lcom/intellij/openapi/vcs/CheckinProjectPanel;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/vcs/CheckinProjectPanel;)V", "getBeforeCheckinConfigurationPanel", "Lcom/intellij/openapi/vcs/ui/RefreshableOnComponent;", "getExecutionOrder", "Lcom/intellij/openapi/vcs/checkin/CommitCheck$ExecutionOrder;", "isEnabled", "", "runCheck", "Lcom/intellij/openapi/vcs/checkin/CommitProblem;", "commitInfo", "Lcom/intellij/openapi/vcs/checkin/CommitInfo;", "(Lcom/intellij/openapi/vcs/checkin/CommitInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "InappropriateDocumentationCommitProblem", "intellij.ml.llm.kotlin"})
/*     */ public final class VerifyChangedFunctionsDocumentationCheckinHandler extends CheckinHandler implements CommitCheck {
/*  39 */   public VerifyChangedFunctionsDocumentationCheckinHandler(@NotNull Project project, @NotNull CheckinProjectPanel panel) { this.project = project;
/*  40 */     this.panel = panel; } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\016\020\003\032\0020\004XT¢\006\002\n\000R\016\020\005\032\0020\006X\004¢\006\002\n\000R\016\020\007\032\0020\006X\004¢\006\002\n\000¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/kotlin/commitChecks/VerifyChangedFunctionsDocumentationCheckinHandler$Companion;", "", "()V", "PROP_NAME", "", "javaInspectionWrapper", "Lcom/intellij/codeInspection/ex/LocalInspectionToolWrapper;", "kotlinInspectionWrapper", "intellij.ml.llm.kotlin"})
/*     */   public static final class Companion {
/*     */     private Companion() {} } @NotNull
/*  43 */   public static final Companion Companion = new Companion(null); @NotNull private final Project project; @NotNull private final CheckinProjectPanel panel; @NotNull private static final LocalInspectionToolWrapper javaInspectionWrapper = new LocalInspectionToolWrapper((LocalInspectionTool)new JavaInappropriateDocumentationInspection()); @NotNull
/*  44 */   private static final LocalInspectionToolWrapper kotlinInspectionWrapper = new LocalInspectionToolWrapper((LocalInspectionTool)new KotlinInappropriateDocumentationInspection());
/*     */   @NotNull
/*     */   public static final String PROP_NAME = "verifyChangedFunctionDocsBeforeCheckin";
/*     */   
/*     */   @NotNull
/*     */   public RefreshableOnComponent getBeforeCheckinConfigurationPanel() {
/*  50 */     return BooleanCommitOption.Companion.create(
/*  51 */         this.project, this, false, 
/*  52 */         LLMBundle.message("before.checkin.verify.changed.function.doc", new Object[0]), new VerifyChangedFunctionsDocumentationCheckinHandler$getBeforeCheckinConfigurationPanel$1(), this::getBeforeCheckinConfigurationPanel$lambda$0); } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\013\n\002\b\002\020\000\032\0020\001H\n¢\006\004\b\002\020\003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}) static final class VerifyChangedFunctionsDocumentationCheckinHandler$getBeforeCheckinConfigurationPanel$1 extends Lambda implements Function0<Boolean> { @NotNull
/*  53 */     public final Boolean invoke() { return Boolean.valueOf(PropertiesComponent.getInstance(VerifyChangedFunctionsDocumentationCheckinHandler.this.project).isTrueValue("verifyChangedFunctionDocsBeforeCheckin")); } VerifyChangedFunctionsDocumentationCheckinHandler$getBeforeCheckinConfigurationPanel$1() { super(0); } }
/*  54 */    private static final void getBeforeCheckinConfigurationPanel$lambda$0(VerifyChangedFunctionsDocumentationCheckinHandler this$0, Boolean value) { Intrinsics.checkNotNullParameter(this$0, "this$0"); Intrinsics.checkNotNullParameter(value, "value"); PropertiesComponent.getInstance(this$0.project).setValue("verifyChangedFunctionDocsBeforeCheckin", value.booleanValue(), false); }
/*     */   
/*     */   @NotNull
/*     */   public CommitCheck.ExecutionOrder getExecutionOrder() {
/*  58 */     return CommitCheck.ExecutionOrder.POST_COMMIT;
/*     */   }
/*  60 */   public boolean isEnabled() { return PropertiesComponent.getInstance(this.project).isTrueValue("verifyChangedFunctionDocsBeforeCheckin"); } @Nullable
/*     */   public Object runCheck(@NotNull CommitInfo commitInfo, @NotNull Continuation<? super CommitProblem> paramContinuation) { // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/kotlin/commitChecks/VerifyChangedFunctionsDocumentationCheckinHandler$runCheck$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/kotlin/commitChecks/VerifyChangedFunctionsDocumentationCheckinHandler$runCheck$1
/*     */     //   11: astore #6
/*     */     //   13: aload #6
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #6
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/kotlin/commitChecks/VerifyChangedFunctionsDocumentationCheckinHandler$runCheck$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/kotlin/commitChecks/VerifyChangedFunctionsDocumentationCheckinHandler;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #6
/*     */     //   50: aload #6
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #5
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #7
/*     */     //   62: aload #6
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 167, 0 -> 88, 1 -> 133
/*     */     //   88: aload #5
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   97: aload_1
/*     */     //   98: invokestatic findChangedFunctionsWithDoc : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/vcs/checkin/CommitInfo;)Ljava/util/List;
/*     */     //   101: astore_3
/*     */     //   102: new com/intellij/ml/llm/kotlin/commitChecks/VerifyChangedFunctionsDocumentationCheckinHandler$runCheck$problems$1
/*     */     //   105: dup
/*     */     //   106: aload_3
/*     */     //   107: invokespecial <init> : (Ljava/util/List;)V
/*     */     //   110: checkcast kotlin/jvm/functions/Function0
/*     */     //   113: aload #6
/*     */     //   115: aload #6
/*     */     //   117: iconst_1
/*     */     //   118: putfield label : I
/*     */     //   121: invokestatic coroutineToIndicator : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   124: dup
/*     */     //   125: aload #7
/*     */     //   127: if_acmpne -> 140
/*     */     //   130: aload #7
/*     */     //   132: areturn
/*     */     //   133: aload #5
/*     */     //   135: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   138: aload #5
/*     */     //   140: checkcast java/util/List
/*     */     //   143: astore #4
/*     */     //   145: aload #4
/*     */     //   147: invokeinterface isEmpty : ()Z
/*     */     //   152: ifeq -> 157
/*     */     //   155: aconst_null
/*     */     //   156: areturn
/*     */     //   157: new com/intellij/ml/llm/kotlin/commitChecks/VerifyChangedFunctionsDocumentationCheckinHandler$InappropriateDocumentationCommitProblem
/*     */     //   160: dup
/*     */     //   161: aload #4
/*     */     //   163: invokespecial <init> : (Ljava/util/List;)V
/*     */     //   166: areturn
/*     */     //   167: new java/lang/IllegalStateException
/*     */     //   170: dup
/*     */     //   171: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   173: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   176: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #62	-> 60
/*     */     //   #63	-> 93
/*     */     //   #64	-> 102
/*     */     //   #62	-> 130
/*     */     //   #78	-> 145
/*     */     //   #79	-> 155
/*     */     //   #81	-> 157
/*     */     //   #62	-> 167
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	9	0	this	Lcom/intellij/ml/llm/kotlin/commitChecks/VerifyChangedFunctionsDocumentationCheckinHandler;
/*     */     //   93	9	1	commitInfo	Lcom/intellij/openapi/vcs/checkin/CommitInfo;
/*     */     //   102	22	3	changedFunctionsWithDoc	Ljava/util/List;
/*     */     //   145	22	4	problems	Ljava/util/List;
/*     */     //   50	117	6	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	110	5	$result	Ljava/lang/Object; } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020 \n\002\030\002\n\002\b\002\020\000\032\020\022\f\022\n \003*\004\030\0010\0020\0020\001H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "Lcom/intellij/codeInspection/ProblemDescriptor;", "kotlin.jvm.PlatformType", "invoke"})
/*     */   @SourceDebugExtension({"SMAP\nVerifyChangedFunctionsDocumentationCheckinHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerifyChangedFunctionsDocumentationCheckinHandler.kt\ncom/intellij/ml/llm/kotlin/commitChecks/VerifyChangedFunctionsDocumentationCheckinHandler$runCheck$problems$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,157:1\n1477#2:158\n1502#2,3:159\n1505#2,3:169\n361#3,7:162\n76#4:172\n96#4,5:173\n*S KotlinDebug\n*F\n+ 1 VerifyChangedFunctionsDocumentationCheckinHandler.kt\ncom/intellij/ml/llm/kotlin/commitChecks/VerifyChangedFunctionsDocumentationCheckinHandler$runCheck$problems$1\n*L\n65#1:158\n65#1:159,3\n65#1:169,3\n65#1:162,7\n65#1:172\n65#1:173,5\n*E\n"})
/*     */   static final class VerifyChangedFunctionsDocumentationCheckinHandler$runCheck$problems$1 extends Lambda implements Function0<List<? extends ProblemDescriptor>> {
/*     */     @NotNull
/*  65 */     public final List<ProblemDescriptor> invoke() { Iterable<PsiElement> $this$groupBy$iv = this.$changedFunctionsWithDoc; int $i$f$groupBy = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 158 */       Iterable<PsiElement> iterable1 = $this$groupBy$iv; Map<Object, Object> map3 = new LinkedHashMap<>(); int $i$f$groupByTo = 0;
/* 159 */       for (PsiElement element$iv$iv : iterable1) {
/* 160 */         PsiElement it = element$iv$iv; int $i$a$-groupBy-VerifyChangedFunctionsDocumentationCheckinHandler$runCheck$problems$1$1 = 0; Object key$iv$iv = it.getContainingFile();
/* 161 */         Map<Object, Object> $this$getOrPut$iv$iv$iv = map3; int $i$f$getOrPut = 0;
/* 162 */         Object value$iv$iv$iv = $this$getOrPut$iv$iv$iv.get(key$iv$iv);
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 171 */       Map<Object, Object> map1 = map3; int $i$f$flatMap = 0;
/* 172 */       Map<Object, Object> map2 = map1; Collection destination$iv$iv = new ArrayList(); int $i$f$flatMapTo = 0;
/* 173 */       for (Map.Entry<Object, Object> element$iv$iv : map2.entrySet()) {
/* 174 */         Map.Entry<Object, Object> entry1 = element$iv$iv; int $i$a$-flatMap-VerifyChangedFunctionsDocumentationCheckinHandler$runCheck$problems$1$2 = 0; PsiFile file = (PsiFile)entry1.getKey(); List elements = (List)entry1.getValue(); LocalInspectionToolWrapper[] arrayOfLocalInspectionToolWrapper = new LocalInspectionToolWrapper[2]; arrayOfLocalInspectionToolWrapper[0] = VerifyChangedFunctionsDocumentationCheckinHandler.javaInspectionWrapper; arrayOfLocalInspectionToolWrapper[1] = VerifyChangedFunctionsDocumentationCheckinHandler.kotlinInspectionWrapper;
/*     */         Intrinsics.checkNotNull(ProgressManager.getGlobalProgressIndicator());
/*     */       } 
/* 177 */       return (List<ProblemDescriptor>)destination$iv$iv; }
/*     */ 
/*     */     
/*     */     VerifyChangedFunctionsDocumentationCheckinHandler$runCheck$problems$1(List<PsiElement> $changedFunctionsWithDoc) {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\005\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\030\0002\0020\001B\023\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\002\020\005J%\020\f\032\0020\r2\006\020\016\032\0020\0172\013\020\020\032\0070\007¢\006\002\b\0212\006\020\022\032\0020\023H\002J\036\020\024\032\0020\r2\006\020\022\032\0020\0232\f\020\025\032\b\022\004\022\0020\0260\003H\002J\020\020\027\032\0020\r2\006\020\022\032\0020\023H\026R\024\020\002\032\b\022\004\022\0020\0040\003X\004¢\006\002\n\000R\024\020\006\032\0020\007XD¢\006\b\n\000\032\004\b\b\020\tR\024\020\n\032\0020\007X\004¢\006\b\n\000\032\004\b\013\020\t¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/kotlin/commitChecks/VerifyChangedFunctionsDocumentationCheckinHandler$InappropriateDocumentationCommitProblem;", "Lcom/intellij/openapi/vcs/checkin/CommitProblemWithDetails;", "problems", "", "Lcom/intellij/codeInspection/ProblemDescriptor;", "(Ljava/util/List;)V", "showDetailsAction", "", "getShowDetailsAction", "()Ljava/lang/String;", "text", "getText", "openMessagesView", "", "errorTreeView", "Lcom/intellij/ide/errorTreeView/NewErrorTreeViewPanel;", "tabDisplayName", "Lcom/intellij/openapi/util/NlsContexts$TabTitle;", "project", "Lcom/intellij/openapi/project/Project;", "show", "smellList", "Lcom/intellij/codeInsight/CodeSmellInfo;", "showDetails", "intellij.ml.llm.kotlin"})
/*     */   @SourceDebugExtension({"SMAP\nVerifyChangedFunctionsDocumentationCheckinHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerifyChangedFunctionsDocumentationCheckinHandler.kt\ncom/intellij/ml/llm/kotlin/commitChecks/VerifyChangedFunctionsDocumentationCheckinHandler$InappropriateDocumentationCommitProblem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,157:1\n1549#2:158\n1620#2,3:159\n1045#2:162\n*S KotlinDebug\n*F\n+ 1 VerifyChangedFunctionsDocumentationCheckinHandler.kt\ncom/intellij/ml/llm/kotlin/commitChecks/VerifyChangedFunctionsDocumentationCheckinHandler$InappropriateDocumentationCommitProblem\n*L\n91#1:158\n91#1:159,3\n103#1:162\n*E\n"})
/*     */   public static final class InappropriateDocumentationCommitProblem implements CommitProblemWithDetails {
/*     */     @NotNull
/*     */     private final List<ProblemDescriptor> problems;
/*     */     @NotNull
/*     */     private final String text;
/*     */     @NotNull
/*     */     private final String showDetailsAction;
/*     */     
/*     */     public InappropriateDocumentationCommitProblem(@NotNull List<ProblemDescriptor> problems) {
/*     */       this.problems = problems;
/*     */       this.text = "" + this.problems.size() + " inappropriate documentation";
/*     */       this.showDetailsAction = "&Review inappropriate documentation";
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String getText() {
/*     */       return this.text;
/*     */     }
/*     */     
/*     */     public void showDetails(@NotNull Project project) {
/*     */       Intrinsics.checkNotNullParameter(project, "project");
/*     */       List<ProblemDescriptor> list1 = this.problems;
/*     */       Project project1 = project;
/*     */       InappropriateDocumentationCommitProblem inappropriateDocumentationCommitProblem = this;
/*     */       int $i$f$map = 0;
/*     */       List<ProblemDescriptor> list2 = list1;
/*     */       Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10));
/*     */       int $i$f$mapTo = 0;
/*     */       for (ProblemDescriptor item$iv$iv : list2) {
/*     */         ProblemDescriptor problemDescriptor1 = item$iv$iv;
/*     */         Collection collection = destination$iv$iv;
/*     */         int $i$a$-map-VerifyChangedFunctionsDocumentationCheckinHandler$InappropriateDocumentationCommitProblem$showDetails$1 = 0;
/*     */         Intrinsics.checkNotNull(PsiDocumentManager.getInstance(project).getDocument(problemDescriptor1.getPsiElement().getContainingFile()));
/*     */       } 
/*     */       List<CodeSmellInfo> list = (List)destination$iv$iv;
/*     */       inappropriateDocumentationCommitProblem.show(project1, list);
/*     */     }
/*     */     
/*     */     private final void show(Project project, List smellList) {
/*     */       // Byte code:
/*     */       //   0: aload_2
/*     */       //   1: checkcast java/lang/Iterable
/*     */       //   4: astore_3
/*     */       //   5: iconst_0
/*     */       //   6: istore #4
/*     */       //   8: aload_3
/*     */       //   9: new com/intellij/ml/llm/kotlin/commitChecks/VerifyChangedFunctionsDocumentationCheckinHandler$InappropriateDocumentationCommitProblem$show$$inlined$sortedBy$1
/*     */       //   12: dup
/*     */       //   13: invokespecial <init> : ()V
/*     */       //   16: checkcast java/util/Comparator
/*     */       //   19: invokestatic sortedWith : (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
/*     */       //   22: pop
/*     */       //   23: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*     */       //   26: aload_1
/*     */       //   27: aload_2
/*     */       //   28: aload_0
/*     */       //   29: <illegal opcode> run : (Lcom/intellij/openapi/project/Project;Ljava/util/List;Lcom/intellij/ml/llm/kotlin/commitChecks/VerifyChangedFunctionsDocumentationCheckinHandler$InappropriateDocumentationCommitProblem;)Ljava/lang/Runnable;
/*     */       //   34: invokeinterface invokeLater : (Ljava/lang/Runnable;)V
/*     */       //   39: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #103	-> 0
/*     */       //   #162	-> 8
/*     */       //   #162	-> 19
/*     */       //   #105	-> 23
/*     */       //   #132	-> 39
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   8	14	4	$i$f$sortedBy	I
/*     */       //   5	17	3	$this$sortedBy$iv	Ljava/lang/Iterable;
/*     */       //   0	40	0	this	Lcom/intellij/ml/llm/kotlin/commitChecks/VerifyChangedFunctionsDocumentationCheckinHandler$InappropriateDocumentationCommitProblem;
/*     */       //   0	40	1	project	Lcom/intellij/openapi/project/Project;
/*     */       //   0	40	2	smellList	Ljava/util/List;
/*     */     }
/*     */     
/*     */     private static final void show$lambda$2(Project $project, List $smellList, InappropriateDocumentationCommitProblem this$0) {
/*     */       Intrinsics.checkNotNullParameter($project, "$project");
/*     */       Intrinsics.checkNotNullParameter($smellList, "$smellList");
/*     */       Intrinsics.checkNotNullParameter(this$0, "this$0");
/*     */       if ($project.isDisposed())
/*     */         return; 
/*     */       if ($smellList.isEmpty())
/*     */         return; 
/*     */       NewErrorTreeViewPanel errorTreeView = new NewErrorTreeViewPanel($project, null, false, false, null, null, null, 124, null);
/*     */       this$0.openMessagesView(errorTreeView, "Inappropriate documentation", $project);
/*     */       Intrinsics.checkNotNullExpressionValue(FileDocumentManager.getInstance(), "getInstance()");
/*     */       FileDocumentManager fileManager = FileDocumentManager.getInstance();
/*     */       for (CodeSmellInfo smellInfo : $smellList) {
/*     */         VirtualFile file;
/*     */         if (fileManager.getFile(smellInfo.getDocument()) == null) {
/*     */           fileManager.getFile(smellInfo.getDocument());
/*     */           continue;
/*     */         } 
/*     */         Intrinsics.checkNotNullExpressionValue(file.getPresentableUrl(), "file.presentableUrl");
/*     */         String presentableUrl = file.getPresentableUrl();
/*     */         OpenFileDescriptor navigatable = new OpenFileDescriptor($project, file, smellInfo.getStartLine(), smellInfo.getStartColumn());
/*     */         String exportPrefix = NewErrorTreeViewPanel.Companion.createExportPrefix(smellInfo.getStartLine() + 1);
/*     */         String rendererPrefix = NewErrorTreeViewPanel.Companion.createRendererPrefix(smellInfo.getStartLine() + 1, smellInfo.getStartColumn() + 1);
/*     */         String[] arrayOfString = new String[1];
/*     */         Intrinsics.checkNotNullExpressionValue(smellInfo.getDescription(), "smellInfo.description");
/*     */         arrayOfString[0] = smellInfo.getDescription();
/*     */         errorTreeView.addMessage(5, arrayOfString, FileUtil.getLocationRelativeToUserHome(presentableUrl), (Navigatable)navigatable, exportPrefix, rendererPrefix, null);
/*     */       } 
/*     */     }
/*     */     
/*     */     private final void openMessagesView(NewErrorTreeViewPanel errorTreeView, String tabDisplayName, Project project) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getInstance : ()Lcom/intellij/openapi/command/CommandProcessor;
/*     */       //   3: astore #4
/*     */       //   5: aload #4
/*     */       //   7: aload_3
/*     */       //   8: aload_3
/*     */       //   9: aload_1
/*     */       //   10: aload_2
/*     */       //   11: <illegal opcode> run : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ide/errorTreeView/NewErrorTreeViewPanel;Ljava/lang/String;)Ljava/lang/Runnable;
/*     */       //   16: ldc 'command.name.open.error.message.view'
/*     */       //   18: iconst_0
/*     */       //   19: anewarray java/lang/Object
/*     */       //   22: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */       //   25: aconst_null
/*     */       //   26: invokevirtual executeCommand : (Lcom/intellij/openapi/project/Project;Ljava/lang/Runnable;Ljava/lang/String;Ljava/lang/Object;)V
/*     */       //   29: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #139	-> 0
/*     */       //   #140	-> 5
/*     */       //   #152	-> 16
/*     */       //   #140	-> 26
/*     */       //   #153	-> 29
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   5	25	4	commandProcessor	Lcom/intellij/openapi/command/CommandProcessor;
/*     */       //   0	30	0	this	Lcom/intellij/ml/llm/kotlin/commitChecks/VerifyChangedFunctionsDocumentationCheckinHandler$InappropriateDocumentationCommitProblem;
/*     */       //   0	30	1	errorTreeView	Lcom/intellij/ide/errorTreeView/NewErrorTreeViewPanel;
/*     */       //   0	30	2	tabDisplayName	Ljava/lang/String;
/*     */       //   0	30	3	project	Lcom/intellij/openapi/project/Project;
/*     */     }
/*     */     
/*     */     private static final void openMessagesView$lambda$4(Project $project, NewErrorTreeViewPanel $errorTreeView, String $tabDisplayName) {
/*     */       // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: ldc '$project'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_1
/*     */       //   7: ldc_w '$errorTreeView'
/*     */       //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   13: aload_2
/*     */       //   14: ldc_w '$tabDisplayName'
/*     */       //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   20: aload_0
/*     */       //   21: invokestatic getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/ui/content/MessageView;
/*     */       //   24: astore_3
/*     */       //   25: aload_3
/*     */       //   26: aload_1
/*     */       //   27: aload_2
/*     */       //   28: aload_3
/*     */       //   29: aload_0
/*     */       //   30: <illegal opcode> run : (Lcom/intellij/ide/errorTreeView/NewErrorTreeViewPanel;Ljava/lang/String;Lcom/intellij/ui/content/MessageView;Lcom/intellij/openapi/project/Project;)Ljava/lang/Runnable;
/*     */       //   35: invokeinterface runWhenInitialized : (Ljava/lang/Runnable;)V
/*     */       //   40: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #141	-> 20
/*     */       //   #142	-> 25
/*     */       //   #152	-> 40
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   25	16	3	messageView	Lcom/intellij/ui/content/MessageView;
/*     */       //   0	41	0	$project	Lcom/intellij/openapi/project/Project;
/*     */       //   0	41	1	$errorTreeView	Lcom/intellij/ide/errorTreeView/NewErrorTreeViewPanel;
/*     */       //   0	41	2	$tabDisplayName	Ljava/lang/String;
/*     */     }
/*     */     
/*     */     private static final void openMessagesView$lambda$4$lambda$3(NewErrorTreeViewPanel $errorTreeView, String $tabDisplayName, MessageView $messageView, Project $project) {
/*     */       Intrinsics.checkNotNullParameter($errorTreeView, "$errorTreeView");
/*     */       Intrinsics.checkNotNullParameter($tabDisplayName, "$tabDisplayName");
/*     */       Intrinsics.checkNotNullParameter($project, "$project");
/*     */       Intrinsics.checkNotNullExpressionValue(ContentFactory.getInstance().createContent((JComponent)$errorTreeView, $tabDisplayName, true), "getInstance().createCont…ew, tabDisplayName, true)");
/*     */       Content content = ContentFactory.getInstance().createContent((JComponent)$errorTreeView, $tabDisplayName, true);
/*     */       $messageView.getContentManager().addContent(content);
/*     */       Disposer.register((Disposable)content, (Disposable)$errorTreeView);
/*     */       $messageView.getContentManager().setSelectedContent(content);
/*     */       ContentManagerUtil.cleanupContents(content, $project, $tabDisplayName);
/*     */       Intrinsics.checkNotNull(ToolWindowManager.Companion.getInstance($project).getToolWindow("Messages"));
/*     */       ToolWindowManager.Companion.getInstance($project).getToolWindow("Messages").activate(null);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String getShowDetailsAction() {
/*     */       return this.showDetailsAction;
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "VerifyChangedFunctionsDocumentationCheckinHandler.kt", l = {64}, i = {}, s = {}, n = {}, m = "runCheck", c = "com.intellij.ml.llm.kotlin.commitChecks.VerifyChangedFunctionsDocumentationCheckinHandler")
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
/*     */   static final class VerifyChangedFunctionsDocumentationCheckinHandler$runCheck$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     VerifyChangedFunctionsDocumentationCheckinHandler$runCheck$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return VerifyChangedFunctionsDocumentationCheckinHandler.this.runCheck(null, (Continuation<? super CommitProblem>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/commitChecks/VerifyChangedFunctionsDocumentationCheckinHandler.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */