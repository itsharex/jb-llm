/*    */ package ai.grazie.tree;
/*    */ 
/*    */ import ai.grazie.tree.blocking.BlockingTreeDependencyService;
/*    */ import ai.grazie.tree.model.SentenceWithTreeDependencies;
/*    */ import ai.grazie.tree.suspendable.SuspendableTreeDependencyService;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.CoroutineContext;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.BuildersKt;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\000*\001\000\b\n\030\0002\0020\001J\034\020\002\032\b\022\004\022\0020\0040\0032\f\020\005\032\b\022\004\022\0020\0060\003H\026¨\006\007"}, d2 = {"ai/grazie/tree/TreeDependencyServiceTransform$blocking$3", "Lai/grazie/tree/blocking/BlockingTreeDependencyService;", "parse", "", "Lai/grazie/tree/model/SentenceWithTreeDependencies;", "sentences", "", "model-tree"})
/*    */ public final class TreeDependencyServiceTransform$blocking$3
/*    */   implements BlockingTreeDependencyService
/*    */ {
/*    */   TreeDependencyServiceTransform$blocking$3(CoroutineContext $context, SuspendableTreeDependencyService $service) {}
/*    */   
/*    */   @NotNull
/*    */   public List<SentenceWithTreeDependencies> parse(@NotNull List<String> sentences) {
/* 51 */     Intrinsics.checkNotNullParameter(sentences, "sentences"); return (List<SentenceWithTreeDependencies>)BuildersKt.runBlocking(this.$context, new TreeDependencyServiceTransform$blocking$3$parse$1(this.$service, sentences, null)); } @DebugMetadata(f = "TreeDependencyServiceTransform.kt", l = {51}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.tree.TreeDependencyServiceTransform$blocking$3$parse$1") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020 \n\002\030\002\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001*\0020\003H@"}, d2 = {"<anonymous>", "", "Lai/grazie/tree/model/SentenceWithTreeDependencies;", "Lkotlinx/coroutines/CoroutineScope;"}) static final class TreeDependencyServiceTransform$blocking$3$parse$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends SentenceWithTreeDependencies>>, Object> { @Nullable public final Object invokeSuspend(@NotNull Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; return (this.$service.parse(this.$sentences, (Continuation)this) == object) ? object : this.$service.parse(this.$sentences, (Continuation)this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */ 
/*    */     
/*    */     int label;
/*    */     
/*    */     TreeDependencyServiceTransform$blocking$3$parse$1(SuspendableTreeDependencyService $service, List<String> $sentences, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super TreeDependencyServiceTransform$blocking$3$parse$1> $completion) {
/*    */       return (Continuation<Unit>)new TreeDependencyServiceTransform$blocking$3$parse$1(this.$service, this.$sentences, $completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */       return ((TreeDependencyServiceTransform$blocking$3$parse$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/tree/TreeDependencyServiceTransform$blocking$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */