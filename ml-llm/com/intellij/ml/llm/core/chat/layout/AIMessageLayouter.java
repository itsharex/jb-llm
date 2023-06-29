/*    */ package com.intellij.ml.llm.core.chat.layout;
/*    */ 
/*    */ import com.intellij.ml.llm.core.chat.messages.CompletableMessage;
/*    */ import com.intellij.ml.llm.core.chat.parts.MessagePart;
/*    */ import kotlin.jvm.internal.Ref;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Service({Service.Level.PROJECT})
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\b\002\b\007\030\000 \0242\0020\001:\001\024B\r\022\006\020\002\032\0020\003¢\006\002\020\004J8\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\b2\006\020\n\032\0020\0132\006\020\f\032\0020\r2\006\020\016\032\0020\0172\006\020\020\032\0020\021H\002J$\020\022\032\b\022\004\022\0020\0060\0232\006\020\n\032\0020\0132\006\020\016\032\0020\0172\006\020\020\032\0020\021R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/core/chat/layout/AIMessageLayouter;", "", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;)V", "createPart", "Lcom/intellij/ml/llm/core/chat/parts/MessagePart;", "blockStart", "", "partUpperOffset", "messageText", "", "currentContextType", "Lcom/intellij/ml/llm/core/chat/parts/MessagePart$Type;", "message", "Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;", "disposable", "Lcom/intellij/openapi/Disposable;", "layout", "", "Companion", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nAIMessageLayouter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIMessageLayouter.kt\ncom/intellij/ml/llm/core/chat/layout/AIMessageLayouter\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,86:1\n1183#2,3:87\n10#3:90\n*S KotlinDebug\n*F\n+ 1 AIMessageLayouter.kt\ncom/intellij/ml/llm/core/chat/layout/AIMessageLayouter\n*L\n37#1:87,3\n15#1:90\n*E\n"})
/*    */ public final class AIMessageLayouter {
/* 12 */   public AIMessageLayouter(@NotNull Project project) { this.project = project; } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\016\020\003\032\0020\004X\004¢\006\002\n\000¨\006\005"}, d2 = {"Lcom/intellij/ml/llm/core/chat/layout/AIMessageLayouter$Companion;", "", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "intellij.ml.llm"})
/*    */   public static final class Companion {
/*    */     private Companion() {} } @NotNull
/* 15 */   public static final Companion Companion = new Companion(null); @NotNull private final Project project; static { int $i$f$logger = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 90 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(AIMessageLayouter.class), "getInstance(T::class.java)"); } @NotNull private static final Logger logger = Logger.getInstance(AIMessageLayouter.class);
/*    */   
/*    */   @NotNull
/*    */   public final List<MessagePart> layout(@NotNull String messageText, @NotNull CompletableMessage message, @NotNull Disposable disposable) {
/*    */     Intrinsics.checkNotNullParameter(messageText, "messageText");
/*    */     Intrinsics.checkNotNullParameter(message, "message");
/*    */     Intrinsics.checkNotNullParameter(disposable, "disposable");
/*    */     Ref.ObjectRef<MessagePart.Type> currentContextType = new Ref.ObjectRef();
/*    */     currentContextType.element = MessagePart.Type.PlainText;
/*    */     Ref.IntRef blockStart = new Ref.IntRef();
/*    */     List<MessagePart> parts = new ArrayList();
/*    */     CharSequence $this$forEachIndexed$iv = messageText;
/*    */     int $i$f$forEachIndexed = 0;
/*    */     int index$iv = 0;
/*    */     byte b = 0;
/*    */     if (b < $this$forEachIndexed$iv.length()) {
/*    */       char item$iv = $this$forEachIndexed$iv.charAt(b);
/*    */       char c = item$iv;
/*    */       int index = index$iv++, $i$a$-forEachIndexed-AIMessageLayouter$layout$1 = 0;
/*    */       AIMessageCharProcessor.Parameters param = new AIMessageCharProcessor.Parameters(c, index, messageText);
/*    */     } 
/*    */     if (blockStart.element < messageText.length())
/*    */       layout$pushPart(this, blockStart, messageText, currentContextType, message, disposable, parts, messageText.length() - 1); 
/*    */     return parts;
/*    */   }
/*    */   
/*    */   private static final void layout$pushPart(AIMessageLayouter this$0, Ref.IntRef blockStart, String $messageText, Ref.ObjectRef currentContextType, CompletableMessage $message, Disposable $disposable, List<MessagePart> parts, int partUpperOffset) {
/*    */     MessagePart newPart = this$0.createPart(blockStart.element, partUpperOffset, $messageText, (MessagePart.Type)currentContextType.element, $message, $disposable);
/*    */     parts.add(newPart);
/*    */     Intrinsics.checkNotNullExpressionValue($messageText.substring(blockStart.element, partUpperOffset + 1), "this as java.lang.String…ing(startIndex, endIndex)");
/*    */     logger.debug("Created new part " + newPart.getClass() + " with range [" + blockStart.element + ", " + partUpperOffset + "], text = " + $messageText.substring(blockStart.element, partUpperOffset + 1));
/*    */     blockStart.element = partUpperOffset + 1;
/*    */     currentContextType.element = MessagePart.Type.PlainText;
/*    */     logger.debug("Context changed. BlockStart = " + blockStart.element + ", ContextType = " + currentContextType.element);
/*    */   }
/*    */   
/*    */   private final MessagePart createPart(int blockStart, int partUpperOffset, String messageText, MessagePart.Type currentContextType, CompletableMessage message, Disposable disposable) {
/*    */     boolean bool = (blockStart < ((CharSequence)messageText).length()) ? true : false;
/*    */     if (_Assertions.ENABLED && !bool) {
/*    */       String str = "Assertion failed";
/*    */       throw new AssertionError(str);
/*    */     } 
/*    */     bool = (partUpperOffset < ((CharSequence)messageText).length()) ? true : false;
/*    */     if (_Assertions.ENABLED && !bool) {
/*    */       String str = "Assertion failed";
/*    */       throw new AssertionError(str);
/*    */     } 
/*    */     String blockText = messageText.subSequence(blockStart, partUpperOffset + 1).toString();
/*    */     return AIAssistantUIUtil.INSTANCE.createMessagePart(this.project, currentContextType, blockText, message, disposable);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/layout/AIMessageLayouter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */