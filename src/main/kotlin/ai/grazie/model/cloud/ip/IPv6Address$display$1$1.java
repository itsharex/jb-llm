/*    */ package ai.grazie.model.cloud.ip;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.UByte;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.text.StringsKt;
/*    */ import kotlin.text.UStringsKt;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\r\n\000\n\002\020\005\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "", "invoke"})
/*    */ final class null
/*    */   extends Lambda
/*    */   implements Function1<Byte, CharSequence>
/*    */ {
/*    */   public static final null INSTANCE = (null)new Object();
/*    */   
/*    */   null() {
/*    */     super(1);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final CharSequence invoke(byte it) {
/* 41 */     return StringsKt.padStart(UStringsKt.toString-LxnNnR4(UByte.constructor-impl(it), 16), 2, '0');
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/cloud/ip/IPv6Address$display$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */