package design.pattern.flyweight;

/*
 * This lesson discusses how the flyweight pattern can be applied to reduce memory requirements.
 * 
 * Formally, the pattern is defined as sharing state among a large number of fine-grained objects 
 * for efficiency.
 * 
 * Ex : Methods java.lang.Boolean.valueOf and java.lang.Integer.valueOf both return flyweight 
 * objects.
 * */
public class Client {
	public static void main(String[] args) {
		/*
		 * Extrinsic State of F16
		 * */
		int[][] coordsF16 = new int[][] {{1,1},{1,2}};
		
		/*Intrinsic F16 that won't change*/
		F16 flyweightF16 = new F16();

		for (int i = 0; i < coordsF16.length; i++) {
			int currX = coordsF16[i][0];
            int currY = coordsF16[i][1];
            
            // We are passing in the extrinsic state to the flyweight object. Note we are storing the
            // extrinsic state of the airborne f16s in a 2-dimensional array.
            System.out.println("time to destination = " +
                    flyweightF16.getTimeToDestination(currX, currY, 10, 10, 200));
		}
		System.out.print(Integer.valueOf(1));
		
	}

}
