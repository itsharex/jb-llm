/*    */ package ai.grazie.auth.product.model.api.products;
/*    */ import ai.grazie.auth.product.model.Product;
/*    */ import ai.grazie.auth.product.model.api.auth.ElectronAuthFlow;
/*    */ import ai.grazie.auth.product.model.api.auth.ServerProductAuthFlow;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\t\020\n¨\006\013"}, d2 = {"Lai/grazie/auth/product/model/api/products/GrazieDocsProductsAuthFlow;", "", "()V", "Desktop", "Lai/grazie/auth/product/model/api/auth/ElectronAuthFlow;", "getDesktop", "()Lai/grazie/auth/product/model/api/auth/ElectronAuthFlow;", "Web", "Lai/grazie/auth/product/model/api/auth/ServerProductAuthFlow;", "getWeb", "()Lai/grazie/auth/product/model/api/auth/ServerProductAuthFlow;", "auth-product-model"})
/*    */ public final class GrazieDocsProductsAuthFlow {
/*    */   @NotNull
/* 10 */   public static final GrazieDocsProductsAuthFlow INSTANCE = new GrazieDocsProductsAuthFlow(); @NotNull private static final ServerProductAuthFlow Web = new ServerProductAuthFlow(Product.Grazie.Docs.INSTANCE.getWeb(), "inky", "grazie-inky-redirect"); @NotNull public final ServerProductAuthFlow getWeb() { return Web; } @NotNull
/* 11 */   private static final ElectronAuthFlow Desktop = new ElectronAuthFlow(Product.Grazie.Docs.INSTANCE.getDesktop(), "docs/desktop"); @NotNull public final ElectronAuthFlow getDesktop() { return Desktop; }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/auth/product/model/api/products/GrazieDocsProductsAuthFlow.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */