/*    */ package com.intellij.ml.llm.core.settings;
/*    */ 
/*    */ import com.intellij.ml.llm.LLMBundle;
/*    */ import com.intellij.ui.dsl.builder.ButtonKt;
/*    */ import com.intellij.ui.dsl.builder.Row;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.FunctionReferenceImpl;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/ui/dsl/builder/Row;", "invoke"})
/*    */ final class null
/*    */   extends Lambda
/*    */   implements Function1<Row, Unit> {
/*    */   public final void invoke(@NotNull Row $this$row) {
/* 20 */     Intrinsics.checkNotNullParameter($this$row, "$this$row");
/* 21 */     ButtonKt.bindSelected($this$row.checkBox(LLMBundle.message("settings.configurable.data.sharing.agreement.checkbox", new Object[0])), 
/* 22 */         new Function0<Boolean>(LLMDataSharingConfigurable.access$getSettings$p(LLMDataSharingConfigurable.this)) { @NotNull public final Boolean invoke() { return Boolean.valueOf(((LLMSettingsManager)this.receiver).isDataSharingEnabled()); } }, new Function1<Boolean, Unit>(LLMDataSharingConfigurable.access$getSettings$p(LLMDataSharingConfigurable.this)) { public final void invoke(boolean p0) { ((LLMSettingsManager)this.receiver).setDataSharingEnabled(p0); }
/*    */            }
/*    */       );
/*    */   }
/*    */   
/*    */   null() {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/settings/LLMDataSharingConfigurable$createPanel$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */