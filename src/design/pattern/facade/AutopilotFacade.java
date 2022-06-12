package design.pattern.facade;

public class AutopilotFacade {
	
	/*Make it SIngleton*/	
	private static AutopilotFacade newInstance;
	
	private AutopilotFacade() {
		
	}
	
	public static AutopilotFacade getInstance() {
		if(newInstance == null) {
			newInstance = new AutopilotFacade();
		}
		return newInstance;
	}
	
	private IAirCraft airCraft;	
	
	public void setAirCraft(IAirCraft airCraft) {
		this.airCraft = airCraft;
	}
	
	public void autopilotOn() {
		airCraft.autopilotOn();
    }
	
	public void autopilotOff() {
		airCraft.autopilotOff();
    }
}
