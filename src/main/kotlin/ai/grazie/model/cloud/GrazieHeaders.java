package ai.grazie.model.cloud;

import ai.grazie.annotation.TestOnly;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\002\b\006\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\016\020\003\032\0020\004XT¢\006\002\n\000R\016\020\005\032\0020\004XT¢\006\002\n\000R\026\020\006\032\0020\0048\006XT¢\006\b\n\000\022\004\b\007\020\002R\016\020\b\032\0020\004XT¢\006\002\n\000R\016\020\t\032\0020\004XT¢\006\002\n\000¨\006\n"}, d2 = {"Lai/grazie/model/cloud/GrazieHeaders;", "", "()V", "AGENT", "", "AUTH_TOKEN", "FORCE_HTTP_ERROR", "getFORCE_HTTP_ERROR$annotations", "ORIGINAL_SERVICE_TOKEN", "ORIGINAL_USER_TOKEN", "model-cloud"})
public final class GrazieHeaders {
  @NotNull
  public static final GrazieHeaders INSTANCE = new GrazieHeaders();
  
  @NotNull
  public static final String AUTH_TOKEN = "Grazie-Authenticate-JWT";
  
  @NotNull
  public static final String ORIGINAL_USER_TOKEN = "Grazie-Original-User-JWT";
  
  @NotNull
  public static final String ORIGINAL_SERVICE_TOKEN = "Grazie-Original-Service-JWT";
  
  @NotNull
  public static final String AGENT = "Grazie-Agent";
  
  @NotNull
  public static final String FORCE_HTTP_ERROR = "Grazie-Force-HTTP-Error";
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/cloud/GrazieHeaders.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */