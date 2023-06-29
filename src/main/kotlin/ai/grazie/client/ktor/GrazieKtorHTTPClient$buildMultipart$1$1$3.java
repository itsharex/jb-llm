/*     */ package ai.grazie.client.ktor;
/*     */ 
/*     */ import ai.grazie.client.common.model.Multipart;
/*     */ import io.ktor.utils.io.charsets.CharsetJVMKt;
/*     */ import io.ktor.utils.io.core.BytePacketBuilder;
/*     */ import io.ktor.utils.io.core.Input;
/*     */ import io.ktor.utils.io.core.Output;
/*     */ import io.ktor.utils.io.core.OutputKt;
/*     */ import java.nio.charset.Charset;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.Charsets;
/*     */ import kotlin.text.StringsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lio/ktor/utils/io/core/Input;", "invoke"})
/*     */ @SourceDebugExtension({"SMAP\nGrazieKtorHTTPClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrazieKtorHTTPClient.kt\nai/grazie/client/ktor/GrazieKtorHTTPClient$buildMultipart$1$1$3\n+ 2 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n+ 3 Strings.kt\nio/ktor/utils/io/core/StringsKt\n*L\n1#1,129:1\n12#2,7:130\n19#2,4:141\n7#3,4:137\n*S KotlinDebug\n*F\n+ 1 GrazieKtorHTTPClient.kt\nai/grazie/client/ktor/GrazieKtorHTTPClient$buildMultipart$1$1$3\n*L\n121#1:130,7\n121#1:141,4\n121#1:137,4\n*E\n"})
/*     */ final class GrazieKtorHTTPClient$buildMultipart$1$1$3
/*     */   extends Lambda
/*     */   implements Function0<Input>
/*     */ {
/*     */   @NotNull
/*     */   public final Input invoke() {
/* 121 */     Multipart.PartItem partItem = this.$it; int $i$f$buildPacket = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 134 */     BytePacketBuilder builder$iv = new BytePacketBuilder(null, 1, null);
/*     */     try {
/* 136 */       BytePacketBuilder $this$invoke_u24lambda_u240 = builder$iv; int $i$a$-buildPacket-GrazieKtorHTTPClient$buildMultipart$1$1$3$1 = 0; String $this$toByteArray_u24default$iv = partItem.getValue();
/* 137 */       Charset charset$iv = Charsets.UTF_8; int $i$f$toByteArray = 0;
/*     */ 
/*     */       
/* 140 */       Intrinsics.checkNotNullExpressionValue(charset$iv.newEncoder(), "charset.newEncoder()"); OutputKt.writeFully$default((Output)$this$invoke_u24lambda_u240, Intrinsics.areEqual(charset$iv, Charsets.UTF_8) ? StringsKt.encodeToByteArray($this$toByteArray_u24default$iv) : CharsetJVMKt.encodeToByteArray(charset$iv.newEncoder(), $this$toByteArray_u24default$iv, 0, $this$toByteArray_u24default$iv.length()), 0, 0, 6, null);
/*     */     }
/* 142 */     catch (Throwable t$iv) {
/* 143 */       builder$iv.release();
/* 144 */       throw t$iv;
/*     */     } 
/*     */     return (Input)builder$iv.build();
/*     */   }
/*     */   
/*     */   GrazieKtorHTTPClient$buildMultipart$1$1$3(Multipart.PartItem $it) {
/*     */     super(0);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/client/ktor/GrazieKtorHTTPClient$buildMultipart$1$1$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */