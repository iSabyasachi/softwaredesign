package design.pattern.proxy;

import java.util.Scanner;

/*
 * Formally, the pattern is defined as a mechanism to provide a surrogate or placeholder for another object to control access to it.
 * Ex: 
 	To access remote objects over the internet, running in another JVM or another address space

	To protect a subject from clients not authorized to access it

	To stand in place of an object that may be expensive to create and delay the object's creation till it is accessed

	To cache queries or results from subject for clients

	There are a number of other use cases such as the firewall proxy, synchronization proxy etc.
	
	java.lang.reflect.Proxy is an example of the proxy pattern.

	java.rmi.* package contains classes for creating proxies. RMI is Remote Method Invocation. It is a mechanism that enables an object on 
	one Java virtual machine to invoke methods on an object in another Java virtual machine. RMI uses marshalling to send method parameters over the wire and the subject unmarshalls them back into objects.
 * 
 * */

public class Client {

	public static void main(String[] args) {
		
		DroneProxy droneProxy = new DroneProxy();
		// perpetual loop that received pilot actions
		while (true) {
			Scanner scanner = new Scanner(System.in);
			String action = scanner.nextLine();
			
			switch (action) {
            case "left": {
                droneProxy.turnLeft();
                break;
            }

            case "right": {
                droneProxy.turnRight();
                break;
            }

            case "fire": {
                droneProxy.firstMissile();
                break;
            }

            default:
                System.out.println("Invalid Action");
            }
		}

	}

}
