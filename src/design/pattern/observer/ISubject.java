package design.pattern.observer;

public interface ISubject {
	
	void addObserver(IObserver observer);

    void removeObserver(IObserver observer);

    void notifyObservers();
    
}
