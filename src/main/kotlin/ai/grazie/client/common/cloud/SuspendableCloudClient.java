/*    */ package ai.grazie.client.common.cloud;
/*    */ 
/*    */ import ai.grazie.client.common.SuspendableHTTPClient;
/*    */ import ai.grazie.client.common.extensions.SuspendableClientExtensionsKt;
/*    */ import ai.grazie.client.common.model.HTTPResponse;
/*    */ import ai.grazie.client.common.model.Multipart;
/*    */ import ai.grazie.client.common.model.RequestOptions;
/*    */ import ai.grazie.model.cloud.API;
/*    */ import ai.grazie.model.cloud.AuthType;
/*    */ import ai.grazie.model.cloud.AuthVersion;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.InlineMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerializersKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000x\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\002\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\022\n\002\b\n\n\002\020\002\n\002\b\002\b&\030\0002\0020\001B=\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\006\020\006\032\0020\007\022\b\b\002\020\b\032\0020\t\022\022\020\n\032\n\022\006\b\001\022\0020\f0\013\"\0020\f¢\006\002\020\rJm\020\022\032\b\022\004\022\002H\0240\023\"\n\b\000\020\025\030\001*\0020\026\"\n\b\001\020\024\030\001*\0020\0272\006\020\030\032\0020\0312\006\020\032\032\002H\0252\016\b\002\020\033\032\b\022\004\022\002H\0240\0342\b\b\002\020\035\032\0020\0362\b\b\002\020\037\032\0020 2\b\b\002\020\b\032\0020\tHHø\001\000¢\006\002\020!J+\020\"\032\0020#2\006\020\030\032\0020\0312\006\020\032\032\0020$2\b\b\002\020\037\032\0020 H@ø\001\000¢\006\002\020%J#\020\"\032\0020#2\006\020\030\032\0020\0312\b\b\002\020\037\032\0020 H@ø\001\000¢\006\002\020&J+\020\"\032\0020#2\006\020\030\032\0020\0312\006\020\032\032\0020'2\b\b\002\020\037\032\0020 H@ø\001\000¢\006\002\020(J+\020\"\032\0020#2\006\020\030\032\0020\0312\006\020\032\032\0020\0032\b\b\002\020\037\032\0020 H@ø\001\000¢\006\002\020)JM\020*\032\002H\024\"\n\b\000\020\025\030\001*\0020\026\"\n\b\001\020\024\030\001*\0020\0262\006\020\030\032\0020\0312\006\020\032\032\002H\0252\b\b\002\020\037\032\0020 2\b\b\002\020\b\032\0020\tHHø\001\000¢\006\002\020+Je\020*\032\002H\024\"\b\b\000\020\025*\0020\026\"\b\b\001\020\024*\0020\0262\006\020\030\032\0020\0312\006\020\032\032\002H\0252\f\020,\032\b\022\004\022\002H\0250\0342\f\020-\032\b\022\004\022\002H\0240\0342\b\b\002\020\037\032\0020 2\b\b\002\020\b\032\0020\tH@ø\001\000¢\006\002\020.J9\020*\032\002H\024\"\n\b\000\020\024\030\001*\0020\0262\006\020\030\032\0020\0312\b\b\002\020\037\032\0020 2\b\b\002\020\b\032\0020\tHHø\001\000¢\006\002\020/JG\020*\032\002H\024\"\n\b\000\020\024\030\001*\0020\0262\006\020\030\032\0020\0312\f\020-\032\b\022\004\022\002H\0240\0342\b\b\002\020\037\032\0020 2\b\b\002\020\b\032\0020\tHHø\001\000¢\006\002\0200JA\0201\032\00202\"\n\b\000\020\025\030\001*\0020\0262\006\020\030\032\0020\0312\006\020\032\032\002H\0252\b\b\002\020\037\032\0020 2\b\b\002\020\b\032\0020\tHHø\001\000¢\006\002\020+JM\0201\032\0020#\"\b\b\000\020\025*\0020\0262\006\020\030\032\0020\0312\006\020\032\032\002H\0252\f\020,\032\b\022\004\022\002H\0250\0342\b\b\002\020\037\032\0020 2\b\b\002\020\b\032\0020\tH@ø\001\000¢\006\002\0203J#\0201\032\0020#2\006\020\030\032\0020\0312\b\b\002\020\037\032\0020 H@ø\001\000¢\006\002\020&R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\016\020\017R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\020\020\021\002\004\n\002\b\031¨\0064"}, d2 = {"Lai/grazie/client/common/cloud/SuspendableCloudClient;", "Lai/grazie/client/common/cloud/CloudClient;", "serverUrl", "", "authType", "Lai/grazie/model/cloud/AuthType;", "httpClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "json", "Lai/grazie/utils/json/JSON;", "supportedAuthVersions", "", "Lai/grazie/model/cloud/AuthVersion;", "(Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/utils/json/JSON;[Lai/grazie/model/cloud/AuthVersion;)V", "getHttpClient", "()Lai/grazie/client/common/SuspendableHTTPClient;", "getJson", "()Lai/grazie/utils/json/JSON;", "receiveContinuousSSE", "Lkotlinx/coroutines/flow/Flow;", "O", "I", "", "Lai/grazie/model/cloud/sse/continuous/Data;", "api", "Lai/grazie/model/cloud/API;", "content", "serializer", "Lkotlinx/serialization/KSerializer;", "reconnect", "", "options", "Lai/grazie/client/common/model/RequestOptions;", "(Lai/grazie/model/cloud/API;Ljava/lang/Object;Lkotlinx/serialization/KSerializer;ZLai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "send", "Lai/grazie/client/common/model/HTTPResponse;", "Lai/grazie/client/common/model/Multipart;", "(Lai/grazie/model/cloud/API;Lai/grazie/client/common/model/Multipart;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lai/grazie/model/cloud/API;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Lai/grazie/model/cloud/API;[BLai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lai/grazie/model/cloud/API;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendAndGet", "(Lai/grazie/model/cloud/API;Ljava/lang/Object;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "input", "output", "(Lai/grazie/model/cloud/API;Ljava/lang/Object;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lai/grazie/model/cloud/API;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lai/grazie/model/cloud/API;Lkotlinx/serialization/KSerializer;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendAndWait", "", "(Lai/grazie/model/cloud/API;Ljava/lang/Object;Lkotlinx/serialization/KSerializer;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "client-common"})
/*    */ @SourceDebugExtension({"SMAP\nSuspendableCloudClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendableCloudClient.kt\nai/grazie/client/common/cloud/SuspendableCloudClient\n+ 2 Serializers.kt\nkotlinx/serialization/SerializersKt__SerializersKt\n+ 3 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 4 SuspendableClientExtensions.kt\nai/grazie/client/common/extensions/SuspendableClientExtensionsKt\n+ 5 JSON.kt\nai/grazie/utils/json/JSON\n+ 6 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 7 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 8 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,89:1\n65#1:94\n24#2:90\n24#2:92\n24#2:97\n24#2:108\n24#2:110\n24#2:116\n80#3:91\n80#3:93\n80#3:98\n80#3:109\n80#3:111\n80#3:117\n83#4:95\n84#4:99\n85#4,3:105\n84#4,4:112\n28#5:96\n47#6:100\n49#6:104\n50#7:101\n55#7:103\n106#8:102\n*S KotlinDebug\n*F\n+ 1 SuspendableCloudClient.kt\nai/grazie/client/common/cloud/SuspendableCloudClient\n*L\n72#1:94\n58#1:90\n72#1:92\n79#1:97\n75#1:108\n79#1:110\n87#1:116\n58#1:91\n72#1:93\n79#1:98\n75#1:109\n79#1:111\n87#1:117\n79#1:95\n79#1:99\n79#1:105,3\n79#1:112,4\n79#1:96\n79#1:100\n79#1:104\n79#1:101\n79#1:103\n79#1:102\n*E\n"})
/*    */ public abstract class SuspendableCloudClient extends CloudClient {
/*    */   @NotNull
/*    */   private final SuspendableHTTPClient httpClient;
/*    */   @NotNull
/*    */   private final JSON json;
/*    */   
/*    */   @NotNull
/* 32 */   public final SuspendableHTTPClient getHttpClient() { return this.httpClient; } @NotNull
/* 33 */   public final JSON getJson() { return this.json; }
/*    */   
/* 35 */   public SuspendableCloudClient(@NotNull String serverUrl, @Nullable AuthType authType, @NotNull SuspendableHTTPClient httpClient, @NotNull JSON json, @NotNull AuthVersion... supportedAuthVersions) { super(serverUrl, authType, httpClient.getAuthVersion(), supportedAuthVersions);
/*    */     this.httpClient = httpClient;
/* 37 */     this.json = json; } @Nullable public final Object send(@NotNull API api, @NotNull String content, @NotNull RequestOptions options, @NotNull Continuation $completion) { return this.httpClient.send(url(api), content, options, $completion); } @Nullable
/* 38 */   public final Object send(@NotNull API api, @NotNull RequestOptions options, @NotNull Continuation $completion) { return this.httpClient.send(url(api), options, $completion); } @Nullable
/* 39 */   public final Object send(@NotNull API api, @NotNull byte[] content, @NotNull RequestOptions options, @NotNull Continuation $completion) { return this.httpClient.send(url(api), content, options, $completion); } @Nullable
/* 40 */   public final Object send(@NotNull API api, @NotNull Multipart content, @NotNull RequestOptions options, @NotNull Continuation $completion) { return this.httpClient.send(url(api), content, options, $completion); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final <I, O> Object sendAndGet(@NotNull API api, @NotNull Object content, @NotNull KSerializer input, @NotNull KSerializer output, @NotNull RequestOptions options, @NotNull JSON json, @NotNull Continuation $completion) {
/* 50 */     return SuspendableClientExtensionsKt.sendAndGet(this.httpClient, url(api), content, input, output, options, json, $completion);
/*    */   }
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
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final Object sendAndWait(@NotNull API api, @NotNull RequestOptions options, @NotNull Continuation $completion) {
/* 81 */     return this.httpClient.send(url(api), options, $completion);
/*    */   } @Nullable
/*    */   public final <I> Object sendAndWait(@NotNull API api, @NotNull Object content, @NotNull KSerializer input, @NotNull RequestOptions options, @NotNull JSON json, @NotNull Continuation $completion) {
/* 84 */     return this.httpClient.send(url(api), json.string((SerializationStrategy)input, content), options, $completion);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/client/common/cloud/SuspendableCloudClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */