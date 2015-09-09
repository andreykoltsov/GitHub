import java.util.*;

public class HomeWork2Question3{
	public static void main(String[] args){
		Scanner inwords = new Scanner(System.in);
		String enteredword, revword;
		int wordlen;
		
		System.out.println("Enter in your word: ");
		enteredword = inwords.nextLine();
		wordlen = enteredword.length() - 1;
		
		revword = "";
		
		for(int i = wordlen; i>=0; i--){
			revword = revword+enteredword.charAt(i);
		}
		
		if(enteredword.equals(revword)){
			System.out.println("Your word is a palindrome");
		}
		else
			System.out.println("Your word is not a palindrome");
		
	}
}