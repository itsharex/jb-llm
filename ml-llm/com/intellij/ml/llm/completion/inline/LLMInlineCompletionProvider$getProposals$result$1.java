/*    */ package com.intellij.ml.llm.completion.inline;
/*    */ import com.intellij.codeInsight.inline.completion.InlineCompletionElement;
/*    */ import com.intellij.ml.llm.core.models.SenderKt;
/*    */ import com.intellij.ml.llm.core.models.requestResponse.LLMResponseChoice;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020 \n\002\030\002\n\000\020\000\032\n\022\004\022\0020\002\030\0010\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/codeInsight/inline/completion/InlineCompletionElement;", "invoke"})
/*    */ @SourceDebugExtension({"SMAP\nLLMInlineEditorListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMInlineEditorListener.kt\ncom/intellij/ml/llm/completion/inline/LLMInlineCompletionProvider$getProposals$result$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,29:1\n1549#2:30\n1620#2,3:31\n*S KotlinDebug\n*F\n+ 1 LLMInlineEditorListener.kt\ncom/intellij/ml/llm/completion/inline/LLMInlineCompletionProvider$getProposals$result$1\n*L\n25#1:30\n25#1:31,3\n*E\n"})
/*    */ final class LLMInlineCompletionProvider$getProposals$result$1 extends Lambda implements Function0<List<? extends InlineCompletionElement>> {
/*    */   LLMInlineCompletionProvider$getProposals$result$1(Project $project, String $prefix) {
/*    */     super(0);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final List<InlineCompletionElement> invoke() {
/* 25 */     Iterable $this$map$iv = SenderKt.sendCompletionChatRequest$default(this.$project, this.$prefix, "", null, null, null, null, null, null, 0, null, null, null, 8184, null).getSuggestions(); int $i$f$map = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 30 */     Iterable iterable1 = $this$map$iv; Collection<InlineCompletionElement> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 31 */     for (Object item$iv$iv : iterable1) {
/* 32 */       LLMResponseChoice lLMResponseChoice = (LLMResponseChoice)item$iv$iv; Collection<InlineCompletionElement> collection = destination$iv$iv; int $i$a$-map-LLMInlineCompletionProvider$getProposals$result$1$1 = 0; collection.add(new InlineCompletionElement(lLMResponseChoice.getText()));
/* 33 */     }  SenderKt.sendCompletionChatRequest$default(this.$project, this.$prefix, "", null, null, null, null, null, null, 0, null, null, null, 8184, null).getSuggestions(); return (SenderKt.sendCompletionChatRequest$default(this.$project, this.$prefix, "", null, null, null, null, null, null, 0, null, null, null, 8184, null) != null && SenderKt.sendCompletionChatRequest$default(this.$project, this.$prefix, "", null, null, null, null, null, null, 0, null, null, null, 8184, null).getSuggestions() != null) ? (List<InlineCompletionElement>)destination$iv$iv : null;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/completion/inline/LLMInlineCompletionProvider$getProposals$result$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */