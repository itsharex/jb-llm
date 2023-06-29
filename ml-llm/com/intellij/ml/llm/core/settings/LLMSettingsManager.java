/*     */ package com.intellij.ml.llm.core.settings;
/*     */ import com.intellij.ml.llm.core.models.openai.CredentialsHolder;
/*     */ import com.intellij.ml.llm.core.models.openai.OpenAIRequestProviderImplKt;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMRequestProvider;
/*     */ import com.intellij.openapi.util.registry.Registry;
/*     */ import com.intellij.util.ApplicationKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Service({Service.Level.APP})
/*     */ @State(name = "LLMSettings", storages = {@Storage(value = "llm.for.code.xml", roamingType = RoamingType.DISABLED, exportable = true)})
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\020\013\n\002\b\003\n\002\020\002\n\002\b\013\b\007\030\000 \0322\b\022\004\022\0020\0020\001:\001\032B\005¢\006\002\020\003J\006\020\005\032\0020\006J\006\020\007\032\0020\bJ\006\020\t\032\0020\bJ\b\020\n\032\0020\002H\026J\006\020\013\032\0020\fJ\006\020\r\032\0020\fJ\006\020\016\032\0020\fJ\020\020\017\032\0020\0202\006\020\021\032\0020\002H\026J\016\020\022\032\0020\0202\006\020\023\032\0020\fJ\006\020\024\032\0020\020J\016\020\025\032\0020\0202\006\020\023\032\0020\fJ\016\020\026\032\0020\0202\006\020\027\032\0020\bJ\016\020\030\032\0020\0202\006\020\027\032\0020\bJ\006\020\031\032\0020\fR\016\020\004\032\0020\002X\016¢\006\002\n\000¨\006\033"}, d2 = {"Lcom/intellij/ml/llm/core/settings/LLMSettingsManager;", "Lcom/intellij/openapi/components/PersistentStateComponent;", "Lcom/intellij/ml/llm/core/settings/LLMSettings;", "()V", "state", "getActiveModel", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMRequestProvider;", "getOpenAiKey", "", "getOpenAiOrganization", "getState", "isDataSharingEnabled", "", "isNameSuggestionsEnabled", "isStreamingEnabled", "loadState", "", "newState", "setDataSharingEnabled", "newValue", "setDataSharingInitialized", "setNameSuggestionsEnabled", "setOpenAiKey", "key", "setOpenAiOrganization", "shouldShowDataSharingDialog", "Companion", "intellij.ml.llm"})
/*     */ public final class LLMSettingsManager implements PersistentStateComponent<LLMSettings> {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\006\020\003\032\0020\004¨\006\005"}, d2 = {"Lcom/intellij/ml/llm/core/settings/LLMSettingsManager$Companion;", "", "()V", "getInstance", "Lcom/intellij/ml/llm/core/settings/LLMSettingsManager;", "intellij.ml.llm"})
/*     */   @SourceDebugExtension({"SMAP\nLLMSettingsManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMSettingsManager.kt\ncom/intellij/ml/llm/core/settings/LLMSettingsManager$Companion\n+ 2 service.kt\ncom/intellij/openapi/components/ServiceKt\n*L\n1#1,108:1\n43#2,3:109\n*S KotlinDebug\n*F\n+ 1 LLMSettingsManager.kt\ncom/intellij/ml/llm/core/settings/LLMSettingsManager$Companion\n*L\n23#1:109,3\n*E\n"})
/*     */   public static final class Companion {
/*     */     @NotNull
/*     */     public final LLMSettingsManager getInstance() {
/*  23 */       int $i$f$service = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 109 */       Class<LLMSettingsManager> serviceClass$iv = LLMSettingsManager.class;
/* 110 */       Object object = ApplicationManager.getApplication().getService(serviceClass$iv); if (object == null)
/* 111 */         throw new RuntimeException("Cannot find service " + serviceClass$iv.getName() + " (classloader=" + serviceClass$iv.getClassLoader() + ", client=" + ClientId.Companion.getCurrentOrNull() + ")"); 
/*     */       return (LLMSettingsManager)object;
/*     */     }
/*     */     
/*     */     private Companion() {}
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private LLMSettings state = new LLMSettings();
/*     */   
/*     */   @NotNull
/*     */   public LLMSettings getState() {
/*     */     return this.state;
/*     */   }
/*     */   
/*     */   public void loadState(@NotNull LLMSettings newState) {
/*     */     Intrinsics.checkNotNullParameter(newState, "newState");
/*     */     this.state = newState;
/*     */   }
/*     */   
/*     */   public final boolean shouldShowDataSharingDialog() {
/*     */     return !this.state.isDataSharingOptionInitialized();
/*     */   }
/*     */   
/*     */   public final void setDataSharingInitialized() {
/*     */     this.state.setDataSharingOptionInitialized(true);
/*     */   }
/*     */   
/*     */   public final boolean isDataSharingEnabled() {
/*     */     return this.state.isDataSharingEnabled();
/*     */   }
/*     */   
/*     */   public final void setDataSharingEnabled(boolean newValue) {
/*     */     this.state.setDataSharingOption(newValue);
/*     */   }
/*     */   
/*     */   public final boolean isNameSuggestionsEnabled() {
/*     */     return this.state.isNameSuggestionsEnabled();
/*     */   }
/*     */   
/*     */   public final void setNameSuggestionsEnabled(boolean newValue) {
/*     */     this.state.setNameSuggestionsEnabled(newValue);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String getOpenAiKey() {
/*     */     if (ApplicationKt.getApplication().isHeadlessEnvironment())
/*     */       return ""; 
/*     */     if (CredentialsHolder.Companion.getInstance().getOpenAiApiKey() == null)
/*     */       CredentialsHolder.Companion.getInstance().getOpenAiApiKey(); 
/*     */     return "";
/*     */   }
/*     */   
/*     */   public final void setOpenAiKey(@NotNull String key) {
/*     */     Intrinsics.checkNotNullParameter(key, "key");
/*     */     CredentialsHolder.Companion.getInstance().setOpenAiApiKey(key);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String getOpenAiOrganization() {
/*     */     if (ApplicationKt.getApplication().isHeadlessEnvironment())
/*     */       return ""; 
/*     */     if (CredentialsHolder.Companion.getInstance().getOpenAiOrganization() == null)
/*     */       CredentialsHolder.Companion.getInstance().getOpenAiOrganization(); 
/*     */     return "";
/*     */   }
/*     */   
/*     */   public final void setOpenAiOrganization(@NotNull String key) {
/*     */     Intrinsics.checkNotNullParameter(key, "key");
/*     */     CredentialsHolder.Companion.getInstance().setOpenAiOrganization(key);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final LLMRequestProvider getActiveModel() {
/*     */     if (Registry.is("llm.for.code.enable.mock.requests"))
/*     */       return (LLMRequestProvider)OpenAIRequestProviderImplKt.getMockRequestProvider(); 
/*     */     if (Registry.is("llm.for.code.enable.name.suggestion.get.dataset"))
/*     */       return (LLMRequestProvider)OpenAIRequestProviderImplKt.getRequestProviderWriter(); 
/*     */     return (LLMRequestProvider)OpenAIRequestProviderImplKt.getGrazieRequestProvider();
/*     */   }
/*     */   
/*     */   public final boolean isStreamingEnabled() {
/*     */     return Registry.is("llm.streaming.enabled");
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/settings/LLMSettingsManager.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */