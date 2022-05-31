package design.pattern.abstractfactory;

public class F16Factory implements IAircraftFactory{
	
	@Override
	public IEngine createEngine() {
        return new F16Engine();
    }

	@Override
    public IWings createWings() {
        return new F16Wings();
    }

	@Override
    public ICockpit createCockpit() {
        return new F16Cockpit();
    }

}
