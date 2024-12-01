package Creational.Factory;

public class FactoryPattern {

    interface Vegetable {

      void hasVitamins();
    }

    class Onion implements Vegetable {

      @Override
      public void hasVitamins() {
        System.out.println("I'm rich in sulphur");
      }
    }

    class Tomato implements Vegetable {

      @Override
      public void hasVitamins() {
        System.out.println("I'm rich in iron.");
      }
    }

    class VegetableFactory {

      // Conditional creation wrt the product.
      Vegetable produce(String name) {

        if(name == "Tomato") return new Tomato();
        else if (name == "Onion") return new Onion();
        else return null;
      }

    }

    void usage() {
      // Factory Pattern Usage
      VegetableFactory vf = new VegetableFactory();

      // Select which item to produce from the factory
      Vegetable v = vf.produce("Tomato");
    }
}
