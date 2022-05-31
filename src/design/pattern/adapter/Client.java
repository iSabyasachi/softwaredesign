package design.pattern.adapter;

/*
 * Formally, the adapter pattern is defined as allowing incompatible classes to work together by converting 
 * the interface of one class into another expected by the clients
 * 
 * In the Java API, one can find java.io.InputStreamReader and java.io.OutputStreamWriter as examples of the 
 * adapter pattern
 * */
public class Client {
	
	public static void main(String[] args) {
		HotAirBalloon airBalloon = new HotAirBalloon();
		Adapter adapter = new Adapter(airBalloon);
		adapter.fly();
	}
	
	

}
