/*    */ package com.intellij.ml.llm.core.grazieAPI;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.text.Charsets;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.ide.BuiltInServerManager;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\022\n\002\b\003\n\002\020\016\n\002\b\004\bÀ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\016\020\007\032\0020\bXT¢\006\002\n\000R\021\020\t\032\0020\b¢\006\b\n\000\032\004\b\n\020\013¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthRestServiceConsts;", "", "()V", "RESPONSE_HTML", "", "getRESPONSE_HTML", "()[B", "SERVICE_NAME", "", "SERVICE_URL", "getSERVICE_URL", "()Ljava/lang/String;", "intellij.ml.llm"})
/*    */ public final class GrazieAuthRestServiceConsts
/*    */ {
/*    */   @NotNull
/* 19 */   public static final GrazieAuthRestServiceConsts INSTANCE = new GrazieAuthRestServiceConsts(); @NotNull public static final String SERVICE_NAME = "grazie-auth"; @NotNull private static final String SERVICE_URL = "http://localhost:" + BuiltInServerManager.Companion.getInstance().getPort() + "/api/grazie-auth"; @NotNull public final String getSERVICE_URL() { return SERVICE_URL; } @NotNull private static final byte[] RESPONSE_HTML; @NotNull
/* 20 */   public final byte[] getRESPONSE_HTML() { return RESPONSE_HTML; }
/*    */ 
/*    */ 
/*    */   
/*    */   static {
/* 25 */     String str = "<div style=\"text-align: center; font-family: sans-serif; margin-top: 20px;\">\n  <h3>Authentication Successful</h3>\n  <i>Please close the page.<i/>\n</div>"; Intrinsics.checkNotNullExpressionValue(str.getBytes(Charsets.UTF_8), "this as java.lang.String).getBytes(charset)"); RESPONSE_HTML = str.getBytes(Charsets.UTF_8);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/grazieAPI/GrazieAuthRestServiceConsts.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */