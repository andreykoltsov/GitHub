import java.util.*;

public class HomeWork1Question3{
	public static void main(String[] args){
		Random rgen = new Random();
		int randint = rgen.nextInt(12-0) + 0;
		
		String[] monthnames = {"January", "February",
  "March", "April", "May", "June", "July",
  "August", "September", "October", "November",
  "December"};
  
		String randmonth = monthnames[randint];
  
		System.out.println("Random Month is " + randmonth);
	}
}