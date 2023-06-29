package ai.grazie.model.llm.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.RequiresOptIn;

@Retention(RetentionPolicy.RUNTIME)
@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\n\n\002\030\002\n\002\020\033\n\000\b\002\030\0002\0020\001B\000¨\006\002"}, d2 = {"Lai/grazie/model/llm/annotation/ExperimentalLLM;", "", "model-llm"})
@RequiresOptIn(message = "That LLM is experimental and prohibited to use in production")
public @interface ExperimentalLLM {}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/llm/annotation/ExperimentalLLM.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */