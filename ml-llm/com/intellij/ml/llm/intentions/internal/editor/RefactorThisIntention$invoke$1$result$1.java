/*    */ package com.intellij.ml.llm.intentions.internal.editor;
/*    */ 
/*    */ import com.intellij.ml.llm.core.models.SenderKt;
/*    */ import com.intellij.ml.llm.core.models.requestResponse.LLMBaseResponse;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.Ref;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @DebugMetadata(f = "RefactorThisIntention.kt", l = {64}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.intentions.internal.editor.RefactorThisIntention$invoke$1$result$1")
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\016\n\002\030\002\020\000\032\004\030\0010\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class RefactorThisIntention$invoke$1$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
/*    */   int label;
/*    */   
/*    */   RefactorThisIntention$invoke$1$result$1(Project $project, Ref.ObjectRef<String> $selectedText, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invokeSuspend(@NotNull Object $result) {
/*    */     // Byte code:
/*    */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   3: astore #5
/*    */     //   5: aload_0
/*    */     //   6: getfield label : I
/*    */     //   9: tableswitch default -> 123, 0 -> 32, 1 -> 75
/*    */     //   32: aload_1
/*    */     //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   36: new com/intellij/ml/llm/intentions/internal/editor/RefactorThisIntention$invoke$1$result$1$1
/*    */     //   39: dup
/*    */     //   40: aload_0
/*    */     //   41: getfield $project : Lcom/intellij/openapi/project/Project;
/*    */     //   44: aload_0
/*    */     //   45: getfield $selectedText : Lkotlin/jvm/internal/Ref$ObjectRef;
/*    */     //   48: invokespecial <init> : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/internal/Ref$ObjectRef;)V
/*    */     //   51: checkcast kotlin/jvm/functions/Function0
/*    */     //   54: aload_0
/*    */     //   55: checkcast kotlin/coroutines/Continuation
/*    */     //   58: aload_0
/*    */     //   59: iconst_1
/*    */     //   60: putfield label : I
/*    */     //   63: invokestatic blockingContext : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   66: dup
/*    */     //   67: aload #5
/*    */     //   69: if_acmpne -> 80
/*    */     //   72: aload #5
/*    */     //   74: areturn
/*    */     //   75: aload_1
/*    */     //   76: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   79: aload_1
/*    */     //   80: checkcast com/intellij/ml/llm/core/models/requestResponse/LLMBaseResponse
/*    */     //   83: astore_2
/*    */     //   84: aload_2
/*    */     //   85: ifnull -> 121
/*    */     //   88: aload_2
/*    */     //   89: invokeinterface getSuggestions : ()Ljava/util/List;
/*    */     //   94: astore_3
/*    */     //   95: aload_3
/*    */     //   96: ifnull -> 121
/*    */     //   99: aload_3
/*    */     //   100: invokestatic firstOrNull : (Ljava/util/List;)Ljava/lang/Object;
/*    */     //   103: checkcast com/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice
/*    */     //   106: astore #4
/*    */     //   108: aload #4
/*    */     //   110: ifnull -> 121
/*    */     //   113: aload #4
/*    */     //   115: invokestatic asCode : (Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;)Ljava/lang/String;
/*    */     //   118: goto -> 122
/*    */     //   121: aconst_null
/*    */     //   122: areturn
/*    */     //   123: new java/lang/IllegalStateException
/*    */     //   126: dup
/*    */     //   127: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   129: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   132: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #63	-> 3
/*    */     //   #66	-> 36
/*    */     //   #64	-> 36
/*    */     //   #63	-> 72
/*    */     //   #66	-> 84
/*    */     //   #64	-> 88
/*    */     //   #66	-> 89
/*    */     //   #63	-> 123
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   36	87	0	this	Lcom/intellij/ml/llm/intentions/internal/editor/RefactorThisIntention$invoke$1$result$1;
/*    */     //   36	87	1	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super RefactorThisIntention$invoke$1$result$1> $completion) {
/*    */     return (Continuation<Unit>)new RefactorThisIntention$invoke$1$result$1(this.$project, this.$selectedText, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */     return ((RefactorThisIntention$invoke$1$result$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/internal/editor/RefactorThisIntention$invoke$1$result$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */