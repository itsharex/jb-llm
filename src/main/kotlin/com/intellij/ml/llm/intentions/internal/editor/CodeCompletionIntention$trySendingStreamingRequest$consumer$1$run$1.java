/*     */ package com.intellij.ml.llm.intentions.internal.editor;
/*     */ 
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMResponseChoice;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*     */ final class CodeCompletionIntention$trySendingStreamingRequest$consumer$1$run$1
/*     */   extends Lambda
/*     */   implements Function0<Unit>
/*     */ {
/*     */   public final void invoke() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   4: aload_0
/*     */     //   5: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   8: aload_0
/*     */     //   9: getfield $choice : Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;
/*     */     //   12: aload_0
/*     */     //   13: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*     */     //   16: aload_0
/*     */     //   17: getfield $currentOffset : Lkotlin/jvm/internal/Ref$IntRef;
/*     */     //   20: <illegal opcode> run : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;Lcom/intellij/openapi/editor/Editor;Lkotlin/jvm/internal/Ref$IntRef;)Ljava/lang/Runnable;
/*     */     //   25: invokestatic runWriteCommandAction : (Lcom/intellij/openapi/project/Project;Ljava/lang/Runnable;)V
/*     */     //   28: aload_0
/*     */     //   29: getfield $currentOffset : Lkotlin/jvm/internal/Ref$IntRef;
/*     */     //   32: aload_0
/*     */     //   33: getfield $currentOffset : Lkotlin/jvm/internal/Ref$IntRef;
/*     */     //   36: getfield element : I
/*     */     //   39: aload_0
/*     */     //   40: getfield $choice : Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;
/*     */     //   43: invokevirtual getText : ()Ljava/lang/String;
/*     */     //   46: invokevirtual length : ()I
/*     */     //   49: iadd
/*     */     //   50: putfield element : I
/*     */     //   53: aload_0
/*     */     //   54: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*     */     //   57: invokeinterface getCaretModel : ()Lcom/intellij/openapi/editor/CaretModel;
/*     */     //   62: aload_0
/*     */     //   63: getfield $currentOffset : Lkotlin/jvm/internal/Ref$IntRef;
/*     */     //   66: getfield element : I
/*     */     //   69: invokeinterface moveToOffset : (I)V
/*     */     //   74: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #108	-> 0
/*     */     //   #111	-> 28
/*     */     //   #112	-> 53
/*     */     //   #113	-> 74
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	75	0	this	Lcom/intellij/ml/llm/intentions/internal/editor/CodeCompletionIntention$trySendingStreamingRequest$consumer$1$run$1;
/*     */   }
/*     */   
/*     */   private static final void invoke$lambda$0(Project $project, LLMResponseChoice $choice, Editor $editor, Ref.IntRef $currentOffset) {
/* 109 */     Intrinsics.checkNotNullParameter($project, "$project"); Intrinsics.checkNotNullParameter($choice, "$choice"); Intrinsics.checkNotNullParameter($editor, "$editor"); Intrinsics.checkNotNullParameter($currentOffset, "$currentOffset"); Intrinsics.checkNotNullExpressionValue($editor.getDocument(), "editor.document"); CodeCompletionIntention.Companion.insertStringAndSaveChange($project, $choice.getText(), $editor.getDocument(), $currentOffset.element, false);
/*     */   }
/*     */   
/*     */   CodeCompletionIntention$trySendingStreamingRequest$consumer$1$run$1(Project $project, Ref.IntRef $currentOffset, LLMResponseChoice $choice, Editor $editor) {
/*     */     super(0);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/internal/editor/CodeCompletionIntention$trySendingStreamingRequest$consumer$1$run$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */