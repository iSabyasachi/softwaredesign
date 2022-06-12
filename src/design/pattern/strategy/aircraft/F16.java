package design.pattern.strategy.aircraft;

public class F16 {
	ArmingStrategy armingStrategy;
	
	F16(ArmingStrategy armingStrategy){
		this.armingStrategy = armingStrategy;
	};
	
	
	public void arming() {
		armingStrategy.arming();
	}

}
