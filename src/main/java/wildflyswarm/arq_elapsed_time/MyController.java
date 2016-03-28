package wildflyswarm.arq_elapsed_time;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class MyController {

  @GET
  public String get() {
    return "Hello";
  }

}
