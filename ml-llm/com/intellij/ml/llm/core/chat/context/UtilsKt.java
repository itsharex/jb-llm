/*    */ package com.intellij.ml.llm.core.chat.context;import java.util.List;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\026\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\032!\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H@ø\001\000¢\006\002\020\006\002\004\n\002\b\031¨\006\007"}, d2 = {"collectChatContext", "", "project", "Lcom/intellij/openapi/project/Project;", "creationContext", "Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intellij.ml.llm"})
/*    */ public final class UtilsKt { @Nullable
/*    */   public static final Object collectChatContext(@NotNull Project project, @NotNull ChatCreationContext creationContext, @NotNull Continuation<? super String> paramContinuation) { // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof com/intellij/ml/llm/core/chat/context/UtilsKt$collectChatContext$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast com/intellij/ml/llm/core/chat/context/UtilsKt$collectChatContext$1
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
/*    */     //   36: goto -> 49
/*    */     //   39: new com/intellij/ml/llm/core/chat/context/UtilsKt$collectChatContext$1
/*    */     //   42: dup
/*    */     //   43: aload_2
/*    */     //   44: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*    */     //   47: astore #9
/*    */     //   49: aload #9
/*    */     //   51: getfield result : Ljava/lang/Object;
/*    */     //   54: astore #8
/*    */     //   56: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   59: astore #10
/*    */     //   61: aload #9
/*    */     //   63: getfield label : I
/*    */     //   66: tableswitch default -> 535, 0 -> 92, 1 -> 224, 2 -> 366
/*    */     //   92: aload #8
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: new kotlin/jvm/internal/Ref$ObjectRef
/*    */     //   100: dup
/*    */     //   101: invokespecial <init> : ()V
/*    */     //   104: astore_3
/*    */     //   105: aload_3
/*    */     //   106: new java/util/ArrayList
/*    */     //   109: dup
/*    */     //   110: invokespecial <init> : ()V
/*    */     //   113: checkcast java/util/List
/*    */     //   116: putfield element : Ljava/lang/Object;
/*    */     //   119: getstatic com/intellij/ml/llm/core/chat/context/ChatContextProvider.Companion : Lcom/intellij/ml/llm/core/chat/context/ChatContextProvider$Companion;
/*    */     //   122: invokevirtual getEP_NAME : ()Lcom/intellij/openapi/extensions/ExtensionPointName;
/*    */     //   125: invokevirtual getExtensionList : ()Ljava/util/List;
/*    */     //   128: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   133: astore #4
/*    */     //   135: aload #4
/*    */     //   137: invokeinterface hasNext : ()Z
/*    */     //   142: ifeq -> 486
/*    */     //   145: aload #4
/*    */     //   147: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   152: checkcast com/intellij/ml/llm/core/chat/context/ChatContextProvider
/*    */     //   155: astore #5
/*    */     //   157: nop
/*    */     //   158: new com/intellij/ml/llm/core/chat/context/UtilsKt$collectChatContext$applicable$1
/*    */     //   161: dup
/*    */     //   162: aload #5
/*    */     //   164: aload_0
/*    */     //   165: aload_1
/*    */     //   166: invokespecial <init> : (Lcom/intellij/ml/llm/core/chat/context/ChatContextProvider;Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;)V
/*    */     //   169: checkcast kotlin/jvm/functions/Function0
/*    */     //   172: aload #9
/*    */     //   174: aload #9
/*    */     //   176: aload_0
/*    */     //   177: putfield L$0 : Ljava/lang/Object;
/*    */     //   180: aload #9
/*    */     //   182: aload_1
/*    */     //   183: putfield L$1 : Ljava/lang/Object;
/*    */     //   186: aload #9
/*    */     //   188: aload_3
/*    */     //   189: putfield L$2 : Ljava/lang/Object;
/*    */     //   192: aload #9
/*    */     //   194: aload #4
/*    */     //   196: putfield L$3 : Ljava/lang/Object;
/*    */     //   199: aload #9
/*    */     //   201: aload #5
/*    */     //   203: putfield L$4 : Ljava/lang/Object;
/*    */     //   206: aload #9
/*    */     //   208: iconst_1
/*    */     //   209: putfield label : I
/*    */     //   212: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   215: dup
/*    */     //   216: aload #10
/*    */     //   218: if_acmpne -> 279
/*    */     //   221: aload #10
/*    */     //   223: areturn
/*    */     //   224: aload #9
/*    */     //   226: getfield L$4 : Ljava/lang/Object;
/*    */     //   229: checkcast com/intellij/ml/llm/core/chat/context/ChatContextProvider
/*    */     //   232: astore #5
/*    */     //   234: aload #9
/*    */     //   236: getfield L$3 : Ljava/lang/Object;
/*    */     //   239: checkcast java/util/Iterator
/*    */     //   242: astore #4
/*    */     //   244: aload #9
/*    */     //   246: getfield L$2 : Ljava/lang/Object;
/*    */     //   249: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*    */     //   252: astore_3
/*    */     //   253: aload #9
/*    */     //   255: getfield L$1 : Ljava/lang/Object;
/*    */     //   258: checkcast com/intellij/ml/llm/core/chat/session/ChatCreationContext
/*    */     //   261: astore_1
/*    */     //   262: aload #9
/*    */     //   264: getfield L$0 : Ljava/lang/Object;
/*    */     //   267: checkcast com/intellij/openapi/project/Project
/*    */     //   270: astore_0
/*    */     //   271: nop
/*    */     //   272: aload #8
/*    */     //   274: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   277: aload #8
/*    */     //   279: checkcast java/lang/Boolean
/*    */     //   282: invokevirtual booleanValue : ()Z
/*    */     //   285: istore #6
/*    */     //   287: iload #6
/*    */     //   289: ifeq -> 135
/*    */     //   292: invokestatic getDefault : ()Lkotlinx/coroutines/CoroutineDispatcher;
/*    */     //   295: checkcast kotlin/coroutines/CoroutineContext
/*    */     //   298: new com/intellij/ml/llm/core/chat/context/UtilsKt$collectChatContext$2
/*    */     //   301: dup
/*    */     //   302: aload #5
/*    */     //   304: aload_0
/*    */     //   305: aload_1
/*    */     //   306: aload_3
/*    */     //   307: aconst_null
/*    */     //   308: invokespecial <init> : (Lcom/intellij/ml/llm/core/chat/context/ChatContextProvider;Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V
/*    */     //   311: checkcast kotlin/jvm/functions/Function2
/*    */     //   314: aload #9
/*    */     //   316: aload #9
/*    */     //   318: aload_0
/*    */     //   319: putfield L$0 : Ljava/lang/Object;
/*    */     //   322: aload #9
/*    */     //   324: aload_1
/*    */     //   325: putfield L$1 : Ljava/lang/Object;
/*    */     //   328: aload #9
/*    */     //   330: aload_3
/*    */     //   331: putfield L$2 : Ljava/lang/Object;
/*    */     //   334: aload #9
/*    */     //   336: aload #4
/*    */     //   338: putfield L$3 : Ljava/lang/Object;
/*    */     //   341: aload #9
/*    */     //   343: aload #5
/*    */     //   345: putfield L$4 : Ljava/lang/Object;
/*    */     //   348: aload #9
/*    */     //   350: iconst_2
/*    */     //   351: putfield label : I
/*    */     //   354: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   357: dup
/*    */     //   358: aload #10
/*    */     //   360: if_acmpne -> 421
/*    */     //   363: aload #10
/*    */     //   365: areturn
/*    */     //   366: aload #9
/*    */     //   368: getfield L$4 : Ljava/lang/Object;
/*    */     //   371: checkcast com/intellij/ml/llm/core/chat/context/ChatContextProvider
/*    */     //   374: astore #5
/*    */     //   376: aload #9
/*    */     //   378: getfield L$3 : Ljava/lang/Object;
/*    */     //   381: checkcast java/util/Iterator
/*    */     //   384: astore #4
/*    */     //   386: aload #9
/*    */     //   388: getfield L$2 : Ljava/lang/Object;
/*    */     //   391: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*    */     //   394: astore_3
/*    */     //   395: aload #9
/*    */     //   397: getfield L$1 : Ljava/lang/Object;
/*    */     //   400: checkcast com/intellij/ml/llm/core/chat/session/ChatCreationContext
/*    */     //   403: astore_1
/*    */     //   404: aload #9
/*    */     //   406: getfield L$0 : Ljava/lang/Object;
/*    */     //   409: checkcast com/intellij/openapi/project/Project
/*    */     //   412: astore_0
/*    */     //   413: nop
/*    */     //   414: aload #8
/*    */     //   416: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   419: aload #8
/*    */     //   421: pop
/*    */     //   422: aload #5
/*    */     //   424: aload_3
/*    */     //   425: getfield element : Ljava/lang/Object;
/*    */     //   428: checkcast java/util/List
/*    */     //   431: aload_1
/*    */     //   432: invokeinterface filterItems : (Ljava/util/List;Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;)Ljava/util/List;
/*    */     //   437: astore #7
/*    */     //   439: aload #7
/*    */     //   441: invokestatic isMutableList : (Ljava/lang/Object;)Z
/*    */     //   444: ifeq -> 456
/*    */     //   447: aload_3
/*    */     //   448: aload #7
/*    */     //   450: putfield element : Ljava/lang/Object;
/*    */     //   453: goto -> 135
/*    */     //   456: aload_3
/*    */     //   457: aload #7
/*    */     //   459: checkcast java/util/Collection
/*    */     //   462: invokestatic toMutableList : (Ljava/util/Collection;)Ljava/util/List;
/*    */     //   465: putfield element : Ljava/lang/Object;
/*    */     //   468: goto -> 135
/*    */     //   471: astore #6
/*    */     //   473: ldc com/intellij/ml/llm/core/chat/context/ChatContextProvider
/*    */     //   475: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   478: aload #6
/*    */     //   480: invokevirtual error : (Ljava/lang/Throwable;)V
/*    */     //   483: goto -> 135
/*    */     //   486: aload_3
/*    */     //   487: getfield element : Ljava/lang/Object;
/*    */     //   490: checkcast java/util/List
/*    */     //   493: aload_1
/*    */     //   494: invokevirtual getExtraItems : ()Ljava/util/List;
/*    */     //   497: checkcast java/util/Collection
/*    */     //   500: invokeinterface addAll : (Ljava/util/Collection;)Z
/*    */     //   505: pop
/*    */     //   506: aload_3
/*    */     //   507: getfield element : Ljava/lang/Object;
/*    */     //   510: checkcast java/lang/Iterable
/*    */     //   513: ldc '\\n'
/*    */     //   515: checkcast java/lang/CharSequence
/*    */     //   518: aconst_null
/*    */     //   519: aconst_null
/*    */     //   520: iconst_0
/*    */     //   521: aconst_null
/*    */     //   522: getstatic com/intellij/ml/llm/core/chat/context/UtilsKt$collectChatContext$3.INSTANCE : Lcom/intellij/ml/llm/core/chat/context/UtilsKt$collectChatContext$3;
/*    */     //   525: checkcast kotlin/jvm/functions/Function1
/*    */     //   528: bipush #30
/*    */     //   530: aconst_null
/*    */     //   531: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*    */     //   534: areturn
/*    */     //   535: new java/lang/IllegalStateException
/*    */     //   538: dup
/*    */     //   539: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   541: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   544: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #10	-> 59
/*    */     //   #11	-> 97
/*    */     //   #11	-> 116
/*    */     //   #12	-> 119
/*    */     //   #13	-> 157
/*    */     //   #14	-> 158
/*    */     //   #10	-> 221
/*    */     //   #14	-> 279
/*    */     //   #15	-> 287
/*    */     //   #17	-> 292
/*    */     //   #10	-> 363
/*    */     //   #22	-> 421
/*    */     //   #23	-> 439
/*    */     //   #24	-> 447
/*    */     //   #26	-> 456
/*    */     //   #28	-> 471
/*    */     //   #29	-> 475
/*    */     //   #32	-> 486
/*    */     //   #33	-> 506
/*    */     //   #10	-> 535
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	19	0	project	Lcom/intellij/openapi/project/Project;
/*    */     //   116	108	0	project	Lcom/intellij/openapi/project/Project;
/*    */     //   271	95	0	project	Lcom/intellij/openapi/project/Project;
/*    */     //   413	122	0	project	Lcom/intellij/openapi/project/Project;
/*    */     //   97	19	1	creationContext	Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;
/*    */     //   116	108	1	creationContext	Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;
/*    */     //   262	104	1	creationContext	Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;
/*    */     //   404	131	1	creationContext	Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;
/*    */     //   105	11	3	allItems	Lkotlin/jvm/internal/Ref$ObjectRef;
/*    */     //   116	108	3	allItems	Lkotlin/jvm/internal/Ref$ObjectRef;
/*    */     //   253	113	3	allItems	Lkotlin/jvm/internal/Ref$ObjectRef;
/*    */     //   395	140	3	allItems	Lkotlin/jvm/internal/Ref$ObjectRef;
/*    */     //   157	67	5	chatContextProvider	Lcom/intellij/ml/llm/core/chat/context/ChatContextProvider;
/*    */     //   234	132	5	chatContextProvider	Lcom/intellij/ml/llm/core/chat/context/ChatContextProvider;
/*    */     //   376	63	5	chatContextProvider	Lcom/intellij/ml/llm/core/chat/context/ChatContextProvider;
/*    */     //   287	5	6	applicable	Z
/*    */     //   473	10	6	e	Ljava/lang/Throwable;
/*    */     //   439	17	7	newItems	Ljava/util/List;
/*    */     //   456	12	7	newItems	Ljava/util/List;
/*    */     //   49	486	9	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   56	479	8	$result	Ljava/lang/Object;
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   157	215	471	java/lang/Throwable
/*    */     //   271	357	471	java/lang/Throwable
/*    */     //   413	468	471	java/lang/Throwable } @DebugMetadata(f = "Utils.kt", l = {14, 17}, i = {0, 0, 0, 0, 1, 1, 1, 1}, s = {"L$0", "L$1", "L$2", "L$4", "L$0", "L$1", "L$2", "L$4"}, n = {"project", "creationContext", "allItems", "chatContextProvider", "project", "creationContext", "allItems", "chatContextProvider"}, m = "collectChatContext", c = "com.intellij.ml.llm.core.chat.context.UtilsKt")
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
/*    */   static final class UtilsKt$collectChatContext$1 extends ContinuationImpl { Object L$0; Object L$1; Object L$2; Object L$3; Object L$4; int label; UtilsKt$collectChatContext$1(Continuation $completion) { super($completion); } @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) { this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return UtilsKt.collectChatContext(null, null, (Continuation<? super String>)this); } } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\013\n\002\b\002\020\000\032\0020\001H\n¢\006\004\b\002\020\003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"})
/*    */   static final class UtilsKt$collectChatContext$applicable$1 extends Lambda implements Function0<Boolean> {
/*    */     @NotNull
/* 14 */     public final Boolean invoke() { return Boolean.valueOf(this.$chatContextProvider.isApplicable(this.$project, this.$creationContext)); } UtilsKt$collectChatContext$applicable$1(ChatContextProvider $chatContextProvider, Project $project, ChatCreationContext $creationContext) { super(0); }
/*    */   } @DebugMetadata(f = "Utils.kt", l = {18}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.chat.context.UtilsKt$collectChatContext$2") @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\013\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class UtilsKt$collectChatContext$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
/*    */     int label; UtilsKt$collectChatContext$2(ChatContextProvider $chatContextProvider, Project $project, ChatCreationContext $creationContext, Ref.ObjectRef<List<ChatContextItem>> $allItems, Continuation $completion) { super(2, $completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { List items;
/* 17 */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 18 */           this.label = 1; if (this.$chatContextProvider.collect(this.$project, this.$creationContext, (Continuation<? super List<ChatContextItem>>)this) == object) return object;  items = (List)this.$chatContextProvider.collect(this.$project, this.$creationContext, (Continuation<? super List<ChatContextItem>>)this);
/* 19 */           return Boxing.boxBoolean(((List)this.$allItems.element).addAll(items));case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); items = (List)SYNTHETIC_LOCAL_VARIABLE_1; return Boxing.boxBoolean(((List)this.$allItems.element).addAll(items)); }
/*    */       
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */      @NotNull
/*    */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super UtilsKt$collectChatContext$2> $completion) {
/*    */       return (Continuation<Unit>)new UtilsKt$collectChatContext$2(this.$chatContextProvider, this.$project, this.$creationContext, this.$allItems, $completion);
/*    */     } @Nullable
/*    */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */       return ((UtilsKt$collectChatContext$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     } } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\r\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/ml/llm/core/chat/context/ChatContextItem;", "invoke"})
/*    */   static final class UtilsKt$collectChatContext$3 extends Lambda implements Function1<ChatContextItem, CharSequence> { public static final UtilsKt$collectChatContext$3 INSTANCE = new UtilsKt$collectChatContext$3(); UtilsKt$collectChatContext$3() {
/*    */       super(1);
/*    */     } @NotNull
/*    */     public final CharSequence invoke(@NotNull ChatContextItem it) {
/* 33 */       Intrinsics.checkNotNullParameter(it, "it"); return it.getText();
/*    */     } }
/*    */    }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/context/UtilsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */