/*    */ package com.intellij.ml.llm.refactorings;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.codeStyle.SuggestedNameInfo;
/*    */ import com.intellij.refactoring.rename.NameSuggestionProvider;
/*    */ import java.util.Set;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020#\n\002\020\016\n\000\n\002\020\013\n\000\030\0002\0020\001B\005¢\006\002\020\002J*\020\003\032\004\030\0010\0042\006\020\005\032\0020\0062\b\020\007\032\004\030\0010\0062\f\020\b\032\b\022\004\022\0020\n0\tH\026J\032\020\013\032\0020\f2\006\020\005\032\0020\0062\b\020\007\032\004\030\0010\006H\002¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/refactorings/DefaultNameSuggestionProvider;", "Lcom/intellij/refactoring/rename/NameSuggestionProvider;", "()V", "getSuggestedNames", "Lcom/intellij/psi/codeStyle/SuggestedNameInfo;", "element", "Lcom/intellij/psi/PsiElement;", "nameSuggestionContext", "result", "", "", "hasSuggestionsFromOtherProviders", "", "intellij.ml.llm"})
/*    */ public final class DefaultNameSuggestionProvider implements NameSuggestionProvider {
/*    */   @Nullable
/*    */   public SuggestedNameInfo getSuggestedNames(@NotNull PsiElement element, @Nullable PsiElement nameSuggestionContext, @NotNull Set<String> result) {
/* 13 */     Intrinsics.checkNotNullParameter(element, "element"); Intrinsics.checkNotNullParameter(result, "result"); if ((!result.isEmpty()) || hasSuggestionsFromOtherProviders(element, nameSuggestionContext)) {
/* 14 */       return SuggestedNameInfo.NULL_INFO;
/*    */     }
/* 16 */     if (element instanceof PsiNamedElement) {
/* 17 */       String name = ((PsiNamedElement)element).getName();
/* 18 */       CharSequence charSequence = name; if (!((charSequence == null || charSequence.length() == 0) ? 1 : 0)) {
/* 19 */         result.add(name);
/*    */       }
/*    */     } 
/* 22 */     return SuggestedNameInfo.NULL_INFO;
/*    */   }
/*    */   
/*    */   private final boolean hasSuggestionsFromOtherProviders(PsiElement element, PsiElement nameSuggestionContext) {
/* 26 */     Set result = new LinkedHashSet();
/* 27 */     for (NameSuggestionProvider provider : NameSuggestionProvider.EP_NAME.getExtensionList()) {
/* 28 */       if (!Intrinsics.areEqual(provider, this)) {
/* 29 */         provider.getSuggestedNames(element, nameSuggestionContext, result);
/* 30 */         if (!result.isEmpty()) return true; 
/*    */       } 
/* 32 */     }  return false;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/refactorings/DefaultNameSuggestionProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */