package design.pattern.decorator;

public class Boeing747 implements IAircraft {

	@Override
	public void fly() {		
		System.out.println("Boeing-747 is flying ...");
	}

	@Override
	public void land() {
		System.out.println("Boeing-747 is landing ...");

	}

	@Override
	public float getWeight() {
		return baseWeight;
	}

}
