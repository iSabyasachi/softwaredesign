package design.pattern.visitor;

import java.util.Iterator;
/*
 * Formally, the pattern is defined as defining operations to be performed on elements of an object structure without changing the classes of the elements it works on.
 * */
public class Client {
	
	public static void main(String[] args) {
		Airforce airforce = new Airforce();
		
		Iterator<IAircraft> planes = airforce.getIterator();
		MetricsVisitor aircraftVisitor = new MetricsVisitor();
		
		while(planes.hasNext()) {
			planes.next().accept(aircraftVisitor);
		}
		
		aircraftVisitor.printAccumulatedResults();
	}

}
