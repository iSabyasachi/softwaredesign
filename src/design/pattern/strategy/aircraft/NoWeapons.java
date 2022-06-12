package design.pattern.strategy.aircraft;

public class NoWeapons implements ArmingStrategy{

	@Override
	public void arming() {
		System.out.println("No Weapons!!!");		
	}

}
