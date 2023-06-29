/*    */ package com.intellij.ml.llm.core.models.openai;
/*    */ 
/*    */ import com.intellij.ml.llm.core.models.grazie.GrazieRequestProvider;
/*    */ import com.intellij.ml.llm.core.models.mock.MockRequestProvider;
/*    */ import com.intellij.ml.llm.core.models.writer.RequestProviderToFileWriter;
/*    */ import com.intellij.openapi.diagnostic.Logger;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\0002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\004\020\005\"\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\b\020\t\"\021\020\n\032\0020\013¢\006\b\n\000\032\004\b\f\020\r\"\021\020\016\032\0020\017¢\006\b\n\000\032\004\b\020\020\021\"\023\020\022\032\0070\023¢\006\002\b\024X\004¢\006\002\n\000¨\006\025"}, d2 = {"CHAT_GPT_3_5_TURBO", "", "GrazieRequestProvider", "Lcom/intellij/ml/llm/core/models/grazie/GrazieRequestProvider;", "getGrazieRequestProvider", "()Lcom/intellij/ml/llm/core/models/grazie/GrazieRequestProvider;", "MockRequestProvider", "Lcom/intellij/ml/llm/core/models/mock/MockRequestProvider;", "getMockRequestProvider", "()Lcom/intellij/ml/llm/core/models/mock/MockRequestProvider;", "OpenAIRequestProvider", "Lcom/intellij/ml/llm/core/models/openai/OpenAIRequestProviderImpl;", "getOpenAIRequestProvider", "()Lcom/intellij/ml/llm/core/models/openai/OpenAIRequestProviderImpl;", "RequestProviderWriter", "Lcom/intellij/ml/llm/core/models/writer/RequestProviderToFileWriter;", "getRequestProviderWriter", "()Lcom/intellij/ml/llm/core/models/writer/RequestProviderToFileWriter;", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "Lorg/jetbrains/annotations/NotNull;", "intellij.ml.llm"})
/*    */ public final class OpenAIRequestProviderImplKt
/*    */ {
/*    */   @NotNull
/*    */   private static final String CHAT_GPT_3_5_TURBO = "gpt-3.5-turbo";
/*    */   @NotNull
/* 18 */   private static final Logger logger = Logger.getInstance("#com.intellij.ml.llm.models"); static { Intrinsics.checkNotNullExpressionValue(Logger.getInstance("#com.intellij.ml.llm.models"), "getInstance(\"#com.intellij.ml.llm.models\")"); }
/*    */    @NotNull
/* 20 */   private static final MockRequestProvider MockRequestProvider = new MockRequestProvider(); @NotNull public static final MockRequestProvider getMockRequestProvider() { return MockRequestProvider; } @NotNull
/* 21 */   private static final OpenAIRequestProviderImpl OpenAIRequestProvider = new OpenAIRequestProviderImpl("gpt-3.5-turbo", null, null, 6, null); @NotNull public static final OpenAIRequestProviderImpl getOpenAIRequestProvider() { return OpenAIRequestProvider; } @NotNull
/* 22 */   private static final GrazieRequestProvider GrazieRequestProvider = new GrazieRequestProvider(); @NotNull public static final GrazieRequestProvider getGrazieRequestProvider() { return GrazieRequestProvider; } @NotNull
/* 23 */   private static final RequestProviderToFileWriter RequestProviderWriter = new RequestProviderToFileWriter(); @NotNull public static final RequestProviderToFileWriter getRequestProviderWriter() { return RequestProviderWriter; }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/openai/OpenAIRequestProviderImplKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */