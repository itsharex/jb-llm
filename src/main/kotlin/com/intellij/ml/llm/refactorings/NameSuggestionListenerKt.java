/*   */ package com.intellij.ml.llm.refactorings;
/*   */ 
/*   */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\"$\020\000\032\025\022\f\022\n \003*\004\030\0010\0020\0020\001¢\006\002\b\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"NameSuggestionTopic", "Lcom/intellij/util/messages/Topic;", "Lcom/intellij/ml/llm/refactorings/NameSuggestionListener;", "kotlin.jvm.PlatformType", "Lorg/jetbrains/annotations/NotNull;", "getNameSuggestionTopic", "()Lcom/intellij/util/messages/Topic;", "intellij.ml.llm"})
/*   */ public final class NameSuggestionListenerKt {
/*   */   @NotNull
/* 6 */   private static final Topic<NameSuggestionListener> NameSuggestionTopic = Topic.create("llm.name.suggestion", NameSuggestionListener.class); @NotNull public static final Topic<NameSuggestionListener> getNameSuggestionTopic() { return NameSuggestionTopic; } static { Intrinsics.checkNotNullExpressionValue(Topic.create("llm.name.suggestion", NameSuggestionListener.class), "create(\"llm.name.suggest…tionListener::class.java)"); }
/*   */ 
/*   */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/refactorings/NameSuggestionListenerKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */