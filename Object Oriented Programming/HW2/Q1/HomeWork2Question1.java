import java.util.*;

public class HomeWork2Question1{
	public static void main(String[] args){
		Scanner inwords = new Scanner(System.in);
		int tallval;
		int calcval;
		
		System.out.println("How many rows do you want the pyramid to have?");
		
		tallval = inwords.nextInt();;
		for(int i=1; i<=tallval; i++){
			for(int j=1; j<=tallval-i; j++){
				System.out.printf("%2s", "");
			}	
			for(int c=1; c<=i; c++){
				System.out.printf("%2d", c);
					
			}
			for(int p=2; p<=i; p++){
				calcval=i-p+1;
				System.out.printf("%2d", calcval);
			}
			System.out.println();			
		}
	}
}