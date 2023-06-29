/*    */ package com.intellij.ml.llm.intentions.chat;
/*    */ 
/*    */ import com.intellij.codeInsight.intention.IntentionAction;
/*    */ import com.intellij.lang.injection.InjectedLanguageManager;
/*    */ import com.intellij.ml.llm.LLMBundle;
/*    */ import com.intellij.ml.llm.MLLlmIcons;
/*    */ import com.intellij.openapi.actionSystem.DataContext;
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.ui.popup.ListPopup;
/*    */ import com.intellij.openapi.ui.popup.ListSeparator;
/*    */ import com.intellij.openapi.ui.popup.PopupStep;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\b\000\030\0002\0020\0012\0020\0022\0020\003B\005¢\006\002\020\004J\b\020\005\032\0020\006H\026J\020\020\007\032\0020\b2\006\020\t\032\0020\nH\026J\b\020\013\032\0020\006H\026J%\020\f\032\0020\r2\006\020\016\032\0020\0172\b\020\020\032\004\030\0010\0212\b\020\022\032\004\030\0010\023H\002J$\020\024\032\0020\0252\006\020\016\032\0020\0172\b\020\020\032\004\030\0010\0212\b\020\022\032\004\030\0010\023H\026J\b\020\026\032\0020\025H\026¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/intentions/chat/AIAssistantIntention;", "Lcom/intellij/codeInsight/intention/IntentionAction;", "Lcom/intellij/codeInsight/intention/AdvertisementAction;", "Lcom/intellij/openapi/util/Iconable;", "()V", "getFamilyName", "", "getIcon", "Ljavax/swing/Icon;", "flags", "", "getText", "invoke", "", "project", "Lcom/intellij/openapi/project/Project;", "editor", "Lcom/intellij/openapi/editor/Editor;", "file", "Lcom/intellij/psi/PsiFile;", "isAvailable", "", "startInWriteAction", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nAIAssistantIntention.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIAssistantIntention.kt\ncom/intellij/ml/llm/intentions/chat/AIAssistantIntention\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,84:1\n350#2,7:85\n*S KotlinDebug\n*F\n+ 1 AIAssistantIntention.kt\ncom/intellij/ml/llm/intentions/chat/AIAssistantIntention\n*L\n47#1:85,7\n*E\n"})
/*    */ public final class AIAssistantIntention implements IntentionAction, AdvertisementAction, Iconable {
/* 26 */   public boolean startInWriteAction() { return false; }
/*    */   @NotNull
/* 28 */   public String getText() { return LLMBundle.message("intentions.ai.assistant.name", new Object[0]); }
/*    */   @NotNull
/* 30 */   public String getFamilyName() { return LLMBundle.message("intentions.ai.assistant.name", new Object[0]); } @NotNull
/*    */   public Icon getIcon(int flags) {
/* 32 */     Intrinsics.checkNotNullExpressionValue(MLLlmIcons.AiAssistant, "AiAssistant"); return MLLlmIcons.AiAssistant;
/*    */   }
/*    */   public boolean isAvailable(@NotNull Project project, @Nullable Editor editor, @Nullable PsiFile file) {
/* 35 */     Intrinsics.checkNotNullParameter(project, "project"); if (file != null) { InjectedLanguageManager.getInstance(project).getTopLevelFile((PsiElement)file); if (!((InjectedLanguageManager.getInstance(project).getTopLevelFile((PsiElement)file) != null) ? InjectedLanguageManager.getInstance(project).getTopLevelFile((PsiElement)file).getVirtualFile() : null instanceof com.intellij.testFramework.LightVirtualFile)); }  return false;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void invoke(@NotNull Project project, @Nullable Editor editor, @Nullable PsiFile file) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'project'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: getstatic com/intellij/ml/llm/core/grazieAPI/GrazieAuthService.Companion : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService$Companion;
/*    */     //   9: invokevirtual getInstance : ()Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*    */     //   12: aload_1
/*    */     //   13: invokevirtual waitAndGetAuthStatus : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;
/*    */     //   16: invokestatic isAuthenticated : (Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;)Z
/*    */     //   19: ifne -> 55
/*    */     //   22: getstatic com/intellij/openapi/wm/ToolWindowManager.Companion : Lcom/intellij/openapi/wm/ToolWindowManager$Companion;
/*    */     //   25: aload_1
/*    */     //   26: invokevirtual getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/wm/ToolWindowManager;
/*    */     //   29: ldc 'AIAssistant'
/*    */     //   31: invokevirtual getToolWindow : (Ljava/lang/String;)Lcom/intellij/openapi/wm/ToolWindow;
/*    */     //   34: dup
/*    */     //   35: ifnonnull -> 40
/*    */     //   38: pop
/*    */     //   39: return
/*    */     //   40: astore #4
/*    */     //   42: aload #4
/*    */     //   44: <illegal opcode> run : ()Ljava/lang/Runnable;
/*    */     //   49: invokeinterface activate : (Ljava/lang/Runnable;)V
/*    */     //   54: return
/*    */     //   55: aload_1
/*    */     //   56: aload_2
/*    */     //   57: aload_3
/*    */     //   58: invokestatic getAiAssistantIntentions : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Editor;Lcom/intellij/psi/PsiFile;)Ljava/util/List;
/*    */     //   61: astore #4
/*    */     //   63: aload #4
/*    */     //   65: astore #6
/*    */     //   67: iconst_0
/*    */     //   68: istore #7
/*    */     //   70: iconst_0
/*    */     //   71: istore #8
/*    */     //   73: aload #6
/*    */     //   75: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   80: astore #9
/*    */     //   82: aload #9
/*    */     //   84: invokeinterface hasNext : ()Z
/*    */     //   89: ifeq -> 138
/*    */     //   92: aload #9
/*    */     //   94: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   99: astore #10
/*    */     //   101: aload #10
/*    */     //   103: checkcast com/intellij/codeInsight/intention/IntentionAction
/*    */     //   106: astore #11
/*    */     //   108: iconst_0
/*    */     //   109: istore #12
/*    */     //   111: aload #11
/*    */     //   113: instanceof com/intellij/codeInsight/intention/HighPriorityAction
/*    */     //   116: ifne -> 123
/*    */     //   119: iconst_1
/*    */     //   120: goto -> 124
/*    */     //   123: iconst_0
/*    */     //   124: ifeq -> 132
/*    */     //   127: iload #8
/*    */     //   129: goto -> 139
/*    */     //   132: iinc #8, 1
/*    */     //   135: goto -> 82
/*    */     //   138: iconst_m1
/*    */     //   139: istore #5
/*    */     //   141: iload #5
/*    */     //   143: ifge -> 150
/*    */     //   146: aconst_null
/*    */     //   147: goto -> 162
/*    */     //   150: aload #4
/*    */     //   152: iload #5
/*    */     //   154: invokeinterface get : (I)Ljava/lang/Object;
/*    */     //   159: checkcast com/intellij/codeInsight/intention/IntentionAction
/*    */     //   162: astore #6
/*    */     //   164: aload #4
/*    */     //   166: invokeinterface isEmpty : ()Z
/*    */     //   171: ifeq -> 195
/*    */     //   174: aload_2
/*    */     //   175: ifnull -> 194
/*    */     //   178: invokestatic getInstance : ()Lcom/intellij/codeInsight/hint/HintManager;
/*    */     //   181: aload_2
/*    */     //   182: ldc 'intentions.ai.assistant.no.intentions'
/*    */     //   184: iconst_0
/*    */     //   185: anewarray java/lang/Object
/*    */     //   188: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   191: invokevirtual showErrorHint : (Lcom/intellij/openapi/editor/Editor;Ljava/lang/String;)V
/*    */     //   194: return
/*    */     //   195: ldc 'intentions.ai.assistant.popup.title'
/*    */     //   197: iconst_0
/*    */     //   198: anewarray java/lang/Object
/*    */     //   201: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   204: astore #8
/*    */     //   206: new com/intellij/ml/llm/intentions/chat/AIAssistantIntention$invoke$popupStep$1
/*    */     //   209: dup
/*    */     //   210: aload #4
/*    */     //   212: aload #6
/*    */     //   214: aload_1
/*    */     //   215: aload_2
/*    */     //   216: aload_3
/*    */     //   217: aload #8
/*    */     //   219: invokespecial <init> : (Ljava/util/List;Lcom/intellij/codeInsight/intention/IntentionAction;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Editor;Lcom/intellij/psi/PsiFile;Ljava/lang/String;)V
/*    */     //   222: astore #7
/*    */     //   224: invokestatic getInstance : ()Lcom/intellij/openapi/ui/popup/JBPopupFactory;
/*    */     //   227: aload #7
/*    */     //   229: checkcast com/intellij/openapi/ui/popup/ListPopupStep
/*    */     //   232: invokevirtual createListPopup : (Lcom/intellij/openapi/ui/popup/ListPopupStep;)Lcom/intellij/openapi/ui/popup/ListPopup;
/*    */     //   235: dup
/*    */     //   236: ldc 'getInstance().createListPopup(popupStep)'
/*    */     //   238: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   241: astore #8
/*    */     //   243: aload #8
/*    */     //   245: getstatic com/intellij/icons/AllIcons$General.Beta : Ljavax/swing/Icon;
/*    */     //   248: invokeinterface setCaptionIcon : (Ljavax/swing/Icon;)V
/*    */     //   253: aload #8
/*    */     //   255: iconst_0
/*    */     //   256: invokeinterface setCaptionIconPosition : (Z)V
/*    */     //   261: aload_2
/*    */     //   262: ifnull -> 276
/*    */     //   265: aload #8
/*    */     //   267: aload_2
/*    */     //   268: invokeinterface showInBestPositionFor : (Lcom/intellij/openapi/editor/Editor;)V
/*    */     //   273: goto -> 305
/*    */     //   276: invokestatic getInstance : ()Lcom/intellij/ide/DataManager;
/*    */     //   279: invokevirtual getDataContextFromFocusAsync : ()Lorg/jetbrains/concurrency/Promise;
/*    */     //   282: new com/intellij/ml/llm/intentions/chat/AIAssistantIntention$invoke$2
/*    */     //   285: dup
/*    */     //   286: aload #8
/*    */     //   288: invokespecial <init> : (Lcom/intellij/openapi/ui/popup/ListPopup;)V
/*    */     //   291: checkcast kotlin/jvm/functions/Function1
/*    */     //   294: <illegal opcode> accept : (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Consumer;
/*    */     //   299: invokeinterface onSuccess : (Ljava/util/function/Consumer;)Lorg/jetbrains/concurrency/Promise;
/*    */     //   304: pop
/*    */     //   305: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #39	-> 6
/*    */     //   #40	-> 22
/*    */     //   #41	-> 42
/*    */     //   #42	-> 54
/*    */     //   #45	-> 55
/*    */     //   #47	-> 63
/*    */     //   #85	-> 70
/*    */     //   #86	-> 73
/*    */     //   #87	-> 101
/*    */     //   #47	-> 111
/*    */     //   #87	-> 124
/*    */     //   #88	-> 127
/*    */     //   #89	-> 132
/*    */     //   #91	-> 138
/*    */     //   #47	-> 139
/*    */     //   #48	-> 141
/*    */     //   #50	-> 164
/*    */     //   #51	-> 174
/*    */     //   #52	-> 178
/*    */     //   #54	-> 194
/*    */     //   #57	-> 195
/*    */     //   #71	-> 224
/*    */     //   #72	-> 243
/*    */     //   #73	-> 253
/*    */     //   #74	-> 261
/*    */     //   #75	-> 265
/*    */     //   #78	-> 276
/*    */     //   #82	-> 305
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   42	13	4	toolWindow	Lcom/intellij/openapi/wm/ToolWindow;
/*    */     //   111	13	12	$i$a$-indexOfFirst-AIAssistantIntention$invoke$firstNonHighPriorityActionIndex$1	I
/*    */     //   108	16	11	it	Lcom/intellij/codeInsight/intention/IntentionAction;
/*    */     //   101	34	10	item$iv	Ljava/lang/Object;
/*    */     //   70	69	7	$i$f$indexOfFirst	I
/*    */     //   73	66	8	index$iv	I
/*    */     //   67	72	6	$this$indexOfFirst$iv	Ljava/util/List;
/*    */     //   63	243	4	intentions	Ljava/util/List;
/*    */     //   141	165	5	firstNonHighPriorityActionIndex	I
/*    */     //   164	142	6	firstNonHighPriorityAction	Lcom/intellij/codeInsight/intention/IntentionAction;
/*    */     //   224	82	7	popupStep	Lcom/intellij/ml/llm/intentions/chat/AIAssistantIntention$invoke$popupStep$1;
/*    */     //   243	63	8	popup	Lcom/intellij/openapi/ui/popup/ListPopup;
/*    */     //   0	306	0	this	Lcom/intellij/ml/llm/intentions/chat/AIAssistantIntention;
/*    */     //   0	306	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   0	306	2	editor	Lcom/intellij/openapi/editor/Editor;
/*    */     //   0	306	3	file	Lcom/intellij/psi/PsiFile;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static final void invoke$lambda$0() {}
/*    */ 
/*    */ 
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000+\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000*\001\000\b\n\030\0002\b\022\004\022\0020\0020\001J\024\020\003\032\004\030\0010\0042\b\020\005\032\004\030\0010\002H\026J\020\020\006\032\0020\0072\006\020\005\032\0020\002H\026J \020\b\032\b\022\002\b\003\030\0010\t2\b\020\n\032\004\030\0010\0022\006\020\013\032\0020\fH\026¨\006\r"}, d2 = {"com/intellij/ml/llm/intentions/chat/AIAssistantIntention$invoke$popupStep$1", "Lcom/intellij/openapi/ui/popup/util/BaseListPopupStep;", "Lcom/intellij/codeInsight/intention/IntentionAction;", "getSeparatorAbove", "Lcom/intellij/openapi/ui/popup/ListSeparator;", "value", "getTextFor", "", "onChosen", "Lcom/intellij/openapi/ui/popup/PopupStep;", "selectedValue", "finalChoice", "", "intellij.ml.llm"})
/*    */   public static final class AIAssistantIntention$invoke$popupStep$1
/*    */     extends BaseListPopupStep<IntentionAction>
/*    */   {
/*    */     AIAssistantIntention$invoke$popupStep$1(List $intentions, IntentionAction $firstNonHighPriorityAction, Project $project, Editor $editor, PsiFile $file, String $super_call_param$1) {
/* 57 */       super($super_call_param$1, $intentions); } @NotNull
/* 58 */     public String getTextFor(@NotNull IntentionAction value) { Intrinsics.checkNotNullParameter(value, "value"); Intrinsics.checkNotNullExpressionValue(value.getText(), "value.text"); return value.getText(); }
/*    */      @Nullable
/*    */     public ListSeparator getSeparatorAbove(@Nullable IntentionAction value) {
/* 61 */       return (value != null && Intrinsics.areEqual(value, this.$firstNonHighPriorityAction)) ? new ListSeparator() : null;
/*    */     } @Nullable
/*    */     public PopupStep<?> onChosen(@Nullable IntentionAction selectedValue, boolean finalChoice) {
/*    */       // Byte code:
/*    */       //   0: aload_0
/*    */       //   1: aload_1
/*    */       //   2: aload_0
/*    */       //   3: getfield $project : Lcom/intellij/openapi/project/Project;
/*    */       //   6: aload_0
/*    */       //   7: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*    */       //   10: aload_0
/*    */       //   11: getfield $file : Lcom/intellij/psi/PsiFile;
/*    */       //   14: <illegal opcode> run : (Lcom/intellij/codeInsight/intention/IntentionAction;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Editor;Lcom/intellij/psi/PsiFile;)Ljava/lang/Runnable;
/*    */       //   19: invokevirtual doFinalStep : (Ljava/lang/Runnable;)Lcom/intellij/openapi/ui/popup/PopupStep;
/*    */       //   22: areturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #65	-> 0
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   0	23	0	this	Lcom/intellij/ml/llm/intentions/chat/AIAssistantIntention$invoke$popupStep$1;
/*    */       //   0	23	1	selectedValue	Lcom/intellij/codeInsight/intention/IntentionAction;
/*    */       //   0	23	2	finalChoice	Z
/*    */     } private static final void onChosen$lambda$0(IntentionAction $selectedValue, Project $project, Editor $editor, PsiFile $file) {
/* 66 */       Intrinsics.checkNotNullParameter($project, "$project"); if ($selectedValue != null) { $selectedValue.invoke($project, $editor, $file); }
/*    */       else
/*    */       {  }
/*    */     
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static final void invoke$lambda$2(Function1 $tmp0, Object p0) {
/* 78 */     Intrinsics.checkNotNullParameter($tmp0, "$tmp0"); $tmp0.invoke(p0); } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\016\020\002\032\n \004*\004\030\0010\0030\003H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/openapi/actionSystem/DataContext;", "kotlin.jvm.PlatformType", "invoke"})
/* 79 */   static final class AIAssistantIntention$invoke$2 extends Lambda implements Function1<DataContext, Unit> { public final void invoke(DataContext it) { this.$popup.showInBestPositionFor(it); }
/*    */ 
/*    */     
/*    */     AIAssistantIntention$invoke$2(ListPopup $popup) {
/*    */       super(1);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/chat/AIAssistantIntention.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */