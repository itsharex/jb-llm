package ai.grazie.nlp.tokenizer.retokenizer.pattern;

import ai.grazie.nlp.tokenizer.NonDestructiveTokenizer;
import ai.grazie.nlp.tokenizer.retokenizer.PatternRetokenizer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

import java.util.regex.Pattern;

public final class UUID extends PatternRetokenizer {
    public UUID(@NotNull NonDestructiveTokenizer tokenizer) {
        super((Pattern) StrictPatterns.INSTANCE.getIsUUID(), tokenizer);
    }
}

