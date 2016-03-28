package wildflyswarm.arq_elapsed_time;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.wildfly.swarm.jaxrs.JAXRSArchive;

public class MyDeployment {

  public static JAXRSArchive createDeployment() throws Exception {
    JAXRSArchive deployment = ShrinkWrap.create(JAXRSArchive.class);
    deployment.addPackage(App.class.getPackage());

    deployment.addAllDependencies();

    return deployment;
  }
}
