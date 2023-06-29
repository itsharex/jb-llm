/*     */ package com.intellij.ml.llm.kotlin.commitChecks;
/*     */ 
/*     */ import com.intellij.codeInsight.CodeSmellInfo;
/*     */ import com.intellij.codeInspection.ProblemDescriptor;
/*     */ import com.intellij.ide.errorTreeView.NewErrorTreeViewPanel;
/*     */ import com.intellij.openapi.Disposable;
/*     */ import com.intellij.openapi.fileEditor.FileDocumentManager;
/*     */ import com.intellij.openapi.fileEditor.OpenFileDescriptor;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.util.Disposer;
/*     */ import com.intellij.openapi.util.io.FileUtil;
/*     */ import com.intellij.openapi.vcs.checkin.CommitProblemWithDetails;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import com.intellij.openapi.wm.ToolWindowManager;
/*     */ import com.intellij.pom.Navigatable;
/*     */ import com.intellij.psi.PsiDocumentManager;
/*     */ import com.intellij.ui.content.Content;
/*     */ import com.intellij.ui.content.ContentFactory;
/*     */ import com.intellij.ui.content.ContentManagerUtil;
/*     */ import com.intellij.ui.content.MessageView;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import javax.swing.JComponent;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\005\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\030\0002\0020\001B\023\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\002\020\005J%\020\f\032\0020\r2\006\020\016\032\0020\0172\013\020\020\032\0070\007¢\006\002\b\0212\006\020\022\032\0020\023H\002J\036\020\024\032\0020\r2\006\020\022\032\0020\0232\f\020\025\032\b\022\004\022\0020\0260\003H\002J\020\020\027\032\0020\r2\006\020\022\032\0020\023H\026R\024\020\002\032\b\022\004\022\0020\0040\003X\004¢\006\002\n\000R\024\020\006\032\0020\007XD¢\006\b\n\000\032\004\b\b\020\tR\024\020\n\032\0020\007X\004¢\006\b\n\000\032\004\b\013\020\t¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/kotlin/commitChecks/VerifyChangedFunctionsDocumentationCheckinHandler$InappropriateDocumentationCommitProblem;", "Lcom/intellij/openapi/vcs/checkin/CommitProblemWithDetails;", "problems", "", "Lcom/intellij/codeInspection/ProblemDescriptor;", "(Ljava/util/List;)V", "showDetailsAction", "", "getShowDetailsAction", "()Ljava/lang/String;", "text", "getText", "openMessagesView", "", "errorTreeView", "Lcom/intellij/ide/errorTreeView/NewErrorTreeViewPanel;", "tabDisplayName", "Lcom/intellij/openapi/util/NlsContexts$TabTitle;", "project", "Lcom/intellij/openapi/project/Project;", "show", "smellList", "Lcom/intellij/codeInsight/CodeSmellInfo;", "showDetails", "intellij.ml.llm.kotlin"})
/*     */ @SourceDebugExtension({"SMAP\nVerifyChangedFunctionsDocumentationCheckinHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerifyChangedFunctionsDocumentationCheckinHandler.kt\ncom/intellij/ml/llm/kotlin/commitChecks/VerifyChangedFunctionsDocumentationCheckinHandler$InappropriateDocumentationCommitProblem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,157:1\n1549#2:158\n1620#2,3:159\n1045#2:162\n*S KotlinDebug\n*F\n+ 1 VerifyChangedFunctionsDocumentationCheckinHandler.kt\ncom/intellij/ml/llm/kotlin/commitChecks/VerifyChangedFunctionsDocumentationCheckinHandler$InappropriateDocumentationCommitProblem\n*L\n91#1:158\n91#1:159,3\n103#1:162\n*E\n"})
/*     */ public final class InappropriateDocumentationCommitProblem
/*     */   implements CommitProblemWithDetails
/*     */ {
/*     */   @NotNull
/*     */   private final List<ProblemDescriptor> problems;
/*     */   @NotNull
/*     */   private final String text;
/*     */   @NotNull
/*     */   private final String showDetailsAction;
/*     */   
/*     */   public InappropriateDocumentationCommitProblem(@NotNull List<ProblemDescriptor> problems) {
/*  84 */     this.problems = problems;
/*     */     
/*  86 */     this.text = "" + this.problems.size() + " inappropriate documentation";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 155 */     this.showDetailsAction = "&Review inappropriate documentation"; } public void showDetails(@NotNull Project project) { Intrinsics.checkNotNullParameter(project, "project"); List<ProblemDescriptor> list1 = this.problems; Project project1 = project;
/*     */     InappropriateDocumentationCommitProblem inappropriateDocumentationCommitProblem = this;
/*     */     int $i$f$map = 0;
/* 158 */     List<ProblemDescriptor> list2 = list1; Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10)); int $i$f$mapTo = 0;
/* 159 */     for (ProblemDescriptor item$iv$iv : list2) {
/* 160 */       ProblemDescriptor problemDescriptor1 = item$iv$iv; Collection collection = destination$iv$iv; int $i$a$-map-VerifyChangedFunctionsDocumentationCheckinHandler$InappropriateDocumentationCommitProblem$showDetails$1 = 0; Intrinsics.checkNotNull(PsiDocumentManager.getInstance(project).getDocument(problemDescriptor1.getPsiElement().getContainingFile()));
/* 161 */     }  List<CodeSmellInfo> list = (List)destination$iv$iv;
/*     */     inappropriateDocumentationCommitProblem.show(project1, list); }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public String getText() {
/*     */     return this.text;
/*     */   }
/*     */   
/*     */   private final void show(Project project, List smellList) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: checkcast java/lang/Iterable
/*     */     //   4: astore_3
/*     */     //   5: iconst_0
/*     */     //   6: istore #4
/*     */     //   8: aload_3
/*     */     //   9: new com/intellij/ml/llm/kotlin/commitChecks/VerifyChangedFunctionsDocumentationCheckinHandler$InappropriateDocumentationCommitProblem$show$$inlined$sortedBy$1
/*     */     //   12: dup
/*     */     //   13: invokespecial <init> : ()V
/*     */     //   16: checkcast java/util/Comparator
/*     */     //   19: invokestatic sortedWith : (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
/*     */     //   22: pop
/*     */     //   23: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*     */     //   26: aload_1
/*     */     //   27: aload_2
/*     */     //   28: aload_0
/*     */     //   29: <illegal opcode> run : (Lcom/intellij/openapi/project/Project;Ljava/util/List;Lcom/intellij/ml/llm/kotlin/commitChecks/VerifyChangedFunctionsDocumentationCheckinHandler$InappropriateDocumentationCommitProblem;)Ljava/lang/Runnable;
/*     */     //   34: invokeinterface invokeLater : (Ljava/lang/Runnable;)V
/*     */     //   39: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #103	-> 0
/*     */     //   #162	-> 8
/*     */     //   #162	-> 19
/*     */     //   #105	-> 23
/*     */     //   #132	-> 39
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   8	14	4	$i$f$sortedBy	I
/*     */     //   5	17	3	$this$sortedBy$iv	Ljava/lang/Iterable;
/*     */     //   0	40	0	this	Lcom/intellij/ml/llm/kotlin/commitChecks/VerifyChangedFunctionsDocumentationCheckinHandler$InappropriateDocumentationCommitProblem;
/*     */     //   0	40	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   0	40	2	smellList	Ljava/util/List;
/*     */   }
/*     */   
/*     */   private static final void show$lambda$2(Project $project, List $smellList, InappropriateDocumentationCommitProblem this$0) {
/*     */     Intrinsics.checkNotNullParameter($project, "$project");
/*     */     Intrinsics.checkNotNullParameter($smellList, "$smellList");
/*     */     Intrinsics.checkNotNullParameter(this$0, "this$0");
/*     */     if ($project.isDisposed())
/*     */       return; 
/*     */     if ($smellList.isEmpty())
/*     */       return; 
/*     */     NewErrorTreeViewPanel errorTreeView = new NewErrorTreeViewPanel($project, null, false, false, null, null, null, 124, null);
/*     */     this$0.openMessagesView(errorTreeView, "Inappropriate documentation", $project);
/*     */     Intrinsics.checkNotNullExpressionValue(FileDocumentManager.getInstance(), "getInstance()");
/*     */     FileDocumentManager fileManager = FileDocumentManager.getInstance();
/*     */     for (CodeSmellInfo smellInfo : $smellList) {
/*     */       VirtualFile file;
/*     */       if (fileManager.getFile(smellInfo.getDocument()) == null) {
/*     */         fileManager.getFile(smellInfo.getDocument());
/*     */         continue;
/*     */       } 
/*     */       Intrinsics.checkNotNullExpressionValue(file.getPresentableUrl(), "file.presentableUrl");
/*     */       String presentableUrl = file.getPresentableUrl();
/*     */       OpenFileDescriptor navigatable = new OpenFileDescriptor($project, file, smellInfo.getStartLine(), smellInfo.getStartColumn());
/*     */       String exportPrefix = NewErrorTreeViewPanel.Companion.createExportPrefix(smellInfo.getStartLine() + 1);
/*     */       String rendererPrefix = NewErrorTreeViewPanel.Companion.createRendererPrefix(smellInfo.getStartLine() + 1, smellInfo.getStartColumn() + 1);
/*     */       String[] arrayOfString = new String[1];
/*     */       Intrinsics.checkNotNullExpressionValue(smellInfo.getDescription(), "smellInfo.description");
/*     */       arrayOfString[0] = smellInfo.getDescription();
/*     */       errorTreeView.addMessage(5, arrayOfString, FileUtil.getLocationRelativeToUserHome(presentableUrl), (Navigatable)navigatable, exportPrefix, rendererPrefix, null);
/*     */     } 
/*     */   }
/*     */   
/*     */   private final void openMessagesView(NewErrorTreeViewPanel errorTreeView, String tabDisplayName, Project project) {
/*     */     // Byte code:
/*     */     //   0: invokestatic getInstance : ()Lcom/intellij/openapi/command/CommandProcessor;
/*     */     //   3: astore #4
/*     */     //   5: aload #4
/*     */     //   7: aload_3
/*     */     //   8: aload_3
/*     */     //   9: aload_1
/*     */     //   10: aload_2
/*     */     //   11: <illegal opcode> run : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ide/errorTreeView/NewErrorTreeViewPanel;Ljava/lang/String;)Ljava/lang/Runnable;
/*     */     //   16: ldc 'command.name.open.error.message.view'
/*     */     //   18: iconst_0
/*     */     //   19: anewarray java/lang/Object
/*     */     //   22: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   25: aconst_null
/*     */     //   26: invokevirtual executeCommand : (Lcom/intellij/openapi/project/Project;Ljava/lang/Runnable;Ljava/lang/String;Ljava/lang/Object;)V
/*     */     //   29: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #139	-> 0
/*     */     //   #140	-> 5
/*     */     //   #152	-> 16
/*     */     //   #140	-> 26
/*     */     //   #153	-> 29
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   5	25	4	commandProcessor	Lcom/intellij/openapi/command/CommandProcessor;
/*     */     //   0	30	0	this	Lcom/intellij/ml/llm/kotlin/commitChecks/VerifyChangedFunctionsDocumentationCheckinHandler$InappropriateDocumentationCommitProblem;
/*     */     //   0	30	1	errorTreeView	Lcom/intellij/ide/errorTreeView/NewErrorTreeViewPanel;
/*     */     //   0	30	2	tabDisplayName	Ljava/lang/String;
/*     */     //   0	30	3	project	Lcom/intellij/openapi/project/Project;
/*     */   }
/*     */   
/*     */   private static final void openMessagesView$lambda$4(Project $project, NewErrorTreeViewPanel $errorTreeView, String $tabDisplayName) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '$project'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc_w '$errorTreeView'
/*     */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   13: aload_2
/*     */     //   14: ldc_w '$tabDisplayName'
/*     */     //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   20: aload_0
/*     */     //   21: invokestatic getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/ui/content/MessageView;
/*     */     //   24: astore_3
/*     */     //   25: aload_3
/*     */     //   26: aload_1
/*     */     //   27: aload_2
/*     */     //   28: aload_3
/*     */     //   29: aload_0
/*     */     //   30: <illegal opcode> run : (Lcom/intellij/ide/errorTreeView/NewErrorTreeViewPanel;Ljava/lang/String;Lcom/intellij/ui/content/MessageView;Lcom/intellij/openapi/project/Project;)Ljava/lang/Runnable;
/*     */     //   35: invokeinterface runWhenInitialized : (Ljava/lang/Runnable;)V
/*     */     //   40: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #141	-> 20
/*     */     //   #142	-> 25
/*     */     //   #152	-> 40
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   25	16	3	messageView	Lcom/intellij/ui/content/MessageView;
/*     */     //   0	41	0	$project	Lcom/intellij/openapi/project/Project;
/*     */     //   0	41	1	$errorTreeView	Lcom/intellij/ide/errorTreeView/NewErrorTreeViewPanel;
/*     */     //   0	41	2	$tabDisplayName	Ljava/lang/String;
/*     */   }
/*     */   
/*     */   private static final void openMessagesView$lambda$4$lambda$3(NewErrorTreeViewPanel $errorTreeView, String $tabDisplayName, MessageView $messageView, Project $project) {
/*     */     Intrinsics.checkNotNullParameter($errorTreeView, "$errorTreeView");
/*     */     Intrinsics.checkNotNullParameter($tabDisplayName, "$tabDisplayName");
/*     */     Intrinsics.checkNotNullParameter($project, "$project");
/*     */     Intrinsics.checkNotNullExpressionValue(ContentFactory.getInstance().createContent((JComponent)$errorTreeView, $tabDisplayName, true), "getInstance().createCont…ew, tabDisplayName, true)");
/*     */     Content content = ContentFactory.getInstance().createContent((JComponent)$errorTreeView, $tabDisplayName, true);
/*     */     $messageView.getContentManager().addContent(content);
/*     */     Disposer.register((Disposable)content, (Disposable)$errorTreeView);
/*     */     $messageView.getContentManager().setSelectedContent(content);
/*     */     ContentManagerUtil.cleanupContents(content, $project, $tabDisplayName);
/*     */     Intrinsics.checkNotNull(ToolWindowManager.Companion.getInstance($project).getToolWindow("Messages"));
/*     */     ToolWindowManager.Companion.getInstance($project).getToolWindow("Messages").activate(null);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String getShowDetailsAction() {
/*     */     return this.showDetailsAction;
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/commitChecks/VerifyChangedFunctionsDocumentationCheckinHandler$InappropriateDocumentationCommitProblem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */