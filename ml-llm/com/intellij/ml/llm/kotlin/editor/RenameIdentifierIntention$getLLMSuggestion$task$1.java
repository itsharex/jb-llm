/*    */ package com.intellij.ml.llm.kotlin.editor;
/*    */ 
/*    */ import com.intellij.ml.llm.evaluation.CompletedLLMRequest;
/*    */ import com.intellij.ml.llm.evaluation.IntentionCallContext;
/*    */ import com.intellij.openapi.progress.ProgressIndicator;
/*    */ import com.intellij.openapi.progress.Task;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/kotlin/editor/RenameIdentifierIntention$getLLMSuggestion$task$1", "Lcom/intellij/openapi/progress/Task$Backgroundable;", "run", "", "indicator", "Lcom/intellij/openapi/progress/ProgressIndicator;", "intellij.ml.llm.kotlin"})
/*    */ @SourceDebugExtension({"SMAP\nRenameIdentifierIntention.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenameIdentifierIntention.kt\ncom/intellij/ml/llm/kotlin/editor/RenameIdentifierIntention$getLLMSuggestion$task$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,93:1\n1855#2,2:94\n*S KotlinDebug\n*F\n+ 1 RenameIdentifierIntention.kt\ncom/intellij/ml/llm/kotlin/editor/RenameIdentifierIntention$getLLMSuggestion$task$1\n*L\n77#1:94,2\n*E\n"})
/*    */ public final class RenameIdentifierIntention$getLLMSuggestion$task$1
/*    */   extends Task.Backgroundable
/*    */ {
/*    */   public void run(@NotNull ProgressIndicator indicator) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'indicator'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: getfield $project : Lcom/intellij/openapi/project/Project;
/*    */     //   10: aload_0
/*    */     //   11: getfield $prefix : Ljava/lang/String;
/*    */     //   14: aload_0
/*    */     //   15: getfield $suffix : Ljava/lang/String;
/*    */     //   18: aconst_null
/*    */     //   19: aconst_null
/*    */     //   20: aconst_null
/*    */     //   21: aconst_null
/*    */     //   22: aconst_null
/*    */     //   23: aconst_null
/*    */     //   24: iconst_0
/*    */     //   25: aconst_null
/*    */     //   26: aconst_null
/*    */     //   27: aconst_null
/*    */     //   28: sipush #8184
/*    */     //   31: aconst_null
/*    */     //   32: invokestatic sendCompletionChatRequest$default : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;ILkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/core/models/requestResponse/LLMStreamingRequestConsumer;Lcom/intellij/ml/llm/core/models/requestResponse/LLMRequestProvider;ILjava/lang/Object;)Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseResponse;
/*    */     //   35: dup
/*    */     //   36: ifnull -> 64
/*    */     //   39: invokeinterface getSuggestions : ()Ljava/util/List;
/*    */     //   44: dup
/*    */     //   45: ifnull -> 64
/*    */     //   48: invokestatic firstOrNull : (Ljava/util/List;)Ljava/lang/Object;
/*    */     //   51: checkcast com/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice
/*    */     //   54: dup
/*    */     //   55: ifnull -> 64
/*    */     //   58: invokevirtual getText : ()Ljava/lang/String;
/*    */     //   61: goto -> 66
/*    */     //   64: pop
/*    */     //   65: aconst_null
/*    */     //   66: astore_2
/*    */     //   67: aload_0
/*    */     //   68: getfield this$0 : Lcom/intellij/ml/llm/kotlin/editor/RenameIdentifierIntention;
/*    */     //   71: invokestatic access$getLogger$p : (Lcom/intellij/ml/llm/kotlin/editor/RenameIdentifierIntention;)Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   74: aload_2
/*    */     //   75: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   80: invokevirtual info : (Ljava/lang/String;)V
/*    */     //   83: aload_2
/*    */     //   84: dup
/*    */     //   85: ifnull -> 127
/*    */     //   88: checkcast java/lang/CharSequence
/*    */     //   91: iconst_1
/*    */     //   92: anewarray java/lang/String
/*    */     //   95: astore #5
/*    */     //   97: aload #5
/*    */     //   99: iconst_0
/*    */     //   100: ldc ' '
/*    */     //   102: aastore
/*    */     //   103: aload #5
/*    */     //   105: iconst_0
/*    */     //   106: iconst_0
/*    */     //   107: bipush #6
/*    */     //   109: aconst_null
/*    */     //   110: invokestatic split$default : (Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
/*    */     //   113: dup
/*    */     //   114: ifnull -> 127
/*    */     //   117: invokestatic lastOrNull : (Ljava/util/List;)Ljava/lang/Object;
/*    */     //   120: checkcast java/lang/String
/*    */     //   123: dup
/*    */     //   124: ifnonnull -> 129
/*    */     //   127: pop
/*    */     //   128: return
/*    */     //   129: astore_3
/*    */     //   130: new com/intellij/ml/llm/evaluation/CompletedLLMRequest
/*    */     //   133: dup
/*    */     //   134: aload_3
/*    */     //   135: iconst_1
/*    */     //   136: invokespecial <init> : (Ljava/lang/String;Z)V
/*    */     //   139: astore #4
/*    */     //   141: aload_0
/*    */     //   142: getfield $callbacks : Ljava/util/List;
/*    */     //   145: checkcast java/lang/Iterable
/*    */     //   148: astore #5
/*    */     //   150: aload_0
/*    */     //   151: getfield $callContext : Lcom/intellij/ml/llm/evaluation/IntentionCallContext;
/*    */     //   154: astore #6
/*    */     //   156: iconst_0
/*    */     //   157: istore #7
/*    */     //   159: aload #5
/*    */     //   161: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   166: astore #8
/*    */     //   168: aload #8
/*    */     //   170: invokeinterface hasNext : ()Z
/*    */     //   175: ifeq -> 224
/*    */     //   178: aload #8
/*    */     //   180: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   185: astore #9
/*    */     //   187: aload #9
/*    */     //   189: checkcast kotlin/jvm/functions/Function2
/*    */     //   192: astore #10
/*    */     //   194: iconst_0
/*    */     //   195: istore #11
/*    */     //   197: aconst_null
/*    */     //   198: new com/intellij/ml/llm/kotlin/editor/RenameIdentifierIntention$getLLMSuggestion$task$1$run$1$1
/*    */     //   201: dup
/*    */     //   202: aload #10
/*    */     //   204: aload #6
/*    */     //   206: aload #4
/*    */     //   208: invokespecial <init> : (Lkotlin/jvm/functions/Function2;Lcom/intellij/ml/llm/evaluation/IntentionCallContext;Lcom/intellij/ml/llm/evaluation/CompletedLLMRequest;)V
/*    */     //   211: checkcast kotlin/jvm/functions/Function0
/*    */     //   214: iconst_1
/*    */     //   215: aconst_null
/*    */     //   216: invokestatic invokeLater$default : (Lcom/intellij/openapi/application/ModalityState;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V
/*    */     //   219: nop
/*    */     //   220: nop
/*    */     //   221: goto -> 168
/*    */     //   224: nop
/*    */     //   225: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #73	-> 6
/*    */     //   #74	-> 67
/*    */     //   #75	-> 83
/*    */     //   #76	-> 130
/*    */     //   #77	-> 141
/*    */     //   #94	-> 159
/*    */     //   #78	-> 197
/*    */     //   #81	-> 219
/*    */     //   #94	-> 220
/*    */     //   #95	-> 224
/*    */     //   #82	-> 225
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   197	23	11	$i$a$-forEach-RenameIdentifierIntention$getLLMSuggestion$task$1$run$1	I
/*    */     //   194	26	10	it	Lkotlin/jvm/functions/Function2;
/*    */     //   187	34	9	element$iv	Ljava/lang/Object;
/*    */     //   159	66	7	$i$f$forEach	I
/*    */     //   156	69	5	$this$forEach$iv	Ljava/lang/Iterable;
/*    */     //   67	159	2	predictedText	Ljava/lang/String;
/*    */     //   130	96	3	predictedName	Ljava/lang/String;
/*    */     //   141	85	4	completedLLMRequest	Lcom/intellij/ml/llm/evaluation/CompletedLLMRequest;
/*    */     //   0	226	0	this	Lcom/intellij/ml/llm/kotlin/editor/RenameIdentifierIntention$getLLMSuggestion$task$1;
/*    */     //   0	226	1	indicator	Lcom/intellij/openapi/progress/ProgressIndicator;
/*    */   }
/*    */   
/*    */   RenameIdentifierIntention$getLLMSuggestion$task$1(String $prefix, String $suffix, RenameIdentifierIntention $receiver, List<Function2<IntentionCallContext, CompletedLLMRequest, Unit>> $callbacks, IntentionCallContext $callContext, String $super_call_param$1) {
/* 71 */     super($project, $super_call_param$1);
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */   static final class RenameIdentifierIntention$getLLMSuggestion$task$1$run$1$1
/*    */     extends Lambda
/*    */     implements Function0<Unit> {
/*    */     public final void invoke() {
/* 79 */       this.$it.invoke(this.$callContext, this.$completedLLMRequest);
/*    */     }
/*    */     
/*    */     RenameIdentifierIntention$getLLMSuggestion$task$1$run$1$1(Function2<IntentionCallContext, CompletedLLMRequest, Unit> $it, IntentionCallContext $callContext, CompletedLLMRequest $completedLLMRequest) {
/*    */       super(0);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/editor/RenameIdentifierIntention$getLLMSuggestion$task$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */