package Creational.Singleton;

public class SingletonMain {

  class StagingConfig {

    private static void getConfig() {
      System.out.println("Gets staging configuration");
    }
  }


  class StagingConfigV2 extends StagingConfig{

    private static void getConfig() {
      System.out.println("Gets staging v2 configuration");
    }
  }

  public void main(String[] args) {

    // the static method call is based on reference not on object
    // v1 config will be returned
    StagingConfig c1 = new StagingConfig();
    c1.getConfig();

    // v2 config will be returned
    StagingConfigV2 c2 = new StagingConfigV2();
    c2.getConfig();

    // v1 config will be returned
    StagingConfig c3 = new StagingConfigV2();
    c3.getConfig();


  }

}
