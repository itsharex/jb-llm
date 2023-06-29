/*    */ package ai.grazie.auth.product.model;
/*    */ 
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006¨\006\t"}, d2 = {"Lai/grazie/auth/product/model/Product$Grazie$Docs;", "", "()V", "Desktop", "Lai/grazie/auth/product/model/Product;", "getDesktop", "()Lai/grazie/auth/product/model/Product;", "Web", "getWeb", "auth-product-model"})
/*    */ public final class Docs
/*    */ {
/*    */   @NotNull
/* 18 */   public static final Docs INSTANCE = new Docs(); @NotNull private static final Product Web = new Product("grazie-docs-web", "Docs Web", ProductFamily.Grazie); @NotNull public final Product getWeb() { return Web; } @NotNull
/* 19 */   private static final Product Desktop = new Product("grazie-docs-desktop", "Docs Desktop", ProductFamily.Grazie); @NotNull public final Product getDesktop() { return Desktop; }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/auth/product/model/Product$Grazie$Docs.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */