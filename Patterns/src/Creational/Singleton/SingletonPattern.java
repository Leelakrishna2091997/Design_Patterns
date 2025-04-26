package Creational.Singleton;

public class SingletonPattern {

    // singleton object at the class lvl, hence static is used
    private static SingletonPattern config;

    // private constructor cos no one should create the object

    private SingletonPattern() {}


    // get the global config object; if this is not static then in main method u can't access this
    // without the object Config.getConfigObject() like this...
    public static SingletonPattern getConfigObject() {

      // if config is null create one
      if(config == null) {
        config = new SingletonPattern();
      }

      return config;
    }


}
