/*    */ package com.intellij.ml.llm.dokuGuard.api;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\006\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\t\032\0020\0042\006\020\n\032\0020\013R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/dokuGuard/api/SectionValidatorBuilder$Companion;", "", "()V", "NO_CHANGE", "Lcom/intellij/ml/llm/dokuGuard/api/SectionValidatorBuilder;", "getNO_CHANGE", "()Lcom/intellij/ml/llm/dokuGuard/api/SectionValidatorBuilder;", "OPENAI", "getOPENAI", "fromPreferences", "validationPreferences", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationPreferences;", "intellij.ml.llm"})
/*    */ public final class Companion {
/*    */   @NotNull
/*  9 */   private static final SectionValidatorBuilder NO_CHANGE = new SectionValidatorBuilder$Companion$NO_CHANGE$1(); @NotNull public final SectionValidatorBuilder getNO_CHANGE() { return NO_CHANGE; }
/*    */    @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\026¨\006\b"}, d2 = {"com/intellij/ml/llm/dokuGuard/api/SectionValidatorBuilder$Companion$NO_CHANGE$1", "Lcom/intellij/ml/llm/dokuGuard/api/SectionValidatorBuilder;", "buildValidator", "Lcom/intellij/ml/llm/dokuGuard/api/NoChangeValidator;", "preferences", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationPreferences;", "projectSection", "Lcom/intellij/ml/llm/dokuGuard/api/ProjectSection;", "intellij.ml.llm"})
/*    */   public static final class SectionValidatorBuilder$Companion$NO_CHANGE$1 implements SectionValidatorBuilder { @NotNull
/*    */     public NoChangeValidator buildValidator(@NotNull ValidationPreferences preferences, @NotNull ProjectSection projectSection) {
/* 13 */       Intrinsics.checkNotNullParameter(preferences, "preferences"); Intrinsics.checkNotNullParameter(projectSection, "projectSection"); return new NoChangeValidator(projectSection);
/*    */     } }
/*    */   @NotNull
/* 16 */   private static final SectionValidatorBuilder OPENAI = new SectionValidatorBuilder$Companion$OPENAI$1(); @NotNull public final SectionValidatorBuilder getOPENAI() { return OPENAI; }
/*    */    @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\026¨\006\b"}, d2 = {"com/intellij/ml/llm/dokuGuard/api/SectionValidatorBuilder$Companion$OPENAI$1", "Lcom/intellij/ml/llm/dokuGuard/api/SectionValidatorBuilder;", "buildValidator", "Lcom/intellij/ml/llm/dokuGuard/openai/OpenAISectionValidator;", "preferences", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationPreferences;", "projectSection", "Lcom/intellij/ml/llm/dokuGuard/api/ProjectSection;", "intellij.ml.llm"})
/*    */   public static final class SectionValidatorBuilder$Companion$OPENAI$1 implements SectionValidatorBuilder { @NotNull
/*    */     public OpenAISectionValidator buildValidator(@NotNull ValidationPreferences preferences, @NotNull ProjectSection projectSection) {
/* 20 */       Intrinsics.checkNotNullParameter(preferences, "preferences"); Intrinsics.checkNotNullParameter(projectSection, "projectSection"); return new OpenAISectionValidator(projectSection);
/*    */     } }
/*    */   @NotNull
/*    */   public final SectionValidatorBuilder fromPreferences(@NotNull ValidationPreferences validationPreferences) {
/* 24 */     Intrinsics.checkNotNullParameter(validationPreferences, "validationPreferences"); return OPENAI;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/dokuGuard/api/SectionValidatorBuilder$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */