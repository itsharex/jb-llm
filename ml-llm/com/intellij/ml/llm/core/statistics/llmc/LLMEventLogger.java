/*     */ package com.intellij.ml.llm.core.statistics.llmc;
/*     */ import com.intellij.internal.statistic.eventLog.EventLogGroup;
/*     */ import com.intellij.internal.statistic.eventLog.events.DoubleEventField;
/*     */ import com.intellij.internal.statistic.eventLog.events.EventField;
/*     */ import com.intellij.internal.statistic.eventLog.events.EventFields;
/*     */ import com.intellij.internal.statistic.eventLog.events.ObjectEventField;
/*     */ import com.intellij.internal.statistic.eventLog.events.VarargEventId;
/*     */ import com.intellij.ml.llm.core.statistics.CommonLoggerServiceKt;
/*     */ import com.intellij.ml.llm.core.statistics.ScoredIdeActivityDefinition;
/*     */ import com.intellij.ml.llm.core.statistics.ScoredIdeActivityKt;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\b\000\030\000 \0052\0020\001:\001\005B\005¢\006\002\020\002J\b\020\003\032\0020\004H\026¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/core/statistics/llmc/LLMEventLogger;", "Lcom/intellij/internal/statistic/service/fus/collectors/CounterUsagesCollector;", "()V", "getGroup", "Lcom/intellij/internal/statistic/eventLog/EventLogGroup;", "Companion", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nLLMEventLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMEventLogger.kt\ncom/intellij/ml/llm/core/statistics/llmc/LLMEventLogger\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,118:1\n37#2,2:119\n*S KotlinDebug\n*F\n+ 1 LLMEventLogger.kt\ncom/intellij/ml/llm/core/statistics/llmc/LLMEventLogger\n*L\n32#1:119,2\n*E\n"})
/*     */ public final class LLMEventLogger extends CounterUsagesCollector {
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\013\n\002\030\002\n\002\b\t\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J+\020.\032\f\022\b\022\006\022\002\b\003000/2\b\0201\032\004\030\001022\b\0203\032\004\030\0010\001H\000¢\006\002\b4R\016\020\003\032\0020\004X\004¢\006\002\n\000R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nX\004¢\006\b\n\000\032\004\b\013\020\fR\024\020\r\032\0020\006X\004¢\006\b\n\000\032\004\b\016\020\bR\024\020\017\032\0020\nX\004¢\006\b\n\000\032\004\b\020\020\fR\024\020\021\032\0020\022X\004¢\006\b\n\000\032\004\b\023\020\024R\024\020\025\032\0020\006X\004¢\006\b\n\000\032\004\b\026\020\bR\024\020\027\032\0020\nX\004¢\006\b\n\000\032\004\b\030\020\fR\024\020\031\032\0020\006X\004¢\006\b\n\000\032\004\b\032\020\bR\024\020\033\032\0020\nX\004¢\006\b\n\000\032\004\b\034\020\fR\016\020\035\032\0020\036X\004¢\006\002\n\000R\024\020\037\032\0020\006X\004¢\006\b\n\000\032\004\b \020\bR\024\020!\032\0020\nX\004¢\006\b\n\000\032\004\b\"\020\fR\024\020#\032\0020\nX\004¢\006\b\n\000\032\004\b$\020\fR\024\020%\032\0020\nX\004¢\006\b\n\000\032\004\b&\020\fR\016\020'\032\0020(X\004¢\006\002\n\000R\024\020)\032\0020\022X\004¢\006\b\n\000\032\004\b*\020\024R\016\020+\032\0020,X\004¢\006\002\n\000R\016\020-\032\0020,X\004¢\006\002\n\000¨\0065"}, d2 = {"Lcom/intellij/ml/llm/core/statistics/llmc/LLMEventLogger$Companion;", "", "()V", "ADDITIONAL_PARAMETERS", "Lcom/intellij/internal/statistic/eventLog/events/ObjectEventField;", "COMMIT_GENERATION", "Lcom/intellij/ml/llm/core/statistics/ScoredIdeActivityDefinition;", "getCOMMIT_GENERATION$intellij_ml_llm", "()Lcom/intellij/ml/llm/core/statistics/ScoredIdeActivityDefinition;", "COMMIT_GENERATION_SENT", "Lcom/intellij/internal/statistic/eventLog/events/VarargEventId;", "getCOMMIT_GENERATION_SENT$intellij_ml_llm", "()Lcom/intellij/internal/statistic/eventLog/events/VarargEventId;", "COMPLETION_ACTION_ACTIVITY", "getCOMPLETION_ACTION_ACTIVITY$intellij_ml_llm", "COMPLETION_REQUEST_SENT", "getCOMPLETION_REQUEST_SENT$intellij_ml_llm", "CONTEXT", "Lcom/intellij/ml/llm/core/statistics/llmc/RequestPrivateData;", "getCONTEXT$intellij_ml_llm", "()Lcom/intellij/ml/llm/core/statistics/llmc/RequestPrivateData;", "DOCUMENTATION_GENERATION", "getDOCUMENTATION_GENERATION$intellij_ml_llm", "DOCUMENTATION_GENERATION_SENT", "getDOCUMENTATION_GENERATION_SENT$intellij_ml_llm", "EDIT_ACTION_ACTIVITY", "getEDIT_ACTION_ACTIVITY$intellij_ml_llm", "EDIT_REQUEST_SENT", "getEDIT_REQUEST_SENT$intellij_ml_llm", "GROUP", "Lcom/intellij/internal/statistic/eventLog/EventLogGroup;", "NAME_SUGGESTIONS_ACTIVITY", "getNAME_SUGGESTIONS_ACTIVITY$intellij_ml_llm", "NAME_SUGGESTIONS_REQUEST", "getNAME_SUGGESTIONS_REQUEST$intellij_ml_llm", "NAME_SUGGESTIONS_RESPONSE", "getNAME_SUGGESTIONS_RESPONSE$intellij_ml_llm", "NAME_SUGGESTIONS_SHOW", "getNAME_SUGGESTIONS_SHOW$intellij_ml_llm", "NUMBER_OF_SUGGESTIONS", "Lcom/intellij/internal/statistic/eventLog/events/IntEventField;", "SELECTED", "getSELECTED$intellij_ml_llm", "TEMPERATURE", "Lcom/intellij/internal/statistic/eventLog/events/DoubleEventField;", "TOP_P", "extractChatRequestParameters", "", "Lcom/intellij/internal/statistic/eventLog/events/EventPair;", "model", "", "body", "extractChatRequestParameters$intellij_ml_llm", "intellij.ml.llm"})
/*     */   @SourceDebugExtension({"SMAP\nLLMEventLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMEventLogger.kt\ncom/intellij/ml/llm/core/statistics/llmc/LLMEventLogger$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,118:1\n1#2:119\n1282#3,2:120\n2298#3,5:122\n288#4,2:127\n533#4,6:129\n*S KotlinDebug\n*F\n+ 1 LLMEventLogger.kt\ncom/intellij/ml/llm/core/statistics/llmc/LLMEventLogger$Companion\n*L\n86#1:120,2\n90#1:122,5\n96#1:127,2\n100#1:129,6\n*E\n"})
/*     */   public static final class Companion {
/*     */     @NotNull
/*     */     public final RequestPrivateData getCONTEXT$intellij_ml_llm() {
/*  22 */       return LLMEventLogger.CONTEXT;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private Companion() {}
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final ScoredIdeActivityDefinition getEDIT_ACTION_ACTIVITY$intellij_ml_llm() {
/*  35 */       return LLMEventLogger.EDIT_ACTION_ACTIVITY;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final VarargEventId getEDIT_REQUEST_SENT$intellij_ml_llm() {
/*  40 */       return LLMEventLogger.EDIT_REQUEST_SENT;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final ScoredIdeActivityDefinition getCOMPLETION_ACTION_ACTIVITY$intellij_ml_llm() {
/*  45 */       return LLMEventLogger.COMPLETION_ACTION_ACTIVITY;
/*     */     }
/*     */     @NotNull
/*     */     public final VarargEventId getCOMPLETION_REQUEST_SENT$intellij_ml_llm() {
/*  49 */       return LLMEventLogger.COMPLETION_REQUEST_SENT;
/*     */     }
/*     */     @NotNull
/*     */     public final ScoredIdeActivityDefinition getDOCUMENTATION_GENERATION$intellij_ml_llm() {
/*  53 */       return LLMEventLogger.DOCUMENTATION_GENERATION;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final VarargEventId getDOCUMENTATION_GENERATION_SENT$intellij_ml_llm() {
/*  58 */       return LLMEventLogger.DOCUMENTATION_GENERATION_SENT;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final ScoredIdeActivityDefinition getCOMMIT_GENERATION$intellij_ml_llm() {
/*  63 */       return LLMEventLogger.COMMIT_GENERATION;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final VarargEventId getCOMMIT_GENERATION_SENT$intellij_ml_llm() {
/*  68 */       return LLMEventLogger.COMMIT_GENERATION_SENT;
/*     */     }
/*     */     
/*     */     @NotNull
/*  72 */     public final RequestPrivateData getSELECTED$intellij_ml_llm() { return LLMEventLogger.SELECTED; } @NotNull
/*  73 */     public final ScoredIdeActivityDefinition getNAME_SUGGESTIONS_ACTIVITY$intellij_ml_llm() { return LLMEventLogger.NAME_SUGGESTIONS_ACTIVITY; } @NotNull
/*  74 */     public final VarargEventId getNAME_SUGGESTIONS_REQUEST$intellij_ml_llm() { return LLMEventLogger.NAME_SUGGESTIONS_REQUEST; }
/*     */     @NotNull
/*  76 */     public final VarargEventId getNAME_SUGGESTIONS_RESPONSE$intellij_ml_llm() { return LLMEventLogger.NAME_SUGGESTIONS_RESPONSE; } @NotNull
/*     */     public final VarargEventId getNAME_SUGGESTIONS_SHOW$intellij_ml_llm() {
/*  78 */       return LLMEventLogger.NAME_SUGGESTIONS_SHOW;
/*     */     }
/*     */     @NotNull
/*     */     public final List<EventPair<?>> extractChatRequestParameters$intellij_ml_llm(@Nullable String model, @Nullable Object body) {
/*     */       // Byte code:
/*     */       //   0: new java/util/ArrayList
/*     */       //   3: dup
/*     */       //   4: invokespecial <init> : ()V
/*     */       //   7: astore_3
/*     */       //   8: aload_1
/*     */       //   9: dup
/*     */       //   10: ifnull -> 33
/*     */       //   13: astore #5
/*     */       //   15: iconst_0
/*     */       //   16: istore #6
/*     */       //   18: aload_3
/*     */       //   19: invokestatic getPROFILE : ()Lcom/intellij/internal/statistic/eventLog/events/StringEventField;
/*     */       //   22: aload_1
/*     */       //   23: invokevirtual with : (Ljava/lang/Object;)Lcom/intellij/internal/statistic/eventLog/events/EventPair;
/*     */       //   26: invokevirtual add : (Ljava/lang/Object;)Z
/*     */       //   29: pop
/*     */       //   30: goto -> 35
/*     */       //   33: pop
/*     */       //   34: nop
/*     */       //   35: aload_2
/*     */       //   36: instanceof ai/grazie/model/llm/chat/LLMChat
/*     */       //   39: ifeq -> 266
/*     */       //   42: aload_2
/*     */       //   43: checkcast ai/grazie/model/llm/chat/LLMChat
/*     */       //   46: invokevirtual getMessages : ()[Lai/grazie/model/llm/chat/LLMChatMessage;
/*     */       //   49: astore #5
/*     */       //   51: nop
/*     */       //   52: iconst_0
/*     */       //   53: istore #6
/*     */       //   55: iconst_0
/*     */       //   56: istore #7
/*     */       //   58: aload #5
/*     */       //   60: arraylength
/*     */       //   61: istore #8
/*     */       //   63: iload #7
/*     */       //   65: iload #8
/*     */       //   67: if_icmpge -> 114
/*     */       //   70: aload #5
/*     */       //   72: iload #7
/*     */       //   74: aaload
/*     */       //   75: astore #9
/*     */       //   77: aload #9
/*     */       //   79: astore #10
/*     */       //   81: iconst_0
/*     */       //   82: istore #11
/*     */       //   84: aload #10
/*     */       //   86: invokevirtual getRole : ()Lai/grazie/model/llm/chat/LLMChatRole;
/*     */       //   89: getstatic ai/grazie/model/llm/chat/LLMChatRole.System : Lai/grazie/model/llm/chat/LLMChatRole;
/*     */       //   92: if_acmpne -> 99
/*     */       //   95: iconst_1
/*     */       //   96: goto -> 100
/*     */       //   99: iconst_0
/*     */       //   100: ifeq -> 108
/*     */       //   103: aload #9
/*     */       //   105: goto -> 115
/*     */       //   108: iinc #7, 1
/*     */       //   111: goto -> 63
/*     */       //   114: aconst_null
/*     */       //   115: astore #4
/*     */       //   117: aload #4
/*     */       //   119: ifnull -> 151
/*     */       //   122: aload #4
/*     */       //   124: astore #6
/*     */       //   126: iconst_0
/*     */       //   127: istore #7
/*     */       //   129: aload_3
/*     */       //   130: getstatic com/intellij/ml/llm/core/statistics/llmc/LLMEventLogger.Companion : Lcom/intellij/ml/llm/core/statistics/llmc/LLMEventLogger$Companion;
/*     */       //   133: invokevirtual getCONTEXT$intellij_ml_llm : ()Lcom/intellij/ml/llm/core/statistics/llmc/RequestPrivateData;
/*     */       //   136: aload #6
/*     */       //   138: invokevirtual getText : ()Ljava/lang/String;
/*     */       //   141: invokevirtual with : (Ljava/lang/Object;)Lcom/intellij/internal/statistic/eventLog/events/EventPair;
/*     */       //   144: invokevirtual add : (Ljava/lang/Object;)Z
/*     */       //   147: pop
/*     */       //   148: goto -> 152
/*     */       //   151: nop
/*     */       //   152: aload_2
/*     */       //   153: checkcast ai/grazie/model/llm/chat/LLMChat
/*     */       //   156: invokevirtual getMessages : ()[Lai/grazie/model/llm/chat/LLMChatMessage;
/*     */       //   159: astore #5
/*     */       //   161: nop
/*     */       //   162: iconst_0
/*     */       //   163: istore #6
/*     */       //   165: aload #5
/*     */       //   167: arraylength
/*     */       //   168: iconst_m1
/*     */       //   169: iadd
/*     */       //   170: istore #7
/*     */       //   172: iconst_0
/*     */       //   173: iload #7
/*     */       //   175: if_icmpgt -> 229
/*     */       //   178: iload #7
/*     */       //   180: istore #8
/*     */       //   182: iinc #7, -1
/*     */       //   185: aload #5
/*     */       //   187: iload #8
/*     */       //   189: aaload
/*     */       //   190: astore #9
/*     */       //   192: aload #9
/*     */       //   194: astore #10
/*     */       //   196: iconst_0
/*     */       //   197: istore #11
/*     */       //   199: aload #10
/*     */       //   201: invokevirtual getRole : ()Lai/grazie/model/llm/chat/LLMChatRole;
/*     */       //   204: getstatic ai/grazie/model/llm/chat/LLMChatRole.User : Lai/grazie/model/llm/chat/LLMChatRole;
/*     */       //   207: if_acmpne -> 214
/*     */       //   210: iconst_1
/*     */       //   211: goto -> 215
/*     */       //   214: iconst_0
/*     */       //   215: ifeq -> 223
/*     */       //   218: aload #9
/*     */       //   220: goto -> 230
/*     */       //   223: iconst_0
/*     */       //   224: iload #7
/*     */       //   226: if_icmple -> 178
/*     */       //   229: aconst_null
/*     */       //   230: astore #4
/*     */       //   232: aload #4
/*     */       //   234: ifnull -> 263
/*     */       //   237: aload #4
/*     */       //   239: astore #6
/*     */       //   241: iconst_0
/*     */       //   242: istore #7
/*     */       //   244: aload_3
/*     */       //   245: invokestatic getUSER_REQUEST : ()Lcom/intellij/ml/llm/core/statistics/llmc/RequestPrivateData;
/*     */       //   248: aload #6
/*     */       //   250: invokevirtual getText : ()Ljava/lang/String;
/*     */       //   253: invokevirtual with : (Ljava/lang/Object;)Lcom/intellij/internal/statistic/eventLog/events/EventPair;
/*     */       //   256: invokevirtual add : (Ljava/lang/Object;)Z
/*     */       //   259: pop
/*     */       //   260: goto -> 710
/*     */       //   263: goto -> 710
/*     */       //   266: aload_2
/*     */       //   267: instanceof com/intellij/ml/llm/core/models/openai/OpenAiChatRequestBody
/*     */       //   270: ifeq -> 710
/*     */       //   273: aload_2
/*     */       //   274: checkcast com/intellij/ml/llm/core/models/openai/OpenAiChatRequestBody
/*     */       //   277: invokevirtual getMessages : ()Ljava/util/List;
/*     */       //   280: astore #4
/*     */       //   282: aload #4
/*     */       //   284: ifnull -> 398
/*     */       //   287: aload #4
/*     */       //   289: checkcast java/lang/Iterable
/*     */       //   292: astore #6
/*     */       //   294: nop
/*     */       //   295: iconst_0
/*     */       //   296: istore #7
/*     */       //   298: aload #6
/*     */       //   300: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   305: astore #8
/*     */       //   307: aload #8
/*     */       //   309: invokeinterface hasNext : ()Z
/*     */       //   314: ifeq -> 358
/*     */       //   317: aload #8
/*     */       //   319: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   324: astore #9
/*     */       //   326: aload #9
/*     */       //   328: checkcast com/intellij/ml/llm/core/models/openai/OpenAiChatMessage
/*     */       //   331: astore #10
/*     */       //   333: iconst_0
/*     */       //   334: istore #11
/*     */       //   336: aload #10
/*     */       //   338: invokevirtual getRole : ()Ljava/lang/String;
/*     */       //   341: getstatic ai/grazie/model/llm/chat/LLMChatRole.System : Lai/grazie/model/llm/chat/LLMChatRole;
/*     */       //   344: invokevirtual name : ()Ljava/lang/String;
/*     */       //   347: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   350: ifeq -> 307
/*     */       //   353: aload #9
/*     */       //   355: goto -> 359
/*     */       //   358: aconst_null
/*     */       //   359: checkcast com/intellij/ml/llm/core/models/openai/OpenAiChatMessage
/*     */       //   362: astore #5
/*     */       //   364: aload #5
/*     */       //   366: ifnull -> 398
/*     */       //   369: aload #5
/*     */       //   371: astore #7
/*     */       //   373: iconst_0
/*     */       //   374: istore #8
/*     */       //   376: aload_3
/*     */       //   377: getstatic com/intellij/ml/llm/core/statistics/llmc/LLMEventLogger.Companion : Lcom/intellij/ml/llm/core/statistics/llmc/LLMEventLogger$Companion;
/*     */       //   380: invokevirtual getCONTEXT$intellij_ml_llm : ()Lcom/intellij/ml/llm/core/statistics/llmc/RequestPrivateData;
/*     */       //   383: aload #7
/*     */       //   385: invokevirtual getContent : ()Ljava/lang/String;
/*     */       //   388: invokevirtual with : (Ljava/lang/Object;)Lcom/intellij/internal/statistic/eventLog/events/EventPair;
/*     */       //   391: invokevirtual add : (Ljava/lang/Object;)Z
/*     */       //   394: pop
/*     */       //   395: goto -> 399
/*     */       //   398: nop
/*     */       //   399: aload_2
/*     */       //   400: checkcast com/intellij/ml/llm/core/models/openai/OpenAiChatRequestBody
/*     */       //   403: invokevirtual getMessages : ()Ljava/util/List;
/*     */       //   406: astore #4
/*     */       //   408: aload #4
/*     */       //   410: ifnull -> 525
/*     */       //   413: aload #4
/*     */       //   415: astore #6
/*     */       //   417: nop
/*     */       //   418: iconst_0
/*     */       //   419: istore #7
/*     */       //   421: aload #6
/*     */       //   423: aload #6
/*     */       //   425: invokeinterface size : ()I
/*     */       //   430: invokeinterface listIterator : (I)Ljava/util/ListIterator;
/*     */       //   435: astore #8
/*     */       //   437: aload #8
/*     */       //   439: invokeinterface hasPrevious : ()Z
/*     */       //   444: ifeq -> 488
/*     */       //   447: aload #8
/*     */       //   449: invokeinterface previous : ()Ljava/lang/Object;
/*     */       //   454: astore #9
/*     */       //   456: aload #9
/*     */       //   458: checkcast com/intellij/ml/llm/core/models/openai/OpenAiChatMessage
/*     */       //   461: astore #10
/*     */       //   463: iconst_0
/*     */       //   464: istore #11
/*     */       //   466: aload #10
/*     */       //   468: invokevirtual getRole : ()Ljava/lang/String;
/*     */       //   471: getstatic ai/grazie/model/llm/chat/LLMChatRole.User : Lai/grazie/model/llm/chat/LLMChatRole;
/*     */       //   474: invokevirtual name : ()Ljava/lang/String;
/*     */       //   477: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   480: ifeq -> 437
/*     */       //   483: aload #9
/*     */       //   485: goto -> 489
/*     */       //   488: aconst_null
/*     */       //   489: checkcast com/intellij/ml/llm/core/models/openai/OpenAiChatMessage
/*     */       //   492: astore #5
/*     */       //   494: aload #5
/*     */       //   496: ifnull -> 525
/*     */       //   499: aload #5
/*     */       //   501: astore #7
/*     */       //   503: iconst_0
/*     */       //   504: istore #8
/*     */       //   506: aload_3
/*     */       //   507: invokestatic getUSER_REQUEST : ()Lcom/intellij/ml/llm/core/statistics/llmc/RequestPrivateData;
/*     */       //   510: aload #7
/*     */       //   512: invokevirtual getContent : ()Ljava/lang/String;
/*     */       //   515: invokevirtual with : (Ljava/lang/Object;)Lcom/intellij/internal/statistic/eventLog/events/EventPair;
/*     */       //   518: invokevirtual add : (Ljava/lang/Object;)Z
/*     */       //   521: pop
/*     */       //   522: goto -> 526
/*     */       //   525: nop
/*     */       //   526: new java/util/ArrayList
/*     */       //   529: dup
/*     */       //   530: invokespecial <init> : ()V
/*     */       //   533: astore #4
/*     */       //   535: aload_2
/*     */       //   536: checkcast com/intellij/ml/llm/core/models/openai/OpenAiChatRequestBody
/*     */       //   539: invokevirtual getNumberOfSuggestions : ()Ljava/lang/Integer;
/*     */       //   542: dup
/*     */       //   543: ifnull -> 577
/*     */       //   546: checkcast java/lang/Number
/*     */       //   549: invokevirtual intValue : ()I
/*     */       //   552: istore #7
/*     */       //   554: iconst_0
/*     */       //   555: istore #8
/*     */       //   557: aload #4
/*     */       //   559: invokestatic access$getNUMBER_OF_SUGGESTIONS$cp : ()Lcom/intellij/internal/statistic/eventLog/events/IntEventField;
/*     */       //   562: iload #7
/*     */       //   564: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   567: invokevirtual with : (Ljava/lang/Object;)Lcom/intellij/internal/statistic/eventLog/events/EventPair;
/*     */       //   570: invokevirtual add : (Ljava/lang/Object;)Z
/*     */       //   573: pop
/*     */       //   574: goto -> 579
/*     */       //   577: pop
/*     */       //   578: nop
/*     */       //   579: aload_2
/*     */       //   580: checkcast com/intellij/ml/llm/core/models/openai/OpenAiChatRequestBody
/*     */       //   583: invokevirtual getTemperature : ()Ljava/lang/Double;
/*     */       //   586: dup
/*     */       //   587: ifnull -> 621
/*     */       //   590: checkcast java/lang/Number
/*     */       //   593: invokevirtual doubleValue : ()D
/*     */       //   596: dstore #7
/*     */       //   598: iconst_0
/*     */       //   599: istore #9
/*     */       //   601: aload #4
/*     */       //   603: invokestatic access$getTEMPERATURE$cp : ()Lcom/intellij/internal/statistic/eventLog/events/DoubleEventField;
/*     */       //   606: dload #7
/*     */       //   608: invokestatic valueOf : (D)Ljava/lang/Double;
/*     */       //   611: invokevirtual with : (Ljava/lang/Object;)Lcom/intellij/internal/statistic/eventLog/events/EventPair;
/*     */       //   614: invokevirtual add : (Ljava/lang/Object;)Z
/*     */       //   617: pop
/*     */       //   618: goto -> 623
/*     */       //   621: pop
/*     */       //   622: nop
/*     */       //   623: aload_2
/*     */       //   624: checkcast com/intellij/ml/llm/core/models/openai/OpenAiChatRequestBody
/*     */       //   627: invokevirtual getTopP : ()Ljava/lang/Double;
/*     */       //   630: dup
/*     */       //   631: ifnull -> 665
/*     */       //   634: checkcast java/lang/Number
/*     */       //   637: invokevirtual doubleValue : ()D
/*     */       //   640: dstore #7
/*     */       //   642: iconst_0
/*     */       //   643: istore #9
/*     */       //   645: aload #4
/*     */       //   647: invokestatic access$getTOP_P$cp : ()Lcom/intellij/internal/statistic/eventLog/events/DoubleEventField;
/*     */       //   650: dload #7
/*     */       //   652: invokestatic valueOf : (D)Ljava/lang/Double;
/*     */       //   655: invokevirtual with : (Ljava/lang/Object;)Lcom/intellij/internal/statistic/eventLog/events/EventPair;
/*     */       //   658: invokevirtual add : (Ljava/lang/Object;)Z
/*     */       //   661: pop
/*     */       //   662: goto -> 667
/*     */       //   665: pop
/*     */       //   666: nop
/*     */       //   667: aload #4
/*     */       //   669: checkcast java/util/Collection
/*     */       //   672: invokeinterface isEmpty : ()Z
/*     */       //   677: ifne -> 684
/*     */       //   680: iconst_1
/*     */       //   681: goto -> 685
/*     */       //   684: iconst_0
/*     */       //   685: ifeq -> 710
/*     */       //   688: aload_3
/*     */       //   689: invokestatic access$getADDITIONAL_PARAMETERS$cp : ()Lcom/intellij/internal/statistic/eventLog/events/ObjectEventField;
/*     */       //   692: new com/intellij/internal/statistic/eventLog/events/ObjectEventData
/*     */       //   695: dup
/*     */       //   696: aload_3
/*     */       //   697: checkcast java/util/List
/*     */       //   700: invokespecial <init> : (Ljava/util/List;)V
/*     */       //   703: invokevirtual with : (Ljava/lang/Object;)Lcom/intellij/internal/statistic/eventLog/events/EventPair;
/*     */       //   706: invokevirtual add : (Ljava/lang/Object;)Z
/*     */       //   709: pop
/*     */       //   710: aload_3
/*     */       //   711: checkcast java/util/List
/*     */       //   714: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #81	-> 0
/*     */       //   #81	-> 7
/*     */       //   #82	-> 8
/*     */       //   #119	-> 15
/*     */       //   #82	-> 18
/*     */       //   #82	-> 30
/*     */       //   #82	-> 33
/*     */       //   #84	-> 35
/*     */       //   #87	-> 42
/*     */       //   #85	-> 42
/*     */       //   #86	-> 51
/*     */       //   #120	-> 55
/*     */       //   #86	-> 84
/*     */       //   #120	-> 100
/*     */       //   #121	-> 114
/*     */       //   #86	-> 115
/*     */       //   #87	-> 117
/*     */       //   #86	-> 122
/*     */       //   #87	-> 124
/*     */       //   #119	-> 126
/*     */       //   #87	-> 129
/*     */       //   #87	-> 148
/*     */       //   #87	-> 151
/*     */       //   #91	-> 152
/*     */       //   #89	-> 152
/*     */       //   #90	-> 161
/*     */       //   #122	-> 165
/*     */       //   #123	-> 185
/*     */       //   #124	-> 192
/*     */       //   #90	-> 199
/*     */       //   #124	-> 215
/*     */       //   #122	-> 223
/*     */       //   #126	-> 229
/*     */       //   #90	-> 230
/*     */       //   #91	-> 232
/*     */       //   #90	-> 237
/*     */       //   #91	-> 239
/*     */       //   #119	-> 241
/*     */       //   #91	-> 244
/*     */       //   #91	-> 260
/*     */       //   #91	-> 263
/*     */       //   #93	-> 266
/*     */       //   #96	-> 273
/*     */       //   #95	-> 273
/*     */       //   #96	-> 282
/*     */       //   #95	-> 287
/*     */       //   #96	-> 294
/*     */       //   #127	-> 298
/*     */       //   #96	-> 336
/*     */       //   #127	-> 350
/*     */       //   #128	-> 358
/*     */       //   #96	-> 359
/*     */       //   #97	-> 364
/*     */       //   #96	-> 369
/*     */       //   #97	-> 371
/*     */       //   #119	-> 373
/*     */       //   #97	-> 376
/*     */       //   #97	-> 395
/*     */       //   #96	-> 398
/*     */       //   #100	-> 399
/*     */       //   #99	-> 399
/*     */       //   #100	-> 408
/*     */       //   #99	-> 413
/*     */       //   #100	-> 417
/*     */       //   #129	-> 421
/*     */       //   #130	-> 437
/*     */       //   #131	-> 447
/*     */       //   #132	-> 456
/*     */       //   #100	-> 466
/*     */       //   #132	-> 480
/*     */       //   #134	-> 488
/*     */       //   #100	-> 489
/*     */       //   #101	-> 494
/*     */       //   #100	-> 499
/*     */       //   #101	-> 501
/*     */       //   #119	-> 503
/*     */       //   #101	-> 506
/*     */       //   #101	-> 522
/*     */       //   #100	-> 525
/*     */       //   #103	-> 526
/*     */       //   #103	-> 533
/*     */       //   #104	-> 535
/*     */       //   #119	-> 554
/*     */       //   #104	-> 557
/*     */       //   #104	-> 574
/*     */       //   #104	-> 577
/*     */       //   #105	-> 579
/*     */       //   #119	-> 598
/*     */       //   #105	-> 601
/*     */       //   #105	-> 618
/*     */       //   #105	-> 621
/*     */       //   #106	-> 623
/*     */       //   #119	-> 642
/*     */       //   #106	-> 645
/*     */       //   #106	-> 662
/*     */       //   #106	-> 665
/*     */       //   #107	-> 667
/*     */       //   #107	-> 685
/*     */       //   #108	-> 688
/*     */       //   #111	-> 710
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   18	11	6	$i$a$-let-LLMEventLogger$Companion$extractChatRequestParameters$1	I
/*     */       //   15	14	5	it	Ljava/lang/String;
/*     */       //   84	16	11	$i$a$-firstOrNull-LLMEventLogger$Companion$extractChatRequestParameters$2	I
/*     */       //   81	19	10	it	Lai/grazie/model/llm/chat/LLMChatMessage;
/*     */       //   77	31	9	element$iv	Ljava/lang/Object;
/*     */       //   55	60	6	$i$f$firstOrNull	I
/*     */       //   52	63	5	$this$firstOrNull$iv	[Ljava/lang/Object;
/*     */       //   129	18	7	$i$a$-let-LLMEventLogger$Companion$extractChatRequestParameters$3	I
/*     */       //   126	21	6	it	Lai/grazie/model/llm/chat/LLMChatMessage;
/*     */       //   199	16	11	$i$a$-lastOrNull-LLMEventLogger$Companion$extractChatRequestParameters$4	I
/*     */       //   196	19	10	it	Lai/grazie/model/llm/chat/LLMChatMessage;
/*     */       //   192	31	9	element$iv	Ljava/lang/Object;
/*     */       //   182	47	8	index$iv	I
/*     */       //   165	65	6	$i$f$lastOrNull	I
/*     */       //   162	68	5	$this$lastOrNull$iv	[Ljava/lang/Object;
/*     */       //   244	15	7	$i$a$-let-LLMEventLogger$Companion$extractChatRequestParameters$5	I
/*     */       //   241	18	6	it	Lai/grazie/model/llm/chat/LLMChatMessage;
/*     */       //   336	14	11	$i$a$-firstOrNull-LLMEventLogger$Companion$extractChatRequestParameters$6	I
/*     */       //   333	17	10	m	Lcom/intellij/ml/llm/core/models/openai/OpenAiChatMessage;
/*     */       //   326	32	9	element$iv	Ljava/lang/Object;
/*     */       //   298	61	7	$i$f$firstOrNull	I
/*     */       //   295	64	6	$this$firstOrNull$iv	Ljava/lang/Iterable;
/*     */       //   376	18	8	$i$a$-let-LLMEventLogger$Companion$extractChatRequestParameters$7	I
/*     */       //   373	21	7	m	Lcom/intellij/ml/llm/core/models/openai/OpenAiChatMessage;
/*     */       //   466	14	11	$i$a$-lastOrNull-LLMEventLogger$Companion$extractChatRequestParameters$8	I
/*     */       //   463	17	10	m	Lcom/intellij/ml/llm/core/models/openai/OpenAiChatMessage;
/*     */       //   456	32	9	element$iv	Ljava/lang/Object;
/*     */       //   421	68	7	$i$f$lastOrNull	I
/*     */       //   437	52	8	iterator$iv	Ljava/util/ListIterator;
/*     */       //   418	71	6	$this$lastOrNull$iv	Ljava/util/List;
/*     */       //   506	15	8	$i$a$-let-LLMEventLogger$Companion$extractChatRequestParameters$9	I
/*     */       //   503	18	7	m	Lcom/intellij/ml/llm/core/models/openai/OpenAiChatMessage;
/*     */       //   557	16	8	$i$a$-let-LLMEventLogger$Companion$extractChatRequestParameters$10	I
/*     */       //   554	19	7	value	I
/*     */       //   601	16	9	$i$a$-let-LLMEventLogger$Companion$extractChatRequestParameters$11	I
/*     */       //   598	19	7	value	D
/*     */       //   645	16	9	$i$a$-let-LLMEventLogger$Companion$extractChatRequestParameters$12	I
/*     */       //   642	19	7	value	D
/*     */       //   535	175	4	additional	Ljava/util/ArrayList;
/*     */       //   8	707	3	data	Ljava/util/ArrayList;
/*     */       //   0	715	0	this	Lcom/intellij/ml/llm/core/statistics/llmc/LLMEventLogger$Companion;
/*     */       //   0	715	1	model	Ljava/lang/String;
/*     */       //   0	715	2	body	Ljava/lang/Object;
/*     */     } }
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null); @NotNull
/*     */   private static final EventLogGroup GROUP = new EventLogGroup("llm.events", 16, "LLMC"); @NotNull
/*     */   private static final RequestPrivateData CONTEXT = new RequestPrivateData("context"); @NotNull
/*     */   private static final IntEventField NUMBER_OF_SUGGESTIONS = EventFields.Int("number_of_suggestions");
/*     */   @NotNull
/*     */   private static final DoubleEventField TEMPERATURE = EventFields.Double("temperature");
/*     */   @NotNull
/*     */   private static final DoubleEventField TOP_P = EventFields.Double("top_p");
/*     */   @NotNull
/*     */   private static final ObjectEventField ADDITIONAL_PARAMETERS;
/*     */   @NotNull
/*     */   private static final ScoredIdeActivityDefinition EDIT_ACTION_ACTIVITY;
/*     */   @NotNull
/*     */   private static final VarargEventId EDIT_REQUEST_SENT;
/*     */   @NotNull
/*     */   private static final ScoredIdeActivityDefinition COMPLETION_ACTION_ACTIVITY;
/*     */   @NotNull
/*     */   private static final VarargEventId COMPLETION_REQUEST_SENT;
/*     */   @NotNull
/*     */   private static final ScoredIdeActivityDefinition DOCUMENTATION_GENERATION;
/*     */   @NotNull
/*     */   private static final VarargEventId DOCUMENTATION_GENERATION_SENT;
/*     */   @NotNull
/*     */   private static final ScoredIdeActivityDefinition COMMIT_GENERATION;
/*     */   @NotNull
/*     */   private static final VarargEventId COMMIT_GENERATION_SENT;
/*     */   
/*     */   static {
/*     */     EventField[] arrayOfEventField2 = new EventField[3];
/*     */     arrayOfEventField2[0] = (EventField)NUMBER_OF_SUGGESTIONS;
/*     */     arrayOfEventField2[1] = (EventField)TEMPERATURE;
/*     */     arrayOfEventField2[2] = (EventField)TOP_P;
/*     */     ArrayList arrayList = CollectionsKt.arrayListOf((Object[])arrayOfEventField2);
/*     */     int $i$f$toTypedArray = 0;
/* 119 */     Collection thisCollection$iv = arrayList;
/* 120 */     EventField[] arrayOfEventField1 = (EventField[])thisCollection$iv.toArray((Object[])new EventField[0]);
/*     */     ADDITIONAL_PARAMETERS = new ObjectEventField("parameters", Arrays.<EventField>copyOf(arrayOfEventField1, arrayOfEventField1.length));
/*     */     arrayOfEventField1 = new EventField[2];
/*     */     arrayOfEventField1[0] = (EventField)CommonLoggerServiceKt.getTARGET_ELEMENT();
/*     */     arrayOfEventField1[1] = (EventField)EventFields.Language;
/*     */     arrayOfEventField1 = new EventField[3];
/*     */     arrayOfEventField1[0] = (EventField)CommonLoggerServiceKt.getTARGET_ELEMENT();
/*     */     arrayOfEventField1[1] = (EventField)EventFields.Language;
/*     */     arrayOfEventField1[2] = (EventField)LLMCommonEventFieldsKt.getRESPONSE();
/*     */     EDIT_ACTION_ACTIVITY = ScoredIdeActivityKt.registerActivity(GROUP, "edit.request", arrayOfEventField1, arrayOfEventField1);
/*     */     arrayOfEventField1 = new EventField[6];
/*     */     arrayOfEventField1[0] = (EventField)CommonLoggerServiceKt.getTARGET_ELEMENT();
/*     */     arrayOfEventField1[1] = (EventField)EventFields.Language;
/*     */     arrayOfEventField1[2] = (EventField)LLMCommonEventFieldsKt.getPROFILE();
/*     */     arrayOfEventField1[3] = (EventField)LLMCommonEventFieldsKt.getUSER_REQUEST();
/*     */     arrayOfEventField1[4] = (EventField)CONTEXT;
/*     */     arrayOfEventField1[5] = (EventField)ADDITIONAL_PARAMETERS;
/*     */     EDIT_REQUEST_SENT = EDIT_ACTION_ACTIVITY.registerStage(GROUP, "sent", arrayOfEventField1);
/*     */     arrayOfEventField1 = new EventField[1];
/*     */     arrayOfEventField1[0] = (EventField)LLMCommonEventFieldsKt.getRESPONSE();
/*     */     COMPLETION_ACTION_ACTIVITY = ScoredIdeActivityKt.registerActivity$default(GROUP, "completion.request", null, arrayOfEventField1, 4, null);
/*     */     arrayOfEventField1 = new EventField[4];
/*     */     arrayOfEventField1[0] = (EventField)LLMCommonEventFieldsKt.getPROFILE();
/*     */     arrayOfEventField1[1] = (EventField)LLMCommonEventFieldsKt.getUSER_REQUEST();
/*     */     arrayOfEventField1[2] = (EventField)CONTEXT;
/*     */     arrayOfEventField1[3] = (EventField)ADDITIONAL_PARAMETERS;
/*     */     COMPLETION_REQUEST_SENT = COMPLETION_ACTION_ACTIVITY.registerStage(GROUP, "sent", arrayOfEventField1);
/*     */     arrayOfEventField1 = new EventField[2];
/*     */     arrayOfEventField1[0] = (EventField)CommonLoggerServiceKt.getTARGET_ELEMENT();
/*     */     arrayOfEventField1[1] = (EventField)EventFields.Language;
/*     */     arrayOfEventField1 = new EventField[3];
/*     */     arrayOfEventField1[0] = (EventField)CommonLoggerServiceKt.getTARGET_ELEMENT();
/*     */     arrayOfEventField1[1] = (EventField)EventFields.Language;
/*     */     arrayOfEventField1[2] = (EventField)LLMCommonEventFieldsKt.getRESPONSE();
/*     */     DOCUMENTATION_GENERATION = ScoredIdeActivityKt.registerActivity(GROUP, "documentation.generation", arrayOfEventField1, arrayOfEventField1);
/*     */     arrayOfEventField1 = new EventField[6];
/*     */     arrayOfEventField1[0] = (EventField)CommonLoggerServiceKt.getTARGET_ELEMENT();
/*     */     arrayOfEventField1[1] = (EventField)EventFields.Language;
/*     */     arrayOfEventField1[2] = (EventField)LLMCommonEventFieldsKt.getPROFILE();
/*     */     arrayOfEventField1[3] = (EventField)LLMCommonEventFieldsKt.getUSER_REQUEST();
/*     */     arrayOfEventField1[4] = (EventField)CONTEXT;
/*     */     arrayOfEventField1[5] = (EventField)ADDITIONAL_PARAMETERS;
/*     */     DOCUMENTATION_GENERATION_SENT = DOCUMENTATION_GENERATION.registerStage(GROUP, "sent", arrayOfEventField1);
/*     */     arrayOfEventField1 = new EventField[1];
/*     */     arrayOfEventField1[0] = (EventField)CommonLoggerServiceKt.getNUMBER_OF_FILES();
/*     */     arrayOfEventField1 = new EventField[2];
/*     */     arrayOfEventField1[0] = (EventField)CommonLoggerServiceKt.getNUMBER_OF_FILES();
/*     */     arrayOfEventField1[1] = (EventField)LLMCommonEventFieldsKt.getRESPONSE();
/*     */     COMMIT_GENERATION = ScoredIdeActivityKt.registerActivity(GROUP, "commit.generation", arrayOfEventField1, arrayOfEventField1);
/*     */     arrayOfEventField1 = new EventField[5];
/*     */     arrayOfEventField1[0] = (EventField)CommonLoggerServiceKt.getNUMBER_OF_FILES();
/*     */     arrayOfEventField1[1] = (EventField)LLMCommonEventFieldsKt.getPROFILE();
/*     */     arrayOfEventField1[2] = (EventField)LLMCommonEventFieldsKt.getUSER_REQUEST();
/*     */     arrayOfEventField1[3] = (EventField)CONTEXT;
/*     */     arrayOfEventField1[4] = (EventField)ADDITIONAL_PARAMETERS;
/*     */     COMMIT_GENERATION_SENT = COMMIT_GENERATION.registerStage(GROUP, "sent", arrayOfEventField1);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final RequestPrivateData SELECTED = new RequestPrivateData("selected_option");
/*     */   @NotNull
/*     */   private static final ScoredIdeActivityDefinition NAME_SUGGESTIONS_ACTIVITY;
/*     */   @NotNull
/*     */   private static final VarargEventId NAME_SUGGESTIONS_REQUEST;
/*     */   @NotNull
/*     */   private static final VarargEventId NAME_SUGGESTIONS_RESPONSE;
/*     */   
/*     */   static {
/*     */     arrayOfEventField1 = new EventField[1];
/*     */     arrayOfEventField1[0] = (EventField)SELECTED;
/*     */     NAME_SUGGESTIONS_ACTIVITY = ScoredIdeActivityKt.registerActivity$default(GROUP, "name.suggestion", null, arrayOfEventField1, 4, null);
/*     */     arrayOfEventField1 = new EventField[2];
/*     */     arrayOfEventField1[0] = (EventField)LLMCommonEventFieldsKt.getUSER_REQUEST();
/*     */     arrayOfEventField1[1] = (EventField)CONTEXT;
/*     */     NAME_SUGGESTIONS_REQUEST = NAME_SUGGESTIONS_ACTIVITY.registerStage(GROUP, "request", arrayOfEventField1);
/*     */     arrayOfEventField1 = new EventField[2];
/*     */     arrayOfEventField1[0] = (EventField)EventFields.DurationMs;
/*     */     arrayOfEventField1[1] = (EventField)LLMCommonEventFieldsKt.getRESPONSE();
/*     */     NAME_SUGGESTIONS_RESPONSE = NAME_SUGGESTIONS_ACTIVITY.registerStage(GROUP, "response", arrayOfEventField1);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final VarargEventId NAME_SUGGESTIONS_SHOW = ScoredIdeActivityDefinition.registerStage$default(NAME_SUGGESTIONS_ACTIVITY, GROUP, "show", null, 4, null);
/*     */   
/*     */   @NotNull
/*     */   public EventLogGroup getGroup() {
/*     */     return GROUP;
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/statistics/llmc/LLMEventLogger.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */