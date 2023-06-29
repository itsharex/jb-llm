/*    */ package com.intellij.ml.llm.performanceTesting.name.suggestion;
/*    */ import com.intellij.openapi.ui.playback.PlaybackContext;
/*    */ import com.jetbrains.performancePlugin.utils.ActionCallbackProfilerStopper;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\030\000 \r2\0020\001:\001\rB\032\022\013\020\002\032\0070\003¢\006\002\b\004\022\006\020\005\032\0020\006¢\006\002\020\007J\030\020\b\032\n\022\006\022\004\030\0010\n0\t2\006\020\013\032\0020\fH\024¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/performanceTesting/name/suggestion/WaitForLlmNameSuggestions;", "Lcom/intellij/openapi/ui/playback/commands/AbstractCommand;", "text", "", "Lorg/jetbrains/annotations/NonNls;", "line", "", "(Ljava/lang/String;I)V", "_execute", "Lorg/jetbrains/concurrency/Promise;", "", "context", "Lcom/intellij/openapi/ui/playback/PlaybackContext;", "Companion", "intellij.ml.llm.performanceTesting"})
/*    */ @SourceDebugExtension({"SMAP\nWaitForLlmNameSuggestions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WaitForLlmNameSuggestions.kt\ncom/intellij/ml/llm/performanceTesting/name/suggestion/WaitForLlmNameSuggestions\n+ 2 service.kt\ncom/intellij/openapi/components/ServiceKt\n*L\n1#1,31:1\n43#2,3:32\n*S KotlinDebug\n*F\n+ 1 WaitForLlmNameSuggestions.kt\ncom/intellij/ml/llm/performanceTesting/name/suggestion/WaitForLlmNameSuggestions\n*L\n23#1:32,3\n*E\n"})
/*    */ public final class WaitForLlmNameSuggestions extends AbstractCommand {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   public WaitForLlmNameSuggestions(@NotNull String text, int line) {
/* 12 */     super(text, line);
/*    */   } @NotNull
/*    */   public static final String PREFIX = "%waitForLlmNameSuggestions"; @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\023\020\003\032\0070\004¢\006\002\b\005XT¢\006\002\n\000¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/performanceTesting/name/suggestion/WaitForLlmNameSuggestions$Companion;", "", "()V", "PREFIX", "", "Lorg/jetbrains/annotations/NonNls;", "intellij.ml.llm.performanceTesting"})
/*    */   public static final class Companion {
/*    */     private Companion() {} } @NotNull
/*    */   protected Promise<Object> _execute(@NotNull PlaybackContext context) {
/* 18 */     Intrinsics.checkNotNullParameter(context, "context"); ActionCallbackProfilerStopper actionCallback = new ActionCallbackProfilerStopper();
/*    */     
/* 20 */     Intrinsics.checkNotNullExpressionValue(extractCommandArgument("%waitForLlmNameSuggestions"), "extractCommandArgument(PREFIX)"); String[] arrayOfString = new String[1]; arrayOfString[0] = " "; List<String> list = StringsKt.split$default(extractCommandArgument("%waitForLlmNameSuggestions"), arrayOfString, false, 0, 6, null); String filePath = list.get(0), offset = list.get(1);
/* 21 */     Intrinsics.checkNotNullExpressionValue(context.getProject(), "context.project"); ProjectUtil.guessProjectDir(context.getProject()); VirtualFile file = (ProjectUtil.guessProjectDir(context.getProject()) != null) ? ProjectUtil.guessProjectDir(context.getProject()).findFileByRelativePath(filePath) : null;
/* 22 */     if (file != null) {
/* 23 */       int $i$f$service = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 32 */       Class<NameSuggestionBenchmarkService> serviceClass$iv = NameSuggestionBenchmarkService.class;
/* 33 */       Object object = ApplicationManager.getApplication().getService(serviceClass$iv); if (object == null)
/* 34 */         throw new RuntimeException("Cannot find service " + serviceClass$iv.getName() + " (classloader=" + serviceClass$iv.getClassLoader() + ", client=" + ClientId.Companion.getCurrentOrNull() + ")"); 
/*    */       Intrinsics.checkNotNullExpressionValue(file.getPath(), "file.path");
/*    */       ((NameSuggestionBenchmarkService)object).onFinish(file.getPath(), Integer.parseInt(offset), new WaitForLlmNameSuggestions$_execute$1(actionCallback));
/*    */     } else {
/*    */       actionCallback.setRejected();
/*    */     } 
/*    */     return Promises.toPromise((ActionCallback)actionCallback);
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */   static final class WaitForLlmNameSuggestions$_execute$1 extends Lambda implements Function0<Unit> {
/*    */     public final void invoke() {
/*    */       this.$actionCallback.setDone();
/*    */     }
/*    */     
/*    */     WaitForLlmNameSuggestions$_execute$1(ActionCallbackProfilerStopper $actionCallback) {
/*    */       super(0);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/performanceTesting/name/suggestion/WaitForLlmNameSuggestions.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */