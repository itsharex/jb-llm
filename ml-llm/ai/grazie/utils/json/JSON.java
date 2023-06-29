/*    */ package ai.grazie.utils.json;
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\004\n\002\020\022\n\002\b\004\n\002\030\002\n\002\b\003\n\002\020\016\n\000\n\002\030\002\n\002\b\f\b&\030\000 \0342\0020\001:\003\034\035\036B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\"\020\007\032\0020\b\"\n\b\000\020\t\030\001*\0020\0012\006\020\n\032\002H\tH\b¢\006\002\020\013J+\020\007\032\0020\b\"\b\b\000\020\t*\0020\0012\f\020\f\032\b\022\004\022\002H\t0\r2\006\020\n\032\002H\t¢\006\002\020\016J\"\020\017\032\002H\t\"\n\b\000\020\t\030\001*\0020\0012\006\020\n\032\0020\bH\b¢\006\002\020\020J\"\020\017\032\002H\t\"\n\b\000\020\t\030\001*\0020\0012\006\020\n\032\0020\021H\b¢\006\002\020\022J'\020\017\032\002H\t\"\004\b\000\020\t2\f\020\f\032\b\022\004\022\002H\t0\0232\006\020\n\032\0020\b¢\006\002\020\024J'\020\017\032\002H\t\"\004\b\000\020\t2\f\020\f\032\b\022\004\022\002H\t0\0232\006\020\n\032\0020\021¢\006\002\020\025J$\020\026\032\004\030\001H\t\"\n\b\000\020\t\030\001*\0020\0012\006\020\n\032\0020\021H\b¢\006\002\020\022J)\020\026\032\004\030\001H\t\"\004\b\000\020\t2\f\020\f\032\b\022\004\022\002H\t0\0232\006\020\n\032\0020\021¢\006\002\020\025J\030\020\027\032\004\030\0010\0212\006\020\n\032\0020\0212\006\020\030\032\0020\021J\"\020\031\032\0020\021\"\n\b\000\020\t\030\001*\0020\0012\006\020\n\032\002H\tH\b¢\006\002\020\032J+\020\031\032\0020\021\"\b\b\000\020\t*\0020\0012\f\020\f\032\b\022\004\022\002H\t0\r2\006\020\n\032\002H\t¢\006\002\020\033R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\037"}, d2 = {"Lai/grazie/utils/json/JSON;", "", "json", "Lkotlinx/serialization/json/Json;", "(Lkotlinx/serialization/json/Json;)V", "getJson", "()Lkotlinx/serialization/json/Json;", "bytes", "", "T", "value", "(Ljava/lang/Object;)[B", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)[B", "parse", "([B)Ljava/lang/Object;", "", "(Ljava/lang/String;)Ljava/lang/Object;", "Lkotlinx/serialization/DeserializationStrategy;", "(Lkotlinx/serialization/DeserializationStrategy;[B)Ljava/lang/Object;", "(Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;", "parseOrNull", "parseStringValueOrNull", "key", "string", "(Ljava/lang/Object;)Ljava/lang/String;", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;", "Companion", "Default", "Pretty", "utils-json"})
/*    */ @SourceDebugExtension({"SMAP\nJSON.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JSON.kt\nai/grazie/utils/json/JSON\n+ 2 Serializers.kt\nkotlinx/serialization/SerializersKt__SerializersKt\n+ 3 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,74:1\n50#1:81\n24#2:75\n24#2:77\n24#2:79\n24#2:82\n24#2:84\n80#3:76\n80#3:78\n80#3:80\n80#3:83\n80#3:85\n*S KotlinDebug\n*F\n+ 1 JSON.kt\nai/grazie/utils/json/JSON\n*L\n55#1:81\n28#1:75\n34#1:77\n50#1:79\n55#1:82\n67#1:84\n28#1:76\n34#1:78\n50#1:80\n55#1:83\n67#1:85\n*E\n"})
/*    */ public abstract class JSON { @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*  6 */   public JSON(@NotNull Json json) { this.json = json; } @NotNull private final Json json; @NotNull public final Json getJson() { return this.json; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006¨\006\007"}, d2 = {"Lai/grazie/utils/json/JSON$Companion;", "", "()V", "build", "Lai/grazie/utils/json/JSON;", "json", "Lkotlinx/serialization/json/Json;", "utils-json"})
/*    */   public static final class Companion { private Companion() {} @NotNull
/*  8 */     public final JSON build(@NotNull Json json) { Intrinsics.checkNotNullParameter(json, "json"); return new JSON$Companion$build$1(json); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\013\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001¨\006\002"}, d2 = {"ai/grazie/utils/json/JSON$Companion$build$1", "Lai/grazie/utils/json/JSON;", "utils-json"}) public static final class JSON$Companion$build$1 extends JSON { JSON$Companion$build$1(Json $json) { super($json); } } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\002\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002¨\006\003"}, d2 = {"Lai/grazie/utils/json/JSON$Default;", "Lai/grazie/utils/json/JSON;", "()V", "utils-json"})
/*    */   public static final class Default extends JSON { @NotNull
/*    */     public static final Default INSTANCE = new Default(); private Default() {
/* 11 */       super(JsonKt.Json$default(null, null.INSTANCE, 1, null));
/*    */     } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\002\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002¨\006\003"}, d2 = {"Lai/grazie/utils/json/JSON$Pretty;", "Lai/grazie/utils/json/JSON;", "()V", "utils-json"})
/*    */   public static final class Pretty extends JSON { @NotNull
/*    */     public static final Pretty INSTANCE = new Pretty();
/*    */     private Pretty() {
/* 16 */       super(JsonKt.Json$default(null, null.INSTANCE, 1, null));
/*    */     } }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final <T> String string(@NotNull SerializationStrategy serializer, @NotNull Object value) {
/* 24 */     Intrinsics.checkNotNullParameter(serializer, "serializer"); Intrinsics.checkNotNullParameter(value, "value"); return this.json.encodeToString(serializer, value);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final <T> byte[] bytes(@NotNull SerializationStrategy<? super Object> serializer, @NotNull Object value) {
/* 31 */     Intrinsics.checkNotNullParameter(serializer, "serializer"); Intrinsics.checkNotNullParameter(value, "value"); return StringsKt.encodeToByteArray(string(serializer, value));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final <T> T parse(@NotNull DeserializationStrategy serializer, @NotNull String value) {
/* 38 */     Intrinsics.checkNotNullParameter(serializer, "serializer"); Intrinsics.checkNotNullParameter(value, "value"); return (T)this.json.decodeFromString(serializer, value);
/*    */   } @Nullable
/*    */   public final <T> T parseOrNull(@NotNull DeserializationStrategy<Object> serializer, @NotNull String value) {
/*    */     T t;
/* 42 */     Intrinsics.checkNotNullParameter(serializer, "serializer"); Intrinsics.checkNotNullParameter(value, "value"); 
/* 43 */     try { t = parse(serializer, value); }
/* 44 */     catch (SerializationException e)
/* 45 */     { return null; }  return t;
/*    */   }
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
/*    */   public final <T> T parse(@NotNull DeserializationStrategy serializer, @NotNull byte[] value) {
/* 63 */     Intrinsics.checkNotNullParameter(serializer, "serializer"); Intrinsics.checkNotNullParameter(value, "value"); return (T)this.json.decodeFromString(serializer, StringsKt.decodeToString(value));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final String parseStringValueOrNull(@NotNull String value, @NotNull String key) {
/* 71 */     Intrinsics.checkNotNullParameter(value, "value"); Intrinsics.checkNotNullParameter(key, "key"); JsonElementKt.getJsonPrimitive((JsonElement)JsonElementKt.getJsonObject(this.json.parseToJsonElement(value)).get(key)); return ((JsonElement)JsonElementKt.getJsonObject(this.json.parseToJsonElement(value)).get(key) != null && JsonElementKt.getJsonPrimitive((JsonElement)JsonElementKt.getJsonObject(this.json.parseToJsonElement(value)).get(key)) != null) ? JsonElementKt.getJsonPrimitive((JsonElement)JsonElementKt.getJsonObject(this.json.parseToJsonElement(value)).get(key)).getContent() : null;
/*    */   } }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/json/JSON.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */