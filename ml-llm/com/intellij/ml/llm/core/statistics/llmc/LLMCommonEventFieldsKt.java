/*    */ package com.intellij.ml.llm.core.statistics.llmc;
/*    */ import com.intellij.ml.llm.LLMBundle;
/*    */ import com.intellij.ml.llm.core.settings.LLMSettingsManager;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\036\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\020\002\n\000\n\002\030\002\n\000\032\020\020\n\032\0020\0132\006\020\f\032\0020\rH\007\"\024\020\000\032\0020\001X\004¢\006\b\n\000\032\004\b\002\020\003\"\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\006\020\007\"\024\020\b\032\0020\005X\004¢\006\b\n\000\032\004\b\t\020\007¨\006\016"}, d2 = {"PROFILE", "Lcom/intellij/internal/statistic/eventLog/events/StringEventField;", "getPROFILE", "()Lcom/intellij/internal/statistic/eventLog/events/StringEventField;", "RESPONSE", "Lcom/intellij/ml/llm/core/statistics/llmc/RequestPrivateData;", "getRESPONSE", "()Lcom/intellij/ml/llm/core/statistics/llmc/RequestPrivateData;", "USER_REQUEST", "getUSER_REQUEST", "askDataSharingConsentIfNeeded", "", "project", "Lcom/intellij/openapi/project/Project;", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nLLMCommonEventFields.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMCommonEventFields.kt\ncom/intellij/ml/llm/core/statistics/llmc/LLMCommonEventFieldsKt\n+ 2 service.kt\ncom/intellij/openapi/components/ServiceKt\n*L\n1#1,33:1\n43#2,3:34\n*S KotlinDebug\n*F\n+ 1 LLMCommonEventFields.kt\ncom/intellij/ml/llm/core/statistics/llmc/LLMCommonEventFieldsKt\n*L\n24#1:34,3\n*E\n"})
/*    */ public final class LLMCommonEventFieldsKt {
/*    */   @NotNull
/* 11 */   private static final StringEventField PROFILE = EventFields.StringValidatedByCustomRule("profile", TrueValidationRule.class); @NotNull public static final StringEventField getPROFILE() { return PROFILE; } @NotNull
/* 12 */   private static final RequestPrivateData USER_REQUEST = new RequestPrivateData("request"); @NotNull public static final RequestPrivateData getUSER_REQUEST() { return USER_REQUEST; } @NotNull
/* 13 */   private static final RequestPrivateData RESPONSE = new RequestPrivateData("result"); @NotNull public static final RequestPrivateData getRESPONSE() { return RESPONSE; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @RequiresEdt
/*    */   public static final void askDataSharingConsentIfNeeded(@NotNull Project project) {
/* 24 */     Intrinsics.checkNotNullParameter(project, "project"); int $i$f$service = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 34 */     Class<LLMSettingsManager> serviceClass$iv = LLMSettingsManager.class;
/* 35 */     Object object = ApplicationManager.getApplication().getService(serviceClass$iv); if (object == null)
/* 36 */       throw new RuntimeException("Cannot find service " + serviceClass$iv.getName() + " (classloader=" + serviceClass$iv.getClassLoader() + ", client=" + ClientId.Companion.getCurrentOrNull() + ")"); 
/*    */     LLMSettingsManager settings = (LLMSettingsManager)object;
/*    */     if (settings.shouldShowDataSharingDialog()) {
/*    */       LLMSettingsManager.Companion.getInstance().setDataSharingInitialized();
/*    */       if (MessageDialogBuilder.Companion.yesNo(LLMBundle.message("notification.data.sharing.title", new Object[0]), LLMBundle.message("notification.data.sharing.message", new Object[0])).ask(project))
/*    */         settings.setDataSharingEnabled(true); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/statistics/llmc/LLMCommonEventFieldsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */