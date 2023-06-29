/*    */ package com.intellij.ml.llm.java;
/*    */ 
/*    */ import com.intellij.ml.llm.core.chat.session.ChatCreationContext;
/*    */ import com.intellij.openapi.module.Module;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.projectRoots.Sdk;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000\b\000\030\0002\0020\001B\005¢\006\002\020\002J'\020\003\032\b\022\004\022\0020\0050\0042\006\020\006\032\0020\0072\006\020\b\032\0020\tH@ø\001\000¢\006\002\020\nJ\030\020\013\032\0020\f2\006\020\006\032\0020\0072\006\020\b\032\0020\tH\026\002\004\n\002\b\031¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/java/JavaVersionInformationChatContextProvider;", "Lcom/intellij/ml/llm/core/chat/context/ChatContextProvider;", "()V", "collect", "", "Lcom/intellij/ml/llm/core/chat/context/ChatContextItem;", "project", "Lcom/intellij/openapi/project/Project;", "creationContext", "Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isApplicable", "", "intellij.ml.llm.java"})
/*    */ public final class JavaVersionInformationChatContextProvider implements ChatContextProvider {
/*    */   @Nullable
/*    */   public Object collect(@NotNull Project project, @NotNull ChatCreationContext creationContext, @NotNull Continuation<? super List<ChatContextItem>> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/java/JavaVersionInformationChatContextProvider$collect$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/java/JavaVersionInformationChatContextProvider$collect$1
/*    */     //   11: astore #8
/*    */     //   13: aload #8
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #8
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/java/JavaVersionInformationChatContextProvider$collect$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/java/JavaVersionInformationChatContextProvider;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #8
/*    */     //   50: aload #8
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #7
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #9
/*    */     //   62: aload #8
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 263, 0 -> 88, 1 -> 201
/*    */     //   88: aload #7
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: aload_1
/*    */     //   94: invokestatic getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/roots/ProjectRootManager;
/*    */     //   97: invokevirtual getProjectSdk : ()Lcom/intellij/openapi/projectRoots/Sdk;
/*    */     //   100: astore #4
/*    */     //   102: aconst_null
/*    */     //   103: astore #5
/*    */     //   105: aload #4
/*    */     //   107: ifnull -> 130
/*    */     //   110: aload_1
/*    */     //   111: invokestatic getLanguageLevel : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/pom/java/LanguageLevel;
/*    */     //   114: astore #6
/*    */     //   116: aload #6
/*    */     //   118: ldc 'getLanguageLevel(project)'
/*    */     //   120: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   123: aload #6
/*    */     //   125: astore #5
/*    */     //   127: goto -> 219
/*    */     //   130: aload_2
/*    */     //   131: invokevirtual getSourceFile : ()Lcom/intellij/psi/PsiFile;
/*    */     //   134: invokestatic findModuleForFile : (Lcom/intellij/psi/PsiFile;)Lcom/intellij/openapi/module/Module;
/*    */     //   137: dup
/*    */     //   138: ifnonnull -> 167
/*    */     //   141: pop
/*    */     //   142: getstatic com/intellij/openapi/module/ModuleManager.Companion : Lcom/intellij/openapi/module/ModuleManager$Companion;
/*    */     //   145: aload_1
/*    */     //   146: invokevirtual getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/module/ModuleManager;
/*    */     //   149: invokevirtual getModules : ()[Lcom/intellij/openapi/module/Module;
/*    */     //   152: invokestatic firstOrNull : ([Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   155: checkcast com/intellij/openapi/module/Module
/*    */     //   158: dup
/*    */     //   159: ifnonnull -> 167
/*    */     //   162: pop
/*    */     //   163: invokestatic emptyList : ()Ljava/util/List;
/*    */     //   166: areturn
/*    */     //   167: astore #6
/*    */     //   169: new com/intellij/ml/llm/java/JavaVersionInformationChatContextProvider$collect$2
/*    */     //   172: dup
/*    */     //   173: aload #6
/*    */     //   175: invokespecial <init> : (Lcom/intellij/openapi/module/Module;)V
/*    */     //   178: checkcast kotlin/jvm/functions/Function0
/*    */     //   181: aload #8
/*    */     //   183: aload #8
/*    */     //   185: iconst_1
/*    */     //   186: putfield label : I
/*    */     //   189: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   192: dup
/*    */     //   193: aload #9
/*    */     //   195: if_acmpne -> 208
/*    */     //   198: aload #9
/*    */     //   200: areturn
/*    */     //   201: aload #7
/*    */     //   203: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   206: aload #7
/*    */     //   208: dup
/*    */     //   209: ldc 'module = ModuleUtilCore.…veLanguageLevel(module) }'
/*    */     //   211: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   214: checkcast com/intellij/pom/java/LanguageLevel
/*    */     //   217: astore #5
/*    */     //   219: new com/intellij/ml/llm/core/chat/context/ChatContextItem
/*    */     //   222: dup
/*    */     //   223: ldc com/intellij/ml/llm/java/JavaVersionInformationChatContextProvider
/*    */     //   225: invokestatic getOrCreateKotlinClass : (Ljava/lang/Class;)Lkotlin/reflect/KClass;
/*    */     //   228: aload #5
/*    */     //   230: invokevirtual toJavaVersion : ()Lcom/intellij/util/lang/JavaVersion;
/*    */     //   233: getfield feature : I
/*    */     //   236: aload #5
/*    */     //   238: invokevirtual isPreview : ()Z
/*    */     //   241: ifeq -> 249
/*    */     //   244: ldc '-preview'
/*    */     //   246: goto -> 251
/*    */     //   249: ldc ''
/*    */     //   251: <illegal opcode> makeConcatWithConstants : (ILjava/lang/String;)Ljava/lang/String;
/*    */     //   256: invokespecial <init> : (Lkotlin/reflect/KClass;Ljava/lang/String;)V
/*    */     //   259: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*    */     //   262: areturn
/*    */     //   263: new java/lang/IllegalStateException
/*    */     //   266: dup
/*    */     //   267: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   269: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   272: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #32	-> 60
/*    */     //   #33	-> 93
/*    */     //   #35	-> 105
/*    */     //   #36	-> 110
/*    */     //   #38	-> 130
/*    */     //   #39	-> 163
/*    */     //   #39	-> 166
/*    */     //   #38	-> 167
/*    */     //   #40	-> 169
/*    */     //   #32	-> 198
/*    */     //   #40	-> 208
/*    */     //   #43	-> 219
/*    */     //   #44	-> 228
/*    */     //   #43	-> 256
/*    */     //   #42	-> 259
/*    */     //   #32	-> 263
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	23	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   130	11	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   141	17	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   93	17	2	creationContext	Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;
/*    */     //   130	7	2	creationContext	Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;
/*    */     //   102	8	4	projectSdk	Lcom/intellij/openapi/projectRoots/Sdk;
/*    */     //   219	30	5	languageLevel	Lcom/intellij/pom/java/LanguageLevel;
/*    */     //   169	23	6	module	Lcom/intellij/openapi/module/Module;
/*    */     //   50	213	8	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	206	7	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   public boolean isApplicable(@NotNull Project project, @NotNull ChatCreationContext creationContext) { Module module;
/* 20 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(creationContext, "creationContext"); PsiFile sourceFile = creationContext.getSourceFile();
/* 21 */     if (sourceFile != null && !Intrinsics.areEqual(sourceFile.getLanguage(), JavaLanguage.INSTANCE)) {
/* 22 */       return false;
/*    */     }
/* 24 */     Sdk projectSdk = ProjectRootManager.getInstance(project).getProjectSdk();
/* 25 */     if (projectSdk != null) return projectSdk.getSdkType() instanceof com.intellij.openapi.projectRoots.JavaSdkType; 
/* 26 */     if (ModuleUtilCore.findModuleForFile(sourceFile) == null) { ModuleUtilCore.findModuleForFile(sourceFile); if ((Module)ArraysKt.firstOrNull((Object[])ModuleManager.Companion.getInstance(project).getModules()) == null) { (Module)ArraysKt.firstOrNull((Object[])ModuleManager.Companion.getInstance(project).getModules());
/* 27 */         return false; }  }
/* 28 */      Sdk sdk = ModuleRootManager.getInstance(module).getSdk();
/* 29 */     return (sdk != null && sdk.getSdkType() instanceof com.intellij.openapi.projectRoots.JavaSdkType); } @DebugMetadata(f = "JavaVersionInformationChatContextProvider.kt", l = {40}, i = {}, s = {}, n = {}, m = "collect", c = "com.intellij.ml.llm.java.JavaVersionInformationChatContextProvider")
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
/*    */   static final class JavaVersionInformationChatContextProvider$collect$1 extends ContinuationImpl {
/*    */     int label; JavaVersionInformationChatContextProvider$collect$1(Continuation $completion) { super($completion); } @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) { this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return JavaVersionInformationChatContextProvider.this.collect(null, null, (Continuation<? super List<ChatContextItem>>)this); }
/*    */   } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\002\030\002\n\000\020\000\032\0070\001¢\006\002\b\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "Lcom/intellij/pom/java/LanguageLevel;", "Lorg/jetbrains/annotations/NotNull;", "invoke"})
/*    */   static final class JavaVersionInformationChatContextProvider$collect$2 extends Lambda implements Function0<LanguageLevel> {
/*    */     @NotNull
/*    */     public final LanguageLevel invoke() {
/* 40 */       return LanguageLevelUtil.getEffectiveLanguageLevel(this.$module);
/*    */     }
/*    */     
/*    */     JavaVersionInformationChatContextProvider$collect$2(Module $module) {
/*    */       super(0);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/JavaVersionInformationChatContextProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */