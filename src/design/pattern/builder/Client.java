package design.pattern.builder;

/*
 * Formally, a builder pattern encapsulates or hides the process of building a complex object and separates the representation of the object and its construction. 
 * The separation allows us to construct different representations using the same construction process. In Java speak, different representations implies creating 
 * objects of different classes that may share the same construction process.
 * */
public class Client {
	
	public static void main(String[] args) {
		
		//Build F16
		F16Builder f16Builder = new F16Builder();
		Director director = new Director(f16Builder);
		director.construct(false);
		
		IAircraft f16 = f16Builder.getResult();
		System.out.println(f16.toString());
		
		//Build Boeing747
		Boeing747Builder boeing747Builder = new Boeing747Builder();
		director = new Director(boeing747Builder);
		director.construct(true);
		
		IAircraft boeing747 = boeing747Builder.getResult();
		System.out.println(boeing747.toString());
		
	}

}
