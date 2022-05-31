package design.pattern.singleton;
/*
 * Formally the Singleton pattern is defined as ensuring that only a single instance of a class exists and a global point of access to it exists.
 * */
public class Client {
	public static void main(String[] args) {
		//AirforceOne airforceOne = AirforceOne.getInstance();
		//airforceOne.fly();
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				AirforceOne airforceOne = AirforceOne.getInstance();
				airforceOne.fly();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				AirforceOne airforceOne = AirforceOne.getInstance();
				airforceOne.fly();
			}
		});
		
		t1.start();
		t2.start();
	}
}
