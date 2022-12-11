package design.pattern.solid.lsp;

public class TrainedEmployee extends Employee{
	
	private String trainingLocation;
	
	TrainedEmployee(int id, String name, String trainingLocation) {
		super(id, name);
		this.trainingLocation = trainingLocation;
	}
	
	public String getTrainingLocation() {
		return trainingLocation;
	}

	public void setTrainingLocation(String trainingLocation) {
		this.trainingLocation = trainingLocation;
	}
	
	public void printMe() {
		System.out.println("Employee ID is "+this.getId() + "Employee Name is " + this.getName()+ "Employee Location is " + this.getTrainingLocation()+".");
	}
	
	
}
