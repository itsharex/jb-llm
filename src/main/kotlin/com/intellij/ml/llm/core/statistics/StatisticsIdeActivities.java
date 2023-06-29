package com.intellij.ml.llm.core.statistics;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bf\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H&J\b\020\006\032\0020\003H&ø\001\000\002\006\n\004\b!0\001¨\006\007À\006\001"}, d2 = {"Lcom/intellij/ml/llm/core/statistics/StatisticsIdeActivities;", "", "scored", "", "result", "Lcom/intellij/ml/llm/core/statistics/ScoreResult;", "shown", "intellij.ml.llm"})
public interface StatisticsIdeActivities {
  void shown();
  
  void scored(@NotNull ScoreResult paramScoreResult);
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/statistics/StatisticsIdeActivities.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */