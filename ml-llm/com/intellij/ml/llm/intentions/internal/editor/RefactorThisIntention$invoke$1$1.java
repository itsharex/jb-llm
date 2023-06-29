/*     */ package com.intellij.ml.llm.intentions.internal.editor;
/*     */ 
/*     */ import com.intellij.ml.llm.LLMBundle;
/*     */ import com.intellij.openapi.command.CommandProcessor;
/*     */ import com.intellij.openapi.editor.Document;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.util.TextRange;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*     */ @SourceDebugExtension({"SMAP\nRefactorThisIntention.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RefactorThisIntention.kt\ncom/intellij/ml/llm/intentions/internal/editor/RefactorThisIntention$invoke$1$1\n+ 2 actions.kt\ncom/intellij/openapi/command/ActionsKt\n*L\n1#1,117:1\n7#2,6:118\n*S KotlinDebug\n*F\n+ 1 RefactorThisIntention.kt\ncom/intellij/ml/llm/intentions/internal/editor/RefactorThisIntention$invoke$1$1\n*L\n72#1:118,6\n*E\n"})
/*     */ final class null
/*     */   extends Lambda
/*     */   implements Function0<Unit>
/*     */ {
/*     */   public final void invoke() {
/*  71 */     if (this.$result != null && !RefactorThisIntention.access$resultIsTrivial(RefactorThisIntention.this, this.$result)) {
/*  72 */       Project project1 = this.$project; String str1 = LLMBundle.message("intentions.refactor.code", new Object[0]); Document document = this.$document; Ref.ObjectRef<TextRange> objectRef = this.$textRange; String str2 = this.$result; Project project2 = this.$project; PsiFile psiFile = this.$file;
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
/* 120 */       String groupId$iv = null;
/*     */       int $i$f$executeCommand = 0;
/* 122 */       CommandProcessor.getInstance().executeCommand(project1, new RefactorThisIntention$invoke$1$1$invoke$$inlined$executeCommand$default$1(document, objectRef, str2, project2, psiFile), str1, groupId$iv);
/*     */     } 
/*     */   }
/*     */   
/*     */   null(RefactorThisIntention $receiver, Project $project, Document $document, Ref.ObjectRef<TextRange> $textRange, PsiFile $file) {
/*     */     super(0);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/internal/editor/RefactorThisIntention$invoke$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */