/*    */ package com.intellij.ml.llm.dokuGuard.api;
/*    */ 
/*    */ import com.intellij.ml.llm.dokuGuard.openai.OpenAISectionValidator;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\026¨\006\b"}, d2 = {"com/intellij/ml/llm/dokuGuard/api/SectionValidatorBuilder$Companion$OPENAI$1", "Lcom/intellij/ml/llm/dokuGuard/api/SectionValidatorBuilder;", "buildValidator", "Lcom/intellij/ml/llm/dokuGuard/openai/OpenAISectionValidator;", "preferences", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationPreferences;", "projectSection", "Lcom/intellij/ml/llm/dokuGuard/api/ProjectSection;", "intellij.ml.llm"})
/*    */ public final class SectionValidatorBuilder$Companion$OPENAI$1
/*    */   implements SectionValidatorBuilder
/*    */ {
/*    */   @NotNull
/*    */   public OpenAISectionValidator buildValidator(@NotNull ValidationPreferences preferences, @NotNull ProjectSection projectSection) {
/* 20 */     Intrinsics.checkNotNullParameter(preferences, "preferences"); Intrinsics.checkNotNullParameter(projectSection, "projectSection"); return new OpenAISectionValidator(projectSection);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/dokuGuard/api/SectionValidatorBuilder$Companion$OPENAI$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */