package _4_Operators;

public class UnaryDemo {

	public static void main(String[] args) {
		int result = +1;
		
		//result is 1
		System.out.println(result);
		
		int result2 = +-1;
		
		System.out.println("result2: "+result2);
		
		result--;
		//result is now 0
		System.out.println("result is now "+result);
		
		result++;
		//result is now 1
		System.out.println("result is now "+result);
		
		result = -result;
		//result is now -1
		System.out.println("result is now "+result);
		
		boolean success = false;
		//false
		System.out.println(success);
		//true
		System.out.println(!success);
		

	}

}
