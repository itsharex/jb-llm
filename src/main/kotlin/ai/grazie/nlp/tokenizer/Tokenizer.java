package ai.grazie.nlp.tokenizer;

import ai.grazie.DataHolder;
import ai.grazie.text.TextRange;
import ai.grazie.text.Text;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface Tokenizer {
    @NotNull
    public static final Keys Keys = Keys.$$INSTANCE;

    public static final class Token {
        @NotNull
        private final Text text;
        @NotNull
        private final TextRange interval;

        public Token(@NotNull Text text, @NotNull TextRange interval) {
            this.text = text;
            this.interval = interval;
        }

        @NotNull
        public final Text getText() {
            return this.text;
        }

        @NotNull
        public final TextRange getInterval() {
            return this.interval;
        }

        @NotNull
        public final String getToken() {
            return this.text.getValue();
        }

        @NotNull
        public final IntRange getRange() {
            return new IntRange(this.interval.getStart(), this.interval.getEndInclusive());
        }

        public Token(@NotNull String token, @NotNull IntRange range) {
            this(new Text(token), TextRange.Companion.invoke(range));
        }

        @NotNull
        public final Text component1() {
            return this.text;
        }

        @NotNull
        public final TextRange component2() {
            return this.interval;
        }

        @NotNull
        public final Token copy(@NotNull Text text, @NotNull TextRange interval) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(interval, "interval");
            return new Token(text, interval);
        }

        @NotNull
        public final Token merge(@NotNull Token other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (!((getRange().getEndInclusive().intValue() == other.getRange().getStart().intValue() - 1) ? 1 : 0)) {
                int $i$a$ -require - Tokenizer$Token$merge$1 = 0;
                String str = "Can't merge tokens which are not sequential. Ranges were [" +

                        getRange().getStart() + ", " + getRange().getEndInclusive() + "] and [" + other.getRange().getStart() + ", " + other.getRange().getEndInclusive() + "].";
                throw new IllegalArgumentException(str.toString());
            }

            return new Token(getToken() + getToken(), new IntRange(getRange().getStart().intValue(), other.getRange().getEndInclusive().intValue()));
        }

        public boolean equals(@Nullable Object other) {
            if (this == other)
                return true;
            if (!(other instanceof Token))
                return false;
            Token token = (Token) other;
            return !Intrinsics.areEqual(this.text, token.text) ? false : (!!Intrinsics.areEqual(this.interval, token.interval));
        }
    }

    @NotNull
    default List<Token> tokenize(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return tokenize(new Text(text));
    }

    @NotNull
    default List<Token> tokenize(@NotNull Text text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return tokenize(text.getValue());
    }

    @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\020 \n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\035\020\003\032\016\022\n\022\b\022\004\022\0020\0060\0050\004¢\006\b\n\000\032\004\b\007\020\bR\035\020\t\032\016\022\n\022\b\022\004\022\0020\0060\0050\004¢\006\b\n\000\032\004\b\n\020\b¨\006\013"}, d2 = {"Lai/grazie/nlp/tokenizer/Tokenizer$Keys;", "", "()V", "sentences", "Lai/grazie/DataHolder$Key;", "", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;", "getSentences", "()Lai/grazie/DataHolder$Key;", "words", "getWords", "nlp-tokenizer"})
    public static final class Keys {
        @NotNull
        private static final DataHolder.Key<List<Tokenizer.Token>> sentences = new DataHolder.Key();

        @NotNull
        public final DataHolder.Key<List<Tokenizer.Token>> getSentences() {
            return sentences;
        }

        @NotNull
        private static final DataHolder.Key<List<Token>> words = new DataHolder.Key();

        @NotNull
        public final DataHolder.Key<List<Tokenizer.Token>> getWords() {
            return words;
        }
    }
}
