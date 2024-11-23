package Behavioral.Strategy.WithStrategy;

// Strategy interface
interface DrivingStrategy {
  void drive();
}

// Concrete strategies
class RoadStrategy implements DrivingStrategy {
  public void drive() {
    System.out.println("Driving on the road.");
  }
}

class WaterStrategy implements DrivingStrategy {
  public void drive() {
    System.out.println("Sailing on the water.");
  }
}

// Context class
class Vehicle {
  private DrivingStrategy strategy; // Composition

  public Vehicle(DrivingStrategy strategy) {
    this.strategy = strategy;
  }

  public void setStrategy(DrivingStrategy strategy) {
    this.strategy = strategy;
  }

  public void drive() {
    strategy.drive();
  }
}

