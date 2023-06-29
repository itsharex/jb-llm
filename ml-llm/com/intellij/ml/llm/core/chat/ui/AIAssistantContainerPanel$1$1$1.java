/*    */ package com.intellij.ml.llm.core.chat.ui;
/*    */ 
/*    */ import com.intellij.ml.llm.core.chat.session.ChatCreationContext;
/*    */ import com.intellij.ml.llm.core.chat.session.ChatOrigin;
/*    */ import com.intellij.ml.llm.core.chat.session.ChatSessionStorage;
/*    */ import javax.swing.JComponent;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
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
/*    */ @DebugMetadata(f = "AIAssistantContainerPanel.kt", l = {56}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.chat.ui.AIAssistantContainerPanel$1$1$1")
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class null
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   null(AIAssistantContainerPanel $receiver, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invokeSuspend(@NotNull Object $result) {
/* 49 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 50 */         if (this.$isAuthed) {
/* 51 */           JComponent lsp = AIAssistantContainerPanel.access$getLastShownPanel$p(AIAssistantContainerPanel.this);
/* 52 */           if (lsp != null && !(lsp instanceof AIAssistantLoginPanel)) {
/* 53 */             AIAssistantContainerPanel.access$goToPanel(AIAssistantContainerPanel.this, lsp);
/*    */           } else {
/*    */             
/* 56 */             this.label = 1; if (AIAssistantContainerPanel.this.goToNewDialog(new ChatCreationContext((ChatOrigin)ChatOrigin.AIAssistantTool.INSTANCE, ChatSessionStorage.SourceAction.NEW_CHAT, null, null, 12, null), (Continuation<? super Unit>)this) == object) return object;  AIAssistantContainerPanel.this.goToNewDialog(new ChatCreationContext((ChatOrigin)ChatOrigin.AIAssistantTool.INSTANCE, ChatSessionStorage.SourceAction.NEW_CHAT, null, null, 12, null), (Continuation<? super Unit>)this);
/*    */           } 
/*    */         } else {
/*    */           
/* 60 */           AIAssistantContainerPanel.access$goToPanel(AIAssistantContainerPanel.this, new AIAssistantLoginPanel(AIAssistantContainerPanel.access$getServiceScope(AIAssistantContainerPanel.this), AIAssistantContainerPanel.access$getProject$p(AIAssistantContainerPanel.this)));
/*    */         } 
/* 62 */         return Unit.INSTANCE;
/*    */       case 1:
/*    */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*    */     return (Continuation<Unit>)new Object(this.$isAuthed, AIAssistantContainerPanel.this, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */     return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/AIAssistantContainerPanel$1$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */