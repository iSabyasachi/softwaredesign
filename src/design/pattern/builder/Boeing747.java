package design.pattern.builder;

public class Boeing747 implements IAircraft{
	
	Boeing747Engine engine;
	Boeing747Wings wings;
	Boeing747Cockpit cockpit;
	Boeing747Bathroom bathroom;

	public Boeing747Engine getEngine() {
		return engine;
	}

	public void setEngine(Boeing747Engine engine) {
		this.engine = engine;
	}

	public Boeing747Wings getWings() {
		return wings;
	}

	public void setWings(Boeing747Wings wings) {
		this.wings = wings;
	}

	public Boeing747Cockpit getCockpit() {
		return cockpit;
	}

	public void setCockpit(Boeing747Cockpit cockpit) {
		this.cockpit = cockpit;
	}	
	

	public Boeing747Bathroom getBathroom() {
		return bathroom;
	}

	public void setBathroom(Boeing747Bathroom bathroom) {
		this.bathroom = bathroom;
	}

	@Override
	public IAircraft getResult() {		
		return new Boeing747();
	}

	@Override
	public String toString() {
		return "A new Boeing747 with "+engine.getName()+" engine, "+wings.getName()+" wings, "+cockpit.getName()+" cockpit, "+bathroom.getName()+" bathroom has been built successfully!!!";
	}

}
