/*    */ package ai.grazie.utils.mpp.time;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlinx.serialization.KSerializer;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\005\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\007\032\0020\0042\006\020\007\032\0020\bJ\016\020\t\032\0020\0042\006\020\t\032\0020\bJ\016\020\n\032\0020\0042\006\020\n\032\0020\bJ\016\020\013\032\0020\0042\006\020\013\032\0020\bJ\016\020\f\032\0020\0042\006\020\f\032\0020\bJ\017\020\r\032\b\022\004\022\0020\0040\016HÆ\001R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\017"}, d2 = {"Lai/grazie/utils/mpp/time/Duration$Companion;", "", "()V", "ZERO", "Lai/grazie/utils/mpp/time/Duration;", "getZERO", "()Lai/grazie/utils/mpp/time/Duration;", "days", "", "hours", "millis", "minutes", "seconds", "serializer", "Lkotlinx/serialization/KSerializer;", "utils-common"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final KSerializer<Duration> serializer() {
/* 28 */     return (KSerializer<Duration>)Duration.$serializer.INSTANCE; } @NotNull
/* 29 */   public final Duration getZERO() { return Duration.access$getZERO$cp(); }
/*    */    @NotNull
/*    */   public final Duration millis(int millis) {
/* 32 */     return new Duration(millis);
/*    */   }
/*    */   @NotNull
/*    */   public final Duration seconds(int seconds) {
/* 36 */     return new Duration(seconds * 1000L);
/*    */   }
/*    */   @NotNull
/*    */   public final Duration minutes(int minutes) {
/* 40 */     return seconds(minutes * 60);
/*    */   }
/*    */   @NotNull
/*    */   public final Duration hours(int hours) {
/* 44 */     return minutes(hours * 60);
/*    */   }
/*    */   @NotNull
/*    */   public final Duration days(int days) {
/* 48 */     return hours(days * 24);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/mpp/time/Duration$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */