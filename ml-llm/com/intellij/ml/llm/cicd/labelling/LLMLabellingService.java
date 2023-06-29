/*    */ package com.intellij.ml.llm.cicd.labelling;
/*    */ import com.intellij.ml.llm.core.models.requestResponse.LLMBaseResponse;
/*    */ import com.intellij.ml.llm.core.models.requestResponse.LLMResponseChoice;
/*    */ import com.intellij.openapi.diagnostic.Logger;
/*    */ import com.intellij.openapi.progress.ProgressIndicator;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import com.intellij.util.concurrency.AppExecutorUtil;
/*    */ import java.nio.charset.Charset;
/*    */ import java.nio.file.Files;
/*    */ import java.nio.file.LinkOption;
/*    */ import java.nio.file.OpenOption;
/*    */ import java.nio.file.Path;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.coroutines.CoroutineContext;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Ref;
/*    */ import kotlinx.coroutines.CoroutineExceptionHandler;
/*    */ import org.apache.commons.lang.StringEscapeUtils;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Service
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\003\b\007\030\0002\0020\001B\005¢\006\002\020\002J\036\020\n\032\0020\0042\006\020\013\032\0020\f2\006\020\r\032\0020\0042\006\020\016\032\0020\004J.\020\017\032\0020\0202\006\020\013\032\0020\f2\006\020\r\032\0020\0042\006\020\016\032\0020\0042\006\020\021\032\0020\0042\006\020\022\032\0020\004R\016\020\003\032\0020\004XD¢\006\002\n\000R\016\020\005\032\0020\006X\004¢\006\002\n\000R\016\020\007\032\0020\004XD¢\006\002\n\000R\016\020\b\032\0020\tX\004¢\006\002\n\000¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/cicd/labelling/LLMLabellingService;", "", "()V", "csvHeader", "", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "resultsFilename", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getResponse", "project", "Lcom/intellij/openapi/project/Project;", "modelType", "prompt", "saveResult", "", "output", "comment", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nLLMLabellingService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMLabellingService.kt\ncom/intellij/ml/llm/cicd/labelling/LLMLabellingService\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,85:1\n10#2:86\n1#3:87\n48#4,4:88\n*S KotlinDebug\n*F\n+ 1 LLMLabellingService.kt\ncom/intellij/ml/llm/cicd/labelling/LLMLabellingService\n*L\n29#1:86\n35#1:88,4\n*E\n"})
/*    */ public final class LLMLabellingService {
/*    */   public LLMLabellingService() {
/* 29 */     int $i$f$logger = 0;
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
/* 86 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(LLMLabellingService.class), "getInstance(T::class.java)"); Logger logger1 = Logger.getInstance(LLMLabellingService.class); Logger logger2 = logger1;
/* 87 */     LLMLabellingService lLMLabellingService = this; int $i$a$-also-LLMLabellingService$logger$1 = 0; logger2.setLevel(LogLevel.INFO); lLMLabellingService.logger = logger1; this.resultsFilename = "results.csv"; this.csvHeader = "model,prompt,output,comment"; Intrinsics.checkNotNullExpressionValue(AppExecutorUtil.getAppExecutorService(), "getAppExecutorService()"); int $i$f$CoroutineExceptionHandler = 0;
/* 88 */     CoroutineExceptionHandler.Key key = CoroutineExceptionHandler.Key; this.scope = CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(AppExecutorUtil.getAppExecutorService()).plus((CoroutineContext)new CoroutineName("javaClass")).plus((CoroutineContext)new LLMLabellingService$special$$inlined$CoroutineExceptionHandler$1(key, this)));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private final Logger logger;
/*    */   @NotNull
/*    */   private final String resultsFilename;
/*    */   @NotNull
/*    */   private final String csvHeader;
/*    */   @NotNull
/*    */   private final CoroutineScope scope;
/*    */   
/*    */   @NotNull
/*    */   public final String getResponse(@NotNull Project project, @NotNull String modelType, @NotNull String prompt) {
/*    */     Intrinsics.checkNotNullParameter(project, "project");
/*    */     Intrinsics.checkNotNullParameter(modelType, "modelType");
/*    */     Intrinsics.checkNotNullParameter(prompt, "prompt");
/*    */     String preparedPrompt = "/* " + prompt + " */";
/*    */     Intrinsics.checkNotNullExpressionValue(ProgressManager.getInstance().run(new LLMLabellingService$getResponse$1(project, preparedPrompt)), "project: Project, modelT…trim()\n        }\n      })");
/*    */     return (String)ProgressManager.getInstance().run(new LLMLabellingService$getResponse$1(project, preparedPrompt));
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\037\n\000\n\002\030\002\n\002\020\016\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000*\001\000\b\n\030\0002\022\022\004\022\0020\002\022\b\022\0060\003j\002`\0040\001J\020\020\005\032\0020\0022\006\020\006\032\0020\007H\024¨\006\b"}, d2 = {"com/intellij/ml/llm/cicd/labelling/LLMLabellingService$getResponse$1", "Lcom/intellij/openapi/progress/Task$WithResult;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "compute", "indicator", "Lcom/intellij/openapi/progress/ProgressIndicator;", "intellij.ml.llm"})
/*    */   public static final class LLMLabellingService$getResponse$1 extends Task.WithResult<String, Exception> {
/*    */     LLMLabellingService$getResponse$1(Project $project, String $preparedPrompt) {
/*    */       super($project, "Running Model", true);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     protected String compute(@NotNull ProgressIndicator indicator) {
/*    */       LLMBaseResponse response;
/*    */       String output;
/*    */       Intrinsics.checkNotNullParameter(indicator, "indicator");
/*    */       if (SenderKt.sendCompletionChatRequest$default(this.$project, this.$preparedPrompt, "", Integer.valueOf(1000), null, null, null, null, null, 0, null, null, null, 8176, null) == null) {
/*    */         SenderKt.sendCompletionChatRequest$default(this.$project, this.$preparedPrompt, "", Integer.valueOf(1000), null, null, null, null, null, 0, null, null, null, 8176, null);
/*    */         return "Internal error: failed to get/parse response";
/*    */       } 
/*    */       if ((LLMResponseChoice)CollectionsKt.firstOrNull(response.getSuggestions()) == null || ((LLMResponseChoice)CollectionsKt.firstOrNull(response.getSuggestions())).getText() == null) {
/*    */         ((LLMResponseChoice)CollectionsKt.firstOrNull(response.getSuggestions())).getText();
/*    */         return "Internal error: failed to extract suggestions";
/*    */       } 
/*    */       return StringsKt.trim(StringsKt.substringAfter$default(output, this.$preparedPrompt, null, 2, null)).toString();
/*    */     }
/*    */   }
/*    */   
/*    */   public final void saveResult(@NotNull Project project, @NotNull String modelType, @NotNull String prompt, @NotNull String output, @NotNull String comment) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'project'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_2
/*    */     //   7: ldc 'modelType'
/*    */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: aload_3
/*    */     //   13: ldc 'prompt'
/*    */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   18: aload #4
/*    */     //   20: ldc 'output'
/*    */     //   22: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   25: aload #5
/*    */     //   27: ldc 'comment'
/*    */     //   29: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   32: aload_1
/*    */     //   33: invokestatic guessProjectDir : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   36: dup
/*    */     //   37: ifnonnull -> 42
/*    */     //   40: pop
/*    */     //   41: return
/*    */     //   42: astore #6
/*    */     //   44: new kotlin/jvm/internal/Ref$ObjectRef
/*    */     //   47: dup
/*    */     //   48: invokespecial <init> : ()V
/*    */     //   51: astore #7
/*    */     //   53: aload #7
/*    */     //   55: aload #6
/*    */     //   57: invokevirtual toNioPath : ()Ljava/nio/file/Path;
/*    */     //   60: aload_0
/*    */     //   61: getfield resultsFilename : Ljava/lang/String;
/*    */     //   64: invokeinterface resolve : (Ljava/lang/String;)Ljava/nio/file/Path;
/*    */     //   69: putfield element : Ljava/lang/Object;
/*    */     //   72: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*    */     //   75: aload #7
/*    */     //   77: aload_0
/*    */     //   78: aload_2
/*    */     //   79: aload_3
/*    */     //   80: aload #4
/*    */     //   82: aload #5
/*    */     //   84: <illegal opcode> run : (Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/intellij/ml/llm/cicd/labelling/LLMLabellingService;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Runnable;
/*    */     //   89: invokeinterface runWriteAction : (Ljava/lang/Runnable;)V
/*    */     //   94: aconst_null
/*    */     //   95: new com/intellij/ml/llm/cicd/labelling/LLMLabellingService$saveResult$2
/*    */     //   98: dup
/*    */     //   99: aload #6
/*    */     //   101: aload_0
/*    */     //   102: aload_1
/*    */     //   103: invokespecial <init> : (Lcom/intellij/openapi/vfs/VirtualFile;Lcom/intellij/ml/llm/cicd/labelling/LLMLabellingService;Lcom/intellij/openapi/project/Project;)V
/*    */     //   106: checkcast kotlin/jvm/functions/Function0
/*    */     //   109: iconst_1
/*    */     //   110: aconst_null
/*    */     //   111: invokestatic invokeLater$default : (Lcom/intellij/openapi/application/ModalityState;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V
/*    */     //   114: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #59	-> 32
/*    */     //   #60	-> 44
/*    */     //   #62	-> 72
/*    */     //   #77	-> 94
/*    */     //   #83	-> 114
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   44	71	6	rootDir	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   53	62	7	resultsFile	Lkotlin/jvm/internal/Ref$ObjectRef;
/*    */     //   0	115	0	this	Lcom/intellij/ml/llm/cicd/labelling/LLMLabellingService;
/*    */     //   0	115	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   0	115	2	modelType	Ljava/lang/String;
/*    */     //   0	115	3	prompt	Ljava/lang/String;
/*    */     //   0	115	4	output	Ljava/lang/String;
/*    */     //   0	115	5	comment	Ljava/lang/String;
/*    */   }
/*    */   
/*    */   private static final void saveResult$lambda$2(Ref.ObjectRef $resultsFile, LLMLabellingService this$0, String $modelType, String $prompt, String $output, String $comment) {
/*    */     Intrinsics.checkNotNullParameter($resultsFile, "$resultsFile");
/*    */     Intrinsics.checkNotNullParameter(this$0, "this$0");
/*    */     Intrinsics.checkNotNullParameter($modelType, "$modelType");
/*    */     Intrinsics.checkNotNullParameter($prompt, "$prompt");
/*    */     Intrinsics.checkNotNullParameter($output, "$output");
/*    */     Intrinsics.checkNotNullParameter($comment, "$comment");
/*    */     Intrinsics.checkNotNullExpressionValue($resultsFile.element, "resultsFile");
/*    */     Path path1 = (Path)$resultsFile.element;
/*    */     LinkOption[] arrayOfLinkOption = new LinkOption[0];
/*    */     if (!Files.exists(path1, Arrays.<LinkOption>copyOf(arrayOfLinkOption, arrayOfLinkOption.length))) {
/*    */       Intrinsics.checkNotNullExpressionValue($resultsFile.element, "resultsFile");
/*    */       $resultsFile.element = PathKt.createFile((Path)$resultsFile.element);
/*    */       Intrinsics.checkNotNullExpressionValue($resultsFile.element, "resultsFile");
/*    */       PathsKt.appendText$default((Path)$resultsFile.element, this$0.csvHeader + "\n", null, 2, null);
/*    */     } 
/*    */     String[] arrayOfString = new String[4];
/*    */     arrayOfString[0] = StringEscapeUtils.escapeCsv($modelType);
/*    */     arrayOfString[1] = StringEscapeUtils.escapeCsv($prompt);
/*    */     arrayOfString[2] = StringEscapeUtils.escapeCsv($output);
/*    */     arrayOfString[3] = StringEscapeUtils.escapeCsv($comment);
/*    */     String csvLine = CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[])arrayOfString), ",", null, null, 0, null, null, 62, null);
/*    */     Intrinsics.checkNotNullExpressionValue($resultsFile.element, "resultsFile");
/*    */     Path path2 = (Path)$resultsFile.element;
/*    */     List<? extends CharSequence> list = CollectionsKt.listOf(csvLine);
/*    */     Charset charset = Charsets.UTF_8;
/*    */     OpenOption[] arrayOfOpenOption = new OpenOption[1];
/*    */     arrayOfOpenOption[0] = StandardOpenOption.APPEND;
/*    */     Intrinsics.checkNotNullExpressionValue(Files.write(path2, list, charset, arrayOfOpenOption), "write(this, lines, chars…tandardOpenOption.APPEND)");
/*    */     Files.write(path2, list, charset, arrayOfOpenOption);
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */   static final class LLMLabellingService$saveResult$2 extends Lambda implements Function0<Unit> {
/*    */     public final void invoke() {
/*    */       VirtualFile virtualFile;
/*    */       if (this.$rootDir.findChild(LLMLabellingService.this.resultsFilename) == null) {
/*    */         this.$rootDir.findChild(LLMLabellingService.this.resultsFilename);
/*    */         return;
/*    */       } 
/*    */       virtualFile.refresh(true, false);
/*    */       FileEditorManagerEx.Companion.getInstanceEx(this.$project).updateFilePresentation(virtualFile);
/*    */       FileEditorManager.getInstance(this.$project).openFile(virtualFile, true);
/*    */     }
/*    */     
/*    */     LLMLabellingService$saveResult$2(LLMLabellingService $receiver, Project $project) {
/*    */       super(0);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/cicd/labelling/LLMLabellingService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */