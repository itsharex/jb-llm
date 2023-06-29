/*    */ package ai.grazie.model.cloud.exceptions;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J,\020\003\032\0020\0042\006\020\005\032\0020\0062\n\b\002\020\007\032\004\030\0010\b2\020\b\002\020\t\032\n\030\0010\nj\004\030\001`\013¨\006\f"}, d2 = {"Lai/grazie/model/cloud/exceptions/HTTPStatusException$Companion;", "", "()V", "of", "Lai/grazie/model/cloud/exceptions/HTTPStatusException;", "code", "", "description", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "model-cloud"})
/*    */ public final class Companion {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final HTTPStatusException of(int code, @Nullable String description, @Nullable Exception e) {
/*  9 */     switch (code) { case 400: 
/*    */       case 401: 
/*    */       case 403: 
/*    */       case 404: 
/*    */       case 409: 
/*    */       case 411: 
/*    */       case 412: 
/*    */       case 413: 
/*    */       case 422: 
/*    */       case 429: 
/*    */       case 451: 
/*    */       case 499:
/*    */       
/*    */       case 500:
/* 23 */        }  return new HTTPStatusException(code, description, e);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/cloud/exceptions/HTTPStatusException$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */