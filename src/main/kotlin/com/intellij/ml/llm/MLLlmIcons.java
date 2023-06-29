/*    */ package com.intellij.ml.llm;
/*    */ 
/*    */ import com.intellij.ui.IconManager;
/*    */ import javax.swing.Icon;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class MLLlmIcons
/*    */ {
/*    */   @NotNull
/*    */   private static Icon load(@NotNull String path, int cacheKey, int flags) {
/* 14 */     if (path == null) $$$reportNull$$$0(0);  if (IconManager.getInstance().loadRasterizedIcon(path, MLLlmIcons.class.getClassLoader(), cacheKey, flags) == null) $$$reportNull$$$0(1);  return IconManager.getInstance().loadRasterizedIcon(path, MLLlmIcons.class.getClassLoader(), cacheKey, flags);
/*    */   } @NotNull
/* 16 */   public static final Icon AiAssistant = load("icons/aiAssistant.svg", 1679025136, 2); @NotNull
/* 17 */   public static final Icon AiAssistantToolWindow = load("icons/aiAssistantToolWindow.svg", 1444484604, 2); @NotNull
/* 18 */   public static final Icon Attached = load("icons/Attached.svg", -538633203, 2);
/*    */   
/*    */   public static final class Chat { @NotNull
/* 21 */     public static final Icon Send = MLLlmIcons.load("icons/chat/send.svg", 955453744, 2); }
/*    */   
/*    */   @NotNull
/* 24 */   public static final Icon Dislike = load("icons/Dislike.svg", 555650780, 2); @NotNull
/* 25 */   public static final Icon DislikeSelected = load("icons/dislikeSelected.svg", 1483252812, 2); @NotNull
/* 26 */   public static final Icon Like = load("icons/Like.svg", 512641198, 2); @NotNull
/* 27 */   public static final Icon LikeSelected = load("icons/likeSelected.svg", 1645362503, 2);
/*    */   
/*    */   public static final class Login { @NotNull
/* 30 */     public static final Icon AnswerQ = MLLlmIcons.load("icons/login/answerQ.svg", 255458636, 2); @NotNull
/* 31 */     public static final Icon Commit = MLLlmIcons.load("icons/login/commit.svg", -1749770830, 2); @NotNull
/* 32 */     public static final Icon ExplainCode = MLLlmIcons.load("icons/login/explainCode.svg", -340056052, 2); @NotNull
/* 33 */     public static final Icon ListFiles = MLLlmIcons.load("icons/login/listFiles.svg", -1858269182, 2); }
/*    */   
/*    */   @NotNull
/* 36 */   public static final Icon MessageTail = load("icons/messageTail.svg", -498714424, 0); @NotNull
/* 37 */   public static final Icon Openai = load("icons/openai.svg", -2703060, 0); @NotNull
/* 38 */   public static final Icon SendToEditor = load("icons/sendToEditor.svg", -1995946227, 2);
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/MLLlmIcons.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */