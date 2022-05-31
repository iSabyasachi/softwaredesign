package design.pattern.prototype;

import design.pattern.builder.F16Engine;

public interface IAircraftPrototype {
	
	public void fly();
	
	IAircraftPrototype clone();
	
	void setEngine(F16Engine f16engine);
	
	void setName(String name);
	

}
