/*    */ package com.intellij.ml.llm.cicd.gen.prompts;
/*    */ 
/*    */ import git4idea.GitRemoteBranch;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\r\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\016\020\002\032\n \004*\004\030\0010\0030\003H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "it", "Lgit4idea/GitRemoteBranch;", "kotlin.jvm.PlatformType", "invoke"})
/*    */ final class ProjectStructureContextBuilder$buildGitContext$branchesContext$2
/*    */   extends Lambda
/*    */   implements Function1<GitRemoteBranch, CharSequence>
/*    */ {
/*    */   public static final ProjectStructureContextBuilder$buildGitContext$branchesContext$2 INSTANCE = new ProjectStructureContextBuilder$buildGitContext$branchesContext$2();
/*    */   
/*    */   @NotNull
/*    */   public final CharSequence invoke(GitRemoteBranch it) {
/* 34 */     Intrinsics.checkNotNullExpressionValue(it.getName(), "it.name"); return it.getName();
/*    */   }
/*    */   
/*    */   ProjectStructureContextBuilder$buildGitContext$branchesContext$2() {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/cicd/gen/prompts/ProjectStructureContextBuilder$buildGitContext$branchesContext$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */