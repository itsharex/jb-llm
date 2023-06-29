/*    */ package com.intellij.ml.llm.core.models.grazie;
/*    */ import ai.grazie.model.llm.chat.LLMChat;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @DebugMetadata(f = "GrazieNameSuggestionRequest.kt", l = {22}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.models.grazie.GrazieNameSuggestionRequest$sendSync$result$1")
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\016\n\002\030\002\020\000\032\004\030\0010\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class GrazieNameSuggestionRequest$sendSync$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
/*    */   int label;
/*    */   
/*    */   GrazieNameSuggestionRequest$sendSync$result$1(LLMChat $chat, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invokeSuspend(@NotNull Object $result) {
/* 21 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 22 */         this.label = 1; if (TasksKt.withBackgroundProgress(GrazieNameSuggestionRequest.this.getProject(), LLMBundle.message("intentions.request.background.process.title", new Object[0]), new Function2<CoroutineScope, Continuation<? super String>, Object>(this.$chat, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { // Byte code:
/*    */                 //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */                 //   3: astore_2
/*    */                 //   4: aload_0
/*    */                 //   5: getfield label : I
/*    */                 //   8: tableswitch default -> 148, 0 -> 36, 1 -> 77, 2 -> 111
/*    */                 //   36: aload_1
/*    */                 //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */                 //   40: aload_0
/*    */                 //   41: getfield this$0 : Lcom/intellij/ml/llm/core/models/grazie/GrazieNameSuggestionRequest;
/*    */                 //   44: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*    */                 //   47: aload_0
/*    */                 //   48: getfield $chat : Lai/grazie/model/llm/chat/LLMChat;
/*    */                 //   51: aconst_null
/*    */                 //   52: iconst_0
/*    */                 //   53: aconst_null
/*    */                 //   54: iconst_0
/*    */                 //   55: aload_0
/*    */                 //   56: checkcast kotlin/coroutines/Continuation
/*    */                 //   59: bipush #28
/*    */                 //   61: aconst_null
/*    */                 //   62: aload_0
/*    */                 //   63: iconst_1
/*    */                 //   64: putfield label : I
/*    */                 //   67: invokestatic sendGrazieChatRequest$default : (Lcom/intellij/openapi/project/Project;Lai/grazie/model/llm/chat/LLMChat;Lai/grazie/model/llm/profile/LLMProfileID;ZLai/grazie/utils/attributes/Attributes;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */                 //   70: dup
/*    */                 //   71: aload_2
/*    */                 //   72: if_acmpne -> 82
/*    */                 //   75: aload_2
/*    */                 //   76: areturn
/*    */                 //   77: aload_1
/*    */                 //   78: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */                 //   81: aload_1
/*    */                 //   82: checkcast kotlinx/coroutines/flow/Flow
/*    */                 //   85: dup
/*    */                 //   86: ifnull -> 145
/*    */                 //   89: aconst_null
/*    */                 //   90: aload_0
/*    */                 //   91: checkcast kotlin/coroutines/Continuation
/*    */                 //   94: iconst_1
/*    */                 //   95: aconst_null
/*    */                 //   96: aload_0
/*    */                 //   97: iconst_2
/*    */                 //   98: putfield label : I
/*    */                 //   101: invokestatic toList$default : (Lkotlinx/coroutines/flow/Flow;Ljava/util/List;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */                 //   104: dup
/*    */                 //   105: aload_2
/*    */                 //   106: if_acmpne -> 116
/*    */                 //   109: aload_2
/*    */                 //   110: areturn
/*    */                 //   111: aload_1
/*    */                 //   112: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */                 //   115: aload_1
/*    */                 //   116: checkcast java/util/List
/*    */                 //   119: dup
/*    */                 //   120: ifnull -> 145
/*    */                 //   123: checkcast java/lang/Iterable
/*    */                 //   126: ldc ''
/*    */                 //   128: checkcast java/lang/CharSequence
/*    */                 //   131: aconst_null
/*    */                 //   132: aconst_null
/*    */                 //   133: iconst_0
/*    */                 //   134: aconst_null
/*    */                 //   135: aconst_null
/*    */                 //   136: bipush #62
/*    */                 //   138: aconst_null
/*    */                 //   139: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*    */                 //   142: goto -> 147
/*    */                 //   145: pop
/*    */                 //   146: aconst_null
/*    */                 //   147: areturn
/*    */                 //   148: new java/lang/IllegalStateException
/*    */                 //   151: dup
/*    */                 //   152: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */                 //   154: invokespecial <init> : (Ljava/lang/String;)V
/*    */                 //   157: athrow
/*    */                 // Line number table:
/*    */                 //   Java source line number -> byte code offset
/*    */                 //   #22	-> 3
/*    */                 //   #23	-> 40
/*    */                 //   #22	-> 75
/*    */                 //   #23	-> 82
/*    */                 //   #22	-> 109
/*    */                 //   #23	-> 116
/*    */                 //   #22	-> 148
/*    */                 // Local variable table:
/*    */                 //   start	length	slot	name	descriptor
/*    */                 //   40	108	0	this	Lcom/intellij/ml/llm/core/models/grazie/GrazieNameSuggestionRequest$sendSync$result$1$1;
/* 22 */                 //   40	108	1	$result	Ljava/lang/Object; } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(GrazieNameSuggestionRequest.this, this.$chat, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this) == object) return object;  return TasksKt.withBackgroundProgress(GrazieNameSuggestionRequest.this.getProject(), LLMBundle.message("intentions.request.background.process.title", new Object[0]), new Function2<CoroutineScope, Continuation<? super String>, Object>(this.$chat, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { // Byte code:
/*    */                 //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */                 //   3: astore_2
/*    */                 //   4: aload_0
/*    */                 //   5: getfield label : I
/*    */                 //   8: tableswitch default -> 148, 0 -> 36, 1 -> 77, 2 -> 111
/*    */                 //   36: aload_1
/*    */                 //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */                 //   40: aload_0
/*    */                 //   41: getfield this$0 : Lcom/intellij/ml/llm/core/models/grazie/GrazieNameSuggestionRequest;
/*    */                 //   44: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*    */                 //   47: aload_0
/*    */                 //   48: getfield $chat : Lai/grazie/model/llm/chat/LLMChat;
/*    */                 //   51: aconst_null
/*    */                 //   52: iconst_0
/*    */                 //   53: aconst_null
/*    */                 //   54: iconst_0
/*    */                 //   55: aload_0
/*    */                 //   56: checkcast kotlin/coroutines/Continuation
/*    */                 //   59: bipush #28
/*    */                 //   61: aconst_null
/*    */                 //   62: aload_0
/*    */                 //   63: iconst_1
/*    */                 //   64: putfield label : I
/*    */                 //   67: invokestatic sendGrazieChatRequest$default : (Lcom/intellij/openapi/project/Project;Lai/grazie/model/llm/chat/LLMChat;Lai/grazie/model/llm/profile/LLMProfileID;ZLai/grazie/utils/attributes/Attributes;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */                 //   70: dup
/*    */                 //   71: aload_2
/*    */                 //   72: if_acmpne -> 82
/*    */                 //   75: aload_2
/*    */                 //   76: areturn
/*    */                 //   77: aload_1
/*    */                 //   78: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */                 //   81: aload_1
/*    */                 //   82: checkcast kotlinx/coroutines/flow/Flow
/*    */                 //   85: dup
/*    */                 //   86: ifnull -> 145
/*    */                 //   89: aconst_null
/*    */                 //   90: aload_0
/*    */                 //   91: checkcast kotlin/coroutines/Continuation
/*    */                 //   94: iconst_1
/*    */                 //   95: aconst_null
/*    */                 //   96: aload_0
/*    */                 //   97: iconst_2
/*    */                 //   98: putfield label : I
/*    */                 //   101: invokestatic toList$default : (Lkotlinx/coroutines/flow/Flow;Ljava/util/List;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */                 //   104: dup
/*    */                 //   105: aload_2
/*    */                 //   106: if_acmpne -> 116
/*    */                 //   109: aload_2
/*    */                 //   110: areturn
/*    */                 //   111: aload_1
/*    */                 //   112: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */                 //   115: aload_1
/*    */                 //   116: checkcast java/util/List
/*    */                 //   119: dup
/*    */                 //   120: ifnull -> 145
/*    */                 //   123: checkcast java/lang/Iterable
/*    */                 //   126: ldc ''
/*    */                 //   128: checkcast java/lang/CharSequence
/*    */                 //   131: aconst_null
/*    */                 //   132: aconst_null
/*    */                 //   133: iconst_0
/*    */                 //   134: aconst_null
/*    */                 //   135: aconst_null
/*    */                 //   136: bipush #62
/*    */                 //   138: aconst_null
/*    */                 //   139: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*    */                 //   142: goto -> 147
/*    */                 //   145: pop
/*    */                 //   146: aconst_null
/*    */                 //   147: areturn
/*    */                 //   148: new java/lang/IllegalStateException
/*    */                 //   151: dup
/*    */                 //   152: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */                 //   154: invokespecial <init> : (Ljava/lang/String;)V
/*    */                 //   157: athrow
/*    */                 // Line number table:
/*    */                 //   Java source line number -> byte code offset
/*    */                 //   #22	-> 3
/*    */                 //   #23	-> 40
/*    */                 //   #22	-> 75
/*    */                 //   #23	-> 82
/*    */                 //   #22	-> 109
/*    */                 //   #23	-> 116
/*    */                 //   #22	-> 148
/*    */                 // Local variable table:
/*    */                 //   start	length	slot	name	descriptor
/*    */                 //   40	108	0	this	Lcom/intellij/ml/llm/core/models/grazie/GrazieNameSuggestionRequest$sendSync$result$1$1;
/* 22 */                 //   40	108	1	$result	Ljava/lang/Object; } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(GrazieNameSuggestionRequest.this, this.$chat, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this);
/*    */       case 1:
/*    */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */         return SYNTHETIC_LOCAL_VARIABLE_1; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super GrazieNameSuggestionRequest$sendSync$result$1> $completion) {
/*    */     return (Continuation<Unit>)new GrazieNameSuggestionRequest$sendSync$result$1(this.$chat, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */     return ((GrazieNameSuggestionRequest$sendSync$result$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/grazie/GrazieNameSuggestionRequest$sendSync$result$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */