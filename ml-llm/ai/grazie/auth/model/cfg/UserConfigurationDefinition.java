/*    */ package ai.grazie.auth.model.cfg;
/*    */ import ai.grazie.auth.model.GrazieUserAttributes;
/*    */ import ai.grazie.user.cfg.model.proxy.AttributeProxy;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\016\n\002\b\007\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\027\020\003\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\006\020\007R\027\020\b\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\t\020\007R\027\020\n\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\013\020\007¨\006\f"}, d2 = {"Lai/grazie/auth/model/cfg/UserConfigurationDefinition;", "Lai/grazie/user/cfg/model/Configuration;", "()V", "color", "Lai/grazie/user/cfg/model/proxy/AttributeProxy;", "", "getColor", "()Lai/grazie/user/cfg/model/proxy/AttributeProxy;", "email", "getEmail", "fullName", "getFullName", "auth-model"})
/*    */ public final class UserConfigurationDefinition extends Configuration {
/*    */   @NotNull
/*  9 */   public static final UserConfigurationDefinition INSTANCE = new UserConfigurationDefinition(); @NotNull private static final AttributeProxy<String> fullName = INSTANCE.text(GrazieUserAttributes.Meta.INSTANCE.getFullName().getFqdn()); @NotNull public final AttributeProxy<String> getFullName() { return fullName; } @NotNull
/* 10 */   private static final AttributeProxy<String> email = INSTANCE.text(GrazieUserAttributes.Meta.INSTANCE.getEmail().getFqdn()); @NotNull public final AttributeProxy<String> getEmail() { return email; } @NotNull
/* 11 */   private static final AttributeProxy<String> color = INSTANCE.text(GrazieUserAttributes.Avatar.INSTANCE.getColor().getFqdn()); @NotNull public final AttributeProxy<String> getColor() { return color; }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/auth/model/cfg/UserConfigurationDefinition.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */