package _2_arrays;

public class ArrayDemo {

	// These are also called as One dimensional Array
	public static void main(String[] args) {
		// Arrays are container object that holds fixed number of values of single type
		
		// Declare array of integers
		
		int [] anArray;
		
		// Allocate memory for 10 integers
		
		anArray = new int[10];
		
		// initialize all the ten elements
		
		for(int i=0; i<10;i++) {
			anArray[i]=i*100+100;
			System.out.println(" Element at index "+i+" is "+ anArray[i] );		
			}
	}
}
