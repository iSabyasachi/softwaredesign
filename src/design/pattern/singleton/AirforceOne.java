package design.pattern.singleton;

public class AirforceOne {
	
	/*Threadsafe*/
	private static AirforceOne newInstance = new AirforceOne();
	
	private AirforceOne(){
		System.out.println("Airforce one has been built!!!");		
	}
	
	public void fly() {
		System.out.println("Airforce one is flying!!!");
	}
	/*synchronized : only one thread access at a time*/
	public static AirforceOne getInstance() {
		if(newInstance == null) {
			newInstance = new AirforceOne();
		}
		return newInstance;
	}
}
