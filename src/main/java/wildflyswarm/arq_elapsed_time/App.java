package wildflyswarm.arq_elapsed_time;

import org.wildfly.swarm.container.Container;

public class App {

  public static void main(String[] args) throws Exception {
    new Container()
      .start()
      .deploy(MyDeployment.createDeployment());
  }

}
