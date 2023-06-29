/*   */ package com.intellij.ml.llm.context;
/*   */ 
/*   */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\n\n\000\n\002\020\016\n\002\b\003\032\016\020\002\032\0020\0012\006\020\003\032\0020\001\"\016\020\000\032\0020\001XT¢\006\002\n\000¨\006\004"}, d2 = {"EMPTY_DATA", "", "addLineNumbers", "text", "intellij.ml.llm"})
/*   */ public final class ContextCollectionUtilsKt {
/*   */   @NotNull
/* 6 */   public static final String addLineNumbers(@NotNull String text) { Intrinsics.checkNotNullParameter(text, "text"); return 
/*   */       
/* 8 */       CollectionsKt.joinToString$default(CollectionsKt.withIndex(StringsKt.lines(text)), "\n", null, null, 0, null, ContextCollectionUtilsKt$addLineNumbers$1.INSTANCE, 30, null); } @NotNull public static final String EMPTY_DATA = "_"; @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\r\n\000\n\002\030\002\n\002\020\016\n\000\020\000\032\0020\0012\f\020\002\032\b\022\004\022\0020\0040\003H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/collections/IndexedValue;", "", "invoke"}) static final class ContextCollectionUtilsKt$addLineNumbers$1 extends Lambda implements Function1<IndexedValue<? extends String>, CharSequence> { public static final ContextCollectionUtilsKt$addLineNumbers$1 INSTANCE = new ContextCollectionUtilsKt$addLineNumbers$1(); ContextCollectionUtilsKt$addLineNumbers$1() { super(1); } @NotNull public final CharSequence invoke(@NotNull IndexedValue<String> param1IndexedValue) { Intrinsics.checkNotNullParameter(param1IndexedValue, "<name for destructuring parameter 0>"); int index = param1IndexedValue.component1(); String line = (String)param1IndexedValue.component2(); return "" + index + 1 + " " + index + 1; }
/*   */      }
/*   */ 
/*   */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/context/ContextCollectionUtilsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */