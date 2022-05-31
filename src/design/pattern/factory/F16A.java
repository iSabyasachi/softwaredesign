package design.pattern.factory;

public class F16A extends F16{
	
	@Override
	public F16 makeF16() {
		System.out.println("Making F16A!!!");
		super.makeF16();
		engine = new F16Engine();
		return this;
	}

}
