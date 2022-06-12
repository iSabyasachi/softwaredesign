package design.pattern.strategy;

/*
 * The strategy pattern is formally defined as encapsulating algorithms belonging to the same 
 * family and making them interchangeable. The consumers of the common interface that the 
 * algorithms implement allow switching out one algorithm for another seamlessly.
 * 
 * Ex: 
 * java.util.Comparator has the method compare which allows the user to define the algorithm or 
 * strategy to compare two objects of the same type.
 * 
 * Think how a text editor such as Microsoft Word can make use of the strategy pattern when a 
 * client chooses the paragraph alignment options. The strategies could be justify text, 
 * left-align, right-align or center-align.
 * 
 * The class diagram consists of the following entities

	Strategy
	Concrete Strategy
	Context
 * */

public class Client {	
	
	public static void main(String[] args) {
		int[] numbers = new int[1000]; 
		//Bubble Sort
		Context context = new Context(new BubbleSort());
		context.sort(numbers);
		
		//Quick Sort
		Context contextNew = new Context(new QuickSort());
		contextNew.sort(numbers);
		
	}

}
