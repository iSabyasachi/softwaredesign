package design.pattern.adapter;
public class Adapter implements IAircraft{
	
	HotAirBalloon hotAirBalloon;
	
	Adapter(HotAirBalloon hotAirBalloon){
		this.hotAirBalloon = hotAirBalloon;
	}
	

	@Override
	public void fly() {
		String fuelUsed = hotAirBalloon.inflateWithGas();
		hotAirBalloon.fly(fuelUsed);
	}

	

}
