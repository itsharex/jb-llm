/*     */ package ai.grazie.utils.http;
/*     */ 
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @DebugMetadata(f = "JsonKtorHTTPClient.kt", l = {218}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.utils.http.JsonKtorHTTPClient$sendAndWaitBody$2$errorText$1")
/*     */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001\"\004\b\000\020\002H@"}, d2 = {"<anonymous>", "", "T"})
/*     */ @SourceDebugExtension({"SMAP\nJsonKtorHTTPClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonKtorHTTPClient.kt\nai/grazie/utils/http/JsonKtorHTTPClient$sendAndWaitBody$2$errorText$1\n+ 2 HttpClientCall.kt\nio/ktor/client/call/HttpClientCallKt\n+ 3 TypeInfoJvm.kt\nio/ktor/util/reflect/TypeInfoJvmKt\n*L\n1#1,217:1\n155#2:218\n17#3,3:219\n*S KotlinDebug\n*F\n+ 1 JsonKtorHTTPClient.kt\nai/grazie/utils/http/JsonKtorHTTPClient$sendAndWaitBody$2$errorText$1\n*L\n196#1:218\n196#1:219,3\n*E\n"})
/*     */ final class JsonKtorHTTPClient$sendAndWaitBody$2$errorText$1
/*     */   extends SuspendLambda
/*     */   implements Function1<Continuation<? super String>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   JsonKtorHTTPClient$sendAndWaitBody$2$errorText$1(HttpResponse $result, Continuation $completion) {
/*     */     super(1, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object invokeSuspend(@NotNull Object $result) {
/*     */     HttpResponse $this$body$iv;
/*     */     int $i$f$body, $i$f$typeInfo;
/*     */     KType kType$iv$iv;
/*     */     Type reifiedType$iv$iv;
/* 196 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$body$iv = this.$result; $i$f$body = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 218 */         $i$f$typeInfo = 0;
/* 219 */         kType$iv$iv = Reflection.typeOf(String.class);
/* 220 */         reifiedType$iv$iv = TypesJVMKt.getJavaType(kType$iv$iv); this.label = 1;
/* 221 */         if ($this$body$iv.getCall().bodyNullable(TypeInfoJvmKt.typeInfoImpl(reifiedType$iv$iv, Reflection.getOrCreateKotlinClass(String.class), kType$iv$iv), (Continuation)this) == object) return object;  if ($this$body$iv.getCall().bodyNullable(TypeInfoJvmKt.typeInfoImpl(reifiedType$iv$iv, Reflection.getOrCreateKotlinClass(String.class), kType$iv$iv), (Continuation)this) == null) throw new NullPointerException("null cannot be cast to non-null type kotlin.String");  return $this$body$iv.getCall().bodyNullable(TypeInfoJvmKt.typeInfoImpl(reifiedType$iv$iv, Reflection.getOrCreateKotlinClass(String.class), kType$iv$iv), (Continuation)this);
/*     */       case 1:
/*     */         $i$f$body = 0;
/*     */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */         if (SYNTHETIC_LOCAL_VARIABLE_1 == null)
/*     */           throw new NullPointerException("null cannot be cast to non-null type kotlin.String"); 
/*     */         return SYNTHETIC_LOCAL_VARIABLE_1; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Continuation<Unit> create(@NotNull Continuation<? super JsonKtorHTTPClient$sendAndWaitBody$2$errorText$1> $completion) {
/*     */     return (Continuation<Unit>)new JsonKtorHTTPClient$sendAndWaitBody$2$errorText$1(this.$result, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object invoke(@Nullable Continuation<?> p1) {
/*     */     return ((JsonKtorHTTPClient$sendAndWaitBody$2$errorText$1)create(p1)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/http/JsonKtorHTTPClient$sendAndWaitBody$2$errorText$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */