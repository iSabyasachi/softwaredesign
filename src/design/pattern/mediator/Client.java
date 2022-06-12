package design.pattern.mediator;
/*
 * Formally, the pattern is defined as encouraging loose coupling among interacting objects by 
 * encapsulating their interactions in a mediator object, thus avoiding the need for individual 
 * objects to refer to each other directly and allowing to vary object interactions independently.
 * 
 * Ex : java.util.Timer A facility for threads to schedule tasks for future execution in a 
 * background thread. Tasks may be scheduled for one-time execution, or for repeated execution at 
 * regular intervals.
 * */
public class Client {
	public static void main(String[] args){
		ControlTower controlTowerOne = new ControlTower("Control Tower One");
		ControlTower controlTowerTwo = new ControlTower("Control Tower Two");
		controlTowerOne.start();
		controlTowerTwo.start();
		
		F16 f16A = new F16("F16A", controlTowerOne);		
		f16A.requestControlTowerToLand();
		
		F16 f16C = new F16("f16C", controlTowerTwo);		
		f16C.requestControlTowerToLand();
		
		F16 f16B = new F16("F16B", controlTowerOne);
		f16B.requestControlTowerToLand();		
		
		F16 f16D = new F16("f16D", controlTowerTwo);
		f16D.requestControlTowerToLand();
	}
}
