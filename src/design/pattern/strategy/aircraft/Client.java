package design.pattern.strategy.aircraft;

public class Client {
	
	public static void main(String[] args) {
		F16 f16 = new F16(new NoWeapons());
		f16.arming();
		
		F16 f16A = new F16(new NuclearWeapons());
		f16A.arming();
		
		F16 f16B = new F16(new AirToAirWeapons());
		f16B.arming();
	}
}
