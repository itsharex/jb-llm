package com.intellij.ml.llm.core.chat.snippets;

import com.intellij.lang.Language;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\002\bf\030\0002\0020\001J\"\020\002\032\004\030\0010\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\tH&J\030\020\n\032\0020\0132\006\020\004\032\0020\0052\006\020\f\032\0020\003H&ø\001\000\002\006\n\004\b!0\001¨\006\rÀ\006\001"}, d2 = {"Lcom/intellij/ml/llm/core/chat/snippets/CodeSnippetProvider;", "", "tryCreateEditor", "Lcom/intellij/openapi/editor/Editor;", "project", "Lcom/intellij/openapi/project/Project;", "document", "Lcom/intellij/openapi/editor/Document;", "language", "Lcom/intellij/lang/Language;", "tryFinalizeEditor", "", "editor", "intellij.ml.llm"})
public interface CodeSnippetProvider {
  @Nullable
  Editor tryCreateEditor(@NotNull Project paramProject, @NotNull Document paramDocument, @NotNull Language paramLanguage);
  
  void tryFinalizeEditor(@NotNull Project paramProject, @NotNull Editor paramEditor);
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/snippets/CodeSnippetProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */