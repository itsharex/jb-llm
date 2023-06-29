/*     */ package com.intellij.ml.llm.core.chat.ui.list;
/*     */ 
/*     */ import com.intellij.ml.llm.core.chat.session.ChatCreationContext;
/*     */ import com.intellij.ml.llm.core.chat.session.ChatSession;
/*     */ import com.intellij.ml.llm.core.chat.ui.AIAssistantContainerPanel;
/*     */ import com.intellij.openapi.actionSystem.DataContext;
/*     */ import com.intellij.openapi.actionSystem.DataKey;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.util.Key;
/*     */ import com.intellij.ui.components.JBList;
/*     */ import com.intellij.ui.components.JBScrollPane;
/*     */ import com.intellij.ui.dsl.listCellRenderer.LcrRow;
/*     */ import com.intellij.ui.dsl.listCellRenderer.LcrText;
/*     */ import com.intellij.ui.dsl.listCellRenderer.LcrTextInitParams;
/*     */ import com.intellij.util.ui.StatusText;
/*     */ import java.awt.Component;
/*     */ import java.awt.Point;
/*     */ import java.awt.event.MouseEvent;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\020\002\n\002\b\005\030\000 \0352\0020\0012\0020\002:\001\035B\035\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b¢\006\002\020\tJ\033\020\020\032\025\022\f\022\n \r*\004\030\0010\f0\f0\021¢\006\002\b\022H\002J\022\020\023\032\004\030\0010\0242\006\020\025\032\0020\026H\026J\016\020\027\032\b\022\004\022\0020\f0\021H\002J\b\020\030\032\0020\031H\002J\016\020\032\032\0020\0312\006\020\033\032\0020\fJ\006\020\034\032\0020\031R\016\020\007\032\0020\bX\004¢\006\002\n\000R\034\020\n\032\020\022\f\022\n \r*\004\030\0010\f0\f0\013X\004¢\006\002\n\000R\024\020\016\032\b\022\004\022\0020\f0\017X\004¢\006\002\n\000R\016\020\003\032\0020\004X\004¢\006\002\n\000R\016\020\005\032\0020\006X\004¢\006\002\n\000¨\006\036"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/list/AIAssistantChatListPanel;", "Lcom/intellij/util/ui/components/BorderLayoutPanel;", "Lcom/intellij/openapi/actionSystem/DataProvider;", "project", "Lcom/intellij/openapi/project/Project;", "service", "Lcom/intellij/ml/llm/core/chat/session/ChatSessionHost;", "focusedChatManager", "Lcom/intellij/ml/llm/core/chat/session/FocusedChatSessionHost;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/chat/session/ChatSessionHost;Lcom/intellij/ml/llm/core/chat/session/FocusedChatSessionHost;)V", "list", "Lcom/intellij/ui/components/JBList;", "Lcom/intellij/ml/llm/core/chat/session/ChatSession;", "kotlin.jvm.PlatformType", "listCellRenderer", "Ljavax/swing/ListCellRenderer;", "createModel", "Ljavax/swing/DefaultListModel;", "Lorg/jetbrains/annotations/NotNull;", "getData", "", "dataId", "", "getModelCasted", "openSelectedChat", "", "removeChat", "chat", "updateModel", "Companion", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nAIAssistantChatListPanel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIAssistantChatListPanel.kt\ncom/intellij/ml/llm/core/chat/ui/list/AIAssistantChatListPanel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,145:1\n1054#2:146\n*S KotlinDebug\n*F\n+ 1 AIAssistantChatListPanel.kt\ncom/intellij/ml/llm/core/chat/ui/list/AIAssistantChatListPanel\n*L\n132#1:146\n*E\n"})
/*     */ public final class AIAssistantChatListPanel extends BorderLayoutPanel implements DataProvider {
/*  32 */   public AIAssistantChatListPanel(@NotNull Project project, @NotNull ChatSessionHost service, @NotNull FocusedChatSessionHost focusedChatManager) { this.project = project;
/*  33 */     this.service = service;
/*  34 */     this.focusedChatManager = focusedChatManager;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  40 */     this.list = new JBList(createModel());
/*  41 */     this.listCellRenderer = BuilderKt.listCellRenderer(AIAssistantChatListPanel$listCellRenderer$1.INSTANCE);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  56 */     StatusText statusText1 = this.list.getEmptyText(), $this$_init__u24lambda_u241 = statusText1; int $i$a$-apply-AIAssistantChatListPanel$1 = 0;
/*  57 */     $this$_init__u24lambda_u241.clear();
/*  58 */     $this$_init__u24lambda_u241.appendLine("There are no chats yet");
/*  59 */     $this$_init__u24lambda_u241.appendLine("Create new chat", SimpleTextAttributes.LINK_PLAIN_ATTRIBUTES, this::lambda$1$lambda$0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  72 */     JBList<ChatSession> jBList1 = this.list, $this$_init__u24lambda_u242 = jBList1; int $i$a$-apply-AIAssistantChatListPanel$list$1 = 0;
/*  73 */     $this$_init__u24lambda_u242.setCellRenderer(this.listCellRenderer);
/*     */ 
/*     */     
/*  76 */     $this$_init__u24lambda_u242.addMouseListener((MouseListener)new AIAssistantChatListPanel$list$1$1());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  96 */     $this$_init__u24lambda_u242.addMouseListener(new AIAssistantChatListPanel$list$1$2($this$_init__u24lambda_u242));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 105 */     AIAssistantChatListPanel$list$1$keyListener$1 keyListener = new AIAssistantChatListPanel$list$1$keyListener$1();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 112 */     this.list.addKeyListener(keyListener);
/*     */     JBList<ChatSession> list = jBList1;
/* 114 */     JBScrollPane scrollPane = new JBScrollPane((Component)list, 20, 31);
/* 115 */     scrollPane.setBorder((Border)JBUI.Borders.empty());
/* 116 */     scrollPane.setOverlappingScrollBar(true);
/* 117 */     addToCenter((Component)scrollPane); }
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R$\020\003\032\025\022\f\022\n \006*\004\030\0010\0050\0050\004¢\006\002\b\007¢\006\b\n\000\032\004\b\b\020\tR$\020\n\032\025\022\f\022\n \006*\004\030\0010\f0\f0\013¢\006\002\b\007¢\006\b\n\000\032\004\b\r\020\016¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/list/AIAssistantChatListPanel$Companion;", "", "()V", "ChatList", "Lcom/intellij/openapi/actionSystem/DataKey;", "Lcom/intellij/ml/llm/core/chat/ui/list/AIAssistantChatListPanel;", "kotlin.jvm.PlatformType", "Lorg/jetbrains/annotations/NotNull;", "getChatList", "()Lcom/intellij/openapi/actionSystem/DataKey;", "SelectedElementKey", "Lcom/intellij/openapi/util/Key;", "Lcom/intellij/ml/llm/core/chat/session/ChatSession;", "getSelectedElementKey", "()Lcom/intellij/openapi/util/Key;", "intellij.ml.llm"}) public static final class Companion {
/*     */     private Companion() {}
/* 120 */     @NotNull public final DataKey<AIAssistantChatListPanel> getChatList() { return AIAssistantChatListPanel.ChatList; } @NotNull public final Key<ChatSession> getSelectedElementKey() { return AIAssistantChatListPanel.SelectedElementKey; } } @NotNull public static final Companion Companion = new Companion(null); @NotNull private final Project project; @NotNull private final ChatSessionHost service; @NotNull private final FocusedChatSessionHost focusedChatManager; @NotNull private final JBList<ChatSession> list; @NotNull private final ListCellRenderer<ChatSession> listCellRenderer; @NotNull private static final DataKey<AIAssistantChatListPanel> ChatList = DataKey.create("ChatList"); static { Intrinsics.checkNotNullExpressionValue(DataKey.create("ChatList"), "create<AIAssistantChatListPanel>(\"ChatList\")"); } @NotNull private static final Key<ChatSession> SelectedElementKey = Key.create("SelectedElementKey"); private final DefaultListModel<ChatSession> getModelCasted() { Intrinsics.checkNotNull(this.list.getModel(), "null cannot be cast to non-null type javax.swing.DefaultListModel<com.intellij.ml.llm.core.chat.session.ChatSession>"); return (DefaultListModel<ChatSession>)this.list.getModel(); } static { Intrinsics.checkNotNullExpressionValue(Key.create("SelectedElementKey"), "create<ChatSession>(\"SelectedElementKey\")"); } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\002\030\002\n\002\030\002\n\000\020\000\032\0020\001*\b\022\004\022\0020\0030\002H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "Lcom/intellij/ui/dsl/listCellRenderer/LcrRow;", "Lcom/intellij/ml/llm/core/chat/session/ChatSession;", "invoke"}) static final class AIAssistantChatListPanel$listCellRenderer$1 extends Lambda implements Function1<LcrRow<ChatSession>, Unit> {
/*     */     public static final AIAssistantChatListPanel$listCellRenderer$1 INSTANCE = new AIAssistantChatListPanel$listCellRenderer$1(); public final void invoke(@NotNull LcrRow $this$listCellRenderer) { Intrinsics.checkNotNullParameter($this$listCellRenderer, "$this$listCellRenderer"); LcrText title = $this$listCellRenderer.text(AIAssistantChatListPanel$listCellRenderer$1$title$1.INSTANCE); LcrText time = $this$listCellRenderer.text(AIAssistantChatListPanel$listCellRenderer$1$time$1.INSTANCE); $this$listCellRenderer.renderer(new Function1<ChatSession, Unit>(title, time) { public final void invoke(@NotNull ChatSession value) { Intrinsics.checkNotNullParameter(value, "value"); this.$title.setText(value.getTitle().getText()); this.$time.setText(JBDateFormat.getFormatter().formatPrettyDateTime(value.getTimestamp())); } }); } AIAssistantChatListPanel$listCellRenderer$1() { super(1); } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/ui/dsl/listCellRenderer/LcrTextInitParams;", "invoke"}) static final class AIAssistantChatListPanel$listCellRenderer$1$title$1 extends Lambda implements Function1<LcrTextInitParams, Unit> {
/*     */       public static final AIAssistantChatListPanel$listCellRenderer$1$title$1 INSTANCE = new AIAssistantChatListPanel$listCellRenderer$1$title$1(); public final void invoke(@NotNull LcrTextInitParams $this$text) { Intrinsics.checkNotNullParameter($this$text, "$this$text"); $this$text.setGrow(true); } AIAssistantChatListPanel$listCellRenderer$1$title$1() { super(1); } } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/ui/dsl/listCellRenderer/LcrTextInitParams;", "invoke"}) static final class AIAssistantChatListPanel$listCellRenderer$1$time$1 extends Lambda implements Function1<LcrTextInitParams, Unit> {
/* 123 */       public static final AIAssistantChatListPanel$listCellRenderer$1$time$1 INSTANCE = new AIAssistantChatListPanel$listCellRenderer$1$time$1(); public final void invoke(@NotNull LcrTextInitParams $this$text) { Intrinsics.checkNotNullParameter($this$text, "$this$text"); $this$text.setStyle(LcrTextInitParams.Style.GRAYED); } AIAssistantChatListPanel$listCellRenderer$1$time$1() { super(1); } } } public final void removeChat(@NotNull ChatSession chat) { Intrinsics.checkNotNullParameter(chat, "chat"); int index = getModelCasted().indexOf(chat);
/* 124 */     if (index >= 0)
/* 125 */       getModelCasted().remove(index);  } private static final void lambda$1$lambda$0(AIAssistantChatListPanel this$0, ActionEvent it) { Intrinsics.checkNotNullParameter(this$0, "this$0"); Intrinsics.checkNotNullExpressionValue(ActionToolbar.getDataContextFor((Component)this$0), "getDataContextFor(this@AIAssistantChatListPanel)"); DataContext dataContext = ActionToolbar.getDataContextFor((Component)this$0); ChatCreationContext context = new ChatCreationContext((ChatOrigin)ChatOrigin.AIAssistantTool.INSTANCE, ChatSessionStorage.SourceAction.NEW_CHAT, null, null, 12, null); BuildersKt.launch$default(AIAssistantServiceScope.Companion.getScope(this$0.project), null, null, new AIAssistantChatListPanel$1$1$1(dataContext, context, null), 3, null); } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\037\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\002*\001\000\b\n\030\0002\0020\001J\"\020\002\032\0020\0032\b\020\004\032\004\030\0010\0052\006\020\006\032\0020\0072\006\020\b\032\0020\007H\026¨\006\t"}, d2 = {"com/intellij/ml/llm/core/chat/ui/list/AIAssistantChatListPanel$list$1$1", "Lcom/intellij/ui/PopupHandler;", "invokePopup", "", "comp", "Ljava/awt/Component;", "x", "", "y", "intellij.ml.llm"}) public static final class AIAssistantChatListPanel$list$1$1 extends PopupHandler {
/*     */     public void invokePopup(@Nullable Component comp, int x, int y) { if (comp == null) return;  Point point = new Point(x, y); int index = AIAssistantChatListPanel.this.list.locationToIndex(point); if (index >= 0 && index < AIAssistantChatListPanel.this.list.getModel().getSize()) { Rectangle bounds = AIAssistantChatListPanel.this.list.getCellBounds(index, index); if (bounds != null && bounds.contains(point)) { ActionGroup group; ChatSession element = AIAssistantChatListPanel.this.getModelCasted().elementAt(index); AIAssistantChatListPanel.this.list.setSelectedIndex(index); if (ActionUtil.getActionGroup("AIAssistant.ToolWindow.List.ContextActions") == null) { ActionUtil.getActionGroup("AIAssistant.ToolWindow.List.ContextActions"); return; }  Intrinsics.checkNotNullExpressionValue(DataManager.getInstance().getDataContext(comp, x, y), "getInstance().getDataContext(comp, x, y)"); DataContext dataContext = DataManager.getInstance().getDataContext(comp, x, y); DataManager.getInstance().saveInDataContext(dataContext, AIAssistantChatListPanel.Companion.getSelectedElementKey(), element); Intrinsics.checkNotNullExpressionValue(JBPopupFactory.getInstance().createActionGroupPopup(null, group, dataContext, false, null, 10), "getInstance().createActi…Context, false, null, 10)"); ListPopup popup = JBPopupFactory.getInstance().createActionGroupPopup(null, group, dataContext, false, null, 10); popup.show(new RelativePoint(comp, point)); }  }  } } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/core/chat/ui/list/AIAssistantChatListPanel$list$1$2", "Ljava/awt/event/MouseAdapter;", "mouseClicked", "", "e", "Ljava/awt/event/MouseEvent;", "intellij.ml.llm"}) public static final class AIAssistantChatListPanel$list$1$2 extends MouseAdapter {
/*     */     AIAssistantChatListPanel$list$1$2(JBList<ChatSession> jBList) {} public void mouseClicked(@NotNull MouseEvent e) { Intrinsics.checkNotNullParameter(e, "e"); if (e.getClickCount() == 2 && e.getButton() == 1) { AIAssistantChatListPanel.this.openSelectedChat(); Intrinsics.checkNotNullExpressionValue(this.$this_apply.getSelectedValue(), "selectedValue"); AIAssistantChatEventLogger.Companion.logChatOpened(AIAssistantChatListPanel.this.project, (ChatSession)this.$this_apply.getSelectedValue()); }  } } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/core/chat/ui/list/AIAssistantChatListPanel$list$1$keyListener$1", "Ljava/awt/event/KeyAdapter;", "keyPressed", "", "e", "Ljava/awt/event/KeyEvent;", "intellij.ml.llm"}) public static final class AIAssistantChatListPanel$list$1$keyListener$1 extends KeyAdapter {
/*     */     public void keyPressed(@NotNull KeyEvent e) { Intrinsics.checkNotNullParameter(e, "e"); if (e.getKeyCode() == 10) AIAssistantChatListPanel.this.openSelectedChat();  } }
/* 129 */   public final void updateModel() { this.list.setModel(createModel()); }
/*     */   
/*     */   private final DefaultListModel<ChatSession> createModel() {
/* 132 */     Iterable $this$sortedByDescending$iv = this.service.getAllChats(); int $i$f$sortedByDescending = 0; Intrinsics.checkNotNullExpressionValue(JBList.createDefaultListModel(
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 146 */           CollectionsKt.sortedWith($this$sortedByDescending$iv, new AIAssistantChatListPanel$createModel$$inlined$sortedByDescending$1())), "createDefaultListModel(s…cending { it.timestamp })"); return JBList.createDefaultListModel(CollectionsKt.sortedWith($this$sortedByDescending$iv, new AIAssistantChatListPanel$createModel$$inlined$sortedByDescending$1()));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object getData(@NotNull String dataId) {
/*     */     Intrinsics.checkNotNullParameter(dataId, "dataId");
/*     */     if (ChatList.is(dataId))
/*     */       return this; 
/*     */     return null;
/*     */   }
/*     */   
/*     */   private final void openSelectedChat() {
/*     */     ChatSession selectedItem = (ChatSession)this.list.getSelectedValue();
/*     */     int $i$a$-let-AIAssistantChatListPanel$openSelectedChat$1 = 0;
/*     */     this.focusedChatManager.focusChatSession(selectedItem);
/*     */     (ChatSession)this.list.getSelectedValue();
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/list/AIAssistantChatListPanel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */