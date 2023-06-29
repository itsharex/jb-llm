/*    */ package ai.grazie.tree;
/*    */ import ai.grazie.nlp.langs.Language;
/*    */ import ai.grazie.tree.model.SentenceWithTreeDependencies;
/*    */ import ai.grazie.tree.suspendable.SuspendableMultiTreeDependencyService;
/*    */ import java.util.List;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.CoroutineContext;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\030\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\bH\007J \020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\nH\007J\020\020\003\032\0020\0132\006\020\007\032\0020\bH\007J\030\020\003\032\0020\0132\006\020\007\032\0020\b2\006\020\t\032\0020\nH\007J\020\020\003\032\0020\0042\006\020\007\032\0020\fH\007J\030\020\003\032\0020\0042\006\020\007\032\0020\f2\006\020\t\032\0020\nH\007¨\006\r"}, d2 = {"Lai/grazie/tree/TreeDependencyServiceTransform;", "", "()V", "blocking", "Lai/grazie/tree/blocking/BlockingTreeDependencyService;", "language", "Lai/grazie/nlp/langs/Language;", "service", "Lai/grazie/tree/suspendable/SuspendableMultiTreeDependencyService;", "context", "Lkotlin/coroutines/CoroutineContext;", "Lai/grazie/tree/blocking/BlockingMultiTreeDependencyService;", "Lai/grazie/tree/suspendable/SuspendableTreeDependencyService;", "model-tree"})
/*    */ public final class TreeDependencyServiceTransform {
/*    */   @JvmStatic
/*    */   @NotNull
/*    */   public static final BlockingMultiTreeDependencyService blocking(@NotNull SuspendableMultiTreeDependencyService service) {
/* 16 */     Intrinsics.checkNotNullParameter(service, "service"); return blocking(service, (CoroutineContext)Dispatchers.getDefault());
/*    */   } @NotNull
/*    */   public static final TreeDependencyServiceTransform INSTANCE = new TreeDependencyServiceTransform(); @JvmStatic
/*    */   @NotNull
/*    */   public static final BlockingMultiTreeDependencyService blocking(@NotNull SuspendableMultiTreeDependencyService service, @NotNull CoroutineContext context) {
/* 21 */     Intrinsics.checkNotNullParameter(service, "service"); Intrinsics.checkNotNullParameter(context, "context"); return new TreeDependencyServiceTransform$blocking$1(context, service); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000*\001\000\b\n\030\0002\0020\001J$\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\0062\f\020\007\032\b\022\004\022\0020\b0\003H\026¨\006\t"}, d2 = {"ai/grazie/tree/TreeDependencyServiceTransform$blocking$1", "Lai/grazie/tree/blocking/BlockingMultiTreeDependencyService;", "parse", "", "Lai/grazie/tree/model/SentenceWithTreeDependencies;", "language", "Lai/grazie/nlp/langs/Language;", "sentences", "", "model-tree"})
/*    */   public static final class TreeDependencyServiceTransform$blocking$1 implements BlockingMultiTreeDependencyService { TreeDependencyServiceTransform$blocking$1(CoroutineContext $context, SuspendableMultiTreeDependencyService $service) {} @NotNull
/* 23 */     public List<SentenceWithTreeDependencies> parse(@NotNull Language language, @NotNull List<String> sentences) { Intrinsics.checkNotNullParameter(language, "language"); Intrinsics.checkNotNullParameter(sentences, "sentences"); return (List<SentenceWithTreeDependencies>)BuildersKt.runBlocking(this.$context, new TreeDependencyServiceTransform$blocking$1$parse$1(this.$service, language, sentences, null)); } @DebugMetadata(f = "TreeDependencyServiceTransform.kt", l = {23}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.tree.TreeDependencyServiceTransform$blocking$1$parse$1") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020 \n\002\030\002\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001*\0020\003H@"}, d2 = {"<anonymous>", "", "Lai/grazie/tree/model/SentenceWithTreeDependencies;", "Lkotlinx/coroutines/CoroutineScope;"}) static final class TreeDependencyServiceTransform$blocking$1$parse$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends SentenceWithTreeDependencies>>, Object> { int label; TreeDependencyServiceTransform$blocking$1$parse$1(SuspendableMultiTreeDependencyService $service, Language $language, List<String> $sentences, Continuation $completion) { super(2, $completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; return (this.$service.parse(this.$language, this.$sentences, (Continuation)this) == object) ? object : this.$service.parse(this.$language, this.$sentences, (Continuation)this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull
/*    */       public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super TreeDependencyServiceTransform$blocking$1$parse$1> $completion) { return (Continuation<Unit>)new TreeDependencyServiceTransform$blocking$1$parse$1(this.$service, this.$language, this.$sentences, $completion); }
/*    */       @Nullable
/*    */       public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((TreeDependencyServiceTransform$blocking$1$parse$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } }
/*    */   @JvmStatic
/*    */   @NotNull
/*    */   public static final BlockingTreeDependencyService blocking(@NotNull Language language, @NotNull SuspendableMultiTreeDependencyService service) {
/* 30 */     Intrinsics.checkNotNullParameter(language, "language"); Intrinsics.checkNotNullParameter(service, "service"); return blocking(language, service, (CoroutineContext)Dispatchers.getDefault());
/*    */   }
/*    */   
/*    */   @JvmStatic
/*    */   @NotNull
/* 35 */   public static final BlockingTreeDependencyService blocking(@NotNull Language language, @NotNull SuspendableMultiTreeDependencyService service, @NotNull CoroutineContext context) { Intrinsics.checkNotNullParameter(language, "language"); Intrinsics.checkNotNullParameter(service, "service"); Intrinsics.checkNotNullParameter(context, "context"); return new TreeDependencyServiceTransform$blocking$2(context, service, language); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\000*\001\000\b\n\030\0002\0020\001J\034\020\002\032\b\022\004\022\0020\0040\0032\f\020\005\032\b\022\004\022\0020\0060\003H\026¨\006\007"}, d2 = {"ai/grazie/tree/TreeDependencyServiceTransform$blocking$2", "Lai/grazie/tree/blocking/BlockingTreeDependencyService;", "parse", "", "Lai/grazie/tree/model/SentenceWithTreeDependencies;", "sentences", "", "model-tree"})
/*    */   public static final class TreeDependencyServiceTransform$blocking$2 implements BlockingTreeDependencyService { TreeDependencyServiceTransform$blocking$2(CoroutineContext $context, SuspendableMultiTreeDependencyService $service, Language $language) {} @NotNull
/* 37 */     public List<SentenceWithTreeDependencies> parse(@NotNull List<String> sentences) { Intrinsics.checkNotNullParameter(sentences, "sentences"); return (List<SentenceWithTreeDependencies>)BuildersKt.runBlocking(this.$context, new TreeDependencyServiceTransform$blocking$2$parse$1(this.$service, this.$language, sentences, null)); } @DebugMetadata(f = "TreeDependencyServiceTransform.kt", l = {37}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.tree.TreeDependencyServiceTransform$blocking$2$parse$1") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020 \n\002\030\002\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001*\0020\003H@"}, d2 = {"<anonymous>", "", "Lai/grazie/tree/model/SentenceWithTreeDependencies;", "Lkotlinx/coroutines/CoroutineScope;"}) static final class TreeDependencyServiceTransform$blocking$2$parse$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends SentenceWithTreeDependencies>>, Object> { int label; TreeDependencyServiceTransform$blocking$2$parse$1(SuspendableMultiTreeDependencyService $service, Language $language, List<String> $sentences, Continuation $completion) { super(2, $completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; return (this.$service.parse(this.$language, this.$sentences, (Continuation)this) == object) ? object : this.$service.parse(this.$language, this.$sentences, (Continuation)this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull
/*    */       public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super TreeDependencyServiceTransform$blocking$2$parse$1> $completion) { return (Continuation<Unit>)new TreeDependencyServiceTransform$blocking$2$parse$1(this.$service, this.$language, this.$sentences, $completion); }
/*    */       @Nullable
/*    */       public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((TreeDependencyServiceTransform$blocking$2$parse$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } }
/*    */   @JvmStatic
/*    */   @NotNull
/*    */   public static final BlockingTreeDependencyService blocking(@NotNull SuspendableTreeDependencyService service) {
/* 44 */     Intrinsics.checkNotNullParameter(service, "service"); return blocking(service, (CoroutineContext)Dispatchers.getDefault());
/*    */   }
/*    */   
/*    */   @JvmStatic
/*    */   @NotNull
/* 49 */   public static final BlockingTreeDependencyService blocking(@NotNull SuspendableTreeDependencyService service, @NotNull CoroutineContext context) { Intrinsics.checkNotNullParameter(service, "service"); Intrinsics.checkNotNullParameter(context, "context"); return new TreeDependencyServiceTransform$blocking$3(context, service); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\000*\001\000\b\n\030\0002\0020\001J\034\020\002\032\b\022\004\022\0020\0040\0032\f\020\005\032\b\022\004\022\0020\0060\003H\026¨\006\007"}, d2 = {"ai/grazie/tree/TreeDependencyServiceTransform$blocking$3", "Lai/grazie/tree/blocking/BlockingTreeDependencyService;", "parse", "", "Lai/grazie/tree/model/SentenceWithTreeDependencies;", "sentences", "", "model-tree"})
/*    */   public static final class TreeDependencyServiceTransform$blocking$3 implements BlockingTreeDependencyService { TreeDependencyServiceTransform$blocking$3(CoroutineContext $context, SuspendableTreeDependencyService $service) {} @NotNull
/* 51 */     public List<SentenceWithTreeDependencies> parse(@NotNull List<String> sentences) { Intrinsics.checkNotNullParameter(sentences, "sentences"); return (List<SentenceWithTreeDependencies>)BuildersKt.runBlocking(this.$context, new TreeDependencyServiceTransform$blocking$3$parse$1(this.$service, sentences, null)); } @DebugMetadata(f = "TreeDependencyServiceTransform.kt", l = {51}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.tree.TreeDependencyServiceTransform$blocking$3$parse$1") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020 \n\002\030\002\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001*\0020\003H@"}, d2 = {"<anonymous>", "", "Lai/grazie/tree/model/SentenceWithTreeDependencies;", "Lkotlinx/coroutines/CoroutineScope;"}) static final class TreeDependencyServiceTransform$blocking$3$parse$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends SentenceWithTreeDependencies>>, Object> { int label; TreeDependencyServiceTransform$blocking$3$parse$1(SuspendableTreeDependencyService $service, List<String> $sentences, Continuation $completion) { super(2, $completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; return (this.$service.parse(this.$sentences, (Continuation)this) == object) ? object : this.$service.parse(this.$sentences, (Continuation)this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */ 
/*    */       
/*    */       @NotNull
/*    */       public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super TreeDependencyServiceTransform$blocking$3$parse$1> $completion) {
/*    */         return (Continuation<Unit>)new TreeDependencyServiceTransform$blocking$3$parse$1(this.$service, this.$sentences, $completion);
/*    */       }
/*    */       
/*    */       @Nullable
/*    */       public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */         return ((TreeDependencyServiceTransform$blocking$3$parse$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */       } }
/*    */      }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/tree/TreeDependencyServiceTransform.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */