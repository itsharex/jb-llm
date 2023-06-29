/*     */ package com.intellij.ml.llm.core.settings;
/*     */ 
/*     */ import com.intellij.openapi.components.BaseState;
/*     */ import com.intellij.util.xmlb.annotations.OptionTag;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.MutablePropertyReference1;
/*     */ import kotlin.jvm.internal.MutablePropertyReference1Impl;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.properties.ReadWriteProperty;
/*     */ import kotlin.reflect.KProperty;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\r\n\002\020\002\n\002\b\002\030\0002\0020\001B\005¢\006\002\020\002J\016\020\021\032\0020\0222\006\020\023\032\0020\004R+\020\005\032\0020\0042\006\020\003\032\0020\0048G@FX\002¢\006\022\n\004\b\t\020\n\032\004\b\005\020\006\"\004\b\007\020\bR+\020\013\032\0020\0042\006\020\003\032\0020\0048G@FX\002¢\006\022\n\004\b\r\020\n\032\004\b\013\020\006\"\004\b\f\020\bR+\020\016\032\0020\0042\006\020\003\032\0020\0048G@FX\002¢\006\022\n\004\b\020\020\n\032\004\b\016\020\006\"\004\b\017\020\b¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/core/settings/LLMSettings;", "Lcom/intellij/openapi/components/BaseState;", "()V", "<set-?>", "", "isDataSharingEnabled", "()Z", "setDataSharingEnabled", "(Z)V", "isDataSharingEnabled$delegate", "Lkotlin/properties/ReadWriteProperty;", "isDataSharingOptionInitialized", "setDataSharingOptionInitialized", "isDataSharingOptionInitialized$delegate", "isNameSuggestionsEnabled", "setNameSuggestionsEnabled", "isNameSuggestionsEnabled$delegate", "setDataSharingOption", "", "newValue", "intellij.ml.llm"})
/*     */ public final class LLMSettings
/*     */   extends BaseState
/*     */ {
/*     */   @NotNull
/*  96 */   private final ReadWriteProperty isDataSharingEnabled$delegate = property(false).provideDelegate(this, $$delegatedProperties[0]); @OptionTag("data_sharing") public final boolean isDataSharingEnabled() { return ((Boolean)this.isDataSharingEnabled$delegate.getValue(this, $$delegatedProperties[0])).booleanValue(); } public final void setDataSharingEnabled(boolean <set-?>) { this.isDataSharingEnabled$delegate.setValue(this, $$delegatedProperties[0], Boolean.valueOf(<set-?>)); } static { KProperty[] arrayOfKProperty = new KProperty[3]; arrayOfKProperty[0] = (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl(LLMSettings.class, "isDataSharingEnabled", "isDataSharingEnabled()Z", 0)); arrayOfKProperty[1] = 
/*     */ 
/*     */       
/*  99 */       (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl(LLMSettings.class, "isDataSharingOptionInitialized", "isDataSharingOptionInitialized()Z", 0)); arrayOfKProperty[2] = 
/*     */ 
/*     */       
/* 102 */       (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl(LLMSettings.class, "isNameSuggestionsEnabled", "isNameSuggestionsEnabled()Z", 0)); $$delegatedProperties = (KProperty<Object>[])arrayOfKProperty; } @NotNull private final ReadWriteProperty isDataSharingOptionInitialized$delegate = property(false).provideDelegate(this, $$delegatedProperties[1]); @NotNull private final ReadWriteProperty isNameSuggestionsEnabled$delegate = property(true).provideDelegate(this, $$delegatedProperties[2]); @OptionTag("data_sharing_initialized") public final boolean isDataSharingOptionInitialized() { return ((Boolean)this.isDataSharingOptionInitialized$delegate.getValue(this, $$delegatedProperties[1])).booleanValue(); } @OptionTag("name_suggestions") public final boolean isNameSuggestionsEnabled() { return ((Boolean)this.isNameSuggestionsEnabled$delegate.getValue(this, $$delegatedProperties[2])).booleanValue(); } public final void setDataSharingOptionInitialized(boolean <set-?>) { this.isDataSharingOptionInitialized$delegate.setValue(this, $$delegatedProperties[1], Boolean.valueOf(<set-?>)); } public final void setNameSuggestionsEnabled(boolean <set-?>) { this.isNameSuggestionsEnabled$delegate.setValue(this, $$delegatedProperties[2], Boolean.valueOf(<set-?>)); }
/*     */   
/*     */   public final void setDataSharingOption(boolean newValue) {
/* 105 */     setDataSharingOptionInitialized(true);
/* 106 */     setDataSharingEnabled(newValue);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/settings/LLMSettings.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */