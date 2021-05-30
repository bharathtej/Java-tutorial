package _7_Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
	/* better practice to always initialize concrete implementation with a interface.
	 
	 * it helps changing representation easily as interface can have many classes
	 
	 * This is applicable to all the collections. */
	
	public static void main(String[] args) {
		
		List<Integer> arrayList = new ArrayList<Integer>(5);
		
/* -----interface---------------------concrete implementation*/
		
		// add new elements to the list
		
		for(int i = 0; i < 5; i++)
			arrayList.add(i);
		
		
		//print the array list
		System.out.println(arrayList);
		
		// remove element at the index 3
		arrayList.remove(3);
		
		// display list after removing element
		
		System.out.println(arrayList);
		
		//print element one by one
		
		for ( int i =0; i < arrayList.size(); i++)
			System.out.print(arrayList.get(i)+ " ");
		
		
	
		
		
	}

}
