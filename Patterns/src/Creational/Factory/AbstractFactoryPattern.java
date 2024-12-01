package Creational.Factory;

public class AbstractFactoryPattern {


    interface Factory {

      ElectronicGadget produce(String name);
    }

  interface ElectronicGadget {

    void purpose();
  }

  class iPhone implements ElectronicGadget {

    @Override
    public void purpose() {
      System.out.println("I'll connect u with others who has apple phone.");
    }
  }


  class SamsungPhone implements ElectronicGadget {

    @Override
    public void purpose() {
      System.out.println("I'll connect u with others who has samsung phone.");
    }
  }


  class MacBook implements ElectronicGadget {

    @Override
    public void purpose() {
      System.out.println("I'll perform your tasks with mac OS");
    }
  }


  class WindowsLaptop implements ElectronicGadget {

    @Override
    public void purpose() {
      System.out.println("I'll perform your tasks with windows OS");
    }
  }

  class MicrosoftFactory implements Factory{


    @Override
    public ElectronicGadget produce(String name) {
      if(name == "laptop") return new WindowsLaptop();
      return null;
    }
  }


  class AppleFactory implements Factory{


    @Override
    public ElectronicGadget produce(String name) {
      if(name == "laptop") return new MacBook();
      else if(name == "phone") return new iPhone();
      return null;
    }
  }



  class SamsungFactory implements Factory{


    @Override
    public ElectronicGadget produce(String name) {
      if(name == "phone") return new SamsungPhone();
      return null;
    }
  }

  class SelectFactory {

      Factory getFactory(String name) {
        if(name == "apple") return new AppleFactory();
        else if(name == "microsoft") return new MicrosoftFactory();
        else if(name == "samsung") return new SamsungFactory();
        return null;
      }
  }



  void usage() {
    // Abstract Factory Pattern Usage

    // Select which factory to select
    Factory appleFactory = new SelectFactory().getFactory("apple");

    // Select which item to produce from factory
    ElectronicGadget gadget = appleFactory.produce("phone");
    gadget.purpose();
  }
}
