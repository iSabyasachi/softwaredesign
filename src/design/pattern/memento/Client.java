package design.pattern.memento;

import java.io.IOException;

/*
 * The literal meaning of memento is an object kept as a reminder or souvenir of a person or 
 * an event. The memento pattern let's us capture the internal state of an object without exposing 
 * its internal structure so that the object can be restored to this state later. In some sense 
 * we are saving a token or a memento of the original object and then recreating the object's 
 * state using the memento at a later time.
 * 
 * Ex:
 * 1. java.io.Serializable all implementations of this interface would be examples of the memento 
 * pattern.
 * 2. javax.faces.component.StateHolder this interface is implemented by classes that need to save their state 
	between requests.
 * */
public class Client {
	public static void main(String[] args) throws Exception{
		F16 f16 = new F16();
		BlackBox blackBox = f16.getBlackBox();
		System.out.println("BlackBox "+blackBox);
		// Save the state of the memento as a byte stream.
        byte[] memento = blackBox.getState();
        
        // Do some work.

        // Now restore the blackbox to the previous state
        BlackBox restoreBlackBox = new BlackBox();
        restoreBlackBox = restoreBlackBox.setState(memento);
        System.out.println("Restored BlackBox "+restoreBlackBox);
	}
}
