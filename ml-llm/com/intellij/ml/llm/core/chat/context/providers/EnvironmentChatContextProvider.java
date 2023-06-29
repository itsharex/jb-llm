/*    */ package com.intellij.ml.llm.core.chat.context.providers;
/*    */ import com.intellij.ml.llm.core.chat.context.ChatContextItem;
/*    */ import com.intellij.ml.llm.core.chat.session.ChatCreationContext;
/*    */ import com.intellij.openapi.application.ApplicationNamesInfo;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.util.SystemInfo;
/*    */ import com.intellij.openapi.util.text.StringUtil;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000\b\000\030\0002\0020\001B\005¢\006\002\020\002J\b\020\003\032\0020\004H\002J'\020\005\032\b\022\004\022\0020\0070\0062\006\020\b\032\0020\t2\006\020\n\032\0020\013H@ø\001\000¢\006\002\020\fJ\030\020\r\032\0020\0162\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026\002\004\n\002\b\031¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/core/chat/context/providers/EnvironmentChatContextProvider;", "Lcom/intellij/ml/llm/core/chat/context/DumbAwareChatContextProvider;", "()V", "calcOS", "", "collect", "", "Lcom/intellij/ml/llm/core/chat/context/ChatContextItem;", "project", "Lcom/intellij/openapi/project/Project;", "creationContext", "Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/chat/session/ChatCreationContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isApplicable", "", "intellij.ml.llm"})
/*    */ public final class EnvironmentChatContextProvider implements DumbAwareChatContextProvider {
/*    */   public boolean isApplicable(@NotNull Project project, @NotNull ChatCreationContext creationContext) {
/* 15 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(creationContext, "creationContext"); return true;
/*    */   } @Nullable
/*    */   public Object collect(@NotNull Project project, @NotNull ChatCreationContext creationContext, @NotNull Continuation $completion) {
/* 18 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$collect_u24lambda_u240 = stringBuilder1; int $i$a$-buildString-EnvironmentChatContextProvider$collect$appName$1 = 0;
/* 19 */     $this$collect_u24lambda_u240.append(ApplicationInfoEx.getInstanceEx().getFullApplicationName());
/* 20 */     String edition = ApplicationNamesInfo.getInstance().getEditionName();
/* 21 */     if (StringUtil.isNotEmpty(edition)) {
/* 22 */       $this$collect_u24lambda_u240.append(", " + edition);
/*    */     }
/*    */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()");
/*    */     String appName = stringBuilder1.toString();
/* 26 */     String osName = calcOS();
/* 27 */     String osArch = SystemInfo.OS_ARCH;
/* 28 */     StringBuilder stringBuilder2 = new StringBuilder(), $this$collect_u24lambda_u241 = stringBuilder2; int $i$a$-buildString-EnvironmentChatContextProvider$collect$desktop$1 = 0;
/* 29 */     if (StringUtil.isNotEmpty(System.getenv("XDG_CURRENT_DESKTOP"))) {
/* 30 */       $this$collect_u24lambda_u241.append(", desktop environment " + System.getenv("XDG_CURRENT_DESKTOP"));
/*    */     }
/*    */     
/*    */     Intrinsics.checkNotNullExpressionValue(stringBuilder2.toString(), "StringBuilder().apply(builderAction).toString()");
/*    */     String desktop = stringBuilder2.toString();
/* 35 */     ChatContextItem[] arrayOfChatContextItem = new ChatContextItem[2]; arrayOfChatContextItem[0] = new ChatContextItem(Reflection.getOrCreateKotlinClass(EnvironmentChatContextProvider.class), "You are using " + appName + " on " + osName + " (" + osArch + ")" + desktop); arrayOfChatContextItem[1] = 
/* 36 */       new ChatContextItem(Reflection.getOrCreateKotlinClass(EnvironmentChatContextProvider.class), "When asked for comparison, you MUST prefer " + appName);
/*    */     return CollectionsKt.listOf((Object[])arrayOfChatContextItem);
/*    */   }
/*    */   
/*    */   private final String calcOS() {
/* 41 */     return 
/* 42 */       SystemInfo.isMacOSVentura ? "macOS Ventura" : (
/* 43 */       SystemInfo.isMacOSMonterey ? "macOS Monterey" : (
/* 44 */       SystemInfo.isMacOSBigSur ? "macOS Big Sur" : (
/* 45 */       SystemInfo.isMacOSCatalina ? "macOS Catalina" : (
/* 46 */       SystemInfo.isWin11OrNewer ? "Windows 11" : (
/* 47 */       SystemInfo.isWin10OrNewer ? "Windows 10" : (
/* 48 */       SystemInfo.isWin8OrNewer ? "Windows 8" : (
/* 49 */       SystemInfo.isLinux ? "Linux" : (
/* 50 */       SystemInfo.isFreeBSD ? "FreeBSD" : (
/* 51 */       SystemInfo.isUnix ? "Unix" : (
/* 52 */       SystemInfo.isSolaris ? "Solaris" : (
/* 53 */       SystemInfo.isChromeOS ? "ChromeOS" : 
/* 54 */       "Unknown OS")))))))))));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/context/providers/EnvironmentChatContextProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */