/*    */ package com.intellij.ml.llm.dokuGuard.api;@Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020!\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\020\002\n\000\n\002\020 \n\002\030\002\n\002\b\002\030\000 \0222\0020\001:\001\022B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\016\020\n\032\0020\0132\006\020\f\032\0020\tJ\024\020\r\032\0020\0162\f\020\017\032\b\022\004\022\0020\0210\020R\024\020\007\032\b\022\004\022\0020\t0\bX\004¢\006\002\n\000R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/dokuGuard/api/SectionsTraverser;", "", "preferences", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationPreferences;", "validatorBuilder", "Lcom/intellij/ml/llm/dokuGuard/api/SectionValidatorBuilder;", "(Lcom/intellij/ml/llm/dokuGuard/api/ValidationPreferences;Lcom/intellij/ml/llm/dokuGuard/api/SectionValidatorBuilder;)V", "listeners", "", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationListener;", "addListener", "", "listener", "validateSections", "", "sections", "", "Lcom/intellij/ml/llm/dokuGuard/api/ProjectSection;", "Companion", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nSectionsTraverser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SectionsTraverser.kt\ncom/intellij/ml/llm/dokuGuard/api/SectionsTraverser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,61:1\n1855#2:62\n1855#2,2:63\n1856#2:65\n*S KotlinDebug\n*F\n+ 1 SectionsTraverser.kt\ncom/intellij/ml/llm/dokuGuard/api/SectionsTraverser\n*L\n11#1:62\n15#1:63,2\n11#1:65\n*E\n"})
/*    */ public final class SectionsTraverser { @NotNull
/*    */   public static final Companion Companion = new Companion(null); public SectionsTraverser(@NotNull ValidationPreferences preferences, @NotNull SectionValidatorBuilder validatorBuilder) {
/*  5 */     this.preferences = preferences;
/*  6 */     this.validatorBuilder = validatorBuilder;
/*    */     
/*  8 */     this.listeners = new ArrayList<>();
/*    */   }
/*    */   @NotNull
/*    */   private final ValidationPreferences preferences; @NotNull
/*    */   private final SectionValidatorBuilder validatorBuilder; @NotNull
/*    */   private final List<ValidationListener> listeners;
/*    */   
/*    */   public final void validateSections(@NotNull List sections) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'sections'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: checkcast java/lang/Iterable
/*    */     //   10: astore_2
/*    */     //   11: iconst_0
/*    */     //   12: istore_3
/*    */     //   13: aload_2
/*    */     //   14: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   19: astore #4
/*    */     //   21: aload #4
/*    */     //   23: invokeinterface hasNext : ()Z
/*    */     //   28: ifeq -> 162
/*    */     //   31: aload #4
/*    */     //   33: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   38: astore #5
/*    */     //   40: aload #5
/*    */     //   42: checkcast com/intellij/ml/llm/dokuGuard/api/ProjectSection
/*    */     //   45: astore #6
/*    */     //   47: iconst_0
/*    */     //   48: istore #7
/*    */     //   50: aload_0
/*    */     //   51: getfield validatorBuilder : Lcom/intellij/ml/llm/dokuGuard/api/SectionValidatorBuilder;
/*    */     //   54: aload_0
/*    */     //   55: getfield preferences : Lcom/intellij/ml/llm/dokuGuard/api/ValidationPreferences;
/*    */     //   58: aload #6
/*    */     //   60: invokeinterface buildValidator : (Lcom/intellij/ml/llm/dokuGuard/api/ValidationPreferences;Lcom/intellij/ml/llm/dokuGuard/api/ProjectSection;)Lcom/intellij/ml/llm/dokuGuard/api/SectionValidator;
/*    */     //   65: astore #8
/*    */     //   67: aload #8
/*    */     //   69: invokeinterface validate : ()Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecision;
/*    */     //   74: astore #9
/*    */     //   76: aload #9
/*    */     //   78: invokeinterface getImportance : ()Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecisionImportance;
/*    */     //   83: ifnull -> 157
/*    */     //   86: aload_0
/*    */     //   87: getfield listeners : Ljava/util/List;
/*    */     //   90: checkcast java/lang/Iterable
/*    */     //   93: astore #10
/*    */     //   95: iconst_0
/*    */     //   96: istore #11
/*    */     //   98: aload #10
/*    */     //   100: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   105: astore #12
/*    */     //   107: aload #12
/*    */     //   109: invokeinterface hasNext : ()Z
/*    */     //   114: ifeq -> 156
/*    */     //   117: aload #12
/*    */     //   119: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   124: astore #13
/*    */     //   126: aload #13
/*    */     //   128: checkcast com/intellij/ml/llm/dokuGuard/api/ValidationListener
/*    */     //   131: astore #14
/*    */     //   133: iconst_0
/*    */     //   134: istore #15
/*    */     //   136: aload #14
/*    */     //   138: aload #8
/*    */     //   140: invokeinterface getProjectSection : ()Lcom/intellij/ml/llm/dokuGuard/api/ProjectSection;
/*    */     //   145: aload #9
/*    */     //   147: invokeinterface sectionValidated : (Lcom/intellij/ml/llm/dokuGuard/api/ProjectSection;Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecision;)V
/*    */     //   152: nop
/*    */     //   153: goto -> 107
/*    */     //   156: nop
/*    */     //   157: nop
/*    */     //   158: nop
/*    */     //   159: goto -> 21
/*    */     //   162: nop
/*    */     //   163: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #11	-> 6
/*    */     //   #62	-> 13
/*    */     //   #12	-> 50
/*    */     //   #13	-> 67
/*    */     //   #14	-> 76
/*    */     //   #15	-> 86
/*    */     //   #63	-> 98
/*    */     //   #15	-> 136
/*    */     //   #63	-> 152
/*    */     //   #64	-> 156
/*    */     //   #17	-> 157
/*    */     //   #62	-> 158
/*    */     //   #65	-> 162
/*    */     //   #18	-> 163
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   136	16	15	$i$a$-forEach-SectionsTraverser$validateSections$1$1	I
/*    */     //   133	19	14	it	Lcom/intellij/ml/llm/dokuGuard/api/ValidationListener;
/*    */     //   126	27	13	element$iv	Ljava/lang/Object;
/*    */     //   98	59	11	$i$f$forEach	I
/*    */     //   95	62	10	$this$forEach$iv	Ljava/lang/Iterable;
/*    */     //   50	108	7	$i$a$-forEach-SectionsTraverser$validateSections$1	I
/*    */     //   67	91	8	validator	Lcom/intellij/ml/llm/dokuGuard/api/SectionValidator;
/*    */     //   76	82	9	validationDecision	Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecision;
/*    */     //   47	111	6	section	Lcom/intellij/ml/llm/dokuGuard/api/ProjectSection;
/*    */     //   40	119	5	element$iv	Ljava/lang/Object;
/*    */     //   13	150	3	$i$f$forEach	I
/*    */     //   11	152	2	$this$forEach$iv	Ljava/lang/Iterable;
/*    */     //   0	164	0	this	Lcom/intellij/ml/llm/dokuGuard/api/SectionsTraverser;
/*    */     //   0	164	1	sections	Ljava/util/List;
/*    */   }
/*    */   
/*    */   public final boolean addListener(@NotNull ValidationListener listener) {
/* 20 */     Intrinsics.checkNotNullParameter(listener, "listener"); return this.listeners.add(listener);
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\034\020\003\032\0020\0042\006\020\005\032\0020\0062\f\020\007\032\b\022\004\022\0020\t0\bJ*\020\n\032\0020\0132\006\020\005\032\0020\0062\f\020\f\032\b\022\004\022\0020\r0\b2\f\020\007\032\b\022\004\022\0020\t0\bJ\026\020\016\032\0020\0172\006\020\005\032\0020\0062\006\020\020\032\0020\t¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/dokuGuard/api/SectionsTraverser$Companion;", "", "()V", "countSuitableSections", "", "preferences", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationPreferences;", "sections", "", "Lcom/intellij/ml/llm/dokuGuard/api/ProjectSection;", "traverseSections", "", "listeners", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationListener;", "validateSection", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecision;", "section", "intellij.ml.llm"})
/*    */   @SourceDebugExtension({"SMAP\nSectionsTraverser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SectionsTraverser.kt\ncom/intellij/ml/llm/dokuGuard/api/SectionsTraverser$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,61:1\n1855#2,2:62\n*S KotlinDebug\n*F\n+ 1 SectionsTraverser.kt\ncom/intellij/ml/llm/dokuGuard/api/SectionsTraverser$Companion\n*L\n30#1:62,2\n*E\n"})
/*    */   public static final class Companion { private Companion() {}
/*    */     
/*    */     public final void traverseSections(@NotNull ValidationPreferences preferences, @NotNull List listeners, @NotNull List<? extends ProjectSection> sections) {
/* 28 */       Intrinsics.checkNotNullParameter(preferences, "preferences"); Intrinsics.checkNotNullParameter(listeners, "listeners"); Intrinsics.checkNotNullParameter(sections, "sections"); SectionValidatorBuilder validatorBuilder = SectionValidatorBuilder.Companion.fromPreferences(preferences);
/* 29 */       SectionsTraverser traverser = new SectionsTraverser(preferences, validatorBuilder);
/* 30 */       Iterable $this$forEach$iv = listeners; int $i$f$forEach = 0;
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
/* 62 */       Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); ValidationListener it = (ValidationListener)element$iv; int $i$a$-forEach-SectionsTraverser$Companion$traverseSections$1 = 0;
/*    */         traverser.addListener(it); }
/*    */       
/*    */       traverser.validateSections(sections);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final ValidationDecision validateSection(@NotNull ValidationPreferences preferences, @NotNull ProjectSection section) {
/*    */       Intrinsics.checkNotNullParameter(preferences, "preferences");
/*    */       Intrinsics.checkNotNullParameter(section, "section");
/*    */       Ref.ObjectRef<ValidationDecision> sectionValidation = new Ref.ObjectRef();
/*    */       sectionValidation.element = ValidationDecision.Companion.getNO_CHANGE();
/*    */       SectionsTraverser$Companion$validateSection$sectionValidationListener$1 sectionValidationListener = new SectionsTraverser$Companion$validateSection$sectionValidationListener$1(sectionValidation);
/*    */       SectionValidatorBuilder validatorBuilder = SectionValidatorBuilder.Companion.fromPreferences(preferences);
/*    */       SectionsTraverser traverser = new SectionsTraverser(preferences, validatorBuilder);
/*    */       traverser.addListener(sectionValidationListener);
/*    */       traverser.validateSections(CollectionsKt.listOf(section));
/*    */       return (ValidationDecision)sectionValidation.element;
/*    */     }
/*    */     
/*    */     @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\026¨\006\b"}, d2 = {"com/intellij/ml/llm/dokuGuard/api/SectionsTraverser$Companion$validateSection$sectionValidationListener$1", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationListener;", "sectionValidated", "", "projectSection", "Lcom/intellij/ml/llm/dokuGuard/api/ProjectSection;", "decision", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecision;", "intellij.ml.llm"})
/*    */     public static final class SectionsTraverser$Companion$validateSection$sectionValidationListener$1 implements ValidationListener {
/*    */       SectionsTraverser$Companion$validateSection$sectionValidationListener$1(Ref.ObjectRef<ValidationDecision> $sectionValidation) {}
/*    */       
/*    */       public void sectionValidated(@NotNull ProjectSection projectSection, @NotNull ValidationDecision decision) {
/*    */         Intrinsics.checkNotNullParameter(projectSection, "projectSection");
/*    */         Intrinsics.checkNotNullParameter(decision, "decision");
/*    */         this.$sectionValidation.element = decision;
/*    */       }
/*    */     }
/*    */     
/*    */     public final int countSuitableSections(@NotNull ValidationPreferences preferences, @NotNull List<? extends ProjectSection> sections) {
/*    */       Intrinsics.checkNotNullParameter(preferences, "preferences");
/*    */       Intrinsics.checkNotNullParameter(sections, "sections");
/*    */       CountingListener countingListener = new CountingListener();
/*    */       traverseSections(preferences, CollectionsKt.listOf(countingListener), sections);
/*    */       return countingListener.getCount();
/*    */     } }
/*    */    }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/dokuGuard/api/SectionsTraverser.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */