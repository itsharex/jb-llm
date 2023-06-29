/*    */ package com.intellij.ml.llm.core.chat.actions.codeSnippet;
/*    */ import com.intellij.openapi.actionSystem.ActionUpdateThread;
/*    */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*    */ import com.intellij.openapi.actionSystem.CommonDataKeys;
/*    */ import com.intellij.openapi.actionSystem.Presentation;
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.project.DumbAwareAction;
/*    */ import com.intellij.openapi.util.Key;
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import com.intellij.ui.components.JBLabel;
/*    */ import javax.swing.JComponent;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\b\000\030\000 \0252\0020\0012\0020\002:\001\025B\005¢\006\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\026J\030\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\rH\026J\b\020\016\032\0020\017H\026J\020\020\020\032\0020\0052\006\020\006\032\0020\007H\026J\030\020\021\032\0020\0052\006\020\022\032\0020\t2\006\020\n\032\0020\013H\026J\021\020\023\032\0070\r¢\006\002\b\024*\0020\013H\003¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/core/chat/actions/codeSnippet/AIAssistantLanguageLabelAction;", "Lcom/intellij/openapi/project/DumbAwareAction;", "Lcom/intellij/openapi/actionSystem/ex/CustomComponentAction;", "()V", "actionPerformed", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "createCustomComponent", "Ljavax/swing/JComponent;", "presentation", "Lcom/intellij/openapi/actionSystem/Presentation;", "place", "", "getActionUpdateThread", "Lcom/intellij/openapi/actionSystem/ActionUpdateThread;", "update", "updateCustomComponent", "component", "snippetLanguageName", "Lorg/jetbrains/annotations/Nullable;", "Companion", "intellij.ml.llm"})
/*    */ public final class AIAssistantLanguageLabelAction extends DumbAwareAction implements CustomComponentAction {
/*    */   @NotNull
/* 20 */   public static final Companion Companion = new Companion(null); @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\020\016\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R!\020\003\032\025\022\f\022\n \006*\004\030\0010\0050\0050\004¢\006\002\b\007X\004¢\006\002\n\000¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/core/chat/actions/codeSnippet/AIAssistantLanguageLabelAction$Companion;", "", "()V", "LANGUAGE_PRESENTATION_KEY", "Lcom/intellij/openapi/util/Key;", "", "kotlin.jvm.PlatformType", "Lorg/jetbrains/annotations/NotNull;", "intellij.ml.llm"}) public static final class Companion { private Companion() {} } @NotNull private static final Key<String> LANGUAGE_PRESENTATION_KEY = Key.create("LanguagePresentationKey"); static { Intrinsics.checkNotNullExpressionValue(Key.create("LanguagePresentationKey"), "create<String>(\"LanguagePresentationKey\")"); }
/*    */   
/*    */   @NotNull
/*    */   public JComponent createCustomComponent(@NotNull Presentation presentation, @NotNull String place) {
/* 24 */     Intrinsics.checkNotNullParameter(presentation, "presentation"); Intrinsics.checkNotNullParameter(place, "place"); String languageId = snippetLanguageName(presentation);
/* 25 */     JBLabel jBLabel1 = new JBLabel(languageId), $this$createCustomComponent_u24lambda_u240 = jBLabel1; int $i$a$-apply-AIAssistantLanguageLabelAction$createCustomComponent$1 = 0;
/* 26 */     $this$createCustomComponent_u24lambda_u240.setOpaque(false);
/* 27 */     $this$createCustomComponent_u24lambda_u240.setForeground(AIAssistantColors.INSTANCE.getEditorLanguageLabelForeground());
/*    */     return (JComponent)jBLabel1;
/*    */   }
/*    */   
/*    */   public void updateCustomComponent(@NotNull JComponent component, @NotNull Presentation presentation) {
/* 32 */     Intrinsics.checkNotNullParameter(component, "component"); Intrinsics.checkNotNullParameter(presentation, "presentation"); if (!(component instanceof JBLabel))
/* 33 */       return;  String languageId = snippetLanguageName(presentation);
/* 34 */     if (!StringsKt.isBlank(languageId)) ((JBLabel)component).setText(languageId); 
/*    */   }
/*    */   
/* 37 */   public void actionPerformed(@NotNull AnActionEvent e) { Intrinsics.checkNotNullParameter(e, "e"); } public void update(@NotNull AnActionEvent e) {
/*    */     Editor data;
/*    */     Object object;
/* 40 */     Intrinsics.checkNotNullParameter(e, "e"); if ((Editor)e.getDataContext().getData(CommonDataKeys.EDITOR) == null) { (Editor)e.getDataContext().getData(CommonDataKeys.EDITOR); return; }
/* 41 */      VirtualFile virtualFile = FileDocumentManager.getInstance().getFile(data.getDocument()); if (((virtualFile instanceof com.intellij.testFramework.LightVirtualFile) ? virtualFile : null) == null) { (virtualFile instanceof com.intellij.testFramework.LightVirtualFile) ? virtualFile : null; return; }
/* 42 */      e.getPresentation().putClientProperty(LANGUAGE_PRESENTATION_KEY, object.getLanguage().getDisplayName());
/*    */   } @NotNull
/*    */   public ActionUpdateThread getActionUpdateThread() {
/* 45 */     return ActionUpdateThread.EDT;
/*    */   } @NlsSafe
/*    */   private final String snippetLanguageName(Presentation $this$snippetLanguageName) {
/* 48 */     if ((String)$this$snippetLanguageName.getClientProperty(LANGUAGE_PRESENTATION_KEY) == null) (String)$this$snippetLanguageName.getClientProperty(LANGUAGE_PRESENTATION_KEY);  return "";
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/actions/codeSnippet/AIAssistantLanguageLabelAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */