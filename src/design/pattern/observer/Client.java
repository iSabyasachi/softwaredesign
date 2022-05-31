package design.pattern.observer;

/*
 * The pattern is formally defined as a one to many dependency between objects so that when one object changes state 
 * all the dependents are notified.
 * 
 * The pattern consists of two actors, the observer who is interested in the updates and the subject who generates the 
 * updates.
 * 
 * Ex: If you are registered on Twitter then whenever you follow someone, you are essentially asking Twitter to send you 
 * (the observer) tweet updates of the person (the subject) you followed.
 * 
 * Going back to our aircraft example, we can say that any aircraft in flight would be interested in updates from the 
 * air-traffic controller. We can imagine that an aircraft, as soon as, it is airborne would want to subscribe to updates 
 * from the air traffic controller and unsubscribe when it lands.
 * 
 * Frontend frameworks often involve the publisher-subscriber model, where a change in a DOM element on the webpage by a 
 * user causes a data-structure held in the browser's memory (think javascript code) gets updated. AngularJS and 
 * KnockoutJS frameworks are examples of this pattern.

 * In Java, implementations of java.util.EventListener are examples of the observer pattern.
 * */

public class Client {

	public static void main(String[] args) {
		

	}

}
