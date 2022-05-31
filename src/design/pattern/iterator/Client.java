package design.pattern.iterator;
/*
 * An iterator is formally defined as a pattern that allows traversing the elements of an aggregate or a collection sequentially without exposing the underlying implementation.
 * */
public class Client {
	
	public static void main(String[] args) {
		
		AirForce airForce = new AirForce();
		
		Iterator jets = airForce.createJetsIterator();
		
		while (jets.hasNext()) {            
            IAircraft jet = jets.next();
            System.out.println("Jet is : "+jet);
        }
		/*
		Iterator allPlanes = airForce.createIterator();
		while (allPlanes.hasNext()) {
            IAircraft plane = allPlanes.next();
            System.out.println("Plane is : "+plane);
        }
        */
		
	}

}
