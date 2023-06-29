/*    */ package ai.grazie.tree.model;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\r\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "node", "Lai/grazie/tree/model/SentenceWithTreeDependencies$Node;", "invoke"})
/*    */ final class SentenceWithTreeDependencies$Companion$toConlluBatch$1$1
/*    */   extends Lambda
/*    */   implements Function1<SentenceWithTreeDependencies.Node, CharSequence>
/*    */ {
/*    */   @NotNull
/*    */   public final CharSequence invoke(@NotNull SentenceWithTreeDependencies.Node node) {
/* 42 */     Intrinsics.checkNotNullParameter(node, "node"); return node.getId() + "\t" + node.getId() + "\t_\t_\t_\t_\t" + node.getRange().substring(this.$it.getText()) + "\t" + node.getHeadId() + "\t_\t_";
/*    */   }
/*    */   
/*    */   SentenceWithTreeDependencies$Companion$toConlluBatch$1$1(SentenceWithTreeDependencies $it) {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/tree/model/SentenceWithTreeDependencies$Companion$toConlluBatch$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */