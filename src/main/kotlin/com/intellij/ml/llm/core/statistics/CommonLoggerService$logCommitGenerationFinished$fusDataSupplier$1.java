/*     */ package com.intellij.ml.llm.core.statistics;
/*     */ 
/*     */ import com.intellij.internal.statistic.eventLog.events.EventPair;
/*     */ import java.util.ArrayList;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\002\030\002\n\002\020\b\n\002\030\002\n\000\020\000\032\036\022\n\022\b\022\004\022\0020\0030\0020\001j\016\022\n\022\b\022\004\022\0020\0030\002`\004H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/intellij/internal/statistic/eventLog/events/EventPair;", "", "Lkotlin/collections/ArrayList;", "invoke"})
/*     */ final class CommonLoggerService$logCommitGenerationFinished$fusDataSupplier$1
/*     */   extends Lambda
/*     */   implements Function0<ArrayList<EventPair<Integer>>>
/*     */ {
/*     */   @NotNull
/*     */   public final ArrayList<EventPair<Integer>> invoke() {
/* 149 */     EventPair[] arrayOfEventPair = new EventPair[1]; arrayOfEventPair[0] = CommonLoggerServiceKt.getNUMBER_OF_FILES().with(Integer.valueOf(this.$numberOfFiles)); return CollectionsKt.arrayListOf((Object[])arrayOfEventPair);
/*     */   }
/*     */   
/*     */   CommonLoggerService$logCommitGenerationFinished$fusDataSupplier$1(int $numberOfFiles) {
/*     */     super(0);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/statistics/CommonLoggerService$logCommitGenerationFinished$fusDataSupplier$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */