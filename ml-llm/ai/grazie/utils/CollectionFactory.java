/*    */ package ai.grazie.utils;
/*    */ import java.util.Map;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020%\n\002\020\b\n\002\b\006\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\030\020\003\032\016\022\004\022\0020\005\022\004\022\002H\0060\004\"\004\b\000\020\006J \020\003\032\016\022\004\022\0020\005\022\004\022\002H\0060\004\"\004\b\000\020\0062\006\020\007\032\0020\005J\030\020\b\032\016\022\004\022\002H\t\022\004\022\0020\0050\004\"\004\b\000\020\tJ \020\b\032\016\022\004\022\002H\t\022\004\022\0020\0050\004\"\004\b\000\020\t2\006\020\007\032\0020\005J\036\020\n\032\016\022\004\022\002H\t\022\004\022\002H\0060\004\"\004\b\000\020\t\"\004\b\001\020\006J&\020\n\032\016\022\004\022\002H\t\022\004\022\002H\0060\004\"\004\b\000\020\t\"\004\b\001\020\0062\006\020\007\032\0020\005¨\006\013"}, d2 = {"Lai/grazie/utils/CollectionFactory;", "", "()V", "smallMemoryFootprintIntKeyMap", "", "", "V", "expected", "smallMemoryFootprintIntValueMap", "K", "smallMemoryFootprintMap", "utils-common"})
/*    */ public final class CollectionFactory {
/*    */   @NotNull
/*    */   public final <K, V> Map<K, V> smallMemoryFootprintMap() {
/*  9 */     return (Map<K, V>)new Object2ObjectOpenHashMap();
/*    */   } @NotNull
/*    */   public static final CollectionFactory INSTANCE = new CollectionFactory(); @NotNull
/*    */   public final <K, V> Map<K, V> smallMemoryFootprintMap(int expected) {
/* 13 */     return (Map<K, V>)new Object2ObjectOpenHashMap(expected);
/*    */   }
/*    */   @NotNull
/*    */   public final <K> Map<K, Integer> smallMemoryFootprintIntValueMap() {
/* 17 */     return (Map<K, Integer>)new Object2IntOpenHashMap();
/*    */   }
/*    */   @NotNull
/*    */   public final <K> Map<K, Integer> smallMemoryFootprintIntValueMap(int expected) {
/* 21 */     return (Map<K, Integer>)new Object2IntOpenHashMap(expected);
/*    */   }
/*    */   @NotNull
/*    */   public final <V> Map<Integer, V> smallMemoryFootprintIntKeyMap() {
/* 25 */     return (Map<Integer, V>)new Int2ObjectOpenHashMap();
/*    */   }
/*    */   @NotNull
/*    */   public final <V> Map<Integer, V> smallMemoryFootprintIntKeyMap(int expected) {
/* 29 */     return (Map<Integer, V>)new Int2ObjectOpenHashMap(expected);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/CollectionFactory.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */