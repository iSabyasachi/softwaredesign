package design.pattern.iterator;

import java.util.LinkedList;
import java.util.List;

public class AirForceIterator implements Iterator {
	
	List<IAircraft> jets;
    IAircraft[] helis;
    LinkedList<Boeing747> cargo;
    int jetsPosition = 0;
    int helisPosition = 0;
    int cargoPosition = 0;
    
    
	
	public AirForceIterator(AirForce airForce) {
		jets = airForce.getJets();
        helis = airForce.getHelis();
        cargo = airForce.getCargo();
	}

	@Override
	/**
     * We provide our own custom logic of returning aircraft in a
     * sequence. Note we are returning IAircraft interface object which
     * every plane in our airforce implements. We also design the function
     * to throw a runtime exception if next is invoked when no more elements
     * are left to iterate over
     */
	public IAircraft next() {
		// return helis first
        if (helisPosition < helis.length) {
            return helis[helisPosition++];
        }
        
        // return jets second
        if (jetsPosition < jets.size()) {
            return jets.get(jetsPosition++);
        }
        
        // return cargos last
        if (cargoPosition < cargo.size()) {
            return cargo.get(cargoPosition++);
        }
        
        throw new RuntimeException("No more elements");

	}

	@Override
	public boolean hasNext() {
		return helis.length > helisPosition ||
	               jets.size() > jetsPosition ||
	               cargo.size() > cargoPosition;
	}

}
