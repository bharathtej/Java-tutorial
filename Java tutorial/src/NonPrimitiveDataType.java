
public class NonPrimitiveDataType {
	public static void main(String[] args) {
	/* primitive  data type are primitively
	 *  Supported by java where as non primitive 
	 * data types are customized by the programmer*/
		
	/* when we talk about non primitive data types
	 * we talk about classes, arrays, strings*/	
	
		String str = "test";
		/*here every time you call the above line
		 * same memory is used which is initialized to the 
		 * variable "str"*/
		System.out.println("String is: " + str);
		
		String str1 = new String("test");
		/*here every time you call the above line 
		 * new object created which also means new memory
		 * location.*/
		System.out.println("Another String: "+ str1);
		
		int arr[];
		arr = new int[3];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		
		System.out.println(arr);
		System.out.println(arr[2]); 
		
		
			
		
		
	}
}
