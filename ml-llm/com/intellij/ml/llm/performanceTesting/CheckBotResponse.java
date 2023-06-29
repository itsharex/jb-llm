/*    */ package com.intellij.ml.llm.performanceTesting;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\002\b\003\030\000 \r2\0020\001:\001\rB\032\022\013\020\002\032\0070\003¢\006\002\b\004\022\006\020\005\032\0020\006¢\006\002\020\007J\031\020\b\032\0020\t2\006\020\n\032\0020\013H@ø\001\000¢\006\002\020\f\002\004\n\002\b\031¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/performanceTesting/CheckBotResponse;", "Lcom/intellij/openapi/ui/playback/commands/PlaybackCommandCoroutineAdapter;", "text", "", "Lorg/jetbrains/annotations/NonNls;", "line", "", "(Ljava/lang/String;I)V", "doExecute", "", "context", "Lcom/intellij/openapi/ui/playback/PlaybackContext;", "(Lcom/intellij/openapi/ui/playback/PlaybackContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "intellij.ml.llm.performanceTesting"})
/*    */ public final class CheckBotResponse extends PlaybackCommandCoroutineAdapter {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   public static final String PREFIX = "%checkResponseContains";
/*    */   
/*    */   public CheckBotResponse(@NotNull String text, int line) {
/* 14 */     super(text, line);
/*    */   }
/*    */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\023\020\003\032\0070\004¢\006\002\b\005XT¢\006\002\n\000¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/performanceTesting/CheckBotResponse$Companion;", "", "()V", "PREFIX", "", "Lorg/jetbrains/annotations/NonNls;", "intellij.ml.llm.performanceTesting"})
/*    */   public static final class Companion {
/*    */     private Companion() {} }
/*    */   
/*    */   @Nullable
/* 21 */   protected Object doExecute(@NotNull PlaybackContext context, @NotNull Continuation $completion) { if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new CheckBotResponse$doExecute$2(this, null), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new CheckBotResponse$doExecute$2(this, null), $completion);  BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new CheckBotResponse$doExecute$2(this, null), $completion); return Unit.INSTANCE; } @DebugMetadata(f = "CheckBotResponse.kt", l = {27, 31}, i = {0}, s = {"L$0"}, n = {"editor"}, m = "invokeSuspend", c = "com.intellij.ml.llm.performanceTesting.CheckBotResponse$doExecute$2") @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class CheckBotResponse$doExecute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*    */   {
/*    */     Object L$0; int label; CheckBotResponse$doExecute$2(CheckBotResponse $receiver, Continuation $completion) { super(2, $completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { // Byte code:
/*    */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */       //   3: astore #7
/*    */       //   5: aload_0
/*    */       //   6: getfield label : I
/*    */       //   9: tableswitch default -> 276, 0 -> 36, 1 -> 121, 2 -> 215
/*    */       //   36: aload_1
/*    */       //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   40: aload_0
/*    */       //   41: getfield $context : Lcom/intellij/openapi/ui/playback/PlaybackContext;
/*    */       //   44: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*    */       //   47: dup
/*    */       //   48: ldc 'context.project'
/*    */       //   50: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   53: astore_2
/*    */       //   54: aload_2
/*    */       //   55: invokestatic getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/fileEditor/FileEditorManager;
/*    */       //   58: invokevirtual getSelectedTextEditor : ()Lcom/intellij/openapi/editor/Editor;
/*    */       //   61: astore_3
/*    */       //   62: aload_3
/*    */       //   63: ifnonnull -> 76
/*    */       //   66: new java/lang/IllegalStateException
/*    */       //   69: dup
/*    */       //   70: ldc 'Selected editor is null'
/*    */       //   72: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   75: athrow
/*    */       //   76: invokestatic getMain : ()Lkotlinx/coroutines/MainCoroutineDispatcher;
/*    */       //   79: checkcast kotlin/coroutines/CoroutineContext
/*    */       //   82: new com/intellij/ml/llm/performanceTesting/CheckBotResponse$doExecute$2$findPsiFile$1
/*    */       //   85: dup
/*    */       //   86: aload_3
/*    */       //   87: aload_2
/*    */       //   88: aconst_null
/*    */       //   89: invokespecial <init> : (Lcom/intellij/openapi/editor/Editor;Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)V
/*    */       //   92: checkcast kotlin/jvm/functions/Function2
/*    */       //   95: aload_0
/*    */       //   96: checkcast kotlin/coroutines/Continuation
/*    */       //   99: aload_0
/*    */       //   100: aload_3
/*    */       //   101: putfield L$0 : Ljava/lang/Object;
/*    */       //   104: aload_0
/*    */       //   105: iconst_1
/*    */       //   106: putfield label : I
/*    */       //   109: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   112: dup
/*    */       //   113: aload #7
/*    */       //   115: if_acmpne -> 134
/*    */       //   118: aload #7
/*    */       //   120: areturn
/*    */       //   121: aload_0
/*    */       //   122: getfield L$0 : Ljava/lang/Object;
/*    */       //   125: checkcast com/intellij/openapi/editor/Editor
/*    */       //   128: astore_3
/*    */       //   129: aload_1
/*    */       //   130: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   133: aload_1
/*    */       //   134: checkcast com/intellij/psi/PsiFile
/*    */       //   137: astore #4
/*    */       //   139: aload #4
/*    */       //   141: ifnonnull -> 154
/*    */       //   144: new java/lang/IllegalStateException
/*    */       //   147: dup
/*    */       //   148: ldc 'No Psi File found'
/*    */       //   150: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   153: athrow
/*    */       //   154: getstatic com/intellij/ml/llm/consoleChat/ConsoleChatAction.Companion : Lcom/intellij/ml/llm/consoleChat/ConsoleChatAction$Companion;
/*    */       //   157: aload_0
/*    */       //   158: getfield $context : Lcom/intellij/openapi/ui/playback/PlaybackContext;
/*    */       //   161: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*    */       //   164: dup
/*    */       //   165: ldc 'context.project'
/*    */       //   167: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   170: aload #4
/*    */       //   172: aload_3
/*    */       //   173: invokeinterface getDocument : ()Lcom/intellij/openapi/editor/Document;
/*    */       //   178: astore #6
/*    */       //   180: aload #6
/*    */       //   182: ldc 'editor.document'
/*    */       //   184: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   187: aload #6
/*    */       //   189: aload_0
/*    */       //   190: checkcast kotlin/coroutines/Continuation
/*    */       //   193: aload_0
/*    */       //   194: aconst_null
/*    */       //   195: putfield L$0 : Ljava/lang/Object;
/*    */       //   198: aload_0
/*    */       //   199: iconst_2
/*    */       //   200: putfield label : I
/*    */       //   203: invokevirtual continueConversation : (Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiFile;Lcom/intellij/openapi/editor/Document;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   206: dup
/*    */       //   207: aload #7
/*    */       //   209: if_acmpne -> 220
/*    */       //   212: aload #7
/*    */       //   214: areturn
/*    */       //   215: aload_1
/*    */       //   216: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   219: aload_1
/*    */       //   220: checkcast java/lang/String
/*    */       //   223: astore #5
/*    */       //   225: aload_0
/*    */       //   226: getfield this$0 : Lcom/intellij/ml/llm/performanceTesting/CheckBotResponse;
/*    */       //   229: ldc '%checkResponseContains'
/*    */       //   231: invokevirtual extractCommandArgument : (Ljava/lang/String;)Ljava/lang/String;
/*    */       //   234: astore #6
/*    */       //   236: aload #5
/*    */       //   238: checkcast java/lang/CharSequence
/*    */       //   241: aload #6
/*    */       //   243: checkcast java/lang/CharSequence
/*    */       //   246: iconst_0
/*    */       //   247: iconst_2
/*    */       //   248: aconst_null
/*    */       //   249: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*    */       //   252: ifne -> 272
/*    */       //   255: new java/lang/IllegalStateException
/*    */       //   258: dup
/*    */       //   259: aload #6
/*    */       //   261: aload #5
/*    */       //   263: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*    */       //   268: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   271: athrow
/*    */       //   272: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */       //   275: areturn
/*    */       //   276: new java/lang/IllegalStateException
/*    */       //   279: dup
/*    */       //   280: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */       //   282: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   285: athrow
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #21	-> 3
/*    */       //   #22	-> 40
/*    */       //   #23	-> 54
/*    */       //   #24	-> 62
/*    */       //   #25	-> 66
/*    */       //   #27	-> 76
/*    */       //   #21	-> 118
/*    */       //   #30	-> 139
/*    */       //   #31	-> 154
/*    */       //   #21	-> 212
/*    */       //   #32	-> 225
/*    */       //   #33	-> 236
/*    */       //   #34	-> 255
/*    */       //   #36	-> 272
/*    */       //   #21	-> 276
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   54	12	2	project	Lcom/intellij/openapi/project/Project;
/*    */       //   76	36	2	project	Lcom/intellij/openapi/project/Project;
/*    */       //   62	59	3	editor	Lcom/intellij/openapi/editor/Editor;
/*    */       //   129	25	3	editor	Lcom/intellij/openapi/editor/Editor;
/*    */       //   154	26	3	editor	Lcom/intellij/openapi/editor/Editor;
/*    */       //   139	15	4	findPsiFile	Lcom/intellij/psi/PsiFile;
/*    */       //   154	26	4	findPsiFile	Lcom/intellij/psi/PsiFile;
/*    */       //   225	51	5	response	Ljava/lang/String;
/*    */       //   236	40	6	argument	Ljava/lang/String;
/*    */       //   40	236	0	this	Lcom/intellij/ml/llm/performanceTesting/CheckBotResponse$doExecute$2;
/*    */       //   40	236	1	$result	Ljava/lang/Object; } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super CheckBotResponse$doExecute$2> $completion) { return (Continuation<Unit>)new CheckBotResponse$doExecute$2(CheckBotResponse.this, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((CheckBotResponse$doExecute$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } @DebugMetadata(f = "CheckBotResponse.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.performanceTesting.CheckBotResponse$doExecute$2$findPsiFile$1") @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\004\030\0010\001*\0020\002H@"}, d2 = {"<anonymous>", "Lcom/intellij/psi/PsiFile;", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */     static final class CheckBotResponse$doExecute$2$findPsiFile$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PsiFile>, Object>
/*    */     {
/*    */       @Nullable
/* 27 */       public final Object invokeSuspend(@NotNull Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 28 */             Intrinsics.checkNotNullExpressionValue(this.$editor.getVirtualFile(), "editor.virtualFile"); return VirtualFileUtil.findPsiFile(this.$editor.getVirtualFile(), this.$project); }
/*    */         
/*    */         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */ 
/*    */       
/*    */       int label;
/*    */       
/*    */       CheckBotResponse$doExecute$2$findPsiFile$1(Editor $editor, Project $project, Continuation $completion) {
/*    */         super(2, $completion);
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super CheckBotResponse$doExecute$2$findPsiFile$1> $completion) {
/*    */         return (Continuation<Unit>)new CheckBotResponse$doExecute$2$findPsiFile$1(this.$editor, this.$project, $completion);
/*    */       }
/*    */       
/*    */       @Nullable
/*    */       public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */         return ((CheckBotResponse$doExecute$2$findPsiFile$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/performanceTesting/CheckBotResponse.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */