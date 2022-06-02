package design.pattern.template;

public abstract class AbstractPreFlightCheckList {
	
	// This method captures the template or the skeleton
    // of the algorithm for the pre-flight checklist.
	final public void runChecklist() {
		
		// Check fuel guage
        IsFuelEnough();
        
        // Check doors are locked
        System.out.println("Is door Locked ? "+doorsLocked());
        
        // Check air pressure
        checkAirPressure();
	}
	
	// Don't let subclasses override this method, this is a
    // mandatory check
	final protected void IsFuelEnough() {
        System.out.println("check fuel gauge");
    }
	
	// Some airplanes may or may not have doors so allow this
    // method to be overridden by subclasses
	protected boolean doorsLocked() {
		return true;
	}
	
	// Force subclasses to provide their own way of checking for
    // cabin or cockpit air pressure
	abstract void checkAirPressure();
	
}
