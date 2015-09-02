import java.util.*;

public class HomeWork1Question6{
	public static void main(String[] args){
		Scanner inwords = new Scanner(System.in);
		int [] xcoordinates = new int[2];
		int [] ycoordinates = new int[2];
		int [] radiusvals = new int[2];
		
		System.out.println("Please enter the x coordinate for Circle A");
		xcoordinates[0] = inwords.nextInt();
		System.out.println("Please enter the y coordinate for Circle A");
		ycoordinates[0] = inwords.nextInt();
		System.out.println("Please enter in the radius of Circle A");
		radiusvals[0] = inwords.nextInt();
		
		System.out.println("Please enter the x coordinate for Circle B");
		xcoordinates[1] = inwords.nextInt();
		System.out.println("Please enter the y coordinate for Circle B");
		ycoordinates[1] = inwords.nextInt();
		System.out.println("Please enter in the radius of Circle B");
		radiusvals[1] = inwords.nextInt();
		
		double dist = Math.sqrt(Math.pow((xcoordinates[1]-xcoordinates[0]),2)+Math.pow((ycoordinates[1]-ycoordinates[0]),2));
		
		if((dist - radiusvals[0] - radiusvals[1])>0){
			System.out.println("The Circles are completely seperate.");
		}else if((dist - radiusvals[0] - radiusvals[1])==0){
			System.out.println("The Circles are touching.");
		}else if((dist - radiusvals[0] - radiusvals[1])<0){
			if((dist<radiusvals[0]) || (dist<radiusvals[1])){
				System.out.println("The Circles are completely within each other.");
			}else{
				System.out.println("The Circles are overlapping each other.");
			}
			
		}
	}
}
