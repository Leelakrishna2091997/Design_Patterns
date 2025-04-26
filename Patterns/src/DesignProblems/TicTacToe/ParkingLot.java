package DesignProblems.TicTacToe;

import java.util.List;
import java.util.Map;

// Abstracts away the exposure of concrete implementations of the class, only
// provides the factory methods
class Vehicle {
  String number;
  VehicleType type;
  public Vehicle(String name, VehicleType type) {
    number = name;
    type = type;
  }
}

class VehicleFactory {
  public static Vehicle createVehicle(String name) {
    return null;
  }
}

class Car extends Vehicle {
  public Car(String name) {
    super(name, VehicleType.Car);
  }
}
class Bike extends Vehicle {
  public Bike(String name) {
    super(name, VehicleType.Bike);
  }
}

enum VehicleType {
  Car, Bike
}

class ParkingSpot {
  private final String spotID;
  private Vehicle parkedVehicle;
  private VehicleType type;

  public ParkingSpot(String id, VehicleType type) {
    spotID = id;
    type = type;
  }

  public void park(Vehicle vh) {
    parkedVehicle = vh;
  }

  public void unPark() {
    parkedVehicle = null;
  }

}

class ParkingFloor {
  private List<ParkingSpot> spots;
  private Map<Vehicle, Integer> floorAvailabilityMap;

  public ParkingFloor(Map<Vehicle, Integer> floorMap) {

    // according to floorMap create spots and set map availability
    for(Vehicle each: floorMap.keySet()) {
      floorAvailabilityMap.put(each, floorMap.get(each));
      for(int i = 0; i < floorMap.get(each); i++) {
        spots.add(new ParkingSpot("random", each.type));
      }
    }

  }

  public void addParkingSpot(ParkingSpot parkSpot) {

    // add to list
    // update the availability map

  }
  public void blockParkingSpot(ParkingSpot parkSpot) {

    // add to list
    // update the availability map

  }




}

interface ParkingStrategy {
  boolean parkVehicle(List<ParkingFloor> floors);
}

class NearestParkingStrategy implements ParkingStrategy {
  public boolean parkVehicle(List<ParkingFloor> floors) {

    for(ParkingFloor each: floors) {
      // try to park at any of the floor
      return true;
    }
    return false;
  }
}

public class ParkingLot {

  List<ParkingFloor> parkFloors;
  ParkingStrategy parkStrategy;

  ParkingLot(int floors, ParkingStrategy strategy) {
    parkStrategy = strategy;

  }

  public void addFloor(ParkingFloor parkFloor) {
    parkFloors.add(parkFloor);
  }

  public boolean parkVehicle(Vehicle vh) {
    return parkStrategy.parkVehicle(parkFloors);

  }

}
