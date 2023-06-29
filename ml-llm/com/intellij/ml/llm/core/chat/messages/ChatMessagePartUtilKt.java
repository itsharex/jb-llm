/*     */ package com.intellij.ml.llm.core.chat.messages;
/*     */ import com.intellij.ml.llm.core.chat.parts.MessagePart;
/*     */ import java.util.List;
/*     */ import kotlin.Pair;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlin.text.MatchResult;
/*     */ import kotlin.text.Regex;
/*     */ import kotlin.text.StringsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\032\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\032\024\020\000\032\b\022\004\022\0020\0020\0012\006\020\003\032\0020\004\032\036\020\005\032\020\022\004\022\0020\004\022\006\022\004\030\0010\0040\0062\006\020\007\032\0020\004H\002¨\006\b"}, d2 = {"buildParts", "", "Lcom/intellij/ml/llm/core/chat/messages/ChatMessagePart;", "message", "", "extractCodeAndLanguage", "Lkotlin/Pair;", "content", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nChatMessagePartUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatMessagePartUtil.kt\ncom/intellij/ml/llm/core/chat/messages/ChatMessagePartUtilKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,124:1\n1183#2,3:125\n*S KotlinDebug\n*F\n+ 1 ChatMessagePartUtil.kt\ncom/intellij/ml/llm/core/chat/messages/ChatMessagePartUtilKt\n*L\n54#1:125,3\n*E\n"})
/*     */ public final class ChatMessagePartUtilKt {
/*     */   @NotNull
/*     */   public static final List<ChatMessagePart> buildParts(@NotNull String message) {
/*  17 */     Intrinsics.checkNotNullParameter(message, "message"); Ref.ObjectRef currentContextType = new Ref.ObjectRef(); currentContextType.element = ChatMessagePartKind.Text;
/*  18 */     Ref.IntRef blockStart = new Ref.IntRef();
/*  19 */     List<ChatMessagePart> result = new ArrayList();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  54 */     CharSequence $this$forEachIndexed$iv = message; int $i$f$forEachIndexed = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 125 */     int index$iv = 0;
/* 126 */     byte b = 0; if (b < $this$forEachIndexed$iv.length()) { char item$iv = $this$forEachIndexed$iv.charAt(b); char c = item$iv; int index = index$iv++, $i$a$-forEachIndexed-ChatMessagePartUtilKt$buildParts$1 = 0;
/*     */       AIMessageCharProcessor.Parameters param = new AIMessageCharProcessor.Parameters(c, index, message); }
/*     */     
/*     */     return result;
/*     */   }
/*     */   
/*     */   private static final void buildParts$pushPart(Ref.ObjectRef currentContextType, List<ChatMessagePart.TextChatMessagePart> result, String $message, Ref.IntRef blockStart, int partUpperOffset) {
/*     */     String text;
/*     */     Pair<String, String> pair;
/*     */     String code, language;
/*     */     switch (WhenMappings.$EnumSwitchMapping$0[((ChatMessagePartKind)currentContextType.element).ordinal()]) {
/*     */       case 1:
/*     */         Intrinsics.checkNotNullExpressionValue($message.substring(blockStart.element, partUpperOffset), "this as java.lang.String…ing(startIndex, endIndex)");
/*     */         result.add(new ChatMessagePart.TextChatMessagePart($message.substring(blockStart.element, partUpperOffset), (ChatMessagePartKind)currentContextType.element));
/*     */         break;
/*     */       case 2:
/*     */         Intrinsics.checkNotNullExpressionValue($message.substring(blockStart.element, partUpperOffset), "this as java.lang.String…ing(startIndex, endIndex)");
/*     */         text = $message.substring(blockStart.element, partUpperOffset);
/*     */         pair = extractCodeAndLanguage(text);
/*     */         code = (String)pair.component1();
/*     */         language = (String)pair.component2();
/*     */         result.add(new ChatMessagePart.CodeChatMessagePart(code, language, (ChatMessagePartKind)currentContextType.element));
/*     */         break;
/*     */     } 
/*     */     blockStart.element = partUpperOffset + 1;
/*     */     currentContextType.element = ChatMessagePartKind.Text;
/*     */     ChatMessagePartUtil.Companion.getLogger().trace("Context changed. BlockStart = " + blockStart.element + ", ContextType = " + currentContextType.element);
/*     */   }
/*     */   
/*     */   private static final ChatMessagePartKind buildParts$convert(MessagePart.Type type) {
/*     */     switch (WhenMappings.$EnumSwitchMapping$1[type.ordinal()]) {
/*     */       case 1:
/*     */       
/*     */       case 2:
/*     */       
/*     */     } 
/*     */     throw new NoWhenBranchMatchedException();
/*     */   }
/*     */   
/*     */   private static final MessagePart.Type buildParts$convertToOld(ChatMessagePartKind type) {
/*     */     switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
/*     */       case 2:
/*     */       
/*     */       case 1:
/*     */       
/*     */     } 
/*     */     throw new NoWhenBranchMatchedException();
/*     */   }
/*     */   
/*     */   private static final Pair<String, String> extractCodeAndLanguage(String content) {
/*     */     String[] arrayOfString = new String[1];
/*     */     arrayOfString[0] = "\n";
/*     */     List lines = StringsKt.split$default(content, arrayOfString, false, 0, 6, null);
/*     */     Regex regex = new Regex("```(\\w*)");
/*     */     String languageId = null;
/*     */     StringBuilder codeBuilder = new StringBuilder();
/*     */     for (String line : lines) {
/*     */       MatchResult matchResult = Regex.find$default(regex, StringsKt.trimStart(line).toString(), 0, 2, null);
/*     */       if (matchResult != null && matchResult.getGroupValues().size() == 2) {
/*     */         if (languageId == null)
/*     */           languageId = StringsKt.trim(matchResult.getGroupValues().get(1)).toString(); 
/*     */         continue;
/*     */       } 
/*     */       if (languageId != null)
/*     */         codeBuilder.append(line).append("\n"); 
/*     */     } 
/*     */     Intrinsics.checkNotNullExpressionValue(codeBuilder.toString(), "codeBuilder.toString()");
/*     */     return TuplesKt.to(codeBuilder.toString(), languageId);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/messages/ChatMessagePartUtilKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */