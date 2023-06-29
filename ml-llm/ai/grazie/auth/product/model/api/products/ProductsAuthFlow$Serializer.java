/*    */ package ai.grazie.auth.product.model.api.products;
/*    */ 
/*    */ import ai.grazie.auth.product.model.api.auth.AuthFlow;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÀ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\020\020\b\032\0020\0022\006\020\t\032\0020\nH\026J\030\020\013\032\0020\f2\006\020\r\032\0020\0162\006\020\017\032\0020\002H\026R\024\020\004\032\0020\0058VX\004¢\006\006\032\004\b\006\020\007¨\006\020"}, d2 = {"Lai/grazie/auth/product/model/api/products/ProductsAuthFlow$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/auth/product/model/api/auth/AuthFlow;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "auth-product-model"})
/*    */ @SourceDebugExtension({"SMAP\nProductsAuthFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductsAuthFlow.kt\nai/grazie/auth/product/model/api/products/ProductsAuthFlow$Serializer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,48:1\n2908#2,12:49\n*S KotlinDebug\n*F\n+ 1 ProductsAuthFlow.kt\nai/grazie/auth/product/model/api/products/ProductsAuthFlow$Serializer\n*L\n37#1:49,12\n*E\n"})
/*    */ public final class Serializer
/*    */   implements KSerializer<AuthFlow>
/*    */ {
/*    */   @NotNull
/*    */   public static final Serializer INSTANCE = new Serializer();
/*    */   
/*    */   @NotNull
/*    */   public AuthFlow deserialize(@NotNull Decoder decoder) {
/* 36 */     Intrinsics.checkNotNullParameter(decoder, "decoder"); String value = decoder.decodeString();
/* 37 */     AuthFlow[] arrayOfAuthFlow = ProductsAuthFlow.INSTANCE.getAll(); int $i$f$single = 0;
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
/* 49 */     Object single$iv = null;
/* 50 */     boolean found$iv = false; byte b; int i;
/* 51 */     for (b = 0, i = arrayOfAuthFlow.length; b < i; ) { Object element$iv = arrayOfAuthFlow[b];
/* 52 */       Object object1 = element$iv; int $i$a$-single-ProductsAuthFlow$Serializer$deserialize$1 = 0; if (Intrinsics.areEqual(object1.getName(), value)) {
/* 53 */         if (found$iv) throw new IllegalArgumentException("Array contains more than one matching element."); 
/* 54 */         single$iv = element$iv;
/* 55 */         found$iv = true;
/*    */       }  }
/*    */     
/* 58 */     if (!found$iv) throw new NoSuchElementException("Array contains no element matching the predicate.");
/*    */     
/* 60 */     return (AuthFlow)single$iv;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public SerialDescriptor getDescriptor() {
/*    */     return SerialDescriptorsKt.PrimitiveSerialDescriptor("AuthFlow", (PrimitiveKind)PrimitiveKind.STRING.INSTANCE);
/*    */   }
/*    */   
/*    */   public void serialize(@NotNull Encoder encoder, @NotNull AuthFlow value) {
/*    */     Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */     Intrinsics.checkNotNullParameter(value, "value");
/*    */     encoder.encodeString(value.getName());
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/auth/product/model/api/products/ProductsAuthFlow$Serializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */