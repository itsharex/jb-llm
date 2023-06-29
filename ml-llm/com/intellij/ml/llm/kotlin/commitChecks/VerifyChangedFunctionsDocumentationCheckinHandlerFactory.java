/*    */ package com.intellij.ml.llm.kotlin.commitChecks;
/*    */ import com.intellij.openapi.vcs.CheckinProjectPanel;
/*    */ import com.intellij.openapi.vcs.checkin.CheckinHandler;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\005¢\006\002\020\002J\030\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\bH\026¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/kotlin/commitChecks/VerifyChangedFunctionsDocumentationCheckinHandlerFactory;", "Lcom/intellij/openapi/vcs/checkin/CheckinHandlerFactory;", "()V", "createHandler", "Lcom/intellij/openapi/vcs/checkin/CheckinHandler;", "panel", "Lcom/intellij/openapi/vcs/CheckinProjectPanel;", "commitContext", "Lcom/intellij/openapi/vcs/changes/CommitContext;", "intellij.ml.llm.kotlin"})
/*    */ public final class VerifyChangedFunctionsDocumentationCheckinHandlerFactory extends CheckinHandlerFactory {
/*    */   @NotNull
/*    */   public CheckinHandler createHandler(@NotNull CheckinProjectPanel panel, @NotNull CommitContext commitContext) {
/*    */     CheckinHandler checkinHandler;
/* 12 */     Intrinsics.checkNotNullParameter(panel, "panel"); Intrinsics.checkNotNullParameter(commitContext, "commitContext"); if (!Registry.is("llm.is.internal")) {
/* 13 */       Intrinsics.checkNotNullExpressionValue(CheckinHandler.DUMMY, "DUMMY"); return CheckinHandler.DUMMY;
/*    */     } 
/*    */     
/*    */     try {
/* 17 */       Intrinsics.checkNotNullExpressionValue(panel.getProject(), "panel.project"); checkinHandler = new VerifyChangedFunctionsDocumentationCheckinHandler(panel.getProject(), panel);
/*    */     } catch (Throwable ex) {
/* 19 */       Intrinsics.checkNotNullExpressionValue(
/* 20 */           CheckinHandler.DUMMY, "{\n      CheckinHandler.DUMMY\n    }"); checkinHandler = CheckinHandler.DUMMY;
/*    */     } 
/*    */     return checkinHandler;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/commitChecks/VerifyChangedFunctionsDocumentationCheckinHandlerFactory.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */