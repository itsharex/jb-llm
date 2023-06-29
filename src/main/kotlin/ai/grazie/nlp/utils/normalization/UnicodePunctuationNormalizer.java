/*    */ package ai.grazie.nlp.utils.normalization;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\020$\n\002\020\f\n\002\020 \n\002\b\002\n\002\020\016\n\002\b\002\030\0002\0020\001B\017\022\b\b\002\020\002\032\0020\003¢\006\002\020\004J\020\020\n\032\0020\0132\006\020\f\032\0020\013H\026R \020\005\032\024\022\004\022\0020\007\022\n\022\b\022\004\022\0020\0070\b0\006X\004¢\006\002\n\000R\016\020\002\032\0020\003X\004¢\006\002\n\000R\032\020\t\032\016\022\004\022\0020\007\022\004\022\0020\0070\006X\004¢\006\002\n\000¨\006\r"}, d2 = {"Lai/grazie/nlp/utils/normalization/UnicodePunctuationNormalizer;", "Lai/grazie/nlp/utils/normalization/Normalizer;", "replaceApostropheWithQuote", "", "(Z)V", "asciiToUnicode", "", "", "", "unicodeToAscii", "normalize", "", "text", "nlp-common"})
/*    */ @SourceDebugExtension({"SMAP\nUnicodePunctuationNormalizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnicodePunctuationNormalizer.kt\nai/grazie/nlp/utils/normalization/UnicodePunctuationNormalizer\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,58:1\n215#2:59\n216#2:62\n1855#3,2:60\n970#4:63\n1041#4,3:64\n*S KotlinDebug\n*F\n+ 1 UnicodePunctuationNormalizer.kt\nai/grazie/nlp/utils/normalization/UnicodePunctuationNormalizer\n*L\n42#1:59\n42#1:62\n42#1:60,2\n48#1:63\n48#1:64,3\n*E\n"})
/*    */ public final class UnicodePunctuationNormalizer implements Normalizer {
/*    */   private final boolean replaceApostropheWithQuote;
/*    */   
/*  9 */   public UnicodePunctuationNormalizer(boolean replaceApostropheWithQuote) { this.replaceApostropheWithQuote = replaceApostropheWithQuote;
/*    */ 
/*    */     
/* 12 */     Pair[] arrayOfPair = new Pair[24]; Character[] arrayOfCharacter = new Character[3]; arrayOfCharacter[0] = Character.valueOf('​'); arrayOfCharacter[1] = Character.valueOf('⁠'); arrayOfCharacter[2] = Character.valueOf('﻿'); arrayOfPair[0] = TuplesKt.to(Character.valueOf(' '), CollectionsKt.listOf((Object[])arrayOfCharacter));
/* 13 */     arrayOfCharacter = new Character[2]; arrayOfCharacter[0] = Character.valueOf('ǃ'); arrayOfCharacter[1] = Character.valueOf('❢'); arrayOfPair[1] = TuplesKt.to(Character.valueOf('!'), CollectionsKt.listOf((Object[])arrayOfCharacter));
/* 14 */     arrayOfCharacter = new Character[17]; arrayOfCharacter[0] = Character.valueOf('«'); arrayOfCharacter[1] = Character.valueOf('»'); arrayOfCharacter[2] = Character.valueOf('ʺ'); arrayOfCharacter[3] = Character.valueOf('̋'); arrayOfCharacter[4] = Character.valueOf('̎'); arrayOfCharacter[5] = Character.valueOf('“'); arrayOfCharacter[6] = Character.valueOf('”'); arrayOfCharacter[7] = Character.valueOf('„'); arrayOfCharacter[8] = Character.valueOf('‟'); arrayOfCharacter[9] = Character.valueOf('″'); arrayOfCharacter[10] = Character.valueOf('‶'); arrayOfCharacter[11] = Character.valueOf('〃'); arrayOfCharacter[12] = Character.valueOf('〝'); arrayOfCharacter[13] = Character.valueOf('〞'); arrayOfCharacter[14] = Character.valueOf('〟'); arrayOfCharacter[15] = Character.valueOf('‴'); arrayOfCharacter[16] = Character.valueOf('‷'); arrayOfPair[2] = TuplesKt.to(Character.valueOf('"'), CollectionsKt.listOf((Object[])arrayOfCharacter));
/* 15 */     arrayOfPair[3] = TuplesKt.to(Character.valueOf('#'), CollectionsKt.listOf(Character.valueOf('♯')));
/* 16 */     arrayOfCharacter = new Character[2]; arrayOfCharacter[0] = Character.valueOf('٪'); arrayOfCharacter[1] = Character.valueOf('⁒'); arrayOfPair[4] = TuplesKt.to(Character.valueOf('%'), CollectionsKt.listOf((Object[])arrayOfCharacter));
/* 17 */     arrayOfCharacter = new Character[9]; arrayOfCharacter[0] = Character.valueOf('´'); arrayOfCharacter[1] = Character.valueOf('ʹ'); arrayOfCharacter[2] = Character.valueOf('ʼ'); arrayOfCharacter[3] = Character.valueOf('ˈ'); arrayOfCharacter[4] = Character.valueOf('́'); arrayOfCharacter[5] = Character.valueOf('‘'); arrayOfCharacter[6] = Character.valueOf('’'); arrayOfCharacter[7] = Character.valueOf('‛'); arrayOfCharacter[8] = Character.valueOf('′'); arrayOfPair[5] = TuplesKt.to(Character.valueOf('\''), CollectionsKt.listOf((Object[])arrayOfCharacter));
/* 18 */     arrayOfCharacter = new Character[4]; arrayOfCharacter[0] = Character.valueOf('٭'); arrayOfCharacter[1] = Character.valueOf('⁎'); arrayOfCharacter[2] = Character.valueOf('∗'); arrayOfCharacter[3] = Character.valueOf('✱'); arrayOfPair[6] = TuplesKt.to(Character.valueOf('*'), CollectionsKt.listOf((Object[])arrayOfCharacter));
/* 19 */     arrayOfPair[7] = TuplesKt.to(Character.valueOf(','), CollectionsKt.listOf(Character.valueOf('‚')));
/* 20 */     arrayOfCharacter = new Character[8]; char c = '­'; arrayOfCharacter[0] = Character.valueOf((char)c); arrayOfCharacter[1] = Character.valueOf('‐'); arrayOfCharacter[2] = Character.valueOf('‑'); arrayOfCharacter[3] = Character.valueOf('−'); arrayOfCharacter[4] = Character.valueOf('‒'); arrayOfCharacter[5] = Character.valueOf('–'); arrayOfCharacter[6] = Character.valueOf('—'); arrayOfCharacter[7] = Character.valueOf('―'); arrayOfPair[8] = TuplesKt.to(Character.valueOf('-'), CollectionsKt.listOf((Object[])arrayOfCharacter));
/* 21 */     arrayOfCharacter = new Character[4]; arrayOfCharacter[0] = Character.valueOf('÷'); arrayOfCharacter[1] = Character.valueOf('̸'); arrayOfCharacter[2] = Character.valueOf('⁄'); arrayOfCharacter[3] = Character.valueOf('∕'); arrayOfPair[9] = TuplesKt.to(Character.valueOf('/'), CollectionsKt.listOf((Object[])arrayOfCharacter));
/* 22 */     arrayOfCharacter = new Character[3]; arrayOfCharacter[0] = Character.valueOf('։'); arrayOfCharacter[1] = Character.valueOf('׃'); arrayOfCharacter[2] = Character.valueOf('∶'); arrayOfPair[10] = TuplesKt.to(Character.valueOf(':'), CollectionsKt.listOf((Object[])arrayOfCharacter));
/* 23 */     arrayOfCharacter = new Character[3]; arrayOfCharacter[0] = Character.valueOf('‹'); arrayOfCharacter[1] = Character.valueOf('〈'); arrayOfCharacter[2] = Character.valueOf('⟨'); arrayOfPair[11] = TuplesKt.to(Character.valueOf('<'), CollectionsKt.listOf((Object[])arrayOfCharacter));
/* 24 */     arrayOfCharacter = new Character[3]; arrayOfCharacter[0] = Character.valueOf('›'); arrayOfCharacter[1] = Character.valueOf('〉'); arrayOfCharacter[2] = Character.valueOf('⟩'); arrayOfPair[12] = TuplesKt.to(Character.valueOf('>'), CollectionsKt.listOf((Object[])arrayOfCharacter));
/* 25 */     arrayOfPair[13] = TuplesKt.to(Character.valueOf('?'), CollectionsKt.listOf(Character.valueOf('‽')));
/* 26 */     arrayOfPair[14] = TuplesKt.to(Character.valueOf('['), CollectionsKt.listOf(Character.valueOf('⟦')));
/* 27 */     arrayOfCharacter = new Character[2]; arrayOfCharacter[0] = Character.valueOf('⃥'); arrayOfCharacter[1] = Character.valueOf('∖'); arrayOfPair[15] = TuplesKt.to(Character.valueOf('\\'), CollectionsKt.listOf((Object[])arrayOfCharacter));
/* 28 */     arrayOfPair[16] = TuplesKt.to(Character.valueOf(']'), CollectionsKt.listOf(Character.valueOf('〛')));
/* 29 */     arrayOfCharacter = new Character[5]; arrayOfCharacter[0] = Character.valueOf('˄'); arrayOfCharacter[1] = Character.valueOf('ˆ'); arrayOfCharacter[2] = Character.valueOf('̂'); arrayOfCharacter[3] = Character.valueOf('‸'); arrayOfCharacter[4] = Character.valueOf('⌃'); arrayOfPair[17] = TuplesKt.to(Character.valueOf('^'), CollectionsKt.listOf((Object[])arrayOfCharacter));
/* 30 */     arrayOfCharacter = new Character[4]; arrayOfCharacter[0] = Character.valueOf('ˍ'); arrayOfCharacter[1] = Character.valueOf('̱'); arrayOfCharacter[2] = Character.valueOf('̲'); arrayOfCharacter[3] = Character.valueOf('‗'); arrayOfPair[18] = TuplesKt.to(Character.valueOf('_'), CollectionsKt.listOf((Object[])arrayOfCharacter));
/* 31 */     arrayOfCharacter = new Character[3]; arrayOfCharacter[0] = Character.valueOf('ˋ'); arrayOfCharacter[1] = Character.valueOf('̀'); arrayOfCharacter[2] = Character.valueOf('‵'); arrayOfPair[19] = TuplesKt.to(Character.valueOf('`'), CollectionsKt.listOf((Object[])arrayOfCharacter));
/* 32 */     arrayOfPair[20] = TuplesKt.to(Character.valueOf('{'), CollectionsKt.listOf(Character.valueOf('⦃')));
/* 33 */     arrayOfCharacter = new Character[4]; arrayOfCharacter[0] = Character.valueOf('ǀ'); arrayOfCharacter[1] = Character.valueOf('׀'); arrayOfCharacter[2] = Character.valueOf('∣'); arrayOfCharacter[3] = Character.valueOf('❘'); arrayOfPair[21] = TuplesKt.to(Character.valueOf('|'), CollectionsKt.listOf((Object[])arrayOfCharacter));
/* 34 */     arrayOfPair[22] = TuplesKt.to(Character.valueOf('}'), CollectionsKt.listOf(Character.valueOf('⦄')));
/* 35 */     arrayOfCharacter = new Character[5]; arrayOfCharacter[0] = Character.valueOf('˜'); arrayOfCharacter[1] = Character.valueOf('̃'); arrayOfCharacter[2] = Character.valueOf('⁓'); arrayOfCharacter[3] = Character.valueOf('∼'); arrayOfCharacter[4] = Character.valueOf('〜'); arrayOfPair[23] = TuplesKt.to(Character.valueOf('~'), CollectionsKt.listOf((Object[])arrayOfCharacter));
/*    */ 
/*    */     
/*    */     this.asciiToUnicode = MapsKt.mapOf(arrayOfPair);
/*    */ 
/*    */     
/* 41 */     HashMap<Object, Object> unicodeToAsciiMutable = new HashMap<>();
/* 42 */     Map<Character, List<Character>> $this$forEach$iv = this.asciiToUnicode; int $i$f$forEach = 0;
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
/* 59 */     Iterator<Map.Entry> iterator = $this$forEach$iv.entrySet().iterator(); if (iterator.hasNext()) { Map.Entry element$iv = iterator.next(), entry1 = element$iv; int $i$a$-forEach-UnicodePunctuationNormalizer$1 = 0; char ascii = ((Character)entry1.getKey()).charValue(); List unicodeList = (List)entry1.getValue(); Iterable iterable = unicodeList; int i = 0;
/* 60 */       Iterator iterator1 = iterable.iterator(); }
/*    */      this.unicodeToAscii = (Map)unicodeToAsciiMutable; } @NotNull private final Map<Character, List<Character>> asciiToUnicode; @NotNull private final Map<Character, Character> unicodeToAscii; @NotNull public String normalize(@NotNull String text) { Intrinsics.checkNotNullParameter(text, "text"); CharSequence $this$map$iv = text;
/*    */     int $i$f$map = 0;
/* 63 */     CharSequence charSequence1 = $this$map$iv; Collection destination$iv$iv = new ArrayList($this$map$iv.length()); int $i$f$mapTo = 0;
/* 64 */     for (byte b = 0; b < charSequence1.length(); character = Character.valueOf(c)) { Character character; char item$iv$iv = charSequence1.charAt(b);
/* 65 */       char c = item$iv$iv; Collection collection = destination$iv$iv; int $i$a$-map-UnicodePunctuationNormalizer$normalize$normalized$1 = 0; }
/* 66 */      String normalized = CollectionsKt.joinToString$default(destination$iv$iv, "", null, null, 0, null, null, 62, null);
/*    */     return normalized; }
/*    */ 
/*    */   
/*    */   public UnicodePunctuationNormalizer() {
/*    */     this(false, 1, null);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/nlp/utils/normalization/UnicodePunctuationNormalizer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */