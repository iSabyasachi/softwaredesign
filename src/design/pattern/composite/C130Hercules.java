package design.pattern.composite;

public class C130Hercules implements IAircraft, IAlliancePart{
	@Override
    public int getPersonnel() {
		// This cargo plane, needs 5 people
        return 5;
    }
}
