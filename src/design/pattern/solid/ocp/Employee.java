package design.pattern.solid.ocp;

public class Employee {
	
	private int id;
	private String name;	
	
	Employee(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public void printMe() {
		System.out.println("Employee ID is "+this.id + "Employee Name is " + this.name+".");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
