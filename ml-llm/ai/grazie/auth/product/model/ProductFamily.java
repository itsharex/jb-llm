/*    */ package ai.grazie.auth.product.model;
/*    */ import kotlin.Metadata;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.EnumDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\020\n\000\n\002\020\016\n\002\b\013\b\001\030\000 \r2\b\022\004\022\0020\0000\001:\002\f\rB\017\b\002\022\006\020\002\032\0020\003¢\006\002\020\004R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006j\002\b\007j\002\b\bj\002\b\tj\002\b\nj\002\b\013¨\006\016"}, d2 = {"Lai/grazie/auth/product/model/ProductFamily;", "", "display", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getDisplay", "()Ljava/lang/String;", "Fleet", "IntelliJ", "Grazie", "DotNet", "Internal", "$serializer", "Companion", "auth-product-model"})
/*    */ public enum ProductFamily {
/* 12 */   Fleet("Fleet"),
/*    */   
/* 14 */   IntelliJ("IntelliJ-based IDEs"),
/*    */   
/* 16 */   Grazie("Grazie Products"),
/*    */   
/* 18 */   DotNet(".NET"),
/*    */   
/* 20 */   Internal("Internal Product"); @NotNull public static final Companion Companion; @NotNull private final String display; @NotNull private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate; ProductFamily(String display) { this.display = display; } static { Companion = new Companion(null);
/*    */     $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, ProductFamily$Companion$$cachedSerializer$delegate$1.INSTANCE); }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/auth/product/model/ProductFamily.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/auth/product/model/ProductFamily;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "auth-product-model"})
/*    */   public static final class $serializer implements GeneratedSerializer<ProductFamily> {
/*    */     @NotNull
/*    */     public static final $serializer INSTANCE = new $serializer();
/*    */     
/*    */     @NotNull
/*    */     public KSerializer<?>[] typeParametersSerializers() {
/*    */       return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public SerialDescriptor getDescriptor() {
/*    */       return (SerialDescriptor)descriptor;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public KSerializer<?>[] childSerializers() {
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[1];
/*    */       arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE;
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public ProductFamily deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       return ProductFamily.values()[decoder.decodeEnum(getDescriptor())];
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull ProductFamily value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       encoder.encodeEnum(getDescriptor(), value.ordinal());
/*    */     }
/*    */     
/*    */     static {
/*    */       EnumDescriptor enumDescriptor = new EnumDescriptor("ai.grazie.auth.product.model.ProductFamily", 5);
/*    */       enumDescriptor.addElement("Fleet", false);
/*    */       enumDescriptor.addElement("IntelliJ", false);
/*    */       enumDescriptor.addElement("Grazie", false);
/*    */       enumDescriptor.addElement("DotNet", false);
/*    */       enumDescriptor.addElement("Internal", false);
/*    */       descriptor = enumDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class ProductFamily$Companion$$cachedSerializer$delegate$1 extends Lambda implements Function0<KSerializer<Object>> {
/*    */     public static final ProductFamily$Companion$$cachedSerializer$delegate$1 INSTANCE = new ProductFamily$Companion$$cachedSerializer$delegate$1();
/*    */     
/*    */     ProductFamily$Companion$$cachedSerializer$delegate$1() {
/*    */       super(0);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<Object> invoke() {
/*    */       return (KSerializer<Object>)ProductFamily.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/auth/product/model/ProductFamily$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/auth/product/model/ProductFamily;", "auth-product-model"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<ProductFamily> serializer() {
/*    */       return (KSerializer<ProductFamily>)get$cachedSerializer$delegate().getValue();
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getDisplay() {
/*    */     return this.display;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/auth/product/model/ProductFamily.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */