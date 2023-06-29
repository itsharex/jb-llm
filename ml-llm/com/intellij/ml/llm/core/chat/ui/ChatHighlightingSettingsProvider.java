/*    */ package com.intellij.ml.llm.core.chat.ui;
/*    */ import com.intellij.codeInsight.daemon.impl.analysis.FileHighlightingSetting;
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\000\030\0002\0020\001B\005¢\006\002\020\002J\032\020\003\032\004\030\0010\0042\006\020\005\032\0020\0062\006\020\007\032\0020\bH\026¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/ChatHighlightingSettingsProvider;", "Lcom/intellij/codeInsight/daemon/impl/analysis/DefaultHighlightingSettingProvider;", "()V", "getDefaultSetting", "Lcom/intellij/codeInsight/daemon/impl/analysis/FileHighlightingSetting;", "project", "Lcom/intellij/openapi/project/Project;", "file", "Lcom/intellij/openapi/vfs/VirtualFile;", "intellij.ml.llm"})
/*    */ public final class ChatHighlightingSettingsProvider extends DefaultHighlightingSettingProvider {
/*    */   @Nullable
/*    */   public FileHighlightingSetting getDefaultSetting(@NotNull Project project, @NotNull VirtualFile file) {
/* 10 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(file, "file"); if (AIAssistantUIUtil.INSTANCE.isAIAssistantFile(file)) {
/* 11 */       return FileHighlightingSetting.SKIP_HIGHLIGHTING;
/*    */     }
/* 13 */     return null;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/ChatHighlightingSettingsProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */