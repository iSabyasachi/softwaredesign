package design.pattern.abstractfactory;

public interface IAircraftFactory {
	
	IEngine createEngine();

    IWings createWings();

    ICockpit createCockpit();

}
