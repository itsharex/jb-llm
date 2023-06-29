/*    */ package com.intellij.ml.llm.cicd.gen.prompts;
/*    */ 
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/openapi/vfs/VirtualFile;", "invoke", "(Lcom/intellij/openapi/vfs/VirtualFile;)Ljava/lang/Boolean;"})
/*    */ final class ProjectStructureContextBuilder$buildFileContext$1$1
/*    */   extends Lambda
/*    */   implements Function1<VirtualFile, Boolean>
/*    */ {
/*    */   @NotNull
/*    */   public final Boolean invoke(@NotNull VirtualFile it) {
/* 20 */     Intrinsics.checkNotNullParameter(it, "it"); Intrinsics.checkNotNullExpressionValue(it.getName(), "it.name"); return Boolean.valueOf(StringsKt.contains$default(it.getName(), this.$fileName, false, 2, null));
/*    */   }
/*    */   
/*    */   ProjectStructureContextBuilder$buildFileContext$1$1(String $fileName) {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/cicd/gen/prompts/ProjectStructureContextBuilder$buildFileContext$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */