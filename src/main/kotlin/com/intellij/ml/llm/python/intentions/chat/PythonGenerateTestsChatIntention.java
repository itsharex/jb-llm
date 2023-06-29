/*     */ package com.intellij.ml.llm.python.intentions.chat;
/*     */ import com.intellij.ml.llm.core.chat.session.ChatKind;
/*     */ import com.intellij.ml.llm.core.chat.session.ChatSession;
/*     */ import com.intellij.ml.llm.core.chat.session.ChatSessionHost;
/*     */ import com.intellij.ml.llm.core.chat.session.FocusedChatSessionHost;
/*     */ import com.intellij.ml.llm.core.chat.session.SimpleChat;
/*     */ import com.intellij.openapi.components.ComponentManager;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import com.jetbrains.python.psi.PyClass;
/*     */ import com.jetbrains.python.psi.PyFunction;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\020\013\n\002\b\002\030\0002\0020\001B\005¢\006\002\020\002J\020\020\003\032\0020\0042\b\020\005\032\004\030\0010\006J\020\020\007\032\0020\b2\006\020\t\032\0020\nH\002J\020\020\013\032\0020\b2\006\020\t\032\0020\nH\002J\036\020\f\032\004\030\0010\r2\b\020\016\032\004\030\0010\0172\b\020\020\032\004\030\0010\021H\002J\b\020\022\032\0020\bH\026J\020\020\023\032\0020\b2\006\020\024\032\0020\006H\002J\020\020\025\032\0020\b2\006\020\026\032\0020\027H\002J\020\020\030\032\0020\b2\006\020\026\032\0020\027H\002J\b\020\031\032\0020\bH\026J%\020\032\032\0020\0332\006\020\016\032\0020\0172\b\020\020\032\004\030\0010\0212\b\020\024\032\004\030\0010\006H\002J$\020\034\032\0020\0352\006\020\016\032\0020\0172\b\020\020\032\004\030\0010\0212\b\020\024\032\004\030\0010\006H\026J\b\020\036\032\0020\035H\026¨\006\037"}, d2 = {"Lcom/intellij/ml/llm/python/intentions/chat/PythonGenerateTestsChatIntention;", "Lcom/intellij/codeInsight/intention/IntentionAction;", "()V", "getChatCreationContext", "Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;", "sourceFile", "Lcom/intellij/psi/PsiFile;", "getClassMessage", "", "clazz", "Lcom/jetbrains/python/psi/PyClass;", "getClassSignatureText", "getElementForTests", "Lcom/intellij/psi/PsiElement;", "project", "Lcom/intellij/openapi/project/Project;", "editor", "Lcom/intellij/openapi/editor/Editor;", "getFamilyName", "getFileMessage", "file", "getFunctionMessage", "function", "Lcom/jetbrains/python/psi/PyFunction;", "getFunctionSignatureText", "getText", "invoke", "", "isAvailable", "", "startInWriteAction", "intellij.ml.llm.python"})
/*     */ public final class PythonGenerateTestsChatIntention implements IntentionAction {
/*     */   public boolean startInWriteAction() {
/*  32 */     return false;
/*     */   } @NotNull
/*     */   public String getFamilyName() {
/*  35 */     Intrinsics.checkNotNullExpressionValue(PythonLLMBundle.INSTANCE.getMessage("intentions.chat.generate.tests.family.name", new Object[0]), "PythonLLMBundle.getMessa…erate.tests.family.name\")"); return PythonLLMBundle.INSTANCE.getMessage("intentions.chat.generate.tests.family.name", new Object[0]);
/*     */   }
/*     */   @NotNull
/*     */   public String getText() {
/*  39 */     Intrinsics.checkNotNullExpressionValue(PythonLLMBundle.INSTANCE.getMessage("intentions.chat.generate.tests.text", new Object[0]), "PythonLLMBundle.getMessa…hat.generate.tests.text\")"); return PythonLLMBundle.INSTANCE.getMessage("intentions.chat.generate.tests.text", new Object[0]);
/*     */   }
/*     */   
/*     */   public boolean isAvailable(@NotNull Project project, @Nullable Editor editor, @Nullable PsiFile file) {
/*  43 */     Intrinsics.checkNotNullParameter(project, "project"); if (!Registry.is("llm.is.internal")) return false; 
/*  44 */     return (editor != null && file != null);
/*     */   }
/*     */   
/*     */   public void invoke(@NotNull Project project, @Nullable Editor editor, @Nullable PsiFile file) {
/*  48 */     Intrinsics.checkNotNullParameter(project, "project"); if (editor == null || file == null)
/*     */       return; 
/*  50 */     PsiElement elementForTests = getElementForTests(project, editor);
/*     */ 
/*     */     
/*  53 */     String str = LLMBundle.message("intentions.request.background.process.title", new Object[0]); PythonGenerateTestsChatIntention$invoke$task$1 task = new PythonGenerateTestsChatIntention$invoke$task$1(elementForTests, this, str);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  79 */     ProgressManager.getInstance().runProcessWithProgressAsynchronously(task, (ProgressIndicator)new BackgroundableProcessIndicator(task));
/*     */   }
/*     */   
/*     */   private final PsiElement getElementForTests(Project project, Editor editor) { PsiElement element;
/*  83 */     if (project == null || editor == null) return null; 
/*  84 */     if (PsiUtilBase.getElementAtCaret(editor) == null) { PsiUtilBase.getElementAtCaret(editor); return null; }
/*  85 */      PsiFile psiFile = element.getContainingFile();
/*  86 */     if (InjectedLanguageManager.getInstance(project).isInjectedFragment(psiFile)) {
/*  87 */       return (PsiElement)psiFile;
/*     */     }
/*     */     
/*  90 */     PyFunction function = (PyFunction)PsiTreeUtil.getParentOfType(element, PyFunction.class, false);
/*  91 */     if (function != null) return (PsiElement)function;
/*     */     
/*  93 */     PyClass clazz = (PyClass)PsiTreeUtil.getParentOfType(element, PyClass.class, false);
/*  94 */     if (clazz != null) return (PsiElement)clazz;
/*     */     
/*  96 */     return (PsiElement)psiFile; }
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/python/intentions/chat/PythonGenerateTestsChatIntention$invoke$task$1", "Lcom/intellij/openapi/progress/Task$Backgroundable;", "run", "", "indicator", "Lcom/intellij/openapi/progress/ProgressIndicator;", "intellij.ml.llm.python"}) public static final class PythonGenerateTestsChatIntention$invoke$task$1 extends Task.Backgroundable {
/*     */     PythonGenerateTestsChatIntention$invoke$task$1(PsiElement $elementForTests, PythonGenerateTestsChatIntention $receiver, String $super_call_param$1) { super($project, $super_call_param$1); }
/*     */     public void run(@NotNull ProgressIndicator indicator) { ToolWindow toolWindow; Intrinsics.checkNotNullParameter(indicator, "indicator"); PsiElement psiElement = this.$elementForTests; String message = (psiElement instanceof PyFunction) ? PythonGenerateTestsChatIntention.this.getFunctionMessage((PyFunction)this.$elementForTests) : ((psiElement instanceof PyClass) ? PythonGenerateTestsChatIntention.this.getClassMessage((PyClass)this.$elementForTests) : ((psiElement instanceof PsiFile) ? PythonGenerateTestsChatIntention.this.getFileMessage((PsiFile)this.$elementForTests) : "Generate some tests")); if (ToolWindowManager.Companion.getInstance(this.$project).getToolWindow("AIAssistant") == null) { ToolWindowManager.Companion.getInstance(this.$project).getToolWindow("AIAssistant"); return; }  ActionsKt.invokeLater$default(null, new PythonGenerateTestsChatIntention$invoke$task$1$run$1(toolWindow, this.$project, PythonGenerateTestsChatIntention.this, message), 1, null); } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"}) static final class PythonGenerateTestsChatIntention$invoke$task$1$run$1 extends Lambda implements Function0<Unit> {
/*     */       public final void invoke() { // Byte code:
/*     */         //   0: aload_0
/*     */         //   1: getfield $elementForTests : Lcom/intellij/psi/PsiElement;
/*     */         //   4: dup
/*     */         //   5: ifnull -> 16
/*     */         //   8: invokeinterface getContainingFile : ()Lcom/intellij/psi/PsiFile;
/*     */         //   13: goto -> 18
/*     */         //   16: pop
/*     */         //   17: aconst_null
/*     */         //   18: astore_1
/*     */         //   19: aload_0
/*     */         //   20: getfield $toolWindow : Lcom/intellij/openapi/wm/ToolWindow;
/*     */         //   23: aload_0
/*     */         //   24: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */         //   27: aload_0
/*     */         //   28: getfield this$0 : Lcom/intellij/ml/llm/python/intentions/chat/PythonGenerateTestsChatIntention;
/*     */         //   31: aload_1
/*     */         //   32: aload_0
/*     */         //   33: getfield $message : Ljava/lang/String;
/*     */         //   36: <illegal opcode> run : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/python/intentions/chat/PythonGenerateTestsChatIntention;Lcom/intellij/psi/PsiFile;Ljava/lang/String;)Ljava/lang/Runnable;
/*     */         //   41: invokeinterface activate : (Ljava/lang/Runnable;)V
/*     */         //   46: return
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #64	-> 0
/*     */         //   #65	-> 19
/*     */         //   #76	-> 46
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   19	28	1	containingFile	Lcom/intellij/psi/PsiFile;
/* 100 */         //   0	47	0	this	Lcom/intellij/ml/llm/python/intentions/chat/PythonGenerateTestsChatIntention$invoke$task$1$run$1; } private static final void invoke$lambda$0(Project $project, PythonGenerateTestsChatIntention this$0, PsiFile $containingFile, String $message) { Intrinsics.checkNotNullParameter($project, "$project"); Intrinsics.checkNotNullParameter(PythonGenerateTestsChatIntention.this, "this$0"); Intrinsics.checkNotNullParameter($message, "$message"); BuildersKt.launch$default(AIAssistantServiceScope.Companion.getScope($project), null, null, new PythonGenerateTestsChatIntention$invoke$task$1$run$1$1$1(PythonGenerateTestsChatIntention.this, $containingFile, $message, null), 3, null); } PythonGenerateTestsChatIntention$invoke$task$1$run$1(ToolWindow $toolWindow, Project $project, PythonGenerateTestsChatIntention $receiver, String $message) { super(0); } } } private final String getFunctionMessage(PyFunction function) { Ref.ObjectRef<String> functionName = new Ref.ObjectRef(); functionName.element = "";
/* 101 */     Ref.ObjectRef<String> usagesText = new Ref.ObjectRef(); usagesText.element = "";
/* 102 */     Ref.ObjectRef<String> functionText = new Ref.ObjectRef(); functionText.element = "";
/*     */     
/* 104 */     ActionsKt.runReadAction(new PythonGenerateTestsChatIntention$getFunctionMessage$1(functionName, function, usagesText, functionText));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 110 */     return 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 120 */       StringsKt.trimIndent("\nGenerate python unit tests for the function " + functionName.element + ".\n<br><br>\nUsages of the " + functionName.element + ":\n" + usagesText.element + "\n\nImplementation of the " + functionName.element + ":\n```python\n" + functionText.element + "\n```\n          "); }
/*     */    @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"}) static final class PythonGenerateTestsChatIntention$getFunctionMessage$1 extends Lambda implements Function0<Unit> {
/*     */     public final void invoke() { this.$functionName.element = this.$function.getName(); this.$usagesText.element = PythonContextUtils.INSTANCE.getFunctionUsagesText(this.$function);
/*     */       this.$functionText.element = PyIndentUtil.changeIndent(this.$function.getText(), true, StringsKt.repeat(" ", 4)); } PythonGenerateTestsChatIntention$getFunctionMessage$1(Ref.ObjectRef<String> $functionName, PyFunction $function, Ref.ObjectRef<String> $usagesText, Ref.ObjectRef<String> $functionText) { super(0); } }
/* 124 */   private final String getClassMessage(PyClass clazz) { Ref.ObjectRef<String> className = new Ref.ObjectRef(); className.element = "";
/* 125 */     Ref.ObjectRef<String> usagesText = new Ref.ObjectRef(); usagesText.element = "";
/* 126 */     Ref.ObjectRef<String> classText = new Ref.ObjectRef(); classText.element = "";
/*     */     
/* 128 */     ActionsKt.runReadAction(new PythonGenerateTestsChatIntention$getClassMessage$1(clazz, usagesText, classText, this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 146 */     return 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 156 */       StringsKt.trimIndent("\nGenerate python unit tests for the class " + className.element + ".\n<br><br>\nUsages of methods of the " + className.element + ":\n" + usagesText.element + "\n\nImplementation of the " + className.element + ":\n```python\n" + classText.element + "\n```\n          "); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*     */   @SourceDebugExtension({"SMAP\nPythonGenerateTestsChatIntention.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PythonGenerateTestsChatIntention.kt\ncom/intellij/ml/llm/python/intentions/chat/PythonGenerateTestsChatIntention$getClassMessage$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n11335#2:188\n11670#2,3:189\n1549#3:192\n1620#3,3:193\n1#4:196\n*S KotlinDebug\n*F\n+ 1 PythonGenerateTestsChatIntention.kt\ncom/intellij/ml/llm/python/intentions/chat/PythonGenerateTestsChatIntention$getClassMessage$1\n*L\n135#1:188\n135#1:189,3\n136#1:192\n136#1:193,3\n*E\n"})
/*     */   static final class PythonGenerateTestsChatIntention$getClassMessage$1
/*     */     extends Lambda
/*     */     implements Function0<Unit>
/*     */   {
/*     */     public final void invoke() {
/*     */       this.$className.element = this.$clazz.getName();
/*     */       this.$usagesText.element = PythonContextUtils.INSTANCE.getClassUsagesText(this.$clazz);
/*     */       Intrinsics.checkNotNullExpressionValue(PyIndentUtil.changeIndent(this.$clazz.getText(), true, StringsKt.repeat(" ", 4)), "changeIndent(clazz.text, true, \" \".repeat(4))");
/*     */       this.$classText.element = PyIndentUtil.changeIndent(this.$clazz.getText(), true, StringsKt.repeat(" ", 4));
/*     */       if (StringsKt.lines((CharSequence)this.$classText.element).size() > 100) {
/*     */         Intrinsics.checkNotNullExpressionValue(this.$clazz.getMethods(), "clazz.methods");
/*     */         Object[] arrayOfObject1 = (Object[])this.$clazz.getMethods();
/*     */         PythonGenerateTestsChatIntention pythonGenerateTestsChatIntention = PythonGenerateTestsChatIntention.this;
/*     */         int i = 0;
/* 188 */         Object[] arrayOfObject2 = arrayOfObject1; Collection<String> collection1 = new ArrayList(arrayOfObject1.length); int j = 0; byte b; int k;
/* 189 */         for (b = 0, k = arrayOfObject2.length; b < k; ) { Object item$iv$iv = arrayOfObject2[b];
/* 190 */           PyFunction pyFunction = (PyFunction)item$iv$iv; Collection<String> collection = collection1; int $i$a$-map-PythonGenerateTestsChatIntention$getClassMessage$1$methodsSignatures$1 = 0; Intrinsics.checkNotNullExpressionValue(pyFunction, "it"); collection.add(pythonGenerateTestsChatIntention.getFunctionSignatureText(pyFunction)); }
/* 191 */          List list1 = (List)collection1; int $i$f$map = 0;
/* 192 */         List list2 = list1; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10)); int $i$f$mapTo = 0;
/* 193 */         for (Object item$iv$iv : list2) {
/* 194 */           String str = (String)item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-PythonGenerateTestsChatIntention$getClassMessage$1$methodsSignatures$2 = 0; collection.add(PyIndentUtil.changeIndent(str, false, ""));
/* 195 */         }  String it = CollectionsKt.joinToString$default(destination$iv$iv, "\n\n", null, null, 0, null, null, 62, null);
/* 196 */         int $i$a$-let-PythonGenerateTestsChatIntention$getClassMessage$1$methodsSignatures$3 = 0;
/*     */         String str1 = PyIndentUtil.changeIndent(it, false, StringsKt.repeat(" ", 4));
/*     */         Intrinsics.checkNotNullExpressionValue(str1, "clazz.methods\n          …, false, \" \".repeat(4)) }");
/*     */         String methodsSignatures = str1;
/*     */         this.$classText.element = StringsKt.trimIndent("\n" + PythonGenerateTestsChatIntention.this.getClassSignatureText(this.$clazz) + "\n" + methodsSignatures + "\n        ");
/*     */       } 
/*     */     }
/*     */     
/*     */     PythonGenerateTestsChatIntention$getClassMessage$1(PyClass $clazz, Ref.ObjectRef<String> $usagesText, Ref.ObjectRef<String> $classText, PythonGenerateTestsChatIntention $receiver) {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */   
/*     */   private final String getClassSignatureText(PyClass clazz) {
/*     */     Object object;
/*     */     PsiElement psiElement = clazz.copy();
/*     */     if (((psiElement instanceof PyClass) ? psiElement : null) == null) {
/*     */       (psiElement instanceof PyClass) ? psiElement : null;
/*     */       return "";
/*     */     } 
/*     */     object.getStatementList().delete();
/*     */     Intrinsics.checkNotNullExpressionValue(object.getText(), "classCopy.text");
/*     */     return object.getText();
/*     */   }
/*     */   
/*     */   private final String getFunctionSignatureText(PyFunction function) {
/*     */     Object object;
/*     */     PsiElement psiElement = function.copy();
/*     */     if (((psiElement instanceof PyFunction) ? psiElement : null) == null) {
/*     */       (psiElement instanceof PyFunction) ? psiElement : null;
/*     */       return "";
/*     */     } 
/*     */     object.getStatementList().delete();
/*     */     Intrinsics.checkNotNullExpressionValue(object.getText(), "functionCopy.text");
/*     */     return object.getText();
/*     */   }
/*     */   
/*     */   private final String getFileMessage(PsiFile file) {
/*     */     Intrinsics.checkNotNullExpressionValue(file.getName(), "file.name");
/*     */     String fileName = file.getName();
/*     */     return StringsKt.trimIndent("\nGenerate python unit tests for the file " + fileName + ".\n<br><br>\nCode of the " + fileName + ":\n```python\n" + file.getText() + "\n```\n          ");
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ChatCreationContext getChatCreationContext(@Nullable PsiFile sourceFile) {
/*     */     return new ChatCreationContext((ChatOrigin)ChatOrigin.CustomIntention.INSTANCE, ChatSessionStorage.SourceAction.UNKNOWN_CHAT_INTENTION, sourceFile, null, 8, null);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/python/intentions/chat/PythonGenerateTestsChatIntention.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */