package design.pattern.command;
/*
 * Formally, the pattern is defined as representing an action or a request as an object that 
 * can then be passed to other objects as parameters, allowing parameterization of clients 
 * with requests or actions. The requests can be queued for later execution or logged. 
 * Logging requests enables undo operations.
 * 
 * Ex :
 * Going back to our aircraft example, imagine the cockpit of the Boeing-747. 
 * It has a multitude of instrument panels with knobs and buttons. 
 * For simplicity's sake let's say the plane has a button for the landing gear 
 * (the wheels of the aircraft), which allows the landing gear to be lowered or retracted. 
 * The button shouldn't need to know how the landing gear works, it just needs to know who 
 * has the knowledge to operate the landing gear. The who part will implement the Command 
 * interface and the button will know it needs to invoke the execute method on the who object.
 * 
 * Ex : java.lang.Runnable defines the interface implemented by classes whose instances are 
 * executed by threads.
 * */
public class Client {
	
	public static void main(String[] args) {
		LandingGear landingGear = new LandingGear();
        LandingGearDownCommand landingGearDownCommand = new LandingGearDownCommand(landingGear);
        LandingGearUpCommand landingGearUpCommand = new LandingGearUpCommand(landingGear);
        
        // Create the instrument panel
        InstrumentPanel instrumentPanel = new InstrumentPanel();
        
        // Assign the commands
        instrumentPanel.setCommand(0, landingGearDownCommand);
        instrumentPanel.setCommand(1, landingGearUpCommand);
        
        // Lower the landing gear
        instrumentPanel.lowerLandingGear();
        
        // Retract the landing gear
        instrumentPanel.retractLandingGear();
	}

}
