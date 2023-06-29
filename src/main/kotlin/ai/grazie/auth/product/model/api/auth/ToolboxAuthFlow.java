/*    */ package ai.grazie.auth.product.model.api.auth;
/*    */ 
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable(with = ProductsAuthFlow.Serializer.class)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\t\n\002\030\002\n\000\bÇ\002\030\0002\0020\0012\0020\0022\0020\003B\007\b\002¢\006\002\020\004J\017\020\023\032\b\022\004\022\0020\0000\024HÆ\001R\024\020\005\032\0020\006XD¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nX\004¢\006\b\n\000\032\004\b\013\020\fR\024\020\r\032\0020\006XD¢\006\b\n\000\032\004\b\016\020\bR\024\020\017\032\0020\nX\004¢\006\b\n\000\032\004\b\020\020\fR\024\020\021\032\0020\nX\004¢\006\b\n\000\032\004\b\022\020\f¨\006\025"}, d2 = {"Lai/grazie/auth/product/model/api/auth/ToolboxAuthFlow;", "Lai/grazie/auth/product/model/api/auth/AuthFlow;", "Lai/grazie/auth/product/model/api/auth/AuthFlowWithSuccess;", "Lai/grazie/auth/product/model/api/auth/AuthFlowWithWaitList;", "()V", "display", "", "getDisplay", "()Ljava/lang/String;", "login", "Lai/grazie/model/cloud/API;", "getLogin", "()Lai/grazie/model/cloud/API;", "name", "getName", "success", "getSuccess", "waitlist", "getWaitlist", "serializer", "Lkotlinx/serialization/KSerializer;", "auth-product-model"})
/*    */ public final class ToolboxAuthFlow extends AuthFlow implements AuthFlowWithSuccess, AuthFlowWithWaitList {
/*    */   @NotNull
/*  9 */   public final KSerializer<ToolboxAuthFlow> serializer() { return (KSerializer<ToolboxAuthFlow>)get$cachedSerializer$delegate().getValue(); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48) static final class ToolboxAuthFlow$$cachedSerializer$delegate$1 extends Lambda implements Function0<KSerializer<Object>> { public static final ToolboxAuthFlow$$cachedSerializer$delegate$1 INSTANCE = new ToolboxAuthFlow$$cachedSerializer$delegate$1(); @NotNull public final KSerializer<Object> invoke() { return (KSerializer<Object>)ProductsAuthFlow.Serializer.INSTANCE; } ToolboxAuthFlow$$cachedSerializer$delegate$1() {
/*    */       super(0);
/*    */     } } private ToolboxAuthFlow() {
/* 12 */     super(null); } @NotNull
/* 13 */   public static final ToolboxAuthFlow INSTANCE = new ToolboxAuthFlow(); @NotNull private static final String name = "general-toolbox"; @NotNull public String getName() { return name; } @NotNull
/* 14 */   private static final String display = "To Toolbox"; @NotNull public String getDisplay() { return display; }
/*    */    @NotNull
/* 16 */   private static final API login = APIUtils.INSTANCE.absolute("/auth/toolbox/login"); @NotNull public API getLogin() { return login; } @NotNull
/* 17 */   private static final API success = APIUtils.INSTANCE.absolute("/auth/toolbox"); @NotNull public API getSuccess() { return success; } @NotNull
/* 18 */   private static final API waitlist = APIUtils.INSTANCE.absolute("/auth/toolbox/waitlist"); @NotNull public API getWaitlist() { return waitlist; }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/auth/product/model/api/auth/ToolboxAuthFlow.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */