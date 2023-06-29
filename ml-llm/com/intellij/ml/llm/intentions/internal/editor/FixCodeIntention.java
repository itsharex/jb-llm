/*    */ package com.intellij.ml.llm.intentions.internal.editor;
/*    */ 
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.editor.ex.RangeHighlighterEx;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Ref;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\000\030\0002\0020\001B\005¢\006\002\020\002J\034\020\003\032\004\030\0010\0042\006\020\005\032\0020\0062\b\020\007\032\004\030\0010\bH\002J\b\020\t\032\0020\004H\026J$\020\n\032\0020\0042\006\020\005\032\0020\0062\b\020\007\032\004\030\0010\b2\b\020\013\032\004\030\0010\fH\026J\b\020\r\032\0020\004H\026J$\020\016\032\0020\0172\006\020\005\032\0020\0062\b\020\007\032\004\030\0010\b2\b\020\020\032\004\030\0010\021H\026¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/intentions/internal/editor/FixCodeIntention;", "Lcom/intellij/ml/llm/intentions/editor/ApplyTransformationIntention;", "()V", "extractInspectionMessageAtCaret", "", "project", "Lcom/intellij/openapi/project/Project;", "editor", "Lcom/intellij/openapi/editor/Editor;", "getFamilyName", "getInstruction", "element", "Lcom/intellij/psi/PsiElement;", "getText", "isAvailable", "", "file", "Lcom/intellij/psi/PsiFile;", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nFixCodeIntention.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FixCodeIntention.kt\ncom/intellij/ml/llm/intentions/internal/editor/FixCodeIntention\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n1#2:48\n*E\n"})
/*    */ public final class FixCodeIntention extends ApplyTransformationIntention {
/* 14 */   public FixCodeIntention() { super(null, null, 3, null); } @NotNull
/* 15 */   public String getText() { return LLMBundle.message("intentions.apply.transformation.fix.bug.name", new Object[0]); } @NotNull
/*    */   public String getFamilyName() {
/* 17 */     return LLMBundle.message("intentions.apply.transformation.family.name", new Object[0]);
/*    */   }
/*    */   public boolean isAvailable(@NotNull Project project, @Nullable Editor editor, @Nullable PsiFile file) {
/* 20 */     Intrinsics.checkNotNullParameter(project, "project"); return (super.isAvailable(project, editor, file) && extractInspectionMessageAtCaret(project, editor) != null && Registry.is(
/* 21 */         "llm.is.internal"));
/*    */   }
/*    */   @NotNull
/*    */   public String getInstruction(@NotNull Project project, @Nullable Editor editor, @Nullable PsiElement element) {
/* 25 */     Intrinsics.checkNotNullParameter(project, "project"); String inspectionMessage = extractInspectionMessageAtCaret(project, editor);
/* 26 */     if (inspectionMessage != null) { String it = inspectionMessage;
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
/* 48 */       int $i$a$-let-FixCodeIntention$getInstruction$1 = 0;
/*    */       if ("Fix problem: " + it == null) {
/*    */         "Fix problem: " + it;
/*    */         return "fix bug in this code";
/*    */       } 
/*    */       return "Fix problem: " + it; }
/*    */     
/*    */     "Fix problem: " + it;
/*    */     return "fix bug in this code";
/*    */   }
/*    */   
/*    */   private final String extractInspectionMessageAtCaret(Project project, Editor editor) {
/*    */     if (editor == null)
/*    */       return null; 
/*    */     int offset = editor.getCaretModel().getOffset();
/*    */     Ref.ObjectRef inspectionMessage = new Ref.ObjectRef();
/*    */     Intrinsics.checkNotNull(DocumentMarkupModel.forDocument(editor.getDocument(), project, false), "null cannot be cast to non-null type com.intellij.openapi.editor.ex.MarkupModelEx");
/*    */     ((MarkupModelEx)DocumentMarkupModel.forDocument(editor.getDocument(), project, false)).processRangeHighlightersOverlappingWith(offset, offset, new FixCodeIntention$extractInspectionMessageAtCaret$1(inspectionMessage)::extractInspectionMessageAtCaret$lambda$1);
/*    */     return (String)inspectionMessage.element;
/*    */   }
/*    */   
/*    */   private static final boolean extractInspectionMessageAtCaret$lambda$1(Function1 $tmp0, Object p0) {
/*    */     Intrinsics.checkNotNullParameter($tmp0, "$tmp0");
/*    */     return ((Boolean)$tmp0.invoke(p0)).booleanValue();
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\003\020\000\032\0020\0012\016\020\002\032\n \004*\004\030\0010\0030\003H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "highlighter", "Lcom/intellij/openapi/editor/ex/RangeHighlighterEx;", "kotlin.jvm.PlatformType", "invoke", "(Lcom/intellij/openapi/editor/ex/RangeHighlighterEx;)Ljava/lang/Boolean;"})
/*    */   static final class FixCodeIntention$extractInspectionMessageAtCaret$1 extends Lambda implements Function1<RangeHighlighterEx, Boolean> {
/*    */     @NotNull
/*    */     public final Boolean invoke(RangeHighlighterEx highlighter) {
/*    */       HighlightInfo highlightInfo = HighlightInfo.fromRangeHighlighter((RangeHighlighter)highlighter);
/*    */       String description = (highlightInfo != null) ? highlightInfo.getDescription() : null;
/*    */       this.$inspectionMessage.element = description;
/*    */       return Boolean.valueOf(!(description != null));
/*    */     }
/*    */     
/*    */     FixCodeIntention$extractInspectionMessageAtCaret$1(Ref.ObjectRef<String> $inspectionMessage) {
/*    */       super(1);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/internal/editor/FixCodeIntention.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */