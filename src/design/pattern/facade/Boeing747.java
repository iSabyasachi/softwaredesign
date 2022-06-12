package design.pattern.facade;

public class Boeing747 implements IAirCraft{
	
	private AltitudeMonitor altitudeMonitor;
	private EngineController engineController;
	private FuelMonitor feulMonitor;
	private NavigationSystem navigationSystem;
	
	public Boeing747() {
		initiateBoeing747();
	}
	
	private void initiateBoeing747(){
		altitudeMonitor = new AltitudeMonitor();
		engineController = new EngineController();
		feulMonitor = new FuelMonitor();
		navigationSystem = new NavigationSystem();
	}
	
	public AltitudeMonitor getAltitudeMonitor() {
		return altitudeMonitor;
	}
	public void setAltitudeMonitor(AltitudeMonitor altitudeMonitor) {
		this.altitudeMonitor = altitudeMonitor;
	}
	public EngineController getEngineController() {
		return engineController;
	}
	public void setEngineController(EngineController engineController) {
		this.engineController = engineController;
	}
	public FuelMonitor getFeulMonitor() {
		return feulMonitor;
	}
	public void setFeulMonitor(FuelMonitor feulMonitor) {
		this.feulMonitor = feulMonitor;
	}
	public NavigationSystem getNavigationSystem() {
		return navigationSystem;
	}
	public void setNavigationSystem(NavigationSystem navigationSystem) {
		this.navigationSystem = navigationSystem;
	}
	
	public void autopilotOn() {
		this.altitudeMonitor.autoMonitor();
        this.engineController.setEngineSpeed(700);
        this.navigationSystem.setDirectionBasedOnSpeedAndFeul(
                this.engineController.getEngineSpeed(),
                this.feulMonitor.getRemainingFeulInGallons());
    }
	
	public void autopilotOff() {
		this.altitudeMonitor.turnOff();
		this.engineController.turnOff();
		this.navigationSystem.turnOff();
		this.feulMonitor.turnOff();
    }

}
