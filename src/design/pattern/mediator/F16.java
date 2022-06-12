package design.pattern.mediator;

public class F16 implements IAircraft{
	
	ControlTower controlTower;
	String name;
	
	public F16(String name, ControlTower controlTower) {        
        this.name = name;
        this.controlTower = controlTower;
    }
	
	@Override
	public void land() {
		System.out.println(name+" is landing...");		
	}
	
	public void requestControlTowerToLand() {
        controlTower.requestToLand(this);
    }

}
