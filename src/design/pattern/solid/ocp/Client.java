package design.pattern.solid.ocp;
/*
 * Open-Closed Principle :
 * Software components should be open for extension, but not for modification.
 * 
 * Open For Extension : We can extend and include extra functionalities in our code without altering or affecting
 * our existing implementation.
 * 
 * Closed for modification : After we add the extra functionality, we should not modify the existing implementation.
 * 
 * Using this principle separates the existing code from the modified code so it provides better stability, maintainability,
 * and minimizes changes as in your code.
 * */
public class Client {
	public static void main(String[] args) {
		Employee emp = new Employee(1, "ABC");
		emp.printMe();
		
		TrainedEmployee tEmp = new TrainedEmployee(1, "ABC", "New York");
		tEmp.printMe();
	}
}
