package design.pattern.strategy;

public class Context {
	
	ISort iSort;
	
	public Context(ISort iSort){
		this.iSort = iSort;
	};
	
	// Context receives the data from its client
    // and passes it on to the strategy object.
	public void sort(int[] numbers) {
		iSort.sort(numbers);		
	}

	// We can change the sorting algorithm using this setter    
	public void setiSort(ISort iSort) {
		this.iSort = iSort;
	}
	
	

}
