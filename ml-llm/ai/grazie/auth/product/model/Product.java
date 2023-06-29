/*    */ package ai.grazie.auth.product.model;
/*    */ 
/*    */ import kotlin.Lazy;
/*    */ import kotlin.Metadata;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable(with = Product.Serializer.class)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\f\b\007\030\000 \r2\0020\001:\005\r\016\017\020\021B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\006¢\006\002\020\007R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\n\020\013R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\t¨\006\022"}, d2 = {"Lai/grazie/auth/product/model/Product;", "", "name", "", "display", "family", "Lai/grazie/auth/product/model/ProductFamily;", "(Ljava/lang/String;Ljava/lang/String;Lai/grazie/auth/product/model/ProductFamily;)V", "getDisplay", "()Ljava/lang/String;", "getFamily", "()Lai/grazie/auth/product/model/ProductFamily;", "getName", "Companion", "External", "Grazie", "Internal", "Serializer", "auth-product-model"})
/*    */ public final class Product {
/* 12 */   public Product(@NotNull String name, @NotNull String display, @NotNull ProductFamily family) { this.name = name; this.display = display; this.family = family; } @NotNull public final String getName() { return this.name; } @NotNull public final String getDisplay() { return this.display; } @NotNull public final ProductFamily getFamily() { return this.family; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\b\bÆ\002\030\0002\0020\001:\001\013B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006¨\006\f"}, d2 = {"Lai/grazie/auth/product/model/Product$Grazie;", "", "()V", "Extension", "Lai/grazie/auth/product/model/Product;", "getExtension", "()Lai/grazie/auth/product/model/Product;", "Playground", "getPlayground", "Professional", "getProfessional", "Docs", "auth-product-model"})
/*    */   public static final class Grazie { @NotNull
/* 14 */     public static final Grazie INSTANCE = new Grazie(); @NotNull private static final Product Extension = new Product("grazie-extension", "Browser Extension", ProductFamily.Grazie); @NotNull public final Product getExtension() { return Extension; } @NotNull
/* 15 */     private static final Product Professional = new Product("grazie-professional", "Professional", ProductFamily.Grazie); @NotNull public final Product getProfessional() { return Professional; }
/*    */      @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006¨\006\t"}, d2 = {"Lai/grazie/auth/product/model/Product$Grazie$Docs;", "", "()V", "Desktop", "Lai/grazie/auth/product/model/Product;", "getDesktop", "()Lai/grazie/auth/product/model/Product;", "Web", "getWeb", "auth-product-model"})
/*    */     public static final class Docs { @NotNull
/* 18 */       public static final Docs INSTANCE = new Docs(); @NotNull private static final Product Web = new Product("grazie-docs-web", "Docs Web", ProductFamily.Grazie); @NotNull public final Product getWeb() { return Web; } @NotNull
/* 19 */       private static final Product Desktop = new Product("grazie-docs-desktop", "Docs Desktop", ProductFamily.Grazie); @NotNull public final Product getDesktop() { return Desktop; }
/*    */        }
/*    */     @NotNull
/* 22 */     private static final Product Playground = new Product("grazie-playground", "Playground", ProductFamily.Grazie); @NotNull public final Product getPlayground() { return Playground; }
/*    */      }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006¨\006\t"}, d2 = {"Lai/grazie/auth/product/model/Product$Internal;", "", "()V", "Labs", "Lai/grazie/auth/product/model/Product;", "getLabs", "()Lai/grazie/auth/product/model/Product;", "SupportMate", "getSupportMate", "auth-product-model"})
/*    */   public static final class Internal { @NotNull
/* 26 */     public static final Internal INSTANCE = new Internal(); @NotNull private static final Product SupportMate = new Product("internal-support-mate", "Support Mate", ProductFamily.Internal); @NotNull public final Product getSupportMate() { return SupportMate; } @NotNull
/* 27 */     private static final Product Labs = new Product("internal-labs", "Labs", ProductFamily.Internal); @NotNull public final Product getLabs() { return Labs; }
/*    */      }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\007\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006¨\006\013"}, d2 = {"Lai/grazie/auth/product/model/Product$External;", "", "()V", "DotNet", "Lai/grazie/auth/product/model/Product;", "getDotNet", "()Lai/grazie/auth/product/model/Product;", "Fleet", "getFleet", "IntelliJ", "getIntelliJ", "auth-product-model"})
/*    */   public static final class External { @NotNull
/* 31 */     public static final External INSTANCE = new External(); @NotNull private static final Product Fleet = new Product("external-fleet", "Fleet", ProductFamily.Fleet); @NotNull public final Product getFleet() { return Fleet; } @NotNull
/* 32 */     private static final Product IntelliJ = new Product("external-intellij", "IntelliJ", ProductFamily.IntelliJ); @NotNull public final Product getIntelliJ() { return IntelliJ; } @NotNull
/* 33 */     private static final Product DotNet = new Product("external-dotnet", ".NET", ProductFamily.DotNet); @NotNull public final Product getDotNet() { return DotNet; } }
/*    */    @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\021\n\002\030\002\n\002\b\005\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\n\032\b\022\004\022\0020\0050\013HÆ\001R!\020\003\032\b\022\004\022\0020\0050\0048FX\002¢\006\f\n\004\b\b\020\t\032\004\b\006\020\007¨\006\f"}, d2 = {"Lai/grazie/auth/product/model/Product$Companion;", "", "()V", "all", "", "Lai/grazie/auth/product/model/Product;", "getAll", "()[Lai/grazie/auth/product/model/Product;", "all$delegate", "Lkotlin/Lazy;", "serializer", "Lkotlinx/serialization/KSerializer;", "auth-product-model"})
/*    */   public static final class Companion { private Companion() {} @NotNull
/* 36 */     public final KSerializer<Product> serializer() { return Product.Serializer.INSTANCE; } @NotNull
/* 37 */     public final Product[] getAll() { Lazy lazy = Product.all$delegate; return (Product[])lazy.getValue(); } } @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String name; @NotNull private final String display; @NotNull private final ProductFamily family; @NotNull private static final Lazy<Product[]> all$delegate = LazyKt.lazy(Product$Companion$all$2.INSTANCE); @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\021\n\002\030\002\n\002\b\002\020\000\032\b\022\004\022\0020\0020\001H\n¢\006\004\b\003\020\004"}, d2 = {"<anonymous>", "", "Lai/grazie/auth/product/model/Product;", "invoke", "()[Lai/grazie/auth/product/model/Product;"})
/*    */   static final class Product$Companion$all$2 extends Lambda implements Function0<Product[]> { public static final Product$Companion$all$2 INSTANCE = new Product$Companion$all$2(); @NotNull
/* 39 */     public final Product[] invoke() { Product[] arrayOfProduct = new Product[8]; arrayOfProduct[0] = Product.Grazie.INSTANCE.getExtension(); arrayOfProduct[1] = 
/* 40 */         Product.Grazie.INSTANCE.getProfessional();
/* 41 */       arrayOfProduct[2] = Product.Grazie.Docs.INSTANCE.getWeb();
/* 42 */       arrayOfProduct[3] = Product.Grazie.Docs.INSTANCE.getDesktop();
/* 43 */       arrayOfProduct[4] = Product.Grazie.INSTANCE.getPlayground();
/* 44 */       arrayOfProduct[5] = Product.Internal.INSTANCE.getSupportMate();
/* 45 */       arrayOfProduct[6] = Product.Internal.INSTANCE.getLabs();
/* 46 */       arrayOfProduct[7] = Product.External.INSTANCE.getFleet();
/*    */       return arrayOfProduct; } Product$Companion$all$2() {
/*    */       super(0);
/*    */     } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÀ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\020\020\b\032\0020\0022\006\020\t\032\0020\nH\026J\030\020\013\032\0020\f2\006\020\r\032\0020\0162\006\020\017\032\0020\002H\026R\024\020\004\032\0020\0058VX\004¢\006\006\032\004\b\006\020\007¨\006\020"}, d2 = {"Lai/grazie/auth/product/model/Product$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/auth/product/model/Product;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "auth-product-model"})
/*    */   @SourceDebugExtension({"SMAP\nProduct.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Product.kt\nai/grazie/auth/product/model/Product$Serializer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,66:1\n2908#2,12:67\n*S KotlinDebug\n*F\n+ 1 Product.kt\nai/grazie/auth/product/model/Product$Serializer\n*L\n55#1:67,12\n*E\n"})
/*    */   public static final class Serializer implements KSerializer<Product> { @NotNull
/*    */     public static final Serializer INSTANCE = new Serializer(); @NotNull
/*    */     public Product deserialize(@NotNull Decoder decoder) {
/* 54 */       Intrinsics.checkNotNullParameter(decoder, "decoder"); String value = decoder.decodeString();
/* 55 */       Product[] arrayOfProduct = Product.Companion.getAll(); int $i$f$single = 0;
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
/* 67 */       Object single$iv = null;
/* 68 */       boolean found$iv = false; byte b; int i;
/* 69 */       for (b = 0, i = arrayOfProduct.length; b < i; ) { Object element$iv = arrayOfProduct[b];
/* 70 */         Object object1 = element$iv; int $i$a$-single-Product$Serializer$deserialize$1 = 0; if (Intrinsics.areEqual(object1.getName(), value)) {
/* 71 */           if (found$iv) throw new IllegalArgumentException("Array contains more than one matching element."); 
/* 72 */           single$iv = element$iv;
/* 73 */           found$iv = true;
/*    */         }  }
/*    */       
/* 76 */       if (!found$iv) throw new NoSuchElementException("Array contains no element matching the predicate.");
/*    */       
/* 78 */       return (Product)single$iv;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public SerialDescriptor getDescriptor() {
/*    */       return SerialDescriptorsKt.PrimitiveSerialDescriptor("Product", (PrimitiveKind)PrimitiveKind.STRING.INSTANCE);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull Product value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       encoder.encodeString(value.getName());
/*    */     } }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/auth/product/model/Product.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */