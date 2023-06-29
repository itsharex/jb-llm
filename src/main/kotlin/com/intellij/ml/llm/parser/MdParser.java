/*    */ package com.intellij.ml.llm.parser;
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\000\030\0002\0020\001B\005¢\006\002\020\002J\024\020\003\032\b\022\004\022\0020\0050\0042\006\020\006\032\0020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/parser/MdParser;", "", "()V", "parse", "", "Lcom/intellij/ml/llm/parser/TextChunk;", "text", "", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nMdParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MdParser.kt\ncom/intellij/ml/llm/parser/MdParser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,30:1\n1864#2,3:31\n*S KotlinDebug\n*F\n+ 1 MdParser.kt\ncom/intellij/ml/llm/parser/MdParser\n*L\n8#1:31,3\n*E\n"})
/*    */ public final class MdParser {
/*    */   @NotNull
/*    */   public final List<TextChunk> parse(@NotNull String text) {
/*  7 */     Intrinsics.checkNotNullParameter(text, "text"); List<CodeChunk> chunks = new ArrayList();
/*  8 */     String[] arrayOfString = new String[1]; arrayOfString[0] = "```"; Iterable $this$forEachIndexed$iv = StringsKt.split$default(text, arrayOfString, false, 0, 6, null); int $i$f$forEachIndexed = 0;
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
/* 31 */     int index$iv = 0;
/* 32 */     Iterator iterator = $this$forEachIndexed$iv.iterator(); if (iterator.hasNext()) { Object item$iv = iterator.next(); int i = index$iv++; if (i < 0) CollectionsKt.throwIndexOverflow();  String str = (String)item$iv; int index = i, $i$a$-forEachIndexed-MdParser$parse$1 = 0;
/*    */       if (index % 2 == 1) {
/*    */         List lines = StringsKt.lines(str);
/*    */         String languageName = (!lines.isEmpty()) ? StringsKt.trim((CharSequence)CollectionsKt.first(lines)).toString() : "";
/*    */         int codeStartIndex = languageName.length() + 1;
/*    */         Intrinsics.checkNotNullExpressionValue(str.substring(RangesKt.coerceAtMost(codeStartIndex, str.length())), "this as java.lang.String).substring(startIndex)");
/*    */         chunks.add(new CodeChunk(str.substring(RangesKt.coerceAtMost(codeStartIndex, str.length())), languageName));
/*    */       } else {
/*    */         chunks.add(new TextChunk(str));
/*    */       }  }
/*    */     
/*    */     return (List)chunks;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/parser/MdParser.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */