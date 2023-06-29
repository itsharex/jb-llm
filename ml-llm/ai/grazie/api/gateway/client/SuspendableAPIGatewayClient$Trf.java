/*    */ package ai.grazie.api.gateway.client;
/*    */ 
/*    */ import ai.grazie.api.gateway.client.api.cloud.trf.NlcAPIClient;
/*    */ import ai.grazie.api.gateway.client.api.cloud.trf.NmtAPIClient;
/*    */ import ai.grazie.api.gateway.client.api.cloud.trf.SumAPIClient;
/*    */ import ai.grazie.api.gateway.client.api.cloud.trf.SynAPIClient;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\004\030\0002\0020\001B\005¢\006\002\020\002J\006\020\003\032\0020\004J\006\020\005\032\0020\006J\006\020\007\032\0020\bJ\006\020\t\032\0020\n¨\006\013"}, d2 = {"Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient$Trf;", "", "(Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;)V", "nlc", "Lai/grazie/api/gateway/client/api/cloud/trf/NlcAPIClient;", "nmt", "Lai/grazie/api/gateway/client/api/cloud/trf/NmtAPIClient;", "sum", "Lai/grazie/api/gateway/client/api/cloud/trf/SumAPIClient;", "syn", "Lai/grazie/api/gateway/client/api/cloud/trf/SynAPIClient;", "api-gateway-client"})
/*    */ public final class Trf
/*    */ {
/*    */   @NotNull
/*    */   public final NlcAPIClient nlc() {
/* 31 */     return new NlcAPIClient(SuspendableAPIGatewayClient.this.getServerUrl(), SuspendableAPIGatewayClient.this.getAuthType(), SuspendableAPIGatewayClient.this.getHttpClient(), SuspendableAPIGatewayClient.this.getJson()); } @NotNull
/* 32 */   public final SynAPIClient syn() { return new SynAPIClient(SuspendableAPIGatewayClient.this.getServerUrl(), SuspendableAPIGatewayClient.this.getAuthType(), SuspendableAPIGatewayClient.this.getHttpClient(), SuspendableAPIGatewayClient.this.getJson()); } @NotNull
/* 33 */   public final NmtAPIClient nmt() { return new NmtAPIClient(SuspendableAPIGatewayClient.this.getServerUrl(), SuspendableAPIGatewayClient.this.getAuthType(), SuspendableAPIGatewayClient.this.getHttpClient(), SuspendableAPIGatewayClient.this.getJson()); } @NotNull
/* 34 */   public final SumAPIClient sum() { return new SumAPIClient(SuspendableAPIGatewayClient.this.getServerUrl(), SuspendableAPIGatewayClient.this.getAuthType(), SuspendableAPIGatewayClient.this.getHttpClient(), SuspendableAPIGatewayClient.this.getJson()); }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/client/SuspendableAPIGatewayClient$Trf.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */