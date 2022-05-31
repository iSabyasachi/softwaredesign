package design.pattern.abstractfactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;



/*
 * The abstract factory pattern is defined as defining an interface to create families of related 
 * or dependent objects without specifying their concrete classes.
 * 
 * One of the fundamental principles of good object orientated design is to hide the concrete classes 
 * and expose interfaces to clients.
 * 
 * Ex : If your IDE supports light and dark themes then it may use the abstract factory pattern to create 
 * widgets that belong to the light or dark theme just by varying the concrete factory that creates the widgets.
 * */
public class Client {

	public static void main(String[] args) {	
		F16Factory f16Factory = new F16Factory();
		Boeing747Factory boeing747Factory = new Boeing747Factory();
		
		Collection<Aircraft> myPlanes = new ArrayList<>();
		myPlanes.add(new Aircraft(f16Factory));
		myPlanes.add(new Aircraft(boeing747Factory));
		
		for(Aircraft myPlane : myPlanes) {
			myPlane.fly();
		}
		
	}

}
