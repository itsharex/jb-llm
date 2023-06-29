/*     */ package com.intellij.ml.llm.intentions.internal.editor;
/*     */ 
/*     */ import com.intellij.openapi.components.Service;
/*     */ import com.intellij.openapi.editor.Document;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ @Service({Service.Level.PROJECT})
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\020%\n\002\030\002\n\002\020\b\n\002\020\016\n\002\b\006\b\027\030\000 \0162\0020\001:\001\016B\r\022\006\020\002\032\0020\003¢\006\002\020\004R5\020\005\032&\022\004\022\0020\007\022\034\022\032\022\004\022\0020\b\022\020\022\016\022\004\022\0020\t\022\004\022\0020\t0\0060\0060\006¢\006\b\n\000\032\004\b\n\020\013R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\r¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/intentions/internal/editor/EmptyIntentionProviderManager;", "", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;)V", "map", "", "Lcom/intellij/openapi/editor/Document;", "", "", "getMap", "()Ljava/util/Map;", "getProject", "()Lcom/intellij/openapi/project/Project;", "Companion", "intellij.ml.llm"})
/*     */ public class EmptyIntentionProviderManager
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final Project project;
/*     */   @NotNull
/*     */   private final Map<Document, Map<Integer, Map<String, String>>> map;
/*     */   
/*     */   @NotNull
/*     */   public final Project getProject() {
/*     */     return this.project;
/*     */   }
/*     */   
/*     */   public EmptyIntentionProviderManager(@NotNull Project project) {
/* 120 */     this.project = project;
/*     */     
/* 122 */     this.map = new LinkedHashMap<>(); } @NotNull public final Map<Document, Map<Integer, Map<String, String>>> getMap() { return this.map; } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/intentions/internal/editor/EmptyIntentionProviderManager$Companion;", "", "()V", "getInstance", "Lcom/intellij/ml/llm/intentions/internal/editor/EmptyIntentionProviderManager;", "project", "Lcom/intellij/openapi/project/Project;", "intellij.ml.llm"})
/*     */   public static final class Companion { @NotNull
/*     */     public final EmptyIntentionProviderManager getInstance(@NotNull Project project) {
/* 125 */       Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullExpressionValue(project.getService(EmptyIntentionProviderManager.class), "project.getService(Empty…viderManager::class.java)"); return (EmptyIntentionProviderManager)project.getService(EmptyIntentionProviderManager.class);
/*     */     }
/*     */     
/*     */     private Companion() {} }
/*     */ 
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/internal/editor/EmptyIntentionProviderManager.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */