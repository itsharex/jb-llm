/*    */ package com.intellij.ml.llm.cicd.gen;
/*    */ import com.intellij.ml.llm.cicd.gen.prompts.CiPromptFactory;
/*    */ import com.intellij.ml.llm.core.models.SenderKt;
/*    */ import com.intellij.ml.llm.core.models.requestResponse.LLMBaseResponse;
/*    */ import com.intellij.ml.llm.core.models.requestResponse.LLMResponseChoice;
/*    */ import com.intellij.openapi.diagnostic.Logger;
/*    */ import com.intellij.openapi.progress.ProgressIndicator;
/*    */ import com.intellij.openapi.progress.ProgressManager;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.util.concurrency.AppExecutorUtil;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.coroutines.CoroutineContext;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.text.StringsKt;
/*    */ import kotlinx.coroutines.CoroutineExceptionHandler;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Service
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\005\b\007\030\0002\0020\001B\005¢\006\002\020\002J\036\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\n2\006\020\016\032\0020\nJ\036\020\017\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\n2\006\020\016\032\0020\nJ \020\020\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\n2\006\020\016\032\0020\nH\002R\016\020\003\032\0020\004XD¢\006\002\n\000R\016\020\005\032\0020\006X\004¢\006\002\n\000R\016\020\007\032\0020\bX\004¢\006\002\n\000¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/cicd/gen/CICDGenService;", "", "()V", "MAX_TOKENS", "", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "generateConfig", "", "project", "Lcom/intellij/openapi/project/Project;", "toolchain", "description", "generateConfigUnderProgress", "preparePrompt", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nCiConfigGenerationService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CiConfigGenerationService.kt\ncom/intellij/ml/llm/cicd/gen/CICDGenService\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,66:1\n10#2:67\n48#3,4:68\n*S KotlinDebug\n*F\n+ 1 CiConfigGenerationService.kt\ncom/intellij/ml/llm/cicd/gen/CICDGenService\n*L\n23#1:67\n29#1:68,4\n*E\n"})
/*    */ public final class CICDGenService {
/*    */   public CICDGenService() {
/* 23 */     int $i$f$logger = 0;
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
/* 67 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(CICDGenService.class), "getInstance(T::class.java)"); this.logger = Logger.getInstance(CICDGenService.class); this.MAX_TOKENS = 1000; Intrinsics.checkNotNullExpressionValue(AppExecutorUtil.getAppExecutorService(), "getAppExecutorService()"); int $i$f$CoroutineExceptionHandler = 0;
/* 68 */     CoroutineExceptionHandler.Key key = CoroutineExceptionHandler.Key; this.scope = CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(AppExecutorUtil.getAppExecutorService()).plus((CoroutineContext)new CoroutineName("javaClass")).plus((CoroutineContext)new CICDGenService$special$$inlined$CoroutineExceptionHandler$1(key, this)));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private final Logger logger;
/*    */   private final int MAX_TOKENS;
/*    */   @NotNull
/*    */   private final CoroutineScope scope;
/*    */   
/*    */   @NotNull
/*    */   public final String generateConfigUnderProgress(@NotNull Project project, @NotNull String toolchain, @NotNull String description) {
/*    */     Intrinsics.checkNotNullParameter(project, "project");
/*    */     Intrinsics.checkNotNullParameter(toolchain, "toolchain");
/*    */     Intrinsics.checkNotNullParameter(description, "description");
/*    */     Intrinsics.checkNotNullExpressionValue(ProgressManager.getInstance().run(new CICDGenService$generateConfigUnderProgress$1(this, toolchain, description)), "fun generateConfigUnderP…ption)\n        }\n      })");
/*    */     return (String)ProgressManager.getInstance().run(new CICDGenService$generateConfigUnderProgress$1(this, toolchain, description));
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\037\n\000\n\002\030\002\n\002\020\016\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000*\001\000\b\n\030\0002\022\022\004\022\0020\002\022\b\022\0060\003j\002`\0040\001J\020\020\005\032\0020\0022\006\020\006\032\0020\007H\024¨\006\b"}, d2 = {"com/intellij/ml/llm/cicd/gen/CICDGenService$generateConfigUnderProgress$1", "Lcom/intellij/openapi/progress/Task$WithResult;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "compute", "indicator", "Lcom/intellij/openapi/progress/ProgressIndicator;", "intellij.ml.llm"})
/*    */   public static final class CICDGenService$generateConfigUnderProgress$1 extends Task.WithResult<String, Exception> {
/*    */     CICDGenService$generateConfigUnderProgress$1(CICDGenService $receiver, String $toolchain, String $description) {
/*    */       super($project, "Generating config with LLM", true);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     protected String compute(@NotNull ProgressIndicator indicator) {
/*    */       Intrinsics.checkNotNullParameter(indicator, "indicator");
/*    */       return CICDGenService.this.generateConfig(this.$project, this.$toolchain, this.$description);
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String generateConfig(@NotNull Project project, @NotNull String toolchain, @NotNull String description) {
/*    */     LLMBaseResponse response;
/*    */     String output;
/*    */     Intrinsics.checkNotNullParameter(project, "project");
/*    */     Intrinsics.checkNotNullParameter(toolchain, "toolchain");
/*    */     Intrinsics.checkNotNullParameter(description, "description");
/*    */     String prompt = preparePrompt(project, toolchain, description);
/*    */     if (SenderKt.sendCompletionChatRequest$default(project, prompt, "", Integer.valueOf(this.MAX_TOKENS), null, null, null, null, null, 0, null, null, null, 8176, null) == null) {
/*    */       SenderKt.sendCompletionChatRequest$default(project, prompt, "", Integer.valueOf(this.MAX_TOKENS), null, null, null, null, null, 0, null, null, null, 8176, null);
/*    */       return "Internal error: failed to get/parse response";
/*    */     } 
/*    */     if ((LLMResponseChoice)CollectionsKt.firstOrNull(response.getSuggestions()) == null || ((LLMResponseChoice)CollectionsKt.firstOrNull(response.getSuggestions())).getText() == null) {
/*    */       ((LLMResponseChoice)CollectionsKt.firstOrNull(response.getSuggestions())).getText();
/*    */       return "Internal error: failed to extract suggestions";
/*    */     } 
/*    */     return StringsKt.trim(StringsKt.substringAfter$default(output, prompt, null, 2, null)).toString();
/*    */   }
/*    */   
/*    */   private final String preparePrompt(Project project, String toolchain, String description) {
/*    */     String str = toolchain;
/*    */     switch (str.hashCode()) {
/*    */       case 1962990769:
/*    */         if (str.equals("Space Automation"));
/*    */       case 1458796960:
/*    */         if (str.equals("GitHub Actions"));
/*    */       case -1018224727:
/*    */         if (str.equals("Travis CI"));
/*    */       default:
/*    */         break;
/*    */     } 
/*    */     CiPromptFactory promptBuilder = null;
/*    */     return String.valueOf((promptBuilder != null) ? promptBuilder.createPrompt(project, description) : null);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/cicd/gen/CICDGenService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */