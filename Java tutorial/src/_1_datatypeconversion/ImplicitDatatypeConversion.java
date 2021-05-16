package _1_datatypeconversion;

public class ImplicitDatatypeConversion{
	
	/* the conversion in which smaller range variables are converted to larger range variables, is called
	 *  implicit data type conversion*/
	
	public static void main(String[] args) {
		int a=100;
		System.out.println("integer representation: "+a);
		
		long b = a;
		System.out.println("Long representation: "+b);
		
		float c = b;
		System.out.println("float representation: "+c);
	}
}