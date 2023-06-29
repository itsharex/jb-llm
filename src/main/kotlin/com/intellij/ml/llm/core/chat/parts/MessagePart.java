/*    */ package com.intellij.ml.llm.core.chat.parts;@Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\005\bf\030\0002\0020\001:\001\023J\020\020\016\032\0020\0172\006\020\020\032\0020\007H&J\b\020\021\032\0020\017H\026J\020\020\022\032\0020\0172\006\020\020\032\0020\007H&R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\007X¦\004¢\006\006\032\004\b\b\020\tR\022\020\n\032\0020\013X¦\004¢\006\006\032\004\b\f\020\rø\001\000\002\006\n\004\b!0\001¨\006\024À\006\001"}, d2 = {"Lcom/intellij/ml/llm/core/chat/parts/MessagePart;", "", "component", "Ljavax/swing/JComponent;", "getComponent", "()Ljavax/swing/JComponent;", "textContent", "", "getTextContent", "()Ljava/lang/String;", "type", "Lcom/intellij/ml/llm/core/chat/parts/MessagePart$Type;", "getType", "()Lcom/intellij/ml/llm/core/chat/parts/MessagePart$Type;", "addContent", "", "content", "initialize", "replaceContent", "Type", "intellij.ml.llm"})
/*    */ public interface MessagePart {
/*    */   @NotNull
/*    */   Type getType();
/*    */   
/*    */   @NotNull
/*    */   JComponent getComponent();
/*    */   
/*    */   default void initialize() {}
/*    */   
/*    */   void addContent(@NotNull String paramString);
/*    */   
/*    */   void replaceContent(@NotNull String paramString);
/*    */   
/*    */   @NotNull
/*    */   String getTextContent();
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\004\b\001\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004¨\006\005"}, d2 = {"Lcom/intellij/ml/llm/core/chat/parts/MessagePart$Type;", "", "(Ljava/lang/String;I)V", "CodeEditor", "PlainText", "intellij.ml.llm"})
/*    */   public enum Type {
/* 20 */     CodeEditor, PlainText;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/parts/MessagePart.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */