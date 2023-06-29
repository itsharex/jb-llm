/*    */ package ai.grazie.auth.model.api;
/*    */ 
/*    */ import ai.grazie.model.cloud.API;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\004\bÆ\002\030\0002\0020\001:\002\003\004B\007\b\002¢\006\002\020\002¨\006\005"}, d2 = {"Lai/grazie/auth/model/api/AuthAPI$Toolbox;", "", "()V", "Success", "Waitlist", "auth-model"})
/*    */ public final class Toolbox
/*    */ {
/*    */   @NotNull
/*    */   public static final Toolbox INSTANCE = new Toolbox();
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004XD¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/auth/model/api/AuthAPI$Toolbox$Success;", "Lai/grazie/model/cloud/API;", "()V", "path", "", "getPath", "()Ljava/lang/String;", "auth-model"})
/*    */   public static final class Success
/*    */     implements API
/*    */   {
/*    */     @NotNull
/* 47 */     public static final Success INSTANCE = new Success(); @NotNull private static final String path = "/auth/toolbox"; @NotNull public String getPath() { return path; }
/*    */      }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004XD¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/auth/model/api/AuthAPI$Toolbox$Waitlist;", "Lai/grazie/model/cloud/API;", "()V", "path", "", "getPath", "()Ljava/lang/String;", "auth-model"})
/*    */   public static final class Waitlist implements API { @NotNull
/* 51 */     public static final Waitlist INSTANCE = new Waitlist(); @NotNull private static final String path = "/auth/toolbox/wait-list"; @NotNull public String getPath() { return path; }
/*    */      }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/auth/model/api/AuthAPI$Toolbox.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */