/*    */ package ai.grazie.auth.model.survey;@Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\021\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\024\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\b\030\000 02\0020\001:\002/0BW\b\027\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\016\020\n\032\n\022\004\022\0020\f\030\0010\013\022\016\020\r\032\n\022\004\022\0020\f\030\0010\013\022\b\020\016\032\004\030\0010\017¢\006\002\020\020BE\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\n\b\002\020\b\032\004\030\0010\t\022\020\b\002\020\n\032\n\022\004\022\0020\f\030\0010\013\022\020\b\002\020\r\032\n\022\004\022\0020\f\030\0010\013¢\006\002\020\021J\t\020\034\032\0020\005HÆ\003J\t\020\035\032\0020\007HÆ\003J\013\020\036\032\004\030\0010\tHÆ\003J\026\020\037\032\n\022\004\022\0020\f\030\0010\013HÆ\003¢\006\002\020\027J\026\020 \032\n\022\004\022\0020\f\030\0010\013HÆ\003¢\006\002\020\027JR\020!\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\n\b\002\020\b\032\004\030\0010\t2\020\b\002\020\n\032\n\022\004\022\0020\f\030\0010\0132\020\b\002\020\r\032\n\022\004\022\0020\f\030\0010\013HÆ\001¢\006\002\020\"J\023\020#\032\0020$2\b\020%\032\004\030\0010\001H\002J\b\020&\032\0020\003H\026J\t\020'\032\0020\fHÖ\001J!\020(\032\0020)2\006\020*\032\0020\0002\006\020+\032\0020,2\006\020-\032\0020.HÇ\001R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\022\020\023R\023\020\b\032\004\030\0010\t¢\006\b\n\000\032\004\b\024\020\025R\033\020\r\032\n\022\004\022\0020\f\030\0010\013¢\006\n\n\002\020\030\032\004\b\026\020\027R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\031\020\032R\033\020\n\032\n\022\004\022\0020\f\030\0010\013¢\006\n\n\002\020\030\032\004\b\033\020\027¨\0061"}, d2 = {"Lai/grazie/auth/model/survey/OnboardingSurveyDTO;", "", "seen1", "", "case", "Lai/grazie/auth/model/survey/GrazieUserUseCase;", "role", "Lai/grazie/auth/model/survey/GrazieUserWorkRole;", "company", "Lai/grazie/auth/model/survey/GrazieUserCompanySize;", "tools", "", "", "goals", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/auth/model/survey/GrazieUserUseCase;Lai/grazie/auth/model/survey/GrazieUserWorkRole;Lai/grazie/auth/model/survey/GrazieUserCompanySize;[Ljava/lang/String;[Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/auth/model/survey/GrazieUserUseCase;Lai/grazie/auth/model/survey/GrazieUserWorkRole;Lai/grazie/auth/model/survey/GrazieUserCompanySize;[Ljava/lang/String;[Ljava/lang/String;)V", "getCase", "()Lai/grazie/auth/model/survey/GrazieUserUseCase;", "getCompany", "()Lai/grazie/auth/model/survey/GrazieUserCompanySize;", "getGoals", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getRole", "()Lai/grazie/auth/model/survey/GrazieUserWorkRole;", "getTools", "component1", "component2", "component3", "component4", "component5", "copy", "(Lai/grazie/auth/model/survey/GrazieUserUseCase;Lai/grazie/auth/model/survey/GrazieUserWorkRole;Lai/grazie/auth/model/survey/GrazieUserCompanySize;[Ljava/lang/String;[Ljava/lang/String;)Lai/grazie/auth/model/survey/OnboardingSurveyDTO;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "auth-model"})
/*    */ public final class OnboardingSurveyDTO { @NotNull
/*    */   public static final Companion Companion = new Companion(null); @NotNull
/*    */   private final GrazieUserUseCase case; @NotNull
/*    */   private final GrazieUserWorkRole role; @Nullable
/*    */   private final GrazieUserCompanySize company; @Nullable
/*    */   private final String[] tools; @Nullable
/*  9 */   private final String[] goals; public OnboardingSurveyDTO(@NotNull GrazieUserUseCase case, @NotNull GrazieUserWorkRole role, @Nullable GrazieUserCompanySize company, @Nullable String[] tools, @Nullable String[] goals) { this.case = case;
/* 10 */     this.role = role;
/* 11 */     this.company = company;
/* 12 */     this.tools = tools;
/* 13 */     this.goals = goals; } @JvmStatic public static final void write$Self(@NotNull OnboardingSurveyDTO self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) { Intrinsics.checkNotNullParameter(self, "self"); Intrinsics.checkNotNullParameter(output, "output"); Intrinsics.checkNotNullParameter(serialDesc, "serialDesc"); output.encodeSerializableElement(serialDesc, 0, (SerializationStrategy)GrazieUserUseCase.$serializer.INSTANCE, self.case); output.encodeSerializableElement(serialDesc, 1, (SerializationStrategy)GrazieUserWorkRole.$serializer.INSTANCE, self.role); if (output.shouldEncodeElementDefault(serialDesc, 2) ? true : ((self.company != null))) output.encodeNullableSerializableElement(serialDesc, 2, (SerializationStrategy)GrazieUserCompanySize.$serializer.INSTANCE, self.company);  if (output.shouldEncodeElementDefault(serialDesc, 3) ? true : ((self.tools != null))) output.encodeNullableSerializableElement(serialDesc, 3, (SerializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(String.class), (KSerializer)StringSerializer.INSTANCE), self.tools);  if (output.shouldEncodeElementDefault(serialDesc, 4) ? true : ((self.goals != null))) output.encodeNullableSerializableElement(serialDesc, 4, (SerializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(String.class), (KSerializer)StringSerializer.INSTANCE), self.goals);  } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/auth/model/survey/OnboardingSurveyDTO.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/auth/model/survey/OnboardingSurveyDTO;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "auth-model"}) public static final class $serializer implements GeneratedSerializer<OnboardingSurveyDTO> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[5]; arrayOfKSerializer[0] = (KSerializer)GrazieUserUseCase.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)GrazieUserWorkRole.$serializer.INSTANCE; arrayOfKSerializer[2] = BuiltinSerializersKt.getNullable((KSerializer)GrazieUserCompanySize.$serializer.INSTANCE); arrayOfKSerializer[3] = BuiltinSerializersKt.getNullable((KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(String.class), (KSerializer)StringSerializer.INSTANCE)); arrayOfKSerializer[4] = BuiltinSerializersKt.getNullable((KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(String.class), (KSerializer)StringSerializer.INSTANCE)); return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public OnboardingSurveyDTO deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; Object object1 = null, object2 = null, object3 = null, object4 = null, object5 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)GrazieUserUseCase.$serializer.INSTANCE, object1); i |= 0x1; object2 = compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)GrazieUserWorkRole.$serializer.INSTANCE, object2); i |= 0x2; object3 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)GrazieUserCompanySize.$serializer.INSTANCE, object3); i |= 0x4; object4 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(String.class), (KSerializer)StringSerializer.INSTANCE), object4); i |= 0x8; object5 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(String.class), (KSerializer)StringSerializer.INSTANCE), object5); i |= 0x10; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)GrazieUserUseCase.$serializer.INSTANCE, object1); i |= 0x1; continue;case 1: object2 = compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)GrazieUserWorkRole.$serializer.INSTANCE, object2); i |= 0x2; continue;case 2: object3 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)GrazieUserCompanySize.$serializer.INSTANCE, object3); i |= 0x4; continue;case 3: object4 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(String.class), (KSerializer)StringSerializer.INSTANCE), object4); i |= 0x8; continue;case 4: object5 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(String.class), (KSerializer)StringSerializer.INSTANCE), object5); i |= 0x10; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new OnboardingSurveyDTO(i, (GrazieUserUseCase)object1, (GrazieUserWorkRole)object2, (GrazieUserCompanySize)object3, (String[])object4, (String[])object5, null); } public void serialize(@NotNull Encoder encoder, @NotNull OnboardingSurveyDTO value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); OnboardingSurveyDTO.write$Self(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.auth.model.survey.OnboardingSurveyDTO", INSTANCE, 5); pluginGeneratedSerialDescriptor.addElement("case", false); pluginGeneratedSerialDescriptor.addElement("role", false); pluginGeneratedSerialDescriptor.addElement("company", true); pluginGeneratedSerialDescriptor.addElement("tools", true); pluginGeneratedSerialDescriptor.addElement("goals", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/auth/model/survey/OnboardingSurveyDTO$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/auth/model/survey/OnboardingSurveyDTO;", "auth-model"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<OnboardingSurveyDTO> serializer() { return (KSerializer<OnboardingSurveyDTO>)OnboardingSurveyDTO.$serializer.INSTANCE; } } @Nullable public final String[] getGoals() { return this.goals; }
/*    */   @NotNull public final GrazieUserUseCase getCase() { return this.case; }
/*    */   @NotNull public final GrazieUserWorkRole getRole() { return this.role; }
/* 16 */   @Nullable public final GrazieUserCompanySize getCompany() { return this.company; } @Nullable public final String[] getTools() { return this.tools; } public boolean equals(@Nullable Object other) { if (this == other) return true; 
/* 17 */     if (other == null || getClass() != other.getClass()) return false;
/*    */     
/* 19 */     (OnboardingSurveyDTO)other;
/*    */     
/* 21 */     if (this.case != ((OnboardingSurveyDTO)other).case) return false; 
/* 22 */     if (this.role != ((OnboardingSurveyDTO)other).role) return false; 
/* 23 */     if (this.tools != null)
/* 24 */     { if (((OnboardingSurveyDTO)other).tools == null) return false; 
/* 25 */       if (!Arrays.equals((Object[])this.tools, (Object[])((OnboardingSurveyDTO)other).tools)) return false;  }
/* 26 */     else if (((OnboardingSurveyDTO)other).tools != null) { return false; }
/* 27 */      if (this.goals != null)
/* 28 */     { if (((OnboardingSurveyDTO)other).goals == null) return false; 
/* 29 */       if (!Arrays.equals((Object[])this.goals, (Object[])((OnboardingSurveyDTO)other).goals)) return false;  }
/* 30 */     else if (((OnboardingSurveyDTO)other).goals != null) { return false; }
/*    */     
/* 32 */     return true; }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 36 */     int result = this.case.hashCode();
/* 37 */     result = 31 * result + this.role.hashCode();
/* 38 */     result = 31 * result + ((this.tools != null) ? Arrays.hashCode((Object[])this.tools) : 0);
/* 39 */     result = 31 * result + ((this.goals != null) ? Arrays.hashCode((Object[])this.goals) : 0);
/* 40 */     return result;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final GrazieUserUseCase component1() {
/*    */     return this.case;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final GrazieUserWorkRole component2() {
/*    */     return this.role;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final GrazieUserCompanySize component3() {
/*    */     return this.company;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String[] component4() {
/*    */     return this.tools;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String[] component5() {
/*    */     return this.goals;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final OnboardingSurveyDTO copy(@NotNull GrazieUserUseCase case, @NotNull GrazieUserWorkRole role, @Nullable GrazieUserCompanySize company, @Nullable String[] tools, @Nullable String[] goals) {
/*    */     Intrinsics.checkNotNullParameter(case, "case");
/*    */     Intrinsics.checkNotNullParameter(role, "role");
/*    */     return new OnboardingSurveyDTO(case, role, company, tools, goals);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "OnboardingSurveyDTO(case=" + this.case + ", role=" + this.role + ", company=" + this.company + ", tools=" + Arrays.toString((Object[])this.tools) + ", goals=" + Arrays.toString((Object[])this.goals) + ")";
/*    */   } }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/auth/model/survey/OnboardingSurveyDTO.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */