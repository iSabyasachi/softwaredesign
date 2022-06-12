package design.pattern.facade;
/*
 * Facade pattern is defined as a single uber interface to one or more subsystems or interfaces 
 * intending to make use of the subsystems easier.
 * 
 * Ex:
 * Modern aircrafts have a feature called autopilot that allows the airplane to fly to its 
 * destination in an automated fashion without much interference from human pilots. 
 * The autopilot feature needs to juggle with all the subsystems and health-checks of the aircraft 
 * to ensure a smooth flight. It can hide away all the underlying complexity of automated flight 
 * from a pilot.
 * */
public class Client {
	public static void main(String[] args) {
		AutopilotFacade autopilotFacade = AutopilotFacade.getInstance();		
		Boeing747 boeing747 = new Boeing747();		
		autopilotFacade.setAirCraft(boeing747);
		autopilotFacade.autopilotOn();
		System.out.println("---");
		autopilotFacade.autopilotOff();
		
		
		
	}
}
