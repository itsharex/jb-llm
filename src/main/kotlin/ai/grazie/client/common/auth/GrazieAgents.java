/*    */ package ai.grazie.client.common.auth;
/*    */ import ai.grazie.model.auth.GrazieAgent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\005\b\007\030\0002\0020\001:\003\003\004\005B\005¢\006\002\020\002¨\006\006"}, d2 = {"Lai/grazie/client/common/auth/GrazieAgents;", "", "()V", "Editor", "Extension", "Plugin", "client-common"})
/*    */ public final class GrazieAgents {
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J\016\020\007\032\0020\0042\006\020\005\032\0020\006J\016\020\b\032\0020\0042\006\020\005\032\0020\006¨\006\t"}, d2 = {"Lai/grazie/client/common/auth/GrazieAgents$Extension;", "", "()V", "Chrome", "Lai/grazie/model/auth/GrazieAgent;", "version", "", "Firefox", "Safari", "client-common"})
/*    */   public static final class Extension {
/*    */     @NotNull
/*    */     public static final Extension INSTANCE = new Extension();
/*    */     
/*    */     @NotNull
/* 13 */     public final GrazieAgent Chrome(@NotNull String version) { Intrinsics.checkNotNullParameter(version, "version"); return new GrazieAgent("grazie-chrome-extension", version); } @NotNull
/* 14 */     public final GrazieAgent Firefox(@NotNull String version) { Intrinsics.checkNotNullParameter(version, "version"); return new GrazieAgent("grazie-firefox-extension", version); } @NotNull
/* 15 */     public final GrazieAgent Safari(@NotNull String version) { Intrinsics.checkNotNullParameter(version, "version"); return new GrazieAgent("grazie-safari-extension", version); }
/*    */   
/*    */   } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J\016\020\007\032\0020\0042\006\020\005\032\0020\006¨\006\b"}, d2 = {"Lai/grazie/client/common/auth/GrazieAgents$Editor;", "", "()V", "Desktop", "Lai/grazie/model/auth/GrazieAgent;", "version", "", "Web", "client-common"})
/*    */   public static final class Editor { @NotNull
/* 19 */     public final GrazieAgent Web(@NotNull String version) { Intrinsics.checkNotNullParameter(version, "version"); return new GrazieAgent("grazie-web-editor", version); } @NotNull public static final Editor INSTANCE = new Editor(); @NotNull
/* 20 */     public final GrazieAgent Desktop(@NotNull String version) { Intrinsics.checkNotNullParameter(version, "version"); return new GrazieAgent("grazie-desktop-editor", version); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006¨\006\007"}, d2 = {"Lai/grazie/client/common/auth/GrazieAgents$Plugin;", "", "()V", "Professional", "Lai/grazie/model/auth/GrazieAgent;", "version", "", "client-common"})
/*    */   public static final class Plugin { @NotNull
/*    */     public static final Plugin INSTANCE = new Plugin(); @NotNull
/*    */     public final GrazieAgent Professional(@NotNull String version) {
/* 24 */       Intrinsics.checkNotNullParameter(version, "version"); return new GrazieAgent("grazie-professional-plugin", version);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/client/common/auth/GrazieAgents.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */