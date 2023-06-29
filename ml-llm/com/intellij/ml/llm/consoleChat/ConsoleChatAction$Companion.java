/*    */ package com.intellij.ml.llm.consoleChat;
/*    */ 
/*    */ import ai.grazie.model.llm.chat.LLMChat;
/*    */ import ai.grazie.model.llm.chat.LLMChatMessage;
/*    */ import ai.grazie.model.llm.chat.LLMChatRole;
/*    */ import com.google.gson.Gson;
/*    */ import com.intellij.ml.llm.LLMBundle;
/*    */ import com.intellij.openapi.command.CommandProcessor;
/*    */ import com.intellij.openapi.editor.Document;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.text.StringsKt;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J)\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\nH@ø\001\000¢\006\002\020\013J\016\020\f\032\0020\r2\006\020\016\032\0020\004\002\004\n\002\b\031¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/consoleChat/ConsoleChatAction$Companion;", "", "()V", "continueConversation", "", "project", "Lcom/intellij/openapi/project/Project;", "file", "Lcom/intellij/psi/PsiFile;", "document", "Lcom/intellij/openapi/editor/Document;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiFile;Lcom/intellij/openapi/editor/Document;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseMessages", "Lai/grazie/model/llm/chat/LLMChat;", "text", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nConsoleChatAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsoleChatAction.kt\ncom/intellij/ml/llm/consoleChat/ConsoleChatAction$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,66:1\n1549#2:67\n1620#2,3:68\n37#3,2:71\n*S KotlinDebug\n*F\n+ 1 ConsoleChatAction.kt\ncom/intellij/ml/llm/consoleChat/ConsoleChatAction$Companion\n*L\n42#1:67\n42#1:68,3\n45#1:71,2\n*E\n"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final LLMChat parseMessages(@NotNull String text) {
/* 40 */     Intrinsics.checkNotNullParameter(text, "text"); Gson gson = new Gson();
/*    */     
/* 42 */     Iterable $this$map$iv = StringsKt.lines(text); int $i$f$map = 0;
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
/* 67 */     Iterable iterable2 = $this$map$iv; Collection<LLMChatMessage> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 68 */     for (Object item$iv$iv : iterable2) {
/* 69 */       String str = (String)item$iv$iv; Collection<LLMChatMessage> collection = destination$iv$iv; int $i$a$-map-ConsoleChatAction$Companion$parseMessages$messages$1 = 0; MessageLine messageLine = (MessageLine)gson.fromJson(str, MessageLine.class); collection.add(new LLMChatMessage(LLMChatRole.valueOf(messageLine.getRole()), messageLine.getMessage()));
/* 70 */     }  $this$map$iv = destination$iv$iv; int $i$f$toTypedArray = 0;
/* 71 */     Iterable iterable1 = $this$map$iv;
/* 72 */     LLMChatMessage[] messages = (LLMChatMessage[])iterable1.toArray((Object[])new LLMChatMessage[0]);
/*    */     return new LLMChat(messages);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object continueConversation(@NotNull Project project, @NotNull PsiFile file, @NotNull Document document, @NotNull Continuation<? super String> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: instanceof com/intellij/ml/llm/consoleChat/ConsoleChatAction$Companion$continueConversation$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #4
/*    */     //   10: checkcast com/intellij/ml/llm/consoleChat/ConsoleChatAction$Companion$continueConversation$1
/*    */     //   13: astore #7
/*    */     //   15: aload #7
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #7
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new com/intellij/ml/llm/consoleChat/ConsoleChatAction$Companion$continueConversation$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #4
/*    */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/consoleChat/ConsoleChatAction$Companion;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #7
/*    */     //   53: aload #7
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #6
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #8
/*    */     //   65: aload #7
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 254, 0 -> 96, 1 -> 156, 2 -> 233
/*    */     //   96: aload #6
/*    */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   101: aload_1
/*    */     //   102: ldc 'intentions.request.background.process.title'
/*    */     //   104: iconst_0
/*    */     //   105: anewarray java/lang/Object
/*    */     //   108: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   111: new com/intellij/ml/llm/consoleChat/ConsoleChatAction$Companion$continueConversation$response$1
/*    */     //   114: dup
/*    */     //   115: aload_1
/*    */     //   116: aload_2
/*    */     //   117: aconst_null
/*    */     //   118: invokespecial <init> : (Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiFile;Lkotlin/coroutines/Continuation;)V
/*    */     //   121: checkcast kotlin/jvm/functions/Function2
/*    */     //   124: aload #7
/*    */     //   126: aload #7
/*    */     //   128: aload_1
/*    */     //   129: putfield L$0 : Ljava/lang/Object;
/*    */     //   132: aload #7
/*    */     //   134: aload_3
/*    */     //   135: putfield L$1 : Ljava/lang/Object;
/*    */     //   138: aload #7
/*    */     //   140: iconst_1
/*    */     //   141: putfield label : I
/*    */     //   144: invokestatic withBackgroundProgress : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   147: dup
/*    */     //   148: aload #8
/*    */     //   150: if_acmpne -> 181
/*    */     //   153: aload #8
/*    */     //   155: areturn
/*    */     //   156: aload #7
/*    */     //   158: getfield L$1 : Ljava/lang/Object;
/*    */     //   161: checkcast com/intellij/openapi/editor/Document
/*    */     //   164: astore_3
/*    */     //   165: aload #7
/*    */     //   167: getfield L$0 : Ljava/lang/Object;
/*    */     //   170: checkcast com/intellij/openapi/project/Project
/*    */     //   173: astore_1
/*    */     //   174: aload #6
/*    */     //   176: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   179: aload #6
/*    */     //   181: checkcast java/lang/String
/*    */     //   184: astore #5
/*    */     //   186: new com/intellij/ml/llm/consoleChat/ConsoleChatAction$Companion$continueConversation$2
/*    */     //   189: dup
/*    */     //   190: aload_1
/*    */     //   191: aload_3
/*    */     //   192: aload #5
/*    */     //   194: invokespecial <init> : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Document;Ljava/lang/String;)V
/*    */     //   197: checkcast kotlin/jvm/functions/Function0
/*    */     //   200: aload #7
/*    */     //   202: aload #7
/*    */     //   204: aload #5
/*    */     //   206: putfield L$0 : Ljava/lang/Object;
/*    */     //   209: aload #7
/*    */     //   211: aconst_null
/*    */     //   212: putfield L$1 : Ljava/lang/Object;
/*    */     //   215: aload #7
/*    */     //   217: iconst_2
/*    */     //   218: putfield label : I
/*    */     //   221: invokestatic writeAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   224: dup
/*    */     //   225: aload #8
/*    */     //   227: if_acmpne -> 250
/*    */     //   230: aload #8
/*    */     //   232: areturn
/*    */     //   233: aload #7
/*    */     //   235: getfield L$0 : Ljava/lang/Object;
/*    */     //   238: checkcast java/lang/String
/*    */     //   241: astore #5
/*    */     //   243: aload #6
/*    */     //   245: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   248: aload #6
/*    */     //   250: pop
/*    */     //   251: aload #5
/*    */     //   253: areturn
/*    */     //   254: new java/lang/IllegalStateException
/*    */     //   257: dup
/*    */     //   258: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   260: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   263: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #50	-> 63
/*    */     //   #53	-> 101
/*    */     //   #50	-> 153
/*    */     //   #56	-> 186
/*    */     //   #50	-> 230
/*    */     //   #62	-> 250
/*    */     //   #50	-> 254
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   101	55	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   174	50	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   101	46	2	file	Lcom/intellij/psi/PsiFile;
/*    */     //   101	55	3	document	Lcom/intellij/openapi/editor/Document;
/*    */     //   165	59	3	document	Lcom/intellij/openapi/editor/Document;
/*    */     //   186	47	5	response	Ljava/lang/String;
/*    */     //   243	11	5	response	Ljava/lang/String;
/*    */     //   53	201	7	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	194	6	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "ConsoleChatAction.kt", l = {53, 56}, i = {0, 0, 1}, s = {"L$0", "L$1", "L$0"}, n = {"project", "document", "response"}, m = "continueConversation", c = "com.intellij.ml.llm.consoleChat.ConsoleChatAction$Companion")
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
/*    */   static final class ConsoleChatAction$Companion$continueConversation$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     ConsoleChatAction$Companion$continueConversation$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return ConsoleChatAction.Companion.this.continueConversation(null, null, null, (Continuation<? super String>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "ConsoleChatAction.kt", l = {54, 54}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.consoleChat.ConsoleChatAction$Companion$continueConversation$response$1")
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\016\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */   static final class ConsoleChatAction$Companion$continueConversation$response$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
/*    */     int label;
/*    */     
/*    */     ConsoleChatAction$Companion$continueConversation$response$1(Project $project, PsiFile $file, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       // Byte code:
/*    */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */       //   3: astore_2
/*    */       //   4: aload_0
/*    */       //   5: getfield label : I
/*    */       //   8: tableswitch default -> 167, 0 -> 36, 1 -> 91, 2 -> 125
/*    */       //   36: aload_1
/*    */       //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   40: aload_0
/*    */       //   41: getfield $project : Lcom/intellij/openapi/project/Project;
/*    */       //   44: getstatic com/intellij/ml/llm/consoleChat/ConsoleChatAction.Companion : Lcom/intellij/ml/llm/consoleChat/ConsoleChatAction$Companion;
/*    */       //   47: aload_0
/*    */       //   48: getfield $file : Lcom/intellij/psi/PsiFile;
/*    */       //   51: invokeinterface getText : ()Ljava/lang/String;
/*    */       //   56: dup
/*    */       //   57: ldc 'file.text'
/*    */       //   59: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   62: invokevirtual parseMessages : (Ljava/lang/String;)Lai/grazie/model/llm/chat/LLMChat;
/*    */       //   65: aconst_null
/*    */       //   66: iconst_0
/*    */       //   67: aconst_null
/*    */       //   68: iconst_0
/*    */       //   69: aload_0
/*    */       //   70: checkcast kotlin/coroutines/Continuation
/*    */       //   73: bipush #60
/*    */       //   75: aconst_null
/*    */       //   76: aload_0
/*    */       //   77: iconst_1
/*    */       //   78: putfield label : I
/*    */       //   81: invokestatic sendGrazieChatRequest$default : (Lcom/intellij/openapi/project/Project;Lai/grazie/model/llm/chat/LLMChat;Lai/grazie/model/llm/profile/LLMProfileID;ZLai/grazie/utils/attributes/Attributes;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */       //   84: dup
/*    */       //   85: aload_2
/*    */       //   86: if_acmpne -> 96
/*    */       //   89: aload_2
/*    */       //   90: areturn
/*    */       //   91: aload_1
/*    */       //   92: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   95: aload_1
/*    */       //   96: checkcast kotlinx/coroutines/flow/Flow
/*    */       //   99: dup
/*    */       //   100: ifnull -> 159
/*    */       //   103: aconst_null
/*    */       //   104: aload_0
/*    */       //   105: checkcast kotlin/coroutines/Continuation
/*    */       //   108: iconst_1
/*    */       //   109: aconst_null
/*    */       //   110: aload_0
/*    */       //   111: iconst_2
/*    */       //   112: putfield label : I
/*    */       //   115: invokestatic toList$default : (Lkotlinx/coroutines/flow/Flow;Ljava/util/List;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */       //   118: dup
/*    */       //   119: aload_2
/*    */       //   120: if_acmpne -> 130
/*    */       //   123: aload_2
/*    */       //   124: areturn
/*    */       //   125: aload_1
/*    */       //   126: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   129: aload_1
/*    */       //   130: checkcast java/util/List
/*    */       //   133: dup
/*    */       //   134: ifnull -> 159
/*    */       //   137: checkcast java/lang/Iterable
/*    */       //   140: ldc ''
/*    */       //   142: checkcast java/lang/CharSequence
/*    */       //   145: aconst_null
/*    */       //   146: aconst_null
/*    */       //   147: iconst_0
/*    */       //   148: aconst_null
/*    */       //   149: aconst_null
/*    */       //   150: bipush #62
/*    */       //   152: aconst_null
/*    */       //   153: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*    */       //   156: goto -> 161
/*    */       //   159: pop
/*    */       //   160: aconst_null
/*    */       //   161: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */       //   166: areturn
/*    */       //   167: new java/lang/IllegalStateException
/*    */       //   170: dup
/*    */       //   171: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */       //   173: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   176: athrow
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #53	-> 3
/*    */       //   #54	-> 40
/*    */       //   #53	-> 89
/*    */       //   #54	-> 96
/*    */       //   #53	-> 123
/*    */       //   #54	-> 130
/*    */       //   #53	-> 167
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   40	127	0	this	Lcom/intellij/ml/llm/consoleChat/ConsoleChatAction$Companion$continueConversation$response$1;
/*    */       //   40	127	1	$result	Ljava/lang/Object;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super ConsoleChatAction$Companion$continueConversation$response$1> $completion) {
/*    */       return (Continuation<Unit>)new ConsoleChatAction$Companion$continueConversation$response$1(this.$project, this.$file, $completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */       return ((ConsoleChatAction$Companion$continueConversation$response$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */   @SourceDebugExtension({"SMAP\nConsoleChatAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsoleChatAction.kt\ncom/intellij/ml/llm/consoleChat/ConsoleChatAction$Companion$continueConversation$2\n+ 2 actions.kt\ncom/intellij/openapi/command/ActionsKt\n*L\n1#1,66:1\n7#2,6:67\n*S KotlinDebug\n*F\n+ 1 ConsoleChatAction.kt\ncom/intellij/ml/llm/consoleChat/ConsoleChatAction$Companion$continueConversation$2\n*L\n57#1:67,6\n*E\n"})
/*    */   static final class ConsoleChatAction$Companion$continueConversation$2 extends Lambda implements Function0<Unit> {
/*    */     public final void invoke() {
/*    */       Project project1 = this.$project;
/*    */       String str1 = LLMBundle.message("mock.chat.add.responce.text", new Object[0]);
/*    */       Document document = this.$document;
/*    */       String str2 = this.$response;
/*    */       Project project2 = this.$project;
/*    */       String groupId$iv = null;
/*    */       int $i$f$executeCommand = 0;
/*    */       CommandProcessor.getInstance().executeCommand(project1, new ConsoleChatAction$Companion$continueConversation$2$invoke$$inlined$executeCommand$default$1(document, str2, project2), str1, groupId$iv);
/*    */     }
/*    */     
/*    */     ConsoleChatAction$Companion$continueConversation$2(Project $project, Document $document, String $response) {
/*    */       super(0);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/consoleChat/ConsoleChatAction$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */