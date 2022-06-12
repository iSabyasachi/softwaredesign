package design.pattern.state;

public class F16 implements IAircraft{

	private ParkedState parkedState = new ParkedState(this);
    private CrashState crashState = new CrashState(this);
    private LandState landState = new LandState(this);
    private TaxiState taxiState = new TaxiState(this);
    private AirborneState airborneState = new AirborneState(this);
	
	IPilotActions state;
		
	public F16() {
        state = parkedState;
    }
	
	void startsEngine() {
        state.pilotTaxies(this);
    }
	
	void fliesPlane() {
        state.pilotFlies(this);
    }
	
	void landsPlane() {
        state.pilotLands(this);
    }
	
	void ejectsPlane() {
        state.pilotEjects(this);
    }
	
	void parksPlane() {
        state.pilotParks(this);
    }
	
	void setState(IPilotActions IPilotActions) {
        state = IPilotActions;
    }
	
	ParkedState getParkedState() {
        return parkedState;
    }
	
	CrashState getCrashState() {
        return crashState;
    }
	
	LandState getLandState() {
        return landState;
    }
	
	TaxiState getTaxiState() {
        return taxiState;
    }
	
	public AirborneState getAirborneState() {
        return airborneState;
    }

}
