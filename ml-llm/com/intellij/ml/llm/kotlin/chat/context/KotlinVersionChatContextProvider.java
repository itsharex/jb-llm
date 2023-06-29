/*    */ package com.intellij.ml.llm.kotlin.chat.context;
/*    */ 
/*    */ import com.intellij.ml.llm.core.chat.context.ChatContextItem;
/*    */ import com.intellij.ml.llm.core.chat.session.ChatCreationContext;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000\030\0002\0020\001B\005¢\006\002\020\002J'\020\003\032\b\022\004\022\0020\0050\0042\006\020\006\032\0020\0072\006\020\b\032\0020\tH@ø\001\000¢\006\002\020\nJ\030\020\013\032\0020\f2\006\020\006\032\0020\0072\006\020\b\032\0020\tH\026\002\004\n\002\b\031¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/kotlin/chat/context/KotlinVersionChatContextProvider;", "Lcom/intellij/ml/llm/core/chat/context/ChatContextProvider;", "()V", "collect", "", "Lcom/intellij/ml/llm/core/chat/context/ChatContextItem;", "project", "Lcom/intellij/openapi/project/Project;", "creationContext", "Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isApplicable", "", "intellij.ml.llm.kotlin"})
/*    */ public final class KotlinVersionChatContextProvider implements ChatContextProvider {
/*    */   @Nullable
/*    */   public Object collect(@NotNull Project project, @NotNull ChatCreationContext creationContext, @NotNull Continuation<? super List<ChatContextItem>> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/kotlin/chat/context/KotlinVersionChatContextProvider$collect$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/kotlin/chat/context/KotlinVersionChatContextProvider$collect$1
/*    */     //   11: astore #9
/*    */     //   13: aload #9
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #9
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/kotlin/chat/context/KotlinVersionChatContextProvider$collect$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/kotlin/chat/context/KotlinVersionChatContextProvider;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #9
/*    */     //   50: aload #9
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #8
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #10
/*    */     //   62: aload #9
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 241, 0 -> 88, 1 -> 143
/*    */     //   88: aload #8
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: aload_2
/*    */     //   94: invokevirtual getSourceFile : ()Lcom/intellij/psi/PsiFile;
/*    */     //   97: astore #4
/*    */     //   99: new com/intellij/ml/llm/kotlin/chat/context/KotlinVersionChatContextProvider$collect$containsKotlinFile$1
/*    */     //   102: dup
/*    */     //   103: aload_1
/*    */     //   104: invokespecial <init> : (Lcom/intellij/openapi/project/Project;)V
/*    */     //   107: checkcast kotlin/jvm/functions/Function0
/*    */     //   110: aload #9
/*    */     //   112: aload #9
/*    */     //   114: aload_1
/*    */     //   115: putfield L$0 : Ljava/lang/Object;
/*    */     //   118: aload #9
/*    */     //   120: aload #4
/*    */     //   122: putfield L$1 : Ljava/lang/Object;
/*    */     //   125: aload #9
/*    */     //   127: iconst_1
/*    */     //   128: putfield label : I
/*    */     //   131: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   134: dup
/*    */     //   135: aload #10
/*    */     //   137: if_acmpne -> 169
/*    */     //   140: aload #10
/*    */     //   142: areturn
/*    */     //   143: aload #9
/*    */     //   145: getfield L$1 : Ljava/lang/Object;
/*    */     //   148: checkcast com/intellij/psi/PsiFile
/*    */     //   151: astore #4
/*    */     //   153: aload #9
/*    */     //   155: getfield L$0 : Ljava/lang/Object;
/*    */     //   158: checkcast com/intellij/openapi/project/Project
/*    */     //   161: astore_1
/*    */     //   162: aload #8
/*    */     //   164: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   167: aload #8
/*    */     //   169: checkcast java/lang/Boolean
/*    */     //   172: invokevirtual booleanValue : ()Z
/*    */     //   175: istore #5
/*    */     //   177: iload #5
/*    */     //   179: ifne -> 186
/*    */     //   182: invokestatic emptyList : ()Ljava/util/List;
/*    */     //   185: areturn
/*    */     //   186: aload #4
/*    */     //   188: dup
/*    */     //   189: ifnull -> 202
/*    */     //   192: checkcast com/intellij/psi/PsiElement
/*    */     //   195: invokestatic getLanguageVersionSettings : (Lcom/intellij/psi/PsiElement;)Lorg/jetbrains/kotlin/config/LanguageVersionSettings;
/*    */     //   198: dup
/*    */     //   199: ifnonnull -> 207
/*    */     //   202: pop
/*    */     //   203: aload_1
/*    */     //   204: invokestatic getLanguageVersionSettings : (Lcom/intellij/openapi/project/Project;)Lorg/jetbrains/kotlin/config/LanguageVersionSettings;
/*    */     //   207: astore #6
/*    */     //   209: aload #6
/*    */     //   211: invokeinterface getApiVersion : ()Lorg/jetbrains/kotlin/config/ApiVersion;
/*    */     //   216: astore #7
/*    */     //   218: new com/intellij/ml/llm/core/chat/context/ChatContextItem
/*    */     //   221: dup
/*    */     //   222: ldc com/intellij/ml/llm/kotlin/chat/context/KotlinVersionChatContextProvider
/*    */     //   224: invokestatic getOrCreateKotlinClass : (Ljava/lang/Class;)Lkotlin/reflect/KClass;
/*    */     //   227: aload #7
/*    */     //   229: <illegal opcode> makeConcatWithConstants : (Lorg/jetbrains/kotlin/config/ApiVersion;)Ljava/lang/String;
/*    */     //   234: invokespecial <init> : (Lkotlin/reflect/KClass;Ljava/lang/String;)V
/*    */     //   237: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*    */     //   240: areturn
/*    */     //   241: new java/lang/IllegalStateException
/*    */     //   244: dup
/*    */     //   245: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   247: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   250: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #23	-> 60
/*    */     //   #24	-> 93
/*    */     //   #25	-> 99
/*    */     //   #23	-> 140
/*    */     //   #25	-> 169
/*    */     //   #26	-> 177
/*    */     //   #27	-> 182
/*    */     //   #29	-> 186
/*    */     //   #30	-> 209
/*    */     //   #32	-> 218
/*    */     //   #31	-> 237
/*    */     //   #23	-> 241
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	50	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   162	20	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   186	16	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   202	5	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   93	6	2	creationContext	Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;
/*    */     //   99	44	4	sourceFile	Lcom/intellij/psi/PsiFile;
/*    */     //   153	29	4	sourceFile	Lcom/intellij/psi/PsiFile;
/*    */     //   186	12	4	sourceFile	Lcom/intellij/psi/PsiFile;
/*    */     //   177	5	5	containsKotlinFile	Z
/*    */     //   209	32	6	settings	Lorg/jetbrains/kotlin/config/LanguageVersionSettings;
/*    */     //   218	23	7	apiVersion	Lorg/jetbrains/kotlin/config/ApiVersion;
/*    */     //   50	191	9	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	184	8	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/* 19 */   public boolean isApplicable(@NotNull Project project, @NotNull ChatCreationContext creationContext) { Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(creationContext, "creationContext"); PsiFile sourceFile = creationContext.getSourceFile();
/* 20 */     return (sourceFile == null || Intrinsics.areEqual(sourceFile.getLanguage(), KotlinLanguage.INSTANCE)); } @DebugMetadata(f = "KotlinVersionChatContextProvider.kt", l = {25}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"project", "sourceFile"}, m = "collect", c = "com.intellij.ml.llm.kotlin.chat.context.KotlinVersionChatContextProvider") @Metadata(mv = {1, 8, 0}, k = 3, xi = 48) static final class KotlinVersionChatContextProvider$collect$1 extends ContinuationImpl {
/*    */     Object L$0; Object L$1; int label; KotlinVersionChatContextProvider$collect$1(Continuation $completion) { super($completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return KotlinVersionChatContextProvider.this.collect(null, null, (Continuation<? super List<ChatContextItem>>)this); }
/*    */   } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\013\n\002\b\002\020\000\032\0020\001H\n¢\006\004\b\002\020\003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}) static final class KotlinVersionChatContextProvider$collect$containsKotlinFile$1 extends Lambda implements Function0<Boolean> {
/* 25 */     @NotNull public final Boolean invoke() { return Boolean.valueOf(ProjectStructureUtils.containsKotlinFile(this.$project)); }
/*    */ 
/*    */     
/*    */     KotlinVersionChatContextProvider$collect$containsKotlinFile$1(Project $project) {
/*    */       super(0);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/chat/context/KotlinVersionChatContextProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */