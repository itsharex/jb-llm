/*   */ package com.intellij.ml.llm.context;
/*   */ import kotlin.collections.IndexedValue;
/*   */ 
/*   */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\r\n\000\n\002\030\002\n\002\020\016\n\000\020\000\032\0020\0012\f\020\002\032\b\022\004\022\0020\0040\003H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/collections/IndexedValue;", "", "invoke"})
/*   */ final class ContextCollectionUtilsKt$addLineNumbers$1 extends Lambda implements Function1<IndexedValue<? extends String>, CharSequence> {
/*   */   @NotNull
/*   */   public final CharSequence invoke(@NotNull IndexedValue<String> paramIndexedValue) {
/* 8 */     Intrinsics.checkNotNullParameter(paramIndexedValue, "<name for destructuring parameter 0>"); int index = paramIndexedValue.component1(); String line = (String)paramIndexedValue.component2(); return "" + index + 1 + " " + index + 1;
/*   */   }
/*   */   
/*   */   public static final ContextCollectionUtilsKt$addLineNumbers$1 INSTANCE = new ContextCollectionUtilsKt$addLineNumbers$1();
/*   */   
/*   */   ContextCollectionUtilsKt$addLineNumbers$1() {
/*   */     super(1);
/*   */   }
/*   */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/context/ContextCollectionUtilsKt$addLineNumbers$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */