/*    */ package ai.grazie.api.gateway.client;
/*    */ import ai.grazie.api.gateway.client.api.FeedbackAPIClient;
/*    */ import ai.grazie.api.gateway.client.api.cloud.meta.NerAPIClient;
/*    */ import ai.grazie.api.gateway.client.api.cloud.meta.TreeAPIClient;
/*    */ import ai.grazie.api.gateway.client.api.cloud.trf.NmtAPIClient;
/*    */ import ai.grazie.api.gateway.client.api.cloud.trf.SumAPIClient;
/*    */ import ai.grazie.client.common.SuspendableHTTPClient;
/*    */ import ai.grazie.model.cloud.AuthType;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\026\030\0002\0020\001:\002\031\032B)\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007\022\b\b\002\020\b\032\0020\t¢\006\002\020\nJ\006\020\r\032\0020\016J\006\020\017\032\0020\020J\006\020\021\032\0020\022J\006\020\023\032\0020\024J\n\020\025\032\0060\026R\0020\000J\n\020\027\032\0060\030R\0020\000R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\013\020\f¨\006\033"}, d2 = {"Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;", "Lai/grazie/client/common/cloud/SuspendableCloudClient;", "serverUrl", "", "httpClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "authType", "Lai/grazie/model/cloud/AuthType;", "json", "Lai/grazie/utils/json/JSON;", "(Ljava/lang/String;Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/model/cloud/AuthType;Lai/grazie/utils/json/JSON;)V", "getAuthType", "()Lai/grazie/model/cloud/AuthType;", "auth", "Lai/grazie/api/gateway/client/api/AuthAPIClient;", "feedback", "Lai/grazie/api/gateway/client/api/FeedbackAPIClient;", "gec", "Lai/grazie/api/gateway/client/api/cloud/gec/GecAPIClient;", "llm", "Lai/grazie/api/gateway/client/api/cloud/llm/LlmAPIClient;", "meta", "Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient$Meta;", "trf", "Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient$Trf;", "Meta", "Trf", "api-gateway-client"})
/*    */ public class SuspendableAPIGatewayClient extends SuspendableCloudClient {
/*    */   @NotNull
/*    */   public AuthType getAuthType() {
/* 19 */     return this.authType;
/*    */   } @NotNull
/*    */   private final AuthType authType; public SuspendableAPIGatewayClient(@NotNull String serverUrl, @NotNull SuspendableHTTPClient httpClient, @NotNull AuthType authType, @NotNull JSON json) {
/* 22 */     super(serverUrl, authType, httpClient, json, arrayOfAuthVersion);
/*    */     this.authType = authType; } @NotNull
/* 24 */   public final AuthAPIClient auth() { return new AuthAPIClient(getServerUrl(), getAuthType(), getHttpClient(), getJson()); } @NotNull
/* 25 */   public final FeedbackAPIClient feedback() { return new FeedbackAPIClient(getServerUrl(), getAuthType(), getHttpClient(), getJson()); } @NotNull
/* 26 */   public final GecAPIClient gec() { return new GecAPIClient(getServerUrl(), getAuthType(), getHttpClient(), getJson()); }
/*    */   @NotNull
/* 28 */   public final LlmAPIClient llm() { return new LlmAPIClient(getServerUrl(), getAuthType(), getHttpClient(), getJson()); }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\004\030\0002\0020\001B\005¢\006\002\020\002J\006\020\003\032\0020\004J\006\020\005\032\0020\006J\006\020\007\032\0020\bJ\006\020\t\032\0020\n¨\006\013"}, d2 = {"Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient$Trf;", "", "(Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;)V", "nlc", "Lai/grazie/api/gateway/client/api/cloud/trf/NlcAPIClient;", "nmt", "Lai/grazie/api/gateway/client/api/cloud/trf/NmtAPIClient;", "sum", "Lai/grazie/api/gateway/client/api/cloud/trf/SumAPIClient;", "syn", "Lai/grazie/api/gateway/client/api/cloud/trf/SynAPIClient;", "api-gateway-client"})
/*    */   public final class Trf { @NotNull
/* 31 */     public final NlcAPIClient nlc() { return new NlcAPIClient(SuspendableAPIGatewayClient.this.getServerUrl(), SuspendableAPIGatewayClient.this.getAuthType(), SuspendableAPIGatewayClient.this.getHttpClient(), SuspendableAPIGatewayClient.this.getJson()); } @NotNull
/* 32 */     public final SynAPIClient syn() { return new SynAPIClient(SuspendableAPIGatewayClient.this.getServerUrl(), SuspendableAPIGatewayClient.this.getAuthType(), SuspendableAPIGatewayClient.this.getHttpClient(), SuspendableAPIGatewayClient.this.getJson()); } @NotNull
/* 33 */     public final NmtAPIClient nmt() { return new NmtAPIClient(SuspendableAPIGatewayClient.this.getServerUrl(), SuspendableAPIGatewayClient.this.getAuthType(), SuspendableAPIGatewayClient.this.getHttpClient(), SuspendableAPIGatewayClient.this.getJson()); } @NotNull
/* 34 */     public final SumAPIClient sum() { return new SumAPIClient(SuspendableAPIGatewayClient.this.getServerUrl(), SuspendableAPIGatewayClient.this.getAuthType(), SuspendableAPIGatewayClient.this.getHttpClient(), SuspendableAPIGatewayClient.this.getJson()); }
/*    */      }
/*    */   @NotNull
/* 37 */   public final Trf trf() { return new Trf(); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020 \n\000\b\004\030\0002\0020\001B\005¢\006\002\020\002J\006\020\003\032\0020\004J\006\020\005\032\0020\006J\022\020\007\032\0020\b2\n\b\002\020\t\032\004\030\0010\nJ\006\020\013\032\0020\fJ$\020\r\032\0020\0162\n\b\002\020\017\032\004\030\0010\n2\020\b\002\020\020\032\n\022\004\022\0020\n\030\0010\021¨\006\022"}, d2 = {"Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient$Meta;", "", "(Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;)V", "def", "Lai/grazie/api/gateway/client/api/cloud/meta/DefAPIClient;", "emb", "Lai/grazie/api/gateway/client/api/cloud/meta/EmbAPIClient;", "ner", "Lai/grazie/api/gateway/client/api/cloud/meta/NerAPIClient;", "version", "", "qa", "Lai/grazie/api/gateway/client/api/cloud/meta/QaAPIClient;", "tree", "Lai/grazie/api/gateway/client/api/cloud/meta/TreeAPIClient;", "parser", "options", "", "api-gateway-client"})
/*    */   public final class Meta { @NotNull
/*    */     public final DefAPIClient def() {
/* 40 */       return new DefAPIClient(SuspendableAPIGatewayClient.this.getServerUrl(), SuspendableAPIGatewayClient.this.getAuthType(), SuspendableAPIGatewayClient.this.getHttpClient(), SuspendableAPIGatewayClient.this.getJson());
/*    */     } @NotNull
/*    */     public final NerAPIClient ner(@Nullable String version) {
/* 43 */       return new NerAPIClient(SuspendableAPIGatewayClient.this.getServerUrl(), SuspendableAPIGatewayClient.this.getAuthType(), version, SuspendableAPIGatewayClient.this.getHttpClient(), SuspendableAPIGatewayClient.this.getJson());
/*    */     }
/*    */     @NotNull
/*    */     public final TreeAPIClient tree(@Nullable String parser, @Nullable List options) {
/* 47 */       return new TreeAPIClient(SuspendableAPIGatewayClient.this.getServerUrl(), SuspendableAPIGatewayClient.this.getAuthType(), parser, options, SuspendableAPIGatewayClient.this.getHttpClient(), SuspendableAPIGatewayClient.this.getJson());
/*    */     }
/*    */     @NotNull
/*    */     public final QaAPIClient qa() {
/* 51 */       return new QaAPIClient(SuspendableAPIGatewayClient.this.getServerUrl(), SuspendableAPIGatewayClient.this.getAuthType(), SuspendableAPIGatewayClient.this.getHttpClient(), SuspendableAPIGatewayClient.this.getJson());
/*    */     }
/*    */     @NotNull
/*    */     public final EmbAPIClient emb() {
/* 55 */       return new EmbAPIClient(SuspendableAPIGatewayClient.this.getServerUrl(), SuspendableAPIGatewayClient.this.getAuthType(), SuspendableAPIGatewayClient.this.getHttpClient(), SuspendableAPIGatewayClient.this.getJson());
/*    */     } }
/*    */   @NotNull
/*    */   public final Meta meta() {
/* 59 */     return new Meta();
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/client/SuspendableAPIGatewayClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */