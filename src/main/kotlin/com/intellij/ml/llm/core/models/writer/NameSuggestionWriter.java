/*    */ package com.intellij.ml.llm.core.models.writer;
/*    */ 
/*    */ import com.google.gson.Gson;
/*    */ import com.intellij.ide.scratch.ScratchFileService;
/*    */ import com.intellij.openapi.editor.Document;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.psi.PsiDocumentManager;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\002\020\016\n\000\n\002\030\002\n\002\b\b\n\002\030\002\n\000\n\002\020\002\n\002\b\003\n\002\030\002\n\000\n\002\020\r\n\002\b\002\030\0002\b\022\004\022\0020\0020\001:\001\026B7\022\006\020\003\032\0020\004\022\006\020\005\032\0020\002\022\006\020\006\032\0020\002\022\006\020\007\032\0020\002\022\006\020\b\032\0020\002\022\b\020\t\032\004\030\0010\002¢\006\002\020\nJ2\020\013\032\0020\0022\006\020\005\032\0020\0022\006\020\006\032\0020\0022\006\020\007\032\0020\0022\006\020\b\032\0020\0022\b\020\t\032\004\030\0010\002H\002J\b\020\f\032\0020\rH\026J\032\020\016\032\0020\0172\006\020\020\032\0020\0022\b\b\002\020\021\032\0020\002H\002J\024\020\022\032\0020\017*\0020\0232\006\020\024\032\0020\025H\002R\016\020\006\032\0020\002X\004¢\006\002\n\000R\016\020\b\032\0020\002X\004¢\006\002\n\000R\016\020\007\032\0020\002X\004¢\006\002\n\000R\016\020\005\032\0020\002X\004¢\006\002\n\000R\020\020\t\032\004\030\0010\002X\004¢\006\002\n\000R\016\020\003\032\0020\004X\004¢\006\002\n\000¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/core/models/writer/NameSuggestionWriter;", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseRequest;", "", "project", "Lcom/intellij/openapi/project/Project;", "oldName", "contextPrompt", "objectType", "objectToRename", "prefix", "(Lcom/intellij/openapi/project/Project;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContent", "sendSync", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseResponse;", "updateScratchFile", "", "fileContent", "fileName", "appendChars", "Lcom/intellij/openapi/editor/Document;", "charSequence", "", "Content", "intellij.ml.llm"})
/*    */ public final class NameSuggestionWriter extends LLMBaseRequest<String> {
/*    */   @NotNull
/*    */   private final Project project;
/*    */   @NotNull
/*    */   private final String oldName;
/*    */   @NotNull
/*    */   private final String contextPrompt;
/*    */   
/* 22 */   public NameSuggestionWriter(@NotNull Project project, @NotNull String oldName, @NotNull String contextPrompt, @NotNull String objectType, @NotNull String objectToRename, @Nullable String prefix) { super(""); this.project = project; this.oldName = oldName; this.contextPrompt = contextPrompt; this.objectType = objectType; this.objectToRename = objectToRename; this.prefix = prefix; }
/*    */   @NotNull private final String objectType; @NotNull
/*    */   private final String objectToRename; @Nullable
/*    */   private final String prefix; @NotNull
/*    */   public LLMBaseResponse sendSync() { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload_0
/*    */     //   2: getfield oldName : Ljava/lang/String;
/*    */     //   5: aload_0
/*    */     //   6: getfield contextPrompt : Ljava/lang/String;
/*    */     //   9: aload_0
/*    */     //   10: getfield objectType : Ljava/lang/String;
/*    */     //   13: aload_0
/*    */     //   14: getfield objectToRename : Ljava/lang/String;
/*    */     //   17: aload_0
/*    */     //   18: getfield prefix : Ljava/lang/String;
/*    */     //   21: invokespecial getContent : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*    */     //   24: astore_1
/*    */     //   25: aload_0
/*    */     //   26: getfield project : Lcom/intellij/openapi/project/Project;
/*    */     //   29: invokestatic writeCommandAction : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/command/WriteCommandAction$Builder;
/*    */     //   32: aload_0
/*    */     //   33: aload_1
/*    */     //   34: <illegal opcode> run : (Lcom/intellij/ml/llm/core/models/writer/NameSuggestionWriter;Ljava/lang/String;)Lcom/intellij/util/ThrowableRunnable;
/*    */     //   39: invokeinterface run : (Lcom/intellij/util/ThrowableRunnable;)V
/*    */     //   44: new com/intellij/ml/llm/core/models/mock/MockResponse
/*    */     //   47: dup
/*    */     //   48: ldc 'Integration test'
/*    */     //   50: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   53: checkcast com/intellij/ml/llm/core/models/requestResponse/LLMBaseResponse
/*    */     //   56: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #24	-> 0
/*    */     //   #25	-> 25
/*    */     //   #28	-> 44
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   25	32	1	content	Ljava/lang/String;
/* 26 */     //   0	57	0	this	Lcom/intellij/ml/llm/core/models/writer/NameSuggestionWriter; } private static final void sendSync$lambda$0(NameSuggestionWriter this$0, String $content) { Intrinsics.checkNotNullParameter(this$0, "this$0"); Intrinsics.checkNotNullParameter($content, "$content"); updateScratchFile$default(this$0, $content, null, 2, null); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private final String getContent(String oldName, String contextPrompt, String objectType, String objectToRename, String prefix) {
/* 36 */     Intrinsics.checkNotNullExpressionValue((new GsonBuilder()).create(), "GsonBuilder().create()"); Gson gson = (new GsonBuilder()).create();
/* 37 */     Intrinsics.checkNotNullExpressionValue(gson.toJson(new Content(oldName, 
/* 38 */             contextPrompt, 
/* 39 */             objectType, 
/* 40 */             objectToRename, 
/* 41 */             prefix)), "gson.toJson(Content(oldN…            prefix)\n    )");
/* 42 */     return StringsKt.replace$default(gson.toJson(new Content(oldName, contextPrompt, objectType, objectToRename, prefix)), "\n", "\\n", false, 4, null);
/*    */   } private final void updateScratchFile(String fileContent, String fileName) {
/*    */     PsiFile psiFile;
/*    */     Document document;
/* 46 */     ScratchFileService fileService = ScratchFileService.getInstance();
/* 47 */     VirtualFile scratchFile = fileService.findFile(RootType.findById("scratches"), 
/* 48 */         fileName + ".jsonl", ScratchFileService.Option.create_if_missing);
/*    */     
/* 50 */     if (PsiManager.getInstance(this.project).findFile(scratchFile) == null) { PsiManager.getInstance(this.project).findFile(scratchFile); return; }
/* 51 */      PsiDocumentManager documentManager = PsiDocumentManager.getInstance(this.project);
/* 52 */     if (documentManager.getDocument(psiFile) == null) { documentManager.getDocument(psiFile); return; }
/* 53 */      appendChars(document, fileContent + "\n");
/* 54 */     documentManager.commitDocument(document);
/*    */   }
/*    */   
/*    */   private final void appendChars(Document $this$appendChars, CharSequence charSequence) {
/* 58 */     $this$appendChars.insertString($this$appendChars.getTextLength(), charSequence); } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\022\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B/\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003\022\b\020\007\032\004\030\0010\003¢\006\002\020\bJ\t\020\017\032\0020\003HÆ\003J\t\020\020\032\0020\003HÆ\003J\t\020\021\032\0020\003HÆ\003J\t\020\022\032\0020\003HÆ\003J\013\020\023\032\004\030\0010\003HÆ\003J=\020\024\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\0032\b\b\002\020\006\032\0020\0032\n\b\002\020\007\032\004\030\0010\003HÆ\001J\023\020\025\032\0020\0262\b\020\027\032\004\030\0010\001HÖ\003J\t\020\030\032\0020\031HÖ\001J\t\020\032\032\0020\003HÖ\001R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\013\020\nR\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\f\020\nR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\r\020\nR\023\020\007\032\004\030\0010\003¢\006\b\n\000\032\004\b\016\020\n¨\006\033"}, d2 = {"Lcom/intellij/ml/llm/core/models/writer/NameSuggestionWriter$Content;", "", "oldName", "", "contextPrompt", "objectType", "objectToRename", "prefix", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContextPrompt", "()Ljava/lang/String;", "getObjectToRename", "getObjectType", "getOldName", "getPrefix", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "intellij.ml.llm"}) private static final class Content { @NotNull private final String oldName; @NotNull private final String contextPrompt; @NotNull
/*    */     private final String objectType; @NotNull
/*    */     private final String objectToRename; @Nullable
/* 61 */     private final String prefix; public Content(@NotNull String oldName, @NotNull String contextPrompt, @NotNull String objectType, @NotNull String objectToRename, @Nullable String prefix) { this.oldName = oldName;
/* 62 */       this.contextPrompt = contextPrompt;
/* 63 */       this.objectType = objectType;
/* 64 */       this.objectToRename = objectToRename;
/* 65 */       this.prefix = prefix; } @NotNull public final String getOldName() { return this.oldName; } @NotNull public final String getContextPrompt() { return this.contextPrompt; } @Nullable public final String getPrefix() { return this.prefix; }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final String getObjectType() {
/*    */       return this.objectType;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String getObjectToRename() {
/*    */       return this.objectToRename;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String component1() {
/*    */       return this.oldName;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String component2() {
/*    */       return this.contextPrompt;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String component3() {
/*    */       return this.objectType;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String component4() {
/*    */       return this.objectToRename;
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final String component5() {
/*    */       return this.prefix;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Content copy(@NotNull String oldName, @NotNull String contextPrompt, @NotNull String objectType, @NotNull String objectToRename, @Nullable String prefix) {
/*    */       Intrinsics.checkNotNullParameter(oldName, "oldName");
/*    */       Intrinsics.checkNotNullParameter(contextPrompt, "contextPrompt");
/*    */       Intrinsics.checkNotNullParameter(objectType, "objectType");
/*    */       Intrinsics.checkNotNullParameter(objectToRename, "objectToRename");
/*    */       return new Content(oldName, contextPrompt, objectType, objectToRename, prefix);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "Content(oldName=" + this.oldName + ", contextPrompt=" + this.contextPrompt + ", objectType=" + this.objectType + ", objectToRename=" + this.objectToRename + ", prefix=" + this.prefix + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       result = this.oldName.hashCode();
/*    */       result = result * 31 + this.contextPrompt.hashCode();
/*    */       result = result * 31 + this.objectType.hashCode();
/*    */       result = result * 31 + this.objectToRename.hashCode();
/*    */       return result * 31 + ((this.prefix == null) ? 0 : this.prefix.hashCode());
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof Content))
/*    */         return false; 
/*    */       Content content = (Content)other;
/*    */       return !Intrinsics.areEqual(this.oldName, content.oldName) ? false : (!Intrinsics.areEqual(this.contextPrompt, content.contextPrompt) ? false : (!Intrinsics.areEqual(this.objectType, content.objectType) ? false : (!Intrinsics.areEqual(this.objectToRename, content.objectToRename) ? false : (!!Intrinsics.areEqual(this.prefix, content.prefix)))));
/*    */     } }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/writer/NameSuggestionWriter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */