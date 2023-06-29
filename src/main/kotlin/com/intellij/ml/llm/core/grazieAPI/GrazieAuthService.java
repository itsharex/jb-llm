/*     */ package com.intellij.ml.llm.core.grazieAPI;
/*     */ import ai.grazie.api.gateway.client.SuspendableAPIGatewayClient;
/*     */ import com.intellij.ml.llm.LLMBundle;
/*     */ import com.intellij.ml.llm.core.models.openai.CredentialsHolder;
/*     */ import com.intellij.openapi.progress.TasksKt;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.wm.impl.IdeFrameImpl;
/*     */ import com.intellij.util.ApplicationKt;
/*     */ import java.util.Locale;
/*     */ import kotlin.KotlinNothingValueException;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.CoroutineContext;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.CoroutineScopeKt;
/*     */ import kotlinx.coroutines.Deferred;
/*     */ import kotlinx.coroutines.Dispatchers;
/*     */ import kotlinx.coroutines.Job;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
/*     */ import kotlinx.coroutines.flow.MutableStateFlow;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Service({Service.Level.APP})
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000X\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\002\b\004\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\b\b\007\030\000 &2\0020\001:\001&B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\020\020\024\032\0020\0252\006\020\026\032\0020\027H\002J\033\020\030\032\0020\0252\b\020\026\032\004\030\0010\027H@ø\001\000¢\006\002\020\031J\006\020\032\032\0020\025J\022\020\033\032\004\030\0010\0342\b\020\026\032\004\030\0010\027J\006\020\035\032\0020\025J\023\020\036\032\004\030\0010\037H@ø\001\000¢\006\002\020 J\021\020!\032\0020\017H@ø\001\000¢\006\002\020 J\b\020\"\032\0020\025H\002J\017\020#\032\004\030\0010\034H\000¢\006\002\b$J\016\020%\032\0020\t2\006\020\026\032\0020\027R\020\020\005\032\004\030\0010\006X\016¢\006\002\n\000R\027\020\007\032\b\022\004\022\0020\t0\b¢\006\b\n\000\032\004\b\n\020\013R\016\020\f\032\0020\rX\004¢\006\002\n\000R\021\020\016\032\0020\0178F¢\006\006\032\004\b\016\020\020R\024\020\021\032\b\022\004\022\0020\t0\022X\004¢\006\002\n\000R\020\020\023\032\004\030\0010\006X\016¢\006\002\n\000R\016\020\002\032\0020\003X\004¢\006\002\n\000\002\004\n\002\b\031¨\006'"}, d2 = {"Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "authJob", "Lkotlinx/coroutines/Job;", "authState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;", "getAuthState", "()Lkotlinx/coroutines/flow/StateFlow;", "grazieAuthNotification", "Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthNotification;", "isAuthenticated", "", "()Z", "mutableAuthState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "refreshJob", "askAuthentication", "", "project", "Lcom/intellij/openapi/project/Project;", "authenticate", "(Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "checkGrazieAuthToken", "", "logout", "obtainNewToken", "Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshToken", "startOrInvalidateAuthRefresher", "tryGetProxyServerToken", "tryGetProxyServerToken$intellij_ml_llm", "waitAndGetAuthStatus", "Companion", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nGrazieAuthService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrazieAuthService.kt\ncom/intellij/ml/llm/core/grazieAPI/GrazieAuthService\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,333:1\n12#2,5:334\n*S KotlinDebug\n*F\n+ 1 GrazieAuthService.kt\ncom/intellij/ml/llm/core/grazieAPI/GrazieAuthService\n*L\n319#1:334,5\n*E\n"})
/*     */ public final class GrazieAuthService {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final CoroutineScope scope;
/*     */   @NotNull
/*     */   private final GrazieAuthNotification grazieAuthNotification;
/*     */   @NotNull
/*     */   private final MutableStateFlow<GrazieAuthState> mutableAuthState;
/*     */   
/*     */   public GrazieAuthService(@NotNull CoroutineScope scope) {
/*  47 */     this.scope = scope;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  53 */     this.grazieAuthNotification = new GrazieAuthNotification();
/*  54 */     this.mutableAuthState = StateFlowKt.MutableStateFlow(GrazieAuthState.Unknown);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  60 */     this.authState = FlowKt.asStateFlow(this.mutableAuthState);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  68 */     BuildersKt.launch$default(this.scope, null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*  69 */                 this.label = 1; if (GrazieAuthService.this.getAuthState().collect(new FlowCollector() { @Nullable
/*  70 */                       public final Object emit(@NotNull GrazieAuthState it, @NotNull Continuation $completion) { GrazieAuthService.this.startOrInvalidateAuthRefresher();
/*  71 */                         return Unit.INSTANCE; } }, (Continuation)this) == object) return object;  GrazieAuthService.this.getAuthState().collect(new FlowCollector() { @Nullable public final Object emit(@NotNull GrazieAuthState it, @NotNull Continuation $completion) { GrazieAuthService.this.startOrInvalidateAuthRefresher(); return Unit.INSTANCE; } }, (Continuation)this); throw new KotlinNothingValueException();
/*     */               case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); throw new KotlinNothingValueException(); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */           @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(GrazieAuthService.this, $completion); }
/*  74 */           @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }3, null); BuildersKt.launch$default(this.scope, null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { String authToken, str1; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*  75 */                 if (ApplicationKt.getApplication().isHeadlessEnvironment()) {
/*  76 */                   GrazieAuthService.this.mutableAuthState.setValue(GrazieAuthState.NoAuth);
/*  77 */                   return Unit.INSTANCE;
/*     */                 } 
/*     */                 try {
/*  80 */                   str1 = CredentialsHolder.Companion.getInstance().getProxyServerToken();
/*     */                 }
/*  82 */                 catch (Throwable t) {
/*  83 */                   GrazieAuthServiceKt.access$getLogger$p().warn(t);
/*  84 */                   str1 = null;
/*     */                 } 
/*     */                 authToken = str1;
/*  87 */                 Intrinsics.checkNotNullExpressionValue(authToken.toLowerCase(Locale.ROOT), "this as java.lang.String).toLowerCase(Locale.ROOT)"); GrazieAuthService.this.mutableAuthState.setValue((authToken != null && Intrinsics.areEqual(authToken.toLowerCase(Locale.ROOT), "wait_list")) ? GrazieAuthState.WaitList : (
/*  88 */                     (authToken != null) ? GrazieAuthState.Authed : 
/*  89 */                     GrazieAuthState.NoAuth));
/*     */                 
/*  91 */                 this.label = 1; if (GrazieAuthService.this.refreshToken((Continuation)this) == object) return object;  GrazieAuthService.this.refreshToken((Continuation)this);
/*  92 */                 return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*     */             
/*     */             throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           @NotNull
/*     */           public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*     */             return (Continuation)new Function2<>(GrazieAuthService.this, $completion);
/*     */           }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           @Nullable
/*     */           public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */             return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */           } }
/*     */         3, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private final StateFlow<GrazieAuthState> authState;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   private Job authJob;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   private Job refreshJob;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final String WAIT_LIST = "wait_list";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\006\020\005\032\0020\006R\016\020\003\032\0020\004XT¢\006\002\n\000¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService$Companion;", "", "()V", "WAIT_LIST", "", "getInstance", "Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;", "intellij.ml.llm"})
/*     */   @SourceDebugExtension({"SMAP\nGrazieAuthService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrazieAuthService.kt\ncom/intellij/ml/llm/core/grazieAPI/GrazieAuthService$Companion\n+ 2 service.kt\ncom/intellij/openapi/components/ServiceKt\n*L\n1#1,333:1\n43#2,3:334\n*S KotlinDebug\n*F\n+ 1 GrazieAuthService.kt\ncom/intellij/ml/llm/core/grazieAPI/GrazieAuthService$Companion\n*L\n50#1:334,3\n*E\n"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final GrazieAuthService getInstance() {
/*     */       int $i$f$service = 0;
/* 334 */       Class<GrazieAuthService> serviceClass$iv = GrazieAuthService.class;
/* 335 */       Object object = ApplicationManager.getApplication().getService(serviceClass$iv); if (object == null)
/* 336 */         throw new RuntimeException("Cannot find service " + serviceClass$iv.getName() + " (classloader=" + serviceClass$iv.getClassLoader() + ", client=" + ClientId.Companion.getCurrentOrNull() + ")"); 
/*     */       return (GrazieAuthService)object;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final StateFlow<GrazieAuthState> getAuthState() {
/*     */     return this.authState;
/*     */   }
/*     */   
/*     */   public final boolean isAuthenticated() {
/*     */     return GrazieAuthServiceKt.isAuthenticated((GrazieAuthState)this.authState.getValue());
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final GrazieAuthState waitAndGetAuthStatus(@NotNull Project project) {
/*     */     Intrinsics.checkNotNullParameter(project, "project");
/*     */     if (this.authState.getValue() != GrazieAuthState.Unknown)
/*     */       return (GrazieAuthState)this.authState.getValue(); 
/*     */     TasksKt.runWithModalProgressBlocking(project, "Checking AI Assistant auth...", new GrazieAuthService$waitAndGetAuthStatus$1(null));
/*     */     return (GrazieAuthState)this.authState.getValue();
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "GrazieAuthService.kt", l = {99}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.grazieAPI.GrazieAuthService$waitAndGetAuthStatus$1")
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class GrazieAuthService$waitAndGetAuthStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     GrazieAuthService$waitAndGetAuthStatus$1(Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore_2
/*     */       //   4: aload_0
/*     */       //   5: getfield label : I
/*     */       //   8: tableswitch default -> 89, 0 -> 32, 1 -> 76
/*     */       //   32: aload_1
/*     */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   36: aload_0
/*     */       //   37: getfield this$0 : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */       //   40: invokevirtual getAuthState : ()Lkotlinx/coroutines/flow/StateFlow;
/*     */       //   43: invokeinterface getValue : ()Ljava/lang/Object;
/*     */       //   48: getstatic com/intellij/ml/llm/core/grazieAPI/GrazieAuthState.Unknown : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;
/*     */       //   51: if_acmpne -> 85
/*     */       //   54: ldc2_w 100
/*     */       //   57: aload_0
/*     */       //   58: checkcast kotlin/coroutines/Continuation
/*     */       //   61: aload_0
/*     */       //   62: iconst_1
/*     */       //   63: putfield label : I
/*     */       //   66: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   69: dup
/*     */       //   70: aload_2
/*     */       //   71: if_acmpne -> 81
/*     */       //   74: aload_2
/*     */       //   75: areturn
/*     */       //   76: aload_1
/*     */       //   77: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   80: aload_1
/*     */       //   81: pop
/*     */       //   82: goto -> 36
/*     */       //   85: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   88: areturn
/*     */       //   89: new java/lang/IllegalStateException
/*     */       //   92: dup
/*     */       //   93: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   95: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   98: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #97	-> 3
/*     */       //   #98	-> 36
/*     */       //   #99	-> 54
/*     */       //   #97	-> 74
/*     */       //   #99	-> 81
/*     */       //   #101	-> 85
/*     */       //   #97	-> 89
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   36	53	0	this	Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService$waitAndGetAuthStatus$1;
/*     */       //   36	53	1	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super GrazieAuthService$waitAndGetAuthStatus$1> $completion) {
/*     */       return (Continuation<Unit>)new GrazieAuthService$waitAndGetAuthStatus$1($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */       return ((GrazieAuthService$waitAndGetAuthStatus$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String checkGrazieAuthToken(@Nullable Project project) {
/*     */     String str1;
/*     */     if (this.authState.getValue() == GrazieAuthState.InProgress)
/*     */       return null; 
/*     */     String proxyServerToken = tryGetProxyServerToken$intellij_ml_llm();
/*     */     if (proxyServerToken != null && (new JWTToken(proxyServerToken)).getExpiration().after(Timestamp.Companion.now())) {
/*     */       this.mutableAuthState.setValue(GrazieAuthState.Authed);
/*     */       return proxyServerToken;
/*     */     } 
/*     */     this.mutableAuthState.setValue(GrazieAuthState.NoAuth);
/*     */     if (project != null) {
/*     */       askAuthentication(project);
/*     */     } else {
/*     */       return null;
/*     */     } 
/*     */     try {
/*     */       str1 = CredentialsHolder.Companion.getInstance().getProxyServerToken();
/*     */     } catch (Throwable t) {
/*     */       GrazieAuthServiceKt.access$getLogger$p().warn(t);
/*     */       str1 = null;
/*     */     } 
/*     */     return str1;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String tryGetProxyServerToken$intellij_ml_llm() {
/*     */     String str1;
/*     */     try {
/*     */       str1 = CredentialsHolder.Companion.getInstance().getProxyServerToken();
/*     */     } catch (Throwable t) {
/*     */       str1 = null;
/*     */     } 
/*     */     String proxyServerToken = str1;
/*     */     return proxyServerToken;
/*     */   }
/*     */   
/*     */   private final void askAuthentication(Project project) {
/*     */     this.grazieAuthNotification.showNotification(new GrazieAuthService$askAuthentication$1(project));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*     */   static final class GrazieAuthService$askAuthentication$1 extends Lambda implements Function0<Unit> {
/*     */     public final void invoke() {
/*     */       BuildersKt.launch$default(GrazieAuthService.this.scope, null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(GrazieAuthService.this, null) {
/*     */             int label;
/*     */             
/*     */             @Nullable
/*     */             public final Object invokeSuspend(@NotNull Object $result) {
/*     */               Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */               switch (this.label) {
/*     */                 case 0:
/*     */                   ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                   this.label = 1;
/*     */                   if (TasksKt.withBackgroundProgress(this.$project, LLMBundle.message("progress.title.logging.into.grazie.service", new Object[0]), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$project, null) {
/*     */                         int label;
/*     */                         
/*     */                         @Nullable
/*     */                         public final Object invokeSuspend(@NotNull Object $result) {
/*     */                           Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                           switch (this.label) {
/*     */                             case 0:
/*     */                               ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                               this.label = 1;
/*     */                               if (GrazieAuthService.this.authenticate(this.$project, (Continuation<? super Unit>)this) == object)
/*     */                                 return object; 
/*     */                               GrazieAuthService.this.authenticate(this.$project, (Continuation<? super Unit>)this);
/*     */                               return Unit.INSTANCE;
/*     */                             case 1:
/*     */                               ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                               return Unit.INSTANCE;
/*     */                           } 
/*     */                           throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */                         }
/*     */                         
/*     */                         @NotNull
/*     */                         public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*     */                           return (Continuation)new Function2<>(GrazieAuthService.this, this.$project, $completion);
/*     */                         }
/*     */                         
/*     */                         @Nullable
/*     */                         public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */                           return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                         }
/*     */                       }(Continuation)this) == object)
/*     */                     return object; 
/*     */                   TasksKt.withBackgroundProgress(this.$project, LLMBundle.message("progress.title.logging.into.grazie.service", new Object[0]), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$project, null) {
/*     */                         int label;
/*     */                         
/*     */                         @Nullable
/*     */                         public final Object invokeSuspend(@NotNull Object $result) {
/*     */                           Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                           switch (this.label) {
/*     */                             case 0:
/*     */                               ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                               this.label = 1;
/*     */                               if (GrazieAuthService.this.authenticate(this.$project, (Continuation<? super Unit>)this) == object)
/*     */                                 return object; 
/*     */                               GrazieAuthService.this.authenticate(this.$project, (Continuation<? super Unit>)this);
/*     */                               return Unit.INSTANCE;
/*     */                             case 1:
/*     */                               ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                               return Unit.INSTANCE;
/*     */                           } 
/*     */                           throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */                         }
/*     */                         
/*     */                         @NotNull
/*     */                         public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*     */                           return (Continuation)new Function2<>(GrazieAuthService.this, this.$project, $completion);
/*     */                         }
/*     */                         
/*     */                         @Nullable
/*     */                         public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */                           return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                         }
/*     */                       }(Continuation)this);
/*     */                   return Unit.INSTANCE;
/*     */                 case 1:
/*     */                   ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                   return Unit.INSTANCE;
/*     */               } 
/*     */               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */             }
/*     */             
/*     */             @NotNull
/*     */             public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*     */               return (Continuation)new Function2<>(this.$project, GrazieAuthService.this, $completion);
/*     */             }
/*     */             
/*     */             @Nullable
/*     */             public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */               return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */             }
/*     */           }3, null);
/*     */     }
/*     */     
/*     */     GrazieAuthService$askAuthentication$1(Project $project) {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */   
/*     */   private final void startOrInvalidateAuthRefresher() {
/*     */     if (ApplicationKt.getApplication().isHeadlessEnvironment())
/*     */       return; 
/*     */     if (!isAuthenticated()) {
/*     */       if (this.refreshJob != null) {
/*     */         Job.DefaultImpls.cancel$default(this.refreshJob, null, 1, null);
/*     */       } else {
/*     */       
/*     */       } 
/*     */       this.refreshJob = null;
/*     */       return;
/*     */     } 
/*     */     if (this.refreshJob != null) {
/*     */       GrazieAuthServiceKt.access$getLogger$p().warn("Refresh job is already running");
/*     */       return;
/*     */     } 
/*     */     GrazieAuthServiceKt.access$getLogger$p().info("Starting auth refresher loop");
/*     */     this.refreshJob = (Job)BuildersKt.async$default(this.scope, null, null, new GrazieAuthService$startOrInvalidateAuthRefresher$1(null), 3, null);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "GrazieAuthService.kt", l = {169}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.grazieAPI.GrazieAuthService$startOrInvalidateAuthRefresher$1")
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class GrazieAuthService$startOrInvalidateAuthRefresher$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     GrazieAuthService$startOrInvalidateAuthRefresher$1(Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (BuildersKt.withContext((CoroutineContext)Dispatchers.getIO(), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) {
/*     */                 int label;
/*     */                 
/*     */                 @Nullable
/*     */                 public final Object invokeSuspend(@NotNull Object $result) {
/*     */                   // Byte code:
/*     */                   //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                   //   3: astore_3
/*     */                   //   4: aload_0
/*     */                   //   5: getfield label : I
/*     */                   //   8: tableswitch default -> 144, 0 -> 36, 1 -> 87, 2 -> 117
/*     */                   //   36: aload_1
/*     */                   //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   40: aload_0
/*     */                   //   41: getfield this$0 : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */                   //   44: invokevirtual isAuthenticated : ()Z
/*     */                   //   47: ifeq -> 140
/*     */                   //   50: getstatic kotlin/time/Duration.Companion : Lkotlin/time/Duration$Companion;
/*     */                   //   53: pop
/*     */                   //   54: getstatic kotlin/random/Random.Default : Lkotlin/random/Random$Default;
/*     */                   //   57: iconst_2
/*     */                   //   58: iconst_4
/*     */                   //   59: invokevirtual nextInt : (II)I
/*     */                   //   62: getstatic kotlin/time/DurationUnit.HOURS : Lkotlin/time/DurationUnit;
/*     */                   //   65: invokestatic toDuration : (ILkotlin/time/DurationUnit;)J
/*     */                   //   68: aload_0
/*     */                   //   69: checkcast kotlin/coroutines/Continuation
/*     */                   //   72: aload_0
/*     */                   //   73: iconst_1
/*     */                   //   74: putfield label : I
/*     */                   //   77: invokestatic delay-VtjQ1oo : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                   //   80: dup
/*     */                   //   81: aload_3
/*     */                   //   82: if_acmpne -> 92
/*     */                   //   85: aload_3
/*     */                   //   86: areturn
/*     */                   //   87: aload_1
/*     */                   //   88: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   91: aload_1
/*     */                   //   92: pop
/*     */                   //   93: nop
/*     */                   //   94: aload_0
/*     */                   //   95: getfield this$0 : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */                   //   98: aload_0
/*     */                   //   99: checkcast kotlin/coroutines/Continuation
/*     */                   //   102: aload_0
/*     */                   //   103: iconst_2
/*     */                   //   104: putfield label : I
/*     */                   //   107: invokestatic access$refreshToken : (Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                   //   110: dup
/*     */                   //   111: aload_3
/*     */                   //   112: if_acmpne -> 123
/*     */                   //   115: aload_3
/*     */                   //   116: areturn
/*     */                   //   117: nop
/*     */                   //   118: aload_1
/*     */                   //   119: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   122: aload_1
/*     */                   //   123: pop
/*     */                   //   124: goto -> 40
/*     */                   //   127: astore_2
/*     */                   //   128: invokestatic access$getLogger$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */                   //   131: ldc 'Could not refresh token'
/*     */                   //   133: aload_2
/*     */                   //   134: invokevirtual warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */                   //   137: goto -> 40
/*     */                   //   140: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */                   //   143: areturn
/*     */                   //   144: new java/lang/IllegalStateException
/*     */                   //   147: dup
/*     */                   //   148: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                   //   150: invokespecial <init> : (Ljava/lang/String;)V
/*     */                   //   153: athrow
/*     */                   // Line number table:
/*     */                   //   Java source line number -> byte code offset
/*     */                   //   #169	-> 3
/*     */                   //   #170	-> 40
/*     */                   //   #171	-> 50
/*     */                   //   #171	-> 72
/*     */                   //   #169	-> 85
/*     */                   //   #172	-> 92
/*     */                   //   #173	-> 94
/*     */                   //   #169	-> 115
/*     */                   //   #173	-> 123
/*     */                   //   #175	-> 127
/*     */                   //   #176	-> 128
/*     */                   //   #179	-> 140
/*     */                   //   #169	-> 144
/*     */                   // Local variable table:
/*     */                   //   start	length	slot	name	descriptor
/*     */                   //   128	9	2	t	Ljava/lang/Throwable;
/*     */                   //   40	104	0	this	Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService$startOrInvalidateAuthRefresher$1$1;
/*     */                   //   40	104	1	$result	Ljava/lang/Object;
/*     */                   // Exception table:
/*     */                   //   from	to	target	type
/*     */                   //   93	110	127	java/lang/Throwable
/*     */                   //   117	124	127	java/lang/Throwable
/*     */                 }
/*     */                 
/*     */                 @NotNull
/*     */                 public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*     */                   return (Continuation)new Function2<>(GrazieAuthService.this, $completion);
/*     */                 }
/*     */                 
/*     */                 @Nullable
/*     */                 public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                 }
/*     */               }(Continuation)this) == object)
/*     */             return object; 
/*     */           BuildersKt.withContext((CoroutineContext)Dispatchers.getIO(), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) {
/*     */                 int label;
/*     */                 
/*     */                 @Nullable
/*     */                 public final Object invokeSuspend(@NotNull Object $result) {
/*     */                   // Byte code:
/*     */                   //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                   //   3: astore_3
/*     */                   //   4: aload_0
/*     */                   //   5: getfield label : I
/*     */                   //   8: tableswitch default -> 144, 0 -> 36, 1 -> 87, 2 -> 117
/*     */                   //   36: aload_1
/*     */                   //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   40: aload_0
/*     */                   //   41: getfield this$0 : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */                   //   44: invokevirtual isAuthenticated : ()Z
/*     */                   //   47: ifeq -> 140
/*     */                   //   50: getstatic kotlin/time/Duration.Companion : Lkotlin/time/Duration$Companion;
/*     */                   //   53: pop
/*     */                   //   54: getstatic kotlin/random/Random.Default : Lkotlin/random/Random$Default;
/*     */                   //   57: iconst_2
/*     */                   //   58: iconst_4
/*     */                   //   59: invokevirtual nextInt : (II)I
/*     */                   //   62: getstatic kotlin/time/DurationUnit.HOURS : Lkotlin/time/DurationUnit;
/*     */                   //   65: invokestatic toDuration : (ILkotlin/time/DurationUnit;)J
/*     */                   //   68: aload_0
/*     */                   //   69: checkcast kotlin/coroutines/Continuation
/*     */                   //   72: aload_0
/*     */                   //   73: iconst_1
/*     */                   //   74: putfield label : I
/*     */                   //   77: invokestatic delay-VtjQ1oo : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                   //   80: dup
/*     */                   //   81: aload_3
/*     */                   //   82: if_acmpne -> 92
/*     */                   //   85: aload_3
/*     */                   //   86: areturn
/*     */                   //   87: aload_1
/*     */                   //   88: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   91: aload_1
/*     */                   //   92: pop
/*     */                   //   93: nop
/*     */                   //   94: aload_0
/*     */                   //   95: getfield this$0 : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */                   //   98: aload_0
/*     */                   //   99: checkcast kotlin/coroutines/Continuation
/*     */                   //   102: aload_0
/*     */                   //   103: iconst_2
/*     */                   //   104: putfield label : I
/*     */                   //   107: invokestatic access$refreshToken : (Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                   //   110: dup
/*     */                   //   111: aload_3
/*     */                   //   112: if_acmpne -> 123
/*     */                   //   115: aload_3
/*     */                   //   116: areturn
/*     */                   //   117: nop
/*     */                   //   118: aload_1
/*     */                   //   119: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   122: aload_1
/*     */                   //   123: pop
/*     */                   //   124: goto -> 40
/*     */                   //   127: astore_2
/*     */                   //   128: invokestatic access$getLogger$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */                   //   131: ldc 'Could not refresh token'
/*     */                   //   133: aload_2
/*     */                   //   134: invokevirtual warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */                   //   137: goto -> 40
/*     */                   //   140: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */                   //   143: areturn
/*     */                   //   144: new java/lang/IllegalStateException
/*     */                   //   147: dup
/*     */                   //   148: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                   //   150: invokespecial <init> : (Ljava/lang/String;)V
/*     */                   //   153: athrow
/*     */                   // Line number table:
/*     */                   //   Java source line number -> byte code offset
/*     */                   //   #169	-> 3
/*     */                   //   #170	-> 40
/*     */                   //   #171	-> 50
/*     */                   //   #171	-> 72
/*     */                   //   #169	-> 85
/*     */                   //   #172	-> 92
/*     */                   //   #173	-> 94
/*     */                   //   #169	-> 115
/*     */                   //   #173	-> 123
/*     */                   //   #175	-> 127
/*     */                   //   #176	-> 128
/*     */                   //   #179	-> 140
/*     */                   //   #169	-> 144
/*     */                   // Local variable table:
/*     */                   //   start	length	slot	name	descriptor
/*     */                   //   128	9	2	t	Ljava/lang/Throwable;
/*     */                   //   40	104	0	this	Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService$startOrInvalidateAuthRefresher$1$1;
/*     */                   //   40	104	1	$result	Ljava/lang/Object;
/*     */                   // Exception table:
/*     */                   //   from	to	target	type
/*     */                   //   93	110	127	java/lang/Throwable
/*     */                   //   117	124	127	java/lang/Throwable
/*     */                 }
/*     */                 
/*     */                 @NotNull
/*     */                 public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*     */                   return (Continuation)new Function2<>(GrazieAuthService.this, $completion);
/*     */                 }
/*     */                 
/*     */                 @Nullable
/*     */                 public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                 }
/*     */               }(Continuation)this);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super GrazieAuthService$startOrInvalidateAuthRefresher$1> $completion) {
/*     */       return (Continuation<Unit>)new GrazieAuthService$startOrInvalidateAuthRefresher$1($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */       return ((GrazieAuthService$startOrInvalidateAuthRefresher$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private final Object refreshToken(Continuation<? super Boolean> paramContinuation) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof com/intellij/ml/llm/core/grazieAPI/GrazieAuthService$refreshToken$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_1
/*     */     //   8: checkcast com/intellij/ml/llm/core/grazieAPI/GrazieAuthService$refreshToken$1
/*     */     //   11: astore #8
/*     */     //   13: aload #8
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #8
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/core/grazieAPI/GrazieAuthService$refreshToken$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_1
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #8
/*     */     //   50: aload #8
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #7
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #9
/*     */     //   62: aload #8
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 523, 0 -> 92, 1 -> 233, 2 -> 325
/*     */     //   92: aload #7
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_0
/*     */     //   98: invokevirtual isAuthenticated : ()Z
/*     */     //   101: ifne -> 109
/*     */     //   104: iconst_0
/*     */     //   105: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   108: areturn
/*     */     //   109: invokestatic access$getLogger$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   112: ldc_w 'Started refreshToken'
/*     */     //   115: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   118: aconst_null
/*     */     //   119: iconst_0
/*     */     //   120: iconst_0
/*     */     //   121: iconst_4
/*     */     //   122: aconst_null
/*     */     //   123: invokestatic grazieClient$default : (Lcom/intellij/openapi/project/Project;ZZILjava/lang/Object;)Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;
/*     */     //   126: astore_2
/*     */     //   127: aload_2
/*     */     //   128: ifnonnull -> 183
/*     */     //   131: invokestatic access$getLogger$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   134: ldc_w 'Grazie client is null, probably token has expired'
/*     */     //   137: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   140: aload_0
/*     */     //   141: invokevirtual isAuthenticated : ()Z
/*     */     //   144: ifne -> 151
/*     */     //   147: iconst_1
/*     */     //   148: goto -> 152
/*     */     //   151: iconst_0
/*     */     //   152: istore_3
/*     */     //   153: getstatic kotlin/_Assertions.ENABLED : Z
/*     */     //   156: ifeq -> 178
/*     */     //   159: iload_3
/*     */     //   160: ifne -> 178
/*     */     //   163: ldc_w 'Assertion failed'
/*     */     //   166: astore #4
/*     */     //   168: new java/lang/AssertionError
/*     */     //   171: dup
/*     */     //   172: aload #4
/*     */     //   174: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   177: athrow
/*     */     //   178: iconst_0
/*     */     //   179: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   182: areturn
/*     */     //   183: invokestatic getIO : ()Lkotlinx/coroutines/CoroutineDispatcher;
/*     */     //   186: checkcast kotlin/coroutines/CoroutineContext
/*     */     //   189: new com/intellij/ml/llm/core/grazieAPI/GrazieAuthService$refreshToken$verifyResult$1
/*     */     //   192: dup
/*     */     //   193: aload_2
/*     */     //   194: aconst_null
/*     */     //   195: invokespecial <init> : (Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;Lkotlin/coroutines/Continuation;)V
/*     */     //   198: checkcast kotlin/jvm/functions/Function2
/*     */     //   201: aload #8
/*     */     //   203: aload #8
/*     */     //   205: aload_0
/*     */     //   206: putfield L$0 : Ljava/lang/Object;
/*     */     //   209: aload #8
/*     */     //   211: aload_2
/*     */     //   212: putfield L$1 : Ljava/lang/Object;
/*     */     //   215: aload #8
/*     */     //   217: iconst_1
/*     */     //   218: putfield label : I
/*     */     //   221: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   224: dup
/*     */     //   225: aload #9
/*     */     //   227: if_acmpne -> 258
/*     */     //   230: aload #9
/*     */     //   232: areturn
/*     */     //   233: aload #8
/*     */     //   235: getfield L$1 : Ljava/lang/Object;
/*     */     //   238: checkcast ai/grazie/api/gateway/client/SuspendableAPIGatewayClient
/*     */     //   241: astore_2
/*     */     //   242: aload #8
/*     */     //   244: getfield L$0 : Ljava/lang/Object;
/*     */     //   247: checkcast com/intellij/ml/llm/core/grazieAPI/GrazieAuthService
/*     */     //   250: astore_0
/*     */     //   251: aload #7
/*     */     //   253: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   256: aload #7
/*     */     //   258: checkcast java/lang/Boolean
/*     */     //   261: invokevirtual booleanValue : ()Z
/*     */     //   264: istore_3
/*     */     //   265: iload_3
/*     */     //   266: ifeq -> 274
/*     */     //   269: iconst_1
/*     */     //   270: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   273: areturn
/*     */     //   274: nop
/*     */     //   275: invokestatic getIO : ()Lkotlinx/coroutines/CoroutineDispatcher;
/*     */     //   278: checkcast kotlin/coroutines/CoroutineContext
/*     */     //   281: new com/intellij/ml/llm/core/grazieAPI/GrazieAuthService$refreshToken$newToken$1
/*     */     //   284: dup
/*     */     //   285: aload_2
/*     */     //   286: aconst_null
/*     */     //   287: invokespecial <init> : (Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;Lkotlin/coroutines/Continuation;)V
/*     */     //   290: checkcast kotlin/jvm/functions/Function2
/*     */     //   293: aload #8
/*     */     //   295: aload #8
/*     */     //   297: aload_0
/*     */     //   298: putfield L$0 : Ljava/lang/Object;
/*     */     //   301: aload #8
/*     */     //   303: aconst_null
/*     */     //   304: putfield L$1 : Ljava/lang/Object;
/*     */     //   307: aload #8
/*     */     //   309: iconst_2
/*     */     //   310: putfield label : I
/*     */     //   313: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   316: dup
/*     */     //   317: aload #9
/*     */     //   319: if_acmpne -> 342
/*     */     //   322: aload #9
/*     */     //   324: areturn
/*     */     //   325: aload #8
/*     */     //   327: getfield L$0 : Ljava/lang/Object;
/*     */     //   330: checkcast com/intellij/ml/llm/core/grazieAPI/GrazieAuthService
/*     */     //   333: astore_0
/*     */     //   334: nop
/*     */     //   335: aload #7
/*     */     //   337: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   340: aload #7
/*     */     //   342: checkcast java/lang/String
/*     */     //   345: astore #5
/*     */     //   347: goto -> 368
/*     */     //   350: astore #6
/*     */     //   352: invokestatic access$getLogger$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   355: ldc_w 'Could not get new token from Grazie'
/*     */     //   358: aload #6
/*     */     //   360: invokevirtual warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   363: iconst_0
/*     */     //   364: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   367: areturn
/*     */     //   368: aload #5
/*     */     //   370: astore #4
/*     */     //   372: aload #4
/*     */     //   374: ifnonnull -> 427
/*     */     //   377: invokestatic access$getLogger$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   380: ldc_w 'Grazie token is old, revoking auth'
/*     */     //   383: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   386: aload_0
/*     */     //   387: getfield mutableAuthState : Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   390: getstatic com/intellij/ml/llm/core/grazieAPI/GrazieAuthState.NoAuth : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;
/*     */     //   393: invokeinterface setValue : (Ljava/lang/Object;)V
/*     */     //   398: nop
/*     */     //   399: getstatic com/intellij/ml/llm/core/models/openai/CredentialsHolder.Companion : Lcom/intellij/ml/llm/core/models/openai/CredentialsHolder$Companion;
/*     */     //   402: invokevirtual getInstance : ()Lcom/intellij/ml/llm/core/models/openai/CredentialsHolder;
/*     */     //   405: aconst_null
/*     */     //   406: invokevirtual setProxyServerToken : (Ljava/lang/String;)V
/*     */     //   409: goto -> 422
/*     */     //   412: astore #5
/*     */     //   414: invokestatic access$getLogger$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   417: aload #5
/*     */     //   419: invokevirtual warn : (Ljava/lang/Throwable;)V
/*     */     //   422: iconst_0
/*     */     //   423: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   426: areturn
/*     */     //   427: nop
/*     */     //   428: getstatic com/intellij/ml/llm/core/models/openai/CredentialsHolder.Companion : Lcom/intellij/ml/llm/core/models/openai/CredentialsHolder$Companion;
/*     */     //   431: invokevirtual getInstance : ()Lcom/intellij/ml/llm/core/models/openai/CredentialsHolder;
/*     */     //   434: invokevirtual getProxyServerToken : ()Ljava/lang/String;
/*     */     //   437: dup
/*     */     //   438: ifnonnull -> 445
/*     */     //   441: pop
/*     */     //   442: ldc_w 'none'
/*     */     //   445: iconst_5
/*     */     //   446: invokestatic takeLast : (Ljava/lang/String;I)Ljava/lang/String;
/*     */     //   449: astore #5
/*     */     //   451: getstatic com/intellij/ml/llm/core/models/openai/CredentialsHolder.Companion : Lcom/intellij/ml/llm/core/models/openai/CredentialsHolder$Companion;
/*     */     //   454: invokevirtual getInstance : ()Lcom/intellij/ml/llm/core/models/openai/CredentialsHolder;
/*     */     //   457: aload #4
/*     */     //   459: invokevirtual setProxyServerToken : (Ljava/lang/String;)V
/*     */     //   462: getstatic com/intellij/ml/llm/core/models/openai/CredentialsHolder.Companion : Lcom/intellij/ml/llm/core/models/openai/CredentialsHolder$Companion;
/*     */     //   465: invokevirtual getInstance : ()Lcom/intellij/ml/llm/core/models/openai/CredentialsHolder;
/*     */     //   468: invokevirtual getProxyServerToken : ()Ljava/lang/String;
/*     */     //   471: dup
/*     */     //   472: ifnonnull -> 479
/*     */     //   475: pop
/*     */     //   476: ldc_w 'none'
/*     */     //   479: iconst_5
/*     */     //   480: invokestatic takeLast : (Ljava/lang/String;I)Ljava/lang/String;
/*     */     //   483: astore #6
/*     */     //   485: invokestatic access$getLogger$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   488: aload #5
/*     */     //   490: aload #6
/*     */     //   492: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   497: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   500: goto -> 518
/*     */     //   503: astore #5
/*     */     //   505: invokestatic access$getLogger$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   508: aload #5
/*     */     //   510: invokevirtual warn : (Ljava/lang/Throwable;)V
/*     */     //   513: iconst_0
/*     */     //   514: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   517: areturn
/*     */     //   518: iconst_1
/*     */     //   519: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   522: areturn
/*     */     //   523: new java/lang/IllegalStateException
/*     */     //   526: dup
/*     */     //   527: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   530: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   533: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #184	-> 60
/*     */     //   #185	-> 97
/*     */     //   #187	-> 109
/*     */     //   #189	-> 118
/*     */     //   #190	-> 127
/*     */     //   #191	-> 131
/*     */     //   #192	-> 140
/*     */     //   #193	-> 178
/*     */     //   #196	-> 183
/*     */     //   #184	-> 230
/*     */     //   #196	-> 258
/*     */     //   #206	-> 265
/*     */     //   #208	-> 274
/*     */     //   #209	-> 275
/*     */     //   #184	-> 322
/*     */     //   #209	-> 342
/*     */     //   #213	-> 350
/*     */     //   #214	-> 352
/*     */     //   #215	-> 363
/*     */     //   #208	-> 368
/*     */     //   #219	-> 372
/*     */     //   #220	-> 377
/*     */     //   #221	-> 386
/*     */     //   #222	-> 398
/*     */     //   #223	-> 399
/*     */     //   #225	-> 412
/*     */     //   #226	-> 414
/*     */     //   #228	-> 422
/*     */     //   #231	-> 427
/*     */     //   #232	-> 428
/*     */     //   #233	-> 451
/*     */     //   #234	-> 462
/*     */     //   #235	-> 485
/*     */     //   #237	-> 503
/*     */     //   #238	-> 505
/*     */     //   #239	-> 513
/*     */     //   #242	-> 518
/*     */     //   #184	-> 523
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	12	0	this	Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */     //   109	42	0	this	Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */     //   183	50	0	this	Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */     //   251	74	0	this	Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */     //   334	16	0	this	Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */     //   368	30	0	this	Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */     //   127	4	2	grazieClient	Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;
/*     */     //   183	50	2	grazieClient	Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;
/*     */     //   242	32	2	grazieClient	Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;
/*     */     //   274	42	2	grazieClient	Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;
/*     */     //   265	9	3	verifyResult	Z
/*     */     //   372	5	4	newToken	Ljava/lang/String;
/*     */     //   427	35	4	newToken	Ljava/lang/String;
/*     */     //   414	8	5	t	Ljava/lang/Throwable;
/*     */     //   451	49	5	prevToken5	Ljava/lang/String;
/*     */     //   505	13	5	t	Ljava/lang/Throwable;
/*     */     //   352	16	6	t	Ljava/lang/Throwable;
/*     */     //   485	15	6	newToken5	Ljava/lang/String;
/*     */     //   50	473	8	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	466	7	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   274	316	350	java/lang/Throwable
/*     */     //   334	347	350	java/lang/Throwable
/*     */     //   398	409	412	java/lang/Throwable
/*     */     //   427	500	503	java/lang/Throwable
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "GrazieAuthService.kt", l = {197}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.grazieAPI.GrazieAuthService$refreshToken$verifyResult$1")
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\013\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class GrazieAuthService$refreshToken$verifyResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
/*     */     int label;
/*     */     
/*     */     GrazieAuthService$refreshToken$verifyResult$1(SuspendableAPIGatewayClient $grazieClient, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore_2
/*     */       //   4: aload_0
/*     */       //   5: getfield label : I
/*     */       //   8: tableswitch default -> 118, 0 -> 32, 1 -> 62
/*     */       //   32: aload_1
/*     */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   36: aload_0
/*     */       //   37: getfield $grazieClient : Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;
/*     */       //   40: invokevirtual auth : ()Lai/grazie/api/gateway/client/api/AuthAPIClient;
/*     */       //   43: aload_0
/*     */       //   44: checkcast kotlin/coroutines/Continuation
/*     */       //   47: aload_0
/*     */       //   48: iconst_1
/*     */       //   49: putfield label : I
/*     */       //   52: invokevirtual verify : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   55: dup
/*     */       //   56: aload_2
/*     */       //   57: if_acmpne -> 67
/*     */       //   60: aload_2
/*     */       //   61: areturn
/*     */       //   62: aload_1
/*     */       //   63: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   66: aload_1
/*     */       //   67: checkcast ai/grazie/utils/mpp/time/Timestamp
/*     */       //   70: dup
/*     */       //   71: ifnull -> 95
/*     */       //   74: getstatic ai/grazie/utils/mpp/time/Timestamp.Companion : Lai/grazie/utils/mpp/time/Timestamp$Companion;
/*     */       //   77: invokevirtual now : ()Lai/grazie/utils/mpp/time/Timestamp;
/*     */       //   80: invokevirtual after : (Lai/grazie/utils/mpp/time/Timestamp;)Z
/*     */       //   83: iconst_1
/*     */       //   84: if_icmpne -> 91
/*     */       //   87: iconst_1
/*     */       //   88: goto -> 97
/*     */       //   91: iconst_0
/*     */       //   92: goto -> 97
/*     */       //   95: pop
/*     */       //   96: iconst_0
/*     */       //   97: ifeq -> 113
/*     */       //   100: invokestatic access$getLogger$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   103: ldc 'Token is still valid!'
/*     */       //   105: invokevirtual info : (Ljava/lang/String;)V
/*     */       //   108: iconst_1
/*     */       //   109: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*     */       //   112: areturn
/*     */       //   113: iconst_0
/*     */       //   114: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*     */       //   117: areturn
/*     */       //   118: new java/lang/IllegalStateException
/*     */       //   121: dup
/*     */       //   122: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   124: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   127: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #196	-> 3
/*     */       //   #197	-> 36
/*     */       //   #196	-> 60
/*     */       //   #197	-> 67
/*     */       //   #198	-> 100
/*     */       //   #199	-> 108
/*     */       //   #202	-> 113
/*     */       //   #196	-> 118
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   36	82	0	this	Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService$refreshToken$verifyResult$1;
/*     */       //   36	82	1	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super GrazieAuthService$refreshToken$verifyResult$1> $completion) {
/*     */       return (Continuation<Unit>)new GrazieAuthService$refreshToken$verifyResult$1(this.$grazieClient, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */       return ((GrazieAuthService$refreshToken$verifyResult$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "GrazieAuthService.kt", l = {210}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.grazieAPI.GrazieAuthService$refreshToken$newToken$1")
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\016\n\002\030\002\020\000\032\004\030\0010\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class GrazieAuthService$refreshToken$newToken$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
/*     */     int label;
/*     */     
/*     */     GrazieAuthService$refreshToken$newToken$1(SuspendableAPIGatewayClient $grazieClient, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (this.$grazieClient.auth().refresh((Continuation)this) == object)
/*     */             return object; 
/*     */           return this.$grazieClient.auth().refresh((Continuation)this);
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return SYNTHETIC_LOCAL_VARIABLE_1;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super GrazieAuthService$refreshToken$newToken$1> $completion) {
/*     */       return (Continuation<Unit>)new GrazieAuthService$refreshToken$newToken$1(this.$grazieClient, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */       return ((GrazieAuthService$refreshToken$newToken$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object authenticate(@Nullable Project project, @NotNull Continuation $completion) {
/*     */     if (CoroutineScopeKt.coroutineScope(new GrazieAuthService$authenticate$2(project, null), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */       return CoroutineScopeKt.coroutineScope(new GrazieAuthService$authenticate$2(project, null), $completion); 
/*     */     CoroutineScopeKt.coroutineScope(new GrazieAuthService$authenticate$2(project, null), $completion);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "GrazieAuthService.kt", l = {282}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.grazieAPI.GrazieAuthService$authenticate$2")
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class GrazieAuthService$authenticate$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     GrazieAuthService$authenticate$2(Project $project, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       CoroutineScope $this$coroutineScope;
/*     */       Deferred ourAsync;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           $this$coroutineScope = (CoroutineScope)this.L$0;
/*     */           ourAsync = BuildersKt.async$default($this$coroutineScope, null, null, new GrazieAuthService$authenticate$2$ourAsync$1(this.$project, null), 3, null);
/*     */           GrazieAuthService.this.authJob = (Job)ourAsync;
/*     */           this.label = 1;
/*     */           if (ourAsync.await((Continuation)this) == object)
/*     */             return object; 
/*     */           ourAsync.await((Continuation)this);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super GrazieAuthService$authenticate$2> $completion) {
/*     */       GrazieAuthService$authenticate$2 grazieAuthService$authenticate$2 = new GrazieAuthService$authenticate$2(this.$project, $completion);
/*     */       grazieAuthService$authenticate$2.L$0 = value;
/*     */       return (Continuation<Unit>)grazieAuthService$authenticate$2;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */       return ((GrazieAuthService$authenticate$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */     
/*     */     @DebugMetadata(f = "GrazieAuthService.kt", l = {250, 255}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.grazieAPI.GrazieAuthService$authenticate$2$ourAsync$1")
/*     */     @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */     static final class GrazieAuthService$authenticate$2$ourAsync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */       int label;
/*     */       
/*     */       GrazieAuthService$authenticate$2$ourAsync$1(Project $project, Continuation $completion) {
/*     */         super(2, $completion);
/*     */       }
/*     */       
/*     */       @Nullable
/*     */       public final Object invokeSuspend(@NotNull Object $result) {
/*     */         // Byte code:
/*     */         //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */         //   3: astore_3
/*     */         //   4: aload_0
/*     */         //   5: getfield label : I
/*     */         //   8: tableswitch default -> 410, 0 -> 36, 1 -> 89, 2 -> 184
/*     */         //   36: aload_1
/*     */         //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */         //   40: aload_0
/*     */         //   41: getfield this$0 : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */         //   44: invokestatic access$getMutableAuthState$p : (Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */         //   47: getstatic com/intellij/ml/llm/core/grazieAPI/GrazieAuthState.NoAuth : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;
/*     */         //   50: getstatic com/intellij/ml/llm/core/grazieAPI/GrazieAuthState.InProgress : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;
/*     */         //   53: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */         //   58: ifne -> 65
/*     */         //   61: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */         //   64: areturn
/*     */         //   65: nop
/*     */         //   66: aload_0
/*     */         //   67: getfield this$0 : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */         //   70: aload_0
/*     */         //   71: checkcast kotlin/coroutines/Continuation
/*     */         //   74: aload_0
/*     */         //   75: iconst_1
/*     */         //   76: putfield label : I
/*     */         //   79: invokestatic access$obtainNewToken : (Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */         //   82: dup
/*     */         //   83: aload_3
/*     */         //   84: if_acmpne -> 95
/*     */         //   87: aload_3
/*     */         //   88: areturn
/*     */         //   89: nop
/*     */         //   90: aload_1
/*     */         //   91: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */         //   94: aload_1
/*     */         //   95: checkcast com/intellij/ml/llm/core/grazieAPI/GrazieAuthResult
/*     */         //   98: astore_2
/*     */         //   99: aload_2
/*     */         //   100: instanceof com/intellij/ml/llm/core/grazieAPI/GrazieAuthSuccessResult
/*     */         //   103: ifeq -> 194
/*     */         //   106: getstatic com/intellij/ml/llm/core/models/openai/CredentialsHolder.Companion : Lcom/intellij/ml/llm/core/models/openai/CredentialsHolder$Companion;
/*     */         //   109: invokevirtual getInstance : ()Lcom/intellij/ml/llm/core/models/openai/CredentialsHolder;
/*     */         //   112: aload_2
/*     */         //   113: checkcast com/intellij/ml/llm/core/grazieAPI/GrazieAuthSuccessResult
/*     */         //   116: invokevirtual getToken : ()Ljava/lang/String;
/*     */         //   119: invokevirtual setProxyServerToken : (Ljava/lang/String;)V
/*     */         //   122: aload_0
/*     */         //   123: getfield this$0 : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */         //   126: invokestatic access$getMutableAuthState$p : (Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */         //   129: getstatic com/intellij/ml/llm/core/grazieAPI/GrazieAuthState.Authed : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;
/*     */         //   132: invokeinterface setValue : (Ljava/lang/Object;)V
/*     */         //   137: aload_0
/*     */         //   138: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */         //   141: ifnull -> 253
/*     */         //   144: getstatic kotlinx/coroutines/Dispatchers.INSTANCE : Lkotlinx/coroutines/Dispatchers;
/*     */         //   147: invokestatic getEDT : (Lkotlinx/coroutines/Dispatchers;)Lkotlin/coroutines/CoroutineContext;
/*     */         //   150: new com/intellij/ml/llm/core/grazieAPI/GrazieAuthService$authenticate$2$ourAsync$1$1
/*     */         //   153: dup
/*     */         //   154: aload_0
/*     */         //   155: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */         //   158: aconst_null
/*     */         //   159: invokespecial <init> : (Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)V
/*     */         //   162: checkcast kotlin/jvm/functions/Function2
/*     */         //   165: aload_0
/*     */         //   166: checkcast kotlin/coroutines/Continuation
/*     */         //   169: aload_0
/*     */         //   170: iconst_2
/*     */         //   171: putfield label : I
/*     */         //   174: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */         //   177: dup
/*     */         //   178: aload_3
/*     */         //   179: if_acmpne -> 190
/*     */         //   182: aload_3
/*     */         //   183: areturn
/*     */         //   184: nop
/*     */         //   185: aload_1
/*     */         //   186: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */         //   189: aload_1
/*     */         //   190: pop
/*     */         //   191: goto -> 253
/*     */         //   194: aload_2
/*     */         //   195: instanceof com/intellij/ml/llm/core/grazieAPI/GrazieAuthWaitListResult
/*     */         //   198: ifeq -> 230
/*     */         //   201: getstatic com/intellij/ml/llm/core/models/openai/CredentialsHolder.Companion : Lcom/intellij/ml/llm/core/models/openai/CredentialsHolder$Companion;
/*     */         //   204: invokevirtual getInstance : ()Lcom/intellij/ml/llm/core/models/openai/CredentialsHolder;
/*     */         //   207: ldc 'wait_list'
/*     */         //   209: invokevirtual setProxyServerToken : (Ljava/lang/String;)V
/*     */         //   212: aload_0
/*     */         //   213: getfield this$0 : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */         //   216: invokestatic access$getMutableAuthState$p : (Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */         //   219: getstatic com/intellij/ml/llm/core/grazieAPI/GrazieAuthState.WaitList : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;
/*     */         //   222: invokeinterface setValue : (Ljava/lang/Object;)V
/*     */         //   227: goto -> 253
/*     */         //   230: aload_2
/*     */         //   231: instanceof com/intellij/ml/llm/core/grazieAPI/GrazieAuthFailureResult
/*     */         //   234: ifeq -> 241
/*     */         //   237: iconst_1
/*     */         //   238: goto -> 250
/*     */         //   241: aload_2
/*     */         //   242: ifnonnull -> 249
/*     */         //   245: iconst_1
/*     */         //   246: goto -> 250
/*     */         //   249: iconst_0
/*     */         //   250: ifeq -> 253
/*     */         //   253: aload_0
/*     */         //   254: getfield this$0 : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */         //   257: invokestatic access$getMutableAuthState$p : (Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */         //   260: invokeinterface getValue : ()Ljava/lang/Object;
/*     */         //   265: getstatic com/intellij/ml/llm/core/grazieAPI/GrazieAuthState.InProgress : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;
/*     */         //   268: if_acmpne -> 286
/*     */         //   271: aload_0
/*     */         //   272: getfield this$0 : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */         //   275: invokestatic access$getMutableAuthState$p : (Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */         //   278: getstatic com/intellij/ml/llm/core/grazieAPI/GrazieAuthState.NoAuth : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;
/*     */         //   281: invokeinterface setValue : (Ljava/lang/Object;)V
/*     */         //   286: goto -> 406
/*     */         //   289: astore_2
/*     */         //   290: aload_0
/*     */         //   291: getfield this$0 : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */         //   294: invokestatic access$getMutableAuthState$p : (Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */         //   297: invokeinterface getValue : ()Ljava/lang/Object;
/*     */         //   302: getstatic com/intellij/ml/llm/core/grazieAPI/GrazieAuthState.InProgress : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;
/*     */         //   305: if_acmpne -> 323
/*     */         //   308: aload_0
/*     */         //   309: getfield this$0 : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */         //   312: invokestatic access$getMutableAuthState$p : (Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */         //   315: getstatic com/intellij/ml/llm/core/grazieAPI/GrazieAuthState.NoAuth : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;
/*     */         //   318: invokeinterface setValue : (Ljava/lang/Object;)V
/*     */         //   323: goto -> 406
/*     */         //   326: astore_2
/*     */         //   327: invokestatic access$getLogger$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */         //   330: aload_2
/*     */         //   331: invokevirtual warn : (Ljava/lang/Throwable;)V
/*     */         //   334: aload_0
/*     */         //   335: getfield this$0 : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */         //   338: invokestatic access$getMutableAuthState$p : (Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */         //   341: invokeinterface getValue : ()Ljava/lang/Object;
/*     */         //   346: getstatic com/intellij/ml/llm/core/grazieAPI/GrazieAuthState.InProgress : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;
/*     */         //   349: if_acmpne -> 367
/*     */         //   352: aload_0
/*     */         //   353: getfield this$0 : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */         //   356: invokestatic access$getMutableAuthState$p : (Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */         //   359: getstatic com/intellij/ml/llm/core/grazieAPI/GrazieAuthState.NoAuth : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;
/*     */         //   362: invokeinterface setValue : (Ljava/lang/Object;)V
/*     */         //   367: goto -> 406
/*     */         //   370: astore_2
/*     */         //   371: aload_0
/*     */         //   372: getfield this$0 : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */         //   375: invokestatic access$getMutableAuthState$p : (Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */         //   378: invokeinterface getValue : ()Ljava/lang/Object;
/*     */         //   383: getstatic com/intellij/ml/llm/core/grazieAPI/GrazieAuthState.InProgress : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;
/*     */         //   386: if_acmpne -> 404
/*     */         //   389: aload_0
/*     */         //   390: getfield this$0 : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */         //   393: invokestatic access$getMutableAuthState$p : (Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */         //   396: getstatic com/intellij/ml/llm/core/grazieAPI/GrazieAuthState.NoAuth : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;
/*     */         //   399: invokeinterface setValue : (Ljava/lang/Object;)V
/*     */         //   404: aload_2
/*     */         //   405: athrow
/*     */         //   406: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */         //   409: areturn
/*     */         //   410: new java/lang/IllegalStateException
/*     */         //   413: dup
/*     */         //   414: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */         //   416: invokespecial <init> : (Ljava/lang/String;)V
/*     */         //   419: athrow
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #247	-> 3
/*     */         //   #248	-> 40
/*     */         //   #249	-> 65
/*     */         //   #250	-> 66
/*     */         //   #247	-> 87
/*     */         //   #251	-> 99
/*     */         //   #252	-> 106
/*     */         //   #253	-> 122
/*     */         //   #254	-> 137
/*     */         //   #255	-> 144
/*     */         //   #247	-> 182
/*     */         //   #255	-> 190
/*     */         //   #260	-> 194
/*     */         //   #261	-> 201
/*     */         //   #262	-> 212
/*     */         //   #264	-> 230
/*     */         //   #276	-> 253
/*     */         //   #277	-> 271
/*     */         //   #279	-> 286
/*     */         //   #269	-> 289
/*     */         //   #276	-> 290
/*     */         //   #277	-> 308
/*     */         //   #279	-> 323
/*     */         //   #272	-> 326
/*     */         //   #273	-> 327
/*     */         //   #276	-> 334
/*     */         //   #277	-> 352
/*     */         //   #279	-> 367
/*     */         //   #276	-> 370
/*     */         //   #277	-> 389
/*     */         //   #280	-> 406
/*     */         //   #247	-> 410
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   99	23	2	result	Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthResult;
/*     */         //   194	7	2	result	Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthResult;
/*     */         //   230	11	2	result	Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthResult;
/*     */         //   241	8	2	result	Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthResult;
/*     */         //   327	7	2	t	Ljava/lang/Throwable;
/*     */         //   40	370	0	this	Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService$authenticate$2$ourAsync$1;
/*     */         //   40	370	1	$result	Ljava/lang/Object;
/*     */         // Exception table:
/*     */         //   from	to	target	type
/*     */         //   65	82	289	java/util/concurrent/CancellationException
/*     */         //   65	82	326	java/lang/Throwable
/*     */         //   65	82	370	finally
/*     */         //   89	177	289	java/util/concurrent/CancellationException
/*     */         //   89	177	326	java/lang/Throwable
/*     */         //   89	177	370	finally
/*     */         //   184	253	289	java/util/concurrent/CancellationException
/*     */         //   184	253	326	java/lang/Throwable
/*     */         //   184	253	370	finally
/*     */         //   289	290	370	finally
/*     */         //   326	334	370	finally
/*     */         //   370	371	370	finally
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super GrazieAuthService$authenticate$2$ourAsync$1> $completion) {
/*     */         return (Continuation<Unit>)new GrazieAuthService$authenticate$2$ourAsync$1(this.$project, $completion);
/*     */       }
/*     */       
/*     */       @Nullable
/*     */       public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */         return ((GrazieAuthService$authenticate$2$ourAsync$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public final void cancel() {
/*     */     GrazieAuthServiceKt.access$getLogger$p().assertTrue((this.authJob != null), "cancel() called when no auth job is running");
/*     */     Job aj = this.authJob;
/*     */     if (aj != null) {
/*     */       Job.DefaultImpls.cancel$default(aj, null, 1, null);
/*     */       this.authJob = null;
/*     */     } 
/*     */     this.mutableAuthState.setValue(GrazieAuthState.NoAuth);
/*     */   }
/*     */   
/*     */   public final void logout() {
/*     */     try {
/*     */       CredentialsHolder.Companion.getInstance().setProxyServerToken(null);
/*     */     } catch (Throwable t) {
/*     */       GrazieAuthServiceKt.access$getLogger$p().warn(t);
/*     */     } 
/*     */     this.mutableAuthState.setValue(GrazieAuthState.NoAuth);
/*     */   }
/*     */   
/*     */   private final Object obtainNewToken(Continuation<? super GrazieAuthResult> paramContinuation) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof com/intellij/ml/llm/core/grazieAPI/GrazieAuthService$obtainNewToken$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_1
/*     */     //   8: checkcast com/intellij/ml/llm/core/grazieAPI/GrazieAuthService$obtainNewToken$1
/*     */     //   11: astore #12
/*     */     //   13: aload #12
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #12
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/core/grazieAPI/GrazieAuthService$obtainNewToken$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_1
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #12
/*     */     //   50: aload #12
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #11
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #13
/*     */     //   62: aload #12
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 319, 0 -> 88, 1 -> 195
/*     */     //   88: aload #11
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aconst_null
/*     */     //   94: iconst_1
/*     */     //   95: aconst_null
/*     */     //   96: invokestatic CompletableDeferred$default : (Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/CompletableDeferred;
/*     */     //   99: astore_2
/*     */     //   100: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*     */     //   103: invokeinterface getMessageBus : ()Lcom/intellij/util/messages/MessageBus;
/*     */     //   108: aload_0
/*     */     //   109: getfield scope : Lkotlinx/coroutines/CoroutineScope;
/*     */     //   112: invokeinterface connect : (Lkotlinx/coroutines/CoroutineScope;)Lcom/intellij/util/messages/SimpleMessageBusConnection;
/*     */     //   117: astore_3
/*     */     //   118: aload_3
/*     */     //   119: invokestatic getGrazieAuthRestTopic : ()Lcom/intellij/util/messages/Topic;
/*     */     //   122: new com/intellij/ml/llm/core/grazieAPI/GrazieAuthService$obtainNewToken$2
/*     */     //   125: dup
/*     */     //   126: aload_2
/*     */     //   127: invokespecial <init> : (Lkotlinx/coroutines/CompletableDeferred;)V
/*     */     //   130: invokeinterface subscribe : (Lcom/intellij/util/messages/Topic;Ljava/lang/Object;)V
/*     */     //   135: nop
/*     */     //   136: invokestatic doGrazieAuthFacade : ()Ljava/lang/String;
/*     */     //   139: astore #4
/*     */     //   141: invokestatic access$getLogger$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   144: aload #4
/*     */     //   146: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   151: invokevirtual debug : (Ljava/lang/String;)V
/*     */     //   154: aload #4
/*     */     //   156: invokestatic browse : (Ljava/lang/String;)V
/*     */     //   159: aload_2
/*     */     //   160: aload #12
/*     */     //   162: aload #12
/*     */     //   164: aload_3
/*     */     //   165: putfield L$0 : Ljava/lang/Object;
/*     */     //   168: aload #12
/*     */     //   170: aload #4
/*     */     //   172: putfield L$1 : Ljava/lang/Object;
/*     */     //   175: aload #12
/*     */     //   177: iconst_1
/*     */     //   178: putfield label : I
/*     */     //   181: invokeinterface await : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   186: dup
/*     */     //   187: aload #13
/*     */     //   189: if_acmpne -> 222
/*     */     //   192: aload #13
/*     */     //   194: areturn
/*     */     //   195: aload #12
/*     */     //   197: getfield L$1 : Ljava/lang/Object;
/*     */     //   200: checkcast java/lang/String
/*     */     //   203: astore #4
/*     */     //   205: aload #12
/*     */     //   207: getfield L$0 : Ljava/lang/Object;
/*     */     //   210: checkcast com/intellij/util/messages/SimpleMessageBusConnection
/*     */     //   213: astore_3
/*     */     //   214: nop
/*     */     //   215: aload #11
/*     */     //   217: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   220: aload #11
/*     */     //   222: checkcast com/intellij/ml/llm/core/grazieAPI/GrazieAuthResult
/*     */     //   225: astore #5
/*     */     //   227: invokestatic access$getLogger$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   230: astore #6
/*     */     //   232: aconst_null
/*     */     //   233: astore #7
/*     */     //   235: iconst_0
/*     */     //   236: istore #8
/*     */     //   238: aload #6
/*     */     //   240: invokevirtual isDebugEnabled : ()Z
/*     */     //   243: ifeq -> 268
/*     */     //   246: aload #6
/*     */     //   248: astore #10
/*     */     //   250: iconst_0
/*     */     //   251: istore #9
/*     */     //   253: aload #4
/*     */     //   255: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   260: aload #10
/*     */     //   262: swap
/*     */     //   263: aload #7
/*     */     //   265: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   268: nop
/*     */     //   269: aload #5
/*     */     //   271: astore #6
/*     */     //   273: aload_3
/*     */     //   274: invokeinterface disconnect : ()V
/*     */     //   279: aload #6
/*     */     //   281: areturn
/*     */     //   282: astore #4
/*     */     //   284: aload #4
/*     */     //   286: athrow
/*     */     //   287: astore #4
/*     */     //   289: invokestatic access$getLogger$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   292: aload #4
/*     */     //   294: invokevirtual warn : (Ljava/lang/Throwable;)V
/*     */     //   297: aload_3
/*     */     //   298: invokeinterface disconnect : ()V
/*     */     //   303: goto -> 317
/*     */     //   306: astore #4
/*     */     //   308: aload_3
/*     */     //   309: invokeinterface disconnect : ()V
/*     */     //   314: aload #4
/*     */     //   316: athrow
/*     */     //   317: aconst_null
/*     */     //   318: areturn
/*     */     //   319: new java/lang/IllegalStateException
/*     */     //   322: dup
/*     */     //   323: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   326: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   329: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #306	-> 60
/*     */     //   #307	-> 93
/*     */     //   #308	-> 100
/*     */     //   #309	-> 118
/*     */     //   #314	-> 135
/*     */     //   #315	-> 136
/*     */     //   #316	-> 141
/*     */     //   #317	-> 154
/*     */     //   #318	-> 159
/*     */     //   #306	-> 192
/*     */     //   #319	-> 227
/*     */     //   #334	-> 232
/*     */     //   #335	-> 238
/*     */     //   #336	-> 246
/*     */     //   #319	-> 253
/*     */     //   #336	-> 263
/*     */     //   #338	-> 268
/*     */     //   #320	-> 269
/*     */     //   #329	-> 273
/*     */     //   #320	-> 281
/*     */     //   #322	-> 282
/*     */     //   #323	-> 284
/*     */     //   #325	-> 287
/*     */     //   #326	-> 289
/*     */     //   #329	-> 297
/*     */     //   #330	-> 303
/*     */     //   #329	-> 306
/*     */     //   #331	-> 317
/*     */     //   #306	-> 319
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	25	0	this	Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */     //   100	86	2	tokenDeferred	Lkotlinx/coroutines/CompletableDeferred;
/*     */     //   118	77	3	busConnection	Lcom/intellij/util/messages/SimpleMessageBusConnection;
/*     */     //   214	46	3	busConnection	Lcom/intellij/util/messages/SimpleMessageBusConnection;
/*     */     //   260	9	3	busConnection	Lcom/intellij/util/messages/SimpleMessageBusConnection;
/*     */     //   269	10	3	busConnection	Lcom/intellij/util/messages/SimpleMessageBusConnection;
/*     */     //   282	5	3	busConnection	Lcom/intellij/util/messages/SimpleMessageBusConnection;
/*     */     //   287	16	3	busConnection	Lcom/intellij/util/messages/SimpleMessageBusConnection;
/*     */     //   306	13	3	busConnection	Lcom/intellij/util/messages/SimpleMessageBusConnection;
/*     */     //   141	54	4	grazieAuthUrl	Ljava/lang/String;
/*     */     //   205	55	4	grazieAuthUrl	Ljava/lang/String;
/*     */     //   284	3	4	e	Ljava/util/concurrent/CancellationException;
/*     */     //   289	8	4	e	Ljava/lang/Throwable;
/*     */     //   227	33	5	token	Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthResult;
/*     */     //   260	13	5	token	Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthResult;
/*     */     //   232	18	6	$this$debug_u24default$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   235	25	7	e$iv	Ljava/lang/Exception;
/*     */     //   260	8	7	e$iv	Ljava/lang/Exception;
/*     */     //   253	7	9	$i$a$-debug$default-GrazieAuthService$obtainNewToken$3	I
/*     */     //   238	31	8	$i$f$debug	I
/*     */     //   50	269	12	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	262	11	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   135	186	282	java/util/concurrent/CancellationException
/*     */     //   135	186	287	java/lang/Throwable
/*     */     //   135	186	306	finally
/*     */     //   214	273	282	java/util/concurrent/CancellationException
/*     */     //   214	273	287	java/lang/Throwable
/*     */     //   214	273	306	finally
/*     */     //   282	287	306	finally
/*     */     //   287	297	306	finally
/*     */     //   306	308	306	finally
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/core/grazieAPI/GrazieAuthService$obtainNewToken$2", "Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthRestListener;", "onAuthenticated", "", "result", "Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthResult;", "intellij.ml.llm"})
/*     */   public static final class GrazieAuthService$obtainNewToken$2 implements GrazieAuthRestListener {
/*     */     GrazieAuthService$obtainNewToken$2(CompletableDeferred<GrazieAuthResult> $tokenDeferred) {}
/*     */     
/*     */     public void onAuthenticated(@NotNull GrazieAuthResult result) {
/*     */       Intrinsics.checkNotNullParameter(result, "result");
/*     */       this.$tokenDeferred.complete(result);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "GrazieAuthService.kt", l = {318}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"busConnection", "grazieAuthUrl"}, m = "obtainNewToken", c = "com.intellij.ml.llm.core.grazieAPI.GrazieAuthService")
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
/*     */   static final class GrazieAuthService$obtainNewToken$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     GrazieAuthService$obtainNewToken$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return GrazieAuthService.this.obtainNewToken((Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "GrazieAuthService.kt", l = {196, 209}, i = {0, 0, 1}, s = {"L$0", "L$1", "L$0"}, n = {"this", "grazieClient", "this"}, m = "refreshToken", c = "com.intellij.ml.llm.core.grazieAPI.GrazieAuthService")
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
/*     */   static final class GrazieAuthService$refreshToken$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     GrazieAuthService$refreshToken$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return GrazieAuthService.this.refreshToken((Continuation)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/grazieAPI/GrazieAuthService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */