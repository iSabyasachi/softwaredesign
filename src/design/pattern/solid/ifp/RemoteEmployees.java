package design.pattern.solid.ifp;

public class RemoteEmployees implements RemoteEmployee{

	@Override
	public boolean offerFlexibleHours() {		
		return true;
	}

	@Override
	public double getAllEmployeesSalaries() {		
		return 10000;
	}

	

}
