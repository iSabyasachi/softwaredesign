package design.pattern.prototype;

import design.pattern.builder.Director;
import design.pattern.builder.F16;
import design.pattern.builder.F16Builder;
import design.pattern.builder.F16Engine;
import design.pattern.builder.IAircraft;
/*
 * Prototype pattern involves creating new objects by copying existing objects. The object whose copies are made is called the prototype.
 * */
public class Client {

	public static void main(String[] args) {
		//Build F16
		F16Builder f16Builder = new F16Builder();
		Director director = new Director(f16Builder);
		director.construct(false);
		
		IAircraft f16 = f16Builder.getResult();
		System.out.println(f16.toString());
		
		F16 f16Ins = (F16) f16;
		IAircraftPrototype prototype = f16Ins;
		
		IAircraftPrototype f16A = prototype.clone();
		f16A.setEngine(new F16Engine("F16FireA"));
		f16A.setName("A");
		System.out.println(f16A);
		f16A.fly();
		
		IAircraftPrototype f16B = prototype.clone();
		f16B.setEngine(new F16Engine("F16FireB"));
		f16B.setName("B");
		System.out.println(f16B);
		f16B.fly();
		
		

	}

}
