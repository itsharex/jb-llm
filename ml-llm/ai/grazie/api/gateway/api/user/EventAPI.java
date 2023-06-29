/*    */ package ai.grazie.api.gateway.api.user;
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\bÆ\002\030\0002\0020\001:\001\003B\007\b\002¢\006\002\020\002¨\006\004"}, d2 = {"Lai/grazie/api/gateway/api/user/EventAPI;", "", "()V", "Connect", "api-gateway-api"})
/*    */ public final class EventAPI {
/*    */   @NotNull
/*    */   public static final EventAPI INSTANCE = new EventAPI();
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\004\bÆ\002\030\0002\0020\001:\001\007B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004XD¢\006\b\n\000\032\004\b\005\020\006¨\006\b"}, d2 = {"Lai/grazie/api/gateway/api/user/EventAPI$Connect;", "Lai/grazie/model/cloud/API;", "()V", "path", "", "getPath", "()Ljava/lang/String;", "Response", "api-gateway-api"})
/*    */   public static final class Connect implements API {
/*    */     @NotNull
/* 10 */     public static final Connect INSTANCE = new Connect(); @NotNull private static final String path = "/user/event/connect"; @NotNull public String getPath() { return path; } @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\"\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\b\030\000 \0352\0020\001:\002\034\035B)\b\027\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\b¢\006\002\020\tB\023\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\002\020\nJ\017\020\r\032\b\022\004\022\0020\0060\005HÆ\003J\031\020\016\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\003HÖ\001J\t\020\023\032\0020\024HÖ\001J!\020\025\032\0020\0262\006\020\027\032\0020\0002\006\020\030\032\0020\0312\006\020\032\032\0020\033HÇ\001R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\013\020\f¨\006\036"}, d2 = {"Lai/grazie/api/gateway/api/user/EventAPI$Connect$Response;", "", "seen1", "", "events", "", "Lai/grazie/user/storage/events/UserAttributeEvent;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/Set;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/Set;)V", "getEvents", "()Ljava/util/Set;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "api-gateway-api"})
/*    */     public static final class Response { @NotNull
/*    */       public static final Companion Companion = new Companion(null); @NotNull
/* 13 */       private final Set<UserAttributeEvent> events; public Response(@NotNull Set<UserAttributeEvent> events) { this.events = events; } @JvmStatic public static final void write$Self(@NotNull Response self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) { Intrinsics.checkNotNullParameter(self, "self"); Intrinsics.checkNotNullParameter(output, "output"); Intrinsics.checkNotNullParameter(serialDesc, "serialDesc"); output.encodeSerializableElement(serialDesc, 0, (SerializationStrategy)new LinkedHashSetSerializer(UserAttributeEvent.Companion.serializer()), self.events); } @NotNull public final Set<UserAttributeEvent> getEvents() { return this.events; }
/*    */ 
/*    */       
/*    */       @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/user/EventAPI.Connect.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/user/EventAPI$Connect$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*    */       public static final class $serializer implements GeneratedSerializer<Response> {
/*    */         @NotNull
/*    */         public static final $serializer INSTANCE = new $serializer();
/*    */         
/*    */         @NotNull
/*    */         public KSerializer<?>[] typeParametersSerializers() {
/*    */           return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*    */         }
/*    */         
/*    */         @NotNull
/*    */         public SerialDescriptor getDescriptor() {
/*    */           return (SerialDescriptor)descriptor;
/*    */         }
/*    */         
/*    */         @NotNull
/*    */         public KSerializer<?>[] childSerializers() {
/*    */           KSerializer[] arrayOfKSerializer = new KSerializer[1];
/*    */           arrayOfKSerializer[0] = (KSerializer)new LinkedHashSetSerializer(UserAttributeEvent.Companion.serializer());
/*    */           return (KSerializer<?>[])arrayOfKSerializer;
/*    */         }
/*    */         
/*    */         @NotNull
/*    */         public EventAPI.Connect.Response deserialize(@NotNull Decoder decoder) {
/*    */           Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */           SerialDescriptor serialDescriptor = getDescriptor();
/*    */           boolean bool = true;
/*    */           int i = 0;
/*    */           Object object = null;
/*    */           CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */           if (compositeDecoder.decodeSequentially()) {
/*    */             object = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)new LinkedHashSetSerializer(UserAttributeEvent.Companion.serializer()), object);
/*    */             i |= 0x1;
/*    */           } else {
/*    */             while (bool) {
/*    */               int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */               switch (j) {
/*    */                 case -1:
/*    */                   bool = false;
/*    */                   continue;
/*    */                 case 0:
/*    */                   object = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)new LinkedHashSetSerializer(UserAttributeEvent.Companion.serializer()), object);
/*    */                   i |= 0x1;
/*    */                   continue;
/*    */               } 
/*    */               throw new UnknownFieldException(j);
/*    */             } 
/*    */           } 
/*    */           compositeDecoder.endStructure(serialDescriptor);
/*    */           return new EventAPI.Connect.Response(i, (Set)object, null);
/*    */         }
/*    */         
/*    */         public void serialize(@NotNull Encoder encoder, @NotNull EventAPI.Connect.Response value) {
/*    */           Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */           Intrinsics.checkNotNullParameter(value, "value");
/*    */           SerialDescriptor serialDescriptor = getDescriptor();
/*    */           CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */           EventAPI.Connect.Response.write$Self(value, compositeEncoder, serialDescriptor);
/*    */           compositeEncoder.endStructure(serialDescriptor);
/*    */         }
/*    */         
/*    */         static {
/*    */           PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.user.EventAPI.Connect.Response", INSTANCE, 1);
/*    */           pluginGeneratedSerialDescriptor.addElement("events", false);
/*    */           descriptor = pluginGeneratedSerialDescriptor;
/*    */         }
/*    */       }
/*    */       
/*    */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/user/EventAPI$Connect$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/user/EventAPI$Connect$Response;", "api-gateway-api"})
/*    */       public static final class Companion {
/*    */         private Companion() {}
/*    */         
/*    */         @NotNull
/*    */         public final KSerializer<EventAPI.Connect.Response> serializer() {
/*    */           return (KSerializer<EventAPI.Connect.Response>)EventAPI.Connect.Response.$serializer.INSTANCE;
/*    */         }
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public final Set<UserAttributeEvent> component1() {
/*    */         return this.events;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public final Response copy(@NotNull Set<? extends UserAttributeEvent> events) {
/*    */         Intrinsics.checkNotNullParameter(events, "events");
/*    */         return new Response(events);
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public String toString() {
/*    */         return "Response(events=" + this.events + ")";
/*    */       }
/*    */       
/*    */       public int hashCode() {
/*    */         return this.events.hashCode();
/*    */       }
/*    */       
/*    */       public boolean equals(@Nullable Object other) {
/*    */         if (this == other)
/*    */           return true; 
/*    */         if (!(other instanceof Response))
/*    */           return false; 
/*    */         Response response = (Response)other;
/*    */         return !!Intrinsics.areEqual(this.events, response.events);
/*    */       } }
/*    */   
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/api/user/EventAPI.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */