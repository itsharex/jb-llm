/*    */ package com.intellij.ml.llm.core.settings;
/*    */ import com.intellij.ml.llm.LLMBundle;
/*    */ import com.intellij.ui.dsl.builder.Panel;
/*    */ import com.intellij.ui.dsl.builder.Row;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\005¢\006\002\020\002J\b\020\005\032\0020\006H\026R\016\020\003\032\0020\004X\004¢\006\002\n\000¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/core/settings/LLMDataSharingConfigurable;", "Lcom/intellij/openapi/options/BoundConfigurable;", "()V", "settings", "Lcom/intellij/ml/llm/core/settings/LLMSettingsManager;", "createPanel", "Lcom/intellij/openapi/ui/DialogPanel;", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nLLMDataSharingConfigurable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMDataSharingConfigurable.kt\ncom/intellij/ml/llm/core/settings/LLMDataSharingConfigurable\n+ 2 service.kt\ncom/intellij/openapi/components/ServiceKt\n*L\n1#1,43:1\n43#2,3:44\n*S KotlinDebug\n*F\n+ 1 LLMDataSharingConfigurable.kt\ncom/intellij/ml/llm/core/settings/LLMDataSharingConfigurable\n*L\n15#1:44,3\n*E\n"})
/*    */ public final class LLMDataSharingConfigurable extends BoundConfigurable {
/*    */   public LLMDataSharingConfigurable() {
/* 14 */     super(LLMBundle.message("settings.configurable.data.sharing.display.name", new Object[0]), null, 2, null);
/* 15 */     int $i$f$service = 0;
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
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 44 */     Class<LLMSettingsManager> serviceClass$iv = LLMSettingsManager.class;
/* 45 */     Object object = ApplicationManager.getApplication().getService(serviceClass$iv); if (object == null)
/* 46 */       throw new RuntimeException("Cannot find service " + serviceClass$iv.getName() + " (classloader=" + serviceClass$iv.getClassLoader() + ", client=" + ClientId.Companion.getCurrentOrNull() + ")"); 
/*    */     this.settings = (LLMSettingsManager)object;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private final LLMSettingsManager settings;
/*    */   
/*    */   @NotNull
/*    */   public DialogPanel createPanel() {
/*    */     return BuilderKt.panel(new LLMDataSharingConfigurable$createPanel$1());
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/ui/dsl/builder/Panel;", "invoke"})
/*    */   static final class LLMDataSharingConfigurable$createPanel$1 extends Lambda implements Function1<Panel, Unit> {
/*    */     public final void invoke(@NotNull Panel $this$panel) {
/*    */       Intrinsics.checkNotNullParameter($this$panel, "$this$panel");
/*    */       Panel.row$default($this$panel, null, new Function1<Row, Unit>() {
/*    */             public final void invoke(@NotNull Row $this$row) {
/*    */               Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*    */               ButtonKt.bindSelected($this$row.checkBox(LLMBundle.message("settings.configurable.data.sharing.agreement.checkbox", new Object[0])), new Function0<Boolean>(LLMDataSharingConfigurable.this.settings) {
/*    */                     @NotNull
/*    */                     public final Boolean invoke() {
/*    */                       return Boolean.valueOf(((LLMSettingsManager)this.receiver).isDataSharingEnabled());
/*    */                     }
/*    */                   },  new Function1<Boolean, Unit>(LLMDataSharingConfigurable.this.settings) {
/*    */                     public final void invoke(boolean p0) {
/*    */                       ((LLMSettingsManager)this.receiver).setDataSharingEnabled(p0);
/*    */                     }
/*    */                   });
/*    */             }
/*    */           }1, null);
/*    */       Panel.row$default($this$panel, null, null.INSTANCE, 1, null);
/*    */       Panel.row$default($this$panel, null, null.INSTANCE, 1, null);
/*    */     }
/*    */     
/*    */     LLMDataSharingConfigurable$createPanel$1() {
/*    */       super(1);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/settings/LLMDataSharingConfigurable.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */