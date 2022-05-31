package design.pattern.observer;
/*
 * The F-16 class would implement the IObservable as objects of the F-16 class would want updates from 
 * the ControlTower class.
 * */
public class F16 implements IObserver, IAircraft{
	
	ISubject observable;
	
	public F16(ISubject observable){
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void fly() {
		System.out.println("F16 is flying ...");		
	}
	
	@Override
	public void land() {
		System.out.println("F16 is landing ...");	
		
	}

	@Override
	public void update(Object newState) {
		// Take appropriate action based on newState
		
	}

}
