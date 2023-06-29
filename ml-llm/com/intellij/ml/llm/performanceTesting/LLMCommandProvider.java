/*    */ package com.intellij.ml.llm.performanceTesting;
/*    */ import com.jetbrains.performancePlugin.CreateCommand;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Pair;
/*    */ import kotlin.TuplesKt;
/*    */ import kotlin.collections.MapsKt;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020%\n\002\020\016\n\002\030\002\n\000\b\000\030\0002\0020\001B\005¢\006\002\020\002J\024\020\003\032\016\022\004\022\0020\005\022\004\022\0020\0060\004H\026¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/performanceTesting/LLMCommandProvider;", "Lcom/jetbrains/performancePlugin/CommandProvider;", "()V", "getCommands", "", "", "Lcom/jetbrains/performancePlugin/CreateCommand;", "intellij.ml.llm.performanceTesting"})
/*    */ public final class LLMCommandProvider implements CommandProvider {
/*    */   @NotNull
/*    */   public Map<String, CreateCommand> getCommands() {
/* 12 */     Pair[] arrayOfPair = new Pair[5]; arrayOfPair[0] = TuplesKt.to("%checkResponseContains", CheckBotResponse::new); arrayOfPair[1] = 
/* 13 */       TuplesKt.to("%authenticateInGrazie", AuthenticateInGrazie::new);
/* 14 */     arrayOfPair[2] = TuplesKt.to("%startNameSuggestionBenchmark", com.intellij.ml.llm.performanceTesting.name.suggestion.StartNameSuggestionBenchmark::new);
/* 15 */     arrayOfPair[3] = TuplesKt.to("%stopNameSuggestionBenchmark", com.intellij.ml.llm.performanceTesting.name.suggestion.StopNameSuggestionBenchmark::new);
/* 16 */     arrayOfPair[4] = TuplesKt.to("%waitForLlmNameSuggestions", com.intellij.ml.llm.performanceTesting.name.suggestion.WaitForLlmNameSuggestions::new);
/*    */     return MapsKt.mutableMapOf(arrayOfPair);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/performanceTesting/LLMCommandProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */