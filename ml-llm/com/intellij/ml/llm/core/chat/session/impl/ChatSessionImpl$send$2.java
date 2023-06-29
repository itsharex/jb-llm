package com.intellij.ml.llm.core.chat.session.impl;

import com.intellij.ml.llm.core.chat.session.ChatKind;
import com.intellij.openapi.project.Project;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "ChatSessionImpl.kt", l = {93}, i = {0, 0, 0}, s = {"L$0", "L$1", "J$0"}, n = {"userMessage", "resultMessage", "timeStarted"}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.chat.session.impl.ChatSessionImpl$send$2")
@Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\016\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
@SourceDebugExtension({"SMAP\nChatSessionImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatSessionImpl.kt\ncom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl$send$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,162:1\n288#2,2:163\n*S KotlinDebug\n*F\n+ 1 ChatSessionImpl.kt\ncom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl$send$2\n*L\n80#1:163,2\n*E\n"})
final class ChatSessionImpl$send$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
  Object L$0;
  
  Object L$1;
  
  long J$0;
  
  int label;
  
  ChatSessionImpl$send$2(ChatSessionImpl $receiver, ChatSessionImpl $chat, String $text, ChatKind $kind, Continuation $completion) {
    super(2, $completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #15
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 831, 0 -> 32, 1 -> 539
    //   32: aload_1
    //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   36: aload_0
    //   37: getfield $project : Lcom/intellij/openapi/project/Project;
    //   40: invokestatic askDataSharingConsentIfNeeded : (Lcom/intellij/openapi/project/Project;)V
    //   43: aload_0
    //   44: getfield this$0 : Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;
    //   47: invokevirtual getState : ()Lcom/intellij/ml/llm/core/chat/session/ChatSessionState;
    //   50: getstatic com/intellij/ml/llm/core/chat/session/ChatSessionState.Idle : Lcom/intellij/ml/llm/core/chat/session/ChatSessionState;
    //   53: if_acmpeq -> 59
    //   56: ldc ''
    //   58: areturn
    //   59: aload_0
    //   60: getfield this$0 : Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;
    //   63: getstatic com/intellij/ml/llm/core/chat/session/ChatSessionState.Busy : Lcom/intellij/ml/llm/core/chat/session/ChatSessionState;
    //   66: invokestatic access$setChatState$p : (Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;Lcom/intellij/ml/llm/core/chat/session/ChatSessionState;)V
    //   69: aload_0
    //   70: getfield this$0 : Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;
    //   73: invokestatic access$getChatStateListeners$p : (Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;)Ljava/util/List;
    //   76: invokeinterface iterator : ()Ljava/util/Iterator;
    //   81: astore_2
    //   82: aload_2
    //   83: invokeinterface hasNext : ()Z
    //   88: ifeq -> 141
    //   91: aload_2
    //   92: invokeinterface next : ()Ljava/lang/Object;
    //   97: checkcast com/intellij/ml/llm/core/chat/session/ChatSessionStateListener
    //   100: astore_3
    //   101: nop
    //   102: aload_3
    //   103: aload_0
    //   104: getfield this$0 : Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;
    //   107: invokestatic access$getChatState$p : (Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;)Lcom/intellij/ml/llm/core/chat/session/ChatSessionState;
    //   110: invokeinterface onChatStateChanged : (Lcom/intellij/ml/llm/core/chat/session/ChatSessionState;)V
    //   115: aload_3
    //   116: invokeinterface onStartSendingMessage : ()V
    //   121: goto -> 82
    //   124: astore #4
    //   126: aload_0
    //   127: getfield this$0 : Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;
    //   130: invokestatic access$getLOG$p : (Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;)Lcom/intellij/openapi/diagnostic/Logger;
    //   133: aload #4
    //   135: invokevirtual error : (Ljava/lang/Throwable;)V
    //   138: goto -> 82
    //   141: new com/intellij/ml/llm/core/chat/messages/impl/UserMessage
    //   144: dup
    //   145: aload_0
    //   146: getfield $chat : Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;
    //   149: checkcast com/intellij/ml/llm/core/chat/session/ChatSession
    //   152: aload_0
    //   153: getfield $text : Ljava/lang/String;
    //   156: aconst_null
    //   157: aconst_null
    //   158: bipush #12
    //   160: aconst_null
    //   161: invokespecial <init> : (Lcom/intellij/ml/llm/core/chat/session/ChatSession;Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/core/chat/messages/ChatMessageRating;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   164: astore_2
    //   165: invokestatic nanoTime : ()J
    //   168: lstore_3
    //   169: aload_0
    //   170: getfield this$0 : Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;
    //   173: invokestatic access$getInnerMessages$p : (Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;)Ljava/util/List;
    //   176: aload_2
    //   177: invokeinterface add : (Ljava/lang/Object;)Z
    //   182: pop
    //   183: aload_0
    //   184: getfield this$0 : Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;
    //   187: invokestatic access$getMessageListeners$p : (Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;)Ljava/util/List;
    //   190: invokeinterface iterator : ()Ljava/util/Iterator;
    //   195: astore #5
    //   197: aload #5
    //   199: invokeinterface hasNext : ()Z
    //   204: ifeq -> 251
    //   207: aload #5
    //   209: invokeinterface next : ()Ljava/lang/Object;
    //   214: checkcast com/intellij/ml/llm/core/chat/session/ChatSessionMessageListener
    //   217: astore #6
    //   219: nop
    //   220: aload #6
    //   222: aload_2
    //   223: checkcast com/intellij/ml/llm/core/chat/messages/CompletableMessage
    //   226: invokeinterface onMessagesChanged : (Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;)V
    //   231: goto -> 197
    //   234: astore #7
    //   236: aload_0
    //   237: getfield this$0 : Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;
    //   240: invokestatic access$getLOG$p : (Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;)Lcom/intellij/openapi/diagnostic/Logger;
    //   243: aload #7
    //   245: invokevirtual error : (Ljava/lang/Throwable;)V
    //   248: goto -> 197
    //   251: nop
    //   252: getstatic com/intellij/ml/llm/core/chat/session/ChatMessageHandler.Companion : Lcom/intellij/ml/llm/core/chat/session/ChatMessageHandler$Companion;
    //   255: invokevirtual getEP : ()Lcom/intellij/openapi/extensions/ExtensionPointName;
    //   258: invokevirtual getExtensionList : ()Ljava/util/List;
    //   261: checkcast java/lang/Iterable
    //   264: astore #7
    //   266: aload_0
    //   267: getfield $project : Lcom/intellij/openapi/project/Project;
    //   270: astore #8
    //   272: aload_0
    //   273: getfield $kind : Lcom/intellij/ml/llm/core/chat/session/ChatKind;
    //   276: astore #9
    //   278: iconst_0
    //   279: istore #10
    //   281: aload #7
    //   283: invokeinterface iterator : ()Ljava/util/Iterator;
    //   288: astore #11
    //   290: aload #11
    //   292: invokeinterface hasNext : ()Z
    //   297: ifeq -> 338
    //   300: aload #11
    //   302: invokeinterface next : ()Ljava/lang/Object;
    //   307: astore #12
    //   309: aload #12
    //   311: checkcast com/intellij/ml/llm/core/chat/session/ChatMessageHandler
    //   314: astore #13
    //   316: iconst_0
    //   317: istore #14
    //   319: aload #13
    //   321: aload #8
    //   323: aload #9
    //   325: invokeinterface isApplicable : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/chat/session/ChatKind;)Z
    //   330: ifeq -> 290
    //   333: aload #12
    //   335: goto -> 339
    //   338: aconst_null
    //   339: checkcast com/intellij/ml/llm/core/chat/session/ChatMessageHandler
    //   342: dup
    //   343: ifnonnull -> 353
    //   346: pop
    //   347: getstatic com/intellij/ml/llm/core/chat/session/impl/SimpleChatMessageHandler.INSTANCE : Lcom/intellij/ml/llm/core/chat/session/impl/SimpleChatMessageHandler;
    //   350: checkcast com/intellij/ml/llm/core/chat/session/ChatMessageHandler
    //   353: astore #5
    //   355: aload #5
    //   357: aload_0
    //   358: getfield $project : Lcom/intellij/openapi/project/Project;
    //   361: aload_0
    //   362: getfield $chat : Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;
    //   365: checkcast com/intellij/ml/llm/core/chat/session/ChatSession
    //   368: aload_0
    //   369: getfield $text : Ljava/lang/String;
    //   372: aload_0
    //   373: getfield $kind : Lcom/intellij/ml/llm/core/chat/session/ChatKind;
    //   376: invokeinterface createMessage : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/chat/session/ChatSession;Ljava/lang/String;Lcom/intellij/ml/llm/core/chat/session/ChatKind;)Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;
    //   381: astore #6
    //   383: getstatic com/intellij/ml/llm/core/statistics/fus/AIAssistantChatEventLogger.Companion : Lcom/intellij/ml/llm/core/statistics/fus/AIAssistantChatEventLogger$Companion;
    //   386: aload_0
    //   387: getfield $project : Lcom/intellij/openapi/project/Project;
    //   390: aload_0
    //   391: getfield $chat : Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;
    //   394: checkcast com/intellij/ml/llm/core/chat/session/ChatSession
    //   397: aload_2
    //   398: checkcast com/intellij/ml/llm/core/chat/messages/CompletableMessage
    //   401: invokevirtual logMessageSent : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/chat/session/ChatSession;Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;)V
    //   404: aload_0
    //   405: getfield this$0 : Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;
    //   408: invokestatic access$getInnerMessages$p : (Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;)Ljava/util/List;
    //   411: aload #6
    //   413: invokeinterface add : (Ljava/lang/Object;)Z
    //   418: pop
    //   419: aload_0
    //   420: getfield this$0 : Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;
    //   423: invokestatic access$getMessageListeners$p : (Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;)Ljava/util/List;
    //   426: invokeinterface iterator : ()Ljava/util/Iterator;
    //   431: astore #7
    //   433: aload #7
    //   435: invokeinterface hasNext : ()Z
    //   440: ifeq -> 485
    //   443: aload #7
    //   445: invokeinterface next : ()Ljava/lang/Object;
    //   450: checkcast com/intellij/ml/llm/core/chat/session/ChatSessionMessageListener
    //   453: astore #8
    //   455: nop
    //   456: aload #8
    //   458: aload #6
    //   460: invokeinterface onMessagesChanged : (Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;)V
    //   465: goto -> 433
    //   468: astore #9
    //   470: aload_0
    //   471: getfield this$0 : Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;
    //   474: invokestatic access$getLOG$p : (Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;)Lcom/intellij/openapi/diagnostic/Logger;
    //   477: aload #9
    //   479: invokevirtual error : (Ljava/lang/Throwable;)V
    //   482: goto -> 433
    //   485: aload #5
    //   487: aload_0
    //   488: getfield $project : Lcom/intellij/openapi/project/Project;
    //   491: aload_0
    //   492: getfield $chat : Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;
    //   495: checkcast com/intellij/ml/llm/core/chat/session/ChatSession
    //   498: aload #6
    //   500: aload_0
    //   501: checkcast kotlin/coroutines/Continuation
    //   504: aload_0
    //   505: aload_2
    //   506: putfield L$0 : Ljava/lang/Object;
    //   509: aload_0
    //   510: aload #6
    //   512: putfield L$1 : Ljava/lang/Object;
    //   515: aload_0
    //   516: lload_3
    //   517: putfield J$0 : J
    //   520: aload_0
    //   521: iconst_1
    //   522: putfield label : I
    //   525: invokeinterface serveMessage : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/chat/session/ChatSession;Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   530: dup
    //   531: aload #15
    //   533: if_acmpne -> 567
    //   536: aload #15
    //   538: areturn
    //   539: aload_0
    //   540: getfield J$0 : J
    //   543: lstore_3
    //   544: aload_0
    //   545: getfield L$1 : Ljava/lang/Object;
    //   548: checkcast com/intellij/ml/llm/core/chat/messages/CompletableMessage
    //   551: astore #6
    //   553: aload_0
    //   554: getfield L$0 : Ljava/lang/Object;
    //   557: checkcast com/intellij/ml/llm/core/chat/messages/impl/UserMessage
    //   560: astore_2
    //   561: nop
    //   562: aload_1
    //   563: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   566: aload_1
    //   567: pop
    //   568: getstatic com/intellij/ml/llm/core/statistics/fus/AIAssistantChatEventLogger.Companion : Lcom/intellij/ml/llm/core/statistics/fus/AIAssistantChatEventLogger$Companion;
    //   571: aload_0
    //   572: getfield $project : Lcom/intellij/openapi/project/Project;
    //   575: aload_0
    //   576: getfield $chat : Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;
    //   579: checkcast com/intellij/ml/llm/core/chat/session/ChatSession
    //   582: aload_2
    //   583: checkcast com/intellij/ml/llm/core/chat/messages/CompletableMessage
    //   586: aload #6
    //   588: lload_3
    //   589: invokestatic getDurationMillis : (J)J
    //   592: invokevirtual logMessageReceived : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/chat/session/ChatSession;Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;J)V
    //   595: aload #6
    //   597: invokeinterface getText : ()Ljava/lang/String;
    //   602: astore #7
    //   604: aload_0
    //   605: getfield this$0 : Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;
    //   608: getstatic com/intellij/ml/llm/core/chat/session/ChatSessionState.Idle : Lcom/intellij/ml/llm/core/chat/session/ChatSessionState;
    //   611: invokestatic access$setChatState$p : (Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;Lcom/intellij/ml/llm/core/chat/session/ChatSessionState;)V
    //   614: aload_0
    //   615: getfield this$0 : Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;
    //   618: invokestatic access$getChatStateListeners$p : (Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;)Ljava/util/List;
    //   621: invokeinterface iterator : ()Ljava/util/Iterator;
    //   626: astore #8
    //   628: aload #8
    //   630: invokeinterface hasNext : ()Z
    //   635: ifeq -> 692
    //   638: aload #8
    //   640: invokeinterface next : ()Ljava/lang/Object;
    //   645: checkcast com/intellij/ml/llm/core/chat/session/ChatSessionStateListener
    //   648: astore #9
    //   650: nop
    //   651: aload #9
    //   653: aload_0
    //   654: getfield this$0 : Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;
    //   657: invokestatic access$getChatState$p : (Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;)Lcom/intellij/ml/llm/core/chat/session/ChatSessionState;
    //   660: invokeinterface onChatStateChanged : (Lcom/intellij/ml/llm/core/chat/session/ChatSessionState;)V
    //   665: aload #9
    //   667: invokeinterface onFinishSendingMessage : ()V
    //   672: goto -> 628
    //   675: astore #10
    //   677: aload_0
    //   678: getfield this$0 : Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;
    //   681: invokestatic access$getLOG$p : (Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;)Lcom/intellij/openapi/diagnostic/Logger;
    //   684: aload #10
    //   686: invokevirtual error : (Ljava/lang/Throwable;)V
    //   689: goto -> 628
    //   692: aload #7
    //   694: areturn
    //   695: astore #6
    //   697: getstatic com/intellij/ml/llm/core/statistics/fus/AIAssistantChatEventLogger.Companion : Lcom/intellij/ml/llm/core/statistics/fus/AIAssistantChatEventLogger$Companion;
    //   700: aload_0
    //   701: getfield $project : Lcom/intellij/openapi/project/Project;
    //   704: aload_0
    //   705: getfield $chat : Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;
    //   708: checkcast com/intellij/ml/llm/core/chat/session/ChatSession
    //   711: lload_3
    //   712: invokestatic getDurationMillis : (J)J
    //   715: aload_2
    //   716: checkcast com/intellij/ml/llm/core/chat/messages/CompletableMessage
    //   719: aload_0
    //   720: getfield this$0 : Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;
    //   723: invokestatic access$getInnerMessages$p : (Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;)Ljava/util/List;
    //   726: invokestatic last : (Ljava/util/List;)Ljava/lang/Object;
    //   729: checkcast com/intellij/ml/llm/core/chat/messages/CompletableMessage
    //   732: invokevirtual logMessageReceivingCancelled : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/chat/session/ChatSession;JLcom/intellij/ml/llm/core/chat/messages/CompletableMessage;Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;)V
    //   735: aload #6
    //   737: athrow
    //   738: astore #6
    //   740: aload_0
    //   741: getfield this$0 : Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;
    //   744: getstatic com/intellij/ml/llm/core/chat/session/ChatSessionState.Idle : Lcom/intellij/ml/llm/core/chat/session/ChatSessionState;
    //   747: invokestatic access$setChatState$p : (Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;Lcom/intellij/ml/llm/core/chat/session/ChatSessionState;)V
    //   750: aload_0
    //   751: getfield this$0 : Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;
    //   754: invokestatic access$getChatStateListeners$p : (Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;)Ljava/util/List;
    //   757: invokeinterface iterator : ()Ljava/util/Iterator;
    //   762: astore #7
    //   764: aload #7
    //   766: invokeinterface hasNext : ()Z
    //   771: ifeq -> 828
    //   774: aload #7
    //   776: invokeinterface next : ()Ljava/lang/Object;
    //   781: checkcast com/intellij/ml/llm/core/chat/session/ChatSessionStateListener
    //   784: astore #8
    //   786: nop
    //   787: aload #8
    //   789: aload_0
    //   790: getfield this$0 : Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;
    //   793: invokestatic access$getChatState$p : (Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;)Lcom/intellij/ml/llm/core/chat/session/ChatSessionState;
    //   796: invokeinterface onChatStateChanged : (Lcom/intellij/ml/llm/core/chat/session/ChatSessionState;)V
    //   801: aload #8
    //   803: invokeinterface onFinishSendingMessage : ()V
    //   808: goto -> 764
    //   811: astore #9
    //   813: aload_0
    //   814: getfield this$0 : Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;
    //   817: invokestatic access$getLOG$p : (Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl;)Lcom/intellij/openapi/diagnostic/Logger;
    //   820: aload #9
    //   822: invokevirtual error : (Ljava/lang/Throwable;)V
    //   825: goto -> 764
    //   828: aload #6
    //   830: athrow
    //   831: new java/lang/IllegalStateException
    //   834: dup
    //   835: ldc_w 'call to 'resume' before 'invoke' with coroutine'
    //   838: invokespecial <init> : (Ljava/lang/String;)V
    //   841: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #52	-> 3
    //   #53	-> 36
    //   #55	-> 43
    //   #56	-> 56
    //   #58	-> 59
    //   #59	-> 69
    //   #60	-> 101
    //   #61	-> 102
    //   #62	-> 115
    //   #63	-> 124
    //   #64	-> 126
    //   #68	-> 141
    //   #69	-> 165
    //   #70	-> 169
    //   #71	-> 183
    //   #72	-> 219
    //   #73	-> 220
    //   #74	-> 234
    //   #75	-> 236
    //   #79	-> 251
    //   #80	-> 252
    //   #163	-> 281
    //   #80	-> 319
    //   #163	-> 330
    //   #164	-> 338
    //   #80	-> 339
    //   #81	-> 355
    //   #82	-> 383
    //   #83	-> 404
    //   #84	-> 419
    //   #85	-> 455
    //   #86	-> 456
    //   #88	-> 468
    //   #89	-> 470
    //   #93	-> 485
    //   #52	-> 536
    //   #94	-> 567
    //   #95	-> 595
    //   #102	-> 604
    //   #104	-> 614
    //   #105	-> 650
    //   #106	-> 651
    //   #107	-> 665
    //   #108	-> 675
    //   #109	-> 677
    //   #95	-> 694
    //   #97	-> 695
    //   #98	-> 697
    //   #99	-> 719
    //   #98	-> 732
    //   #100	-> 735
    //   #102	-> 738
    //   #104	-> 750
    //   #105	-> 786
    //   #106	-> 787
    //   #107	-> 801
    //   #108	-> 811
    //   #109	-> 813
    //   #52	-> 831
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   165	165	2	userMessage	Lcom/intellij/ml/llm/core/chat/messages/impl/UserMessage;
    //   330	8	2	userMessage	Lcom/intellij/ml/llm/core/chat/messages/impl/UserMessage;
    //   338	1	2	userMessage	Lcom/intellij/ml/llm/core/chat/messages/impl/UserMessage;
    //   339	200	2	userMessage	Lcom/intellij/ml/llm/core/chat/messages/impl/UserMessage;
    //   561	43	2	userMessage	Lcom/intellij/ml/llm/core/chat/messages/impl/UserMessage;
    //   695	24	2	userMessage	Lcom/intellij/ml/llm/core/chat/messages/impl/UserMessage;
    //   101	20	3	listener	Lcom/intellij/ml/llm/core/chat/session/ChatSessionStateListener;
    //   169	161	3	timeStarted	J
    //   330	8	3	timeStarted	J
    //   338	1	3	timeStarted	J
    //   339	200	3	timeStarted	J
    //   544	60	3	timeStarted	J
    //   695	24	3	timeStarted	J
    //   126	12	4	e	Ljava/lang/Throwable;
    //   355	175	5	handler	Lcom/intellij/ml/llm/core/chat/session/ChatMessageHandler;
    //   219	12	6	listener	Lcom/intellij/ml/llm/core/chat/session/ChatSessionMessageListener;
    //   383	156	6	resultMessage	Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;
    //   553	51	6	resultMessage	Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;
    //   697	41	6	e	Ljava/util/concurrent/CancellationException;
    //   236	12	7	e	Ljava/lang/Throwable;
    //   278	12	7	$this$firstOrNull$iv	Ljava/lang/Iterable;
    //   455	10	8	listener	Lcom/intellij/ml/llm/core/chat/session/ChatSessionMessageListener;
    //   786	22	8	listener	Lcom/intellij/ml/llm/core/chat/session/ChatSessionStateListener;
    //   470	12	9	e	Ljava/lang/Throwable;
    //   650	22	9	listener	Lcom/intellij/ml/llm/core/chat/session/ChatSessionStateListener;
    //   813	12	9	e	Ljava/lang/Throwable;
    //   677	12	10	e	Ljava/lang/Throwable;
    //   309	29	12	element$iv	Ljava/lang/Object;
    //   316	14	13	it	Lcom/intellij/ml/llm/core/chat/session/ChatMessageHandler;
    //   319	11	14	$i$a$-firstOrNull-ChatSessionImpl$send$2$handler$1	I
    //   281	58	10	$i$f$firstOrNull	I
    //   36	795	0	this	Lcom/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl$send$2;
    //   36	795	1	$result	Ljava/lang/Object;
    // Exception table:
    //   from	to	target	type
    //   101	121	124	java/lang/Throwable
    //   219	231	234	java/lang/Throwable
    //   251	530	695	java/util/concurrent/CancellationException
    //   251	530	738	finally
    //   455	465	468	java/lang/Throwable
    //   561	604	695	java/util/concurrent/CancellationException
    //   561	604	738	finally
    //   650	672	675	java/lang/Throwable
    //   695	738	738	finally
    //   738	740	738	finally
    //   786	808	811	java/lang/Throwable
  }
  
  @NotNull
  public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super ChatSessionImpl$send$2> $completion) {
    return (Continuation<Unit>)new ChatSessionImpl$send$2(ChatSessionImpl.this, this.$chat, this.$text, this.$kind, $completion);
  }
  
  @Nullable
  public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
    return ((ChatSessionImpl$send$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl$send$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */