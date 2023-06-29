/*     */ package com.intellij.ml.llm.refactorings;
/*     */ 
/*     */ import com.intellij.codeInsight.TargetElementUtil;
/*     */ import com.intellij.codeInsight.lookup.LookupElement;
/*     */ import com.intellij.codeInsight.lookup.LookupElementPresentation;
/*     */ import com.intellij.codeInsight.lookup.impl.LookupImpl;
/*     */ import com.intellij.ml.llm.core.settings.LLMSettingsManager;
/*     */ import com.intellij.ml.llm.core.statistics.CommonLoggerService;
/*     */ import com.intellij.ml.llm.core.statistics.CompositeStatisticsIdeActivity;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import java.util.Collection;
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\020\"\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\002\b\003\030\0002\0020\001:\002\024\025B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\034\020\005\032\0020\0062\b\020\007\032\004\030\0010\b2\b\020\t\032\004\030\0010\bH\026J \020\n\032\b\022\004\022\0020\f0\0132\006\020\r\032\0020\0162\b\020\017\032\004\030\0010\016H\002J\020\020\020\032\0020\0212\006\020\022\032\0020\023H\002R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/refactorings/LlmLookupManagerListener;", "Lcom/intellij/codeInsight/lookup/LookupManagerListener;", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;)V", "activeLookupChanged", "", "oldLookup", "Lcom/intellij/codeInsight/lookup/Lookup;", "newLookup", "getStandardNameSuggestions", "", "", "targetElement", "Lcom/intellij/psi/PsiElement;", "originalPosition", "isLanguageAtOffsetSupported", "", "editor", "Lcom/intellij/openapi/editor/Editor;", "LlmLookupElement", "StartupActivity", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nLlmLookupManagerListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LlmLookupManagerListener.kt\ncom/intellij/ml/llm/refactorings/LlmLookupManagerListener\n+ 2 service.kt\ncom/intellij/openapi/components/ServiceKt\n*L\n1#1,150:1\n43#2,3:151\n*S KotlinDebug\n*F\n+ 1 LlmLookupManagerListener.kt\ncom/intellij/ml/llm/refactorings/LlmLookupManagerListener\n*L\n32#1:151,3\n*E\n"})
/*     */ public final class LlmLookupManagerListener implements LookupManagerListener {
/*     */   @NotNull
/*     */   private final Project project;
/*     */   
/*  30 */   public LlmLookupManagerListener(@NotNull Project project) { this.project = project; }
/*     */   private static final LookupElementPresentation activeLookupChanged$lambda$1(LookupElement item, LookupElementPresentation presentation) { Intrinsics.checkNotNullParameter(item, "item"); Intrinsics.checkNotNullParameter(presentation, "presentation"); if (!(item instanceof LlmLookupElement) && presentation.getIcon() == null) { LookupElementPresentation lookupElementPresentation1 = new LookupElementPresentation(), newPresentation = lookupElementPresentation1; int $i$a$-also-LlmLookupManagerListener$activeLookupChanged$1$1 = 0; newPresentation.copyFrom(presentation); newPresentation.setIcon(EmptyIcon.ICON_16); return lookupElementPresentation1; }
/*  32 */      return presentation; } public void activeLookupChanged(@Nullable Lookup oldLookup, @Nullable Lookup newLookup) { Object object1; int $i$f$service = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 151 */     Class<LLMSettingsManager> serviceClass$iv = LLMSettingsManager.class;
/* 152 */     Object object2 = ApplicationManager.getApplication().getService(serviceClass$iv); if (object2 == null)
/* 153 */       throw new RuntimeException("Cannot find service " + serviceClass$iv.getName() + " (classloader=" + serviceClass$iv.getClassLoader() + ", client=" + ClientId.Companion.getCurrentOrNull() + ")");  LLMSettingsManager llmSettingsManager = (LLMSettingsManager)object2; if (!llmSettingsManager.isNameSuggestionsEnabled()) return;  if (((newLookup instanceof LookupImpl) ? newLookup : null) == null) { (newLookup instanceof LookupImpl) ? newLookup : null; return; }  Intrinsics.checkNotNullExpressionValue(object1.getEditor(), "lookup.editor"); Editor editor = object1.getEditor(); if (TemplateManager.getInstance(this.project).getActiveTemplate(editor) == null) return;  TargetElementUtil targetElementUtil = TargetElementUtil.getInstance(); String token = GrazieAuthService.Companion.getInstance().tryGetProxyServerToken$intellij_ml_llm(); if (token == null || Intrinsics.areEqual(token, "wait_list"))
/*     */       return;  CommonLoggerService loggerService = CommonLoggerService.Companion.getInstance(); CompositeStatisticsIdeActivity statistic = loggerService.logNameSuggestionStarted(this.project); if (!isLanguageAtOffsetSupported(editor))
/*     */       return;  object1.addPresentationCustomizer(LlmLookupManagerListener::activeLookupChanged$lambda$1); Job updatingLookupJob = BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope((CoroutineContext)Dispatchers.getIO()), null, null, new LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1(loggerService, statistic, (LookupImpl)object1, editor, targetElementUtil, null), 3, null); object1.addLookupListener(new LlmLookupManagerListener$activeLookupChanged$2(updatingLookupJob, loggerService, statistic, editor)); } @DebugMetadata(f = "LlmLookupManagerListener.kt", l = {53, 54, 60, 64, 67, 69, 70, 71}, i = {0, 1, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6}, s = {"L$0", "L$0", "L$0", "L$1", "J$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "L$0", "L$2", "L$4"}, n = {"$this$launch", "$this$launch", "targetElement", "standardSuggestions", "start$iv", "targetElement", "standardSuggestions", "suggestedNames", "targetElement", "standardSuggestions", "originalName", "destination$iv$iv", "element$iv$iv", "it", "targetElement", "destination$iv$iv", "element$iv$iv"}, m = "invokeSuspend", c = "com.intellij.ml.llm.refactorings.LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1") @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) @SourceDebugExtension({"SMAP\nLlmLookupManagerListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LlmLookupManagerListener.kt\ncom/intellij/ml/llm/refactorings/LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1\n+ 2 LlmLookupManagerListener.kt\ncom/intellij/ml/llm/refactorings/LlmLookupManagerListenerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,150:1\n147#2,3:151\n766#3:154\n857#3,2:155\n766#3:157\n857#3,2:158\n*S KotlinDebug\n*F\n+ 1 LlmLookupManagerListener.kt\ncom/intellij/ml/llm/refactorings/LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1\n*L\n64#1:151,3\n69#1:154\n69#1:155,2\n70#1:157\n70#1:158,2\n*E\n"}) static final class LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*     */   {
/*     */     Object L$1; Object L$2; Object L$3; Object L$4; Object L$5; Object L$6; long J$0; int label; LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1(CommonLoggerService $loggerService, CompositeStatisticsIdeActivity $statistic, LookupImpl $lookup, Editor $editor, TargetElementUtil $targetElementUtil, Continuation $completion) { super(2, $completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #21
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 1161, 0 -> 60, 1 -> 112, 2 -> 177, 3 -> 238, 4 -> 345, 5 -> 537, 6 -> 714, 7 -> 967, 8 -> 1140
/*     */       //   60: aload_1
/*     */       //   61: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   64: aload_0
/*     */       //   65: getfield L$0 : Ljava/lang/Object;
/*     */       //   68: checkcast kotlinx/coroutines/CoroutineScope
/*     */       //   71: astore_2
/*     */       //   72: new com/intellij/ml/llm/refactorings/LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$1
/*     */       //   75: dup
/*     */       //   76: aload_0
/*     */       //   77: getfield $lookup : Lcom/intellij/codeInsight/lookup/impl/LookupImpl;
/*     */       //   80: invokespecial <init> : (Lcom/intellij/codeInsight/lookup/impl/LookupImpl;)V
/*     */       //   83: checkcast kotlin/jvm/functions/Function0
/*     */       //   86: aload_0
/*     */       //   87: checkcast kotlin/coroutines/Continuation
/*     */       //   90: aload_0
/*     */       //   91: aload_2
/*     */       //   92: putfield L$0 : Ljava/lang/Object;
/*     */       //   95: aload_0
/*     */       //   96: iconst_1
/*     */       //   97: putfield label : I
/*     */       //   100: invokestatic writeAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   103: dup
/*     */       //   104: aload #21
/*     */       //   106: if_acmpne -> 125
/*     */       //   109: aload #21
/*     */       //   111: areturn
/*     */       //   112: aload_0
/*     */       //   113: getfield L$0 : Ljava/lang/Object;
/*     */       //   116: checkcast kotlinx/coroutines/CoroutineScope
/*     */       //   119: astore_2
/*     */       //   120: aload_1
/*     */       //   121: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   124: aload_1
/*     */       //   125: pop
/*     */       //   126: aload_0
/*     */       //   127: getfield this$0 : Lcom/intellij/ml/llm/refactorings/LlmLookupManagerListener;
/*     */       //   130: invokestatic access$getProject$p : (Lcom/intellij/ml/llm/refactorings/LlmLookupManagerListener;)Lcom/intellij/openapi/project/Project;
/*     */       //   133: new com/intellij/ml/llm/refactorings/LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$targetElement$1
/*     */       //   136: dup
/*     */       //   137: aload_0
/*     */       //   138: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*     */       //   141: aload_0
/*     */       //   142: getfield $targetElementUtil : Lcom/intellij/codeInsight/TargetElementUtil;
/*     */       //   145: invokespecial <init> : (Lcom/intellij/openapi/editor/Editor;Lcom/intellij/codeInsight/TargetElementUtil;)V
/*     */       //   148: checkcast kotlin/jvm/functions/Function0
/*     */       //   151: aload_0
/*     */       //   152: checkcast kotlin/coroutines/Continuation
/*     */       //   155: aload_0
/*     */       //   156: aload_2
/*     */       //   157: putfield L$0 : Ljava/lang/Object;
/*     */       //   160: aload_0
/*     */       //   161: iconst_2
/*     */       //   162: putfield label : I
/*     */       //   165: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   168: dup
/*     */       //   169: aload #21
/*     */       //   171: if_acmpne -> 190
/*     */       //   174: aload #21
/*     */       //   176: areturn
/*     */       //   177: aload_0
/*     */       //   178: getfield L$0 : Ljava/lang/Object;
/*     */       //   181: checkcast kotlinx/coroutines/CoroutineScope
/*     */       //   184: astore_2
/*     */       //   185: aload_1
/*     */       //   186: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   189: aload_1
/*     */       //   190: checkcast com/intellij/psi/PsiElement
/*     */       //   193: astore_3
/*     */       //   194: aload_3
/*     */       //   195: ifnonnull -> 248
/*     */       //   198: new com/intellij/ml/llm/refactorings/LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$2
/*     */       //   201: dup
/*     */       //   202: aload_0
/*     */       //   203: getfield $lookup : Lcom/intellij/codeInsight/lookup/impl/LookupImpl;
/*     */       //   206: invokespecial <init> : (Lcom/intellij/codeInsight/lookup/impl/LookupImpl;)V
/*     */       //   209: checkcast kotlin/jvm/functions/Function0
/*     */       //   212: aload_0
/*     */       //   213: checkcast kotlin/coroutines/Continuation
/*     */       //   216: aload_0
/*     */       //   217: aconst_null
/*     */       //   218: putfield L$0 : Ljava/lang/Object;
/*     */       //   221: aload_0
/*     */       //   222: iconst_3
/*     */       //   223: putfield label : I
/*     */       //   226: invokestatic writeAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   229: dup
/*     */       //   230: aload #21
/*     */       //   232: if_acmpne -> 243
/*     */       //   235: aload #21
/*     */       //   237: areturn
/*     */       //   238: aload_1
/*     */       //   239: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   242: aload_1
/*     */       //   243: pop
/*     */       //   244: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   247: areturn
/*     */       //   248: aload_2
/*     */       //   249: aconst_null
/*     */       //   250: aconst_null
/*     */       //   251: new com/intellij/ml/llm/refactorings/LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$standardSuggestions$1
/*     */       //   254: dup
/*     */       //   255: aload_0
/*     */       //   256: getfield this$0 : Lcom/intellij/ml/llm/refactorings/LlmLookupManagerListener;
/*     */       //   259: aload_3
/*     */       //   260: aload_0
/*     */       //   261: getfield $lookup : Lcom/intellij/codeInsight/lookup/impl/LookupImpl;
/*     */       //   264: aconst_null
/*     */       //   265: invokespecial <init> : (Lcom/intellij/ml/llm/refactorings/LlmLookupManagerListener;Lcom/intellij/psi/PsiElement;Lcom/intellij/codeInsight/lookup/impl/LookupImpl;Lkotlin/coroutines/Continuation;)V
/*     */       //   268: checkcast kotlin/jvm/functions/Function2
/*     */       //   271: iconst_3
/*     */       //   272: aconst_null
/*     */       //   273: invokestatic async$default : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;
/*     */       //   276: astore #4
/*     */       //   278: aload_0
/*     */       //   279: getfield this$0 : Lcom/intellij/ml/llm/refactorings/LlmLookupManagerListener;
/*     */       //   282: astore #6
/*     */       //   284: aload_0
/*     */       //   285: getfield $statistic : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */       //   288: astore #7
/*     */       //   290: iconst_0
/*     */       //   291: istore #8
/*     */       //   293: invokestatic currentTimeMillis : ()J
/*     */       //   296: lstore #9
/*     */       //   298: iconst_0
/*     */       //   299: istore #11
/*     */       //   301: aload #6
/*     */       //   303: invokestatic access$getProject$p : (Lcom/intellij/ml/llm/refactorings/LlmLookupManagerListener;)Lcom/intellij/openapi/project/Project;
/*     */       //   306: aload_3
/*     */       //   307: aconst_null
/*     */       //   308: aload #7
/*     */       //   310: aload_0
/*     */       //   311: aload_0
/*     */       //   312: aload_3
/*     */       //   313: putfield L$0 : Ljava/lang/Object;
/*     */       //   316: aload_0
/*     */       //   317: aload #4
/*     */       //   319: putfield L$1 : Ljava/lang/Object;
/*     */       //   322: aload_0
/*     */       //   323: lload #9
/*     */       //   325: putfield J$0 : J
/*     */       //   328: aload_0
/*     */       //   329: iconst_4
/*     */       //   330: putfield label : I
/*     */       //   333: invokestatic suggestNames : (Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiElement;Ljava/lang/String;Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   336: dup
/*     */       //   337: aload #21
/*     */       //   339: if_acmpne -> 379
/*     */       //   342: aload #21
/*     */       //   344: areturn
/*     */       //   345: iconst_0
/*     */       //   346: istore #8
/*     */       //   348: iconst_0
/*     */       //   349: istore #11
/*     */       //   351: aload_0
/*     */       //   352: getfield J$0 : J
/*     */       //   355: lstore #9
/*     */       //   357: aload_0
/*     */       //   358: getfield L$1 : Ljava/lang/Object;
/*     */       //   361: checkcast kotlinx/coroutines/Deferred
/*     */       //   364: astore #4
/*     */       //   366: aload_0
/*     */       //   367: getfield L$0 : Ljava/lang/Object;
/*     */       //   370: checkcast com/intellij/psi/PsiElement
/*     */       //   373: astore_3
/*     */       //   374: aload_1
/*     */       //   375: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   378: aload_1
/*     */       //   379: checkcast java/util/List
/*     */       //   382: astore #12
/*     */       //   384: new kotlin/Pair
/*     */       //   387: dup
/*     */       //   388: invokestatic currentTimeMillis : ()J
/*     */       //   391: lload #9
/*     */       //   393: lsub
/*     */       //   394: invokestatic boxLong : (J)Ljava/lang/Long;
/*     */       //   397: aload #12
/*     */       //   399: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */       //   402: astore #5
/*     */       //   404: aload #5
/*     */       //   406: invokevirtual component1 : ()Ljava/lang/Object;
/*     */       //   409: checkcast java/lang/Number
/*     */       //   412: invokevirtual longValue : ()J
/*     */       //   415: lstore #6
/*     */       //   417: aload #5
/*     */       //   419: invokevirtual component2 : ()Ljava/lang/Object;
/*     */       //   422: checkcast java/util/List
/*     */       //   425: astore #8
/*     */       //   427: aload_0
/*     */       //   428: getfield $loggerService : Lcom/intellij/ml/llm/core/statistics/CommonLoggerService;
/*     */       //   431: aload_0
/*     */       //   432: getfield $statistic : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */       //   435: lload #6
/*     */       //   437: aload #8
/*     */       //   439: checkcast java/lang/Iterable
/*     */       //   442: ldc ','
/*     */       //   444: checkcast java/lang/CharSequence
/*     */       //   447: aconst_null
/*     */       //   448: aconst_null
/*     */       //   449: iconst_0
/*     */       //   450: aconst_null
/*     */       //   451: aconst_null
/*     */       //   452: bipush #62
/*     */       //   454: aconst_null
/*     */       //   455: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */       //   458: invokevirtual logSendNameSuggestionResponse : (Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;JLjava/lang/String;)V
/*     */       //   461: aload_0
/*     */       //   462: getfield $lookup : Lcom/intellij/codeInsight/lookup/impl/LookupImpl;
/*     */       //   465: invokevirtual isLookupDisposed : ()Z
/*     */       //   468: ifne -> 1157
/*     */       //   471: aload_0
/*     */       //   472: getfield $lookup : Lcom/intellij/codeInsight/lookup/impl/LookupImpl;
/*     */       //   475: invokevirtual isVisible : ()Z
/*     */       //   478: ifeq -> 1157
/*     */       //   481: aload_0
/*     */       //   482: getfield this$0 : Lcom/intellij/ml/llm/refactorings/LlmLookupManagerListener;
/*     */       //   485: invokestatic access$getProject$p : (Lcom/intellij/ml/llm/refactorings/LlmLookupManagerListener;)Lcom/intellij/openapi/project/Project;
/*     */       //   488: new com/intellij/ml/llm/refactorings/LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$originalName$1
/*     */       //   491: dup
/*     */       //   492: aload_3
/*     */       //   493: invokespecial <init> : (Lcom/intellij/psi/PsiElement;)V
/*     */       //   496: checkcast kotlin/jvm/functions/Function0
/*     */       //   499: aload_0
/*     */       //   500: checkcast kotlin/coroutines/Continuation
/*     */       //   503: aload_0
/*     */       //   504: aload_3
/*     */       //   505: putfield L$0 : Ljava/lang/Object;
/*     */       //   508: aload_0
/*     */       //   509: aload #4
/*     */       //   511: putfield L$1 : Ljava/lang/Object;
/*     */       //   514: aload_0
/*     */       //   515: aload #8
/*     */       //   517: putfield L$2 : Ljava/lang/Object;
/*     */       //   520: aload_0
/*     */       //   521: iconst_5
/*     */       //   522: putfield label : I
/*     */       //   525: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   528: dup
/*     */       //   529: aload #21
/*     */       //   531: if_acmpne -> 568
/*     */       //   534: aload #21
/*     */       //   536: areturn
/*     */       //   537: aload_0
/*     */       //   538: getfield L$2 : Ljava/lang/Object;
/*     */       //   541: checkcast java/util/List
/*     */       //   544: astore #8
/*     */       //   546: aload_0
/*     */       //   547: getfield L$1 : Ljava/lang/Object;
/*     */       //   550: checkcast kotlinx/coroutines/Deferred
/*     */       //   553: astore #4
/*     */       //   555: aload_0
/*     */       //   556: getfield L$0 : Ljava/lang/Object;
/*     */       //   559: checkcast com/intellij/psi/PsiElement
/*     */       //   562: astore_3
/*     */       //   563: aload_1
/*     */       //   564: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   567: aload_1
/*     */       //   568: checkcast java/lang/String
/*     */       //   571: astore #9
/*     */       //   573: aload #8
/*     */       //   575: checkcast java/lang/Iterable
/*     */       //   578: astore #11
/*     */       //   580: iconst_0
/*     */       //   581: istore #12
/*     */       //   583: aload #11
/*     */       //   585: astore #13
/*     */       //   587: new java/util/ArrayList
/*     */       //   590: dup
/*     */       //   591: invokespecial <init> : ()V
/*     */       //   594: checkcast java/util/Collection
/*     */       //   597: astore #14
/*     */       //   599: iconst_0
/*     */       //   600: istore #15
/*     */       //   602: aload #13
/*     */       //   604: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   609: astore #16
/*     */       //   611: aload #16
/*     */       //   613: invokeinterface hasNext : ()Z
/*     */       //   618: ifeq -> 821
/*     */       //   621: aload #16
/*     */       //   623: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   628: astore #17
/*     */       //   630: aload #17
/*     */       //   632: checkcast java/lang/String
/*     */       //   635: astore #18
/*     */       //   637: iconst_0
/*     */       //   638: istore #19
/*     */       //   640: aload #18
/*     */       //   642: aload #9
/*     */       //   644: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   647: ifne -> 804
/*     */       //   650: aload #4
/*     */       //   652: aload_0
/*     */       //   653: aload_0
/*     */       //   654: aload_3
/*     */       //   655: putfield L$0 : Ljava/lang/Object;
/*     */       //   658: aload_0
/*     */       //   659: aload #4
/*     */       //   661: putfield L$1 : Ljava/lang/Object;
/*     */       //   664: aload_0
/*     */       //   665: aload #9
/*     */       //   667: putfield L$2 : Ljava/lang/Object;
/*     */       //   670: aload_0
/*     */       //   671: aload #14
/*     */       //   673: putfield L$3 : Ljava/lang/Object;
/*     */       //   676: aload_0
/*     */       //   677: aload #16
/*     */       //   679: putfield L$4 : Ljava/lang/Object;
/*     */       //   682: aload_0
/*     */       //   683: aload #17
/*     */       //   685: putfield L$5 : Ljava/lang/Object;
/*     */       //   688: aload_0
/*     */       //   689: aload #18
/*     */       //   691: putfield L$6 : Ljava/lang/Object;
/*     */       //   694: aload_0
/*     */       //   695: bipush #6
/*     */       //   697: putfield label : I
/*     */       //   700: invokeinterface await : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   705: dup
/*     */       //   706: aload #21
/*     */       //   708: if_acmpne -> 787
/*     */       //   711: aload #21
/*     */       //   713: areturn
/*     */       //   714: iconst_0
/*     */       //   715: istore #12
/*     */       //   717: iconst_0
/*     */       //   718: istore #15
/*     */       //   720: iconst_0
/*     */       //   721: istore #19
/*     */       //   723: aload_0
/*     */       //   724: getfield L$6 : Ljava/lang/Object;
/*     */       //   727: checkcast java/lang/String
/*     */       //   730: astore #18
/*     */       //   732: aload_0
/*     */       //   733: getfield L$5 : Ljava/lang/Object;
/*     */       //   736: astore #17
/*     */       //   738: aload_0
/*     */       //   739: getfield L$4 : Ljava/lang/Object;
/*     */       //   742: checkcast java/util/Iterator
/*     */       //   745: astore #16
/*     */       //   747: aload_0
/*     */       //   748: getfield L$3 : Ljava/lang/Object;
/*     */       //   751: checkcast java/util/Collection
/*     */       //   754: astore #14
/*     */       //   756: aload_0
/*     */       //   757: getfield L$2 : Ljava/lang/Object;
/*     */       //   760: checkcast java/lang/String
/*     */       //   763: astore #9
/*     */       //   765: aload_0
/*     */       //   766: getfield L$1 : Ljava/lang/Object;
/*     */       //   769: checkcast kotlinx/coroutines/Deferred
/*     */       //   772: astore #4
/*     */       //   774: aload_0
/*     */       //   775: getfield L$0 : Ljava/lang/Object;
/*     */       //   778: checkcast com/intellij/psi/PsiElement
/*     */       //   781: astore_3
/*     */       //   782: aload_1
/*     */       //   783: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   786: aload_1
/*     */       //   787: checkcast java/util/Set
/*     */       //   790: aload #18
/*     */       //   792: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */       //   797: ifne -> 804
/*     */       //   800: iconst_1
/*     */       //   801: goto -> 805
/*     */       //   804: iconst_0
/*     */       //   805: ifeq -> 611
/*     */       //   808: aload #14
/*     */       //   810: aload #17
/*     */       //   812: invokeinterface add : (Ljava/lang/Object;)Z
/*     */       //   817: pop
/*     */       //   818: goto -> 611
/*     */       //   821: aload #14
/*     */       //   823: checkcast java/util/List
/*     */       //   826: nop
/*     */       //   827: checkcast java/lang/Iterable
/*     */       //   830: astore #11
/*     */       //   832: aload_0
/*     */       //   833: getfield this$0 : Lcom/intellij/ml/llm/refactorings/LlmLookupManagerListener;
/*     */       //   836: astore #12
/*     */       //   838: iconst_0
/*     */       //   839: istore #13
/*     */       //   841: aload #11
/*     */       //   843: astore #14
/*     */       //   845: new java/util/ArrayList
/*     */       //   848: dup
/*     */       //   849: invokespecial <init> : ()V
/*     */       //   852: checkcast java/util/Collection
/*     */       //   855: astore #15
/*     */       //   857: iconst_0
/*     */       //   858: istore #16
/*     */       //   860: aload #14
/*     */       //   862: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   867: astore #17
/*     */       //   869: aload #17
/*     */       //   871: invokeinterface hasNext : ()Z
/*     */       //   876: ifeq -> 1052
/*     */       //   879: aload #17
/*     */       //   881: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   886: astore #18
/*     */       //   888: aload #18
/*     */       //   890: checkcast java/lang/String
/*     */       //   893: astore #19
/*     */       //   895: iconst_0
/*     */       //   896: istore #20
/*     */       //   898: getstatic com/intellij/ml/llm/core/refactoring/NameSuggestionContextProvider.Companion : Lcom/intellij/ml/llm/core/refactoring/NameSuggestionContextProvider$Companion;
/*     */       //   901: aload #12
/*     */       //   903: invokestatic access$getProject$p : (Lcom/intellij/ml/llm/refactorings/LlmLookupManagerListener;)Lcom/intellij/openapi/project/Project;
/*     */       //   906: aload #19
/*     */       //   908: aload_3
/*     */       //   909: aload_0
/*     */       //   910: aload_0
/*     */       //   911: aload_3
/*     */       //   912: putfield L$0 : Ljava/lang/Object;
/*     */       //   915: aload_0
/*     */       //   916: aload #12
/*     */       //   918: putfield L$1 : Ljava/lang/Object;
/*     */       //   921: aload_0
/*     */       //   922: aload #15
/*     */       //   924: putfield L$2 : Ljava/lang/Object;
/*     */       //   927: aload_0
/*     */       //   928: aload #17
/*     */       //   930: putfield L$3 : Ljava/lang/Object;
/*     */       //   933: aload_0
/*     */       //   934: aload #18
/*     */       //   936: putfield L$4 : Ljava/lang/Object;
/*     */       //   939: aload_0
/*     */       //   940: aconst_null
/*     */       //   941: putfield L$5 : Ljava/lang/Object;
/*     */       //   944: aload_0
/*     */       //   945: aconst_null
/*     */       //   946: putfield L$6 : Ljava/lang/Object;
/*     */       //   949: aload_0
/*     */       //   950: bipush #7
/*     */       //   952: putfield label : I
/*     */       //   955: invokevirtual isNameAlreadyUsed : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Lcom/intellij/psi/PsiElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   958: dup
/*     */       //   959: aload #21
/*     */       //   961: if_acmpne -> 1022
/*     */       //   964: aload #21
/*     */       //   966: areturn
/*     */       //   967: iconst_0
/*     */       //   968: istore #13
/*     */       //   970: iconst_0
/*     */       //   971: istore #16
/*     */       //   973: iconst_0
/*     */       //   974: istore #20
/*     */       //   976: aload_0
/*     */       //   977: getfield L$4 : Ljava/lang/Object;
/*     */       //   980: astore #18
/*     */       //   982: aload_0
/*     */       //   983: getfield L$3 : Ljava/lang/Object;
/*     */       //   986: checkcast java/util/Iterator
/*     */       //   989: astore #17
/*     */       //   991: aload_0
/*     */       //   992: getfield L$2 : Ljava/lang/Object;
/*     */       //   995: checkcast java/util/Collection
/*     */       //   998: astore #15
/*     */       //   1000: aload_0
/*     */       //   1001: getfield L$1 : Ljava/lang/Object;
/*     */       //   1004: checkcast com/intellij/ml/llm/refactorings/LlmLookupManagerListener
/*     */       //   1007: astore #12
/*     */       //   1009: aload_0
/*     */       //   1010: getfield L$0 : Ljava/lang/Object;
/*     */       //   1013: checkcast com/intellij/psi/PsiElement
/*     */       //   1016: astore_3
/*     */       //   1017: aload_1
/*     */       //   1018: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   1021: aload_1
/*     */       //   1022: checkcast java/lang/Boolean
/*     */       //   1025: invokevirtual booleanValue : ()Z
/*     */       //   1028: ifne -> 1035
/*     */       //   1031: iconst_1
/*     */       //   1032: goto -> 1036
/*     */       //   1035: iconst_0
/*     */       //   1036: ifeq -> 869
/*     */       //   1039: aload #15
/*     */       //   1041: aload #18
/*     */       //   1043: invokeinterface add : (Ljava/lang/Object;)Z
/*     */       //   1048: pop
/*     */       //   1049: goto -> 869
/*     */       //   1052: aload #15
/*     */       //   1054: checkcast java/util/List
/*     */       //   1057: nop
/*     */       //   1058: astore #10
/*     */       //   1060: getstatic kotlinx/coroutines/Dispatchers.INSTANCE : Lkotlinx/coroutines/Dispatchers;
/*     */       //   1063: invokestatic getEDT : (Lkotlinx/coroutines/Dispatchers;)Lkotlin/coroutines/CoroutineContext;
/*     */       //   1066: new com/intellij/ml/llm/refactorings/LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$4
/*     */       //   1069: dup
/*     */       //   1070: aload #10
/*     */       //   1072: aload_0
/*     */       //   1073: getfield $lookup : Lcom/intellij/codeInsight/lookup/impl/LookupImpl;
/*     */       //   1076: aconst_null
/*     */       //   1077: invokespecial <init> : (Ljava/util/List;Lcom/intellij/codeInsight/lookup/impl/LookupImpl;Lkotlin/coroutines/Continuation;)V
/*     */       //   1080: checkcast kotlin/jvm/functions/Function2
/*     */       //   1083: aload_0
/*     */       //   1084: checkcast kotlin/coroutines/Continuation
/*     */       //   1087: aload_0
/*     */       //   1088: aconst_null
/*     */       //   1089: putfield L$0 : Ljava/lang/Object;
/*     */       //   1092: aload_0
/*     */       //   1093: aconst_null
/*     */       //   1094: putfield L$1 : Ljava/lang/Object;
/*     */       //   1097: aload_0
/*     */       //   1098: aconst_null
/*     */       //   1099: putfield L$2 : Ljava/lang/Object;
/*     */       //   1102: aload_0
/*     */       //   1103: aconst_null
/*     */       //   1104: putfield L$3 : Ljava/lang/Object;
/*     */       //   1107: aload_0
/*     */       //   1108: aconst_null
/*     */       //   1109: putfield L$4 : Ljava/lang/Object;
/*     */       //   1112: aload_0
/*     */       //   1113: aconst_null
/*     */       //   1114: putfield L$5 : Ljava/lang/Object;
/*     */       //   1117: aload_0
/*     */       //   1118: aconst_null
/*     */       //   1119: putfield L$6 : Ljava/lang/Object;
/*     */       //   1122: aload_0
/*     */       //   1123: bipush #8
/*     */       //   1125: putfield label : I
/*     */       //   1128: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   1131: dup
/*     */       //   1132: aload #21
/*     */       //   1134: if_acmpne -> 1145
/*     */       //   1137: aload #21
/*     */       //   1139: areturn
/*     */       //   1140: aload_1
/*     */       //   1141: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   1144: aload_1
/*     */       //   1145: pop
/*     */       //   1146: aload_0
/*     */       //   1147: getfield $loggerService : Lcom/intellij/ml/llm/core/statistics/CommonLoggerService;
/*     */       //   1150: aload_0
/*     */       //   1151: getfield $statistic : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */       //   1154: invokevirtual logShowNameSuggestions : (Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;)V
/*     */       //   1157: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   1160: areturn
/*     */       //   1161: new java/lang/IllegalStateException
/*     */       //   1164: dup
/*     */       //   1165: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   1168: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   1171: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #52	-> 3
/*     */       //   #53	-> 72
/*     */       //   #52	-> 109
/*     */       //   #54	-> 125
/*     */       //   #52	-> 174
/*     */       //   #59	-> 194
/*     */       //   #60	-> 198
/*     */       //   #52	-> 235
/*     */       //   #61	-> 243
/*     */       //   #63	-> 248
/*     */       //   #64	-> 278
/*     */       //   #151	-> 293
/*     */       //   #152	-> 298
/*     */       //   #64	-> 301
/*     */       //   #52	-> 342
/*     */       //   #64	-> 379
/*     */       //   #152	-> 382
/*     */       //   #153	-> 384
/*     */       //   #64	-> 402
/*     */       //   #65	-> 427
/*     */       //   #66	-> 461
/*     */       //   #67	-> 481
/*     */       //   #52	-> 534
/*     */       //   #68	-> 573
/*     */       //   #69	-> 580
/*     */       //   #154	-> 583
/*     */       //   #155	-> 602
/*     */       //   #69	-> 640
/*     */       //   #52	-> 711
/*     */       //   #69	-> 787
/*     */       //   #155	-> 805
/*     */       //   #156	-> 821
/*     */       //   #154	-> 826
/*     */       //   #70	-> 832
/*     */       //   #157	-> 841
/*     */       //   #158	-> 860
/*     */       //   #70	-> 898
/*     */       //   #52	-> 964
/*     */       //   #70	-> 1022
/*     */       //   #158	-> 1036
/*     */       //   #159	-> 1052
/*     */       //   #157	-> 1057
/*     */       //   #70	-> 1058
/*     */       //   #68	-> 1058
/*     */       //   #71	-> 1060
/*     */       //   #52	-> 1137
/*     */       //   #78	-> 1145
/*     */       //   #80	-> 1157
/*     */       //   #52	-> 1161
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   72	40	2	$this$launch	Lkotlinx/coroutines/CoroutineScope;
/*     */       //   120	57	2	$this$launch	Lkotlinx/coroutines/CoroutineScope;
/*     */       //   185	13	2	$this$launch	Lkotlinx/coroutines/CoroutineScope;
/*     */       //   248	30	2	$this$launch	Lkotlinx/coroutines/CoroutineScope;
/*     */       //   194	4	3	targetElement	Lcom/intellij/psi/PsiElement;
/*     */       //   248	97	3	targetElement	Lcom/intellij/psi/PsiElement;
/*     */       //   374	163	3	targetElement	Lcom/intellij/psi/PsiElement;
/*     */       //   563	151	3	targetElement	Lcom/intellij/psi/PsiElement;
/*     */       //   782	23	3	targetElement	Lcom/intellij/psi/PsiElement;
/*     */       //   805	22	3	targetElement	Lcom/intellij/psi/PsiElement;
/*     */       //   827	140	3	targetElement	Lcom/intellij/psi/PsiElement;
/*     */       //   1017	19	3	targetElement	Lcom/intellij/psi/PsiElement;
/*     */       //   1036	16	3	targetElement	Lcom/intellij/psi/PsiElement;
/*     */       //   278	67	4	standardSuggestions	Lkotlinx/coroutines/Deferred;
/*     */       //   366	171	4	standardSuggestions	Lkotlinx/coroutines/Deferred;
/*     */       //   555	159	4	standardSuggestions	Lkotlinx/coroutines/Deferred;
/*     */       //   774	31	4	standardSuggestions	Lkotlinx/coroutines/Deferred;
/*     */       //   805	16	4	standardSuggestions	Lkotlinx/coroutines/Deferred;
/*     */       //   417	44	6	duration	J
/*     */       //   427	110	8	suggestedNames	Ljava/util/List;
/*     */       //   546	34	8	suggestedNames	Ljava/util/List;
/*     */       //   298	47	9	start$iv	J
/*     */       //   357	45	9	start$iv	J
/*     */       //   573	141	9	originalName	Ljava/lang/String;
/*     */       //   765	40	9	originalName	Ljava/lang/String;
/*     */       //   805	16	9	originalName	Ljava/lang/String;
/*     */       //   1060	71	10	uniqNames	Ljava/util/List;
/*     */       //   580	19	11	$this$filter$iv	Ljava/lang/Iterable;
/*     */       //   832	25	11	$this$filter$iv	Ljava/lang/Iterable;
/*     */       //   384	18	12	result$iv	Ljava/lang/Object;
/*     */       //   599	12	13	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */       //   599	115	14	destination$iv$iv	Ljava/util/Collection;
/*     */       //   756	67	14	destination$iv$iv	Ljava/util/Collection;
/*     */       //   857	12	14	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */       //   857	110	15	destination$iv$iv	Ljava/util/Collection;
/*     */       //   1000	54	15	destination$iv$iv	Ljava/util/Collection;
/*     */       //   630	84	17	element$iv$iv	Ljava/lang/Object;
/*     */       //   738	80	17	element$iv$iv	Ljava/lang/Object;
/*     */       //   637	77	18	it	Ljava/lang/String;
/*     */       //   732	72	18	it	Ljava/lang/String;
/*     */       //   888	79	18	element$iv$iv	Ljava/lang/Object;
/*     */       //   982	67	18	element$iv$iv	Ljava/lang/Object;
/*     */       //   895	63	19	it	Ljava/lang/String;
/*     */       //   301	44	11	$i$a$-measureTimeMillisWithResult-LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$3	I
/*     */       //   293	52	8	$i$f$measureTimeMillisWithResult	I
/*     */       //   640	74	19	$i$a$-filter-LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$uniqNames$1	I
/*     */       //   602	112	15	$i$f$filterTo	I
/*     */       //   583	131	12	$i$f$filter	I
/*     */       //   898	69	20	$i$a$-filter-LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$uniqNames$2	I
/*     */       //   860	107	16	$i$f$filterTo	I
/*     */       //   841	126	13	$i$f$filter	I
/*     */       //   64	1097	0	this	Lcom/intellij/ml/llm/refactorings/LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1;
/*     */       //   64	1097	1	$result	Ljava/lang/Object;
/*     */       //   351	31	11	$i$a$-measureTimeMillisWithResult-LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$3	I
/*     */       //   348	54	8	$i$f$measureTimeMillisWithResult	I
/*     */       //   723	82	19	$i$a$-filter-LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$uniqNames$1	I
/*     */       //   720	103	15	$i$f$filterTo	I
/*     */       //   717	110	12	$i$f$filter	I
/*     */       //   976	60	20	$i$a$-filter-LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$uniqNames$2	I
/*     */       //   973	81	16	$i$f$filterTo	I
/*     */       //   970	88	13	$i$f$filter	I } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1> $completion) { LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1 llmLookupManagerListener$activeLookupChanged$updatingLookupJob$1 = new LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1(this.$loggerService, this.$statistic, this.$lookup, this.$editor, this.$targetElementUtil, $completion); llmLookupManagerListener$activeLookupChanged$updatingLookupJob$1.L$0 = value; return (Continuation<Unit>)llmLookupManagerListener$activeLookupChanged$updatingLookupJob$1; } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\002\030\002\n\000\020\000\032\t\030\0010\001¢\006\002\b\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "Lcom/intellij/psi/PsiElement;", "Lorg/jetbrains/annotations/Nullable;", "invoke"}) @SourceDebugExtension({"SMAP\nLlmLookupManagerListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LlmLookupManagerListener.kt\ncom/intellij/ml/llm/refactorings/LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$targetElement$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,150:1\n1603#2,9:151\n1855#2:160\n1856#2:162\n1612#2:163\n1#3:161\n*S KotlinDebug\n*F\n+ 1 LlmLookupManagerListener.kt\ncom/intellij/ml/llm/refactorings/LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$targetElement$1\n*L\n56#1:151,9\n56#1:160\n56#1:162\n56#1:163\n56#1:161\n*E\n"}) static final class LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$targetElement$1 extends Lambda implements Function0<PsiElement>
/*     */     {
/* 159 */       @Nullable public final PsiElement invoke() { Intrinsics.checkNotNullExpressionValue(this.$editor.getCaretModel().getAllCarets(), "editor.caretModel.allCarets"); List list1 = this.$editor.getCaretModel().getAllCarets(); TargetElementUtil targetElementUtil = this.$targetElementUtil; Editor editor = this.$editor; int $i$f$mapNotNull = 0; List list2 = list1; Collection destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0; Iterable $this$forEach$iv$iv$iv = list2; int $i$f$forEach = 0;
/* 160 */         Iterator iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; Caret it = (Caret)element$iv$iv;
/*     */           int $i$a$-mapNotNull-LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$targetElement$1$1 = 0; }
/*     */         
/* 163 */         return (PsiElement)CollectionsKt.singleOrNull(CollectionsKt.distinct(destination$iv$iv)); }
/*     */ 
/*     */       
/*     */       LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$targetElement$1(Editor $editor, TargetElementUtil $targetElementUtil) {
/*     */         super(0);
/*     */       }
/*     */     }
/*     */     
/*     */     @DebugMetadata(f = "LlmLookupManagerListener.kt", l = {63}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.refactorings.LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$standardSuggestions$1")
/*     */     @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\"\n\002\020\016\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001*\0020\003H@"}, d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */     static final class LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$standardSuggestions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Set<? extends String>>, Object> {
/*     */       int label;
/*     */       
/*     */       LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$standardSuggestions$1(PsiElement $targetElement, LookupImpl $lookup, Continuation $completion) {
/*     */         super(2, $completion);
/*     */       }
/*     */       
/*     */       @Nullable
/*     */       public final Object invokeSuspend(@NotNull Object $result) {
/*     */         Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */         switch (this.label) {
/*     */           case 0:
/*     */             ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */             this.label = 1;
/*     */             return (CoroutinesKt.smartReadAction(LlmLookupManagerListener.this.project, new Function0<Set<? extends String>>(this.$targetElement, this.$lookup) {
/*     */                   @NotNull
/*     */                   public final Set<String> invoke() {
/*     */                     return LlmLookupManagerListener.this.getStandardNameSuggestions(this.$targetElement, this.$lookup.getPsiElement());
/*     */                   }
/*     */                 }(Continuation)this) == object) ? object : CoroutinesKt.smartReadAction(LlmLookupManagerListener.this.project, new Function0<Set<? extends String>>(this.$targetElement, this.$lookup) {
/*     */                   @NotNull
/*     */                   public final Set<String> invoke() {
/*     */                     return LlmLookupManagerListener.this.getStandardNameSuggestions(this.$targetElement, this.$lookup.getPsiElement());
/*     */                   }
/*     */                 }(Continuation)this);
/*     */           case 1:
/*     */             ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */             return SYNTHETIC_LOCAL_VARIABLE_1;
/*     */         } 
/*     */         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$standardSuggestions$1> $completion) {
/*     */         return (Continuation<Unit>)new LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$standardSuggestions$1(this.$targetElement, this.$lookup, $completion);
/*     */       }
/*     */       
/*     */       @Nullable
/*     */       public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */         return ((LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$standardSuggestions$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\016\n\002\030\002\n\002\030\002\n\000\020\000\032\016\030\0010\001¢\006\002\b\002¢\006\002\b\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "Lorg/jetbrains/annotations/Nullable;", "Lcom/intellij/openapi/util/NlsSafe;", "invoke"})
/*     */     static final class LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$originalName$1 extends Lambda implements Function0<String> {
/*     */       LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$originalName$1(PsiElement $targetElement) {
/*     */         super(0);
/*     */       }
/*     */       
/*     */       @Nullable
/*     */       public final String invoke() {
/*     */         PsiElement psiElement = this.$targetElement;
/*     */         (psiElement instanceof com.intellij.psi.PsiNamedElement) ? psiElement : null;
/*     */         return (((psiElement instanceof com.intellij.psi.PsiNamedElement) ? psiElement : null) != null) ? ((psiElement instanceof com.intellij.psi.PsiNamedElement) ? psiElement : null).getName() : null;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\031\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\004\032\0020\005H\026¨\006\007"}, d2 = {"com/intellij/ml/llm/refactorings/LlmLookupManagerListener$activeLookupChanged$2", "Lcom/intellij/codeInsight/lookup/LookupListener;", "itemSelected", "", "event", "Lcom/intellij/codeInsight/lookup/LookupEvent;", "lookupCanceled", "intellij.ml.llm"})
/*     */   public static final class LlmLookupManagerListener$activeLookupChanged$2 implements LookupListener {
/*     */     LlmLookupManagerListener$activeLookupChanged$2(Job $updatingLookupJob, CommonLoggerService $loggerService, CompositeStatisticsIdeActivity $statistic, Editor $editor) {}
/*     */     
/*     */     public void lookupCanceled(@NotNull LookupEvent event) {
/*     */       Intrinsics.checkNotNullParameter(event, "event");
/*     */       Job.DefaultImpls.cancel$default(this.$updatingLookupJob, null, 1, null);
/*     */       this.$loggerService.logNameSuggestionFinished(this.$statistic, null);
/*     */       this.$statistic.scored(ScoreResult.NO);
/*     */     }
/*     */     
/*     */     public void itemSelected(@NotNull LookupEvent event) {
/*     */       Intrinsics.checkNotNullParameter(event, "event");
/*     */       Job.DefaultImpls.cancel$default(this.$updatingLookupJob, null, 1, null);
/*     */       LookupElement item = event.getItem();
/*     */       if (item instanceof LlmLookupManagerListener.LlmLookupElement) {
/*     */         ((LlmLookupManagerListener.LlmLookupElement)item).handleInsert(this.$editor);
/*     */         this.$statistic.scored(ScoreResult.YES);
/*     */       } else {
/*     */         this.$statistic.scored(ScoreResult.NO);
/*     */       } 
/*     */       this.$loggerService.logNameSuggestionFinished(this.$statistic, (item != null) ? item.getLookupString() : null);
/*     */     }
/*     */   }
/*     */   
/*     */   private final Set<String> getStandardNameSuggestions(PsiElement targetElement, PsiElement originalPosition) {
/*     */     Set<String> result = new LinkedHashSet();
/*     */     NameSuggestionProvider.suggestNames(targetElement, originalPosition, result);
/*     */     return result;
/*     */   }
/*     */   
/*     */   private final boolean isLanguageAtOffsetSupported(Editor editor) {
/*     */     for (Caret caret : editor.getCaretModel().getAllCarets()) {
/*     */       Intrinsics.checkNotNullExpressionValue(PsiUtilCore.getLanguageAtOffset(PsiEditorUtil.getPsiFile(editor), caret.getOffset()), "getLanguageAtOffset(PsiE…le(editor), caret.offset)");
/*     */       Language language = PsiUtilCore.getLanguageAtOffset(PsiEditorUtil.getPsiFile(editor), caret.getOffset());
/*     */       if (NameSuggestionContextProvider.Companion.isSupportedForLanguage(language))
/*     */         return true; 
/*     */     } 
/*     */     return false;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\b\020\005\032\0020\003H\026J\016\020\006\032\0020\0072\006\020\b\032\0020\tJ\020\020\n\032\0020\0072\006\020\013\032\0020\fH\026R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/refactorings/LlmLookupManagerListener$LlmLookupElement;", "Lcom/intellij/codeInsight/lookup/LookupElement;", "lookup", "", "(Ljava/lang/String;)V", "getLookupString", "handleInsert", "", "editor", "Lcom/intellij/openapi/editor/Editor;", "renderElement", "presentation", "Lcom/intellij/codeInsight/lookup/LookupElementPresentation;", "intellij.ml.llm"})
/*     */   public static final class LlmLookupElement extends LookupElement {
/*     */     @NotNull
/*     */     private final String lookup;
/*     */     
/*     */     public LlmLookupElement(@NotNull String lookup) {
/*     */       this.lookup = lookup;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String getLookupString() {
/*     */       return this.lookup;
/*     */     }
/*     */     
/*     */     public final void handleInsert(@NotNull Editor editor) {
/*     */       TemplateState templateState;
/*     */       Intrinsics.checkNotNullParameter(editor, "editor");
/*     */       if (TemplateManagerImpl.getTemplateState(editor) == null) {
/*     */         TemplateManagerImpl.getTemplateState(editor);
/*     */         return;
/*     */       } 
/*     */       if (!templateState.isFinished()) {
/*     */         templateState.update();
/*     */         templateState.considerNextTabOnLookupItemSelected(this);
/*     */       } 
/*     */     }
/*     */     
/*     */     public void renderElement(@NotNull LookupElementPresentation presentation) {
/*     */       Intrinsics.checkNotNullParameter(presentation, "presentation");
/*     */       presentation.setIcon(MLLlmIcons.AiAssistant);
/*     */       super.renderElement(presentation);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\002\b\002\b\000\030\0002\0020\001B\005¢\006\002\020\002J\031\020\003\032\0020\0042\006\020\005\032\0020\006H@ø\001\000¢\006\002\020\007\002\004\n\002\b\031¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/refactorings/LlmLookupManagerListener$StartupActivity;", "Lcom/intellij/openapi/startup/ProjectActivity;", "()V", "execute", "", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intellij.ml.llm"})
/*     */   public static final class StartupActivity implements ProjectActivity {
/*     */     @Nullable
/*     */     public Object execute(@NotNull Project project, @NotNull Continuation $completion) {
/*     */       LlmLookupManagerListener llmLookupManagerListener = new LlmLookupManagerListener(project);
/*     */       Intrinsics.checkNotNullExpressionValue(LookupManagerListener.TOPIC, "TOPIC");
/*     */       project.getMessageBus().connect().subscribe(LookupManagerListener.TOPIC, llmLookupManagerListener);
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/refactorings/LlmLookupManagerListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */