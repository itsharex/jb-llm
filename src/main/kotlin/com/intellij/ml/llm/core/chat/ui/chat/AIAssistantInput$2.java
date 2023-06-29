/*     */ package com.intellij.ml.llm.core.chat.ui.chat;
/*     */ 
/*     */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.editor.EditorModificationUtil;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\016\020\002\032\n \004*\004\030\0010\0030\003H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "kotlin.jvm.PlatformType", "invoke"})
/*     */ final class null
/*     */   extends Lambda
/*     */   implements Function1<AnActionEvent, Unit>
/*     */ {
/*     */   public final void invoke(AnActionEvent it) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield this$0 : Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInput;
/*     */     //   4: invokevirtual getEditor : ()Lcom/intellij/openapi/editor/Editor;
/*     */     //   7: dup
/*     */     //   8: ifnull -> 51
/*     */     //   11: astore_2
/*     */     //   12: aload_0
/*     */     //   13: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   16: astore_3
/*     */     //   17: aload_0
/*     */     //   18: getfield this$0 : Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInput;
/*     */     //   21: astore #4
/*     */     //   23: aload_2
/*     */     //   24: astore #5
/*     */     //   26: iconst_0
/*     */     //   27: istore #6
/*     */     //   29: invokestatic getInstance : ()Lcom/intellij/openapi/command/CommandProcessor;
/*     */     //   32: aload_3
/*     */     //   33: aload #5
/*     */     //   35: aload #4
/*     */     //   37: <illegal opcode> run : (Lcom/intellij/openapi/editor/Editor;Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInput;)Ljava/lang/Runnable;
/*     */     //   42: aconst_null
/*     */     //   43: aconst_null
/*     */     //   44: invokevirtual executeCommand : (Lcom/intellij/openapi/project/Project;Ljava/lang/Runnable;Ljava/lang/String;Ljava/lang/Object;)V
/*     */     //   47: nop
/*     */     //   48: goto -> 53
/*     */     //   51: pop
/*     */     //   52: nop
/*     */     //   53: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #201	-> 0
/*     */     //   #202	-> 29
/*     */     //   #210	-> 42
/*     */     //   #202	-> 44
/*     */     //   #211	-> 47
/*     */     //   #201	-> 48
/*     */     //   #201	-> 51
/*     */     //   #212	-> 53
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   29	19	6	$i$a$-let-AIAssistantInput$2$1	I
/*     */     //   26	22	5	it	Lcom/intellij/openapi/editor/Editor;
/*     */     //   0	54	0	this	Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInput$2;
/*     */     //   0	54	1	it	Lcom/intellij/openapi/actionSystem/AnActionEvent;
/*     */   }
/*     */   
/*     */   private static final void invoke$lambda$2$lambda$1(Editor $it, AIAssistantInput this$0) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '$it'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'this$0'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*     */     //   15: aload_0
/*     */     //   16: aload_1
/*     */     //   17: <illegal opcode> run : (Lcom/intellij/openapi/editor/Editor;Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInput;)Ljava/lang/Runnable;
/*     */     //   22: invokeinterface runWriteAction : (Ljava/lang/Runnable;)V
/*     */     //   27: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #203	-> 12
/*     */     //   #210	-> 27
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	28	0	$it	Lcom/intellij/openapi/editor/Editor;
/*     */     //   0	28	1	this$0	Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInput;
/*     */   }
/*     */   
/*     */   private static final void invoke$lambda$2$lambda$1$lambda$0(Editor $it, AIAssistantInput this$0) {
/* 204 */     Intrinsics.checkNotNullParameter($it, "$it"); Intrinsics.checkNotNullParameter(AIAssistantInput.this, "this$0"); String eol = "\n";
/* 205 */     int caretOffset = $it.getCaretModel().getOffset();
/* 206 */     AIAssistantInput.this.getDocument().insertString(caretOffset, eol);
/* 207 */     $it.getCaretModel().moveToOffset(caretOffset + eol.length());
/* 208 */     EditorModificationUtil.scrollToCaret($it);
/*     */   }
/*     */   
/*     */   null(Project $project) {
/*     */     super(1);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/chat/AIAssistantInput$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */