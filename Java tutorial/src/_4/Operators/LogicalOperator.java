package _4.Operators;

public class LogicalOperator {
	
	public static void main(String[] args) {
		
		int value1 = 1;
		int value2 = 2;
		
		/*java uses "short circuit kind of checking 
		 * which means java only checks second operand only if it is needed"*/
		
		if((value1 ==1) && (value2 == 2))
			System.out.println("value1 is 1 AND value2 is 2");
		
		if(value1 == 1 || value2 == 2) 
			System.out.println("value1 is 1 OR value2 is 2");
		
		boolean result;
		
		result = (value1 > value2) ? true : false;
		
		System.out.println("value1 > value2: "+result);
	}

}
