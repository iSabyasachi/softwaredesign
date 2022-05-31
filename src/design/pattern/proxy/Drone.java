package design.pattern.proxy;

public class Drone implements IDrone{

	@Override
	public void turnLeft() {
		// receives the request and any method parameters
        // over the internet to turn the drone to its left.
	}

	@Override
	public void turnRight() {
		// receives the request and any method parameters
        // over the internet to turn the drone to its right.
	}

	@Override
	public void firstMissile() {
		// receives the request and any method parameters
        // over the internet to fire a missile
	}

}
