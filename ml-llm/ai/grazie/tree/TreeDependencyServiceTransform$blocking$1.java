/*    */ package ai.grazie.tree;
/*    */ 
/*    */ import ai.grazie.nlp.langs.Language;
/*    */ import ai.grazie.tree.model.SentenceWithTreeDependencies;
/*    */ import ai.grazie.tree.suspendable.SuspendableMultiTreeDependencyService;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.CoroutineContext;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000*\001\000\b\n\030\0002\0020\001J$\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\0062\f\020\007\032\b\022\004\022\0020\b0\003H\026¨\006\t"}, d2 = {"ai/grazie/tree/TreeDependencyServiceTransform$blocking$1", "Lai/grazie/tree/blocking/BlockingMultiTreeDependencyService;", "parse", "", "Lai/grazie/tree/model/SentenceWithTreeDependencies;", "language", "Lai/grazie/nlp/langs/Language;", "sentences", "", "model-tree"})
/*    */ public final class TreeDependencyServiceTransform$blocking$1 implements BlockingMultiTreeDependencyService {
/*    */   TreeDependencyServiceTransform$blocking$1(CoroutineContext $context, SuspendableMultiTreeDependencyService $service) {}
/*    */   
/*    */   @NotNull
/* 23 */   public List<SentenceWithTreeDependencies> parse(@NotNull Language language, @NotNull List<String> sentences) { Intrinsics.checkNotNullParameter(language, "language"); Intrinsics.checkNotNullParameter(sentences, "sentences"); return (List<SentenceWithTreeDependencies>)BuildersKt.runBlocking(this.$context, new TreeDependencyServiceTransform$blocking$1$parse$1(this.$service, language, sentences, null)); } @DebugMetadata(f = "TreeDependencyServiceTransform.kt", l = {23}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.tree.TreeDependencyServiceTransform$blocking$1$parse$1") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020 \n\002\030\002\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001*\0020\003H@"}, d2 = {"<anonymous>", "", "Lai/grazie/tree/model/SentenceWithTreeDependencies;", "Lkotlinx/coroutines/CoroutineScope;"}) static final class TreeDependencyServiceTransform$blocking$1$parse$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends SentenceWithTreeDependencies>>, Object> { @Nullable public final Object invokeSuspend(@NotNull Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; return (this.$service.parse(this.$language, this.$sentences, (Continuation)this) == object) ? object : this.$service.parse(this.$language, this.$sentences, (Continuation)this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */ 
/*    */     
/*    */     int label;
/*    */     
/*    */     TreeDependencyServiceTransform$blocking$1$parse$1(SuspendableMultiTreeDependencyService $service, Language $language, List<String> $sentences, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super TreeDependencyServiceTransform$blocking$1$parse$1> $completion) {
/*    */       return (Continuation<Unit>)new TreeDependencyServiceTransform$blocking$1$parse$1(this.$service, this.$language, this.$sentences, $completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */       return ((TreeDependencyServiceTransform$blocking$1$parse$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/tree/TreeDependencyServiceTransform$blocking$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */