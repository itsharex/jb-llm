/*    */ package com.intellij.ml.llm.core.chat.snippets;
/*    */ import com.intellij.lang.Language;
/*    */ import com.intellij.openapi.Disposable;
/*    */ import com.intellij.openapi.diagnostic.Logger;
/*    */ import com.intellij.openapi.editor.Document;
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.editor.EditorFactory;
/*    */ import com.intellij.openapi.editor.ex.EditorEx;
/*    */ import com.intellij.openapi.extensions.ExtensionPointName;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000:\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\002\032&\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\0162\006\020\017\032\0020\020\032\026\020\021\032\0020\0222\006\020\t\032\0020\n2\006\020\023\032\0020\b\"\027\020\000\032\b\022\004\022\0020\0020\001¢\006\b\n\000\032\004\b\003\020\004\"\016\020\005\032\0020\006X\004¢\006\002\n\000¨\006\024"}, d2 = {"EP", "Lcom/intellij/openapi/extensions/ExtensionPointName;", "Lcom/intellij/ml/llm/core/chat/snippets/CodeSnippetProvider;", "getEP", "()Lcom/intellij/openapi/extensions/ExtensionPointName;", "LOG", "Lcom/intellij/openapi/diagnostic/Logger;", "createEditorForChatCodeSnippet", "Lcom/intellij/openapi/editor/Editor;", "project", "Lcom/intellij/openapi/project/Project;", "document", "Lcom/intellij/openapi/editor/Document;", "language", "Lcom/intellij/lang/Language;", "disposable", "Lcom/intellij/openapi/Disposable;", "finalizeEditorForChatCodeSnippet", "", "editor", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nCodeSnippetProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CodeSnippetProvider.kt\ncom/intellij/ml/llm/core/chat/snippets/CodeSnippetProviderKt\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,52:1\n10#2:53\n*S KotlinDebug\n*F\n+ 1 CodeSnippetProvider.kt\ncom/intellij/ml/llm/core/chat/snippets/CodeSnippetProviderKt\n*L\n22#1:53\n*E\n"})
/*    */ public final class CodeSnippetProviderKt {
/*    */   @NotNull
/* 20 */   private static final ExtensionPointName<CodeSnippetProvider> EP = new ExtensionPointName("com.intellij.chatCodeSnippetProvider"); @NotNull public static final ExtensionPointName<CodeSnippetProvider> getEP() { return EP; }
/*    */   
/* 22 */   static { int $i$f$logger = 0;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 53 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(CodeSnippetProvider.class), "getInstance(T::class.java)"); } @NotNull private static final Logger LOG = Logger.getInstance(CodeSnippetProvider.class);
/*    */   
/*    */   @NotNull
/*    */   public static final Editor createEditorForChatCodeSnippet(@NotNull Project project, @NotNull Document document, @NotNull Language language, @NotNull Disposable disposable) {
/*    */     Intrinsics.checkNotNullParameter(project, "project");
/*    */     Intrinsics.checkNotNullParameter(document, "document");
/*    */     Intrinsics.checkNotNullParameter(language, "language");
/*    */     Intrinsics.checkNotNullParameter(disposable, "disposable");
/*    */     for (CodeSnippetProvider provider : EP.getExtensionList()) {
/*    */       try {
/*    */         Editor editor = provider.tryCreateEditor(project, document, language);
/*    */         if (editor != null)
/*    */           return editor; 
/*    */       } catch (Throwable e) {
/*    */         LOG.error(e);
/*    */       } 
/*    */     } 
/*    */     EditorFactory editorFactory = EditorFactory.getInstance();
/*    */     Intrinsics.checkNotNull(editorFactory.createViewer(document, project), "null cannot be cast to non-null type com.intellij.openapi.editor.ex.EditorEx");
/*    */     EditorEx result = (EditorEx)editorFactory.createViewer(document, project);
/*    */     DisposerUtilKt.whenDisposed(disposable, new CodeSnippetProviderKt$createEditorForChatCodeSnippet$1(editorFactory, result));
/*    */     return (Editor)result;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */   static final class CodeSnippetProviderKt$createEditorForChatCodeSnippet$1 extends Lambda implements Function0<Unit> {
/*    */     public final void invoke() {
/*    */       this.$editorFactory.releaseEditor((Editor)this.$result);
/*    */     }
/*    */     
/*    */     CodeSnippetProviderKt$createEditorForChatCodeSnippet$1(EditorFactory $editorFactory, EditorEx $result) {
/*    */       super(0);
/*    */     }
/*    */   }
/*    */   
/*    */   public static final void finalizeEditorForChatCodeSnippet(@NotNull Project project, @NotNull Editor editor) {
/*    */     Intrinsics.checkNotNullParameter(project, "project");
/*    */     Intrinsics.checkNotNullParameter(editor, "editor");
/*    */     for (CodeSnippetProvider provider : EP.getExtensionList()) {
/*    */       try {
/*    */         provider.tryFinalizeEditor(project, editor);
/*    */       } catch (Throwable e) {
/*    */         LOG.error(e);
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/snippets/CodeSnippetProviderKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */