package design.pattern.template;

public class Boeing747PreFlightCheckList extends AbstractPreFlightCheckList{
	@Override
	void checkAirPressure() {
		// Implement the custom logic for checking Cabin
        // air pressure for Boeing-747
		System.out.println("Check Cabin Airpressure.");		
	}
	
	protected boolean doorsLocked() {
		// Boeing-747 has doors
        // so check if the door closed;
		return false;
	}
}
