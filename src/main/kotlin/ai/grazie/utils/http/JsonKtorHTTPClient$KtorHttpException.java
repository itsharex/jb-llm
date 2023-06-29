/*    */ package ai.grazie.utils.http;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\002\n\002\020\003\n\002\b\004\030\0002\0060\001j\002`\002B-\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\n\b\002\020\007\032\004\030\0010\006\022\n\b\002\020\b\032\004\030\0010\t¢\006\002\020\nR\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\013\020\f¨\006\r"}, d2 = {"Lai/grazie/utils/http/JsonKtorHTTPClient$KtorHttpException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "code", "", "url", "", "message", "cause", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "getCode", "()I", "utils-ktor"})
/*    */ @SourceDebugExtension({"SMAP\nJsonKtorHTTPClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonKtorHTTPClient.kt\nai/grazie/utils/http/JsonKtorHTTPClient$KtorHttpException\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,217:1\n1#2:218\n*E\n"})
/*    */ public final class KtorHttpException
/*    */   extends Exception
/*    */ {
/*    */   private final int code;
/*    */   
/*    */   public final int getCode() {
/* 69 */     return this.code;
/*    */   }
/*    */   
/*    */   public KtorHttpException(int code, @NotNull String url, @Nullable String message, @Nullable Throwable cause) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: ldc 'url'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: aload_2
/*    */     //   8: iload_1
/*    */     //   9: aload_3
/*    */     //   10: dup
/*    */     //   11: ifnull -> 102
/*    */     //   14: astore #5
/*    */     //   16: aload #5
/*    */     //   18: astore #6
/*    */     //   20: istore #11
/*    */     //   22: astore #10
/*    */     //   24: astore #9
/*    */     //   26: iconst_0
/*    */     //   27: istore #7
/*    */     //   29: aload #6
/*    */     //   31: checkcast java/lang/CharSequence
/*    */     //   34: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
/*    */     //   37: ifne -> 44
/*    */     //   40: iconst_1
/*    */     //   41: goto -> 45
/*    */     //   44: iconst_0
/*    */     //   45: nop
/*    */     //   46: istore #12
/*    */     //   48: aload #9
/*    */     //   50: aload #10
/*    */     //   52: iload #11
/*    */     //   54: iload #12
/*    */     //   56: ifeq -> 64
/*    */     //   59: aload #5
/*    */     //   61: goto -> 65
/*    */     //   64: aconst_null
/*    */     //   65: dup
/*    */     //   66: ifnull -> 102
/*    */     //   69: astore #7
/*    */     //   71: istore #11
/*    */     //   73: astore #10
/*    */     //   75: astore #9
/*    */     //   77: iconst_0
/*    */     //   78: istore #8
/*    */     //   80: aload #7
/*    */     //   82: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   87: astore #12
/*    */     //   89: aload #9
/*    */     //   91: aload #10
/*    */     //   93: iload #11
/*    */     //   95: aload #12
/*    */     //   97: nop
/*    */     //   98: dup
/*    */     //   99: ifnonnull -> 105
/*    */     //   102: pop
/*    */     //   103: ldc ''
/*    */     //   105: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
/*    */     //   110: aload #4
/*    */     //   112: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   115: aload_0
/*    */     //   116: iload_1
/*    */     //   117: putfield code : I
/*    */     //   120: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #70	-> 6
/*    */     //   #218	-> 20
/*    */     //   #70	-> 29
/*    */     //   #70	-> 45
/*    */     //   #70	-> 56
/*    */     //   #70	-> 65
/*    */     //   #218	-> 71
/*    */     //   #70	-> 80
/*    */     //   #70	-> 97
/*    */     //   #70	-> 98
/*    */     //   #69	-> 115
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   29	17	7	$i$a$-takeIf-JsonKtorHTTPClient$KtorHttpException$1	I
/*    */     //   26	20	6	it	Ljava/lang/String;
/*    */     //   80	7	8	$i$a$-let-JsonKtorHTTPClient$KtorHttpException$2	I
/*    */     //   77	10	7	it	Ljava/lang/String;
/*    */     //   0	121	0	this	Lai/grazie/utils/http/JsonKtorHTTPClient$KtorHttpException;
/*    */     //   0	121	1	code	I
/*    */     //   0	121	2	url	Ljava/lang/String;
/*    */     //   0	121	3	message	Ljava/lang/String;
/*    */     //   0	121	4	cause	Ljava/lang/Throwable;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/http/JsonKtorHTTPClient$KtorHttpException.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */