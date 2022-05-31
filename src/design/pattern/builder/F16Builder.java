package design.pattern.builder;

public class F16Builder extends AircraftBuilder{
	F16 f16;
	
	@Override
    public void buildEngine() {
        // get F-16 an engine
        f16.engine = new F16Engine("F16Fire");
    }
	
	@Override
    public void buildWings() {
        // get F-16 wings
        f16.wings = new F16Wings("F16Air");
    }
	
	@Override
    public void buildCockpit() {
        f16 = new F16();
        // get F-16 a cockpit
        f16.cockpit = new F16Cockpit("F16Earth");
    }	
	
	
	@Override
	public IAircraft getResult() {
		return f16;
	}

}
