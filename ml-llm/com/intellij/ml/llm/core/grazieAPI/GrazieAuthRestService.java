/*    */ package com.intellij.ml.llm.core.grazieAPI;
/*    */ 
/*    */ import com.intellij.openapi.application.ApplicationManager;
/*    */ import io.netty.buffer.Unpooled;
/*    */ import io.netty.channel.ChannelHandlerContext;
/*    */ import io.netty.handler.codec.http.FullHttpRequest;
/*    */ import io.netty.handler.codec.http.HttpRequest;
/*    */ import io.netty.handler.codec.http.HttpResponse;
/*    */ import io.netty.handler.codec.http.QueryStringDecoder;
/*    */ import java.net.URI;
/*    */ import java.util.List;
/*    */ import java.util.Locale;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Result;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.ide.HttpRequestHandler;
/*    */ import org.jetbrains.ide.RestService;
/*    */ import org.jetbrains.io.Responses;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\021\n\002\020\016\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\030\0002\0020\001B\005¢\006\002\020\002J\"\020\007\032\004\030\0010\0052\006\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\rH\026J\020\020\016\032\0020\0052\006\020\017\032\0020\005H\002J\b\020\020\032\0020\005H\024J\020\020\021\032\0020\0222\006\020\n\032\0020\023H\024J*\020\024\032\b\022\004\022\0020\0050\025*\0020\t2\006\020\026\032\0020\005H\002ø\001\000ø\001\001ø\001\002¢\006\004\b\027\020\030R\026\020\003\032\b\022\004\022\0020\0050\004X\004¢\006\004\n\002\020\006\002\017\n\002\b!\n\005\b¡\0360\001\n\002\b\031¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthRestService;", "Lorg/jetbrains/ide/RestService;", "()V", "allowedRootDomains", "", "", "[Ljava/lang/String;", "execute", "urlDecoder", "Lio/netty/handler/codec/http/QueryStringDecoder;", "request", "Lio/netty/handler/codec/http/FullHttpRequest;", "context", "Lio/netty/channel/ChannelHandlerContext;", "getSecondLevelDomain", "url", "getServiceName", "isOriginAllowed", "Lorg/jetbrains/ide/HttpRequestHandler$OriginCheckResult;", "Lio/netty/handler/codec/http/HttpRequest;", "safeGetParam", "Lkotlin/Result;", "name", "safeGetParam-gIAlu-s", "(Lio/netty/handler/codec/http/QueryStringDecoder;Ljava/lang/String;)Ljava/lang/Object;", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nGrazieAuthRestService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrazieAuthRestService.kt\ncom/intellij/ml/llm/core/grazieAPI/GrazieAuthRestService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n1#2:98\n*E\n"})
/*    */ public final class GrazieAuthRestService
/*    */   extends RestService
/*    */ {
/*    */   @NotNull
/*    */   private final String[] allowedRootDomains;
/*    */   
/*    */   @NotNull
/*    */   protected String getServiceName() {
/*    */     return "grazie-auth";
/*    */   }
/*    */   
/*    */   public GrazieAuthRestService() {
/* 58 */     String[] arrayOfString = new String[2]; arrayOfString[0] = "jetbrains.com"; arrayOfString[1] = 
/* 59 */       "grazie.ai"; this.allowedRootDomains = arrayOfString;
/*    */   }
/*    */   @Nullable public String execute(@NotNull QueryStringDecoder urlDecoder, @NotNull FullHttpRequest request, @NotNull ChannelHandlerContext context) { Intrinsics.checkNotNullParameter(urlDecoder, "urlDecoder"); Intrinsics.checkNotNullParameter(request, "request"); Intrinsics.checkNotNullParameter(context, "context"); RestService.Companion.sendResponse((HttpRequest)request, context, (HttpResponse)Responses.response("text/html", Unpooled.wrappedBuffer(GrazieAuthRestServiceConsts.INSTANCE.getRESPONSE_HTML(), 0, (GrazieAuthRestServiceConsts.INSTANCE.getRESPONSE_HTML()).length))); Object userState = safeGetParam-gIAlu-s(urlDecoder, "grazie-user-state"); if ((String)(Result.isFailure-impl(userState) ? null : (String)userState) != null) { Intrinsics.checkNotNullExpressionValue(((String)(Result.isFailure-impl(userState) ? null : (String)userState)).toLowerCase(Locale.ROOT), "this as java.lang.String).toLowerCase(Locale.ROOT)"); }
/*    */     else { ((String)(Result.isFailure-impl(userState) ? null : (String)userState)).toLowerCase(Locale.ROOT); }
/*    */      if (Intrinsics.areEqual(null, "wait_list")) { GrazieAuthRestServiceKt.access$getAuthNotifierExecutor$p().execute(GrazieAuthRestService::execute$lambda$0); return null; }
/*    */      Object token = safeGetParam-gIAlu-s(urlDecoder, "grazie-jwt-token"); String tokenString = Result.isFailure-impl(token) ? null : (String)token; if (tokenString != null) {
/*    */       ((GrazieAuthRestListener)ApplicationManager.getApplication().getMessageBus().syncPublisher(GrazieAuthRestServiceKt.getGrazieAuthRestTopic())).onAuthenticated(new GrazieAuthSuccessResult(tokenString));
/*    */     } else {
/*    */       GrazieAuthRestServiceKt.access$getAuthNotifierExecutor$p().execute(token::execute$lambda$1); RestService.LOG.warn("Authentication code is not present in request: " + request);
/*    */     }  return null; }
/*    */   private static final void execute$lambda$0() { ((GrazieAuthRestListener)ApplicationManager.getApplication().getMessageBus().syncPublisher(GrazieAuthRestServiceKt.getGrazieAuthRestTopic())).onAuthenticated(new GrazieAuthWaitListResult()); }
/*    */   private static final void execute$lambda$1(Object $token) { ((GrazieAuthRestListener)ApplicationManager.getApplication().getMessageBus().syncPublisher(GrazieAuthRestServiceKt.getGrazieAuthRestTopic())).onAuthenticated(new GrazieAuthFailureResult(Result.exceptionOrNull-impl($token))); } @NotNull protected HttpRequestHandler.OriginCheckResult isOriginAllowed(@NotNull HttpRequest request) { // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'request'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: invokestatic getReferrer : (Lio/netty/handler/codec/http/HttpRequest;)Ljava/lang/String;
/*    */     //   10: dup
/*    */     //   11: ifnull -> 57
/*    */     //   14: astore #4
/*    */     //   16: iconst_0
/*    */     //   17: istore #5
/*    */     //   19: aload_0
/*    */     //   20: aload #4
/*    */     //   22: invokespecial getSecondLevelDomain : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   25: nop
/*    */     //   26: dup
/*    */     //   27: ifnull -> 57
/*    */     //   30: astore #4
/*    */     //   32: iconst_0
/*    */     //   33: istore #5
/*    */     //   35: aload_0
/*    */     //   36: getfield allowedRootDomains : [Ljava/lang/String;
/*    */     //   39: aload #4
/*    */     //   41: invokestatic contains : ([Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   44: nop
/*    */     //   45: iconst_1
/*    */     //   46: if_icmpne -> 53
/*    */     //   49: iconst_1
/*    */     //   50: goto -> 59
/*    */     //   53: iconst_0
/*    */     //   54: goto -> 59
/*    */     //   57: pop
/*    */     //   58: iconst_0
/*    */     //   59: istore_2
/*    */     //   60: aload_0
/*    */     //   61: aload_1
/*    */     //   62: invokespecial isOriginAllowed : (Lio/netty/handler/codec/http/HttpRequest;)Lorg/jetbrains/ide/HttpRequestHandler$OriginCheckResult;
/*    */     //   65: astore_3
/*    */     //   66: aload_3
/*    */     //   67: getstatic org/jetbrains/ide/HttpRequestHandler$OriginCheckResult.ALLOW : Lorg/jetbrains/ide/HttpRequestHandler$OriginCheckResult;
/*    */     //   70: if_acmpeq -> 77
/*    */     //   73: iload_2
/*    */     //   74: ifeq -> 83
/*    */     //   77: getstatic org/jetbrains/ide/HttpRequestHandler$OriginCheckResult.ALLOW : Lorg/jetbrains/ide/HttpRequestHandler$OriginCheckResult;
/*    */     //   80: goto -> 86
/*    */     //   83: getstatic org/jetbrains/ide/HttpRequestHandler$OriginCheckResult.FORBID : Lorg/jetbrains/ide/HttpRequestHandler$OriginCheckResult;
/*    */     //   86: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #63	-> 6
/*    */     //   #98	-> 16
/*    */     //   #63	-> 19
/*    */     //   #63	-> 25
/*    */     //   #63	-> 26
/*    */     //   #98	-> 32
/*    */     //   #63	-> 35
/*    */     //   #63	-> 44
/*    */     //   #63	-> 45
/*    */     //   #64	-> 60
/*    */     //   #66	-> 66
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   19	6	5	$i$a$-let-GrazieAuthRestService$isOriginAllowed$goodCop$1	I
/*    */     //   16	9	4	it	Ljava/lang/String;
/*    */     //   35	9	5	$i$a$-let-GrazieAuthRestService$isOriginAllowed$goodCop$2	I
/*    */     //   32	12	4	it	Ljava/lang/String;
/*    */     //   60	27	2	goodCop	Z
/*    */     //   66	21	3	evilCop	Lorg/jetbrains/ide/HttpRequestHandler$OriginCheckResult;
/*    */     //   0	87	0	this	Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthRestService;
/* 70 */     //   0	87	1	request	Lio/netty/handler/codec/http/HttpRequest; } private final String getSecondLevelDomain(String url) { Intrinsics.checkNotNullExpressionValue((new URI(url)).getHost(), "URI(url).host"); char[] arrayOfChar = new char[1]; arrayOfChar[0] = '.'; List split = StringsKt.split$default((new URI(url)).getHost(), arrayOfChar, false, 0, 6, null);
/* 71 */     if (split.size() < 2) return url;
/*    */     
/* 73 */     return CollectionsKt.joinToString$default(CollectionsKt.takeLast(split, 2), ".", null, null, 0, null, GrazieAuthRestService$getSecondLevelDomain$1.INSTANCE, 30, null); } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\r\n\000\n\002\020\016\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}) static final class GrazieAuthRestService$getSecondLevelDomain$1 extends Lambda implements Function1<String, CharSequence> { public static final GrazieAuthRestService$getSecondLevelDomain$1 INSTANCE = new GrazieAuthRestService$getSecondLevelDomain$1(); GrazieAuthRestService$getSecondLevelDomain$1() { super(1); } @NotNull public final CharSequence invoke(@NotNull String it) { Intrinsics.checkNotNullParameter(it, "it"); return it; }
/*    */      }
/*    */   private final Object safeGetParam-gIAlu-s(QueryStringDecoder $this$safeGetParam_u2dgIAlu_u2ds, String name) {
/*    */     Object object;
/*    */     
/* 78 */     try { String res = RestService.Companion.getStringParameter(name, $this$safeGetParam_u2dgIAlu_u2ds);
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 83 */       object = (res != null) ? Result.constructor-impl(res) : Result.constructor-impl(ResultKt.createFailure(new Exception("Parameter " + name + " is not present in url query")));
/*    */        }
/*    */     
/* 86 */     catch (Throwable t)
/* 87 */     { object = Result.constructor-impl(ResultKt.createFailure(t)); }  return object;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/grazieAPI/GrazieAuthRestService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */