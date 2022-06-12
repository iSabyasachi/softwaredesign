package design.pattern.composite;

/*
 * This lesson discusses the composite pattern that lets us treat individual elements and 
 * group of elements as one.
 * 
 * Formally, the composite pattern is defined as composing objects into tree structures to 
 * represent part-whole hierarchies, thus letting clients uniformly treat individual objects 
 * and composition of objects.
 * 
 * Ex : An air force is primarily made up of several aircraft but it can also have sub-air forces. 
 * For instance, the US has the 1st Air Force, 2nd Air Force so on and so forth.
 * */
public class Client {
	public static void main(String[] args) {
		Airforce NatoAllaiance = new Airforce();
		
		// The nested methods aren't listed for brevity's sake
        NatoAllaiance.add(createCanadaAirForce());
        NatoAllaiance.add(createUSAAirForce());
        
        F16 frenchF16 = new F16();
        C130Hercules germanCargo = new C130Hercules();

        NatoAllaiance.add(frenchF16);
        NatoAllaiance.add(germanCargo);
        
        System.out.println(NatoAllaiance.getPersonnel());
        
        
        
	}

	private static IAlliancePart createUSAAirForce() {
		
		return new F16();
	}

	private static IAlliancePart createCanadaAirForce() {
		
		return new F16();
	}

}
