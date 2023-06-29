/*    */ package com.intellij.ml.llm.cicd.gen.files;
/*    */ 
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.project.ProjectUtil;
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import java.nio.file.Path;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\b&\030\0002\0020\001:\001\027B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\030\020\r\032\0020\0162\006\020\017\032\0020\0202\006\020\021\032\0020\022H&J\030\020\023\032\0020\0162\006\020\024\032\0020\0252\006\020\026\032\0020\nH\004R\016\020\005\032\0020\006XD¢\006\002\n\000R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\n8DX\004¢\006\006\032\004\b\013\020\f¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/cicd/gen/files/CiConfigFileGenerator;", "", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;)V", "RETRIES_COUNT", "", "getProject", "()Lcom/intellij/openapi/project/Project;", "rootDir", "Lcom/intellij/openapi/vfs/VirtualFile;", "getRootDir", "()Lcom/intellij/openapi/vfs/VirtualFile;", "createAndOpenInEditor", "", "ciTool", "", "document", "Lcom/intellij/openapi/editor/Document;", "refreshAndOpenInEditor", "file", "Ljava/nio/file/Path;", "parentDir", "SaveError", "intellij.ml.llm"})
/*    */ public abstract class CiConfigFileGenerator {
/*    */   @NotNull
/*    */   private final Project project;
/*    */   
/* 17 */   public CiConfigFileGenerator(@NotNull Project project) { this.project = project;
/* 18 */     this.RETRIES_COUNT = 5; }
/*    */   private final int RETRIES_COUNT; @NotNull
/*    */   public final Project getProject() { return this.project; } @NotNull
/*    */   protected final VirtualFile getRootDir() {
/* 22 */     if (ProjectUtil.guessProjectDir(this.project) == null) { ProjectUtil.guessProjectDir(this.project); throw new SaveError("Project not found."); }  return ProjectUtil.guessProjectDir(this.project);
/*    */   }
/*    */   
/* 25 */   protected final void refreshAndOpenInEditor(@NotNull Path file, @NotNull VirtualFile parentDir) { Intrinsics.checkNotNullParameter(file, "file"); Intrinsics.checkNotNullParameter(parentDir, "parentDir");
/* 26 */     Project project = this.project; ProgressManager.getInstance().run((Task)new CiConfigFileGenerator$refreshAndOpenInEditor$1(file, parentDir, project)); } public abstract void createAndOpenInEditor(@NotNull String paramString, @NotNull Document paramDocument); @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\031\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026J\020\020\004\032\0020\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"com/intellij/ml/llm/cicd/gen/files/CiConfigFileGenerator$refreshAndOpenInEditor$1", "Lcom/intellij/openapi/progress/Task$Modal;", "onSuccess", "", "run", "indicator", "Lcom/intellij/openapi/progress/ProgressIndicator;", "intellij.ml.llm"}) public static final class CiConfigFileGenerator$refreshAndOpenInEditor$1 extends Task.Modal { CiConfigFileGenerator$refreshAndOpenInEditor$1(Path $file, VirtualFile $parentDir, Project $super_call_param$1) { super($super_call_param$1, "Refreshing Project Model", true); }
/*    */     
/* 28 */     public void run(@NotNull ProgressIndicator indicator) { Intrinsics.checkNotNullParameter(indicator, "indicator"); ActionsKt.invokeLater$default(null, new CiConfigFileGenerator$refreshAndOpenInEditor$1$run$1(this.$file, this.$parentDir), 1, null); } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/* 29 */     static final class CiConfigFileGenerator$refreshAndOpenInEditor$1$run$1 extends Lambda implements Function0<Unit> { public final void invoke() { ActionsKt.runWriteAction(new Function0<Unit>(this.$file, this.$parentDir) { public final void invoke() {
/*    */                 // Byte code:
/*    */                 //   0: aload_0
/*    */                 //   1: getfield this$0 : Lcom/intellij/ml/llm/cicd/gen/files/CiConfigFileGenerator;
/*    */                 //   4: invokestatic access$getRETRIES_COUNT$p : (Lcom/intellij/ml/llm/cicd/gen/files/CiConfigFileGenerator;)I
/*    */                 //   7: istore_1
/*    */                 //   8: aload_0
/*    */                 //   9: getfield $file : Ljava/nio/file/Path;
/*    */                 //   12: astore_2
/*    */                 //   13: aload_0
/*    */                 //   14: getfield $parentDir : Lcom/intellij/openapi/vfs/VirtualFile;
/*    */                 //   17: astore_3
/*    */                 //   18: iconst_0
/*    */                 //   19: istore #4
/*    */                 //   21: iload #4
/*    */                 //   23: iload_1
/*    */                 //   24: if_icmpge -> 78
/*    */                 //   27: iload #4
/*    */                 //   29: istore #5
/*    */                 //   31: iconst_0
/*    */                 //   32: istore #6
/*    */                 //   34: invokestatic getInstance : ()Lcom/intellij/openapi/vfs/LocalFileSystem;
/*    */                 //   37: aload_2
/*    */                 //   38: invokevirtual findFileByNioFile : (Ljava/nio/file/Path;)Lcom/intellij/openapi/vfs/VirtualFile;
/*    */                 //   41: astore #7
/*    */                 //   43: aload #7
/*    */                 //   45: ifnonnull -> 70
/*    */                 //   48: iconst_0
/*    */                 //   49: iconst_0
/*    */                 //   50: iconst_1
/*    */                 //   51: iconst_1
/*    */                 //   52: anewarray com/intellij/openapi/vfs/VirtualFile
/*    */                 //   55: astore #8
/*    */                 //   57: aload #8
/*    */                 //   59: iconst_0
/*    */                 //   60: aload_3
/*    */                 //   61: aastore
/*    */                 //   62: aload #8
/*    */                 //   64: invokestatic markDirtyAndRefresh : (ZZZ[Lcom/intellij/openapi/vfs/VirtualFile;)V
/*    */                 //   67: goto -> 71
/*    */                 //   70: nop
/*    */                 //   71: nop
/*    */                 //   72: iinc #4, 1
/*    */                 //   75: goto -> 21
/*    */                 //   78: return
/*    */                 // Line number table:
/*    */                 //   Java source line number -> byte code offset
/*    */                 //   #30	-> 0
/*    */                 //   #31	-> 34
/*    */                 //   #32	-> 48
/*    */                 //   #31	-> 70
/*    */                 //   #33	-> 71
/*    */                 //   #30	-> 72
/*    */                 //   #34	-> 78
/*    */                 // Local variable table:
/*    */                 //   start	length	slot	name	descriptor
/*    */                 //   34	38	6	$i$a$-repeat-CiConfigFileGenerator$refreshAndOpenInEditor$1$run$1$1$1	I
/*    */                 //   31	41	5	it	I
/*    */                 //   0	79	0	this	Lcom/intellij/ml/llm/cicd/gen/files/CiConfigFileGenerator$refreshAndOpenInEditor$1$run$1$1;
/*    */               } }
/*    */           ); }
/*    */       
/*    */       CiConfigFileGenerator$refreshAndOpenInEditor$1$run$1(Path $file, VirtualFile $parentDir) {
/*    */         super(0);
/*    */       } }
/*    */     public void onSuccess() {
/*    */       VirtualFile virtualFile;
/* 39 */       if (LocalFileSystem.getInstance().findFileByNioFile(this.$file) == null) { LocalFileSystem.getInstance().findFileByNioFile(this.$file);
/* 40 */         throw new CiConfigFileGenerator.SaveError("Virtual file not found."); }
/* 41 */        FileEditorManager.getInstance(getProject()).openFile(virtualFile, true);
/*    */     } }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\030\0002\0060\001j\002`\002B\r\022\006\020\003\032\0020\004¢\006\002\020\005¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/cicd/gen/files/CiConfigFileGenerator$SaveError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "reason", "", "(Ljava/lang/String;)V", "intellij.ml.llm"})
/*    */   public static final class SaveError extends Exception { public SaveError(@NotNull String reason) {
/* 46 */       super(reason);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/cicd/gen/files/CiConfigFileGenerator.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */