package ai.grazie.nlp.tokenizer.word;

import ai.grazie.nlp.tokenizer.Tokenizer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "BasicWordTokenizer.kt", l = {31}, i = {0}, s = {"L$0"}, n = {"$this$sequence"}, m = "invokeSuspend", c = "ai.grazie.nlp.tokenizer.word.BasicWordTokenizer$tokenizeAsSequence$1")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\030\002\020\000\032\0020\001*\b\022\004\022\0020\0030\002H@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;"})
final class BasicWordTokenizer$tokenizeAsSequence$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Tokenizer.Token>, Continuation<? super Unit>, Object> {
  Object L$1;
  
  int label;
  
  BasicWordTokenizer$tokenizeAsSequence$1(Sequence<Character> $text, Continuation $completion) {
    super(2, $completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #8
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 244, 0 -> 32, 1 -> 214
    //   32: aload_1
    //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   36: aload_0
    //   37: getfield L$0 : Ljava/lang/Object;
    //   40: checkcast kotlin/sequences/SequenceScope
    //   43: astore_2
    //   44: aload_0
    //   45: getfield this$0 : Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer;
    //   48: aload_0
    //   49: getfield $text : Lkotlin/sequences/Sequence;
    //   52: invokestatic access$cleanText : (Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer;Lkotlin/sequences/Sequence;)Lkotlin/sequences/Sequence;
    //   55: astore_3
    //   56: getstatic ai/grazie/nlp/tokenizer/word/WhitespaceWordTokenizer.INSTANCE : Lai/grazie/nlp/tokenizer/word/WhitespaceWordTokenizer;
    //   59: aload_3
    //   60: invokevirtual tokenizeAsSequence : (Lkotlin/sequences/Sequence;)Lkotlin/sequences/Sequence;
    //   63: astore #4
    //   65: aload #4
    //   67: invokeinterface iterator : ()Ljava/util/Iterator;
    //   72: astore #5
    //   74: aload #5
    //   76: invokeinterface hasNext : ()Z
    //   81: ifeq -> 240
    //   84: aload #5
    //   86: invokeinterface next : ()Ljava/lang/Object;
    //   91: checkcast ai/grazie/nlp/tokenizer/Tokenizer$Token
    //   94: astore #6
    //   96: aload #6
    //   98: invokevirtual getToken : ()Ljava/lang/String;
    //   101: astore #7
    //   103: aload_0
    //   104: getfield this$0 : Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer;
    //   107: invokestatic access$getToLowerCase$p : (Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer;)Z
    //   110: ifeq -> 150
    //   113: nop
    //   114: aload #7
    //   116: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
    //   119: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   122: dup
    //   123: ldc 'this as java.lang.String).toLowerCase(Locale.ROOT)'
    //   125: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   128: astore #7
    //   130: aload_0
    //   131: getfield this$0 : Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer;
    //   134: invokestatic access$getShouldNormalizeAccentLetters$p : (Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer;)Z
    //   137: ifeq -> 167
    //   140: aload #7
    //   142: invokestatic normalizeAccents : (Ljava/lang/String;)Ljava/lang/String;
    //   145: astore #7
    //   147: goto -> 167
    //   150: aload_0
    //   151: getfield this$0 : Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer;
    //   154: invokestatic access$getShouldNormalizeAccentLetters$p : (Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer;)Z
    //   157: ifeq -> 167
    //   160: aload #7
    //   162: invokestatic normalizeAccents : (Ljava/lang/String;)Ljava/lang/String;
    //   165: astore #7
    //   167: aload_2
    //   168: aload #6
    //   170: aload_0
    //   171: getfield this$0 : Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer;
    //   174: aload #7
    //   176: invokestatic access$splitOnPunctuation : (Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer;Ljava/lang/String;)Lkotlin/sequences/Sequence;
    //   179: invokestatic splitToken : (Lai/grazie/nlp/tokenizer/Tokenizer$Token;Lkotlin/sequences/Sequence;)Lkotlin/sequences/Sequence;
    //   182: aload_0
    //   183: checkcast kotlin/coroutines/Continuation
    //   186: aload_0
    //   187: aload_2
    //   188: putfield L$0 : Ljava/lang/Object;
    //   191: aload_0
    //   192: aload #5
    //   194: putfield L$1 : Ljava/lang/Object;
    //   197: aload_0
    //   198: iconst_1
    //   199: putfield label : I
    //   202: invokevirtual yieldAll : (Lkotlin/sequences/Sequence;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   205: dup
    //   206: aload #8
    //   208: if_acmpne -> 236
    //   211: aload #8
    //   213: areturn
    //   214: aload_0
    //   215: getfield L$1 : Ljava/lang/Object;
    //   218: checkcast java/util/Iterator
    //   221: astore #5
    //   223: aload_0
    //   224: getfield L$0 : Ljava/lang/Object;
    //   227: checkcast kotlin/sequences/SequenceScope
    //   230: astore_2
    //   231: aload_1
    //   232: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   235: aload_1
    //   236: pop
    //   237: goto -> 74
    //   240: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   243: areturn
    //   244: new java/lang/IllegalStateException
    //   247: dup
    //   248: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   250: invokespecial <init> : (Ljava/lang/String;)V
    //   253: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #16	-> 3
    //   #17	-> 44
    //   #18	-> 56
    //   #20	-> 65
    //   #21	-> 96
    //   #22	-> 103
    //   #23	-> 113
    //   #23	-> 128
    //   #24	-> 130
    //   #25	-> 140
    //   #27	-> 150
    //   #28	-> 160
    //   #31	-> 167
    //   #16	-> 211
    //   #31	-> 236
    //   #33	-> 240
    //   #16	-> 244
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   44	84	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   128	86	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   231	13	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   56	9	3	mText	Lkotlin/sequences/Sequence;
    //   65	9	4	origTokens	Lkotlin/sequences/Sequence;
    //   96	32	6	token	Lai/grazie/nlp/tokenizer/Tokenizer$Token;
    //   128	77	6	token	Lai/grazie/nlp/tokenizer/Tokenizer$Token;
    //   103	11	7	mToken	Ljava/lang/String;
    //   130	17	7	mToken	Ljava/lang/String;
    //   147	20	7	mToken	Ljava/lang/String;
    //   167	38	7	mToken	Ljava/lang/String;
    //   36	208	0	this	Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer$tokenizeAsSequence$1;
    //   36	208	1	$result	Ljava/lang/Object;
  }
  
  @NotNull
  public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super BasicWordTokenizer$tokenizeAsSequence$1> $completion) {
    BasicWordTokenizer$tokenizeAsSequence$1 basicWordTokenizer$tokenizeAsSequence$1 = new BasicWordTokenizer$tokenizeAsSequence$1(this.$text, $completion);
    basicWordTokenizer$tokenizeAsSequence$1.L$0 = value;
    return (Continuation<Unit>)basicWordTokenizer$tokenizeAsSequence$1;
  }
  
  @Nullable
  public final Object invoke(@NotNull SequenceScope p1, @Nullable Continuation<?> p2) {
    return ((BasicWordTokenizer$tokenizeAsSequence$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/nlp/tokenizer/word/BasicWordTokenizer$tokenizeAsSequence$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */