/*    */ package ai.grazie.utils.attributes;@Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\032\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\032\"\020\000\032\022\022\004\022\0020\0020\001j\b\022\004\022\0020\002`\003*\0020\0042\006\020\005\032\0020\006¨\006\007"}, d2 = {"getComparator", "Ljava/util/Comparator;", "Lai/grazie/utils/attributes/Attributes$Value;", "Lkotlin/Comparator;", "Lai/grazie/utils/attributes/Attributes$Companion;", "key", "Lai/grazie/utils/attributes/Attributes$Key;", "utils-common"}) @SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\nai/grazie/utils/attributes/ExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,19:1\n1#2:20\n*E\n"})
/*    */ public final class ExtensionsKt { @NotNull
/*  3 */   public static final Comparator<Attributes.Value> getComparator(@NotNull Attributes.Companion $this$getComparator, @NotNull Attributes.Key key) { Intrinsics.checkNotNullParameter($this$getComparator, "<this>"); Intrinsics.checkNotNullParameter(key, "key"); Attributes.Key key1 = key;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 12 */     if (key1 instanceof Attributes.Key.Text) {  } else { throw new IllegalStateException(("Got non comparable key " + 
/*    */ 
/*    */ 
/*    */ 
/*    */           
/* 17 */           Reflection.getOrCreateKotlinClass(key.getClass()) + " with fqdn " + key).toString()); }
/*    */     
/*    */     return (key1 instanceof Attributes.Key.Long) ? ExtensionsKt::getComparator$lambda$1 : ((key1 instanceof Attributes.Key.Double) ? ExtensionsKt::getComparator$lambda$3 : (Comparator<Attributes.Value>)"JD-Core does not support Kotlin"); } private static final int getComparator$lambda$1(Attributes.Value a, Attributes.Value b) { if (!((a instanceof Attributes.Value.Long && b instanceof Attributes.Value.Long) ? 1 : 0))
/* 20 */     { int $i$a$-require-ExtensionsKt$getComparator$1$1 = 0; String str = "Unexpected type of value"; throw new IllegalArgumentException(str.toString()); }  return Intrinsics.compare(((Attributes.Value.Long)a).getValue(), ((Attributes.Value.Long)b).getValue()); } private static final int getComparator$lambda$3(Attributes.Value a, Attributes.Value b) { if (!((a instanceof Attributes.Value.Double && b instanceof Attributes.Value.Double) ? 1 : 0)) { int $i$a$-require-ExtensionsKt$getComparator$2$1 = 0; String str = "Unexpected type of value"; throw new IllegalArgumentException(str.toString()); }  return Double.compare(((Attributes.Value.Double)a).getValue(), ((Attributes.Value.Double)b).getValue()); } private static final int getComparator$lambda$5(Attributes.Value a, Attributes.Value b) { if (!((a instanceof Attributes.Value.Text && b instanceof Attributes.Value.Text) ? 1 : 0)) { int $i$a$-require-ExtensionsKt$getComparator$3$1 = 0;
/*    */       String str = "Unexpected type of value";
/*    */       throw new IllegalArgumentException(str.toString()); }
/*    */     
/*    */     return ((Attributes.Value.Text)a).getValue().compareTo(((Attributes.Value.Text)b).getValue()); }
/*    */    }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/attributes/ExtensionsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */