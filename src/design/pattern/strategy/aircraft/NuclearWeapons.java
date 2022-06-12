package design.pattern.strategy.aircraft;

public class NuclearWeapons implements ArmingStrategy{
	@Override
	public void arming() {
		System.out.println("Nuclear Waepons");		
	}
}
