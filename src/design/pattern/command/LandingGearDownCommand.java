package design.pattern.command;

public class LandingGearDownCommand implements Command{
	
	// This is called the receiver of the request and
    // actually has the logic to perform the action
    LandingGear landingGear;
    
    public LandingGearDownCommand(LandingGear landingGear){
    	this.landingGear = landingGear;
    };
	
	@Override
	public void execute() {
		landingGear.down();
		
	}

}
