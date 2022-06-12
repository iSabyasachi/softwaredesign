package design.pattern.facade;

public class NavigationSystem {	
	
	double direction;
	
	public void setDirectionBasedOnSpeedAndFeul(int engineSpeed, double remainingFeulInGallons) {
		//Logic for calculating direction.
		System.out.println("Direction is set into auto mode based on Engine Speed and Remaining Fuel in Gallons!");		
	}

	public void turnOff() {
		System.out.println("Navigation System : Automatic mode turned Off!");
		
	}
		
	

}
