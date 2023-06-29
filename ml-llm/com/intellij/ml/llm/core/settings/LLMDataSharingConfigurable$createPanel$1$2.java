/*    */ package com.intellij.ml.llm.core.settings;
/*    */ 
/*    */ import com.intellij.ml.llm.LLMBundle;
/*    */ import com.intellij.ui.dsl.builder.Row;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/ui/dsl/builder/Row;", "invoke"})
/*    */ final class null
/*    */   extends Lambda
/*    */   implements Function1<Row, Unit>
/*    */ {
/*    */   public static final null INSTANCE = (null)new Object();
/*    */   
/*    */   public final void invoke(@NotNull Row $this$row) {
/* 26 */     Intrinsics.checkNotNullParameter($this$row, "$this$row"); Row.comment$default($this$row, 
/* 27 */         LLMBundle.message("settings.configurable.data.sharing.agreement.description", new Object[0]), 
/* 28 */         70, null, 4, null);
/*    */   }
/*    */   
/*    */   null() {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/settings/LLMDataSharingConfigurable$createPanel$1$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */