/*     */ package ai.grazie.utils.http;
/*     */ 
/*     */ import io.ktor.client.request.HttpRequestBuilder;
/*     */ import io.ktor.client.statement.HttpResponse;
/*     */ import io.ktor.util.reflect.TypeInfoJvmKt;
/*     */ import java.lang.reflect.Type;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KType;
/*     */ import kotlin.reflect.TypesJVMKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @DebugMetadata(f = "JsonKtorHTTPClient.kt", l = {218, 196, 199}, i = {1}, s = {"L$0"}, n = {"result"}, m = "invokeSuspend", c = "ai.grazie.utils.http.JsonKtorHTTPClient$sendAndWaitBody$2")
/*     */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\b\003\n\002\030\002\020\000\032\002H\001\"\004\b\000\020\0012\006\020\002\032\0020\003H@"}, d2 = {"<anonymous>", "T", "it", "Lio/ktor/client/request/HttpRequestBuilder;"})
/*     */ @SourceDebugExtension({"SMAP\nJsonKtorHTTPClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonKtorHTTPClient.kt\nai/grazie/utils/http/JsonKtorHTTPClient$sendAndWaitBody$2\n+ 2 builders.kt\nio/ktor/client/request/BuildersKt\n*L\n1#1,217:1\n22#2:218\n*S KotlinDebug\n*F\n+ 1 JsonKtorHTTPClient.kt\nai/grazie/utils/http/JsonKtorHTTPClient$sendAndWaitBody$2\n*L\n194#1:218\n*E\n"})
/*     */ final class JsonKtorHTTPClient$sendAndWaitBody$2
/*     */   extends SuspendLambda
/*     */   implements Function2<HttpRequestBuilder, Continuation<? super T>, Object>
/*     */ {
/*     */   Object L$0;
/*     */   int label;
/*     */   
/*     */   JsonKtorHTTPClient$sendAndWaitBody$2(HttpRequestBuilder $request, Function2<HttpResponse, Continuation<? super T>, Object> $body, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object invokeSuspend(@NotNull Object $result) {
/*     */     // Byte code:
/*     */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   3: astore #6
/*     */     //   5: aload_0
/*     */     //   6: getfield label : I
/*     */     //   9: tableswitch default -> 231, 0 -> 40, 1 -> 92, 2 -> 153, 3 -> 225
/*     */     //   40: aload_1
/*     */     //   41: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   44: aload_0
/*     */     //   45: getfield this$0 : Lai/grazie/utils/http/JsonKtorHTTPClient;
/*     */     //   48: invokestatic access$getClient$p : (Lai/grazie/utils/http/JsonKtorHTTPClient;)Lio/ktor/client/HttpClient;
/*     */     //   51: astore_3
/*     */     //   52: aload_0
/*     */     //   53: getfield $request : Lio/ktor/client/request/HttpRequestBuilder;
/*     */     //   56: astore #4
/*     */     //   58: iconst_0
/*     */     //   59: istore #5
/*     */     //   61: new io/ktor/client/statement/HttpStatement
/*     */     //   64: dup
/*     */     //   65: aload #4
/*     */     //   67: aload_3
/*     */     //   68: invokespecial <init> : (Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/client/HttpClient;)V
/*     */     //   71: aload_0
/*     */     //   72: checkcast kotlin/coroutines/Continuation
/*     */     //   75: aload_0
/*     */     //   76: iconst_1
/*     */     //   77: putfield label : I
/*     */     //   80: invokevirtual execute : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   83: dup
/*     */     //   84: aload #6
/*     */     //   86: if_acmpne -> 100
/*     */     //   89: aload #6
/*     */     //   91: areturn
/*     */     //   92: iconst_0
/*     */     //   93: istore #5
/*     */     //   95: aload_1
/*     */     //   96: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   99: aload_1
/*     */     //   100: nop
/*     */     //   101: checkcast io/ktor/client/statement/HttpResponse
/*     */     //   104: astore_2
/*     */     //   105: aload_2
/*     */     //   106: invokevirtual getStatus : ()Lio/ktor/http/HttpStatusCode;
/*     */     //   109: invokestatic isSuccess : (Lio/ktor/http/HttpStatusCode;)Z
/*     */     //   112: ifne -> 200
/*     */     //   115: new ai/grazie/utils/http/JsonKtorHTTPClient$sendAndWaitBody$2$errorText$1
/*     */     //   118: dup
/*     */     //   119: aload_2
/*     */     //   120: aconst_null
/*     */     //   121: invokespecial <init> : (Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)V
/*     */     //   124: checkcast kotlin/jvm/functions/Function1
/*     */     //   127: aload_0
/*     */     //   128: checkcast kotlin/coroutines/Continuation
/*     */     //   131: aload_0
/*     */     //   132: aload_2
/*     */     //   133: putfield L$0 : Ljava/lang/Object;
/*     */     //   136: aload_0
/*     */     //   137: iconst_2
/*     */     //   138: putfield label : I
/*     */     //   141: invokestatic tryRun : (Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   144: dup
/*     */     //   145: aload #6
/*     */     //   147: if_acmpne -> 166
/*     */     //   150: aload #6
/*     */     //   152: areturn
/*     */     //   153: aload_0
/*     */     //   154: getfield L$0 : Ljava/lang/Object;
/*     */     //   157: checkcast io/ktor/client/statement/HttpResponse
/*     */     //   160: astore_2
/*     */     //   161: aload_1
/*     */     //   162: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   165: aload_1
/*     */     //   166: checkcast java/lang/String
/*     */     //   169: astore_3
/*     */     //   170: new ai/grazie/utils/http/JsonKtorHTTPClient$KtorHttpException
/*     */     //   173: dup
/*     */     //   174: aload_2
/*     */     //   175: invokevirtual getStatus : ()Lio/ktor/http/HttpStatusCode;
/*     */     //   178: invokevirtual getValue : ()I
/*     */     //   181: aload_0
/*     */     //   182: getfield $request : Lio/ktor/client/request/HttpRequestBuilder;
/*     */     //   185: invokevirtual getUrl : ()Lio/ktor/http/URLBuilder;
/*     */     //   188: invokevirtual buildString : ()Ljava/lang/String;
/*     */     //   191: aload_3
/*     */     //   192: aconst_null
/*     */     //   193: bipush #8
/*     */     //   195: aconst_null
/*     */     //   196: invokespecial <init> : (ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   199: athrow
/*     */     //   200: aload_0
/*     */     //   201: getfield $body : Lkotlin/jvm/functions/Function2;
/*     */     //   204: aload_2
/*     */     //   205: aload_0
/*     */     //   206: aload_0
/*     */     //   207: iconst_3
/*     */     //   208: putfield label : I
/*     */     //   211: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   216: dup
/*     */     //   217: aload #6
/*     */     //   219: if_acmpne -> 230
/*     */     //   222: aload #6
/*     */     //   224: areturn
/*     */     //   225: aload_1
/*     */     //   226: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   229: aload_1
/*     */     //   230: areturn
/*     */     //   231: new java/lang/IllegalStateException
/*     */     //   234: dup
/*     */     //   235: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   237: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   240: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #193	-> 3
/*     */     //   #194	-> 44
/*     */     //   #218	-> 61
/*     */     //   #193	-> 89
/*     */     //   #218	-> 100
/*     */     //   #194	-> 101
/*     */     //   #195	-> 105
/*     */     //   #196	-> 115
/*     */     //   #193	-> 150
/*     */     //   #197	-> 170
/*     */     //   #199	-> 200
/*     */     //   #193	-> 222
/*     */     //   #199	-> 230
/*     */     //   #193	-> 231
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   105	48	2	result	Lio/ktor/client/statement/HttpResponse;
/*     */     //   161	39	2	result	Lio/ktor/client/statement/HttpResponse;
/*     */     //   200	16	2	result	Lio/ktor/client/statement/HttpResponse;
/*     */     //   58	25	3	$this$request$iv	Lio/ktor/client/HttpClient;
/*     */     //   170	30	3	errorText	Ljava/lang/String;
/*     */     //   58	25	4	builder$iv	Lio/ktor/client/request/HttpRequestBuilder;
/*     */     //   61	31	5	$i$f$request	I
/*     */     //   44	187	0	this	Lai/grazie/utils/http/JsonKtorHTTPClient$sendAndWaitBody$2;
/*     */     //   44	187	1	$result	Ljava/lang/Object;
/*     */     //   95	6	5	$i$f$request	I
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super JsonKtorHTTPClient$sendAndWaitBody$2> $completion) {
/*     */     return (Continuation<Unit>)new JsonKtorHTTPClient$sendAndWaitBody$2(this.$request, this.$body, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object invoke(@NotNull HttpRequestBuilder p1, @Nullable Continuation<?> p2) {
/*     */     return ((JsonKtorHTTPClient$sendAndWaitBody$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JsonKtorHTTPClient.kt", l = {218}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.utils.http.JsonKtorHTTPClient$sendAndWaitBody$2$errorText$1")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001\"\004\b\000\020\002H@"}, d2 = {"<anonymous>", "", "T"})
/*     */   @SourceDebugExtension({"SMAP\nJsonKtorHTTPClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonKtorHTTPClient.kt\nai/grazie/utils/http/JsonKtorHTTPClient$sendAndWaitBody$2$errorText$1\n+ 2 HttpClientCall.kt\nio/ktor/client/call/HttpClientCallKt\n+ 3 TypeInfoJvm.kt\nio/ktor/util/reflect/TypeInfoJvmKt\n*L\n1#1,217:1\n155#2:218\n17#3,3:219\n*S KotlinDebug\n*F\n+ 1 JsonKtorHTTPClient.kt\nai/grazie/utils/http/JsonKtorHTTPClient$sendAndWaitBody$2$errorText$1\n*L\n196#1:218\n196#1:219,3\n*E\n"})
/*     */   static final class JsonKtorHTTPClient$sendAndWaitBody$2$errorText$1
/*     */     extends SuspendLambda
/*     */     implements Function1<Continuation<? super String>, Object>
/*     */   {
/*     */     int label;
/*     */     
/*     */     JsonKtorHTTPClient$sendAndWaitBody$2$errorText$1(HttpResponse $result, Continuation $completion) {
/*     */       super(1, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       HttpResponse $this$body$iv;
/*     */       int $i$f$body, $i$f$typeInfo;
/*     */       KType kType$iv$iv;
/*     */       Type reifiedType$iv$iv;
/* 196 */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$body$iv = this.$result; $i$f$body = 0;
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
/* 218 */           $i$f$typeInfo = 0;
/* 219 */           kType$iv$iv = Reflection.typeOf(String.class);
/* 220 */           reifiedType$iv$iv = TypesJVMKt.getJavaType(kType$iv$iv); this.label = 1;
/* 221 */           if ($this$body$iv.getCall().bodyNullable(TypeInfoJvmKt.typeInfoImpl(reifiedType$iv$iv, Reflection.getOrCreateKotlinClass(String.class), kType$iv$iv), (Continuation)this) == object) return object;  if ($this$body$iv.getCall().bodyNullable(TypeInfoJvmKt.typeInfoImpl(reifiedType$iv$iv, Reflection.getOrCreateKotlinClass(String.class), kType$iv$iv), (Continuation)this) == null) throw new NullPointerException("null cannot be cast to non-null type kotlin.String");  return $this$body$iv.getCall().bodyNullable(TypeInfoJvmKt.typeInfoImpl(reifiedType$iv$iv, Reflection.getOrCreateKotlinClass(String.class), kType$iv$iv), (Continuation)this);
/*     */         case 1:
/*     */           $i$f$body = 0;
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           if (SYNTHETIC_LOCAL_VARIABLE_1 == null)
/*     */             throw new NullPointerException("null cannot be cast to non-null type kotlin.String"); 
/*     */           return SYNTHETIC_LOCAL_VARIABLE_1; }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@NotNull Continuation<? super JsonKtorHTTPClient$sendAndWaitBody$2$errorText$1> $completion) {
/*     */       return (Continuation<Unit>)new JsonKtorHTTPClient$sendAndWaitBody$2$errorText$1(this.$result, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@Nullable Continuation<?> p1) {
/*     */       return ((JsonKtorHTTPClient$sendAndWaitBody$2$errorText$1)create(p1)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/http/JsonKtorHTTPClient$sendAndWaitBody$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */