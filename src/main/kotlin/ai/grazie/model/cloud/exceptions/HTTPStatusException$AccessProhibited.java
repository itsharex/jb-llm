/*    */ package ai.grazie.model.cloud.exceptions;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\003\b&\030\000 \t2\0020\001:\001\tB%\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\005\022\n\b\002\020\006\032\004\030\0010\007¢\006\002\020\b¨\006\n"}, d2 = {"Lai/grazie/model/cloud/exceptions/HTTPStatusException$AccessProhibited;", "Lai/grazie/model/cloud/exceptions/HTTPStatusException;", "status", "", "description", "", "e", "", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "Companion", "model-cloud"})
/*    */ public abstract class AccessProhibited
/*    */   extends HTTPStatusException
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   public AccessProhibited(int status, @Nullable String description, @Nullable Throwable e) {
/* 31 */     super(status, description, e);
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002¨\006\003"}, d2 = {"Lai/grazie/model/cloud/exceptions/HTTPStatusException$AccessProhibited$Companion;", "", "()V", "model-cloud"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/cloud/exceptions/HTTPStatusException$AccessProhibited.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */