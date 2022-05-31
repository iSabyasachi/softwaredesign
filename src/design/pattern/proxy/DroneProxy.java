package design.pattern.proxy;

public class DroneProxy implements IDrone{

	@Override
	public void turnLeft() {
		// forward request to the real drone to
        // turn left over the internet
	}

	@Override
	public void turnRight() {
		// forward request to the real drone to
        // turn right over the internet
	}

	@Override
	public void firstMissile() {
		// forward request to the real drone to
        // fire missile
	}

}
