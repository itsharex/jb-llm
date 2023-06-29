/*    */ package com.intellij.ml.llm.kotlin.chat.context;
/*    */ 
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.kotlin.idea.base.util.ProjectStructureUtils;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\013\n\002\b\002\020\000\032\0020\001H\n¢\006\004\b\002\020\003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"})
/*    */ final class KotlinVersionChatContextProvider$collect$containsKotlinFile$1
/*    */   extends Lambda
/*    */   implements Function0<Boolean>
/*    */ {
/*    */   KotlinVersionChatContextProvider$collect$containsKotlinFile$1(Project $project) {
/*    */     super(0);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Boolean invoke() {
/* 25 */     return Boolean.valueOf(ProjectStructureUtils.containsKotlinFile(this.$project));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/chat/context/KotlinVersionChatContextProvider$collect$containsKotlinFile$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */