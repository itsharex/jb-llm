/*    */ package ai.grazie.nlp.utils;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\f\n\000\n\002\020 \n\002\020\016\n\000\032\020\020\000\032\b\022\004\022\0020\0020\001*\0020\002¨\006\003"}, d2 = {"tokenizeByWhitespace", "", "", "nlp-common"})
/*    */ @SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\nai/grazie/nlp/utils/UtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n766#2:43\n857#2,2:44\n*S KotlinDebug\n*F\n+ 1 Utils.kt\nai/grazie/nlp/utils/UtilsKt\n*L\n41#1:43\n41#1:44,2\n*E\n"})
/*    */ public final class UtilsKt
/*    */ {
/*    */   @NotNull
/*    */   public static final List<String> tokenizeByWhitespace(@NotNull String $this$tokenizeByWhitespace) {
/* 41 */     Intrinsics.checkNotNullParameter($this$tokenizeByWhitespace, "<this>"); String[] arrayOfString = new String[1]; arrayOfString[0] = " "; Iterable $this$filter$iv = StringsKt.split$default($this$tokenizeByWhitespace, arrayOfString, false, 0, 6, null); int $i$f$filter = 0;
/*    */     
/* 43 */     Iterable iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 44 */     for (Object element$iv$iv : iterable1) { String it = (String)element$iv$iv; int $i$a$-filter-UtilsKt$tokenizeByWhitespace$1 = 0; if (!StringsKt.isBlank(it)) destination$iv$iv.add(element$iv$iv);  }
/* 45 */      return (List)destination$iv$iv;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/nlp/utils/UtilsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */