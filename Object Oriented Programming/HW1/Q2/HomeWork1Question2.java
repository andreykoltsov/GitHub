import java.util.*;

public class HomeWork1Question2{
	public static void main(String[] args){
		Scanner inwords = new Scanner(System.in);
		double area;
		
		while(inwords.hasNext()){
			area = Math.PI * Math.pow(inwords.nextDouble(), 2);
			System.out.println("The area is " + area);
		}
	}
}