/*    */ package ai.grazie.utils.cache;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J0\020\003\032\016\022\004\022\002H\005\022\004\022\002H\0060\004\"\b\b\000\020\005*\0020\001\"\b\b\001\020\006*\0020\0012\b\b\002\020\007\032\0020\bJ.\020\t\032\016\022\004\022\002H\013\022\004\022\002H\f0\n\"\b\b\000\020\013*\0020\001\"\b\b\001\020\f*\0020\0012\006\020\007\032\0020\bJ.\020\r\032\016\022\004\022\002H\013\022\004\022\002H\f0\016\"\b\b\000\020\013*\0020\001\"\b\b\001\020\f*\0020\0012\006\020\007\032\0020\b¨\006\017"}, d2 = {"Lai/grazie/utils/cache/Caching;", "", "()V", "default", "Lai/grazie/utils/cache/Cache;", "K", "V", "total", "", "immutable", "Lai/grazie/utils/cache/ImmutableCache;", "Key", "Value", "suspendable", "Lai/grazie/utils/cache/SuspendableCache;", "utils-common"})
/*    */ public final class Caching
/*    */ {
/*    */   @NotNull
/*    */   public static final Caching INSTANCE = new Caching();
/*    */   
/*    */   @NotNull
/*    */   public final <Key, Value> ImmutableCache<Key, Value> immutable(int total) {
/* 36 */     return new StandardImmutableCache<>(new CacheCondition.MaxItem<>(total), null, 2, null);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final <Key, Value> SuspendableCache<Key, Value> suspendable(int total) {
/* 41 */     return new StandardSuspendableCache<>(new CacheCondition.MaxItem<>(total));
/*    */   }
/*    */   @NotNull
/*    */   public final <K, V> Cache<K, V> default(int total) {
/* 45 */     return new StandardCache<>(new CacheCondition.MaxItem<>(total));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/cache/Caching.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */