/*     */ package com.intellij.ml.llm.core.grazieAPI;
/*     */ 
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.wm.IdeFrame;
/*     */ import com.intellij.openapi.wm.ex.WindowManagerEx;
/*     */ import com.intellij.openapi.wm.impl.IdeFrameImpl;
/*     */ import com.intellij.ui.AppIcon;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @DebugMetadata(f = "GrazieAuthService.kt", l = {250, 255}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.grazieAPI.GrazieAuthService$authenticate$2$ourAsync$1")
/*     */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ final class GrazieAuthService$authenticate$2$ourAsync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */   int label;
/*     */   
/*     */   GrazieAuthService$authenticate$2$ourAsync$1(Project $project, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object invokeSuspend(@NotNull Object $result) {
/*     */     // Byte code:
/*     */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   3: astore_3
/*     */     //   4: aload_0
/*     */     //   5: getfield label : I
/*     */     //   8: tableswitch default -> 410, 0 -> 36, 1 -> 89, 2 -> 184
/*     */     //   36: aload_1
/*     */     //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   40: aload_0
/*     */     //   41: getfield this$0 : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */     //   44: invokestatic access$getMutableAuthState$p : (Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   47: getstatic com/intellij/ml/llm/core/grazieAPI/GrazieAuthState.NoAuth : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;
/*     */     //   50: getstatic com/intellij/ml/llm/core/grazieAPI/GrazieAuthState.InProgress : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;
/*     */     //   53: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   58: ifne -> 65
/*     */     //   61: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   64: areturn
/*     */     //   65: nop
/*     */     //   66: aload_0
/*     */     //   67: getfield this$0 : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */     //   70: aload_0
/*     */     //   71: checkcast kotlin/coroutines/Continuation
/*     */     //   74: aload_0
/*     */     //   75: iconst_1
/*     */     //   76: putfield label : I
/*     */     //   79: invokestatic access$obtainNewToken : (Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   82: dup
/*     */     //   83: aload_3
/*     */     //   84: if_acmpne -> 95
/*     */     //   87: aload_3
/*     */     //   88: areturn
/*     */     //   89: nop
/*     */     //   90: aload_1
/*     */     //   91: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   94: aload_1
/*     */     //   95: checkcast com/intellij/ml/llm/core/grazieAPI/GrazieAuthResult
/*     */     //   98: astore_2
/*     */     //   99: aload_2
/*     */     //   100: instanceof com/intellij/ml/llm/core/grazieAPI/GrazieAuthSuccessResult
/*     */     //   103: ifeq -> 194
/*     */     //   106: getstatic com/intellij/ml/llm/core/models/openai/CredentialsHolder.Companion : Lcom/intellij/ml/llm/core/models/openai/CredentialsHolder$Companion;
/*     */     //   109: invokevirtual getInstance : ()Lcom/intellij/ml/llm/core/models/openai/CredentialsHolder;
/*     */     //   112: aload_2
/*     */     //   113: checkcast com/intellij/ml/llm/core/grazieAPI/GrazieAuthSuccessResult
/*     */     //   116: invokevirtual getToken : ()Ljava/lang/String;
/*     */     //   119: invokevirtual setProxyServerToken : (Ljava/lang/String;)V
/*     */     //   122: aload_0
/*     */     //   123: getfield this$0 : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */     //   126: invokestatic access$getMutableAuthState$p : (Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   129: getstatic com/intellij/ml/llm/core/grazieAPI/GrazieAuthState.Authed : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;
/*     */     //   132: invokeinterface setValue : (Ljava/lang/Object;)V
/*     */     //   137: aload_0
/*     */     //   138: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   141: ifnull -> 253
/*     */     //   144: getstatic kotlinx/coroutines/Dispatchers.INSTANCE : Lkotlinx/coroutines/Dispatchers;
/*     */     //   147: invokestatic getEDT : (Lkotlinx/coroutines/Dispatchers;)Lkotlin/coroutines/CoroutineContext;
/*     */     //   150: new com/intellij/ml/llm/core/grazieAPI/GrazieAuthService$authenticate$2$ourAsync$1$1
/*     */     //   153: dup
/*     */     //   154: aload_0
/*     */     //   155: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   158: aconst_null
/*     */     //   159: invokespecial <init> : (Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)V
/*     */     //   162: checkcast kotlin/jvm/functions/Function2
/*     */     //   165: aload_0
/*     */     //   166: checkcast kotlin/coroutines/Continuation
/*     */     //   169: aload_0
/*     */     //   170: iconst_2
/*     */     //   171: putfield label : I
/*     */     //   174: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   177: dup
/*     */     //   178: aload_3
/*     */     //   179: if_acmpne -> 190
/*     */     //   182: aload_3
/*     */     //   183: areturn
/*     */     //   184: nop
/*     */     //   185: aload_1
/*     */     //   186: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   189: aload_1
/*     */     //   190: pop
/*     */     //   191: goto -> 253
/*     */     //   194: aload_2
/*     */     //   195: instanceof com/intellij/ml/llm/core/grazieAPI/GrazieAuthWaitListResult
/*     */     //   198: ifeq -> 230
/*     */     //   201: getstatic com/intellij/ml/llm/core/models/openai/CredentialsHolder.Companion : Lcom/intellij/ml/llm/core/models/openai/CredentialsHolder$Companion;
/*     */     //   204: invokevirtual getInstance : ()Lcom/intellij/ml/llm/core/models/openai/CredentialsHolder;
/*     */     //   207: ldc 'wait_list'
/*     */     //   209: invokevirtual setProxyServerToken : (Ljava/lang/String;)V
/*     */     //   212: aload_0
/*     */     //   213: getfield this$0 : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */     //   216: invokestatic access$getMutableAuthState$p : (Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   219: getstatic com/intellij/ml/llm/core/grazieAPI/GrazieAuthState.WaitList : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;
/*     */     //   222: invokeinterface setValue : (Ljava/lang/Object;)V
/*     */     //   227: goto -> 253
/*     */     //   230: aload_2
/*     */     //   231: instanceof com/intellij/ml/llm/core/grazieAPI/GrazieAuthFailureResult
/*     */     //   234: ifeq -> 241
/*     */     //   237: iconst_1
/*     */     //   238: goto -> 250
/*     */     //   241: aload_2
/*     */     //   242: ifnonnull -> 249
/*     */     //   245: iconst_1
/*     */     //   246: goto -> 250
/*     */     //   249: iconst_0
/*     */     //   250: ifeq -> 253
/*     */     //   253: aload_0
/*     */     //   254: getfield this$0 : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */     //   257: invokestatic access$getMutableAuthState$p : (Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   260: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   265: getstatic com/intellij/ml/llm/core/grazieAPI/GrazieAuthState.InProgress : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;
/*     */     //   268: if_acmpne -> 286
/*     */     //   271: aload_0
/*     */     //   272: getfield this$0 : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */     //   275: invokestatic access$getMutableAuthState$p : (Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   278: getstatic com/intellij/ml/llm/core/grazieAPI/GrazieAuthState.NoAuth : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;
/*     */     //   281: invokeinterface setValue : (Ljava/lang/Object;)V
/*     */     //   286: goto -> 406
/*     */     //   289: astore_2
/*     */     //   290: aload_0
/*     */     //   291: getfield this$0 : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */     //   294: invokestatic access$getMutableAuthState$p : (Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   297: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   302: getstatic com/intellij/ml/llm/core/grazieAPI/GrazieAuthState.InProgress : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;
/*     */     //   305: if_acmpne -> 323
/*     */     //   308: aload_0
/*     */     //   309: getfield this$0 : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */     //   312: invokestatic access$getMutableAuthState$p : (Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   315: getstatic com/intellij/ml/llm/core/grazieAPI/GrazieAuthState.NoAuth : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;
/*     */     //   318: invokeinterface setValue : (Ljava/lang/Object;)V
/*     */     //   323: goto -> 406
/*     */     //   326: astore_2
/*     */     //   327: invokestatic access$getLogger$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   330: aload_2
/*     */     //   331: invokevirtual warn : (Ljava/lang/Throwable;)V
/*     */     //   334: aload_0
/*     */     //   335: getfield this$0 : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */     //   338: invokestatic access$getMutableAuthState$p : (Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   341: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   346: getstatic com/intellij/ml/llm/core/grazieAPI/GrazieAuthState.InProgress : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;
/*     */     //   349: if_acmpne -> 367
/*     */     //   352: aload_0
/*     */     //   353: getfield this$0 : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */     //   356: invokestatic access$getMutableAuthState$p : (Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   359: getstatic com/intellij/ml/llm/core/grazieAPI/GrazieAuthState.NoAuth : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;
/*     */     //   362: invokeinterface setValue : (Ljava/lang/Object;)V
/*     */     //   367: goto -> 406
/*     */     //   370: astore_2
/*     */     //   371: aload_0
/*     */     //   372: getfield this$0 : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */     //   375: invokestatic access$getMutableAuthState$p : (Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   378: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   383: getstatic com/intellij/ml/llm/core/grazieAPI/GrazieAuthState.InProgress : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;
/*     */     //   386: if_acmpne -> 404
/*     */     //   389: aload_0
/*     */     //   390: getfield this$0 : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */     //   393: invokestatic access$getMutableAuthState$p : (Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   396: getstatic com/intellij/ml/llm/core/grazieAPI/GrazieAuthState.NoAuth : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;
/*     */     //   399: invokeinterface setValue : (Ljava/lang/Object;)V
/*     */     //   404: aload_2
/*     */     //   405: athrow
/*     */     //   406: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   409: areturn
/*     */     //   410: new java/lang/IllegalStateException
/*     */     //   413: dup
/*     */     //   414: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   416: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   419: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #247	-> 3
/*     */     //   #248	-> 40
/*     */     //   #249	-> 65
/*     */     //   #250	-> 66
/*     */     //   #247	-> 87
/*     */     //   #251	-> 99
/*     */     //   #252	-> 106
/*     */     //   #253	-> 122
/*     */     //   #254	-> 137
/*     */     //   #255	-> 144
/*     */     //   #247	-> 182
/*     */     //   #255	-> 190
/*     */     //   #260	-> 194
/*     */     //   #261	-> 201
/*     */     //   #262	-> 212
/*     */     //   #264	-> 230
/*     */     //   #276	-> 253
/*     */     //   #277	-> 271
/*     */     //   #279	-> 286
/*     */     //   #269	-> 289
/*     */     //   #276	-> 290
/*     */     //   #277	-> 308
/*     */     //   #279	-> 323
/*     */     //   #272	-> 326
/*     */     //   #273	-> 327
/*     */     //   #276	-> 334
/*     */     //   #277	-> 352
/*     */     //   #279	-> 367
/*     */     //   #276	-> 370
/*     */     //   #277	-> 389
/*     */     //   #280	-> 406
/*     */     //   #247	-> 410
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   99	23	2	result	Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthResult;
/*     */     //   194	7	2	result	Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthResult;
/*     */     //   230	11	2	result	Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthResult;
/*     */     //   241	8	2	result	Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthResult;
/*     */     //   327	7	2	t	Ljava/lang/Throwable;
/*     */     //   40	370	0	this	Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService$authenticate$2$ourAsync$1;
/*     */     //   40	370	1	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   65	82	289	java/util/concurrent/CancellationException
/*     */     //   65	82	326	java/lang/Throwable
/*     */     //   65	82	370	finally
/*     */     //   89	177	289	java/util/concurrent/CancellationException
/*     */     //   89	177	326	java/lang/Throwable
/*     */     //   89	177	370	finally
/*     */     //   184	253	289	java/util/concurrent/CancellationException
/*     */     //   184	253	326	java/lang/Throwable
/*     */     //   184	253	370	finally
/*     */     //   289	290	370	finally
/*     */     //   326	334	370	finally
/*     */     //   370	371	370	finally
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super GrazieAuthService$authenticate$2$ourAsync$1> $completion) {
/*     */     return (Continuation<Unit>)new GrazieAuthService$authenticate$2$ourAsync$1(this.$project, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */     return ((GrazieAuthService$authenticate$2$ourAsync$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/grazieAPI/GrazieAuthService$authenticate$2$ourAsync$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */