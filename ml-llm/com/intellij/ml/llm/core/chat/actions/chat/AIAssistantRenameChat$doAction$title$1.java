/*    */ package com.intellij.ml.llm.core.chat.actions.chat;
/*    */ 
/*    */ import com.intellij.openapi.ui.InputValidator;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\031\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\016\n\002\b\002*\001\000\b\n\030\0002\0020\001J\022\020\002\032\0020\0032\b\020\004\032\004\030\0010\005H\026J\022\020\006\032\0020\0032\b\020\004\032\004\030\0010\005H\026¨\006\007"}, d2 = {"com/intellij/ml/llm/core/chat/actions/chat/AIAssistantRenameChat$doAction$title$1", "Lcom/intellij/openapi/ui/InputValidator;", "canClose", "", "inputString", "", "checkInput", "intellij.ml.llm"})
/*    */ public final class AIAssistantRenameChat$doAction$title$1
/*    */   implements InputValidator
/*    */ {
/*    */   public boolean checkInput(@Nullable String inputString) {
/* 17 */     return (inputString != null) ? ((((((CharSequence)inputString).length() > 0) ? true : false) == true)) : false;
/*    */   }
/*    */   public boolean canClose(@Nullable String inputString) {
/* 20 */     return checkInput(inputString);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/actions/chat/AIAssistantRenameChat$doAction$title$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */