/*
Sources:
http://stackoverflow.com/questions/13011170/checking-for-nan-and-using-it-in-an-if
http://stackoverflow.com/questions/10424254/java-splitting-inputhttp://stackoverflow.com/questions/196830/what-is-the-easiest-best-most-correct-way-to-iterate-through-the-characters-of-a
http://stackoverflow.com/questions/1181969/java-get-last-element-after-split
http://stackoverflow.com/questions/1102891/how-to-check-if-a-string-is-a-numeric-type-in-java
http://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html
*/
import java.util.*;
import java.io.*;

public class HomeWork6{
	public static void main(String[] args){

		//Determine whether or not to keep asking for input
		//boolean loopcont = true;
		Scanner inwords = new Scanner(System.in);
		String values = inwords.nextLine();
		
		String[] values_arr = values.split(" ");
		
		int values_place = 0;
		double dubval;
		double lastval;
		boolean cont = true;
		
		try{
			if (values_arr[1].compareTo("/")==0 && values_arr[2].compareTo("0")==0){
				throw new ArithmeticException();
			}
			lastval = Double.parseDouble(values_arr[values_arr.length-1]);
			if(Double.isNaN(lastval)){
				throw new NotEnoughNumbersException();
			}
			while(values_place < values_arr.length){
				if (values_place == 0 || values_place%2 == 0){
					dubval = Double.parseDouble(values_arr[values_place]);
					if (Double.isNaN(dubval)){
						throw new NotANumberException();
					}
				} else if (values_arr[values_place].compareTo("+") != 0 &&
						   values_arr[values_place].compareTo("-") != 0 &&
						   values_arr[values_place].compareTo("*") != 0 &&
						   values_arr[values_place].compareTo("/") != 0 &&
						   values_arr[values_place].compareTo("%") != 0){
							throw new IllegalOperationException();
				}
				
				values_place++;
			}
		}
		catch(NumberFormatException ex){
			System.out.println("Please re-enter the number");
			cont = false;
		}
		catch(NotANumberException ex){
			System.out.println("Please re-enter the number.");
			cont = false;
		}
		catch(IllegalOperationException ex){
			System.out.println("Please enter a correct function");
			cont = false;
		}
		catch(NotEnoughNumbersException ex){
			System.out.println("Please enter a second number.");
			System.out.println("You cannot end the input without a number.");
			cont = false;
		}
		catch(ArithmeticException ex){
			System.out.println("Stop trying to divide by zero");
			cont = false;
		}
		
		if (cont){
			double a = Double.parseDouble(values_arr[0]);
			double b = Double.parseDouble(values_arr[2]);
			char c = values_arr[1].charAt(0);
			//System.out.println(c);
			
			switch (c) {
				case '+':
					System.out.println(a + b);
					break;
				case '-':
					System.out.println(a - b);
					break;
				case '*':
					System.out.println(a * b);
					break;
				case '/':
					System.out.println(a / b);
					break;
				case '%':
					System.out.println(a % b);
					break;
			}
		}
		/****************************************************
		I tried...
		for(int i=0; i<values_arr.length; i++){
			double a, b;
			

			if (values_arr[i].compareTo("*") || values_arr[i].compareTo("/"){
				if(values_arr[i].compareTo("*"){
					a = values_arr[i-1];
					b = values_arr[i+1];
					values_arr[i] = a * b;
					values_arr[i-1] = "";
					values_arr[i+1] = "";
				}
				else{
					a = values_arr[i-1];
					b = values_arr[i+1];
					values_arr[i] = a / b;
					values_arr[i-1] = "";
					values_arr[i+1] = "";
				}
			}
		}*****************************************************/
	}
	
	public static class NotANumberException extends IllegalArgumentException{}
	public static class IllegalOperationException extends IllegalArgumentException{}
	public static class NotEnoughNumbersException extends IllegalArgumentException{}
}
	


/*
if (i==(values.length()-1)){
						if(Double.isNaN(c)){
							throw new NotEnoughNumbersException();
						}
						loopcont = false;
					}
					if(!Double.isNaN(c) || c=' ' || c='+' || c='-' || c='*' || c='/' || c='%'){
					
					}else{
							throw new IllegalOperationException();
							throw new NotANumberException();
					}

	
}
*/