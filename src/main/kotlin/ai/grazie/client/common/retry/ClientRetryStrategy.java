/*    */ package ai.grazie.client.common.retry;
/*    */ 
/*    */ import ai.grazie.utils.mpp.time.Duration;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\002\bf\030\000 \0062\0020\001:\001\006J\020\020\002\032\0020\0032\006\020\004\032\0020\005H&ø\001\000\002\006\n\004\b!0\001¨\006\007À\006\001"}, d2 = {"Lai/grazie/client/common/retry/ClientRetryStrategy;", "", "delay", "Lai/grazie/utils/mpp/time/Duration;", "attempt", "", "Companion", "client-common"})
/*    */ public interface ClientRetryStrategy {
/*    */   @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   
/*    */   @NotNull
/*    */   Duration delay(int paramInt);
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\006\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J,\020\007\032\0020\0042\006\020\005\032\0020\0062\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0062\b\b\002\020\013\032\0020\006¨\006\f"}, d2 = {"Lai/grazie/client/common/retry/ClientRetryStrategy$Companion;", "", "()V", "constant", "Lai/grazie/client/common/retry/ClientRetryStrategy;", "delay", "Lai/grazie/utils/mpp/time/Duration;", "exponential", "multiplier", "", "randomization", "max", "client-common"})
/*    */   public static final class Companion {
/*    */     @NotNull
/* 18 */     public final ClientRetryStrategy constant(@NotNull Duration delay) { Intrinsics.checkNotNullParameter(delay, "delay"); return new ClientRetryStrategy$Companion$constant$1(delay); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"ai/grazie/client/common/retry/ClientRetryStrategy$Companion$constant$1", "Lai/grazie/client/common/retry/ClientRetryStrategy;", "delay", "Lai/grazie/utils/mpp/time/Duration;", "attempt", "", "client-common"}) public static final class ClientRetryStrategy$Companion$constant$1 implements ClientRetryStrategy { @NotNull
/* 19 */       public Duration delay(int attempt) { return this.$delay; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/*    */       ClientRetryStrategy$Companion$constant$1(Duration $delay) {} }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final ClientRetryStrategy exponential(@NotNull Duration delay, double multiplier, @NotNull Duration randomization, @NotNull Duration max) {
/* 33 */       Intrinsics.checkNotNullParameter(delay, "delay"); Intrinsics.checkNotNullParameter(randomization, "randomization"); Intrinsics.checkNotNullParameter(max, "max"); return new ClientRetryStrategy$Companion$exponential$1(randomization, multiplier, delay, max); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"ai/grazie/client/common/retry/ClientRetryStrategy$Companion$exponential$1", "Lai/grazie/client/common/retry/ClientRetryStrategy;", "delay", "Lai/grazie/utils/mpp/time/Duration;", "attempt", "", "client-common"})
/*    */     public static final class ClientRetryStrategy$Companion$exponential$1 implements ClientRetryStrategy { @NotNull
/* 35 */       public Duration delay(int attempt) { double randomized = Random.Default.nextDouble() * this.$randomization.getMillis();
/* 36 */         double exponential = Math.pow(this.$multiplier, attempt) * this.$delay.getMillis();
/* 37 */         return Duration.Companion.millis((int)RangesKt.coerceAtMost(randomized + exponential, this.$max.getMillis())); }
/*    */ 
/*    */       
/*    */       ClientRetryStrategy$Companion$exponential$1(Duration $randomization, double $multiplier, Duration $delay, Duration $max) {} }
/*    */   
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/client/common/retry/ClientRetryStrategy.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */