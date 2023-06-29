/*    */ package com.intellij.ml.llm.cicd.labelling;
/*    */ 
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\016\n\000\n\002\020 \n\002\020\016\n\002\b\003\"\032\020\000\032\b\022\004\022\0020\0020\001X\004¢\006\b\n\000\032\004\b\003\020\004¨\006\005"}, d2 = {"llmTypes", "", "", "getLlmTypes", "()Ljava/util/List;", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nLLMLabellingToolWindowPanel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMLabellingToolWindowPanel.kt\ncom/intellij/ml/llm/cicd/labelling/LLMLabellingToolWindowPanelKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,91:1\n1549#2:92\n1620#2,3:93\n*S KotlinDebug\n*F\n+ 1 LLMLabellingToolWindowPanel.kt\ncom/intellij/ml/llm/cicd/labelling/LLMLabellingToolWindowPanelKt\n*L\n12#1:92\n12#1:93,3\n*E\n"})
/*    */ public final class LLMLabellingToolWindowPanelKt {
/*    */   @NotNull
/* 12 */   public static final List<String> getLlmTypes() { return llmTypes; } @NotNull private static final List<String> llmTypes; static { Iterable $this$map$iv = CollectionsKt.listOf(LLMSettingsManager.Companion.getInstance().getActiveModel()); int $i$f$map = 0;
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
/* 92 */     Iterable iterable1 = $this$map$iv; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 93 */     for (Object item$iv$iv : iterable1) {
/* 94 */       LLMRequestProvider lLMRequestProvider = (LLMRequestProvider)item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-LLMLabellingToolWindowPanelKt$llmTypes$1 = 0; collection.add("Completion model");
/* 95 */     }  llmTypes = (List<String>)destination$iv$iv; }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/cicd/labelling/LLMLabellingToolWindowPanelKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */