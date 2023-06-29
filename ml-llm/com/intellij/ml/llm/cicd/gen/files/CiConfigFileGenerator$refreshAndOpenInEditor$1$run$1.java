/*    */ package com.intellij.ml.llm.cicd.gen.files;
/*    */ 
/*    */ import com.intellij.openapi.application.ActionsKt;
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import java.nio.file.Path;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */ final class CiConfigFileGenerator$refreshAndOpenInEditor$1$run$1
/*    */   extends Lambda
/*    */   implements Function0<Unit>
/*    */ {
/*    */   public final void invoke() {
/* 29 */     ActionsKt.runWriteAction(new Function0<Unit>(this.$file, this.$parentDir) {
/*    */           public final void invoke() {
/*    */             // Byte code:
/*    */             //   0: aload_0
/*    */             //   1: getfield this$0 : Lcom/intellij/ml/llm/cicd/gen/files/CiConfigFileGenerator;
/*    */             //   4: invokestatic access$getRETRIES_COUNT$p : (Lcom/intellij/ml/llm/cicd/gen/files/CiConfigFileGenerator;)I
/*    */             //   7: istore_1
/*    */             //   8: aload_0
/*    */             //   9: getfield $file : Ljava/nio/file/Path;
/*    */             //   12: astore_2
/*    */             //   13: aload_0
/*    */             //   14: getfield $parentDir : Lcom/intellij/openapi/vfs/VirtualFile;
/*    */             //   17: astore_3
/*    */             //   18: iconst_0
/*    */             //   19: istore #4
/*    */             //   21: iload #4
/*    */             //   23: iload_1
/*    */             //   24: if_icmpge -> 78
/*    */             //   27: iload #4
/*    */             //   29: istore #5
/*    */             //   31: iconst_0
/*    */             //   32: istore #6
/*    */             //   34: invokestatic getInstance : ()Lcom/intellij/openapi/vfs/LocalFileSystem;
/*    */             //   37: aload_2
/*    */             //   38: invokevirtual findFileByNioFile : (Ljava/nio/file/Path;)Lcom/intellij/openapi/vfs/VirtualFile;
/*    */             //   41: astore #7
/*    */             //   43: aload #7
/*    */             //   45: ifnonnull -> 70
/*    */             //   48: iconst_0
/*    */             //   49: iconst_0
/*    */             //   50: iconst_1
/*    */             //   51: iconst_1
/*    */             //   52: anewarray com/intellij/openapi/vfs/VirtualFile
/*    */             //   55: astore #8
/*    */             //   57: aload #8
/*    */             //   59: iconst_0
/*    */             //   60: aload_3
/*    */             //   61: aastore
/*    */             //   62: aload #8
/*    */             //   64: invokestatic markDirtyAndRefresh : (ZZZ[Lcom/intellij/openapi/vfs/VirtualFile;)V
/*    */             //   67: goto -> 71
/*    */             //   70: nop
/*    */             //   71: nop
/*    */             //   72: iinc #4, 1
/*    */             //   75: goto -> 21
/*    */             //   78: return
/*    */             // Line number table:
/*    */             //   Java source line number -> byte code offset
/*    */             //   #30	-> 0
/*    */             //   #31	-> 34
/*    */             //   #32	-> 48
/*    */             //   #31	-> 70
/*    */             //   #33	-> 71
/*    */             //   #30	-> 72
/*    */             //   #34	-> 78
/*    */             // Local variable table:
/*    */             //   start	length	slot	name	descriptor
/*    */             //   34	38	6	$i$a$-repeat-CiConfigFileGenerator$refreshAndOpenInEditor$1$run$1$1$1	I
/*    */             //   31	41	5	it	I
/*    */             //   0	79	0	this	Lcom/intellij/ml/llm/cicd/gen/files/CiConfigFileGenerator$refreshAndOpenInEditor$1$run$1$1;
/*    */           }
/*    */         });
/*    */   }
/*    */   
/*    */   CiConfigFileGenerator$refreshAndOpenInEditor$1$run$1(Path $file, VirtualFile $parentDir) {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/cicd/gen/files/CiConfigFileGenerator$refreshAndOpenInEditor$1$run$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */