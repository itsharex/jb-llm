/*     */ package com.intellij.ml.llm.core.settings;
/*     */ 
/*     */ import com.intellij.codeWithMe.ClientId;
/*     */ import com.intellij.ml.llm.core.grazieAPI.GrazieAuthService;
/*     */ import com.intellij.openapi.application.ApplicationManager;
/*     */ import java.awt.event.ActionEvent;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "Ljava/awt/event/ActionEvent;", "invoke"})
/*     */ @SourceDebugExtension({"SMAP\nLLMConfigurable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMConfigurable.kt\ncom/intellij/ml/llm/core/settings/LLMConfigurable$createPanel$2$1$4$2\n+ 2 service.kt\ncom/intellij/openapi/components/ServiceKt\n*L\n1#1,110:1\n43#2,3:111\n*S KotlinDebug\n*F\n+ 1 LLMConfigurable.kt\ncom/intellij/ml/llm/core/settings/LLMConfigurable$createPanel$2$1$4$2\n*L\n83#1:111,3\n*E\n"})
/*     */ final class null
/*     */   extends Lambda
/*     */   implements Function1<ActionEvent, Unit>
/*     */ {
/*     */   public static final null INSTANCE = (null)new Object();
/*     */   
/*     */   null() {
/*     */     super(1);
/*     */   }
/*     */   
/*     */   public final void invoke(@NotNull ActionEvent it) {
/*  83 */     Intrinsics.checkNotNullParameter(it, "it"); int $i$f$service = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 111 */     Class<GrazieAuthService> serviceClass$iv = GrazieAuthService.class;
/* 112 */     Object object = ApplicationManager.getApplication().getService(serviceClass$iv); if (object == null)
/* 113 */       throw new RuntimeException("Cannot find service " + serviceClass$iv.getName() + " (classloader=" + serviceClass$iv.getClassLoader() + ", client=" + ClientId.Companion.getCurrentOrNull() + ")"); 
/*     */     ((GrazieAuthService)object).logout();
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/settings/LLMConfigurable$createPanel$2$1$4$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */