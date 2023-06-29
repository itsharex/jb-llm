/*     */ package com.intellij.ml.llm.core;
/*     */ 
/*     */ import com.intellij.codeInsight.hints.presentation.InlayPresentation;
/*     */ import com.intellij.codeInsight.hints.presentation.StatefulPresentation;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import java.awt.Cursor;
/*     */ import java.awt.Point;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000R\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020!\n\002\030\002\n\002\020\002\n\002\b\002\n\002\020\013\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\b\002\030\000 \0362\b\022\004\022\0020\0020\001:\002\036\037B%\022\006\020\003\032\0020\004\022\006\020\005\032\0020\004\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t¢\006\002\020\nJ\024\020\020\032\0020\0212\f\020\022\032\b\022\004\022\0020\0160\rJ\024\020\023\032\0020\0212\f\020\022\032\b\022\004\022\0020\0160\rJ\b\020\024\032\0020\004H\026J\030\020\025\032\0020\0162\006\020\026\032\0020\0272\006\020\030\032\0020\031H\026J\b\020\032\032\0020\016H\026J\030\020\033\032\0020\0162\006\020\026\032\0020\0272\006\020\030\032\0020\031H\026J\b\020\034\032\0020\035H\026R\016\020\b\032\0020\tX\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000R\016\020\005\032\0020\004X\004¢\006\002\n\000R\016\020\003\032\0020\004X\004¢\006\002\n\000R\032\020\013\032\016\022\n\022\b\022\004\022\0020\0160\r0\fX\004¢\006\002\n\000R\032\020\017\032\016\022\n\022\b\022\004\022\0020\0160\r0\fX\004¢\006\002\n\000¨\006 "}, d2 = {"Lcom/intellij/ml/llm/core/FeedbackButtonInlayPresentation;", "Lcom/intellij/codeInsight/hints/presentation/StatefulPresentation;", "Lcom/intellij/ml/llm/core/FeedbackButtonInlayPresentation$State;", "noHover", "Lcom/intellij/codeInsight/hints/presentation/InlayPresentation;", "hover", "editor", "Lcom/intellij/openapi/editor/Editor;", "cursor", "Ljava/awt/Cursor;", "(Lcom/intellij/codeInsight/hints/presentation/InlayPresentation;Lcom/intellij/codeInsight/hints/presentation/InlayPresentation;Lcom/intellij/openapi/editor/Editor;Ljava/awt/Cursor;)V", "onClickListeners", "", "Lkotlin/Function0;", "", "onStateChangedListeners", "addOnClickListener", "", "body", "addOnStateChangedListener", "getPresentation", "mouseClicked", "event", "Ljava/awt/event/MouseEvent;", "translated", "Ljava/awt/Point;", "mouseExited", "mouseMoved", "toString", "", "Companion", "State", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nNotifications.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Notifications.kt\ncom/intellij/ml/llm/core/FeedbackButtonInlayPresentation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,226:1\n1855#2,2:227\n1855#2,2:229\n1855#2,2:231\n*S KotlinDebug\n*F\n+ 1 Notifications.kt\ncom/intellij/ml/llm/core/FeedbackButtonInlayPresentation\n*L\n201#1:227,2\n209#1:229,2\n216#1:231,2\n*E\n"})
/*     */ final class FeedbackButtonInlayPresentation
/*     */   extends StatefulPresentation<FeedbackButtonInlayPresentation.State>
/*     */ {
/*     */   public FeedbackButtonInlayPresentation(@NotNull InlayPresentation noHover, @NotNull InlayPresentation hover, @NotNull Editor editor, @NotNull Cursor cursor) {
/* 175 */     super(new State(false), STATE_MARK); this.noHover = noHover; this.hover = hover; this.editor = editor;
/*     */     this.cursor = cursor;
/* 177 */     this.onClickListeners = new ArrayList<>();
/* 178 */     this.onStateChangedListeners = new ArrayList<>();
/*     */   } public final boolean addOnClickListener(@NotNull Function0<Unit> body) {
/* 180 */     Intrinsics.checkNotNullParameter(body, "body"); return this.onClickListeners.add(body);
/*     */   }
/* 182 */   public final boolean addOnStateChangedListener(@NotNull Function0<Unit> body) { Intrinsics.checkNotNullParameter(body, "body"); return this.onStateChangedListeners.add(body); }
/*     */   @NotNull
/* 184 */   public InlayPresentation getPresentation() { boolean bool = ((State)getState()).isInside();
/*     */     
/* 186 */     if (!bool) {  } else { throw new NoWhenBranchMatchedException(); }
/*     */     
/*     */     return (bool == true) ? this.hover : (InlayPresentation)"JD-Core does not support Kotlin"; } @NotNull
/*     */   public String toString() {
/* 190 */     boolean bool = ((State)getState()).isInside();
/*     */     
/* 192 */     if (!bool) {  } else { throw new NoWhenBranchMatchedException(); }
/*     */     
/*     */     return ((bool == true) ? "<hovered>" : "JD-Core does not support Kotlin") + ((bool == true) ? "<hovered>" : "JD-Core does not support Kotlin");
/*     */   }
/*     */   public void mouseMoved(@NotNull MouseEvent event, @NotNull Point translated) { Iterator<Function0<Unit>> iterator;
/* 197 */     Intrinsics.checkNotNullParameter(event, "event"); Intrinsics.checkNotNullParameter(translated, "translated"); super.mouseMoved(event, translated);
/* 198 */     if (!((State)getState()).isInside())
/* 199 */     { setState(new State(true));
/* 200 */       Editor editor = this.editor; if (((editor instanceof com.intellij.openapi.editor.impl.EditorImpl) ? editor : null) != null) { ((editor instanceof com.intellij.openapi.editor.impl.EditorImpl) ? editor : null).setCustomCursor(Reflection.getOrCreateKotlinClass(getClass()), this.cursor); } else { (editor instanceof com.intellij.openapi.editor.impl.EditorImpl) ? editor : null; }
/* 201 */        Iterable<Function0<Unit>> $this$forEach$iv = this.onStateChangedListeners; int $i$f$forEach = 0;
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
/* 227 */       iterator = $this$forEach$iv.iterator(); } else { return; }  if (iterator.hasNext()) { Object<Unit> element$iv = (Object<Unit>)iterator.next(); Function0 it = (Function0)element$iv; int $i$a$-forEach-FeedbackButtonInlayPresentation$mouseMoved$1 = 0; it.invoke(); }
/*     */      } public void mouseClicked(@NotNull MouseEvent event, @NotNull Point translated) { Intrinsics.checkNotNullParameter(event, "event"); Intrinsics.checkNotNullParameter(translated, "translated"); super.mouseClicked(event, translated);
/*     */     Iterable<Function0<Unit>> $this$forEach$iv = this.onClickListeners;
/*     */     int $i$f$forEach = 0;
/* 231 */     Iterator<Function0<Unit>> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object<Unit> element$iv = (Object<Unit>)iterator.next(); Function0 it = (Function0)element$iv; int $i$a$-forEach-FeedbackButtonInlayPresentation$mouseClicked$1 = 0;
/*     */       it.invoke(); }
/*     */      }
/*     */ 
/*     */   
/*     */   public void mouseExited() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual getState : ()Ljava/lang/Object;
/*     */     //   4: checkcast com/intellij/ml/llm/core/FeedbackButtonInlayPresentation$State
/*     */     //   7: invokevirtual isInside : ()Z
/*     */     //   10: ifeq -> 121
/*     */     //   13: aload_0
/*     */     //   14: new com/intellij/ml/llm/core/FeedbackButtonInlayPresentation$State
/*     */     //   17: dup
/*     */     //   18: iconst_0
/*     */     //   19: invokespecial <init> : (Z)V
/*     */     //   22: invokevirtual setState : (Ljava/lang/Object;)V
/*     */     //   25: aload_0
/*     */     //   26: getfield editor : Lcom/intellij/openapi/editor/Editor;
/*     */     //   29: astore_2
/*     */     //   30: aload_2
/*     */     //   31: instanceof com/intellij/openapi/editor/impl/EditorImpl
/*     */     //   34: ifeq -> 44
/*     */     //   37: aload_2
/*     */     //   38: checkcast com/intellij/openapi/editor/impl/EditorImpl
/*     */     //   41: goto -> 45
/*     */     //   44: aconst_null
/*     */     //   45: dup
/*     */     //   46: ifnull -> 63
/*     */     //   49: aload_0
/*     */     //   50: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   53: invokestatic getOrCreateKotlinClass : (Ljava/lang/Class;)Lkotlin/reflect/KClass;
/*     */     //   56: aconst_null
/*     */     //   57: invokevirtual setCustomCursor : (Ljava/lang/Object;Ljava/awt/Cursor;)V
/*     */     //   60: goto -> 64
/*     */     //   63: pop
/*     */     //   64: aload_0
/*     */     //   65: getfield onStateChangedListeners : Ljava/util/List;
/*     */     //   68: checkcast java/lang/Iterable
/*     */     //   71: astore_1
/*     */     //   72: iconst_0
/*     */     //   73: istore_2
/*     */     //   74: aload_1
/*     */     //   75: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   80: astore_3
/*     */     //   81: aload_3
/*     */     //   82: invokeinterface hasNext : ()Z
/*     */     //   87: ifeq -> 120
/*     */     //   90: aload_3
/*     */     //   91: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   96: astore #4
/*     */     //   98: aload #4
/*     */     //   100: checkcast kotlin/jvm/functions/Function0
/*     */     //   103: astore #5
/*     */     //   105: iconst_0
/*     */     //   106: istore #6
/*     */     //   108: aload #5
/*     */     //   110: invokeinterface invoke : ()Ljava/lang/Object;
/*     */     //   115: pop
/*     */     //   116: nop
/*     */     //   117: goto -> 81
/*     */     //   120: nop
/*     */     //   121: aload_0
/*     */     //   122: invokespecial mouseExited : ()V
/*     */     //   125: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #206	-> 0
/*     */     //   #207	-> 13
/*     */     //   #208	-> 25
/*     */     //   #209	-> 64
/*     */     //   #229	-> 74
/*     */     //   #209	-> 108
/*     */     //   #229	-> 116
/*     */     //   #230	-> 120
/*     */     //   #211	-> 121
/*     */     //   #212	-> 125
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   108	8	6	$i$a$-forEach-FeedbackButtonInlayPresentation$mouseExited$1	I
/*     */     //   105	11	5	it	Lkotlin/jvm/functions/Function0;
/*     */     //   98	19	4	element$iv	Ljava/lang/Object;
/*     */     //   74	47	2	$i$f$forEach	I
/*     */     //   72	49	1	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   0	126	0	this	Lcom/intellij/ml/llm/core/FeedbackButtonInlayPresentation;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\002\b\007\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\t\020\006\032\0020\003HÆ\003J\023\020\007\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\b\032\0020\0032\b\020\t\032\004\030\0010\001HÖ\003J\t\020\n\032\0020\013HÖ\001J\t\020\f\032\0020\rHÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\002\020\005¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/core/FeedbackButtonInlayPresentation$State;", "", "isInside", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "intellij.ml.llm"})
/*     */   public static final class State {
/*     */     private final boolean isInside;
/*     */     
/*     */     public State(boolean isInside) {
/*     */       this.isInside = isInside;
/*     */     }
/*     */     
/*     */     public final boolean isInside() {
/*     */       return this.isInside;
/*     */     }
/*     */     
/*     */     public final boolean component1() {
/*     */       return this.isInside;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final State copy(boolean isInside) {
/*     */       return new State(isInside);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "State(isInside=" + this.isInside + ")";
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       if (this.isInside);
/*     */       return 1;
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof State))
/*     */         return false; 
/*     */       State state = (State)other;
/*     */       return !(this.isInside != state.isInside);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\004\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\"\020\003\032\b\022\004\022\0020\0050\0048\006X\004¢\006\016\n\000\022\004\b\006\020\002\032\004\b\007\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/core/FeedbackButtonInlayPresentation$Companion;", "", "()V", "STATE_MARK", "Lcom/intellij/codeInsight/hints/presentation/StatefulPresentation$StateMark;", "Lcom/intellij/ml/llm/core/FeedbackButtonInlayPresentation$State;", "getSTATE_MARK$annotations", "getSTATE_MARK", "()Lcom/intellij/codeInsight/hints/presentation/StatefulPresentation$StateMark;", "intellij.ml.llm"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final StatefulPresentation.StateMark<FeedbackButtonInlayPresentation.State> getSTATE_MARK() {
/*     */       return FeedbackButtonInlayPresentation.STATE_MARK;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final InlayPresentation noHover;
/*     */   @NotNull
/*     */   private final InlayPresentation hover;
/*     */   @NotNull
/*     */   private final Editor editor;
/*     */   @NotNull
/*     */   private final Cursor cursor;
/*     */   @NotNull
/*     */   private final List<Function0<Unit>> onClickListeners;
/*     */   @NotNull
/*     */   private final List<Function0<Unit>> onStateChangedListeners;
/*     */   @NotNull
/*     */   private static final StatefulPresentation.StateMark<State> STATE_MARK = new StatefulPresentation.StateMark("OnHover");
/*     */   
/*     */   @NotNull
/*     */   public static final StatefulPresentation.StateMark<State> getSTATE_MARK() {
/*     */     return Companion.getSTATE_MARK();
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/FeedbackButtonInlayPresentation.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */