/*    */ package com.intellij.ml.llm.core.models.openai;
/*    */ 
/*    */ import com.intellij.codeWithMe.ClientId;
/*    */ import com.intellij.openapi.application.ApplicationManager;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\006\020\003\032\0020\004¨\006\005"}, d2 = {"Lcom/intellij/ml/llm/core/models/openai/CredentialsHolder$Companion;", "", "()V", "getInstance", "Lcom/intellij/ml/llm/core/models/openai/CredentialsHolder;", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nCredentialsHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CredentialsHolder.kt\ncom/intellij/ml/llm/core/models/openai/CredentialsHolder$Companion\n+ 2 service.kt\ncom/intellij/openapi/components/ServiceKt\n*L\n1#1,66:1\n43#2,3:67\n*S KotlinDebug\n*F\n+ 1 CredentialsHolder.kt\ncom/intellij/ml/llm/core/models/openai/CredentialsHolder$Companion\n*L\n22#1:67,3\n*E\n"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final CredentialsHolder getInstance() {
/* 22 */     int $i$f$service = 0;
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
/* 67 */     Class<CredentialsHolder> serviceClass$iv = CredentialsHolder.class;
/* 68 */     Object object = ApplicationManager.getApplication().getService(serviceClass$iv); if (object == null)
/* 69 */       throw new RuntimeException("Cannot find service " + serviceClass$iv.getName() + " (classloader=" + serviceClass$iv.getClassLoader() + ", client=" + ClientId.Companion.getCurrentOrNull() + ")"); 
/*    */     return (CredentialsHolder)object;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/openai/CredentialsHolder$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */