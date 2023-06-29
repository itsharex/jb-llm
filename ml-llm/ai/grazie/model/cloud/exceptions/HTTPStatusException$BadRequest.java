/*    */ package ai.grazie.model.cloud.exceptions;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\002\030\0002\0020\001B\035\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005¢\006\002\020\006¨\006\007"}, d2 = {"Lai/grazie/model/cloud/exceptions/HTTPStatusException$BadRequest;", "Lai/grazie/model/cloud/exceptions/HTTPStatusException;", "description", "", "e", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "model-cloud"})
/*    */ public final class BadRequest
/*    */   extends HTTPStatusException
/*    */ {
/*    */   public BadRequest(@Nullable String description, @Nullable Throwable e) {
/* 35 */     super(description, "Bad Request", e);
/*    */   }
/*    */   
/*    */   public BadRequest() {
/*    */     this(null, null, 3, null);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/cloud/exceptions/HTTPStatusException$BadRequest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */