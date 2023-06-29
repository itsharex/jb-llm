/*     */ package com.intellij.ml.llm.core.grazieAPI;
/*     */ 
/*     */ import com.intellij.ml.llm.core.chat.ui.DerivedStateFlowKt;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.ArraysKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.flow.StateFlow;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\036\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\013\n\002\030\002\n\000\n\002\020\021\n\002\b\003\032/\020\002\032\b\022\004\022\0020\0040\003*\b\022\004\022\0020\0050\0032\022\020\006\032\n\022\006\b\001\022\0020\0050\007\"\0020\005¢\006\002\020\b\032\n\020\t\032\0020\004*\0020\005\"\016\020\000\032\0020\001X\004¢\006\002\n\000¨\006\n"}, d2 = {"logger", "Lcom/intellij/openapi/diagnostic/Logger;", "isAnySelected", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;", "desiredState", "", "(Lkotlinx/coroutines/flow/StateFlow;[Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;)Lkotlinx/coroutines/flow/StateFlow;", "isAuthenticated", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nGrazieAuthService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrazieAuthService.kt\ncom/intellij/ml/llm/core/grazieAPI/GrazieAuthServiceKt\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,333:1\n10#2:334\n*S KotlinDebug\n*F\n+ 1 GrazieAuthService.kt\ncom/intellij/ml/llm/core/grazieAPI/GrazieAuthServiceKt\n*L\n29#1:334\n*E\n"})
/*     */ public final class GrazieAuthServiceKt
/*     */ {
/*     */   static {
/*  29 */     int $i$f$logger = 0;
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
/* 334 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(GrazieAuthService.class), "getInstance(T::class.java)"); } @NotNull private static final Logger logger = Logger.getInstance(GrazieAuthService.class);
/*     */   
/*     */   public static final boolean isAuthenticated(@NotNull GrazieAuthState $this$isAuthenticated) {
/*     */     Intrinsics.checkNotNullParameter($this$isAuthenticated, "<this>");
/*     */     return ($this$isAuthenticated == GrazieAuthState.Authed);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final StateFlow<Boolean> isAnySelected(@NotNull StateFlow $this$isAnySelected, @NotNull GrazieAuthState... desiredState) {
/*     */     Intrinsics.checkNotNullParameter($this$isAnySelected, "<this>");
/*     */     Intrinsics.checkNotNullParameter(desiredState, "desiredState");
/*     */     return DerivedStateFlowKt.mapState($this$isAnySelected, new GrazieAuthServiceKt$isAnySelected$1(desiredState));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;", "invoke", "(Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;)Ljava/lang/Boolean;"})
/*     */   static final class GrazieAuthServiceKt$isAnySelected$1 extends Lambda implements Function1<GrazieAuthState, Boolean> {
/*     */     GrazieAuthServiceKt$isAnySelected$1(GrazieAuthState[] $desiredState) {
/*     */       super(1);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Boolean invoke(@NotNull GrazieAuthState it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       return Boolean.valueOf(ArraysKt.contains((Object[])this.$desiredState, it));
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/grazieAPI/GrazieAuthServiceKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */