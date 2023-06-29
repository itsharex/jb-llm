package ai.grazie.model.llm.tokens

import ai.grazie.utils.mpp.RootDataLoader

interface LLMTokenCounterProvider {
    fun counter(paramRootDataLoader: RootDataLoader): LLMTokenCounter
}
