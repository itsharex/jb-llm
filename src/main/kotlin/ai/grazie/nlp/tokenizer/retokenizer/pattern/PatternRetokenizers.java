package ai.grazie.nlp.tokenizer.retokenizer.pattern;

import ai.grazie.nlp.patterns.Pattern;
import ai.grazie.nlp.tokenizer.NonDestructiveTokenizer;
import ai.grazie.nlp.tokenizer.retokenizer.PatternRetokenizer;
import org.jetbrains.annotations.NotNull;

public final class PatternRetokenizers {
    public static final class URL extends PatternRetokenizer {
        public URL(@NotNull NonDestructiveTokenizer tokenizer) {
            super(LikelyPatterns.INSTANCE.getIsURL(), tokenizer);
        }
    }

    public static final class UUID extends PatternRetokenizer {
        public UUID(@NotNull NonDestructiveTokenizer tokenizer) {
            super((Pattern) StrictPatterns.INSTANCE.getIsUUID(), tokenizer);
        }
    }

    @NotNull
    public static final PatternRetokenizers INSTANCE = new PatternRetokenizers();
    @NotNull
    private static final List<Pattern> defaultIgnorePatterns;

    @NotNull
    public final List<Pattern> getDefaultIgnorePatterns() {
        return defaultIgnorePatterns;
    }

    static {
        Pattern[] arrayOfPattern = new Pattern[13];
        arrayOfPattern[0] = LikelyPatterns.INSTANCE.getIsURL();
        arrayOfPattern[1] = (Pattern) LikelyPatterns.INSTANCE.getIsAbbreviation();
        arrayOfPattern[2] = (Pattern) LikelyPatterns.INSTANCE.getIsEmail();
        arrayOfPattern[3] = (Pattern) LikelyPatterns.INSTANCE.getIsIPv4();
        arrayOfPattern[4] =
                (Pattern) StrictPatterns.INSTANCE.getIsUUID();
        arrayOfPattern[5] = (Pattern) LikelyPatterns.INSTANCE.getIsOrdinalNumeral();
        arrayOfPattern[6] = (Pattern) LikelyPatterns.INSTANCE.getTicketName();
        arrayOfPattern[7] = (Pattern) LikelyPatterns.INSTANCE.getIsMention();
        arrayOfPattern[8] = (Pattern) LikelyPatterns.INSTANCE.getIsFilePath();
        arrayOfPattern[9] = (Pattern) LikelyPatterns.INSTANCE.getCommandLineOption();
        arrayOfPattern[10] = (Pattern) LikelyPatterns.INSTANCE.getChainedName();
        arrayOfPattern[11] = (Pattern) LikelyPatterns.INSTANCE.getIsCompositeInflection();
        arrayOfPattern[12] = (Pattern) LikelyPatterns.INSTANCE.getChemical();
        defaultIgnorePatterns = CollectionsKt.listOf((Object[]) arrayOfPattern);
    }

    @NotNull
    public final NonDestructiveTokenizer default(
    @NotNull
    NonDestructiveTokenizer tokenizer)

    {
        Intrinsics.checkNotNullParameter(tokenizer, "tokenizer");
        Object result = null;
        result = tokenizer;
        Iterable $this$forEach$iv = CollectionsKt.reversed(defaultIgnorePatterns);
        int $i$f$forEach = 0;


        Iterator iterator = $this$forEach$iv.iterator();
        if (iterator.hasNext()) {
            Object element$iv = iterator.next();
            Pattern it = (Pattern) element$iv;
            int $i$a$ -forEach - PatternRetokenizers$default$1 = 0;
            result = new PatternRetokenizer(it, (NonDestructiveTokenizer) result);
        }

        return (NonDestructiveTokenizer) result;
    }
}

