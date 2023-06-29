/*    */ package com.intellij.ml.llm.intentions.chat;
/*    */ 
/*    */ import com.intellij.codeInsight.intention.IntentionAction;
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.ui.popup.ListSeparator;
/*    */ import com.intellij.openapi.ui.popup.PopupStep;
/*    */ import com.intellij.openapi.ui.popup.util.BaseListPopupStep;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000+\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000*\001\000\b\n\030\0002\b\022\004\022\0020\0020\001J\024\020\003\032\004\030\0010\0042\b\020\005\032\004\030\0010\002H\026J\020\020\006\032\0020\0072\006\020\005\032\0020\002H\026J \020\b\032\b\022\002\b\003\030\0010\t2\b\020\n\032\004\030\0010\0022\006\020\013\032\0020\fH\026¨\006\r"}, d2 = {"com/intellij/ml/llm/intentions/chat/AIAssistantIntention$invoke$popupStep$1", "Lcom/intellij/openapi/ui/popup/util/BaseListPopupStep;", "Lcom/intellij/codeInsight/intention/IntentionAction;", "getSeparatorAbove", "Lcom/intellij/openapi/ui/popup/ListSeparator;", "value", "getTextFor", "", "onChosen", "Lcom/intellij/openapi/ui/popup/PopupStep;", "selectedValue", "finalChoice", "", "intellij.ml.llm"})
/*    */ public final class AIAssistantIntention$invoke$popupStep$1
/*    */   extends BaseListPopupStep<IntentionAction>
/*    */ {
/*    */   AIAssistantIntention$invoke$popupStep$1(List $intentions, IntentionAction $firstNonHighPriorityAction, Project $project, Editor $editor, PsiFile $file, String $super_call_param$1) {
/* 57 */     super($super_call_param$1, $intentions); } @NotNull
/* 58 */   public String getTextFor(@NotNull IntentionAction value) { Intrinsics.checkNotNullParameter(value, "value"); Intrinsics.checkNotNullExpressionValue(value.getText(), "value.text"); return value.getText(); }
/*    */    @Nullable
/*    */   public ListSeparator getSeparatorAbove(@Nullable IntentionAction value) {
/* 61 */     return (value != null && Intrinsics.areEqual(value, this.$firstNonHighPriorityAction)) ? new ListSeparator() : null;
/*    */   } @Nullable
/*    */   public PopupStep<?> onChosen(@Nullable IntentionAction selectedValue, boolean finalChoice) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload_1
/*    */     //   2: aload_0
/*    */     //   3: getfield $project : Lcom/intellij/openapi/project/Project;
/*    */     //   6: aload_0
/*    */     //   7: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*    */     //   10: aload_0
/*    */     //   11: getfield $file : Lcom/intellij/psi/PsiFile;
/*    */     //   14: <illegal opcode> run : (Lcom/intellij/codeInsight/intention/IntentionAction;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Editor;Lcom/intellij/psi/PsiFile;)Ljava/lang/Runnable;
/*    */     //   19: invokevirtual doFinalStep : (Ljava/lang/Runnable;)Lcom/intellij/openapi/ui/popup/PopupStep;
/*    */     //   22: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #65	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	23	0	this	Lcom/intellij/ml/llm/intentions/chat/AIAssistantIntention$invoke$popupStep$1;
/*    */     //   0	23	1	selectedValue	Lcom/intellij/codeInsight/intention/IntentionAction;
/*    */     //   0	23	2	finalChoice	Z
/*    */   } private static final void onChosen$lambda$0(IntentionAction $selectedValue, Project $project, Editor $editor, PsiFile $file) {
/* 66 */     Intrinsics.checkNotNullParameter($project, "$project"); if ($selectedValue != null) { $selectedValue.invoke($project, $editor, $file); }
/*    */     else
/*    */     {  }
/*    */   
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/chat/AIAssistantIntention$invoke$popupStep$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */