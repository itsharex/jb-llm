/*     */ package ai.grazie.utils;
/*     */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000(\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\002\b\004\n\002\020\002\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\003\032\022\020\000\032\0020\001*\0020\0012\006\020\002\032\0020\001\032\n\020\003\032\0020\001*\0020\001\032\022\020\004\032\0020\001*\0020\0012\006\020\005\032\0020\001\032\022\020\006\032\0020\001*\0020\0012\006\020\007\032\0020\001\032\n\020\b\032\0020\t*\0020\001\032\n\020\n\032\0020\t*\0020\001\032\n\020\013\032\0020\t*\0020\001\032\n\020\f\032\0020\001*\0020\001\032&\020\r\032\0020\016*\0060\017j\002`\0202\006\020\021\032\0020\0222\006\020\023\032\0020\0222\006\020\024\032\0020\001¨\006\025"}, d2 = {"alignCasingTo", "", "other", "capitalize", "dropPostfix", "postfix", "dropPrefix", "prefix", "isCapitalized", "", "isLowercase", "isUppercase", "normalizeAccents", "replace", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "start", "", "endExclusive", "value", "utils-common"})
/*     */ @SourceDebugExtension({"SMAP\nText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Text.kt\nai/grazie/utils/TextKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,135:1\n1#2:136\n1064#3,2:137\n1064#3,2:139\n1064#3,2:141\n*S KotlinDebug\n*F\n+ 1 Text.kt\nai/grazie/utils/TextKt\n*L\n30#1:137,2\n37#1:139,2\n45#1:141,2\n*E\n"})
/*     */ public final class TextKt {
/*     */   @NotNull
/*     */   public static final String dropPrefix(@NotNull String $this$dropPrefix, @NotNull String prefix) {
/*   7 */     Intrinsics.checkNotNullParameter($this$dropPrefix, "<this>"); Intrinsics.checkNotNullParameter(prefix, "prefix"); return StringsKt.startsWith$default($this$dropPrefix, prefix, false, 2, null) ? 
/*   8 */       StringsKt.drop($this$dropPrefix, prefix.length()) : 
/*     */       
/*  10 */       $this$dropPrefix;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final String dropPostfix(@NotNull String $this$dropPostfix, @NotNull String postfix) {
/*  15 */     Intrinsics.checkNotNullParameter($this$dropPostfix, "<this>"); Intrinsics.checkNotNullParameter(postfix, "postfix"); return StringsKt.endsWith$default($this$dropPostfix, postfix, false, 2, null) ? 
/*  16 */       StringsKt.dropLast($this$dropPostfix, postfix.length()) : 
/*     */       
/*  18 */       $this$dropPostfix;
/*     */   }
/*     */   @NotNull
/*     */   public static final String capitalize(@NotNull String $this$capitalize) {
/*  22 */     Intrinsics.checkNotNullParameter($this$capitalize, "<this>"); String str1 = $this$capitalize; char c = str1.charAt(0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 136 */     StringBuilder stringBuilder = new StringBuilder(); int $i$a$-replaceFirstCharWithCharSequence-TextKt$capitalize$1 = 0;
/*     */     String str2 = str1;
/*     */     $i$a$-replaceFirstCharWithCharSequence-TextKt$capitalize$1 = 1;
/*     */     Intrinsics.checkNotNullExpressionValue(str2.substring($i$a$-replaceFirstCharWithCharSequence-TextKt$capitalize$1), "this as java.lang.String).substring(startIndex)");
/*     */     return ((str1.length() > 0)) ? stringBuilder.append(Character.isLowerCase(c) ? CharsKt.titlecase(c) : String.valueOf(c)).append(str2.substring($i$a$-replaceFirstCharWithCharSequence-TextKt$capitalize$1)).toString() : str1;
/*     */   }
/*     */   
/*     */   public static final boolean isCapitalized(@NotNull String $this$isCapitalized) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: checkcast java/lang/CharSequence
/*     */     //   10: invokestatic firstOrNull : (Ljava/lang/CharSequence;)Ljava/lang/Character;
/*     */     //   13: dup
/*     */     //   14: ifnull -> 26
/*     */     //   17: invokevirtual charValue : ()C
/*     */     //   20: invokestatic isUpperCase : (C)Z
/*     */     //   23: goto -> 28
/*     */     //   26: pop
/*     */     //   27: iconst_0
/*     */     //   28: ifeq -> 97
/*     */     //   31: aload_0
/*     */     //   32: iconst_1
/*     */     //   33: invokestatic drop : (Ljava/lang/String;I)Ljava/lang/String;
/*     */     //   36: checkcast java/lang/CharSequence
/*     */     //   39: astore_1
/*     */     //   40: iconst_0
/*     */     //   41: istore_2
/*     */     //   42: iconst_0
/*     */     //   43: istore_3
/*     */     //   44: iload_3
/*     */     //   45: aload_1
/*     */     //   46: invokeinterface length : ()I
/*     */     //   51: if_icmpge -> 89
/*     */     //   54: aload_1
/*     */     //   55: iload_3
/*     */     //   56: invokeinterface charAt : (I)C
/*     */     //   61: istore #4
/*     */     //   63: iload #4
/*     */     //   65: istore #5
/*     */     //   67: iconst_0
/*     */     //   68: istore #6
/*     */     //   70: iload #5
/*     */     //   72: invokestatic isLowerCase : (C)Z
/*     */     //   75: nop
/*     */     //   76: ifne -> 83
/*     */     //   79: iconst_0
/*     */     //   80: goto -> 90
/*     */     //   83: iinc #3, 1
/*     */     //   86: goto -> 44
/*     */     //   89: iconst_1
/*     */     //   90: ifeq -> 97
/*     */     //   93: iconst_1
/*     */     //   94: goto -> 98
/*     */     //   97: iconst_0
/*     */     //   98: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #30	-> 6
/*     */     //   #30	-> 23
/*     */     //   #137	-> 42
/*     */     //   #30	-> 70
/*     */     //   #30	-> 75
/*     */     //   #137	-> 76
/*     */     //   #138	-> 89
/*     */     //   #30	-> 98
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   70	6	6	$i$a$-all-TextKt$isCapitalized$1	I
/*     */     //   67	9	5	it	C
/*     */     //   63	20	4	element$iv	C
/*     */     //   42	48	2	$i$f$all	I
/*     */     //   40	50	1	$this$all$iv	Ljava/lang/CharSequence;
/*     */     //   0	99	0	$this$isCapitalized	Ljava/lang/String;
/*     */   }
/*     */   
/*     */   public static final boolean isUppercase(@NotNull String $this$isUppercase) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: checkcast java/lang/CharSequence
/*     */     //   10: invokeinterface length : ()I
/*     */     //   15: ifle -> 22
/*     */     //   18: iconst_1
/*     */     //   19: goto -> 23
/*     */     //   22: iconst_0
/*     */     //   23: ifeq -> 88
/*     */     //   26: aload_0
/*     */     //   27: checkcast java/lang/CharSequence
/*     */     //   30: astore_1
/*     */     //   31: iconst_0
/*     */     //   32: istore_2
/*     */     //   33: iconst_0
/*     */     //   34: istore_3
/*     */     //   35: iload_3
/*     */     //   36: aload_1
/*     */     //   37: invokeinterface length : ()I
/*     */     //   42: if_icmpge -> 80
/*     */     //   45: aload_1
/*     */     //   46: iload_3
/*     */     //   47: invokeinterface charAt : (I)C
/*     */     //   52: istore #4
/*     */     //   54: iload #4
/*     */     //   56: istore #5
/*     */     //   58: iconst_0
/*     */     //   59: istore #6
/*     */     //   61: iload #5
/*     */     //   63: invokestatic isUpperCase : (C)Z
/*     */     //   66: nop
/*     */     //   67: ifne -> 74
/*     */     //   70: iconst_0
/*     */     //   71: goto -> 81
/*     */     //   74: iinc #3, 1
/*     */     //   77: goto -> 35
/*     */     //   80: iconst_1
/*     */     //   81: ifeq -> 88
/*     */     //   84: iconst_1
/*     */     //   85: goto -> 89
/*     */     //   88: iconst_0
/*     */     //   89: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #37	-> 6
/*     */     //   #37	-> 26
/*     */     //   #139	-> 33
/*     */     //   #37	-> 61
/*     */     //   #37	-> 66
/*     */     //   #139	-> 67
/*     */     //   #140	-> 80
/*     */     //   #37	-> 89
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   61	6	6	$i$a$-all-TextKt$isUppercase$1	I
/*     */     //   58	9	5	it	C
/*     */     //   54	20	4	element$iv	C
/*     */     //   33	48	2	$i$f$all	I
/*     */     //   31	50	1	$this$all$iv	Ljava/lang/CharSequence;
/*     */     //   0	90	0	$this$isUppercase	Ljava/lang/String;
/*     */   }
/*     */   
/*     */   public static final boolean isLowercase(@NotNull String $this$isLowercase) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: checkcast java/lang/CharSequence
/*     */     //   10: invokeinterface length : ()I
/*     */     //   15: ifle -> 22
/*     */     //   18: iconst_1
/*     */     //   19: goto -> 23
/*     */     //   22: iconst_0
/*     */     //   23: ifeq -> 88
/*     */     //   26: aload_0
/*     */     //   27: checkcast java/lang/CharSequence
/*     */     //   30: astore_1
/*     */     //   31: iconst_0
/*     */     //   32: istore_2
/*     */     //   33: iconst_0
/*     */     //   34: istore_3
/*     */     //   35: iload_3
/*     */     //   36: aload_1
/*     */     //   37: invokeinterface length : ()I
/*     */     //   42: if_icmpge -> 80
/*     */     //   45: aload_1
/*     */     //   46: iload_3
/*     */     //   47: invokeinterface charAt : (I)C
/*     */     //   52: istore #4
/*     */     //   54: iload #4
/*     */     //   56: istore #5
/*     */     //   58: iconst_0
/*     */     //   59: istore #6
/*     */     //   61: iload #5
/*     */     //   63: invokestatic isLowerCase : (C)Z
/*     */     //   66: nop
/*     */     //   67: ifne -> 74
/*     */     //   70: iconst_0
/*     */     //   71: goto -> 81
/*     */     //   74: iinc #3, 1
/*     */     //   77: goto -> 35
/*     */     //   80: iconst_1
/*     */     //   81: ifeq -> 88
/*     */     //   84: iconst_1
/*     */     //   85: goto -> 89
/*     */     //   88: iconst_0
/*     */     //   89: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #45	-> 6
/*     */     //   #45	-> 26
/*     */     //   #141	-> 33
/*     */     //   #45	-> 61
/*     */     //   #45	-> 66
/*     */     //   #141	-> 67
/*     */     //   #142	-> 80
/*     */     //   #45	-> 89
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   61	6	6	$i$a$-all-TextKt$isLowercase$1	I
/*     */     //   58	9	5	it	C
/*     */     //   54	20	4	element$iv	C
/*     */     //   33	48	2	$i$f$all	I
/*     */     //   31	50	1	$this$all$iv	Ljava/lang/CharSequence;
/*     */     //   0	90	0	$this$isLowercase	Ljava/lang/String;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final String alignCasingTo(@NotNull String $this$alignCasingTo, @NotNull String other) {
/*     */     Intrinsics.checkNotNullParameter($this$alignCasingTo, "<this>");
/*     */     Intrinsics.checkNotNullParameter(other, "other");
/*     */     if (isLowercase(other)) {
/*     */       Intrinsics.checkNotNullExpressionValue($this$alignCasingTo.toLowerCase(Locale.ROOT), "this as java.lang.String).toLowerCase(Locale.ROOT)");
/*     */       return $this$alignCasingTo.toLowerCase(Locale.ROOT);
/*     */     } 
/*     */     if (isUppercase(other)) {
/*     */       Intrinsics.checkNotNullExpressionValue($this$alignCasingTo.toUpperCase(Locale.ROOT), "this as java.lang.String).toUpperCase(Locale.ROOT)");
/*     */       return $this$alignCasingTo.toUpperCase(Locale.ROOT);
/*     */     } 
/*     */     if (isCapitalized(other))
/*     */       return capitalize($this$alignCasingTo); 
/*     */     return $this$alignCasingTo;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final String normalizeAccents(@NotNull String $this$normalizeAccents) {
/*     */     Intrinsics.checkNotNullParameter($this$normalizeAccents, "<this>");
/*     */     StringBuilder stringBuilder1 = new StringBuilder(), $this$normalizeAccents_u24lambda_u244 = stringBuilder1;
/*     */     int $i$a$-buildString-TextKt$normalizeAccents$1 = 0;
/*     */     String mText = PolyfillJVMKt.normalizeToUnicode($this$normalizeAccents, true, false);
/*     */     byte b;
/*     */     int i;
/*     */     for (b = 0, i = mText.length(); b < i; ) {
/*     */       char char = mText.charAt(b);
/*     */       if (CharsKt.getCategory(char) != CharCategory.NON_SPACING_MARK)
/*     */         $this$normalizeAccents_u24lambda_u244.append(char); 
/*     */       b++;
/*     */     } 
/*     */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()");
/*     */     return stringBuilder1.toString();
/*     */   }
/*     */   
/*     */   public static final void replace(@NotNull StringBuilder $this$replace, int start, int endExclusive, @NotNull String value) {
/*     */     Intrinsics.checkNotNullParameter($this$replace, "<this>");
/*     */     Intrinsics.checkNotNullParameter(value, "value");
/*     */     Intrinsics.checkNotNullExpressionValue($this$replace.toString(), "this.toString()");
/*     */     String text = $this$replace.toString();
/*     */     StringsKt.clear($this$replace);
/*     */     Intrinsics.checkNotNullExpressionValue(text.substring(0, start), "this as java.lang.String…ing(startIndex, endIndex)");
/*     */     $this$replace.append(text.substring(0, start));
/*     */     $this$replace.append(value);
/*     */     Intrinsics.checkNotNullExpressionValue(text.substring(endExclusive, value.length()), "this as java.lang.String…ing(startIndex, endIndex)");
/*     */     $this$replace.append(text.substring(endExclusive, value.length()));
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/TextKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */