/*    */ package com.intellij.ml.llm.intentions;
/*    */ import com.intellij.codeInsight.intention.CommonIntentionAction;
/*    */ import com.intellij.codeInsight.intention.IntentionAction;
/*    */ import com.intellij.codeInsight.intention.IntentionActionBean;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\0002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\002\032(\020\005\032\b\022\004\022\0020\0070\0062\006\020\b\032\0020\t2\b\020\n\032\004\030\0010\0132\b\020\f\032\004\030\0010\r\032\020\020\016\032\0020\0172\006\020\020\032\0020\007H\002\"\027\020\000\032\b\022\004\022\0020\0020\001¢\006\b\n\000\032\004\b\003\020\004¨\006\021"}, d2 = {"EP_NAME", "Lcom/intellij/openapi/extensions/ExtensionPointName;", "Lcom/intellij/codeInsight/intention/IntentionActionBean;", "getEP_NAME", "()Lcom/intellij/openapi/extensions/ExtensionPointName;", "getAiAssistantIntentions", "", "Lcom/intellij/codeInsight/intention/IntentionAction;", "project", "Lcom/intellij/openapi/project/Project;", "editor", "Lcom/intellij/openapi/editor/Editor;", "file", "Lcom/intellij/psi/PsiFile;", "getIntentionRank", "", "it", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nIntentionsUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntentionsUtils.kt\ncom/intellij/ml/llm/intentions/IntentionsUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,29:1\n1549#2:30\n1620#2,3:31\n800#2,11:34\n766#2:45\n857#2,2:46\n1054#2:48\n*S KotlinDebug\n*F\n+ 1 IntentionsUtils.kt\ncom/intellij/ml/llm/intentions/IntentionsUtilsKt\n*L\n16#1:30\n16#1:31,3\n17#1:34,11\n18#1:45\n18#1:46,2\n19#1:48\n*E\n"})
/*    */ public final class IntentionsUtilsKt {
/*    */   @NotNull
/* 12 */   private static final ExtensionPointName<IntentionActionBean> EP_NAME = new ExtensionPointName("com.intellij.ml.llm.aiAssistantIntention"); @NotNull public static final ExtensionPointName<IntentionActionBean> getEP_NAME() { return EP_NAME; }
/*    */    @NotNull
/*    */   public static final List<IntentionAction> getAiAssistantIntentions(@NotNull Project project, @Nullable Editor editor, @Nullable PsiFile file) {
/* 15 */     Intrinsics.checkNotNullParameter(project, "project"); List list1 = EP_NAME.getExtensionList();
/* 16 */     int $i$f$map = 0;
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
/* 30 */     List list2 = list1; Collection<CommonIntentionAction> collection = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10)); int $i$f$mapTo = 0;
/* 31 */     for (Object item$iv$iv : list2) {
/* 32 */       IntentionActionBean intentionActionBean = (IntentionActionBean)item$iv$iv; Collection<CommonIntentionAction> collection2 = collection; int $i$a$-map-IntentionsUtilsKt$getAiAssistantIntentions$1 = 0; collection2.add((CommonIntentionAction)intentionActionBean.getInstance());
/* 33 */     }  Iterable $this$map$iv = collection; int $i$f$filterIsInstance = 0;
/* 34 */     Iterable $this$mapTo$iv$iv = $this$map$iv; Collection<Object> collection1 = new ArrayList(); int $i$f$filterIsInstanceTo = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 43 */     for (Object element$iv$iv : $this$mapTo$iv$iv) { if (element$iv$iv instanceof IntentionAction) collection1.add(element$iv$iv);  }
/* 44 */      Iterable $this$filterIsInstance$iv = collection1; int $i$f$filter = 0;
/* 45 */     Iterable $this$filterIsInstanceTo$iv$iv = $this$filterIsInstance$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 46 */     for (Object element$iv$iv : $this$filterIsInstanceTo$iv$iv) { IntentionAction it = (IntentionAction)element$iv$iv; int $i$a$-filter-IntentionsUtilsKt$getAiAssistantIntentions$2 = 0; if (it.isAvailable(project, editor, file)) destination$iv$iv.add(element$iv$iv);  }
/* 47 */      Iterable $this$filter$iv = destination$iv$iv; int $i$f$sortedByDescending = 0;
/* 48 */     return CollectionsKt.sortedWith($this$filter$iv, new IntentionsUtilsKt$getAiAssistantIntentions$$inlined$sortedByDescending$1());
/*    */   }
/*    */   
/*    */   private static final int getIntentionRank(IntentionAction it) {
/*    */     IntentionAction intentionAction = it;
/*    */     return (intentionAction instanceof com.intellij.codeInsight.intention.HighPriorityAction) ? 1 : ((intentionAction instanceof com.intellij.codeInsight.intention.LowPriorityAction) ? -1 : 0);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/IntentionsUtilsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */