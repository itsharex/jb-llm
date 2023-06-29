/*     */ package com.intellij.ml.llm.core.chat.parts;
/*     */ 
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\007\030\0002\0020\001:\001#B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\002\020\bJ\020\020\034\032\0020\0352\006\020\036\032\0020\nH\026J\b\020\037\032\0020\035H\026J\020\020 \032\0020\0352\006\020\036\032\0020\nH\002J\020\020!\032\0020\0352\006\020\036\032\0020\nH\026J\b\020\"\032\0020\025H\002R\021\020\t\032\0020\n8F¢\006\006\032\004\b\013\020\fR\024\020\r\032\0020\0168VX\004¢\006\006\032\004\b\017\020\020R\022\020\021\032\0060\022j\002`\023X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000R\020\020\024\032\004\030\0010\025X\016¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\002\032\0020\003X\004¢\006\002\n\000R\024\020\026\032\0020\n8VX\004¢\006\006\032\004\b\027\020\fR\024\020\030\032\0020\031X\004¢\006\b\n\000\032\004\b\032\020\033¨\006$"}, d2 = {"Lcom/intellij/ml/llm/core/chat/parts/CodePart;", "Lcom/intellij/ml/llm/core/chat/parts/MessagePart;", "project", "Lcom/intellij/openapi/project/Project;", "message", "Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;", "disposable", "Lcom/intellij/openapi/Disposable;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;Lcom/intellij/openapi/Disposable;)V", "codeContent", "", "getCodeContent", "()Ljava/lang/String;", "component", "Ljavax/swing/JComponent;", "getComponent", "()Ljavax/swing/JComponent;", "contentBuilder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "editorInfo", "Lcom/intellij/ml/llm/core/chat/parts/CodePart$EditorInfo;", "textContent", "getTextContent", "type", "Lcom/intellij/ml/llm/core/chat/parts/MessagePart$Type;", "getType", "()Lcom/intellij/ml/llm/core/chat/parts/MessagePart$Type;", "addContent", "", "content", "initialize", "processInputContent", "replaceContent", "updateOrCreateCodeView", "EditorInfo", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nCodePart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CodePart.kt\ncom/intellij/ml/llm/core/chat/parts/CodePart\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,115:1\n79#2,22:116\n*S KotlinDebug\n*F\n+ 1 CodePart.kt\ncom/intellij/ml/llm/core/chat/parts/CodePart\n*L\n82#1:116,22\n*E\n"})
/*     */ public final class CodePart implements MessagePart {
/*     */   @NotNull
/*     */   private final Project project;
/*     */   @NotNull
/*     */   private final CompletableMessage message;
/*     */   @NotNull
/*     */   private final Disposable disposable;
/*     */   
/*  16 */   public CodePart(@NotNull Project project, @NotNull CompletableMessage message, @NotNull Disposable disposable) { this.project = project; this.message = message; this.disposable = disposable;
/*  17 */     this.contentBuilder = new StringBuilder();
/*     */ 
/*     */     
/*  20 */     this.type = MessagePart.Type.CodeEditor; } @NotNull private final StringBuilder contentBuilder; @Nullable private EditorInfo editorInfo; @NotNull private final MessagePart.Type type; @NotNull public MessagePart.Type getType() { return this.type; }
/*     */    @NotNull
/*     */   public JComponent getComponent() {
/*  23 */     if (this.editorInfo == null || this.editorInfo.getComponent() == null) this.editorInfo.getComponent();  return updateOrCreateCodeView().getComponent();
/*     */   }
/*     */   public void addContent(@NotNull String content) {
/*  26 */     Intrinsics.checkNotNullParameter(content, "content"); processInputContent(content);
/*     */   }
/*     */   
/*     */   public void replaceContent(@NotNull String content) {
/*  30 */     Intrinsics.checkNotNullParameter(content, "content"); StringsKt.clear(this.contentBuilder);
/*  31 */     processInputContent(content);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String getTextContent() {
/*  36 */     Intrinsics.checkNotNullExpressionValue(this.contentBuilder.toString(), "contentBuilder.toString()"); return this.contentBuilder.toString();
/*     */   } @NotNull
/*     */   public final String getCodeContent() {
/*  39 */     if (this.editorInfo == null || this.editorInfo.getCode() == null || (String)this.editorInfo.getCode().get() == null) (String)this.editorInfo.getCode().get();  return "";
/*     */   }
/*     */   
/*     */   private final void processInputContent(String content) {
/*  43 */     this.contentBuilder.append(content);
/*  44 */     if (this.editorInfo != null)
/*  45 */       updateOrCreateCodeView(); 
/*     */   }
/*     */   
/*     */   public void initialize() {
/*  49 */     boolean bool = (this.editorInfo == null) ? true : false; if (_Assertions.ENABLED && !bool) { String str = "Assertion failed"; throw new AssertionError(str); }
/*  50 */      updateOrCreateCodeView();
/*     */   }
/*     */ 
/*     */   
/*     */   private final EditorInfo updateOrCreateCodeView() {
/*  55 */     Intrinsics.checkNotNullExpressionValue(this.contentBuilder.toString(), "contentBuilder.toString()"); String[] arrayOfString = new String[1]; arrayOfString[0] = "\n"; List lines = StringsKt.split$default(this.contentBuilder.toString(), arrayOfString, false, 0, 6, null);
/*  56 */     Regex regex = new Regex("```((\\w|#|\\+)*)");
/*  57 */     boolean codeStarted = false;
/*  58 */     boolean codeClosed = false;
/*     */     
/*  60 */     Intrinsics.checkNotNullExpressionValue(Language.ANY.getID(), "ANY.id"); String languageId = Language.ANY.getID();
/*  61 */     StringBuilder codeBuilder = new StringBuilder();
/*     */     
/*  63 */     for (String line : lines) {
/*  64 */       if (!codeStarted) {
/*  65 */         MatchResult matchResult = Regex.find$default(regex, StringsKt.trimStart(line).toString(), 0, 2, null);
/*  66 */         if (matchResult != null && StringsKt.startsWith$default(matchResult.getValue(), "```", false, 2, null)) {
/*  67 */           Intrinsics.checkNotNullExpressionValue(matchResult.getValue().substring(3), "this as java.lang.String).substring(startIndex)"); languageId = matchResult.getValue().substring(3);
/*  68 */           codeStarted = true;
/*     */         } 
/*     */         continue;
/*     */       } 
/*  72 */       if (StringsKt.startsWith$default(line, "```", false, 2, null)) {
/*  73 */         codeClosed = true;
/*     */         
/*     */         break;
/*     */       } 
/*  77 */       codeBuilder.append(line).append("\n");
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  82 */     CharSequence $this$trim$iv = codeBuilder; int $i$f$trim = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 116 */     int startIndex$iv = 0;
/* 117 */     int endIndex$iv = $this$trim$iv.length() - 1;
/* 118 */     boolean startFound$iv = false;
/*     */     
/* 120 */     while (startIndex$iv <= endIndex$iv) {
/* 121 */       int index$iv = !startFound$iv ? startIndex$iv : endIndex$iv;
/* 122 */       char it = $this$trim$iv.charAt(index$iv); int $i$a$-trim-CodePart$updateOrCreateCodeView$trimmedCode$1 = 0;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 137 */     String trimmedCode = $this$trim$iv.subSequence(startIndex$iv, endIndex$iv + 1).toString();
/*     */     Language language = AIAssistantUIUtil.INSTANCE.findLanguage(languageId);
/*     */     if (this.editorInfo == null) {
/*     */       EditorInfo editorInfo = CodeViewerKt.createCodeViewer(this.project, (new PropertyGraph(null, false, 3, null)).property(trimmedCode), this.disposable, language, this.message);
/*     */       this.editorInfo = editorInfo;
/*     */     } else {
/*     */       Intrinsics.checkNotNull(this.editorInfo);
/*     */       if (!Intrinsics.areEqual(this.editorInfo.getLanguage(), language)) {
/*     */         Intrinsics.checkNotNull(this.editorInfo);
/*     */         this.editorInfo.setLanguage(language);
/*     */       } 
/*     */       Intrinsics.checkNotNull(this.editorInfo);
/*     */       this.editorInfo.getCode().set(trimmedCode);
/*     */     } 
/*     */     if (codeClosed) {
/*     */       Intrinsics.checkNotNull(this.editorInfo);
/*     */       CodeSnippetProviderKt.finalizeEditorForChatCodeSnippet(this.project, this.editorInfo.getEditor());
/*     */     } 
/*     */     Intrinsics.checkNotNull(this.editorInfo);
/*     */     return this.editorInfo;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\006\030\0002\0020\001B+\022\f\020\002\032\b\022\004\022\0020\0040\003\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n¢\006\002\020\013R\027\020\002\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\f\020\rR\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\016\020\017R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\020\020\021R\016\020\t\032\0020\nX\004¢\006\002\n\000R$\020\024\032\0020\0232\006\020\022\032\0020\0238F@FX\016¢\006\f\032\004\b\025\020\026\"\004\b\027\020\030¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/core/chat/parts/CodePart$EditorInfo;", "", "code", "Lcom/intellij/openapi/observable/properties/GraphProperty;", "", "component", "Ljavax/swing/JComponent;", "editor", "Lcom/intellij/openapi/editor/Editor;", "file", "Lcom/intellij/testFramework/LightVirtualFile;", "(Lcom/intellij/openapi/observable/properties/GraphProperty;Ljavax/swing/JComponent;Lcom/intellij/openapi/editor/Editor;Lcom/intellij/testFramework/LightVirtualFile;)V", "getCode", "()Lcom/intellij/openapi/observable/properties/GraphProperty;", "getComponent", "()Ljavax/swing/JComponent;", "getEditor", "()Lcom/intellij/openapi/editor/Editor;", "value", "Lcom/intellij/lang/Language;", "language", "getLanguage", "()Lcom/intellij/lang/Language;", "setLanguage", "(Lcom/intellij/lang/Language;)V", "intellij.ml.llm"})
/*     */   public static final class EditorInfo {
/*     */     @NotNull
/*     */     private final GraphProperty<String> code;
/*     */     @NotNull
/*     */     private final JComponent component;
/*     */     @NotNull
/*     */     private final Editor editor;
/*     */     @NotNull
/*     */     private final LightVirtualFile file;
/*     */     
/*     */     public EditorInfo(@NotNull GraphProperty<String> code, @NotNull JComponent component, @NotNull Editor editor, @NotNull LightVirtualFile file) {
/*     */       this.code = code;
/*     */       this.component = component;
/*     */       this.editor = editor;
/*     */       this.file = file;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final GraphProperty<String> getCode() {
/*     */       return this.code;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final JComponent getComponent() {
/*     */       return this.component;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Editor getEditor() {
/*     */       return this.editor;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Language getLanguage() {
/*     */       Intrinsics.checkNotNullExpressionValue(this.file.getLanguage(), "file.language");
/*     */       return this.file.getLanguage();
/*     */     }
/*     */     
/*     */     public final void setLanguage(@NotNull Language value) {
/*     */       Intrinsics.checkNotNullParameter(value, "value");
/*     */       this.file.setLanguage(value);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/parts/CodePart.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */