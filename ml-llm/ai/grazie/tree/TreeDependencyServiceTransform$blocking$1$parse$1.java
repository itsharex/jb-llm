/*    */ package ai.grazie.tree;
/*    */ import ai.grazie.nlp.langs.Language;
/*    */ import ai.grazie.tree.model.SentenceWithTreeDependencies;
/*    */ import ai.grazie.tree.suspendable.SuspendableMultiTreeDependencyService;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @DebugMetadata(f = "TreeDependencyServiceTransform.kt", l = {23}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.tree.TreeDependencyServiceTransform$blocking$1$parse$1")
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020 \n\002\030\002\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001*\0020\003H@"}, d2 = {"<anonymous>", "", "Lai/grazie/tree/model/SentenceWithTreeDependencies;", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class TreeDependencyServiceTransform$blocking$1$parse$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends SentenceWithTreeDependencies>>, Object> {
/*    */   @Nullable
/*    */   public final Object invokeSuspend(@NotNull Object $result) {
/* 23 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; return (this.$service.parse(this.$language, this.$sentences, (Continuation)this) == object) ? object : this.$service.parse(this.$language, this.$sentences, (Continuation)this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   int label;
/*    */   
/*    */   TreeDependencyServiceTransform$blocking$1$parse$1(SuspendableMultiTreeDependencyService $service, Language $language, List<String> $sentences, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super TreeDependencyServiceTransform$blocking$1$parse$1> $completion) {
/*    */     return (Continuation<Unit>)new TreeDependencyServiceTransform$blocking$1$parse$1(this.$service, this.$language, this.$sentences, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */     return ((TreeDependencyServiceTransform$blocking$1$parse$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/tree/TreeDependencyServiceTransform$blocking$1$parse$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */