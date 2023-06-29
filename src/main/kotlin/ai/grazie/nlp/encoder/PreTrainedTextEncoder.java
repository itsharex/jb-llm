/*     */ package ai.grazie.nlp.encoder;@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\b\n\002\020\b\n\002\b(\n\002\020 \n\002\b\013\n\002\020\013\n\002\b\013\b&\030\0002\0020\001BY\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\003\022\n\b\002\020\005\032\004\030\0010\003\022\n\b\002\020\006\032\004\030\0010\003\022\n\b\002\020\007\032\004\030\0010\003\022\n\b\002\020\b\032\004\030\0010\003\022\n\b\002\020\t\032\004\030\0010\003¢\006\002\020\nJ\034\0204\032\b\022\004\022\0020\f052\f\0206\032\b\022\004\022\0020\f05H\026J\020\0207\032\0020\0032\006\0208\032\0020\fH$J\020\0209\032\0020\f2\006\020:\032\0020\003H$J\026\020;\032\0020\0032\f\0206\032\b\022\004\022\0020\f05H\026J\026\020<\032\0020\0032\f\020=\032\b\022\004\022\0020\00305H\026J-\020>\032\b\022\004\022\0020\f052\006\020?\032\0020\0032\006\020@\032\0020A2\b\020B\032\004\030\0010\fH\026¢\006\002\020CJ\026\020D\032\b\022\004\022\0020\003052\006\020?\032\0020\003H\026J\b\020E\032\0020\fH\026J.\020F\032\b\022\004\022\0020\f052\f\0206\032\b\022\004\022\0020\f052\006\020G\032\0020\f2\b\b\002\020H\032\0020AH\026J\036\020I\032\b\022\004\022\0020\003052\006\020:\032\0020\0032\006\020?\032\0020\003H\002J$\020J\032\b\022\004\022\0020\003052\f\020=\032\b\022\004\022\0020\003052\006\020?\032\0020\003H\002J\026\020K\032\b\022\004\022\0020\003052\006\020?\032\0020\003H$R\020\020\002\032\004\030\0010\003X\004¢\006\002\n\000R\020\020\b\032\004\030\0010\003X\004¢\006\002\n\000R\020\020\004\032\004\030\0010\003X\004¢\006\002\n\000R\020\020\t\032\004\030\0010\003X\004¢\006\002\n\000R\020\020\007\032\004\030\0010\003X\004¢\006\002\n\000R\020\020\006\032\004\030\0010\003X\004¢\006\002\n\000R\020\020\005\032\004\030\0010\003X\004¢\006\002\n\000R\033\020\013\032\0020\f8FX\002¢\006\f\n\004\b\017\020\020\032\004\b\r\020\016R\021\020\021\032\0020\0038F¢\006\006\032\004\b\022\020\023R\033\020\024\032\0020\f8FX\002¢\006\f\n\004\b\026\020\020\032\004\b\025\020\016R\021\020\027\032\0020\0038F¢\006\006\032\004\b\030\020\023R\033\020\031\032\0020\f8FX\002¢\006\f\n\004\b\033\020\020\032\004\b\032\020\016R\021\020\034\032\0020\0038F¢\006\006\032\004\b\035\020\023R\033\020\036\032\0020\f8FX\002¢\006\f\n\004\b \020\020\032\004\b\037\020\016R\021\020!\032\0020\0038F¢\006\006\032\004\b\"\020\023R\033\020#\032\0020\f8FX\002¢\006\f\n\004\b%\020\020\032\004\b$\020\016R\021\020&\032\0020\0038F¢\006\006\032\004\b'\020\023R\033\020(\032\0020\f8FX\002¢\006\f\n\004\b*\020\020\032\004\b)\020\016R\021\020+\032\0020\0038F¢\006\006\032\004\b,\020\023R\033\020-\032\0020\f8FX\002¢\006\f\n\004\b/\020\020\032\004\b.\020\016R\021\0200\032\0020\0038F¢\006\006\032\004\b1\020\023R\022\0202\032\0020\fX¦\004¢\006\006\032\004\b3\020\016¨\006L"}, d2 = {"Lai/grazie/nlp/encoder/PreTrainedTextEncoder;", "Lai/grazie/model/nlp/encoder/TextEncoder;", "_bosToken", "", "_eosToken", "_unkToken", "_sepToken", "_padToken", "_clsToken", "_maskToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "bosId", "", "getBosId", "()I", "bosId$delegate", "Lkotlin/Lazy;", "bosToken", "getBosToken", "()Ljava/lang/String;", "clsId", "getClsId", "clsId$delegate", "clsToken", "getClsToken", "eosId", "getEosId", "eosId$delegate", "eosToken", "getEosToken", "maskId", "getMaskId", "maskId$delegate", "maskToken", "getMaskToken", "padId", "getPadId", "padId$delegate", "padToken", "getPadToken", "sepId", "getSepId", "sepId$delegate", "sepToken", "getSepToken", "unkId", "getUnkId", "unkId$delegate", "unkToken", "getUnkToken", "vocabSize", "getVocabSize", "buildInputsWithSpecialTokens", "", "ids", "convertIdToToken", "id", "convertTokenToId", "token", "decodeFromIds", "decodeFromTokens", "tokens", "encodeAsIds", "text", "withSpecialTokens", "", "maxLen", "(Ljava/lang/String;ZLjava/lang/Integer;)Ljava/util/List;", "encodeAsTokens", "numSpecialTokens", "padSequence", "length", "isAttention", "splitByToken", "splitByTokens", "tokenizeText", "nlp-encoder-engine"})
/*     */ @SourceDebugExtension({"SMAP\nPreTrainedTextEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreTrainedTextEncoder.kt\nai/grazie/nlp/encoder/PreTrainedTextEncoder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,145:1\n1549#2:146\n1620#2,3:147\n1549#2:150\n1620#2,3:151\n1360#2:154\n1446#2,5:155\n1360#2:160\n1446#2,5:161\n*S KotlinDebug\n*F\n+ 1 PreTrainedTextEncoder.kt\nai/grazie/nlp/encoder/PreTrainedTextEncoder\n*L\n76#1:146\n76#1:147,3\n88#1:150\n88#1:151,3\n140#1:154\n140#1:155,5\n142#1:160\n142#1:161,5\n*E\n"})
/*     */ public abstract class PreTrainedTextEncoder implements TextEncoder { @Nullable
/*     */   private final String _bosToken; @Nullable
/*     */   private final String _eosToken; @Nullable
/*     */   private final String _unkToken; @Nullable
/*     */   private final String _sepToken; @Nullable
/*     */   private final String _padToken; @Nullable
/*     */   private final String _clsToken; @Nullable
/*     */   private final String _maskToken; @NotNull
/*     */   private final Lazy bosId$delegate; @NotNull
/*     */   private final Lazy eosId$delegate; @NotNull
/*     */   private final Lazy unkId$delegate; @NotNull
/*     */   private final Lazy sepId$delegate; @NotNull
/*     */   private final Lazy padId$delegate; @NotNull
/*     */   private final Lazy clsId$delegate; @NotNull
/*     */   private final Lazy maskId$delegate;
/*     */   
/*  19 */   public PreTrainedTextEncoder(@Nullable String _bosToken, @Nullable String _eosToken, @Nullable String _unkToken, @Nullable String _sepToken, @Nullable String _padToken, @Nullable String _clsToken, @Nullable String _maskToken) { this._bosToken = _bosToken;
/*  20 */     this._eosToken = _eosToken;
/*  21 */     this._unkToken = _unkToken;
/*  22 */     this._sepToken = _sepToken;
/*  23 */     this._padToken = _padToken;
/*  24 */     this._clsToken = _clsToken;
/*  25 */     this._maskToken = _maskToken;
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
/*  52 */     this.bosId$delegate = LazyKt.lazy(new PreTrainedTextEncoder$bosId$2());
/*  53 */     this.eosId$delegate = LazyKt.lazy(new PreTrainedTextEncoder$eosId$2());
/*  54 */     this.unkId$delegate = LazyKt.lazy(new PreTrainedTextEncoder$unkId$2());
/*  55 */     this.sepId$delegate = LazyKt.lazy(new PreTrainedTextEncoder$sepId$2());
/*  56 */     this.padId$delegate = LazyKt.lazy(new PreTrainedTextEncoder$padId$2());
/*  57 */     this.clsId$delegate = LazyKt.lazy(new PreTrainedTextEncoder$clsId$2());
/*  58 */     this.maskId$delegate = LazyKt.lazy(new PreTrainedTextEncoder$maskId$2()); } @NotNull public final String getBosToken() { if (this._bosToken == null) throw new IllegalStateException("Using bosToken, but it is not set yet.");  return this._bosToken; } @NotNull public final String getEosToken() { if (this._eosToken == null) throw new IllegalStateException("Using eosToken, but it is not set yet.");  return this._eosToken; } @NotNull public final String getUnkToken() { if (this._unkToken == null) throw new IllegalStateException("Using unkToken, but it is not set yet.");  return this._unkToken; } @NotNull public final String getSepToken() { if (this._sepToken == null) throw new IllegalStateException("Using sepToken, but it is not set yet.");  return this._sepToken; } @NotNull public final String getPadToken() { if (this._padToken == null) throw new IllegalStateException("Using padToken, but it is not set yet.");  return this._padToken; } @NotNull public final String getClsToken() { if (this._clsToken == null) throw new IllegalStateException("Using clsToken, but it is not set yet.");  return this._clsToken; } @NotNull public final String getMaskToken() { if (this._maskToken == null) throw new IllegalStateException("Using maskToken, but it is not set yet.");  return this._maskToken; } public final int getBosId() { Lazy lazy = this.bosId$delegate; return ((Number)lazy.getValue()).intValue(); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\b\n\002\b\002\020\000\032\0020\001H\n¢\006\004\b\002\020\003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}) static final class PreTrainedTextEncoder$bosId$2 extends Lambda implements Function0<Integer> { PreTrainedTextEncoder$bosId$2() { super(0); } @NotNull public final Integer invoke() { return Integer.valueOf(PreTrainedTextEncoder.this.convertTokenToId(PreTrainedTextEncoder.this.getBosToken())); } } public final int getMaskId() { Lazy lazy = this.maskId$delegate; return ((Number)lazy.getValue()).intValue(); } public final int getEosId() { Lazy lazy = this.eosId$delegate; return ((Number)lazy.getValue()).intValue(); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\b\n\002\b\002\020\000\032\0020\001H\n¢\006\004\b\002\020\003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}) static final class PreTrainedTextEncoder$eosId$2 extends Lambda implements Function0<Integer> { PreTrainedTextEncoder$eosId$2() { super(0); } @NotNull public final Integer invoke() { return Integer.valueOf(PreTrainedTextEncoder.this.convertTokenToId(PreTrainedTextEncoder.this.getEosToken())); } } public final int getUnkId() { Lazy lazy = this.unkId$delegate; return ((Number)lazy.getValue()).intValue(); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\b\n\002\b\002\020\000\032\0020\001H\n¢\006\004\b\002\020\003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}) static final class PreTrainedTextEncoder$unkId$2 extends Lambda implements Function0<Integer> { PreTrainedTextEncoder$unkId$2() { super(0); } @NotNull public final Integer invoke() { return Integer.valueOf(PreTrainedTextEncoder.this.convertTokenToId(PreTrainedTextEncoder.this.getUnkToken())); } } public final int getSepId() { Lazy lazy = this.sepId$delegate; return ((Number)lazy.getValue()).intValue(); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\b\n\002\b\002\020\000\032\0020\001H\n¢\006\004\b\002\020\003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}) static final class PreTrainedTextEncoder$sepId$2 extends Lambda implements Function0<Integer> { PreTrainedTextEncoder$sepId$2() { super(0); } @NotNull public final Integer invoke() { return Integer.valueOf(PreTrainedTextEncoder.this.convertTokenToId(PreTrainedTextEncoder.this.getSepToken())); } } public final int getPadId() { Lazy lazy = this.padId$delegate; return ((Number)lazy.getValue()).intValue(); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\b\n\002\b\002\020\000\032\0020\001H\n¢\006\004\b\002\020\003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}) static final class PreTrainedTextEncoder$padId$2 extends Lambda implements Function0<Integer> { PreTrainedTextEncoder$padId$2() { super(0); } @NotNull public final Integer invoke() { return Integer.valueOf(PreTrainedTextEncoder.this.convertTokenToId(PreTrainedTextEncoder.this.getPadToken())); } } public final int getClsId() { Lazy lazy = this.clsId$delegate; return ((Number)lazy.getValue()).intValue(); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\b\n\002\b\002\020\000\032\0020\001H\n¢\006\004\b\002\020\003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}) static final class PreTrainedTextEncoder$clsId$2 extends Lambda implements Function0<Integer> { PreTrainedTextEncoder$clsId$2() { super(0); } @NotNull public final Integer invoke() { return Integer.valueOf(PreTrainedTextEncoder.this.convertTokenToId(PreTrainedTextEncoder.this.getClsToken())); } } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\b\n\002\b\002\020\000\032\0020\001H\n¢\006\004\b\002\020\003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}) static final class PreTrainedTextEncoder$maskId$2 extends Lambda implements Function0<Integer> { PreTrainedTextEncoder$maskId$2() { super(0); } @NotNull public final Integer invoke() { return Integer.valueOf(PreTrainedTextEncoder.this.convertTokenToId(PreTrainedTextEncoder.this.getMaskToken())); }
/*     */      }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public List<String> encodeAsTokens(@NotNull String text) {
/*  68 */     Intrinsics.checkNotNullParameter(text, "text"); return splitByTokens(CollectionsKt.emptyList(), text);
/*     */   }
/*     */   @NotNull
/*     */   public String decodeFromTokens(@NotNull List tokens) {
/*  72 */     Intrinsics.checkNotNullParameter(tokens, "tokens"); return CollectionsKt.joinToString$default(tokens, " ", null, null, 0, null, null, 62, null);
/*     */   }
/*     */   
/*     */   @NotNull
/*  76 */   public List<Integer> encodeAsIds(@NotNull String text, boolean withSpecialTokens, @Nullable Integer maxLen) { Intrinsics.checkNotNullParameter(text, "text"); Iterable<String> $this$map$iv = encodeAsTokens(text); int $i$f$map = 0;
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
/* 146 */     Iterable<String> iterable1 = $this$map$iv; Collection<Integer> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 147 */     for (String item$iv$iv : iterable1) {
/* 148 */       String str1 = item$iv$iv; Collection<Integer> collection = destination$iv$iv; int $i$a$-map-PreTrainedTextEncoder$encodeAsIds$encoded$1 = 0; collection.add(Integer.valueOf(convertTokenToId(str1)));
/* 149 */     }  List<Integer> encoded = (List)destination$iv$iv; if (maxLen != null) encoded = CollectionsKt.take(encoded, withSpecialTokens ? (maxLen.intValue() - numSpecialTokens()) : maxLen.intValue());  if (!withSpecialTokens)
/* 150 */       return encoded;  return buildInputsWithSpecialTokens(encoded); } @NotNull public String decodeFromIds(@NotNull List ids) { Intrinsics.checkNotNullParameter(ids, "ids"); List list1 = ids; PreTrainedTextEncoder preTrainedTextEncoder = this; int $i$f$map = 0; List list2 = list1; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10)); int $i$f$mapTo = 0;
/* 151 */     for (Object item$iv$iv : list2) {
/* 152 */       int i = ((Number)item$iv$iv).intValue(); Collection<String> collection = destination$iv$iv; int $i$a$-map-PreTrainedTextEncoder$decodeFromIds$1 = 0; collection.add(convertIdToToken(i));
/* 153 */     }  return preTrainedTextEncoder.decodeFromTokens((List<String>)destination$iv$iv); } public int numSpecialTokens() { return 2; } @NotNull public List<Integer> buildInputsWithSpecialTokens(@NotNull List ids) { Intrinsics.checkNotNullParameter(ids, "ids"); return CollectionsKt.plus(CollectionsKt.plus(CollectionsKt.listOf(Integer.valueOf(getClsId())), ids), CollectionsKt.listOf(Integer.valueOf(getSepId()))); } @NotNull public List<Integer> padSequence(@NotNull List<Integer> ids, int length, boolean isAttention) { Intrinsics.checkNotNullParameter(ids, "ids"); int padSize = length - ids.size(); if (padSize <= 0) return ids;  int padId = isAttention ? 0 : getPadId(); Integer[] arrayOfInteger; List<Integer> list; for (byte b = 0; b < padSize; ) { byte b1 = b; arrayOfInteger[b1] = Integer.valueOf(padId); b++; }  return CollectionsKt.plus(list, (Object[])arrayOfInteger); } private final List<String> splitByToken(String token, String text) { ArrayList<String> result = new ArrayList(); String[] arrayOfString = new String[1]; arrayOfString[0] = token; List split = StringsKt.split$default(text, arrayOfString, false, 0, 6, null); Iterator<String> iterator; int i; for (iterator = split.iterator(), i = 0; iterator.hasNext(); ) { int j = i; i++; String subText = iterator.next(); String mSubText = subText; if (j < split.size() - 1) mSubText = StringsKt.trimEnd(mSubText).toString();  if (j > 0) mSubText = StringsKt.trimStart(mSubText).toString();  if (j == 0 && ((((CharSequence)mSubText).length() > 0))) { result.add(token); continue; }  if (j == mSubText.length() - 1) { if ((((CharSequence)mSubText).length() > 0)) result.add(mSubText);  continue; }  if ((((CharSequence)mSubText).length() > 0)) result.add(mSubText);  result.add(token); }  return result; }
/* 154 */   private final List<String> splitByTokens(List tokens, String text) { if (StringsKt.isBlank(text)) return CollectionsKt.emptyList();  if (tokens.isEmpty()) return tokenizeText(text);  List textList = CollectionsKt.listOf(text); for (String token : tokens) { Iterable iterable2 = textList; int i = 0; Iterable iterable3 = iterable2; Collection collection = new ArrayList(); int j = 0;
/* 155 */       for (Object element$iv$iv : iterable3) {
/* 156 */         String subText = (String)element$iv$iv; int $i$a$-flatMap-PreTrainedTextEncoder$splitByTokens$1 = 0; Iterable<String> list$iv$iv = splitByToken(token, subText);
/* 157 */         CollectionsKt.addAll(collection, list$iv$iv);
/*     */       } 
/* 159 */       textList = (List)collection; }
/* 160 */      Iterable $this$flatMap$iv = textList; int $i$f$flatMap = 0; Iterable iterable1 = $this$flatMap$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$flatMapTo = 0;
/* 161 */     for (Object element$iv$iv : iterable1) {
/* 162 */       String token = (String)element$iv$iv; int $i$a$-flatMap-PreTrainedTextEncoder$splitByTokens$2 = 0; Iterable<String> list$iv$iv = tokenizeText(token);
/* 163 */       CollectionsKt.addAll(destination$iv$iv, list$iv$iv);
/*     */     } 
/* 165 */     return (List<String>)destination$iv$iv; }
/*     */ 
/*     */   
/*     */   public abstract int getVocabSize();
/*     */   
/*     */   protected abstract int convertTokenToId(@NotNull String paramString);
/*     */   
/*     */   @NotNull
/*     */   protected abstract String convertIdToToken(int paramInt);
/*     */   
/*     */   @NotNull
/*     */   protected abstract List<String> tokenizeText(@NotNull String paramString);
/*     */   
/*     */   public PreTrainedTextEncoder() {
/*     */     this(null, null, null, null, null, null, null, 127, null);
/*     */   } }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/nlp/encoder/PreTrainedTextEncoder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */