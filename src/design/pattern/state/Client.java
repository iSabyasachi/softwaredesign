package design.pattern.state;

/*
 * Formally, the pattern is defined as allowing an object to alter behavior when its internal 
 * state changes so that it appears to change its class.
 * 
 * et's take the case of our F-16 class. An instance of the class can be in various states. 
 * Some possible states and transitions to other states are listed below:
 * 
 * Current State -> Possible Transitions to Other States
 * Parked(pilotParks) -> Crash(pilotEjects) or Taxi(pilotTaxis)
 * Taxi(pilotTaxis) -> Airborne(pilotFlies) or Parked(pilotParks)
 * Airborne(pilotFlies) -> Crash(pilotEjects) or Land(pilotLands)
 * Land(pilotLands) -> Taxi(pilotTaxis)
 * Crash -> No transition out of this state
 * 
 * */
public class Client {
	
	public static void main(String[] args) {
		F16 f16 = new F16();
        f16.startsEngine();
        //f16.fliesPlane();
        //f16.ejectsPlane();
	}
	
}
