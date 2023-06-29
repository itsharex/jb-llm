/*    */ package com.intellij.ml.llm.core.chat.services.paste;
/*    */ 
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.fileEditor.FileDocumentManager;
/*    */ import com.intellij.openapi.util.Key;
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import com.intellij.testFramework.LightVirtualFile;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.text.StringsKt;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\036\n\000\n\002\030\002\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\032\020\020\005\032\0020\0062\006\020\007\032\0020\bH\002\"!\020\000\032\025\022\f\022\n \003*\004\030\0010\0020\0020\001¢\006\002\b\004X\004¢\006\002\n\000¨\006\t"}, d2 = {"TICKS_LEN_KEY", "Lcom/intellij/openapi/util/Key;", "", "kotlin.jvm.PlatformType", "Lorg/jetbrains/annotations/NotNull;", "isAIAssistInput", "", "editor", "Lcom/intellij/openapi/editor/Editor;", "intellij.ml.llm"})
/*    */ public final class CodeSnippetCopyPastePostProcessorKt
/*    */ {
/*    */   @NotNull
/* 25 */   private static final Key<Integer> TICKS_LEN_KEY = Key.create("TICKS_LEN"); static { Intrinsics.checkNotNullExpressionValue(Key.create("TICKS_LEN"), "create<Int>(\"TICKS_LEN\")"); }
/*    */   
/*    */   private static final boolean isAIAssistInput(Editor editor) {
/* 28 */     VirtualFile file = FileDocumentManager.getInstance().getFile(editor.getDocument());
/* 29 */     Intrinsics.checkNotNullExpressionValue(((LightVirtualFile)file).getName(), "file.name"); return (file instanceof LightVirtualFile && StringsKt.startsWith$default(((LightVirtualFile)file).getName(), "AIAssistantInput-", false, 2, null));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/services/paste/CodeSnippetCopyPastePostProcessorKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */