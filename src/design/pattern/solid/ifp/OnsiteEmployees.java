package design.pattern.solid.ifp;

public class OnsiteEmployees implements OnsiteEmployee{

	@Override
	public double getAllEmployeesSalaries() {		
		return 20000;
	}

	@Override
	public boolean offerConstantHours() {		
		return true;
	}

	

}
