/*    */ package ai.grazie.model.cloud.sse.continuous;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000*\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\032&\020\000\032\002H\001\"\n\b\000\020\001\030\001*\0020\002*\0020\0032\006\020\004\032\0020\005H\b¢\006\002\020\006\0324\020\007\032\0020\005\"\b\b\000\020\001*\0020\005*\0020\0032\006\020\b\032\0020\t2\f\020\n\032\b\022\004\022\002H\0010\0132\b\b\002\020\f\032\0020\r\0329\020\016\032\0020\t\"\b\b\000\020\001*\0020\005*\0020\0032\006\020\b\032\002H\0012\f\020\017\032\b\022\004\022\002H\0010\0132\b\b\002\020\f\032\0020\r¢\006\002\020\020¨\006\021"}, d2 = {"handle", "T", "Lai/grazie/model/cloud/sse/continuous/Data;", "Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;", "event", "Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent;", "(Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent;)Lai/grazie/model/cloud/sse/continuous/Data;", "parse", "obj", "", "dataSerializer", "Lkotlinx/serialization/KSerializer;", "json", "Lai/grazie/utils/json/JSON;", "serialize", "serializer", "(Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent;Lkotlinx/serialization/KSerializer;Lai/grazie/utils/json/JSON;)Ljava/lang/String;", "model-cloud"})
/*    */ @SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\nai/grazie/model/cloud/sse/continuous/ExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 JSON.kt\nai/grazie/utils/json/JSON\n+ 4 Serializers.kt\nkotlinx/serialization/SerializersKt__SerializersKt\n+ 5 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,30:1\n1#2:31\n54#3,2:32\n50#3:34\n56#3,2:37\n24#4:35\n80#5:36\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\nai/grazie/model/cloud/sse/continuous/ExtensionsKt\n*L\n10#1:32,2\n10#1:34\n10#1:37,2\n10#1:35\n10#1:36\n*E\n"})
/*    */ public final class ExtensionsKt {
/*    */   @NotNull
/*    */   public static final <T extends ContinuousSSEEvent> ContinuousSSEEvent parse(@NotNull ContinuousSSEEvent.Companion $this$parse, @NotNull String obj, @NotNull KSerializer dataSerializer, @NotNull JSON json) {
/*    */     Object object2;
/*  9 */     Intrinsics.checkNotNullParameter($this$parse, "<this>"); Intrinsics.checkNotNullParameter(obj, "obj"); Intrinsics.checkNotNullParameter(dataSerializer, "dataSerializer"); Intrinsics.checkNotNullParameter(json, "json"); String type = json.parseStringValueOrNull(obj, "event_type");
/* 10 */     String it = type;
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
/* 31 */     int $i$a$-let-ExtensionsKt$parse$1 = 0; JSON jSON = json; String value$iv = "\"" + it + "\""; int $i$f$parseOrNull = 0;
/*    */     try {
/* 33 */       JSON this_$iv$iv = jSON; int $i$f$parse = 0;
/* 34 */       int $i$f$serializer = 0;
/* 35 */       KSerializer $this$cast$iv$iv$iv$iv = SerializersKt.serializer(Reflection.typeOf(ContinuousSSEEventType.class)); int $i$f$cast = 0;
/* 36 */       Intrinsics.checkNotNull($this$cast$iv$iv$iv$iv, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>"); object2 = this_$iv$iv.parse((DeserializationStrategy)$this$cast$iv$iv$iv$iv, value$iv);
/* 37 */     } catch (SerializationException e$iv) {}
/* 38 */     null; (type != null) ? object2 : null; switch ((((type != null) ? object2 : null) == null) ? -1 : WhenMappings.$EnumSwitchMapping$0[((type != null) ? object2 : null).ordinal()]) { case true: case true: case true: case true: default: throw new SerializationException("Unknown EventType: " + type + " not found or does not matches any event type, received object: " + obj); }  Object object1 = (type != null) ? object2 : null;
/*    */     int $i$a$-let-ExtensionsKt$parse$2 = 0;
/*    */     return (ContinuousSSEEvent)json.parse((DeserializationStrategy)object1, obj);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final <T extends ContinuousSSEEvent> String serialize(@NotNull ContinuousSSEEvent.Companion $this$serialize, @NotNull ContinuousSSEEvent obj, @NotNull KSerializer serializer, @NotNull JSON json) {
/*    */     Intrinsics.checkNotNullParameter($this$serialize, "<this>");
/*    */     Intrinsics.checkNotNullParameter(obj, "obj");
/*    */     Intrinsics.checkNotNullParameter(serializer, "serializer");
/*    */     Intrinsics.checkNotNullParameter(json, "json");
/*    */     return json.string((SerializationStrategy)serializer, obj);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/cloud/sse/continuous/ExtensionsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */