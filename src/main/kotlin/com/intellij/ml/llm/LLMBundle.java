/*    */ package com.intellij.ml.llm;
/*    */ import java.util.Arrays;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.PropertyKey;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\021\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J5\020\003\032\f0\004¢\006\002\b\005¢\006\002\b\0062\b\b\001\020\007\032\0020\0042\022\020\b\032\n\022\006\b\001\022\0020\n0\t\"\0020\nH\007¢\006\002\020\013JH\020\f\032\037\022\026\022\024 \016*\t\030\0010\004¢\006\002\b\0060\004¢\006\002\b\0060\r¢\006\002\b\0052\b\b\001\020\007\032\0020\0042\022\020\b\032\n\022\006\b\001\022\0020\n0\t\"\0020\nH\007¢\006\002\020\017¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/LLMBundle;", "Lcom/intellij/DynamicBundle;", "()V", "message", "", "Lorg/jetbrains/annotations/NotNull;", "Lorg/jetbrains/annotations/Nls;", "key", "params", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "messagePointer", "Ljava/util/function/Supplier;", "kotlin.jvm.PlatformType", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/function/Supplier;", "intellij.ml.llm"})
/*    */ public final class LLMBundle extends DynamicBundle {
/*    */   private LLMBundle() {
/* 10 */     super("messages.LLMBundle");
/*    */   } @NotNull
/*    */   public static final LLMBundle INSTANCE = new LLMBundle(); @JvmStatic
/*    */   @NotNull
/*    */   public static final String message(@PropertyKey(resourceBundle = "messages.LLMBundle") @NotNull String key, @NotNull Object... params) {
/* 15 */     Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(params, "params"); Intrinsics.checkNotNullExpressionValue(INSTANCE.getMessage(key, Arrays.copyOf(params, params.length)), "getMessage(key, *params)"); return INSTANCE.getMessage(key, Arrays.copyOf(params, params.length));
/*    */   }
/*    */   @JvmStatic
/*    */   @NotNull
/*    */   public static final Supplier<String> messagePointer(@PropertyKey(resourceBundle = "messages.LLMBundle") @NotNull String key, @NotNull Object... params) {
/* 20 */     Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(params, "params"); Intrinsics.checkNotNullExpressionValue(INSTANCE.getLazyMessage(key, Arrays.copyOf(params, params.length)), "getLazyMessage(key, *params)"); return INSTANCE.getLazyMessage(key, Arrays.copyOf(params, params.length));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/LLMBundle.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */