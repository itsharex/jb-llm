/*    */ package com.intellij.ml.llm.core.models.openai;
/*    */ import com.intellij.credentialStore.CredentialAttributes;
/*    */ import com.intellij.credentialStore.Credentials;
/*    */ import com.intellij.ide.passwordSafe.PasswordSafe;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Service({Service.Level.APP})
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\002\b\005\n\002\020\002\n\002\b\t\b\007\030\000 \0242\0020\001:\001\024B\005¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\006H\002J\022\020\007\032\004\030\0010\0062\006\020\005\032\0020\006H\002J\b\020\b\032\004\030\0010\006J\b\020\t\032\004\030\0010\006J\b\020\n\032\004\030\0010\006J\032\020\013\032\0020\f2\006\020\005\032\0020\0062\b\020\r\032\004\030\0010\006H\002J\016\020\016\032\0020\f2\006\020\017\032\0020\006J\016\020\020\032\0020\f2\006\020\021\032\0020\006J\020\020\022\032\0020\f2\b\020\023\032\004\030\0010\006¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/core/models/openai/CredentialsHolder;", "", "()V", "createCredentialAttributes", "Lcom/intellij/credentialStore/CredentialAttributes;", "key", "", "getCredentials", "getOpenAiApiKey", "getOpenAiOrganization", "getProxyServerToken", "setCredentials", "", "password", "setOpenAiApiKey", "apiKey", "setOpenAiOrganization", "organizationKey", "setProxyServerToken", "proxyToken", "Companion", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nCredentialsHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CredentialsHolder.kt\ncom/intellij/ml/llm/core/models/openai/CredentialsHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
/*    */ public final class CredentialsHolder {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\006\020\003\032\0020\004¨\006\005"}, d2 = {"Lcom/intellij/ml/llm/core/models/openai/CredentialsHolder$Companion;", "", "()V", "getInstance", "Lcom/intellij/ml/llm/core/models/openai/CredentialsHolder;", "intellij.ml.llm"})
/*    */   @SourceDebugExtension({"SMAP\nCredentialsHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CredentialsHolder.kt\ncom/intellij/ml/llm/core/models/openai/CredentialsHolder$Companion\n+ 2 service.kt\ncom/intellij/openapi/components/ServiceKt\n*L\n1#1,66:1\n43#2,3:67\n*S KotlinDebug\n*F\n+ 1 CredentialsHolder.kt\ncom/intellij/ml/llm/core/models/openai/CredentialsHolder$Companion\n*L\n22#1:67,3\n*E\n"})
/*    */   public static final class Companion {
/*    */     @NotNull
/*    */     public final CredentialsHolder getInstance() {
/* 22 */       int $i$f$service = 0;
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
/* 67 */       Class<CredentialsHolder> serviceClass$iv = CredentialsHolder.class;
/* 68 */       Object object = ApplicationManager.getApplication().getService(serviceClass$iv); if (object == null)
/* 69 */         throw new RuntimeException("Cannot find service " + serviceClass$iv.getName() + " (classloader=" + serviceClass$iv.getClassLoader() + ", client=" + ClientId.Companion.getCurrentOrNull() + ")"); 
/*    */       return (CredentialsHolder)object;
/*    */     }
/*    */     
/*    */     private Companion() {}
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String getOpenAiApiKey() {
/*    */     return getCredentials("OPENAI_API_KEY");
/*    */   }
/*    */   
/*    */   public final void setOpenAiApiKey(@NotNull String apiKey) {
/*    */     Intrinsics.checkNotNullParameter(apiKey, "apiKey");
/*    */     setCredentials("OPENAI_API_KEY", apiKey);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String getOpenAiOrganization() {
/*    */     return getCredentials("OPENAI_ORGANIZATION");
/*    */   }
/*    */   
/*    */   public final void setOpenAiOrganization(@NotNull String organizationKey) {
/*    */     Intrinsics.checkNotNullParameter(organizationKey, "organizationKey");
/*    */     setCredentials("OPENAI_ORGANIZATION", organizationKey);
/*    */   }
/*    */   
/*    */   public final void setProxyServerToken(@Nullable String proxyToken) {
/*    */     setCredentials("PROXY_SERVER_TOKEN", proxyToken);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String getProxyServerToken() {
/*    */     return getCredentials("PROXY_SERVER_TOKEN");
/*    */   }
/*    */   
/*    */   private final String getCredentials(String key) {
/*    */     if (ApplicationKt.getApplication().isUnitTestMode())
/*    */       return null; 
/*    */     CredentialAttributes attributes = createCredentialAttributes(key);
/*    */     Credentials credentials = PasswordSafe.Companion.getInstance().get(attributes);
/*    */     if (credentials == null || credentials.getPasswordAsString() == null)
/*    */       credentials.getPasswordAsString(); 
/*    */     return System.getenv(key);
/*    */   }
/*    */   
/*    */   private final void setCredentials(String key, String password) {
/*    */     if (ApplicationKt.getApplication().isUnitTestMode())
/*    */       return; 
/*    */     CredentialAttributes attributes = createCredentialAttributes(key);
/*    */     String it = password;
/*    */     int $i$a$-let-CredentialsHolder$setCredentials$credentials$1 = 0;
/*    */     Credentials credentials = (password != null) ? new Credentials("default", it) : null;
/*    */     PasswordSafe.Companion.getInstance().set(attributes, credentials);
/*    */   }
/*    */   
/*    */   private final CredentialAttributes createCredentialAttributes(String key) {
/*    */     return new CredentialAttributes(CredentialAttributesKt.generateServiceName("LLM", key), null, null, false, 14, null);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/openai/CredentialsHolder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */