package Structural.Decorator;

// base class for the pizza
abstract class BasePizza {

  // gets the cost of the pizza
  abstract int cost();

}


// a customizable decorator class for the pizza -> is_a, has_a relationship
abstract class DecoratorCustomPizza extends BasePizza {

  // composition object
  BasePizza pizza;


  public DecoratorCustomPizza(BasePizza base) {
    pizza = base;
  }
}

// new type of base pizza
class Margharitta extends BasePizza {

  final int MARG = 100;

  @Override
  int cost() {
    return MARG;
  }
}

// A mushroom topping pizza
class MushroomToppingPizza extends DecoratorCustomPizza {

  final int MUSHROOM_COST = 500;

  // setting the local member similar to autowired => Dependency injection
  MushroomToppingPizza(BasePizza base) {
    super(base);
  }

  @Override
  int cost() {
    return pizza.cost() + MUSHROOM_COST;
  }
}


// A Cheese topping pizza
class ExtraCheeseToppingPizza extends DecoratorCustomPizza {

  final int CHEESE_COST = 300;

  // setting the local member similar to autowired => Dependency injection
  ExtraCheeseToppingPizza(BasePizza base) {
    super(base);
  }

  @Override
  int cost() {
    return pizza.cost() + CHEESE_COST;
  }
}


public class BaseClass {

  // get me a mushroom pizza with extra cheese
  BasePizza base = new Margharitta();

  // add mushroom topping
  BasePizza mushPizza = new MushroomToppingPizza(base);

  // add extra cheese
  BasePizza extraCheeseMushPizza = new ExtraCheeseToppingPizza(mushPizza);

  void getCost() {

    // gets the cost of pizza i.e marg + mush + cheese i.e 900
    extraCheeseMushPizza.cost();
  }

}
