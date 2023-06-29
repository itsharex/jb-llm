/*     */ package com.intellij.ml.llm.core.grazieAPI;
/*     */ 
/*     */ import ai.grazie.nlp.encoder.tiktoken.cl100k.TiktokenCL100KBaseEncoder;
/*     */ import ai.grazie.utils.mpp.DataLoader;
/*     */ import ai.grazie.utils.mpp.RootStreamDataLoader;
/*     */ import java.io.InputStream;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.io.ByteStreamsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\022\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\031\020\003\032\0020\0042\006\020\005\032\0020\006H@ø\001\000¢\006\002\020\007J\020\020\b\032\0020\t2\006\020\005\032\0020\006H\026J\031\020\n\032\0020\0132\006\020\005\032\0020\006H@ø\001\000¢\006\002\020\007\002\004\n\002\b\031¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/core/grazieAPI/CL100KLoader;", "Lai/grazie/utils/mpp/RootStreamDataLoader;", "()V", "bytes", "", "path", "Lai/grazie/utils/mpp/DataLoader$Path;", "(Lai/grazie/utils/mpp/DataLoader$Path;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stream", "Ljava/io/InputStream;", "text", "", "intellij.ml.llm"})
/*     */ public final class CL100KLoader
/*     */   implements RootStreamDataLoader
/*     */ {
/*     */   @NotNull
/*     */   public static final CL100KLoader INSTANCE = new CL100KLoader();
/*     */   
/*     */   @NotNull
/*     */   public InputStream stream(@NotNull DataLoader.Path path) {
/* 138 */     Intrinsics.checkNotNullParameter(path, "path"); Intrinsics.checkNotNull(TiktokenCL100KBaseEncoder.class.getResourceAsStream(path.toAbsolutePath())); return TiktokenCL100KBaseEncoder.class.getResourceAsStream(path.toAbsolutePath());
/*     */   }
/*     */   @Nullable
/*     */   public Object bytes(@NotNull DataLoader.Path path, @NotNull Continuation $completion) {
/* 142 */     return ByteStreamsKt.readBytes(stream(path));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object text(@NotNull DataLoader.Path path, @NotNull Continuation<? super String> paramContinuation) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/core/grazieAPI/CL100KLoader$text$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/core/grazieAPI/CL100KLoader$text$1
/*     */     //   11: astore #4
/*     */     //   13: aload #4
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #4
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/core/grazieAPI/CL100KLoader$text$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/core/grazieAPI/CL100KLoader;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #4
/*     */     //   50: aload #4
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore_3
/*     */     //   56: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   59: astore #7
/*     */     //   61: aload #4
/*     */     //   63: getfield label : I
/*     */     //   66: tableswitch default -> 141, 0 -> 88, 1 -> 114
/*     */     //   88: aload_3
/*     */     //   89: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   92: aload_0
/*     */     //   93: aload_1
/*     */     //   94: aload #4
/*     */     //   96: aload #4
/*     */     //   98: iconst_1
/*     */     //   99: putfield label : I
/*     */     //   102: invokevirtual bytes : (Lai/grazie/utils/mpp/DataLoader$Path;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   105: dup
/*     */     //   106: aload #7
/*     */     //   108: if_acmpne -> 119
/*     */     //   111: aload #7
/*     */     //   113: areturn
/*     */     //   114: aload_3
/*     */     //   115: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   118: aload_3
/*     */     //   119: checkcast [B
/*     */     //   122: getstatic kotlin/text/Charsets.UTF_8 : Ljava/nio/charset/Charset;
/*     */     //   125: astore #5
/*     */     //   127: astore #6
/*     */     //   129: new java/lang/String
/*     */     //   132: dup
/*     */     //   133: aload #6
/*     */     //   135: aload #5
/*     */     //   137: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
/*     */     //   140: areturn
/*     */     //   141: new java/lang/IllegalStateException
/*     */     //   144: dup
/*     */     //   145: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   147: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   150: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #145	-> 59
/*     */     //   #146	-> 92
/*     */     //   #145	-> 111
/*     */     //   #146	-> 119
/*     */     //   #146	-> 140
/*     */     //   #145	-> 141
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   92	13	0	this	Lcom/intellij/ml/llm/core/grazieAPI/CL100KLoader;
/*     */     //   92	13	1	path	Lai/grazie/utils/mpp/DataLoader$Path;
/*     */     //   50	91	4	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   56	85	3	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "GrazieAPI.kt", l = {146}, i = {}, s = {}, n = {}, m = "text", c = "com.intellij.ml.llm.core.grazieAPI.CL100KLoader")
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
/*     */   static final class CL100KLoader$text$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     CL100KLoader$text$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return CL100KLoader.this.text(null, (Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/grazieAPI/CL100KLoader.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */