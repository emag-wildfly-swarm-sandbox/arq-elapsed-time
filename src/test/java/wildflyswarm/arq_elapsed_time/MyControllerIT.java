package wildflyswarm.arq_elapsed_time;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.wildfly.swarm.jaxrs.JAXRSArchive;

@RunWith(Arquillian.class)
public class MyControllerIT {

  @Deployment(testable = false)
  public static JAXRSArchive createDeployment() throws Exception {
    return MyDeployment.createDeployment();
  }

  @Test
  public void doNothing() throws Exception {}

}
