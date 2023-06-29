/*    */ package com.intellij.ml.llm.python.context;
/*    */ import com.intellij.ml.llm.core.chat.context.ChatContextItem;
/*    */ import com.intellij.ml.llm.core.chat.session.ChatCreationContext;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000\030\0002\0020\001B\005¢\006\002\020\002J'\020\003\032\b\022\004\022\0020\0050\0042\006\020\006\032\0020\0072\006\020\b\032\0020\tH@ø\001\000¢\006\002\020\nJ\030\020\013\032\0020\f2\006\020\006\032\0020\0072\006\020\b\032\0020\tH\026\002\004\n\002\b\031¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/python/context/PyBaseChatContextProvider;", "Lcom/intellij/ml/llm/core/chat/context/ChatContextProvider;", "()V", "collect", "", "Lcom/intellij/ml/llm/core/chat/context/ChatContextItem;", "project", "Lcom/intellij/openapi/project/Project;", "creationContext", "Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isApplicable", "", "intellij.ml.llm.python"})
/*    */ @SourceDebugExtension({"SMAP\nPyBaseChatContextProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PyBaseChatContextProvider.kt\ncom/intellij/ml/llm/python/context/PyBaseChatContextProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,30:1\n1549#2:31\n1620#2,3:32\n*S KotlinDebug\n*F\n+ 1 PyBaseChatContextProvider.kt\ncom/intellij/ml/llm/python/context/PyBaseChatContextProvider\n*L\n25#1:31\n25#1:32,3\n*E\n"})
/*    */ public final class PyBaseChatContextProvider implements ChatContextProvider {
/*    */   public boolean isApplicable(@NotNull Project project, @NotNull ChatCreationContext creationContext) {
/* 12 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(creationContext, "creationContext"); return true;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object collect(@NotNull Project project, @NotNull ChatCreationContext paramChatCreationContext, @NotNull Continuation<? super List<ChatContextItem>> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/python/context/PyBaseChatContextProvider$collect$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/python/context/PyBaseChatContextProvider$collect$1
/*    */     //   11: astore #21
/*    */     //   13: aload #21
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #21
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/python/context/PyBaseChatContextProvider$collect$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/python/context/PyBaseChatContextProvider;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #21
/*    */     //   50: aload #21
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #20
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #22
/*    */     //   62: aload #21
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 383, 0 -> 88, 1 -> 186
/*    */     //   88: aload #20
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: aload_1
/*    */     //   94: invokestatic getPythonSdk : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/projectRoots/Sdk;
/*    */     //   97: dup
/*    */     //   98: ifnonnull -> 106
/*    */     //   101: pop
/*    */     //   102: invokestatic emptyList : ()Ljava/util/List;
/*    */     //   105: areturn
/*    */     //   106: astore #4
/*    */     //   108: aload #4
/*    */     //   110: invokeinterface getVersionString : ()Ljava/lang/String;
/*    */     //   115: astore #5
/*    */     //   117: aload #5
/*    */     //   119: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   124: astore #6
/*    */     //   126: getstatic com/jetbrains/python/packaging/management/PythonPackageManager.Companion : Lcom/jetbrains/python/packaging/management/PythonPackageManager$Companion;
/*    */     //   129: aload_1
/*    */     //   130: aload #4
/*    */     //   132: invokevirtual forSdk : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/projectRoots/Sdk;)Lcom/jetbrains/python/packaging/management/PythonPackageManager;
/*    */     //   135: astore #7
/*    */     //   137: aload #7
/*    */     //   139: invokevirtual getInstalledPackages : ()Ljava/util/List;
/*    */     //   142: invokeinterface isEmpty : ()Z
/*    */     //   147: ifeq -> 220
/*    */     //   150: aload #7
/*    */     //   152: aload #21
/*    */     //   154: aload #21
/*    */     //   156: aload #6
/*    */     //   158: putfield L$0 : Ljava/lang/Object;
/*    */     //   161: aload #21
/*    */     //   163: aload #7
/*    */     //   165: putfield L$1 : Ljava/lang/Object;
/*    */     //   168: aload #21
/*    */     //   170: iconst_1
/*    */     //   171: putfield label : I
/*    */     //   174: invokevirtual reloadPackages-IoAF18A : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   177: dup
/*    */     //   178: aload #22
/*    */     //   180: if_acmpne -> 219
/*    */     //   183: aload #22
/*    */     //   185: areturn
/*    */     //   186: aload #21
/*    */     //   188: getfield L$1 : Ljava/lang/Object;
/*    */     //   191: checkcast com/jetbrains/python/packaging/management/PythonPackageManager
/*    */     //   194: astore #7
/*    */     //   196: aload #21
/*    */     //   198: getfield L$0 : Ljava/lang/Object;
/*    */     //   201: checkcast java/lang/String
/*    */     //   204: astore #6
/*    */     //   206: aload #20
/*    */     //   208: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   211: aload #20
/*    */     //   213: checkcast kotlin/Result
/*    */     //   216: invokevirtual unbox-impl : ()Ljava/lang/Object;
/*    */     //   219: pop
/*    */     //   220: aload #7
/*    */     //   222: invokevirtual getInstalledPackages : ()Ljava/util/List;
/*    */     //   225: astore #8
/*    */     //   227: aload #8
/*    */     //   229: checkcast java/lang/Iterable
/*    */     //   232: astore #10
/*    */     //   234: iconst_0
/*    */     //   235: istore #11
/*    */     //   237: aload #10
/*    */     //   239: astore #12
/*    */     //   241: new java/util/ArrayList
/*    */     //   244: dup
/*    */     //   245: aload #10
/*    */     //   247: bipush #10
/*    */     //   249: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*    */     //   252: invokespecial <init> : (I)V
/*    */     //   255: checkcast java/util/Collection
/*    */     //   258: astore #13
/*    */     //   260: iconst_0
/*    */     //   261: istore #14
/*    */     //   263: aload #12
/*    */     //   265: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   270: astore #15
/*    */     //   272: aload #15
/*    */     //   274: invokeinterface hasNext : ()Z
/*    */     //   279: ifeq -> 322
/*    */     //   282: aload #15
/*    */     //   284: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   289: astore #16
/*    */     //   291: aload #13
/*    */     //   293: aload #16
/*    */     //   295: checkcast com/jetbrains/python/packaging/common/PythonPackage
/*    */     //   298: astore #17
/*    */     //   300: astore #19
/*    */     //   302: iconst_0
/*    */     //   303: istore #18
/*    */     //   305: aload #17
/*    */     //   307: invokevirtual getName : ()Ljava/lang/String;
/*    */     //   310: aload #19
/*    */     //   312: swap
/*    */     //   313: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   318: pop
/*    */     //   319: goto -> 272
/*    */     //   322: aload #13
/*    */     //   324: checkcast java/util/List
/*    */     //   327: nop
/*    */     //   328: <illegal opcode> makeConcatWithConstants : (Ljava/util/List;)Ljava/lang/String;
/*    */     //   333: astore #9
/*    */     //   335: iconst_2
/*    */     //   336: anewarray com/intellij/ml/llm/core/chat/context/ChatContextItem
/*    */     //   339: astore #10
/*    */     //   341: aload #10
/*    */     //   343: iconst_0
/*    */     //   344: new com/intellij/ml/llm/core/chat/context/ChatContextItem
/*    */     //   347: dup
/*    */     //   348: ldc com/intellij/ml/llm/python/context/PyBaseChatContextProvider
/*    */     //   350: invokestatic getOrCreateKotlinClass : (Ljava/lang/Class;)Lkotlin/reflect/KClass;
/*    */     //   353: aload #6
/*    */     //   355: invokespecial <init> : (Lkotlin/reflect/KClass;Ljava/lang/String;)V
/*    */     //   358: aastore
/*    */     //   359: aload #10
/*    */     //   361: iconst_1
/*    */     //   362: new com/intellij/ml/llm/core/chat/context/ChatContextItem
/*    */     //   365: dup
/*    */     //   366: ldc com/intellij/ml/llm/python/context/PyBaseChatContextProvider
/*    */     //   368: invokestatic getOrCreateKotlinClass : (Ljava/lang/Class;)Lkotlin/reflect/KClass;
/*    */     //   371: aload #9
/*    */     //   373: invokespecial <init> : (Lkotlin/reflect/KClass;Ljava/lang/String;)V
/*    */     //   376: aastore
/*    */     //   377: aload #10
/*    */     //   379: invokestatic listOf : ([Ljava/lang/Object;)Ljava/util/List;
/*    */     //   382: areturn
/*    */     //   383: new java/lang/IllegalStateException
/*    */     //   386: dup
/*    */     //   387: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   389: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   392: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #15	-> 60
/*    */     //   #16	-> 93
/*    */     //   #17	-> 108
/*    */     //   #18	-> 117
/*    */     //   #20	-> 126
/*    */     //   #21	-> 137
/*    */     //   #22	-> 150
/*    */     //   #15	-> 183
/*    */     //   #22	-> 219
/*    */     //   #24	-> 220
/*    */     //   #25	-> 227
/*    */     //   #31	-> 237
/*    */     //   #32	-> 263
/*    */     //   #33	-> 291
/*    */     //   #25	-> 305
/*    */     //   #33	-> 313
/*    */     //   #34	-> 322
/*    */     //   #31	-> 327
/*    */     //   #25	-> 333
/*    */     //   #27	-> 335
/*    */     //   #28	-> 362
/*    */     //   #27	-> 377
/*    */     //   #15	-> 383
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	8	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   106	31	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   108	29	4	pythonSdk	Lcom/intellij/openapi/projectRoots/Sdk;
/*    */     //   117	9	5	pythonVersion	Ljava/lang/String;
/*    */     //   126	60	6	languageInfo	Ljava/lang/String;
/*    */     //   206	177	6	languageInfo	Ljava/lang/String;
/*    */     //   137	49	7	manager	Lcom/jetbrains/python/packaging/management/PythonPackageManager;
/*    */     //   196	31	7	manager	Lcom/jetbrains/python/packaging/management/PythonPackageManager;
/*    */     //   227	7	8	packages	Ljava/util/List;
/*    */     //   335	48	9	packagesInfo	Ljava/lang/String;
/*    */     //   234	26	10	$this$map$iv	Ljava/lang/Iterable;
/*    */     //   260	12	12	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*    */     //   260	64	13	destination$iv$iv	Ljava/util/Collection;
/*    */     //   291	28	16	item$iv$iv	Ljava/lang/Object;
/*    */     //   302	8	17	it	Lcom/jetbrains/python/packaging/common/PythonPackage;
/*    */     //   305	5	18	$i$a$-map-PyBaseChatContextProvider$collect$packagesInfo$1	I
/*    */     //   263	61	14	$i$f$mapTo	I
/*    */     //   237	91	11	$i$f$map	I
/*    */     //   50	333	21	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	326	20	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "PyBaseChatContextProvider.kt", l = {22}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"languageInfo", "manager"}, m = "collect", c = "com.intellij.ml.llm.python.context.PyBaseChatContextProvider")
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
/*    */   static final class PyBaseChatContextProvider$collect$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     PyBaseChatContextProvider$collect$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return PyBaseChatContextProvider.this.collect(null, null, (Continuation<? super List<ChatContextItem>>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/python/context/PyBaseChatContextProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */