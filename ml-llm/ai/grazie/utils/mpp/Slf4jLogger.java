/*    */ package ai.grazie.utils.mpp;
/*    */ 
/*    */ import kotlin.jvm.functions.Function0;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\002\020\016\n\002\b\002\n\002\020\003\n\002\b\003\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\026\020\005\032\0020\0062\f\020\007\032\b\022\004\022\0020\t0\bH\026J \020\n\032\0020\0062\f\020\007\032\b\022\004\022\0020\t0\b2\b\020\013\032\004\030\0010\fH\026J\026\020\r\032\0020\0062\f\020\007\032\b\022\004\022\0020\t0\bH\026J \020\016\032\0020\0062\f\020\007\032\b\022\004\022\0020\t0\b2\b\020\013\032\004\030\0010\fH\026R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\017"}, d2 = {"Lai/grazie/utils/mpp/Slf4jLogger;", "Lai/grazie/utils/mpp/MPPLogger;", "logger", "Lorg/slf4j/Logger;", "(Lorg/slf4j/Logger;)V", "debug", "", "message", "Lkotlin/Function0;", "", "error", "e", "", "info", "warning", "utils-common"})
/*    */ public final class Slf4jLogger implements MPPLogger {
/*  7 */   public Slf4jLogger(@NotNull Logger logger) { this.logger = logger; } @NotNull
/*    */   private final Logger logger; public void debug(@NotNull Function0 message) {
/*  9 */     Intrinsics.checkNotNullParameter(message, "message"); this.logger.debug((String)message.invoke());
/*    */   }
/*    */   
/*    */   public void info(@NotNull Function0 message) {
/* 13 */     Intrinsics.checkNotNullParameter(message, "message"); this.logger.info((String)message.invoke());
/*    */   }
/*    */   
/*    */   public void warning(@NotNull Function0 message, @Nullable Throwable e) {
/* 17 */     Intrinsics.checkNotNullParameter(message, "message"); this.logger.warn((String)message.invoke(), e);
/*    */   }
/*    */   
/*    */   public void error(@NotNull Function0 message, @Nullable Throwable e) {
/* 21 */     Intrinsics.checkNotNullParameter(message, "message"); this.logger.error((String)message.invoke(), e);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/mpp/Slf4jLogger.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */