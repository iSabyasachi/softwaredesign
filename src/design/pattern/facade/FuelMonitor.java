package design.pattern.facade;

public class FuelMonitor {
	double remainingFeulInGallons;
	

	public double getRemainingFeulInGallons() {		
		return remainingFeulInGallons;
	}


	public void setRemainingFeulInGallons(double remainingFeulInGallons) {
		this.remainingFeulInGallons = remainingFeulInGallons;
	}


	public void turnOff() {
		System.out.println("Fuel Monitor : Automatic mode turned Off!");
		
	}
	
	

}
