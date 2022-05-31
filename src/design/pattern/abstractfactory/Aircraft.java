package design.pattern.abstractfactory;

public class Aircraft {
	
	IEngine engine;
    ICockpit cockpit;
    IWings wings;
    IAircraftFactory aircraftFactory;
    
    public Aircraft(IAircraftFactory aircraftFactory) {
    	this.aircraftFactory = aircraftFactory;
    }
    
    
    protected Aircraft makeAircraft() {
    	engine = aircraftFactory.createEngine(); 
    	cockpit = aircraftFactory.createCockpit();
    	wings = aircraftFactory.createWings();
    	return this;
    }
    
    private void taxi() {
        System.out.println("Taxing on runway");
    }
    
    public void fly() {
        Aircraft aircraft = makeAircraft();
        engine.start();
        aircraft.taxi();
        System.out.println("Flying");
    }

}
