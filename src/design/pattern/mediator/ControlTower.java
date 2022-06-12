package design.pattern.mediator;

import java.util.ArrayList;
import java.util.List;

public class ControlTower extends Thread{
	String name;
	
	public ControlTower(String name) {
		super();
		this.name = name;
	}

	List<IAircraft> queuedForLanding = new ArrayList<>();
	
	// An aircraft just notifies the control tower that it wants to
    // land and doesn't coordinate with other aircraft
	synchronized public void requestToLand(IAircraft aircraft) {
        queuedForLanding.add(aircraft);
    }
	
	public void run() {		
		// perpetual loop
		while (true) {
			// inefficient busy wait till aircraft requests to land
			while(queuedForLanding.size() == 0);
			IAircraft aircraft;
			synchronized (this) {
				System.out.println(name+" is operating...");
                aircraft = queuedForLanding.remove(0);
            }
			// We have only one runway available so only allow a single
            // aircraft to land.
			aircraft.land();
		}
	}
}
