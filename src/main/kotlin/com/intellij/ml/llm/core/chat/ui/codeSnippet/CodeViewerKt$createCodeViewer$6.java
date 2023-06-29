/*     */ package com.intellij.ml.llm.core.chat.ui.codeSnippet;
/*     */ 
/*     */ import com.intellij.openapi.editor.Document;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.util.SingleAlarm;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\020\016\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "newDocText", "", "invoke"})
/*     */ final class CodeViewerKt$createCodeViewer$6
/*     */   extends Lambda
/*     */   implements Function1<String, Unit>
/*     */ {
/*     */   public final void invoke(@NotNull String newDocText) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'newDocText'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: getfield $document : Lcom/intellij/openapi/editor/Document;
/*     */     //   10: invokeinterface getText : ()Ljava/lang/String;
/*     */     //   15: dup
/*     */     //   16: ldc 'document.text'
/*     */     //   18: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   21: astore_2
/*     */     //   22: aload_1
/*     */     //   23: aload_2
/*     */     //   24: iconst_0
/*     */     //   25: iconst_2
/*     */     //   26: aconst_null
/*     */     //   27: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
/*     */     //   30: ifeq -> 67
/*     */     //   33: aload_1
/*     */     //   34: aload_2
/*     */     //   35: aconst_null
/*     */     //   36: iconst_2
/*     */     //   37: aconst_null
/*     */     //   38: invokestatic substringAfter$default : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   41: astore_3
/*     */     //   42: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*     */     //   45: aload_0
/*     */     //   46: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   49: aload_0
/*     */     //   50: getfield $document : Lcom/intellij/openapi/editor/Document;
/*     */     //   53: aload_3
/*     */     //   54: <illegal opcode> run : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Document;Ljava/lang/String;)Ljava/lang/Runnable;
/*     */     //   59: invokeinterface runWriteAction : (Ljava/lang/Runnable;)V
/*     */     //   64: goto -> 85
/*     */     //   67: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*     */     //   70: aload_0
/*     */     //   71: getfield $document : Lcom/intellij/openapi/editor/Document;
/*     */     //   74: aload_1
/*     */     //   75: <illegal opcode> run : (Lcom/intellij/openapi/editor/Document;Ljava/lang/String;)Ljava/lang/Runnable;
/*     */     //   80: invokeinterface runWriteAction : (Ljava/lang/Runnable;)V
/*     */     //   85: aload_0
/*     */     //   86: getfield $updateAlarm : Lcom/intellij/util/SingleAlarm;
/*     */     //   89: iconst_0
/*     */     //   90: iconst_1
/*     */     //   91: aconst_null
/*     */     //   92: invokestatic cancelAndRequest$default : (Lcom/intellij/util/SingleAlarm;ZILjava/lang/Object;)V
/*     */     //   95: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #157	-> 6
/*     */     //   #158	-> 22
/*     */     //   #159	-> 33
/*     */     //   #160	-> 42
/*     */     //   #171	-> 67
/*     */     //   #177	-> 85
/*     */     //   #178	-> 95
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   42	22	3	newPart	Ljava/lang/String;
/*     */     //   22	74	2	oldDocText	Ljava/lang/String;
/*     */     //   0	96	0	this	Lcom/intellij/ml/llm/core/chat/ui/codeSnippet/CodeViewerKt$createCodeViewer$6;
/*     */     //   0	96	1	newDocText	Ljava/lang/String;
/*     */   }
/*     */   
/*     */   private static final void invoke$lambda$1(Project $project, Document $document, String $newPart) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '$project'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc '$document'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_2
/*     */     //   13: ldc '$newPart'
/*     */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   18: aload_0
/*     */     //   19: invokestatic writeCommandAction : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/command/WriteCommandAction$Builder;
/*     */     //   22: aload_1
/*     */     //   23: aload_2
/*     */     //   24: <illegal opcode> run : (Lcom/intellij/openapi/editor/Document;Ljava/lang/String;)Lcom/intellij/util/ThrowableRunnable;
/*     */     //   29: invokeinterface run : (Lcom/intellij/util/ThrowableRunnable;)V
/*     */     //   34: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #161	-> 18
/*     */     //   #162	-> 22
/*     */     //   #167	-> 34
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	35	0	$project	Lcom/intellij/openapi/project/Project;
/*     */     //   0	35	1	$document	Lcom/intellij/openapi/editor/Document;
/*     */     //   0	35	2	$newPart	Ljava/lang/String;
/*     */   }
/*     */   
/*     */   private static final void invoke$lambda$1$lambda$0(Document $document, String $newPart) {
/* 163 */     Intrinsics.checkNotNullParameter($document, "$document"); Intrinsics.checkNotNullParameter($newPart, "$newPart"); $document.setReadOnly(false);
/* 164 */     $document.insertString($document.getTextLength(), $newPart);
/* 165 */     $document.setReadOnly(true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final void invoke$lambda$2(Document $document, String $newDocText) {
/* 172 */     Intrinsics.checkNotNullParameter($document, "$document"); Intrinsics.checkNotNullParameter($newDocText, "$newDocText"); $document.setReadOnly(false);
/* 173 */     $document.setText($newDocText);
/* 174 */     $document.setReadOnly(true);
/*     */   }
/*     */   
/*     */   CodeViewerKt$createCodeViewer$6(Document $document, SingleAlarm $updateAlarm, Project $project) {
/*     */     super(1);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/codeSnippet/CodeViewerKt$createCodeViewer$6.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */