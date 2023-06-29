/*    */ package com.intellij.ml.llm.core.models.grazie;
/*    */ 
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\000\030\0002\b\022\004\022\0020\0020\001B\025\022\006\020\003\032\0020\004\022\006\020\005\032\0020\002¢\006\002\020\006J\n\020\t\032\004\030\0010\nH\026R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\007\020\b¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/core/models/grazie/GrazieChatRequest;", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseRequest;", "Lai/grazie/model/llm/chat/LLMChat;", "project", "Lcom/intellij/openapi/project/Project;", "body", "(Lcom/intellij/openapi/project/Project;Lai/grazie/model/llm/chat/LLMChat;)V", "getProject", "()Lcom/intellij/openapi/project/Project;", "sendSync", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseResponse;", "intellij.ml.llm"})
/*    */ public final class GrazieChatRequest extends LLMBaseRequest<LLMChat> {
/* 11 */   public GrazieChatRequest(@NotNull Project project, @NotNull LLMChat body) { super(body); this.project = project; } @NotNull private final Project project; @NotNull public final Project getProject() { return this.project; } @Nullable
/*    */   public LLMBaseResponse sendSync() {
/* 13 */     String result = (String)CoroutinesKt.runBlockingCancellable(new GrazieChatRequest$sendSync$result$1(null));
/*    */ 
/*    */     
/* 16 */     return (result != null) ? new GrazieResponse(result) : null;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "GrazieChatRequest.kt", l = {14, 14}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.models.grazie.GrazieChatRequest$sendSync$result$1")
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\016\n\002\030\002\020\000\032\004\030\0010\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */   static final class GrazieChatRequest$sendSync$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
/*    */     int label;
/*    */     
/*    */     GrazieChatRequest$sendSync$result$1(Continuation $completion) {
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
/*    */       //   8: tableswitch default -> 154, 0 -> 36, 1 -> 83, 2 -> 117
/*    */       //   36: aload_1
/*    */       //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   40: aload_0
/*    */       //   41: getfield this$0 : Lcom/intellij/ml/llm/core/models/grazie/GrazieChatRequest;
/*    */       //   44: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*    */       //   47: aload_0
/*    */       //   48: getfield this$0 : Lcom/intellij/ml/llm/core/models/grazie/GrazieChatRequest;
/*    */       //   51: invokevirtual getBody : ()Ljava/lang/Object;
/*    */       //   54: checkcast ai/grazie/model/llm/chat/LLMChat
/*    */       //   57: aconst_null
/*    */       //   58: iconst_0
/*    */       //   59: aconst_null
/*    */       //   60: iconst_0
/*    */       //   61: aload_0
/*    */       //   62: checkcast kotlin/coroutines/Continuation
/*    */       //   65: bipush #60
/*    */       //   67: aconst_null
/*    */       //   68: aload_0
/*    */       //   69: iconst_1
/*    */       //   70: putfield label : I
/*    */       //   73: invokestatic sendGrazieChatRequest$default : (Lcom/intellij/openapi/project/Project;Lai/grazie/model/llm/chat/LLMChat;Lai/grazie/model/llm/profile/LLMProfileID;ZLai/grazie/utils/attributes/Attributes;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */       //   76: dup
/*    */       //   77: aload_2
/*    */       //   78: if_acmpne -> 88
/*    */       //   81: aload_2
/*    */       //   82: areturn
/*    */       //   83: aload_1
/*    */       //   84: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   87: aload_1
/*    */       //   88: checkcast kotlinx/coroutines/flow/Flow
/*    */       //   91: dup
/*    */       //   92: ifnull -> 151
/*    */       //   95: aconst_null
/*    */       //   96: aload_0
/*    */       //   97: checkcast kotlin/coroutines/Continuation
/*    */       //   100: iconst_1
/*    */       //   101: aconst_null
/*    */       //   102: aload_0
/*    */       //   103: iconst_2
/*    */       //   104: putfield label : I
/*    */       //   107: invokestatic toList$default : (Lkotlinx/coroutines/flow/Flow;Ljava/util/List;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */       //   110: dup
/*    */       //   111: aload_2
/*    */       //   112: if_acmpne -> 122
/*    */       //   115: aload_2
/*    */       //   116: areturn
/*    */       //   117: aload_1
/*    */       //   118: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   121: aload_1
/*    */       //   122: checkcast java/util/List
/*    */       //   125: dup
/*    */       //   126: ifnull -> 151
/*    */       //   129: checkcast java/lang/Iterable
/*    */       //   132: ldc ''
/*    */       //   134: checkcast java/lang/CharSequence
/*    */       //   137: aconst_null
/*    */       //   138: aconst_null
/*    */       //   139: iconst_0
/*    */       //   140: aconst_null
/*    */       //   141: aconst_null
/*    */       //   142: bipush #62
/*    */       //   144: aconst_null
/*    */       //   145: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*    */       //   148: goto -> 153
/*    */       //   151: pop
/*    */       //   152: aconst_null
/*    */       //   153: areturn
/*    */       //   154: new java/lang/IllegalStateException
/*    */       //   157: dup
/*    */       //   158: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */       //   160: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   163: athrow
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #13	-> 3
/*    */       //   #14	-> 40
/*    */       //   #13	-> 81
/*    */       //   #14	-> 88
/*    */       //   #13	-> 115
/*    */       //   #14	-> 122
/*    */       //   #13	-> 154
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   40	114	0	this	Lcom/intellij/ml/llm/core/models/grazie/GrazieChatRequest$sendSync$result$1;
/*    */       //   40	114	1	$result	Ljava/lang/Object;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super GrazieChatRequest$sendSync$result$1> $completion) {
/*    */       return (Continuation<Unit>)new GrazieChatRequest$sendSync$result$1($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */       return ((GrazieChatRequest$sendSync$result$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/grazie/GrazieChatRequest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */