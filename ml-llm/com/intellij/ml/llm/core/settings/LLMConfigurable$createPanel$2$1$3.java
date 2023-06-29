/*    */ package com.intellij.ml.llm.core.settings;
/*    */ 
/*    */ import com.intellij.ml.llm.LLMBundle;
/*    */ import com.intellij.ml.llm.core.chat.services.AIAssistantServiceScope;
/*    */ import com.intellij.ml.llm.core.chat.ui.AIAssistantColors;
/*    */ import com.intellij.ml.llm.core.grazieAPI.GrazieAuthService;
/*    */ import com.intellij.ui.dsl.builder.Row;
/*    */ import javax.swing.JEditorPane;
/*    */ import javax.swing.event.HyperlinkEvent;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlinx.coroutines.BuildersKt;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */   public final void invoke(@NotNull Row $this$row) {
/* 65 */     Intrinsics.checkNotNullParameter($this$row, "$this$row"); Row.text$default($this$row, LLMBundle.message("label.waiting.list", new Object[0]), 0, LLMConfigurable.this::invoke$lambda$0, 2, null)
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 72 */       .applyToComponent(null.INSTANCE);
/*    */   }
/*    */   
/*    */   private static final void invoke$lambda$0(LLMConfigurable this$0, HyperlinkEvent it) {
/*    */     Intrinsics.checkNotNullParameter(LLMConfigurable.this, "this$0");
/*    */     Intrinsics.checkNotNullParameter(it, "it");
/*    */     BuildersKt.launch$default(AIAssistantServiceScope.Companion.getScope(LLMConfigurable.access$getProject$p(LLMConfigurable.this)), null, null, new LLMConfigurable$createPanel$2$1$3$1$1(null), 3, null);
/*    */   }
/*    */   
/*    */   null() {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/settings/LLMConfigurable$createPanel$2$1$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */