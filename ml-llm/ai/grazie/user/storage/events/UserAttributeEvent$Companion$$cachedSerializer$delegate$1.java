/*   */ package ai.grazie.user.storage.events;
/*   */ import kotlinx.serialization.KSerializer;
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*   */ final class UserAttributeEvent$Companion$$cachedSerializer$delegate$1 extends Lambda implements Function0<KSerializer<Object>> {
/*   */   @NotNull
/*   */   public final KSerializer<Object> invoke() {
/* 8 */     KClass[] arrayOfKClass = new KClass[3]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(UserAttributeEvent.Created.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(UserAttributeEvent.Deleted.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(UserAttributeEvent.Updated.class); KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = (KSerializer)UserAttributeEvent.Created.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)UserAttributeEvent.Deleted.$serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)UserAttributeEvent.Updated.$serializer.INSTANCE; return (KSerializer<Object>)new SealedClassSerializer("ai.grazie.user.storage.events.UserAttributeEvent", Reflection.getOrCreateKotlinClass(UserAttributeEvent.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]);
/*   */   }
/*   */   
/*   */   public static final UserAttributeEvent$Companion$$cachedSerializer$delegate$1 INSTANCE = new UserAttributeEvent$Companion$$cachedSerializer$delegate$1();
/*   */   
/*   */   UserAttributeEvent$Companion$$cachedSerializer$delegate$1() {
/*   */     super(0);
/*   */   }
/*   */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/user/storage/events/UserAttributeEvent$Companion$$cachedSerializer$delegate$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */