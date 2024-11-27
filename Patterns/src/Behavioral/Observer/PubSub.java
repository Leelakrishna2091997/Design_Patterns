package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class PubSub {

  class DataObject {

  }
  interface Publisher<T> {

    // adds an observer to the data object
    void addObserver(Subscriber sb);

    // delete an observer to the data object
    void deleteObserver(Subscriber sb);

    // sets a new value and sends notification to all subscribers
    void updateValue(T db);

    void notifyAllSubscribers();

    T getValue();
  }

  interface Subscriber {

    // method that executes when a change has been identified.
    void update();
  }

  class PublisherImpl<E> implements Publisher<E>{

    List<Subscriber> allSubs = new ArrayList<>();
    E objectValue;

    @Override
    public void addObserver(Subscriber sb) {
      // adds a subs to allSubs
    }

    @Override
    public void deleteObserver(Subscriber sb) {
      // removes a subs from allSubs
    }

    @Override
    public E getValue() {
      return this.objectValue;
    }

    @Override
    public void updateValue(E db) {

      // update with new item;
      objectValue = db;

      // if its new object by checking with previous state, notify all
      notifyAllSubscribers();

    }



    @Override
    public void notifyAllSubscribers() {

      // run all update methods for each subscriber
      for(Subscriber each: allSubs) {
        each.update();
      }
    }
  }

  class SubscriberImpl implements Subscriber {

    // composition of Publisher
    Publisher pb;

    public SubscriberImpl(Publisher pb) {
      this.pb = pb;
    }

    @Override
    public void update() {
      this.pb.getValue();
    }
  }
}
