/*     */ package com.intellij.ml.llm.core.statistics;
/*     */ import com.intellij.internal.statistic.eventLog.events.EventPair;
/*     */ import com.intellij.lang.Language;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Service
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000l\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\f\n\002\030\002\n\002\b\006\n\002\020\t\n\002\b\004\b\007\030\000 32\0020\001:\0013B\005¢\006\002\020\002J4\020\003\032\032\022\b\022\006\022\002\b\0030\0050\004j\f\022\b\022\006\022\002\b\0030\005`\0062\b\020\007\032\004\030\0010\b2\b\020\t\032\004\030\0010\nH\002J&\020\013\032\0020\f2\006\020\r\032\0020\0162\006\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\024J&\020\025\032\0020\f2\006\020\r\032\0020\0162\006\020\017\032\0020\0202\006\020\026\032\0020\0272\006\020\030\032\0020\031J\026\020\032\032\0020\0162\006\020\033\032\0020\0342\006\020\017\032\0020\020J\036\020\035\032\0020\f2\006\020\r\032\0020\0162\006\020\021\032\0020\0222\006\020\023\032\0020\024J\016\020\036\032\0020\0162\006\020\033\032\0020\034J6\020\037\032\0020\f2\006\020\r\032\0020\0162\006\020\021\032\0020\0222\006\020\023\032\0020\0242\n\b\002\020\007\032\004\030\0010\b2\n\b\002\020\t\032\004\030\0010\nJ0\020 \032\0020\f2\006\020\r\032\0020\0162\b\020\030\032\004\030\0010\0012\n\b\002\020\007\032\004\030\0010\b2\n\b\002\020\t\032\004\030\0010\nJ&\020!\032\0020\0162\006\020\033\032\0020\0342\n\b\002\020\007\032\004\030\0010\b2\n\b\002\020\t\032\004\030\0010\nJ6\020\"\032\0020\f2\006\020\r\032\0020\0162\006\020\021\032\0020\0222\006\020\023\032\0020\0242\n\b\002\020\007\032\004\030\0010\b2\n\b\002\020\t\032\004\030\0010\nJ&\020#\032\0020\0162\006\020\033\032\0020\0342\n\b\002\020\007\032\004\030\0010\b2\n\b\002\020\t\032\004\030\0010\nJ\030\020$\032\0020\f2\006\020\r\032\0020\0162\b\020%\032\004\030\0010\022J\016\020&\032\0020\0162\006\020\033\032\0020\034J \020'\032\0020\f2\006\020\r\032\0020\0162\006\020(\032\0020)2\b\020\030\032\004\030\0010\001J0\020*\032\0020\f2\006\020\r\032\0020\0162\b\020\030\032\004\030\0010\0012\n\b\002\020\007\032\004\030\0010\b2\n\b\002\020\t\032\004\030\0010\nJ\036\020+\032\0020\f2\006\020\r\032\0020\0162\006\020,\032\0020\0222\006\020-\032\0020\022J \020.\032\0020\f2\006\020\r\032\0020\0162\006\020/\032\002002\b\0201\032\004\030\0010\022J\016\0202\032\0020\f2\006\020\r\032\0020\016¨\0064"}, d2 = {"Lcom/intellij/ml/llm/core/statistics/CommonLoggerService;", "", "()V", "getTargetElementFields", "Ljava/util/ArrayList;", "Lcom/intellij/internal/statistic/eventLog/events/EventPair;", "Lkotlin/collections/ArrayList;", "element", "Lcom/intellij/psi/PsiElement;", "language", "Lcom/intellij/lang/Language;", "logCommitGenerationFinished", "", "activity", "Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;", "numberOfFiles", "", "suggestion", "", "state", "Lcom/intellij/ml/llm/core/statistics/FinishState;", "logCommitGenerationRequestSent", "profile", "Lai/grazie/model/llm/profile/LLMProfileID;", "body", "Lai/grazie/model/llm/chat/LLMChat;", "logCommitGenerationStarted", "project", "Lcom/intellij/openapi/project/Project;", "logCompletionFinished", "logCompletionStarted", "logDocumentationGenerationFinished", "logDocumentationGenerationRequestSent", "logDocumentationGenerationStarted", "logEditFinished", "logEditStarted", "logNameSuggestionFinished", "selected", "logNameSuggestionStarted", "logSendCompletionRequest", "type", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMRequestType;", "logSendEditRequest", "logSendNameSuggestionRequest", "originalName", "context", "logSendNameSuggestionResponse", "duration", "", "response", "logShowNameSuggestions", "Companion", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nCommonLoggerService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonLoggerService.kt\ncom/intellij/ml/llm/core/statistics/CommonLoggerService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,215:1\n1#2:216\n*E\n"})
/*     */ public final class CommonLoggerService {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\006\020\003\032\0020\004¨\006\005"}, d2 = {"Lcom/intellij/ml/llm/core/statistics/CommonLoggerService$Companion;", "", "()V", "getInstance", "Lcom/intellij/ml/llm/core/statistics/CommonLoggerService;", "intellij.ml.llm"})
/*     */   @SourceDebugExtension({"SMAP\nCommonLoggerService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonLoggerService.kt\ncom/intellij/ml/llm/core/statistics/CommonLoggerService$Companion\n+ 2 service.kt\ncom/intellij/openapi/components/ServiceKt\n*L\n1#1,215:1\n43#2,3:216\n*S KotlinDebug\n*F\n+ 1 CommonLoggerService.kt\ncom/intellij/ml/llm/core/statistics/CommonLoggerService$Companion\n*L\n26#1:216,3\n*E\n"})
/*     */   public static final class Companion {
/*     */     @NotNull
/*     */     public final CommonLoggerService getInstance() {
/*  26 */       int $i$f$service = 0;
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
/* 216 */       Class<CommonLoggerService> serviceClass$iv = CommonLoggerService.class;
/* 217 */       Object object = ApplicationManager.getApplication().getService(serviceClass$iv); if (object == null)
/* 218 */         throw new RuntimeException("Cannot find service " + serviceClass$iv.getName() + " (classloader=" + serviceClass$iv.getClassLoader() + ", client=" + ClientId.Companion.getCurrentOrNull() + ")"); 
/*     */       return (CommonLoggerService)object;
/*     */     }
/*     */     
/*     */     private Companion() {}
/*     */   }
/*     */   
/*     */   private final ArrayList<EventPair<?>> getTargetElementFields(PsiElement element, Language language) {
/*     */     EventPair[] arrayOfEventPair = new EventPair[1];
/*     */     arrayOfEventPair[0] = EventFields.Language.with(language);
/*     */     ArrayList<EventPair> result = CollectionsKt.arrayListOf((Object[])arrayOfEventPair);
/*     */     if (element != null) {
/*     */       PsiElement it = element;
/*     */       int $i$a$-let-CommonLoggerService$getTargetElementFields$1 = 0;
/*     */       result.add(CommonLoggerServiceKt.getTARGET_ELEMENT().with(element.getClass()));
/*     */     } else {
/*     */     
/*     */     } 
/*     */     return (ArrayList)result;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final CompositeStatisticsIdeActivity logEditStarted(@NotNull Project project, @Nullable PsiElement element, @Nullable Language language) {
/*     */     Intrinsics.checkNotNullParameter(project, "project");
/*     */     Function0<? extends List<? extends EventPair<?>>> dataSupplier = new CommonLoggerService$logEditStarted$dataSupplier$1(element, language);
/*     */     return new CompositeStatisticsIdeActivity(AIAssistantEventLogger.Companion.getEDIT_ACTION_ACTIVITY$intellij_ml_llm().started(project, dataSupplier), LLMEventLogger.Companion.getEDIT_ACTION_ACTIVITY$intellij_ml_llm().started(project, dataSupplier));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\020\000\032\032\022\b\022\006\022\002\b\0030\0020\001j\f\022\b\022\006\022\002\b\0030\002`\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/intellij/internal/statistic/eventLog/events/EventPair;", "Lkotlin/collections/ArrayList;", "invoke"})
/*     */   static final class CommonLoggerService$logEditStarted$dataSupplier$1 extends Lambda implements Function0<ArrayList<EventPair<?>>> {
/*     */     CommonLoggerService$logEditStarted$dataSupplier$1(PsiElement $element, Language $language) {
/*     */       super(0);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final ArrayList<EventPair<?>> invoke() {
/*     */       return CommonLoggerService.this.getTargetElementFields(this.$element, this.$language);
/*     */     }
/*     */   }
/*     */   
/*     */   public final void logSendEditRequest(@NotNull CompositeStatisticsIdeActivity activity, @Nullable Object body, @Nullable PsiElement element, @Nullable Language language) {
/*     */     Intrinsics.checkNotNullParameter(activity, "activity");
/*     */     activity.getFusActivity$intellij_ml_llm().stageStarted(AIAssistantEventLogger.Companion.getEDIT_REQUEST_SENT$intellij_ml_llm(), new CommonLoggerService$logSendEditRequest$1(element, language));
/*     */     activity.getLlmcActivity$intellij_ml_llm().stageStarted(LLMEventLogger.Companion.getEDIT_REQUEST_SENT$intellij_ml_llm(), new CommonLoggerService$logSendEditRequest$2(element, language, body));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020 \n\002\030\002\n\000\020\000\032\f\022\b\022\006\022\002\b\0030\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/internal/statistic/eventLog/events/EventPair;", "invoke"})
/*     */   static final class CommonLoggerService$logSendEditRequest$1 extends Lambda implements Function0<List<? extends EventPair<?>>> {
/*     */     @NotNull
/*     */     public final List<EventPair<?>> invoke() {
/*     */       return CommonLoggerService.this.getTargetElementFields(this.$element, this.$language);
/*     */     }
/*     */     
/*     */     CommonLoggerService$logSendEditRequest$1(PsiElement $element, Language $language) {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020 \n\002\030\002\n\000\020\000\032\f\022\b\022\006\022\002\b\0030\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/internal/statistic/eventLog/events/EventPair;", "invoke"})
/*     */   static final class CommonLoggerService$logSendEditRequest$2 extends Lambda implements Function0<List<? extends EventPair<?>>> {
/*     */     @NotNull
/*     */     public final List<EventPair<?>> invoke() {
/*     */       ArrayList<EventPair<?>> result = CommonLoggerService.this.getTargetElementFields(this.$element, this.$language);
/*     */       result.addAll(LLMEventLogger.Companion.extractChatRequestParameters$intellij_ml_llm(OpenAIProfileIDs.INSTANCE.getChatGPT().getId(), this.$body));
/*     */       return result;
/*     */     }
/*     */     
/*     */     CommonLoggerService$logSendEditRequest$2(PsiElement $element, Language $language, Object $body) {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */   
/*     */   public final void logEditFinished(@NotNull CompositeStatisticsIdeActivity activity, @NotNull String suggestion, @NotNull FinishState state, @Nullable PsiElement element, @Nullable Language language) {
/*     */     Intrinsics.checkNotNullParameter(activity, "activity");
/*     */     Intrinsics.checkNotNullParameter(suggestion, "suggestion");
/*     */     Intrinsics.checkNotNullParameter(state, "state");
/*     */     Function0<? extends List<? extends EventPair<?>>> dataSupplier = new CommonLoggerService$logEditFinished$dataSupplier$1(element, language);
/*     */     activity.finished(state, dataSupplier, new CommonLoggerService$logEditFinished$1(this, element, language));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\020\000\032\032\022\b\022\006\022\002\b\0030\0020\001j\f\022\b\022\006\022\002\b\0030\002`\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/intellij/internal/statistic/eventLog/events/EventPair;", "Lkotlin/collections/ArrayList;", "invoke"})
/*     */   static final class CommonLoggerService$logEditFinished$dataSupplier$1 extends Lambda implements Function0<ArrayList<EventPair<?>>> {
/*     */     CommonLoggerService$logEditFinished$dataSupplier$1(PsiElement $element, Language $language) {
/*     */       super(0);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final ArrayList<EventPair<?>> invoke() {
/*     */       return CommonLoggerService.this.getTargetElementFields(this.$element, this.$language);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020 \n\002\030\002\n\000\020\000\032\f\022\b\022\006\022\002\b\0030\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/internal/statistic/eventLog/events/EventPair;", "invoke"})
/*     */   static final class CommonLoggerService$logEditFinished$1 extends Lambda implements Function0<List<? extends EventPair<?>>> {
/*     */     @NotNull
/*     */     public final List<EventPair<?>> invoke() {
/*     */       EventPair[] arrayOfEventPair = new EventPair[1];
/*     */       arrayOfEventPair[0] = LLMCommonEventFieldsKt.getRESPONSE().with(this.$suggestion);
/*     */       ArrayList<EventPair<?>> result = CollectionsKt.arrayListOf((Object[])arrayOfEventPair);
/*     */       result.addAll(CommonLoggerService.this.getTargetElementFields(this.$element, this.$language));
/*     */       return result;
/*     */     }
/*     */     
/*     */     CommonLoggerService$logEditFinished$1(CommonLoggerService $receiver, PsiElement $element, Language $language) {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final CompositeStatisticsIdeActivity logCompletionStarted(@NotNull Project project) {
/*     */     Intrinsics.checkNotNullParameter(project, "project");
/*     */     return new CompositeStatisticsIdeActivity(ScoredIdeActivityDefinition.started$default(AIAssistantEventLogger.Companion.getCOMPLETION_ACTION_ACTIVITY$intellij_ml_llm(), project, null, 2, null), ScoredIdeActivityDefinition.started$default(LLMEventLogger.Companion.getCOMPLETION_ACTION_ACTIVITY$intellij_ml_llm(), project, null, 2, null));
/*     */   }
/*     */   
/*     */   public final void logSendCompletionRequest(@NotNull CompositeStatisticsIdeActivity activity, @NotNull LLMRequestType type, @Nullable Object body) {
/*     */     Intrinsics.checkNotNullParameter(activity, "activity");
/*     */     Intrinsics.checkNotNullParameter(type, "type");
/*     */     ScoredIdeActivity.stageStarted$default(activity.getFusActivity$intellij_ml_llm(), AIAssistantEventLogger.Companion.getCOMPLETION_REQUEST_SENT$intellij_ml_llm(), null, 2, null);
/*     */     activity.getLlmcActivity$intellij_ml_llm().stageStarted(LLMEventLogger.Companion.getCOMPLETION_REQUEST_SENT$intellij_ml_llm(), new CommonLoggerService$logSendCompletionRequest$1(body));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020 \n\002\030\002\n\000\020\000\032\f\022\b\022\006\022\002\b\0030\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/internal/statistic/eventLog/events/EventPair;", "invoke"})
/*     */   static final class CommonLoggerService$logSendCompletionRequest$1 extends Lambda implements Function0<List<? extends EventPair<?>>> {
/*     */     @NotNull
/*     */     public final List<EventPair<?>> invoke() {
/*     */       return LLMEventLogger.Companion.extractChatRequestParameters$intellij_ml_llm(OpenAIProfileIDs.INSTANCE.getChatGPT().getId(), this.$body);
/*     */     }
/*     */     
/*     */     CommonLoggerService$logSendCompletionRequest$1(Object $body) {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */   
/*     */   public final void logCompletionFinished(@NotNull CompositeStatisticsIdeActivity activity, @NotNull String suggestion, @NotNull FinishState state) {
/*     */     Intrinsics.checkNotNullParameter(activity, "activity");
/*     */     Intrinsics.checkNotNullParameter(suggestion, "suggestion");
/*     */     Intrinsics.checkNotNullParameter(state, "state");
/*     */     activity.finished(state, null, new CommonLoggerService$logCompletionFinished$1(suggestion));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020 \n\002\030\002\n\000\020\000\032\f\022\b\022\006\022\002\b\0030\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/internal/statistic/eventLog/events/EventPair;", "invoke"})
/*     */   static final class CommonLoggerService$logCompletionFinished$1 extends Lambda implements Function0<List<? extends EventPair<?>>> {
/*     */     @NotNull
/*     */     public final List<EventPair<?>> invoke() {
/*     */       EventPair[] arrayOfEventPair = new EventPair[1];
/*     */       arrayOfEventPair[0] = LLMCommonEventFieldsKt.getRESPONSE().with(this.$suggestion);
/*     */       return CollectionsKt.arrayListOf((Object[])arrayOfEventPair);
/*     */     }
/*     */     
/*     */     CommonLoggerService$logCompletionFinished$1(String $suggestion) {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final CompositeStatisticsIdeActivity logDocumentationGenerationStarted(@NotNull Project project, @Nullable PsiElement element, @Nullable Language language) {
/*     */     Intrinsics.checkNotNullParameter(project, "project");
/*     */     Function0<? extends List<? extends EventPair<?>>> dataSupplier = new CommonLoggerService$logDocumentationGenerationStarted$dataSupplier$1(element, language);
/*     */     return new CompositeStatisticsIdeActivity(AIAssistantEventLogger.Companion.getDOCUMENTATION_GENERATION$intellij_ml_llm().started(project, dataSupplier), LLMEventLogger.Companion.getDOCUMENTATION_GENERATION$intellij_ml_llm().started(project, dataSupplier));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\020\000\032\032\022\b\022\006\022\002\b\0030\0020\001j\f\022\b\022\006\022\002\b\0030\002`\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/intellij/internal/statistic/eventLog/events/EventPair;", "Lkotlin/collections/ArrayList;", "invoke"})
/*     */   static final class CommonLoggerService$logDocumentationGenerationStarted$dataSupplier$1 extends Lambda implements Function0<ArrayList<EventPair<?>>> {
/*     */     CommonLoggerService$logDocumentationGenerationStarted$dataSupplier$1(PsiElement $element, Language $language) {
/*     */       super(0);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final ArrayList<EventPair<?>> invoke() {
/*     */       return CommonLoggerService.this.getTargetElementFields(this.$element, this.$language);
/*     */     }
/*     */   }
/*     */   
/*     */   public final void logDocumentationGenerationRequestSent(@NotNull CompositeStatisticsIdeActivity activity, @Nullable Object body, @Nullable PsiElement element, @Nullable Language language) {
/*     */     Intrinsics.checkNotNullParameter(activity, "activity");
/*     */     activity.getFusActivity$intellij_ml_llm().stageStarted(AIAssistantEventLogger.Companion.getDOCUMENTATION_GENERATION_SENT$intellij_ml_llm(), new CommonLoggerService$logDocumentationGenerationRequestSent$1(element, language));
/*     */     activity.getLlmcActivity$intellij_ml_llm().stageStarted(LLMEventLogger.Companion.getDOCUMENTATION_GENERATION_SENT$intellij_ml_llm(), new CommonLoggerService$logDocumentationGenerationRequestSent$2(this, element, language));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020 \n\002\030\002\n\000\020\000\032\f\022\b\022\006\022\002\b\0030\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/internal/statistic/eventLog/events/EventPair;", "invoke"})
/*     */   static final class CommonLoggerService$logDocumentationGenerationRequestSent$1 extends Lambda implements Function0<List<? extends EventPair<?>>> {
/*     */     @NotNull
/*     */     public final List<EventPair<?>> invoke() {
/*     */       return CommonLoggerService.this.getTargetElementFields(this.$element, this.$language);
/*     */     }
/*     */     
/*     */     CommonLoggerService$logDocumentationGenerationRequestSent$1(PsiElement $element, Language $language) {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020 \n\002\030\002\n\000\020\000\032\f\022\b\022\006\022\002\b\0030\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/internal/statistic/eventLog/events/EventPair;", "invoke"})
/*     */   static final class CommonLoggerService$logDocumentationGenerationRequestSent$2 extends Lambda implements Function0<List<? extends EventPair<?>>> {
/*     */     @NotNull
/*     */     public final List<EventPair<?>> invoke() {
/*     */       Object object = this.$body;
/*     */       CommonLoggerService commonLoggerService = CommonLoggerService.this;
/*     */       PsiElement psiElement = this.$element;
/*     */       Language language = this.$language;
/*     */       List list1 = CollectionsKt.createListBuilder(), $this$invoke_u24lambda_u240 = list1;
/*     */       int $i$a$-buildList-CommonLoggerService$logDocumentationGenerationRequestSent$2$1 = 0;
/*     */       $this$invoke_u24lambda_u240.addAll(LLMEventLogger.Companion.extractChatRequestParameters$intellij_ml_llm(null, object));
/*     */       $this$invoke_u24lambda_u240.addAll(commonLoggerService.getTargetElementFields(psiElement, language));
/*     */       return CollectionsKt.build(list1);
/*     */     }
/*     */     
/*     */     CommonLoggerService$logDocumentationGenerationRequestSent$2(CommonLoggerService $receiver, PsiElement $element, Language $language) {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */   
/*     */   public final void logDocumentationGenerationFinished(@NotNull CompositeStatisticsIdeActivity activity, @NotNull String suggestion, @NotNull FinishState state, @Nullable PsiElement element, @Nullable Language language) {
/*     */     Intrinsics.checkNotNullParameter(activity, "activity");
/*     */     Intrinsics.checkNotNullParameter(suggestion, "suggestion");
/*     */     Intrinsics.checkNotNullParameter(state, "state");
/*     */     Function0<? extends List<? extends EventPair<?>>> dataSupplier = new CommonLoggerService$logDocumentationGenerationFinished$dataSupplier$1(element, language);
/*     */     activity.finished(state, dataSupplier, new CommonLoggerService$logDocumentationGenerationFinished$1(this, element, language));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\020\000\032\032\022\b\022\006\022\002\b\0030\0020\001j\f\022\b\022\006\022\002\b\0030\002`\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/intellij/internal/statistic/eventLog/events/EventPair;", "Lkotlin/collections/ArrayList;", "invoke"})
/*     */   static final class CommonLoggerService$logDocumentationGenerationFinished$dataSupplier$1 extends Lambda implements Function0<ArrayList<EventPair<?>>> {
/*     */     CommonLoggerService$logDocumentationGenerationFinished$dataSupplier$1(PsiElement $element, Language $language) {
/*     */       super(0);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final ArrayList<EventPair<?>> invoke() {
/*     */       return CommonLoggerService.this.getTargetElementFields(this.$element, this.$language);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020 \n\002\030\002\n\000\020\000\032\f\022\b\022\006\022\002\b\0030\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/internal/statistic/eventLog/events/EventPair;", "invoke"})
/*     */   static final class CommonLoggerService$logDocumentationGenerationFinished$1 extends Lambda implements Function0<List<? extends EventPair<?>>> {
/*     */     @NotNull
/*     */     public final List<EventPair<?>> invoke() {
/*     */       EventPair[] arrayOfEventPair = new EventPair[1];
/*     */       arrayOfEventPair[0] = LLMCommonEventFieldsKt.getRESPONSE().with(this.$suggestion);
/*     */       ArrayList<EventPair<?>> result = CollectionsKt.arrayListOf((Object[])arrayOfEventPair);
/*     */       result.addAll(CommonLoggerService.this.getTargetElementFields(this.$element, this.$language));
/*     */       return result;
/*     */     }
/*     */     
/*     */     CommonLoggerService$logDocumentationGenerationFinished$1(CommonLoggerService $receiver, PsiElement $element, Language $language) {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final CompositeStatisticsIdeActivity logCommitGenerationStarted(@NotNull Project project, int numberOfFiles) {
/*     */     Intrinsics.checkNotNullParameter(project, "project");
/*     */     return new CompositeStatisticsIdeActivity(AIAssistantEventLogger.Companion.getCOMMIT_GENERATION$intellij_ml_llm().started(project, new CommonLoggerService$logCommitGenerationStarted$1(numberOfFiles)), LLMEventLogger.Companion.getCOMMIT_GENERATION$intellij_ml_llm().started(project, new CommonLoggerService$logCommitGenerationStarted$2(numberOfFiles)));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020 \n\002\030\002\n\000\020\000\032\f\022\b\022\006\022\002\b\0030\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/internal/statistic/eventLog/events/EventPair;", "invoke"})
/*     */   static final class CommonLoggerService$logCommitGenerationStarted$1 extends Lambda implements Function0<List<? extends EventPair<?>>> {
/*     */     CommonLoggerService$logCommitGenerationStarted$1(int $numberOfFiles) {
/*     */       super(0);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final List<EventPair<?>> invoke() {
/*     */       EventPair[] arrayOfEventPair = new EventPair[1];
/*     */       arrayOfEventPair[0] = CommonLoggerServiceKt.getNUMBER_OF_FILES().with(Integer.valueOf(this.$numberOfFiles));
/*     */       return CollectionsKt.arrayListOf((Object[])arrayOfEventPair);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020 \n\002\030\002\n\000\020\000\032\f\022\b\022\006\022\002\b\0030\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/internal/statistic/eventLog/events/EventPair;", "invoke"})
/*     */   static final class CommonLoggerService$logCommitGenerationStarted$2 extends Lambda implements Function0<List<? extends EventPair<?>>> {
/*     */     CommonLoggerService$logCommitGenerationStarted$2(int $numberOfFiles) {
/*     */       super(0);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final List<EventPair<?>> invoke() {
/*     */       EventPair[] arrayOfEventPair = new EventPair[1];
/*     */       arrayOfEventPair[0] = CommonLoggerServiceKt.getNUMBER_OF_FILES().with(Integer.valueOf(this.$numberOfFiles));
/*     */       return CollectionsKt.arrayListOf((Object[])arrayOfEventPair);
/*     */     }
/*     */   }
/*     */   
/*     */   public final void logCommitGenerationRequestSent(@NotNull CompositeStatisticsIdeActivity activity, int numberOfFiles, @NotNull LLMProfileID profile, @NotNull LLMChat body) {
/*     */     Intrinsics.checkNotNullParameter(activity, "activity");
/*     */     Intrinsics.checkNotNullParameter(profile, "profile");
/*     */     Intrinsics.checkNotNullParameter(body, "body");
/*     */     activity.getFusActivity$intellij_ml_llm().stageStarted(AIAssistantEventLogger.Companion.getCOMMIT_GENERATION_SENT$intellij_ml_llm(), new CommonLoggerService$logCommitGenerationRequestSent$1(numberOfFiles));
/*     */     activity.getLlmcActivity$intellij_ml_llm().stageStarted(LLMEventLogger.Companion.getCOMMIT_GENERATION_SENT$intellij_ml_llm(), new CommonLoggerService$logCommitGenerationRequestSent$2(numberOfFiles, profile, body));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020 \n\002\030\002\n\000\020\000\032\f\022\b\022\006\022\002\b\0030\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/internal/statistic/eventLog/events/EventPair;", "invoke"})
/*     */   static final class CommonLoggerService$logCommitGenerationRequestSent$1 extends Lambda implements Function0<List<? extends EventPair<?>>> {
/*     */     @NotNull
/*     */     public final List<EventPair<?>> invoke() {
/*     */       EventPair[] arrayOfEventPair = new EventPair[1];
/*     */       arrayOfEventPair[0] = CommonLoggerServiceKt.getNUMBER_OF_FILES().with(Integer.valueOf(this.$numberOfFiles));
/*     */       return CollectionsKt.arrayListOf((Object[])arrayOfEventPair);
/*     */     }
/*     */     
/*     */     CommonLoggerService$logCommitGenerationRequestSent$1(int $numberOfFiles) {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020 \n\002\030\002\n\000\020\000\032\f\022\b\022\006\022\002\b\0030\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/internal/statistic/eventLog/events/EventPair;", "invoke"})
/*     */   static final class CommonLoggerService$logCommitGenerationRequestSent$2 extends Lambda implements Function0<List<? extends EventPair<?>>> {
/*     */     @NotNull
/*     */     public final List<EventPair<?>> invoke() {
/*     */       EventPair[] arrayOfEventPair = new EventPair[1];
/*     */       arrayOfEventPair[0] = CommonLoggerServiceKt.getNUMBER_OF_FILES().with(Integer.valueOf(this.$numberOfFiles));
/*     */       ArrayList<EventPair<?>> results = CollectionsKt.arrayListOf((Object[])arrayOfEventPair);
/*     */       results.addAll(LLMEventLogger.Companion.extractChatRequestParameters$intellij_ml_llm(this.$profile.getId(), this.$body));
/*     */       return results;
/*     */     }
/*     */     
/*     */     CommonLoggerService$logCommitGenerationRequestSent$2(int $numberOfFiles, LLMProfileID $profile, LLMChat $body) {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */   
/*     */   public final void logCommitGenerationFinished(@NotNull CompositeStatisticsIdeActivity activity, int numberOfFiles, @NotNull String suggestion, @NotNull FinishState state) {
/*     */     Intrinsics.checkNotNullParameter(activity, "activity");
/*     */     Intrinsics.checkNotNullParameter(suggestion, "suggestion");
/*     */     Intrinsics.checkNotNullParameter(state, "state");
/*     */     Function0<? extends List<? extends EventPair<?>>> fusDataSupplier = new CommonLoggerService$logCommitGenerationFinished$fusDataSupplier$1(numberOfFiles);
/*     */     activity.finished(state, fusDataSupplier, new CommonLoggerService$logCommitGenerationFinished$1(suggestion));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\002\030\002\n\002\020\b\n\002\030\002\n\000\020\000\032\036\022\n\022\b\022\004\022\0020\0030\0020\001j\016\022\n\022\b\022\004\022\0020\0030\002`\004H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/intellij/internal/statistic/eventLog/events/EventPair;", "", "Lkotlin/collections/ArrayList;", "invoke"})
/*     */   static final class CommonLoggerService$logCommitGenerationFinished$fusDataSupplier$1 extends Lambda implements Function0<ArrayList<EventPair<Integer>>> {
/*     */     @NotNull
/*     */     public final ArrayList<EventPair<Integer>> invoke() {
/*     */       EventPair[] arrayOfEventPair = new EventPair[1];
/*     */       arrayOfEventPair[0] = CommonLoggerServiceKt.getNUMBER_OF_FILES().with(Integer.valueOf(this.$numberOfFiles));
/*     */       return CollectionsKt.arrayListOf((Object[])arrayOfEventPair);
/*     */     }
/*     */     
/*     */     CommonLoggerService$logCommitGenerationFinished$fusDataSupplier$1(int $numberOfFiles) {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020 \n\002\030\002\n\000\020\000\032\f\022\b\022\006\022\002\b\0030\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/internal/statistic/eventLog/events/EventPair;", "invoke"})
/*     */   static final class CommonLoggerService$logCommitGenerationFinished$1 extends Lambda implements Function0<List<? extends EventPair<?>>> {
/*     */     @NotNull
/*     */     public final List<EventPair<?>> invoke() {
/*     */       EventPair[] arrayOfEventPair = new EventPair[1];
/*     */       arrayOfEventPair[0] = LLMCommonEventFieldsKt.getRESPONSE().with(this.$suggestion);
/*     */       return CollectionsKt.arrayListOf((Object[])arrayOfEventPair);
/*     */     }
/*     */     
/*     */     CommonLoggerService$logCommitGenerationFinished$1(String $suggestion) {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final CompositeStatisticsIdeActivity logNameSuggestionStarted(@NotNull Project project) {
/*     */     Intrinsics.checkNotNullParameter(project, "project");
/*     */     return new CompositeStatisticsIdeActivity(ScoredIdeActivityDefinition.started$default(AIAssistantEventLogger.Companion.getNAME_SUGGESTIONS_ACTIVITY$intellij_ml_llm(), project, null, 2, null), ScoredIdeActivityDefinition.started$default(LLMEventLogger.Companion.getNAME_SUGGESTIONS_ACTIVITY$intellij_ml_llm(), project, null, 2, null));
/*     */   }
/*     */   
/*     */   public final void logSendNameSuggestionRequest(@NotNull CompositeStatisticsIdeActivity activity, @NotNull String originalName, @NotNull String context) {
/*     */     Intrinsics.checkNotNullParameter(activity, "activity");
/*     */     Intrinsics.checkNotNullParameter(originalName, "originalName");
/*     */     Intrinsics.checkNotNullParameter(context, "context");
/*     */     ScoredIdeActivity.stageStarted$default(activity.getFusActivity$intellij_ml_llm(), AIAssistantEventLogger.Companion.getNAME_SUGGESTIONS_REQUEST$intellij_ml_llm(), null, 2, null);
/*     */     activity.getLlmcActivity$intellij_ml_llm().stageStarted(LLMEventLogger.Companion.getNAME_SUGGESTIONS_REQUEST$intellij_ml_llm(), new CommonLoggerService$logSendNameSuggestionRequest$1(originalName, context));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020 \n\002\030\002\n\000\020\000\032\f\022\b\022\006\022\002\b\0030\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/internal/statistic/eventLog/events/EventPair;", "invoke"})
/*     */   static final class CommonLoggerService$logSendNameSuggestionRequest$1 extends Lambda implements Function0<List<? extends EventPair<?>>> {
/*     */     @NotNull
/*     */     public final List<EventPair<?>> invoke() {
/*     */       EventPair[] arrayOfEventPair = new EventPair[2];
/*     */       arrayOfEventPair[0] = LLMCommonEventFieldsKt.getUSER_REQUEST().with(this.$originalName);
/*     */       arrayOfEventPair[1] = LLMEventLogger.Companion.getCONTEXT$intellij_ml_llm().with(this.$context);
/*     */       return CollectionsKt.listOf((Object[])arrayOfEventPair);
/*     */     }
/*     */     
/*     */     CommonLoggerService$logSendNameSuggestionRequest$1(String $originalName, String $context) {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */   
/*     */   public final void logSendNameSuggestionResponse(@NotNull CompositeStatisticsIdeActivity activity, long duration, @Nullable String response) {
/*     */     Intrinsics.checkNotNullParameter(activity, "activity");
/*     */     activity.getFusActivity$intellij_ml_llm().stageStarted(AIAssistantEventLogger.Companion.getNAME_SUGGESTIONS_RESPONSE$intellij_ml_llm(), new CommonLoggerService$logSendNameSuggestionResponse$1(duration));
/*     */     activity.getLlmcActivity$intellij_ml_llm().stageStarted(LLMEventLogger.Companion.getNAME_SUGGESTIONS_RESPONSE$intellij_ml_llm(), new CommonLoggerService$logSendNameSuggestionResponse$2(duration, response));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020 \n\002\030\002\n\000\020\000\032\f\022\b\022\006\022\002\b\0030\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/internal/statistic/eventLog/events/EventPair;", "invoke"})
/*     */   static final class CommonLoggerService$logSendNameSuggestionResponse$1 extends Lambda implements Function0<List<? extends EventPair<?>>> {
/*     */     CommonLoggerService$logSendNameSuggestionResponse$1(long $duration) {
/*     */       super(0);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final List<EventPair<?>> invoke() {
/*     */       return CollectionsKt.listOf(EventFields.DurationMs.with(Long.valueOf(this.$duration)));
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020 \n\002\030\002\n\000\020\000\032\f\022\b\022\006\022\002\b\0030\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/internal/statistic/eventLog/events/EventPair;", "invoke"})
/*     */   static final class CommonLoggerService$logSendNameSuggestionResponse$2 extends Lambda implements Function0<List<? extends EventPair<?>>> {
/*     */     @NotNull
/*     */     public final List<EventPair<?>> invoke() {
/*     */       EventPair[] arrayOfEventPair = new EventPair[2];
/*     */       arrayOfEventPair[0] = EventFields.DurationMs.with(Long.valueOf(this.$duration));
/*     */       arrayOfEventPair[1] = LLMCommonEventFieldsKt.getRESPONSE().with(this.$response);
/*     */       return CollectionsKt.listOf((Object[])arrayOfEventPair);
/*     */     }
/*     */     
/*     */     CommonLoggerService$logSendNameSuggestionResponse$2(long $duration, String $response) {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */   
/*     */   public final void logShowNameSuggestions(@NotNull CompositeStatisticsIdeActivity activity) {
/*     */     Intrinsics.checkNotNullParameter(activity, "activity");
/*     */     ScoredIdeActivity.stageStarted$default(activity.getFusActivity$intellij_ml_llm(), AIAssistantEventLogger.Companion.getNAME_SUGGESTIONS_SHOW$intellij_ml_llm(), null, 2, null);
/*     */     ScoredIdeActivity.stageStarted$default(activity.getLlmcActivity$intellij_ml_llm(), LLMEventLogger.Companion.getNAME_SUGGESTIONS_SHOW$intellij_ml_llm(), null, 2, null);
/*     */   }
/*     */   
/*     */   public final void logNameSuggestionFinished(@NotNull CompositeStatisticsIdeActivity activity, @Nullable String selected) {
/*     */     Intrinsics.checkNotNullParameter(activity, "activity");
/*     */     activity.finished(null, null, new CommonLoggerService$logNameSuggestionFinished$1(selected));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020 \n\002\030\002\n\000\020\000\032\f\022\b\022\006\022\002\b\0030\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/internal/statistic/eventLog/events/EventPair;", "invoke"})
/*     */   static final class CommonLoggerService$logNameSuggestionFinished$1 extends Lambda implements Function0<List<? extends EventPair<?>>> {
/*     */     @NotNull
/*     */     public final List<EventPair<?>> invoke() {
/*     */       return CollectionsKt.listOf(LLMEventLogger.Companion.getSELECTED$intellij_ml_llm().with(this.$selected));
/*     */     }
/*     */     
/*     */     CommonLoggerService$logNameSuggestionFinished$1(String $selected) {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/statistics/CommonLoggerService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */