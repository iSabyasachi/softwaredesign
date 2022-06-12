package design.pattern.state;

public class ParkedState implements IPilotActions{

	F16 f16;
	
	public ParkedState(F16 f16) {
		this.f16 = f16;
	}
	
	@Override
	public void pilotTaxies(F16 f16) {
		f16.setState(f16.getTaxiState());
		
	}

	@Override
	public void pilotFlies(F16 f16) {
		f16.setState(f16.getCrashState());
		
	}

	@Override
	public void pilotEjects(F16 f16) {
		System.out.println("This is an invalid operation for this state");
		
	}

	@Override
	public void pilotLands(F16 f16) {
		System.out.println("This is an invalid operation for this state");
		
	}

	@Override
	public void pilotParks(F16 f16) {
		System.out.println("This is an invalid operation for this state");
		
	}

}
