/*    */ package com.intellij.ml.llm.kotlin.editor;
/*    */ import com.intellij.ml.llm.evaluation.CallLocation;
/*    */ import com.intellij.ml.llm.evaluation.CompletedLLMRequest;
/*    */ import com.intellij.ml.llm.evaluation.EvaluatableIntention;
/*    */ import com.intellij.ml.llm.evaluation.IntentionCallContext;
/*    */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import java.io.File;
/*    */ import java.util.Iterator;
/*    */ import kotlin.io.FilesKt;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\000\030\0002\0020\001B\005¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\006H\026J\030\020\007\032\0020\0042\006\020\b\032\0020\t2\006\020\n\032\0020\013H\002J\020\020\f\032\0020\r2\006\020\n\032\0020\013H\002¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/kotlin/editor/EvaluateFeatureAction;", "Lcom/intellij/openapi/actionSystem/AnAction;", "()V", "actionPerformed", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "evaluateFeature", "project", "Lcom/intellij/openapi/project/Project;", "intention", "Lcom/intellij/ml/llm/evaluation/EvaluatableIntention;", "getStorageFolder", "Ljava/io/File;", "intellij.ml.llm.kotlin"})
/*    */ @SourceDebugExtension({"SMAP\nEvaluateFeatureAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EvaluateFeatureAction.kt\ncom/intellij/ml/llm/kotlin/editor/EvaluateFeatureAction\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,43:1\n1864#2,3:44\n*S KotlinDebug\n*F\n+ 1 EvaluateFeatureAction.kt\ncom/intellij/ml/llm/kotlin/editor/EvaluateFeatureAction\n*L\n24#1:44,3\n*E\n"})
/*    */ public final class EvaluateFeatureAction extends AnAction {
/*    */   public void actionPerformed(@NotNull AnActionEvent e) {
/*    */     Project project;
/* 17 */     Intrinsics.checkNotNullParameter(e, "e"); if (e.getProject() == null) { e.getProject(); return; }
/* 18 */      evaluateFeature(project, new RenameIdentifierIntention());
/*    */   }
/*    */   
/*    */   private final void evaluateFeature(Project project, EvaluatableIntention intention) {
/* 22 */     File storageFolder = getStorageFolder(intention);
/* 23 */     List locations = intention.gatherRandomApplicationLocations(project, 10);
/* 24 */     Iterable $this$forEachIndexed$iv = locations; int $i$f$forEachIndexed = 0;
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
/* 44 */     int index$iv = 0;
/* 45 */     Iterator iterator = $this$forEachIndexed$iv.iterator(); if (iterator.hasNext()) { Object item$iv = iterator.next(); int i = index$iv++; if (i < 0) CollectionsKt.throwIndexOverflow();  CallLocation callLocation = (CallLocation)item$iv; int index = i, $i$a$-forEachIndexed-EvaluateFeatureAction$evaluateFeature$1 = 0;
/*    */       IntentionCallContext callContext = callLocation.getIntentionCallContext();
/*    */       intention.getLLMSuggestion(callContext, new EvaluateFeatureAction$evaluateFeature$1$1(storageFolder, index, callLocation)); }
/*    */   
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H\n¢\006\002\b\006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/intellij/ml/llm/evaluation/IntentionCallContext;", "completedLLMRequest", "Lcom/intellij/ml/llm/evaluation/CompletedLLMRequest;", "invoke"})
/*    */   static final class EvaluateFeatureAction$evaluateFeature$1$1 extends Lambda implements Function2<IntentionCallContext, CompletedLLMRequest, Unit> {
/*    */     public final void invoke(@NotNull IntentionCallContext param1IntentionCallContext, @NotNull CompletedLLMRequest completedLLMRequest) {
/*    */       Intrinsics.checkNotNullParameter(param1IntentionCallContext, "<anonymous parameter 0>");
/*    */       Intrinsics.checkNotNullParameter(completedLLMRequest, "completedLLMRequest");
/*    */       File outputFile = FilesKt.resolve(this.$storageFolder, "" + this.$index + ".json");
/*    */       FilesKt.writeText$default(outputFile, StringsKt.trimIndent("\n          { \n            \"suggestion\": \"" + completedLLMRequest.getSuggestion() + "\",\n            \"location\": \"" + this.$location.toJson() + "\"\n          }\n         "), null, 2, null);
/*    */     }
/*    */     
/*    */     EvaluateFeatureAction$evaluateFeature$1$1(File $storageFolder, int $index, CallLocation $location) {
/*    */       super(2);
/*    */     }
/*    */   }
/*    */   
/*    */   private final File getStorageFolder(EvaluatableIntention intention) {
/*    */     File storageFolder = FilesKt.resolve(FilesKt.resolve(new File(PathManager.getPluginsPath()), "storage"), intention.getFeatureName());
/*    */     storageFolder.mkdirs();
/*    */     return storageFolder;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/editor/EvaluateFeatureAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */