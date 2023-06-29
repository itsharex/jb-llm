/*     */ package com.intellij.ml.llm.python.intentions.chat;
/*     */ 
/*     */ import com.intellij.ml.llm.core.chat.services.AIAssistantServiceScope;
/*     */ import com.intellij.ml.llm.core.chat.session.ChatKind;
/*     */ import com.intellij.ml.llm.core.chat.session.ChatSession;
/*     */ import com.intellij.ml.llm.core.chat.session.ChatSessionHost;
/*     */ import com.intellij.ml.llm.core.chat.session.FocusedChatSessionHost;
/*     */ import com.intellij.ml.llm.core.chat.session.SimpleChat;
/*     */ import com.intellij.openapi.application.ActionsKt;
/*     */ import com.intellij.openapi.application.CoroutinesKt;
/*     */ import com.intellij.openapi.components.ComponentManager;
/*     */ import com.intellij.openapi.progress.ProgressIndicator;
/*     */ import com.intellij.openapi.progress.Task;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.wm.ToolWindow;
/*     */ import com.intellij.openapi.wm.ToolWindowManager;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import com.jetbrains.python.psi.PyClass;
/*     */ import com.jetbrains.python.psi.PyFunction;
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
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.Dispatchers;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/python/intentions/chat/PythonGenerateTestsChatIntention$invoke$task$1", "Lcom/intellij/openapi/progress/Task$Backgroundable;", "run", "", "indicator", "Lcom/intellij/openapi/progress/ProgressIndicator;", "intellij.ml.llm.python"})
/*     */ public final class PythonGenerateTestsChatIntention$invoke$task$1
/*     */   extends Task.Backgroundable
/*     */ {
/*     */   PythonGenerateTestsChatIntention$invoke$task$1(PsiElement $elementForTests, PythonGenerateTestsChatIntention $receiver, String $super_call_param$1) {
/*  53 */     super($project, $super_call_param$1);
/*     */   } public void run(@NotNull ProgressIndicator indicator) { ToolWindow toolWindow;
/*  55 */     Intrinsics.checkNotNullParameter(indicator, "indicator"); PsiElement psiElement = this.$elementForTests; String message = 
/*  56 */       (psiElement instanceof PyFunction) ? PythonGenerateTestsChatIntention.access$getFunctionMessage(PythonGenerateTestsChatIntention.this, (PyFunction)this.$elementForTests) : (
/*  57 */       (psiElement instanceof PyClass) ? PythonGenerateTestsChatIntention.access$getClassMessage(PythonGenerateTestsChatIntention.this, (PyClass)this.$elementForTests) : (
/*  58 */       (psiElement instanceof PsiFile) ? PythonGenerateTestsChatIntention.access$getFileMessage(PythonGenerateTestsChatIntention.this, (PsiFile)this.$elementForTests) : 
/*  59 */       "Generate some tests"));
/*     */ 
/*     */     
/*  62 */     if (ToolWindowManager.Companion.getInstance(this.$project).getToolWindow("AIAssistant") == null) { ToolWindowManager.Companion.getInstance(this.$project).getToolWindow("AIAssistant"); return; }
/*  63 */      ActionsKt.invokeLater$default(null, new PythonGenerateTestsChatIntention$invoke$task$1$run$1(toolWindow, this.$project, PythonGenerateTestsChatIntention.this, message), 1, null); }
/*     */    @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*     */   static final class PythonGenerateTestsChatIntention$invoke$task$1$run$1 extends Lambda implements Function0<Unit> { private static final void invoke$lambda$0(Project $project, PythonGenerateTestsChatIntention this$0, PsiFile $containingFile, String $message) {
/*  66 */       Intrinsics.checkNotNullParameter($project, "$project"); Intrinsics.checkNotNullParameter(PythonGenerateTestsChatIntention.this, "this$0"); Intrinsics.checkNotNullParameter($message, "$message"); BuildersKt.launch$default(AIAssistantServiceScope.Companion.getScope($project), null, null, new PythonGenerateTestsChatIntention$invoke$task$1$run$1$1$1(PythonGenerateTestsChatIntention.this, $containingFile, $message, null), 3, null);
/*     */     }
/*     */     
/*     */     public final void invoke() {
/*     */       // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: getfield $elementForTests : Lcom/intellij/psi/PsiElement;
/*     */       //   4: dup
/*     */       //   5: ifnull -> 16
/*     */       //   8: invokeinterface getContainingFile : ()Lcom/intellij/psi/PsiFile;
/*     */       //   13: goto -> 18
/*     */       //   16: pop
/*     */       //   17: aconst_null
/*     */       //   18: astore_1
/*     */       //   19: aload_0
/*     */       //   20: getfield $toolWindow : Lcom/intellij/openapi/wm/ToolWindow;
/*     */       //   23: aload_0
/*     */       //   24: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   27: aload_0
/*     */       //   28: getfield this$0 : Lcom/intellij/ml/llm/python/intentions/chat/PythonGenerateTestsChatIntention;
/*     */       //   31: aload_1
/*     */       //   32: aload_0
/*     */       //   33: getfield $message : Ljava/lang/String;
/*     */       //   36: <illegal opcode> run : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/python/intentions/chat/PythonGenerateTestsChatIntention;Lcom/intellij/psi/PsiFile;Ljava/lang/String;)Ljava/lang/Runnable;
/*     */       //   41: invokeinterface activate : (Ljava/lang/Runnable;)V
/*     */       //   46: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #64	-> 0
/*     */       //   #65	-> 19
/*     */       //   #76	-> 46
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   19	28	1	containingFile	Lcom/intellij/psi/PsiFile;
/*     */       //   0	47	0	this	Lcom/intellij/ml/llm/python/intentions/chat/PythonGenerateTestsChatIntention$invoke$task$1$run$1;
/*     */     }
/*     */     
/*     */     PythonGenerateTestsChatIntention$invoke$task$1$run$1(ToolWindow $toolWindow, Project $project, PythonGenerateTestsChatIntention $receiver, String $message) {
/*     */       super(0);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/python/intentions/chat/PythonGenerateTestsChatIntention$invoke$task$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */