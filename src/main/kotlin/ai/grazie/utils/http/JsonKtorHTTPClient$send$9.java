/*     */ package ai.grazie.utils.http;
/*     */ 
/*     */ import io.ktor.client.statement.HttpResponse;
/*     */ import java.lang.reflect.Type;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KType;
/*     */ import kotlin.reflect.TypesJVMKt;
/*     */ import kotlinx.serialization.KSerializer;
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
/*     */ @DebugMetadata(f = "JsonKtorHTTPClient.kt", l = {218, 142}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.utils.http.JsonKtorHTTPClient$send$9")
/*     */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 176, d1 = {"\000\020\n\002\b\003\n\002\020\000\n\002\b\002\n\002\030\002\020\000\032\004\030\001H\001\"\b\b\000\020\002*\0020\003\"\b\b\001\020\004*\0020\003\"\b\b\002\020\001*\0020\0032\006\020\005\032\0020\006H@"}, d2 = {"<anonymous>", "O", "I", "", "R", "it", "Lio/ktor/client/statement/HttpResponse;"})
/*     */ @SourceDebugExtension({"SMAP\nJsonKtorHTTPClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonKtorHTTPClient.kt\nai/grazie/utils/http/JsonKtorHTTPClient$send$9\n+ 2 HttpClientCall.kt\nio/ktor/client/call/HttpClientCallKt\n+ 3 TypeInfoJvm.kt\nio/ktor/util/reflect/TypeInfoJvmKt\n*L\n1#1,217:1\n155#2:218\n17#3,3:219\n*S KotlinDebug\n*F\n+ 1 JsonKtorHTTPClient.kt\nai/grazie/utils/http/JsonKtorHTTPClient$send$9\n*L\n139#1:218\n139#1:219,3\n*E\n"})
/*     */ public final class JsonKtorHTTPClient$send$9
/*     */   extends SuspendLambda
/*     */   implements Function2<HttpResponse, Continuation<? super O>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   public JsonKtorHTTPClient$send$9(KSerializer<R> $to, Function2<R, Continuation<? super O>, Object> $body, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object invokeSuspend(@NotNull Object $result) {
/*     */     // Byte code:
/*     */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   3: astore #9
/*     */     //   5: aload_0
/*     */     //   6: getfield label : I
/*     */     //   9: tableswitch default -> 177, 0 -> 36, 1 -> 109, 2 -> 167
/*     */     //   36: aload_1
/*     */     //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   40: aload_0
/*     */     //   41: getfield L$0 : Ljava/lang/Object;
/*     */     //   44: checkcast io/ktor/client/statement/HttpResponse
/*     */     //   47: astore_2
/*     */     //   48: aload_2
/*     */     //   49: astore #4
/*     */     //   51: iconst_0
/*     */     //   52: istore #5
/*     */     //   54: aload #4
/*     */     //   56: invokevirtual getCall : ()Lio/ktor/client/call/HttpClientCall;
/*     */     //   59: iconst_0
/*     */     //   60: istore #6
/*     */     //   62: ldc java/lang/String
/*     */     //   64: invokestatic nullableTypeOf : (Ljava/lang/Class;)Lkotlin/reflect/KType;
/*     */     //   67: astore #7
/*     */     //   69: aload #7
/*     */     //   71: invokestatic getJavaType : (Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;
/*     */     //   74: astore #8
/*     */     //   76: aload #8
/*     */     //   78: ldc java/lang/String
/*     */     //   80: invokestatic getOrCreateKotlinClass : (Ljava/lang/Class;)Lkotlin/reflect/KClass;
/*     */     //   83: aload #7
/*     */     //   85: invokestatic typeInfoImpl : (Ljava/lang/reflect/Type;Lkotlin/reflect/KClass;Lkotlin/reflect/KType;)Lio/ktor/util/reflect/TypeInfo;
/*     */     //   88: aload_0
/*     */     //   89: checkcast kotlin/coroutines/Continuation
/*     */     //   92: aload_0
/*     */     //   93: iconst_1
/*     */     //   94: putfield label : I
/*     */     //   97: invokevirtual bodyNullable : (Lio/ktor/util/reflect/TypeInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   100: dup
/*     */     //   101: aload #9
/*     */     //   103: if_acmpne -> 117
/*     */     //   106: aload #9
/*     */     //   108: areturn
/*     */     //   109: iconst_0
/*     */     //   110: istore #5
/*     */     //   112: aload_1
/*     */     //   113: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   116: aload_1
/*     */     //   117: checkcast java/lang/String
/*     */     //   120: astore_3
/*     */     //   121: aload_3
/*     */     //   122: ifnull -> 175
/*     */     //   125: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*     */     //   128: aload_0
/*     */     //   129: getfield $to : Lkotlinx/serialization/KSerializer;
/*     */     //   132: checkcast kotlinx/serialization/DeserializationStrategy
/*     */     //   135: aload_3
/*     */     //   136: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*     */     //   139: astore #4
/*     */     //   141: aload_0
/*     */     //   142: getfield $body : Lkotlin/jvm/functions/Function2;
/*     */     //   145: aload #4
/*     */     //   147: aload_0
/*     */     //   148: aload_0
/*     */     //   149: iconst_2
/*     */     //   150: putfield label : I
/*     */     //   153: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   158: dup
/*     */     //   159: aload #9
/*     */     //   161: if_acmpne -> 172
/*     */     //   164: aload #9
/*     */     //   166: areturn
/*     */     //   167: aload_1
/*     */     //   168: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   171: aload_1
/*     */     //   172: goto -> 176
/*     */     //   175: aconst_null
/*     */     //   176: areturn
/*     */     //   177: new java/lang/IllegalStateException
/*     */     //   180: dup
/*     */     //   181: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   183: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   186: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #138	-> 3
/*     */     //   #139	-> 48
/*     */     //   #218	-> 54
/*     */     //   #219	-> 67
/*     */     //   #220	-> 69
/*     */     //   #221	-> 76
/*     */     //   #218	-> 92
/*     */     //   #138	-> 106
/*     */     //   #218	-> 117
/*     */     //   #139	-> 120
/*     */     //   #140	-> 121
/*     */     //   #141	-> 125
/*     */     //   #142	-> 141
/*     */     //   #138	-> 164
/*     */     //   #142	-> 172
/*     */     //   #143	-> 175
/*     */     //   #140	-> 176
/*     */     //   #138	-> 177
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   48	3	2	it	Lio/ktor/client/statement/HttpResponse;
/*     */     //   121	20	3	response	Ljava/lang/String;
/*     */     //   51	11	4	$this$body$iv	Lio/ktor/client/statement/HttpResponse;
/*     */     //   141	17	4	results	Ljava/lang/Object;
/*     */     //   69	19	7	kType$iv$iv	Lkotlin/reflect/KType;
/*     */     //   76	12	8	reifiedType$iv$iv	Ljava/lang/reflect/Type;
/*     */     //   62	26	6	$i$f$typeInfo	I
/*     */     //   54	55	5	$i$f$body	I
/*     */     //   40	137	0	this	Lai/grazie/utils/http/JsonKtorHTTPClient$send$9;
/*     */     //   40	137	1	$result	Ljava/lang/Object;
/*     */     //   112	8	5	$i$f$body	I
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object invokeSuspend$$forInline(@NotNull Object $result) {
/* 139 */     HttpResponse it = (HttpResponse)this.L$0, httpResponse1 = it; int $i$f$body = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 218 */     int $i$f$typeInfo = 0;
/* 219 */     KType kType$iv$iv = Reflection.nullableTypeOf(String.class);
/* 220 */     Type reifiedType$iv$iv = TypesJVMKt.getJavaType(kType$iv$iv);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super JsonKtorHTTPClient$send$9> $completion) {
/*     */     JsonKtorHTTPClient$send$9 jsonKtorHTTPClient$send$9 = new JsonKtorHTTPClient$send$9(this.$to, this.$body, $completion);
/*     */     jsonKtorHTTPClient$send$9.L$0 = value;
/*     */     return (Continuation<Unit>)jsonKtorHTTPClient$send$9;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object invoke(@NotNull HttpResponse p1, @Nullable Continuation<?> p2) {
/*     */     return ((JsonKtorHTTPClient$send$9)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/http/JsonKtorHTTPClient$send$9.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */