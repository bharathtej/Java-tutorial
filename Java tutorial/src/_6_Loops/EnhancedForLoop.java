package _6_Loops;

public class EnhancedForLoop {
	
	/*  In Java, the for-each loop is used to iterate through elements of arrays and collections (like ArrayList).
	 *  It is also known as the enhanced for loop.*/
	
	public static void main(String[] args ) {
		
		int [] elements = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		for (int item : elements)
			System.out.println("the elements in the array are " + item);
		
	}
	
}

