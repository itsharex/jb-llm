/*    */ package com.intellij.ml.llm.performanceTesting;
/*    */ 
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.vfs.VirtualFileUtil;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @DebugMetadata(f = "CheckBotResponse.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.performanceTesting.CheckBotResponse$doExecute$2$findPsiFile$1")
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\004\030\0010\001*\0020\002H@"}, d2 = {"<anonymous>", "Lcom/intellij/psi/PsiFile;", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class CheckBotResponse$doExecute$2$findPsiFile$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PsiFile>, Object> {
/*    */   int label;
/*    */   
/*    */   @Nullable
/*    */   public final Object invokeSuspend(@NotNull Object $result) {
/* 27 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 28 */         Intrinsics.checkNotNullExpressionValue(this.$editor.getVirtualFile(), "editor.virtualFile"); return VirtualFileUtil.findPsiFile(this.$editor.getVirtualFile(), this.$project); }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   CheckBotResponse$doExecute$2$findPsiFile$1(Editor $editor, Project $project, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super CheckBotResponse$doExecute$2$findPsiFile$1> $completion) {
/*    */     return (Continuation<Unit>)new CheckBotResponse$doExecute$2$findPsiFile$1(this.$editor, this.$project, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */     return ((CheckBotResponse$doExecute$2$findPsiFile$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/performanceTesting/CheckBotResponse$doExecute$2$findPsiFile$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */