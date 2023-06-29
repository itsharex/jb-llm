/*    */ package com.intellij.ml.llm.core.statistics.llmc;
/*    */ import com.intellij.internal.statistic.eventLog.validator.ValidationResultType;
/*    */ import com.intellij.internal.statistic.eventLog.validator.rules.EventContext;
/*    */ import com.intellij.internal.statistic.eventLog.validator.rules.impl.CustomValidationRule;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\b\000\030\0002\0020\001B\005¢\006\002\020\002J\030\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\bH\024J\b\020\t\032\0020\006H\026¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/core/statistics/llmc/TrueValidationRule;", "Lcom/intellij/internal/statistic/eventLog/validator/rules/impl/CustomValidationRule;", "()V", "doValidate", "Lcom/intellij/internal/statistic/eventLog/validator/ValidationResultType;", "data", "", "context", "Lcom/intellij/internal/statistic/eventLog/validator/rules/EventContext;", "getRuleId", "intellij.ml.llm"})
/*    */ public final class TrueValidationRule extends CustomValidationRule {
/*    */   @NotNull
/*    */   public String getRuleId() {
/* 13 */     return "llm_parameters";
/*    */   }
/*    */   @NotNull
/*    */   protected ValidationResultType doValidate(@NotNull String data, @NotNull EventContext context) {
/* 17 */     Intrinsics.checkNotNullParameter(data, "data"); Intrinsics.checkNotNullParameter(context, "context"); return ValidationResultType.ACCEPTED;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/statistics/llmc/TrueValidationRule.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */