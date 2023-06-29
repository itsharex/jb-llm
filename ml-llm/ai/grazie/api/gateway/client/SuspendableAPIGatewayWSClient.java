/*    */ package ai.grazie.api.gateway.client;
/*    */ 
/*    */ import ai.grazie.api.gateway.client.api.UserAPIClient;
/*    */ import ai.grazie.client.common.SuspendableHTTPClient;
/*    */ import ai.grazie.client.common.websocket.SuspendableWebSocketClient;
/*    */ import ai.grazie.model.cloud.AuthType;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\030\0002\0020\001B/\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\b\b\002\020\005\032\0020\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n¢\006\002\020\013R\021\020\f\032\0020\r¢\006\b\n\000\032\004\b\016\020\017¨\006\020"}, d2 = {"Lai/grazie/api/gateway/client/SuspendableAPIGatewayWSClient;", "Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;", "serverUrl", "", "wsServerUrl", "authType", "Lai/grazie/model/cloud/AuthType;", "httpClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "wsClient", "Lai/grazie/client/common/websocket/SuspendableWebSocketClient;", "(Ljava/lang/String;Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/client/common/websocket/SuspendableWebSocketClient;)V", "user", "Lai/grazie/api/gateway/client/api/UserAPIClient;", "getUser", "()Lai/grazie/api/gateway/client/api/UserAPIClient;", "api-gateway-client"})
/*    */ public final class SuspendableAPIGatewayWSClient extends SuspendableAPIGatewayClient {
/*    */   @NotNull
/*    */   private final UserAPIClient user;
/*    */   
/* 15 */   public SuspendableAPIGatewayWSClient(@NotNull String serverUrl, @NotNull String wsServerUrl, @NotNull AuthType authType, @NotNull SuspendableHTTPClient httpClient, @NotNull SuspendableWebSocketClient wsClient) { super(serverUrl, httpClient, authType, null, 8, null);
/* 16 */     this.user = new UserAPIClient(serverUrl, wsServerUrl, httpClient, (SuspendableWebSocketClient)new SuspendableWebSocketClient.WithV5(wsClient), (JSON)JSON.Default.INSTANCE, authType); } @NotNull public final UserAPIClient getUser() { return this.user; }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/client/SuspendableAPIGatewayWSClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */