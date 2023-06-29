/*    */ package com.intellij.ml.llm.core.statistics;
/*    */ 
/*    */ import com.intellij.internal.statistic.eventLog.events.ClassEventField;
/*    */ import com.intellij.internal.statistic.eventLog.events.EventFields;
/*    */ import com.intellij.internal.statistic.eventLog.events.RoundedIntEventField;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\"\021\020\000\032\0020\001¢\006\b\n\000\032\004\b\002\020\003\"\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"NUMBER_OF_FILES", "Lcom/intellij/internal/statistic/eventLog/events/RoundedIntEventField;", "getNUMBER_OF_FILES", "()Lcom/intellij/internal/statistic/eventLog/events/RoundedIntEventField;", "TARGET_ELEMENT", "Lcom/intellij/internal/statistic/eventLog/events/ClassEventField;", "getTARGET_ELEMENT", "()Lcom/intellij/internal/statistic/eventLog/events/ClassEventField;", "intellij.ml.llm"})
/*    */ public final class CommonLoggerServiceKt
/*    */ {
/*    */   @NotNull
/* 20 */   private static final ClassEventField TARGET_ELEMENT = EventFields.Class("target"); @NotNull public static final ClassEventField getTARGET_ELEMENT() { return TARGET_ELEMENT; } @NotNull
/* 21 */   private static final RoundedIntEventField NUMBER_OF_FILES = EventFields.RoundedInt("number_of_files"); @NotNull public static final RoundedIntEventField getNUMBER_OF_FILES() { return NUMBER_OF_FILES; }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/statistics/CommonLoggerServiceKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */