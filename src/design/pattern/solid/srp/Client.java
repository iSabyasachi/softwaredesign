package design.pattern.solid.srp;

/*
 * Single Responsibility Principle :
 * Each class should be responsible for a single part or functionality of the system.
 * */
public class Client {
	
	public static void main(String[] args) {
		Employee emp = new Employee(1, "Sam");
		emp.printMe();
	}

}
