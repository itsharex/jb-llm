/*    */ package ai.grazie.auth.model;
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\006\b\007\030\000 \0272\0020\001:\001\027B\r\022\006\020\002\032\0020\003¢\006\002\020\004R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\007\020\bR\023\020\t\032\004\030\0010\006¢\006\b\n\000\032\004\b\n\020\bR\023\020\013\032\004\030\0010\f¢\006\b\n\000\032\004\b\r\020\016R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\017\020\020R\027\020\021\032\0020\022¢\006\016\n\000\022\004\b\023\020\024\032\004\b\025\020\026¨\006\030"}, d2 = {"Lai/grazie/auth/model/GrazieUserToken;", "", "token", "Lai/grazie/utils/jwt/JWTToken;", "(Lai/grazie/utils/jwt/JWTToken;)V", "expiration", "Lai/grazie/utils/mpp/time/Timestamp;", "getExpiration", "()Lai/grazie/utils/mpp/time/Timestamp;", "registration", "getRegistration", "state", "Lai/grazie/auth/model/GrazieUserState;", "getState", "()Lai/grazie/auth/model/GrazieUserState;", "getToken", "()Lai/grazie/utils/jwt/JWTToken;", "uid", "Lai/grazie/utils/mpp/UUID;", "getUid$annotations", "()V", "getUid", "()Lai/grazie/utils/mpp/UUID;", "Companion", "auth-model"})
/*    */ @SourceDebugExtension({"SMAP\nGrazieUserToken.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrazieUserToken.kt\nai/grazie/auth/model/GrazieUserToken\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,19:1\n1#2:20\n*E\n"})
/*    */ public final class GrazieUserToken { @NotNull
/*    */   public static final Companion Companion = new Companion(null); @NotNull
/*    */   private final JWTToken token; @NotNull
/*    */   private final UUID uid; @NotNull
/*  8 */   public final JWTToken getToken() { return this.token; }
/*    */   @NotNull private final Timestamp expiration; @Nullable private final Timestamp registration; @Nullable private final GrazieUserState state; public GrazieUserToken(@NotNull JWTToken token) { // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'token'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: invokespecial <init> : ()V
/*    */     //   10: aload_0
/*    */     //   11: aload_1
/*    */     //   12: putfield token : Lai/grazie/utils/jwt/JWTToken;
/*    */     //   15: aload_0
/*    */     //   16: aload_0
/*    */     //   17: getfield token : Lai/grazie/utils/jwt/JWTToken;
/*    */     //   20: ldc 'uid'
/*    */     //   22: invokevirtual getUUID : (Ljava/lang/String;)Lai/grazie/utils/mpp/UUID;
/*    */     //   25: dup
/*    */     //   26: ifnonnull -> 43
/*    */     //   29: pop
/*    */     //   30: new java/lang/IllegalStateException
/*    */     //   33: dup
/*    */     //   34: ldc 'Incorrect token provided'
/*    */     //   36: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   39: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   42: athrow
/*    */     //   43: putfield uid : Lai/grazie/utils/mpp/UUID;
/*    */     //   46: aload_0
/*    */     //   47: aload_0
/*    */     //   48: getfield token : Lai/grazie/utils/jwt/JWTToken;
/*    */     //   51: invokevirtual getExpiration : ()Lai/grazie/utils/mpp/time/Timestamp;
/*    */     //   54: putfield expiration : Lai/grazie/utils/mpp/time/Timestamp;
/*    */     //   57: aload_0
/*    */     //   58: aload_0
/*    */     //   59: getfield token : Lai/grazie/utils/jwt/JWTToken;
/*    */     //   62: ldc 'registration_date'
/*    */     //   64: invokevirtual getTimestamp : (Ljava/lang/String;)Lai/grazie/utils/mpp/time/Timestamp;
/*    */     //   67: putfield registration : Lai/grazie/utils/mpp/time/Timestamp;
/*    */     //   70: aload_0
/*    */     //   71: aload_0
/*    */     //   72: getfield token : Lai/grazie/utils/jwt/JWTToken;
/*    */     //   75: ldc 'user_state'
/*    */     //   77: invokevirtual getText : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   80: dup
/*    */     //   81: ifnull -> 179
/*    */     //   84: astore_2
/*    */     //   85: astore #10
/*    */     //   87: iconst_0
/*    */     //   88: istore_3
/*    */     //   89: invokestatic values : ()[Lai/grazie/auth/model/GrazieUserState;
/*    */     //   92: astore #4
/*    */     //   94: iconst_0
/*    */     //   95: istore #5
/*    */     //   97: aload #4
/*    */     //   99: arraylength
/*    */     //   100: istore #6
/*    */     //   102: iload #5
/*    */     //   104: iload #6
/*    */     //   106: if_icmpge -> 171
/*    */     //   109: aload #4
/*    */     //   111: iload #5
/*    */     //   113: aaload
/*    */     //   114: astore #7
/*    */     //   116: aload #7
/*    */     //   118: astore #8
/*    */     //   120: iconst_0
/*    */     //   121: istore #9
/*    */     //   123: aload #8
/*    */     //   125: invokevirtual name : ()Ljava/lang/String;
/*    */     //   128: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*    */     //   131: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*    */     //   134: dup
/*    */     //   135: ldc 'this as java.lang.String).toLowerCase(Locale.ROOT)'
/*    */     //   137: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   140: aload_2
/*    */     //   141: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*    */     //   144: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*    */     //   147: dup
/*    */     //   148: ldc 'this as java.lang.String).toLowerCase(Locale.ROOT)'
/*    */     //   150: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   153: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   156: nop
/*    */     //   157: ifeq -> 165
/*    */     //   160: aload #7
/*    */     //   162: goto -> 172
/*    */     //   165: iinc #5, 1
/*    */     //   168: goto -> 102
/*    */     //   171: aconst_null
/*    */     //   172: nop
/*    */     //   173: aload #10
/*    */     //   175: swap
/*    */     //   176: goto -> 181
/*    */     //   179: pop
/*    */     //   180: aconst_null
/*    */     //   181: putfield state : Lai/grazie/auth/model/GrazieUserState;
/*    */     //   184: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #7	-> 6
/*    */     //   #8	-> 10
/*    */     //   #10	-> 15
/*    */     //   #11	-> 46
/*    */     //   #12	-> 57
/*    */     //   #13	-> 70
/*    */     //   #20	-> 85
/*    */     //   #13	-> 89
/*    */     //   #20	-> 120
/*    */     //   #13	-> 123
/*    */     //   #13	-> 140
/*    */     //   #13	-> 156
/*    */     //   #13	-> 157
/*    */     //   #13	-> 172
/*    */     //   #13	-> 176
/*    */     //   #13	-> 179
/*    */     //   #8	-> 184
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   123	34	9	$i$a$-find-GrazieUserToken$state$1$1	I
/*    */     //   120	37	8	it	Lai/grazie/auth/model/GrazieUserState;
/*    */     //   89	84	3	$i$a$-let-GrazieUserToken$state$1	I
/*    */     //   87	86	2	value	Ljava/lang/String;
/*    */     //   0	185	0	this	Lai/grazie/auth/model/GrazieUserToken;
/*    */     //   0	185	1	token	Lai/grazie/utils/jwt/JWTToken; } @NotNull
/* 10 */   public final UUID getUid() { return this.uid; } @NotNull
/* 11 */   public final Timestamp getExpiration() { return this.expiration; } @Nullable
/* 12 */   public final Timestamp getRegistration() { return this.registration; } @Nullable
/* 13 */   public final GrazieUserState getState() { return this.state; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006¨\006\007"}, d2 = {"Lai/grazie/auth/model/GrazieUserToken$Companion;", "", "()V", "decode", "Lai/grazie/auth/model/GrazieUserToken;", "token", "", "auth-model"})
/*    */   public static final class Companion { private Companion() {} @NotNull
/*    */     public final GrazieUserToken decode(@NotNull String token) {
/* 16 */       Intrinsics.checkNotNullParameter(token, "token"); return new GrazieUserToken(new JWTToken(token));
/*    */     } }
/*    */    }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/auth/model/GrazieUserToken.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */