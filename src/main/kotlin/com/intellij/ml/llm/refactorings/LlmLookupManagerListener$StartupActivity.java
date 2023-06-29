/*     */ package com.intellij.ml.llm.refactorings;
/*     */ 
/*     */ import com.intellij.codeInsight.lookup.LookupManagerListener;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.startup.ProjectActivity;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\002\b\002\b\000\030\0002\0020\001B\005¢\006\002\020\002J\031\020\003\032\0020\0042\006\020\005\032\0020\006H@ø\001\000¢\006\002\020\007\002\004\n\002\b\031¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/refactorings/LlmLookupManagerListener$StartupActivity;", "Lcom/intellij/openapi/startup/ProjectActivity;", "()V", "execute", "", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intellij.ml.llm"})
/*     */ public final class StartupActivity
/*     */   implements ProjectActivity
/*     */ {
/*     */   @Nullable
/*     */   public Object execute(@NotNull Project project, @NotNull Continuation $completion) {
/* 140 */     LlmLookupManagerListener llmLookupManagerListener = new LlmLookupManagerListener(project);
/* 141 */     Intrinsics.checkNotNullExpressionValue(LookupManagerListener.TOPIC, "TOPIC"); project.getMessageBus().connect().subscribe(LookupManagerListener.TOPIC, llmLookupManagerListener);
/* 142 */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/refactorings/LlmLookupManagerListener$StartupActivity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */