package design.pattern.decorator;

public class BulletProof extends BoeingDecorator{
	IAircraft boeing747;
	
	public BulletProof(IAircraft boeing747){
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
		
		return (50f + boeing747.getWeight());
	}
}
