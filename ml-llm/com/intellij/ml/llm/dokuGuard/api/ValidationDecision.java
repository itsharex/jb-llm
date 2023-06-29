/*    */ package com.intellij.ml.llm.dokuGuard.api;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\002\bf\030\000 \b2\0020\001:\001\bJ\b\020\006\032\0020\007H\026R\024\020\002\032\004\030\0010\003X¦\004¢\006\006\032\004\b\004\020\005ø\001\000\002\006\n\004\b!0\001¨\006\tÀ\006\001"}, d2 = {"Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecision;", "", "importance", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecisionImportance;", "getImportance", "()Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecisionImportance;", "comment", "", "Companion", "intellij.ml.llm"})
/*    */ public interface ValidationDecision {
/*    */   @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   
/*    */   @NotNull
/*  9 */   default String comment() { return ""; } @Nullable
/*    */   ValidationDecisionImportance getImportance(); @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\006\n\002\020\016\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\t\032\0020\0042\006\020\n\032\0020\013R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecision$Companion;", "", "()V", "CHANGE_MANDATORY", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecision;", "getCHANGE_MANDATORY", "()Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecision;", "NO_CHANGE", "getNO_CHANGE", "shouldChange", "comment", "", "intellij.ml.llm"})
/*    */   public static final class Companion { @NotNull
/* 12 */     private static final ValidationDecision NO_CHANGE = new ValidationDecision$Companion$NO_CHANGE$1(); @NotNull public final ValidationDecision getNO_CHANGE() { return NO_CHANGE; } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\023\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003*\001\000\b\n\030\0002\0020\001R\026\020\002\032\004\030\0010\0038VX\004¢\006\006\032\004\b\004\020\005¨\006\006"}, d2 = {"com/intellij/ml/llm/dokuGuard/api/ValidationDecision$Companion$NO_CHANGE$1", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecision;", "importance", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecisionImportance;", "getImportance", "()Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecisionImportance;", "intellij.ml.llm"})
/*    */     public static final class ValidationDecision$Companion$NO_CHANGE$1 implements ValidationDecision { @Nullable
/* 14 */       public ValidationDecisionImportance getImportance() { return null; }
/*    */        }
/*    */     @NotNull
/* 17 */     private static final ValidationDecision CHANGE_MANDATORY = new ValidationDecision$Companion$CHANGE_MANDATORY$1(); @NotNull public final ValidationDecision getCHANGE_MANDATORY() { return CHANGE_MANDATORY; } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\023\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003*\001\000\b\n\030\0002\0020\001R\024\020\002\032\0020\0038VX\004¢\006\006\032\004\b\004\020\005¨\006\006"}, d2 = {"com/intellij/ml/llm/dokuGuard/api/ValidationDecision$Companion$CHANGE_MANDATORY$1", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecision;", "importance", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecisionImportance;", "getImportance", "()Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecisionImportance;", "intellij.ml.llm"})
/*    */     public static final class ValidationDecision$Companion$CHANGE_MANDATORY$1 implements ValidationDecision { @NotNull
/* 19 */       public ValidationDecisionImportance getImportance() { return ValidationDecisionImportance.MANDATORY; }
/*    */        }
/*    */ 
/*    */     
/*    */     @NotNull
/* 24 */     public final ValidationDecision shouldChange(@NotNull String comment) { Intrinsics.checkNotNullParameter(comment, "comment"); return new ValidationDecision$Companion$shouldChange$1(comment); } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\031\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\000*\001\000\b\n\030\0002\0020\001J\b\020\006\032\0020\007H\026R\024\020\002\032\0020\0038VX\004¢\006\006\032\004\b\004\020\005¨\006\b"}, d2 = {"com/intellij/ml/llm/dokuGuard/api/ValidationDecision$Companion$shouldChange$1", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecision;", "importance", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecisionImportance;", "getImportance", "()Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecisionImportance;", "comment", "", "intellij.ml.llm"})
/*    */     public static final class ValidationDecision$Companion$shouldChange$1 implements ValidationDecision { ValidationDecision$Companion$shouldChange$1(String $comment) {} @NotNull
/* 26 */       public ValidationDecisionImportance getImportance() { return ValidationDecisionImportance.MANDATORY; } @NotNull
/*    */       public String comment() {
/* 28 */         return this.$comment;
/*    */       } }
/*    */      }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/dokuGuard/api/ValidationDecision.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */