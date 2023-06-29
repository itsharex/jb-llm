/*    */ package com.intellij.ml.llm.core.chat.ui.chat;
/*    */ 
/*    */ import com.intellij.openapi.editor.ex.EditorEx;
/*    */ import java.util.EventListener;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\bf\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\030\020\006\032\0020\0032\006\020\007\032\0020\b2\006\020\t\032\0020\nH\026ø\001\000\002\006\n\004\b!0\001¨\006\013À\006\001"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputListener;", "Ljava/util/EventListener;", "editorAdded", "", "editor", "Lcom/intellij/openapi/editor/ex/EditorEx;", "onSubmit", "component", "Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputWithButton;", "trigger", "Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputTrigger;", "intellij.ml.llm"})
/*    */ public interface AIAssistantInputListener
/*    */   extends EventListener
/*    */ {
/*    */   default void editorAdded(@NotNull EditorEx editor) {
/* 63 */     Intrinsics.checkNotNullParameter(editor, "editor"); } default void onSubmit(@NotNull AIAssistantInputWithButton component, @NotNull AIAssistantInputTrigger trigger) {
/* 64 */     Intrinsics.checkNotNullParameter(component, "component"); Intrinsics.checkNotNullParameter(trigger, "trigger");
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */