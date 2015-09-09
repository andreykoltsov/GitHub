import java.util.*;

public class HomeWork2Question2{
	public static void main(String[] args){
		Scanner inwords = new Scanner(System.in);
		
		System.out.println("What day did the first of January fall on?");
		String dayword = inwords.nextLine();
		
		System.out.println("What year is it?");
		
		int yearval = inwords.nextInt();
		Boolean isleap;
		
		if(yearval % 400 == 0){
			isleap=true;
		}else if(yearval % 100 == 0){
			isleap=false;
		}else if(yearval % 4 == 0){
			isleap=true;
		}else{
			isleap=false;
		}
		
		String[] montharr = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		int[] datenum = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] weeklist ={"Su", "Mo", "Tu", "We", "Th", "Fr", "Sa"};
		int weekindex=2;
		
		if(isleap==true){
			datenum[1] = 29;
		}	
		
			
		for(int a=0; a<=6; a++){
			if(dayword.equals(weeklist[a])){
				weekindex = a;
				break;
			}
		}
			
		for(int i=0; i<=11; i++){
			System.out.printf("   %s", montharr[i] +" "+ yearval);
			System.out.println();
			for(int j=0; j<=6; j++){
				System.out.printf("%s ", weeklist[j]);
			}
			System.out.println();
			for(int p=0; p<weekindex; p++){
				System.out.printf("%s", "   ");
			}
			for(int b = 1; b<=datenum[i]; b++){
					System.out.printf("%2s ", b);
					if(weekindex==6){
						System.out.println();
						weekindex=0;
					}
					else
						weekindex++;
			}
			
			System.out.println();
			System.out.println();
			
			
		}
	}
}