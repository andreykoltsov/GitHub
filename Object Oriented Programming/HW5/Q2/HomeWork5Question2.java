/*Sources

http://docs.oracle.com/javase/7/docs/api/java/lang/Math.html
http://stackoverflow.com/questions/20389890/generating-a-random-number-between-1-and-10-java
http://stackoverflow.com/questions/7571326/why-cant-i-return-a-double-from-two-ints-being-divided
http://stackoverflow.com/questions/3757763/integer-number-too-large-error-message-for-600851475143

*/

import java.util.*;

public class HomeWork5Question2{
	public static void main(String[] args){
	
		double radius = 4.0;
		double sarea = radius * radius;
		double carea = (Math.PI * radius * radius)/4;
		double cake;
		
		int ccount = 0;
		int scount = 0;
		
		int currval;
		double currval2;
		double moardots;
		
		Random dot = new Random();
		
		for (int i = 0; i <= 400000000; i++){
			//System.out.println(i);
			currval = dot.nextInt(17);
			currval2 = dot.nextDouble();
			moardots = (double)currval + currval2;
			
			if (moardots<=carea){
				ccount++;
			}
			else
				scount++;
		}
		
		cake = ccount/(double)scount;
		double pival = (ccount/(double)400000000)*4;
		
		System.out.println("There are "+ccount+" dots in the circle.");
		System.out.println("There are "+scount+" dots exclusively in the square.");
		System.out.println("The ratio between the two is "+cake+".");
		
		System.out.println("Pi is approximately "+pival+".");
	
	}
}
