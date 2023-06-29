/*   */ package ai.grazie.utils.mpp.time;
/*   */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\032\025\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\004H\002\032\n\020\005\032\0020\004*\0020\001¨\006\006"}, d2 = {"invoke", "Lai/grazie/utils/mpp/time/Timestamp;", "Lai/grazie/utils/mpp/time/Timestamp$Companion;", "date", "Ljava/util/Date;", "toDate", "utils-common"})
/*   */ public final class TimestampKt {
/*   */   @NotNull
/* 5 */   public static final Date toDate(@NotNull Timestamp $this$toDate) { Intrinsics.checkNotNullParameter($this$toDate, "<this>"); return new Date($this$toDate.getMillis()); } @NotNull
/*   */   public static final Timestamp invoke(@NotNull Timestamp.Companion $this$invoke, @NotNull Date date) {
/* 7 */     Intrinsics.checkNotNullParameter($this$invoke, "<this>"); Intrinsics.checkNotNullParameter(date, "date"); return new Timestamp(date.getTime());
/*   */   }
/*   */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/mpp/time/TimestampKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */