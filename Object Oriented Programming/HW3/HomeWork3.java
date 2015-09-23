import java.util.*;

public class HomeWork3{
	
	int[] arr1;
	int[] solNum;
	
	public HomeWork3(){
		Scanner inwords = new Scanner(System.in);
		System.out.println("Please enter the number of Queens: ");
		int queen_num = inwords.nextInt();
		arr1 = new int[queen_num];
		solNum = new int[1];
		solNum[0] = 0;
	}
	
	public void runplaceAll(){
	placeAll(0, arr1.length);
	System.out.println("There are "+solNum[0]+" solutions");
	}
	
	public boolean placePossible(int row, int col){
		for (int i=0; i<row; i++){
			if(arr1[i]==col || (i-row)==(arr1[i]-col) || (i-row)==(col-arr1[i])){
				return false;
			}
		}
		return true;
	}
	
	public void printAll(int[] arr1){
		int arrlen = arr1.length;
		for(int i=0; i<arrlen; i++){
			for(int j=0; j<arrlen; j++){
				if(arr1[i]==j){
					System.out.print("Q");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void placeAll(int row, int sides){
		for(int i=0; i<sides; i++){
			if(placePossible(row, i)){
				arr1[row]=i;
				if(row==(sides-1)){
					solNum[0]++;
					//System.out.println(solNum);
					printAll(arr1);
				}else{
					placeAll(row+1, sides);
				}
			}
		}
	}
	
	public static void main(String[] args){
		HomeWork3 Queen = new HomeWork3();
		Queen.runplaceAll();
	}
}
