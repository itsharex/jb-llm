/*    */ package ai.grazie.tree.suspendable;
/*    */ 
/*    */ import ai.grazie.nlp.langs.Language;
/*    */ import ai.grazie.tree.model.SentenceWithTreeDependencies;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\002\b\002*\001\000\b\n\030\0002\0020\001J%\020\002\032\b\022\004\022\0020\0040\0032\f\020\005\032\b\022\004\022\0020\0060\003H@ø\001\000¢\006\002\020\007\002\004\n\002\b\031¨\006\b"}, d2 = {"ai/grazie/tree/suspendable/SuspendableTreeDependencyService$Companion$of$1", "Lai/grazie/tree/suspendable/SuspendableTreeDependencyService;", "parse", "", "Lai/grazie/tree/model/SentenceWithTreeDependencies;", "sentences", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "model-tree"})
/*    */ public final class SuspendableTreeDependencyService$Companion$of$1
/*    */   implements SuspendableTreeDependencyService
/*    */ {
/*    */   SuspendableTreeDependencyService$Companion$of$1(SuspendableMultiTreeDependencyService $multi, Language $language) {}
/*    */   
/*    */   @Nullable
/*    */   public Object parse(@NotNull List<String> sentences, @NotNull Continuation<? super List<SentenceWithTreeDependencies>> $completion) {
/* 25 */     return this.$multi.parse(this.$language, sentences, $completion);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/tree/suspendable/SuspendableTreeDependencyService$Companion$of$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */