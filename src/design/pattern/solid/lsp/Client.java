package design.pattern.solid.lsp;

/*
 * Liskov Substitution Principle :
 * Objects of a superclass should be replaceable with objects of its subclasses without breaking the system.
 * 
 * This avoids misusing inheritance.
 * It helps us conform to the "is a relationship"
 * We can also say that subclasses must fulfill a contract defined by the base class.
 * 
 * Wrongly implementing it can prove real world objects wrong like "Square is a Rectangle"
 * */
public class Client {
	public static void main(String[] args) {
		Client client = new Client();
		
		Employee emp = new Employee(1, "ABC");	
		client.printMe(emp);
		
		TrainedEmployee tEmp = new TrainedEmployee(1, "ABC", "New York");
		client.printMe(tEmp);
		
	}
	
	public void printMe(Employee emp) {
		emp.printMe();
	}
}
