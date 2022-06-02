package design.pattern.template;

public class F16PreFlightCheckList extends AbstractPreFlightCheckList{

	@Override
	void checkAirPressure() {
		// Implement the custom logic for checking cockpit
        // air pressure for F-16
		System.out.println("Check Cockpit Airpressure.");		
	}
	
	protected boolean doorsLocked() {
		// F-16 unlike a Boeing-747 has no doors
        // so always return true;
		return true;
	}
}
