package design.pattern.template;

/*
 * The template pattern is defined as allowing subclasses to define parts of an algorithm without 
 * modifying the overall structure of the algorithm.
 * 
 * Caveats: 
 * 1. Don't confuse the template method pattern with the strategy pattern. Strategy pattern 
 * uses composition by accepting objects that define the entire algorithm, whereas the template 
 * pattern method uses inheritance to vary parts of the algorithm by subclasses but the outline 
 * and structure of the algorithm is still the realm of the abstract class.
 * 
 * 2. Factory method pattern is a specialization of the template method pattern.
 * 
 * 3. Ideally, the number of methods for which the subclasses need to provide implementation should 
 * be minimized when applying the template method pattern.
 * */
public class Client {
	public static void main(String[] args) {		
		//F16 Checklist
		System.out.println("F-16 Starts");
		F16PreFlightCheckList f16CheckList = new F16PreFlightCheckList();
		f16CheckList.runChecklist();
		
		System.out.println("---");
		System.out.println("Boeing-747 Starts");
		//Boeing 747 Checklist
		Boeing747PreFlightCheckList boeing747CheckList = new Boeing747PreFlightCheckList();
		boeing747CheckList.runChecklist();
	}

}


