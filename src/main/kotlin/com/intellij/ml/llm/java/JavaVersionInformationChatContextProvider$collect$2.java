/*    */ package com.intellij.ml.llm.java;
/*    */ 
/*    */ import com.intellij.openapi.module.LanguageLevelUtil;
/*    */ import com.intellij.openapi.module.Module;
/*    */ import com.intellij.pom.java.LanguageLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\002\030\002\n\000\020\000\032\0070\001¢\006\002\b\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "Lcom/intellij/pom/java/LanguageLevel;", "Lorg/jetbrains/annotations/NotNull;", "invoke"})
/*    */ final class JavaVersionInformationChatContextProvider$collect$2
/*    */   extends Lambda
/*    */   implements Function0<LanguageLevel>
/*    */ {
/*    */   JavaVersionInformationChatContextProvider$collect$2(Module $module) {
/*    */     super(0);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LanguageLevel invoke() {
/* 40 */     return LanguageLevelUtil.getEffectiveLanguageLevel(this.$module);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/JavaVersionInformationChatContextProvider$collect$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */