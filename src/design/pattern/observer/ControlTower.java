package design.pattern.observer;

import java.util.ArrayList;
import java.util.Collection;

/*We create a control tower class which acts as a publisher for all aircraft.*/
public class ControlTower implements ISubject{
	
	// The ControlTower maintains a list of
    Collection<IObserver> observers = new ArrayList<>();
	
	@Override
	public void addObserver(IObserver observer) {
		observers.add(observer);
		
	}

	@Override
	public void removeObserver(IObserver observer) {
		// Logic to remove the observer goes in here
		observers.remove(observer);
		
	}

	@Override
	public void notifyObservers() {
		for (IObserver observer : observers) {
            // We are passing null for state here but we
            // could pass 'this' the subject itself or a
            // type representing the state. These two options
            // represent the Pull vs Push models
            observer.update(this);
        }
		
	}
	
	/**
     * This is hypothetical function that runs perptually, gathering
     * runway and weather conditions and notifying all observers of
     * them periodically.
     */
	public void run() {

        while (true) {
            // get new runway/weather conditions and update observers
            // every five minutes
            // Thread.sleep(1000 * 60 * 5)
            notifyObservers();
        }
    }

}
