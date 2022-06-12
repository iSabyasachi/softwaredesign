package design.pattern.facade;

public class EngineController {
	int engineSpeed;
	
	public int getEngineSpeed() {
		return engineSpeed;
	}

	public void setEngineSpeed(int engineSpeed) {		
		this.engineSpeed = engineSpeed;
	}

	public void turnOff() {
		System.out.println("Engine Controller : Automatic mode turned Off!");
		
	}

}
