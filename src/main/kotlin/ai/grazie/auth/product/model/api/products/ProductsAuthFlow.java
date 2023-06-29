/*    */ package ai.grazie.auth.product.model.api.products;
/*    */ import ai.grazie.auth.product.model.Product;
/*    */ import ai.grazie.auth.product.model.api.auth.AuthFlow;
/*    */ import ai.grazie.auth.product.model.api.auth.AuthFlowWithProduct;
/*    */ import java.util.Collection;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\021\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\002\bÇ\002\030\0002\0020\001:\001\fB\007\b\002¢\006\002\020\002J\016\020\t\032\0020\0052\006\020\n\032\0020\013R\031\020\003\032\b\022\004\022\0020\0050\004¢\006\n\n\002\020\b\032\004\b\006\020\007¨\006\r"}, d2 = {"Lai/grazie/auth/product/model/api/products/ProductsAuthFlow;", "", "()V", "all", "", "Lai/grazie/auth/product/model/api/auth/AuthFlow;", "getAll", "()[Lai/grazie/auth/product/model/api/auth/AuthFlow;", "[Lai/grazie/auth/product/model/api/auth/AuthFlow;", "get", "product", "Lai/grazie/auth/product/model/Product;", "Serializer", "auth-product-model"})
/*    */ @SourceDebugExtension({"SMAP\nProductsAuthFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductsAuthFlow.kt\nai/grazie/auth/product/model/api/products/ProductsAuthFlow\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,48:1\n4098#2,11:49\n661#3,11:60\n*S KotlinDebug\n*F\n+ 1 ProductsAuthFlow.kt\nai/grazie/auth/product/model/api/products/ProductsAuthFlow\n*L\n29#1:49,11\n29#1:60,11\n*E\n"})
/*    */ public final class ProductsAuthFlow {
/*    */   @NotNull
/* 15 */   public static final ProductsAuthFlow INSTANCE = new ProductsAuthFlow(); @NotNull private static final AuthFlow[] all; @NotNull public final AuthFlow[] getAll() { return all; }
/* 16 */   static { AuthFlow[] arrayOfAuthFlow = new AuthFlow[11]; arrayOfAuthFlow[0] = (AuthFlow)GeneralProductsAuthFlow.INSTANCE.getToolbox(); arrayOfAuthFlow[1] = 
/* 17 */       (AuthFlow)GrazieProductsAuthFlow.INSTANCE.getBrowser();
/* 18 */     arrayOfAuthFlow[2] = (AuthFlow)GrazieProductsAuthFlow.INSTANCE.getPlayground();
/* 19 */     arrayOfAuthFlow[3] = (AuthFlow)GrazieDocsProductsAuthFlow.INSTANCE.getWeb();
/* 20 */     arrayOfAuthFlow[4] = (AuthFlow)GrazieDocsProductsAuthFlow.INSTANCE.getDesktop();
/* 21 */     arrayOfAuthFlow[5] = (AuthFlow)GrazieProductsAuthFlow.INSTANCE.getProfessional();
/* 22 */     arrayOfAuthFlow[6] = (AuthFlow)InternalProductsAuthFlow.INSTANCE.getSupportMate();
/* 23 */     arrayOfAuthFlow[7] = (AuthFlow)InternalProductsAuthFlow.INSTANCE.getLabs();
/* 24 */     arrayOfAuthFlow[8] = (AuthFlow)ExternalProductsAuthFlow.INSTANCE.getFleet();
/* 25 */     arrayOfAuthFlow[9] = (AuthFlow)ExternalProductsAuthFlow.INSTANCE.getIntelliJ();
/* 26 */     arrayOfAuthFlow[10] = (AuthFlow)ExternalProductsAuthFlow.INSTANCE.getDotNET();
/*    */     all = arrayOfAuthFlow; } @NotNull
/*    */   public final AuthFlow get(@NotNull Product product) {
/* 29 */     Intrinsics.checkNotNullParameter(product, "product"); AuthFlow[] arrayOfAuthFlow1 = all; int $i$f$filterIsInstance = 0;
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
/* 49 */     AuthFlow[] arrayOfAuthFlow2 = arrayOfAuthFlow1; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterIsInstanceTo = 0;
/*    */ 
/*    */     
/*    */     byte b;
/*    */ 
/*    */     
/*    */     int i;
/*    */ 
/*    */     
/* 58 */     for (b = 0, i = arrayOfAuthFlow2.length; b < i; ) { Object element$iv$iv = arrayOfAuthFlow2[b]; if (element$iv$iv instanceof AuthFlowWithProduct) destination$iv$iv.add(element$iv$iv);  b++; }
/* 59 */      List list = (List)destination$iv$iv; int $i$f$singleOrNull = 0;
/* 60 */     Object object = null;
/* 61 */     boolean found$iv = false;
/* 62 */     for (Object element$iv : list) {
/* 63 */       AuthFlowWithProduct it = (AuthFlowWithProduct)element$iv; int $i$a$-singleOrNull-ProductsAuthFlow$get$1 = 0; if (Intrinsics.areEqual(it.getProduct(), product))
/* 64 */       { if (found$iv) {  }
/* 65 */         else { object = element$iv;
/* 66 */           found$iv = true; }  }
/*    */       else {  }
/*    */     
/* 69 */     }  if ((!found$iv ? null : 
/* 70 */       (AuthFlow)object) == null) { !found$iv ? null : (AuthFlow)object; int $i$a$-requireNotNull-ProductsAuthFlow$get$2 = 0; String str = "Product " + product.getName() + " auth is not supported"; throw new IllegalArgumentException(str.toString()); }  Intrinsics.checkNotNull(!found$iv ? null : (AuthFlow)object, "null cannot be cast to non-null type ai.grazie.auth.product.model.api.auth.AuthFlow"); return !found$iv ? null : (AuthFlow)object;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÀ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\020\020\b\032\0020\0022\006\020\t\032\0020\nH\026J\030\020\013\032\0020\f2\006\020\r\032\0020\0162\006\020\017\032\0020\002H\026R\024\020\004\032\0020\0058VX\004¢\006\006\032\004\b\006\020\007¨\006\020"}, d2 = {"Lai/grazie/auth/product/model/api/products/ProductsAuthFlow$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/auth/product/model/api/auth/AuthFlow;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "auth-product-model"})
/*    */   @SourceDebugExtension({"SMAP\nProductsAuthFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductsAuthFlow.kt\nai/grazie/auth/product/model/api/products/ProductsAuthFlow$Serializer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,48:1\n2908#2,12:49\n*S KotlinDebug\n*F\n+ 1 ProductsAuthFlow.kt\nai/grazie/auth/product/model/api/products/ProductsAuthFlow$Serializer\n*L\n37#1:49,12\n*E\n"})
/*    */   public static final class Serializer implements KSerializer<AuthFlow> {
/*    */     @NotNull
/*    */     public static final Serializer INSTANCE = new Serializer();
/*    */     
/*    */     @NotNull
/*    */     public AuthFlow deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       String value = decoder.decodeString();
/*    */       AuthFlow[] arrayOfAuthFlow = ProductsAuthFlow.INSTANCE.getAll();
/*    */       int $i$f$single = 0;
/*    */       Object single$iv = null;
/*    */       boolean found$iv = false;
/*    */       byte b;
/*    */       int i;
/*    */       for (b = 0, i = arrayOfAuthFlow.length; b < i; ) {
/*    */         Object element$iv = arrayOfAuthFlow[b];
/*    */         Object object1 = element$iv;
/*    */         int $i$a$-single-ProductsAuthFlow$Serializer$deserialize$1 = 0;
/*    */         if (Intrinsics.areEqual(object1.getName(), value)) {
/*    */           if (found$iv)
/*    */             throw new IllegalArgumentException("Array contains more than one matching element."); 
/*    */           single$iv = element$iv;
/*    */           found$iv = true;
/*    */         } 
/*    */       } 
/*    */       if (!found$iv)
/*    */         throw new NoSuchElementException("Array contains no element matching the predicate."); 
/*    */       return (AuthFlow)single$iv;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public SerialDescriptor getDescriptor() {
/*    */       return SerialDescriptorsKt.PrimitiveSerialDescriptor("AuthFlow", (PrimitiveKind)PrimitiveKind.STRING.INSTANCE);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull AuthFlow value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       encoder.encodeString(value.getName());
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/auth/product/model/api/products/ProductsAuthFlow.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */