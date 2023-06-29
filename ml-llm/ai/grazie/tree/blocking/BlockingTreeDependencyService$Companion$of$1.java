/*    */ package ai.grazie.tree.blocking;
/*    */ 
/*    */ import ai.grazie.nlp.langs.Language;
/*    */ import ai.grazie.tree.model.SentenceWithTreeDependencies;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\000*\001\000\b\n\030\0002\0020\001J\034\020\002\032\b\022\004\022\0020\0040\0032\f\020\005\032\b\022\004\022\0020\0060\003H\026¨\006\007"}, d2 = {"ai/grazie/tree/blocking/BlockingTreeDependencyService$Companion$of$1", "Lai/grazie/tree/blocking/BlockingTreeDependencyService;", "parse", "", "Lai/grazie/tree/model/SentenceWithTreeDependencies;", "sentences", "", "model-tree"})
/*    */ public final class BlockingTreeDependencyService$Companion$of$1
/*    */   implements BlockingTreeDependencyService
/*    */ {
/*    */   BlockingTreeDependencyService$Companion$of$1(BlockingMultiTreeDependencyService $multi, Language $language) {}
/*    */   
/*    */   @NotNull
/*    */   public List<SentenceWithTreeDependencies> parse(@NotNull List<String> sentences) {
/* 18 */     Intrinsics.checkNotNullParameter(sentences, "sentences"); return this.$multi.parse(this.$language, sentences);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/tree/blocking/BlockingTreeDependencyService$Companion$of$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */