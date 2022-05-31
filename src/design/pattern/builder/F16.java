package design.pattern.builder;

import design.pattern.prototype.IAircraftPrototype;

public class F16 implements IAircraft,IAircraftPrototype{
	
	String name;
	F16Engine engine;
	F16Wings wings;
	F16Cockpit cockpit;
	
	
	
	public F16() {
		super();
	}

	public F16(F16Wings wings, F16Cockpit cockpit) {
		super();
		this.wings = wings;
		this.cockpit = cockpit;
	}
	

	public String getName() {
		return name == null ? "" : name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public F16Engine getEngine() {
		return engine;
	}

	public void setEngine(F16Engine engine) {
		this.engine = engine;
	}

	public F16Wings getWings() {
		return wings;
	}

	public void setWings(F16Wings wings) {
		this.wings = wings;
	}

	public F16Cockpit getCockpit() {
		return cockpit;
	}

	public void setCockpit(F16Cockpit cockpit) {
		this.cockpit = cockpit;
	}
	

	@Override
	public IAircraft getResult() {
		return new F16();
	}

	@Override
	public String toString() {
		return "A new F16"+this.getName()+" with "+engine.getName()+" engine, "+wings.getName()+" wings, "+cockpit.getName()+" cockpit has been built successfully!!!";
	}

	@Override
	public void fly() {
		System.out.println("F16 is flying!!!");
		
	}

	@Override
	public IAircraftPrototype clone() {
		
		return new F16(this.wings, this.cockpit);
	}
	
	

}
