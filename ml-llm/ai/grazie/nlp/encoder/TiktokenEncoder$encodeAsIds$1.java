/*    */ package ai.grazie.nlp.encoder;
/*    */ 
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.text.MatchResult;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020 \n\002\020\b\n\000\n\002\030\002\n\000\020\000\032\b\022\004\022\0020\0020\0012\006\020\003\032\0020\004H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "", "match", "Lkotlin/text/MatchResult;", "invoke"})
/*    */ @SourceDebugExtension({"SMAP\nTiktokenEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TiktokenEncoder.kt\nai/grazie/nlp/encoder/TiktokenEncoder$encodeAsIds$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
/*    */ final class TiktokenEncoder$encodeAsIds$1
/*    */   extends Lambda
/*    */   implements Function1<MatchResult, List<? extends Integer>>
/*    */ {
/*    */   @NotNull
/*    */   public final List<Integer> invoke(@NotNull MatchResult match) {
/* 21 */     Intrinsics.checkNotNullParameter(match, "match"); String piece = match.getValue();
/* 22 */     if ((Integer)TiktokenEncoder.access$getVocabulary$p(TiktokenEncoder.this).get(TiktokenEncoder.access$toByteArrayKey(TiktokenEncoder.this, piece)) != null) { int it = ((Integer)TiktokenEncoder.access$getVocabulary$p(TiktokenEncoder.this).get(TiktokenEncoder.access$toByteArrayKey(TiktokenEncoder.this, piece))).intValue();
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
/* 75 */       int $i$a$-let-TiktokenEncoder$encodeAsIds$1$1 = 0;
/*    */       if (CollectionsKt.listOf(Integer.valueOf(it)) == null) {
/*    */         CollectionsKt.listOf(Integer.valueOf(it));
/*    */         return TiktokenEncoder.access$bytePairEncode(TiktokenEncoder.this, TiktokenEncoder.access$toByteArrayKey(TiktokenEncoder.this, piece));
/*    */       } 
/*    */       return CollectionsKt.listOf(Integer.valueOf(it)); }
/*    */     
/*    */     CollectionsKt.listOf(Integer.valueOf(it));
/*    */     return TiktokenEncoder.access$bytePairEncode(TiktokenEncoder.this, TiktokenEncoder.access$toByteArrayKey(TiktokenEncoder.this, piece));
/*    */   }
/*    */   
/*    */   TiktokenEncoder$encodeAsIds$1() {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/nlp/encoder/TiktokenEncoder$encodeAsIds$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */