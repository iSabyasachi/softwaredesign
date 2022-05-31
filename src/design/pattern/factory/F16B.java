package design.pattern.factory;

public class F16B extends F16{
	
	@Override
	public F16 makeF16() {
		System.out.println("Making F16B!!!");
		super.makeF16();
		engine = new F16Engine();
		return this;
	}

}
