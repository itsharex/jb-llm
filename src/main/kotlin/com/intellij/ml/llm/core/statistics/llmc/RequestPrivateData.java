/*    */ package com.intellij.ml.llm.core.statistics.llmc;
/*    */ 
/*    */ import com.intellij.internal.statistic.eventLog.FeatureUsageData;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NonNls;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\020 \n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\004\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\017\022\b\b\001\020\002\032\0020\003¢\006\002\020\004J\032\020\013\032\0020\f2\006\020\r\032\0020\0162\b\020\017\032\004\030\0010\003H\026J\t\020\020\032\0020\003HÆ\003J\023\020\021\032\0020\0002\b\b\003\020\002\032\0020\003HÆ\001J\023\020\022\032\0020\0232\b\020\024\032\004\030\0010\025HÖ\003J\t\020\026\032\0020\027HÖ\001J\t\020\030\032\0020\003HÖ\001R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\005\020\006R\032\020\007\032\b\022\004\022\0020\0030\b8VX\004¢\006\006\032\004\b\t\020\n¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/core/statistics/llmc/RequestPrivateData;", "Lcom/intellij/internal/statistic/eventLog/events/StringEventField;", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "validationRule", "", "getValidationRule", "()Ljava/util/List;", "addData", "", "fuData", "Lcom/intellij/internal/statistic/eventLog/FeatureUsageData;", "value", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intellij.ml.llm"})
/*    */ public final class RequestPrivateData extends StringEventField {
/* 12 */   public RequestPrivateData(@NonNls @NotNull String name) { super(name); this.name = name; } @NotNull private final String name; @NotNull public String getName() { return this.name; } @NotNull
/*    */   public List<String> getValidationRule() {
/* 14 */     return CollectionsKt.listOf("{util#" + ((TrueValidationRule)CustomValidationRule.getCustomValidationRuleInstance(TrueValidationRule.class)).getRuleId() + "}");
/*    */   }
/*    */   public void addData(@NotNull FeatureUsageData fuData, @Nullable String value) {
/* 17 */     Intrinsics.checkNotNullParameter(fuData, "fuData"); if (!LLMSettingsManager.Companion.getInstance().isDataSharingEnabled()) {
/*    */       return;
/*    */     }
/* 20 */     if (value != null)
/* 21 */       super.addData(fuData, value); 
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.name;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final RequestPrivateData copy(@NonNls @NotNull String name) {
/*    */     Intrinsics.checkNotNullParameter(name, "name");
/*    */     return new RequestPrivateData(name);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "RequestPrivateData(name=" + this.name + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.name.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof RequestPrivateData))
/*    */       return false; 
/*    */     RequestPrivateData requestPrivateData = (RequestPrivateData)other;
/*    */     return !!Intrinsics.areEqual(this.name, requestPrivateData.name);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/statistics/llmc/RequestPrivateData.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */