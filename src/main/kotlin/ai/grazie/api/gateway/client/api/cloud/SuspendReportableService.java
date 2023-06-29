package ai.grazie.api.gateway.client.api.cloud;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\000\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\002\b\003\bf\030\000*\b\b\000\020\001*\0020\0022\0020\003J\031\020\004\032\0020\0052\006\020\006\032\0028\000H¦@ø\001\000¢\006\002\020\007ø\001\001\002\n\n\002\b\031\n\004\b!0\001¨\006\bÀ\006\001"}, d2 = {"Lai/grazie/api/gateway/client/api/cloud/SuspendReportableService;", "T", "Lai/grazie/api/gateway/api/metrics/ReportData;", "", "report", "", "reportData", "(Lai/grazie/api/gateway/api/metrics/ReportData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api-gateway-client"})
public interface SuspendReportableService<T extends ai.grazie.api.gateway.api.metrics.ReportData> {
  @Nullable
  Object report(@NotNull T paramT, @NotNull Continuation<? super Unit> paramContinuation);
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/client/api/cloud/SuspendReportableService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */