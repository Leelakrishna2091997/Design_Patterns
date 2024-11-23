package Behavioral.Strategy.WithoutStrategy;

class Vehicle0 {
  void drive() {
    System.out.println("I can drive and i'll be overridden.");
  }
}

class Car extends Vehicle0 {
  void drive() {
    System.out.println("Driving on the road.");
  }
}

class AmphibiousVehicle extends Vehicle0 {
  void drive() {
    System.out.println("Driving on the road and water.");
  }
}


