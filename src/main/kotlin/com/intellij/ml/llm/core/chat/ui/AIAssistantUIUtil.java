/*    */ package com.intellij.ml.llm.core.chat.ui;
/*    */ import com.intellij.lang.Language;
/*    */ import com.intellij.ml.llm.core.chat.messages.CompletableMessage;
/*    */ import com.intellij.ml.llm.core.chat.parts.MessagePart;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import com.intellij.testFramework.LightVirtualFile;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J0\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\0132\b\020\f\032\004\030\0010\0042\006\020\r\032\0020\0162\006\020\017\032\0020\020J\016\020\021\032\0020\0222\006\020\023\032\0020\004J\016\020\024\032\0020\0252\006\020\026\032\0020\027R\016\020\003\032\0020\004XT¢\006\002\n\000R\016\020\005\032\0020\004XT¢\006\002\n\000¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/AIAssistantUIUtil;", "", "()V", "AI_ASSISTANT_INPUT_FILE_NAME_PREFIX", "", "AI_ASSISTANT_SNIPPET_FILE_NAME", "createMessagePart", "Lcom/intellij/ml/llm/core/chat/parts/MessagePart;", "project", "Lcom/intellij/openapi/project/Project;", "type", "Lcom/intellij/ml/llm/core/chat/parts/MessagePart$Type;", "content", "message", "Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;", "disposable", "Lcom/intellij/openapi/Disposable;", "findLanguage", "Lcom/intellij/lang/Language;", "languageName", "isAIAssistantFile", "", "file", "Lcom/intellij/openapi/vfs/VirtualFile;", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nAIAssistantUIUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIAssistantUIUtil.kt\ncom/intellij/ml/llm/core/chat/ui/AIAssistantUIUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,51:1\n766#2:52\n857#2,2:53\n288#2,2:55\n*S KotlinDebug\n*F\n+ 1 AIAssistantUIUtil.kt\ncom/intellij/ml/llm/core/chat/ui/AIAssistantUIUtil\n*L\n47#1:52\n47#1:53,2\n48#1:55,2\n*E\n"})
/*    */ public final class AIAssistantUIUtil {
/*    */   public final boolean isAIAssistantFile(@NotNull VirtualFile file) {
/* 18 */     Intrinsics.checkNotNullParameter(file, "file");
/* 19 */     Intrinsics.checkNotNullExpressionValue(((LightVirtualFile)file).getName(), "file.name"); return (file instanceof LightVirtualFile && (Intrinsics.areEqual(((LightVirtualFile)file).getName(), "AIAssistantSnippet") || StringsKt.startsWith$default(((LightVirtualFile)file).getName(), "AIAssistantInput", false, 2, null)));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final AIAssistantUIUtil INSTANCE = new AIAssistantUIUtil();
/*    */   @NotNull
/*    */   public static final String AI_ASSISTANT_SNIPPET_FILE_NAME = "AIAssistantSnippet";
/*    */   @NotNull
/*    */   public static final String AI_ASSISTANT_INPUT_FILE_NAME_PREFIX = "AIAssistantInput";
/*    */   
/*    */   @NotNull
/*    */   public final MessagePart createMessagePart(@NotNull Project project, @NotNull MessagePart.Type type, @Nullable String content, @NotNull CompletableMessage message, @NotNull Disposable disposable) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'project'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_2
/*    */     //   7: ldc 'type'
/*    */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: aload #4
/*    */     //   14: ldc 'message'
/*    */     //   16: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   19: aload #5
/*    */     //   21: ldc 'disposable'
/*    */     //   23: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   26: aload_2
/*    */     //   27: getstatic com/intellij/ml/llm/core/chat/ui/AIAssistantUIUtil$WhenMappings.$EnumSwitchMapping$0 : [I
/*    */     //   30: swap
/*    */     //   31: invokevirtual ordinal : ()I
/*    */     //   34: iaload
/*    */     //   35: tableswitch default -> 89, 1 -> 56, 2 -> 74
/*    */     //   56: new com/intellij/ml/llm/core/chat/parts/CodePart
/*    */     //   59: dup
/*    */     //   60: aload_1
/*    */     //   61: aload #4
/*    */     //   63: aload #5
/*    */     //   65: invokespecial <init> : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;Lcom/intellij/openapi/Disposable;)V
/*    */     //   68: checkcast com/intellij/ml/llm/core/chat/parts/MessagePart
/*    */     //   71: goto -> 97
/*    */     //   74: new com/intellij/ml/llm/core/chat/parts/TextPart
/*    */     //   77: dup
/*    */     //   78: aload #4
/*    */     //   80: invokespecial <init> : (Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;)V
/*    */     //   83: checkcast com/intellij/ml/llm/core/chat/parts/MessagePart
/*    */     //   86: goto -> 97
/*    */     //   89: new kotlin/NoWhenBranchMatchedException
/*    */     //   92: dup
/*    */     //   93: invokespecial <init> : ()V
/*    */     //   96: athrow
/*    */     //   97: astore #6
/*    */     //   99: aload_3
/*    */     //   100: dup
/*    */     //   101: ifnull -> 121
/*    */     //   104: astore #7
/*    */     //   106: iconst_0
/*    */     //   107: istore #8
/*    */     //   109: aload #6
/*    */     //   111: aload_3
/*    */     //   112: invokeinterface addContent : (Ljava/lang/String;)V
/*    */     //   117: nop
/*    */     //   118: goto -> 123
/*    */     //   121: pop
/*    */     //   122: nop
/*    */     //   123: aload #6
/*    */     //   125: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #27	-> 26
/*    */     //   #28	-> 56
/*    */     //   #29	-> 74
/*    */     //   #27	-> 97
/*    */     //   #32	-> 99
/*    */     //   #33	-> 109
/*    */     //   #34	-> 117
/*    */     //   #32	-> 118
/*    */     //   #32	-> 121
/*    */     //   #36	-> 123
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   109	9	8	$i$a$-let-AIAssistantUIUtil$createMessagePart$1	I
/*    */     //   106	12	7	it	Ljava/lang/String;
/*    */     //   99	27	6	part	Lcom/intellij/ml/llm/core/chat/parts/MessagePart;
/*    */     //   0	126	0	this	Lcom/intellij/ml/llm/core/chat/ui/AIAssistantUIUtil;
/*    */     //   0	126	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   0	126	2	type	Lcom/intellij/ml/llm/core/chat/parts/MessagePart$Type;
/*    */     //   0	126	3	content	Ljava/lang/String;
/*    */     //   0	126	4	message	Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;
/*    */     //   0	126	5	disposable	Lcom/intellij/openapi/Disposable;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Language findLanguage(@NotNull String languageName) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'languageName'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: astore_3
/*    */     //   8: aload_3
/*    */     //   9: ldc 'csharp'
/*    */     //   11: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   14: ifeq -> 22
/*    */     //   17: ldc 'c#'
/*    */     //   19: goto -> 37
/*    */     //   22: aload_3
/*    */     //   23: ldc 'cpp'
/*    */     //   25: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   28: ifeq -> 36
/*    */     //   31: ldc 'c++'
/*    */     //   33: goto -> 37
/*    */     //   36: aload_1
/*    */     //   37: astore_2
/*    */     //   38: invokestatic getRegisteredLanguages : ()Ljava/util/Collection;
/*    */     //   41: dup
/*    */     //   42: ldc 'getRegisteredLanguages()'
/*    */     //   44: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   47: checkcast java/lang/Iterable
/*    */     //   50: astore #4
/*    */     //   52: nop
/*    */     //   53: iconst_0
/*    */     //   54: istore #5
/*    */     //   56: aload #4
/*    */     //   58: astore #6
/*    */     //   60: new java/util/ArrayList
/*    */     //   63: dup
/*    */     //   64: invokespecial <init> : ()V
/*    */     //   67: checkcast java/util/Collection
/*    */     //   70: astore #7
/*    */     //   72: iconst_0
/*    */     //   73: istore #8
/*    */     //   75: aload #6
/*    */     //   77: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   82: astore #9
/*    */     //   84: aload #9
/*    */     //   86: invokeinterface hasNext : ()Z
/*    */     //   91: ifeq -> 157
/*    */     //   94: aload #9
/*    */     //   96: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   101: astore #10
/*    */     //   103: aload #10
/*    */     //   105: checkcast com/intellij/lang/Language
/*    */     //   108: astore #11
/*    */     //   110: iconst_0
/*    */     //   111: istore #12
/*    */     //   113: aload #11
/*    */     //   115: invokevirtual getDisplayName : ()Ljava/lang/String;
/*    */     //   118: dup
/*    */     //   119: ldc 'it.displayName'
/*    */     //   121: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   124: checkcast java/lang/CharSequence
/*    */     //   127: invokeinterface length : ()I
/*    */     //   132: ifle -> 139
/*    */     //   135: iconst_1
/*    */     //   136: goto -> 140
/*    */     //   139: iconst_0
/*    */     //   140: nop
/*    */     //   141: ifeq -> 84
/*    */     //   144: aload #7
/*    */     //   146: aload #10
/*    */     //   148: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   153: pop
/*    */     //   154: goto -> 84
/*    */     //   157: aload #7
/*    */     //   159: checkcast java/util/List
/*    */     //   162: nop
/*    */     //   163: checkcast java/lang/Iterable
/*    */     //   166: astore #4
/*    */     //   168: nop
/*    */     //   169: iconst_0
/*    */     //   170: istore #5
/*    */     //   172: aload #4
/*    */     //   174: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   179: astore #6
/*    */     //   181: aload #6
/*    */     //   183: invokeinterface hasNext : ()Z
/*    */     //   188: ifeq -> 228
/*    */     //   191: aload #6
/*    */     //   193: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   198: astore #7
/*    */     //   200: aload #7
/*    */     //   202: checkcast com/intellij/lang/Language
/*    */     //   205: astore #8
/*    */     //   207: iconst_0
/*    */     //   208: istore #9
/*    */     //   210: aload_2
/*    */     //   211: aload #8
/*    */     //   213: invokevirtual getDisplayName : ()Ljava/lang/String;
/*    */     //   216: iconst_1
/*    */     //   217: invokestatic equals : (Ljava/lang/String;Ljava/lang/String;Z)Z
/*    */     //   220: ifeq -> 181
/*    */     //   223: aload #7
/*    */     //   225: goto -> 229
/*    */     //   228: aconst_null
/*    */     //   229: checkcast com/intellij/lang/Language
/*    */     //   232: dup
/*    */     //   233: ifnonnull -> 246
/*    */     //   236: pop
/*    */     //   237: getstatic com/intellij/lang/Language.ANY : Lcom/intellij/lang/Language;
/*    */     //   240: dup
/*    */     //   241: ldc 'ANY'
/*    */     //   243: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   246: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #40	-> 6
/*    */     //   #41	-> 8
/*    */     //   #42	-> 22
/*    */     //   #43	-> 36
/*    */     //   #40	-> 37
/*    */     //   #46	-> 38
/*    */     //   #47	-> 52
/*    */     //   #52	-> 56
/*    */     //   #53	-> 75
/*    */     //   #47	-> 113
/*    */     //   #47	-> 140
/*    */     //   #53	-> 141
/*    */     //   #54	-> 157
/*    */     //   #52	-> 162
/*    */     //   #47	-> 163
/*    */     //   #48	-> 168
/*    */     //   #55	-> 172
/*    */     //   #48	-> 210
/*    */     //   #55	-> 220
/*    */     //   #56	-> 228
/*    */     //   #48	-> 229
/*    */     //   #46	-> 232
/*    */     //   #49	-> 237
/*    */     //   #46	-> 246
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   113	28	12	$i$a$-filter-AIAssistantUIUtil$findLanguage$1	I
/*    */     //   110	31	11	it	Lcom/intellij/lang/Language;
/*    */     //   103	51	10	element$iv$iv	Ljava/lang/Object;
/*    */     //   75	84	8	$i$f$filterTo	I
/*    */     //   72	87	6	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*    */     //   72	87	7	destination$iv$iv	Ljava/util/Collection;
/*    */     //   56	107	5	$i$f$filter	I
/*    */     //   53	110	4	$this$filter$iv	Ljava/lang/Iterable;
/*    */     //   210	10	9	$i$a$-firstOrNull-AIAssistantUIUtil$findLanguage$2	I
/*    */     //   207	13	8	it	Lcom/intellij/lang/Language;
/*    */     //   200	28	7	element$iv	Ljava/lang/Object;
/*    */     //   172	57	5	$i$f$firstOrNull	I
/*    */     //   169	60	4	$this$firstOrNull$iv	Ljava/lang/Iterable;
/*    */     //   38	209	2	fixedLanguage	Ljava/lang/String;
/*    */     //   0	247	0	this	Lcom/intellij/ml/llm/core/chat/ui/AIAssistantUIUtil;
/*    */     //   0	247	1	languageName	Ljava/lang/String;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/AIAssistantUIUtil.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */