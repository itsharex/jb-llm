/*    */ package com.intellij.ml.llm.core.chat.services.paste;
/*    */ 
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\030\000 \t2\0020\001:\001\tB\r\022\006\020\002\032\0020\003¢\006\002\020\004J\b\020\007\032\0020\bH\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/core/chat/services/paste/AIAssistantPasteData;", "Lcom/intellij/codeInsight/editorActions/TextBlockTransferableData;", "language", "Lcom/intellij/lang/Language;", "(Lcom/intellij/lang/Language;)V", "getLanguage", "()Lcom/intellij/lang/Language;", "getFlavor", "Ljava/awt/datatransfer/DataFlavor;", "Companion", "intellij.ml.llm"})
/*    */ public final class AIAssistantPasteData implements TextBlockTransferableData {
/*  7 */   public AIAssistantPasteData(@NotNull Language language) { this.language = language; } @NotNull public final Language getLanguage() { return this.language; } @NotNull
/*  8 */   public DataFlavor getFlavor() { return DATA_FLAVOR; } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/core/chat/services/paste/AIAssistantPasteData$Companion;", "", "()V", "DATA_FLAVOR", "Ljava/awt/datatransfer/DataFlavor;", "getDATA_FLAVOR", "()Ljava/awt/datatransfer/DataFlavor;", "intellij.ml.llm"})
/*    */   public static final class Companion {
/*    */     @NotNull
/* 11 */     public final DataFlavor getDATA_FLAVOR() { return AIAssistantPasteData.DATA_FLAVOR; } private Companion() {} } @NotNull public static final Companion Companion = new Companion(null); @NotNull private final Language language; @NotNull private static final DataFlavor DATA_FLAVOR = new DataFlavor(CodeSnippetCopyPastePostProcessor.class, "class: ConvertJavaCopyPasteProcessor");
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/services/paste/AIAssistantPasteData.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */