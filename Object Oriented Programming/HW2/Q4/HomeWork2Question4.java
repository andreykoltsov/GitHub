import java.util.*;

public class HomeWork2Question4{
	public static void main(String[] args){
		labelone:
			for(int i=0; i<=10; i++){
				System.out.println("OUTER ITERATION "+i);
				for(int j=0; j<=10; j++){
					System.out.println("INNTER ITERATION "+j);
					break labelone;
				}
			}
	}
}