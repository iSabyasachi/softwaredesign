package design.pattern.factory;

public class F16 {
	IEngine engine;
	ICockpit cockpit;
	
	/*Factory Method*/
	protected F16 makeF16() {
		System.out.println("Making F16!!!");
		engine = new F16Engine();
		cockpit = new F16Cockpit();
		return this;
	}
	
	public void taxi() {
        System.out.println("F16 is taxing on the runway !");
    }
	
	public void fly() {
		F16 f16 = makeF16();
		f16.taxi();
		System.out.println("F16 is in the air !");
	}
	
}
