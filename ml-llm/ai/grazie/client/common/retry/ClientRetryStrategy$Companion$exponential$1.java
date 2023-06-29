/*    */ package ai.grazie.client.common.retry;
/*    */ 
/*    */ import ai.grazie.utils.mpp.time.Duration;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.random.Random;
/*    */ import kotlin.ranges.RangesKt;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"ai/grazie/client/common/retry/ClientRetryStrategy$Companion$exponential$1", "Lai/grazie/client/common/retry/ClientRetryStrategy;", "delay", "Lai/grazie/utils/mpp/time/Duration;", "attempt", "", "client-common"})
/*    */ public final class ClientRetryStrategy$Companion$exponential$1
/*    */   implements ClientRetryStrategy
/*    */ {
/*    */   ClientRetryStrategy$Companion$exponential$1(Duration $randomization, double $multiplier, Duration $delay, Duration $max) {}
/*    */   
/*    */   @NotNull
/*    */   public Duration delay(int attempt) {
/* 35 */     double randomized = Random.Default.nextDouble() * this.$randomization.getMillis();
/* 36 */     double exponential = Math.pow(this.$multiplier, attempt) * this.$delay.getMillis();
/* 37 */     return Duration.Companion.millis((int)RangesKt.coerceAtMost(randomized + exponential, this.$max.getMillis()));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/client/common/retry/ClientRetryStrategy$Companion$exponential$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */