/*    */ package ai.grazie.model.cloud;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.text.Regex;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\007\bg\030\000 \0242\0020\001:\001\024J \020\b\032\0020\0032\n\b\002\020\t\032\004\030\0010\n2\n\b\002\020\013\032\004\030\0010\fH\026J(\020\r\032\0020\0162\006\020\002\032\0020\0032\n\b\002\020\t\032\004\030\0010\n2\n\b\002\020\013\032\004\030\0010\fH\026J \020\017\032\0020\0032\n\b\002\020\t\032\004\030\0010\n2\n\b\002\020\013\032\004\030\0010\fH\026J(\020\020\032\0020\0032\006\020\021\032\0020\0032\n\b\002\020\t\032\004\030\0010\n2\n\b\002\020\013\032\004\030\0010\fH\026J\f\020\022\032\0020\003*\0020\003H\002J\f\020\023\032\0020\003*\0020\003H\002R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\024\020\006\032\0020\0038VX\004¢\006\006\032\004\b\007\020\005ø\001\000\002\006\n\004\b!0\001¨\006\025À\006\001"}, d2 = {"Lai/grazie/model/cloud/API;", "", "path", "", "getPath", "()Ljava/lang/String;", "prefix", "getPrefix", "absolute", "type", "Lai/grazie/model/cloud/AuthType;", "version", "Lai/grazie/model/cloud/AuthVersion;", "match", "", "route", "url", "server", "fixDuplicatedSlashes", "trimSlashes", "Companion", "model-cloud"})
/*    */ @SourceDebugExtension({"SMAP\nAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 API.kt\nai/grazie/model/cloud/API\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
/*    */ public interface API {
/*    */   @NotNull
/*    */   default String getPrefix() {
/* 14 */     return "/";
/*    */   }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\016\020\003\032\0020\004X\004¢\006\002\n\000¨\006\005"}, d2 = {"Lai/grazie/model/cloud/API$Companion;", "", "()V", "slashes", "Lkotlin/text/Regex;", "model-cloud"})
/*    */   public static final class Companion
/*    */   {
/*    */     @NotNull
/* 22 */     private static final Regex slashes = new Regex("/+");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   default String route(@Nullable AuthType type, @Nullable AuthVersion version) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload_0
/*    */     //   2: iconst_4
/*    */     //   3: anewarray java/lang/String
/*    */     //   6: astore_3
/*    */     //   7: aload_3
/*    */     //   8: iconst_0
/*    */     //   9: aload_0
/*    */     //   10: invokeinterface getPrefix : ()Ljava/lang/String;
/*    */     //   15: aastore
/*    */     //   16: aload_3
/*    */     //   17: iconst_1
/*    */     //   18: aload_1
/*    */     //   19: dup
/*    */     //   20: ifnull -> 45
/*    */     //   23: invokevirtual name : ()Ljava/lang/String;
/*    */     //   26: dup
/*    */     //   27: ifnull -> 45
/*    */     //   30: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*    */     //   33: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*    */     //   36: dup
/*    */     //   37: ldc 'this as java.lang.String).toLowerCase(Locale.ROOT)'
/*    */     //   39: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   42: goto -> 47
/*    */     //   45: pop
/*    */     //   46: aconst_null
/*    */     //   47: aastore
/*    */     //   48: aload_3
/*    */     //   49: iconst_2
/*    */     //   50: aload_2
/*    */     //   51: dup
/*    */     //   52: ifnull -> 132
/*    */     //   55: astore #4
/*    */     //   57: aload #4
/*    */     //   59: astore #5
/*    */     //   61: istore #10
/*    */     //   63: astore #9
/*    */     //   65: astore #8
/*    */     //   67: astore #7
/*    */     //   69: iconst_0
/*    */     //   70: istore #6
/*    */     //   72: aload #5
/*    */     //   74: getstatic ai/grazie/model/cloud/AuthVersion.None : Lai/grazie/model/cloud/AuthVersion;
/*    */     //   77: if_acmpeq -> 84
/*    */     //   80: iconst_1
/*    */     //   81: goto -> 85
/*    */     //   84: iconst_0
/*    */     //   85: istore #11
/*    */     //   87: aload #7
/*    */     //   89: aload #8
/*    */     //   91: aload #9
/*    */     //   93: iload #10
/*    */     //   95: iload #11
/*    */     //   97: ifeq -> 105
/*    */     //   100: aload #4
/*    */     //   102: goto -> 106
/*    */     //   105: aconst_null
/*    */     //   106: dup
/*    */     //   107: ifnull -> 132
/*    */     //   110: invokevirtual name : ()Ljava/lang/String;
/*    */     //   113: dup
/*    */     //   114: ifnull -> 132
/*    */     //   117: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*    */     //   120: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*    */     //   123: dup
/*    */     //   124: ldc 'this as java.lang.String).toLowerCase(Locale.ROOT)'
/*    */     //   126: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   129: goto -> 134
/*    */     //   132: pop
/*    */     //   133: aconst_null
/*    */     //   134: aastore
/*    */     //   135: aload_3
/*    */     //   136: iconst_3
/*    */     //   137: aload_0
/*    */     //   138: invokeinterface getPath : ()Ljava/lang/String;
/*    */     //   143: aastore
/*    */     //   144: aload_3
/*    */     //   145: invokestatic listOfNotNull : ([Ljava/lang/Object;)Ljava/util/List;
/*    */     //   148: checkcast java/lang/Iterable
/*    */     //   151: ldc '/'
/*    */     //   153: checkcast java/lang/CharSequence
/*    */     //   156: aconst_null
/*    */     //   157: aconst_null
/*    */     //   158: iconst_0
/*    */     //   159: aconst_null
/*    */     //   160: aconst_null
/*    */     //   161: bipush #62
/*    */     //   163: aconst_null
/*    */     //   164: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*    */     //   167: invokespecial fixDuplicatedSlashes : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   170: invokespecial trimSlashes : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   173: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #33	-> 0
/*    */     //   #32	-> 1
/*    */     //   #30	-> 2
/*    */     //   #30	-> 45
/*    */     //   #72	-> 61
/*    */     //   #30	-> 72
/*    */     //   #30	-> 97
/*    */     //   #30	-> 106
/*    */     //   #30	-> 132
/*    */     //   #31	-> 151
/*    */     //   #32	-> 167
/*    */     //   #33	-> 170
/*    */     //   #30	-> 173
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   72	13	6	$i$a$-takeIf-API$route$1	I
/*    */     //   69	16	5	it	Lai/grazie/model/cloud/AuthVersion;
/*    */     //   0	174	0	this	Lai/grazie/model/cloud/API;
/*    */     //   0	174	1	type	Lai/grazie/model/cloud/AuthType;
/*    */     //   0	174	2	version	Lai/grazie/model/cloud/AuthVersion;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   default String absolute(@Nullable AuthType type, @Nullable AuthVersion version) {
/* 41 */     return fixDuplicatedSlashes("/" + route(type, version));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   default String url(@NotNull String server, @Nullable AuthType type, @Nullable AuthVersion version) {
/* 48 */     Intrinsics.checkNotNullParameter(server, "server"); String[] arrayOfString = new String[1]; arrayOfString[0] = "://"; List<String> list = StringsKt.split$default(trimSlashes(server), arrayOfString, false, 0, 6, null); String protocol = list.get(0), host = list.get(1);
/* 49 */     String route = route(type, version);
/* 50 */     return protocol + "://" + protocol + "/" + host;
/*    */   }
/*    */   
/*    */   default boolean match(@NotNull String path, @Nullable AuthType type, @Nullable AuthVersion version) {
/* 54 */     Intrinsics.checkNotNullParameter(path, "path"); return (Intrinsics.areEqual(path, route(type, version)) || Intrinsics.areEqual(path, absolute(type, version)));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private String fixDuplicatedSlashes(String $this$fixDuplicatedSlashes) {
/* 61 */     CharSequence charSequence = $this$fixDuplicatedSlashes; Regex regex = Companion.slashes; String str = "/"; return regex.replace(charSequence, str);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private String trimSlashes(String $this$trimSlashes) {
/* 68 */     char[] arrayOfChar = new char[1]; arrayOfChar[0] = '/'; return StringsKt.trim($this$trimSlashes, arrayOfChar);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   String getPath();
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/cloud/API.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */