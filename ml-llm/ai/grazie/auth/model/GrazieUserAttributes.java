/*    */ package ai.grazie.auth.model;
/*    */ 
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\005\b\007\030\0002\0020\001:\003\003\004\005B\005¢\006\002\020\002¨\006\006"}, d2 = {"Lai/grazie/auth/model/GrazieUserAttributes;", "", "()V", "Avatar", "Meta", "Statistic", "auth-model"})
/*    */ public final class GrazieUserAttributes {
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006¨\006\t"}, d2 = {"Lai/grazie/auth/model/GrazieUserAttributes$Meta;", "", "()V", "Email", "Lai/grazie/utils/attributes/Attributes$Key$Text;", "getEmail", "()Lai/grazie/utils/attributes/Attributes$Key$Text;", "FullName", "getFullName", "auth-model"})
/*    */   public static final class Meta { @NotNull
/*  9 */     public static final Meta INSTANCE = new Meta(); @NotNull private static final Attributes.Key.Text FullName = new Attributes.Key.Text("user.full-name"); @NotNull public final Attributes.Key.Text getFullName() { return FullName; } @NotNull
/* 10 */     private static final Attributes.Key.Text Email = new Attributes.Key.Text("user.email"); @NotNull public final Attributes.Key.Text getEmail() { return Email; }
/*    */      }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006¨\006\t"}, d2 = {"Lai/grazie/auth/model/GrazieUserAttributes$Statistic;", "", "()V", "LastSeen", "Lai/grazie/utils/attributes/Attributes$Key$Long;", "getLastSeen", "()Lai/grazie/utils/attributes/Attributes$Key$Long;", "RegistrationDate", "getRegistrationDate", "auth-model"})
/*    */   public static final class Statistic { @NotNull
/* 14 */     public static final Statistic INSTANCE = new Statistic(); @NotNull private static final Attributes.Key.Long LastSeen = new Attributes.Key.Long("user.statistic.last-seen"); @NotNull public final Attributes.Key.Long getLastSeen() { return LastSeen; } @NotNull
/* 15 */     private static final Attributes.Key.Long RegistrationDate = new Attributes.Key.Long("user.statistic.registration-date"); @NotNull public final Attributes.Key.Long getRegistrationDate() { return RegistrationDate; }
/*    */      }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/auth/model/GrazieUserAttributes$Avatar;", "", "()V", "Color", "Lai/grazie/utils/attributes/Attributes$Key$Text;", "getColor", "()Lai/grazie/utils/attributes/Attributes$Key$Text;", "auth-model"})
/*    */   public static final class Avatar { @NotNull
/* 19 */     public static final Avatar INSTANCE = new Avatar(); @NotNull private static final Attributes.Key.Text Color = new Attributes.Key.Text("user.avatar.color"); @NotNull public final Attributes.Key.Text getColor() { return Color; }
/*    */      }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/auth/model/GrazieUserAttributes.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */