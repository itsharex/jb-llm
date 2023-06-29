/*    */ package ai.grazie.auth.product.model;
/*    */ 
/*    */ import java.util.NoSuchElementException;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.PrimitiveKind;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptorsKt;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÀ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\020\020\b\032\0020\0022\006\020\t\032\0020\nH\026J\030\020\013\032\0020\f2\006\020\r\032\0020\0162\006\020\017\032\0020\002H\026R\024\020\004\032\0020\0058VX\004¢\006\006\032\004\b\006\020\007¨\006\020"}, d2 = {"Lai/grazie/auth/product/model/Product$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/auth/product/model/Product;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "auth-product-model"})
/*    */ @SourceDebugExtension({"SMAP\nProduct.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Product.kt\nai/grazie/auth/product/model/Product$Serializer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,66:1\n2908#2,12:67\n*S KotlinDebug\n*F\n+ 1 Product.kt\nai/grazie/auth/product/model/Product$Serializer\n*L\n55#1:67,12\n*E\n"})
/*    */ public final class Serializer
/*    */   implements KSerializer<Product>
/*    */ {
/*    */   @NotNull
/*    */   public static final Serializer INSTANCE = new Serializer();
/*    */   
/*    */   @NotNull
/*    */   public Product deserialize(@NotNull Decoder decoder) {
/* 54 */     Intrinsics.checkNotNullParameter(decoder, "decoder"); String value = decoder.decodeString();
/* 55 */     Product[] arrayOfProduct = Product.Companion.getAll(); int $i$f$single = 0;
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
/* 67 */     Object single$iv = null;
/* 68 */     boolean found$iv = false; byte b; int i;
/* 69 */     for (b = 0, i = arrayOfProduct.length; b < i; ) { Object element$iv = arrayOfProduct[b];
/* 70 */       Object object1 = element$iv; int $i$a$-single-Product$Serializer$deserialize$1 = 0; if (Intrinsics.areEqual(object1.getName(), value)) {
/* 71 */         if (found$iv) throw new IllegalArgumentException("Array contains more than one matching element."); 
/* 72 */         single$iv = element$iv;
/* 73 */         found$iv = true;
/*    */       }  }
/*    */     
/* 76 */     if (!found$iv) throw new NoSuchElementException("Array contains no element matching the predicate.");
/*    */     
/* 78 */     return (Product)single$iv;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public SerialDescriptor getDescriptor() {
/*    */     return SerialDescriptorsKt.PrimitiveSerialDescriptor("Product", (PrimitiveKind)PrimitiveKind.STRING.INSTANCE);
/*    */   }
/*    */   
/*    */   public void serialize(@NotNull Encoder encoder, @NotNull Product value) {
/*    */     Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */     Intrinsics.checkNotNullParameter(value, "value");
/*    */     encoder.encodeString(value.getName());
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/auth/product/model/Product$Serializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */