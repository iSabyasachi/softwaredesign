package design.pattern.builder;

public class Boeing747Builder extends AircraftBuilder{
	
	Boeing747 boeing747;
	
	@Override
	public void buildEngine() {
		//get Boeing747 an Engine
		boeing747.engine = new Boeing747Engine("Boeing747Fire");
    }
	
	@Override
	public void buildWings() {
		//get Boeing747 Wings
		boeing747.wings = new Boeing747Wings("Boeing747Air");

    }
	
	@Override
	public void buildCockpit() {
		//get Boeing747 a Cock Pit
		boeing747 = new Boeing747();
		boeing747.cockpit = new Boeing747Cockpit("Boeing747Earh");

    }
	
	@Override
	public void buildBathrooms() {
		//get Boeing747 Bathrooms
		boeing747.bathroom = new Boeing747Bathroom("Boeing747Water");
    }
	
	@Override
	public IAircraft getResult() {		
		return boeing747;
	}

}
