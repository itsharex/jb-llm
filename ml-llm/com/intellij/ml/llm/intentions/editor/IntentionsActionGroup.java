/*    */ package com.intellij.ml.llm.intentions.editor;
/*    */ 
/*    */ import com.intellij.codeInsight.intention.IntentionAction;
/*    */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.project.DumbAwareAction;
/*    */ import com.intellij.psi.PsiFile;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\021\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\000\030\0002\0020\0012\0020\002B\005¢\006\002\020\003J\035\020\004\032\b\022\004\022\0020\0060\0052\b\020\007\032\004\030\0010\bH\026¢\006\002\020\t¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/intentions/editor/IntentionsActionGroup;", "Lcom/intellij/openapi/actionSystem/ActionGroup;", "Lcom/intellij/openapi/project/DumbAware;", "()V", "getChildren", "", "Lcom/intellij/openapi/actionSystem/AnAction;", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "(Lcom/intellij/openapi/actionSystem/AnActionEvent;)[Lcom/intellij/openapi/actionSystem/AnAction;", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nIntentionsActionGroup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntentionsActionGroup.kt\ncom/intellij/ml/llm/intentions/editor/IntentionsActionGroup\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,26:1\n26#2:27\n1549#3:28\n1620#3,3:29\n37#4,2:32\n*S KotlinDebug\n*F\n+ 1 IntentionsActionGroup.kt\ncom/intellij/ml/llm/intentions/editor/IntentionsActionGroup\n*L\n15#1:27\n20#1:28\n20#1:29,3\n24#1:32,2\n*E\n"})
/*    */ public final class IntentionsActionGroup extends ActionGroup implements DumbAware {
/* 12 */   public IntentionsActionGroup() { super(LLMBundle.message("editor.popup.intentions.ai.assistant.group", new Object[0]), true); } @NotNull
/*    */   public AnAction[] getChildren(@Nullable AnActionEvent e) {
/*    */     Project project;
/* 15 */     if (e == null || e.getProject() == null) { e.getProject(); int $i$f$emptyArray = 0; return 
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
/* 27 */         new AnAction[0]; }
/* 28 */      Editor editor = (Editor)e.getData(CommonDataKeys.EDITOR); PsiFile file = (PsiFile)e.getData(CommonDataKeys.PSI_FILE); List intentions = IntentionsUtilsKt.getAiAssistantIntentions(project, editor, file); Iterable $this$map$iv = intentions; int $i$f$map = 0; Iterable iterable2 = $this$map$iv; Collection<DumbAwareAction> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 29 */     for (Object item$iv$iv : iterable2) {
/* 30 */       IntentionAction intentionAction = (IntentionAction)item$iv$iv; Collection<DumbAwareAction> collection = destination$iv$iv; int $i$a$-map-IntentionsActionGroup$getChildren$1 = 0; collection.add(DumbAwareAction.create(intentionAction.getText(), new IntentionsActionGroup$getChildren$1$1(intentionAction, project, editor, file)::getChildren$lambda$1$lambda$0));
/* 31 */     }  $this$map$iv = destination$iv$iv; int $i$f$toTypedArray = 0;
/* 32 */     Iterable iterable1 = $this$map$iv;
/* 33 */     return (AnAction[])iterable1.toArray((Object[])new AnAction[0]);
/*    */   }
/*    */   
/*    */   private static final void getChildren$lambda$1$lambda$0(Function1 $tmp0, Object p0) {
/*    */     Intrinsics.checkNotNullParameter($tmp0, "$tmp0");
/*    */     $tmp0.invoke(p0);
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\016\020\002\032\n \004*\004\030\0010\0030\003H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "kotlin.jvm.PlatformType", "invoke"})
/*    */   static final class IntentionsActionGroup$getChildren$1$1 extends Lambda implements Function1<AnActionEvent, Unit> {
/*    */     public final void invoke(AnActionEvent it) {
/*    */       this.$intentionAction.invoke(this.$project, this.$editor, this.$file);
/*    */     }
/*    */     
/*    */     IntentionsActionGroup$getChildren$1$1(IntentionAction $intentionAction, Project $project, Editor $editor, PsiFile $file) {
/*    */       super(1);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/editor/IntentionsActionGroup.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */