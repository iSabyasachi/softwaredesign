package design.pattern.iterator;

import java.util.List;

public class JetsIterator implements Iterator {
	
	List<IAircraft> jets;
	int jetsPosition = 0;
	
	public JetsIterator(List<IAircraft> jets) {
		this.jets = jets;
	}
	
	@Override
	public IAircraft next() {
		 // return jets second
        if (jetsPosition < jets.size()) {
            return jets.get(jetsPosition++);
        }
        
        throw new RuntimeException("No more elements");

	}

	@Override
	public boolean hasNext() {
		return jets.size() > jetsPosition;
	               
	}

}
