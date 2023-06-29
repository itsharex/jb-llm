/*    */ package ai.grazie.tree.blocking;
/*    */ 
/*    */ import ai.grazie.nlp.langs.Language;
/*    */ import ai.grazie.tree.model.SentenceWithTreeDependencies;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\026\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b¨\006\t"}, d2 = {"Lai/grazie/tree/blocking/BlockingTreeDependencyService$Companion;", "", "()V", "of", "Lai/grazie/tree/blocking/BlockingTreeDependencyService;", "language", "Lai/grazie/nlp/langs/Language;", "multi", "Lai/grazie/tree/blocking/BlockingMultiTreeDependencyService;", "model-tree"})
/*    */ public final class Companion
/*    */ {
/*    */   @NotNull
/*    */   public final BlockingTreeDependencyService of(@NotNull Language language, @NotNull BlockingMultiTreeDependencyService multi) {
/* 16 */     Intrinsics.checkNotNullParameter(language, "language"); Intrinsics.checkNotNullParameter(multi, "multi"); return new BlockingTreeDependencyService$Companion$of$1(multi, language); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\000*\001\000\b\n\030\0002\0020\001J\034\020\002\032\b\022\004\022\0020\0040\0032\f\020\005\032\b\022\004\022\0020\0060\003H\026¨\006\007"}, d2 = {"ai/grazie/tree/blocking/BlockingTreeDependencyService$Companion$of$1", "Lai/grazie/tree/blocking/BlockingTreeDependencyService;", "parse", "", "Lai/grazie/tree/model/SentenceWithTreeDependencies;", "sentences", "", "model-tree"})
/*    */   public static final class BlockingTreeDependencyService$Companion$of$1 implements BlockingTreeDependencyService { @NotNull
/* 18 */     public List<SentenceWithTreeDependencies> parse(@NotNull List<String> sentences) { Intrinsics.checkNotNullParameter(sentences, "sentences"); return this.$multi.parse(this.$language, sentences); }
/*    */ 
/*    */     
/*    */     BlockingTreeDependencyService$Companion$of$1(BlockingMultiTreeDependencyService $multi, Language $language) {} }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/tree/blocking/BlockingTreeDependencyService$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */