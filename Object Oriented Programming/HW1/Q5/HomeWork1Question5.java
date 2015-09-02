import java.util.*;

public class HomeWork1Question5{
	public static void main(String[] args){
		Scanner inwords = new Scanner(System.in);
		int [] xcoordinates = new int[3];
		int [] ycoordinates = new int[3];
		double distAB;
		double distBC;
		double distCA;
		
		System.out.println("Please enter the x coordinate for point A");
		xcoordinates[0] = inwords.nextInt();
		System.out.println("Please enter the y coordinate for point A");
		ycoordinates[0] = inwords.nextInt();
		
		System.out.println("Please enter the x coordinate for point B");
		xcoordinates[1] = inwords.nextInt();
		System.out.println("Please enter the y coordinate for point B");
		ycoordinates[1] = inwords.nextInt();
		
		System.out.println("Please enter the x coordinate for point C");
		xcoordinates[2] = inwords.nextInt();
		System.out.println("Please enter the y coordinate for point C");
		ycoordinates[2] = inwords.nextInt();
		
		distAB = Math.sqrt(Math.pow((xcoordinates[1]-xcoordinates[0]),2)+Math.pow((ycoordinates[1]-ycoordinates[0]),2));
		distBC = Math.sqrt(Math.pow((xcoordinates[2]-xcoordinates[1]),2)+Math.pow((ycoordinates[2]-ycoordinates[1]),2));
		distCA = Math.sqrt(Math.pow((xcoordinates[0]-xcoordinates[2]),2)+Math.pow((ycoordinates[0]-ycoordinates[2]),2));
		
		if((distAB+distBC)>distCA || (distBC+distCA)>distAB || (distCA+distAB)>distBC){
			System.out.println("You have a triangle!");
		}else{
			System.out.println("This is not a triangle.");
		}
	}
}
