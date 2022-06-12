package design.pattern.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Airforce implements IAlliancePart{
	ArrayList<IAlliancePart> planes = new ArrayList<>();

    public void add(IAlliancePart alliancePart) {
        planes.add(alliancePart);
    }

	@Override
	public int getPersonnel() {
		// We iterator over the entire air force which can
        // contain leaf nodes (planes) or other composites
        // (air forces). This iteration is an example of an
        // internal iterator.
		Iterator<IAlliancePart> itr = planes.iterator();
        int staff = 0;
        while (itr.hasNext()) {
            staff += itr.next().getPersonnel();
        }
        
		return staff;
	}
}
