/*    */ package com.intellij.ml.llm.performanceTesting.name.suggestion;
/*    */ 
/*    */ import com.intellij.ml.llm.refactorings.NameSuggestionListener;
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import java.util.Collection;
/*    */ import java.util.Date;
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000+\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\020\036\n\002\b\002*\001\000\b\n\030\0002\0020\001J.\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\f\020\n\032\b\022\004\022\0020\t0\013H\026J \020\f\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\tH\026¨\006\r"}, d2 = {"com/intellij/ml/llm/performanceTesting/name/suggestion/NameSuggestionBenchmarkService$startBenchmark$1", "Lcom/intellij/ml/llm/refactorings/NameSuggestionListener;", "onFinish", "", "file", "Lcom/intellij/openapi/vfs/VirtualFile;", "offset", "", "originalName", "", "suggestedNames", "", "onStart", "intellij.ml.llm.performanceTesting"})
/*    */ public final class NameSuggestionBenchmarkService$startBenchmark$1
/*    */   implements NameSuggestionListener
/*    */ {
/*    */   public void onStart(@NotNull VirtualFile file, int offset, @NotNull String originalName) {
/* 22 */     Intrinsics.checkNotNullParameter(file, "file"); Intrinsics.checkNotNullParameter(originalName, "originalName"); Map<NameSuggestionBenchmarkService.Location, NameSuggestionBenchmarkService.Session> map = NameSuggestionBenchmarkService.access$getResults$p(NameSuggestionBenchmarkService.this); Intrinsics.checkNotNullExpressionValue(file.getPath(), "file.path"); NameSuggestionBenchmarkService.Location location = new NameSuggestionBenchmarkService.Location(file.getPath(), offset); NameSuggestionBenchmarkService.Session session = new NameSuggestionBenchmarkService.Session(originalName, (new Date()).getTime(), null, CollectionsKt.emptyList()); map.put(location, session);
/*    */   }
/*    */   
/*    */   public void onFinish(@NotNull VirtualFile file, int offset, @NotNull String originalName, @NotNull Collection<String> suggestedNames) {
/* 26 */     Intrinsics.checkNotNullParameter(file, "file"); Intrinsics.checkNotNullParameter(originalName, "originalName"); Intrinsics.checkNotNullParameter(suggestedNames, "suggestedNames"); Intrinsics.checkNotNullExpressionValue(file.getPath(), "file.path"); NameSuggestionBenchmarkService.Location location = new NameSuggestionBenchmarkService.Location(file.getPath(), offset);
/* 27 */     NameSuggestionBenchmarkService.Session session1 = (NameSuggestionBenchmarkService.Session)NameSuggestionBenchmarkService.access$getResults$p(NameSuggestionBenchmarkService.this).get(location), it = session1; int $i$a$-also-NameSuggestionBenchmarkService$startBenchmark$1$onFinish$1 = 0;
/* 28 */     it.setEndTime(Long.valueOf((new Date()).getTime()));
/* 29 */     it.setNames(suggestedNames);
/*    */     (NameSuggestionBenchmarkService.Session)NameSuggestionBenchmarkService.access$getResults$p(NameSuggestionBenchmarkService.this).get(location);
/* 31 */     Function0 function01 = (Function0)NameSuggestionBenchmarkService.access$getListeners$p(NameSuggestionBenchmarkService.this).get(location); NameSuggestionBenchmarkService nameSuggestionBenchmarkService = NameSuggestionBenchmarkService.this; Function0 function02 = function01; int $i$a$-let-NameSuggestionBenchmarkService$startBenchmark$1$onFinish$2 = 0;
/* 32 */     NameSuggestionBenchmarkService.access$getListeners$p(nameSuggestionBenchmarkService).remove(location);
/* 33 */     function02.invoke();
/*    */     (Function0)NameSuggestionBenchmarkService.access$getListeners$p(NameSuggestionBenchmarkService.this).get(location);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/performanceTesting/name/suggestion/NameSuggestionBenchmarkService$startBenchmark$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */