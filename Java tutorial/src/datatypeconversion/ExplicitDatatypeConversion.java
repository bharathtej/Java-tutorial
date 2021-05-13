package datatypeconversion;

public class ExplicitDatatypeConversion {
	/* The conversion in which larger range data type is converted into 
	 * smaller range data type is called Explicit data type conversion */
	public static void main(String[] args) {
		
		double a = 50.55365543;
		System.out.println("Double : "+a);
		
		float b = (float)a;
		/* here you cannot convert data type directly like in the implicit data type conversion.
		 * here we use a method called type casting to convert bigger size data type to smaller range data type
		 * format: data_type variable2 = (data_type) variable 1; */
		
		System.out.println("float : "+b);
		
		long c = (long)a;
		System.out.println("Long : "+c);
		
		int d = (int)c;
		System.out.println("Int : "+d);
		
		char e = (char)d;
		System.out.println("char :"+e);
		
	/* Prints ascii values*/
		
		
	}

}
