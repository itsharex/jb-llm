/*    */ package ai.grazie.utils.cache;
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\000\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\002\n\002\b\005\n\002\030\002\n\002\b\007\b\000\030\000*\b\b\000\020\001*\0020\002*\b\b\001\020\003*\0020\0022\016\022\004\022\002H\001\022\004\022\002H\0030\004B\037\022\030\020\005\032\024\022\004\022\0028\000\022\n\022\b\022\004\022\0028\0010\0070\006¢\006\002\020\bJ\b\020\013\032\0020\fH\026J\027\020\r\032\004\030\0018\0012\006\020\016\032\0028\000H\026¢\006\002\020\017J#\020\020\032\0028\0012\006\020\016\032\0028\0002\f\020\021\032\b\022\004\022\0028\0010\022H\026¢\006\002\020\023J\025\020\024\032\0020\f2\006\020\016\032\0028\000H\026¢\006\002\020\025J\035\020\026\032\0020\f2\006\020\016\032\0028\0002\006\020\027\032\0028\001H\026¢\006\002\020\030R \020\005\032\024\022\004\022\0028\000\022\n\022\b\022\004\022\0028\0010\0070\006X\004¢\006\002\n\000R \020\t\032\024\022\004\022\0028\000\022\n\022\b\022\004\022\0028\0010\0070\nX\004¢\006\002\n\000¨\006\031"}, d2 = {"Lai/grazie/utils/cache/StandardCache;", "Key", "", "Value", "Lai/grazie/utils/cache/Cache;", "condition", "Lai/grazie/utils/cache/CacheCondition;", "Lai/grazie/utils/cache/CacheValue$WithTime;", "(Lai/grazie/utils/cache/CacheCondition;)V", "data", "Ljava/util/concurrent/ConcurrentHashMap;", "clear", "", "get", "key", "(Ljava/lang/Object;)Ljava/lang/Object;", "getOrPut", "loader", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "invalidate", "(Ljava/lang/Object;)V", "put", "value", "(Ljava/lang/Object;Ljava/lang/Object;)V", "utils-common"})
/*    */ @SourceDebugExtension({"SMAP\nStandardCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandardCache.kt\nai/grazie/utils/cache/StandardCache\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,45:1\n1855#2,2:46\n*S KotlinDebug\n*F\n+ 1 StandardCache.kt\nai/grazie/utils/cache/StandardCache\n*L\n18#1:46,2\n*E\n"})
/*    */ public final class StandardCache<Key, Value> implements Cache<Key, Value> { @NotNull
/*  5 */   private final CacheCondition<Key, CacheValue.WithTime<Value>> condition; public StandardCache(@NotNull CacheCondition<Key, CacheValue.WithTime<Value>> condition) { this.condition = condition;
/*    */     
/*  7 */     this.data = new ConcurrentHashMap<>(); } @NotNull
/*    */   private final ConcurrentHashMap<Key, CacheValue.WithTime<Value>> data; @Nullable
/*    */   public Value get(@NotNull Object key) {
/* 10 */     Intrinsics.checkNotNullParameter(key, "key"); synchronized (this) { int $i$a$-synchronized-StandardCache$get$1 = 0;
/* 11 */       (CacheValue.WithTime<Value>)this.data.get(key); Value value = ((CacheValue.WithTime<Value>)this.data.get(key) != null) ? ((CacheValue.WithTime<Value>)this.data.get(key)).getValue() : null; }
/*    */     
/*    */     return value;
/*    */   }
/*    */   public void put(@NotNull Object key, @NotNull Object value) {
/* 16 */     Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(value, "value"); synchronized (this) { int $i$a$-synchronized-StandardCache$put$1 = 0;
/* 17 */       Set<Key> toRemove = this.condition.toFilterOut(this.data, SetsKt.emptySet());
/* 18 */       Iterable<Key> $this$forEach$iv = toRemove; int $i$f$forEach = 0;
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
/* 46 */       Iterator<Key> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(), it = element$iv; int $i$a$-forEach-StandardCache$put$1$1 = 0;
/*    */         this.data.remove(it); }
/*    */       
/*    */       this.data.put((Key)key, new CacheValue.WithTime.Default<>(value, 0L, 2, null));
/*    */       Unit unit = Unit.INSTANCE; }
/*    */   
/*    */   }
/*    */   
/*    */   public void invalidate(@NotNull Object key) {
/*    */     Intrinsics.checkNotNullParameter(key, "key");
/*    */     synchronized (this) {
/*    */       int $i$a$-synchronized-StandardCache$invalidate$1 = 0;
/*    */       CacheValue.WithTime withTime = this.data.remove(key);
/*    */     } 
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Value getOrPut(@NotNull Object key, @NotNull Function0 loader) {
/*    */     Intrinsics.checkNotNullParameter(key, "key");
/*    */     Intrinsics.checkNotNullParameter(loader, "loader");
/*    */     synchronized (this) {
/*    */       int $i$a$-synchronized-StandardCache$getOrPut$1 = 0;
/*    */       Object value = get((Key)key);
/*    */       if (value == null)
/*    */         put((Key)key, (Value)loader.invoke()); 
/*    */       Intrinsics.checkNotNull(get((Key)key));
/*    */       $i$a$-synchronized-StandardCache$getOrPut$1 = get((Key)key);
/*    */     } 
/*    */     return $i$a$-synchronized-StandardCache$getOrPut$1;
/*    */   }
/*    */   
/*    */   public void clear() {
/*    */     synchronized (this) {
/*    */       int $i$a$-synchronized-StandardCache$clear$1 = 0;
/*    */       this.data.clear();
/*    */       Unit unit = Unit.INSTANCE;
/*    */     } 
/*    */   } }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/cache/StandardCache.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */