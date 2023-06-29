/*     */ package com.intellij.ml.llm.runtimeErrorExplanation;
/*     */ 
/*     */ import com.intellij.ml.llm.core.chat.session.ChatSession;
/*     */ import com.intellij.ml.llm.core.chat.session.FocusedChatSessionHost;
/*     */ import com.intellij.ml.llm.core.tokenizer.TokenizerAccessPointService;
/*     */ import com.intellij.openapi.components.ComponentManager;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @DebugMetadata(f = "RuntimeErrorExplanationAction.kt", l = {51, 53, 56, 61}, i = {1, 2}, s = {"L$0", "L$0"}, n = {"chat", "chat"}, m = "invokeSuspend", c = "com.intellij.ml.llm.runtimeErrorExplanation.RuntimeErrorExplanationAction$createPromptAndSend$1$1")
/*     */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ @SourceDebugExtension({"SMAP\nRuntimeErrorExplanationAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RuntimeErrorExplanationAction.kt\ncom/intellij/ml/llm/runtimeErrorExplanation/RuntimeErrorExplanationAction$createPromptAndSend$1$1\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,157:1\n29#2,3:158\n*S KotlinDebug\n*F\n+ 1 RuntimeErrorExplanationAction.kt\ncom/intellij/ml/llm/runtimeErrorExplanation/RuntimeErrorExplanationAction$createPromptAndSend$1$1\n*L\n51#1:158,3\n*E\n"})
/*     */ final class RuntimeErrorExplanationAction$createPromptAndSend$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */   Object L$0;
/*     */   int label;
/*     */   
/*     */   RuntimeErrorExplanationAction$createPromptAndSend$1$1(RuntimeErrorExplanationAction $receiver, TokenizerAccessPointService $tokenizerAccessPointService, String $extractedRuntimeText, List<ErrorPlace> $extractedErrorPlaces, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object invokeSuspend(@NotNull Object $result) {
/*     */     // Byte code:
/*     */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   3: astore #7
/*     */     //   5: aload_0
/*     */     //   6: getfield label : I
/*     */     //   9: tableswitch default -> 368, 0 -> 44, 1 -> 167, 2 -> 224, 3 -> 268, 4 -> 358
/*     */     //   44: aload_1
/*     */     //   45: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   48: aload_0
/*     */     //   49: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   52: checkcast com/intellij/openapi/components/ComponentManager
/*     */     //   55: astore_3
/*     */     //   56: iconst_0
/*     */     //   57: istore #4
/*     */     //   59: ldc com/intellij/ml/llm/core/chat/session/ChatSessionHost
/*     */     //   61: astore #5
/*     */     //   63: aload_3
/*     */     //   64: aload #5
/*     */     //   66: invokeinterface getService : (Ljava/lang/Class;)Ljava/lang/Object;
/*     */     //   71: astore #6
/*     */     //   73: aload #6
/*     */     //   75: ifnonnull -> 134
/*     */     //   78: new java/lang/IllegalStateException
/*     */     //   81: dup
/*     */     //   82: new java/lang/StringBuilder
/*     */     //   85: dup
/*     */     //   86: invokespecial <init> : ()V
/*     */     //   89: ldc 'Cannot find service '
/*     */     //   91: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   94: aload #5
/*     */     //   96: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   99: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   102: ldc ' in '
/*     */     //   104: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   107: aload_3
/*     */     //   108: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   111: ldc ' (classloader='
/*     */     //   113: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   116: aload #5
/*     */     //   118: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
/*     */     //   121: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   124: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   127: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   130: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   133: athrow
/*     */     //   134: aload #6
/*     */     //   136: checkcast com/intellij/ml/llm/core/chat/session/ChatSessionHost
/*     */     //   139: aload_0
/*     */     //   140: getfield this$0 : Lcom/intellij/ml/llm/runtimeErrorExplanation/RuntimeErrorExplanationAction;
/*     */     //   143: invokestatic access$getChatCreationContext : (Lcom/intellij/ml/llm/runtimeErrorExplanation/RuntimeErrorExplanationAction;)Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;
/*     */     //   146: aload_0
/*     */     //   147: checkcast kotlin/coroutines/Continuation
/*     */     //   150: aload_0
/*     */     //   151: iconst_1
/*     */     //   152: putfield label : I
/*     */     //   155: invokevirtual createChatSession : (Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   158: dup
/*     */     //   159: aload #7
/*     */     //   161: if_acmpne -> 172
/*     */     //   164: aload #7
/*     */     //   166: areturn
/*     */     //   167: aload_1
/*     */     //   168: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   171: aload_1
/*     */     //   172: checkcast com/intellij/ml/llm/core/chat/session/ChatSession
/*     */     //   175: astore_2
/*     */     //   176: getstatic kotlinx/coroutines/Dispatchers.INSTANCE : Lkotlinx/coroutines/Dispatchers;
/*     */     //   179: invokestatic getEDT : (Lkotlinx/coroutines/Dispatchers;)Lkotlin/coroutines/CoroutineContext;
/*     */     //   182: new com/intellij/ml/llm/runtimeErrorExplanation/RuntimeErrorExplanationAction$createPromptAndSend$1$1$1
/*     */     //   185: dup
/*     */     //   186: aload_0
/*     */     //   187: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   190: aload_2
/*     */     //   191: aconst_null
/*     */     //   192: invokespecial <init> : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/chat/session/ChatSession;Lkotlin/coroutines/Continuation;)V
/*     */     //   195: checkcast kotlin/jvm/functions/Function2
/*     */     //   198: aload_0
/*     */     //   199: checkcast kotlin/coroutines/Continuation
/*     */     //   202: aload_0
/*     */     //   203: aload_2
/*     */     //   204: putfield L$0 : Ljava/lang/Object;
/*     */     //   207: aload_0
/*     */     //   208: iconst_2
/*     */     //   209: putfield label : I
/*     */     //   212: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   215: dup
/*     */     //   216: aload #7
/*     */     //   218: if_acmpne -> 237
/*     */     //   221: aload #7
/*     */     //   223: areturn
/*     */     //   224: aload_0
/*     */     //   225: getfield L$0 : Ljava/lang/Object;
/*     */     //   228: checkcast com/intellij/ml/llm/core/chat/session/ChatSession
/*     */     //   231: astore_2
/*     */     //   232: aload_1
/*     */     //   233: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   236: aload_1
/*     */     //   237: pop
/*     */     //   238: aload_0
/*     */     //   239: getfield $tokenizerAccessPointService : Lcom/intellij/ml/llm/core/tokenizer/TokenizerAccessPointService;
/*     */     //   242: aload_0
/*     */     //   243: checkcast kotlin/coroutines/Continuation
/*     */     //   246: aload_0
/*     */     //   247: aload_2
/*     */     //   248: putfield L$0 : Ljava/lang/Object;
/*     */     //   251: aload_0
/*     */     //   252: iconst_3
/*     */     //   253: putfield label : I
/*     */     //   256: invokevirtual getTokenizer : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   259: dup
/*     */     //   260: aload #7
/*     */     //   262: if_acmpne -> 281
/*     */     //   265: aload #7
/*     */     //   267: areturn
/*     */     //   268: aload_0
/*     */     //   269: getfield L$0 : Ljava/lang/Object;
/*     */     //   272: checkcast com/intellij/ml/llm/core/chat/session/ChatSession
/*     */     //   275: astore_2
/*     */     //   276: aload_1
/*     */     //   277: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   280: aload_1
/*     */     //   281: checkcast com/intellij/ml/llm/core/tokenizer/Tokenizer
/*     */     //   284: astore_3
/*     */     //   285: new com/intellij/ml/llm/runtimeErrorExplanation/PromptConstructor
/*     */     //   288: dup
/*     */     //   289: aload_0
/*     */     //   290: getfield this$0 : Lcom/intellij/ml/llm/runtimeErrorExplanation/RuntimeErrorExplanationAction;
/*     */     //   293: invokestatic access$getMaxLength$p : (Lcom/intellij/ml/llm/runtimeErrorExplanation/RuntimeErrorExplanationAction;)I
/*     */     //   296: aload_3
/*     */     //   297: invokespecial <init> : (ILcom/intellij/ml/llm/core/tokenizer/Tokenizer;)V
/*     */     //   300: astore #4
/*     */     //   302: aload #4
/*     */     //   304: aload_0
/*     */     //   305: getfield $extractedRuntimeText : Ljava/lang/String;
/*     */     //   308: aload_0
/*     */     //   309: getfield $extractedErrorPlaces : Ljava/util/List;
/*     */     //   312: invokevirtual makePrompt : (Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;
/*     */     //   315: astore #5
/*     */     //   317: aload_2
/*     */     //   318: aload_0
/*     */     //   319: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   322: aload #5
/*     */     //   324: getstatic com/intellij/ml/llm/core/chat/session/SimpleChat.INSTANCE : Lcom/intellij/ml/llm/core/chat/session/SimpleChat;
/*     */     //   327: checkcast com/intellij/ml/llm/core/chat/session/ChatKind
/*     */     //   330: aload_0
/*     */     //   331: checkcast kotlin/coroutines/Continuation
/*     */     //   334: aload_0
/*     */     //   335: aconst_null
/*     */     //   336: putfield L$0 : Ljava/lang/Object;
/*     */     //   339: aload_0
/*     */     //   340: iconst_4
/*     */     //   341: putfield label : I
/*     */     //   344: invokeinterface send : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Lcom/intellij/ml/llm/core/chat/session/ChatKind;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   349: dup
/*     */     //   350: aload #7
/*     */     //   352: if_acmpne -> 363
/*     */     //   355: aload #7
/*     */     //   357: areturn
/*     */     //   358: aload_1
/*     */     //   359: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   362: aload_1
/*     */     //   363: pop
/*     */     //   364: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   367: areturn
/*     */     //   368: new java/lang/IllegalStateException
/*     */     //   371: dup
/*     */     //   372: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   374: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   377: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #50	-> 3
/*     */     //   #51	-> 48
/*     */     //   #158	-> 61
/*     */     //   #159	-> 63
/*     */     //   #160	-> 82
/*     */     //   #159	-> 134
/*     */     //   #51	-> 139
/*     */     //   #50	-> 164
/*     */     //   #53	-> 176
/*     */     //   #50	-> 221
/*     */     //   #56	-> 237
/*     */     //   #50	-> 265
/*     */     //   #57	-> 285
/*     */     //   #58	-> 289
/*     */     //   #57	-> 297
/*     */     //   #60	-> 302
/*     */     //   #61	-> 317
/*     */     //   #50	-> 355
/*     */     //   #62	-> 363
/*     */     //   #50	-> 368
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   176	48	2	chat	Lcom/intellij/ml/llm/core/chat/session/ChatSession;
/*     */     //   232	36	2	chat	Lcom/intellij/ml/llm/core/chat/session/ChatSession;
/*     */     //   276	73	2	chat	Lcom/intellij/ml/llm/core/chat/session/ChatSession;
/*     */     //   56	80	3	$this$service$iv	Lcom/intellij/openapi/components/ComponentManager;
/*     */     //   285	12	3	tokenizer	Lcom/intellij/ml/llm/core/tokenizer/Tokenizer;
/*     */     //   302	15	4	promptConstructor	Lcom/intellij/ml/llm/runtimeErrorExplanation/PromptConstructor;
/*     */     //   63	73	5	serviceClass$iv	Ljava/lang/Class;
/*     */     //   317	32	5	prompt	Ljava/lang/String;
/*     */     //   59	77	4	$i$f$service	I
/*     */     //   48	320	0	this	Lcom/intellij/ml/llm/runtimeErrorExplanation/RuntimeErrorExplanationAction$createPromptAndSend$1$1;
/*     */     //   48	320	1	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super RuntimeErrorExplanationAction$createPromptAndSend$1$1> $completion) {
/*     */     return (Continuation<Unit>)new RuntimeErrorExplanationAction$createPromptAndSend$1$1(RuntimeErrorExplanationAction.this, this.$tokenizerAccessPointService, this.$extractedRuntimeText, this.$extractedErrorPlaces, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */     return ((RuntimeErrorExplanationAction$createPromptAndSend$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/runtimeErrorExplanation/RuntimeErrorExplanationAction$createPromptAndSend$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */