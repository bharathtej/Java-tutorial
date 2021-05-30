package _2_arrays;

public class TwoDimensionalArray {
	
	public static void main(String[] args) {
		
		int [][] array = {{2, 3, 5}, {5, 8, 7}, {4, 6, 9}};
		
		for(int i = 0; i<3; i++) {
			
			for(int j = 0; j<3; j++) {
				
				System.out.print(" "+ "|"+" ");
				System.out.print(array[i][j]);
				System.out.print(" "+ "|"+" ");
				
			}
			
			System.out.println();
			
			System.out.println(" -------------------");
			
			
			/* | 2 |  | 3 |  | 5 | 
			   -------------------
			   | 5 |  | 8 |  | 7 | 
			   -------------------
			   | 4 |  | 6 |  | 9 | 
			   -------------------*/
			
			
		}
	}

}
