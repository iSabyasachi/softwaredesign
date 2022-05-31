package design.pattern.decorator;

public class LuxuryFittings extends BoeingDecorator{
	
	IAircraft boeing747;
	
	public LuxuryFittings(IAircraft boeing747){
		this.boeing747 = boeing747;
	}
	
	@Override
	public void fly() {
		boeing747.fly();
		
	}

	@Override
	public void land() {
		boeing747.land();
		
	}

	@Override
	public float getWeight() {
		
		return (30.5f + boeing747.getWeight());
	}

}
