/*     */ package com.intellij.ml.llm.python.intentions.chat;
/*     */ 
/*     */ import com.intellij.ml.llm.python.context.PythonContextUtils;
/*     */ import com.jetbrains.python.psi.PyFunction;
/*     */ import com.jetbrains.python.psi.PyIndentUtil;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlin.text.StringsKt;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*     */ final class PythonGenerateTestsChatIntention$getFunctionMessage$1
/*     */   extends Lambda
/*     */   implements Function0<Unit>
/*     */ {
/*     */   public final void invoke() {
/* 105 */     this.$functionName.element = this.$function.getName();
/*     */     
/* 107 */     this.$usagesText.element = PythonContextUtils.INSTANCE.getFunctionUsagesText(this.$function);
/* 108 */     this.$functionText.element = PyIndentUtil.changeIndent(this.$function.getText(), true, StringsKt.repeat(" ", 4));
/*     */   }
/*     */   
/*     */   PythonGenerateTestsChatIntention$getFunctionMessage$1(Ref.ObjectRef<String> $functionName, PyFunction $function, Ref.ObjectRef<String> $usagesText, Ref.ObjectRef<String> $functionText) {
/*     */     super(0);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/python/intentions/chat/PythonGenerateTestsChatIntention$getFunctionMessage$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */