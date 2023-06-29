/*     */ package com.intellij.ml.llm.core.grazieAPI;
/*     */ 
/*     */ import ai.grazie.api.gateway.client.SuspendableAPIGatewayClient;
/*     */ import ai.grazie.auth.model.utils.AuthURLFacade;
/*     */ import ai.grazie.client.common.SuspendableHTTPClient;
/*     */ import ai.grazie.client.ktor.GrazieKtorHTTPClient;
/*     */ import ai.grazie.model.auth.v5.AuthData;
/*     */ import ai.grazie.model.llm.chat.LLMChat;
/*     */ import ai.grazie.model.llm.profile.LLMProfileID;
/*     */ import ai.grazie.model.llm.profile.OpenAIProfileIDs;
/*     */ import ai.grazie.utils.attributes.Attributes;
/*     */ import com.intellij.openapi.application.ApplicationInfo;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.util.ApplicationKt;
/*     */ import com.intellij.util.PlatformUtils;
/*     */ import io.ktor.client.HttpClientConfig;
/*     */ import io.ktor.client.engine.HttpClientEngineFactory;
/*     */ import io.ktor.client.engine.cio.CIO;
/*     */ import io.ktor.client.engine.cio.CIOEngineConfig;
/*     */ import io.ktor.client.plugins.HttpClientPlugin;
/*     */ import io.ktor.client.plugins.HttpTimeout;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.flow.Flow;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000N\n\000\n\002\020\013\n\002\b\003\n\002\020\016\n\002\b\005\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\032\006\020\022\032\0020\005\032&\020\023\032\004\030\0010\0242\b\020\025\032\004\030\0010\0262\b\b\002\020\027\032\0020\0012\b\b\002\020\030\032\0020\001\032S\020\031\032\n\022\004\022\0020\005\030\0010\0322\006\020\025\032\0020\0262\006\020\033\032\0020\0342\b\b\002\020\035\032\0020\0362\b\b\002\020\027\032\0020\0012\n\b\002\020\037\032\004\030\0010 2\b\b\002\020\030\032\0020\001H@ø\001\000¢\006\002\020!\032E\020\"\032\n\022\004\022\0020\005\030\0010\0322\006\020\025\032\0020\0262\006\020#\032\0020\0052\006\020\035\032\0020\0362\b\b\002\020\027\032\0020\0012\b\b\002\020\030\032\0020\001H@ø\001\000¢\006\002\020$\"\024\020\000\032\0020\0018BX\004¢\006\006\032\004\b\002\020\003\"\021\020\004\032\0020\0058F¢\006\006\032\004\b\006\020\007\"\024\020\b\032\0020\0058BX\004¢\006\006\032\004\b\t\020\007\"\016\020\n\032\0020\013X\004¢\006\002\n\000\"\024\020\f\032\0020\0058BX\004¢\006\006\032\004\b\r\020\007\"\036\020\016\032\f0\005¢\006\002\b\017¢\006\002\b\0208BX\004¢\006\006\032\004\b\021\020\007\002\004\n\002\b\031¨\006%"}, d2 = {"grazieIsStaging", "", "getGrazieIsStaging", "()Z", "grazieRequestUrl", "", "getGrazieRequestUrl", "()Ljava/lang/String;", "inviteCode", "getInviteCode", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "productName", "getProductName", "productVersion", "Lcom/intellij/openapi/util/NlsSafe;", "Lorg/jetbrains/annotations/NotNull;", "getProductVersion", "doGrazieAuthFacade", "grazieClient", "Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;", "project", "Lcom/intellij/openapi/project/Project;", "throwUnauthorizedException", "askForAuthentication", "sendGrazieChatRequest", "Lkotlinx/coroutines/flow/Flow;", "llmChat", "Lai/grazie/model/llm/chat/LLMChat;", "model", "Lai/grazie/model/llm/profile/LLMProfileID;", "attributes", "Lai/grazie/utils/attributes/Attributes;", "(Lcom/intellij/openapi/project/Project;Lai/grazie/model/llm/chat/LLMChat;Lai/grazie/model/llm/profile/LLMProfileID;ZLai/grazie/utils/attributes/Attributes;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendGrazieCompleteRequestGrazie", "prompt", "(Lcom/intellij/openapi/project/Project;Ljava/lang/String;Lai/grazie/model/llm/profile/LLMProfileID;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nGrazieAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrazieAPI.kt\ncom/intellij/ml/llm/core/grazieAPI/GrazieAPIKt\n+ 2 service.kt\ncom/intellij/openapi/components/ServiceKt\n+ 3 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,149:1\n43#2,3:150\n10#3:153\n*S KotlinDebug\n*F\n+ 1 GrazieAPI.kt\ncom/intellij/ml/llm/core/grazieAPI/GrazieAPIKt\n*L\n115#1:150,3\n38#1:153\n*E\n"})
/*     */ public final class GrazieAPIKt {
/*  38 */   static { int $i$f$logger = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 153 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(GrazieAPI.class), "getInstance(T::class.java)"); } @NotNull private static final Logger logger = Logger.getInstance(GrazieAPI.class);
/*     */   
/*     */   private static final boolean getGrazieIsStaging() {
/*     */     System.getProperty("idea.grazie.is.staging");
/*     */     return (System.getProperty("idea.grazie.is.staging") != null) ? ((Boolean.parseBoolean(System.getProperty("idea.grazie.is.staging")) == true)) : false;
/*     */   }
/*     */   
/*     */   private static final String getInviteCode() {
/*     */     return PlatformUtils.isAqua() ? "iPgsJUoRqacuynlWND3gomy8IOpeBT6MfDeYw44ShzvR7DoXCih3ttLt0dzS9zmTrBEmEaxiVwPdGen6I8ZXzwHnxaaYdnpYKjsA74r7ZKCGnxbYSMTjNKndDNdkt2Nj" : (PlatformUtils.isCLion() ? "nbYaJk9PBOck6mYfTaLsbgW4i5PyKcpSwOorbCIvpJhusw2BxPr6nc1H3T5GyqO9qn3QuTthx2ctPdkwWUCgrxfoPC40LHePD0KVmCImW3iLmRaboORPeGpJpkvucxjG" : (PlatformUtils.isDataGrip() ? "ns8jJ1MvcxOTFQaCfLtyHJUJAPPez3rfYGIYqHAt6UjpfZM1sRz1hgQjDCJNOgo1Z3CTb81pQmal4Fih28NDnvZee5CTU9V9WbstDmwTOAyQ8i6VOKCARVJHLMRhuxW6" : (PlatformUtils.isDataSpell() ? "LtCmNPSkEaJYue5MkG01GgYF0dn1KTocvye416KbsaJnHRJCRKjcvknzuGaZ5fnzWu3dG3lYv79eUWB8cHYh1g1FtoVDBw0w7OuvogIOMVGxpfHvRcaJvskp5nqTFShg" : (PlatformUtils.isGoIde() ? "UKNKxwhiGamY48HHmkxuQtR50oI9eYzM7wSZfPDHu3Mz9gk2yZMSIuzgx6T5KqC75AaIFr89qXn4ZPwRYFJgjlN4BWYdtgG0h6L5zftLOf7OAOtrqqMA1JrgDpJVJqRm" : (PlatformUtils.isPhpStorm() ? "b4G6GGkGl2NUDL4U8dVD4UCTwCkDg78JUv76LeATyr6zlsfjYrb9RUaChZscy7ybtOyTODEfeiru261NoFBBvHXYoGfYmomHWIxA2oK8U4xBPycRh1ZQ40HegdWZHNZ4" : (PlatformUtils.isPyCharm() ? "cCAX9tbqZlEoUZnQt3hden69e0L63nKKMw9EkEmMNzbqrUvWms8tpyad32jib1TLy6XMReh9jbFSV38lB7oIBnlPUTsxYQ34szHQIOQV4U8hgQNwzrvu18v0AWXgTAgh" : (PlatformUtils.isRider() ? "GRkKyX7dHuaaae9QUPay3DqmzD1Xjhc09gnMFMJ5jEGrkKaNNezuRU9ogdVTjNvz1KQIXHy6WV2YZHZ8WZqROAhhKC2zvvPbO2VzIzmu7WOe8TafEDobSDN7GvhYwulu" : (PlatformUtils.isRubyMine() ? "QUgpvizNPersM1nkJERM9suFIm06sMYiBl1QeJi0NQRK5TnsoIVG0TwNBah5GBMXc8wwdpLsBwNArPZmXDfKn0QqzWglK1Z7z3qmURbqAL1qiRQmCiwFtOTVEnOjKVgF" : (PlatformUtils.isWebStorm() ? "ZjM0RcnZQ1SOKeVnV8yUxeaOdlLERF7kVp3TUleiFjMGCtpMGIpiH1lK2PfUdCOYd6kFnVkvlJXFXD2QNQD7NzeR7mQ2gB9ZAaqDt4CZj2rpIh78N5bbuSHEVz7Qxw8w" : "7Bi1GKH1vymZHYJEvUkP5jreYoumsulj5keLTiGJSSnj2KvPN9ZkZlXeIFPySM2BFa0T1VgFRE9p0UPBLhg6lfxUrah3SuTb5aW5UNAy09LWeq92i1ZSJmBHymGwRddV")))))))));
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final String doGrazieAuthFacade() {
/*     */     return AuthURLFacade.Companion.getProd().getIntellij().invite(getInviteCode(), GrazieAuthRestServiceConsts.INSTANCE.getSERVICE_URL());
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final String getGrazieRequestUrl() {
/*     */     boolean bool = getGrazieIsStaging();
/*     */     if (!bool) {
/*     */     
/*     */     } else {
/*     */       throw new NoWhenBranchMatchedException();
/*     */     } 
/*     */     return (bool == true) ? "https://api.app.stgn.grazie.aws.intellij.net" : "JD-Core does not support Kotlin";
/*     */   }
/*     */   
/*     */   private static final String getProductName() {
/*     */     return ApplicationKt.getApplication().isUnitTestMode() ? "Intellij (TEST)" : "Intellij";
/*     */   }
/*     */   
/*     */   private static final String getProductVersion() {
/*     */     String str;
/*     */     try {
/*     */       str = ApplicationInfo.getInstance().getFullVersion();
/*     */     } catch (Throwable t) {
/*     */       str = "Unknown";
/*     */     } 
/*     */     Intrinsics.checkNotNullExpressionValue(str, "try {\n  ApplicationInfo.…hrowable) {\n  \"Unknown\"\n}");
/*     */     return str;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final Object sendGrazieChatRequest(@NotNull Project project, @NotNull LLMChat llmChat, @NotNull LLMProfileID model, boolean throwUnauthorizedException, @Nullable Attributes attributes, boolean askForAuthentication, @NotNull Continuation $completion) {
/*     */     SuspendableAPIGatewayClient client;
/*     */     if ((llmChat.getMessages()).length > 32) {
/*     */       logger.warn("Chat has more than 32 messages (" + (llmChat.getMessages()).length + "). Expect trouble...");
/*     */     } else {
/*     */       logger.info("Messages in chat: " + (llmChat.getMessages()).length);
/*     */     } 
/*     */     if (grazieClient(project, throwUnauthorizedException, askForAuthentication) == null) {
/*     */       grazieClient(project, throwUnauthorizedException, askForAuthentication);
/*     */       return null;
/*     */     } 
/*     */     return client.llm().chat(llmChat, model, attributes, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final Object sendGrazieCompleteRequestGrazie(@NotNull Project project, @NotNull String prompt, @NotNull LLMProfileID model, boolean throwUnauthorizedException, boolean askForAuthentication, @NotNull Continuation $completion) {
/*     */     SuspendableAPIGatewayClient client;
/*     */     if (grazieClient(project, throwUnauthorizedException, askForAuthentication) == null) {
/*     */       grazieClient(project, throwUnauthorizedException, askForAuthentication);
/*     */       return null;
/*     */     } 
/*     */     return LlmAPIClient.complete$default(client.llm(), prompt, model, null, $completion, 4, null);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final SuspendableAPIGatewayClient grazieClient(@Nullable Project project, boolean throwUnauthorizedException, boolean askForAuthentication) {
/*     */     int $i$f$service = 0;
/*     */     Class<GrazieAuthService> serviceClass$iv = GrazieAuthService.class;
/*     */     Object object = ApplicationManager.getApplication().getService(serviceClass$iv);
/*     */     if (object == null)
/*     */       throw new RuntimeException("Cannot find service " + serviceClass$iv.getName() + " (classloader=" + serviceClass$iv.getClassLoader() + ", client=" + ClientId.Companion.getCurrentOrNull() + ")"); 
/*     */     String token = ((GrazieAuthService)object).checkGrazieAuthToken(askForAuthentication ? project : null);
/*     */     if (token == null) {
/*     */       if (throwUnauthorizedException)
/*     */         throw new GrazieAuthorizationException(); 
/*     */       return null;
/*     */     } 
/*     */     return new SuspendableAPIGatewayClient(getGrazieRequestUrl(), (SuspendableHTTPClient)new SuspendableHTTPClient.WithV5((SuspendableHTTPClient)new GrazieKtorHTTPClient(new JsonKtorHTTPClient(HttpClientKt.HttpClient((HttpClientEngineFactory)CIO.INSTANCE, GrazieAPIKt$grazieClient$1.INSTANCE))), new AuthData(token, token, null, new GrazieAgent(getProductName(), getProductVersion()), 4, null)), AuthType.User, null, 8, null);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\002\030\002\n\002\030\002\n\000\020\000\032\0020\001*\b\022\004\022\0020\0030\002H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "Lio/ktor/client/HttpClientConfig;", "Lio/ktor/client/engine/cio/CIOEngineConfig;", "invoke"})
/*     */   static final class GrazieAPIKt$grazieClient$1 extends Lambda implements Function1<HttpClientConfig<CIOEngineConfig>, Unit> {
/*     */     public static final GrazieAPIKt$grazieClient$1 INSTANCE = new GrazieAPIKt$grazieClient$1();
/*     */     
/*     */     public final void invoke(@NotNull HttpClientConfig $this$HttpClient) {
/*     */       Intrinsics.checkNotNullParameter($this$HttpClient, "$this$HttpClient");
/*     */       $this$HttpClient.install((HttpClientPlugin)HttpTimeout.Plugin, null.INSTANCE);
/*     */     }
/*     */     
/*     */     GrazieAPIKt$grazieClient$1() {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/grazieAPI/GrazieAPIKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */