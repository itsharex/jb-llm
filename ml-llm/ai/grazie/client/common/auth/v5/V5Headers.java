/*    */ package ai.grazie.client.common.auth.v5;
/*    */ import ai.grazie.client.common.model.RequestOptions;
/*    */ import ai.grazie.model.auth.GrazieAgent;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\002\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J4\020\003\032\0020\0042\006\020\005\032\0020\0062\b\020\007\032\004\030\0010\0062\b\020\b\032\004\030\0010\0062\b\020\t\032\004\030\0010\n2\006\020\013\032\0020\004¨\006\f"}, d2 = {"Lai/grazie/client/common/auth/v5/V5Headers;", "", "()V", "append", "Lai/grazie/client/common/model/RequestOptions;", "token", "", "userToken", "originalServiceToken", "agent", "Lai/grazie/model/auth/GrazieAgent;", "options", "client-common"})
/*    */ @SourceDebugExtension({"SMAP\nV5Headers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 V5Headers.kt\nai/grazie/client/common/auth/v5/V5Headers\n+ 2 JSON.kt\nai/grazie/utils/json/JSON\n+ 3 Serializers.kt\nkotlinx/serialization/SerializersKt__SerializersKt\n+ 4 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,23:1\n28#2:24\n24#3:25\n80#4:26\n*S KotlinDebug\n*F\n+ 1 V5Headers.kt\nai/grazie/client/common/auth/v5/V5Headers\n*L\n19#1:24\n19#1:25\n19#1:26\n*E\n"})
/*    */ public final class V5Headers {
/*    */   @NotNull
/*    */   public final RequestOptions append(@NotNull String token, @Nullable String userToken, @Nullable String originalServiceToken, @Nullable GrazieAgent agent, @NotNull RequestOptions options) {
/* 16 */     Intrinsics.checkNotNullParameter(token, "token"); Intrinsics.checkNotNullParameter(options, "options"); options.getHeaders().add("Grazie-Authenticate-JWT", token);
/* 17 */     if (userToken != null) options.getHeaders().add("Grazie-Original-User-JWT", userToken); 
/* 18 */     if (originalServiceToken != null) options.getHeaders().add("Grazie-Original-Service-JWT", originalServiceToken); 
/* 19 */     if (agent != null) { JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$string = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 24 */       int $i$f$serializer = 0;
/* 25 */       KSerializer $this$cast$iv$iv$iv = SerializersKt.serializer(Reflection.typeOf(GrazieAgent.class)); int $i$f$cast = 0;
/* 26 */       Intrinsics.checkNotNull($this$cast$iv$iv$iv, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>"); options.getHeaders().add("Grazie-Agent", this_$iv.string((SerializationStrategy)$this$cast$iv$iv$iv, agent)); }
/*    */     
/*    */     return options;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final V5Headers INSTANCE = new V5Headers();
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/client/common/auth/v5/V5Headers.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */