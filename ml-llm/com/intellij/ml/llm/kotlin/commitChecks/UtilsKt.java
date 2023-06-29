/*    */ package com.intellij.ml.llm.kotlin.commitChecks;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.vcs.FilePath;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import com.intellij.psi.SyntaxTraverser;
/*    */ import java.util.List;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\"\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\006\032\034\020\000\032\b\022\004\022\0020\0020\0012\006\020\003\032\0020\0042\006\020\005\032\0020\006\032\036\020\007\032\b\022\004\022\0020\0020\0012\006\020\b\032\0020\t2\006\020\n\032\0020\tH\002\032\024\020\013\032\b\022\004\022\0020\0020\0012\006\020\f\032\0020\t\032\020\020\r\032\004\030\0010\0022\006\020\016\032\0020\002¨\006\017"}, d2 = {"findChangedFunctionsWithDoc", "", "Lcom/intellij/psi/PsiElement;", "project", "Lcom/intellij/openapi/project/Project;", "commitInfo", "Lcom/intellij/openapi/vcs/checkin/CommitInfo;", "findFunctionWithChangedDoc", "before", "Lcom/intellij/psi/PsiFile;", "after", "findFunctionsWithDoc", "file", "getFunctionDoc", "element", "intellij.ml.llm.kotlin"})
/*    */ @SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncom/intellij/ml/llm/kotlin/commitChecks/UtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n1603#2,9:45\n1855#2:54\n1856#2:57\n1612#2:58\n1#3:55\n1#3:56\n*S KotlinDebug\n*F\n+ 1 Utils.kt\ncom/intellij/ml/llm/kotlin/commitChecks/UtilsKt\n*L\n11#1:45,9\n11#1:54\n11#1:57\n11#1:58\n11#1:56\n*E\n"})
/*    */ public final class UtilsKt {
/*    */   @NotNull
/*    */   public static final List<PsiElement> findChangedFunctionsWithDoc(@NotNull Project project, @NotNull CommitInfo commitInfo) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc 'project'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: ldc 'commitInfo'
/*    */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: aload_1
/*    */     //   13: invokeinterface getCommittedChanges : ()Ljava/util/List;
/*    */     //   18: checkcast java/lang/Iterable
/*    */     //   21: astore_2
/*    */     //   22: iconst_0
/*    */     //   23: istore_3
/*    */     //   24: aload_2
/*    */     //   25: astore #4
/*    */     //   27: new java/util/ArrayList
/*    */     //   30: dup
/*    */     //   31: invokespecial <init> : ()V
/*    */     //   34: checkcast java/util/Collection
/*    */     //   37: astore #5
/*    */     //   39: iconst_0
/*    */     //   40: istore #6
/*    */     //   42: aload #4
/*    */     //   44: astore #7
/*    */     //   46: iconst_0
/*    */     //   47: istore #8
/*    */     //   49: aload #7
/*    */     //   51: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   56: astore #9
/*    */     //   58: aload #9
/*    */     //   60: invokeinterface hasNext : ()Z
/*    */     //   65: ifeq -> 310
/*    */     //   68: aload #9
/*    */     //   70: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   75: astore #10
/*    */     //   77: aload #10
/*    */     //   79: astore #11
/*    */     //   81: iconst_0
/*    */     //   82: istore #12
/*    */     //   84: aload #11
/*    */     //   86: checkcast com/intellij/openapi/vcs/changes/Change
/*    */     //   89: astore #13
/*    */     //   91: iconst_0
/*    */     //   92: istore #14
/*    */     //   94: aload #13
/*    */     //   96: invokevirtual getAfterRevision : ()Lcom/intellij/openapi/vcs/changes/ContentRevision;
/*    */     //   99: dup
/*    */     //   100: ifnull -> 112
/*    */     //   103: invokeinterface getFile : ()Lcom/intellij/openapi/vcs/FilePath;
/*    */     //   108: dup
/*    */     //   109: ifnonnull -> 117
/*    */     //   112: pop
/*    */     //   113: aconst_null
/*    */     //   114: goto -> 283
/*    */     //   117: dup
/*    */     //   118: ldc 'change.afterRevision?.fi…?: return@mapNotNull null'
/*    */     //   120: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   123: astore #15
/*    */     //   125: aload #13
/*    */     //   127: invokevirtual getBeforeRevision : ()Lcom/intellij/openapi/vcs/changes/ContentRevision;
/*    */     //   130: dup
/*    */     //   131: ifnull -> 143
/*    */     //   134: invokeinterface getContent : ()Ljava/lang/String;
/*    */     //   139: dup
/*    */     //   140: ifnonnull -> 148
/*    */     //   143: pop
/*    */     //   144: aconst_null
/*    */     //   145: goto -> 283
/*    */     //   148: dup
/*    */     //   149: ldc 'change.beforeRevision?.c…?: return@mapNotNull null'
/*    */     //   151: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   154: astore #16
/*    */     //   156: invokestatic getInstance : ()Lcom/intellij/openapi/vfs/LocalFileSystem;
/*    */     //   159: aload #15
/*    */     //   161: invokeinterface getPath : ()Ljava/lang/String;
/*    */     //   166: invokevirtual refreshAndFindFileByPath : (Ljava/lang/String;)Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   169: astore #17
/*    */     //   171: aload #17
/*    */     //   173: ifnull -> 213
/*    */     //   176: aload #17
/*    */     //   178: astore #18
/*    */     //   180: aload #18
/*    */     //   182: astore #19
/*    */     //   184: iconst_0
/*    */     //   185: istore #20
/*    */     //   187: aload #19
/*    */     //   189: invokevirtual isValid : ()Z
/*    */     //   192: ifeq -> 200
/*    */     //   195: aload #18
/*    */     //   197: goto -> 201
/*    */     //   200: aconst_null
/*    */     //   201: astore #21
/*    */     //   203: aload #21
/*    */     //   205: ifnull -> 213
/*    */     //   208: aload #21
/*    */     //   210: goto -> 217
/*    */     //   213: aconst_null
/*    */     //   214: goto -> 283
/*    */     //   217: astore #22
/*    */     //   219: aload_0
/*    */     //   220: aload #15
/*    */     //   222: aload #16
/*    */     //   224: <illegal opcode> compute : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/vcs/FilePath;Ljava/lang/String;)Lcom/intellij/openapi/util/ThrowableComputable;
/*    */     //   229: invokestatic compute : (Lcom/intellij/openapi/util/ThrowableComputable;)Ljava/lang/Object;
/*    */     //   232: checkcast com/intellij/psi/PsiFile
/*    */     //   235: astore #17
/*    */     //   237: aload #17
/*    */     //   239: ifnonnull -> 246
/*    */     //   242: aconst_null
/*    */     //   243: goto -> 283
/*    */     //   246: aload #17
/*    */     //   248: astore #23
/*    */     //   250: aload_0
/*    */     //   251: invokestatic getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/psi/PsiManager;
/*    */     //   254: aload #22
/*    */     //   256: invokevirtual findFile : (Lcom/intellij/openapi/vfs/VirtualFile;)Lcom/intellij/psi/PsiFile;
/*    */     //   259: dup
/*    */     //   260: ifnonnull -> 268
/*    */     //   263: pop
/*    */     //   264: aconst_null
/*    */     //   265: goto -> 283
/*    */     //   268: dup
/*    */     //   269: ldc 'PsiManager.getInstance(p…?: return@mapNotNull null'
/*    */     //   271: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   274: astore #17
/*    */     //   276: aload #23
/*    */     //   278: aload #17
/*    */     //   280: invokestatic findFunctionWithChangedDoc : (Lcom/intellij/psi/PsiFile;Lcom/intellij/psi/PsiFile;)Ljava/util/List;
/*    */     //   283: dup
/*    */     //   284: ifnull -> 305
/*    */     //   287: astore #24
/*    */     //   289: iconst_0
/*    */     //   290: istore #25
/*    */     //   292: aload #5
/*    */     //   294: aload #24
/*    */     //   296: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   301: pop
/*    */     //   302: goto -> 306
/*    */     //   305: pop
/*    */     //   306: nop
/*    */     //   307: goto -> 58
/*    */     //   310: nop
/*    */     //   311: aload #5
/*    */     //   313: checkcast java/util/List
/*    */     //   316: nop
/*    */     //   317: checkcast java/lang/Iterable
/*    */     //   320: invokestatic flatten : (Ljava/lang/Iterable;)Ljava/util/List;
/*    */     //   323: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #11	-> 12
/*    */     //   #45	-> 24
/*    */     //   #53	-> 42
/*    */     //   #54	-> 49
/*    */     //   #53	-> 84
/*    */     //   #12	-> 94
/*    */     //   #13	-> 125
/*    */     //   #16	-> 156
/*    */     //   #17	-> 171
/*    */     //   #16	-> 176
/*    */     //   #17	-> 180
/*    */     //   #55	-> 184
/*    */     //   #17	-> 187
/*    */     //   #17	-> 192
/*    */     //   #17	-> 201
/*    */     //   #16	-> 201
/*    */     //   #18	-> 213
/*    */     //   #16	-> 217
/*    */     //   #15	-> 217
/*    */     //   #20	-> 219
/*    */     //   #25	-> 242
/*    */     //   #20	-> 246
/*    */     //   #26	-> 250
/*    */     //   #27	-> 276
/*    */     //   #53	-> 283
/*    */     //   #56	-> 289
/*    */     //   #53	-> 292
/*    */     //   #53	-> 302
/*    */     //   #53	-> 305
/*    */     //   #54	-> 306
/*    */     //   #57	-> 310
/*    */     //   #58	-> 311
/*    */     //   #45	-> 316
/*    */     //   #28	-> 320
/*    */     //   #11	-> 323
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   187	5	20	$i$a$-takeIf-UtilsKt$findChangedFunctionsWithDoc$1$afterVirtualFile$1	I
/*    */     //   184	8	19	it	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   94	189	14	$i$a$-mapNotNull-UtilsKt$findChangedFunctionsWithDoc$1	I
/*    */     //   125	158	15	afterFilePath	Lcom/intellij/openapi/vcs/FilePath;
/*    */     //   156	127	16	beforeContent	Ljava/lang/String;
/*    */     //   219	64	22	afterVirtualFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   250	33	23	beforePsiFile	Lcom/intellij/psi/PsiFile;
/*    */     //   276	7	17	afterPsiFile	Lcom/intellij/psi/PsiFile;
/*    */     //   91	192	13	change	Lcom/intellij/openapi/vcs/changes/Change;
/*    */     //   292	10	25	$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv	I
/*    */     //   289	13	24	it$iv$iv	Ljava/lang/Object;
/*    */     //   84	222	12	$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv	I
/*    */     //   81	225	11	element$iv$iv	Ljava/lang/Object;
/*    */     //   77	230	10	element$iv$iv$iv	Ljava/lang/Object;
/*    */     //   49	262	8	$i$f$forEach	I
/*    */     //   46	265	7	$this$forEach$iv$iv$iv	Ljava/lang/Iterable;
/*    */     //   42	271	6	$i$f$mapNotNullTo	I
/*    */     //   39	274	4	$this$mapNotNullTo$iv$iv	Ljava/lang/Iterable;
/*    */     //   39	274	5	destination$iv$iv	Ljava/util/Collection;
/*    */     //   24	293	3	$i$f$mapNotNull	I
/*    */     //   22	295	2	$this$mapNotNull$iv	Ljava/lang/Iterable;
/*    */     //   0	324	0	project	Lcom/intellij/openapi/project/Project;
/*    */     //   0	324	1	commitInfo	Lcom/intellij/openapi/vcs/checkin/CommitInfo;
/*    */   }
/*    */   
/*    */   private static final PsiFile findChangedFunctionsWithDoc$lambda$2$lambda$1(Project $project, FilePath $afterFilePath, String $beforeContent) {
/* 21 */     Intrinsics.checkNotNullParameter($project, "$project"); Intrinsics.checkNotNullParameter($afterFilePath, "$afterFilePath"); Intrinsics.checkNotNullParameter($beforeContent, "$beforeContent"); return PsiFileFactory.getInstance($project).createFileFromText("old" + 
/* 22 */         $afterFilePath.getName(), 
/* 23 */         $afterFilePath.getFileType(), $beforeContent);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static final List<PsiElement> findFunctionWithChangedDoc(PsiFile before, PsiFile after) {
/* 32 */     return findFunctionsWithDoc(after);
/*    */   }
/*    */   
/*    */   @NotNull
/* 36 */   public static final List<PsiElement> findFunctionsWithDoc(@NotNull PsiFile file) { Intrinsics.checkNotNullParameter(file, "file");
/* 37 */     Intrinsics.checkNotNullExpressionValue(((SyntaxTraverser)SyntaxTraverser.psiTraverser((PsiElement)file).filter(UtilsKt$findFunctionsWithDoc$1.INSTANCE::findFunctionsWithDoc$lambda$3)).toList(), "psiTraverser(file)\n    .…oc(it) != null }.toList()"); return ((SyntaxTraverser)SyntaxTraverser.psiTraverser((PsiElement)file).filter(UtilsKt$findFunctionsWithDoc$1.INSTANCE::findFunctionsWithDoc$lambda$3)).toList(); } private static final boolean findFunctionsWithDoc$lambda$3(Function1 $tmp0, Object p0) { Intrinsics.checkNotNullParameter($tmp0, "$tmp0"); return ((Boolean)$tmp0.invoke(p0)).booleanValue(); } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\003\020\000\032\0020\0012\016\020\002\032\n \004*\004\030\0010\0030\003H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/psi/PsiElement;", "kotlin.jvm.PlatformType", "invoke", "(Lcom/intellij/psi/PsiElement;)Ljava/lang/Boolean;"}) static final class UtilsKt$findFunctionsWithDoc$1 extends Lambda implements Function1<PsiElement, Boolean> { public static final UtilsKt$findFunctionsWithDoc$1 INSTANCE = new UtilsKt$findFunctionsWithDoc$1(); @NotNull public final Boolean invoke(PsiElement it) { return Boolean.valueOf(((it instanceof KtFunction || it instanceof com.intellij.psi.PsiMethod) && UtilsKt.getFunctionDoc(it) != null)); } UtilsKt$findFunctionsWithDoc$1() { super(1); } }
/*    */    @Nullable
/*    */   public static final PsiElement getFunctionDoc(@NotNull PsiElement element) {
/* 40 */     Intrinsics.checkNotNullParameter(element, "element"); PsiElement psiElement = element;
/*    */     
/* 42 */     if (psiElement instanceof com.intellij.psi.PsiMethod) {  }
/* 43 */     else { throw new IllegalArgumentException(); }
/*    */     
/*    */     return (psiElement instanceof KtFunction) ? (PsiElement)((KtFunction)element).getDocComment() : (PsiElement)"JD-Core does not support Kotlin";
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/commitChecks/UtilsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */