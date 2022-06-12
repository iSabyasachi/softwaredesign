package design.pattern.strategy.aircraft;

public class AirToAirWeapons implements ArmingStrategy{
	@Override
	public void arming() {
		System.out.println("AirToAir Waepons");		
	}
}
