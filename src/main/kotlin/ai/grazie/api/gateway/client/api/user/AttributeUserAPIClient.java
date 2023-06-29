/*    */ package ai.grazie.api.gateway.client.api.user;
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import java.util.Set;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\"\n\002\030\002\n\002\b\005\b\026\030\0002\0020\0012\0020\002B%\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n¢\006\002\020\013J\037\020\f\032\0020\r2\f\020\016\032\b\022\004\022\0020\0200\017H@ø\001\000¢\006\002\020\021J\037\020\022\032\b\022\004\022\0020\0200\0172\006\020\023\032\0020\rH@ø\001\000¢\006\002\020\024\002\004\n\002\b\031¨\006\025"}, d2 = {"Lai/grazie/api/gateway/client/api/user/AttributeUserAPIClient;", "Lai/grazie/client/attribute/SuspendableAttributeAPIClient;", "Lai/grazie/client/common/cloud/SuspendableCloudClient;", "serverUrl", "", "authType", "Lai/grazie/model/cloud/AuthType;", "httpClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "json", "Lai/grazie/utils/json/JSON;", "(Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/utils/json/JSON;)V", "get", "Lai/grazie/utils/attributes/Attributes;", "keys", "", "Lai/grazie/utils/attributes/Attributes$Key;", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "store", "attrs", "(Lai/grazie/utils/attributes/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api-gateway-client"})
/*    */ @SourceDebugExtension({"SMAP\nAttributeUserAPIClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttributeUserAPIClient.kt\nai/grazie/api/gateway/client/api/user/AttributeUserAPIClient\n+ 2 SuspendableCloudClient.kt\nai/grazie/client/common/cloud/SuspendableCloudClient\n+ 3 Serializers.kt\nkotlinx/serialization/SerializersKt__SerializersKt\n+ 4 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,25:1\n53#2,6:26\n53#2,6:34\n24#3:32\n24#3:40\n80#4:33\n80#4:41\n*S KotlinDebug\n*F\n+ 1 AttributeUserAPIClient.kt\nai/grazie/api/gateway/client/api/user/AttributeUserAPIClient\n*L\n15#1:26,6\n20#1:34,6\n15#1:32\n20#1:40\n15#1:33\n20#1:41\n*E\n"})
/*    */ public class AttributeUserAPIClient extends SuspendableCloudClient implements SuspendableAttributeAPIClient {
/*    */   public AttributeUserAPIClient(@NotNull String serverUrl, @NotNull AuthType authType, @NotNull SuspendableHTTPClient httpClient, @NotNull JSON json) {
/* 12 */     super(serverUrl, authType, httpClient, json, new ai.grazie.model.cloud.AuthVersion[0]);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object store(@NotNull Attributes attrs, @NotNull Continuation<? super Set<? extends Attributes.Key>> $completion) {
/*    */     return store$suspendImpl(this, attrs, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object get(@NotNull Set<? extends Attributes.Key> keys, @NotNull Continuation<? super Attributes> $completion) {
/*    */     return get$suspendImpl(this, keys, $completion);
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "AttributeUserAPIClient.kt", l = {31}, i = {}, s = {}, n = {}, m = "get$suspendImpl", c = "ai.grazie.api.gateway.client.api.user.AttributeUserAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class AttributeUserAPIClient$get$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     AttributeUserAPIClient$get$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return AttributeUserAPIClient.get$suspendImpl(AttributeUserAPIClient.this, null, (Continuation<? super Attributes>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "AttributeUserAPIClient.kt", l = {31}, i = {}, s = {}, n = {}, m = "store$suspendImpl", c = "ai.grazie.api.gateway.client.api.user.AttributeUserAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class AttributeUserAPIClient$store$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     AttributeUserAPIClient$store$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return AttributeUserAPIClient.store$suspendImpl(AttributeUserAPIClient.this, null, (Continuation<? super Set<? extends Attributes.Key>>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/client/api/user/AttributeUserAPIClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */