/*     */ package com.intellij.ml.llm;
/*     */ 
/*     */ import com.intellij.codeInsight.hints.presentation.BasePresentation;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.editor.markup.TextAttributes;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Point;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000j\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020!\n\002\030\002\n\002\020\002\n\000\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\b\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\002\b\000\030\0002\0020\001:\0015B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005¢\006\002\020\007J\024\020 \032\0020\r2\f\020!\032\b\022\004\022\0020\r0\fJ\024\020\"\032\0020\r2\f\020!\032\b\022\004\022\0020\r0\fJ \020#\032\0020\r2\030\020!\032\024\022\004\022\0020\026\022\004\022\0020\026\022\004\022\0020\r0\035J\030\020$\032\0020\r2\006\020%\032\0020&2\006\020'\032\0020(H\026J\b\020)\032\0020\rH\026J\030\020*\032\0020\r2\006\020%\032\0020&2\006\020'\032\0020(H\026J\006\020+\032\0020\rJ\030\020,\032\0020\r2\006\020-\032\0020.2\006\020/\032\00200H\026J\016\0201\032\0020\r2\006\0202\032\0020\005J\b\0203\032\00204H\026R\020\020\b\032\004\030\0010\005X\016¢\006\002\n\000R\016\020\t\032\0020\005X\016¢\006\002\n\000R\032\020\n\032\016\022\n\022\b\022\004\022\0020\r0\f0\013X\004¢\006\002\n\000R\016\020\002\032\0020\003X\004¢\006\002\n\000R\024\020\016\032\0020\0178VX\004¢\006\006\032\004\b\020\020\021R\016\020\022\032\0020\023X\016¢\006\002\n\000R\032\020\024\032\016\022\n\022\b\022\004\022\0020\r0\f0\013X\004¢\006\002\n\000R\016\020\006\032\0020\005X\004¢\006\002\n\000R$\020\027\032\0020\0262\006\020\025\032\0020\026@FX\016¢\006\016\n\000\032\004\b\030\020\031\"\004\b\032\020\033R&\020\034\032\032\022\026\022\024\022\004\022\0020\026\022\004\022\0020\026\022\004\022\0020\r0\0350\013X\004¢\006\002\n\000R\024\020\036\032\0020\0178VX\004¢\006\006\032\004\b\037\020\021¨\0066"}, d2 = {"Lcom/intellij/ml/llm/LLMSuggestGenerationPresentation;", "Lcom/intellij/codeInsight/hints/presentation/BasePresentation;", "editor", "Lcom/intellij/openapi/editor/Editor;", "suggestPresentation", "Lcom/intellij/ml/llm/LLMOnHoverButton;", "processingPresentation", "(Lcom/intellij/openapi/editor/Editor;Lcom/intellij/ml/llm/LLMOnHoverButton;Lcom/intellij/ml/llm/LLMOnHoverButton;)V", "cachedExceptionPresentation", "currentPresentation", "disposeListeners", "", "Lkotlin/Function0;", "", "height", "", "getHeight", "()I", "isInside", "", "presentationChangedListeners", "value", "Lcom/intellij/ml/llm/LLMSuggestGenerationPresentation$State;", "state", "getState", "()Lcom/intellij/ml/llm/LLMSuggestGenerationPresentation$State;", "setState", "(Lcom/intellij/ml/llm/LLMSuggestGenerationPresentation$State;)V", "stateChangedListeners", "Lkotlin/Function2;", "width", "getWidth", "addDisposeListener", "listener", "addPresentationChangedListener", "addStateChangedListener", "mouseClicked", "event", "Ljava/awt/event/MouseEvent;", "translated", "Ljava/awt/Point;", "mouseExited", "mouseMoved", "onDispose", "paint", "g", "Ljava/awt/Graphics2D;", "attributes", "Lcom/intellij/openapi/editor/markup/TextAttributes;", "showException", "exceptionPresentation", "toString", "", "State", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nLLMInlayPresentations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMInlayPresentations.kt\ncom/intellij/ml/llm/LLMSuggestGenerationPresentation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,282:1\n1855#2,2:283\n1855#2,2:285\n1855#2,2:287\n1855#2,2:289\n1855#2,2:291\n1855#2,2:293\n1855#2,2:295\n*S KotlinDebug\n*F\n+ 1 LLMInlayPresentations.kt\ncom/intellij/ml/llm/LLMSuggestGenerationPresentation\n*L\n73#1:283,2\n102#1:285,2\n129#1:287,2\n138#1:289,2\n152#1:291,2\n161#1:293,2\n170#1:295,2\n*E\n"})
/*     */ public final class LLMSuggestGenerationPresentation
/*     */   extends BasePresentation
/*     */ {
/*     */   @NotNull
/*     */   private final Editor editor;
/*     */   @NotNull
/*     */   private final LLMOnHoverButton processingPresentation;
/*     */   @NotNull
/*     */   private State state;
/*     */   @NotNull
/*     */   private LLMOnHoverButton currentPresentation;
/*     */   private boolean isInside;
/*     */   @Nullable
/*     */   private LLMOnHoverButton cachedExceptionPresentation;
/*     */   @NotNull
/*     */   private final List<Function0<Unit>> presentationChangedListeners;
/*     */   @NotNull
/*     */   private final List<Function0<Unit>> disposeListeners;
/*     */   @NotNull
/*     */   private final List<Function2<State, State, Unit>> stateChangedListeners;
/*     */   
/*     */   public LLMSuggestGenerationPresentation(@NotNull Editor editor, @NotNull LLMOnHoverButton suggestPresentation, @NotNull LLMOnHoverButton processingPresentation) {
/*  61 */     this.editor = editor;
/*     */     
/*  63 */     this.processingPresentation = processingPresentation;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  71 */     this.state = State.SUGGESTION;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  77 */     this.currentPresentation = suggestPresentation;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  83 */     this.presentationChangedListeners = new ArrayList<>();
/*     */     
/*  85 */     this.disposeListeners = new ArrayList<>();
/*     */     
/*  87 */     this.stateChangedListeners = new ArrayList<>();
/*     */   }
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
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\005\b\001\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/LLMSuggestGenerationPresentation$State;", "", "(Ljava/lang/String;I)V", "SUGGESTION", "PROCESSING", "ERROR", "intellij.ml.llm"})
/*     */   public enum State
/*     */   {
/*     */     SUGGESTION, PROCESSING, ERROR;
/*     */   }
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
/*     */   @NotNull
/*     */   public final State getState() {
/*     */     return this.state;
/*     */   }
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
/*     */   public final void setState(@NotNull State value) {
/*     */     Intrinsics.checkNotNullParameter(value, "value");
/*     */     Iterable<Function2<State, State, Unit>> $this$forEach$iv = this.stateChangedListeners;
/*     */     int $i$f$forEach = 0;
/* 283 */     Iterator<Function2<State, State, Unit>> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object<State, State, Unit> element$iv = (Object<State, State, Unit>)iterator.next(); Function2 it = (Function2)element$iv; int $i$a$-forEach-LLMSuggestGenerationPresentation$state$1 = 0; it.invoke(this.state, value); }  this.state = value;
/*     */   } public final void addPresentationChangedListener(@NotNull Function0<Unit> listener) { Intrinsics.checkNotNullParameter(listener, "listener"); this.presentationChangedListeners.add(listener); } public final void addDisposeListener(@NotNull Function0<Unit> listener) { Intrinsics.checkNotNullParameter(listener, "listener"); this.disposeListeners.add(listener); } public final void addStateChangedListener(@NotNull Function2<State, State, Unit> listener) { Intrinsics.checkNotNullParameter(listener, "listener"); this.stateChangedListeners.add(listener); }
/* 285 */   public final void onDispose() { Iterable<Function0<Unit>> $this$forEach$iv = this.disposeListeners; int $i$f$forEach = 0; Iterator<Function0<Unit>> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object<Unit> element$iv = (Object<Unit>)iterator.next(); Function0 it = (Function0)element$iv; int $i$a$-forEach-LLMSuggestGenerationPresentation$onDispose$1 = 0; it.invoke(); }  }
/*     */   public int getWidth() { return this.currentPresentation.getPresentation().getWidth(); }
/* 287 */   public int getHeight() { return this.currentPresentation.getPresentation().getHeight(); } public void mouseClicked(@NotNull MouseEvent event, @NotNull Point translated) { Intrinsics.checkNotNullParameter(event, "event"); Intrinsics.checkNotNullParameter(translated, "translated"); boolean clicked = this.currentPresentation.onClick(event, translated); if (clicked) { Iterable<Function0<Unit>> $this$forEach$iv; int $i$f$forEach; Iterator<Function0<Unit>> iterator1, iterator2; Editor editor = this.editor; if (((editor instanceof com.intellij.openapi.editor.impl.EditorImpl) ? editor : null) != null) { ((editor instanceof com.intellij.openapi.editor.impl.EditorImpl) ? editor : null).setCustomCursor(Reflection.getOrCreateKotlinClass(getClass()), null); } else { (editor instanceof com.intellij.openapi.editor.impl.EditorImpl) ? editor : null; }  switch (WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()]) { case 1: setState(State.PROCESSING); this.currentPresentation = this.processingPresentation; $this$forEach$iv = this.presentationChangedListeners; $i$f$forEach = 0; iterator1 = $this$forEach$iv.iterator(); if (iterator1.hasNext()) { Object<Unit> element$iv = (Object<Unit>)iterator1.next(); Function0 it = (Function0)element$iv; int $i$a$-forEach-LLMSuggestGenerationPresentation$mouseClicked$1 = 0; it.invoke(); } 
/*     */         case 3:
/* 289 */           setState(State.PROCESSING); if (this.cachedExceptionPresentation != null) { LLMOnHoverButton it = this.cachedExceptionPresentation; int $i$a$-let-LLMSuggestGenerationPresentation$mouseClicked$2 = 0; this.currentPresentation = this.processingPresentation; Iterable<Function0<Unit>> iterable = this.presentationChangedListeners; int i = 0; iterator2 = iterable.iterator(); } else { break; }  if (iterator2.hasNext()) { Object<Unit> element$iv = (Object<Unit>)iterator2.next(); Function0 it = (Function0)element$iv; int $i$a$-forEach-LLMSuggestGenerationPresentation$mouseClicked$2$1 = 0; it.invoke(); }  }  }
/*     */      super.mouseClicked(event, translated); }
/*     */   public void paint(@NotNull Graphics2D g, @NotNull TextAttributes attributes) { Intrinsics.checkNotNullParameter(g, "g"); Intrinsics.checkNotNullParameter(attributes, "attributes"); this.currentPresentation.getPresentation().paint(g, attributes); }
/*     */   @NotNull public String toString() { return "ChangeOnClick(" + this.currentPresentation.getPresentation() + ")"; }
/*     */   public void mouseMoved(@NotNull MouseEvent event, @NotNull Point translated) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'event'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'translated'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_0
/*     */     //   13: getfield isInside : Z
/*     */     //   16: ifne -> 113
/*     */     //   19: aload_0
/*     */     //   20: iconst_1
/*     */     //   21: putfield isInside : Z
/*     */     //   24: aload_0
/*     */     //   25: getfield currentPresentation : Lcom/intellij/ml/llm/LLMOnHoverButton;
/*     */     //   28: aload_0
/*     */     //   29: getfield editor : Lcom/intellij/openapi/editor/Editor;
/*     */     //   32: iconst_1
/*     */     //   33: aload_0
/*     */     //   34: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   37: invokestatic getOrCreateKotlinClass : (Ljava/lang/Class;)Lkotlin/reflect/KClass;
/*     */     //   40: aload_1
/*     */     //   41: aload_2
/*     */     //   42: invokevirtual mouseEvent : (Lcom/intellij/openapi/editor/Editor;ZLkotlin/reflect/KClass;Ljava/awt/event/MouseEvent;Ljava/awt/Point;)Z
/*     */     //   45: istore_3
/*     */     //   46: iload_3
/*     */     //   47: ifeq -> 113
/*     */     //   50: aload_0
/*     */     //   51: getfield presentationChangedListeners : Ljava/util/List;
/*     */     //   54: checkcast java/lang/Iterable
/*     */     //   57: astore #4
/*     */     //   59: iconst_0
/*     */     //   60: istore #5
/*     */     //   62: aload #4
/*     */     //   64: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   69: astore #6
/*     */     //   71: aload #6
/*     */     //   73: invokeinterface hasNext : ()Z
/*     */     //   78: ifeq -> 112
/*     */     //   81: aload #6
/*     */     //   83: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   88: astore #7
/*     */     //   90: aload #7
/*     */     //   92: checkcast kotlin/jvm/functions/Function0
/*     */     //   95: astore #8
/*     */     //   97: iconst_0
/*     */     //   98: istore #9
/*     */     //   100: aload #8
/*     */     //   102: invokeinterface invoke : ()Ljava/lang/Object;
/*     */     //   107: pop
/*     */     //   108: nop
/*     */     //   109: goto -> 71
/*     */     //   112: nop
/*     */     //   113: aload_0
/*     */     //   114: aload_1
/*     */     //   115: aload_2
/*     */     //   116: invokespecial mouseMoved : (Ljava/awt/event/MouseEvent;Ljava/awt/Point;)V
/*     */     //   119: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #149	-> 12
/*     */     //   #150	-> 19
/*     */     //   #151	-> 24
/*     */     //   #152	-> 46
/*     */     //   #291	-> 62
/*     */     //   #152	-> 100
/*     */     //   #291	-> 108
/*     */     //   #292	-> 112
/*     */     //   #154	-> 113
/*     */     //   #155	-> 119
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   100	8	9	$i$a$-forEach-LLMSuggestGenerationPresentation$mouseMoved$1	I
/*     */     //   97	11	8	it	Lkotlin/jvm/functions/Function0;
/*     */     //   90	19	7	element$iv	Ljava/lang/Object;
/*     */     //   62	51	5	$i$f$forEach	I
/*     */     //   59	54	4	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   46	67	3	onHover	Z
/*     */     //   0	120	0	this	Lcom/intellij/ml/llm/LLMSuggestGenerationPresentation;
/*     */     //   0	120	1	event	Ljava/awt/event/MouseEvent;
/*     */     //   0	120	2	translated	Ljava/awt/Point; }
/*     */   public void mouseExited() { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield isInside : Z
/*     */     //   4: ifeq -> 98
/*     */     //   7: aload_0
/*     */     //   8: iconst_0
/*     */     //   9: putfield isInside : Z
/*     */     //   12: aload_0
/*     */     //   13: getfield currentPresentation : Lcom/intellij/ml/llm/LLMOnHoverButton;
/*     */     //   16: aload_0
/*     */     //   17: getfield editor : Lcom/intellij/openapi/editor/Editor;
/*     */     //   20: iconst_0
/*     */     //   21: aload_0
/*     */     //   22: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   25: invokestatic getOrCreateKotlinClass : (Ljava/lang/Class;)Lkotlin/reflect/KClass;
/*     */     //   28: aconst_null
/*     */     //   29: aconst_null
/*     */     //   30: invokevirtual mouseEvent : (Lcom/intellij/openapi/editor/Editor;ZLkotlin/reflect/KClass;Ljava/awt/event/MouseEvent;Ljava/awt/Point;)Z
/*     */     //   33: istore_1
/*     */     //   34: iload_1
/*     */     //   35: ifeq -> 98
/*     */     //   38: aload_0
/*     */     //   39: getfield presentationChangedListeners : Ljava/util/List;
/*     */     //   42: checkcast java/lang/Iterable
/*     */     //   45: astore_2
/*     */     //   46: iconst_0
/*     */     //   47: istore_3
/*     */     //   48: aload_2
/*     */     //   49: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   54: astore #4
/*     */     //   56: aload #4
/*     */     //   58: invokeinterface hasNext : ()Z
/*     */     //   63: ifeq -> 97
/*     */     //   66: aload #4
/*     */     //   68: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   73: astore #5
/*     */     //   75: aload #5
/*     */     //   77: checkcast kotlin/jvm/functions/Function0
/*     */     //   80: astore #6
/*     */     //   82: iconst_0
/*     */     //   83: istore #7
/*     */     //   85: aload #6
/*     */     //   87: invokeinterface invoke : ()Ljava/lang/Object;
/*     */     //   92: pop
/*     */     //   93: nop
/*     */     //   94: goto -> 56
/*     */     //   97: nop
/*     */     //   98: aload_0
/*     */     //   99: invokespecial mouseExited : ()V
/*     */     //   102: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #158	-> 0
/*     */     //   #159	-> 7
/*     */     //   #160	-> 12
/*     */     //   #161	-> 34
/*     */     //   #293	-> 48
/*     */     //   #161	-> 85
/*     */     //   #293	-> 93
/*     */     //   #294	-> 97
/*     */     //   #163	-> 98
/*     */     //   #164	-> 102
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   85	8	7	$i$a$-forEach-LLMSuggestGenerationPresentation$mouseExited$1	I
/*     */     //   82	11	6	it	Lkotlin/jvm/functions/Function0;
/*     */     //   75	19	5	element$iv	Ljava/lang/Object;
/*     */     //   48	50	3	$i$f$forEach	I
/*     */     //   46	52	2	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   34	64	1	onHover	Z
/*     */     //   0	103	0	this	Lcom/intellij/ml/llm/LLMSuggestGenerationPresentation; } public final void showException(@NotNull LLMOnHoverButton exceptionPresentation) { Intrinsics.checkNotNullParameter(exceptionPresentation, "exceptionPresentation"); if (this.state != State.PROCESSING)
/* 295 */       return;  this.cachedExceptionPresentation = exceptionPresentation; this.currentPresentation = exceptionPresentation; Iterable<Function0<Unit>> $this$forEach$iv = this.presentationChangedListeners; int $i$f$forEach = 0; Iterator<Function0<Unit>> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object<Unit> element$iv = (Object<Unit>)iterator.next(); Function0 it = (Function0)element$iv; int $i$a$-forEach-LLMSuggestGenerationPresentation$showException$1 = 0;
/*     */       it.invoke(); }
/*     */     
/*     */     setState(State.ERROR); }
/*     */ 
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/LLMSuggestGenerationPresentation.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */